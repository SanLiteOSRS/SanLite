package net.runelite.bootstrap;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.File;

@AllArgsConstructor
public enum DynamicArtifact
{
	RUNELITE_CLIENT("runelite-client", "runelite-client"),
	RUNELITE_API("runelite-api", "runelite-api"),
	RUNESCAPE_API("runescape-api", "runescape-api"),
	RUNELITE_JSHELL("runelite-jshell", "runelite-jshell");

	@Getter
	private final String directory;

	@Getter
	private final String name;

	public File getFile()
	{
		return new File("../" + getDirectory() + "/build/libs/" + getFileName());
	}

	public String getFileName()
	{
		return getName() + "-" + new BootstrapperProperties().getSanLiteVersion() + ".jar";
	}
}
