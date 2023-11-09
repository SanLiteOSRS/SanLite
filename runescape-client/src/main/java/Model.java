import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("e")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("x")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static class410 field2671;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static class410 field2672;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static class410 field2673;
	@ObfuscatedName("az")
	static boolean[] field2706;
	@ObfuscatedName("ak")
	static boolean[] field2707;
	@ObfuscatedName("af")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ai")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ax")
	static int[] field2675;
	@ObfuscatedName("ah")
	static int[] field2711;
	@ObfuscatedName("aw")
	static int[] field2712;
	@ObfuscatedName("aj")
	static int[] field2676;
	@ObfuscatedName("ap")
	static char[] field2721;
	@ObfuscatedName("aa")
	static char[][] field2685;
	@ObfuscatedName("ae")
	static int[] field2677;
	@ObfuscatedName("ac")
	static int[][] field2740;
	@ObfuscatedName("bh")
	static int[] field2719;
	@ObfuscatedName("be")
	static int[] field2720;
	@ObfuscatedName("bf")
	static int[] field2690;
	@ObfuscatedName("bo")
	static int[] field2722;
	@ObfuscatedName("by")
	static int[] field2667;
	@ObfuscatedName("bw")
	static int[] field2713;
	@ObfuscatedName("bp")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bc")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bl")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bv")
	static boolean field2728;
	@ObfuscatedName("bz")
	static int[] field2710;
	@ObfuscatedName("bi")
	static int[] field2732;
	@ObfuscatedName("br")
	static int[] field2680;
	@ObfuscatedName("bq")
	static int[] field2688;
	@ObfuscatedName("r")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("u")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("b")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("j")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("g")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("i")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("o")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("n")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("k")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("a")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("s")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("l")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("t")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("c")
	byte[] field2702;
	@ObfuscatedName("p")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("d")
	byte field2689;
	@ObfuscatedName("y")
	int field2723;
	@ObfuscatedName("z")
	int[] field2678;
	@ObfuscatedName("w")
	int[] field2692;
	@ObfuscatedName("as")
	int[] field2693;
	@ObfuscatedName("ad")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("ao")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("am")
	int[][] field2696;
	@ObfuscatedName("av")
	int[][] field2697;
	@ObfuscatedName("au")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ar")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("at")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ay")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("an")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ab")
	@Export("radius")
	int radius;
	@ObfuscatedName("al")
	HashMap field2704;
	@ObfuscatedName("bs")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bt")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bu")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("bj")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("bb")
	public short field2741;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2671 = new class410(); // L: 17
		field2672 = new class410(); // L: 18
		field2673 = new class410(); // L: 19
		field2706 = new boolean[6500]; // L: 55
		field2707 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2675 = new int[6500]; // L: 59
		field2711 = new int[6500]; // L: 60
		field2712 = new int[6500]; // L: 61
		field2676 = new int[6500]; // L: 62
		field2721 = new char[6000]; // L: 64
		field2685 = new char[6000][512]; // L: 65
		field2677 = new int[12]; // L: 66
		field2740 = new int[12][2000]; // L: 67
		field2719 = new int[2000]; // L: 68
		field2720 = new int[2000]; // L: 69
		field2690 = new int[12]; // L: 70
		field2722 = new int[10]; // L: 71
		field2667 = new int[10]; // L: 72
		field2713 = new int[10]; // L: 73
		field2728 = true; // L: 77
		field2710 = Rasterizer3D.Rasterizer3D_sine; // L: 80
		field2732 = Rasterizer3D.Rasterizer3D_cosine; // L: 81
		field2680 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 82
		field2688 = Rasterizer3D.field2506; // L: 83
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2689 = 0;
		this.field2723 = 0;
		this.isSingleTile = false;
		this.field2704 = new HashMap();
	} // L: 92

	@ObfuscatedSignature(
		descriptor = "([Lhh;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2689 = 0; // L: 35
		this.field2723 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2704 = new HashMap(); // L: 50
		boolean var3 = false; // L: 95
		boolean var4 = false; // L: 96
		boolean var5 = false; // L: 97
		boolean var6 = false; // L: 98
		this.verticesCount = 0; // L: 99
		this.indicesCount = 0; // L: 100
		this.field2723 = 0; // L: 101
		this.field2689 = -1; // L: 102

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 103
			var8 = var1[var7]; // L: 104
			if (var8 != null) { // L: 105
				this.verticesCount += var8.verticesCount; // L: 106
				this.indicesCount += var8.indicesCount; // L: 107
				this.field2723 += var8.field2723; // L: 108
				if (var8.faceRenderPriorities != null) { // L: 109
					var3 = true;
				} else {
					if (this.field2689 == -1) { // L: 111
						this.field2689 = var8.field2689;
					}

					if (this.field2689 != var8.field2689) { // L: 112
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 114
				var5 |= var8.faceTextures != null; // L: 115
				var6 |= var8.field2702 != null; // L: 116
			}
		}

		this.verticesX = new int[this.verticesCount]; // L: 119
		this.verticesY = new int[this.verticesCount]; // L: 120
		this.verticesZ = new int[this.verticesCount]; // L: 121
		this.indices1 = new int[this.indicesCount]; // L: 122
		this.indices2 = new int[this.indicesCount]; // L: 123
		this.indices3 = new int[this.indicesCount]; // L: 124
		this.faceColors1 = new int[this.indicesCount]; // L: 125
		this.faceColors2 = new int[this.indicesCount]; // L: 126
		this.faceColors3 = new int[this.indicesCount]; // L: 127
		if (var3) { // L: 128
			this.faceRenderPriorities = new byte[this.indicesCount];
		}

		if (var4) { // L: 129
			this.faceAlphas = new byte[this.indicesCount];
		}

		if (var5) { // L: 130
			this.faceTextures = new short[this.indicesCount];
		}

		if (var6) { // L: 131
			this.field2702 = new byte[this.indicesCount];
		}

		if (this.field2723 > 0) { // L: 132
			this.field2678 = new int[this.field2723]; // L: 133
			this.field2692 = new int[this.field2723]; // L: 134
			this.field2693 = new int[this.field2723]; // L: 135
		}

		this.verticesCount = 0; // L: 137
		this.indicesCount = 0; // L: 138
		this.field2723 = 0; // L: 139

		for (var7 = 0; var7 < var2; ++var7) { // L: 140
			var8 = var1[var7]; // L: 141
			if (var8 != null) { // L: 142
				int var9;
				for (var9 = 0; var9 < var8.indicesCount; ++var9) { // L: 143
					this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9]; // L: 144
					this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9]; // L: 145
					this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9]; // L: 146
					this.faceColors1[this.indicesCount] = var8.faceColors1[var9]; // L: 147
					this.faceColors2[this.indicesCount] = var8.faceColors2[var9]; // L: 148
					this.faceColors3[this.indicesCount] = var8.faceColors3[var9]; // L: 149
					if (var3) { // L: 150
						if (var8.faceRenderPriorities != null) { // L: 151
							this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
						} else {
							this.faceRenderPriorities[this.indicesCount] = var8.field2689; // L: 152
						}
					}

					if (var4 && var8.faceAlphas != null) { // L: 154 155
						this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
					}

					if (var5) { // L: 157
						if (var8.faceTextures != null) { // L: 158
							this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
						} else {
							this.faceTextures[this.indicesCount] = -1; // L: 159
						}
					}

					if (var6) { // L: 161
						if (var8.field2702 != null && var8.field2702[var9] != -1) { // L: 162
							this.field2702[this.indicesCount] = (byte)(this.field2723 + var8.field2702[var9]);
						} else {
							this.field2702[this.indicesCount] = -1; // L: 163
						}
					}

					++this.indicesCount; // L: 165
				}

				for (var9 = 0; var9 < var8.field2723; ++var9) { // L: 167
					this.field2678[this.field2723] = this.verticesCount + var8.field2678[var9]; // L: 168
					this.field2692[this.field2723] = this.verticesCount + var8.field2692[var9]; // L: 169
					this.field2693[this.field2723] = this.verticesCount + var8.field2693[var9]; // L: 170
					++this.field2723; // L: 171
				}

				for (var9 = 0; var9 < var8.verticesCount; ++var9) { // L: 173
					this.verticesX[this.verticesCount] = var8.verticesX[var9]; // L: 174
					this.verticesY[this.verticesCount] = var8.verticesY[var9]; // L: 175
					this.verticesZ[this.verticesCount] = var8.verticesZ[var9]; // L: 176
					++this.verticesCount; // L: 177
				}
			}
		}

	} // L: 181

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhh;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder(); // L: 184
		int var7 = var2 - this.xzRadius; // L: 185
		int var8 = var2 + this.xzRadius; // L: 186
		int var9 = var4 - this.xzRadius; // L: 187
		int var10 = var4 + this.xzRadius; // L: 188
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 189
			var7 >>= 7; // L: 190
			var8 = var8 + 127 >> 7; // L: 191
			var9 >>= 7; // L: 192
			var10 = var10 + 127 >> 7; // L: 193
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 194
				return this;
			} else {
				Model var11;
				if (var5) { // L: 196
					var11 = new Model(); // L: 197
					var11.verticesCount = this.verticesCount; // L: 198
					var11.indicesCount = this.indicesCount; // L: 199
					var11.field2723 = this.field2723; // L: 200
					var11.verticesX = this.verticesX; // L: 201
					var11.verticesZ = this.verticesZ; // L: 202
					var11.indices1 = this.indices1; // L: 203
					var11.indices2 = this.indices2; // L: 204
					var11.indices3 = this.indices3; // L: 205
					var11.faceColors1 = this.faceColors1; // L: 206
					var11.faceColors2 = this.faceColors2; // L: 207
					var11.faceColors3 = this.faceColors3; // L: 208
					var11.faceRenderPriorities = this.faceRenderPriorities; // L: 209
					var11.faceAlphas = this.faceAlphas; // L: 210
					var11.field2702 = this.field2702; // L: 211
					var11.faceTextures = this.faceTextures; // L: 212
					var11.field2689 = this.field2689; // L: 213
					var11.field2678 = this.field2678; // L: 214
					var11.field2692 = this.field2692; // L: 215
					var11.field2693 = this.field2693; // L: 216
					var11.vertexLabels = this.vertexLabels; // L: 217
					var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 218
					var11.isSingleTile = this.isSingleTile; // L: 219
					var11.verticesY = new int[var11.verticesCount]; // L: 220
				} else {
					var11 = this; // L: 223
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
				if (var6 == 0) { // L: 225
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 226
						var13 = var2 + this.verticesX[var12]; // L: 227
						var14 = var4 + this.verticesZ[var12]; // L: 228
						var15 = var13 & 127; // L: 229
						var16 = var14 & 127; // L: 230
						var17 = var13 >> 7; // L: 231
						var18 = var14 >> 7; // L: 232
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 233
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 234
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 235
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 236
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 240
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 241
						if (var13 < var6) { // L: 242
							var14 = var2 + this.verticesX[var12]; // L: 243
							var15 = var4 + this.verticesZ[var12]; // L: 244
							var16 = var14 & 127; // L: 245
							var17 = var15 & 127; // L: 246
							var18 = var14 >> 7; // L: 247
							var19 = var15 >> 7; // L: 248
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 249
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 250
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 251
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 252
						}
					}
				}

				var11.resetBounds(); // L: 256
				return var11; // L: 257
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhh;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 261
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 262
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhh;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 266
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 267
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZLhh;[B)Lhh;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 271
		var2.indicesCount = this.indicesCount; // L: 272
		var2.field2723 = this.field2723; // L: 273
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) { // L: 274
			var2.verticesX = new int[this.verticesCount + 100]; // L: 275
			var2.verticesY = new int[this.verticesCount + 100]; // L: 276
			var2.verticesZ = new int[this.verticesCount + 100]; // L: 277
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) { // L: 279
			var2.verticesX[var4] = this.verticesX[var4]; // L: 280
			var2.verticesY[var4] = this.verticesY[var4]; // L: 281
			var2.verticesZ[var4] = this.verticesZ[var4]; // L: 282
		}

		if (var1) { // L: 284
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3; // L: 286
			if (this.faceAlphas == null) { // L: 287
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 288
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 291
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1; // L: 294
		var2.indices2 = this.indices2; // L: 295
		var2.indices3 = this.indices3; // L: 296
		var2.faceColors1 = this.faceColors1; // L: 297
		var2.faceColors2 = this.faceColors2; // L: 298
		var2.faceColors3 = this.faceColors3; // L: 299
		var2.faceRenderPriorities = this.faceRenderPriorities; // L: 300
		var2.field2702 = this.field2702; // L: 301
		var2.faceTextures = this.faceTextures; // L: 302
		var2.field2689 = this.field2689; // L: 303
		var2.field2678 = this.field2678; // L: 304
		var2.field2692 = this.field2692; // L: 305
		var2.field2693 = this.field2693; // L: 306
		var2.vertexLabels = this.vertexLabels; // L: 307
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 308
		var2.field2696 = this.field2696; // L: 309
		var2.field2697 = this.field2697; // L: 310
		var2.isSingleTile = this.isSingleTile; // L: 311
		var2.resetBounds(); // L: 312
		var2.overrideAmount = 0; // L: 313
		return var2; // L: 314
	}

	@ObfuscatedName("r")
	void method4764(int var1) {
		if (!this.field2704.containsKey(var1)) { // L: 318
			int var2 = 0; // L: 319
			int var3 = 0; // L: 320
			int var4 = 0; // L: 321
			int var5 = 0; // L: 322
			int var6 = 0; // L: 323
			int var7 = 0; // L: 324
			int var8 = field2732[var1]; // L: 325
			int var9 = field2710[var1]; // L: 326

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 327
				int var11 = Rasterizer3D.method4322(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 328
				int var12 = this.verticesY[var10]; // L: 329
				int var13 = Rasterizer3D.method4335(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 330
				if (var11 < var2) { // L: 331
					var2 = var11;
				}

				if (var11 > var5) { // L: 332
					var5 = var11;
				}

				if (var12 < var3) { // L: 333
					var3 = var12;
				}

				if (var12 > var6) { // L: 334
					var6 = var12;
				}

				if (var13 < var4) { // L: 335
					var4 = var13;
				}

				if (var13 > var7) { // L: 336
					var7 = var13;
				}
			}

			class216 var14 = new class216((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 338
			boolean var15 = true; // L: 339
			if (var14.field2598 < 32) { // L: 340
				var14.field2598 = 32;
			}

			if (var14.field2595 < 32) { // L: 341
				var14.field2595 = 32;
			}

			if (this.isSingleTile) { // L: 342
				boolean var16 = true; // L: 343
				var14.field2598 += 8; // L: 344
				var14.field2595 += 8; // L: 345
			}

			this.field2704.put(var1, var14); // L: 347
		}
	} // L: 348

	@ObfuscatedName("u")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 351
			this.boundsType = 1; // L: 352
			super.height = 0; // L: 353
			this.bottomY = 0; // L: 354
			this.xzRadius = 0; // L: 355

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 356
				int var2 = this.verticesX[var1]; // L: 357
				int var3 = this.verticesY[var1]; // L: 358
				int var4 = this.verticesZ[var1]; // L: 359
				if (-var3 > super.height) { // L: 360
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 361
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 362
				if (var5 > this.xzRadius) { // L: 363
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 365
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 366
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 367
		}
	} // L: 368

	@ObfuscatedName("b")
	void method4665() {
		if (this.boundsType != 2) { // L: 371
			this.boundsType = 2; // L: 372
			this.xzRadius = 0; // L: 373

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 374
				int var2 = this.verticesX[var1]; // L: 375
				int var3 = this.verticesY[var1]; // L: 376
				int var4 = this.verticesZ[var1]; // L: 377
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 378
				if (var5 > this.xzRadius) { // L: 379
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 381
			this.radius = this.xzRadius; // L: 382
			this.diameter = this.xzRadius + this.xzRadius; // L: 383
		}
	} // L: 384

	@ObfuscatedName("j")
	public int method4666() {
		this.calculateBoundsCylinder(); // L: 387
		return this.xzRadius; // L: 388
	}

	@ObfuscatedName("g")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 392
		this.field2704.clear(); // L: 393
	} // L: 394

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lha;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 397
			if (var2 != -1) { // L: 398
				Animation var3 = var1.frames[var2]; // L: 399
				Skeleton var4 = var3.skeleton; // L: 400
				Model_transformTempX = 0; // L: 401
				Model_transformTempY = 0; // L: 402
				Model_transformTempZ = 0; // L: 403

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 404
					int var6 = var3.transformSkeletonLabels[var5]; // L: 405
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 406
				}

				this.resetBounds(); // L: 408
			}
		}
	} // L: 409

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lew;I)V"
	)
	public void method4713(class130 var1, int var2) {
		Skeleton var3 = var1.field1603; // L: 412
		class213 var4 = var3.method4422(); // L: 413
		if (var4 != null) { // L: 414
			var3.method4422().method4403(var1, var2); // L: 415
			this.method4671(var3.method4422(), var1.method3021()); // L: 416
		}

		if (var1.method3005()) { // L: 418
			this.method4670(var1, var2); // L: 419
		}

		this.resetBounds(); // L: 421
	} // L: 422

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lew;I)V"
	)
	void method4670(class130 var1, int var2) {
		Skeleton var3 = var1.field1603; // L: 425

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 426
			int var5 = var3.transformTypes[var4]; // L: 427
			if (var5 == 5 && var1.field1604 != null && var1.field1604[var4] != null && var1.field1604[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 428 429
				class125 var6 = var1.field1604[var4][0]; // L: 430
				int[] var7 = var3.labels[var4]; // L: 431
				int var8 = var7.length; // L: 432

				for (int var9 = 0; var9 < var8; ++var9) { // L: 433
					int var10 = var7[var9]; // L: 434
					if (var10 < this.faceLabelsAlpha.length) { // L: 435
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 436

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 437
							int var13 = var11[var12]; // L: 438
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2966(var2) * 255.0F); // L: 439
							if (var14 < 0) { // L: 440
								var14 = 0;
							} else if (var14 > 255) { // L: 441
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 442
						}
					}
				}
			}
		}

	} // L: 449

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhi;I)V"
	)
	void method4671(class213 var1, int var2) {
		this.method4701(var1, var2); // L: 453
	} // L: 455

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lha;ILha;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 458
			if (var5 != null && var4 != -1) { // L: 459
				Animation var6 = var1.frames[var2]; // L: 463
				Animation var7 = var3.frames[var4]; // L: 464
				Skeleton var8 = var6.skeleton; // L: 465
				Model_transformTempX = 0; // L: 466
				Model_transformTempY = 0; // L: 467
				Model_transformTempZ = 0; // L: 468
				byte var9 = 0; // L: 469
				int var13 = var9 + 1; // L: 470
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 471
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 472 473
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 474
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 476
				Model_transformTempY = 0; // L: 477
				Model_transformTempZ = 0; // L: 478
				var9 = 0; // L: 479
				var13 = var9 + 1; // L: 480
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 481
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 482 483
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 484
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 486
			} else {
				this.animate(var1, var2); // L: 460
			}
		}
	} // L: 461 487

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhn;Lew;I[ZZZ)V"
	)
	public void method4738(Skeleton var1, class130 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class213 var7 = var1.method4422(); // L: 490
		if (var7 != null) { // L: 491
			var7.method4414(var2, var3, var4, var5); // L: 492
			if (var6) { // L: 493
				this.method4671(var7, var2.method3021()); // L: 494
			}
		}

		if (!var5 && var2.method3005()) { // L: 497
			this.method4670(var2, var3); // L: 498
		}

	} // L: 500

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lha;I[IZ)V"
	)
	public void method4674(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 503
			this.animate(var1, var2); // L: 504
		} else {
			Animation var5 = var1.frames[var2]; // L: 507
			Skeleton var6 = var5.skeleton; // L: 508
			byte var7 = 0; // L: 509
			int var11 = var7 + 1; // L: 510
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 511
			Model_transformTempY = 0; // L: 512
			Model_transformTempZ = 0; // L: 513

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 514
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 515 516
				}

				if (var4) { // L: 517
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 518
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 521
				}
			}

		}
	} // L: 505 524

	@ObfuscatedName("t")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 527
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 528
			var7 = 0; // L: 529
			Model_transformTempX = 0; // L: 530
			Model_transformTempY = 0; // L: 531
			Model_transformTempZ = 0; // L: 532

			for (var8 = 0; var8 < var6; ++var8) { // L: 533
				int var18 = var2[var8]; // L: 534
				if (var18 < this.vertexLabels.length) { // L: 535
					int[] var19 = this.vertexLabels[var18]; // L: 536

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 537
						var12 = var19[var11]; // L: 538
						Model_transformTempX += this.verticesX[var12]; // L: 539
						Model_transformTempY += this.verticesY[var12]; // L: 540
						Model_transformTempZ += this.verticesZ[var12]; // L: 541
						++var7; // L: 542
					}
				}
			}

			if (var7 > 0) { // L: 546
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 547
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 548
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 549
			} else {
				Model_transformTempX = var3; // L: 552
				Model_transformTempY = var4; // L: 553
				Model_transformTempZ = var5; // L: 554
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 558
				for (var7 = 0; var7 < var6; ++var7) { // L: 559
					var8 = var2[var7]; // L: 560
					if (var8 < this.vertexLabels.length) { // L: 561
						var9 = this.vertexLabels[var8]; // L: 562

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 563
							var11 = var9[var10]; // L: 564
							var10000 = this.verticesX; // L: 565
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 566
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 567
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 573
				for (var7 = 0; var7 < var6; ++var7) { // L: 574
					var8 = var2[var7]; // L: 575
					if (var8 < this.vertexLabels.length) { // L: 576
						var9 = this.vertexLabels[var8]; // L: 577

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 578
							var11 = var9[var10]; // L: 579
							var10000 = this.verticesX; // L: 580
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 581
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 582
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 583
							int var13 = (var4 & 255) * 8; // L: 584
							int var14 = (var5 & 255) * 8; // L: 585
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 586
								var15 = field2710[var14]; // L: 587
								var16 = field2732[var14]; // L: 588
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 589
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 590
								this.verticesX[var11] = var17; // L: 591
							}

							if (var12 != 0) { // L: 593
								var15 = field2710[var12]; // L: 594
								var16 = field2732[var12]; // L: 595
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 596
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 597
								this.verticesY[var11] = var17; // L: 598
							}

							if (var13 != 0) { // L: 600
								var15 = field2710[var13]; // L: 601
								var16 = field2732[var13]; // L: 602
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 603
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 604
								this.verticesX[var11] = var17; // L: 605
							}

							var10000 = this.verticesX; // L: 607
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 608
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 609
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 615
				for (var7 = 0; var7 < var6; ++var7) { // L: 616
					var8 = var2[var7]; // L: 617
					if (var8 < this.vertexLabels.length) { // L: 618
						var9 = this.vertexLabels[var8]; // L: 619

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 620
							var11 = var9[var10]; // L: 621
							var10000 = this.verticesX; // L: 622
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 623
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 624
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 625
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 626
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 627
							var10000 = this.verticesX; // L: 628
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 629
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 630
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 636
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 637
					for (var7 = 0; var7 < var6; ++var7) { // L: 638
						var8 = var2[var7]; // L: 639
						if (var8 < this.faceLabelsAlpha.length) { // L: 640
							var9 = this.faceLabelsAlpha[var8]; // L: 641

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 642
								var11 = var9[var10]; // L: 643
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 644
								if (var12 < 0) { // L: 645
									var12 = 0;
								} else if (var12 > 255) { // L: 646
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 647
							}
						}
					}
				}

			}
		}
	} // L: 556 571 613 634 652 654

	@ObfuscatedName("c")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 657
			int var2 = this.verticesX[var1]; // L: 658
			this.verticesX[var1] = this.verticesZ[var1]; // L: 659
			this.verticesZ[var1] = -var2; // L: 660
		}

		this.resetBounds(); // L: 662
	} // L: 663

	@ObfuscatedName("p")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 666
			this.verticesX[var1] = -this.verticesX[var1]; // L: 667
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 668
		}

		this.resetBounds(); // L: 670
	} // L: 671

	@ObfuscatedName("d")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 674
			int var2 = this.verticesZ[var1]; // L: 675
			this.verticesZ[var1] = this.verticesX[var1]; // L: 676
			this.verticesX[var1] = -var2; // L: 677
		}

		this.resetBounds(); // L: 679
	} // L: 680

	@ObfuscatedName("y")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2710[var1]; // L: 683
		int var3 = field2732[var1]; // L: 684

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 685
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 686
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 687
			this.verticesY[var4] = var5; // L: 688
		}

		this.resetBounds(); // L: 690
	} // L: 691

	@ObfuscatedName("z")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 694
			int[] var10000 = this.verticesX; // L: 695
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 696
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 697
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 699
	} // L: 700

	@ObfuscatedName("w")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 703
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 704
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 705
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 706
		}

		this.resetBounds(); // L: 708
	} // L: 709

	@ObfuscatedName("as")
	public final void method4682(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 712
			this.method4665();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 713
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 714
		int var10 = field2710[var1]; // L: 715
		int var11 = field2732[var1]; // L: 716
		int var12 = field2710[var2]; // L: 717
		int var13 = field2732[var2]; // L: 718
		int var14 = field2710[var3]; // L: 719
		int var15 = field2732[var3]; // L: 720
		int var16 = field2710[var4]; // L: 721
		int var17 = field2732[var4]; // L: 722
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 723

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 724
			int var20 = this.verticesX[var19]; // L: 725
			int var21 = this.verticesY[var19]; // L: 726
			int var22 = this.verticesZ[var19]; // L: 727
			int var23;
			if (var3 != 0) { // L: 728
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 729
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 730
				var20 = var23; // L: 731
			}

			if (var1 != 0) { // L: 733
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 734
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 735
				var21 = var23; // L: 736
			}

			if (var2 != 0) { // L: 738
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 739
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 740
				var20 = var23; // L: 741
			}

			var20 += var5; // L: 743
			var21 += var6; // L: 744
			var22 += var7; // L: 745
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 746
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 747
			field2675[var19] = var22 - var18; // L: 749
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 750
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 751
			if (this.field2723 > 0) { // L: 752
				field2711[var19] = var20; // L: 753
				field2712[var19] = var23; // L: 754
				field2676[var19] = var22; // L: 755
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 759
		} catch (Exception var25) { // L: 761
		}

	} // L: 762

	@ObfuscatedName("ad")
	public final void method4711(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 765
			this.method4665();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 766
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 767
		int var11 = field2710[var1]; // L: 768
		int var12 = field2732[var1]; // L: 769
		int var13 = field2710[var2]; // L: 770
		int var14 = field2732[var2]; // L: 771
		int var15 = field2710[var3]; // L: 772
		int var16 = field2732[var3]; // L: 773
		int var17 = field2710[var4]; // L: 774
		int var18 = field2732[var4]; // L: 775
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 776

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 777
			int var21 = this.verticesX[var20]; // L: 778
			int var22 = this.verticesY[var20]; // L: 779
			int var23 = this.verticesZ[var20]; // L: 780
			int var24;
			if (var3 != 0) { // L: 781
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 782
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 783
				var21 = var24; // L: 784
			}

			if (var1 != 0) { // L: 786
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 787
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 788
				var22 = var24; // L: 789
			}

			if (var2 != 0) { // L: 791
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 792
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 793
				var21 = var24; // L: 794
			}

			var21 += var5; // L: 796
			var22 += var6; // L: 797
			var23 += var7; // L: 798
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 799
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 800
			field2675[var20] = var23 - var19; // L: 802
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 803
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 804
			if (this.field2723 > 0) { // L: 805
				field2711[var20] = var21; // L: 806
				field2712[var20] = var24; // L: 807
				field2676[var20] = var23; // L: 808
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 812
		} catch (Exception var26) { // L: 814
		}

	} // L: 815

	@ObfuscatedName("ao")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1021
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1022
				field2721[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1023

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1024
				if (this.faceColors3[var7] != -2) { // L: 1025
					var8 = this.indices1[var7]; // L: 1026
					var9 = this.indices2[var7]; // L: 1027
					var10 = this.indices3[var7]; // L: 1028
					var11 = modelViewportXs[var8]; // L: 1029
					var12 = modelViewportXs[var9]; // L: 1030
					var28 = modelViewportXs[var10]; // L: 1031
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1032
						if (var2 && class140.method3095(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1058
							class338.method6605(var4); // L: 1059
							var2 = false; // L: 1060
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1062
							field2707[var7] = false; // L: 1063
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1064
								field2706[var7] = false; // L: 1065
							} else {
								field2706[var7] = true;
							}

							var29 = (field2675[var8] + field2675[var9] + field2675[var10]) / 3 + this.radius; // L: 1066
							field2685[var29][field2721[var29]++] = var7; // L: 1067
						}
					} else {
						var29 = field2711[var8]; // L: 1033
						var15 = field2711[var9]; // L: 1034
						var16 = field2711[var10]; // L: 1035
						int var30 = field2712[var8]; // L: 1036
						var18 = field2712[var9]; // L: 1037
						int var19 = field2712[var10]; // L: 1038
						int var20 = field2676[var8]; // L: 1039
						int var21 = field2676[var9]; // L: 1040
						int var22 = field2676[var10]; // L: 1041
						var29 -= var15; // L: 1042
						var16 -= var15; // L: 1043
						var30 -= var18; // L: 1044
						var19 -= var18; // L: 1045
						var20 -= var21; // L: 1046
						var22 -= var21; // L: 1047
						int var23 = var30 * var22 - var20 * var19; // L: 1048
						int var24 = var20 * var16 - var29 * var22; // L: 1049
						int var25 = var29 * var19 - var30 * var16; // L: 1050
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1051
							field2707[var7] = true; // L: 1052
							int var26 = (field2675[var8] + field2675[var9] + field2675[var10]) / 3 + this.radius; // L: 1053
							field2685[var26][field2721[var26]++] = var7; // L: 1054
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1071
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1072
					var32 = field2721[var31]; // L: 1073
					if (var32 > 0) { // L: 1074
						var27 = field2685[var31]; // L: 1075

						for (var10 = 0; var10 < var32; ++var10) { // L: 1076
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1081
					field2677[var31] = 0; // L: 1082
					field2690[var31] = 0; // L: 1083
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1085
					var32 = field2721[var31]; // L: 1086
					if (var32 > 0) { // L: 1087
						var27 = field2685[var31]; // L: 1088

						for (var10 = 0; var10 < var32; ++var10) { // L: 1089
							char var33 = var27[var10]; // L: 1090
							byte var34 = this.faceRenderPriorities[var33]; // L: 1091
							var28 = field2677[var34]++; // L: 1092
							field2740[var34][var28] = var33; // L: 1093
							if (var34 < 10) { // L: 1094
								int[] var35 = field2690;
								var35[var34] += var31;
							} else if (var34 == 10) { // L: 1095
								field2719[var28] = var31;
							} else {
								field2720[var28] = var31; // L: 1096
							}
						}
					}
				}

				var31 = 0; // L: 1100
				if (field2677[1] > 0 || field2677[2] > 0) { // L: 1101
					var31 = (field2690[1] + field2690[2]) / (field2677[1] + field2677[2]);
				}

				var8 = 0; // L: 1102
				if (field2677[3] > 0 || field2677[4] > 0) { // L: 1103
					var8 = (field2690[3] + field2690[4]) / (field2677[3] + field2677[4]);
				}

				var9 = 0; // L: 1104
				if (field2677[6] > 0 || field2677[8] > 0) { // L: 1105
					var9 = (field2690[8] + field2690[6]) / (field2677[8] + field2677[6]);
				}

				var11 = 0; // L: 1107
				var12 = field2677[10]; // L: 1108
				int[] var13 = field2740[10]; // L: 1109
				int[] var14 = field2719; // L: 1110
				if (var11 == var12) { // L: 1111
					var11 = 0; // L: 1112
					var12 = field2677[11]; // L: 1113
					var13 = field2740[11]; // L: 1114
					var14 = field2720; // L: 1115
				}

				if (var11 < var12) { // L: 1117
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1118
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1119
					while (var15 == 0 && var10 > var31) { // L: 1120
						this.drawFace(var13[var11++]); // L: 1121
						if (var11 == var12 && var13 != field2740[11]) { // L: 1122
							var11 = 0; // L: 1123
							var12 = field2677[11]; // L: 1124
							var13 = field2740[11]; // L: 1125
							var14 = field2720; // L: 1126
						}

						if (var11 < var12) { // L: 1128
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1129
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1131
						this.drawFace(var13[var11++]); // L: 1132
						if (var11 == var12 && var13 != field2740[11]) { // L: 1133
							var11 = 0; // L: 1134
							var12 = field2677[11]; // L: 1135
							var13 = field2740[11]; // L: 1136
							var14 = field2720; // L: 1137
						}

						if (var11 < var12) { // L: 1139
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1140
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1142
						this.drawFace(var13[var11++]); // L: 1143
						if (var11 == var12 && var13 != field2740[11]) { // L: 1144
							var11 = 0; // L: 1145
							var12 = field2677[11]; // L: 1146
							var13 = field2740[11]; // L: 1147
							var14 = field2720; // L: 1148
						}

						if (var11 < var12) { // L: 1150
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1151
						}
					}

					var16 = field2677[var15]; // L: 1153
					int[] var17 = field2740[var15]; // L: 1154

					for (var18 = 0; var18 < var16; ++var18) { // L: 1155
						this.drawFace(var17[var18]); // L: 1156
					}
				}

				while (var10 != -1000) { // L: 1159
					this.drawFace(var13[var11++]); // L: 1160
					if (var11 == var12 && var13 != field2740[11]) { // L: 1161
						var11 = 0; // L: 1162
						var13 = field2740[11]; // L: 1163
						var12 = field2677[11]; // L: 1164
						var14 = field2720; // L: 1165
					}

					if (var11 < var12) { // L: 1167
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1168
					}
				}

			}
		}
	} // L: 1079 1170

	@ObfuscatedName("am")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2707[var1]) { // L: 1173
			this.method4659(var1); // L: 1174
		} else {
			int var2 = this.indices1[var1]; // L: 1177
			int var3 = this.indices2[var1]; // L: 1178
			int var4 = this.indices3[var1]; // L: 1179
			Rasterizer3D.field2502 = field2706[var1]; // L: 1180
			if (this.faceAlphas == null) { // L: 1181
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1182
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1185
			}

			this.method4721(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1187
		}
	} // L: 1175 1188

	@ObfuscatedName("av")
	boolean method4727(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2741; // L: 1191
	}

	@ObfuscatedName("au")
	final void method4721(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1195
			int var12;
			int var13;
			int var15;
			if (this.field2702 != null && this.field2702[var1] != -1) { // L: 1214
				int var14 = this.field2702[var1] & 255; // L: 1215
				var15 = this.field2678[var14]; // L: 1216
				var12 = this.field2692[var14]; // L: 1217
				var13 = this.field2693[var14]; // L: 1218
			} else {
				var15 = this.indices1[var1]; // L: 1221
				var12 = this.indices2[var1]; // L: 1222
				var13 = this.indices3[var1]; // L: 1223
			}

			if (this.faceColors3[var1] == -1) { // L: 1225
				Rasterizer3D.method4329(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2711[var15], field2711[var12], field2711[var13], field2712[var15], field2712[var12], field2712[var13], field2676[var15], field2676[var12], field2676[var13], this.faceTextures[var1]); // L: 1226
			} else {
				Rasterizer3D.method4329(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2711[var15], field2711[var12], field2711[var13], field2712[var15], field2712[var12], field2712[var13], field2676[var15], field2676[var12], field2676[var13], this.faceTextures[var1]); // L: 1229
			}
		} else {
			boolean var11 = this.method4727(var1); // L: 1196
			if (this.faceColors3[var1] == -1 && var11) { // L: 1197
				Rasterizer3D.method4327(var2, var3, var4, var5, var6, var7, field2680[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1198
			} else if (this.faceColors3[var1] == -1) { // L: 1200
				Rasterizer3D.method4326(var2, var3, var4, var5, var6, var7, field2680[this.faceColors1[var1]]); // L: 1201
			} else if (var11) { // L: 1203
				Rasterizer3D.method4323(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1204
			} else {
				Rasterizer3D.method4340(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1207
			}
		}

	} // L: 1232

	@ObfuscatedName("ar")
	final void method4659(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1235
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1236
		int var4 = 0; // L: 1237
		int var5 = this.indices1[var1]; // L: 1238
		int var6 = this.indices2[var1]; // L: 1239
		int var7 = this.indices3[var1]; // L: 1240
		int var8 = field2676[var5]; // L: 1241
		int var9 = field2676[var6]; // L: 1242
		int var10 = field2676[var7]; // L: 1243
		if (this.faceAlphas == null) { // L: 1244
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1245
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1246
			field2722[var4] = modelViewportXs[var5]; // L: 1247
			field2667[var4] = modelViewportYs[var5]; // L: 1248
			field2713[var4++] = this.faceColors1[var1]; // L: 1249
		} else {
			var11 = field2711[var5]; // L: 1252
			var12 = field2712[var5]; // L: 1253
			var13 = this.faceColors1[var1]; // L: 1254
			if (var10 >= 50) { // L: 1255
				var14 = field2688[var10 - var8] * (50 - var8); // L: 1256
				field2722[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2711[var7] - var11) * var14 >> 16)) / 50; // L: 1257
				field2667[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2712[var7] - var12) * var14 >> 16)) / 50; // L: 1258
				field2713[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1259
			}

			if (var9 >= 50) { // L: 1261
				var14 = field2688[var9 - var8] * (50 - var8); // L: 1262
				field2722[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2711[var6] - var11) * var14 >> 16)) / 50; // L: 1263
				field2667[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2712[var6] - var12) * var14 >> 16)) / 50; // L: 1264
				field2713[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1265
			}
		}

		if (var9 >= 50) { // L: 1268
			field2722[var4] = modelViewportXs[var6]; // L: 1269
			field2667[var4] = modelViewportYs[var6]; // L: 1270
			field2713[var4++] = this.faceColors2[var1]; // L: 1271
		} else {
			var11 = field2711[var6]; // L: 1274
			var12 = field2712[var6]; // L: 1275
			var13 = this.faceColors2[var1]; // L: 1276
			if (var8 >= 50) { // L: 1277
				var14 = field2688[var8 - var9] * (50 - var9); // L: 1278
				field2722[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2711[var5] - var11) * var14 >> 16)) / 50; // L: 1279
				field2667[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2712[var5] - var12) * var14 >> 16)) / 50; // L: 1280
				field2713[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1281
			}

			if (var10 >= 50) { // L: 1283
				var14 = field2688[var10 - var9] * (50 - var9); // L: 1284
				field2722[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2711[var7] - var11) * var14 >> 16)) / 50; // L: 1285
				field2667[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2712[var7] - var12) * var14 >> 16)) / 50; // L: 1286
				field2713[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1287
			}
		}

		if (var10 >= 50) { // L: 1290
			field2722[var4] = modelViewportXs[var7]; // L: 1291
			field2667[var4] = modelViewportYs[var7]; // L: 1292
			field2713[var4++] = this.faceColors3[var1]; // L: 1293
		} else {
			var11 = field2711[var7]; // L: 1296
			var12 = field2712[var7]; // L: 1297
			var13 = this.faceColors3[var1]; // L: 1298
			if (var9 >= 50) { // L: 1299
				var14 = field2688[var9 - var10] * (50 - var10); // L: 1300
				field2722[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2711[var6] - var11) * var14 >> 16)) / 50; // L: 1301
				field2667[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2712[var6] - var12) * var14 >> 16)) / 50; // L: 1302
				field2713[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1303
			}

			if (var8 >= 50) { // L: 1305
				var14 = field2688[var8 - var10] * (50 - var10); // L: 1306
				field2722[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2711[var5] - var11) * var14 >> 16)) / 50; // L: 1307
				field2667[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2712[var5] - var12) * var14 >> 16)) / 50; // L: 1308
				field2713[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1309
			}
		}

		var11 = field2722[0]; // L: 1312
		var12 = field2722[1]; // L: 1313
		var13 = field2722[2]; // L: 1314
		var14 = field2667[0]; // L: 1315
		int var15 = field2667[1]; // L: 1316
		int var16 = field2667[2]; // L: 1317
		Rasterizer3D.field2502 = false; // L: 1318
		if (var4 == 3) { // L: 1319
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1320
				Rasterizer3D.field2502 = true;
			}

			this.method4721(var1, var14, var15, var16, var11, var12, var13, field2713[0], field2713[1], field2713[2]); // L: 1321
		}

		if (var4 == 4) { // L: 1323
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2722[3] < 0 || field2722[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1324
				Rasterizer3D.field2502 = true;
			}

			int var18;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1325
				int var19;
				int var21;
				if (this.field2702 != null && this.field2702[var1] != -1) { // L: 1350
					int var20 = this.field2702[var1] & 255; // L: 1351
					var21 = this.field2678[var20]; // L: 1352
					var18 = this.field2692[var20]; // L: 1353
					var19 = this.field2693[var20]; // L: 1354
				} else {
					var21 = var5; // L: 1357
					var18 = var6; // L: 1358
					var19 = var7; // L: 1359
				}

				short var22 = this.faceTextures[var1]; // L: 1361
				if (this.faceColors3[var1] == -1) { // L: 1362
					Rasterizer3D.method4329(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2711[var21], field2711[var18], field2711[var19], field2712[var21], field2712[var18], field2712[var19], field2676[var21], field2676[var18], field2676[var19], var22); // L: 1363
					Rasterizer3D.method4329(var14, var16, field2667[3], var11, var13, field2722[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2711[var21], field2711[var18], field2711[var19], field2712[var21], field2712[var18], field2712[var19], field2676[var21], field2676[var18], field2676[var19], var22); // L: 1364
				} else {
					Rasterizer3D.method4329(var14, var15, var16, var11, var12, var13, field2713[0], field2713[1], field2713[2], field2711[var21], field2711[var18], field2711[var19], field2712[var21], field2712[var18], field2712[var19], field2676[var21], field2676[var18], field2676[var19], var22); // L: 1367
					Rasterizer3D.method4329(var14, var16, field2667[3], var11, var13, field2722[3], field2713[0], field2713[2], field2713[3], field2711[var21], field2711[var18], field2711[var19], field2712[var21], field2712[var18], field2712[var19], field2676[var21], field2676[var18], field2676[var19], var22); // L: 1368
				}
			} else {
				boolean var17 = this.method4727(var1); // L: 1326
				if (this.faceColors3[var1] == -1 && var17) { // L: 1327
					var18 = field2680[this.faceColors1[var1]]; // L: 1328
					Rasterizer3D.method4327(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1329
					Rasterizer3D.method4327(var14, var16, field2667[3], var11, var13, field2722[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1330
				} else if (this.faceColors3[var1] == -1) { // L: 1332
					var18 = field2680[this.faceColors1[var1]]; // L: 1333
					Rasterizer3D.method4326(var14, var15, var16, var11, var12, var13, var18); // L: 1334
					Rasterizer3D.method4326(var14, var16, field2667[3], var11, var13, field2722[3], var18); // L: 1335
				} else if (var17) { // L: 1337
					Rasterizer3D.method4323(var14, var15, var16, var11, var12, var13, field2713[0], field2713[1], field2713[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1338
					Rasterizer3D.method4323(var14, var16, field2667[3], var11, var13, field2722[3], field2713[0], field2713[2], field2713[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1339
				} else {
					Rasterizer3D.method4340(var14, var15, var16, var11, var12, var13, field2713[0], field2713[1], field2713[2]); // L: 1342
					Rasterizer3D.method4340(var14, var16, field2667[3], var11, var13, field2722[3], field2713[0], field2713[2], field2713[3]); // L: 1343
				}
			}
		}

	} // L: 1372

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILoj;)V"
	)
	void method4690(int var1, class410 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1375
		float var4 = (float)(-this.verticesY[var1]); // L: 1376
		float var5 = (float)(-this.verticesZ[var1]); // L: 1377
		float var6 = 1.0F; // L: 1378
		this.verticesX[var1] = (int)(var2.field4612[0] * var3 + var2.field4612[4] * var4 + var2.field4612[8] * var5 + var2.field4612[12] * var6); // L: 1379
		this.verticesY[var1] = -((int)(var2.field4612[1] * var3 + var2.field4612[5] * var4 + var2.field4612[9] * var5 + var2.field4612[13] * var6)); // L: 1380
		this.verticesZ[var1] = -((int)(var2.field4612[2] * var3 + var2.field4612[6] * var4 + var2.field4612[10] * var5 + var2.field4612[14] * var6)); // L: 1381
	} // L: 1382

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhi;I)V"
	)
	void method4701(class213 var1, int var2) {
		if (this.field2696 != null) { // L: 1385
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1386
				int[] var4 = this.field2696[var3]; // L: 1387
				if (var4 != null && var4.length != 0) { // L: 1388
					int[] var5 = this.field2697[var3]; // L: 1389
					field2671.method7783(); // L: 1390

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1391
						int var7 = var4[var6]; // L: 1392
						class123 var8 = var1.method4401(var7); // L: 1393
						if (var8 != null) { // L: 1394
							field2672.method7785((float)var5[var6] / 255.0F); // L: 1395
							field2673.method7784(var8.method2904(var2)); // L: 1396
							field2673.method7788(field2672); // L: 1397
							field2671.method7830(field2673); // L: 1398
						}
					}

					this.method4690(var3, field2671); // L: 1400
				}
			}

		}
	} // L: 1402

	@ObfuscatedName("dn")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 818
			this.calculateBoundsCylinder();
		}

		this.method4764(var1); // L: 819
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 820
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 821
		int var13 = var3 * this.xzRadius >> 16; // L: 822
		int var14 = var12 + var13; // L: 823
		if (var14 > 50 && var12 < 3500) { // L: 824
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 825
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 826
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) { // L: 827
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 828
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) { // L: 829
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 830
					int var19 = var2 * this.xzRadius >> 16; // L: 831
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 832
					int var21 = (var18 + var20) * Rasterizer3D.Rasterizer3D_zoom; // L: 833
					if (var21 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) { // L: 834
						int var22 = (var3 * super.height >> 16) + var19; // L: 835
						int var23 = (var18 - var22) * Rasterizer3D.Rasterizer3D_zoom; // L: 836
						if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) { // L: 837
							int var24 = var13 + (var2 * super.height >> 16); // L: 838
							boolean var25 = false; // L: 839
							boolean var26 = false; // L: 840
							if (var12 - var24 <= 50) { // L: 841
								var26 = true;
							}

							boolean var27 = var26 || this.field2723 > 0; // L: 842
							int var28 = ViewportMouse.ViewportMouse_x; // L: 845
							int var30 = ViewportMouse.ViewportMouse_y; // L: 850
							boolean var32 = WorldMapElement.method3564(); // L: 853
							boolean var33 = var9 != 0L && !class272.method5474(var9); // L: 856
							boolean var35 = false; // L: 859
							int var39;
							int var40;
							int var41;
							int var42;
							int var51;
							int var55;
							int var56;
							int var57;
							if (var33 && var32) { // L: 860
								boolean var36 = false; // L: 861
								if (field2728) { // L: 862
									boolean var37;
									if (!WorldMapElement.method3564()) { // L: 866
										var37 = false; // L: 867
									} else {
										int var45;
										int var46;
										int var47;
										int var48;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 871
											var39 = Scene.Scene_cameraPitchSine; // L: 872
											var40 = Scene.Scene_cameraPitchCosine; // L: 873
											var41 = Scene.Scene_cameraYawSine; // L: 874
											var42 = Scene.Scene_cameraYawCosine; // L: 875
											byte var43 = 50; // L: 876
											short var44 = 3500; // L: 877
											var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var43 / Rasterizer3D.Rasterizer3D_zoom; // L: 878
											var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var43 / Rasterizer3D.Rasterizer3D_zoom; // L: 879
											var47 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var44 / Rasterizer3D.Rasterizer3D_zoom; // L: 880
											var48 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var44 / Rasterizer3D.Rasterizer3D_zoom; // L: 881
											int var49 = Rasterizer3D.method4333(var46, var43, var40, var39); // L: 883
											var56 = Rasterizer3D.method4339(var46, var43, var40, var39); // L: 884
											var46 = var49; // L: 885
											var49 = Rasterizer3D.method4333(var48, var44, var40, var39); // L: 886
											var57 = Rasterizer3D.method4339(var48, var44, var40, var39); // L: 887
											var48 = var49; // L: 888
											var49 = Rasterizer3D.method4336(var45, var56, var42, var41); // L: 889
											var56 = Rasterizer3D.method4337(var45, var56, var42, var41); // L: 890
											var45 = var49; // L: 891
											var49 = Rasterizer3D.method4336(var47, var57, var42, var41); // L: 892
											var57 = Rasterizer3D.method4337(var47, var57, var42, var41); // L: 893
											class358.field4347 = (var49 + var45) / 2; // L: 895
											ViewportMouse.field2746 = (var48 + var46) / 2; // L: 896
											class133.field1637 = (var56 + var57) / 2; // L: 897
											class299.field3458 = (var49 - var45) / 2; // L: 898
											class32.field191 = (var48 - var46) / 2; // L: 899
											ViewportMouse.field2747 = (var57 - var56) / 2; // L: 900
											ViewportMouse.field2749 = Math.abs(class299.field3458); // L: 901
											SoundCache.field350 = Math.abs(class32.field191); // L: 902
											ViewportMouse.field2742 = Math.abs(ViewportMouse.field2747); // L: 903
										}

										class216 var50 = (class216)this.field2704.get(var1); // L: 905
										var40 = var50.field2600 + var6; // L: 906
										var41 = var7 + var50.field2596; // L: 907
										var42 = var8 + var50.field2597; // L: 908
										var56 = var50.field2598; // L: 909
										var57 = var50.field2599; // L: 910
										var45 = var50.field2595; // L: 911
										var46 = class358.field4347 - var40; // L: 912
										var47 = ViewportMouse.field2746 - var41; // L: 913
										var48 = class133.field1637 - var42; // L: 914
										if (Math.abs(var46) > var56 + ViewportMouse.field2749) { // L: 915
											var37 = false; // L: 916
										} else if (Math.abs(var47) > var57 + SoundCache.field350) { // L: 919
											var37 = false; // L: 920
										} else if (Math.abs(var48) > var45 + ViewportMouse.field2742) { // L: 923
											var37 = false; // L: 924
										} else if (Math.abs(var48 * class32.field191 - var47 * ViewportMouse.field2747) > var45 * SoundCache.field350 + var57 * ViewportMouse.field2742) { // L: 927
											var37 = false; // L: 928
										} else if (Math.abs(var46 * ViewportMouse.field2747 - var48 * class299.field3458) > var56 * ViewportMouse.field2742 + var45 * ViewportMouse.field2749) { // L: 931
											var37 = false; // L: 932
										} else if (Math.abs(var47 * class299.field3458 - var46 * class32.field191) > var56 * SoundCache.field350 + var57 * ViewportMouse.field2749) { // L: 935
											var37 = false; // L: 936
										} else {
											var37 = true; // L: 939
										}
									}

									var36 = var37; // L: 941
								} else {
									var55 = var12 - var13; // L: 944
									if (var55 <= 50) { // L: 945
										var55 = 50;
									}

									if (var15 > 0) { // L: 946
										var16 /= var14; // L: 947
										var17 /= var55; // L: 948
									} else {
										var17 /= var14; // L: 951
										var16 /= var55; // L: 952
									}

									if (var18 > 0) { // L: 954
										var23 /= var14; // L: 955
										var21 /= var55; // L: 956
									} else {
										var21 /= var14; // L: 959
										var23 /= var55; // L: 960
									}

									var51 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 962
									var39 = var30 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 963
									if (var51 > var16 && var51 < var17 && var39 > var23 && var39 < var21) { // L: 964
										var36 = true; // L: 965
									}
								}

								if (var36) { // L: 968
									if (this.isSingleTile) { // L: 969
										class338.method6605(var9);
									} else {
										var35 = true; // L: 970
									}
								}
							}

							int var54 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 973
							var55 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 974
							var51 = 0; // L: 975
							var39 = 0; // L: 976
							if (var1 != 0) { // L: 977
								var51 = field2710[var1]; // L: 978
								var39 = field2732[var1]; // L: 979
							}

							for (var40 = 0; var40 < this.verticesCount; ++var40) { // L: 981
								var41 = this.verticesX[var40]; // L: 982
								var42 = this.verticesY[var40]; // L: 983
								var56 = this.verticesZ[var40]; // L: 984
								if (var1 != 0) { // L: 985
									var57 = var56 * var51 + var41 * var39 >> 16; // L: 986
									var56 = var56 * var39 - var41 * var51 >> 16; // L: 987
									var41 = var57; // L: 988
								}

								var41 += var6; // L: 990
								var42 += var7; // L: 991
								var56 += var8; // L: 992
								var57 = var56 * var4 + var5 * var41 >> 16; // L: 993
								var56 = var5 * var56 - var41 * var4 >> 16; // L: 994
								var41 = var57; // L: 995
								var57 = var3 * var42 - var56 * var2 >> 16; // L: 996
								var56 = var42 * var2 + var3 * var56 >> 16; // L: 997
								field2675[var40] = var56 - var12; // L: 999
								if (var56 >= 50) { // L: 1000
									modelViewportXs[var40] = var41 * Rasterizer3D.Rasterizer3D_zoom / var56 + var54; // L: 1001
									modelViewportYs[var40] = var57 * Rasterizer3D.Rasterizer3D_zoom / var56 + var55; // L: 1002
								} else {
									modelViewportXs[var40] = -5000; // L: 1005
									var25 = true; // L: 1006
								}

								if (var27) { // L: 1008
									field2711[var40] = var41; // L: 1009
									field2712[var40] = var57; // L: 1010
									field2676[var40] = var56; // L: 1011
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9); // L: 1015
							} catch (Exception var53) { // L: 1017
							}

						}
					}
				}
			}
		}
	} // L: 1018
}
