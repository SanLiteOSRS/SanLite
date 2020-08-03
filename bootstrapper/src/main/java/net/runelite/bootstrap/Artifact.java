package net.runelite.bootstrap;

import lombok.Data;

@Data
class Artifact
{
	private String name;
	private String hash;
	private String path;
	private int size;
}
