package net.runelite.client.plugins;

public enum PluginType
{
	RUNELITE
			{
				public String toString()
				{
					return "RuneLite";
				}
			},
	SANLITE
			{
				public String toString()
				{
					return "SanLite";
				}
			},
}
