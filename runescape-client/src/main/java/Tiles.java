import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bw")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("f")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("b")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1638163549
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("q")
	static byte[][][] field531;
	@ObfuscatedName("j")
	static final int[] field533;
	@ObfuscatedName("w")
	static final int[] field534;
	@ObfuscatedName("v")
	static final int[] field528;
	@ObfuscatedName("d")
	static final int[] field536;
	@ObfuscatedName("a")
	static final int[] field535;
	@ObfuscatedName("g")
	static final int[] field529;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2130461421
	)
	static int field539;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1692186847
	)
	static int field540;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1235854871
	)
	static int field542;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field533 = new int[]{1, 2, 4, 8};
		field534 = new int[]{16, 32, 64, 128};
		field528 = new int[]{1, 0, -1, 0};
		field536 = new int[]{0, -1, 0, 1};
		field535 = new int[]{1, -1, -1, 1};
		field529 = new int[]{-1, -1, 1, 1};
		field539 = (int)(Math.random() * 17.0D) - 8;
		field540 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(CB)Z",
		garbageValue = "-86"
	)
	static final boolean method1223(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-1955687589"
	)
	public static boolean method1195(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class298.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lks;I)I",
		garbageValue = "2087937385"
	)
	static int method1220(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(ILco;ZB)I",
		garbageValue = "45"
	)
	static int method1222(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = UrlRequester.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class277.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--MilliClock.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					GrandExchangeOfferAgeComparator.clientPreferences.windowMode = var3;
					Tile.savePreferences();
				}

				return 1;
			}
		}
	}
}
