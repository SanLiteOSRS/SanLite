import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public class class343 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "899766939"
	)
	public static String method6312(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 13 44
			int var7 = var0[var5++] & 255;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (var0[var5] & 192) == 128) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 248) {
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 41
				}
			} else {
				var8 = 65533; // L: 43
			}
		}

		return new String(var3, 0, var4); // L: 46
	}

	@ObfuscatedName("az")
	public static final int method6314(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var14 + var16 * (var12 - var14) * 6.0D;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = var0 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = var14 + (var12 - var14) * 6.0D * var20;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1904430468"
	)
	static void method6313() {
		class308.field3199 = System.getenv("JX_ACCESS_TOKEN"); // L: 887
		class103.field1350 = System.getenv("JX_REFRESH_TOKEN"); // L: 888
		class134.field1618 = System.getenv("JX_SESSION_ID"); // L: 889
		class363.field3973 = System.getenv("JX_CHARACTER_ID"); // L: 890
		String var0 = System.getenv("JX_DISPLAY_NAME"); // L: 891
		Login.field953 = WorldMapSection1.method5708(var0); // L: 893
	} // L: 895

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "124"
	)
	static String method6309(String var0) {
		PlayerType[] var1 = Huffman.PlayerType_values(); // L: 12945

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12946
			PlayerType var3 = var1[var2]; // L: 12947
			if (var3.modIcon != -1 && var0.startsWith(AbstractByteArrayCopier.method6833(var3.modIcon))) { // L: 12949 12950
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12951
				break;
			}
		}

		return var0; // L: 12958
	}
}
