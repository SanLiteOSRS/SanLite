import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1599411707
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -878731657
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -338710693
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -43155063
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 534377657
	)
	int field920;
	@ObfuscatedName("ah")
	String field913;
	@ObfuscatedName("ar")
	String field914;

	MenuAction() {
	} // L: 13042

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-3"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4606) { // L: 96
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 97
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4599) { // L: 100
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4600) { // L: 104
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field4595 < ByteArrayPool.field4603) { // L: 108
			ByteArrayPool.field4605[++ByteArrayPool.field4595 - 1] = var0;
		} else {
			if (KeyHandler.ByteArrayPool_arrays != null) { // L: 112
				for (int var1 = 0; var1 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var1] && class425.ByteArrayPool_altSizeArrayCounts[var1] < KeyHandler.ByteArrayPool_arrays[var1].length) { // L: 114
						KeyHandler.ByteArrayPool_arrays[var1][class425.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 115
						return; // L: 116
					}
				}
			}

		}
	} // L: 106 110 120

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "-2018326069"
	)
	static double method2122(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 47
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 81
			case 2:
				return Math.sin(3.141592653589793D * var3 / 2.0D); // L: 90
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D; // L: 59
			case 4:
				return var3 * var3; // L: 67
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 65
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D) / 2.0D; // L: 61
			case 7:
				return var3 * var3 * var3; // L: 35
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 37
			case 9:
				return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 3.0D) / 2.0D; // L: 109
			case 10:
				return var3 * var3 * var3 * var3; // L: 63
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 51
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D; // L: 105
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 107
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 83
			case 15:
				return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 5.0D) / 2.0D; // L: 111
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 49
			case 17:
				return 1.0D - Math.pow(2.0D, var3 * -10.0D); // L: 73
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + var3 * 20.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var3 * -20.0D)) / 2.0D; // L: 98
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 71
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 39
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D)) + 1.0D) / 2.0D; // L: 69
			case 22:
				var5 = 1.70158D; // L: 54
				var7 = 2.70158D; // L: 55
				return var3 * var3 * 2.70158D * var3 - 1.70158D * var3 * var3; // L: 56
			case 23:
				var5 = 1.70158D; // L: 76
				var7 = 2.70158D; // L: 77
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 78
			case 24:
				var5 = 1.70158D; // L: 93
				var7 = 2.5949095D; // L: 94
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (2.0D * var3 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D; // L: 95
			case 25:
				var5 = 2.0943951023931953D; // L: 86
				return -Math.pow(2.0D, 10.0D * var3 - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D); // L: 87
			case 26:
				var5 = 2.0943951023931953D; // L: 101
				return Math.pow(2.0D, var3 * -10.0D) * Math.sin(2.0943951023931953D * (10.0D * var3 - 0.75D)) + 1.0D; // L: 102
			case 27:
				var5 = 1.3962634015954636D; // L: 42
				var7 = Math.sin(1.3962634015954636D * (var3 * 20.0D - 11.125D)); // L: 43
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + var3 * -20.0D) * var7 / 2.0D + 1.0D; // L: 44
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
