import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public abstract class class143 extends Node {
	class143() {
	} // L: 68

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	abstract void vmethod3412(Buffer var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	abstract void vmethod3419(ClanSettings var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-92101383"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 74

		for (int var6 = 0; var6 < var5; ++var6) { // L: 75
			char var7 = var0.charAt(var6 + var1); // L: 76
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 77
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 78
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 79
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 80
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 81
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 82
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 83
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 84
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 85
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) { // L: 86
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 87
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 88
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 89
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 90
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 91
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 92
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 93
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 94
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 95
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 96
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 97
			} else if (var7 == 732) { // L: 98
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 99
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 100
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 101
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 102
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 103
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 104
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 105
			}
		}

		return var5; // L: 107
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1787197961"
	)
	static final void method3139() {
		boolean var0 = false; // L: 10193

		while (!var0) { // L: 10194
			var0 = true; // L: 10195

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10196
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 10197
					String var2 = Client.menuTargets[var1]; // L: 10198
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10199
					Client.menuTargets[var1 + 1] = var2; // L: 10200
					String var3 = Client.menuActions[var1]; // L: 10201
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10202
					Client.menuActions[var1 + 1] = var3; // L: 10203
					int var4 = Client.menuOpcodes[var1]; // L: 10204
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10205
					Client.menuOpcodes[var1 + 1] = var4; // L: 10206
					var4 = Client.menuArguments1[var1]; // L: 10207
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10208
					Client.menuArguments1[var1 + 1] = var4; // L: 10209
					var4 = Client.menuArguments2[var1]; // L: 10210
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10211
					Client.menuArguments2[var1 + 1] = var4; // L: 10212
					var4 = Client.menuIdentifiers[var1]; // L: 10213
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10214
					Client.menuIdentifiers[var1 + 1] = var4; // L: 10215
					var4 = Client.field666[var1]; // L: 10216
					Client.field666[var1] = Client.field666[var1 + 1]; // L: 10217
					Client.field666[var1 + 1] = var4; // L: 10218
					boolean var5 = Client.menuShiftClick[var1]; // L: 10219
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10220
					Client.menuShiftClick[var1 + 1] = var5; // L: 10221
					var0 = false; // L: 10222
				}
			}
		}

	} // L: 10226

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lmt;IIIIIII)V",
		garbageValue = "815157374"
	)
	static final void method3138(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field816) { // L: 11207
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11208
		}

		Client.field816 = false; // L: 11209
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11210
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11211
				var0.scrollY -= 4; // L: 11212
				class200.invalidateWidget(var0); // L: 11213
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11215
				var0.scrollY += 4; // L: 11216
				class200.invalidateWidget(var0); // L: 11217
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11219
				var7 = var3 * (var3 - 32) / var4; // L: 11220
				if (var7 < 8) { // L: 11221
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11222
				int var9 = var3 - 32 - var7; // L: 11223
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11224
				class200.invalidateWidget(var0); // L: 11225
				Client.field816 = true; // L: 11226
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11229
			var7 = var0.width; // L: 11230
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11231
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11232
				class200.invalidateWidget(var0); // L: 11233
			}
		}

	} // L: 11236
}
