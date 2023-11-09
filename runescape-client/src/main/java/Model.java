import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("an")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ab")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static class438 field2687;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static class438 field2703;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static class438 field2689;
	@ObfuscatedName("bz")
	static boolean[] field2722;
	@ObfuscatedName("bm")
	static boolean[] field2723;
	@ObfuscatedName("bf")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bu")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bk")
	static float[] field2726;
	@ObfuscatedName("bb")
	static int[] field2727;
	@ObfuscatedName("bx")
	static int[] field2728;
	@ObfuscatedName("by")
	static int[] field2729;
	@ObfuscatedName("bd")
	static int[] field2708;
	@ObfuscatedName("ba")
	static char[] field2732;
	@ObfuscatedName("bj")
	static char[][] field2688;
	@ObfuscatedName("br")
	static int[] field2734;
	@ObfuscatedName("cb")
	static int[][] field2735;
	@ObfuscatedName("cg")
	static int[] field2736;
	@ObfuscatedName("cr")
	static int[] field2737;
	@ObfuscatedName("ce")
	static int[] field2738;
	@ObfuscatedName("cn")
	static int[] field2683;
	@ObfuscatedName("cd")
	static int[] field2684;
	@ObfuscatedName("cz")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cl")
	static float[] field2709;
	@ObfuscatedName("ck")
	static int[] field2741;
	@ObfuscatedName("ch")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cs")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("ci")
	static boolean field2759;
	@ObfuscatedName("cc")
	static int[] field2749;
	@ObfuscatedName("ct")
	static int[] field2750;
	@ObfuscatedName("cm")
	static int[] field2751;
	@ObfuscatedName("cw")
	static int[] field2697;
	@ObfuscatedName("cp")
	static final float field2755;
	@ObfuscatedName("aj")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ac")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ag")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ad")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("aw")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ae")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ah")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ap")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("as")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("am")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ao")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("af")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("av")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("aq")
	byte[] field2699;
	@ObfuscatedName("az")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ak")
	public byte field2705;
	@ObfuscatedName("aa")
	public int field2702;
	@ObfuscatedName("au")
	int[] field2744;
	@ObfuscatedName("ai")
	int[] field2742;
	@ObfuscatedName("bp")
	int[] field2710;
	@ObfuscatedName("bw")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bq")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bi")
	int[][] field2712;
	@ObfuscatedName("bg")
	int[][] field2752;
	@ObfuscatedName("bh")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bc")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bo")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("be")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bv")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bl")
	@Export("radius")
	int radius;
	@ObfuscatedName("bs")
	HashMap field2720;
	@ObfuscatedName("cy")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cu")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cv")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cj")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cf")
	public short field2760;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2687 = new class438(); // L: 17
		field2703 = new class438(); // L: 18
		field2689 = new class438(); // L: 19
		field2722 = new boolean[6500]; // L: 55
		field2723 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2726 = new float[6500]; // L: 59
		field2727 = new int[6500]; // L: 60
		field2728 = new int[6500]; // L: 61
		field2729 = new int[6500]; // L: 62
		field2708 = new int[6500]; // L: 63
		field2732 = new char[6000]; // L: 65
		field2688 = new char[6000][512]; // L: 66
		field2734 = new int[12]; // L: 67
		field2735 = new int[12][2000]; // L: 68
		field2736 = new int[2000]; // L: 69
		field2737 = new int[2000]; // L: 70
		field2738 = new int[12]; // L: 71
		field2683 = new int[10]; // L: 72
		field2684 = new int[10]; // L: 73
		field2741 = new int[10]; // L: 74
		field2709 = new float[10]; // L: 75
		field2759 = true; // L: 79
		field2749 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field2750 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2751 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2697 = Rasterizer3D.field2516; // L: 85
		field2755 = class89.method2260(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2705 = 0;
		this.field2702 = 0;
		this.isSingleTile = false;
		this.field2720 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2705 = 0;
		this.field2702 = 0;
		this.isSingleTile = false;
		this.field2720 = new HashMap();
		this.method4749(var1, var2, var3); // L: 121
		this.field2705 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2702 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Ljh;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2705 = 0; // L: 35
		this.field2702 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2720 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2702 = 0; // L: 100
		this.field2705 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2702 += var4.field2702; // L: 107
				if (this.field2705 == -1) { // L: 108
					this.field2705 = var4.field2705;
				}
			}
		}

		this.method4749(this.verticesCount, this.indicesCount, this.field2702); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2702 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method4825(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("ay")
	void method4749(int var1, int var2, int var3) {
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
			this.field2744 = new int[var3]; // L: 139
			this.field2742 = new int[var3]; // L: 140
			this.field2710 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljh;)V"
	)
	void method4748(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2705 != var1.field2705)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2705); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2699 == null && var1.field2699 != null) { // L: 159
			this.field2699 = new byte[var2]; // L: 160
			Arrays.fill(this.field2699, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljh;)V"
	)
	public void method4825(Model var1) {
		if (var1 != null) { // L: 166
			this.method4748(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2705; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2699 != null) { // L: 186
					if (var1.field2699 != null && var1.field2699[var2] != -1) { // L: 187
						this.field2699[this.indicesCount] = (byte)(var1.field2699[var2] + this.field2702); // L: 188
					} else {
						this.field2699[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2702; ++var2) { // L: 196
				this.field2744[this.field2702] = this.verticesCount + var1.field2744[var2]; // L: 197
				this.field2742[this.field2702] = this.verticesCount + var1.field2742[var2]; // L: 198
				this.field2710[this.field2702] = this.verticesCount + var1.field2710[var2]; // L: 199
				++this.field2702; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljh;"
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
					var11.field2702 = this.field2702; // L: 227
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
					var11.field2699 = this.field2699; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2705 = this.field2705; // L: 240
					var11.field2744 = this.field2744; // L: 241
					var11.field2742 = this.field2742; // L: 242
					var11.field2710 = this.field2710; // L: 243
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljh;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljh;"
	)
	public Model method4752(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZLjh;[B)Ljh;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2702 = this.field2702; // L: 300
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
		var2.field2699 = this.field2699; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2705 = this.field2705; // L: 330
		var2.field2744 = this.field2744; // L: 331
		var2.field2742 = this.field2742; // L: 332
		var2.field2710 = this.field2710; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2712 = this.field2712; // L: 336
		var2.field2752 = this.field2752; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("ad")
	void method4754(int var1) {
		if (!this.field2720.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field2750[var1]; // L: 352
			int var9 = field2749[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var11 = ApproximateRouteStrategy.method1196(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 355
				int var12 = this.verticesY[var10]; // L: 356
				int var13 = class169.method3363(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 357
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

			class230 var14 = new class230((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 365
			boolean var15 = true; // L: 366
			if (var14.field2616 < 32) { // L: 367
				var14.field2616 = 32;
			}

			if (var14.field2611 < 32) { // L: 368
				var14.field2611 = 32;
			}

			if (this.isSingleTile) { // L: 369
				boolean var16 = true; // L: 370
				var14.field2616 += 8; // L: 371
				var14.field2611 += 8; // L: 372
			}

			this.field2720.put(var1, var14); // L: 374
		}
	} // L: 375

	@ObfuscatedName("aw")
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

	@ObfuscatedName("ae")
	void method4756() {
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

	@ObfuscatedName("ah")
	public int method4757() {
		this.calculateBoundsCylinder(); // L: 414
		return this.xzRadius; // L: 415
	}

	@ObfuscatedName("ap")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 419
		this.field2720.clear(); // L: 420
	} // L: 421

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfx;I)V"
	)
	public void method4842(class137 var1, int var2) {
		Skeleton var3 = var1.field1579; // L: 439
		class226 var4 = var3.method4471(); // L: 440
		if (var4 != null) { // L: 441
			var3.method4471().method4410(var1, var2); // L: 442
			this.method4762(var3.method4471(), var1.method3038()); // L: 443
		}

		if (var1.method3046()) { // L: 445
			this.method4866(var1, var2); // L: 446
		}

		this.resetBounds(); // L: 448
	} // L: 449

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfx;I)V"
	)
	void method4866(class137 var1, int var2) {
		Skeleton var3 = var1.field1579; // L: 452

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 453
			int var5 = var3.transformTypes[var4]; // L: 454
			if (var5 == 5 && var1.field1576 != null && var1.field1576[var4] != null && var1.field1576[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 455 456
				class129 var6 = var1.field1576[var4][0]; // L: 457
				int[] var7 = var3.labels[var4]; // L: 458
				int var8 = var7.length; // L: 459

				for (int var9 = 0; var9 < var8; ++var9) { // L: 460
					int var10 = var7[var9]; // L: 461
					if (var10 < this.faceLabelsAlpha.length) { // L: 462
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 463

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 464
							int var13 = var11[var12]; // L: 465
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2964(var2) * 255.0F); // L: 466
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lit;I)V"
	)
	void method4762(class226 var1, int var2) {
		this.method4782(var1, var2); // L: 480
	} // L: 482

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lio;ILio;I[I)V"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lfx;I[ZZZ)V"
	)
	public void method4768(Skeleton var1, class137 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class226 var7 = var1.method4471(); // L: 517
		if (var7 != null) { // L: 518
			var7.method4409(var2, var3, var4, var5); // L: 519
			if (var6) { // L: 520
				this.method4762(var7, var2.method3038()); // L: 521
			}
		}

		if (!var5 && var2.method3046()) { // L: 524
			this.method4866(var2, var3); // L: 525
		}

	} // L: 527

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lio;I[IZ)V"
	)
	public void method4765(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ak")
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
								var15 = field2749[var14]; // L: 614
								var16 = field2750[var14]; // L: 615
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 616
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 617
								this.verticesX[var11] = var17; // L: 618
							}

							if (var12 != 0) { // L: 620
								var15 = field2749[var12]; // L: 621
								var16 = field2750[var12]; // L: 622
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 623
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 624
								this.verticesY[var11] = var17; // L: 625
							}

							if (var13 != 0) { // L: 627
								var15 = field2749[var13]; // L: 628
								var16 = field2750[var13]; // L: 629
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

	@ObfuscatedName("aa")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 684
			int var2 = this.verticesX[var1]; // L: 685
			this.verticesX[var1] = this.verticesZ[var1]; // L: 686
			this.verticesZ[var1] = -var2; // L: 687
		}

		this.resetBounds(); // L: 689
	} // L: 690

	@ObfuscatedName("au")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 693
			this.verticesX[var1] = -this.verticesX[var1]; // L: 694
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("ai")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 701
			int var2 = this.verticesZ[var1]; // L: 702
			this.verticesZ[var1] = this.verticesX[var1]; // L: 703
			this.verticesX[var1] = -var2; // L: 704
		}

		this.resetBounds(); // L: 706
	} // L: 707

	@ObfuscatedName("bp")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2749[var1]; // L: 710
		int var3 = field2750[var1]; // L: 711

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 712
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 713
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 714
			this.verticesY[var4] = var5; // L: 715
		}

		this.resetBounds(); // L: 717
	} // L: 718

	@ObfuscatedName("bw")
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

	@ObfuscatedName("bq")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 730
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 731
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 732
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 733
		}

		this.resetBounds(); // L: 735
	} // L: 736

	@ObfuscatedName("bi")
	public final void method4773(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 739
			this.method4756();
		}

		int var8 = Rasterizer3D.method4323(); // L: 740
		int var9 = Rasterizer3D.method4324(); // L: 741
		int var10 = field2749[var1]; // L: 742
		int var11 = field2750[var1]; // L: 743
		int var12 = field2749[var2]; // L: 744
		int var13 = field2750[var2]; // L: 745
		int var14 = field2749[var3]; // L: 746
		int var15 = field2750[var3]; // L: 747
		int var16 = field2749[var4]; // L: 748
		int var17 = field2750[var4]; // L: 749
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
			field2727[var19] = var22 - var18; // L: 776
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method4329() / var22; // L: 777
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method4329() / var22; // L: 778
			field2726[var19] = class89.method2260(var22); // L: 779
			if (this.field2702 > 0) { // L: 780
				field2728[var19] = var20; // L: 781
				field2729[var19] = var23; // L: 782
				field2708[var19] = var22; // L: 783
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 787
		} catch (Exception var25) { // L: 789
		}

	} // L: 790

	@ObfuscatedName("bg")
	public final void method4818(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 793
			this.method4756();
		}

		int var9 = Rasterizer3D.method4323(); // L: 794
		int var10 = Rasterizer3D.method4324(); // L: 795
		int var11 = field2749[var1]; // L: 796
		int var12 = field2750[var1]; // L: 797
		int var13 = field2749[var2]; // L: 798
		int var14 = field2750[var2]; // L: 799
		int var15 = field2749[var3]; // L: 800
		int var16 = field2750[var3]; // L: 801
		int var17 = field2749[var4]; // L: 802
		int var18 = field2750[var4]; // L: 803
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
			field2727[var20] = var23 - var19; // L: 830
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method4329() / var8; // L: 831
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method4329() / var8; // L: 832
			field2726[var20] = class89.method2260(var8); // L: 833
			if (this.field2702 > 0) { // L: 834
				field2728[var20] = var21; // L: 835
				field2729[var20] = var24; // L: 836
				field2708[var20] = var23; // L: 837
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 841
		} catch (Exception var26) { // L: 843
		}

	} // L: 844

	@ObfuscatedName("bh")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1083
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1084
				field2732[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1085

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1086
				if (this.faceColors3[var7] != -2) { // L: 1087
					var8 = this.indices1[var7]; // L: 1088
					var9 = this.indices2[var7]; // L: 1089
					var10 = this.indices3[var7]; // L: 1090
					var11 = modelViewportXs[var8]; // L: 1091
					var12 = modelViewportXs[var9]; // L: 1092
					var28 = modelViewportXs[var10]; // L: 1093
					int var29;
					if (var1 && (var11 == -5000 || var12 == -5000 || var28 == -5000)) { // L: 1094
						var29 = field2728[var8]; // L: 1095
						var15 = field2728[var9]; // L: 1096
						var16 = field2728[var10]; // L: 1097
						int var30 = field2729[var8]; // L: 1098
						var18 = field2729[var9]; // L: 1099
						int var19 = field2729[var10]; // L: 1100
						int var20 = field2708[var8]; // L: 1101
						int var21 = field2708[var9]; // L: 1102
						int var22 = field2708[var10]; // L: 1103
						var29 -= var15; // L: 1104
						var16 -= var15; // L: 1105
						var30 -= var18; // L: 1106
						var19 -= var18; // L: 1107
						var20 -= var21; // L: 1108
						var22 -= var21; // L: 1109
						int var23 = var30 * var22 - var20 * var19; // L: 1110
						int var24 = var20 * var16 - var29 * var22; // L: 1111
						int var25 = var29 * var19 - var30 * var16; // L: 1112
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1113
							field2723[var7] = true; // L: 1114
							int var26 = (field2727[var8] + field2727[var9] + field2727[var10]) / 3 + this.radius; // L: 1115
							field2688[var26][field2732[var26]++] = var7; // L: 1116
						}
					} else {
						if (var2 && class125.method2919(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1120
							WorldMapEvent.method5640(var4); // L: 1121
							var2 = false; // L: 1122
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1124
							field2723[var7] = false; // L: 1125
							var29 = Rasterizer3D.method4330(); // L: 1126
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1127
								field2722[var7] = false; // L: 1128
							} else {
								field2722[var7] = true;
							}

							var15 = (field2727[var8] + field2727[var9] + field2727[var10]) / 3 + this.radius; // L: 1129
							field2688[var15][field2732[var15]++] = var7; // L: 1130
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1134
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1135
					var32 = field2732[var31]; // L: 1136
					if (var32 > 0) { // L: 1137
						var27 = field2688[var31]; // L: 1138

						for (var10 = 0; var10 < var32; ++var10) { // L: 1139
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1144
					field2734[var31] = 0; // L: 1145
					field2738[var31] = 0; // L: 1146
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1148
					var32 = field2732[var31]; // L: 1149
					if (var32 > 0) { // L: 1150
						var27 = field2688[var31]; // L: 1151

						for (var10 = 0; var10 < var32; ++var10) { // L: 1152
							char var33 = var27[var10]; // L: 1153
							byte var34 = this.faceRenderPriorities[var33]; // L: 1154
							var28 = field2734[var34]++; // L: 1155
							field2735[var34][var28] = var33; // L: 1156
							if (var34 < 10) { // L: 1157
								int[] var35 = field2738;
								var35[var34] += var31;
							} else if (var34 == 10) { // L: 1158
								field2736[var28] = var31;
							} else {
								field2737[var28] = var31; // L: 1159
							}
						}
					}
				}

				var31 = 0; // L: 1163
				if (field2734[1] > 0 || field2734[2] > 0) { // L: 1164
					var31 = (field2738[1] + field2738[2]) / (field2734[1] + field2734[2]);
				}

				var8 = 0; // L: 1165
				if (field2734[3] > 0 || field2734[4] > 0) { // L: 1166
					var8 = (field2738[3] + field2738[4]) / (field2734[3] + field2734[4]);
				}

				var9 = 0; // L: 1167
				if (field2734[6] > 0 || field2734[8] > 0) { // L: 1168
					var9 = (field2738[8] + field2738[6]) / (field2734[8] + field2734[6]);
				}

				var11 = 0; // L: 1170
				var12 = field2734[10]; // L: 1171
				int[] var13 = field2735[10]; // L: 1172
				int[] var14 = field2736; // L: 1173
				if (var11 == var12) { // L: 1174
					var11 = 0; // L: 1175
					var12 = field2734[11]; // L: 1176
					var13 = field2735[11]; // L: 1177
					var14 = field2737; // L: 1178
				}

				if (var11 < var12) { // L: 1180
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1181
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1182
					while (var15 == 0 && var10 > var31) { // L: 1183
						this.drawFace(var13[var11++]); // L: 1184
						if (var11 == var12 && var13 != field2735[11]) { // L: 1185
							var11 = 0; // L: 1186
							var12 = field2734[11]; // L: 1187
							var13 = field2735[11]; // L: 1188
							var14 = field2737; // L: 1189
						}

						if (var11 < var12) { // L: 1191
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1192
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1194
						this.drawFace(var13[var11++]); // L: 1195
						if (var11 == var12 && var13 != field2735[11]) { // L: 1196
							var11 = 0; // L: 1197
							var12 = field2734[11]; // L: 1198
							var13 = field2735[11]; // L: 1199
							var14 = field2737; // L: 1200
						}

						if (var11 < var12) { // L: 1202
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1203
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1205
						this.drawFace(var13[var11++]); // L: 1206
						if (var11 == var12 && var13 != field2735[11]) { // L: 1207
							var11 = 0; // L: 1208
							var12 = field2734[11]; // L: 1209
							var13 = field2735[11]; // L: 1210
							var14 = field2737; // L: 1211
						}

						if (var11 < var12) { // L: 1213
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1214
						}
					}

					var16 = field2734[var15]; // L: 1216
					int[] var17 = field2735[var15]; // L: 1217

					for (var18 = 0; var18 < var16; ++var18) { // L: 1218
						this.drawFace(var17[var18]); // L: 1219
					}
				}

				while (var10 != -1000) { // L: 1222
					this.drawFace(var13[var11++]); // L: 1223
					if (var11 == var12 && var13 != field2735[11]) { // L: 1224
						var11 = 0; // L: 1225
						var13 = field2735[11]; // L: 1226
						var12 = field2734[11]; // L: 1227
						var14 = field2737; // L: 1228
					}

					if (var11 < var12) { // L: 1230
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1231
					}
				}

			}
		}
	} // L: 1142 1233

	@ObfuscatedName("bc")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2723[var1]) { // L: 1236
			this.method4780(var1); // L: 1237
		} else {
			int var2 = this.indices1[var1]; // L: 1240
			int var3 = this.indices2[var1]; // L: 1241
			int var4 = this.indices3[var1]; // L: 1242
			Rasterizer3D.field2512.field2811 = field2722[var1]; // L: 1243
			if (this.faceAlphas == null) { // L: 1244
				Rasterizer3D.field2512.field2798 = 0; // L: 1245
			} else {
				Rasterizer3D.field2512.field2798 = this.faceAlphas[var1] & 255; // L: 1248
			}

			this.method4746(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2726[var2], field2726[var3], field2726[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1250
		}
	} // L: 1238 1251

	@ObfuscatedName("bo")
	boolean method4778(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2760; // L: 1254
	}

	@ObfuscatedName("be")
	final void method4746(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1258
			int var15;
			int var16;
			int var18;
			if (this.field2699 != null && this.field2699[var1] != -1) { // L: 1277
				int var17 = this.field2699[var1] & 255; // L: 1278
				var18 = this.field2744[var17]; // L: 1279
				var15 = this.field2742[var17]; // L: 1280
				var16 = this.field2710[var17]; // L: 1281
			} else {
				var18 = this.indices1[var1]; // L: 1284
				var15 = this.indices2[var1]; // L: 1285
				var16 = this.indices3[var1]; // L: 1286
			}

			if (this.faceColors3[var1] == -1) { // L: 1288
				Rasterizer3D.method4395(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2728[var18], field2728[var15], field2728[var16], field2729[var18], field2729[var15], field2729[var16], field2708[var18], field2708[var15], field2708[var16], this.faceTextures[var1]); // L: 1289
			} else {
				Rasterizer3D.method4395(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2728[var18], field2728[var15], field2728[var16], field2729[var18], field2729[var15], field2729[var16], field2708[var18], field2708[var15], field2708[var16], this.faceTextures[var1]); // L: 1292
			}
		} else {
			boolean var14 = this.method4778(var1); // L: 1259
			if (this.faceColors3[var1] == -1 && var14) { // L: 1260
				Rasterizer3D.method4318(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2751[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1261
			} else if (this.faceColors3[var1] == -1) { // L: 1263
				Rasterizer3D.method4338(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2751[this.faceColors1[var1]]); // L: 1264
			} else if (var14) { // L: 1266
				Rasterizer3D.method4341(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1267
			} else {
				Rasterizer3D.method4339(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1270
			}
		}

	} // L: 1295

	@ObfuscatedName("bv")
	final void method4780(int var1) {
		int var2 = Rasterizer3D.method4323(); // L: 1298
		int var3 = Rasterizer3D.method4324(); // L: 1299
		int var4 = 0; // L: 1300
		int var5 = this.indices1[var1]; // L: 1301
		int var6 = this.indices2[var1]; // L: 1302
		int var7 = this.indices3[var1]; // L: 1303
		int var8 = field2708[var5]; // L: 1304
		int var9 = field2708[var6]; // L: 1305
		int var10 = field2708[var7]; // L: 1306
		if (this.faceAlphas == null) { // L: 1307
			Rasterizer3D.field2512.field2798 = 0;
		} else {
			Rasterizer3D.field2512.field2798 = this.faceAlphas[var1] & 255; // L: 1308
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1309
			field2683[var4] = modelViewportXs[var5]; // L: 1310
			field2684[var4] = modelViewportYs[var5]; // L: 1311
			field2709[var4] = field2726[var7]; // L: 1312
			field2741[var4++] = this.faceColors1[var1]; // L: 1313
		} else {
			var11 = field2728[var5]; // L: 1316
			var12 = field2729[var5]; // L: 1317
			var13 = this.faceColors1[var1]; // L: 1318
			if (var10 >= 50) { // L: 1319
				var14 = field2697[var10 - var8] * (50 - var8); // L: 1320
				field2683[var4] = var2 + (var11 + ((field2728[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1321
				field2684[var4] = var3 + (var12 + ((field2729[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1322
				field2709[var4] = field2755; // L: 1323
				field2741[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1324
			}

			if (var9 >= 50) { // L: 1326
				var14 = field2697[var9 - var8] * (50 - var8); // L: 1327
				field2683[var4] = var2 + (var11 + ((field2728[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1328
				field2684[var4] = var3 + (var12 + ((field2729[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1329
				field2709[var4] = field2755; // L: 1330
				field2741[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1331
			}
		}

		if (var9 >= 50) { // L: 1334
			field2683[var4] = modelViewportXs[var6]; // L: 1335
			field2684[var4] = modelViewportYs[var6]; // L: 1336
			field2709[var4] = field2726[var7]; // L: 1337
			field2741[var4++] = this.faceColors2[var1]; // L: 1338
		} else {
			var11 = field2728[var6]; // L: 1341
			var12 = field2729[var6]; // L: 1342
			var13 = this.faceColors2[var1]; // L: 1343
			if (var8 >= 50) { // L: 1344
				var14 = field2697[var8 - var9] * (50 - var9); // L: 1345
				field2683[var4] = var2 + (var11 + ((field2728[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1346
				field2684[var4] = var3 + (var12 + ((field2729[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1347
				field2709[var4] = field2755; // L: 1348
				field2741[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1349
			}

			if (var10 >= 50) { // L: 1351
				var14 = field2697[var10 - var9] * (50 - var9); // L: 1352
				field2683[var4] = var2 + (var11 + ((field2728[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1353
				field2684[var4] = var3 + (var12 + ((field2729[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1354
				field2741[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1355
			}
		}

		if (var10 >= 50) { // L: 1358
			field2683[var4] = modelViewportXs[var7]; // L: 1359
			field2684[var4] = modelViewportYs[var7]; // L: 1360
			field2709[var4] = field2726[var7]; // L: 1361
			field2741[var4++] = this.faceColors3[var1]; // L: 1362
		} else {
			var11 = field2728[var7]; // L: 1365
			var12 = field2729[var7]; // L: 1366
			var13 = this.faceColors3[var1]; // L: 1367
			if (var9 >= 50) { // L: 1368
				var14 = field2697[var9 - var10] * (50 - var10); // L: 1369
				field2683[var4] = var2 + (var11 + ((field2728[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1370
				field2684[var4] = var3 + (var12 + ((field2729[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1371
				field2709[var4] = field2755; // L: 1372
				field2741[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1373
			}

			if (var8 >= 50) { // L: 1375
				var14 = field2697[var8 - var10] * (50 - var10); // L: 1376
				field2683[var4] = var2 + (var11 + ((field2728[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1377
				field2684[var4] = var3 + (var12 + ((field2729[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4329() / 50; // L: 1378
				field2709[var4] = field2755; // L: 1379
				field2741[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1380
			}
		}

		var11 = field2683[0]; // L: 1383
		var12 = field2683[1]; // L: 1384
		var13 = field2683[2]; // L: 1385
		var14 = field2684[0]; // L: 1386
		int var15 = field2684[1]; // L: 1387
		int var16 = field2684[2]; // L: 1388
		float var17 = field2709[0]; // L: 1389
		float var18 = field2709[1]; // L: 1390
		float var19 = field2709[2]; // L: 1391
		Rasterizer3D.field2512.field2811 = false; // L: 1392
		int var20 = Rasterizer3D.method4330(); // L: 1393
		if (var4 == 3) { // L: 1394
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1395
				Rasterizer3D.field2512.field2811 = true;
			}

			this.method4746(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2741[0], field2741[1], field2741[2]); // L: 1396
		}

		if (var4 == 4) { // L: 1398
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2683[3] < 0 || field2683[3] > var20) { // L: 1399
				Rasterizer3D.field2512.field2811 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1400
				int var23;
				int var25;
				if (this.field2699 != null && this.field2699[var1] != -1) { // L: 1425
					int var24 = this.field2699[var1] & 255; // L: 1426
					var25 = this.field2744[var24]; // L: 1427
					var22 = this.field2742[var24]; // L: 1428
					var23 = this.field2710[var24]; // L: 1429
				} else {
					var25 = var5; // L: 1432
					var22 = var6; // L: 1433
					var23 = var7; // L: 1434
				}

				short var26 = this.faceTextures[var1]; // L: 1436
				if (this.faceColors3[var1] == -1) { // L: 1437
					Rasterizer3D.method4395(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2728[var25], field2728[var22], field2728[var23], field2729[var25], field2729[var22], field2729[var23], field2708[var25], field2708[var22], field2708[var23], var26); // L: 1438
					Rasterizer3D.method4395(var14, var16, field2684[3], var11, var13, field2683[3], var17, var19, field2709[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2728[var25], field2728[var22], field2728[var23], field2729[var25], field2729[var22], field2729[var23], field2708[var25], field2708[var22], field2708[var23], var26); // L: 1439
				} else {
					Rasterizer3D.method4395(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2741[0], field2741[1], field2741[2], field2728[var25], field2728[var22], field2728[var23], field2729[var25], field2729[var22], field2729[var23], field2708[var25], field2708[var22], field2708[var23], var26); // L: 1442
					Rasterizer3D.method4395(var14, var16, field2684[3], var11, var13, field2683[3], var17, var19, field2709[3], field2741[0], field2741[2], field2741[3], field2728[var25], field2728[var22], field2728[var23], field2729[var25], field2729[var22], field2729[var23], field2708[var25], field2708[var22], field2708[var23], var26); // L: 1443
				}
			} else {
				boolean var21 = this.method4778(var1); // L: 1401
				if (this.faceColors3[var1] == -1 && var21) { // L: 1402
					var22 = field2751[this.faceColors1[var1]]; // L: 1403
					Rasterizer3D.method4318(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1404
					Rasterizer3D.method4318(var14, var16, field2684[3], var11, var13, field2683[3], var17, var19, field2709[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1405
				} else if (this.faceColors3[var1] == -1) { // L: 1407
					var22 = field2751[this.faceColors1[var1]]; // L: 1408
					Rasterizer3D.method4338(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1409
					Rasterizer3D.method4338(var14, var16, field2684[3], var11, var13, field2683[3], var17, var19, field2709[3], var22); // L: 1410
				} else if (var21) { // L: 1412
					Rasterizer3D.method4341(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2741[0], field2741[1], field2741[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1413
					Rasterizer3D.method4341(var14, var16, field2684[3], var11, var13, field2683[3], 0.0F, 0.0F, 0.0F, field2741[0], field2741[2], field2741[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1414
				} else {
					Rasterizer3D.method4339(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2741[0], field2741[1], field2741[2]); // L: 1417
					Rasterizer3D.method4339(var14, var16, field2684[3], var11, var13, field2683[3], var17, var19, field2709[3], field2741[0], field2741[2], field2741[3]); // L: 1418
				}
			}
		}

	} // L: 1447

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILqn;)V"
	)
	void method4744(int var1, class438 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1450
		float var4 = (float)(-this.verticesY[var1]); // L: 1451
		float var5 = (float)(-this.verticesZ[var1]); // L: 1452
		float var6 = 1.0F; // L: 1453
		this.verticesX[var1] = (int)(var2.field4695[0] * var3 + var2.field4695[4] * var4 + var2.field4695[8] * var5 + var2.field4695[12] * var6); // L: 1454
		this.verticesY[var1] = -((int)(var2.field4695[1] * var3 + var2.field4695[5] * var4 + var2.field4695[9] * var5 + var2.field4695[13] * var6)); // L: 1455
		this.verticesZ[var1] = -((int)(var2.field4695[2] * var3 + var2.field4695[6] * var4 + var2.field4695[10] * var5 + var2.field4695[14] * var6)); // L: 1456
	} // L: 1457

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lit;I)V"
	)
	void method4782(class226 var1, int var2) {
		if (this.field2712 != null) { // L: 1460
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1461
				int[] var4 = this.field2712[var3]; // L: 1462
				if (var4 != null && var4.length != 0) { // L: 1463
					int[] var5 = this.field2752[var3]; // L: 1464
					field2687.method8187(); // L: 1465

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1466
						int var7 = var4[var6]; // L: 1467
						class126 var8 = var1.method4407(var7); // L: 1468
						if (var8 != null) { // L: 1469
							field2703.method8155((float)var5[var6] / 255.0F); // L: 1470
							field2689.method8154(var8.method2929(var2)); // L: 1471
							field2689.method8157(field2703); // L: 1472
							field2687.method8153(field2689); // L: 1473
						}
					}

					this.method4744(var3, field2687); // L: 1475
				}
			}

		}
	} // L: 1477

	@ObfuscatedName("dx")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 847
			this.calculateBoundsCylinder();
		}

		this.method4754(var1); // L: 848
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 849
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 850
		int var13 = var3 * this.xzRadius >> 16; // L: 851
		int var14 = var12 + var13; // L: 852
		if (var14 > 50 && var12 < 3500) { // L: 853
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 854
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method4329(); // L: 855
			if (var16 / var14 < Rasterizer3D.method4326()) { // L: 856
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method4329(); // L: 857
				if (var17 / var14 > Rasterizer3D.method4325()) { // L: 858
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 859
					int var19 = var2 * this.xzRadius >> 16; // L: 860
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 861
					int var21 = (var18 + var20) * Rasterizer3D.method4329(); // L: 862
					if (var21 / var14 > Rasterizer3D.method4355()) { // L: 863
						int var22 = (var3 * super.height >> 16) + var19; // L: 864
						int var23 = (var18 - var22) * Rasterizer3D.method4329(); // L: 865
						if (var23 / var14 < Rasterizer3D.method4333()) { // L: 866
							int var24 = var13 + (var2 * super.height >> 16); // L: 867
							boolean var25 = false; // L: 868
							boolean var26 = false; // L: 869
							if (var12 - var24 <= 50) { // L: 870
								var26 = true;
							}

							boolean var27 = var26 || this.field2702 > 0; // L: 871
							int var28 = ViewportMouse.ViewportMouse_x; // L: 874
							int var30 = class136.method3034(); // L: 877
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport; // L: 880
							boolean var33 = class341.method6639(var9); // L: 883
							boolean var34 = false; // L: 884
							int var39;
							int var40;
							int var41;
							int var42;
							int var59;
							int var62;
							int var63;
							int var64;
							if (var33 && var31) { // L: 885
								boolean var35 = false; // L: 886
								if (field2759) { // L: 887
									boolean var38 = ViewportMouse.ViewportMouse_isInViewport; // L: 893
									boolean var36;
									if (!var38) { // L: 895
										var36 = false; // L: 896
									} else {
										int var45;
										int var46;
										int var47;
										int var48;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 900
											var39 = Scene.Scene_cameraPitchSine; // L: 901
											var40 = Scene.Scene_cameraPitchCosine; // L: 902
											var41 = Scene.Scene_cameraYawSine; // L: 903
											var42 = Scene.Scene_cameraYawCosine; // L: 904
											byte var43 = 50; // L: 905
											short var44 = 3500; // L: 906
											var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4323()) * var43 / Rasterizer3D.method4329(); // L: 907
											var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4324()) * var43 / Rasterizer3D.method4329(); // L: 908
											var47 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4323()) * var44 / Rasterizer3D.method4329(); // L: 909
											var48 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4324()) * var44 / Rasterizer3D.method4329(); // L: 910
											int var50 = var46 * var40 + var43 * var39 >> 16; // L: 914
											int var51 = var40 * var43 - var46 * var39 >> 16; // L: 919
											int var52 = var48 * var40 + var39 * var44 >> 16; // L: 925
											int var53 = var40 * var44 - var48 * var39 >> 16; // L: 930
											int var54 = var42 * var45 - var51 * var41 >> 16; // L: 936
											int var55 = var42 * var51 + var41 * var45 >> 16; // L: 941
											int var56 = var42 * var47 - var53 * var41 >> 16; // L: 947
											int var57 = var53 * var42 + var47 * var41 >> 16; // L: 952
											ViewportMouse.field2765 = (var56 + var54) / 2; // L: 956
											SoundSystem.field302 = (var50 + var52) / 2; // L: 957
											RouteStrategy.field2367 = (var55 + var57) / 2; // L: 958
											class193.field2001 = (var56 - var54) / 2; // L: 959
											ViewportMouse.field2764 = (var52 - var50) / 2; // L: 960
											ViewportMouse.field2768 = (var57 - var55) / 2; // L: 961
											WorldMapElement.field1933 = Math.abs(class193.field2001); // L: 962
											ViewportMouse.field2761 = Math.abs(ViewportMouse.field2764); // L: 963
											ViewportMouse.field2769 = Math.abs(ViewportMouse.field2768); // L: 964
										}

										class230 var58 = (class230)this.field2720.get(var1); // L: 966
										var40 = var58.field2622 + var6; // L: 967
										var41 = var7 + var58.field2620; // L: 968
										var42 = var8 + var58.field2613; // L: 969
										var64 = var58.field2616; // L: 970
										int var65 = var58.field2615; // L: 971
										var45 = var58.field2611; // L: 972
										var46 = ViewportMouse.field2765 - var40; // L: 973
										var47 = SoundSystem.field302 - var41; // L: 974
										var48 = RouteStrategy.field2367 - var42; // L: 975
										if (Math.abs(var46) > var64 + WorldMapElement.field1933) { // L: 976
											var36 = false; // L: 977
										} else if (Math.abs(var47) > var65 + ViewportMouse.field2761) { // L: 980
											var36 = false; // L: 981
										} else if (Math.abs(var48) > var45 + ViewportMouse.field2769) { // L: 984
											var36 = false; // L: 985
										} else if (Math.abs(var48 * ViewportMouse.field2764 - var47 * ViewportMouse.field2768) > var65 * ViewportMouse.field2769 + var45 * ViewportMouse.field2761) { // L: 988
											var36 = false; // L: 989
										} else if (Math.abs(var46 * ViewportMouse.field2768 - var48 * class193.field2001) > var64 * ViewportMouse.field2769 + var45 * WorldMapElement.field1933) { // L: 992
											var36 = false; // L: 993
										} else if (Math.abs(var47 * class193.field2001 - var46 * ViewportMouse.field2764) > var65 * WorldMapElement.field1933 + var64 * ViewportMouse.field2761) { // L: 996
											var36 = false; // L: 997
										} else {
											var36 = true; // L: 1000
										}
									}

									var35 = var36; // L: 1002
								} else {
									var63 = var12 - var13; // L: 1005
									if (var63 <= 50) {
										var63 = 50; // L: 1006
									}

									if (var15 > 0) { // L: 1007
										var16 /= var14; // L: 1008
										var17 /= var63; // L: 1009
									} else {
										var17 /= var14; // L: 1012
										var16 /= var63; // L: 1013
									}

									if (var18 > 0) { // L: 1015
										var23 /= var14; // L: 1016
										var21 /= var63; // L: 1017
									} else {
										var21 /= var14; // L: 1020
										var23 /= var63; // L: 1021
									}

									var59 = var28 - Rasterizer3D.method4323(); // L: 1023
									var62 = var30 - Rasterizer3D.method4324(); // L: 1024
									if (var59 > var16 && var59 < var17 && var62 > var23 && var62 < var21) { // L: 1025
										var35 = true; // L: 1026
									}
								}

								if (var35) { // L: 1029
									if (this.isSingleTile) { // L: 1030
										WorldMapEvent.method5640(var9);
									} else {
										var34 = true; // L: 1031
									}
								}
							}

							int var61 = Rasterizer3D.method4323(); // L: 1034
							var63 = Rasterizer3D.method4324(); // L: 1035
							var59 = 0; // L: 1036
							var62 = 0; // L: 1037
							if (var1 != 0) { // L: 1038
								var59 = field2749[var1]; // L: 1039
								var62 = field2750[var1]; // L: 1040
							}

							for (var39 = 0; var39 < this.verticesCount; ++var39) { // L: 1042
								var40 = this.verticesX[var39]; // L: 1043
								var41 = this.verticesY[var39]; // L: 1044
								var42 = this.verticesZ[var39]; // L: 1045
								if (var1 != 0) { // L: 1046
									var64 = var42 * var59 + var40 * var62 >> 16; // L: 1047
									var42 = var42 * var62 - var40 * var59 >> 16; // L: 1048
									var40 = var64; // L: 1049
								}

								var40 += var6; // L: 1051
								var41 += var7; // L: 1052
								var42 += var8; // L: 1053
								var64 = var42 * var4 + var5 * var40 >> 16; // L: 1054
								var42 = var5 * var42 - var40 * var4 >> 16; // L: 1055
								var40 = var64; // L: 1056
								var64 = var3 * var41 - var42 * var2 >> 16; // L: 1057
								var42 = var41 * var2 + var3 * var42 >> 16; // L: 1058
								field2727[var39] = var42 - var12; // L: 1060
								if (var42 >= 50) { // L: 1061
									modelViewportXs[var39] = var61 + var40 * Rasterizer3D.method4329() / var42; // L: 1062
									modelViewportYs[var39] = var63 + var64 * Rasterizer3D.method4329() / var42; // L: 1063
									field2726[var39] = class89.method2260(var42); // L: 1064
								} else {
									modelViewportXs[var39] = -5000; // L: 1067
									var25 = true; // L: 1068
								}

								if (var27) { // L: 1070
									field2728[var39] = var40; // L: 1071
									field2729[var39] = var64; // L: 1072
									field2708[var39] = var42; // L: 1073
								}
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9); // L: 1077
							} catch (Exception var60) { // L: 1079
							}

						}
					}
				}
			}
		}
	} // L: 1080
}
