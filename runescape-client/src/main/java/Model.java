import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("aj")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("aw")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	static class450 field2697;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	static class450 field2724;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	static class450 field2736;
	@ObfuscatedName("bh")
	static boolean[] field2698;
	@ObfuscatedName("be")
	static boolean[] field2733;
	@ObfuscatedName("bp")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("br")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bo")
	static float[] field2743;
	@ObfuscatedName("bk")
	static int[] field2710;
	@ObfuscatedName("bx")
	static int[] field2738;
	@ObfuscatedName("bz")
	static int[] field2719;
	@ObfuscatedName("bv")
	static int[] field2740;
	@ObfuscatedName("bg")
	static char[] field2742;
	@ObfuscatedName("bs")
	static char[][] field2715;
	@ObfuscatedName("bd")
	static int[] field2744;
	@ObfuscatedName("ch")
	static int[][] field2704;
	@ObfuscatedName("cg")
	static int[] field2746;
	@ObfuscatedName("ci")
	static int[] field2747;
	@ObfuscatedName("cf")
	static int[] field2748;
	@ObfuscatedName("cx")
	static int[] field2750;
	@ObfuscatedName("cm")
	static int[] field2749;
	@ObfuscatedName("co")
	static int[] field2751;
	@ObfuscatedName("cc")
	static float[] field2752;
	@ObfuscatedName("cl")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cd")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cw")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cv")
	static boolean field2756;
	@ObfuscatedName("cn")
	static int[] field2759;
	@ObfuscatedName("ca")
	static int[] field2760;
	@ObfuscatedName("ce")
	static int[] field2761;
	@ObfuscatedName("cy")
	static int[] field2762;
	@ObfuscatedName("ck")
	static final float field2765;
	@ObfuscatedName("an")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("au")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("az")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ab")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ao")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("as")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("am")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ag")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("aa")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ar")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ad")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("at")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("af")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ae")
	byte[] field2766;
	@ObfuscatedName("al")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("aq")
	public byte field2725;
	@ObfuscatedName("ah")
	public int field2716;
	@ObfuscatedName("ak")
	int[] field2717;
	@ObfuscatedName("ax")
	int[] field2718;
	@ObfuscatedName("bm")
	int[] field2720;
	@ObfuscatedName("bt")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("by")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bc")
	int[][] field2722;
	@ObfuscatedName("bw")
	int[][] field2696;
	@ObfuscatedName("bq")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bn")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bb")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bi")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bj")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bf")
	@Export("radius")
	int radius;
	@ObfuscatedName("ba")
	HashMap field2730;
	@ObfuscatedName("cr")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cq")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cb")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cz")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ct")
	public short field2699;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2697 = new class450(); // L: 17
		field2724 = new class450(); // L: 18
		field2736 = new class450(); // L: 19
		field2698 = new boolean[6500]; // L: 55
		field2733 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2743 = new float[6500]; // L: 59
		field2710 = new int[6500]; // L: 60
		field2738 = new int[6500]; // L: 61
		field2719 = new int[6500]; // L: 62
		field2740 = new int[6500]; // L: 63
		field2742 = new char[6000]; // L: 65
		field2715 = new char[6000][512]; // L: 66
		field2744 = new int[12]; // L: 67
		field2704 = new int[12][2000]; // L: 68
		field2746 = new int[2000]; // L: 69
		field2747 = new int[2000]; // L: 70
		field2748 = new int[12]; // L: 71
		field2749 = new int[10]; // L: 72
		field2750 = new int[10]; // L: 73
		field2751 = new int[10]; // L: 74
		field2752 = new float[10]; // L: 75
		field2756 = true; // L: 79
		field2759 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field2760 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2761 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2762 = Rasterizer3D.field2524; // L: 85
		field2765 = UserComparator3.method2958(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2725 = 0;
		this.field2716 = 0;
		this.isSingleTile = false;
		this.field2730 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2725 = 0;
		this.field2716 = 0;
		this.isSingleTile = false;
		this.field2730 = new HashMap();
		this.method4860(var1, var2, var3); // L: 121
		this.field2725 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2716 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Ljr;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2725 = 0; // L: 35
		this.field2716 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2730 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2716 = 0; // L: 100
		this.field2725 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2716 += var4.field2716; // L: 107
				if (this.field2725 == -1) { // L: 108
					this.field2725 = var4.field2725;
				}
			}
		}

		this.method4860(this.verticesCount, this.indicesCount, this.field2716); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2716 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method4934(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("ai")
	void method4860(int var1, int var2, int var3) {
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
			this.field2717 = new int[var3]; // L: 139
			this.field2718 = new int[var3]; // L: 140
			this.field2720 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljr;)V"
	)
	void method4950(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2725 != var1.field2725)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2725); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2766 == null && var1.field2766 != null) { // L: 159
			this.field2766 = new byte[var2]; // L: 160
			Arrays.fill(this.field2766, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljr;)V"
	)
	public void method4934(Model var1) {
		if (var1 != null) { // L: 166
			this.method4950(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2725; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2766 != null) { // L: 186
					if (var1.field2766 != null && var1.field2766[var2] != -1) { // L: 187
						this.field2766[this.indicesCount] = (byte)(var1.field2766[var2] + this.field2716); // L: 188
					} else {
						this.field2766[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2716; ++var2) { // L: 196
				this.field2717[this.field2716] = this.verticesCount + var1.field2717[var2]; // L: 197
				this.field2718[this.field2716] = this.verticesCount + var1.field2718[var2]; // L: 198
				this.field2720[this.field2716] = this.verticesCount + var1.field2720[var2]; // L: 199
				++this.field2716; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljr;"
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
					var11.field2716 = this.field2716; // L: 227
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
					var11.field2766 = this.field2766; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2725 = this.field2725; // L: 240
					var11.field2717 = this.field2717; // L: 241
					var11.field2718 = this.field2718; // L: 242
					var11.field2720 = this.field2720; // L: 243
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljr;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljr;"
	)
	public Model method4919(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZLjr;[B)Ljr;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2716 = this.field2716; // L: 300
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
		var2.field2766 = this.field2766; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2725 = this.field2725; // L: 330
		var2.field2717 = this.field2717; // L: 331
		var2.field2718 = this.field2718; // L: 332
		var2.field2720 = this.field2720; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2722 = this.field2722; // L: 336
		var2.field2696 = this.field2696; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("ab")
	void method4857(int var1) {
		if (!this.field2730.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field2760[var1]; // L: 352
			int var9 = field2759[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var12 = this.verticesX[var10]; // L: 356
				int var13 = this.verticesZ[var10]; // L: 357
				int var11 = var9 * var13 + var12 * var8 >> 16; // L: 359
				int var15 = this.verticesY[var10]; // L: 362
				int var16 = class144.method3217(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 363
				if (var11 < var2) { // L: 364
					var2 = var11;
				}

				if (var11 > var5) { // L: 365
					var5 = var11;
				}

				if (var15 < var3) { // L: 366
					var3 = var15;
				}

				if (var15 > var6) { // L: 367
					var6 = var15;
				}

				if (var16 < var4) { // L: 368
					var4 = var16;
				}

				if (var16 > var7) { // L: 369
					var7 = var16;
				}
			}

			class231 var17 = new class231((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 371
			boolean var18 = true; // L: 372
			if (var17.field2624 < 32) { // L: 373
				var17.field2624 = 32;
			}

			if (var17.field2626 < 32) { // L: 374
				var17.field2626 = 32;
			}

			if (this.isSingleTile) { // L: 375
				boolean var19 = true; // L: 376
				var17.field2624 += 8; // L: 377
				var17.field2626 += 8; // L: 378
			}

			this.field2730.put(var1, var17); // L: 380
		}
	} // L: 381

	@ObfuscatedName("ao")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 384
			this.boundsType = 1; // L: 385
			super.height = 0; // L: 386
			this.bottomY = 0; // L: 387
			this.xzRadius = 0; // L: 388

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 389
				int var2 = this.verticesX[var1]; // L: 390
				int var3 = this.verticesY[var1]; // L: 391
				int var4 = this.verticesZ[var1]; // L: 392
				if (-var3 > super.height) { // L: 393
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 394
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 395
				if (var5 > this.xzRadius) { // L: 396
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 398
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 399
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 400
		}
	} // L: 401

	@ObfuscatedName("as")
	void method4859() {
		if (this.boundsType != 2) { // L: 404
			this.boundsType = 2; // L: 405
			this.xzRadius = 0; // L: 406

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 407
				int var2 = this.verticesX[var1]; // L: 408
				int var3 = this.verticesY[var1]; // L: 409
				int var4 = this.verticesZ[var1]; // L: 410
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 411
				if (var5 > this.xzRadius) { // L: 412
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 414
			this.radius = this.xzRadius; // L: 415
			this.diameter = this.xzRadius + this.xzRadius; // L: 416
		}
	} // L: 417

	@ObfuscatedName("am")
	public int method4851() {
		this.calculateBoundsCylinder(); // L: 420
		return this.xzRadius; // L: 421
	}

	@ObfuscatedName("ag")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 425
		this.field2730.clear(); // L: 426
	} // L: 427

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 430
			if (var2 != -1) { // L: 431
				Animation var3 = var1.frames[var2]; // L: 432
				Skeleton var4 = var3.skeleton; // L: 433
				Model_transformTempX = 0; // L: 434
				Model_transformTempY = 0; // L: 435
				Model_transformTempZ = 0; // L: 436

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 437
					int var6 = var3.transformSkeletonLabels[var5]; // L: 438
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 439
				}

				this.resetBounds(); // L: 441
			}
		}
	} // L: 442

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfw;I)V"
	)
	public void method4901(class138 var1, int var2) {
		Skeleton var3 = var1.field1602; // L: 445
		class227 var4 = var3.method4608(); // L: 446
		if (var4 != null) { // L: 447
			var3.method4608().method4569(var1, var2); // L: 448
			this.method4865(var3.method4608(), var1.method3140()); // L: 449
		}

		if (var1.method3141()) { // L: 451
			this.method4864(var1, var2); // L: 452
		}

		this.resetBounds(); // L: 454
	} // L: 455

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfw;I)V"
	)
	void method4864(class138 var1, int var2) {
		Skeleton var3 = var1.field1602; // L: 458

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 459
			int var5 = var3.transformTypes[var4]; // L: 460
			if (var5 == 5 && var1.field1603 != null && var1.field1603[var4] != null && var1.field1603[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 461 462
				class130 var6 = var1.field1603[var4][0]; // L: 463
				int[] var7 = var3.labels[var4]; // L: 464
				int var8 = var7.length; // L: 465

				for (int var9 = 0; var9 < var8; ++var9) { // L: 466
					int var10 = var7[var9]; // L: 467
					if (var10 < this.faceLabelsAlpha.length) { // L: 468
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 469

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 470
							int var13 = var11[var12]; // L: 471
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3060(var2) * 255.0F); // L: 472
							if (var14 < 0) { // L: 473
								var14 = 0;
							} else if (var14 > 255) { // L: 474
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 475
						}
					}
				}
			}
		}

	} // L: 482

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lie;I)V"
	)
	void method4865(class227 var1, int var2) {
		this.method4945(var1, var2); // L: 486
	} // L: 488

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljz;ILjz;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 491
			if (var5 != null && var4 != -1) { // L: 492
				Animation var6 = var1.frames[var2]; // L: 496
				Animation var7 = var3.frames[var4]; // L: 497
				Skeleton var8 = var6.skeleton; // L: 498
				Model_transformTempX = 0; // L: 499
				Model_transformTempY = 0; // L: 500
				Model_transformTempZ = 0; // L: 501
				byte var9 = 0; // L: 502
				int var13 = var9 + 1; // L: 503
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 504
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 505 506
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 507
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 509
				Model_transformTempY = 0; // L: 510
				Model_transformTempZ = 0; // L: 511
				var9 = 0; // L: 512
				var13 = var9 + 1; // L: 513
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 514
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 515 516
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 517
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 519
			} else {
				this.animate(var1, var2); // L: 493
			}
		}
	} // L: 494 520

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lij;Lfw;I[ZZZ)V"
	)
	public void method4985(Skeleton var1, class138 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class227 var7 = var1.method4608(); // L: 523
		if (var7 != null) { // L: 524
			var7.method4570(var2, var3, var4, var5); // L: 525
			if (var6) { // L: 526
				this.method4865(var7, var2.method3140()); // L: 527
			}
		}

		if (!var5 && var2.method3141()) { // L: 530
			this.method4864(var2, var3); // L: 531
		}

	} // L: 533

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I[IZ)V"
	)
	public void method4868(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 536
			this.animate(var1, var2); // L: 537
		} else {
			Animation var5 = var1.frames[var2]; // L: 540
			Skeleton var6 = var5.skeleton; // L: 541
			byte var7 = 0; // L: 542
			int var11 = var7 + 1; // L: 543
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 544
			Model_transformTempY = 0; // L: 545
			Model_transformTempZ = 0; // L: 546

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 547
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 548 549
				}

				if (var4) { // L: 550
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 551
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 554
				}
			}

		}
	} // L: 538 557

	@ObfuscatedName("aq")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 560
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 561
			var7 = 0; // L: 562
			Model_transformTempX = 0; // L: 563
			Model_transformTempY = 0; // L: 564
			Model_transformTempZ = 0; // L: 565

			for (var8 = 0; var8 < var6; ++var8) { // L: 566
				int var18 = var2[var8]; // L: 567
				if (var18 < this.vertexLabels.length) { // L: 568
					int[] var19 = this.vertexLabels[var18]; // L: 569

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 570
						var12 = var19[var11]; // L: 571
						Model_transformTempX += this.verticesX[var12]; // L: 572
						Model_transformTempY += this.verticesY[var12]; // L: 573
						Model_transformTempZ += this.verticesZ[var12]; // L: 574
						++var7; // L: 575
					}
				}
			}

			if (var7 > 0) { // L: 579
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 580
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 581
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 582
			} else {
				Model_transformTempX = var3; // L: 585
				Model_transformTempY = var4; // L: 586
				Model_transformTempZ = var5; // L: 587
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 591
				for (var7 = 0; var7 < var6; ++var7) { // L: 592
					var8 = var2[var7]; // L: 593
					if (var8 < this.vertexLabels.length) { // L: 594
						var9 = this.vertexLabels[var8]; // L: 595

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 596
							var11 = var9[var10]; // L: 597
							var10000 = this.verticesX; // L: 598
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 599
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 600
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 606
				for (var7 = 0; var7 < var6; ++var7) { // L: 607
					var8 = var2[var7]; // L: 608
					if (var8 < this.vertexLabels.length) { // L: 609
						var9 = this.vertexLabels[var8]; // L: 610

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 611
							var11 = var9[var10]; // L: 612
							var10000 = this.verticesX; // L: 613
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 614
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 615
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 616
							int var13 = (var4 & 255) * 8; // L: 617
							int var14 = (var5 & 255) * 8; // L: 618
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 619
								var15 = field2759[var14]; // L: 620
								var16 = field2760[var14]; // L: 621
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 622
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 623
								this.verticesX[var11] = var17; // L: 624
							}

							if (var12 != 0) { // L: 626
								var15 = field2759[var12]; // L: 627
								var16 = field2760[var12]; // L: 628
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 629
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 630
								this.verticesY[var11] = var17; // L: 631
							}

							if (var13 != 0) { // L: 633
								var15 = field2759[var13]; // L: 634
								var16 = field2760[var13]; // L: 635
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 636
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 637
								this.verticesX[var11] = var17; // L: 638
							}

							var10000 = this.verticesX; // L: 640
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 641
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 642
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 648
				for (var7 = 0; var7 < var6; ++var7) { // L: 649
					var8 = var2[var7]; // L: 650
					if (var8 < this.vertexLabels.length) { // L: 651
						var9 = this.vertexLabels[var8]; // L: 652

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 653
							var11 = var9[var10]; // L: 654
							var10000 = this.verticesX; // L: 655
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 656
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 657
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 658
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 659
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 660
							var10000 = this.verticesX; // L: 661
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 662
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 663
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 669
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 670
					for (var7 = 0; var7 < var6; ++var7) { // L: 671
						var8 = var2[var7]; // L: 672
						if (var8 < this.faceLabelsAlpha.length) { // L: 673
							var9 = this.faceLabelsAlpha[var8]; // L: 674

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 675
								var11 = var9[var10]; // L: 676
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 677
								if (var12 < 0) { // L: 678
									var12 = 0;
								} else if (var12 > 255) { // L: 679
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 680
							}
						}
					}
				}

			}
		}
	} // L: 589 604 646 667 685 687

	@ObfuscatedName("ah")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 690
			int var2 = this.verticesX[var1]; // L: 691
			this.verticesX[var1] = this.verticesZ[var1]; // L: 692
			this.verticesZ[var1] = -var2; // L: 693
		}

		this.resetBounds(); // L: 695
	} // L: 696

	@ObfuscatedName("ak")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 699
			this.verticesX[var1] = -this.verticesX[var1]; // L: 700
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 701
		}

		this.resetBounds(); // L: 703
	} // L: 704

	@ObfuscatedName("ax")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 707
			int var2 = this.verticesZ[var1]; // L: 708
			this.verticesZ[var1] = this.verticesX[var1]; // L: 709
			this.verticesX[var1] = -var2; // L: 710
		}

		this.resetBounds(); // L: 712
	} // L: 713

	@ObfuscatedName("bm")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2759[var1]; // L: 716
		int var3 = field2760[var1]; // L: 717

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 718
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 719
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 720
			this.verticesY[var4] = var5; // L: 721
		}

		this.resetBounds(); // L: 723
	} // L: 724

	@ObfuscatedName("bt")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 727
			int[] var10000 = this.verticesX; // L: 728
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 729
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 730
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 732
	} // L: 733

	@ObfuscatedName("by")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 736
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 737
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 738
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 739
		}

		this.resetBounds(); // L: 741
	} // L: 742

	@ObfuscatedName("bc")
	public final void method4897(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 745
			this.method4859();
		}

		int var8 = Rasterizer3D.method4480(); // L: 746
		int var9 = Rasterizer3D.method4482(); // L: 747
		int var10 = field2759[var1]; // L: 748
		int var11 = field2760[var1]; // L: 749
		int var12 = field2759[var2]; // L: 750
		int var13 = field2760[var2]; // L: 751
		int var14 = field2759[var3]; // L: 752
		int var15 = field2760[var3]; // L: 753
		int var16 = field2759[var4]; // L: 754
		int var17 = field2760[var4]; // L: 755
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 756

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 757
			int var20 = this.verticesX[var19]; // L: 758
			int var21 = this.verticesY[var19]; // L: 759
			int var22 = this.verticesZ[var19]; // L: 760
			int var23;
			if (var3 != 0) { // L: 761
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 762
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 763
				var20 = var23; // L: 764
			}

			if (var1 != 0) { // L: 766
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 767
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 768
				var21 = var23; // L: 769
			}

			if (var2 != 0) { // L: 771
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 772
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 773
				var20 = var23; // L: 774
			}

			var20 += var5; // L: 776
			var21 += var6; // L: 777
			var22 += var7; // L: 778
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 779
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 780
			field2710[var19] = var22 - var18; // L: 782
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method4487() / var22; // L: 783
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method4487() / var22; // L: 784
			field2743[var19] = UserComparator3.method2958(var22); // L: 785
			if (this.field2716 > 0) { // L: 786
				field2738[var19] = var20; // L: 787
				field2719[var19] = var23; // L: 788
				field2740[var19] = var22; // L: 789
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 793
		} catch (Exception var25) { // L: 795
		}

	} // L: 796

	@ObfuscatedName("bw")
	public final void method4866(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 799
			this.method4859();
		}

		int var9 = Rasterizer3D.method4480(); // L: 800
		int var10 = Rasterizer3D.method4482(); // L: 801
		int var11 = field2759[var1]; // L: 802
		int var12 = field2760[var1]; // L: 803
		int var13 = field2759[var2]; // L: 804
		int var14 = field2760[var2]; // L: 805
		int var15 = field2759[var3]; // L: 806
		int var16 = field2760[var3]; // L: 807
		int var17 = field2759[var4]; // L: 808
		int var18 = field2760[var4]; // L: 809
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 810

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 811
			int var21 = this.verticesX[var20]; // L: 812
			int var22 = this.verticesY[var20]; // L: 813
			int var23 = this.verticesZ[var20]; // L: 814
			int var24;
			if (var3 != 0) { // L: 815
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 816
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 817
				var21 = var24; // L: 818
			}

			if (var1 != 0) { // L: 820
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 821
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 822
				var22 = var24; // L: 823
			}

			if (var2 != 0) { // L: 825
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 826
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 827
				var21 = var24; // L: 828
			}

			var21 += var5; // L: 830
			var22 += var6; // L: 831
			var23 += var7; // L: 832
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 833
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 834
			field2710[var20] = var23 - var19; // L: 836
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method4487() / var8; // L: 837
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method4487() / var8; // L: 838
			field2743[var20] = UserComparator3.method2958(var8); // L: 839
			if (this.field2716 > 0) { // L: 840
				field2738[var20] = var21; // L: 841
				field2719[var20] = var24; // L: 842
				field2740[var20] = var23; // L: 843
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 847
		} catch (Exception var26) { // L: 849
		}

	} // L: 850

	@ObfuscatedName("bq")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1074
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1075
				field2742[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1076

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1077
				if (this.faceColors3[var7] != -2) { // L: 1078
					var8 = this.indices1[var7]; // L: 1079
					var9 = this.indices2[var7]; // L: 1080
					var10 = this.indices3[var7]; // L: 1081
					var11 = modelViewportXs[var8]; // L: 1082
					var12 = modelViewportXs[var9]; // L: 1083
					var28 = modelViewportXs[var10]; // L: 1084
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1085
						if (var2) { // L: 1111
							var15 = modelViewportYs[var8]; // L: 1113
							var16 = modelViewportYs[var9]; // L: 1114
							var30 = modelViewportYs[var10]; // L: 1115
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 1117
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 1118
								var37 = false; // L: 1119
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1122
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 1123
									var37 = false; // L: 1124
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1127
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1128
										var37 = false; // L: 1129
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1132
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1133
											var37 = false; // L: 1134
										} else {
											var37 = true; // L: 1137
										}
									}
								}
							}

							if (var37) { // L: 1139
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1142
								var2 = false; // L: 1144
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1147
							field2733[var7] = false; // L: 1148
							var29 = Rasterizer3D.method4559(); // L: 1149
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1150
								field2698[var7] = false; // L: 1151
							} else {
								field2698[var7] = true;
							}

							var15 = (field2710[var8] + field2710[var9] + field2710[var10]) / 3 + this.radius; // L: 1152
							field2715[var15][field2742[var15]++] = var7; // L: 1153
						}
					} else {
						var29 = field2738[var8]; // L: 1086
						var15 = field2738[var9]; // L: 1087
						var16 = field2738[var10]; // L: 1088
						var30 = field2719[var8]; // L: 1089
						var18 = field2719[var9]; // L: 1090
						int var19 = field2719[var10]; // L: 1091
						int var20 = field2740[var8]; // L: 1092
						int var21 = field2740[var9]; // L: 1093
						int var22 = field2740[var10]; // L: 1094
						var29 -= var15; // L: 1095
						var16 -= var15; // L: 1096
						var30 -= var18; // L: 1097
						var19 -= var18; // L: 1098
						var20 -= var21; // L: 1099
						var22 -= var21; // L: 1100
						int var23 = var30 * var22 - var20 * var19; // L: 1101
						int var24 = var20 * var16 - var29 * var22; // L: 1102
						int var25 = var29 * var19 - var30 * var16; // L: 1103
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1104
							field2733[var7] = true; // L: 1105
							int var26 = (field2710[var8] + field2710[var9] + field2710[var10]) / 3 + this.radius; // L: 1106
							field2715[var26][field2742[var26]++] = var7; // L: 1107
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1157
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1158
					var34 = field2742[var33]; // L: 1159
					if (var34 > 0) { // L: 1160
						var27 = field2715[var33]; // L: 1161

						for (var10 = 0; var10 < var34; ++var10) { // L: 1162
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1167
					field2744[var33] = 0; // L: 1168
					field2748[var33] = 0; // L: 1169
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1171
					var34 = field2742[var33]; // L: 1172
					if (var34 > 0) { // L: 1173
						var27 = field2715[var33]; // L: 1174

						for (var10 = 0; var10 < var34; ++var10) { // L: 1175
							char var35 = var27[var10]; // L: 1176
							byte var36 = this.faceRenderPriorities[var35]; // L: 1177
							var28 = field2744[var36]++; // L: 1178
							field2704[var36][var28] = var35; // L: 1179
							if (var36 < 10) { // L: 1180
								int[] var38 = field2748;
								var38[var36] += var33;
							} else if (var36 == 10) { // L: 1181
								field2746[var28] = var33;
							} else {
								field2747[var28] = var33; // L: 1182
							}
						}
					}
				}

				var33 = 0; // L: 1186
				if (field2744[1] > 0 || field2744[2] > 0) { // L: 1187
					var33 = (field2748[1] + field2748[2]) / (field2744[1] + field2744[2]);
				}

				var8 = 0; // L: 1188
				if (field2744[3] > 0 || field2744[4] > 0) { // L: 1189
					var8 = (field2748[3] + field2748[4]) / (field2744[3] + field2744[4]);
				}

				var9 = 0; // L: 1190
				if (field2744[6] > 0 || field2744[8] > 0) { // L: 1191
					var9 = (field2748[8] + field2748[6]) / (field2744[8] + field2744[6]);
				}

				var11 = 0; // L: 1193
				var12 = field2744[10]; // L: 1194
				int[] var13 = field2704[10]; // L: 1195
				int[] var14 = field2746; // L: 1196
				if (var11 == var12) { // L: 1197
					var11 = 0; // L: 1198
					var12 = field2744[11]; // L: 1199
					var13 = field2704[11]; // L: 1200
					var14 = field2747; // L: 1201
				}

				if (var11 < var12) { // L: 1203
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1204
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1205
					while (var15 == 0 && var10 > var33) { // L: 1206
						this.drawFace(var13[var11++]); // L: 1207
						if (var11 == var12 && var13 != field2704[11]) { // L: 1208
							var11 = 0; // L: 1209
							var12 = field2744[11]; // L: 1210
							var13 = field2704[11]; // L: 1211
							var14 = field2747; // L: 1212
						}

						if (var11 < var12) { // L: 1214
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1215
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1217
						this.drawFace(var13[var11++]); // L: 1218
						if (var11 == var12 && var13 != field2704[11]) { // L: 1219
							var11 = 0; // L: 1220
							var12 = field2744[11]; // L: 1221
							var13 = field2704[11]; // L: 1222
							var14 = field2747; // L: 1223
						}

						if (var11 < var12) { // L: 1225
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1226
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1228
						this.drawFace(var13[var11++]); // L: 1229
						if (var11 == var12 && var13 != field2704[11]) { // L: 1230
							var11 = 0; // L: 1231
							var12 = field2744[11]; // L: 1232
							var13 = field2704[11]; // L: 1233
							var14 = field2747; // L: 1234
						}

						if (var11 < var12) { // L: 1236
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1237
						}
					}

					var16 = field2744[var15]; // L: 1239
					int[] var17 = field2704[var15]; // L: 1240

					for (var18 = 0; var18 < var16; ++var18) { // L: 1241
						this.drawFace(var17[var18]); // L: 1242
					}
				}

				while (var10 != -1000) { // L: 1245
					this.drawFace(var13[var11++]); // L: 1246
					if (var11 == var12 && var13 != field2704[11]) { // L: 1247
						var11 = 0; // L: 1248
						var13 = field2704[11]; // L: 1249
						var12 = field2744[11]; // L: 1250
						var14 = field2747; // L: 1251
					}

					if (var11 < var12) { // L: 1253
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1254
					}
				}

			}
		}
	} // L: 1165 1256

	@ObfuscatedName("bn")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2733[var1]) { // L: 1259
			this.method4883(var1); // L: 1260
		} else {
			int var2 = this.indices1[var1]; // L: 1263
			int var3 = this.indices2[var1]; // L: 1264
			int var4 = this.indices3[var1]; // L: 1265
			Rasterizer3D.field2528.field2810 = field2698[var1]; // L: 1266
			if (this.faceAlphas == null) { // L: 1267
				Rasterizer3D.field2528.field2802 = 0; // L: 1268
			} else {
				Rasterizer3D.field2528.field2802 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1271
			}

			this.method4882(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2743[var2], field2743[var3], field2743[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1273
		}
	} // L: 1261 1274

	@ObfuscatedName("bb")
	boolean method4979(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2699; // L: 1277
	}

	@ObfuscatedName("bi")
	final void method4882(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1281
			int var15;
			int var16;
			int var18;
			if (this.field2766 != null && this.field2766[var1] != -1) { // L: 1300
				int var17 = this.field2766[var1] & 255; // L: 1301
				var18 = this.field2717[var17]; // L: 1302
				var15 = this.field2718[var17]; // L: 1303
				var16 = this.field2720[var17]; // L: 1304
			} else {
				var18 = this.indices1[var1]; // L: 1307
				var15 = this.indices2[var1]; // L: 1308
				var16 = this.indices3[var1]; // L: 1309
			}

			if (this.faceColors3[var1] == -1) { // L: 1311
				Rasterizer3D.method4497(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2738[var18], field2738[var15], field2738[var16], field2719[var18], field2719[var15], field2719[var16], field2740[var18], field2740[var15], field2740[var16], this.faceTextures[var1]); // L: 1312
			} else {
				Rasterizer3D.method4497(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2738[var18], field2738[var15], field2738[var16], field2719[var18], field2719[var15], field2719[var16], field2740[var18], field2740[var15], field2740[var16], this.faceTextures[var1]); // L: 1315
			}
		} else {
			boolean var14 = this.method4979(var1); // L: 1282
			if (this.faceColors3[var1] == -1 && var14) { // L: 1283
				Rasterizer3D.method4514(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2761[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1284
			} else if (this.faceColors3[var1] == -1) { // L: 1286
				Rasterizer3D.method4544(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2761[this.faceColors1[var1]]); // L: 1287
			} else if (var14) { // L: 1289
				Rasterizer3D.method4495(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1290
			} else {
				Rasterizer3D.method4488(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1293
			}
		}

	} // L: 1318

	@ObfuscatedName("bj")
	final void method4883(int var1) {
		int var2 = Rasterizer3D.method4480(); // L: 1321
		int var3 = Rasterizer3D.method4482(); // L: 1322
		int var4 = 0; // L: 1323
		int var5 = this.indices1[var1]; // L: 1324
		int var6 = this.indices2[var1]; // L: 1325
		int var7 = this.indices3[var1]; // L: 1326
		int var8 = field2740[var5]; // L: 1327
		int var9 = field2740[var6]; // L: 1328
		int var10 = field2740[var7]; // L: 1329
		if (this.faceAlphas == null) { // L: 1330
			Rasterizer3D.field2528.field2802 = 0;
		} else {
			Rasterizer3D.field2528.field2802 = this.faceAlphas[var1] & 255; // L: 1331
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1332
			field2749[var4] = modelViewportXs[var5]; // L: 1333
			field2750[var4] = modelViewportYs[var5]; // L: 1334
			field2752[var4] = field2743[var7]; // L: 1335
			field2751[var4++] = this.faceColors1[var1]; // L: 1336
		} else {
			var11 = field2738[var5]; // L: 1339
			var12 = field2719[var5]; // L: 1340
			var13 = this.faceColors1[var1]; // L: 1341
			if (var10 >= 50) { // L: 1342
				var14 = field2762[var10 - var8] * (50 - var8); // L: 1343
				field2749[var4] = var2 + (var11 + ((field2738[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1344
				field2750[var4] = var3 + (var12 + ((field2719[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1345
				field2752[var4] = field2765; // L: 1346
				field2751[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1347
			}

			if (var9 >= 50) { // L: 1349
				var14 = field2762[var9 - var8] * (50 - var8); // L: 1350
				field2749[var4] = var2 + (var11 + ((field2738[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1351
				field2750[var4] = var3 + (var12 + ((field2719[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1352
				field2752[var4] = field2765; // L: 1353
				field2751[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1354
			}
		}

		if (var9 >= 50) { // L: 1357
			field2749[var4] = modelViewportXs[var6]; // L: 1358
			field2750[var4] = modelViewportYs[var6]; // L: 1359
			field2752[var4] = field2743[var7]; // L: 1360
			field2751[var4++] = this.faceColors2[var1]; // L: 1361
		} else {
			var11 = field2738[var6]; // L: 1364
			var12 = field2719[var6]; // L: 1365
			var13 = this.faceColors2[var1]; // L: 1366
			if (var8 >= 50) { // L: 1367
				var14 = field2762[var8 - var9] * (50 - var9); // L: 1368
				field2749[var4] = var2 + (var11 + ((field2738[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1369
				field2750[var4] = var3 + (var12 + ((field2719[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1370
				field2752[var4] = field2765; // L: 1371
				field2751[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1372
			}

			if (var10 >= 50) { // L: 1374
				var14 = field2762[var10 - var9] * (50 - var9); // L: 1375
				field2749[var4] = var2 + (var11 + ((field2738[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1376
				field2750[var4] = var3 + (var12 + ((field2719[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1377
				field2751[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1378
			}
		}

		if (var10 >= 50) { // L: 1381
			field2749[var4] = modelViewportXs[var7]; // L: 1382
			field2750[var4] = modelViewportYs[var7]; // L: 1383
			field2752[var4] = field2743[var7]; // L: 1384
			field2751[var4++] = this.faceColors3[var1]; // L: 1385
		} else {
			var11 = field2738[var7]; // L: 1388
			var12 = field2719[var7]; // L: 1389
			var13 = this.faceColors3[var1]; // L: 1390
			if (var9 >= 50) { // L: 1391
				var14 = field2762[var9 - var10] * (50 - var10); // L: 1392
				field2749[var4] = var2 + (var11 + ((field2738[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1393
				field2750[var4] = var3 + (var12 + ((field2719[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1394
				field2752[var4] = field2765; // L: 1395
				field2751[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1396
			}

			if (var8 >= 50) { // L: 1398
				var14 = field2762[var8 - var10] * (50 - var10); // L: 1399
				field2749[var4] = var2 + (var11 + ((field2738[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1400
				field2750[var4] = var3 + (var12 + ((field2719[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4487() / 50; // L: 1401
				field2752[var4] = field2765; // L: 1402
				field2751[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1403
			}
		}

		var11 = field2749[0]; // L: 1406
		var12 = field2749[1]; // L: 1407
		var13 = field2749[2]; // L: 1408
		var14 = field2750[0]; // L: 1409
		int var15 = field2750[1]; // L: 1410
		int var16 = field2750[2]; // L: 1411
		float var17 = field2752[0]; // L: 1412
		float var18 = field2752[1]; // L: 1413
		float var19 = field2752[2]; // L: 1414
		Rasterizer3D.field2528.field2810 = false; // L: 1415
		int var20 = Rasterizer3D.method4559(); // L: 1416
		if (var4 == 3) { // L: 1417
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1418
				Rasterizer3D.field2528.field2810 = true;
			}

			this.method4882(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2751[0], field2751[1], field2751[2]); // L: 1419
		}

		if (var4 == 4) { // L: 1421
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2749[3] < 0 || field2749[3] > var20) { // L: 1422
				Rasterizer3D.field2528.field2810 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1423
				int var23;
				int var25;
				if (this.field2766 != null && this.field2766[var1] != -1) { // L: 1448
					int var24 = this.field2766[var1] & 255; // L: 1449
					var25 = this.field2717[var24]; // L: 1450
					var22 = this.field2718[var24]; // L: 1451
					var23 = this.field2720[var24]; // L: 1452
				} else {
					var25 = var5; // L: 1455
					var22 = var6; // L: 1456
					var23 = var7; // L: 1457
				}

				short var26 = this.faceTextures[var1]; // L: 1459
				if (this.faceColors3[var1] == -1) { // L: 1460
					Rasterizer3D.method4497(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2738[var25], field2738[var22], field2738[var23], field2719[var25], field2719[var22], field2719[var23], field2740[var25], field2740[var22], field2740[var23], var26); // L: 1461
					Rasterizer3D.method4497(var14, var16, field2750[3], var11, var13, field2749[3], var17, var19, field2752[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2738[var25], field2738[var22], field2738[var23], field2719[var25], field2719[var22], field2719[var23], field2740[var25], field2740[var22], field2740[var23], var26); // L: 1462
				} else {
					Rasterizer3D.method4497(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2751[0], field2751[1], field2751[2], field2738[var25], field2738[var22], field2738[var23], field2719[var25], field2719[var22], field2719[var23], field2740[var25], field2740[var22], field2740[var23], var26); // L: 1465
					Rasterizer3D.method4497(var14, var16, field2750[3], var11, var13, field2749[3], var17, var19, field2752[3], field2751[0], field2751[2], field2751[3], field2738[var25], field2738[var22], field2738[var23], field2719[var25], field2719[var22], field2719[var23], field2740[var25], field2740[var22], field2740[var23], var26); // L: 1466
				}
			} else {
				boolean var21 = this.method4979(var1); // L: 1424
				if (this.faceColors3[var1] == -1 && var21) { // L: 1425
					var22 = field2761[this.faceColors1[var1]]; // L: 1426
					Rasterizer3D.method4514(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1427
					Rasterizer3D.method4514(var14, var16, field2750[3], var11, var13, field2749[3], var17, var19, field2752[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1428
				} else if (this.faceColors3[var1] == -1) { // L: 1430
					var22 = field2761[this.faceColors1[var1]]; // L: 1431
					Rasterizer3D.method4544(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1432
					Rasterizer3D.method4544(var14, var16, field2750[3], var11, var13, field2749[3], var17, var19, field2752[3], var22); // L: 1433
				} else if (var21) { // L: 1435
					Rasterizer3D.method4495(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2751[0], field2751[1], field2751[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1436
					Rasterizer3D.method4495(var14, var16, field2750[3], var11, var13, field2749[3], 0.0F, 0.0F, 0.0F, field2751[0], field2751[2], field2751[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1437
				} else {
					Rasterizer3D.method4488(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2751[0], field2751[1], field2751[2]); // L: 1440
					Rasterizer3D.method4488(var14, var16, field2750[3], var11, var13, field2749[3], var17, var19, field2752[3], field2751[0], field2751[2], field2751[3]); // L: 1441
				}
			}
		}

	} // L: 1470

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILrp;)V"
	)
	void method4884(int var1, class450 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1473
		float var4 = (float)(-this.verticesY[var1]); // L: 1474
		float var5 = (float)(-this.verticesZ[var1]); // L: 1475
		float var6 = 1.0F; // L: 1476
		this.verticesX[var1] = (int)(var2.field4734[0] * var3 + var2.field4734[4] * var4 + var2.field4734[8] * var5 + var2.field4734[12] * var6); // L: 1477
		this.verticesY[var1] = -((int)(var2.field4734[1] * var3 + var2.field4734[5] * var4 + var2.field4734[9] * var5 + var2.field4734[13] * var6)); // L: 1478
		this.verticesZ[var1] = -((int)(var2.field4734[2] * var3 + var2.field4734[6] * var4 + var2.field4734[10] * var5 + var2.field4734[14] * var6)); // L: 1479
	} // L: 1480

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lie;I)V"
	)
	void method4945(class227 var1, int var2) {
		if (this.field2722 != null) { // L: 1483
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1484
				int[] var4 = this.field2722[var3]; // L: 1485
				if (var4 != null && var4.length != 0) { // L: 1486
					int[] var5 = this.field2696[var3]; // L: 1487
					field2697.method8208(); // L: 1488

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1489
						int var7 = var4[var6]; // L: 1490
						class127 var8 = var1.method4567(var7); // L: 1491
						if (var8 != null) { // L: 1492
							field2724.method8263((float)var5[var6] / 255.0F); // L: 1493
							field2736.method8209(var8.method3027(var2)); // L: 1494
							field2736.method8257(field2724); // L: 1495
							field2697.method8252(field2736); // L: 1496
						}
					}

					this.method4884(var3, field2697); // L: 1498
				}
			}

		}
	} // L: 1500

	@ObfuscatedName("dc")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 853
			this.calculateBoundsCylinder();
		}

		this.method4857(var1); // L: 854
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 855
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 856
		int var13 = var3 * this.xzRadius >> 16; // L: 857
		int var14 = var12 + var13; // L: 858
		if (var14 > 50 && var12 < 3500) { // L: 859
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 860
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method4487(); // L: 861
			if (var16 / var14 < Rasterizer3D.method4484()) { // L: 862
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method4487(); // L: 863
				if (var17 / var14 > Rasterizer3D.method4516()) { // L: 864
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 865
					int var19 = var2 * this.xzRadius >> 16; // L: 866
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 867
					int var21 = (var18 + var20) * Rasterizer3D.method4487(); // L: 868
					if (var21 / var14 > Rasterizer3D.method4486()) { // L: 869
						int var22 = (var3 * super.height >> 16) + var19; // L: 870
						int var23 = (var18 - var22) * Rasterizer3D.method4487(); // L: 871
						if (var23 / var14 < Rasterizer3D.method4485()) { // L: 872
							int var24 = var13 + (var2 * super.height >> 16); // L: 873
							boolean var25 = false; // L: 874
							boolean var26 = false; // L: 875
							if (var12 - var24 <= 50) { // L: 876
								var26 = true;
							}

							boolean var27 = var26 || this.field2716 > 0; // L: 877
							int var28 = class238.method4844(); // L: 878
							int var29 = ViewportMouse.ViewportMouse_y; // L: 881
							boolean var31 = WorldMapSection2.method5191(); // L: 884
							boolean var32 = 0L != var9 && !JagexCache.method3599(var9); // L: 887
							boolean var34 = false; // L: 890
							int var38;
							int var39;
							int var40;
							int var41;
							int var54;
							int var60;
							int var61;
							int var62;
							if (var32 && var31) { // L: 891
								boolean var35 = false; // L: 892
								if (field2756) { // L: 893
									boolean var36;
									if (!WorldMapSection2.method5191()) { // L: 897
										var36 = false; // L: 898
									} else {
										int var44;
										int var45;
										int var46;
										int var47;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 902
											var38 = Scene.Scene_cameraPitchSine; // L: 903
											var39 = Scene.Scene_cameraPitchCosine; // L: 904
											var40 = Scene.Scene_cameraYawSine; // L: 905
											var41 = Scene.Scene_cameraYawCosine; // L: 906
											byte var42 = 50; // L: 907
											short var43 = 3500; // L: 908
											var44 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4480()) * var42 / Rasterizer3D.method4487(); // L: 909
											var45 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4482()) * var42 / Rasterizer3D.method4487(); // L: 910
											var46 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4480()) * var43 / Rasterizer3D.method4487(); // L: 911
											var47 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4482()) * var43 / Rasterizer3D.method4487(); // L: 912
											int var48 = class13.method194(var45, var42, var39, var38); // L: 914
											var61 = InterfaceParent.method2305(var45, var42, var39, var38); // L: 915
											var45 = var48; // L: 916
											var48 = class13.method194(var47, var43, var39, var38); // L: 917
											var62 = InterfaceParent.method2305(var47, var43, var39, var38); // L: 918
											int var49 = var44 * var41 - var61 * var40 >> 16; // L: 922
											int var50 = var41 * var61 + var40 * var44 >> 16; // L: 927
											int var51 = var46 * var41 - var62 * var40 >> 16; // L: 933
											int var52 = var46 * var40 + var41 * var62 >> 16; // L: 938
											ViewportMouse.field2781 = (var49 + var51) / 2; // L: 942
											ViewportMouse.field2775 = (var48 + var45) / 2; // L: 943
											class338.field3791 = (var50 + var52) / 2; // L: 944
											Calendar.field3789 = (var51 - var49) / 2; // L: 945
											TextureProvider.field2656 = (var48 - var45) / 2; // L: 946
											class4.field8 = (var52 - var50) / 2; // L: 947
											class252.field2868 = Math.abs(Calendar.field3789); // L: 948
											UserComparator6.field1479 = Math.abs(TextureProvider.field2656); // L: 949
											ViewportMouse.field2777 = Math.abs(class4.field8); // L: 950
										}

										class231 var53 = (class231)this.field2730.get(var1); // L: 952
										var39 = var53.field2627 + var6; // L: 953
										var40 = var7 + var53.field2622; // L: 954
										var41 = var8 + var53.field2623; // L: 955
										var61 = var53.field2624; // L: 956
										var62 = var53.field2621; // L: 957
										var44 = var53.field2626; // L: 958
										var45 = ViewportMouse.field2781 - var39; // L: 959
										var46 = ViewportMouse.field2775 - var40; // L: 960
										var47 = class338.field3791 - var41; // L: 961
										if (Math.abs(var45) > var61 + class252.field2868) { // L: 962
											var36 = false; // L: 963
										} else if (Math.abs(var46) > var62 + UserComparator6.field1479) { // L: 966
											var36 = false; // L: 967
										} else if (Math.abs(var47) > var44 + ViewportMouse.field2777) { // L: 970
											var36 = false; // L: 971
										} else if (Math.abs(var47 * TextureProvider.field2656 - var46 * class4.field8) > var62 * ViewportMouse.field2777 + var44 * UserComparator6.field1479) { // L: 974
											var36 = false; // L: 975
										} else if (Math.abs(var45 * class4.field8 - var47 * Calendar.field3789) > var61 * ViewportMouse.field2777 + var44 * class252.field2868) { // L: 978
											var36 = false; // L: 979
										} else if (Math.abs(var46 * Calendar.field3789 - var45 * TextureProvider.field2656) > var61 * UserComparator6.field1479 + var62 * class252.field2868) { // L: 982
											var36 = false; // L: 983
										} else {
											var36 = true; // L: 986
										}
									}

									var35 = var36; // L: 988
								} else {
									var60 = var12 - var13; // L: 991
									if (var60 <= 50) { // L: 992
										var60 = 50;
									}

									if (var15 > 0) { // L: 993
										var16 /= var14; // L: 994
										var17 /= var60; // L: 995
									} else {
										var17 /= var14; // L: 998
										var16 /= var60; // L: 999
									}

									if (var18 > 0) { // L: 1001
										var23 /= var14; // L: 1002
										var21 /= var60; // L: 1003
									} else {
										var21 /= var14; // L: 1006
										var23 /= var60; // L: 1007
									}

									var54 = var28 - Rasterizer3D.method4480(); // L: 1009
									var38 = var29 - Rasterizer3D.method4482(); // L: 1010
									if (var54 > var16 && var54 < var17 && var38 > var23 && var38 < var21) { // L: 1011
										var35 = true; // L: 1012
									}
								}

								if (var35) { // L: 1015
									if (this.isSingleTile) { // L: 1016
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 1019
									} else {
										var34 = true; // L: 1022
									}
								}
							}

							int var59 = Rasterizer3D.method4480(); // L: 1025
							var60 = Rasterizer3D.method4482(); // L: 1026
							var54 = 0; // L: 1027
							var38 = 0; // L: 1028
							if (var1 != 0) { // L: 1029
								var54 = field2759[var1]; // L: 1030
								var38 = field2760[var1]; // L: 1031
							}

							for (var39 = 0; var39 < this.verticesCount; ++var39) { // L: 1033
								var40 = this.verticesX[var39]; // L: 1034
								var41 = this.verticesY[var39]; // L: 1035
								var61 = this.verticesZ[var39]; // L: 1036
								if (var1 != 0) { // L: 1037
									var62 = var61 * var54 + var40 * var38 >> 16; // L: 1038
									var61 = var61 * var38 - var40 * var54 >> 16; // L: 1039
									var40 = var62; // L: 1040
								}

								var40 += var6; // L: 1042
								var41 += var7; // L: 1043
								var61 += var8; // L: 1044
								var62 = var61 * var4 + var5 * var40 >> 16; // L: 1045
								var61 = var5 * var61 - var40 * var4 >> 16; // L: 1046
								var40 = var62; // L: 1047
								var62 = var3 * var41 - var61 * var2 >> 16; // L: 1048
								var61 = var41 * var2 + var3 * var61 >> 16; // L: 1049
								field2710[var39] = var61 - var12; // L: 1051
								if (var61 >= 50) { // L: 1052
									modelViewportXs[var39] = var59 + var40 * Rasterizer3D.method4487() / var61; // L: 1053
									modelViewportYs[var39] = var60 + var62 * Rasterizer3D.method4487() / var61; // L: 1054
									field2743[var39] = UserComparator3.method2958(var61); // L: 1055
								} else {
									modelViewportXs[var39] = -5000; // L: 1058
									var25 = true; // L: 1059
								}

								if (var27) { // L: 1061
									field2738[var39] = var40; // L: 1062
									field2719[var39] = var62; // L: 1063
									field2740[var39] = var61; // L: 1064
								}
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9); // L: 1068
							} catch (Exception var58) { // L: 1070
							}

						}
					}
				}
			}
		}
	} // L: 1071
}
