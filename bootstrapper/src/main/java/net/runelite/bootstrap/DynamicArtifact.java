package net.runelite.bootstrap;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.File;

@AllArgsConstructor
public enum DynamicArtifact
{
	RUNELITE_CLIENT("runelite-client", "client"),
	RUNELITE_API("runelite-api", "runelite-api"),
	RUNESCAPE_API("runescape-api", "runescape-api"),
	RUNELITE_JSHELL("runelite-jshell", "jshell"),
	HTTP_API("http-api", "http-api"),
	INJECTED_CLIENT("injected-client", "injected-client");

	@Getter
	private final String directory;

	@Getter
	private final String name;

	public File getFile()
	{
		return new File("../" + getDirectory() + "/target/" + getFileName());
	}

	public String getFileName()
	{
		return getName() + "-" + new BootstrapperProperties().getRuneLiteVersion() + ".jar";
	}
}
