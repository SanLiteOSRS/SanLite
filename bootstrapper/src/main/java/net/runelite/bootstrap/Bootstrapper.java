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
import java.util.Objects;

public class Bootstrapper
{

	public static Map<DynamicArtifact, String> CHECKSUMS;

	public static void main(String[] args)
	{
		String buildCommit = new BootstrapperProperties().getGitCommit();
		if (buildCommit.isEmpty())
		{
			System.out.println("WARNING: Build commit is null");
		}

		// Create output directory
		File outputDir = new File("./build/bootstrap-output");
		if (outputDir.exists())
		{
			for (File file: Objects.requireNonNull(outputDir.listFiles()))
			{
				if (!file.isDirectory())
				{
					if (file.delete())
					{
						System.err.println("Could not clean output directory");
						System.exit(1);
					}
				}
			}

			if (!outputDir.delete())
			{
				System.err.println("Could not delete output directory");
				System.exit(1);
			}
		}

		if (!outputDir.mkdirs())
		{
			System.err.println("Could not create output directory");
			System.exit(1);
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

		File bootstrapDir = new File("./build/bootstrap-output/" + type.getOutputDir());
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
								"/build/libs/" + dynamicArtifact.getName() + "-" +
								new BootstrapperProperties().getSanLiteVersion() + ".jar"));
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
