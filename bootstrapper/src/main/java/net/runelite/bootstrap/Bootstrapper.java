package net.runelite.bootstrap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Bootstrapper
{

	public static void main(String[] args)
	{
		if (args.length > 1)
		{
			System.out.println("Too many arguments, format: buildCommit (optional)");
			System.exit(1);
		}

		String buildCommit = args.length == 1 ? args[0] : "";
		if (buildCommit.isEmpty())
		{
			System.out.println("WARNING: Build commit argument is null");
		}

		System.out.println("Generating bootstrap file");
		generateBootstrap(false, buildCommit);

		System.out.println("Generating staging bootstrap file");
		generateBootstrap(true, buildCommit);
	}

	private static void generateBootstrap(boolean isStaging, String buildCommit)
	{
		Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
		String fileName = isStaging ? "./bootstrapper/target/bootstrap-staging.json" : "./bootstrapper/target/bootstrap.json";

		try (FileWriter fileWriter = new FileWriter(fileName))
		{
			gson.toJson(new Bootstrap(isStaging, buildCommit), fileWriter);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
