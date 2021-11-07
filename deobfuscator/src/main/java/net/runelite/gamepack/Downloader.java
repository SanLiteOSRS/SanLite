package net.runelite.gamepack;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Downloader
{
	private static final String REPLACE = "%archive%";
	private static final String GAMEPACK_URL = "http://oldschool1.runescape.com/" + REPLACE;

	private static String getGamepackUrl()
	{
		String archive = Checker.getGamePack();
		return archive == null ? "" : GAMEPACK_URL.replace(REPLACE, archive);
	}

	public static String gamepack(Path outputPath)
	{
		final File folder = new File(String.valueOf(outputPath));
		if (!folder.exists())
		{
			folder.mkdir();
		}

		downloadLatest(folder);
		return outputPath + File.separator + "gamepack.jar";
	}

	private static void downloadLatest(File folder)
	{
		File output = new File(folder, "gamepack.jar");

		try
		{
			String gamepackUrlString = getGamepackUrl();
			URL url = new URL(gamepackUrlString);
			System.out.println("Downloading gamepack from url: " + gamepackUrlString);

			final URLDownloader downloader = new URLDownloader(url, output);
			downloader.download();

			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		String outputPath;
		if (args == null || args.length == 0)
		{
			outputPath = gamepack(Paths.get(System.getProperty("user.home"), "gamepack"));
			System.out.println("Saved gamepack at path: " + outputPath);
			return;
		}

		if (args.length > 1)
		{
			System.err.println("Syntax: output_path");
			System.exit(-1);
		}

		System.out.println("Saved gamepack at path: " + gamepack(Paths.get(args[0])));
	}
}