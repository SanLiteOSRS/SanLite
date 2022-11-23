import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
public class class32 {
	@ObfuscatedName("a")
	static Applet field175;
	@ObfuscatedName("f")
	static String field176;
	@ObfuscatedName("d")
	static byte[][][] field179;
	@ObfuscatedName("r")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("pcmPlayerProvider")
	static class51 pcmPlayerProvider;

	static {
		field175 = null; // L: 10
		field176 = ""; // L: 11
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1743453877"
	)
	static final int method470(int var0, int var1) {
		int var2 = WorldMapSprite.method5154(var0 - 1, var1 - 1) + WorldMapSprite.method5154(var0 + 1, var1 - 1) + WorldMapSprite.method5154(var0 - 1, var1 + 1) + WorldMapSprite.method5154(1 + var0, var1 + 1); // L: 1010
		int var3 = WorldMapSprite.method5154(var0 - 1, var1) + WorldMapSprite.method5154(1 + var0, var1) + WorldMapSprite.method5154(var0, var1 - 1) + WorldMapSprite.method5154(var0, var1 + 1); // L: 1011
		int var4 = WorldMapSprite.method5154(var0, var1); // L: 1012
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 1013
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "18"
	)
	static int method477(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4219
			Client.logoutTimer = 250; // L: 4220
			return 1; // L: 4221
		} else {
			return 2; // L: 4223
		}
	}
}
