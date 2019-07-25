package net.runelite.bootstrap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import joptsimple.OptionParser;

import java.io.FileWriter;

public class Bootstrapper
{

	public static void main(String[] args)
	{
		OptionParser parser = new OptionParser();
		parser.accepts("clientargs").withRequiredArg();
		parser.accepts("staging");

		Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
		try (FileWriter fileWriter = new FileWriter("./bootstrapper/target/bootstrap.json"))
		{
			gson.toJson(new Bootstrap(parser.parse(args).has("staging")), fileWriter);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
