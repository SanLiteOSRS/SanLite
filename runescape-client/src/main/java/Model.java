import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("f")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("x")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static class407 field2592;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static class407 field2593;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static class407 field2594;
	@ObfuscatedName("ai")
	static boolean[] field2632;
	@ObfuscatedName("au")
	static boolean[] field2633;
	@ObfuscatedName("aw")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("at")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ar")
	static int[] field2620;
	@ObfuscatedName("ay")
	static int[] field2615;
	@ObfuscatedName("ax")
	static int[] field2638;
	@ObfuscatedName("aa")
	static int[] field2639;
	@ObfuscatedName("bh")
	static char[] field2641;
	@ObfuscatedName("bm")
	static char[][] field2642;
	@ObfuscatedName("bp")
	static int[] field2643;
	@ObfuscatedName("bl")
	static int[][] field2644;
	@ObfuscatedName("bo")
	static int[] field2645;
	@ObfuscatedName("bg")
	static int[] field2612;
	@ObfuscatedName("bd")
	static int[] field2630;
	@ObfuscatedName("bq")
	static int[] field2648;
	@ObfuscatedName("bk")
	static int[] field2598;
	@ObfuscatedName("bc")
	static int[] field2650;
	@ObfuscatedName("bv")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bt")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("ba")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("br")
	static boolean field2654;
	@ObfuscatedName("bb")
	static int[] field2657;
	@ObfuscatedName("bu")
	static int[] field2658;
	@ObfuscatedName("bj")
	static int[] field2663;
	@ObfuscatedName("bw")
	static int[] field2611;
	@ObfuscatedName("d")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("n")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("r")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("l")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("s")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("p")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("b")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("o")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("u")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("z")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("t")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("w")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("m")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("q")
	byte[] field2608;
	@ObfuscatedName("i")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("e")
	byte field2588;
	@ObfuscatedName("g")
	int field2637;
	@ObfuscatedName("k")
	int[] field2646;
	@ObfuscatedName("v")
	int[] field2613;
	@ObfuscatedName("aj")
	int[] field2614;
	@ObfuscatedName("an")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("ah")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("ao")
	int[][] field2624;
	@ObfuscatedName("ac")
	int[][] field2618;
	@ObfuscatedName("af")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ad")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("av")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ak")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("ae")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ap")
	@Export("radius")
	int radius;
	@ObfuscatedName("as")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("aq")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("al")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ag")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("am")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("az")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("bz")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bi")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bs")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cd")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cg")
	public short field2667;

	static {
		Model_sharedSequenceModel = new Model(); // L: 11
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 12
		Model_sharedSpotAnimationModel = new Model(); // L: 13
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 14
		field2592 = new class407(); // L: 15
		field2593 = new class407(); // L: 16
		field2594 = new class407(); // L: 17
		field2632 = new boolean[6500]; // L: 58
		field2633 = new boolean[6500]; // L: 59
		modelViewportXs = new int[6500]; // L: 60
		modelViewportYs = new int[6500]; // L: 61
		field2620 = new int[6500]; // L: 62
		field2615 = new int[6500]; // L: 63
		field2638 = new int[6500]; // L: 64
		field2639 = new int[6500]; // L: 65
		field2641 = new char[6000]; // L: 67
		field2642 = new char[6000][512]; // L: 68
		field2643 = new int[12]; // L: 69
		field2644 = new int[12][2000]; // L: 70
		field2645 = new int[2000]; // L: 71
		field2612 = new int[2000]; // L: 72
		field2630 = new int[12]; // L: 73
		field2648 = new int[10]; // L: 74
		field2598 = new int[10]; // L: 75
		field2650 = new int[10]; // L: 76
		field2654 = true; // L: 80
		field2657 = Rasterizer3D.Rasterizer3D_sine; // L: 83
		field2658 = Rasterizer3D.Rasterizer3D_cosine; // L: 84
		field2663 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 85
		field2611 = Rasterizer3D.field2423; // L: 86
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2588 = 0;
		this.field2637 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 95

	@ObfuscatedSignature(
		descriptor = "([Lha;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 18
		this.indicesCount = 0; // L: 22
		this.field2588 = 0; // L: 33
		this.field2637 = 0; // L: 34
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
		this.field2637 = 0; // L: 104
		this.field2588 = -1; // L: 105

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 106
			var8 = var1[var7]; // L: 107
			if (var8 != null) { // L: 108
				this.verticesCount += var8.verticesCount; // L: 109
				this.indicesCount += var8.indicesCount; // L: 110
				this.field2637 += var8.field2637; // L: 111
				if (var8.faceRenderPriorities != null) { // L: 112
					var3 = true;
				} else {
					if (this.field2588 == -1) { // L: 114
						this.field2588 = var8.field2588;
					}

					if (this.field2588 != var8.field2588) { // L: 115
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 117
				var5 |= var8.faceTextures != null; // L: 118
				var6 |= var8.field2608 != null; // L: 119
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
			this.field2608 = new byte[this.indicesCount];
		}

		if (this.field2637 > 0) { // L: 135
			this.field2646 = new int[this.field2637]; // L: 136
			this.field2613 = new int[this.field2637]; // L: 137
			this.field2614 = new int[this.field2637]; // L: 138
		}

		this.verticesCount = 0; // L: 140
		this.indicesCount = 0; // L: 141
		this.field2637 = 0; // L: 142

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
							this.faceRenderPriorities[this.indicesCount] = var8.field2588; // L: 155
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
						if (var8.field2608 != null && var8.field2608[var9] != -1) { // L: 165
							this.field2608[this.indicesCount] = (byte)(this.field2637 + var8.field2608[var9]);
						} else {
							this.field2608[this.indicesCount] = -1; // L: 166
						}
					}

					++this.indicesCount; // L: 168
				}

				for (var9 = 0; var9 < var8.field2637; ++var9) { // L: 170
					this.field2646[this.field2637] = this.verticesCount + var8.field2646[var9]; // L: 171
					this.field2613[this.field2637] = this.verticesCount + var8.field2613[var9]; // L: 172
					this.field2614[this.field2637] = this.verticesCount + var8.field2614[var9]; // L: 173
					++this.field2637; // L: 174
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lha;"
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
					var11.field2637 = this.field2637; // L: 203
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
					var11.field2608 = this.field2608; // L: 214
					var11.faceTextures = this.faceTextures; // L: 215
					var11.field2588 = this.field2588; // L: 216
					var11.field2646 = this.field2646; // L: 217
					var11.field2613 = this.field2613; // L: 218
					var11.field2614 = this.field2614; // L: 219
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Z)Lha;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 264
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 265
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Z)Lha;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 269
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 270
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZLha;[B)Lha;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 274
		var2.indicesCount = this.indicesCount; // L: 275
		var2.field2637 = this.field2637; // L: 276
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
		var2.field2608 = this.field2608; // L: 304
		var2.faceTextures = this.faceTextures; // L: 305
		var2.field2588 = this.field2588; // L: 306
		var2.field2646 = this.field2646; // L: 307
		var2.field2613 = this.field2613; // L: 308
		var2.field2614 = this.field2614; // L: 309
		var2.vertexLabels = this.vertexLabels; // L: 310
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 311
		var2.field2624 = this.field2624; // L: 312
		var2.field2618 = this.field2618; // L: 313
		var2.isSingleTile = this.isSingleTile; // L: 314
		var2.resetBounds(); // L: 315
		var2.overrideAmount = 0; // L: 316
		return var2; // L: 317
	}

	@ObfuscatedName("j")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) { // L: 321
			int var2 = 0; // L: 322
			int var3 = 0; // L: 323
			int var4 = 0; // L: 324
			int var5 = 0; // L: 325
			int var6 = 0; // L: 326
			int var7 = 0; // L: 327
			int var8 = field2658[var1]; // L: 328
			int var9 = field2657[var1]; // L: 329

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 330
				int var11 = Rasterizer3D.method4190(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 331
				int var12 = this.verticesY[var10]; // L: 332
				int var13 = Rasterizer3D.method4170(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 333
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

	@ObfuscatedName("r")
	void method4509() {
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

	@ObfuscatedName("l")
	public int method4510() {
		this.calculateBoundsCylinder(); // L: 394
		return this.xzRadius; // L: 395
	}

	@ObfuscatedName("s")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 399
		this.xMidOffset = -1; // L: 400
	} // L: 401

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)V"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ldh;I)V"
	)
	public void method4573(class129 var1, int var2) {
		Skeleton var3 = var1.field1541; // L: 419
		class211 var4 = var3.method4263(); // L: 420
		if (var4 != null) { // L: 421
			var3.method4263().method4241(var1, var2); // L: 422
			this.method4585(var3.method4263(), var1.method2923()); // L: 423
		}

		if (var1.method2928()) { // L: 425
			this.method4514(var1, var2); // L: 426
		}

		this.resetBounds(); // L: 428
	} // L: 429

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ldh;I)V"
	)
	void method4514(class129 var1, int var2) {
		Skeleton var3 = var1.field1541; // L: 432

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 433
			int var5 = var3.transformTypes[var4]; // L: 434
			if (var5 == 5 && var1.field1539 != null && var1.field1539[var4] != null && var1.field1539[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 435 436
				class124 var6 = var1.field1539[var4][0]; // L: 437
				int[] var7 = var3.labels[var4]; // L: 438
				int var8 = var7.length; // L: 439

				for (int var9 = 0; var9 < var8; ++var9) { // L: 440
					int var10 = var7[var9]; // L: 441
					if (var10 < this.faceLabelsAlpha.length) { // L: 442
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 443

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 444
							int var13 = var11[var12]; // L: 445
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2885(var2) * 255.0F); // L: 446
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V"
	)
	void method4585(class211 var1, int var2) {
		this.method4534(var1, var2); // L: 460
	} // L: 462

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhj;ILhj;I[I)V"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lhv;Ldh;I[ZZZ)V"
	)
	public void method4571(Skeleton var1, class129 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class211 var7 = var1.method4263(); // L: 497
		if (var7 != null) { // L: 498
			var7.method4242(var2, var3, var4, var5); // L: 499
			if (var6) { // L: 500
				this.method4585(var7, var2.method2923()); // L: 501
			}
		}

		if (!var5 && var2.method2928()) { // L: 504
			this.method4514(var2, var3); // L: 505
		}

	} // L: 507

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I[IZ)V"
	)
	public void method4518(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("m")
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
								var15 = field2657[var14]; // L: 594
								var16 = field2658[var14]; // L: 595
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 596
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 597
								this.verticesX[var11] = var17; // L: 598
							}

							if (var12 != 0) { // L: 600
								var15 = field2657[var12]; // L: 601
								var16 = field2658[var12]; // L: 602
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 603
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 604
								this.verticesY[var11] = var17; // L: 605
							}

							if (var13 != 0) { // L: 607
								var15 = field2657[var13]; // L: 608
								var16 = field2658[var13]; // L: 609
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

	@ObfuscatedName("q")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 664
			int var2 = this.verticesX[var1]; // L: 665
			this.verticesX[var1] = this.verticesZ[var1]; // L: 666
			this.verticesZ[var1] = -var2; // L: 667
		}

		this.resetBounds(); // L: 669
	} // L: 670

	@ObfuscatedName("i")
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

	@ObfuscatedName("g")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2657[var1]; // L: 690
		int var3 = field2658[var1]; // L: 691

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 692
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 693
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 694
			this.verticesY[var4] = var5; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("k")
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

	@ObfuscatedName("v")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 710
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 711
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 712
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 713
		}

		this.resetBounds(); // L: 715
	} // L: 716

	@ObfuscatedName("aj")
	public final void method4590(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 719
			this.method4509();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 720
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 721
		int var10 = field2657[var1]; // L: 722
		int var11 = field2658[var1]; // L: 723
		int var12 = field2657[var2]; // L: 724
		int var13 = field2658[var2]; // L: 725
		int var14 = field2657[var3]; // L: 726
		int var15 = field2658[var3]; // L: 727
		int var16 = field2657[var4]; // L: 728
		int var17 = field2658[var4]; // L: 729
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
			field2620[var19] = var22 - var18; // L: 756
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 757
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 758
			if (this.field2637 > 0) { // L: 759
				field2615[var19] = var20; // L: 760
				field2638[var19] = var23; // L: 761
				field2639[var19] = var22; // L: 762
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 766
		} catch (Exception var25) { // L: 768
		}

	} // L: 769

	@ObfuscatedName("an")
	public final void method4512(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 772
			this.method4509();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 773
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 774
		int var11 = field2657[var1]; // L: 775
		int var12 = field2658[var1]; // L: 776
		int var13 = field2657[var2]; // L: 777
		int var14 = field2658[var2]; // L: 778
		int var15 = field2657[var3]; // L: 779
		int var16 = field2658[var3]; // L: 780
		int var17 = field2657[var4]; // L: 781
		int var18 = field2658[var4]; // L: 782
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
			field2620[var20] = var23 - var19; // L: 809
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 810
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 811
			if (this.field2637 > 0) { // L: 812
				field2615[var20] = var21; // L: 813
				field2638[var20] = var24; // L: 814
				field2639[var20] = var23; // L: 815
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 819
		} catch (Exception var26) { // L: 821
		}

	} // L: 822

	@ObfuscatedName("ah")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 990
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 991
				field2641[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 992

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 993
				if (this.faceColors3[var7] != -2) { // L: 994
					var8 = this.indices1[var7]; // L: 995
					var9 = this.indices2[var7]; // L: 996
					var10 = this.indices3[var7]; // L: 997
					var11 = modelViewportXs[var8]; // L: 998
					var12 = modelViewportXs[var9]; // L: 999
					var28 = modelViewportXs[var10]; // L: 1000
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1001
						if (var2 && class9.method75(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1027
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1030
							var2 = false; // L: 1032
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1034
							field2633[var7] = false; // L: 1035
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1036
								field2632[var7] = false; // L: 1037
							} else {
								field2632[var7] = true;
							}

							var29 = (field2620[var8] + field2620[var9] + field2620[var10]) / 3 + this.radius; // L: 1038
							field2642[var29][field2641[var29]++] = var7; // L: 1039
						}
					} else {
						var29 = field2615[var8]; // L: 1002
						var15 = field2615[var9]; // L: 1003
						var16 = field2615[var10]; // L: 1004
						int var30 = field2638[var8]; // L: 1005
						var18 = field2638[var9]; // L: 1006
						int var19 = field2638[var10]; // L: 1007
						int var20 = field2639[var8]; // L: 1008
						int var21 = field2639[var9]; // L: 1009
						int var22 = field2639[var10]; // L: 1010
						var29 -= var15; // L: 1011
						var16 -= var15; // L: 1012
						var30 -= var18; // L: 1013
						var19 -= var18; // L: 1014
						var20 -= var21; // L: 1015
						var22 -= var21; // L: 1016
						int var23 = var30 * var22 - var20 * var19; // L: 1017
						int var24 = var20 * var16 - var29 * var22; // L: 1018
						int var25 = var29 * var19 - var30 * var16; // L: 1019
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1020
							field2633[var7] = true; // L: 1021
							int var26 = (field2620[var8] + field2620[var9] + field2620[var10]) / 3 + this.radius; // L: 1022
							field2642[var26][field2641[var26]++] = var7; // L: 1023
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1043
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1044
					var34 = field2641[var33]; // L: 1045
					if (var34 > 0) { // L: 1046
						var27 = field2642[var33]; // L: 1047

						for (var10 = 0; var10 < var34; ++var10) { // L: 1048
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1053
					field2643[var33] = 0; // L: 1054
					field2630[var33] = 0; // L: 1055
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1057
					var34 = field2641[var33]; // L: 1058
					if (var34 > 0) { // L: 1059
						var27 = field2642[var33]; // L: 1060

						for (var10 = 0; var10 < var34; ++var10) { // L: 1061
							char var35 = var27[var10]; // L: 1062
							byte var36 = this.faceRenderPriorities[var35]; // L: 1063
							var28 = field2643[var36]++; // L: 1064
							field2644[var36][var28] = var35; // L: 1065
							if (var36 < 10) { // L: 1066
								int[] var37 = field2630;
								var37[var36] += var33;
							} else if (var36 == 10) { // L: 1067
								field2645[var28] = var33;
							} else {
								field2612[var28] = var33; // L: 1068
							}
						}
					}
				}

				var33 = 0; // L: 1072
				if (field2643[1] > 0 || field2643[2] > 0) { // L: 1073
					var33 = (field2630[1] + field2630[2]) / (field2643[1] + field2643[2]);
				}

				var8 = 0; // L: 1074
				if (field2643[3] > 0 || field2643[4] > 0) { // L: 1075
					var8 = (field2630[3] + field2630[4]) / (field2643[3] + field2643[4]);
				}

				var9 = 0; // L: 1076
				if (field2643[6] > 0 || field2643[8] > 0) { // L: 1077
					var9 = (field2630[8] + field2630[6]) / (field2643[8] + field2643[6]);
				}

				var11 = 0; // L: 1079
				var12 = field2643[10]; // L: 1080
				int[] var13 = field2644[10]; // L: 1081
				int[] var14 = field2645; // L: 1082
				if (var11 == var12) { // L: 1083
					var11 = 0; // L: 1084
					var12 = field2643[11]; // L: 1085
					var13 = field2644[11]; // L: 1086
					var14 = field2612; // L: 1087
				}

				if (var11 < var12) { // L: 1089
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1090
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1091
					while (var15 == 0 && var10 > var33) { // L: 1092
						this.drawFace(var13[var11++]); // L: 1093
						if (var11 == var12 && var13 != field2644[11]) { // L: 1094
							var11 = 0; // L: 1095
							var12 = field2643[11]; // L: 1096
							var13 = field2644[11]; // L: 1097
							var14 = field2612; // L: 1098
						}

						if (var11 < var12) { // L: 1100
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1101
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1103
						this.drawFace(var13[var11++]); // L: 1104
						if (var11 == var12 && var13 != field2644[11]) { // L: 1105
							var11 = 0; // L: 1106
							var12 = field2643[11]; // L: 1107
							var13 = field2644[11]; // L: 1108
							var14 = field2612; // L: 1109
						}

						if (var11 < var12) { // L: 1111
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1112
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1114
						this.drawFace(var13[var11++]); // L: 1115
						if (var11 == var12 && var13 != field2644[11]) { // L: 1116
							var11 = 0; // L: 1117
							var12 = field2643[11]; // L: 1118
							var13 = field2644[11]; // L: 1119
							var14 = field2612; // L: 1120
						}

						if (var11 < var12) { // L: 1122
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1123
						}
					}

					var16 = field2643[var15]; // L: 1125
					int[] var17 = field2644[var15]; // L: 1126

					for (var18 = 0; var18 < var16; ++var18) { // L: 1127
						this.drawFace(var17[var18]); // L: 1128
					}
				}

				while (var10 != -1000) { // L: 1131
					this.drawFace(var13[var11++]); // L: 1132
					if (var11 == var12 && var13 != field2644[11]) { // L: 1133
						var11 = 0; // L: 1134
						var13 = field2644[11]; // L: 1135
						var12 = field2643[11]; // L: 1136
						var14 = field2612; // L: 1137
					}

					if (var11 < var12) { // L: 1139
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1140
					}
				}

			}
		}
	} // L: 1051 1142

	@ObfuscatedName("ao")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2633[var1]) { // L: 1145
			this.method4532(var1); // L: 1146
		} else {
			int var2 = this.indices1[var1]; // L: 1149
			int var3 = this.indices2[var1]; // L: 1150
			int var4 = this.indices3[var1]; // L: 1151
			Rasterizer3D.field2420 = field2632[var1]; // L: 1152
			if (this.faceAlphas == null) { // L: 1153
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1154
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1157
			}

			this.method4547(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1159
		}
	} // L: 1147 1160

	@ObfuscatedName("ac")
	boolean method4530(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2667; // L: 1163
	}

	@ObfuscatedName("af")
	final void method4547(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1167
			int var12;
			int var13;
			int var15;
			if (this.field2608 != null && this.field2608[var1] != -1) { // L: 1186
				int var14 = this.field2608[var1] & 255; // L: 1187
				var15 = this.field2646[var14]; // L: 1188
				var12 = this.field2613[var14]; // L: 1189
				var13 = this.field2614[var14]; // L: 1190
			} else {
				var15 = this.indices1[var1]; // L: 1193
				var12 = this.indices2[var1]; // L: 1194
				var13 = this.indices3[var1]; // L: 1195
			}

			if (this.faceColors3[var1] == -1) { // L: 1197
				Rasterizer3D.method4165(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2615[var15], field2615[var12], field2615[var13], field2638[var15], field2638[var12], field2638[var13], field2639[var15], field2639[var12], field2639[var13], this.faceTextures[var1]); // L: 1198
			} else {
				Rasterizer3D.method4165(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2615[var15], field2615[var12], field2615[var13], field2638[var15], field2638[var12], field2638[var13], field2639[var15], field2639[var12], field2639[var13], this.faceTextures[var1]); // L: 1201
			}
		} else {
			boolean var11 = this.method4530(var1); // L: 1168
			if (this.faceColors3[var1] == -1 && var11) { // L: 1169
				Rasterizer3D.method4163(var2, var3, var4, var5, var6, var7, field2663[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1170
			} else if (this.faceColors3[var1] == -1) { // L: 1172
				Rasterizer3D.method4220(var2, var3, var4, var5, var6, var7, field2663[this.faceColors1[var1]]); // L: 1173
			} else if (var11) { // L: 1175
				Rasterizer3D.method4159(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1176
			} else {
				Rasterizer3D.method4158(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1179
			}
		}

	} // L: 1204

	@ObfuscatedName("ad")
	final void method4532(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1207
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1208
		int var4 = 0; // L: 1209
		int var5 = this.indices1[var1]; // L: 1210
		int var6 = this.indices2[var1]; // L: 1211
		int var7 = this.indices3[var1]; // L: 1212
		int var8 = field2639[var5]; // L: 1213
		int var9 = field2639[var6]; // L: 1214
		int var10 = field2639[var7]; // L: 1215
		if (this.faceAlphas == null) { // L: 1216
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1217
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1218
			field2648[var4] = modelViewportXs[var5]; // L: 1219
			field2598[var4] = modelViewportYs[var5]; // L: 1220
			field2650[var4++] = this.faceColors1[var1]; // L: 1221
		} else {
			var11 = field2615[var5]; // L: 1224
			var12 = field2638[var5]; // L: 1225
			var13 = this.faceColors1[var1]; // L: 1226
			if (var10 >= 50) { // L: 1227
				var14 = field2611[var10 - var8] * (50 - var8); // L: 1228
				field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var7] - var11) * var14 >> 16)) / 50; // L: 1229
				field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var7] - var12) * var14 >> 16)) / 50; // L: 1230
				field2650[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1231
			}

			if (var9 >= 50) { // L: 1233
				var14 = field2611[var9 - var8] * (50 - var8); // L: 1234
				field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var6] - var11) * var14 >> 16)) / 50; // L: 1235
				field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var6] - var12) * var14 >> 16)) / 50; // L: 1236
				field2650[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1237
			}
		}

		if (var9 >= 50) { // L: 1240
			field2648[var4] = modelViewportXs[var6]; // L: 1241
			field2598[var4] = modelViewportYs[var6]; // L: 1242
			field2650[var4++] = this.faceColors2[var1]; // L: 1243
		} else {
			var11 = field2615[var6]; // L: 1246
			var12 = field2638[var6]; // L: 1247
			var13 = this.faceColors2[var1]; // L: 1248
			if (var8 >= 50) { // L: 1249
				var14 = field2611[var8 - var9] * (50 - var9); // L: 1250
				field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var5] - var11) * var14 >> 16)) / 50; // L: 1251
				field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var5] - var12) * var14 >> 16)) / 50; // L: 1252
				field2650[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1253
			}

			if (var10 >= 50) { // L: 1255
				var14 = field2611[var10 - var9] * (50 - var9); // L: 1256
				field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var7] - var11) * var14 >> 16)) / 50; // L: 1257
				field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var7] - var12) * var14 >> 16)) / 50; // L: 1258
				field2650[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1259
			}
		}

		if (var10 >= 50) { // L: 1262
			field2648[var4] = modelViewportXs[var7]; // L: 1263
			field2598[var4] = modelViewportYs[var7]; // L: 1264
			field2650[var4++] = this.faceColors3[var1]; // L: 1265
		} else {
			var11 = field2615[var7]; // L: 1268
			var12 = field2638[var7]; // L: 1269
			var13 = this.faceColors3[var1]; // L: 1270
			if (var9 >= 50) { // L: 1271
				var14 = field2611[var9 - var10] * (50 - var10); // L: 1272
				field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var6] - var11) * var14 >> 16)) / 50; // L: 1273
				field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var6] - var12) * var14 >> 16)) / 50; // L: 1274
				field2650[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1275
			}

			if (var8 >= 50) { // L: 1277
				var14 = field2611[var8 - var10] * (50 - var10); // L: 1278
				field2648[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2615[var5] - var11) * var14 >> 16)) / 50; // L: 1279
				field2598[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2638[var5] - var12) * var14 >> 16)) / 50; // L: 1280
				field2650[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1281
			}
		}

		var11 = field2648[0]; // L: 1284
		var12 = field2648[1]; // L: 1285
		var13 = field2648[2]; // L: 1286
		var14 = field2598[0]; // L: 1287
		int var15 = field2598[1]; // L: 1288
		int var16 = field2598[2]; // L: 1289
		Rasterizer3D.field2420 = false; // L: 1290
		if (var4 == 3) { // L: 1291
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1292
				Rasterizer3D.field2420 = true;
			}

			this.method4547(var1, var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2]); // L: 1293
		}

		if (var4 == 4) { // L: 1295
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2648[3] < 0 || field2648[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1296
				Rasterizer3D.field2420 = true;
			}

			int var18;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1297
				int var19;
				int var21;
				if (this.field2608 != null && this.field2608[var1] != -1) { // L: 1322
					int var20 = this.field2608[var1] & 255; // L: 1323
					var21 = this.field2646[var20]; // L: 1324
					var18 = this.field2613[var20]; // L: 1325
					var19 = this.field2614[var20]; // L: 1326
				} else {
					var21 = var5; // L: 1329
					var18 = var6; // L: 1330
					var19 = var7; // L: 1331
				}

				short var22 = this.faceTextures[var1]; // L: 1333
				if (this.faceColors3[var1] == -1) { // L: 1334
					Rasterizer3D.method4165(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22); // L: 1335
					Rasterizer3D.method4165(var14, var16, field2598[3], var11, var13, field2648[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22); // L: 1336
				} else {
					Rasterizer3D.method4165(var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22); // L: 1339
					Rasterizer3D.method4165(var14, var16, field2598[3], var11, var13, field2648[3], field2650[0], field2650[2], field2650[3], field2615[var21], field2615[var18], field2615[var19], field2638[var21], field2638[var18], field2638[var19], field2639[var21], field2639[var18], field2639[var19], var22); // L: 1340
				}
			} else {
				boolean var17 = this.method4530(var1); // L: 1298
				if (this.faceColors3[var1] == -1 && var17) { // L: 1299
					var18 = field2663[this.faceColors1[var1]]; // L: 1300
					Rasterizer3D.method4163(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1301
					Rasterizer3D.method4163(var14, var16, field2598[3], var11, var13, field2648[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1302
				} else if (this.faceColors3[var1] == -1) { // L: 1304
					var18 = field2663[this.faceColors1[var1]]; // L: 1305
					Rasterizer3D.method4220(var14, var15, var16, var11, var12, var13, var18); // L: 1306
					Rasterizer3D.method4220(var14, var16, field2598[3], var11, var13, field2648[3], var18); // L: 1307
				} else if (var17) { // L: 1309
					Rasterizer3D.method4159(var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1310
					Rasterizer3D.method4159(var14, var16, field2598[3], var11, var13, field2648[3], field2650[0], field2650[2], field2650[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1311
				} else {
					Rasterizer3D.method4158(var14, var15, var16, var11, var12, var13, field2650[0], field2650[1], field2650[2]); // L: 1314
					Rasterizer3D.method4158(var14, var16, field2598[3], var11, var13, field2648[3], field2650[0], field2650[2], field2650[3]); // L: 1315
				}
			}
		}

	} // L: 1344

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILov;)V"
	)
	void method4517(int var1, class407 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1347
		float var4 = (float)(-this.verticesY[var1]); // L: 1348
		float var5 = (float)(-this.verticesZ[var1]); // L: 1349
		float var6 = 1.0F; // L: 1350
		this.verticesX[var1] = (int)(var2.field4566[0] * var3 + var2.field4566[4] * var4 + var2.field4566[8] * var5 + var2.field4566[12] * var6); // L: 1351
		this.verticesY[var1] = -((int)(var2.field4566[1] * var3 + var2.field4566[5] * var4 + var2.field4566[9] * var5 + var2.field4566[13] * var6)); // L: 1352
		this.verticesZ[var1] = -((int)(var2.field4566[2] * var3 + var2.field4566[6] * var4 + var2.field4566[10] * var5 + var2.field4566[14] * var6)); // L: 1353
	} // L: 1354

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V"
	)
	void method4534(class211 var1, int var2) {
		if (this.field2624 != null) { // L: 1357
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1358
				int[] var4 = this.field2624[var3]; // L: 1359
				if (var4 != null && var4.length != 0) { // L: 1360
					int[] var5 = this.field2618[var3]; // L: 1361
					field2592.method7647(); // L: 1362

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1363
						int var7 = var4[var6]; // L: 1364
						class122 var8 = var1.method4244(var7); // L: 1365
						if (var8 != null) { // L: 1366
							field2593.method7680((float)var5[var6] / 255.0F); // L: 1367
							field2594.method7648(var8.method2832(var2)); // L: 1368
							field2594.method7652(field2593); // L: 1369
							field2592.method7673(field2594); // L: 1370
						}
					}

					this.method4517(var3, field2592); // L: 1372
				}
			}

		}
	} // L: 1374

	@ObfuscatedName("cq")
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

							boolean var27 = var26 || this.field2637 > 0; // L: 849
							int var28 = WorldMapArea.method4749(); // L: 850
							int var29 = ViewportMouse.ViewportMouse_y; // L: 853
							boolean var31 = class122.method2865(); // L: 856
							boolean var32 = AbstractByteArrayCopier.method6222(var9); // L: 857
							boolean var33 = false; // L: 858
							int var37;
							int var38;
							int var39;
							int var40;
							int var41;
							int var42;
							int var46;
							int var52;
							if (var32 && var31) { // L: 859
								boolean var34 = false; // L: 860
								if (field2654) { // L: 861
									boolean var35;
									if (!class122.method2865()) { // L: 865
										var35 = false; // L: 866
									} else {
										class122.method2864(); // L: 869
										var37 = this.xMid + var6; // L: 870
										var38 = var7 + this.yMid; // L: 871
										var39 = var8 + this.zMid; // L: 872
										var40 = this.xMidOffset; // L: 873
										var41 = this.yMidOffset; // L: 874
										var42 = this.zMidOffset; // L: 875
										int var43 = ViewportMouse.field2672 - var37; // L: 876
										int var44 = ViewportMouse.field2677 - var38; // L: 877
										int var45 = ViewportMouse.field2674 - var39; // L: 878
										if (Math.abs(var43) > var40 + ViewportMouse.field2675) { // L: 879
											var35 = false; // L: 880
										} else if (Math.abs(var44) > var41 + WorldMapArchiveLoader.field4685) { // L: 883
											var35 = false; // L: 884
										} else if (Math.abs(var45) > var42 + class6.field17) { // L: 887
											var35 = false; // L: 888
										} else if (Math.abs(var45 * UserComparator6.field1435 - var44 * MenuAction.field887) > var42 * WorldMapArchiveLoader.field4685 + var41 * class6.field17) { // L: 891
											var35 = false; // L: 892
										} else if (Math.abs(var43 * MenuAction.field887 - var45 * class309.field3657) > var40 * class6.field17 + var42 * ViewportMouse.field2675) { // L: 895
											var35 = false; // L: 896
										} else if (Math.abs(var44 * class309.field3657 - var43 * UserComparator6.field1435) > var40 * WorldMapArchiveLoader.field4685 + var41 * ViewportMouse.field2675) { // L: 899
											var35 = false; // L: 900
										} else {
											var35 = true; // L: 903
										}
									}

									var34 = var35; // L: 905
								} else {
									var52 = var12 - var13; // L: 908
									if (var52 <= 50) { // L: 909
										var52 = 50;
									}

									if (var15 > 0) { // L: 910
										var16 /= var14; // L: 911
										var17 /= var52; // L: 912
									} else {
										var17 /= var14; // L: 915
										var16 /= var52; // L: 916
									}

									if (var18 > 0) { // L: 918
										var23 /= var14; // L: 919
										var21 /= var52; // L: 920
									} else {
										var21 /= var14; // L: 923
										var23 /= var52; // L: 924
									}

									var46 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 926
									var37 = var29 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 927
									if (var46 > var16 && var46 < var17 && var37 > var23 && var37 < var21) { // L: 928
										var34 = true; // L: 929
									}
								}

								if (var34) { // L: 932
									if (this.isSingleTile) { // L: 933
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 936
									} else {
										var33 = true; // L: 939
									}
								}
							}

							int var51 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 942
							var52 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 943
							var46 = 0; // L: 944
							var37 = 0; // L: 945
							if (var1 != 0) { // L: 946
								var46 = field2657[var1]; // L: 947
								var37 = field2658[var1]; // L: 948
							}

							for (var38 = 0; var38 < this.verticesCount; ++var38) { // L: 950
								var39 = this.verticesX[var38]; // L: 951
								var40 = this.verticesY[var38]; // L: 952
								var41 = this.verticesZ[var38]; // L: 953
								if (var1 != 0) { // L: 954
									var42 = var41 * var46 + var39 * var37 >> 16; // L: 955
									var41 = var41 * var37 - var39 * var46 >> 16; // L: 956
									var39 = var42; // L: 957
								}

								var39 += var6; // L: 959
								var40 += var7; // L: 960
								var41 += var8; // L: 961
								var42 = var41 * var4 + var5 * var39 >> 16; // L: 962
								var41 = var5 * var41 - var39 * var4 >> 16; // L: 963
								var39 = var42; // L: 964
								var42 = var3 * var40 - var41 * var2 >> 16; // L: 965
								var41 = var40 * var2 + var3 * var41 >> 16; // L: 966
								field2620[var38] = var41 - var12; // L: 968
								if (var41 >= 50) { // L: 969
									modelViewportXs[var38] = var39 * Rasterizer3D.Rasterizer3D_zoom / var41 + var51; // L: 970
									modelViewportYs[var38] = var42 * Rasterizer3D.Rasterizer3D_zoom / var41 + var52; // L: 971
								} else {
									modelViewportXs[var38] = -5000; // L: 974
									var25 = true; // L: 975
								}

								if (var27) { // L: 977
									field2615[var38] = var39; // L: 978
									field2638[var38] = var42; // L: 979
									field2639[var38] = var41; // L: 980
								}
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9); // L: 984
							} catch (Exception var50) { // L: 986
							}

						}
					}
				}
			}
		}
	} // L: 987
}
