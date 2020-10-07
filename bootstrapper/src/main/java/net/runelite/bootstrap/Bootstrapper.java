package net.runelite.bootstrap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Bootstrapper
{

	public static Map<DynamicArtifact, String> CHECKSUMS;

	public static void main(String[] args)
	{
		if (args.length > 1)
		{
			System.out.println("Too many arguments, syntax: buildCommit (optional)");
			System.exit(1);
		}

		String buildCommit = args.length == 1 ? args[0] : "";
		if (buildCommit.isEmpty())
		{
			System.out.println("WARNING: Build commit argument is null");
		}

		// Create output directory
		File outputDir = new File("./target/bootstrap-output");
		if (!outputDir.exists())
		{
			if (!outputDir.mkdirs())
			{
				System.err.println("Could not create output directory");
				System.exit(1);
			}
		}

		// Generate dynamic dependency file checksums
		System.out.println("Generating file checksums for commit: " + buildCommit);
		CHECKSUMS = generateFileChecksums();

		// Generate bootstrap files for all types
		for (BootstrapType bootstrapType : BootstrapType.values())
		{
			generateBootstrap(bootstrapType, buildCommit);
		}
	}

	private static void generateBootstrap(BootstrapType type, String buildCommit)
	{
		System.out.println("Generating " + type.getName() + " bootstrap file");
		Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();

		File bootstrapDir = new File("./target/bootstrap-output/" + type.getOutputDir());
		if (!bootstrapDir.exists())
		{
			if (!bootstrapDir.mkdirs())
			{
				System.err.println("Could not create output directory: " + type.getOutputDir() + " for bootstrap file: " + type.getName());
				System.exit(1);
			}
		}

		copyDynamicArtifacts(bootstrapDir);

		try (FileWriter fileWriter = new FileWriter(bootstrapDir.getPath() + "/bootstrap.json"))
		{
			gson.toJson(new Bootstrap(type.getRepositoryUrl(), buildCommit, CHECKSUMS), fileWriter);
		}
		catch (IOException | IllegalArgumentException e)
		{
			System.err.println("Unable to generate " + type.getName() + " bootstrap file");
			e.printStackTrace();
		}
	}

	private static void copyDynamicArtifacts(File outputDir)
	{
		for (DynamicArtifact artifact : DynamicArtifact.values())
		{
			try
			{
				System.out.println("Copying " + artifact.getFile() + " to " + outputDir);
				Files.copy(Paths.get(artifact.getFile().getCanonicalPath()),
						Paths.get(new File(outputDir + "/" + artifact.getFileName()).getCanonicalPath()),
						StandardCopyOption.REPLACE_EXISTING);
			}
			catch (IOException e)
			{
				System.err.println("Unable to copy artifact for " + artifact.getName());
				e.printStackTrace();
			}
		}
	}

	static Map<DynamicArtifact, String> generateFileChecksums()
	{
		Map<DynamicArtifact, String> checksums = new HashMap<>();
		for (DynamicArtifact dynamicArtifact : DynamicArtifact.values())
		{
			try
			{
				checksums.put(dynamicArtifact, FileChecksum.getChecksumFile(
						"../" + dynamicArtifact.getDirectory() +
								"/target/" + dynamicArtifact.getName() + "-" +
								new BootstrapperProperties().getRuneLiteVersion() + ".jar"));
			}
			catch (IOException | NoSuchAlgorithmException e)
			{
				System.err.println("Unable to generate file checksum for " + dynamicArtifact);
				e.printStackTrace();
				System.exit(1);
			}
		}

		return checksums;
	}
}
