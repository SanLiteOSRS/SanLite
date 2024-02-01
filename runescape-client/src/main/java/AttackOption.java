import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("AttackOption")
public enum AttackOption implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1329(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1331(4);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -424875575
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12827
	} // L: 12828

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12832
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "1666289007"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 61

		for (int var6 = 0; var6 < var5; ++var6) { // L: 62
			char var7 = var0.charAt(var6 + var1); // L: 63
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 64
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 65
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 66
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 67
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 68
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 69
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 70
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 71
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 72
			} else if (var7 == 8240) { // L: 73
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 74
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 75
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 76
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 77
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 78
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 79
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 80
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 81
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 82
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106; // L: 83
			} else if (var7 == 8212) { // L: 84
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 85
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 86
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 87
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 88
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 89
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 90
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 91
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 92
			}
		}

		return var5; // L: 94
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "-1"
	)
	static void method2739(float[] var0) {
		var0[1] = 1.0F - var0[1]; // L: 333
		if (var0[0] < 0.0F) { // L: 334
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) { // L: 335
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) { // L: 336
			float var1 = (float)(((double)var0[1] - 2.0D) * (double)var0[1] + (double)(var0[0] * (var0[1] + (var0[0] - 2.0F))) + 1.0D); // L: 337
			if (var1 + class127.field1487 > 0.0F) { // L: 338
				class135.method3146(var0); // L: 339
			}
		}

		var0[1] = 1.0F - var0[1]; // L: 342
	} // L: 343
}
