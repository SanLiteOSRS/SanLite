import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("an")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "222072056"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "20"
	)
	public static String method5468(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "39"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 106

		for (int var6 = 0; var6 < var5; ++var6) { // L: 107
			char var7 = var0.charAt(var6 + var1); // L: 108
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 109
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 110
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 111
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 112
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 113
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 114
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 115
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 116
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 117
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) { // L: 118
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 119
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 120
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 121
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 122
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 123
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 124
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 125
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 126
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 127
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 128
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 129
			} else if (var7 == 732) { // L: 130
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 131
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 132
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 133
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 134
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 135
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 136
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 137
			}
		}

		return var5; // L: 139
	}
}
