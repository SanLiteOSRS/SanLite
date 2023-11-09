import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("h")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("v")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static class388 field2539;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static class388 field2585;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static class388 field2518;
	@ObfuscatedName("an")
	static boolean[] field2553;
	@ObfuscatedName("ah")
	static boolean[] field2554;
	@ObfuscatedName("aa")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("am")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ao")
	static int[] field2557;
	@ObfuscatedName("at")
	static int[] field2541;
	@ObfuscatedName("al")
	static int[] field2559;
	@ObfuscatedName("ac")
	static int[] field2586;
	@ObfuscatedName("bn")
	static char[] field2512;
	@ObfuscatedName("bl")
	static char[][] field2563;
	@ObfuscatedName("bv")
	static int[] field2564;
	@ObfuscatedName("bu")
	static int[][] field2565;
	@ObfuscatedName("bb")
	static int[] field2566;
	@ObfuscatedName("bt")
	static int[] field2567;
	@ObfuscatedName("bw")
	static int[] field2568;
	@ObfuscatedName("bd")
	static int[] field2569;
	@ObfuscatedName("bg")
	static int[] field2570;
	@ObfuscatedName("by")
	static int[] field2513;
	@ObfuscatedName("bs")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("br")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bx")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("ba")
	static boolean field2575;
	@ObfuscatedName("bm")
	static int[] field2578;
	@ObfuscatedName("bp")
	static int[] field2579;
	@ObfuscatedName("bz")
	static int[] field2584;
	@ObfuscatedName("bo")
	static int[] field2535;
	@ObfuscatedName("k")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("o")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("n")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("d")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("a")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("m")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("u")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("l")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("z")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("r")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("y")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("p")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("e")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("b")
	byte[] field2529;
	@ObfuscatedName("x")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("f")
	byte field2531;
	@ObfuscatedName("t")
	int field2532;
	@ObfuscatedName("j")
	int[] field2533;
	@ObfuscatedName("g")
	int[] field2525;
	@ObfuscatedName("ar")
	int[] field2517;
	@ObfuscatedName("aq")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("av")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("aj")
	int[][] field2577;
	@ObfuscatedName("ax")
	int[][] field2581;
	@ObfuscatedName("ab")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ak")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("au")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ae")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("as")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ay")
	@Export("radius")
	int radius;
	@ObfuscatedName("ag")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ad")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("af")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("aw")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ai")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ap")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("be")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bk")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bf")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("ce")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cb")
	public short field2527;

	static {
		Model_sharedSequenceModel = new Model(); // L: 11
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 12
		Model_sharedSpotAnimationModel = new Model(); // L: 13
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 14
		field2539 = new class388(); // L: 15
		field2585 = new class388(); // L: 16
		field2518 = new class388(); // L: 17
		field2553 = new boolean[6500]; // L: 58
		field2554 = new boolean[6500]; // L: 59
		modelViewportXs = new int[6500]; // L: 60
		modelViewportYs = new int[6500]; // L: 61
		field2557 = new int[6500]; // L: 62
		field2541 = new int[6500]; // L: 63
		field2559 = new int[6500]; // L: 64
		field2586 = new int[6500]; // L: 65
		field2512 = new char[6000]; // L: 67
		field2563 = new char[6000][512]; // L: 68
		field2564 = new int[12]; // L: 69
		field2565 = new int[12][2000]; // L: 70
		field2566 = new int[2000]; // L: 71
		field2567 = new int[2000]; // L: 72
		field2568 = new int[12]; // L: 73
		field2569 = new int[10]; // L: 74
		field2570 = new int[10]; // L: 75
		field2513 = new int[10]; // L: 76
		field2575 = true; // L: 80
		field2578 = Rasterizer3D.Rasterizer3D_sine; // L: 83
		field2579 = Rasterizer3D.Rasterizer3D_cosine; // L: 84
		field2584 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 85
		field2535 = Rasterizer3D.field2360; // L: 86
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2531 = 0;
		this.field2532 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 95

	@ObfuscatedSignature(
		descriptor = "([Lhp;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 18
		this.indicesCount = 0; // L: 22
		this.field2531 = 0; // L: 33
		this.field2532 = 0; // L: 34
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
		this.field2532 = 0; // L: 104
		this.field2531 = -1; // L: 105

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 106
			var8 = var1[var7]; // L: 107
			if (var8 != null) { // L: 108
				this.verticesCount += var8.verticesCount; // L: 109
				this.indicesCount += var8.indicesCount; // L: 110
				this.field2532 += var8.field2532; // L: 111
				if (var8.faceRenderPriorities != null) { // L: 112
					var3 = true;
				} else {
					if (this.field2531 == -1) { // L: 114
						this.field2531 = var8.field2531;
					}

					if (this.field2531 != var8.field2531) { // L: 115
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 117
				var5 |= var8.faceTextures != null; // L: 118
				var6 |= var8.field2529 != null; // L: 119
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
			this.field2529 = new byte[this.indicesCount];
		}

		if (this.field2532 > 0) { // L: 135
			this.field2533 = new int[this.field2532]; // L: 136
			this.field2525 = new int[this.field2532]; // L: 137
			this.field2517 = new int[this.field2532]; // L: 138
		}

		this.verticesCount = 0; // L: 140
		this.indicesCount = 0; // L: 141
		this.field2532 = 0; // L: 142

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
							this.faceRenderPriorities[this.indicesCount] = var8.field2531; // L: 155
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
						if (var8.field2529 != null && var8.field2529[var9] != -1) { // L: 165
							this.field2529[this.indicesCount] = (byte)(this.field2532 + var8.field2529[var9]);
						} else {
							this.field2529[this.indicesCount] = -1; // L: 166
						}
					}

					++this.indicesCount; // L: 168
				}

				for (var9 = 0; var9 < var8.field2532; ++var9) { // L: 170
					this.field2533[this.field2532] = this.verticesCount + var8.field2533[var9]; // L: 171
					this.field2525[this.field2532] = this.verticesCount + var8.field2525[var9]; // L: 172
					this.field2517[this.field2532] = this.verticesCount + var8.field2517[var9]; // L: 173
					++this.field2532; // L: 174
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhp;"
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
					var11.field2532 = this.field2532; // L: 203
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
					var11.field2529 = this.field2529; // L: 214
					var11.faceTextures = this.faceTextures; // L: 215
					var11.field2531 = this.field2531; // L: 216
					var11.field2533 = this.field2533; // L: 217
					var11.field2525 = this.field2525; // L: 218
					var11.field2517 = this.field2517; // L: 219
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhp;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 264
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 265
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhp;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 269
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 270
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZLhp;[B)Lhp;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 274
		var2.indicesCount = this.indicesCount; // L: 275
		var2.field2532 = this.field2532; // L: 276
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
		var2.field2529 = this.field2529; // L: 304
		var2.faceTextures = this.faceTextures; // L: 305
		var2.field2531 = this.field2531; // L: 306
		var2.field2533 = this.field2533; // L: 307
		var2.field2525 = this.field2525; // L: 308
		var2.field2517 = this.field2517; // L: 309
		var2.vertexLabels = this.vertexLabels; // L: 310
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 311
		var2.field2577 = this.field2577; // L: 312
		var2.field2581 = this.field2581; // L: 313
		var2.isSingleTile = this.isSingleTile; // L: 314
		var2.resetBounds(); // L: 315
		var2.overrideAmount = 0; // L: 316
		return var2; // L: 317
	}

	@ObfuscatedName("o")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) { // L: 321
			int var2 = 0; // L: 322
			int var3 = 0; // L: 323
			int var4 = 0; // L: 324
			int var5 = 0; // L: 325
			int var6 = 0; // L: 326
			int var7 = 0; // L: 327
			int var8 = field2579[var1]; // L: 328
			int var9 = field2578[var1]; // L: 329

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 330
				int var11 = Rasterizer3D.method3980(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 331
				int var12 = this.verticesY[var10]; // L: 332
				int var13 = Rasterizer3D.method3961(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 333
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

	@ObfuscatedName("n")
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

	@ObfuscatedName("d")
	void method4277() {
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
	public int method4304() {
		this.calculateBoundsCylinder(); // L: 394
		return this.xzRadius; // L: 395
	}

	@ObfuscatedName("m")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 399
		this.xMidOffset = -1; // L: 400
	} // L: 401

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lgn;I)V"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V"
	)
	public void method4305(class122 var1, int var2) {
		Skeleton var3 = var1.field1498; // L: 419
		class201 var4 = var3.method4044(); // L: 420
		if (var4 != null) { // L: 421
			var3.method4044().method4030(var1, var2); // L: 422
			this.method4321(var3.method4044(), var1.method2753()); // L: 423
		}

		if (var1.method2743()) { // L: 425
			this.method4282(var1, var2); // L: 426
		}

		this.resetBounds(); // L: 428
	} // L: 429

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V"
	)
	void method4282(class122 var1, int var2) {
		Skeleton var3 = var1.field1498; // L: 432

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 433
			int var5 = var3.transformTypes[var4]; // L: 434
			if (var5 == 5 && var1.field1499 != null && var1.field1499[var4] != null && var1.field1499[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 435 436
				class117 var6 = var1.field1499[var4][0]; // L: 437
				int[] var7 = var3.labels[var4]; // L: 438
				int var8 = var7.length; // L: 439

				for (int var9 = 0; var9 < var8; ++var9) { // L: 440
					int var10 = var7[var9]; // L: 441
					if (var10 < this.faceLabelsAlpha.length) { // L: 442
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 443

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 444
							int var13 = var11[var12]; // L: 445
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2705(var2) * 255.0F); // L: 446
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V"
	)
	void method4321(class201 var1, int var2) {
		this.method4278(var1, var2); // L: 460
	} // L: 462

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lgn;ILgn;I[I)V"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lge;Ldk;I[ZZZ)V"
	)
	public void method4285(Skeleton var1, class122 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class201 var7 = var1.method4044(); // L: 497
		if (var7 != null) { // L: 498
			var7.method4027(var2, var3, var4, var5); // L: 499
			if (var6) { // L: 500
				this.method4321(var7, var2.method2753()); // L: 501
			}
		}

		if (!var5 && var2.method2743()) { // L: 504
			this.method4282(var2, var3); // L: 505
		}

	} // L: 507

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lgn;I[IZ)V"
	)
	public void method4286(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("b")
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
								var15 = field2578[var14]; // L: 594
								var16 = field2579[var14]; // L: 595
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 596
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 597
								this.verticesX[var11] = var17; // L: 598
							}

							if (var12 != 0) { // L: 600
								var15 = field2578[var12]; // L: 601
								var16 = field2579[var12]; // L: 602
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 603
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 604
								this.verticesY[var11] = var17; // L: 605
							}

							if (var13 != 0) { // L: 607
								var15 = field2578[var13]; // L: 608
								var16 = field2579[var13]; // L: 609
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

	@ObfuscatedName("x")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 664
			int var2 = this.verticesX[var1]; // L: 665
			this.verticesX[var1] = this.verticesZ[var1]; // L: 666
			this.verticesZ[var1] = -var2; // L: 667
		}

		this.resetBounds(); // L: 669
	} // L: 670

	@ObfuscatedName("f")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 673
			this.verticesX[var1] = -this.verticesX[var1]; // L: 674
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 675
		}

		this.resetBounds(); // L: 677
	} // L: 678

	@ObfuscatedName("t")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 681
			int var2 = this.verticesZ[var1]; // L: 682
			this.verticesZ[var1] = this.verticesX[var1]; // L: 683
			this.verticesX[var1] = -var2; // L: 684
		}

		this.resetBounds(); // L: 686
	} // L: 687

	@ObfuscatedName("j")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2578[var1]; // L: 690
		int var3 = field2579[var1]; // L: 691

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 692
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 693
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 694
			this.verticesY[var4] = var5; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("g")
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

	@ObfuscatedName("ar")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 710
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 711
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 712
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 713
		}

		this.resetBounds(); // L: 715
	} // L: 716

	@ObfuscatedName("aq")
	public final void method4367(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 719
			this.method4277();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 720
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 721
		int var10 = field2578[var1]; // L: 722
		int var11 = field2579[var1]; // L: 723
		int var12 = field2578[var2]; // L: 724
		int var13 = field2579[var2]; // L: 725
		int var14 = field2578[var3]; // L: 726
		int var15 = field2579[var3]; // L: 727
		int var16 = field2578[var4]; // L: 728
		int var17 = field2579[var4]; // L: 729
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
			field2557[var19] = var22 - var18; // L: 756
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 757
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 758
			if (this.field2532 > 0) { // L: 759
				field2541[var19] = var20; // L: 760
				field2559[var19] = var23; // L: 761
				field2586[var19] = var22; // L: 762
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 766
		} catch (Exception var25) { // L: 768
		}

	} // L: 769

	@ObfuscatedName("av")
	public final void method4295(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 772
			this.method4277();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 773
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 774
		int var11 = field2578[var1]; // L: 775
		int var12 = field2579[var1]; // L: 776
		int var13 = field2578[var2]; // L: 777
		int var14 = field2579[var2]; // L: 778
		int var15 = field2578[var3]; // L: 779
		int var16 = field2579[var3]; // L: 780
		int var17 = field2578[var4]; // L: 781
		int var18 = field2579[var4]; // L: 782
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
			field2557[var20] = var23 - var19; // L: 809
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 810
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 811
			if (this.field2532 > 0) { // L: 812
				field2541[var20] = var21; // L: 813
				field2559[var20] = var24; // L: 814
				field2586[var20] = var23; // L: 815
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 819
		} catch (Exception var26) { // L: 821
		}

	} // L: 822

	@ObfuscatedName("aj")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 954
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 955
				field2512[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 956

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 957
				if (this.faceColors3[var7] != -2) { // L: 958
					var8 = this.indices1[var7]; // L: 959
					var9 = this.indices2[var7]; // L: 960
					var10 = this.indices3[var7]; // L: 961
					var11 = modelViewportXs[var8]; // L: 962
					var12 = modelViewportXs[var9]; // L: 963
					var28 = modelViewportXs[var10]; // L: 964
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 965
						if (var2) { // L: 991
							var15 = modelViewportYs[var8]; // L: 993
							var16 = modelViewportYs[var9]; // L: 994
							var29 = modelViewportYs[var10]; // L: 995
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 997
							boolean var35;
							if (var18 < var15 && var18 < var16 && var18 < var29) { // L: 998
								var35 = false; // L: 999
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1002
								if (var18 > var15 && var18 > var16 && var18 > var29) { // L: 1003
									var35 = false; // L: 1004
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1007
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1008
										var35 = false; // L: 1009
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1012
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1013
											var35 = false; // L: 1014
										} else {
											var35 = true; // L: 1017
										}
									}
								}
							}

							if (var35) { // L: 1019
								GrandExchangeOfferOwnWorldComparator.method1082(var4); // L: 1020
								var2 = false; // L: 1021
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1024
							field2554[var7] = false; // L: 1025
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1026
								field2553[var7] = false; // L: 1027
							} else {
								field2553[var7] = true;
							}

							var30 = (field2557[var8] + field2557[var9] + field2557[var10]) / 3 + this.radius; // L: 1028
							field2563[var30][field2512[var30]++] = var7; // L: 1029
						}
					} else {
						var30 = field2541[var8]; // L: 966
						var15 = field2541[var9]; // L: 967
						var16 = field2541[var10]; // L: 968
						var29 = field2559[var8]; // L: 969
						var18 = field2559[var9]; // L: 970
						int var19 = field2559[var10]; // L: 971
						int var20 = field2586[var8]; // L: 972
						int var21 = field2586[var9]; // L: 973
						int var22 = field2586[var10]; // L: 974
						var30 -= var15; // L: 975
						var16 -= var15; // L: 976
						var29 -= var18; // L: 977
						var19 -= var18; // L: 978
						var20 -= var21; // L: 979
						var22 -= var21; // L: 980
						int var23 = var29 * var22 - var20 * var19; // L: 981
						int var24 = var20 * var16 - var30 * var22; // L: 982
						int var25 = var30 * var19 - var29 * var16; // L: 983
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 984
							field2554[var7] = true; // L: 985
							int var26 = (field2557[var8] + field2557[var9] + field2557[var10]) / 3 + this.radius; // L: 986
							field2563[var26][field2512[var26]++] = var7; // L: 987
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1033
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1034
					var32 = field2512[var31]; // L: 1035
					if (var32 > 0) { // L: 1036
						var27 = field2563[var31]; // L: 1037

						for (var10 = 0; var10 < var32; ++var10) { // L: 1038
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1043
					field2564[var31] = 0; // L: 1044
					field2568[var31] = 0; // L: 1045
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1047
					var32 = field2512[var31]; // L: 1048
					if (var32 > 0) { // L: 1049
						var27 = field2563[var31]; // L: 1050

						for (var10 = 0; var10 < var32; ++var10) { // L: 1051
							char var33 = var27[var10]; // L: 1052
							byte var34 = this.faceRenderPriorities[var33]; // L: 1053
							var28 = field2564[var34]++; // L: 1054
							field2565[var34][var28] = var33; // L: 1055
							if (var34 < 10) { // L: 1056
								int[] var36 = field2568;
								var36[var34] += var31;
							} else if (var34 == 10) { // L: 1057
								field2566[var28] = var31;
							} else {
								field2567[var28] = var31; // L: 1058
							}
						}
					}
				}

				var31 = 0; // L: 1062
				if (field2564[1] > 0 || field2564[2] > 0) { // L: 1063
					var31 = (field2568[1] + field2568[2]) / (field2564[1] + field2564[2]);
				}

				var8 = 0; // L: 1064
				if (field2564[3] > 0 || field2564[4] > 0) { // L: 1065
					var8 = (field2568[3] + field2568[4]) / (field2564[3] + field2564[4]);
				}

				var9 = 0; // L: 1066
				if (field2564[6] > 0 || field2564[8] > 0) { // L: 1067
					var9 = (field2568[8] + field2568[6]) / (field2564[8] + field2564[6]);
				}

				var11 = 0; // L: 1069
				var12 = field2564[10]; // L: 1070
				int[] var13 = field2565[10]; // L: 1071
				int[] var14 = field2566; // L: 1072
				if (var11 == var12) { // L: 1073
					var11 = 0; // L: 1074
					var12 = field2564[11]; // L: 1075
					var13 = field2565[11]; // L: 1076
					var14 = field2567; // L: 1077
				}

				if (var11 < var12) { // L: 1079
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1080
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1081
					while (var15 == 0 && var10 > var31) { // L: 1082
						this.drawFace(var13[var11++]); // L: 1083
						if (var11 == var12 && var13 != field2565[11]) { // L: 1084
							var11 = 0; // L: 1085
							var12 = field2564[11]; // L: 1086
							var13 = field2565[11]; // L: 1087
							var14 = field2567; // L: 1088
						}

						if (var11 < var12) { // L: 1090
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1091
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1093
						this.drawFace(var13[var11++]); // L: 1094
						if (var11 == var12 && var13 != field2565[11]) { // L: 1095
							var11 = 0; // L: 1096
							var12 = field2564[11]; // L: 1097
							var13 = field2565[11]; // L: 1098
							var14 = field2567; // L: 1099
						}

						if (var11 < var12) { // L: 1101
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1102
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1104
						this.drawFace(var13[var11++]); // L: 1105
						if (var11 == var12 && var13 != field2565[11]) { // L: 1106
							var11 = 0; // L: 1107
							var12 = field2564[11]; // L: 1108
							var13 = field2565[11]; // L: 1109
							var14 = field2567; // L: 1110
						}

						if (var11 < var12) { // L: 1112
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1113
						}
					}

					var16 = field2564[var15]; // L: 1115
					int[] var17 = field2565[var15]; // L: 1116

					for (var18 = 0; var18 < var16; ++var18) { // L: 1117
						this.drawFace(var17[var18]); // L: 1118
					}
				}

				while (var10 != -1000) { // L: 1121
					this.drawFace(var13[var11++]); // L: 1122
					if (var11 == var12 && var13 != field2565[11]) { // L: 1123
						var11 = 0; // L: 1124
						var13 = field2565[11]; // L: 1125
						var12 = field2564[11]; // L: 1126
						var14 = field2567; // L: 1127
					}

					if (var11 < var12) { // L: 1129
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1130
					}
				}

			}
		}
	} // L: 1041 1132

	@ObfuscatedName("ax")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2554[var1]) { // L: 1135
			this.method4364(var1); // L: 1136
		} else {
			int var2 = this.indices1[var1]; // L: 1139
			int var3 = this.indices2[var1]; // L: 1140
			int var4 = this.indices3[var1]; // L: 1141
			Rasterizer3D.field2337 = field2553[var1]; // L: 1142
			if (this.faceAlphas == null) { // L: 1143
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1144
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1147
			}

			this.method4300(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1149
		}
	} // L: 1137 1150

	@ObfuscatedName("ab")
	boolean method4294(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2527; // L: 1153
	}

	@ObfuscatedName("ak")
	final void method4300(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1157
			int var12;
			int var13;
			int var15;
			if (this.field2529 != null && this.field2529[var1] != -1) { // L: 1176
				int var14 = this.field2529[var1] & 255; // L: 1177
				var15 = this.field2533[var14]; // L: 1178
				var12 = this.field2525[var14]; // L: 1179
				var13 = this.field2517[var14]; // L: 1180
			} else {
				var15 = this.indices1[var1]; // L: 1183
				var12 = this.indices2[var1]; // L: 1184
				var13 = this.indices3[var1]; // L: 1185
			}

			if (this.faceColors3[var1] == -1) { // L: 1187
				Rasterizer3D.method3940(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2541[var15], field2541[var12], field2541[var13], field2559[var15], field2559[var12], field2559[var13], field2586[var15], field2586[var12], field2586[var13], this.faceTextures[var1]); // L: 1188
			} else {
				Rasterizer3D.method3940(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2541[var15], field2541[var12], field2541[var13], field2559[var15], field2559[var12], field2559[var13], field2586[var15], field2586[var12], field2586[var13], this.faceTextures[var1]); // L: 1191
			}
		} else {
			boolean var11 = this.method4294(var1); // L: 1158
			if (this.faceColors3[var1] == -1 && var11) { // L: 1159
				Rasterizer3D.method4019(var2, var3, var4, var5, var6, var7, field2584[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1160
			} else if (this.faceColors3[var1] == -1) { // L: 1162
				Rasterizer3D.method3952(var2, var3, var4, var5, var6, var7, field2584[this.faceColors1[var1]]); // L: 1163
			} else if (var11) { // L: 1165
				Rasterizer3D.method3949(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1166
			} else {
				Rasterizer3D.method3962(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1169
			}
		}

	} // L: 1194

	@ObfuscatedName("au")
	final void method4364(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1197
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1198
		int var4 = 0; // L: 1199
		int var5 = this.indices1[var1]; // L: 1200
		int var6 = this.indices2[var1]; // L: 1201
		int var7 = this.indices3[var1]; // L: 1202
		int var8 = field2586[var5]; // L: 1203
		int var9 = field2586[var6]; // L: 1204
		int var10 = field2586[var7]; // L: 1205
		if (this.faceAlphas == null) { // L: 1206
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1207
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1208
			field2569[var4] = modelViewportXs[var5]; // L: 1209
			field2570[var4] = modelViewportYs[var5]; // L: 1210
			field2513[var4++] = this.faceColors1[var1]; // L: 1211
		} else {
			var11 = field2541[var5]; // L: 1214
			var12 = field2559[var5]; // L: 1215
			var13 = this.faceColors1[var1]; // L: 1216
			if (var10 >= 50) { // L: 1217
				var14 = field2535[var10 - var8] * (50 - var8); // L: 1218
				field2569[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2541[var7] - var11) * var14 >> 16)) / 50; // L: 1219
				field2570[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2559[var7] - var12) * var14 >> 16)) / 50; // L: 1220
				field2513[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1221
			}

			if (var9 >= 50) { // L: 1223
				var14 = field2535[var9 - var8] * (50 - var8); // L: 1224
				field2569[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2541[var6] - var11) * var14 >> 16)) / 50; // L: 1225
				field2570[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2559[var6] - var12) * var14 >> 16)) / 50; // L: 1226
				field2513[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1227
			}
		}

		if (var9 >= 50) { // L: 1230
			field2569[var4] = modelViewportXs[var6]; // L: 1231
			field2570[var4] = modelViewportYs[var6]; // L: 1232
			field2513[var4++] = this.faceColors2[var1]; // L: 1233
		} else {
			var11 = field2541[var6]; // L: 1236
			var12 = field2559[var6]; // L: 1237
			var13 = this.faceColors2[var1]; // L: 1238
			if (var8 >= 50) { // L: 1239
				var14 = field2535[var8 - var9] * (50 - var9); // L: 1240
				field2569[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2541[var5] - var11) * var14 >> 16)) / 50; // L: 1241
				field2570[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2559[var5] - var12) * var14 >> 16)) / 50; // L: 1242
				field2513[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1243
			}

			if (var10 >= 50) { // L: 1245
				var14 = field2535[var10 - var9] * (50 - var9); // L: 1246
				field2569[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2541[var7] - var11) * var14 >> 16)) / 50; // L: 1247
				field2570[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2559[var7] - var12) * var14 >> 16)) / 50; // L: 1248
				field2513[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1249
			}
		}

		if (var10 >= 50) { // L: 1252
			field2569[var4] = modelViewportXs[var7]; // L: 1253
			field2570[var4] = modelViewportYs[var7]; // L: 1254
			field2513[var4++] = this.faceColors3[var1]; // L: 1255
		} else {
			var11 = field2541[var7]; // L: 1258
			var12 = field2559[var7]; // L: 1259
			var13 = this.faceColors3[var1]; // L: 1260
			if (var9 >= 50) { // L: 1261
				var14 = field2535[var9 - var10] * (50 - var10); // L: 1262
				field2569[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2541[var6] - var11) * var14 >> 16)) / 50; // L: 1263
				field2570[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2559[var6] - var12) * var14 >> 16)) / 50; // L: 1264
				field2513[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1265
			}

			if (var8 >= 50) { // L: 1267
				var14 = field2535[var8 - var10] * (50 - var10); // L: 1268
				field2569[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2541[var5] - var11) * var14 >> 16)) / 50; // L: 1269
				field2570[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2559[var5] - var12) * var14 >> 16)) / 50; // L: 1270
				field2513[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1271
			}
		}

		var11 = field2569[0]; // L: 1274
		var12 = field2569[1]; // L: 1275
		var13 = field2569[2]; // L: 1276
		var14 = field2570[0]; // L: 1277
		int var15 = field2570[1]; // L: 1278
		int var16 = field2570[2]; // L: 1279
		Rasterizer3D.field2337 = false; // L: 1280
		if (var4 == 3) { // L: 1281
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1282
				Rasterizer3D.field2337 = true;
			}

			this.method4300(var1, var14, var15, var16, var11, var12, var13, field2513[0], field2513[1], field2513[2]); // L: 1283
		}

		if (var4 == 4) { // L: 1285
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2569[3] < 0 || field2569[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1286
				Rasterizer3D.field2337 = true;
			}

			int var18;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1287
				int var19;
				int var21;
				if (this.field2529 != null && this.field2529[var1] != -1) { // L: 1312
					int var20 = this.field2529[var1] & 255; // L: 1313
					var21 = this.field2533[var20]; // L: 1314
					var18 = this.field2525[var20]; // L: 1315
					var19 = this.field2517[var20]; // L: 1316
				} else {
					var21 = var5; // L: 1319
					var18 = var6; // L: 1320
					var19 = var7; // L: 1321
				}

				short var22 = this.faceTextures[var1]; // L: 1323
				if (this.faceColors3[var1] == -1) { // L: 1324
					Rasterizer3D.method3940(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2541[var21], field2541[var18], field2541[var19], field2559[var21], field2559[var18], field2559[var19], field2586[var21], field2586[var18], field2586[var19], var22); // L: 1325
					Rasterizer3D.method3940(var14, var16, field2570[3], var11, var13, field2569[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2541[var21], field2541[var18], field2541[var19], field2559[var21], field2559[var18], field2559[var19], field2586[var21], field2586[var18], field2586[var19], var22); // L: 1326
				} else {
					Rasterizer3D.method3940(var14, var15, var16, var11, var12, var13, field2513[0], field2513[1], field2513[2], field2541[var21], field2541[var18], field2541[var19], field2559[var21], field2559[var18], field2559[var19], field2586[var21], field2586[var18], field2586[var19], var22); // L: 1329
					Rasterizer3D.method3940(var14, var16, field2570[3], var11, var13, field2569[3], field2513[0], field2513[2], field2513[3], field2541[var21], field2541[var18], field2541[var19], field2559[var21], field2559[var18], field2559[var19], field2586[var21], field2586[var18], field2586[var19], var22); // L: 1330
				}
			} else {
				boolean var17 = this.method4294(var1); // L: 1288
				if (this.faceColors3[var1] == -1 && var17) { // L: 1289
					var18 = field2584[this.faceColors1[var1]]; // L: 1290
					Rasterizer3D.method4019(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1291
					Rasterizer3D.method4019(var14, var16, field2570[3], var11, var13, field2569[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1292
				} else if (this.faceColors3[var1] == -1) { // L: 1294
					var18 = field2584[this.faceColors1[var1]]; // L: 1295
					Rasterizer3D.method3952(var14, var15, var16, var11, var12, var13, var18); // L: 1296
					Rasterizer3D.method3952(var14, var16, field2570[3], var11, var13, field2569[3], var18); // L: 1297
				} else if (var17) { // L: 1299
					Rasterizer3D.method3949(var14, var15, var16, var11, var12, var13, field2513[0], field2513[1], field2513[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1300
					Rasterizer3D.method3949(var14, var16, field2570[3], var11, var13, field2569[3], field2513[0], field2513[2], field2513[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1301
				} else {
					Rasterizer3D.method3962(var14, var15, var16, var11, var12, var13, field2513[0], field2513[1], field2513[2]); // L: 1304
					Rasterizer3D.method3962(var14, var16, field2570[3], var11, var13, field2569[3], field2513[0], field2513[2], field2513[3]); // L: 1305
				}
			}
		}

	} // L: 1334

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILny;)V"
	)
	void method4302(int var1, class388 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1337
		float var4 = (float)(-this.verticesY[var1]); // L: 1338
		float var5 = (float)(-this.verticesZ[var1]); // L: 1339
		float var6 = 1.0F; // L: 1340
		this.verticesX[var1] = (int)(var2.field4398[0] * var3 + var2.field4398[4] * var4 + var2.field4398[8] * var5 + var2.field4398[12] * var6); // L: 1341
		this.verticesY[var1] = -((int)(var2.field4398[1] * var3 + var2.field4398[5] * var4 + var2.field4398[9] * var5 + var2.field4398[13] * var6)); // L: 1342
		this.verticesZ[var1] = -((int)(var2.field4398[2] * var3 + var2.field4398[6] * var4 + var2.field4398[10] * var5 + var2.field4398[14] * var6)); // L: 1343
	} // L: 1344

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V"
	)
	void method4278(class201 var1, int var2) {
		if (this.field2577 != null) { // L: 1347
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1348
				int[] var4 = this.field2577[var3]; // L: 1349
				if (var4 != null && var4.length != 0) { // L: 1350
					int[] var5 = this.field2581[var3]; // L: 1351
					field2539.method6914(); // L: 1352

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1353
						int var7 = var4[var6]; // L: 1354
						class115 var8 = var1.method4024(var7); // L: 1355
						if (var8 != null) { // L: 1356
							field2585.method6916((float)var5[var6] / 255.0F); // L: 1357
							field2518.method6915(var8.method2675(var2)); // L: 1358
							field2518.method6954(field2585); // L: 1359
							field2539.method6935(field2518); // L: 1360
						}
					}

					this.method4302(var3, field2539); // L: 1362
				}
			}

		}
	} // L: 1364

	@ObfuscatedName("di")
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

							boolean var27 = var26 || this.field2532 > 0; // L: 849
							int var28 = SequenceDefinition.method3770(); // L: 850
							int var29 = class119.method2724(); // L: 851
							boolean var30 = ViewportMouse.ViewportMouse_isInViewport; // L: 854
							boolean var33 = 0L != var9; // L: 859
							boolean var34;
							if (var33) { // L: 860
								var34 = (int)(var9 >>> 16 & 1L) == 1; // L: 863
								var33 = !var34; // L: 865
							}

							var34 = false; // L: 870
							int var36;
							int var37;
							int var38;
							if (var33 && var30) { // L: 871
								boolean var35 = false; // L: 872
								if (field2575) { // L: 873
									var35 = StructComposition.method3544(this, var6, var7, var8); // L: 874
								} else {
									var36 = var12 - var13; // L: 877
									if (var36 <= 50) { // L: 878
										var36 = 50;
									}

									if (var15 > 0) { // L: 879
										var16 /= var14; // L: 880
										var17 /= var36; // L: 881
									} else {
										var17 /= var14; // L: 884
										var16 /= var36; // L: 885
									}

									if (var18 > 0) { // L: 887
										var23 /= var14; // L: 888
										var21 /= var36; // L: 889
									} else {
										var21 /= var14; // L: 892
										var23 /= var36; // L: 893
									}

									var37 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 895
									var38 = var29 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 896
									if (var37 > var16 && var37 < var17 && var38 > var23 && var38 < var21) { // L: 897
										var35 = true; // L: 898
									}
								}

								if (var35) { // L: 901
									if (this.isSingleTile) { // L: 902
										GrandExchangeOfferOwnWorldComparator.method1082(var9);
									} else {
										var34 = true; // L: 903
									}
								}
							}

							int var46 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 906
							var36 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 907
							var37 = 0; // L: 908
							var38 = 0; // L: 909
							if (var1 != 0) { // L: 910
								var37 = field2578[var1]; // L: 911
								var38 = field2579[var1]; // L: 912
							}

							for (int var39 = 0; var39 < this.verticesCount; ++var39) { // L: 914
								int var40 = this.verticesX[var39]; // L: 915
								int var41 = this.verticesY[var39]; // L: 916
								int var42 = this.verticesZ[var39]; // L: 917
								int var43;
								if (var1 != 0) { // L: 918
									var43 = var42 * var37 + var40 * var38 >> 16; // L: 919
									var42 = var42 * var38 - var40 * var37 >> 16; // L: 920
									var40 = var43; // L: 921
								}

								var40 += var6; // L: 923
								var41 += var7; // L: 924
								var42 += var8; // L: 925
								var43 = var42 * var4 + var5 * var40 >> 16; // L: 926
								var42 = var5 * var42 - var40 * var4 >> 16; // L: 927
								var40 = var43; // L: 928
								var43 = var3 * var41 - var42 * var2 >> 16; // L: 929
								var42 = var41 * var2 + var3 * var42 >> 16; // L: 930
								field2557[var39] = var42 - var12; // L: 932
								if (var42 >= 50) { // L: 933
									modelViewportXs[var39] = var40 * Rasterizer3D.Rasterizer3D_zoom / var42 + var46; // L: 934
									modelViewportYs[var39] = var43 * Rasterizer3D.Rasterizer3D_zoom / var42 + var36; // L: 935
								} else {
									modelViewportXs[var39] = -5000; // L: 938
									var25 = true; // L: 939
								}

								if (var27) { // L: 941
									field2541[var39] = var40; // L: 942
									field2559[var39] = var43; // L: 943
									field2586[var39] = var42; // L: 944
								}
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9); // L: 948
							} catch (Exception var45) { // L: 950
							}

						}
					}
				}
			}
		}
	} // L: 951
}
