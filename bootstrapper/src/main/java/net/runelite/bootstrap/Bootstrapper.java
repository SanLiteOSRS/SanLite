package net.runelite.bootstrap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bootstrapper
{

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
		File outputDir = new File("./bootstrapper/target/bootstrap-output");
		if (!outputDir.exists())
		{
			if (!outputDir.mkdir())
			{
				System.err.println("Could not create output directory");
				System.exit(1);
			}
		}

		// Generate bootstrap files for all types
		for (BootstrapType bootstrapType : BootstrapType.values())
		{
			generateBootstrap(bootstrapType, buildCommit);
		}
	}

	private static void generateBootstrap(BootstrapType type, String buildCommit)
	{
		System.out.println("Generating " + type.getName() + " bootstrap file | commit: " + buildCommit);
		Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();

		File bootstrapDir = new File("./bootstrapper/target/bootstrap-output/" + type.getOutputDir());
		if (!bootstrapDir.exists())
		{
			if (!bootstrapDir.mkdir())
			{
				System.err.println("Could not create output directory: " + type.getOutputDir() + " for bootstrap file: " + type.getName());
				System.exit(1);
			}
		}

		try (FileWriter fileWriter = new FileWriter(bootstrapDir.getPath() + "/bootstrap.json"))
		{
			gson.toJson(new Bootstrap(type.getRepositoryUrl(), buildCommit), fileWriter);
		}
		catch (IOException | IllegalArgumentException e)
		{
			System.err.println("Unable to generate " + type.getName() + " bootstrap file");
			e.printStackTrace();
		}
	}
}
