import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("aw")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ai")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field2986;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field3050;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field2988;
	@ObfuscatedName("bn")
	static boolean[] field3021;
	@ObfuscatedName("br")
	static boolean[] field3008;
	@ObfuscatedName("bp")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bf")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bg")
	static float[] field3013;
	@ObfuscatedName("be")
	static int[] field3026;
	@ObfuscatedName("bc")
	static int[] field3036;
	@ObfuscatedName("bz")
	static int[] field2987;
	@ObfuscatedName("bh")
	static int[] field3029;
	@ObfuscatedName("bj")
	static char[] field3031;
	@ObfuscatedName("bl")
	static char[][] field3032;
	@ObfuscatedName("bx")
	static int[] field3033;
	@ObfuscatedName("cs")
	static int[][] field3003;
	@ObfuscatedName("ch")
	static int[] field3035;
	@ObfuscatedName("co")
	static int[] field3040;
	@ObfuscatedName("cd")
	static int[] field3037;
	@ObfuscatedName("cg")
	static int[] field3038;
	@ObfuscatedName("cn")
	static int[] field3039;
	@ObfuscatedName("cz")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("ci")
	static int[] field3022;
	@ObfuscatedName("cl")
	static float[] field3041;
	@ObfuscatedName("cm")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cx")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cw")
	static boolean field3045;
	@ObfuscatedName("ce")
	static int[] field3049;
	@ObfuscatedName("cv")
	static int[] field3052;
	@ObfuscatedName("cj")
	static int[] field3009;
	@ObfuscatedName("ct")
	static int[] field3018;
	@ObfuscatedName("cp")
	static final float field3019;
	@ObfuscatedName("az")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ao")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("au")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ak")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ah")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("aj")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("af")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ax")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("an")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ag")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("am")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ad")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("at")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ay")
	byte[] field2990;
	@ObfuscatedName("ae")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ac")
	public byte field2991;
	@ObfuscatedName("ab")
	public int field3028;
	@ObfuscatedName("av")
	int[] field3006;
	@ObfuscatedName("ap")
	int[] field3007;
	@ObfuscatedName("bu")
	int[] field2999;
	@ObfuscatedName("bo")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bd")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bi")
	int[][] field3011;
	@ObfuscatedName("bq")
	int[][] field3012;
	@ObfuscatedName("ba")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bt")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bk")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bm")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bw")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bv")
	@Export("radius")
	int radius;
	@ObfuscatedName("by")
	HashMap field3005;
	@ObfuscatedName("cc")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cb")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cq")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cf")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cr")
	public short field3059;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2986 = new class469(); // L: 17
		field3050 = new class469(); // L: 18
		field2988 = new class469(); // L: 19
		field3021 = new boolean[6500]; // L: 55
		field3008 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field3013 = new float[6500]; // L: 59
		field3026 = new int[6500]; // L: 60
		field3036 = new int[6500]; // L: 61
		field2987 = new int[6500]; // L: 62
		field3029 = new int[6500]; // L: 63
		field3031 = new char[6000]; // L: 65
		field3032 = new char[6000][512]; // L: 66
		field3033 = new int[12]; // L: 67
		field3003 = new int[12][2000]; // L: 68
		field3035 = new int[2000]; // L: 69
		field3040 = new int[2000]; // L: 70
		field3037 = new int[12]; // L: 71
		field3038 = new int[10]; // L: 72
		field3039 = new int[10]; // L: 73
		field3022 = new int[10]; // L: 74
		field3041 = new float[10]; // L: 75
		field3045 = true; // L: 79
		field3049 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field3052 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field3009 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field3018 = Rasterizer3D.field2817; // L: 85
		field3019 = ClanSettings.method3332(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2991 = 0;
		this.field3028 = 0;
		this.isSingleTile = false;
		this.field3005 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2991 = 0;
		this.field3028 = 0;
		this.isSingleTile = false;
		this.field3005 = new HashMap();
		this.method5681(var1, var2, var3); // L: 121
		this.field2991 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field3028 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Lkz;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2991 = 0; // L: 35
		this.field3028 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field3005 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field3028 = 0; // L: 100
		this.field2991 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field3028 += var4.field3028; // L: 107
				if (this.field2991 == -1) { // L: 108
					this.field2991 = var4.field2991;
				}
			}
		}

		this.method5681(this.verticesCount, this.indicesCount, this.field3028); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field3028 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method5683(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("aq")
	void method5681(int var1, int var2, int var3) {
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
			this.field3006 = new int[var3]; // L: 139
			this.field3007 = new int[var3]; // L: 140
			this.field2999 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	void method5682(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2991 != var1.field2991)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2991); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2990 == null && var1.field2990 != null) { // L: 159
			this.field2990 = new byte[var2]; // L: 160
			Arrays.fill(this.field2990, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	public void method5683(Model var1) {
		if (var1 != null) { // L: 166
			this.method5682(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2991; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2990 != null) { // L: 186
					if (var1.field2990 != null && var1.field2990[var2] != -1) { // L: 187
						this.field2990[this.indicesCount] = (byte)(var1.field2990[var2] + this.field3028); // L: 188
					} else {
						this.field2990[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field3028; ++var2) { // L: 196
				this.field3006[this.field3028] = this.verticesCount + var1.field3006[var2]; // L: 197
				this.field3007[this.field3028] = this.verticesCount + var1.field3007[var2]; // L: 198
				this.field2999[this.field3028] = this.verticesCount + var1.field2999[var2]; // L: 199
				++this.field3028; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lkz;"
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
					var11.field3028 = this.field3028; // L: 227
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
					var11.field2990 = this.field2990; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2991 = this.field2991; // L: 240
					var11.field3006 = this.field3006; // L: 241
					var11.field3007 = this.field3007; // L: 242
					var11.field2999 = this.field2999; // L: 243
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Z)Lkz;"
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
		descriptor = "(Z)Lkz;"
	)
	public Model method5704(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZLkz;[B)Lkz;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field3028 = this.field3028; // L: 300
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
		var2.field2990 = this.field2990; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2991 = this.field2991; // L: 330
		var2.field3006 = this.field3006; // L: 331
		var2.field3007 = this.field3007; // L: 332
		var2.field2999 = this.field2999; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field3011 = this.field3011; // L: 336
		var2.field3012 = this.field3012; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("ah")
	void method5713(int var1) {
		if (!this.field3005.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field3052[var1]; // L: 352
			int var9 = field3049[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var12 = this.verticesX[var10]; // L: 356
				int var13 = this.verticesZ[var10]; // L: 357
				int var11 = var12 * var8 + var9 * var13 >> 16; // L: 359
				int var15 = this.verticesY[var10]; // L: 362
				int var16 = class224.method4378(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 363
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

			class276 var17 = new class276((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 371
			boolean var18 = true; // L: 372
			if (var17.field2916 < 32) { // L: 373
				var17.field2916 = 32;
			}

			if (var17.field2918 < 32) { // L: 374
				var17.field2918 = 32;
			}

			if (this.isSingleTile) { // L: 375
				boolean var19 = true; // L: 376
				var17.field2916 += 8; // L: 377
				var17.field2918 += 8; // L: 378
			}

			this.field3005.put(var1, var17); // L: 380
		}
	} // L: 381

	@ObfuscatedName("aj")
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

	@ObfuscatedName("af")
	void method5707() {
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

	@ObfuscatedName("ax")
	public int method5710() {
		this.calculateBoundsCylinder(); // L: 420
		return this.xzRadius; // L: 421
	}

	@ObfuscatedName("an")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 425
		this.field3005.clear(); // L: 426
	} // L: 427

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V"
	)
	public void method5694(class140 var1, int var2) {
		Skeleton var3 = var1.field1635; // L: 445
		class272 var4 = var3.method5414(); // L: 446
		if (var4 != null) { // L: 447
			var3.method5414().method5350(var1, var2); // L: 448
			this.method5696(var3.method5414(), var1.method3155()); // L: 449
		}

		if (var1.method3156()) { // L: 451
			this.method5695(var1, var2); // L: 452
		}

		this.resetBounds(); // L: 454
	} // L: 455

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V"
	)
	void method5695(class140 var1, int var2) {
		Skeleton var3 = var1.field1635; // L: 458

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 459
			int var5 = var3.transformTypes[var4]; // L: 460
			if (var5 == 5 && var1.field1632 != null && var1.field1632[var4] != null && var1.field1632[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 461 462
				class132 var6 = var1.field1632[var4][0]; // L: 463
				int[] var7 = var3.labels[var4]; // L: 464
				int var8 = var7.length; // L: 465

				for (int var9 = 0; var9 < var8; ++var9) { // L: 466
					int var10 = var7[var9]; // L: 467
					if (var10 < this.faceLabelsAlpha.length) { // L: 468
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 469

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 470
							int var13 = var11[var12]; // L: 471
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3085(var2) * 255.0F); // L: 472
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
		descriptor = "(Lkn;I)V"
	)
	void method5696(class272 var1, int var2) {
		this.method5777(var1, var2); // L: 486
	} // L: 488

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lks;ILks;I[I)V"
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
		descriptor = "(Lku;Lfc;I[ZZZ)V"
	)
	public void method5698(Skeleton var1, class140 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class272 var7 = var1.method5414(); // L: 523
		if (var7 != null) { // L: 524
			var7.method5353(var2, var3, var4, var5); // L: 525
			if (var6) { // L: 526
				this.method5696(var7, var2.method3155()); // L: 527
			}
		}

		if (!var5 && var2.method3156()) { // L: 530
			this.method5695(var2, var3); // L: 531
		}

	} // L: 533

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lks;I[IZ)V"
	)
	public void method5699(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ab")
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
								var15 = field3049[var14]; // L: 620
								var16 = field3052[var14]; // L: 621
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 622
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 623
								this.verticesX[var11] = var17; // L: 624
							}

							if (var12 != 0) { // L: 626
								var15 = field3049[var12]; // L: 627
								var16 = field3052[var12]; // L: 628
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 629
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 630
								this.verticesY[var11] = var17; // L: 631
							}

							if (var13 != 0) { // L: 633
								var15 = field3049[var13]; // L: 634
								var16 = field3052[var13]; // L: 635
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

	@ObfuscatedName("av")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 690
			int var2 = this.verticesX[var1]; // L: 691
			this.verticesX[var1] = this.verticesZ[var1]; // L: 692
			this.verticesZ[var1] = -var2; // L: 693
		}

		this.resetBounds(); // L: 695
	} // L: 696

	@ObfuscatedName("ap")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 699
			this.verticesX[var1] = -this.verticesX[var1]; // L: 700
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 701
		}

		this.resetBounds(); // L: 703
	} // L: 704

	@ObfuscatedName("bu")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 707
			int var2 = this.verticesZ[var1]; // L: 708
			this.verticesZ[var1] = this.verticesX[var1]; // L: 709
			this.verticesX[var1] = -var2; // L: 710
		}

		this.resetBounds(); // L: 712
	} // L: 713

	@ObfuscatedName("bo")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field3049[var1]; // L: 716
		int var3 = field3052[var1]; // L: 717

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 718
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 719
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 720
			this.verticesY[var4] = var5; // L: 721
		}

		this.resetBounds(); // L: 723
	} // L: 724

	@ObfuscatedName("bd")
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

	@ObfuscatedName("bi")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 736
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 737
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 738
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 739
		}

		this.resetBounds(); // L: 741
	} // L: 742

	@ObfuscatedName("bq")
	public final void method5782(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 745
			this.method5707();
		}

		int var8 = Rasterizer3D.method5283(); // L: 746
		int var9 = Rasterizer3D.method5299(); // L: 747
		int var10 = field3049[var1]; // L: 748
		int var11 = field3052[var1]; // L: 749
		int var12 = field3049[var2]; // L: 750
		int var13 = field3052[var2]; // L: 751
		int var14 = field3049[var3]; // L: 752
		int var15 = field3052[var3]; // L: 753
		int var16 = field3049[var4]; // L: 754
		int var17 = field3052[var4]; // L: 755
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
			field3026[var19] = var22 - var18; // L: 782
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method5302() / var22; // L: 783
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method5302() / var22; // L: 784
			field3013[var19] = ClanSettings.method3332(var22); // L: 785
			if (this.field3028 > 0) { // L: 786
				field3036[var19] = var20; // L: 787
				field2987[var19] = var23; // L: 788
				field3029[var19] = var22; // L: 789
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 793
		} catch (Exception var25) { // L: 795
		}

	} // L: 796

	@ObfuscatedName("ba")
	public final void method5708(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 799
			this.method5707();
		}

		int var9 = Rasterizer3D.method5283(); // L: 800
		int var10 = Rasterizer3D.method5299(); // L: 801
		int var11 = field3049[var1]; // L: 802
		int var12 = field3052[var1]; // L: 803
		int var13 = field3049[var2]; // L: 804
		int var14 = field3052[var2]; // L: 805
		int var15 = field3049[var3]; // L: 806
		int var16 = field3052[var3]; // L: 807
		int var17 = field3049[var4]; // L: 808
		int var18 = field3052[var4]; // L: 809
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
			field3026[var20] = var23 - var19; // L: 836
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method5302() / var8; // L: 837
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method5302() / var8; // L: 838
			field3013[var20] = ClanSettings.method3332(var8); // L: 839
			if (this.field3028 > 0) { // L: 840
				field3036[var20] = var21; // L: 841
				field2987[var20] = var24; // L: 842
				field3029[var20] = var23; // L: 843
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 847
		} catch (Exception var26) { // L: 849
		}

	} // L: 850

	@ObfuscatedName("bt")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1073
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1074
				field3031[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1075

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1076
				if (this.faceColors3[var7] != -2) { // L: 1077
					var8 = this.indices1[var7]; // L: 1078
					var9 = this.indices2[var7]; // L: 1079
					var10 = this.indices3[var7]; // L: 1080
					var11 = modelViewportXs[var8]; // L: 1081
					var12 = modelViewportXs[var9]; // L: 1082
					var28 = modelViewportXs[var10]; // L: 1083
					int var29;
					if (var1 && (var11 == -5000 || var12 == -5000 || var28 == -5000)) { // L: 1084
						var29 = field3036[var8]; // L: 1085
						var15 = field3036[var9]; // L: 1086
						var16 = field3036[var10]; // L: 1087
						int var30 = field2987[var8]; // L: 1088
						var18 = field2987[var9]; // L: 1089
						int var19 = field2987[var10]; // L: 1090
						int var20 = field3029[var8]; // L: 1091
						int var21 = field3029[var9]; // L: 1092
						int var22 = field3029[var10]; // L: 1093
						var29 -= var15; // L: 1094
						var16 -= var15; // L: 1095
						var30 -= var18; // L: 1096
						var19 -= var18; // L: 1097
						var20 -= var21; // L: 1098
						var22 -= var21; // L: 1099
						int var23 = var30 * var22 - var20 * var19; // L: 1100
						int var24 = var20 * var16 - var29 * var22; // L: 1101
						int var25 = var29 * var19 - var30 * var16; // L: 1102
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1103
							field3008[var7] = true; // L: 1104
							int var26 = (field3026[var8] + field3026[var9] + field3026[var10]) / 3 + this.radius; // L: 1105
							field3032[var26][field3031[var26]++] = var7; // L: 1106
						}
					} else {
						if (var2 && ObjectSound.method1954(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1110
							class152.method3290(var4); // L: 1111
							var2 = false; // L: 1112
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1114
							field3008[var7] = false; // L: 1115
							var29 = Rasterizer3D.method5290(); // L: 1116
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1117
								field3021[var7] = false; // L: 1118
							} else {
								field3021[var7] = true;
							}

							var15 = (field3026[var8] + field3026[var9] + field3026[var10]) / 3 + this.radius; // L: 1119
							field3032[var15][field3031[var15]++] = var7; // L: 1120
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) { // L: 1124
				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1125
					var32 = field3031[var31]; // L: 1126
					if (var32 > 0) { // L: 1127
						var27 = field3032[var31]; // L: 1128

						for (var10 = 0; var10 < var32; ++var10) { // L: 1129
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) { // L: 1134
					field3033[var31] = 0; // L: 1135
					field3037[var31] = 0; // L: 1136
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) { // L: 1138
					var32 = field3031[var31]; // L: 1139
					if (var32 > 0) { // L: 1140
						var27 = field3032[var31]; // L: 1141

						for (var10 = 0; var10 < var32; ++var10) { // L: 1142
							char var33 = var27[var10]; // L: 1143
							byte var34 = this.faceRenderPriorities[var33]; // L: 1144
							var28 = field3033[var34]++; // L: 1145
							field3003[var34][var28] = var33; // L: 1146
							if (var34 < 10) { // L: 1147
								int[] var35 = field3037;
								var35[var34] += var31;
							} else if (var34 == 10) { // L: 1148
								field3035[var28] = var31;
							} else {
								field3040[var28] = var31; // L: 1149
							}
						}
					}
				}

				var31 = 0; // L: 1153
				if (field3033[1] > 0 || field3033[2] > 0) { // L: 1154
					var31 = (field3037[1] + field3037[2]) / (field3033[1] + field3033[2]);
				}

				var8 = 0; // L: 1155
				if (field3033[3] > 0 || field3033[4] > 0) { // L: 1156
					var8 = (field3037[3] + field3037[4]) / (field3033[3] + field3033[4]);
				}

				var9 = 0; // L: 1157
				if (field3033[6] > 0 || field3033[8] > 0) { // L: 1158
					var9 = (field3037[8] + field3037[6]) / (field3033[8] + field3033[6]);
				}

				var11 = 0; // L: 1160
				var12 = field3033[10]; // L: 1161
				int[] var13 = field3003[10]; // L: 1162
				int[] var14 = field3035; // L: 1163
				if (var11 == var12) { // L: 1164
					var11 = 0; // L: 1165
					var12 = field3033[11]; // L: 1166
					var13 = field3003[11]; // L: 1167
					var14 = field3040; // L: 1168
				}

				if (var11 < var12) { // L: 1170
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1171
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1172
					while (var15 == 0 && var10 > var31) { // L: 1173
						this.drawFace(var13[var11++]); // L: 1174
						if (var11 == var12 && var13 != field3003[11]) { // L: 1175
							var11 = 0; // L: 1176
							var12 = field3033[11]; // L: 1177
							var13 = field3003[11]; // L: 1178
							var14 = field3040; // L: 1179
						}

						if (var11 < var12) { // L: 1181
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1182
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1184
						this.drawFace(var13[var11++]); // L: 1185
						if (var11 == var12 && var13 != field3003[11]) { // L: 1186
							var11 = 0; // L: 1187
							var12 = field3033[11]; // L: 1188
							var13 = field3003[11]; // L: 1189
							var14 = field3040; // L: 1190
						}

						if (var11 < var12) { // L: 1192
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1193
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1195
						this.drawFace(var13[var11++]); // L: 1196
						if (var11 == var12 && var13 != field3003[11]) { // L: 1197
							var11 = 0; // L: 1198
							var12 = field3033[11]; // L: 1199
							var13 = field3003[11]; // L: 1200
							var14 = field3040; // L: 1201
						}

						if (var11 < var12) { // L: 1203
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1204
						}
					}

					var16 = field3033[var15]; // L: 1206
					int[] var17 = field3003[var15]; // L: 1207

					for (var18 = 0; var18 < var16; ++var18) { // L: 1208
						this.drawFace(var17[var18]); // L: 1209
					}
				}

				while (var10 != -1000) { // L: 1212
					this.drawFace(var13[var11++]); // L: 1213
					if (var11 == var12 && var13 != field3003[11]) { // L: 1214
						var11 = 0; // L: 1215
						var13 = field3003[11]; // L: 1216
						var12 = field3033[11]; // L: 1217
						var14 = field3040; // L: 1218
					}

					if (var11 < var12) { // L: 1220
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1221
					}
				}

			}
		}
	} // L: 1132 1223

	@ObfuscatedName("bk")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field3008[var1]) { // L: 1226
			this.method5714(var1); // L: 1227
		} else {
			int var2 = this.indices1[var1]; // L: 1230
			int var3 = this.indices2[var1]; // L: 1231
			int var4 = this.indices3[var1]; // L: 1232
			Rasterizer3D.field2820.field3098 = field3021[var1]; // L: 1233
			if (this.faceAlphas == null) { // L: 1234
				Rasterizer3D.field2820.field3086 = 0; // L: 1235
			} else {
				Rasterizer3D.field2820.field3086 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1238
			}

			this.method5689(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field3013[var2], field3013[var3], field3013[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1240
		}
	} // L: 1228 1241

	@ObfuscatedName("bm")
	boolean method5712(int var1) {
		return this.overrideAmount > 0 && var1 < this.field3059; // L: 1244
	}

	@ObfuscatedName("bw")
	final void method5689(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1248
			int var15;
			int var16;
			int var18;
			if (this.field2990 != null && this.field2990[var1] != -1) { // L: 1267
				int var17 = this.field2990[var1] & 255; // L: 1268
				var18 = this.field3006[var17]; // L: 1269
				var15 = this.field3007[var17]; // L: 1270
				var16 = this.field2999[var17]; // L: 1271
			} else {
				var18 = this.indices1[var1]; // L: 1274
				var15 = this.indices2[var1]; // L: 1275
				var16 = this.indices3[var1]; // L: 1276
			}

			if (this.faceColors3[var1] == -1) { // L: 1278
				Rasterizer3D.method5285(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3036[var18], field3036[var15], field3036[var16], field2987[var18], field2987[var15], field2987[var16], field3029[var18], field3029[var15], field3029[var16], this.faceTextures[var1]); // L: 1279
			} else {
				Rasterizer3D.method5285(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3036[var18], field3036[var15], field3036[var16], field2987[var18], field2987[var15], field2987[var16], field3029[var18], field3029[var15], field3029[var16], this.faceTextures[var1]); // L: 1282
			}
		} else {
			boolean var14 = this.method5712(var1); // L: 1249
			if (this.faceColors3[var1] == -1 && var14) { // L: 1250
				Rasterizer3D.method5284(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3009[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1251
			} else if (this.faceColors3[var1] == -1) { // L: 1253
				Rasterizer3D.method5306(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3009[this.faceColors1[var1]]); // L: 1254
			} else if (var14) { // L: 1256
				Rasterizer3D.method5301(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1257
			} else {
				Rasterizer3D.method5297(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1260
			}
		}

	} // L: 1285

	@ObfuscatedName("bv")
	final void method5714(int var1) {
		int var2 = Rasterizer3D.method5283(); // L: 1288
		int var3 = Rasterizer3D.method5299(); // L: 1289
		int var4 = 0; // L: 1290
		int var5 = this.indices1[var1]; // L: 1291
		int var6 = this.indices2[var1]; // L: 1292
		int var7 = this.indices3[var1]; // L: 1293
		int var8 = field3029[var5]; // L: 1294
		int var9 = field3029[var6]; // L: 1295
		int var10 = field3029[var7]; // L: 1296
		if (this.faceAlphas == null) { // L: 1297
			Rasterizer3D.field2820.field3086 = 0;
		} else {
			Rasterizer3D.field2820.field3086 = this.faceAlphas[var1] & 255; // L: 1298
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1299
			field3038[var4] = modelViewportXs[var5]; // L: 1300
			field3039[var4] = modelViewportYs[var5]; // L: 1301
			field3041[var4] = field3013[var7]; // L: 1302
			field3022[var4++] = this.faceColors1[var1]; // L: 1303
		} else {
			var11 = field3036[var5]; // L: 1306
			var12 = field2987[var5]; // L: 1307
			var13 = this.faceColors1[var1]; // L: 1308
			if (var10 >= 50) { // L: 1309
				var14 = field3018[var10 - var8] * (50 - var8); // L: 1310
				field3038[var4] = var2 + (var11 + ((field3036[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1311
				field3039[var4] = var3 + (var12 + ((field2987[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1312
				field3041[var4] = field3019; // L: 1313
				field3022[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1314
			}

			if (var9 >= 50) { // L: 1316
				var14 = field3018[var9 - var8] * (50 - var8); // L: 1317
				field3038[var4] = var2 + (var11 + ((field3036[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1318
				field3039[var4] = var3 + (var12 + ((field2987[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1319
				field3041[var4] = field3019; // L: 1320
				field3022[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1321
			}
		}

		if (var9 >= 50) { // L: 1324
			field3038[var4] = modelViewportXs[var6]; // L: 1325
			field3039[var4] = modelViewportYs[var6]; // L: 1326
			field3041[var4] = field3013[var7]; // L: 1327
			field3022[var4++] = this.faceColors2[var1]; // L: 1328
		} else {
			var11 = field3036[var6]; // L: 1331
			var12 = field2987[var6]; // L: 1332
			var13 = this.faceColors2[var1]; // L: 1333
			if (var8 >= 50) { // L: 1334
				var14 = field3018[var8 - var9] * (50 - var9); // L: 1335
				field3038[var4] = var2 + (var11 + ((field3036[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1336
				field3039[var4] = var3 + (var12 + ((field2987[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1337
				field3041[var4] = field3019; // L: 1338
				field3022[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1339
			}

			if (var10 >= 50) { // L: 1341
				var14 = field3018[var10 - var9] * (50 - var9); // L: 1342
				field3038[var4] = var2 + (var11 + ((field3036[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1343
				field3039[var4] = var3 + (var12 + ((field2987[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1344
				field3022[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1345
			}
		}

		if (var10 >= 50) { // L: 1348
			field3038[var4] = modelViewportXs[var7]; // L: 1349
			field3039[var4] = modelViewportYs[var7]; // L: 1350
			field3041[var4] = field3013[var7]; // L: 1351
			field3022[var4++] = this.faceColors3[var1]; // L: 1352
		} else {
			var11 = field3036[var7]; // L: 1355
			var12 = field2987[var7]; // L: 1356
			var13 = this.faceColors3[var1]; // L: 1357
			if (var9 >= 50) { // L: 1358
				var14 = field3018[var9 - var10] * (50 - var10); // L: 1359
				field3038[var4] = var2 + (var11 + ((field3036[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1360
				field3039[var4] = var3 + (var12 + ((field2987[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1361
				field3041[var4] = field3019; // L: 1362
				field3022[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1363
			}

			if (var8 >= 50) { // L: 1365
				var14 = field3018[var8 - var10] * (50 - var10); // L: 1366
				field3038[var4] = var2 + (var11 + ((field3036[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1367
				field3039[var4] = var3 + (var12 + ((field2987[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5302() / 50; // L: 1368
				field3041[var4] = field3019; // L: 1369
				field3022[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1370
			}
		}

		var11 = field3038[0]; // L: 1373
		var12 = field3038[1]; // L: 1374
		var13 = field3038[2]; // L: 1375
		var14 = field3039[0]; // L: 1376
		int var15 = field3039[1]; // L: 1377
		int var16 = field3039[2]; // L: 1378
		float var17 = field3041[0]; // L: 1379
		float var18 = field3041[1]; // L: 1380
		float var19 = field3041[2]; // L: 1381
		Rasterizer3D.field2820.field3098 = false; // L: 1382
		int var20 = Rasterizer3D.method5290(); // L: 1383
		if (var4 == 3) { // L: 1384
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1385
				Rasterizer3D.field2820.field3098 = true;
			}

			this.method5689(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2]); // L: 1386
		}

		if (var4 == 4) { // L: 1388
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3038[3] < 0 || field3038[3] > var20) { // L: 1389
				Rasterizer3D.field2820.field3098 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1390
				int var23;
				int var25;
				if (this.field2990 != null && this.field2990[var1] != -1) { // L: 1415
					int var24 = this.field2990[var1] & 255; // L: 1416
					var25 = this.field3006[var24]; // L: 1417
					var22 = this.field3007[var24]; // L: 1418
					var23 = this.field2999[var24]; // L: 1419
				} else {
					var25 = var5; // L: 1422
					var22 = var6; // L: 1423
					var23 = var7; // L: 1424
				}

				short var26 = this.faceTextures[var1]; // L: 1426
				if (this.faceColors3[var1] == -1) { // L: 1427
					Rasterizer3D.method5285(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26); // L: 1428
					Rasterizer3D.method5285(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26); // L: 1429
				} else {
					Rasterizer3D.method5285(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26); // L: 1432
					Rasterizer3D.method5285(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], field3022[0], field3022[2], field3022[3], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26); // L: 1433
				}
			} else {
				boolean var21 = this.method5712(var1); // L: 1391
				if (this.faceColors3[var1] == -1 && var21) { // L: 1392
					var22 = field3009[this.faceColors1[var1]]; // L: 1393
					Rasterizer3D.method5284(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1394
					Rasterizer3D.method5284(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1395
				} else if (this.faceColors3[var1] == -1) { // L: 1397
					var22 = field3009[this.faceColors1[var1]]; // L: 1398
					Rasterizer3D.method5306(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1399
					Rasterizer3D.method5306(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], var22); // L: 1400
				} else if (var21) { // L: 1402
					Rasterizer3D.method5301(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1403
					Rasterizer3D.method5301(var14, var16, field3039[3], var11, var13, field3038[3], 0.0F, 0.0F, 0.0F, field3022[0], field3022[2], field3022[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1404
				} else {
					Rasterizer3D.method5297(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2]); // L: 1407
					Rasterizer3D.method5297(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], field3022[0], field3022[2], field3022[3]); // L: 1408
				}
			}
		}

	} // L: 1437

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILsr;)V"
	)
	void method5715(int var1, class469 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1440
		float var4 = (float)(-this.verticesY[var1]); // L: 1441
		float var5 = (float)(-this.verticesZ[var1]); // L: 1442
		float var6 = 1.0F; // L: 1443
		this.verticesX[var1] = (int)(var2.field4843[0] * var3 + var2.field4843[4] * var4 + var2.field4843[8] * var5 + var2.field4843[12] * var6); // L: 1444
		this.verticesY[var1] = -((int)(var2.field4843[1] * var3 + var2.field4843[5] * var4 + var2.field4843[9] * var5 + var2.field4843[13] * var6)); // L: 1445
		this.verticesZ[var1] = -((int)(var2.field4843[2] * var3 + var2.field4843[6] * var4 + var2.field4843[10] * var5 + var2.field4843[14] * var6)); // L: 1446
	} // L: 1447

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V"
	)
	void method5777(class272 var1, int var2) {
		if (this.field3011 != null) { // L: 1450
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1451
				int[] var4 = this.field3011[var3]; // L: 1452
				if (var4 != null && var4.length != 0) { // L: 1453
					int[] var5 = this.field3012[var3]; // L: 1454
					field2986.method8656(); // L: 1455

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1456
						int var7 = var4[var6]; // L: 1457
						class129 var8 = var1.method5358(var7); // L: 1458
						if (var8 != null) { // L: 1459
							field3050.method8630((float)var5[var6] / 255.0F); // L: 1460
							field2988.method8629(var8.method3060(var2)); // L: 1461
							field2988.method8633(field3050); // L: 1462
							field2986.method8657(field2988); // L: 1463
						}
					}

					this.method5715(var3, field2986); // L: 1465
				}
			}

		}
	} // L: 1467

	@ObfuscatedName("de")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 853
			this.calculateBoundsCylinder();
		}

		this.method5713(var1); // L: 854
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 855
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 856
		int var13 = var3 * this.xzRadius >> 16; // L: 857
		int var14 = var12 + var13; // L: 858
		if (var14 > 50 && var12 < 3500) { // L: 859
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 860
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method5302(); // L: 861
			if (var16 / var14 < Rasterizer3D.method5336()) { // L: 862
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method5302(); // L: 863
				if (var17 / var14 > Rasterizer3D.method5298()) { // L: 864
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 865
					int var19 = var2 * this.xzRadius >> 16; // L: 866
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 867
					int var21 = (var18 + var20) * Rasterizer3D.method5302(); // L: 868
					if (var21 / var14 > Rasterizer3D.method5288()) { // L: 869
						int var22 = (var3 * super.height >> 16) + var19; // L: 870
						int var23 = (var18 - var22) * Rasterizer3D.method5302(); // L: 871
						if (var23 / var14 < Rasterizer3D.method5287()) { // L: 872
							int var24 = var13 + (var2 * super.height >> 16); // L: 873
							boolean var25 = false; // L: 874
							boolean var26 = false; // L: 875
							if (var12 - var24 <= 50) { // L: 876
								var26 = true;
							}

							boolean var27 = var26 || this.field3028 > 0; // L: 877
							int var28 = InvDefinition.method3541(); // L: 878
							int var29 = class93.method2438(); // L: 879
							boolean var30 = UserComparator8.method2944(); // L: 880
							boolean var31 = 0L != var9 && !class164.method3461(var9); // L: 883
							boolean var33 = false; // L: 886
							int var37;
							int var38;
							int var39;
							int var40;
							int var55;
							int var59;
							int var60;
							int var61;
							if (var31 && var30) { // L: 887
								boolean var34 = false; // L: 888
								if (field3045) { // L: 889
									boolean var35;
									if (!UserComparator8.method2944()) { // L: 893
										var35 = false; // L: 894
									} else {
										int var43;
										int var44;
										int var45;
										int var46;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 898
											var37 = Scene.Scene_cameraPitchSine; // L: 899
											var38 = Scene.Scene_cameraPitchCosine; // L: 900
											var39 = Scene.Scene_cameraYawSine; // L: 901
											var40 = Scene.Scene_cameraYawCosine; // L: 902
											byte var41 = 50; // L: 903
											short var42 = 3500; // L: 904
											var43 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5283()) * var41 / Rasterizer3D.method5302(); // L: 905
											var44 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5299()) * var41 / Rasterizer3D.method5302(); // L: 906
											var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5283()) * var42 / Rasterizer3D.method5302(); // L: 907
											var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5299()) * var42 / Rasterizer3D.method5302(); // L: 908
											int var48 = var41 * var37 + var38 * var44 >> 16; // L: 912
											int var49 = var41 * var38 - var37 * var44 >> 16; // L: 917
											int var50 = var38 * var46 + var42 * var37 >> 16; // L: 923
											int var51 = var38 * var42 - var46 * var37 >> 16; // L: 928
											int var52 = var43 * var40 - var39 * var49 >> 16; // L: 934
											var60 = class17.method210(var43, var49, var40, var39); // L: 937
											int var53 = var40 * var45 - var39 * var51 >> 16; // L: 941
											var61 = class17.method210(var45, var51, var40, var39); // L: 944
											ViewportMouse.field3064 = (var53 + var52) / 2; // L: 946
											class19.field90 = (var48 + var50) / 2; // L: 947
											class73.field921 = (var61 + var60) / 2; // L: 948
											class235.field2478 = (var53 - var52) / 2; // L: 949
											BuddyRankComparator.field1480 = (var50 - var48) / 2; // L: 950
											class473.field4870 = (var61 - var60) / 2; // L: 951
											BufferedSink.field4801 = Math.abs(class235.field2478); // L: 952
											FileSystem.field2340 = Math.abs(BuddyRankComparator.field1480); // L: 953
											class7.field21 = Math.abs(class473.field4870); // L: 954
										}

										class276 var54 = (class276)this.field3005.get(var1); // L: 956
										var38 = var54.field2913 + var6; // L: 957
										var39 = var7 + var54.field2917; // L: 958
										var40 = var8 + var54.field2919; // L: 959
										var60 = var54.field2916; // L: 960
										var61 = var54.field2915; // L: 961
										var43 = var54.field2918; // L: 962
										var44 = ViewportMouse.field3064 - var38; // L: 963
										var45 = class19.field90 - var39; // L: 964
										var46 = class73.field921 - var40; // L: 965
										if (Math.abs(var44) > var60 + BufferedSink.field4801) { // L: 966
											var35 = false; // L: 967
										} else if (Math.abs(var45) > var61 + FileSystem.field2340) { // L: 970
											var35 = false; // L: 971
										} else if (Math.abs(var46) > var43 + class7.field21) { // L: 974
											var35 = false; // L: 975
										} else if (Math.abs(var46 * BuddyRankComparator.field1480 - var45 * class473.field4870) > var61 * class7.field21 + var43 * FileSystem.field2340) { // L: 978
											var35 = false; // L: 979
										} else if (Math.abs(var44 * class473.field4870 - var46 * class235.field2478) > var43 * BufferedSink.field4801 + var60 * class7.field21) { // L: 982
											var35 = false; // L: 983
										} else if (Math.abs(var45 * class235.field2478 - var44 * BuddyRankComparator.field1480) > var60 * FileSystem.field2340 + var61 * BufferedSink.field4801) { // L: 986
											var35 = false; // L: 987
										} else {
											var35 = true; // L: 990
										}
									}

									var34 = var35; // L: 992
								} else {
									var59 = var12 - var13; // L: 995
									if (var59 <= 50) { // L: 996
										var59 = 50;
									}

									if (var15 > 0) { // L: 997
										var16 /= var14; // L: 998
										var17 /= var59; // L: 999
									} else {
										var17 /= var14; // L: 1002
										var16 /= var59; // L: 1003
									}

									if (var18 > 0) { // L: 1005
										var23 /= var14; // L: 1006
										var21 /= var59; // L: 1007
									} else {
										var21 /= var14; // L: 1010
										var23 /= var59; // L: 1011
									}

									var55 = var28 - Rasterizer3D.method5283(); // L: 1013
									var37 = var29 - Rasterizer3D.method5299(); // L: 1014
									if (var55 > var16 && var55 < var17 && var37 > var23 && var37 < var21) { // L: 1015
										var34 = true; // L: 1016
									}
								}

								if (var34) { // L: 1019
									if (this.isSingleTile) { // L: 1020
										class152.method3290(var9);
									} else {
										var33 = true; // L: 1021
									}
								}
							}

							int var58 = Rasterizer3D.method5283(); // L: 1024
							var59 = Rasterizer3D.method5299(); // L: 1025
							var55 = 0; // L: 1026
							var37 = 0; // L: 1027
							if (var1 != 0) { // L: 1028
								var55 = field3049[var1]; // L: 1029
								var37 = field3052[var1]; // L: 1030
							}

							for (var38 = 0; var38 < this.verticesCount; ++var38) { // L: 1032
								var39 = this.verticesX[var38]; // L: 1033
								var40 = this.verticesY[var38]; // L: 1034
								var60 = this.verticesZ[var38]; // L: 1035
								if (var1 != 0) { // L: 1036
									var61 = var60 * var55 + var39 * var37 >> 16; // L: 1037
									var60 = var60 * var37 - var39 * var55 >> 16; // L: 1038
									var39 = var61; // L: 1039
								}

								var39 += var6; // L: 1041
								var40 += var7; // L: 1042
								var60 += var8; // L: 1043
								var61 = var60 * var4 + var5 * var39 >> 16; // L: 1044
								var60 = var5 * var60 - var39 * var4 >> 16; // L: 1045
								var39 = var61; // L: 1046
								var61 = var3 * var40 - var60 * var2 >> 16; // L: 1047
								var60 = var40 * var2 + var3 * var60 >> 16; // L: 1048
								field3026[var38] = var60 - var12; // L: 1050
								if (var60 >= 50) { // L: 1051
									modelViewportXs[var38] = var58 + var39 * Rasterizer3D.method5302() / var60; // L: 1052
									modelViewportYs[var38] = var59 + var61 * Rasterizer3D.method5302() / var60; // L: 1053
									field3013[var38] = ClanSettings.method3332(var60); // L: 1054
								} else {
									modelViewportXs[var38] = -5000; // L: 1057
									var25 = true; // L: 1058
								}

								if (var27) { // L: 1060
									field3036[var38] = var39; // L: 1061
									field2987[var38] = var61; // L: 1062
									field3029[var38] = var60; // L: 1063
								}
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9); // L: 1067
							} catch (Exception var57) { // L: 1069
							}

						}
					}
				}
			}
		}
	} // L: 1070
}
