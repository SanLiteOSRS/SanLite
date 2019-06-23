package net.runelite.bootstrap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

public class Bootstrapper
{

	public static void main(String[] args)
	{
		Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
		try
		{
			FileWriter fileWriter = new FileWriter("./bootstrapper/target/bootstrap.json");
			gson.toJson(new Bootstrap(), fileWriter);
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
