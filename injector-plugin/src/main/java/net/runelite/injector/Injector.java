/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package net.runelite.injector;

import lombok.extern.slf4j.Slf4j;
import net.runelite.injector.injection.InjectData;
import net.runelite.injector.injection.InjectTaskHandler;
import net.runelite.injector.injectors.*;
import net.runelite.injector.injectors.raw.ClearColorBuffer;
import net.runelite.injector.injectors.raw.DrawMenu;
import net.runelite.injector.injectors.raw.Occluder;
import net.runelite.injector.injectors.raw.RasterizerAlpha;
import net.runelite.injector.injectors.raw.RenderDraw;
import net.runelite.injector.injectors.raw.ScriptVM;
import net.runelite.injector.rsapi.RSApi;
import net.runelite.injector.transformers.InjectTransformer;
import net.runelite.injector.transformers.SourceChanger;

import java.io.File;
import java.util.Objects;

import static net.runelite.deob.util.JarUtil.load;

@Slf4j
public class Injector extends InjectData implements InjectTaskHandler
{
	public Injector(String vanillaPath, String rsClientPath, String rsApiPath, String mixinsPath)
	{
		this.vanilla = load(new File(vanillaPath));
		this.deobfuscated = load(new File(rsClientPath));
		this.rsApi = new RSApi(Objects.requireNonNull(new File(rsApiPath).listFiles()));
		this.mixins = load(new File(mixinsPath));
	}

	public void injectVanilla()
	{
		log.debug("[DEBUG] Starting injection");

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

	private void inject(net.runelite.injector.injectors.Injector injector)
	{
		final String name = injector.getName();

		log.info("[INFO] Starting {}", name);

		injector.start();

		injector.inject();

		// TODO: Maven mojo log
		// log.lifecycle("{} {}", name, injector.getCompletionMsg());

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

		// TODO: Maven mojo log
		// log.lifecycle("{} {}", name, transformer.getCompletionMsg());
	}

	public void runChildInjector(net.runelite.injector.injectors.Injector injector)
	{
		inject(injector);
	}
}
