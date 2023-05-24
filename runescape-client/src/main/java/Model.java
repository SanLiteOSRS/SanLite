import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("an")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ac")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static class425 field2689;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static class425 field2690;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static class425 field2691;
	@ObfuscatedName("bs")
	static boolean[] field2724;
	@ObfuscatedName("br")
	static boolean[] field2725;
	@ObfuscatedName("bg")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bu")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bf")
	static float[] field2728;
	@ObfuscatedName("bq")
	static int[] field2729;
	@ObfuscatedName("ba")
	static int[] field2716;
	@ObfuscatedName("bv")
	static int[] field2731;
	@ObfuscatedName("bl")
	static int[] field2760;
	@ObfuscatedName("bc")
	static char[] field2754;
	@ObfuscatedName("bh")
	static char[][] field2735;
	@ObfuscatedName("bw")
	static int[] field2736;
	@ObfuscatedName("ce")
	static int[][] field2700;
	@ObfuscatedName("ci")
	static int[] field2738;
	@ObfuscatedName("cs")
	static int[] field2739;
	@ObfuscatedName("cc")
	static int[] field2740;
	@ObfuscatedName("cn")
	static int[] field2741;
	@ObfuscatedName("ca")
	static int[] field2742;
	@ObfuscatedName("cu")
	static int[] field2743;
	@ObfuscatedName("ck")
	static float[] field2705;
	@ObfuscatedName("cq")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cm")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cf")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cl")
	static boolean field2737;
	@ObfuscatedName("cy")
	static int[] field2749;
	@ObfuscatedName("cx")
	static int[] field2687;
	@ObfuscatedName("cv")
	static int[] field2695;
	@ObfuscatedName("cb")
	static int[] field2732;
	@ObfuscatedName("cw")
	static final float field2757;
	@ObfuscatedName("al")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("at")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("aa")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ay")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ao")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ax")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ai")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ag")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ah")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("av")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ar")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("am")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("as")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("aj")
	byte[] field2709;
	@ObfuscatedName("ak")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("az")
	public byte field2707;
	@ObfuscatedName("ad")
	public int field2708;
	@ObfuscatedName("ae")
	int[] field2759;
	@ObfuscatedName("ap")
	int[] field2710;
	@ObfuscatedName("by")
	int[] field2744;
	@ObfuscatedName("bb")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bi")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("be")
	int[][] field2711;
	@ObfuscatedName("bk")
	int[][] field2715;
	@ObfuscatedName("bx")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bo")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bz")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bm")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bd")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bt")
	@Export("radius")
	int radius;
	@ObfuscatedName("bj")
	HashMap field2722;
	@ObfuscatedName("cj")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("ch")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("ct")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cp")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cd")
	public short field2755;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2689 = new class425(); // L: 17
		field2690 = new class425(); // L: 18
		field2691 = new class425(); // L: 19
		field2724 = new boolean[6500]; // L: 55
		field2725 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2728 = new float[6500]; // L: 59
		field2729 = new int[6500]; // L: 60
		field2716 = new int[6500]; // L: 61
		field2731 = new int[6500]; // L: 62
		field2760 = new int[6500]; // L: 63
		field2754 = new char[6000]; // L: 65
		field2735 = new char[6000][512]; // L: 66
		field2736 = new int[12]; // L: 67
		field2700 = new int[12][2000]; // L: 68
		field2738 = new int[2000]; // L: 69
		field2739 = new int[2000]; // L: 70
		field2740 = new int[12]; // L: 71
		field2741 = new int[10]; // L: 72
		field2742 = new int[10]; // L: 73
		field2743 = new int[10]; // L: 74
		field2705 = new float[10]; // L: 75
		field2737 = true; // L: 79
		field2749 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field2687 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2695 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2732 = Rasterizer3D.field2513; // L: 85
		field2757 = NPC.method2626(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2707 = 0;
		this.field2708 = 0;
		this.isSingleTile = false;
		this.field2722 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2707 = 0;
		this.field2708 = 0;
		this.isSingleTile = false;
		this.field2722 = new HashMap();
		this.method4824(var1, var2, var3); // L: 121
		this.field2707 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2708 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Lit;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2707 = 0; // L: 35
		this.field2708 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2722 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2708 = 0; // L: 100
		this.field2707 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2708 += var4.field2708; // L: 107
				if (this.field2707 == -1) { // L: 108
					this.field2707 = var4.field2707;
				}
			}
		}

		this.method4824(this.verticesCount, this.indicesCount, this.field2708); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2708 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method4862(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("af")
	void method4824(int var1, int var2, int var3) {
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
			this.field2759 = new int[var3]; // L: 139
			this.field2710 = new int[var3]; // L: 140
			this.field2744 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lit;)V"
	)
	void method4749(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2707 != var1.field2707)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2707); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2709 == null && var1.field2709 != null) { // L: 159
			this.field2709 = new byte[var2]; // L: 160
			Arrays.fill(this.field2709, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lit;)V"
	)
	public void method4862(Model var1) {
		if (var1 != null) { // L: 166
			this.method4749(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2707; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2709 != null) { // L: 186
					if (var1.field2709 != null && var1.field2709[var2] != -1) { // L: 187
						this.field2709[this.indicesCount] = (byte)(var1.field2709[var2] + this.field2708); // L: 188
					} else {
						this.field2709[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2708; ++var2) { // L: 196
				this.field2759[this.field2708] = this.verticesCount + var1.field2759[var2]; // L: 197
				this.field2710[this.field2708] = this.verticesCount + var1.field2710[var2]; // L: 198
				this.field2744[this.field2708] = this.verticesCount + var1.field2744[var2]; // L: 199
				++this.field2708; // L: 200
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
		descriptor = "([[IIIIZI)Lit;"
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
					var11.field2708 = this.field2708; // L: 227
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
					var11.field2709 = this.field2709; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2707 = this.field2707; // L: 240
					var11.field2759 = this.field2759; // L: 241
					var11.field2710 = this.field2710; // L: 242
					var11.field2744 = this.field2744; // L: 243
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Z)Lit;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Z)Lit;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZLit;[B)Lit;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2708 = this.field2708; // L: 300
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
		var2.field2709 = this.field2709; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2707 = this.field2707; // L: 330
		var2.field2759 = this.field2759; // L: 331
		var2.field2710 = this.field2710; // L: 332
		var2.field2744 = this.field2744; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2711 = this.field2711; // L: 336
		var2.field2715 = this.field2715; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("ax")
	void method4755(int var1) {
		if (!this.field2722.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field2687[var1]; // L: 352
			int var9 = field2749[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var11 = class143.method3237(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 355
				int var12 = this.verticesY[var10]; // L: 356
				int var13 = ClanChannel.method3439(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 357
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

			class223 var14 = new class223((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 365
			boolean var15 = true; // L: 366
			if (var14.field2613 < 32) { // L: 367
				var14.field2613 = 32;
			}

			if (var14.field2615 < 32) { // L: 368
				var14.field2615 = 32;
			}

			if (this.isSingleTile) { // L: 369
				boolean var16 = true; // L: 370
				var14.field2613 += 8; // L: 371
				var14.field2615 += 8; // L: 372
			}

			this.field2722.put(var1, var14); // L: 374
		}
	} // L: 375

	@ObfuscatedName("ai")
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

	@ObfuscatedName("ag")
	void method4857() {
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
	public int method4762() {
		this.calculateBoundsCylinder(); // L: 414
		return this.xzRadius; // L: 415
	}

	@ObfuscatedName("av")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 419
		this.field2722.clear(); // L: 420
	} // L: 421

	@ObfuscatedName("ar")
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
		descriptor = "(Lfh;I)V"
	)
	public void method4761(class133 var1, int var2) {
		Skeleton var3 = var1.field1590; // L: 439
		class219 var4 = var3.method4517(); // L: 440
		if (var4 != null) { // L: 441
			var3.method4517().method4457(var1, var2); // L: 442
			this.method4763(var3.method4517(), var1.method3141()); // L: 443
		}

		if (var1.method3136()) { // L: 445
			this.method4771(var1, var2); // L: 446
		}

		this.resetBounds(); // L: 448
	} // L: 449

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I)V"
	)
	void method4771(class133 var1, int var2) {
		Skeleton var3 = var1.field1590; // L: 452

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 453
			int var5 = var3.transformTypes[var4]; // L: 454
			if (var5 == 5 && var1.field1592 != null && var1.field1592[var4] != null && var1.field1592[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 455 456
				class125 var6 = var1.field1592[var4][0]; // L: 457
				int[] var7 = var3.labels[var4]; // L: 458
				int var8 = var7.length; // L: 459

				for (int var9 = 0; var9 < var8; ++var9) { // L: 460
					int var10 = var7[var9]; // L: 461
					if (var10 < this.faceLabelsAlpha.length) { // L: 462
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 463

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 464
							int var13 = var11[var12]; // L: 465
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3062(var2) * 255.0F); // L: 466
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)V"
	)
	void method4763(class219 var1, int var2) {
		this.method4783(var1, var2); // L: 480
	} // L: 482

	@ObfuscatedName("ak")
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lik;Lfh;I[ZZZ)V"
	)
	public void method4804(Skeleton var1, class133 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class219 var7 = var1.method4517(); // L: 517
		if (var7 != null) { // L: 518
			var7.method4474(var2, var3, var4, var5); // L: 519
			if (var6) { // L: 520
				this.method4763(var7, var2.method3141()); // L: 521
			}
		}

		if (!var5 && var2.method3136()) { // L: 524
			this.method4771(var2, var3); // L: 525
		}

	} // L: 527

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lio;I[IZ)V"
	)
	public void method4766(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ae")
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
								var16 = field2687[var14]; // L: 615
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 616
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 617
								this.verticesX[var11] = var17; // L: 618
							}

							if (var12 != 0) { // L: 620
								var15 = field2749[var12]; // L: 621
								var16 = field2687[var12]; // L: 622
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 623
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 624
								this.verticesY[var11] = var17; // L: 625
							}

							if (var13 != 0) { // L: 627
								var15 = field2749[var13]; // L: 628
								var16 = field2687[var13]; // L: 629
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

	@ObfuscatedName("ap")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 684
			int var2 = this.verticesX[var1]; // L: 685
			this.verticesX[var1] = this.verticesZ[var1]; // L: 686
			this.verticesZ[var1] = -var2; // L: 687
		}

		this.resetBounds(); // L: 689
	} // L: 690

	@ObfuscatedName("by")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 693
			this.verticesX[var1] = -this.verticesX[var1]; // L: 694
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("bb")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 701
			int var2 = this.verticesZ[var1]; // L: 702
			this.verticesZ[var1] = this.verticesX[var1]; // L: 703
			this.verticesX[var1] = -var2; // L: 704
		}

		this.resetBounds(); // L: 706
	} // L: 707

	@ObfuscatedName("bi")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2749[var1]; // L: 710
		int var3 = field2687[var1]; // L: 711

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 712
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 713
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 714
			this.verticesY[var4] = var5; // L: 715
		}

		this.resetBounds(); // L: 717
	} // L: 718

	@ObfuscatedName("be")
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

	@ObfuscatedName("bx")
	public final void method4863(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 739
			this.method4857();
		}

		int var8 = TaskHandler.method3563(); // L: 740
		int var9 = class12.method164(); // L: 741
		int var10 = field2749[var1]; // L: 742
		int var11 = field2687[var1]; // L: 743
		int var12 = field2749[var2]; // L: 744
		int var13 = field2687[var2]; // L: 745
		int var14 = field2749[var3]; // L: 746
		int var15 = field2687[var3]; // L: 747
		int var16 = field2749[var4]; // L: 748
		int var17 = field2687[var4]; // L: 749
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
			field2729[var19] = var22 - var18; // L: 776
			modelViewportXs[var19] = var8 + var20 * UserComparator7.method2904() / var22; // L: 777
			modelViewportYs[var19] = var9 + var23 * UserComparator7.method2904() / var22; // L: 778
			field2728[var19] = NPC.method2626(var22); // L: 779
			if (this.field2708 > 0) { // L: 780
				field2716[var19] = var20; // L: 781
				field2731[var19] = var23; // L: 782
				field2760[var19] = var22; // L: 783
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 787
		} catch (Exception var25) { // L: 789
		}

	} // L: 790

	@ObfuscatedName("bo")
	public final void method4775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 793
			this.method4857();
		}

		int var9 = TaskHandler.method3563(); // L: 794
		int var10 = class12.method164(); // L: 795
		int var11 = field2749[var1]; // L: 796
		int var12 = field2687[var1]; // L: 797
		int var13 = field2749[var2]; // L: 798
		int var14 = field2687[var2]; // L: 799
		int var15 = field2749[var3]; // L: 800
		int var16 = field2687[var3]; // L: 801
		int var17 = field2749[var4]; // L: 802
		int var18 = field2687[var4]; // L: 803
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
			field2729[var20] = var23 - var19; // L: 830
			modelViewportXs[var20] = var9 + var21 * UserComparator7.method2904() / var8; // L: 831
			modelViewportYs[var20] = var10 + var24 * UserComparator7.method2904() / var8; // L: 832
			field2728[var20] = NPC.method2626(var8); // L: 833
			if (this.field2708 > 0) { // L: 834
				field2716[var20] = var21; // L: 835
				field2731[var20] = var24; // L: 836
				field2760[var20] = var23; // L: 837
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 841
		} catch (Exception var26) { // L: 843
		}

	} // L: 844

	@ObfuscatedName("bz")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 979
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 980
				field2754[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 981

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 982
				if (this.faceColors3[var7] != -2) { // L: 983
					var8 = this.indices1[var7]; // L: 984
					var9 = this.indices2[var7]; // L: 985
					var10 = this.indices3[var7]; // L: 986
					var11 = modelViewportXs[var8]; // L: 987
					var12 = modelViewportXs[var9]; // L: 988
					var28 = modelViewportXs[var10]; // L: 989
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 990
						if (var2) { // L: 1016
							var15 = modelViewportYs[var8]; // L: 1018
							var16 = modelViewportYs[var9]; // L: 1019
							var30 = modelViewportYs[var10]; // L: 1020
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 1022
							boolean var35;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 1023
								var35 = false; // L: 1024
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1027
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 1028
									var35 = false; // L: 1029
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1032
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1033
										var35 = false; // L: 1034
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1037
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1038
											var35 = false; // L: 1039
										} else {
											var35 = true; // L: 1042
										}
									}
								}
							}

							if (var35) { // L: 1044
								GraphicsObject.method2016(var4); // L: 1045
								var2 = false; // L: 1046
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1049
							field2725[var7] = false; // L: 1050
							var29 = class6.method46(); // L: 1051
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1052
								field2724[var7] = false; // L: 1053
							} else {
								field2724[var7] = true;
							}

							var15 = (field2729[var8] + field2729[var9] + field2729[var10]) / 3 + this.radius; // L: 1054
							field2735[var15][field2754[var15]++] = var7; // L: 1055
						}
					} else {
						var29 = field2716[var8]; // L: 991
						var15 = field2716[var9]; // L: 992
						var16 = field2716[var10]; // L: 993
						var30 = field2731[var8]; // L: 994
						var18 = field2731[var9]; // L: 995
						int var19 = field2731[var10]; // L: 996
						int var20 = field2760[var8]; // L: 997
						int var21 = field2760[var9]; // L: 998
						int var22 = field2760[var10]; // L: 999
						var29 -= var15; // L: 1000
						var16 -= var15; // L: 1001
						var30 -= var18; // L: 1002
						var19 -= var18; // L: 1003
						var20 -= var21; // L: 1004
						var22 -= var21; // L: 1005
						int var23 = var30 * var22 - var20 * var19; // L: 1006
						int var24 = var20 * var16 - var29 * var22; // L: 1007
						int var25 = var29 * var19 - var30 * var16; // L: 1008
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1009
							field2725[var7] = true; // L: 1010
							int var26 = (field2729[var8] + field2729[var9] + field2729[var10]) / 3 + this.radius; // L: 1011
							field2735[var26][field2754[var26]++] = var7; // L: 1012
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1059
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1060
					var32 = field2754[var31]; // L: 1061
					if (var32 > 0) { // L: 1062
						var27 = field2735[var31]; // L: 1063

						for (var10 = 0; var10 < var32; ++var10) { // L: 1064
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1069
					field2736[var31] = 0; // L: 1070
					field2740[var31] = 0; // L: 1071
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1073
					var32 = field2754[var31]; // L: 1074
					if (var32 > 0) { // L: 1075
						var27 = field2735[var31]; // L: 1076

						for (var10 = 0; var10 < var32; ++var10) { // L: 1077
							char var33 = var27[var10]; // L: 1078
							byte var34 = this.faceRenderPriorities[var33]; // L: 1079
							var28 = field2736[var34]++; // L: 1080
							field2700[var34][var28] = var33; // L: 1081
							if (var34 < 10) { // L: 1082
								int[] var36 = field2740;
								var36[var34] += var31;
							} else if (var34 == 10) { // L: 1083
								field2738[var28] = var31;
							} else {
								field2739[var28] = var31; // L: 1084
							}
						}
					}
				}

				var31 = 0; // L: 1088
				if (field2736[1] > 0 || field2736[2] > 0) { // L: 1089
					var31 = (field2740[1] + field2740[2]) / (field2736[1] + field2736[2]);
				}

				var8 = 0; // L: 1090
				if (field2736[3] > 0 || field2736[4] > 0) { // L: 1091
					var8 = (field2740[3] + field2740[4]) / (field2736[3] + field2736[4]);
				}

				var9 = 0; // L: 1092
				if (field2736[6] > 0 || field2736[8] > 0) { // L: 1093
					var9 = (field2740[8] + field2740[6]) / (field2736[8] + field2736[6]);
				}

				var11 = 0; // L: 1095
				var12 = field2736[10]; // L: 1096
				int[] var13 = field2700[10]; // L: 1097
				int[] var14 = field2738; // L: 1098
				if (var11 == var12) { // L: 1099
					var11 = 0; // L: 1100
					var12 = field2736[11]; // L: 1101
					var13 = field2700[11]; // L: 1102
					var14 = field2739; // L: 1103
				}

				if (var11 < var12) { // L: 1105
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1106
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1107
					while (var15 == 0 && var10 > var31) { // L: 1108
						this.drawFace(var13[var11++]); // L: 1109
						if (var11 == var12 && var13 != field2700[11]) { // L: 1110
							var11 = 0; // L: 1111
							var12 = field2736[11]; // L: 1112
							var13 = field2700[11]; // L: 1113
							var14 = field2739; // L: 1114
						}

						if (var11 < var12) { // L: 1116
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1117
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1119
						this.drawFace(var13[var11++]); // L: 1120
						if (var11 == var12 && var13 != field2700[11]) { // L: 1121
							var11 = 0; // L: 1122
							var12 = field2736[11]; // L: 1123
							var13 = field2700[11]; // L: 1124
							var14 = field2739; // L: 1125
						}

						if (var11 < var12) { // L: 1127
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1128
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1130
						this.drawFace(var13[var11++]); // L: 1131
						if (var11 == var12 && var13 != field2700[11]) { // L: 1132
							var11 = 0; // L: 1133
							var12 = field2736[11]; // L: 1134
							var13 = field2700[11]; // L: 1135
							var14 = field2739; // L: 1136
						}

						if (var11 < var12) { // L: 1138
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1139
						}
					}

					var16 = field2736[var15]; // L: 1141
					int[] var17 = field2700[var15]; // L: 1142

					for (var18 = 0; var18 < var16; ++var18) { // L: 1143
						this.drawFace(var17[var18]); // L: 1144
					}
				}

				while (var10 != -1000) { // L: 1147
					this.drawFace(var13[var11++]); // L: 1148
					if (var11 == var12 && var13 != field2700[11]) { // L: 1149
						var11 = 0; // L: 1150
						var13 = field2700[11]; // L: 1151
						var12 = field2736[11]; // L: 1152
						var14 = field2739; // L: 1153
					}

					if (var11 < var12) { // L: 1155
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1156
					}
				}

			}
		}
	} // L: 1067 1158

	@ObfuscatedName("bm")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2725[var1]) { // L: 1161
			this.method4791(var1); // L: 1162
		} else {
			int var2 = this.indices1[var1]; // L: 1165
			int var3 = this.indices2[var1]; // L: 1166
			int var4 = this.indices3[var1]; // L: 1167
			Rasterizer3D.field2514.field2798 = field2724[var1]; // L: 1168
			if (this.faceAlphas == null) { // L: 1169
				Rasterizer3D.field2514.field2788 = 0; // L: 1170
			} else {
				Rasterizer3D.field2514.field2788 = this.faceAlphas[var1] & 255; // L: 1173
			}

			this.method4780(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2728[var2], field2728[var3], field2728[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1175
		}
	} // L: 1163 1176

	@ObfuscatedName("bd")
	boolean method4779(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2755; // L: 1179
	}

	@ObfuscatedName("bt")
	final void method4780(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		int var21;
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1183
			int var20;
			int var22;
			if (this.field2709 != null && this.field2709[var1] != -1) { // L: 1215
				int var23 = this.field2709[var1] & 255; // L: 1216
				var20 = this.field2759[var23]; // L: 1217
				var21 = this.field2710[var23]; // L: 1218
				var22 = this.field2744[var23]; // L: 1219
			} else {
				var20 = this.indices1[var1]; // L: 1222
				var21 = this.indices2[var1]; // L: 1223
				var22 = this.indices3[var1]; // L: 1224
			}

			if (this.faceColors3[var1] == -1) { // L: 1226
				DevicePcmPlayerProvider.method322(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2716[var20], field2716[var21], field2716[var22], field2731[var20], field2731[var21], field2731[var22], field2760[var20], field2760[var21], field2760[var22], this.faceTextures[var1]); // L: 1227
			} else {
				DevicePcmPlayerProvider.method322(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2716[var20], field2716[var21], field2716[var22], field2731[var20], field2731[var21], field2731[var22], field2760[var20], field2760[var21], field2760[var22], this.faceTextures[var1]); // L: 1230
			}
		} else {
			boolean var14 = this.method4779(var1); // L: 1184
			byte var16;
			byte var17;
			byte var18;
			if (this.faceColors3[var1] == -1 && var14) { // L: 1185
				var21 = field2695[this.faceColors1[var1]]; // L: 1186
				var16 = this.overrideHue; // L: 1187
				var17 = this.overrideSaturation; // L: 1188
				var18 = this.overrideLuminance; // L: 1189
				byte var19 = this.overrideAmount; // L: 1190
				Rasterizer3D.field2519.method4512(var2, var3, var4, var5, var6, var7, var8, var9, var10, var21, var16, var17, var18, var19); // L: 1192
			} else if (this.faceColors3[var1] == -1) { // L: 1195
				class144.method3256(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2695[this.faceColors1[var1]]); // L: 1196
			} else if (var14) { // L: 1198
				byte var15 = this.overrideHue; // L: 1199
				var16 = this.overrideSaturation; // L: 1200
				var17 = this.overrideLuminance; // L: 1201
				var18 = this.overrideAmount; // L: 1202
				Rasterizer3D.field2519.method4478(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var15, var16, var17, var18); // L: 1204
			} else {
				WallObject.method5010(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1208
			}
		}

	} // L: 1233

	@ObfuscatedName("bj")
	final void method4791(int var1) {
		int var2 = TaskHandler.method3563(); // L: 1236
		int var3 = class12.method164(); // L: 1237
		int var4 = 0; // L: 1238
		int var5 = this.indices1[var1]; // L: 1239
		int var6 = this.indices2[var1]; // L: 1240
		int var7 = this.indices3[var1]; // L: 1241
		int var8 = field2760[var5]; // L: 1242
		int var9 = field2760[var6]; // L: 1243
		int var10 = field2760[var7]; // L: 1244
		if (this.faceAlphas == null) { // L: 1245
			Rasterizer3D.field2514.field2788 = 0;
		} else {
			Rasterizer3D.field2514.field2788 = this.faceAlphas[var1] & 255; // L: 1246
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1247
			field2741[var4] = modelViewportXs[var5]; // L: 1248
			field2742[var4] = modelViewportYs[var5]; // L: 1249
			field2705[var4] = field2728[var7]; // L: 1250
			field2743[var4++] = this.faceColors1[var1]; // L: 1251
		} else {
			var11 = field2716[var5]; // L: 1254
			var12 = field2731[var5]; // L: 1255
			var13 = this.faceColors1[var1]; // L: 1256
			if (var10 >= 50) { // L: 1257
				var14 = field2732[var10 - var8] * (50 - var8); // L: 1258
				field2741[var4] = var2 + (var11 + ((field2716[var7] - var11) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1259
				field2742[var4] = var3 + (var12 + ((field2731[var7] - var12) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1260
				field2705[var4] = field2757; // L: 1261
				field2743[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1262
			}

			if (var9 >= 50) { // L: 1264
				var14 = field2732[var9 - var8] * (50 - var8); // L: 1265
				field2741[var4] = var2 + (var11 + ((field2716[var6] - var11) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1266
				field2742[var4] = var3 + (var12 + ((field2731[var6] - var12) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1267
				field2705[var4] = field2757; // L: 1268
				field2743[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1269
			}
		}

		if (var9 >= 50) { // L: 1272
			field2741[var4] = modelViewportXs[var6]; // L: 1273
			field2742[var4] = modelViewportYs[var6]; // L: 1274
			field2705[var4] = field2728[var7]; // L: 1275
			field2743[var4++] = this.faceColors2[var1]; // L: 1276
		} else {
			var11 = field2716[var6]; // L: 1279
			var12 = field2731[var6]; // L: 1280
			var13 = this.faceColors2[var1]; // L: 1281
			if (var8 >= 50) { // L: 1282
				var14 = field2732[var8 - var9] * (50 - var9); // L: 1283
				field2741[var4] = var2 + (var11 + ((field2716[var5] - var11) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1284
				field2742[var4] = var3 + (var12 + ((field2731[var5] - var12) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1285
				field2705[var4] = field2757; // L: 1286
				field2743[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1287
			}

			if (var10 >= 50) { // L: 1289
				var14 = field2732[var10 - var9] * (50 - var9); // L: 1290
				field2741[var4] = var2 + (var11 + ((field2716[var7] - var11) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1291
				field2742[var4] = var3 + (var12 + ((field2731[var7] - var12) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1292
				field2743[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1293
			}
		}

		if (var10 >= 50) { // L: 1296
			field2741[var4] = modelViewportXs[var7]; // L: 1297
			field2742[var4] = modelViewportYs[var7]; // L: 1298
			field2705[var4] = field2728[var7]; // L: 1299
			field2743[var4++] = this.faceColors3[var1]; // L: 1300
		} else {
			var11 = field2716[var7]; // L: 1303
			var12 = field2731[var7]; // L: 1304
			var13 = this.faceColors3[var1]; // L: 1305
			if (var9 >= 50) { // L: 1306
				var14 = field2732[var9 - var10] * (50 - var10); // L: 1307
				field2741[var4] = var2 + (var11 + ((field2716[var6] - var11) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1308
				field2742[var4] = var3 + (var12 + ((field2731[var6] - var12) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1309
				field2705[var4] = field2757; // L: 1310
				field2743[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1311
			}

			if (var8 >= 50) { // L: 1313
				var14 = field2732[var8 - var10] * (50 - var10); // L: 1314
				field2741[var4] = var2 + (var11 + ((field2716[var5] - var11) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1315
				field2742[var4] = var3 + (var12 + ((field2731[var5] - var12) * var14 >> 16)) * UserComparator7.method2904() / 50; // L: 1316
				field2705[var4] = field2757; // L: 1317
				field2743[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1318
			}
		}

		var11 = field2741[0]; // L: 1321
		var12 = field2741[1]; // L: 1322
		var13 = field2741[2]; // L: 1323
		var14 = field2742[0]; // L: 1324
		int var15 = field2742[1]; // L: 1325
		int var16 = field2742[2]; // L: 1326
		float var17 = field2705[0]; // L: 1327
		float var18 = field2705[1]; // L: 1328
		float var19 = field2705[2]; // L: 1329
		Rasterizer3D.field2514.field2798 = false; // L: 1330
		int var20 = class6.method46(); // L: 1331
		if (var4 == 3) { // L: 1332
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1333
				Rasterizer3D.field2514.field2798 = true;
			}

			this.method4780(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2743[0], field2743[1], field2743[2]); // L: 1334
		}

		if (var4 == 4) { // L: 1336
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2741[3] < 0 || field2741[3] > var20) { // L: 1337
				Rasterizer3D.field2514.field2798 = true;
			}

			int var22;
			int var23;
			int var24;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1338
				int var38;
				if (this.field2709 != null && this.field2709[var1] != -1) { // L: 1398
					var24 = this.field2709[var1] & 255; // L: 1399
					var38 = this.field2759[var24]; // L: 1400
					var22 = this.field2710[var24]; // L: 1401
					var23 = this.field2744[var24]; // L: 1402
				} else {
					var38 = var5; // L: 1405
					var22 = var6; // L: 1406
					var23 = var7; // L: 1407
				}

				short var41 = this.faceTextures[var1]; // L: 1409
				if (this.faceColors3[var1] == -1) { // L: 1410
					DevicePcmPlayerProvider.method322(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var41); // L: 1411
					DevicePcmPlayerProvider.method322(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var41); // L: 1412
				} else {
					DevicePcmPlayerProvider.method322(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2743[0], field2743[1], field2743[2], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var41); // L: 1415
					DevicePcmPlayerProvider.method322(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], field2743[0], field2743[2], field2743[3], field2716[var38], field2716[var22], field2716[var23], field2731[var38], field2731[var22], field2731[var23], field2760[var38], field2760[var22], field2760[var23], var41); // L: 1416
				}
			} else {
				boolean var21 = this.method4779(var1); // L: 1339
				byte var25;
				byte var26;
				if (this.faceColors3[var1] == -1 && var21) { // L: 1340
					var22 = field2695[this.faceColors1[var1]]; // L: 1341
					byte var39 = this.overrideHue; // L: 1342
					byte var40 = this.overrideSaturation; // L: 1343
					var25 = this.overrideLuminance; // L: 1344
					var26 = this.overrideAmount; // L: 1345
					Rasterizer3D.field2519.method4512(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var39, var40, var25, var26); // L: 1347
					int var42 = field2742[3]; // L: 1349
					int var43 = field2741[3]; // L: 1350
					float var44 = field2705[3]; // L: 1351
					byte var45 = this.overrideHue; // L: 1352
					byte var46 = this.overrideSaturation; // L: 1353
					byte var47 = this.overrideLuminance; // L: 1354
					byte var48 = this.overrideAmount; // L: 1355
					Rasterizer3D.field2519.method4512(var14, var16, var42, var11, var13, var43, var17, var19, var44, var22, var45, var46, var47, var48); // L: 1357
				} else if (this.faceColors3[var1] == -1) { // L: 1360
					var22 = field2695[this.faceColors1[var1]]; // L: 1361
					class144.method3256(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1362
					class144.method3256(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], var22); // L: 1363
				} else if (var21) { // L: 1365
					var22 = field2743[0]; // L: 1366
					var23 = field2743[1]; // L: 1367
					var24 = field2743[2]; // L: 1368
					var25 = this.overrideHue; // L: 1369
					var26 = this.overrideLuminance; // L: 1370
					byte var27 = this.overrideSaturation; // L: 1371
					byte var28 = this.overrideAmount; // L: 1372
					Rasterizer3D.field2519.method4478(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var23, var24, var25, var26, var27, var28); // L: 1374
					int var29 = field2742[3]; // L: 1376
					int var30 = field2741[3]; // L: 1377
					int var31 = field2743[0]; // L: 1378
					int var32 = field2743[2]; // L: 1379
					int var33 = field2743[3]; // L: 1380
					byte var34 = this.overrideHue; // L: 1381
					byte var35 = this.overrideLuminance; // L: 1382
					byte var36 = this.overrideSaturation; // L: 1383
					byte var37 = this.overrideAmount; // L: 1384
					Rasterizer3D.field2519.method4478(var14, var16, var29, var11, var13, var30, 0.0F, 0.0F, 0.0F, var31, var32, var33, var34, var35, var36, var37); // L: 1386
				} else {
					WallObject.method5010(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2743[0], field2743[1], field2743[2]); // L: 1390
					WallObject.method5010(var14, var16, field2742[3], var11, var13, field2741[3], var17, var19, field2705[3], field2743[0], field2743[2], field2743[3]); // L: 1391
				}
			}
		}

	} // L: 1420

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILqj;)V"
	)
	void method4772(int var1, class425 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1423
		float var4 = (float)(-this.verticesY[var1]); // L: 1424
		float var5 = (float)(-this.verticesZ[var1]); // L: 1425
		float var6 = 1.0F; // L: 1426
		this.verticesX[var1] = (int)(var2.field4670[0] * var3 + var2.field4670[4] * var4 + var2.field4670[8] * var5 + var2.field4670[12] * var6); // L: 1427
		this.verticesY[var1] = -((int)(var2.field4670[1] * var3 + var2.field4670[5] * var4 + var2.field4670[9] * var5 + var2.field4670[13] * var6)); // L: 1428
		this.verticesZ[var1] = -((int)(var2.field4670[2] * var3 + var2.field4670[6] * var4 + var2.field4670[10] * var5 + var2.field4670[14] * var6)); // L: 1429
	} // L: 1430

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)V"
	)
	void method4783(class219 var1, int var2) {
		if (this.field2711 != null) { // L: 1433
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1434
				int[] var4 = this.field2711[var3]; // L: 1435
				if (var4 != null && var4.length != 0) { // L: 1436
					int[] var5 = this.field2715[var3]; // L: 1437
					field2689.method8178(); // L: 1438

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1439
						int var7 = var4[var6]; // L: 1440
						class122 var8 = var1.method4454(var7); // L: 1441
						if (var8 != null) { // L: 1442
							field2690.method8180((float)var5[var6] / 255.0F); // L: 1443
							field2691.method8179(var8.method2999(var2)); // L: 1444
							field2691.method8183(field2690); // L: 1445
							field2689.method8182(field2691); // L: 1446
						}
					}

					this.method4772(var3, field2689); // L: 1448
				}
			}

		}
	} // L: 1450

	@ObfuscatedName("df")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 847
			this.calculateBoundsCylinder();
		}

		this.method4755(var1); // L: 848
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 849
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 850
		int var13 = var3 * this.xzRadius >> 16; // L: 851
		int var14 = var12 + var13; // L: 852
		if (var14 > 50 && var12 < 3500) { // L: 853
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 854
			int var16 = (var15 - this.xzRadius) * UserComparator7.method2904(); // L: 855
			if (var16 / var14 < class264.method5479()) { // L: 856
				int var17 = (var15 + this.xzRadius) * UserComparator7.method2904(); // L: 857
				int var18 = var17 / var14; // L: 858
				int var19 = Rasterizer3D.field2514.field2799; // L: 861
				if (var18 > var19) { // L: 863
					int var20 = var3 * var7 - var11 * var2 >> 16; // L: 864
					int var21 = var2 * this.xzRadius >> 16; // L: 865
					int var22 = (var3 * this.bottomY >> 16) + var21; // L: 866
					int var23 = (var20 + var22) * UserComparator7.method2904(); // L: 867
					int var24 = var23 / var14; // L: 868
					int var25 = Rasterizer3D.field2514.field2801; // L: 871
					if (var24 > var25) { // L: 873
						int var26 = (var3 * super.height >> 16) + var21; // L: 874
						int var27 = (var20 - var26) * UserComparator7.method2904(); // L: 875
						if (var27 / var14 < class142.method3227()) { // L: 876
							int var28 = var13 + (var2 * super.height >> 16); // L: 877
							boolean var29 = false; // L: 878
							boolean var30 = false; // L: 879
							if (var12 - var28 <= 50) { // L: 880
								var30 = true;
							}

							boolean var31 = var30 || this.field2708 > 0; // L: 881
							int var32 = Projectile.method2117(); // L: 882
							int var33 = ViewportMouse.ViewportMouse_y; // L: 885
							boolean var35 = ViewportMouse.ViewportMouse_isInViewport; // L: 890
							boolean var37 = class173.method3588(var9); // L: 893
							boolean var38 = false; // L: 894
							int var40;
							int var41;
							int var42;
							if (var37 && var35) { // L: 895
								boolean var39 = false; // L: 896
								if (field2737) { // L: 897
									var39 = class428.method8278(this, var1, var6, var7, var8); // L: 898
								} else {
									var40 = var12 - var13; // L: 901
									if (var40 <= 50) { // L: 902
										var40 = 50;
									}

									if (var15 > 0) { // L: 903
										var16 /= var14; // L: 904
										var17 /= var40; // L: 905
									} else {
										var17 /= var14; // L: 908
										var16 /= var40; // L: 909
									}

									if (var20 > 0) { // L: 911
										var27 /= var14; // L: 912
										var23 /= var40; // L: 913
									} else {
										var23 /= var14; // L: 916
										var27 /= var40; // L: 917
									}

									var41 = var32 - TaskHandler.method3563(); // L: 919
									var42 = var33 - class12.method164(); // L: 920
									if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) { // L: 921
										var39 = true; // L: 922
									}
								}

								if (var39) { // L: 925
									if (this.isSingleTile) { // L: 926
										GraphicsObject.method2016(var9);
									} else {
										var38 = true; // L: 927
									}
								}
							}

							int var50 = TaskHandler.method3563(); // L: 930
							var40 = class12.method164(); // L: 931
							var41 = 0; // L: 932
							var42 = 0; // L: 933
							if (var1 != 0) { // L: 934
								var41 = field2749[var1]; // L: 935
								var42 = field2687[var1]; // L: 936
							}

							for (int var43 = 0; var43 < this.verticesCount; ++var43) { // L: 938
								int var44 = this.verticesX[var43]; // L: 939
								int var45 = this.verticesY[var43]; // L: 940
								int var46 = this.verticesZ[var43]; // L: 941
								int var47;
								if (var1 != 0) { // L: 942
									var47 = var46 * var41 + var44 * var42 >> 16; // L: 943
									var46 = var46 * var42 - var44 * var41 >> 16; // L: 944
									var44 = var47; // L: 945
								}

								var44 += var6; // L: 947
								var45 += var7; // L: 948
								var46 += var8; // L: 949
								var47 = var46 * var4 + var5 * var44 >> 16; // L: 950
								var46 = var5 * var46 - var44 * var4 >> 16; // L: 951
								var44 = var47; // L: 952
								var47 = var3 * var45 - var46 * var2 >> 16; // L: 953
								var46 = var45 * var2 + var3 * var46 >> 16; // L: 954
								field2729[var43] = var46 - var12; // L: 956
								if (var46 >= 50) { // L: 957
									modelViewportXs[var43] = var50 + var44 * UserComparator7.method2904() / var46; // L: 958
									modelViewportYs[var43] = var40 + var47 * UserComparator7.method2904() / var46; // L: 959
									field2728[var43] = NPC.method2626(var46); // L: 960
								} else {
									modelViewportXs[var43] = -5000; // L: 963
									var29 = true; // L: 964
								}

								if (var31) { // L: 966
									field2716[var43] = var44; // L: 967
									field2731[var43] = var47; // L: 968
									field2760[var43] = var46; // L: 969
								}
							}

							try {
								this.draw0(var29, var38, this.isSingleTile, var9); // L: 973
							} catch (Exception var49) { // L: 975
							}

						}
					}
				}
			}
		}
	} // L: 976
}
