package net.runelite.bootstrap;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client
{
	private final String artifactId;
	private final String classifier;
	private final String extension;
	private final String groupId;
	private final String version;
	private final String sanliteVersion;
	private final String osrsRevision;
}
