import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class306 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field3393;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field3397;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field3401;
	@ObfuscatedName("am")
	public static ArrayList field3395;
	@ObfuscatedName("as")
	public static LinkedList field3396;
	@ObfuscatedName("aj")
	public static ArrayList field3394;
	@ObfuscatedName("ag")
	public static ArrayList field3398;
	@ObfuscatedName("az")
	static ArrayList field3399;
	@ObfuscatedName("av")
	public static final List field3400;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1487938257
	)
	public static int field3392;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1264119931
	)
	public static int field3402;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1809534201
	)
	public static int field3403;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1503586905
	)
	public static int field3407;

	static {
		field3395 = null; // L: 13
		field3396 = new LinkedList(); // L: 14
		field3394 = new ArrayList(3); // L: 15
		field3398 = new ArrayList(3); // L: 16
		field3399 = new ArrayList(); // L: 17
		field3400 = new ArrayList(); // L: 18
		field3392 = 0; // L: 19
		field3402 = 0; // L: 20
		field3403 = 0; // L: 21
		field3407 = 0; // L: 22
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	static void method5812() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 99
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 100
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 101
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 102
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 103
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 104
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 105
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 106
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 107
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 108
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 109
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 110
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 111
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 114
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 115
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 116
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 117
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 118
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 119
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 120
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 121
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 122
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 123
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 124
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 125
		}

	} // L: 127

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1789463906"
	)
	public static int method5811(CharSequence var0) {
		return ClanChannel.method3380(var0, 10, true); // L: 68
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "739300687"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5745
		int var4 = var1 >> 7; // L: 5746
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5747
			int var5 = var2; // L: 5748
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5749
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5750
			int var7 = var1 & 127; // L: 5751
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5752
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7; // L: 5753
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 5754
		} else {
			return 0;
		}
	}
}
