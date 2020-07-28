package net.runelite.bootstrap;

import lombok.Data;

@Data
class Artifact
{
	private String name;
	private String path;
	private String hash;
	private int size;
}
