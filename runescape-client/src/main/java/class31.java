import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class31 {
	@ObfuscatedName("ay")
	static Applet field150;
	@ObfuscatedName("an")
	static String field148;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1888395193
	)
	static int field154;

	static {
		field150 = null; // L: 10
		field148 = ""; // L: 11
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnj;",
		garbageValue = "98"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4220, PlayerType.field4219, PlayerType.field4212, PlayerType.PlayerType_normal, PlayerType.field4217, PlayerType.PlayerType_ultimateIronman, PlayerType.field4213, PlayerType.field4214, PlayerType.field4225, PlayerType.field4211, PlayerType.field4215, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_playerModerator, PlayerType.field4218, PlayerType.field4205, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator}; // L: 30
	}
}
