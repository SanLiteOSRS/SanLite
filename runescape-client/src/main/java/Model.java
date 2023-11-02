import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("al")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ax")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static class465 field2728;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static class465 field2729;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static class465 field2730;
	@ObfuscatedName("br")
	static boolean[] field2785;
	@ObfuscatedName("bs")
	static boolean[] field2733;
	@ObfuscatedName("bc")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bu")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bf")
	static float[] field2767;
	@ObfuscatedName("bh")
	static int[] field2768;
	@ObfuscatedName("bl")
	static int[] field2734;
	@ObfuscatedName("bg")
	static int[] field2758;
	@ObfuscatedName("bj")
	static int[] field2783;
	@ObfuscatedName("bi")
	static char[] field2773;
	@ObfuscatedName("bq")
	static char[][] field2774;
	@ObfuscatedName("bw")
	static int[] field2724;
	@ObfuscatedName("ce")
	static int[][] field2776;
	@ObfuscatedName("cu")
	static int[] field2777;
	@ObfuscatedName("cw")
	static int[] field2770;
	@ObfuscatedName("co")
	static int[] field2779;
	@ObfuscatedName("cc")
	static int[] field2780;
	@ObfuscatedName("cg")
	static int[] field2739;
	@ObfuscatedName("cq")
	static int[] field2782;
	@ObfuscatedName("cy")
	static float[] field2764;
	@ObfuscatedName("cz")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cp")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cb")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cn")
	static boolean field2787;
	@ObfuscatedName("cs")
	static int[] field2790;
	@ObfuscatedName("cm")
	static int[] field2759;
	@ObfuscatedName("cv")
	static int[] field2778;
	@ObfuscatedName("ci")
	static int[] field2763;
	@ObfuscatedName("ch")
	static final float field2796;
	@ObfuscatedName("ab")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("am")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("av")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ag")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("aa")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ap")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ay")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("as")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("aj")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("an")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("au")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ai")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ae")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("aw")
	byte[] field2744;
	@ObfuscatedName("aq")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("az")
	public byte field2746;
	@ObfuscatedName("at")
	public int field2747;
	@ObfuscatedName("af")
	int[] field2748;
	@ObfuscatedName("ad")
	int[] field2742;
	@ObfuscatedName("bn")
	int[] field2750;
	@ObfuscatedName("bk")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("by")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bd")
	int[][] field2753;
	@ObfuscatedName("be")
	int[][] field2754;
	@ObfuscatedName("bv")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ba")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bz")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bb")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bo")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bp")
	@Export("radius")
	int radius;
	@ObfuscatedName("bt")
	HashMap field2761;
	@ObfuscatedName("cd")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("ct")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cf")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cl")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ca")
	public short field2801;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2728 = new class465(); // L: 17
		field2729 = new class465(); // L: 18
		field2730 = new class465(); // L: 19
		field2785 = new boolean[6500]; // L: 55
		field2733 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2767 = new float[6500]; // L: 59
		field2768 = new int[6500]; // L: 60
		field2734 = new int[6500]; // L: 61
		field2758 = new int[6500]; // L: 62
		field2783 = new int[6500]; // L: 63
		field2773 = new char[6000]; // L: 65
		field2774 = new char[6000][512]; // L: 66
		field2724 = new int[12]; // L: 67
		field2776 = new int[12][2000]; // L: 68
		field2777 = new int[2000]; // L: 69
		field2770 = new int[2000]; // L: 70
		field2779 = new int[12]; // L: 71
		field2780 = new int[10]; // L: 72
		field2739 = new int[10]; // L: 73
		field2782 = new int[10]; // L: 74
		field2764 = new float[10]; // L: 75
		field2787 = true; // L: 79
		field2790 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field2759 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2778 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2763 = Rasterizer3D.field2555; // L: 85
		field2796 = SecureRandomFuture.method2200(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2746 = 0;
		this.field2747 = 0;
		this.isSingleTile = false;
		this.field2761 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2746 = 0;
		this.field2747 = 0;
		this.isSingleTile = false;
		this.field2761 = new HashMap();
		this.method4940(var1, var2, var3); // L: 121
		this.field2746 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2747 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Ljn;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2746 = 0; // L: 35
		this.field2747 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2761 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2747 = 0; // L: 100
		this.field2746 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2747 += var4.field2747; // L: 107
				if (this.field2746 == -1) { // L: 108
					this.field2746 = var4.field2746;
				}
			}
		}

		this.method4940(this.verticesCount, this.indicesCount, this.field2747); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2747 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method4904(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("ac")
	void method4940(int var1, int var2, int var3) {
		this.verticesX = new int[var1]; // L: 129
		this.verticesY = new int[var1]; // L: 130
		this.verticesZ = new int[var1]; // L: 131
		this.indices1 = new int[var2]; // L: 132
		this.indices2 = new int[var2]; // L: 133
		this.indices3 = new int[var2]; // L: 134
		this.faceColors1 = new int[var2]; // L: 135
		this.faceColors2 = new int[var2]; // L: 136
		this.faceColors3 = new int[var2]; // L: 137
		if (var3 > 0) { // L: 138
			this.field2748 = new int[var3]; // L: 139
			this.field2742 = new int[var3]; // L: 140
			this.field2750 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	void method4952(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2746 != var1.field2746)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2746); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2744 == null && var1.field2744 != null) { // L: 159
			this.field2744 = new byte[var2]; // L: 160
			Arrays.fill(this.field2744, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	public void method4904(Model var1) {
		if (var1 != null) { // L: 166
			this.method4952(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2746; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2744 != null) { // L: 186
					if (var1.field2744 != null && var1.field2744[var2] != -1) { // L: 187
						this.field2744[this.indicesCount] = (byte)(var1.field2744[var2] + this.field2747); // L: 188
					} else {
						this.field2744[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2747; ++var2) { // L: 196
				this.field2748[this.field2747] = this.verticesCount + var1.field2748[var2]; // L: 197
				this.field2742[this.field2747] = this.verticesCount + var1.field2742[var2]; // L: 198
				this.field2750[this.field2747] = this.verticesCount + var1.field2750[var2]; // L: 199
				++this.field2747; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljn;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder(); // L: 211
		int var7 = var2 - this.xzRadius; // L: 212
		int var8 = var2 + this.xzRadius; // L: 213
		int var9 = var4 - this.xzRadius; // L: 214
		int var10 = var4 + this.xzRadius; // L: 215
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 216
			var7 >>= 7; // L: 217
			var8 = var8 + 127 >> 7; // L: 218
			var9 >>= 7; // L: 219
			var10 = var10 + 127 >> 7; // L: 220
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 221
				return this;
			} else {
				Model var11;
				if (var5) { // L: 223
					var11 = new Model(); // L: 224
					var11.verticesCount = this.verticesCount; // L: 225
					var11.indicesCount = this.indicesCount; // L: 226
					var11.field2747 = this.field2747; // L: 227
					var11.verticesX = this.verticesX; // L: 228
					var11.verticesZ = this.verticesZ; // L: 229
					var11.indices1 = this.indices1; // L: 230
					var11.indices2 = this.indices2; // L: 231
					var11.indices3 = this.indices3; // L: 232
					var11.faceColors1 = this.faceColors1; // L: 233
					var11.faceColors2 = this.faceColors2; // L: 234
					var11.faceColors3 = this.faceColors3; // L: 235
					var11.faceRenderPriorities = this.faceRenderPriorities; // L: 236
					var11.faceAlphas = this.faceAlphas; // L: 237
					var11.field2744 = this.field2744; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2746 = this.field2746; // L: 240
					var11.field2748 = this.field2748; // L: 241
					var11.field2742 = this.field2742; // L: 242
					var11.field2750 = this.field2750; // L: 243
					var11.vertexLabels = this.vertexLabels; // L: 244
					var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 245
					var11.isSingleTile = this.isSingleTile; // L: 246
					var11.verticesY = new int[var11.verticesCount]; // L: 247
				} else {
					var11 = this; // L: 250
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) { // L: 252
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 253
						var13 = var2 + this.verticesX[var12]; // L: 254
						var14 = var4 + this.verticesZ[var12]; // L: 255
						var15 = var13 & 127; // L: 256
						var16 = var14 & 127; // L: 257
						var17 = var13 >> 7; // L: 258
						var18 = var14 >> 7; // L: 259
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 260
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 261
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 262
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 263
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 267
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 268
						if (var13 < var6) { // L: 269
							var14 = var2 + this.verticesX[var12]; // L: 270
							var15 = var4 + this.verticesZ[var12]; // L: 271
							var16 = var14 & 127; // L: 272
							var17 = var15 & 127; // L: 273
							var18 = var14 >> 7; // L: 274
							var19 = var15 >> 7; // L: 275
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 276
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 277
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 278
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 279
						}
					}
				}

				var11.resetBounds(); // L: 283
				return var11; // L: 284
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	public Model method4907(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZLjn;[B)Ljn;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2747 = this.field2747; // L: 300
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) { // L: 301
			var2.verticesX = new int[this.verticesCount + 100]; // L: 302
			var2.verticesY = new int[this.verticesCount + 100]; // L: 303
			var2.verticesZ = new int[this.verticesCount + 100]; // L: 304
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) { // L: 306
			var2.verticesX[var4] = this.verticesX[var4]; // L: 307
			var2.verticesY[var4] = this.verticesY[var4]; // L: 308
			var2.verticesZ[var4] = this.verticesZ[var4]; // L: 309
		}

		if (var1) { // L: 311
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3; // L: 313
			if (this.faceAlphas == null) { // L: 314
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 315
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 318
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1; // L: 321
		var2.indices2 = this.indices2; // L: 322
		var2.indices3 = this.indices3; // L: 323
		var2.faceColors1 = this.faceColors1; // L: 324
		var2.faceColors2 = this.faceColors2; // L: 325
		var2.faceColors3 = this.faceColors3; // L: 326
		var2.faceRenderPriorities = this.faceRenderPriorities; // L: 327
		var2.field2744 = this.field2744; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2746 = this.field2746; // L: 330
		var2.field2748 = this.field2748; // L: 331
		var2.field2742 = this.field2742; // L: 332
		var2.field2750 = this.field2750; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2753 = this.field2753; // L: 336
		var2.field2754 = this.field2754; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("av")
	void method5001(int var1) {
		if (!this.field2761.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field2759[var1]; // L: 352
			int var9 = field2790[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var11 = PlayerComposition.method6301(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 355
				int var12 = this.verticesY[var10]; // L: 356
				int var13 = class74.method2119(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 357
				if (var11 < var2) { // L: 358
					var2 = var11;
				}

				if (var11 > var5) { // L: 359
					var5 = var11;
				}

				if (var12 < var3) { // L: 360
					var3 = var12;
				}

				if (var12 > var6) { // L: 361
					var6 = var12;
				}

				if (var13 < var4) { // L: 362
					var4 = var13;
				}

				if (var13 > var7) { // L: 363
					var7 = var13;
				}
			}

			class245 var14 = new class245((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 365
			boolean var15 = true; // L: 366
			if (var14.field2654 < 32) { // L: 367
				var14.field2654 = 32;
			}

			if (var14.field2656 < 32) { // L: 368
				var14.field2656 = 32;
			}

			if (this.isSingleTile) { // L: 369
				boolean var16 = true; // L: 370
				var14.field2654 += 8; // L: 371
				var14.field2656 += 8; // L: 372
			}

			this.field2761.put(var1, var14); // L: 374
		}
	} // L: 375

	@ObfuscatedName("ag")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 378
			this.boundsType = 1; // L: 379
			super.height = 0; // L: 380
			this.bottomY = 0; // L: 381
			this.xzRadius = 0; // L: 382

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 383
				int var2 = this.verticesX[var1]; // L: 384
				int var3 = this.verticesY[var1]; // L: 385
				int var4 = this.verticesZ[var1]; // L: 386
				if (-var3 > super.height) { // L: 387
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 388
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 389
				if (var5 > this.xzRadius) { // L: 390
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 392
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 393
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 394
		}
	} // L: 395

	@ObfuscatedName("aa")
	void method5003() {
		if (this.boundsType != 2) { // L: 398
			this.boundsType = 2; // L: 399
			this.xzRadius = 0; // L: 400

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 401
				int var2 = this.verticesX[var1]; // L: 402
				int var3 = this.verticesY[var1]; // L: 403
				int var4 = this.verticesZ[var1]; // L: 404
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 405
				if (var5 > this.xzRadius) { // L: 406
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 408
			this.radius = this.xzRadius; // L: 409
			this.diameter = this.xzRadius + this.xzRadius; // L: 410
		}
	} // L: 411

	@ObfuscatedName("ap")
	public int method4912() {
		this.calculateBoundsCylinder(); // L: 414
		return this.xzRadius; // L: 415
	}

	@ObfuscatedName("ay")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 419
		this.field2761.clear(); // L: 420
	} // L: 421

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 424
			if (var2 != -1) { // L: 425
				Animation var3 = var1.frames[var2]; // L: 426
				Skeleton var4 = var3.skeleton; // L: 427
				Model_transformTempX = 0; // L: 428
				Model_transformTempY = 0; // L: 429
				Model_transformTempZ = 0; // L: 430

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 431
					int var6 = var3.transformSkeletonLabels[var5]; // L: 432
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 433
				}

				this.resetBounds(); // L: 435
			}
		}
	} // L: 436

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfk;I)V"
	)
	public void method4915(class139 var1, int var2) {
		Skeleton var3 = var1.field1606; // L: 439
		class241 var4 = var3.method4657(); // L: 440
		if (var4 != null) { // L: 441
			var3.method4657().method4612(var1, var2); // L: 442
			this.method4924(var3.method4657(), var1.method3107()); // L: 443
		}

		if (var1.method3088()) { // L: 445
			this.method4929(var1, var2); // L: 446
		}

		this.resetBounds(); // L: 448
	} // L: 449

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfk;I)V"
	)
	void method4929(class139 var1, int var2) {
		Skeleton var3 = var1.field1606; // L: 452

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 453
			int var5 = var3.transformTypes[var4]; // L: 454
			if (var5 == 5 && var1.field1603 != null && var1.field1603[var4] != null && var1.field1603[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 455 456
				class132 var6 = var1.field1603[var4][0]; // L: 457
				int[] var7 = var3.labels[var4]; // L: 458
				int var8 = var7.length; // L: 459

				for (int var9 = 0; var9 < var8; ++var9) { // L: 460
					int var10 = var7[var9]; // L: 461
					if (var10 < this.faceLabelsAlpha.length) { // L: 462
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 463

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 464
							int var13 = var11[var12]; // L: 465
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3022(var2) * 255.0F); // L: 466
							if (var14 < 0) { // L: 467
								var14 = 0;
							} else if (var14 > 255) { // L: 468
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 469
						}
					}
				}
			}
		}

	} // L: 476

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V"
	)
	void method4924(class241 var1, int var2) {
		this.method4936(var1, var2); // L: 480
	} // L: 482

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lja;ILja;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 485
			if (var5 != null && var4 != -1) { // L: 486
				Animation var6 = var1.frames[var2]; // L: 490
				Animation var7 = var3.frames[var4]; // L: 491
				Skeleton var8 = var6.skeleton; // L: 492
				Model_transformTempX = 0; // L: 493
				Model_transformTempY = 0; // L: 494
				Model_transformTempZ = 0; // L: 495
				byte var9 = 0; // L: 496
				int var13 = var9 + 1; // L: 497
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 498
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 499 500
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 501
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 503
				Model_transformTempY = 0; // L: 504
				Model_transformTempZ = 0; // L: 505
				var9 = 0; // L: 506
				var13 = var9 + 1; // L: 507
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 508
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 509 510
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 511
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 513
			} else {
				this.animate(var1, var2); // L: 487
			}
		}
	} // L: 488 514

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lju;Lfk;I[ZZZ)V"
	)
	public void method4918(Skeleton var1, class139 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class241 var7 = var1.method4657(); // L: 517
		if (var7 != null) { // L: 518
			var7.method4608(var2, var3, var4, var5); // L: 519
			if (var6) { // L: 520
				this.method4924(var7, var2.method3107()); // L: 521
			}
		}

		if (!var5 && var2.method3088()) { // L: 524
			this.method4929(var2, var3); // L: 525
		}

	} // L: 527

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lja;I[IZ)V"
	)
	public void method4919(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 530
			this.animate(var1, var2); // L: 531
		} else {
			Animation var5 = var1.frames[var2]; // L: 534
			Skeleton var6 = var5.skeleton; // L: 535
			byte var7 = 0; // L: 536
			int var11 = var7 + 1; // L: 537
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 538
			Model_transformTempY = 0; // L: 539
			Model_transformTempZ = 0; // L: 540

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 541
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 542 543
				}

				if (var4) { // L: 544
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 545
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 548
				}
			}

		}
	} // L: 532 551

	@ObfuscatedName("aq")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 554
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 555
			var7 = 0; // L: 556
			Model_transformTempX = 0; // L: 557
			Model_transformTempY = 0; // L: 558
			Model_transformTempZ = 0; // L: 559

			for (var8 = 0; var8 < var6; ++var8) { // L: 560
				int var18 = var2[var8]; // L: 561
				if (var18 < this.vertexLabels.length) { // L: 562
					int[] var19 = this.vertexLabels[var18]; // L: 563

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 564
						var12 = var19[var11]; // L: 565
						Model_transformTempX += this.verticesX[var12]; // L: 566
						Model_transformTempY += this.verticesY[var12]; // L: 567
						Model_transformTempZ += this.verticesZ[var12]; // L: 568
						++var7; // L: 569
					}
				}
			}

			if (var7 > 0) { // L: 573
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 574
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 575
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 576
			} else {
				Model_transformTempX = var3; // L: 579
				Model_transformTempY = var4; // L: 580
				Model_transformTempZ = var5; // L: 581
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 585
				for (var7 = 0; var7 < var6; ++var7) { // L: 586
					var8 = var2[var7]; // L: 587
					if (var8 < this.vertexLabels.length) { // L: 588
						var9 = this.vertexLabels[var8]; // L: 589

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 590
							var11 = var9[var10]; // L: 591
							var10000 = this.verticesX; // L: 592
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 593
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 594
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 600
				for (var7 = 0; var7 < var6; ++var7) { // L: 601
					var8 = var2[var7]; // L: 602
					if (var8 < this.vertexLabels.length) { // L: 603
						var9 = this.vertexLabels[var8]; // L: 604

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 605
							var11 = var9[var10]; // L: 606
							var10000 = this.verticesX; // L: 607
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 608
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 609
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 610
							int var13 = (var4 & 255) * 8; // L: 611
							int var14 = (var5 & 255) * 8; // L: 612
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 613
								var15 = field2790[var14]; // L: 614
								var16 = field2759[var14]; // L: 615
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 616
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 617
								this.verticesX[var11] = var17; // L: 618
							}

							if (var12 != 0) { // L: 620
								var15 = field2790[var12]; // L: 621
								var16 = field2759[var12]; // L: 622
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 623
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 624
								this.verticesY[var11] = var17; // L: 625
							}

							if (var13 != 0) { // L: 627
								var15 = field2790[var13]; // L: 628
								var16 = field2759[var13]; // L: 629
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 630
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 631
								this.verticesX[var11] = var17; // L: 632
							}

							var10000 = this.verticesX; // L: 634
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 635
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 636
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 642
				for (var7 = 0; var7 < var6; ++var7) { // L: 643
					var8 = var2[var7]; // L: 644
					if (var8 < this.vertexLabels.length) { // L: 645
						var9 = this.vertexLabels[var8]; // L: 646

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 647
							var11 = var9[var10]; // L: 648
							var10000 = this.verticesX; // L: 649
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 650
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 651
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 652
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 653
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 654
							var10000 = this.verticesX; // L: 655
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 656
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 657
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 663
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 664
					for (var7 = 0; var7 < var6; ++var7) { // L: 665
						var8 = var2[var7]; // L: 666
						if (var8 < this.faceLabelsAlpha.length) { // L: 667
							var9 = this.faceLabelsAlpha[var8]; // L: 668

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 669
								var11 = var9[var10]; // L: 670
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 671
								if (var12 < 0) { // L: 672
									var12 = 0;
								} else if (var12 > 255) { // L: 673
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 674
							}
						}
					}
				}

			}
		}
	} // L: 583 598 640 661 679 681

	@ObfuscatedName("az")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 684
			int var2 = this.verticesX[var1]; // L: 685
			this.verticesX[var1] = this.verticesZ[var1]; // L: 686
			this.verticesZ[var1] = -var2; // L: 687
		}

		this.resetBounds(); // L: 689
	} // L: 690

	@ObfuscatedName("at")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 693
			this.verticesX[var1] = -this.verticesX[var1]; // L: 694
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("af")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 701
			int var2 = this.verticesZ[var1]; // L: 702
			this.verticesZ[var1] = this.verticesX[var1]; // L: 703
			this.verticesX[var1] = -var2; // L: 704
		}

		this.resetBounds(); // L: 706
	} // L: 707

	@ObfuscatedName("ad")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2790[var1]; // L: 710
		int var3 = field2759[var1]; // L: 711

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 712
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 713
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 714
			this.verticesY[var4] = var5; // L: 715
		}

		this.resetBounds(); // L: 717
	} // L: 718

	@ObfuscatedName("bn")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 721
			int[] var10000 = this.verticesX; // L: 722
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 723
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 724
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 726
	} // L: 727

	@ObfuscatedName("bk")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 730
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 731
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 732
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 733
		}

		this.resetBounds(); // L: 735
	} // L: 736

	@ObfuscatedName("by")
	public final void method4933(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 739
			this.method5003();
		}

		int var8 = Rasterizer3D.method4567(); // L: 740
		int var9 = Rasterizer3D.method4566(); // L: 741
		int var10 = field2790[var1]; // L: 742
		int var11 = field2759[var1]; // L: 743
		int var12 = field2790[var2]; // L: 744
		int var13 = field2759[var2]; // L: 745
		int var14 = field2790[var3]; // L: 746
		int var15 = field2759[var3]; // L: 747
		int var16 = field2790[var4]; // L: 748
		int var17 = field2759[var4]; // L: 749
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 750

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 751
			int var20 = this.verticesX[var19]; // L: 752
			int var21 = this.verticesY[var19]; // L: 753
			int var22 = this.verticesZ[var19]; // L: 754
			int var23;
			if (var3 != 0) { // L: 755
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 756
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 757
				var20 = var23; // L: 758
			}

			if (var1 != 0) { // L: 760
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 761
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 762
				var21 = var23; // L: 763
			}

			if (var2 != 0) { // L: 765
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 766
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 767
				var20 = var23; // L: 768
			}

			var20 += var5; // L: 770
			var21 += var6; // L: 771
			var22 += var7; // L: 772
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 773
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 774
			field2768[var19] = var22 - var18; // L: 776
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method4528() / var22; // L: 777
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method4528() / var22; // L: 778
			field2767[var19] = SecureRandomFuture.method2200(var22); // L: 779
			if (this.field2747 > 0) { // L: 780
				field2734[var19] = var20; // L: 781
				field2758[var19] = var23; // L: 782
				field2783[var19] = var22; // L: 783
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 787
		} catch (Exception var25) { // L: 789
		}

	} // L: 790

	@ObfuscatedName("bd")
	public final void method4928(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 793
			this.method5003();
		}

		int var9 = Rasterizer3D.method4567(); // L: 794
		int var10 = Rasterizer3D.method4566(); // L: 795
		int var11 = field2790[var1]; // L: 796
		int var12 = field2759[var1]; // L: 797
		int var13 = field2790[var2]; // L: 798
		int var14 = field2759[var2]; // L: 799
		int var15 = field2790[var3]; // L: 800
		int var16 = field2759[var3]; // L: 801
		int var17 = field2790[var4]; // L: 802
		int var18 = field2759[var4]; // L: 803
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 804

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 805
			int var21 = this.verticesX[var20]; // L: 806
			int var22 = this.verticesY[var20]; // L: 807
			int var23 = this.verticesZ[var20]; // L: 808
			int var24;
			if (var3 != 0) { // L: 809
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 810
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 811
				var21 = var24; // L: 812
			}

			if (var1 != 0) { // L: 814
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 815
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 816
				var22 = var24; // L: 817
			}

			if (var2 != 0) { // L: 819
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 820
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 821
				var21 = var24; // L: 822
			}

			var21 += var5; // L: 824
			var22 += var6; // L: 825
			var23 += var7; // L: 826
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 827
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 828
			field2768[var20] = var23 - var19; // L: 830
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method4528() / var8; // L: 831
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method4528() / var8; // L: 832
			field2767[var20] = SecureRandomFuture.method2200(var8); // L: 833
			if (this.field2747 > 0) { // L: 834
				field2734[var20] = var21; // L: 835
				field2758[var20] = var24; // L: 836
				field2783[var20] = var23; // L: 837
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 841
		} catch (Exception var26) { // L: 843
		}

	} // L: 844

	@ObfuscatedName("be")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 961
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 962
				field2773[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 963

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 964
				if (this.faceColors3[var7] != -2) { // L: 965
					var8 = this.indices1[var7]; // L: 966
					var9 = this.indices2[var7]; // L: 967
					var10 = this.indices3[var7]; // L: 968
					var11 = modelViewportXs[var8]; // L: 969
					var12 = modelViewportXs[var9]; // L: 970
					var28 = modelViewportXs[var10]; // L: 971
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 972
						if (var2 && class133.method3059(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 998
							class160.method3338(var4); // L: 999
							var2 = false; // L: 1000
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1002
							field2733[var7] = false; // L: 1003
							var29 = Rasterizer3D.method4594(); // L: 1004
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1005
								field2785[var7] = false; // L: 1006
							} else {
								field2785[var7] = true;
							}

							var15 = (field2768[var8] + field2768[var9] + field2768[var10]) / 3 + this.radius; // L: 1007
							field2774[var15][field2773[var15]++] = var7; // L: 1008
						}
					} else {
						var29 = field2734[var8]; // L: 973
						var15 = field2734[var9]; // L: 974
						var16 = field2734[var10]; // L: 975
						int var30 = field2758[var8]; // L: 976
						var18 = field2758[var9]; // L: 977
						int var19 = field2758[var10]; // L: 978
						int var20 = field2783[var8]; // L: 979
						int var21 = field2783[var9]; // L: 980
						int var22 = field2783[var10]; // L: 981
						var29 -= var15; // L: 982
						var16 -= var15; // L: 983
						var30 -= var18; // L: 984
						var19 -= var18; // L: 985
						var20 -= var21; // L: 986
						var22 -= var21; // L: 987
						int var23 = var30 * var22 - var20 * var19; // L: 988
						int var24 = var20 * var16 - var29 * var22; // L: 989
						int var25 = var29 * var19 - var30 * var16; // L: 990
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 991
							field2733[var7] = true; // L: 992
							int var26 = (field2768[var8] + field2768[var9] + field2768[var10]) / 3 + this.radius; // L: 993
							field2774[var26][field2773[var26]++] = var7; // L: 994
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1012
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1013
					var32 = field2773[var31]; // L: 1014
					if (var32 > 0) { // L: 1015
						var27 = field2774[var31]; // L: 1016

						for (var10 = 0; var10 < var32; ++var10) { // L: 1017
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1022
					field2724[var31] = 0; // L: 1023
					field2779[var31] = 0; // L: 1024
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1026
					var32 = field2773[var31]; // L: 1027
					if (var32 > 0) { // L: 1028
						var27 = field2774[var31]; // L: 1029

						for (var10 = 0; var10 < var32; ++var10) { // L: 1030
							char var33 = var27[var10]; // L: 1031
							byte var34 = this.faceRenderPriorities[var33]; // L: 1032
							var28 = field2724[var34]++; // L: 1033
							field2776[var34][var28] = var33; // L: 1034
							if (var34 < 10) { // L: 1035
								int[] var35 = field2779;
								var35[var34] += var31;
							} else if (var34 == 10) { // L: 1036
								field2777[var28] = var31;
							} else {
								field2770[var28] = var31; // L: 1037
							}
						}
					}
				}

				var31 = 0; // L: 1041
				if (field2724[1] > 0 || field2724[2] > 0) { // L: 1042
					var31 = (field2779[1] + field2779[2]) / (field2724[1] + field2724[2]);
				}

				var8 = 0; // L: 1043
				if (field2724[3] > 0 || field2724[4] > 0) { // L: 1044
					var8 = (field2779[3] + field2779[4]) / (field2724[3] + field2724[4]);
				}

				var9 = 0; // L: 1045
				if (field2724[6] > 0 || field2724[8] > 0) { // L: 1046
					var9 = (field2779[8] + field2779[6]) / (field2724[8] + field2724[6]);
				}

				var11 = 0; // L: 1048
				var12 = field2724[10]; // L: 1049
				int[] var13 = field2776[10]; // L: 1050
				int[] var14 = field2777; // L: 1051
				if (var11 == var12) { // L: 1052
					var11 = 0; // L: 1053
					var12 = field2724[11]; // L: 1054
					var13 = field2776[11]; // L: 1055
					var14 = field2770; // L: 1056
				}

				if (var11 < var12) { // L: 1058
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1059
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1060
					while (var15 == 0 && var10 > var31) { // L: 1061
						this.drawFace(var13[var11++]); // L: 1062
						if (var11 == var12 && var13 != field2776[11]) { // L: 1063
							var11 = 0; // L: 1064
							var12 = field2724[11]; // L: 1065
							var13 = field2776[11]; // L: 1066
							var14 = field2770; // L: 1067
						}

						if (var11 < var12) { // L: 1069
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1070
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1072
						this.drawFace(var13[var11++]); // L: 1073
						if (var11 == var12 && var13 != field2776[11]) { // L: 1074
							var11 = 0; // L: 1075
							var12 = field2724[11]; // L: 1076
							var13 = field2776[11]; // L: 1077
							var14 = field2770; // L: 1078
						}

						if (var11 < var12) { // L: 1080
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1081
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1083
						this.drawFace(var13[var11++]); // L: 1084
						if (var11 == var12 && var13 != field2776[11]) { // L: 1085
							var11 = 0; // L: 1086
							var12 = field2724[11]; // L: 1087
							var13 = field2776[11]; // L: 1088
							var14 = field2770; // L: 1089
						}

						if (var11 < var12) { // L: 1091
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1092
						}
					}

					var16 = field2724[var15]; // L: 1094
					int[] var17 = field2776[var15]; // L: 1095

					for (var18 = 0; var18 < var16; ++var18) { // L: 1096
						this.drawFace(var17[var18]); // L: 1097
					}
				}

				while (var10 != -1000) { // L: 1100
					this.drawFace(var13[var11++]); // L: 1101
					if (var11 == var12 && var13 != field2776[11]) { // L: 1102
						var11 = 0; // L: 1103
						var13 = field2776[11]; // L: 1104
						var12 = field2724[11]; // L: 1105
						var14 = field2770; // L: 1106
					}

					if (var11 < var12) { // L: 1108
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1109
					}
				}

			}
		}
	} // L: 1020 1111

	@ObfuscatedName("bv")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2733[var1]) { // L: 1114
			this.method4934(var1); // L: 1115
		} else {
			int var2 = this.indices1[var1]; // L: 1118
			int var3 = this.indices2[var1]; // L: 1119
			int var4 = this.indices3[var1]; // L: 1120
			Rasterizer3D.field2550.field2838 = field2785[var1]; // L: 1121
			if (this.faceAlphas == null) { // L: 1122
				Rasterizer3D.field2550.field2832 = 0; // L: 1123
			} else {
				Rasterizer3D.field2550.field2832 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1126
			}

			this.method5017(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2767[var2], field2767[var3], field2767[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1128
		}
	} // L: 1116 1129

	@ObfuscatedName("ba")
	boolean method4932(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2801; // L: 1132
	}

	@ObfuscatedName("bz")
	final void method5017(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1136
			int var15;
			int var16;
			int var18;
			if (this.field2744 != null && this.field2744[var1] != -1) { // L: 1155
				int var17 = this.field2744[var1] & 255; // L: 1156
				var18 = this.field2748[var17]; // L: 1157
				var15 = this.field2742[var17]; // L: 1158
				var16 = this.field2750[var17]; // L: 1159
			} else {
				var18 = this.indices1[var1]; // L: 1162
				var15 = this.indices2[var1]; // L: 1163
				var16 = this.indices3[var1]; // L: 1164
			}

			if (this.faceColors3[var1] == -1) { // L: 1166
				Rasterizer3D.method4538(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2734[var18], field2734[var15], field2734[var16], field2758[var18], field2758[var15], field2758[var16], field2783[var18], field2783[var15], field2783[var16], this.faceTextures[var1]); // L: 1167
			} else {
				Rasterizer3D.method4538(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2734[var18], field2734[var15], field2734[var16], field2758[var18], field2758[var15], field2758[var16], field2783[var18], field2783[var15], field2783[var16], this.faceTextures[var1]); // L: 1170
			}
		} else {
			boolean var14 = this.method4932(var1); // L: 1137
			if (this.faceColors3[var1] == -1 && var14) { // L: 1138
				Rasterizer3D.method4523(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2778[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1139
			} else if (this.faceColors3[var1] == -1) { // L: 1141
				Rasterizer3D.method4565(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2778[this.faceColors1[var1]]); // L: 1142
			} else if (var14) { // L: 1144
				Rasterizer3D.method4557(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1145
			} else {
				Rasterizer3D.method4536(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1148
			}
		}

	} // L: 1173

	@ObfuscatedName("bb")
	final void method4934(int var1) {
		int var2 = Rasterizer3D.method4567(); // L: 1176
		int var3 = Rasterizer3D.method4566(); // L: 1177
		int var4 = 0; // L: 1178
		int var5 = this.indices1[var1]; // L: 1179
		int var6 = this.indices2[var1]; // L: 1180
		int var7 = this.indices3[var1]; // L: 1181
		int var8 = field2783[var5]; // L: 1182
		int var9 = field2783[var6]; // L: 1183
		int var10 = field2783[var7]; // L: 1184
		if (this.faceAlphas == null) { // L: 1185
			Rasterizer3D.field2550.field2832 = 0;
		} else {
			Rasterizer3D.field2550.field2832 = this.faceAlphas[var1] & 255; // L: 1186
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1187
			field2780[var4] = modelViewportXs[var5]; // L: 1188
			field2739[var4] = modelViewportYs[var5]; // L: 1189
			field2764[var4] = field2767[var7]; // L: 1190
			field2782[var4++] = this.faceColors1[var1]; // L: 1191
		} else {
			var11 = field2734[var5]; // L: 1194
			var12 = field2758[var5]; // L: 1195
			var13 = this.faceColors1[var1]; // L: 1196
			if (var10 >= 50) { // L: 1197
				var14 = field2763[var10 - var8] * (50 - var8); // L: 1198
				field2780[var4] = var2 + (var11 + ((field2734[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1199
				field2739[var4] = var3 + (var12 + ((field2758[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1200
				field2764[var4] = field2796; // L: 1201
				field2782[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1202
			}

			if (var9 >= 50) { // L: 1204
				var14 = field2763[var9 - var8] * (50 - var8); // L: 1205
				field2780[var4] = var2 + (var11 + ((field2734[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1206
				field2739[var4] = var3 + (var12 + ((field2758[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1207
				field2764[var4] = field2796; // L: 1208
				field2782[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1209
			}
		}

		if (var9 >= 50) { // L: 1212
			field2780[var4] = modelViewportXs[var6]; // L: 1213
			field2739[var4] = modelViewportYs[var6]; // L: 1214
			field2764[var4] = field2767[var7]; // L: 1215
			field2782[var4++] = this.faceColors2[var1]; // L: 1216
		} else {
			var11 = field2734[var6]; // L: 1219
			var12 = field2758[var6]; // L: 1220
			var13 = this.faceColors2[var1]; // L: 1221
			if (var8 >= 50) { // L: 1222
				var14 = field2763[var8 - var9] * (50 - var9); // L: 1223
				field2780[var4] = var2 + (var11 + ((field2734[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1224
				field2739[var4] = var3 + (var12 + ((field2758[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1225
				field2764[var4] = field2796; // L: 1226
				field2782[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1227
			}

			if (var10 >= 50) { // L: 1229
				var14 = field2763[var10 - var9] * (50 - var9); // L: 1230
				field2780[var4] = var2 + (var11 + ((field2734[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1231
				field2739[var4] = var3 + (var12 + ((field2758[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1232
				field2782[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1233
			}
		}

		if (var10 >= 50) { // L: 1236
			field2780[var4] = modelViewportXs[var7]; // L: 1237
			field2739[var4] = modelViewportYs[var7]; // L: 1238
			field2764[var4] = field2767[var7]; // L: 1239
			field2782[var4++] = this.faceColors3[var1]; // L: 1240
		} else {
			var11 = field2734[var7]; // L: 1243
			var12 = field2758[var7]; // L: 1244
			var13 = this.faceColors3[var1]; // L: 1245
			if (var9 >= 50) { // L: 1246
				var14 = field2763[var9 - var10] * (50 - var10); // L: 1247
				field2780[var4] = var2 + (var11 + ((field2734[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1248
				field2739[var4] = var3 + (var12 + ((field2758[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1249
				field2764[var4] = field2796; // L: 1250
				field2782[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1251
			}

			if (var8 >= 50) { // L: 1253
				var14 = field2763[var8 - var10] * (50 - var10); // L: 1254
				field2780[var4] = var2 + (var11 + ((field2734[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1255
				field2739[var4] = var3 + (var12 + ((field2758[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4528() / 50; // L: 1256
				field2764[var4] = field2796; // L: 1257
				field2782[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1258
			}
		}

		var11 = field2780[0]; // L: 1261
		var12 = field2780[1]; // L: 1262
		var13 = field2780[2]; // L: 1263
		var14 = field2739[0]; // L: 1264
		int var15 = field2739[1]; // L: 1265
		int var16 = field2739[2]; // L: 1266
		float var17 = field2764[0]; // L: 1267
		float var18 = field2764[1]; // L: 1268
		float var19 = field2764[2]; // L: 1269
		Rasterizer3D.field2550.field2838 = false; // L: 1270
		int var20 = Rasterizer3D.method4594(); // L: 1271
		if (var4 == 3) { // L: 1272
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1273
				Rasterizer3D.field2550.field2838 = true;
			}

			this.method5017(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2782[0], field2782[1], field2782[2]); // L: 1274
		}

		if (var4 == 4) { // L: 1276
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2780[3] < 0 || field2780[3] > var20) { // L: 1277
				Rasterizer3D.field2550.field2838 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1278
				int var23;
				int var25;
				if (this.field2744 != null && this.field2744[var1] != -1) { // L: 1303
					int var24 = this.field2744[var1] & 255; // L: 1304
					var25 = this.field2748[var24]; // L: 1305
					var22 = this.field2742[var24]; // L: 1306
					var23 = this.field2750[var24]; // L: 1307
				} else {
					var25 = var5; // L: 1310
					var22 = var6; // L: 1311
					var23 = var7; // L: 1312
				}

				short var26 = this.faceTextures[var1]; // L: 1314
				if (this.faceColors3[var1] == -1) { // L: 1315
					Rasterizer3D.method4538(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2734[var25], field2734[var22], field2734[var23], field2758[var25], field2758[var22], field2758[var23], field2783[var25], field2783[var22], field2783[var23], var26); // L: 1316
					Rasterizer3D.method4538(var14, var16, field2739[3], var11, var13, field2780[3], var17, var19, field2764[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2734[var25], field2734[var22], field2734[var23], field2758[var25], field2758[var22], field2758[var23], field2783[var25], field2783[var22], field2783[var23], var26); // L: 1317
				} else {
					Rasterizer3D.method4538(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2782[0], field2782[1], field2782[2], field2734[var25], field2734[var22], field2734[var23], field2758[var25], field2758[var22], field2758[var23], field2783[var25], field2783[var22], field2783[var23], var26); // L: 1320
					Rasterizer3D.method4538(var14, var16, field2739[3], var11, var13, field2780[3], var17, var19, field2764[3], field2782[0], field2782[2], field2782[3], field2734[var25], field2734[var22], field2734[var23], field2758[var25], field2758[var22], field2758[var23], field2783[var25], field2783[var22], field2783[var23], var26); // L: 1321
				}
			} else {
				boolean var21 = this.method4932(var1); // L: 1279
				if (this.faceColors3[var1] == -1 && var21) { // L: 1280
					var22 = field2778[this.faceColors1[var1]]; // L: 1281
					Rasterizer3D.method4523(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1282
					Rasterizer3D.method4523(var14, var16, field2739[3], var11, var13, field2780[3], var17, var19, field2764[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1283
				} else if (this.faceColors3[var1] == -1) { // L: 1285
					var22 = field2778[this.faceColors1[var1]]; // L: 1286
					Rasterizer3D.method4565(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1287
					Rasterizer3D.method4565(var14, var16, field2739[3], var11, var13, field2780[3], var17, var19, field2764[3], var22); // L: 1288
				} else if (var21) { // L: 1290
					Rasterizer3D.method4557(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2782[0], field2782[1], field2782[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1291
					Rasterizer3D.method4557(var14, var16, field2739[3], var11, var13, field2780[3], 0.0F, 0.0F, 0.0F, field2782[0], field2782[2], field2782[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1292
				} else {
					Rasterizer3D.method4536(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2782[0], field2782[1], field2782[2]); // L: 1295
					Rasterizer3D.method4536(var14, var16, field2739[3], var11, var13, field2780[3], var17, var19, field2764[3], field2782[0], field2782[2], field2782[3]); // L: 1296
				}
			}
		}

	} // L: 1325

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILrb;)V"
	)
	void method4935(int var1, class465 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1328
		float var4 = (float)(-this.verticesY[var1]); // L: 1329
		float var5 = (float)(-this.verticesZ[var1]); // L: 1330
		float var6 = 1.0F; // L: 1331
		this.verticesX[var1] = (int)(var2.field4785[0] * var3 + var2.field4785[4] * var4 + var2.field4785[8] * var5 + var2.field4785[12] * var6); // L: 1332
		this.verticesY[var1] = -((int)(var2.field4785[1] * var3 + var2.field4785[5] * var4 + var2.field4785[9] * var5 + var2.field4785[13] * var6)); // L: 1333
		this.verticesZ[var1] = -((int)(var2.field4785[2] * var3 + var2.field4785[6] * var4 + var2.field4785[10] * var5 + var2.field4785[14] * var6)); // L: 1334
	} // L: 1335

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V"
	)
	void method4936(class241 var1, int var2) {
		if (this.field2753 != null) { // L: 1338
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1339
				int[] var4 = this.field2753[var3]; // L: 1340
				if (var4 != null && var4.length != 0) { // L: 1341
					int[] var5 = this.field2754[var3]; // L: 1342
					field2728.method8355(); // L: 1343

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1344
						int var7 = var4[var6]; // L: 1345
						class129 var8 = var1.method4611(var7); // L: 1346
						if (var8 != null) { // L: 1347
							field2729.method8357((float)var5[var6] / 255.0F); // L: 1348
							field2730.method8356(var8.method2963(var2)); // L: 1349
							field2730.method8359(field2729); // L: 1350
							field2728.method8381(field2730); // L: 1351
						}
					}

					this.method4935(var3, field2728); // L: 1353
				}
			}

		}
	} // L: 1355

	@ObfuscatedName("du")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 847
			this.calculateBoundsCylinder();
		}

		this.method5001(var1); // L: 848
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 849
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 850
		int var13 = var3 * this.xzRadius >> 16; // L: 851
		int var14 = var12 + var13; // L: 852
		if (var14 > 50 && var12 < 3500) { // L: 853
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 854
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method4528(); // L: 855
			if (var16 / var14 < Rasterizer3D.method4525()) { // L: 856
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method4528(); // L: 857
				if (var17 / var14 > Rasterizer3D.method4524()) { // L: 858
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 859
					int var19 = var2 * this.xzRadius >> 16; // L: 860
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 861
					int var21 = (var18 + var20) * Rasterizer3D.method4528(); // L: 862
					if (var21 / var14 > Rasterizer3D.method4527()) { // L: 863
						int var22 = (var3 * super.height >> 16) + var19; // L: 864
						int var23 = (var18 - var22) * Rasterizer3D.method4528(); // L: 865
						if (var23 / var14 < Rasterizer3D.method4526()) { // L: 866
							int var24 = var13 + (var2 * super.height >> 16); // L: 867
							boolean var25 = false; // L: 868
							boolean var26 = false; // L: 869
							if (var12 - var24 <= 50) { // L: 870
								var26 = true;
							}

							boolean var27 = var26 || this.field2747 > 0; // L: 871
							int var28 = class64.method1199(); // L: 872
							int var29 = WorldMapLabelSize.method5220(); // L: 873
							boolean var30 = GrandExchangeOfferTotalQuantityComparator.method7050(); // L: 874
							boolean var31 = class372.method6898(var9); // L: 875
							boolean var32 = false; // L: 876
							int var34;
							int var35;
							int var36;
							if (var31 && var30) { // L: 877
								boolean var33 = false; // L: 878
								if (field2787) { // L: 879
									var33 = class11.method111(this, var1, var6, var7, var8); // L: 880
								} else {
									var34 = var12 - var13; // L: 883
									if (var34 <= 50) { // L: 884
										var34 = 50;
									}

									if (var15 > 0) { // L: 885
										var16 /= var14; // L: 886
										var17 /= var34; // L: 887
									} else {
										var17 /= var14; // L: 890
										var16 /= var34; // L: 891
									}

									if (var18 > 0) { // L: 893
										var23 /= var14; // L: 894
										var21 /= var34; // L: 895
									} else {
										var21 /= var14; // L: 898
										var23 /= var34; // L: 899
									}

									var35 = var28 - Rasterizer3D.method4567(); // L: 901
									var36 = var29 - Rasterizer3D.method4566(); // L: 902
									if (var35 > var16 && var35 < var17 && var36 > var23 && var36 < var21) { // L: 903
										var33 = true; // L: 904
									}
								}

								if (var33) { // L: 907
									if (this.isSingleTile) { // L: 908
										class160.method3338(var9);
									} else {
										var32 = true; // L: 909
									}
								}
							}

							int var44 = Rasterizer3D.method4567(); // L: 912
							var34 = Rasterizer3D.method4566(); // L: 913
							var35 = 0; // L: 914
							var36 = 0; // L: 915
							if (var1 != 0) { // L: 916
								var35 = field2790[var1]; // L: 917
								var36 = field2759[var1]; // L: 918
							}

							for (int var37 = 0; var37 < this.verticesCount; ++var37) { // L: 920
								int var38 = this.verticesX[var37]; // L: 921
								int var39 = this.verticesY[var37]; // L: 922
								int var40 = this.verticesZ[var37]; // L: 923
								int var41;
								if (var1 != 0) { // L: 924
									var41 = var40 * var35 + var38 * var36 >> 16; // L: 925
									var40 = var40 * var36 - var38 * var35 >> 16; // L: 926
									var38 = var41; // L: 927
								}

								var38 += var6; // L: 929
								var39 += var7; // L: 930
								var40 += var8; // L: 931
								var41 = var40 * var4 + var5 * var38 >> 16; // L: 932
								var40 = var5 * var40 - var38 * var4 >> 16; // L: 933
								var38 = var41; // L: 934
								var41 = var3 * var39 - var40 * var2 >> 16; // L: 935
								var40 = var39 * var2 + var3 * var40 >> 16; // L: 936
								field2768[var37] = var40 - var12; // L: 938
								if (var40 >= 50) { // L: 939
									modelViewportXs[var37] = var44 + var38 * Rasterizer3D.method4528() / var40; // L: 940
									modelViewportYs[var37] = var34 + var41 * Rasterizer3D.method4528() / var40; // L: 941
									field2767[var37] = SecureRandomFuture.method2200(var40); // L: 942
								} else {
									modelViewportXs[var37] = -5000; // L: 945
									var25 = true; // L: 946
								}

								if (var27) { // L: 948
									field2734[var37] = var38; // L: 949
									field2758[var37] = var41; // L: 950
									field2783[var37] = var40; // L: 951
								}
							}

							try {
								this.draw0(var25, var32, this.isSingleTile, var9); // L: 955
							} catch (Exception var43) { // L: 957
							}

						}
					}
				}
			}
		}
	} // L: 958
}
