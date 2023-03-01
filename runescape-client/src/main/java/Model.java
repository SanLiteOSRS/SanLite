import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("w")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("s")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static class417 field2703;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static class417 field2674;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static class417 field2739;
	@ObfuscatedName("ac")
	static boolean[] field2708;
	@ObfuscatedName("av")
	static boolean[] field2709;
	@ObfuscatedName("aq")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ak")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("au")
	static int[] field2712;
	@ObfuscatedName("ae")
	static int[] field2695;
	@ObfuscatedName("ah")
	static int[] field2741;
	@ObfuscatedName("ad")
	static int[] field2715;
	@ObfuscatedName("an")
	static char[] field2675;
	@ObfuscatedName("am")
	static char[][] field2673;
	@ObfuscatedName("as")
	static int[] field2728;
	@ObfuscatedName("ao")
	static int[][] field2669;
	@ObfuscatedName("bj")
	static int[] field2720;
	@ObfuscatedName("bf")
	static int[] field2721;
	@ObfuscatedName("bz")
	static int[] field2698;
	@ObfuscatedName("br")
	static int[] field2691;
	@ObfuscatedName("bm")
	static int[] field2724;
	@ObfuscatedName("be")
	static int[] field2726;
	@ObfuscatedName("bo")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bl")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bq")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bn")
	static boolean field2730;
	@ObfuscatedName("bt")
	static int[] field2733;
	@ObfuscatedName("bd")
	static int[] field2734;
	@ObfuscatedName("bg")
	static int[] field2738;
	@ObfuscatedName("bb")
	static int[] field2736;
	@ObfuscatedName("n")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("l")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("k")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("c")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("r")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("b")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("m")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("t")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("h")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("p")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("o")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("u")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("x")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("a")
	byte[] field2689;
	@ObfuscatedName("q")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("d")
	byte field2719;
	@ObfuscatedName("e")
	int field2692;
	@ObfuscatedName("g")
	int[] field2693;
	@ObfuscatedName("y")
	int[] field2694;
	@ObfuscatedName("af")
	int[] field2717;
	@ObfuscatedName("aa")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("ai")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("ag")
	int[][] field2716;
	@ObfuscatedName("aw")
	int[][] field2699;
	@ObfuscatedName("ar")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("al")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("at")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("aj")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("ax")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("az")
	@Export("radius")
	int radius;
	@ObfuscatedName("ap")
	HashMap field2706;
	@ObfuscatedName("by")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bu")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bp")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("bc")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ba")
	public short field2743;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2703 = new class417(); // L: 17
		field2674 = new class417(); // L: 18
		field2739 = new class417(); // L: 19
		field2708 = new boolean[6500]; // L: 55
		field2709 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2712 = new int[6500]; // L: 59
		field2695 = new int[6500]; // L: 60
		field2741 = new int[6500]; // L: 61
		field2715 = new int[6500]; // L: 62
		field2675 = new char[6000]; // L: 64
		field2673 = new char[6000][512]; // L: 65
		field2728 = new int[12]; // L: 66
		field2669 = new int[12][2000]; // L: 67
		field2720 = new int[2000]; // L: 68
		field2721 = new int[2000]; // L: 69
		field2698 = new int[12]; // L: 70
		field2691 = new int[10]; // L: 71
		field2724 = new int[10]; // L: 72
		field2726 = new int[10]; // L: 73
		field2730 = true; // L: 77
		field2733 = Rasterizer3D.Rasterizer3D_sine; // L: 80
		field2734 = Rasterizer3D.Rasterizer3D_cosine; // L: 81
		field2738 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 82
		field2736 = Rasterizer3D.field2489; // L: 83
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2719 = 0;
		this.field2692 = 0;
		this.isSingleTile = false;
		this.field2706 = new HashMap();
	} // L: 92

	@ObfuscatedSignature(
		descriptor = "([Lhs;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2719 = 0; // L: 35
		this.field2692 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2706 = new HashMap(); // L: 50
		boolean var3 = false; // L: 95
		boolean var4 = false; // L: 96
		boolean var5 = false; // L: 97
		boolean var6 = false; // L: 98
		this.verticesCount = 0; // L: 99
		this.indicesCount = 0; // L: 100
		this.field2692 = 0; // L: 101
		this.field2719 = -1; // L: 102

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 103
			var8 = var1[var7]; // L: 104
			if (var8 != null) { // L: 105
				this.verticesCount += var8.verticesCount; // L: 106
				this.indicesCount += var8.indicesCount; // L: 107
				this.field2692 += var8.field2692; // L: 108
				if (var8.faceRenderPriorities != null) { // L: 109
					var3 = true;
				} else {
					if (this.field2719 == -1) { // L: 111
						this.field2719 = var8.field2719;
					}

					if (this.field2719 != var8.field2719) { // L: 112
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 114
				var5 |= var8.faceTextures != null; // L: 115
				var6 |= var8.field2689 != null; // L: 116
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
			this.field2689 = new byte[this.indicesCount];
		}

		if (this.field2692 > 0) { // L: 132
			this.field2693 = new int[this.field2692]; // L: 133
			this.field2694 = new int[this.field2692]; // L: 134
			this.field2717 = new int[this.field2692]; // L: 135
		}

		this.verticesCount = 0; // L: 137
		this.indicesCount = 0; // L: 138
		this.field2692 = 0; // L: 139

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
							this.faceRenderPriorities[this.indicesCount] = var8.field2719; // L: 152
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
						if (var8.field2689 != null && var8.field2689[var9] != -1) { // L: 162
							this.field2689[this.indicesCount] = (byte)(this.field2692 + var8.field2689[var9]);
						} else {
							this.field2689[this.indicesCount] = -1; // L: 163
						}
					}

					++this.indicesCount; // L: 165
				}

				for (var9 = 0; var9 < var8.field2692; ++var9) { // L: 167
					this.field2693[this.field2692] = this.verticesCount + var8.field2693[var9]; // L: 168
					this.field2694[this.field2692] = this.verticesCount + var8.field2694[var9]; // L: 169
					this.field2717[this.field2692] = this.verticesCount + var8.field2717[var9]; // L: 170
					++this.field2692; // L: 171
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhs;"
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
					var11.field2692 = this.field2692; // L: 200
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
					var11.field2689 = this.field2689; // L: 211
					var11.faceTextures = this.faceTextures; // L: 212
					var11.field2719 = this.field2719; // L: 213
					var11.field2693 = this.field2693; // L: 214
					var11.field2694 = this.field2694; // L: 215
					var11.field2717 = this.field2717; // L: 216
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhs;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 261
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 262
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhs;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 266
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 267
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZLhs;[B)Lhs;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 271
		var2.indicesCount = this.indicesCount; // L: 272
		var2.field2692 = this.field2692; // L: 273
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
		var2.field2689 = this.field2689; // L: 301
		var2.faceTextures = this.faceTextures; // L: 302
		var2.field2719 = this.field2719; // L: 303
		var2.field2693 = this.field2693; // L: 304
		var2.field2694 = this.field2694; // L: 305
		var2.field2717 = this.field2717; // L: 306
		var2.vertexLabels = this.vertexLabels; // L: 307
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 308
		var2.field2716 = this.field2716; // L: 309
		var2.field2699 = this.field2699; // L: 310
		var2.isSingleTile = this.isSingleTile; // L: 311
		var2.resetBounds(); // L: 312
		var2.overrideAmount = 0; // L: 313
		return var2; // L: 314
	}

	@ObfuscatedName("c")
	void method4687(int var1) {
		if (!this.field2706.containsKey(var1)) { // L: 318
			int var2 = 0; // L: 319
			int var3 = 0; // L: 320
			int var4 = 0; // L: 321
			int var5 = 0; // L: 322
			int var6 = 0; // L: 323
			int var7 = 0; // L: 324
			int var8 = field2734[var1]; // L: 325
			int var9 = field2733[var1]; // L: 326

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 327
				int var11 = Rasterizer3D.method4347(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 328
				int var12 = this.verticesY[var10]; // L: 329
				int var13 = Rasterizer3D.method4348(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 330
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

			class220 var14 = new class220((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 338
			boolean var15 = true; // L: 339
			if (var14.field2601 < 32) { // L: 340
				var14.field2601 = 32;
			}

			if (var14.field2605 < 32) { // L: 341
				var14.field2605 = 32;
			}

			if (this.isSingleTile) { // L: 342
				boolean var16 = true; // L: 343
				var14.field2601 += 8; // L: 344
				var14.field2605 += 8; // L: 345
			}

			this.field2706.put(var1, var14); // L: 347
		}
	} // L: 348

	@ObfuscatedName("r")
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
	void method4755() {
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

	@ObfuscatedName("m")
	public int method4690() {
		this.calculateBoundsCylinder(); // L: 387
		return this.xzRadius; // L: 388
	}

	@ObfuscatedName("t")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 392
		this.field2706.clear(); // L: 393
	} // L: 394

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)V"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V"
	)
	public void method4727(class133 var1, int var2) {
		Skeleton var3 = var1.field1600; // L: 412
		class217 var4 = var3.method4450(); // L: 413
		if (var4 != null) { // L: 414
			var3.method4450().method4443(var1, var2); // L: 415
			this.method4695(var3.method4450(), var1.method3117()); // L: 416
		}

		if (var1.method3096()) { // L: 418
			this.method4707(var1, var2); // L: 419
		}

		this.resetBounds(); // L: 421
	} // L: 422

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V"
	)
	void method4707(class133 var1, int var2) {
		Skeleton var3 = var1.field1600; // L: 425

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 426
			int var5 = var3.transformTypes[var4]; // L: 427
			if (var5 == 5 && var1.field1601 != null && var1.field1601[var4] != null && var1.field1601[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 428 429
				class125 var6 = var1.field1601[var4][0]; // L: 430
				int[] var7 = var3.labels[var4]; // L: 431
				int var8 = var7.length; // L: 432

				for (int var9 = 0; var9 < var8; ++var9) { // L: 433
					int var10 = var7[var9]; // L: 434
					if (var10 < this.faceLabelsAlpha.length) { // L: 435
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 436

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 437
							int var13 = var11[var12]; // L: 438
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3043(var2) * 255.0F); // L: 439
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhk;I)V"
	)
	void method4695(class217 var1, int var2) {
		this.method4715(var1, var2); // L: 453
	} // L: 455

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lhw;ILhw;I[I)V"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lha;Lei;I[ZZZ)V"
	)
	public void method4697(Skeleton var1, class133 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class217 var7 = var1.method4450(); // L: 490
		if (var7 != null) { // L: 491
			var7.method4423(var2, var3, var4, var5); // L: 492
			if (var6) { // L: 493
				this.method4695(var7, var2.method3117()); // L: 494
			}
		}

		if (!var5 && var2.method3096()) { // L: 497
			this.method4707(var2, var3); // L: 498
		}

	} // L: 500

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I[IZ)V"
	)
	public void method4801(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("d")
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
								var15 = field2733[var14]; // L: 587
								var16 = field2734[var14]; // L: 588
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 589
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 590
								this.verticesX[var11] = var17; // L: 591
							}

							if (var12 != 0) { // L: 593
								var15 = field2733[var12]; // L: 594
								var16 = field2734[var12]; // L: 595
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 596
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 597
								this.verticesY[var11] = var17; // L: 598
							}

							if (var13 != 0) { // L: 600
								var15 = field2733[var13]; // L: 601
								var16 = field2734[var13]; // L: 602
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

	@ObfuscatedName("e")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 657
			int var2 = this.verticesX[var1]; // L: 658
			this.verticesX[var1] = this.verticesZ[var1]; // L: 659
			this.verticesZ[var1] = -var2; // L: 660
		}

		this.resetBounds(); // L: 662
	} // L: 663

	@ObfuscatedName("g")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 666
			this.verticesX[var1] = -this.verticesX[var1]; // L: 667
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 668
		}

		this.resetBounds(); // L: 670
	} // L: 671

	@ObfuscatedName("y")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 674
			int var2 = this.verticesZ[var1]; // L: 675
			this.verticesZ[var1] = this.verticesX[var1]; // L: 676
			this.verticesX[var1] = -var2; // L: 677
		}

		this.resetBounds(); // L: 679
	} // L: 680

	@ObfuscatedName("af")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2733[var1]; // L: 683
		int var3 = field2734[var1]; // L: 684

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 685
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 686
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 687
			this.verticesY[var4] = var5; // L: 688
		}

		this.resetBounds(); // L: 690
	} // L: 691

	@ObfuscatedName("aa")
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

	@ObfuscatedName("ai")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 703
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 704
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 705
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 706
		}

		this.resetBounds(); // L: 708
	} // L: 709

	@ObfuscatedName("ag")
	public final void method4706(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 712
			this.method4755();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 713
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 714
		int var10 = field2733[var1]; // L: 715
		int var11 = field2734[var1]; // L: 716
		int var12 = field2733[var2]; // L: 717
		int var13 = field2734[var2]; // L: 718
		int var14 = field2733[var3]; // L: 719
		int var15 = field2734[var3]; // L: 720
		int var16 = field2733[var4]; // L: 721
		int var17 = field2734[var4]; // L: 722
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
			field2712[var19] = var22 - var18; // L: 749
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 750
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 751
			if (this.field2692 > 0) { // L: 752
				field2695[var19] = var20; // L: 753
				field2741[var19] = var23; // L: 754
				field2715[var19] = var22; // L: 755
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 759
		} catch (Exception var25) { // L: 761
		}

	} // L: 762

	@ObfuscatedName("aw")
	public final void method4794(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 765
			this.method4755();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 766
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 767
		int var11 = field2733[var1]; // L: 768
		int var12 = field2734[var1]; // L: 769
		int var13 = field2733[var2]; // L: 770
		int var14 = field2734[var2]; // L: 771
		int var15 = field2733[var3]; // L: 772
		int var16 = field2734[var3]; // L: 773
		int var17 = field2733[var4]; // L: 774
		int var18 = field2734[var4]; // L: 775
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
			field2712[var20] = var23 - var19; // L: 802
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 803
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 804
			if (this.field2692 > 0) { // L: 805
				field2695[var20] = var21; // L: 806
				field2741[var20] = var24; // L: 807
				field2715[var20] = var23; // L: 808
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 812
		} catch (Exception var26) { // L: 814
		}

	} // L: 815

	@ObfuscatedName("ar")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1008
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1009
				field2675[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1010

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1011
				if (this.faceColors3[var7] != -2) { // L: 1012
					var8 = this.indices1[var7]; // L: 1013
					var9 = this.indices2[var7]; // L: 1014
					var10 = this.indices3[var7]; // L: 1015
					var11 = modelViewportXs[var8]; // L: 1016
					var12 = modelViewportXs[var9]; // L: 1017
					var28 = modelViewportXs[var10]; // L: 1018
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1019
						if (var2) { // L: 1045
							var15 = modelViewportYs[var8]; // L: 1047
							var16 = modelViewportYs[var9]; // L: 1048
							var30 = modelViewportYs[var10]; // L: 1049
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 1051
							boolean var35;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 1052
								var35 = false; // L: 1053
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1056
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 1057
									var35 = false; // L: 1058
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1061
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1062
										var35 = false; // L: 1063
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1066
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1067
											var35 = false; // L: 1068
										} else {
											var35 = true; // L: 1071
										}
									}
								}
							}

							if (var35) { // L: 1073
								GrandExchangeEvent.method6700(var4); // L: 1074
								var2 = false; // L: 1075
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1078
							field2709[var7] = false; // L: 1079
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1080
								field2708[var7] = false; // L: 1081
							} else {
								field2708[var7] = true;
							}

							var29 = (field2712[var8] + field2712[var9] + field2712[var10]) / 3 + this.radius; // L: 1082
							field2673[var29][field2675[var29]++] = var7; // L: 1083
						}
					} else {
						var29 = field2695[var8]; // L: 1020
						var15 = field2695[var9]; // L: 1021
						var16 = field2695[var10]; // L: 1022
						var30 = field2741[var8]; // L: 1023
						var18 = field2741[var9]; // L: 1024
						int var19 = field2741[var10]; // L: 1025
						int var20 = field2715[var8]; // L: 1026
						int var21 = field2715[var9]; // L: 1027
						int var22 = field2715[var10]; // L: 1028
						var29 -= var15; // L: 1029
						var16 -= var15; // L: 1030
						var30 -= var18; // L: 1031
						var19 -= var18; // L: 1032
						var20 -= var21; // L: 1033
						var22 -= var21; // L: 1034
						int var23 = var30 * var22 - var20 * var19; // L: 1035
						int var24 = var20 * var16 - var29 * var22; // L: 1036
						int var25 = var29 * var19 - var30 * var16; // L: 1037
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1038
							field2709[var7] = true; // L: 1039
							int var26 = (field2712[var8] + field2712[var9] + field2712[var10]) / 3 + this.radius; // L: 1040
							field2673[var26][field2675[var26]++] = var7; // L: 1041
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1087
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1088
					var32 = field2675[var31]; // L: 1089
					if (var32 > 0) { // L: 1090
						var27 = field2673[var31]; // L: 1091

						for (var10 = 0; var10 < var32; ++var10) { // L: 1092
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1097
					field2728[var31] = 0; // L: 1098
					field2698[var31] = 0; // L: 1099
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1101
					var32 = field2675[var31]; // L: 1102
					if (var32 > 0) { // L: 1103
						var27 = field2673[var31]; // L: 1104

						for (var10 = 0; var10 < var32; ++var10) { // L: 1105
							char var33 = var27[var10]; // L: 1106
							byte var34 = this.faceRenderPriorities[var33]; // L: 1107
							var28 = field2728[var34]++; // L: 1108
							field2669[var34][var28] = var33; // L: 1109
							if (var34 < 10) { // L: 1110
								int[] var36 = field2698;
								var36[var34] += var31;
							} else if (var34 == 10) { // L: 1111
								field2720[var28] = var31;
							} else {
								field2721[var28] = var31; // L: 1112
							}
						}
					}
				}

				var31 = 0; // L: 1116
				if (field2728[1] > 0 || field2728[2] > 0) { // L: 1117
					var31 = (field2698[1] + field2698[2]) / (field2728[1] + field2728[2]);
				}

				var8 = 0; // L: 1118
				if (field2728[3] > 0 || field2728[4] > 0) { // L: 1119
					var8 = (field2698[3] + field2698[4]) / (field2728[3] + field2728[4]);
				}

				var9 = 0; // L: 1120
				if (field2728[6] > 0 || field2728[8] > 0) { // L: 1121
					var9 = (field2698[8] + field2698[6]) / (field2728[8] + field2728[6]);
				}

				var11 = 0; // L: 1123
				var12 = field2728[10]; // L: 1124
				int[] var13 = field2669[10]; // L: 1125
				int[] var14 = field2720; // L: 1126
				if (var11 == var12) { // L: 1127
					var11 = 0; // L: 1128
					var12 = field2728[11]; // L: 1129
					var13 = field2669[11]; // L: 1130
					var14 = field2721; // L: 1131
				}

				if (var11 < var12) { // L: 1133
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1134
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1135
					while (var15 == 0 && var10 > var31) { // L: 1136
						this.drawFace(var13[var11++]); // L: 1137
						if (var11 == var12 && var13 != field2669[11]) { // L: 1138
							var11 = 0; // L: 1139
							var12 = field2728[11]; // L: 1140
							var13 = field2669[11]; // L: 1141
							var14 = field2721; // L: 1142
						}

						if (var11 < var12) { // L: 1144
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1145
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1147
						this.drawFace(var13[var11++]); // L: 1148
						if (var11 == var12 && var13 != field2669[11]) { // L: 1149
							var11 = 0; // L: 1150
							var12 = field2728[11]; // L: 1151
							var13 = field2669[11]; // L: 1152
							var14 = field2721; // L: 1153
						}

						if (var11 < var12) { // L: 1155
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1156
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1158
						this.drawFace(var13[var11++]); // L: 1159
						if (var11 == var12 && var13 != field2669[11]) { // L: 1160
							var11 = 0; // L: 1161
							var12 = field2728[11]; // L: 1162
							var13 = field2669[11]; // L: 1163
							var14 = field2721; // L: 1164
						}

						if (var11 < var12) { // L: 1166
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1167
						}
					}

					var16 = field2728[var15]; // L: 1169
					int[] var17 = field2669[var15]; // L: 1170

					for (var18 = 0; var18 < var16; ++var18) { // L: 1171
						this.drawFace(var17[var18]); // L: 1172
					}
				}

				while (var10 != -1000) { // L: 1175
					this.drawFace(var13[var11++]); // L: 1176
					if (var11 == var12 && var13 != field2669[11]) { // L: 1177
						var11 = 0; // L: 1178
						var13 = field2669[11]; // L: 1179
						var12 = field2728[11]; // L: 1180
						var14 = field2721; // L: 1181
					}

					if (var11 < var12) { // L: 1183
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1184
					}
				}

			}
		}
	} // L: 1095 1186

	@ObfuscatedName("al")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2709[var1]) { // L: 1189
			this.method4713(var1); // L: 1190
		} else {
			int var2 = this.indices1[var1]; // L: 1193
			int var3 = this.indices2[var1]; // L: 1194
			int var4 = this.indices3[var1]; // L: 1195
			Rasterizer3D.field2495 = field2708[var1]; // L: 1196
			if (this.faceAlphas == null) { // L: 1197
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1198
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1201
			}

			this.method4712(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1203
		}
	} // L: 1191 1204

	@ObfuscatedName("at")
	boolean method4711(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2743; // L: 1207
	}

	@ObfuscatedName("aj")
	final void method4712(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1211
			int var12;
			int var13;
			int var15;
			if (this.field2689 != null && this.field2689[var1] != -1) { // L: 1230
				int var14 = this.field2689[var1] & 255; // L: 1231
				var15 = this.field2693[var14]; // L: 1232
				var12 = this.field2694[var14]; // L: 1233
				var13 = this.field2717[var14]; // L: 1234
			} else {
				var15 = this.indices1[var1]; // L: 1237
				var12 = this.indices2[var1]; // L: 1238
				var13 = this.indices3[var1]; // L: 1239
			}

			if (this.faceColors3[var1] == -1) { // L: 1241
				Rasterizer3D.method4342(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2695[var15], field2695[var12], field2695[var13], field2741[var15], field2741[var12], field2741[var13], field2715[var15], field2715[var12], field2715[var13], this.faceTextures[var1]); // L: 1242
			} else {
				Rasterizer3D.method4342(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2695[var15], field2695[var12], field2695[var13], field2741[var15], field2741[var12], field2741[var13], field2715[var15], field2715[var12], field2715[var13], this.faceTextures[var1]); // L: 1245
			}
		} else {
			boolean var11 = this.method4711(var1); // L: 1212
			if (this.faceColors3[var1] == -1 && var11) { // L: 1213
				Rasterizer3D.method4340(var2, var3, var4, var5, var6, var7, field2738[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1214
			} else if (this.faceColors3[var1] == -1) { // L: 1216
				Rasterizer3D.method4339(var2, var3, var4, var5, var6, var7, field2738[this.faceColors1[var1]]); // L: 1217
			} else if (var11) { // L: 1219
				Rasterizer3D.method4336(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1220
			} else {
				Rasterizer3D.method4366(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1223
			}
		}

	} // L: 1248

	@ObfuscatedName("ax")
	final void method4713(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1251
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1252
		int var4 = 0; // L: 1253
		int var5 = this.indices1[var1]; // L: 1254
		int var6 = this.indices2[var1]; // L: 1255
		int var7 = this.indices3[var1]; // L: 1256
		int var8 = field2715[var5]; // L: 1257
		int var9 = field2715[var6]; // L: 1258
		int var10 = field2715[var7]; // L: 1259
		if (this.faceAlphas == null) { // L: 1260
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1261
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1262
			field2691[var4] = modelViewportXs[var5]; // L: 1263
			field2724[var4] = modelViewportYs[var5]; // L: 1264
			field2726[var4++] = this.faceColors1[var1]; // L: 1265
		} else {
			var11 = field2695[var5]; // L: 1268
			var12 = field2741[var5]; // L: 1269
			var13 = this.faceColors1[var1]; // L: 1270
			if (var10 >= 50) { // L: 1271
				var14 = field2736[var10 - var8] * (50 - var8); // L: 1272
				field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var7] - var11) * var14 >> 16)) / 50; // L: 1273
				field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var7] - var12) * var14 >> 16)) / 50; // L: 1274
				field2726[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1275
			}

			if (var9 >= 50) { // L: 1277
				var14 = field2736[var9 - var8] * (50 - var8); // L: 1278
				field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var6] - var11) * var14 >> 16)) / 50; // L: 1279
				field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var6] - var12) * var14 >> 16)) / 50; // L: 1280
				field2726[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1281
			}
		}

		if (var9 >= 50) { // L: 1284
			field2691[var4] = modelViewportXs[var6]; // L: 1285
			field2724[var4] = modelViewportYs[var6]; // L: 1286
			field2726[var4++] = this.faceColors2[var1]; // L: 1287
		} else {
			var11 = field2695[var6]; // L: 1290
			var12 = field2741[var6]; // L: 1291
			var13 = this.faceColors2[var1]; // L: 1292
			if (var8 >= 50) { // L: 1293
				var14 = field2736[var8 - var9] * (50 - var9); // L: 1294
				field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var5] - var11) * var14 >> 16)) / 50; // L: 1295
				field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var5] - var12) * var14 >> 16)) / 50; // L: 1296
				field2726[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1297
			}

			if (var10 >= 50) { // L: 1299
				var14 = field2736[var10 - var9] * (50 - var9); // L: 1300
				field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var7] - var11) * var14 >> 16)) / 50; // L: 1301
				field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var7] - var12) * var14 >> 16)) / 50; // L: 1302
				field2726[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1303
			}
		}

		if (var10 >= 50) { // L: 1306
			field2691[var4] = modelViewportXs[var7]; // L: 1307
			field2724[var4] = modelViewportYs[var7]; // L: 1308
			field2726[var4++] = this.faceColors3[var1]; // L: 1309
		} else {
			var11 = field2695[var7]; // L: 1312
			var12 = field2741[var7]; // L: 1313
			var13 = this.faceColors3[var1]; // L: 1314
			if (var9 >= 50) { // L: 1315
				var14 = field2736[var9 - var10] * (50 - var10); // L: 1316
				field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var6] - var11) * var14 >> 16)) / 50; // L: 1317
				field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var6] - var12) * var14 >> 16)) / 50; // L: 1318
				field2726[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1319
			}

			if (var8 >= 50) { // L: 1321
				var14 = field2736[var8 - var10] * (50 - var10); // L: 1322
				field2691[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2695[var5] - var11) * var14 >> 16)) / 50; // L: 1323
				field2724[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2741[var5] - var12) * var14 >> 16)) / 50; // L: 1324
				field2726[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1325
			}
		}

		var11 = field2691[0]; // L: 1328
		var12 = field2691[1]; // L: 1329
		var13 = field2691[2]; // L: 1330
		var14 = field2724[0]; // L: 1331
		int var15 = field2724[1]; // L: 1332
		int var16 = field2724[2]; // L: 1333
		Rasterizer3D.field2495 = false; // L: 1334
		if (var4 == 3) { // L: 1335
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1336
				Rasterizer3D.field2495 = true;
			}

			this.method4712(var1, var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2]); // L: 1337
		}

		if (var4 == 4) { // L: 1339
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2691[3] < 0 || field2691[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1340
				Rasterizer3D.field2495 = true;
			}

			int var18;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1341
				int var19;
				int var21;
				if (this.field2689 != null && this.field2689[var1] != -1) { // L: 1366
					int var20 = this.field2689[var1] & 255; // L: 1367
					var21 = this.field2693[var20]; // L: 1368
					var18 = this.field2694[var20]; // L: 1369
					var19 = this.field2717[var20]; // L: 1370
				} else {
					var21 = var5; // L: 1373
					var18 = var6; // L: 1374
					var19 = var7; // L: 1375
				}

				short var22 = this.faceTextures[var1]; // L: 1377
				if (this.faceColors3[var1] == -1) { // L: 1378
					Rasterizer3D.method4342(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22); // L: 1379
					Rasterizer3D.method4342(var14, var16, field2724[3], var11, var13, field2691[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22); // L: 1380
				} else {
					Rasterizer3D.method4342(var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22); // L: 1383
					Rasterizer3D.method4342(var14, var16, field2724[3], var11, var13, field2691[3], field2726[0], field2726[2], field2726[3], field2695[var21], field2695[var18], field2695[var19], field2741[var21], field2741[var18], field2741[var19], field2715[var21], field2715[var18], field2715[var19], var22); // L: 1384
				}
			} else {
				boolean var17 = this.method4711(var1); // L: 1342
				if (this.faceColors3[var1] == -1 && var17) { // L: 1343
					var18 = field2738[this.faceColors1[var1]]; // L: 1344
					Rasterizer3D.method4340(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1345
					Rasterizer3D.method4340(var14, var16, field2724[3], var11, var13, field2691[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1346
				} else if (this.faceColors3[var1] == -1) { // L: 1348
					var18 = field2738[this.faceColors1[var1]]; // L: 1349
					Rasterizer3D.method4339(var14, var15, var16, var11, var12, var13, var18); // L: 1350
					Rasterizer3D.method4339(var14, var16, field2724[3], var11, var13, field2691[3], var18); // L: 1351
				} else if (var17) { // L: 1353
					Rasterizer3D.method4336(var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1354
					Rasterizer3D.method4336(var14, var16, field2724[3], var11, var13, field2691[3], field2726[0], field2726[2], field2726[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1355
				} else {
					Rasterizer3D.method4366(var14, var15, var16, var11, var12, var13, field2726[0], field2726[1], field2726[2]); // L: 1358
					Rasterizer3D.method4366(var14, var16, field2724[3], var11, var13, field2691[3], field2726[0], field2726[2], field2726[3]); // L: 1359
				}
			}
		}

	} // L: 1388

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILpb;)V"
	)
	void method4714(int var1, class417 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1391
		float var4 = (float)(-this.verticesY[var1]); // L: 1392
		float var5 = (float)(-this.verticesZ[var1]); // L: 1393
		float var6 = 1.0F; // L: 1394
		this.verticesX[var1] = (int)(var2.field4644[0] * var3 + var2.field4644[4] * var4 + var2.field4644[8] * var5 + var2.field4644[12] * var6); // L: 1395
		this.verticesY[var1] = -((int)(var2.field4644[1] * var3 + var2.field4644[5] * var4 + var2.field4644[9] * var5 + var2.field4644[13] * var6)); // L: 1396
		this.verticesZ[var1] = -((int)(var2.field4644[2] * var3 + var2.field4644[6] * var4 + var2.field4644[10] * var5 + var2.field4644[14] * var6)); // L: 1397
	} // L: 1398

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhk;I)V"
	)
	void method4715(class217 var1, int var2) {
		if (this.field2716 != null) { // L: 1401
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1402
				int[] var4 = this.field2716[var3]; // L: 1403
				if (var4 != null && var4.length != 0) { // L: 1404
					int[] var5 = this.field2699[var3]; // L: 1405
					field2703.method7955(); // L: 1406

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1407
						int var7 = var4[var6]; // L: 1408
						class122 var8 = var1.method4425(var7); // L: 1409
						if (var8 != null) { // L: 1410
							field2674.method7936((float)var5[var6] / 255.0F); // L: 1411
							field2739.method7915(var8.method3003(var2)); // L: 1412
							field2739.method7914(field2674); // L: 1413
							field2703.method7917(field2739); // L: 1414
						}
					}

					this.method4714(var3, field2703); // L: 1416
				}
			}

		}
	} // L: 1418

	@ObfuscatedName("cx")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 818
			this.calculateBoundsCylinder();
		}

		this.method4687(var1); // L: 819
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

							boolean var27 = var26 || this.field2692 > 0; // L: 842
							int var28 = ViewportMouse.ViewportMouse_x; // L: 845
							int var30 = ViewportMouse.ViewportMouse_y; // L: 850
							boolean var32 = ViewportMouse.ViewportMouse_isInViewport; // L: 855
							boolean var35 = var9 != 0L; // L: 860
							boolean var36;
							if (var35) { // L: 861
								var36 = (int)(var9 >>> 16 & 1L) == 1; // L: 864
								var35 = !var36; // L: 866
							}

							var36 = false; // L: 871
							int var42;
							int var43;
							int var44;
							int var45;
							int var51;
							int var57;
							int var58;
							if (var35 && var32) { // L: 872
								boolean var37 = false; // L: 873
								if (field2730) { // L: 874
									boolean var40 = ViewportMouse.ViewportMouse_isInViewport; // L: 880
									boolean var38;
									if (!var40) { // L: 882
										var38 = false; // L: 883
									} else {
										FriendsChatManager.method7573(); // L: 886
										class220 var41 = (class220)this.field2706.get(var1); // L: 887
										var42 = var41.field2600 + var6; // L: 888
										var43 = var7 + var41.field2607; // L: 889
										var44 = var8 + var41.field2602; // L: 890
										var45 = var41.field2601; // L: 891
										int var46 = var41.field2604; // L: 892
										int var47 = var41.field2605; // L: 893
										int var48 = class148.field1702 - var42; // L: 894
										int var49 = GrandExchangeEvent.field4284 - var43; // L: 895
										int var50 = ViewportMouse.field2744 - var44; // L: 896
										if (Math.abs(var48) > var45 + class172.field1868) { // L: 897
											var38 = false; // L: 898
										} else if (Math.abs(var49) > var46 + class137.field1639) { // L: 901
											var38 = false; // L: 902
										} else if (Math.abs(var50) > var47 + class151.field1743) { // L: 905
											var38 = false; // L: 906
										} else if (Math.abs(var50 * VerticalAlignment.field2071 - var49 * class14.field79) > var46 * class151.field1743 + var47 * class137.field1639) { // L: 909
											var38 = false; // L: 910
										} else if (Math.abs(var48 * class14.field79 - var50 * class419.field4661) > var45 * class151.field1743 + var47 * class172.field1868) { // L: 913
											var38 = false; // L: 914
										} else if (Math.abs(var49 * class419.field4661 - var48 * VerticalAlignment.field2071) > var45 * class137.field1639 + var46 * class172.field1868) { // L: 917
											var38 = false; // L: 918
										} else {
											var38 = true; // L: 921
										}
									}

									var37 = var38; // L: 923
								} else {
									var58 = var12 - var13; // L: 926
									if (var58 <= 50) { // L: 927
										var58 = 50;
									}

									if (var15 > 0) { // L: 928
										var16 /= var14; // L: 929
										var17 /= var58; // L: 930
									} else {
										var17 /= var14; // L: 933
										var16 /= var58; // L: 934
									}

									if (var18 > 0) { // L: 936
										var23 /= var14; // L: 937
										var21 /= var58; // L: 938
									} else {
										var21 /= var14; // L: 941
										var23 /= var58; // L: 942
									}

									var51 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 944
									var57 = var30 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 945
									if (var51 > var16 && var51 < var17 && var57 > var23 && var57 < var21) { // L: 946
										var37 = true; // L: 947
									}
								}

								if (var37) { // L: 950
									if (this.isSingleTile) { // L: 951
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 954
									} else {
										var36 = true; // L: 957
									}
								}
							}

							int var56 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 960
							var58 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 961
							var51 = 0; // L: 962
							var57 = 0; // L: 963
							if (var1 != 0) { // L: 964
								var51 = field2733[var1]; // L: 965
								var57 = field2734[var1]; // L: 966
							}

							for (int var54 = 0; var54 < this.verticesCount; ++var54) { // L: 968
								var42 = this.verticesX[var54]; // L: 969
								var43 = this.verticesY[var54]; // L: 970
								var44 = this.verticesZ[var54]; // L: 971
								if (var1 != 0) { // L: 972
									var45 = var44 * var51 + var42 * var57 >> 16; // L: 973
									var44 = var44 * var57 - var42 * var51 >> 16; // L: 974
									var42 = var45; // L: 975
								}

								var42 += var6; // L: 977
								var43 += var7; // L: 978
								var44 += var8; // L: 979
								var45 = var44 * var4 + var5 * var42 >> 16; // L: 980
								var44 = var5 * var44 - var42 * var4 >> 16; // L: 981
								var42 = var45; // L: 982
								var45 = var3 * var43 - var44 * var2 >> 16; // L: 983
								var44 = var43 * var2 + var3 * var44 >> 16; // L: 984
								field2712[var54] = var44 - var12; // L: 986
								if (var44 >= 50) { // L: 987
									modelViewportXs[var54] = var42 * Rasterizer3D.Rasterizer3D_zoom / var44 + var56; // L: 988
									modelViewportYs[var54] = var45 * Rasterizer3D.Rasterizer3D_zoom / var44 + var58; // L: 989
								} else {
									modelViewportXs[var54] = -5000; // L: 992
									var25 = true; // L: 993
								}

								if (var27) { // L: 995
									field2695[var54] = var42; // L: 996
									field2741[var54] = var45; // L: 997
									field2715[var54] = var44; // L: 998
								}
							}

							try {
								this.draw0(var25, var36, this.isSingleTile, var9); // L: 1002
							} catch (Exception var55) { // L: 1004
							}

						}
					}
				}
			}
		}
	} // L: 1005
}
