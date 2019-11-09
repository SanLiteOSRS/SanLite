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
	SANLITE_USE_AT_OWN_RISK
			{
				public String toString()
				{
					return "SanLite - Use at own risk";
				}
			},
}
