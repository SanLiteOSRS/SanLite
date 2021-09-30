/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package net.sanlite.injector;

import com.google.common.hash.Hashing;
import net.sanlite.injector.injection.InjectData;
import net.sanlite.injector.injection.InjectTaskHandler;
import net.sanlite.injector.injectors.CreateAnnotations;
import net.sanlite.injector.injectors.InjectConstruct;
import net.sanlite.injector.injectors.InterfaceInjector;
import net.sanlite.injector.injectors.MixinInjector;
import net.sanlite.injector.injectors.RSApiInjector;
import net.sanlite.injector.injectors.raw.ClearColorBuffer;
import net.sanlite.injector.injectors.raw.DrawMenu;
import net.sanlite.injector.injectors.raw.Occluder;
import net.sanlite.injector.injectors.raw.RasterizerAlpha;
import net.sanlite.injector.injectors.raw.RenderDraw;
import net.sanlite.injector.injectors.raw.ScriptVM;
import net.sanlite.injector.rsapi.RSApi;
import net.sanlite.injector.transformers.InjectTransformer;
import net.sanlite.injector.transformers.Java8Ifier;
import net.sanlite.injector.transformers.SourceChanger;

import static net.runelite.deob.util.JarUtil.load;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Objects;

import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.util.EnumConverter;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.deob.util.JarUtil;

import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;

public class Injector extends InjectData implements InjectTaskHandler
{
	static final Logger log = Logging.getLogger(Injector.class);
	static Injector injector = new Injector();

	public static void main(String[] args)
	{
		OptionParser parser = new OptionParser();

		ArgumentAcceptingOptionSpec<File> vanillaFileOption =
				parser.accepts("vanilla", "Vanilla OSRS gamepack file")
						.withRequiredArg().ofType(File.class);

		ArgumentAcceptingOptionSpec<String> sanLiteVerOption =
				parser.accepts("version", "SanLite version")
						.withRequiredArg().ofType(String.class);

		ArgumentAcceptingOptionSpec<File> outFileOption =
				parser.accepts("output", "Output file, jar if outmode is jar, folder if outmode is files")
						.withRequiredArg().ofType(File.class);

		ArgumentAcceptingOptionSpec<OutputMode> outModeOption =
				parser.accepts("outmode")
						.withRequiredArg().ofType(OutputMode.class)
						.withValuesConvertedBy(new EnumConverter<>(OutputMode.class)
						{
							@Override
							public OutputMode convert(String value)
							{
								return super.convert(value.toUpperCase());
							}
						});

		OptionSet options = parser.parse(args);
		String projectVersion = options.valueOf(sanLiteVerOption);

		File vanillaFile = options.valueOf(vanillaFileOption);
		injector.vanilla = load(vanillaFile);
		injector.deobfuscated = load(
				new File("../runescape-client/build/libs/runescape-client-" + projectVersion + ".jar"));
		injector.rsApi = new RSApi(Objects.requireNonNull(
				new File("../runescape-api/build/classes/java/main/net/runelite/rs/api/")
						.listFiles()));
		injector.mixins = load(
				new File("../runelite-mixins/build/libs/runelite-mixins-" + projectVersion + ".jar"));

		File oldInjected = new File("../runelite-client/src/main/resources/net/runelite/client/injected-client.rs");
		if (oldInjected.exists())
		{
			oldInjected.delete();
		}

		injector.initToVanilla();
		injector.injectVanilla();
		save(injector.getVanilla(), options.valueOf(outFileOption), options.valueOf(outModeOption), vanillaFile);
	}

	private static void save(ClassGroup group, File output, OutputMode mode, File vanillaFile)
	{
		if (output.exists())
		{
			try
			{
				Files.walk(output.toPath()).sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
			}
			catch (IOException e)
			{
				log.lifecycle("Failed to delete output directory contents.");
				throw new RuntimeException(e);
			}
		}

		switch (mode)
		{
			case FILES:
				saveFiles(group, output);
				break;
			case JAR:
				output.getParentFile().mkdirs();
				JarUtil.save(group, output);
				break;
		}

		try
		{
			String hash = com.google.common.io.Files.asByteSource(vanillaFile).hash(Hashing.sha256()).toString();
			log.lifecycle("Writing vanilla hash: {}", hash);
			Files.write(output.getParentFile().toPath().resolve("client.hash"), hash.getBytes(StandardCharsets.UTF_8));
		}
		catch (IOException ex)
		{
			log.lifecycle("Failed to write vanilla hash file");
			throw new RuntimeException(ex);
		}
	}

	private static void saveFiles(ClassGroup group, File outDir)
	{
		try
		{
			outDir.mkdirs();

			for (ClassFile cf : group.getClasses())
			{
				File f = new File(outDir, cf.getName() + ".class");
				byte[] data = JarUtil.writeClass(group, cf);
				Files.write(f.toPath(), data);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void injectVanilla()
	{
		log.debug("[DEBUG] Starting injection");

		transform(new Java8Ifier(this));

		inject(new CreateAnnotations(this));

		inject(new InterfaceInjector(this));

		inject(new RasterizerAlpha(this));

		inject(new MixinInjector(this));

		// This is where field hooks runs

		// This is where method hooks runs

		inject(new InjectConstruct(this));

		inject(new RSApiInjector(this));

		//inject(new DrawAfterWidgets(this));

		inject(new ScriptVM(this));

		// All GPU raw injectors should probably be combined, especially RenderDraw and Occluder
		inject(new ClearColorBuffer(this));

		inject(new RenderDraw(this));

		inject(new Occluder(this));

		inject(new DrawMenu(this));

		validate(new InjectorValidator(this));

		transform(new SourceChanger(this));
	}

	private void inject(net.sanlite.injector.injectors.Injector injector)
	{
		final String name = injector.getName();

		log.lifecycle("[INFO] Starting {}", name);

		injector.start();

		injector.inject();

		log.lifecycle("{} {}", name, injector.getCompletionMsg());

		if (injector instanceof Validator)
		{
			validate((Validator) injector);
		}
	}

	private void validate(Validator validator)
	{
		final String name = validator.getName();

		if (!validator.validate())
		{
			throw new InjectException(name + " failed validation");
		}
	}

	private void transform(InjectTransformer transformer)
	{
		final String name = transformer.getName();

		log.info("[INFO] Starting {}", name);

		transformer.transform();

		log.lifecycle("{} {}", name, transformer.getCompletionMsg());
	}

	public void runChildInjector(net.sanlite.injector.injectors.Injector injector)
	{
		inject(injector);
	}
}
