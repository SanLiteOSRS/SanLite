import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("an")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("as")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static class438 field2750;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static class438 field2689;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static class438 field2690;
	@ObfuscatedName("bh")
	static boolean[] field2733;
	@ObfuscatedName("bp")
	static boolean[] field2724;
	@ObfuscatedName("bw")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bi")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bk")
	static float[] field2692;
	@ObfuscatedName("bv")
	static int[] field2726;
	@ObfuscatedName("bz")
	static int[] field2717;
	@ObfuscatedName("bm")
	static int[] field2730;
	@ObfuscatedName("br")
	static int[] field2731;
	@ObfuscatedName("by")
	static char[] field2725;
	@ObfuscatedName("bt")
	static char[][] field2734;
	@ObfuscatedName("bl")
	static int[] field2735;
	@ObfuscatedName("cs")
	static int[][] field2714;
	@ObfuscatedName("cu")
	static int[] field2737;
	@ObfuscatedName("ca")
	static int[] field2738;
	@ObfuscatedName("cf")
	static int[] field2727;
	@ObfuscatedName("cw")
	static int[] field2740;
	@ObfuscatedName("ch")
	static int[] field2741;
	@ObfuscatedName("cp")
	static int[] field2744;
	@ObfuscatedName("cy")
	static float[] field2743;
	@ObfuscatedName("cd")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cv")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cr")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cm")
	static boolean field2747;
	@ObfuscatedName("cb")
	static int[] field2700;
	@ObfuscatedName("cc")
	static int[] field2756;
	@ObfuscatedName("ck")
	static int[] field2752;
	@ObfuscatedName("cq")
	static int[] field2753;
	@ObfuscatedName("cl")
	static final float field2718;
	@ObfuscatedName("ak")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ae")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("af")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ao")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("aa")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("aj")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ad")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ac")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ag")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ar")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ah")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("az")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("au")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ai")
	byte[] field2704;
	@ObfuscatedName("aq")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("aw")
	public byte field2706;
	@ObfuscatedName("ay")
	public int field2707;
	@ObfuscatedName("al")
	int[] field2708;
	@ObfuscatedName("am")
	int[] field2709;
	@ObfuscatedName("bs")
	int[] field2710;
	@ObfuscatedName("bc")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bj")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bo")
	int[][] field2713;
	@ObfuscatedName("bq")
	int[][] field2684;
	@ObfuscatedName("bg")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bf")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bd")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ba")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bn")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bb")
	@Export("radius")
	int radius;
	@ObfuscatedName("bx")
	HashMap field2732;
	@ObfuscatedName("cn")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("ct")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cx")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("co")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cz")
	public short field2761;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2750 = new class438(); // L: 17
		field2689 = new class438(); // L: 18
		field2690 = new class438(); // L: 19
		field2733 = new boolean[6500]; // L: 55
		field2724 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2692 = new float[6500]; // L: 59
		field2726 = new int[6500]; // L: 60
		field2717 = new int[6500]; // L: 61
		field2730 = new int[6500]; // L: 62
		field2731 = new int[6500]; // L: 63
		field2725 = new char[6000]; // L: 65
		field2734 = new char[6000][512]; // L: 66
		field2735 = new int[12]; // L: 67
		field2714 = new int[12][2000]; // L: 68
		field2737 = new int[2000]; // L: 69
		field2738 = new int[2000]; // L: 70
		field2727 = new int[12]; // L: 71
		field2740 = new int[10]; // L: 72
		field2741 = new int[10]; // L: 73
		field2744 = new int[10]; // L: 74
		field2743 = new float[10]; // L: 75
		field2747 = true; // L: 79
		field2700 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field2756 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2752 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2753 = Rasterizer3D.field2517; // L: 85
		field2718 = class137.method3092(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2706 = 0;
		this.field2707 = 0;
		this.isSingleTile = false;
		this.field2732 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2706 = 0;
		this.field2707 = 0;
		this.isSingleTile = false;
		this.field2732 = new HashMap();
		this.method4773(var1, var2, var3); // L: 121
		this.field2706 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2707 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Ljd;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2706 = 0; // L: 35
		this.field2707 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2732 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2707 = 0; // L: 100
		this.field2706 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2707 += var4.field2707; // L: 107
				if (this.field2706 == -1) { // L: 108
					this.field2706 = var4.field2706;
				}
			}
		}

		this.method4773(this.verticesCount, this.indicesCount, this.field2707); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2707 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method4782(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("at")
	void method4773(int var1, int var2, int var3) {
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
			this.field2708 = new int[var3]; // L: 139
			this.field2709 = new int[var3]; // L: 140
			this.field2710 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	void method4774(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2706 != var1.field2706)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2706); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2704 == null && var1.field2704 != null) { // L: 159
			this.field2704 = new byte[var2]; // L: 160
			Arrays.fill(this.field2704, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	public void method4782(Model var1) {
		if (var1 != null) { // L: 166
			this.method4774(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2706; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2704 != null) { // L: 186
					if (var1.field2704 != null && var1.field2704[var2] != -1) { // L: 187
						this.field2704[this.indicesCount] = (byte)(var1.field2704[var2] + this.field2707); // L: 188
					} else {
						this.field2704[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2707; ++var2) { // L: 196
				this.field2708[this.field2707] = this.verticesCount + var1.field2708[var2]; // L: 197
				this.field2709[this.field2707] = this.verticesCount + var1.field2709[var2]; // L: 198
				this.field2710[this.field2707] = this.verticesCount + var1.field2710[var2]; // L: 199
				++this.field2707; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljd;"
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
					var11.field2707 = this.field2707; // L: 227
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
					var11.field2704 = this.field2704; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2706 = this.field2706; // L: 240
					var11.field2708 = this.field2708; // L: 241
					var11.field2709 = this.field2709; // L: 242
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljd;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljd;"
	)
	public Model method4777(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZLjd;[B)Ljd;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2707 = this.field2707; // L: 300
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
		var2.field2704 = this.field2704; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2706 = this.field2706; // L: 330
		var2.field2708 = this.field2708; // L: 331
		var2.field2709 = this.field2709; // L: 332
		var2.field2710 = this.field2710; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2713 = this.field2713; // L: 336
		var2.field2684 = this.field2684; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("aa")
	void method4870(int var1) {
		if (!this.field2732.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field2756[var1]; // L: 352
			int var9 = field2700[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var11 = Tiles.method2209(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 355
				int var12 = this.verticesY[var10]; // L: 356
				int var13 = class230.method4705(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 357
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
			if (var14.field2612 < 32) { // L: 367
				var14.field2612 = 32;
			}

			if (var14.field2617 < 32) { // L: 368
				var14.field2617 = 32;
			}

			if (this.isSingleTile) { // L: 369
				boolean var16 = true; // L: 370
				var14.field2612 += 8; // L: 371
				var14.field2617 += 8; // L: 372
			}

			this.field2732.put(var1, var14); // L: 374
		}
	} // L: 375

	@ObfuscatedName("aj")
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

	@ObfuscatedName("ad")
	void method4781() {
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

	@ObfuscatedName("ac")
	public int method4846() {
		this.calculateBoundsCylinder(); // L: 414
		return this.xzRadius; // L: 415
	}

	@ObfuscatedName("ag")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 419
		this.field2732.clear(); // L: 420
	} // L: 421

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)V"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	public void method4785(class136 var1, int var2) {
		Skeleton var3 = var1.field1587; // L: 439
		class226 var4 = var3.method4507(); // L: 440
		if (var4 != null) { // L: 441
			var3.method4507().method4456(var1, var2); // L: 442
			this.method4883(var3.method4507(), var1.method3052()); // L: 443
		}

		if (var1.method3053()) { // L: 445
			this.method4786(var1, var2); // L: 446
		}

		this.resetBounds(); // L: 448
	} // L: 449

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	void method4786(class136 var1, int var2) {
		Skeleton var3 = var1.field1587; // L: 452

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 453
			int var5 = var3.transformTypes[var4]; // L: 454
			if (var5 == 5 && var1.field1583 != null && var1.field1583[var4] != null && var1.field1583[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 455 456
				class129 var6 = var1.field1583[var4][0]; // L: 457
				int[] var7 = var3.labels[var4]; // L: 458
				int var8 = var7.length; // L: 459

				for (int var9 = 0; var9 < var8; ++var9) { // L: 460
					int var10 = var7[var9]; // L: 461
					if (var10 < this.faceLabelsAlpha.length) { // L: 462
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 463

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 464
							int var13 = var11[var12]; // L: 465
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2975(var2) * 255.0F); // L: 466
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
		descriptor = "(Lid;I)V"
	)
	void method4883(class226 var1, int var2) {
		this.method4807(var1, var2); // L: 480
	} // L: 482

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Liu;ILiu;I[I)V"
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
		descriptor = "(Lir;Lfz;I[ZZZ)V"
	)
	public void method4789(Skeleton var1, class136 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class226 var7 = var1.method4507(); // L: 517
		if (var7 != null) { // L: 518
			var7.method4457(var2, var3, var4, var5); // L: 519
			if (var6) { // L: 520
				this.method4883(var7, var2.method3052()); // L: 521
			}
		}

		if (!var5 && var2.method3053()) { // L: 524
			this.method4786(var2, var3); // L: 525
		}

	} // L: 527

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Liu;I[IZ)V"
	)
	public void method4790(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ay")
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
								var15 = field2700[var14]; // L: 614
								var16 = field2756[var14]; // L: 615
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 616
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 617
								this.verticesX[var11] = var17; // L: 618
							}

							if (var12 != 0) { // L: 620
								var15 = field2700[var12]; // L: 621
								var16 = field2756[var12]; // L: 622
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 623
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 624
								this.verticesY[var11] = var17; // L: 625
							}

							if (var13 != 0) { // L: 627
								var15 = field2700[var13]; // L: 628
								var16 = field2756[var13]; // L: 629
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

	@ObfuscatedName("al")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 684
			int var2 = this.verticesX[var1]; // L: 685
			this.verticesX[var1] = this.verticesZ[var1]; // L: 686
			this.verticesZ[var1] = -var2; // L: 687
		}

		this.resetBounds(); // L: 689
	} // L: 690

	@ObfuscatedName("am")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 693
			this.verticesX[var1] = -this.verticesX[var1]; // L: 694
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("bs")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 701
			int var2 = this.verticesZ[var1]; // L: 702
			this.verticesZ[var1] = this.verticesX[var1]; // L: 703
			this.verticesX[var1] = -var2; // L: 704
		}

		this.resetBounds(); // L: 706
	} // L: 707

	@ObfuscatedName("bc")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2700[var1]; // L: 710
		int var3 = field2756[var1]; // L: 711

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 712
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 713
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 714
			this.verticesY[var4] = var5; // L: 715
		}

		this.resetBounds(); // L: 717
	} // L: 718

	@ObfuscatedName("bj")
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

	@ObfuscatedName("bo")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 730
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 731
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 732
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 733
		}

		this.resetBounds(); // L: 735
	} // L: 736

	@ObfuscatedName("bq")
	public final void method4798(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 739
			this.method4781();
		}

		int var8 = Rasterizer3D.method4375(); // L: 740
		int var9 = Rasterizer3D.method4376(); // L: 741
		int var10 = field2700[var1]; // L: 742
		int var11 = field2756[var1]; // L: 743
		int var12 = field2700[var2]; // L: 744
		int var13 = field2756[var2]; // L: 745
		int var14 = field2700[var3]; // L: 746
		int var15 = field2756[var3]; // L: 747
		int var16 = field2700[var4]; // L: 748
		int var17 = field2756[var4]; // L: 749
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
			field2726[var19] = var22 - var18; // L: 776
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method4374() / var22; // L: 777
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method4374() / var22; // L: 778
			field2692[var19] = class137.method3092(var22); // L: 779
			if (this.field2707 > 0) { // L: 780
				field2717[var19] = var20; // L: 781
				field2730[var19] = var23; // L: 782
				field2731[var19] = var22; // L: 783
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 787
		} catch (Exception var25) { // L: 789
		}

	} // L: 790

	@ObfuscatedName("bg")
	public final void method4799(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 793
			this.method4781();
		}

		int var9 = Rasterizer3D.method4375(); // L: 794
		int var10 = Rasterizer3D.method4376(); // L: 795
		int var11 = field2700[var1]; // L: 796
		int var12 = field2756[var1]; // L: 797
		int var13 = field2700[var2]; // L: 798
		int var14 = field2756[var2]; // L: 799
		int var15 = field2700[var3]; // L: 800
		int var16 = field2756[var3]; // L: 801
		int var17 = field2700[var4]; // L: 802
		int var18 = field2756[var4]; // L: 803
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
			field2726[var20] = var23 - var19; // L: 830
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method4374() / var8; // L: 831
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method4374() / var8; // L: 832
			field2692[var20] = class137.method3092(var8); // L: 833
			if (this.field2707 > 0) { // L: 834
				field2717[var20] = var21; // L: 835
				field2730[var20] = var24; // L: 836
				field2731[var20] = var23; // L: 837
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 841
		} catch (Exception var26) { // L: 843
		}

	} // L: 844

	@ObfuscatedName("bf")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1017
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1018
				field2725[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1019

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1020
				if (this.faceColors3[var7] != -2) { // L: 1021
					var8 = this.indices1[var7]; // L: 1022
					var9 = this.indices2[var7]; // L: 1023
					var10 = this.indices3[var7]; // L: 1024
					var11 = modelViewportXs[var8]; // L: 1025
					var12 = modelViewportXs[var9]; // L: 1026
					var28 = modelViewportXs[var10]; // L: 1027
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1028
						if (var2 && ClientPacket.method5662(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1054
							class12.method163(var4); // L: 1055
							var2 = false; // L: 1056
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1058
							field2724[var7] = false; // L: 1059
							var29 = Rasterizer3D.method4388(); // L: 1060
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1061
								field2733[var7] = false; // L: 1062
							} else {
								field2733[var7] = true;
							}

							var15 = (field2726[var8] + field2726[var9] + field2726[var10]) / 3 + this.radius; // L: 1063
							field2734[var15][field2725[var15]++] = var7; // L: 1064
						}
					} else {
						var29 = field2717[var8]; // L: 1029
						var15 = field2717[var9]; // L: 1030
						var16 = field2717[var10]; // L: 1031
						int var30 = field2730[var8]; // L: 1032
						var18 = field2730[var9]; // L: 1033
						int var19 = field2730[var10]; // L: 1034
						int var20 = field2731[var8]; // L: 1035
						int var21 = field2731[var9]; // L: 1036
						int var22 = field2731[var10]; // L: 1037
						var29 -= var15; // L: 1038
						var16 -= var15; // L: 1039
						var30 -= var18; // L: 1040
						var19 -= var18; // L: 1041
						var20 -= var21; // L: 1042
						var22 -= var21; // L: 1043
						int var23 = var30 * var22 - var20 * var19; // L: 1044
						int var24 = var20 * var16 - var29 * var22; // L: 1045
						int var25 = var29 * var19 - var30 * var16; // L: 1046
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1047
							field2724[var7] = true; // L: 1048
							int var26 = (field2726[var8] + field2726[var9] + field2726[var10]) / 3 + this.radius; // L: 1049
							field2734[var26][field2725[var26]++] = var7; // L: 1050
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1068
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1069
					var32 = field2725[var31]; // L: 1070
					if (var32 > 0) { // L: 1071
						var27 = field2734[var31]; // L: 1072

						for (var10 = 0; var10 < var32; ++var10) { // L: 1073
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1078
					field2735[var31] = 0; // L: 1079
					field2727[var31] = 0; // L: 1080
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1082
					var32 = field2725[var31]; // L: 1083
					if (var32 > 0) { // L: 1084
						var27 = field2734[var31]; // L: 1085

						for (var10 = 0; var10 < var32; ++var10) { // L: 1086
							char var33 = var27[var10]; // L: 1087
							byte var34 = this.faceRenderPriorities[var33]; // L: 1088
							var28 = field2735[var34]++; // L: 1089
							field2714[var34][var28] = var33; // L: 1090
							if (var34 < 10) { // L: 1091
								int[] var35 = field2727;
								var35[var34] += var31;
							} else if (var34 == 10) { // L: 1092
								field2737[var28] = var31;
							} else {
								field2738[var28] = var31; // L: 1093
							}
						}
					}
				}

				var31 = 0; // L: 1097
				if (field2735[1] > 0 || field2735[2] > 0) { // L: 1098
					var31 = (field2727[1] + field2727[2]) / (field2735[1] + field2735[2]);
				}

				var8 = 0; // L: 1099
				if (field2735[3] > 0 || field2735[4] > 0) { // L: 1100
					var8 = (field2727[3] + field2727[4]) / (field2735[3] + field2735[4]);
				}

				var9 = 0; // L: 1101
				if (field2735[6] > 0 || field2735[8] > 0) { // L: 1102
					var9 = (field2727[8] + field2727[6]) / (field2735[8] + field2735[6]);
				}

				var11 = 0; // L: 1104
				var12 = field2735[10]; // L: 1105
				int[] var13 = field2714[10]; // L: 1106
				int[] var14 = field2737; // L: 1107
				if (var11 == var12) { // L: 1108
					var11 = 0; // L: 1109
					var12 = field2735[11]; // L: 1110
					var13 = field2714[11]; // L: 1111
					var14 = field2738; // L: 1112
				}

				if (var11 < var12) { // L: 1114
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1115
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1116
					while (var15 == 0 && var10 > var31) { // L: 1117
						this.drawFace(var13[var11++]); // L: 1118
						if (var11 == var12 && var13 != field2714[11]) { // L: 1119
							var11 = 0; // L: 1120
							var12 = field2735[11]; // L: 1121
							var13 = field2714[11]; // L: 1122
							var14 = field2738; // L: 1123
						}

						if (var11 < var12) { // L: 1125
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1126
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1128
						this.drawFace(var13[var11++]); // L: 1129
						if (var11 == var12 && var13 != field2714[11]) { // L: 1130
							var11 = 0; // L: 1131
							var12 = field2735[11]; // L: 1132
							var13 = field2714[11]; // L: 1133
							var14 = field2738; // L: 1134
						}

						if (var11 < var12) { // L: 1136
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1137
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1139
						this.drawFace(var13[var11++]); // L: 1140
						if (var11 == var12 && var13 != field2714[11]) { // L: 1141
							var11 = 0; // L: 1142
							var12 = field2735[11]; // L: 1143
							var13 = field2714[11]; // L: 1144
							var14 = field2738; // L: 1145
						}

						if (var11 < var12) { // L: 1147
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1148
						}
					}

					var16 = field2735[var15]; // L: 1150
					int[] var17 = field2714[var15]; // L: 1151

					for (var18 = 0; var18 < var16; ++var18) { // L: 1152
						this.drawFace(var17[var18]); // L: 1153
					}
				}

				while (var10 != -1000) { // L: 1156
					this.drawFace(var13[var11++]); // L: 1157
					if (var11 == var12 && var13 != field2714[11]) { // L: 1158
						var11 = 0; // L: 1159
						var13 = field2714[11]; // L: 1160
						var12 = field2735[11]; // L: 1161
						var14 = field2738; // L: 1162
					}

					if (var11 < var12) { // L: 1164
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1165
					}
				}

			}
		}
	} // L: 1076 1167

	@ObfuscatedName("bd")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2724[var1]) { // L: 1170
			this.method4862(var1); // L: 1171
		} else {
			int var2 = this.indices1[var1]; // L: 1174
			int var3 = this.indices2[var1]; // L: 1175
			int var4 = this.indices3[var1]; // L: 1176
			Rasterizer3D.field2520.field2798 = field2733[var1]; // L: 1177
			if (this.faceAlphas == null) { // L: 1178
				Rasterizer3D.field2520.field2793 = 0; // L: 1179
			} else {
				Rasterizer3D.field2520.field2793 = this.faceAlphas[var1] & 255; // L: 1182
			}

			this.method4779(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2692[var2], field2692[var3], field2692[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1184
		}
	} // L: 1172 1185

	@ObfuscatedName("ba")
	boolean method4803(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2761; // L: 1188
	}

	@ObfuscatedName("bn")
	final void method4779(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1192
			int var15;
			int var16;
			int var18;
			if (this.field2704 != null && this.field2704[var1] != -1) { // L: 1211
				int var17 = this.field2704[var1] & 255; // L: 1212
				var18 = this.field2708[var17]; // L: 1213
				var15 = this.field2709[var17]; // L: 1214
				var16 = this.field2710[var17]; // L: 1215
			} else {
				var18 = this.indices1[var1]; // L: 1218
				var15 = this.indices2[var1]; // L: 1219
				var16 = this.indices3[var1]; // L: 1220
			}

			if (this.faceColors3[var1] == -1) { // L: 1222
				Rasterizer3D.method4391(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2717[var18], field2717[var15], field2717[var16], field2730[var18], field2730[var15], field2730[var16], field2731[var18], field2731[var15], field2731[var16], this.faceTextures[var1]); // L: 1223
			} else {
				Rasterizer3D.method4391(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2717[var18], field2717[var15], field2717[var16], field2730[var18], field2730[var15], field2730[var16], field2731[var18], field2731[var15], field2731[var16], this.faceTextures[var1]); // L: 1226
			}
		} else {
			boolean var14 = this.method4803(var1); // L: 1193
			if (this.faceColors3[var1] == -1 && var14) { // L: 1194
				Rasterizer3D.method4394(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2752[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1195
			} else if (this.faceColors3[var1] == -1) { // L: 1197
				Rasterizer3D.method4390(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2752[this.faceColors1[var1]]); // L: 1198
			} else if (var14) { // L: 1200
				Rasterizer3D.method4393(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1201
			} else {
				Rasterizer3D.method4389(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1204
			}
		}

	} // L: 1229

	@ObfuscatedName("bb")
	final void method4862(int var1) {
		int var2 = Rasterizer3D.method4375(); // L: 1232
		int var3 = Rasterizer3D.method4376(); // L: 1233
		int var4 = 0; // L: 1234
		int var5 = this.indices1[var1]; // L: 1235
		int var6 = this.indices2[var1]; // L: 1236
		int var7 = this.indices3[var1]; // L: 1237
		int var8 = field2731[var5]; // L: 1238
		int var9 = field2731[var6]; // L: 1239
		int var10 = field2731[var7]; // L: 1240
		if (this.faceAlphas == null) { // L: 1241
			Rasterizer3D.field2520.field2793 = 0;
		} else {
			Rasterizer3D.field2520.field2793 = this.faceAlphas[var1] & 255; // L: 1242
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1243
			field2740[var4] = modelViewportXs[var5]; // L: 1244
			field2741[var4] = modelViewportYs[var5]; // L: 1245
			field2743[var4] = field2692[var7]; // L: 1246
			field2744[var4++] = this.faceColors1[var1]; // L: 1247
		} else {
			var11 = field2717[var5]; // L: 1250
			var12 = field2730[var5]; // L: 1251
			var13 = this.faceColors1[var1]; // L: 1252
			if (var10 >= 50) { // L: 1253
				var14 = field2753[var10 - var8] * (50 - var8); // L: 1254
				field2740[var4] = var2 + (var11 + ((field2717[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1255
				field2741[var4] = var3 + (var12 + ((field2730[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1256
				field2743[var4] = field2718; // L: 1257
				field2744[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1258
			}

			if (var9 >= 50) { // L: 1260
				var14 = field2753[var9 - var8] * (50 - var8); // L: 1261
				field2740[var4] = var2 + (var11 + ((field2717[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1262
				field2741[var4] = var3 + (var12 + ((field2730[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1263
				field2743[var4] = field2718; // L: 1264
				field2744[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1265
			}
		}

		if (var9 >= 50) { // L: 1268
			field2740[var4] = modelViewportXs[var6]; // L: 1269
			field2741[var4] = modelViewportYs[var6]; // L: 1270
			field2743[var4] = field2692[var7]; // L: 1271
			field2744[var4++] = this.faceColors2[var1]; // L: 1272
		} else {
			var11 = field2717[var6]; // L: 1275
			var12 = field2730[var6]; // L: 1276
			var13 = this.faceColors2[var1]; // L: 1277
			if (var8 >= 50) { // L: 1278
				var14 = field2753[var8 - var9] * (50 - var9); // L: 1279
				field2740[var4] = var2 + (var11 + ((field2717[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1280
				field2741[var4] = var3 + (var12 + ((field2730[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1281
				field2743[var4] = field2718; // L: 1282
				field2744[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1283
			}

			if (var10 >= 50) { // L: 1285
				var14 = field2753[var10 - var9] * (50 - var9); // L: 1286
				field2740[var4] = var2 + (var11 + ((field2717[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1287
				field2741[var4] = var3 + (var12 + ((field2730[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1288
				field2744[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1289
			}
		}

		if (var10 >= 50) { // L: 1292
			field2740[var4] = modelViewportXs[var7]; // L: 1293
			field2741[var4] = modelViewportYs[var7]; // L: 1294
			field2743[var4] = field2692[var7]; // L: 1295
			field2744[var4++] = this.faceColors3[var1]; // L: 1296
		} else {
			var11 = field2717[var7]; // L: 1299
			var12 = field2730[var7]; // L: 1300
			var13 = this.faceColors3[var1]; // L: 1301
			if (var9 >= 50) { // L: 1302
				var14 = field2753[var9 - var10] * (50 - var10); // L: 1303
				field2740[var4] = var2 + (var11 + ((field2717[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1304
				field2741[var4] = var3 + (var12 + ((field2730[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1305
				field2743[var4] = field2718; // L: 1306
				field2744[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1307
			}

			if (var8 >= 50) { // L: 1309
				var14 = field2753[var8 - var10] * (50 - var10); // L: 1310
				field2740[var4] = var2 + (var11 + ((field2717[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1311
				field2741[var4] = var3 + (var12 + ((field2730[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4374() / 50; // L: 1312
				field2743[var4] = field2718; // L: 1313
				field2744[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1314
			}
		}

		var11 = field2740[0]; // L: 1317
		var12 = field2740[1]; // L: 1318
		var13 = field2740[2]; // L: 1319
		var14 = field2741[0]; // L: 1320
		int var15 = field2741[1]; // L: 1321
		int var16 = field2741[2]; // L: 1322
		float var17 = field2743[0]; // L: 1323
		float var18 = field2743[1]; // L: 1324
		float var19 = field2743[2]; // L: 1325
		Rasterizer3D.field2520.field2798 = false; // L: 1326
		int var20 = Rasterizer3D.method4388(); // L: 1327
		if (var4 == 3) { // L: 1328
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1329
				Rasterizer3D.field2520.field2798 = true;
			}

			this.method4779(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2]); // L: 1330
		}

		if (var4 == 4) { // L: 1332
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2740[3] < 0 || field2740[3] > var20) { // L: 1333
				Rasterizer3D.field2520.field2798 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1334
				int var23;
				int var25;
				if (this.field2704 != null && this.field2704[var1] != -1) { // L: 1359
					int var24 = this.field2704[var1] & 255; // L: 1360
					var25 = this.field2708[var24]; // L: 1361
					var22 = this.field2709[var24]; // L: 1362
					var23 = this.field2710[var24]; // L: 1363
				} else {
					var25 = var5; // L: 1366
					var22 = var6; // L: 1367
					var23 = var7; // L: 1368
				}

				short var26 = this.faceTextures[var1]; // L: 1370
				if (this.faceColors3[var1] == -1) { // L: 1371
					Rasterizer3D.method4391(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26); // L: 1372
					Rasterizer3D.method4391(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26); // L: 1373
				} else {
					Rasterizer3D.method4391(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26); // L: 1376
					Rasterizer3D.method4391(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], field2744[0], field2744[2], field2744[3], field2717[var25], field2717[var22], field2717[var23], field2730[var25], field2730[var22], field2730[var23], field2731[var25], field2731[var22], field2731[var23], var26); // L: 1377
				}
			} else {
				boolean var21 = this.method4803(var1); // L: 1335
				if (this.faceColors3[var1] == -1 && var21) { // L: 1336
					var22 = field2752[this.faceColors1[var1]]; // L: 1337
					Rasterizer3D.method4394(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1338
					Rasterizer3D.method4394(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1339
				} else if (this.faceColors3[var1] == -1) { // L: 1341
					var22 = field2752[this.faceColors1[var1]]; // L: 1342
					Rasterizer3D.method4390(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1343
					Rasterizer3D.method4390(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], var22); // L: 1344
				} else if (var21) { // L: 1346
					Rasterizer3D.method4393(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1347
					Rasterizer3D.method4393(var14, var16, field2741[3], var11, var13, field2740[3], 0.0F, 0.0F, 0.0F, field2744[0], field2744[2], field2744[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1348
				} else {
					Rasterizer3D.method4389(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2744[0], field2744[1], field2744[2]); // L: 1351
					Rasterizer3D.method4389(var14, var16, field2741[3], var11, var13, field2740[3], var17, var19, field2743[3], field2744[0], field2744[2], field2744[3]); // L: 1352
				}
			}
		}

	} // L: 1381

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILqp;)V"
	)
	void method4806(int var1, class438 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1384
		float var4 = (float)(-this.verticesY[var1]); // L: 1385
		float var5 = (float)(-this.verticesZ[var1]); // L: 1386
		float var6 = 1.0F; // L: 1387
		this.verticesX[var1] = (int)(var2.field4685[0] * var3 + var2.field4685[4] * var4 + var2.field4685[8] * var5 + var2.field4685[12] * var6); // L: 1388
		this.verticesY[var1] = -((int)(var2.field4685[1] * var3 + var2.field4685[5] * var4 + var2.field4685[9] * var5 + var2.field4685[13] * var6)); // L: 1389
		this.verticesZ[var1] = -((int)(var2.field4685[2] * var3 + var2.field4685[6] * var4 + var2.field4685[10] * var5 + var2.field4685[14] * var6)); // L: 1390
	} // L: 1391

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)V"
	)
	void method4807(class226 var1, int var2) {
		if (this.field2713 != null) { // L: 1394
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1395
				int[] var4 = this.field2713[var3]; // L: 1396
				if (var4 != null && var4.length != 0) { // L: 1397
					int[] var5 = this.field2684[var3]; // L: 1398
					field2750.method8099(); // L: 1399

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1400
						int var7 = var4[var6]; // L: 1401
						class126 var8 = var1.method4454(var7); // L: 1402
						if (var8 != null) { // L: 1403
							field2689.method8101((float)var5[var6] / 255.0F); // L: 1404
							field2690.method8096(var8.method2928(var2)); // L: 1405
							field2690.method8104(field2689); // L: 1406
							field2750.method8103(field2690); // L: 1407
						}
					}

					this.method4806(var3, field2750); // L: 1409
				}
			}

		}
	} // L: 1411

	@ObfuscatedName("dy")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 847
			this.calculateBoundsCylinder();
		}

		this.method4870(var1); // L: 848
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 849
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 850
		int var13 = var3 * this.xzRadius >> 16; // L: 851
		int var14 = var12 + var13; // L: 852
		if (var14 > 50 && var12 < 3500) { // L: 853
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 854
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method4374(); // L: 855
			if (var16 / var14 < Rasterizer3D.method4378()) { // L: 856
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method4374(); // L: 857
				if (var17 / var14 > Rasterizer3D.method4377()) { // L: 858
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 859
					int var19 = var2 * this.xzRadius >> 16; // L: 860
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 861
					int var21 = (var18 + var20) * Rasterizer3D.method4374(); // L: 862
					if (var21 / var14 > Rasterizer3D.method4418()) { // L: 863
						int var22 = (var3 * super.height >> 16) + var19; // L: 864
						int var23 = (var18 - var22) * Rasterizer3D.method4374(); // L: 865
						if (var23 / var14 < Rasterizer3D.method4381()) { // L: 866
							int var24 = var13 + (var2 * super.height >> 16); // L: 867
							boolean var25 = false; // L: 868
							boolean var26 = false; // L: 869
							if (var12 - var24 <= 50) { // L: 870
								var26 = true;
							}

							boolean var27 = var26 || this.field2707 > 0; // L: 871
							int var28 = VertexNormal.method4920(); // L: 872
							int var29 = ViewportMouse.ViewportMouse_y; // L: 875
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport; // L: 880
							boolean var33 = GameEngine.method563(var9); // L: 883
							boolean var34 = false; // L: 884
							int var40;
							int var41;
							int var42;
							int var43;
							int var49;
							int var53;
							int var54;
							if (var33 && var31) { // L: 885
								boolean var35 = false; // L: 886
								if (field2747) { // L: 887
									boolean var38 = ViewportMouse.ViewportMouse_isInViewport; // L: 893
									boolean var36;
									if (!var38) { // L: 895
										var36 = false; // L: 896
									} else {
										UserComparator9.method2877(); // L: 899
										class230 var39 = (class230)this.field2732.get(var1); // L: 900
										var40 = var39.field2615 + var6; // L: 901
										var41 = var7 + var39.field2616; // L: 902
										var42 = var8 + var39.field2614; // L: 903
										var43 = var39.field2612; // L: 904
										int var44 = var39.field2613; // L: 905
										int var45 = var39.field2617; // L: 906
										int var46 = class177.field1853 - var40; // L: 907
										int var47 = ViewportMouse.field2766 - var41; // L: 908
										int var48 = ViewportMouse.field2767 - var42; // L: 909
										if (Math.abs(var46) > var43 + class393.field4436) { // L: 910
											var36 = false; // L: 911
										} else if (Math.abs(var47) > var44 + class337.field3782) { // L: 914
											var36 = false; // L: 915
										} else if (Math.abs(var48) > var45 + class136.field1585) { // L: 918
											var36 = false; // L: 919
										} else if (Math.abs(var48 * class1.field4 - var47 * VarpDefinition.field1905) > var45 * class337.field3782 + var44 * class136.field1585) { // L: 922
											var36 = false; // L: 923
										} else if (Math.abs(var46 * VarpDefinition.field1905 - var48 * ViewportMouse.field2762) > var45 * class393.field4436 + var43 * class136.field1585) { // L: 926
											var36 = false; // L: 927
										} else if (Math.abs(var47 * ViewportMouse.field2762 - var46 * class1.field4) > var44 * class393.field4436 + var43 * class337.field3782) { // L: 930
											var36 = false; // L: 931
										} else {
											var36 = true; // L: 934
										}
									}

									var35 = var36; // L: 936
								} else {
									var54 = var12 - var13; // L: 939
									if (var54 <= 50) { // L: 940
										var54 = 50;
									}

									if (var15 > 0) { // L: 941
										var16 /= var14; // L: 942
										var17 /= var54; // L: 943
									} else {
										var17 /= var14; // L: 946
										var16 /= var54; // L: 947
									}

									if (var18 > 0) { // L: 949
										var23 /= var14; // L: 950
										var21 /= var54; // L: 951
									} else {
										var21 /= var14; // L: 954
										var23 /= var54; // L: 955
									}

									var49 = var28 - Rasterizer3D.method4375(); // L: 957
									var53 = var29 - Rasterizer3D.method4376(); // L: 958
									if (var49 > var16 && var49 < var17 && var53 > var23 && var53 < var21) { // L: 959
										var35 = true; // L: 960
									}
								}

								if (var35) { // L: 963
									if (this.isSingleTile) { // L: 964
										class12.method163(var9);
									} else {
										var34 = true; // L: 965
									}
								}
							}

							int var52 = Rasterizer3D.method4375(); // L: 968
							var54 = Rasterizer3D.method4376(); // L: 969
							var49 = 0; // L: 970
							var53 = 0; // L: 971
							if (var1 != 0) { // L: 972
								var49 = field2700[var1]; // L: 973
								var53 = field2756[var1]; // L: 974
							}

							for (int var50 = 0; var50 < this.verticesCount; ++var50) { // L: 976
								var40 = this.verticesX[var50]; // L: 977
								var41 = this.verticesY[var50]; // L: 978
								var42 = this.verticesZ[var50]; // L: 979
								if (var1 != 0) { // L: 980
									var43 = var42 * var49 + var40 * var53 >> 16; // L: 981
									var42 = var42 * var53 - var40 * var49 >> 16; // L: 982
									var40 = var43; // L: 983
								}

								var40 += var6; // L: 985
								var41 += var7; // L: 986
								var42 += var8; // L: 987
								var43 = var42 * var4 + var5 * var40 >> 16; // L: 988
								var42 = var5 * var42 - var40 * var4 >> 16; // L: 989
								var40 = var43; // L: 990
								var43 = var3 * var41 - var42 * var2 >> 16; // L: 991
								var42 = var41 * var2 + var3 * var42 >> 16; // L: 992
								field2726[var50] = var42 - var12; // L: 994
								if (var42 >= 50) { // L: 995
									modelViewportXs[var50] = var52 + var40 * Rasterizer3D.method4374() / var42; // L: 996
									modelViewportYs[var50] = var54 + var43 * Rasterizer3D.method4374() / var42; // L: 997
									field2692[var50] = class137.method3092(var42); // L: 998
								} else {
									modelViewportXs[var50] = -5000; // L: 1001
									var25 = true; // L: 1002
								}

								if (var27) { // L: 1004
									field2717[var50] = var40; // L: 1005
									field2730[var50] = var43; // L: 1006
									field2731[var50] = var42; // L: 1007
								}
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9); // L: 1011
							} catch (Exception var51) { // L: 1013
							}

						}
					}
				}
			}
		}
	} // L: 1014
}
