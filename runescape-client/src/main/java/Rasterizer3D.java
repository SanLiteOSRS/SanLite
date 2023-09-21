import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("Rasterizer3D")
public class Rasterizer3D {
	@ObfuscatedName("ac")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("al")
	static int[] field2551;
	@ObfuscatedName("ak")
	static int[] field2555;
	@ObfuscatedName("ax")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ao")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	public static class258 field2550;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static class242 field2556;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class242 field2549;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class242 field2557;

	static {
		Rasterizer3D_colorPalette = new int[65536]; // L: 6
		field2551 = new int[512]; // L: 7
		field2555 = new int[2048]; // L: 8
		Rasterizer3D_sine = new int[2048]; // L: 9
		Rasterizer3D_cosine = new int[2048]; // L: 10

		int var0;
		for (var0 = 1; var0 < 512; ++var0) { // L: 17
			field2551[var0] = 32768 / var0; // L: 18
		}

		for (var0 = 1; var0 < 2048; ++var0) { // L: 20
			field2555[var0] = 65536 / var0; // L: 21
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 23
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D)); // L: 24
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D)); // L: 25
		}

		field2550 = new class258(); // L: 27
		field2549 = new class257(field2550); // L: 28
		field2557 = new class259(field2550); // L: 29
		field2556 = field2549; // L: 30
	} // L: 31

	@ObfuscatedName("ac")
	public static void method4518(boolean var0) {
		if (var0 && Rasterizer2D.field5209 != null) { // L: 38
			field2556 = field2557; // L: 39
		} else {
			field2556 = field2549; // L: 42
		}

	} // L: 44

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkg;)V"
	)
	public static void method4519(TextureLoader var0) {
		field2550.Rasterizer3D_textureLoader = var0; // L: 47
	} // L: 48

	@ObfuscatedName("ak")
	public static void method4517(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512); // L: 51
	} // L: 52

	@ObfuscatedName("ax")
	@Export("Rasterizer3D_buildPalette")
	static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
		int var4 = var2 * 128; // L: 55

		for (int var5 = var2; var5 < var3; ++var5) { // L: 56
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D; // L: 57
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D; // L: 58

			for (int var10 = 0; var10 < 128; ++var10) { // L: 59
				double var11 = (double)var10 / 128.0D; // L: 60
				double var13 = var11; // L: 61
				double var15 = var11; // L: 62
				double var17 = var11; // L: 63
				if (var8 != 0.0D) { // L: 64
					double var19;
					if (var11 < 0.5D) { // L: 66
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var11 + var8 - var11 * var8; // L: 67
					}

					double var21 = 2.0D * var11 - var19; // L: 68
					double var23 = var6 + 0.3333333333333333D; // L: 69
					if (var23 > 1.0D) { // L: 70
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D; // L: 72
					if (var27 < 0.0D) { // L: 73
						++var27;
					}

					if (6.0D * var23 < 1.0D) { // L: 74
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) { // L: 75
						var13 = var19;
					} else if (3.0D * var23 < 2.0D) { // L: 76
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21; // L: 77
					}

					if (6.0D * var6 < 1.0D) { // L: 78
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) { // L: 79
						var15 = var19;
					} else if (3.0D * var6 < 2.0D) { // L: 80
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21; // L: 81
					}

					if (6.0D * var27 < 1.0D) { // L: 82
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (2.0D * var27 < 1.0D) { // L: 83
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) { // L: 84
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21; // L: 85
					}
				}

				int var29 = (int)(var13 * 256.0D); // L: 87
				int var20 = (int)(var15 * 256.0D); // L: 88
				int var30 = (int)(var17 * 256.0D); // L: 89
				int var22 = var30 + (var20 << 8) + (var29 << 16); // L: 90
				var22 = Rasterizer3D_brighten(var22, var0); // L: 91
				if (var22 == 0) { // L: 92
					var22 = 1;
				}

				Rasterizer3D_colorPalette[var4++] = var22; // L: 93
			}
		}

	} // L: 96

	@ObfuscatedName("ao")
	@Export("Rasterizer3D_brighten")
	static int Rasterizer3D_brighten(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D; // L: 99
		double var5 = (double)(var0 >> 8 & 255) / 256.0D; // L: 100
		double var7 = (double)(var0 & 255) / 256.0D; // L: 101
		var3 = Math.pow(var3, var1); // L: 102
		var5 = Math.pow(var5, var1); // L: 103
		var7 = Math.pow(var7, var1); // L: 104
		int var9 = (int)(var3 * 256.0D); // L: 105
		int var10 = (int)(var5 * 256.0D); // L: 106
		int var11 = (int)(var7 * 256.0D); // L: 107
		return var11 + (var10 << 8) + (var9 << 16); // L: 108
	}

	@ObfuscatedName("ah")
	static int method4567() {
		return field2550.field2848; // L: 112
	}

	@ObfuscatedName("ar")
	static int method4566() {
		return field2550.field2843; // L: 116
	}

	@ObfuscatedName("ab")
	static int method4524() {
		return field2550.field2846; // L: 120
	}

	@ObfuscatedName("am")
	static int method4525() {
		return field2550.field2850; // L: 124
	}

	@ObfuscatedName("av")
	static int method4526() {
		return field2550.field2849; // L: 128
	}

	@ObfuscatedName("ag")
	static int method4527() {
		return field2550.field2844; // L: 132
	}

	@ObfuscatedName("aa")
	public static int method4528() {
		return field2550.field2830; // L: 136
	}

	@ObfuscatedName("ap")
	static int method4594() {
		return field2550.field2842; // L: 140
	}

	@ObfuscatedName("ay")
	public static void method4530(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2556 == field2557) { // L: 144
			field2556 = field2549; // L: 145
		}

		field2556.method4629(var0, var1, var2, var3); // L: 147
	} // L: 148

	@ObfuscatedName("as")
	public static void method4535() {
		Rasterizer3D_setClip(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd); // L: 151
	} // L: 152

	@ObfuscatedName("aj")
	@Export("Rasterizer3D_setClip")
	static void Rasterizer3D_setClip(int var0, int var1, int var2, int var3) {
		field2550.field2842 = var2 - var0; // L: 155
		field2550.field2845 = var3 - var1; // L: 156
		method4533(); // L: 157
		if (field2550.Rasterizer3D_rowOffsets.length < field2550.field2845) { // L: 158
			field2550.Rasterizer3D_rowOffsets = new int[EnumComposition.method3749(field2550.field2845)]; // L: 159
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1; // L: 161

		for (int var5 = 0; var5 < field2550.field2845; ++var5) { // L: 162
			field2550.Rasterizer3D_rowOffsets[var5] = var4; // L: 163
			var4 += Rasterizer2D.Rasterizer2D_width; // L: 164
		}

	} // L: 166

	@ObfuscatedName("an")
	public static void method4533() {
		field2550.method5108(); // L: 169
	} // L: 170

	@ObfuscatedName("au")
	public static void method4534(int var0, int var1) {
		int var2 = field2550.Rasterizer3D_rowOffsets[0]; // L: 173
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width; // L: 174
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width; // L: 175
		field2550.method5107(var0, var4, var1, var3); // L: 176
	} // L: 177

	@ObfuscatedName("ai")
	public static void method4558(int var0, int var1, int var2) {
		field2550.method5109(var0, var1, var2); // L: 180
	} // L: 181

	@ObfuscatedName("ae")
	static void method4536(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2556.vmethod5143(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11); // L: 184
	} // L: 185

	@ObfuscatedName("aw")
	public static void method4565(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2556.vmethod5176(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 188
	} // L: 189

	@ObfuscatedName("aq")
	static void method4538(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2556.vmethod5125(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21); // L: 192
	} // L: 193

	@ObfuscatedName("az")
	static void method4531(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2556.vmethod5133(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21); // L: 196
	} // L: 197

	@ObfuscatedName("at")
	static void method4557(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2556.method4648(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15); // L: 200
	} // L: 201

	@ObfuscatedName("af")
	static void method4523(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2556.method4628(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 204
	} // L: 205
}
