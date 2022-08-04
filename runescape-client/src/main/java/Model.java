import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("q")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("u")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static class388 field2504;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static class388 field2571;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static class388 field2576;
	@ObfuscatedName("av")
	static boolean[] field2540;
	@ObfuscatedName("ae")
	static boolean[] field2543;
	@ObfuscatedName("ay")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ak")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ao")
	static int[] field2553;
	@ObfuscatedName("am")
	static int[] field2549;
	@ObfuscatedName("ad")
	static int[] field2579;
	@ObfuscatedName("az")
	static int[] field2551;
	@ObfuscatedName("bs")
	static char[] field2539;
	@ObfuscatedName("bg")
	static char[][] field2554;
	@ObfuscatedName("bv")
	static int[] field2555;
	@ObfuscatedName("ba")
	static int[][] field2556;
	@ObfuscatedName("bd")
	static int[] field2557;
	@ObfuscatedName("bf")
	static int[] field2565;
	@ObfuscatedName("bu")
	static int[] field2559;
	@ObfuscatedName("bk")
	static int[] field2560;
	@ObfuscatedName("bq")
	static int[] field2561;
	@ObfuscatedName("bj")
	static int[] field2562;
	@ObfuscatedName("bt")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bp")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("br")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("be")
	static boolean field2566;
	@ObfuscatedName("by")
	static int[] field2569;
	@ObfuscatedName("bh")
	static int[] field2506;
	@ObfuscatedName("bc")
	static int[] field2564;
	@ObfuscatedName("bo")
	static int[] field2572;
	@ObfuscatedName("j")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("h")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("a")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("d")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("n")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("x")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("g")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("p")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("b")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("l")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("y")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("k")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("v")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("t")
	byte[] field2538;
	@ObfuscatedName("e")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("s")
	byte field2541;
	@ObfuscatedName("i")
	int field2523;
	@ObfuscatedName("r")
	int[] field2524;
	@ObfuscatedName("m")
	int[] field2525;
	@ObfuscatedName("ag")
	int[] field2526;
	@ObfuscatedName("ar")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("aj")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("au")
	int[][] field2529;
	@ObfuscatedName("af")
	int[][] field2530;
	@ObfuscatedName("as")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ab")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("al")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ah")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("ai")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ac")
	@Export("radius")
	int radius;
	@ObfuscatedName("ap")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("aw")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("at")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("aq")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ax")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("an")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("bl")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bn")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bi")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("ch")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cd")
	public short field2516;

	static {
		Model_sharedSequenceModel = new Model(); // L: 11
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 12
		Model_sharedSpotAnimationModel = new Model(); // L: 13
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 14
		field2504 = new class388(); // L: 15
		field2571 = new class388(); // L: 16
		field2576 = new class388(); // L: 17
		field2540 = new boolean[6500]; // L: 58
		field2543 = new boolean[6500]; // L: 59
		modelViewportXs = new int[6500]; // L: 60
		modelViewportYs = new int[6500]; // L: 61
		field2553 = new int[6500]; // L: 62
		field2549 = new int[6500]; // L: 63
		field2579 = new int[6500]; // L: 64
		field2551 = new int[6500]; // L: 65
		field2539 = new char[6000]; // L: 67
		field2554 = new char[6000][512]; // L: 68
		field2555 = new int[12]; // L: 69
		field2556 = new int[12][2000]; // L: 70
		field2557 = new int[2000]; // L: 71
		field2565 = new int[2000]; // L: 72
		field2559 = new int[12]; // L: 73
		field2560 = new int[10]; // L: 74
		field2561 = new int[10]; // L: 75
		field2562 = new int[10]; // L: 76
		field2566 = true; // L: 80
		field2569 = Rasterizer3D.Rasterizer3D_sine; // L: 83
		field2506 = Rasterizer3D.Rasterizer3D_cosine; // L: 84
		field2564 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 85
		field2572 = Rasterizer3D.field2352; // L: 86
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2541 = 0;
		this.field2523 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 95

	@ObfuscatedSignature(
		descriptor = "([Lhd;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 18
		this.indicesCount = 0; // L: 22
		this.field2541 = 0; // L: 33
		this.field2523 = 0; // L: 34
		this.isSingleTile = false; // L: 42
		this.xMidOffset = -1; // L: 51
		this.yMidOffset = -1; // L: 52
		this.zMidOffset = -1; // L: 53
		boolean var3 = false; // L: 98
		boolean var4 = false; // L: 99
		boolean var5 = false; // L: 100
		boolean var6 = false; // L: 101
		this.verticesCount = 0; // L: 102
		this.indicesCount = 0; // L: 103
		this.field2523 = 0; // L: 104
		this.field2541 = -1; // L: 105

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 106
			var8 = var1[var7]; // L: 107
			if (var8 != null) { // L: 108
				this.verticesCount += var8.verticesCount; // L: 109
				this.indicesCount += var8.indicesCount; // L: 110
				this.field2523 += var8.field2523; // L: 111
				if (var8.faceRenderPriorities != null) { // L: 112
					var3 = true;
				} else {
					if (this.field2541 == -1) { // L: 114
						this.field2541 = var8.field2541;
					}

					if (this.field2541 != var8.field2541) { // L: 115
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 117
				var5 |= var8.faceTextures != null; // L: 118
				var6 |= var8.field2538 != null; // L: 119
			}
		}

		this.verticesX = new int[this.verticesCount]; // L: 122
		this.verticesY = new int[this.verticesCount]; // L: 123
		this.verticesZ = new int[this.verticesCount]; // L: 124
		this.indices1 = new int[this.indicesCount]; // L: 125
		this.indices2 = new int[this.indicesCount]; // L: 126
		this.indices3 = new int[this.indicesCount]; // L: 127
		this.faceColors1 = new int[this.indicesCount]; // L: 128
		this.faceColors2 = new int[this.indicesCount]; // L: 129
		this.faceColors3 = new int[this.indicesCount]; // L: 130
		if (var3) { // L: 131
			this.faceRenderPriorities = new byte[this.indicesCount];
		}

		if (var4) { // L: 132
			this.faceAlphas = new byte[this.indicesCount];
		}

		if (var5) { // L: 133
			this.faceTextures = new short[this.indicesCount];
		}

		if (var6) { // L: 134
			this.field2538 = new byte[this.indicesCount];
		}

		if (this.field2523 > 0) { // L: 135
			this.field2524 = new int[this.field2523]; // L: 136
			this.field2525 = new int[this.field2523]; // L: 137
			this.field2526 = new int[this.field2523]; // L: 138
		}

		this.verticesCount = 0; // L: 140
		this.indicesCount = 0; // L: 141
		this.field2523 = 0; // L: 142

		for (var7 = 0; var7 < var2; ++var7) { // L: 143
			var8 = var1[var7]; // L: 144
			if (var8 != null) { // L: 145
				int var9;
				for (var9 = 0; var9 < var8.indicesCount; ++var9) { // L: 146
					this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9]; // L: 147
					this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9]; // L: 148
					this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9]; // L: 149
					this.faceColors1[this.indicesCount] = var8.faceColors1[var9]; // L: 150
					this.faceColors2[this.indicesCount] = var8.faceColors2[var9]; // L: 151
					this.faceColors3[this.indicesCount] = var8.faceColors3[var9]; // L: 152
					if (var3) { // L: 153
						if (var8.faceRenderPriorities != null) { // L: 154
							this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
						} else {
							this.faceRenderPriorities[this.indicesCount] = var8.field2541; // L: 155
						}
					}

					if (var4 && var8.faceAlphas != null) { // L: 157 158
						this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
					}

					if (var5) { // L: 160
						if (var8.faceTextures != null) { // L: 161
							this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
						} else {
							this.faceTextures[this.indicesCount] = -1; // L: 162
						}
					}

					if (var6) { // L: 164
						if (var8.field2538 != null && var8.field2538[var9] != -1) { // L: 165
							this.field2538[this.indicesCount] = (byte)(this.field2523 + var8.field2538[var9]);
						} else {
							this.field2538[this.indicesCount] = -1; // L: 166
						}
					}

					++this.indicesCount; // L: 168
				}

				for (var9 = 0; var9 < var8.field2523; ++var9) { // L: 170
					this.field2524[this.field2523] = this.verticesCount + var8.field2524[var9]; // L: 171
					this.field2525[this.field2523] = this.verticesCount + var8.field2525[var9]; // L: 172
					this.field2526[this.field2523] = this.verticesCount + var8.field2526[var9]; // L: 173
					++this.field2523; // L: 174
				}

				for (var9 = 0; var9 < var8.verticesCount; ++var9) { // L: 176
					this.verticesX[this.verticesCount] = var8.verticesX[var9]; // L: 177
					this.verticesY[this.verticesCount] = var8.verticesY[var9]; // L: 178
					this.verticesZ[this.verticesCount] = var8.verticesZ[var9]; // L: 179
					++this.verticesCount; // L: 180
				}
			}
		}

	} // L: 184

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhd;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder(); // L: 187
		int var7 = var2 - this.xzRadius; // L: 188
		int var8 = var2 + this.xzRadius; // L: 189
		int var9 = var4 - this.xzRadius; // L: 190
		int var10 = var4 + this.xzRadius; // L: 191
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 192
			var7 >>= 7; // L: 193
			var8 = var8 + 127 >> 7; // L: 194
			var9 >>= 7; // L: 195
			var10 = var10 + 127 >> 7; // L: 196
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 197
				return this;
			} else {
				Model var11;
				if (var5) { // L: 199
					var11 = new Model(); // L: 200
					var11.verticesCount = this.verticesCount; // L: 201
					var11.indicesCount = this.indicesCount; // L: 202
					var11.field2523 = this.field2523; // L: 203
					var11.verticesX = this.verticesX; // L: 204
					var11.verticesZ = this.verticesZ; // L: 205
					var11.indices1 = this.indices1; // L: 206
					var11.indices2 = this.indices2; // L: 207
					var11.indices3 = this.indices3; // L: 208
					var11.faceColors1 = this.faceColors1; // L: 209
					var11.faceColors2 = this.faceColors2; // L: 210
					var11.faceColors3 = this.faceColors3; // L: 211
					var11.faceRenderPriorities = this.faceRenderPriorities; // L: 212
					var11.faceAlphas = this.faceAlphas; // L: 213
					var11.field2538 = this.field2538; // L: 214
					var11.faceTextures = this.faceTextures; // L: 215
					var11.field2541 = this.field2541; // L: 216
					var11.field2524 = this.field2524; // L: 217
					var11.field2525 = this.field2525; // L: 218
					var11.field2526 = this.field2526; // L: 219
					var11.vertexLabels = this.vertexLabels; // L: 220
					var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 221
					var11.isSingleTile = this.isSingleTile; // L: 222
					var11.verticesY = new int[var11.verticesCount]; // L: 223
				} else {
					var11 = this; // L: 226
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
				if (var6 == 0) { // L: 228
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 229
						var13 = var2 + this.verticesX[var12]; // L: 230
						var14 = var4 + this.verticesZ[var12]; // L: 231
						var15 = var13 & 127; // L: 232
						var16 = var14 & 127; // L: 233
						var17 = var13 >> 7; // L: 234
						var18 = var14 >> 7; // L: 235
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 236
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 237
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 238
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 239
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 243
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 244
						if (var13 < var6) { // L: 245
							var14 = var2 + this.verticesX[var12]; // L: 246
							var15 = var4 + this.verticesZ[var12]; // L: 247
							var16 = var14 & 127; // L: 248
							var17 = var15 & 127; // L: 249
							var18 = var14 >> 7; // L: 250
							var19 = var15 >> 7; // L: 251
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 252
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 253
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 254
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 255
						}
					}
				}

				var11.resetBounds(); // L: 259
				return var11; // L: 260
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhd;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 264
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 265
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhd;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 269
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 270
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZLhd;[B)Lhd;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 274
		var2.indicesCount = this.indicesCount; // L: 275
		var2.field2523 = this.field2523; // L: 276
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) { // L: 277
			var2.verticesX = new int[this.verticesCount + 100]; // L: 278
			var2.verticesY = new int[this.verticesCount + 100]; // L: 279
			var2.verticesZ = new int[this.verticesCount + 100]; // L: 280
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) { // L: 282
			var2.verticesX[var4] = this.verticesX[var4]; // L: 283
			var2.verticesY[var4] = this.verticesY[var4]; // L: 284
			var2.verticesZ[var4] = this.verticesZ[var4]; // L: 285
		}

		if (var1) { // L: 287
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3; // L: 289
			if (this.faceAlphas == null) { // L: 290
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 291
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 294
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1; // L: 297
		var2.indices2 = this.indices2; // L: 298
		var2.indices3 = this.indices3; // L: 299
		var2.faceColors1 = this.faceColors1; // L: 300
		var2.faceColors2 = this.faceColors2; // L: 301
		var2.faceColors3 = this.faceColors3; // L: 302
		var2.faceRenderPriorities = this.faceRenderPriorities; // L: 303
		var2.field2538 = this.field2538; // L: 304
		var2.faceTextures = this.faceTextures; // L: 305
		var2.field2541 = this.field2541; // L: 306
		var2.field2524 = this.field2524; // L: 307
		var2.field2525 = this.field2525; // L: 308
		var2.field2526 = this.field2526; // L: 309
		var2.vertexLabels = this.vertexLabels; // L: 310
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 311
		var2.field2529 = this.field2529; // L: 312
		var2.field2530 = this.field2530; // L: 313
		var2.isSingleTile = this.isSingleTile; // L: 314
		var2.resetBounds(); // L: 315
		var2.overrideAmount = 0; // L: 316
		return var2; // L: 317
	}

	@ObfuscatedName("z")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) { // L: 321
			int var2 = 0; // L: 322
			int var3 = 0; // L: 323
			int var4 = 0; // L: 324
			int var5 = 0; // L: 325
			int var6 = 0; // L: 326
			int var7 = 0; // L: 327
			int var8 = field2506[var1]; // L: 328
			int var9 = field2569[var1]; // L: 329

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 330
				int var11 = Rasterizer3D.method4021(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 331
				int var12 = this.verticesY[var10]; // L: 332
				int var13 = Rasterizer3D.method4014(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 333
				if (var11 < var2) { // L: 334
					var2 = var11;
				}

				if (var11 > var5) { // L: 335
					var5 = var11;
				}

				if (var12 < var3) { // L: 336
					var3 = var12;
				}

				if (var12 > var6) { // L: 337
					var6 = var12;
				}

				if (var13 < var4) { // L: 338
					var4 = var13;
				}

				if (var13 > var7) { // L: 339
					var7 = var13;
				}
			}

			this.xMid = (var5 + var2) / 2; // L: 341
			this.yMid = (var6 + var3) / 2; // L: 342
			this.zMid = (var7 + var4) / 2; // L: 343
			this.xMidOffset = (var5 - var2 + 1) / 2; // L: 344
			this.yMidOffset = (var6 - var3 + 1) / 2; // L: 345
			this.zMidOffset = (var7 - var4 + 1) / 2; // L: 346
			boolean var14 = true; // L: 347
			if (this.xMidOffset < 32) { // L: 348
				this.xMidOffset = 32;
			}

			if (this.zMidOffset < 32) { // L: 349
				this.zMidOffset = 32;
			}

			if (this.isSingleTile) { // L: 350
				boolean var15 = true; // L: 351
				this.xMidOffset += 8; // L: 352
				this.zMidOffset += 8; // L: 353
			}

		}
	} // L: 355

	@ObfuscatedName("j")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 358
			this.boundsType = 1; // L: 359
			super.height = 0; // L: 360
			this.bottomY = 0; // L: 361
			this.xzRadius = 0; // L: 362

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 363
				int var2 = this.verticesX[var1]; // L: 364
				int var3 = this.verticesY[var1]; // L: 365
				int var4 = this.verticesZ[var1]; // L: 366
				if (-var3 > super.height) { // L: 367
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 368
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 369
				if (var5 > this.xzRadius) { // L: 370
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 372
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 373
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 374
		}
	} // L: 375

	@ObfuscatedName("h")
	void method4349() {
		if (this.boundsType != 2) { // L: 378
			this.boundsType = 2; // L: 379
			this.xzRadius = 0; // L: 380

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 381
				int var2 = this.verticesX[var1]; // L: 382
				int var3 = this.verticesY[var1]; // L: 383
				int var4 = this.verticesZ[var1]; // L: 384
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 385
				if (var5 > this.xzRadius) { // L: 386
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 388
			this.radius = this.xzRadius; // L: 389
			this.diameter = this.xzRadius + this.xzRadius; // L: 390
		}
	} // L: 391

	@ObfuscatedName("a")
	public int method4350() {
		this.calculateBoundsCylinder(); // L: 394
		return this.xzRadius; // L: 395
	}

	@ObfuscatedName("d")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 399
		this.xMidOffset = -1; // L: 400
	} // L: 401

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgz;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 404
			if (var2 != -1) { // L: 405
				Animation var3 = var1.frames[var2]; // L: 406
				Skeleton var4 = var3.skeleton; // L: 407
				Model_transformTempX = 0; // L: 408
				Model_transformTempY = 0; // L: 409
				Model_transformTempZ = 0; // L: 410

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 411
					int var6 = var3.transformSkeletonLabels[var5]; // L: 412
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 413
				}

				this.resetBounds(); // L: 415
			}
		}
	} // L: 416

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V"
	)
	public void method4372(class122 var1, int var2) {
		Skeleton var3 = var1.field1498; // L: 419
		class201 var4 = var3.method4103(); // L: 420
		if (var4 != null) { // L: 421
			var3.method4103().method4084(var1, var2); // L: 422
			this.method4355(var3.method4103(), var1.method2827()); // L: 423
		}

		if (var1.method2828()) { // L: 425
			this.method4393(var1, var2); // L: 426
		}

		this.resetBounds(); // L: 428
	} // L: 429

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V"
	)
	void method4393(class122 var1, int var2) {
		Skeleton var3 = var1.field1498; // L: 432

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 433
			int var5 = var3.transformTypes[var4]; // L: 434
			if (var5 == 5 && var1.field1495 != null && var1.field1495[var4] != null && var1.field1495[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 435 436
				class117 var6 = var1.field1495[var4][0]; // L: 437
				int[] var7 = var3.labels[var4]; // L: 438
				int var8 = var7.length; // L: 439

				for (int var9 = 0; var9 < var8; ++var9) { // L: 440
					int var10 = var7[var9]; // L: 441
					if (var10 < this.faceLabelsAlpha.length) { // L: 442
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 443

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 444
							int var13 = var11[var12]; // L: 445
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2777(var2) * 255.0F); // L: 446
							if (var14 < 0) { // L: 447
								var14 = 0;
							} else if (var14 > 255) { // L: 448
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 449
						}
					}
				}
			}
		}

	} // L: 456

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V"
	)
	void method4355(class201 var1, int var2) {
		this.method4345(var1, var2); // L: 460
	} // L: 462

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgz;ILgz;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 465
			if (var5 != null && var4 != -1) { // L: 466
				Animation var6 = var1.frames[var2]; // L: 470
				Animation var7 = var3.frames[var4]; // L: 471
				Skeleton var8 = var6.skeleton; // L: 472
				Model_transformTempX = 0; // L: 473
				Model_transformTempY = 0; // L: 474
				Model_transformTempZ = 0; // L: 475
				byte var9 = 0; // L: 476
				int var13 = var9 + 1; // L: 477
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 478
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 479 480
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 481
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 483
				Model_transformTempY = 0; // L: 484
				Model_transformTempZ = 0; // L: 485
				var9 = 0; // L: 486
				var13 = var9 + 1; // L: 487
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 488
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 489 490
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 491
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 493
			} else {
				this.animate(var1, var2); // L: 467
			}
		}
	} // L: 468 494

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgn;Ldj;I[ZZZ)V"
	)
	public void method4352(Skeleton var1, class122 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class201 var7 = var1.method4103(); // L: 497
		if (var7 != null) { // L: 498
			var7.method4085(var2, var3, var4, var5); // L: 499
			if (var6) { // L: 500
				this.method4355(var7, var2.method2827()); // L: 501
			}
		}

		if (!var5 && var2.method2828()) { // L: 504
			this.method4393(var2, var3); // L: 505
		}

	} // L: 507

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lgz;I[IZ)V"
	)
	public void method4441(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 510
			this.animate(var1, var2); // L: 511
		} else {
			Animation var5 = var1.frames[var2]; // L: 514
			Skeleton var6 = var5.skeleton; // L: 515
			byte var7 = 0; // L: 516
			int var11 = var7 + 1; // L: 517
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 518
			Model_transformTempY = 0; // L: 519
			Model_transformTempZ = 0; // L: 520

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 521
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 522 523
				}

				if (var4) { // L: 524
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 525
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 528
				}
			}

		}
	} // L: 512 531

	@ObfuscatedName("k")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 534
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 535
			var7 = 0; // L: 536
			Model_transformTempX = 0; // L: 537
			Model_transformTempY = 0; // L: 538
			Model_transformTempZ = 0; // L: 539

			for (var8 = 0; var8 < var6; ++var8) { // L: 540
				int var18 = var2[var8]; // L: 541
				if (var18 < this.vertexLabels.length) { // L: 542
					int[] var19 = this.vertexLabels[var18]; // L: 543

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 544
						var12 = var19[var11]; // L: 545
						Model_transformTempX += this.verticesX[var12]; // L: 546
						Model_transformTempY += this.verticesY[var12]; // L: 547
						Model_transformTempZ += this.verticesZ[var12]; // L: 548
						++var7; // L: 549
					}
				}
			}

			if (var7 > 0) { // L: 553
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 554
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 555
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 556
			} else {
				Model_transformTempX = var3; // L: 559
				Model_transformTempY = var4; // L: 560
				Model_transformTempZ = var5; // L: 561
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 565
				for (var7 = 0; var7 < var6; ++var7) { // L: 566
					var8 = var2[var7]; // L: 567
					if (var8 < this.vertexLabels.length) { // L: 568
						var9 = this.vertexLabels[var8]; // L: 569

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 570
							var11 = var9[var10]; // L: 571
							var10000 = this.verticesX; // L: 572
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 573
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 574
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 580
				for (var7 = 0; var7 < var6; ++var7) { // L: 581
					var8 = var2[var7]; // L: 582
					if (var8 < this.vertexLabels.length) { // L: 583
						var9 = this.vertexLabels[var8]; // L: 584

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 585
							var11 = var9[var10]; // L: 586
							var10000 = this.verticesX; // L: 587
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 588
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 589
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 590
							int var13 = (var4 & 255) * 8; // L: 591
							int var14 = (var5 & 255) * 8; // L: 592
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 593
								var15 = field2569[var14]; // L: 594
								var16 = field2506[var14]; // L: 595
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 596
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 597
								this.verticesX[var11] = var17; // L: 598
							}

							if (var12 != 0) { // L: 600
								var15 = field2569[var12]; // L: 601
								var16 = field2506[var12]; // L: 602
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 603
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 604
								this.verticesY[var11] = var17; // L: 605
							}

							if (var13 != 0) { // L: 607
								var15 = field2569[var13]; // L: 608
								var16 = field2506[var13]; // L: 609
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 610
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 611
								this.verticesX[var11] = var17; // L: 612
							}

							var10000 = this.verticesX; // L: 614
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 615
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 616
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 622
				for (var7 = 0; var7 < var6; ++var7) { // L: 623
					var8 = var2[var7]; // L: 624
					if (var8 < this.vertexLabels.length) { // L: 625
						var9 = this.vertexLabels[var8]; // L: 626

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 627
							var11 = var9[var10]; // L: 628
							var10000 = this.verticesX; // L: 629
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 630
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 631
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 632
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 633
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 634
							var10000 = this.verticesX; // L: 635
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 636
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 637
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 643
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 644
					for (var7 = 0; var7 < var6; ++var7) { // L: 645
						var8 = var2[var7]; // L: 646
						if (var8 < this.faceLabelsAlpha.length) { // L: 647
							var9 = this.faceLabelsAlpha[var8]; // L: 648

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 649
								var11 = var9[var10]; // L: 650
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 651
								if (var12 < 0) { // L: 652
									var12 = 0;
								} else if (var12 > 255) { // L: 653
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 654
							}
						}
					}
				}

			}
		}
	} // L: 563 578 620 641 659 661

	@ObfuscatedName("v")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 664
			int var2 = this.verticesX[var1]; // L: 665
			this.verticesX[var1] = this.verticesZ[var1]; // L: 666
			this.verticesZ[var1] = -var2; // L: 667
		}

		this.resetBounds(); // L: 669
	} // L: 670

	@ObfuscatedName("t")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 673
			this.verticesX[var1] = -this.verticesX[var1]; // L: 674
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 675
		}

		this.resetBounds(); // L: 677
	} // L: 678

	@ObfuscatedName("e")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 681
			int var2 = this.verticesZ[var1]; // L: 682
			this.verticesZ[var1] = this.verticesX[var1]; // L: 683
			this.verticesX[var1] = -var2; // L: 684
		}

		this.resetBounds(); // L: 686
	} // L: 687

	@ObfuscatedName("s")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2569[var1]; // L: 690
		int var3 = field2506[var1]; // L: 691

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 692
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 693
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 694
			this.verticesY[var4] = var5; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("i")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 701
			int[] var10000 = this.verticesX; // L: 702
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 703
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 704
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 706
	} // L: 707

	@ObfuscatedName("r")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 710
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 711
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 712
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 713
		}

		this.resetBounds(); // L: 715
	} // L: 716

	@ObfuscatedName("m")
	public final void method4366(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 719
			this.method4349();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 720
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 721
		int var10 = field2569[var1]; // L: 722
		int var11 = field2506[var1]; // L: 723
		int var12 = field2569[var2]; // L: 724
		int var13 = field2506[var2]; // L: 725
		int var14 = field2569[var3]; // L: 726
		int var15 = field2506[var3]; // L: 727
		int var16 = field2569[var4]; // L: 728
		int var17 = field2506[var4]; // L: 729
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 730

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 731
			int var20 = this.verticesX[var19]; // L: 732
			int var21 = this.verticesY[var19]; // L: 733
			int var22 = this.verticesZ[var19]; // L: 734
			int var23;
			if (var3 != 0) { // L: 735
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 736
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 737
				var20 = var23; // L: 738
			}

			if (var1 != 0) { // L: 740
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 741
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 742
				var21 = var23; // L: 743
			}

			if (var2 != 0) { // L: 745
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 746
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 747
				var20 = var23; // L: 748
			}

			var20 += var5; // L: 750
			var21 += var6; // L: 751
			var22 += var7; // L: 752
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 753
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 754
			field2553[var19] = var22 - var18; // L: 756
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 757
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 758
			if (this.field2523 > 0) { // L: 759
				field2549[var19] = var20; // L: 760
				field2579[var19] = var23; // L: 761
				field2551[var19] = var22; // L: 762
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 766
		} catch (Exception var25) { // L: 768
		}

	} // L: 769

	@ObfuscatedName("ag")
	public final void method4367(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 772
			this.method4349();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 773
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 774
		int var11 = field2569[var1]; // L: 775
		int var12 = field2506[var1]; // L: 776
		int var13 = field2569[var2]; // L: 777
		int var14 = field2506[var2]; // L: 778
		int var15 = field2569[var3]; // L: 779
		int var16 = field2506[var3]; // L: 780
		int var17 = field2569[var4]; // L: 781
		int var18 = field2506[var4]; // L: 782
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 783

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 784
			int var21 = this.verticesX[var20]; // L: 785
			int var22 = this.verticesY[var20]; // L: 786
			int var23 = this.verticesZ[var20]; // L: 787
			int var24;
			if (var3 != 0) { // L: 788
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 789
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 790
				var21 = var24; // L: 791
			}

			if (var1 != 0) { // L: 793
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 794
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 795
				var22 = var24; // L: 796
			}

			if (var2 != 0) { // L: 798
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 799
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 800
				var21 = var24; // L: 801
			}

			var21 += var5; // L: 803
			var22 += var6; // L: 804
			var23 += var7; // L: 805
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 806
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 807
			field2553[var20] = var23 - var19; // L: 809
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 810
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 811
			if (this.field2523 > 0) { // L: 812
				field2549[var20] = var21; // L: 813
				field2579[var20] = var24; // L: 814
				field2551[var20] = var23; // L: 815
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 819
		} catch (Exception var26) { // L: 821
		}

	} // L: 822

	@ObfuscatedName("ar")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1028
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1029
				field2539[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1030

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1031
				if (this.faceColors3[var7] != -2) { // L: 1032
					var8 = this.indices1[var7]; // L: 1033
					var9 = this.indices2[var7]; // L: 1034
					var10 = this.indices3[var7]; // L: 1035
					var11 = modelViewportXs[var8]; // L: 1036
					var12 = modelViewportXs[var9]; // L: 1037
					var28 = modelViewportXs[var10]; // L: 1038
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1039
						if (var2) { // L: 1065
							var15 = modelViewportYs[var8]; // L: 1067
							var16 = modelViewportYs[var9]; // L: 1068
							var30 = modelViewportYs[var10]; // L: 1069
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 1071
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 1072
								var37 = false; // L: 1073
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1076
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 1077
									var37 = false; // L: 1078
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1081
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1082
										var37 = false; // L: 1083
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1086
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1087
											var37 = false; // L: 1088
										} else {
											var37 = true; // L: 1091
										}
									}
								}
							}

							if (var37) { // L: 1093
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1096
								var2 = false; // L: 1098
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1101
							field2543[var7] = false; // L: 1102
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1103
								field2540[var7] = false; // L: 1104
							} else {
								field2540[var7] = true;
							}

							var29 = (field2553[var8] + field2553[var9] + field2553[var10]) / 3 + this.radius; // L: 1105
							field2554[var29][field2539[var29]++] = var7; // L: 1106
						}
					} else {
						var29 = field2549[var8]; // L: 1040
						var15 = field2549[var9]; // L: 1041
						var16 = field2549[var10]; // L: 1042
						var30 = field2579[var8]; // L: 1043
						var18 = field2579[var9]; // L: 1044
						int var19 = field2579[var10]; // L: 1045
						int var20 = field2551[var8]; // L: 1046
						int var21 = field2551[var9]; // L: 1047
						int var22 = field2551[var10]; // L: 1048
						var29 -= var15; // L: 1049
						var16 -= var15; // L: 1050
						var30 -= var18; // L: 1051
						var19 -= var18; // L: 1052
						var20 -= var21; // L: 1053
						var22 -= var21; // L: 1054
						int var23 = var30 * var22 - var20 * var19; // L: 1055
						int var24 = var20 * var16 - var29 * var22; // L: 1056
						int var25 = var29 * var19 - var30 * var16; // L: 1057
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1058
							field2543[var7] = true; // L: 1059
							int var26 = (field2553[var8] + field2553[var9] + field2553[var10]) / 3 + this.radius; // L: 1060
							field2554[var26][field2539[var26]++] = var7; // L: 1061
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1110
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1111
					var34 = field2539[var33]; // L: 1112
					if (var34 > 0) { // L: 1113
						var27 = field2554[var33]; // L: 1114

						for (var10 = 0; var10 < var34; ++var10) { // L: 1115
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1120
					field2555[var33] = 0; // L: 1121
					field2559[var33] = 0; // L: 1122
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1124
					var34 = field2539[var33]; // L: 1125
					if (var34 > 0) { // L: 1126
						var27 = field2554[var33]; // L: 1127

						for (var10 = 0; var10 < var34; ++var10) { // L: 1128
							char var35 = var27[var10]; // L: 1129
							byte var36 = this.faceRenderPriorities[var35]; // L: 1130
							var28 = field2555[var36]++; // L: 1131
							field2556[var36][var28] = var35; // L: 1132
							if (var36 < 10) { // L: 1133
								int[] var38 = field2559;
								var38[var36] += var33;
							} else if (var36 == 10) { // L: 1134
								field2557[var28] = var33;
							} else {
								field2565[var28] = var33; // L: 1135
							}
						}
					}
				}

				var33 = 0; // L: 1139
				if (field2555[1] > 0 || field2555[2] > 0) { // L: 1140
					var33 = (field2559[1] + field2559[2]) / (field2555[1] + field2555[2]);
				}

				var8 = 0; // L: 1141
				if (field2555[3] > 0 || field2555[4] > 0) { // L: 1142
					var8 = (field2559[3] + field2559[4]) / (field2555[3] + field2555[4]);
				}

				var9 = 0; // L: 1143
				if (field2555[6] > 0 || field2555[8] > 0) { // L: 1144
					var9 = (field2559[8] + field2559[6]) / (field2555[8] + field2555[6]);
				}

				var11 = 0; // L: 1146
				var12 = field2555[10]; // L: 1147
				int[] var13 = field2556[10]; // L: 1148
				int[] var14 = field2557; // L: 1149
				if (var11 == var12) { // L: 1150
					var11 = 0; // L: 1151
					var12 = field2555[11]; // L: 1152
					var13 = field2556[11]; // L: 1153
					var14 = field2565; // L: 1154
				}

				if (var11 < var12) { // L: 1156
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1157
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1158
					while (var15 == 0 && var10 > var33) { // L: 1159
						this.drawFace(var13[var11++]); // L: 1160
						if (var11 == var12 && var13 != field2556[11]) { // L: 1161
							var11 = 0; // L: 1162
							var12 = field2555[11]; // L: 1163
							var13 = field2556[11]; // L: 1164
							var14 = field2565; // L: 1165
						}

						if (var11 < var12) { // L: 1167
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1168
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1170
						this.drawFace(var13[var11++]); // L: 1171
						if (var11 == var12 && var13 != field2556[11]) { // L: 1172
							var11 = 0; // L: 1173
							var12 = field2555[11]; // L: 1174
							var13 = field2556[11]; // L: 1175
							var14 = field2565; // L: 1176
						}

						if (var11 < var12) { // L: 1178
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1179
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1181
						this.drawFace(var13[var11++]); // L: 1182
						if (var11 == var12 && var13 != field2556[11]) { // L: 1183
							var11 = 0; // L: 1184
							var12 = field2555[11]; // L: 1185
							var13 = field2556[11]; // L: 1186
							var14 = field2565; // L: 1187
						}

						if (var11 < var12) { // L: 1189
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1190
						}
					}

					var16 = field2555[var15]; // L: 1192
					int[] var17 = field2556[var15]; // L: 1193

					for (var18 = 0; var18 < var16; ++var18) { // L: 1194
						this.drawFace(var17[var18]); // L: 1195
					}
				}

				while (var10 != -1000) { // L: 1198
					this.drawFace(var13[var11++]); // L: 1199
					if (var11 == var12 && var13 != field2556[11]) { // L: 1200
						var11 = 0; // L: 1201
						var13 = field2556[11]; // L: 1202
						var12 = field2555[11]; // L: 1203
						var14 = field2565; // L: 1204
					}

					if (var11 < var12) { // L: 1206
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1207
					}
				}

			}
		}
	} // L: 1118 1209

	@ObfuscatedName("aj")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2543[var1]) { // L: 1212
			this.method4382(var1); // L: 1213
		} else {
			int var2 = this.indices1[var1]; // L: 1216
			int var3 = this.indices2[var1]; // L: 1217
			int var4 = this.indices3[var1]; // L: 1218
			Rasterizer3D.field2335 = field2540[var1]; // L: 1219
			if (this.faceAlphas == null) { // L: 1220
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1221
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1224
			}

			this.method4453(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1226
		}
	} // L: 1214 1227

	@ObfuscatedName("au")
	boolean method4371(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2516; // L: 1230
	}

	@ObfuscatedName("af")
	final void method4453(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1234
			int var12;
			int var13;
			int var15;
			if (this.field2538 != null && this.field2538[var1] != -1) { // L: 1253
				int var14 = this.field2538[var1] & 255; // L: 1254
				var15 = this.field2524[var14]; // L: 1255
				var12 = this.field2525[var14]; // L: 1256
				var13 = this.field2526[var14]; // L: 1257
			} else {
				var15 = this.indices1[var1]; // L: 1260
				var12 = this.indices2[var1]; // L: 1261
				var13 = this.indices3[var1]; // L: 1262
			}

			if (this.faceColors3[var1] == -1) { // L: 1264
				Rasterizer3D.method4064(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2549[var15], field2549[var12], field2549[var13], field2579[var15], field2579[var12], field2579[var13], field2551[var15], field2551[var12], field2551[var13], this.faceTextures[var1]); // L: 1265
			} else {
				Rasterizer3D.method4064(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2549[var15], field2549[var12], field2549[var13], field2579[var15], field2579[var12], field2579[var13], field2551[var15], field2551[var12], field2551[var13], this.faceTextures[var1]); // L: 1268
			}
		} else {
			boolean var11 = this.method4371(var1); // L: 1235
			if (this.faceColors3[var1] == -1 && var11) { // L: 1236
				Rasterizer3D.method4033(var2, var3, var4, var5, var6, var7, field2564[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1237
			} else if (this.faceColors3[var1] == -1) { // L: 1239
				Rasterizer3D.method4009(var2, var3, var4, var5, var6, var7, field2564[this.faceColors1[var1]]); // L: 1240
			} else if (var11) { // L: 1242
				Rasterizer3D.method4035(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1243
			} else {
				Rasterizer3D.method4015(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1246
			}
		}

	} // L: 1271

	@ObfuscatedName("as")
	final void method4382(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1274
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1275
		int var4 = 0; // L: 1276
		int var5 = this.indices1[var1]; // L: 1277
		int var6 = this.indices2[var1]; // L: 1278
		int var7 = this.indices3[var1]; // L: 1279
		int var8 = field2551[var5]; // L: 1280
		int var9 = field2551[var6]; // L: 1281
		int var10 = field2551[var7]; // L: 1282
		if (this.faceAlphas == null) { // L: 1283
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1284
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1285
			field2560[var4] = modelViewportXs[var5]; // L: 1286
			field2561[var4] = modelViewportYs[var5]; // L: 1287
			field2562[var4++] = this.faceColors1[var1]; // L: 1288
		} else {
			var11 = field2549[var5]; // L: 1291
			var12 = field2579[var5]; // L: 1292
			var13 = this.faceColors1[var1]; // L: 1293
			if (var10 >= 50) { // L: 1294
				var14 = field2572[var10 - var8] * (50 - var8); // L: 1295
				field2560[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2549[var7] - var11) * var14 >> 16)) / 50; // L: 1296
				field2561[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2579[var7] - var12) * var14 >> 16)) / 50; // L: 1297
				field2562[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1298
			}

			if (var9 >= 50) { // L: 1300
				var14 = field2572[var9 - var8] * (50 - var8); // L: 1301
				field2560[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2549[var6] - var11) * var14 >> 16)) / 50; // L: 1302
				field2561[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2579[var6] - var12) * var14 >> 16)) / 50; // L: 1303
				field2562[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1304
			}
		}

		if (var9 >= 50) { // L: 1307
			field2560[var4] = modelViewportXs[var6]; // L: 1308
			field2561[var4] = modelViewportYs[var6]; // L: 1309
			field2562[var4++] = this.faceColors2[var1]; // L: 1310
		} else {
			var11 = field2549[var6]; // L: 1313
			var12 = field2579[var6]; // L: 1314
			var13 = this.faceColors2[var1]; // L: 1315
			if (var8 >= 50) { // L: 1316
				var14 = field2572[var8 - var9] * (50 - var9); // L: 1317
				field2560[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2549[var5] - var11) * var14 >> 16)) / 50; // L: 1318
				field2561[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2579[var5] - var12) * var14 >> 16)) / 50; // L: 1319
				field2562[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1320
			}

			if (var10 >= 50) { // L: 1322
				var14 = field2572[var10 - var9] * (50 - var9); // L: 1323
				field2560[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2549[var7] - var11) * var14 >> 16)) / 50; // L: 1324
				field2561[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2579[var7] - var12) * var14 >> 16)) / 50; // L: 1325
				field2562[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1326
			}
		}

		if (var10 >= 50) { // L: 1329
			field2560[var4] = modelViewportXs[var7]; // L: 1330
			field2561[var4] = modelViewportYs[var7]; // L: 1331
			field2562[var4++] = this.faceColors3[var1]; // L: 1332
		} else {
			var11 = field2549[var7]; // L: 1335
			var12 = field2579[var7]; // L: 1336
			var13 = this.faceColors3[var1]; // L: 1337
			if (var9 >= 50) { // L: 1338
				var14 = field2572[var9 - var10] * (50 - var10); // L: 1339
				field2560[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2549[var6] - var11) * var14 >> 16)) / 50; // L: 1340
				field2561[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2579[var6] - var12) * var14 >> 16)) / 50; // L: 1341
				field2562[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1342
			}

			if (var8 >= 50) { // L: 1344
				var14 = field2572[var8 - var10] * (50 - var10); // L: 1345
				field2560[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2549[var5] - var11) * var14 >> 16)) / 50; // L: 1346
				field2561[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2579[var5] - var12) * var14 >> 16)) / 50; // L: 1347
				field2562[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1348
			}
		}

		var11 = field2560[0]; // L: 1351
		var12 = field2560[1]; // L: 1352
		var13 = field2560[2]; // L: 1353
		var14 = field2561[0]; // L: 1354
		int var15 = field2561[1]; // L: 1355
		int var16 = field2561[2]; // L: 1356
		Rasterizer3D.field2335 = false; // L: 1357
		if (var4 == 3) { // L: 1358
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1359
				Rasterizer3D.field2335 = true;
			}

			this.method4453(var1, var14, var15, var16, var11, var12, var13, field2562[0], field2562[1], field2562[2]); // L: 1360
		}

		if (var4 == 4) { // L: 1362
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2560[3] < 0 || field2560[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1363
				Rasterizer3D.field2335 = true;
			}

			int var18;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1364
				int var19;
				int var21;
				if (this.field2538 != null && this.field2538[var1] != -1) { // L: 1389
					int var20 = this.field2538[var1] & 255; // L: 1390
					var21 = this.field2524[var20]; // L: 1391
					var18 = this.field2525[var20]; // L: 1392
					var19 = this.field2526[var20]; // L: 1393
				} else {
					var21 = var5; // L: 1396
					var18 = var6; // L: 1397
					var19 = var7; // L: 1398
				}

				short var22 = this.faceTextures[var1]; // L: 1400
				if (this.faceColors3[var1] == -1) { // L: 1401
					Rasterizer3D.method4064(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2549[var21], field2549[var18], field2549[var19], field2579[var21], field2579[var18], field2579[var19], field2551[var21], field2551[var18], field2551[var19], var22); // L: 1402
					Rasterizer3D.method4064(var14, var16, field2561[3], var11, var13, field2560[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2549[var21], field2549[var18], field2549[var19], field2579[var21], field2579[var18], field2579[var19], field2551[var21], field2551[var18], field2551[var19], var22); // L: 1403
				} else {
					Rasterizer3D.method4064(var14, var15, var16, var11, var12, var13, field2562[0], field2562[1], field2562[2], field2549[var21], field2549[var18], field2549[var19], field2579[var21], field2579[var18], field2579[var19], field2551[var21], field2551[var18], field2551[var19], var22); // L: 1406
					Rasterizer3D.method4064(var14, var16, field2561[3], var11, var13, field2560[3], field2562[0], field2562[2], field2562[3], field2549[var21], field2549[var18], field2549[var19], field2579[var21], field2579[var18], field2579[var19], field2551[var21], field2551[var18], field2551[var19], var22); // L: 1407
				}
			} else {
				boolean var17 = this.method4371(var1); // L: 1365
				if (this.faceColors3[var1] == -1 && var17) { // L: 1366
					var18 = field2564[this.faceColors1[var1]]; // L: 1367
					Rasterizer3D.method4033(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1368
					Rasterizer3D.method4033(var14, var16, field2561[3], var11, var13, field2560[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1369
				} else if (this.faceColors3[var1] == -1) { // L: 1371
					var18 = field2564[this.faceColors1[var1]]; // L: 1372
					Rasterizer3D.method4009(var14, var15, var16, var11, var12, var13, var18); // L: 1373
					Rasterizer3D.method4009(var14, var16, field2561[3], var11, var13, field2560[3], var18); // L: 1374
				} else if (var17) { // L: 1376
					Rasterizer3D.method4035(var14, var15, var16, var11, var12, var13, field2562[0], field2562[1], field2562[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1377
					Rasterizer3D.method4035(var14, var16, field2561[3], var11, var13, field2560[3], field2562[0], field2562[2], field2562[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1378
				} else {
					Rasterizer3D.method4015(var14, var15, var16, var11, var12, var13, field2562[0], field2562[1], field2562[2]); // L: 1381
					Rasterizer3D.method4015(var14, var16, field2561[3], var11, var13, field2560[3], field2562[0], field2562[2], field2562[3]); // L: 1382
				}
			}
		}

	} // L: 1411

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILnb;)V"
	)
	void method4374(int var1, class388 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1414
		float var4 = (float)(-this.verticesY[var1]); // L: 1415
		float var5 = (float)(-this.verticesZ[var1]); // L: 1416
		float var6 = 1.0F; // L: 1417
		this.verticesX[var1] = (int)(var2.field4410[0] * var3 + var2.field4410[4] * var4 + var2.field4410[8] * var5 + var2.field4410[12] * var6); // L: 1418
		this.verticesY[var1] = -((int)(var2.field4410[1] * var3 + var2.field4410[5] * var4 + var2.field4410[9] * var5 + var2.field4410[13] * var6)); // L: 1419
		this.verticesZ[var1] = -((int)(var2.field4410[2] * var3 + var2.field4410[6] * var4 + var2.field4410[10] * var5 + var2.field4410[14] * var6)); // L: 1420
	} // L: 1421

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V"
	)
	void method4345(class201 var1, int var2) {
		if (this.field2529 != null) { // L: 1424
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1425
				int[] var4 = this.field2529[var3]; // L: 1426
				if (var4 != null && var4.length != 0) { // L: 1427
					int[] var5 = this.field2530[var3]; // L: 1428
					field2504.method7045(); // L: 1429

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1430
						int var7 = var4[var6]; // L: 1431
						class115 var8 = var1.method4098(var7); // L: 1432
						if (var8 != null) { // L: 1433
							field2571.method7006((float)var5[var6] / 255.0F); // L: 1434
							field2576.method7005(var8.method2733(var2)); // L: 1435
							field2576.method7009(field2571); // L: 1436
							field2504.method7008(field2576); // L: 1437
						}
					}

					this.method4374(var3, field2504); // L: 1439
				}
			}

		}
	} // L: 1441

	@ObfuscatedName("cs")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 825
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1); // L: 826
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 827
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 828
		int var13 = var3 * this.xzRadius >> 16; // L: 829
		int var14 = var12 + var13; // L: 830
		if (var14 > 50 && var12 < 3500) { // L: 831
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 832
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 833
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) { // L: 834
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 835
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) { // L: 836
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 837
					int var19 = var2 * this.xzRadius >> 16; // L: 838
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 839
					int var21 = (var18 + var20) * Rasterizer3D.Rasterizer3D_zoom; // L: 840
					if (var21 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) { // L: 841
						int var22 = (var3 * super.height >> 16) + var19; // L: 842
						int var23 = (var18 - var22) * Rasterizer3D.Rasterizer3D_zoom; // L: 843
						if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) { // L: 844
							int var24 = var13 + (var2 * super.height >> 16); // L: 845
							boolean var25 = false; // L: 846
							boolean var26 = false; // L: 847
							if (var12 - var24 <= 50) { // L: 848
								var26 = true;
							}

							boolean var27 = var26 || this.field2523 > 0; // L: 849
							int var28 = ViewportMouse.ViewportMouse_x; // L: 852
							int var30 = ViewportMouse.ViewportMouse_y; // L: 857
							boolean var32 = class143.method3076(); // L: 860
							boolean var33 = class28.method388(var9); // L: 861
							boolean var34 = false; // L: 862
							int var38;
							int var39;
							int var40;
							int var41;
							int var49;
							int var55;
							int var56;
							int var57;
							if (var33 && var32) { // L: 863
								boolean var35 = false; // L: 864
								if (field2566) { // L: 865
									boolean var36;
									if (!class143.method3076()) { // L: 869
										var36 = false; // L: 870
									} else {
										int var44;
										int var45;
										int var46;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 874
											var38 = Scene.Scene_cameraPitchSine; // L: 875
											var39 = Scene.Scene_cameraPitchCosine; // L: 876
											var40 = Scene.Scene_cameraYawSine; // L: 877
											var41 = Scene.Scene_cameraYawCosine; // L: 878
											byte var42 = 50; // L: 879
											short var43 = 3500; // L: 880
											var44 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var42 / Rasterizer3D.Rasterizer3D_zoom; // L: 881
											var45 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var42 / Rasterizer3D.Rasterizer3D_zoom; // L: 882
											var46 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var43 / Rasterizer3D.Rasterizer3D_zoom; // L: 883
											int var47 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var43 / Rasterizer3D.Rasterizer3D_zoom; // L: 884
											int var48 = Rasterizer3D.method4024(var45, var42, var39, var38); // L: 886
											var56 = Rasterizer3D.method4025(var45, var42, var39, var38); // L: 887
											var45 = var48; // L: 888
											var48 = Rasterizer3D.method4024(var47, var43, var39, var38); // L: 889
											var57 = Rasterizer3D.method4025(var47, var43, var39, var38); // L: 890
											var47 = var48; // L: 891
											var48 = Rasterizer3D.method4022(var44, var56, var41, var40); // L: 892
											var56 = Rasterizer3D.method4078(var44, var56, var41, var40); // L: 893
											var44 = var48; // L: 894
											var48 = Rasterizer3D.method4022(var46, var57, var41, var40); // L: 895
											var57 = Rasterizer3D.method4078(var46, var57, var41, var40); // L: 896
											ViewportMouse.field2587 = (var48 + var44) / 2; // L: 898
											GrandExchangeOfferOwnWorldComparator.field480 = (var45 + var47) / 2; // L: 899
											ViewportMouse.field2580 = (var57 + var56) / 2; // L: 900
											ViewportMouse.field2586 = (var48 - var44) / 2; // L: 901
											class124.field1522 = (var47 - var45) / 2; // L: 902
											ViewportMouse.field2583 = (var57 - var56) / 2; // L: 903
											class20.field115 = Math.abs(ViewportMouse.field2586); // L: 904
											class181.field1987 = Math.abs(class124.field1522); // L: 905
											class128.field1543 = Math.abs(ViewportMouse.field2583); // L: 906
										}

										var38 = this.xMid + var6; // L: 908
										var39 = var7 + this.yMid; // L: 909
										var40 = var8 + this.zMid; // L: 910
										var41 = this.xMidOffset; // L: 911
										var56 = this.yMidOffset; // L: 912
										var57 = this.zMidOffset; // L: 913
										var44 = ViewportMouse.field2587 - var38; // L: 914
										var45 = GrandExchangeOfferOwnWorldComparator.field480 - var39; // L: 915
										var46 = ViewportMouse.field2580 - var40; // L: 916
										if (Math.abs(var44) > var41 + class20.field115) { // L: 917
											var36 = false; // L: 918
										} else if (Math.abs(var45) > var56 + class181.field1987) { // L: 921
											var36 = false; // L: 922
										} else if (Math.abs(var46) > var57 + class128.field1543) { // L: 925
											var36 = false; // L: 926
										} else if (Math.abs(var46 * class124.field1522 - var45 * ViewportMouse.field2583) > var57 * class181.field1987 + var56 * class128.field1543) { // L: 929
											var36 = false; // L: 930
										} else if (Math.abs(var44 * ViewportMouse.field2583 - var46 * ViewportMouse.field2586) > var41 * class128.field1543 + var57 * class20.field115) { // L: 933
											var36 = false; // L: 934
										} else if (Math.abs(var45 * ViewportMouse.field2586 - var44 * class124.field1522) > var41 * class181.field1987 + var56 * class20.field115) { // L: 937
											var36 = false; // L: 938
										} else {
											var36 = true; // L: 941
										}
									}

									var35 = var36; // L: 943
								} else {
									var55 = var12 - var13; // L: 946
									if (var55 <= 50) { // L: 947
										var55 = 50;
									}

									if (var15 > 0) { // L: 948
										var16 /= var14; // L: 949
										var17 /= var55; // L: 950
									} else {
										var17 /= var14; // L: 953
										var16 /= var55; // L: 954
									}

									if (var18 > 0) { // L: 956
										var23 /= var14; // L: 957
										var21 /= var55; // L: 958
									} else {
										var21 /= var14; // L: 961
										var23 /= var55; // L: 962
									}

									var49 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 964
									var38 = var30 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 965
									if (var49 > var16 && var49 < var17 && var38 > var23 && var38 < var21) { // L: 966
										var35 = true; // L: 967
									}
								}

								if (var35) { // L: 970
									if (this.isSingleTile) { // L: 971
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 974
									} else {
										var34 = true; // L: 977
									}
								}
							}

							int var54 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 980
							var55 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 981
							var49 = 0; // L: 982
							var38 = 0; // L: 983
							if (var1 != 0) { // L: 984
								var49 = field2569[var1]; // L: 985
								var38 = field2506[var1]; // L: 986
							}

							for (var39 = 0; var39 < this.verticesCount; ++var39) { // L: 988
								var40 = this.verticesX[var39]; // L: 989
								var41 = this.verticesY[var39]; // L: 990
								var56 = this.verticesZ[var39]; // L: 991
								if (var1 != 0) { // L: 992
									var57 = var56 * var49 + var40 * var38 >> 16; // L: 993
									var56 = var56 * var38 - var40 * var49 >> 16; // L: 994
									var40 = var57; // L: 995
								}

								var40 += var6; // L: 997
								var41 += var7; // L: 998
								var56 += var8; // L: 999
								var57 = var56 * var4 + var5 * var40 >> 16; // L: 1000
								var56 = var5 * var56 - var40 * var4 >> 16; // L: 1001
								var40 = var57; // L: 1002
								var57 = var3 * var41 - var56 * var2 >> 16; // L: 1003
								var56 = var41 * var2 + var3 * var56 >> 16; // L: 1004
								field2553[var39] = var56 - var12; // L: 1006
								if (var56 >= 50) { // L: 1007
									modelViewportXs[var39] = var40 * Rasterizer3D.Rasterizer3D_zoom / var56 + var54; // L: 1008
									modelViewportYs[var39] = var57 * Rasterizer3D.Rasterizer3D_zoom / var56 + var55; // L: 1009
								} else {
									modelViewportXs[var39] = -5000; // L: 1012
									var25 = true; // L: 1013
								}

								if (var27) { // L: 1015
									field2549[var39] = var40; // L: 1016
									field2579[var39] = var57; // L: 1017
									field2551[var39] = var56; // L: 1018
								}
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9); // L: 1022
							} catch (Exception var53) { // L: 1024
							}

						}
					}
				}
			}
		}
	} // L: 1025
}
