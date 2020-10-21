import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class300 {
	@ObfuscatedName("f")
	static char[] field3686;
	@ObfuscatedName("b")
	static char[] field3682;
	@ObfuscatedName("l")
	static char[] field3684;
	@ObfuscatedName("m")
	static int[] field3685;

	static {
		field3686 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3686[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3686[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3686[var0] = (char)(var0 + 48 - 52);
		}

		field3686[62] = '+';
		field3686[63] = '/';
		field3682 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3682[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3682[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3682[var0] = (char)(var0 + 48 - 52);
		}

		field3682[62] = '*';
		field3682[63] = '-';
		field3684 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3684[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3684[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3684[var0] = (char)(var0 + 48 - 52);
		}

		field3684[62] = '-';
		field3684[63] = '_';
		field3685 = new int[128];

		for (var0 = 0; var0 < field3685.length; ++var0) {
			field3685[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3685[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3685[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3685[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3685;
		field3685[43] = 62;
		var2[42] = 62;
		int[] var1 = field3685;
		field3685[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		signature = "(IIIIIII)V",
		garbageValue = "-364565462"
	)
	static final void method5419(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method3137(var17, var18, var19);
			Rasterizer3D.method3149(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3137(var17, var19, var20);
			Rasterizer3D.method3149(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
