import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ap")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("aj")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static class466 field3031;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static class466 field2976;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static class466 field2977;
	@ObfuscatedName("bv")
	static boolean[] field3028;
	@ObfuscatedName("bm")
	static boolean[] field3011;
	@ObfuscatedName("bq")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bb")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bh")
	static float[] field2987;
	@ObfuscatedName("bw")
	static int[] field3015;
	@ObfuscatedName("bi")
	static int[] field3030;
	@ObfuscatedName("bu")
	static int[] field3018;
	@ObfuscatedName("be")
	static int[] field2989;
	@ObfuscatedName("bl")
	static char[] field3020;
	@ObfuscatedName("bz")
	static char[][] field3022;
	@ObfuscatedName("bo")
	static int[] field2972;
	@ObfuscatedName("cg")
	static int[][] field3010;
	@ObfuscatedName("cb")
	static int[] field3024;
	@ObfuscatedName("ci")
	static int[] field3025;
	@ObfuscatedName("cv")
	static int[] field3026;
	@ObfuscatedName("ct")
	static int[] field3027;
	@ObfuscatedName("cp")
	static int[] field2971;
	@ObfuscatedName("cq")
	static int[] field3016;
	@ObfuscatedName("cl")
	static float[] field3014;
	@ObfuscatedName("cs")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cc")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cd")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cu")
	static boolean field3034;
	@ObfuscatedName("cn")
	static int[] field3037;
	@ObfuscatedName("ch")
	static int[] field3038;
	@ObfuscatedName("cr")
	static int[] field3042;
	@ObfuscatedName("ce")
	static int[] field3040;
	@ObfuscatedName("cm")
	static final float field2975;
	@ObfuscatedName("ao")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ae")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("aa")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("au")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("an")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ad")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ax")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("aw")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("az")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("av")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ak")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ay")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("as")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ab")
	byte[] field2991;
	@ObfuscatedName("ah")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ai")
	public byte field2993;
	@ObfuscatedName("ac")
	public int field3043;
	@ObfuscatedName("al")
	int[] field3039;
	@ObfuscatedName("at")
	int[] field2996;
	@ObfuscatedName("bj")
	int[] field2997;
	@ObfuscatedName("bd")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bg")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bt")
	int[][] field3000;
	@ObfuscatedName("br")
	int[][] field3001;
	@ObfuscatedName("ba")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bk")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bn")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("by")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bc")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bx")
	@Export("radius")
	int radius;
	@ObfuscatedName("bf")
	HashMap field3008;
	@ObfuscatedName("cj")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cf")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cw")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cx")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ca")
	public short field2995;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field3031 = new class466(); // L: 17
		field2976 = new class466(); // L: 18
		field2977 = new class466(); // L: 19
		field3028 = new boolean[6500]; // L: 55
		field3011 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2987 = new float[6500]; // L: 59
		field3015 = new int[6500]; // L: 60
		field3030 = new int[6500]; // L: 61
		field3018 = new int[6500]; // L: 62
		field2989 = new int[6500]; // L: 63
		field3020 = new char[6000]; // L: 65
		field3022 = new char[6000][512]; // L: 66
		field2972 = new int[12]; // L: 67
		field3010 = new int[12][2000]; // L: 68
		field3024 = new int[2000]; // L: 69
		field3025 = new int[2000]; // L: 70
		field3026 = new int[12]; // L: 71
		field3027 = new int[10]; // L: 72
		field2971 = new int[10]; // L: 73
		field3016 = new int[10]; // L: 74
		field3014 = new float[10]; // L: 75
		field3034 = true; // L: 79
		field3037 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field3038 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field3042 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field3040 = Rasterizer3D.field2804; // L: 85
		field2975 = SoundSystem.method871(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2993 = 0;
		this.field3043 = 0;
		this.isSingleTile = false;
		this.field3008 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2993 = 0;
		this.field3043 = 0;
		this.isSingleTile = false;
		this.field3008 = new HashMap();
		this.method5657(var1, var2, var3); // L: 121
		this.field2993 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field3043 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Lko;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2993 = 0; // L: 35
		this.field3043 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field3008 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field3043 = 0; // L: 100
		this.field2993 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field3043 += var4.field3043; // L: 107
				if (this.field2993 == -1) { // L: 108
					this.field2993 = var4.field2993;
				}
			}
		}

		this.method5657(this.verticesCount, this.indicesCount, this.field3043); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field3043 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method5635(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("am")
	void method5657(int var1, int var2, int var3) {
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
			this.field3039 = new int[var3]; // L: 139
			this.field2996 = new int[var3]; // L: 140
			this.field2997 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	void method5636(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2993 != var1.field2993)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2993); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2991 == null && var1.field2991 != null) { // L: 159
			this.field2991 = new byte[var2]; // L: 160
			Arrays.fill(this.field2991, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	public void method5635(Model var1) {
		if (var1 != null) { // L: 166
			this.method5636(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2993; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2991 != null) { // L: 186
					if (var1.field2991 != null && var1.field2991[var2] != -1) { // L: 187
						this.field2991[this.indicesCount] = (byte)(var1.field2991[var2] + this.field3043); // L: 188
					} else {
						this.field2991[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field3043; ++var2) { // L: 196
				this.field3039[this.field3043] = this.verticesCount + var1.field3039[var2]; // L: 197
				this.field2996[this.field3043] = this.verticesCount + var1.field2996[var2]; // L: 198
				this.field2997[this.field3043] = this.verticesCount + var1.field2997[var2]; // L: 199
				++this.field3043; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lko;"
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
					var11.field3043 = this.field3043; // L: 227
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
					var11.field2991 = this.field2991; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2993 = this.field2993; // L: 240
					var11.field3039 = this.field3039; // L: 241
					var11.field2996 = this.field2996; // L: 242
					var11.field2997 = this.field2997; // L: 243
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
		descriptor = "(Z)Lko;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Z)Lko;"
	)
	public Model method5639(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZLko;[B)Lko;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field3043 = this.field3043; // L: 300
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
		var2.field2991 = this.field2991; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2993 = this.field2993; // L: 330
		var2.field3039 = this.field3039; // L: 331
		var2.field2996 = this.field2996; // L: 332
		var2.field2997 = this.field2997; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field3000 = this.field3000; // L: 336
		var2.field3001 = this.field3001; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("an")
	void method5641(int var1) {
		if (!this.field3008.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field3038[var1]; // L: 352
			int var9 = field3037[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var11 = class351.method6892(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 355
				int var12 = this.verticesY[var10]; // L: 356
				int var14 = this.verticesX[var10]; // L: 358
				int var15 = this.verticesZ[var10]; // L: 359
				int var13 = var8 * var15 - var9 * var14 >> 16; // L: 361
				if (var11 < var2) { // L: 364
					var2 = var11;
				}

				if (var11 > var5) { // L: 365
					var5 = var11;
				}

				if (var12 < var3) { // L: 366
					var3 = var12;
				}

				if (var12 > var6) { // L: 367
					var6 = var12;
				}

				if (var13 < var4) { // L: 368
					var4 = var13;
				}

				if (var13 > var7) { // L: 369
					var7 = var13;
				}
			}

			class274 var17 = new class274((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 371
			boolean var18 = true; // L: 372
			if (var17.field2901 < 32) { // L: 373
				var17.field2901 = 32;
			}

			if (var17.field2898 < 32) { // L: 374
				var17.field2898 = 32;
			}

			if (this.isSingleTile) { // L: 375
				boolean var19 = true; // L: 376
				var17.field2901 += 8; // L: 377
				var17.field2898 += 8; // L: 378
			}

			this.field3008.put(var1, var17); // L: 380
		}
	} // L: 381

	@ObfuscatedName("ad")
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

	@ObfuscatedName("ax")
	void method5697() {
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

	@ObfuscatedName("aw")
	public int method5644() {
		this.calculateBoundsCylinder(); // L: 420
		return this.xzRadius; // L: 421
	}

	@ObfuscatedName("az")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 425
		this.field3008.clear(); // L: 426
	} // L: 427

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)V"
	)
	public void method5749(class138 var1, int var2) {
		Skeleton var3 = var1.field1601; // L: 445
		class270 var4 = var3.method5373(); // L: 446
		if (var4 != null) { // L: 447
			var3.method5373().method5326(var1, var2); // L: 448
			this.method5649(var3.method5373(), var1.method3160()); // L: 449
		}

		if (var1.method3161()) { // L: 451
			this.method5648(var1, var2); // L: 452
		}

		this.resetBounds(); // L: 454
	} // L: 455

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)V"
	)
	void method5648(class138 var1, int var2) {
		Skeleton var3 = var1.field1601; // L: 458

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 459
			int var5 = var3.transformTypes[var4]; // L: 460
			if (var5 == 5 && var1.field1598 != null && var1.field1598[var4] != null && var1.field1598[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 461 462
				class131 var6 = var1.field1598[var4][0]; // L: 463
				int[] var7 = var3.labels[var4]; // L: 464
				int var8 = var7.length; // L: 465

				for (int var9 = 0; var9 < var8; ++var9) { // L: 466
					int var10 = var7[var9]; // L: 467
					if (var10 < this.faceLabelsAlpha.length) { // L: 468
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 469

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 470
							int var13 = var11[var12]; // L: 471
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3086(var2) * 255.0F); // L: 472
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V"
	)
	void method5649(class270 var1, int var2) {
		this.method5669(var1, var2); // L: 486
	} // L: 488

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lky;ILky;I[I)V"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lkr;Lfu;I[ZZZ)V"
	)
	public void method5650(Skeleton var1, class138 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class270 var7 = var1.method5373(); // L: 523
		if (var7 != null) { // L: 524
			var7.method5327(var2, var3, var4, var5); // L: 525
			if (var6) { // L: 526
				this.method5649(var7, var2.method3160()); // L: 527
			}
		}

		if (!var5 && var2.method3161()) { // L: 530
			this.method5648(var2, var3); // L: 531
		}

	} // L: 533

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lky;I[IZ)V"
	)
	public void method5652(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ac")
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
								var15 = field3037[var14]; // L: 620
								var16 = field3038[var14]; // L: 621
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 622
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 623
								this.verticesX[var11] = var17; // L: 624
							}

							if (var12 != 0) { // L: 626
								var15 = field3037[var12]; // L: 627
								var16 = field3038[var12]; // L: 628
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 629
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 630
								this.verticesY[var11] = var17; // L: 631
							}

							if (var13 != 0) { // L: 633
								var15 = field3037[var13]; // L: 634
								var16 = field3038[var13]; // L: 635
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

	@ObfuscatedName("al")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 690
			int var2 = this.verticesX[var1]; // L: 691
			this.verticesX[var1] = this.verticesZ[var1]; // L: 692
			this.verticesZ[var1] = -var2; // L: 693
		}

		this.resetBounds(); // L: 695
	} // L: 696

	@ObfuscatedName("at")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 699
			this.verticesX[var1] = -this.verticesX[var1]; // L: 700
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 701
		}

		this.resetBounds(); // L: 703
	} // L: 704

	@ObfuscatedName("bj")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 707
			int var2 = this.verticesZ[var1]; // L: 708
			this.verticesZ[var1] = this.verticesX[var1]; // L: 709
			this.verticesX[var1] = -var2; // L: 710
		}

		this.resetBounds(); // L: 712
	} // L: 713

	@ObfuscatedName("bd")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field3037[var1]; // L: 716
		int var3 = field3038[var1]; // L: 717

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 718
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 719
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 720
			this.verticesY[var4] = var5; // L: 721
		}

		this.resetBounds(); // L: 723
	} // L: 724

	@ObfuscatedName("bg")
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

	@ObfuscatedName("bt")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 736
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 737
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 738
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 739
		}

		this.resetBounds(); // L: 741
	} // L: 742

	@ObfuscatedName("br")
	public final void method5660(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 745
			this.method5697();
		}

		int var8 = Rasterizer3D.method5269(); // L: 746
		int var9 = Rasterizer3D.method5253(); // L: 747
		int var10 = field3037[var1]; // L: 748
		int var11 = field3038[var1]; // L: 749
		int var12 = field3037[var2]; // L: 750
		int var13 = field3038[var2]; // L: 751
		int var14 = field3037[var3]; // L: 752
		int var15 = field3038[var3]; // L: 753
		int var16 = field3037[var4]; // L: 754
		int var17 = field3038[var4]; // L: 755
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
			field3015[var19] = var22 - var18; // L: 782
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method5320() / var22; // L: 783
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method5320() / var22; // L: 784
			field2987[var19] = SoundSystem.method871(var22); // L: 785
			if (this.field3043 > 0) { // L: 786
				field3030[var19] = var20; // L: 787
				field3018[var19] = var23; // L: 788
				field2989[var19] = var22; // L: 789
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 793
		} catch (Exception var25) { // L: 795
		}

	} // L: 796

	@ObfuscatedName("ba")
	public final void method5661(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 799
			this.method5697();
		}

		int var9 = Rasterizer3D.method5269(); // L: 800
		int var10 = Rasterizer3D.method5253(); // L: 801
		int var11 = field3037[var1]; // L: 802
		int var12 = field3038[var1]; // L: 803
		int var13 = field3037[var2]; // L: 804
		int var14 = field3038[var2]; // L: 805
		int var15 = field3037[var3]; // L: 806
		int var16 = field3038[var3]; // L: 807
		int var17 = field3037[var4]; // L: 808
		int var18 = field3038[var4]; // L: 809
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
			field3015[var20] = var23 - var19; // L: 836
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method5320() / var8; // L: 837
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method5320() / var8; // L: 838
			field2987[var20] = SoundSystem.method871(var8); // L: 839
			if (this.field3043 > 0) { // L: 840
				field3030[var20] = var21; // L: 841
				field3018[var20] = var24; // L: 842
				field2989[var20] = var23; // L: 843
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 847
		} catch (Exception var26) { // L: 849
		}

	} // L: 850

	@ObfuscatedName("bk")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1011
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1012
				field3020[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1013

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1014
				if (this.faceColors3[var7] != -2) { // L: 1015
					var8 = this.indices1[var7]; // L: 1016
					var9 = this.indices2[var7]; // L: 1017
					var10 = this.indices3[var7]; // L: 1018
					var11 = modelViewportXs[var8]; // L: 1019
					var12 = modelViewportXs[var9]; // L: 1020
					var28 = modelViewportXs[var10]; // L: 1021
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1022
						if (var2) { // L: 1048
							var15 = modelViewportYs[var8]; // L: 1050
							var16 = modelViewportYs[var9]; // L: 1051
							var30 = modelViewportYs[var10]; // L: 1052
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 1054
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 1055
								var37 = false; // L: 1056
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1059
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 1060
									var37 = false; // L: 1061
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1064
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1065
										var37 = false; // L: 1066
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1069
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1070
											var37 = false; // L: 1071
										} else {
											var37 = true; // L: 1074
										}
									}
								}
							}

							if (var37) { // L: 1076
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1079
								var2 = false; // L: 1081
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1084
							field3011[var7] = false; // L: 1085
							var29 = Rasterizer3D.method5259(); // L: 1086
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1087
								field3028[var7] = false; // L: 1088
							} else {
								field3028[var7] = true;
							}

							var15 = (field3015[var8] + field3015[var9] + field3015[var10]) / 3 + this.radius; // L: 1089
							field3022[var15][field3020[var15]++] = var7; // L: 1090
						}
					} else {
						var29 = field3030[var8]; // L: 1023
						var15 = field3030[var9]; // L: 1024
						var16 = field3030[var10]; // L: 1025
						var30 = field3018[var8]; // L: 1026
						var18 = field3018[var9]; // L: 1027
						int var19 = field3018[var10]; // L: 1028
						int var20 = field2989[var8]; // L: 1029
						int var21 = field2989[var9]; // L: 1030
						int var22 = field2989[var10]; // L: 1031
						var29 -= var15; // L: 1032
						var16 -= var15; // L: 1033
						var30 -= var18; // L: 1034
						var19 -= var18; // L: 1035
						var20 -= var21; // L: 1036
						var22 -= var21; // L: 1037
						int var23 = var30 * var22 - var20 * var19; // L: 1038
						int var24 = var20 * var16 - var29 * var22; // L: 1039
						int var25 = var29 * var19 - var30 * var16; // L: 1040
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1041
							field3011[var7] = true; // L: 1042
							int var26 = (field3015[var8] + field3015[var9] + field3015[var10]) / 3 + this.radius; // L: 1043
							field3022[var26][field3020[var26]++] = var7; // L: 1044
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1094
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1095
					var34 = field3020[var33]; // L: 1096
					if (var34 > 0) { // L: 1097
						var27 = field3022[var33]; // L: 1098

						for (var10 = 0; var10 < var34; ++var10) { // L: 1099
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1104
					field2972[var33] = 0; // L: 1105
					field3026[var33] = 0; // L: 1106
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1108
					var34 = field3020[var33]; // L: 1109
					if (var34 > 0) { // L: 1110
						var27 = field3022[var33]; // L: 1111

						for (var10 = 0; var10 < var34; ++var10) { // L: 1112
							char var35 = var27[var10]; // L: 1113
							byte var36 = this.faceRenderPriorities[var35]; // L: 1114
							var28 = field2972[var36]++; // L: 1115
							field3010[var36][var28] = var35; // L: 1116
							if (var36 < 10) { // L: 1117
								int[] var38 = field3026;
								var38[var36] += var33;
							} else if (var36 == 10) { // L: 1118
								field3024[var28] = var33;
							} else {
								field3025[var28] = var33; // L: 1119
							}
						}
					}
				}

				var33 = 0; // L: 1123
				if (field2972[1] > 0 || field2972[2] > 0) { // L: 1124
					var33 = (field3026[1] + field3026[2]) / (field2972[1] + field2972[2]);
				}

				var8 = 0; // L: 1125
				if (field2972[3] > 0 || field2972[4] > 0) { // L: 1126
					var8 = (field3026[3] + field3026[4]) / (field2972[3] + field2972[4]);
				}

				var9 = 0; // L: 1127
				if (field2972[6] > 0 || field2972[8] > 0) { // L: 1128
					var9 = (field3026[8] + field3026[6]) / (field2972[8] + field2972[6]);
				}

				var11 = 0; // L: 1130
				var12 = field2972[10]; // L: 1131
				int[] var13 = field3010[10]; // L: 1132
				int[] var14 = field3024; // L: 1133
				if (var11 == var12) { // L: 1134
					var11 = 0; // L: 1135
					var12 = field2972[11]; // L: 1136
					var13 = field3010[11]; // L: 1137
					var14 = field3025; // L: 1138
				}

				if (var11 < var12) { // L: 1140
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1141
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1142
					while (var15 == 0 && var10 > var33) { // L: 1143
						this.drawFace(var13[var11++]); // L: 1144
						if (var11 == var12 && var13 != field3010[11]) { // L: 1145
							var11 = 0; // L: 1146
							var12 = field2972[11]; // L: 1147
							var13 = field3010[11]; // L: 1148
							var14 = field3025; // L: 1149
						}

						if (var11 < var12) { // L: 1151
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1152
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1154
						this.drawFace(var13[var11++]); // L: 1155
						if (var11 == var12 && var13 != field3010[11]) { // L: 1156
							var11 = 0; // L: 1157
							var12 = field2972[11]; // L: 1158
							var13 = field3010[11]; // L: 1159
							var14 = field3025; // L: 1160
						}

						if (var11 < var12) { // L: 1162
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1163
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1165
						this.drawFace(var13[var11++]); // L: 1166
						if (var11 == var12 && var13 != field3010[11]) { // L: 1167
							var11 = 0; // L: 1168
							var12 = field2972[11]; // L: 1169
							var13 = field3010[11]; // L: 1170
							var14 = field3025; // L: 1171
						}

						if (var11 < var12) { // L: 1173
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1174
						}
					}

					var16 = field2972[var15]; // L: 1176
					int[] var17 = field3010[var15]; // L: 1177

					for (var18 = 0; var18 < var16; ++var18) { // L: 1178
						this.drawFace(var17[var18]); // L: 1179
					}
				}

				while (var10 != -1000) { // L: 1182
					this.drawFace(var13[var11++]); // L: 1183
					if (var11 == var12 && var13 != field3010[11]) { // L: 1184
						var11 = 0; // L: 1185
						var13 = field3010[11]; // L: 1186
						var12 = field2972[11]; // L: 1187
						var14 = field3025; // L: 1188
					}

					if (var11 < var12) { // L: 1190
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1191
					}
				}

			}
		}
	} // L: 1102 1193

	@ObfuscatedName("bn")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field3011[var1]) { // L: 1196
			this.method5667(var1); // L: 1197
		} else {
			int var2 = this.indices1[var1]; // L: 1200
			int var3 = this.indices2[var1]; // L: 1201
			int var4 = this.indices3[var1]; // L: 1202
			Rasterizer3D.field2809.field3098 = field3028[var1]; // L: 1203
			if (this.faceAlphas == null) { // L: 1204
				Rasterizer3D.field2809.field3081 = 0; // L: 1205
			} else {
				Rasterizer3D.field2809.field3081 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1208
			}

			this.method5666(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2987[var2], field2987[var3], field2987[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1210
		}
	} // L: 1198 1211

	@ObfuscatedName("by")
	boolean method5665(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2995; // L: 1214
	}

	@ObfuscatedName("bc")
	final void method5666(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1218
			int var15;
			int var16;
			int var18;
			if (this.field2991 != null && this.field2991[var1] != -1) { // L: 1237
				int var17 = this.field2991[var1] & 255; // L: 1238
				var18 = this.field3039[var17]; // L: 1239
				var15 = this.field2996[var17]; // L: 1240
				var16 = this.field2997[var17]; // L: 1241
			} else {
				var18 = this.indices1[var1]; // L: 1244
				var15 = this.indices2[var1]; // L: 1245
				var16 = this.indices3[var1]; // L: 1246
			}

			if (this.faceColors3[var1] == -1) { // L: 1248
				Rasterizer3D.method5261(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3030[var18], field3030[var15], field3030[var16], field3018[var18], field3018[var15], field3018[var16], field2989[var18], field2989[var15], field2989[var16], this.faceTextures[var1]); // L: 1249
			} else {
				Rasterizer3D.method5261(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3030[var18], field3030[var15], field3030[var16], field3018[var18], field3018[var15], field3018[var16], field2989[var18], field2989[var15], field2989[var16], this.faceTextures[var1]); // L: 1252
			}
		} else {
			boolean var14 = this.method5665(var1); // L: 1219
			if (this.faceColors3[var1] == -1 && var14) { // L: 1220
				Rasterizer3D.method5270(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3042[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1221
			} else if (this.faceColors3[var1] == -1) { // L: 1223
				Rasterizer3D.method5309(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3042[this.faceColors1[var1]]); // L: 1224
			} else if (var14) { // L: 1226
				Rasterizer3D.method5291(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1227
			} else {
				Rasterizer3D.method5266(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1230
			}
		}

	} // L: 1255

	@ObfuscatedName("bx")
	final void method5667(int var1) {
		int var2 = Rasterizer3D.method5269(); // L: 1258
		int var3 = Rasterizer3D.method5253(); // L: 1259
		int var4 = 0; // L: 1260
		int var5 = this.indices1[var1]; // L: 1261
		int var6 = this.indices2[var1]; // L: 1262
		int var7 = this.indices3[var1]; // L: 1263
		int var8 = field2989[var5]; // L: 1264
		int var9 = field2989[var6]; // L: 1265
		int var10 = field2989[var7]; // L: 1266
		if (this.faceAlphas == null) { // L: 1267
			Rasterizer3D.field2809.field3081 = 0;
		} else {
			Rasterizer3D.field2809.field3081 = this.faceAlphas[var1] & 255; // L: 1268
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1269
			field3027[var4] = modelViewportXs[var5]; // L: 1270
			field2971[var4] = modelViewportYs[var5]; // L: 1271
			field3014[var4] = field2987[var7]; // L: 1272
			field3016[var4++] = this.faceColors1[var1]; // L: 1273
		} else {
			var11 = field3030[var5]; // L: 1276
			var12 = field3018[var5]; // L: 1277
			var13 = this.faceColors1[var1]; // L: 1278
			if (var10 >= 50) { // L: 1279
				var14 = field3040[var10 - var8] * (50 - var8); // L: 1280
				field3027[var4] = var2 + (var11 + ((field3030[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1281
				field2971[var4] = var3 + (var12 + ((field3018[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1282
				field3014[var4] = field2975; // L: 1283
				field3016[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1284
			}

			if (var9 >= 50) { // L: 1286
				var14 = field3040[var9 - var8] * (50 - var8); // L: 1287
				field3027[var4] = var2 + (var11 + ((field3030[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1288
				field2971[var4] = var3 + (var12 + ((field3018[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1289
				field3014[var4] = field2975; // L: 1290
				field3016[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1291
			}
		}

		if (var9 >= 50) { // L: 1294
			field3027[var4] = modelViewportXs[var6]; // L: 1295
			field2971[var4] = modelViewportYs[var6]; // L: 1296
			field3014[var4] = field2987[var7]; // L: 1297
			field3016[var4++] = this.faceColors2[var1]; // L: 1298
		} else {
			var11 = field3030[var6]; // L: 1301
			var12 = field3018[var6]; // L: 1302
			var13 = this.faceColors2[var1]; // L: 1303
			if (var8 >= 50) { // L: 1304
				var14 = field3040[var8 - var9] * (50 - var9); // L: 1305
				field3027[var4] = var2 + (var11 + ((field3030[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1306
				field2971[var4] = var3 + (var12 + ((field3018[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1307
				field3014[var4] = field2975; // L: 1308
				field3016[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1309
			}

			if (var10 >= 50) { // L: 1311
				var14 = field3040[var10 - var9] * (50 - var9); // L: 1312
				field3027[var4] = var2 + (var11 + ((field3030[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1313
				field2971[var4] = var3 + (var12 + ((field3018[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1314
				field3016[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1315
			}
		}

		if (var10 >= 50) { // L: 1318
			field3027[var4] = modelViewportXs[var7]; // L: 1319
			field2971[var4] = modelViewportYs[var7]; // L: 1320
			field3014[var4] = field2987[var7]; // L: 1321
			field3016[var4++] = this.faceColors3[var1]; // L: 1322
		} else {
			var11 = field3030[var7]; // L: 1325
			var12 = field3018[var7]; // L: 1326
			var13 = this.faceColors3[var1]; // L: 1327
			if (var9 >= 50) { // L: 1328
				var14 = field3040[var9 - var10] * (50 - var10); // L: 1329
				field3027[var4] = var2 + (var11 + ((field3030[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1330
				field2971[var4] = var3 + (var12 + ((field3018[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1331
				field3014[var4] = field2975; // L: 1332
				field3016[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1333
			}

			if (var8 >= 50) { // L: 1335
				var14 = field3040[var8 - var10] * (50 - var10); // L: 1336
				field3027[var4] = var2 + (var11 + ((field3030[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1337
				field2971[var4] = var3 + (var12 + ((field3018[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5320() / 50; // L: 1338
				field3014[var4] = field2975; // L: 1339
				field3016[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1340
			}
		}

		var11 = field3027[0]; // L: 1343
		var12 = field3027[1]; // L: 1344
		var13 = field3027[2]; // L: 1345
		var14 = field2971[0]; // L: 1346
		int var15 = field2971[1]; // L: 1347
		int var16 = field2971[2]; // L: 1348
		float var17 = field3014[0]; // L: 1349
		float var18 = field3014[1]; // L: 1350
		float var19 = field3014[2]; // L: 1351
		Rasterizer3D.field2809.field3098 = false; // L: 1352
		int var20 = Rasterizer3D.method5259(); // L: 1353
		if (var4 == 3) { // L: 1354
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1355
				Rasterizer3D.field2809.field3098 = true;
			}

			this.method5666(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2]); // L: 1356
		}

		if (var4 == 4) { // L: 1358
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3027[3] < 0 || field3027[3] > var20) { // L: 1359
				Rasterizer3D.field2809.field3098 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1360
				int var23;
				int var25;
				if (this.field2991 != null && this.field2991[var1] != -1) { // L: 1385
					int var24 = this.field2991[var1] & 255; // L: 1386
					var25 = this.field3039[var24]; // L: 1387
					var22 = this.field2996[var24]; // L: 1388
					var23 = this.field2997[var24]; // L: 1389
				} else {
					var25 = var5; // L: 1392
					var22 = var6; // L: 1393
					var23 = var7; // L: 1394
				}

				short var26 = this.faceTextures[var1]; // L: 1396
				if (this.faceColors3[var1] == -1) { // L: 1397
					Rasterizer3D.method5261(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26); // L: 1398
					Rasterizer3D.method5261(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26); // L: 1399
				} else {
					Rasterizer3D.method5261(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26); // L: 1402
					Rasterizer3D.method5261(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], field3016[0], field3016[2], field3016[3], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26); // L: 1403
				}
			} else {
				boolean var21 = this.method5665(var1); // L: 1361
				if (this.faceColors3[var1] == -1 && var21) { // L: 1362
					var22 = field3042[this.faceColors1[var1]]; // L: 1363
					Rasterizer3D.method5270(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1364
					Rasterizer3D.method5270(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1365
				} else if (this.faceColors3[var1] == -1) { // L: 1367
					var22 = field3042[this.faceColors1[var1]]; // L: 1368
					Rasterizer3D.method5309(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1369
					Rasterizer3D.method5309(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], var22); // L: 1370
				} else if (var21) { // L: 1372
					Rasterizer3D.method5291(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1373
					Rasterizer3D.method5291(var14, var16, field2971[3], var11, var13, field3027[3], 0.0F, 0.0F, 0.0F, field3016[0], field3016[2], field3016[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1374
				} else {
					Rasterizer3D.method5266(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2]); // L: 1377
					Rasterizer3D.method5266(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], field3016[0], field3016[2], field3016[3]); // L: 1378
				}
			}
		}

	} // L: 1407

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILrh;)V"
	)
	void method5668(int var1, class466 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1410
		float var4 = (float)(-this.verticesY[var1]); // L: 1411
		float var5 = (float)(-this.verticesZ[var1]); // L: 1412
		float var6 = 1.0F; // L: 1413
		this.verticesX[var1] = (int)(var2.field4809[0] * var3 + var2.field4809[4] * var4 + var2.field4809[8] * var5 + var2.field4809[12] * var6); // L: 1414
		this.verticesY[var1] = -((int)(var2.field4809[1] * var3 + var2.field4809[5] * var4 + var2.field4809[9] * var5 + var2.field4809[13] * var6)); // L: 1415
		this.verticesZ[var1] = -((int)(var2.field4809[2] * var3 + var2.field4809[6] * var4 + var2.field4809[10] * var5 + var2.field4809[14] * var6)); // L: 1416
	} // L: 1417

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V"
	)
	void method5669(class270 var1, int var2) {
		if (this.field3000 != null) { // L: 1420
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1421
				int[] var4 = this.field3000[var3]; // L: 1422
				if (var4 != null && var4.length != 0) { // L: 1423
					int[] var5 = this.field3001[var3]; // L: 1424
					field3031.method8547(); // L: 1425

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1426
						int var7 = var4[var6]; // L: 1427
						class128 var8 = var1.method5324(var7); // L: 1428
						if (var8 != null) { // L: 1429
							field2976.method8549((float)var5[var6] / 255.0F); // L: 1430
							field2977.method8548(var8.method3037(var2)); // L: 1431
							field2977.method8552(field2976); // L: 1432
							field3031.method8551(field2977); // L: 1433
						}
					}

					this.method5668(var3, field3031); // L: 1435
				}
			}

		}
	} // L: 1437

	@ObfuscatedName("do")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 853
			this.calculateBoundsCylinder();
		}

		this.method5641(var1); // L: 854
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 855
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 856
		int var13 = var3 * this.xzRadius >> 16; // L: 857
		int var14 = var12 + var13; // L: 858
		if (var14 > 50 && var12 < 3500) { // L: 859
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 860
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method5320(); // L: 861
			if (var16 / var14 < Rasterizer3D.method5255()) { // L: 862
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method5320(); // L: 863
				if (var17 / var14 > Rasterizer3D.method5254()) { // L: 864
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 865
					int var19 = var2 * this.xzRadius >> 16; // L: 866
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 867
					int var21 = (var18 + var20) * Rasterizer3D.method5320(); // L: 868
					if (var21 / var14 > Rasterizer3D.method5257()) { // L: 869
						int var22 = (var3 * super.height >> 16) + var19; // L: 870
						int var23 = (var18 - var22) * Rasterizer3D.method5320(); // L: 871
						if (var23 / var14 < Rasterizer3D.method5246()) { // L: 872
							int var24 = var13 + (var2 * super.height >> 16); // L: 873
							boolean var25 = false; // L: 874
							boolean var26 = false; // L: 875
							if (var12 - var24 <= 50) { // L: 876
								var26 = true;
							}

							boolean var27 = var26 || this.field3043 > 0; // L: 877
							int var28 = class20.method312(); // L: 878
							int var29 = MusicPatchNode2.method6036(); // L: 879
							boolean var30 = class59.method1184(); // L: 880
							boolean var31 = ByteArrayPool.method8033(var9); // L: 881
							boolean var32 = false; // L: 882
							int var37;
							int var38;
							int var39;
							int var40;
							int var41;
							int var46;
							int var47;
							int var51;
							if (var31 && var30) { // L: 883
								boolean var33 = false; // L: 884
								if (field3034) { // L: 885
									boolean var34;
									if (!class59.method1184()) { // L: 889
										var34 = false; // L: 890
									} else {
										class181.method3687(); // L: 893
										class274 var36 = (class274)this.field3008.get(var1); // L: 894
										var37 = var36.field2908 + var6; // L: 895
										var38 = var7 + var36.field2899; // L: 896
										var39 = var8 + var36.field2903; // L: 897
										var40 = var36.field2901; // L: 898
										var41 = var36.field2902; // L: 899
										int var42 = var36.field2898; // L: 900
										int var43 = class403.field4501 - var37; // L: 901
										int var44 = ViewportMouse.field3063 - var38; // L: 902
										int var45 = ViewportMouse.field3054 - var39; // L: 903
										if (Math.abs(var43) > var40 + class148.field1662) { // L: 904
											var34 = false; // L: 905
										} else if (Math.abs(var44) > var41 + UserComparator7.field1450) { // L: 908
											var34 = false; // L: 909
										} else if (Math.abs(var45) > var42 + DynamicObject.field998) { // L: 912
											var34 = false; // L: 913
										} else if (Math.abs(var45 * class151.field1681 - var44 * class140.field1625) > var41 * DynamicObject.field998 + var42 * UserComparator7.field1450) { // L: 916
											var34 = false; // L: 917
										} else if (Math.abs(var43 * class140.field1625 - var45 * ViewportMouse.field3055) > var42 * class148.field1662 + var40 * DynamicObject.field998) { // L: 920
											var34 = false; // L: 921
										} else if (Math.abs(var44 * ViewportMouse.field3055 - var43 * class151.field1681) > var41 * class148.field1662 + var40 * UserComparator7.field1450) { // L: 924
											var34 = false; // L: 925
										} else {
											var34 = true; // L: 928
										}
									}

									var33 = var34; // L: 930
								} else {
									var51 = var12 - var13; // L: 933
									if (var51 <= 50) { // L: 934
										var51 = 50;
									}

									if (var15 > 0) { // L: 935
										var16 /= var14; // L: 936
										var17 /= var51; // L: 937
									} else {
										var17 /= var14; // L: 940
										var16 /= var51; // L: 941
									}

									if (var18 > 0) { // L: 943
										var23 /= var14; // L: 944
										var21 /= var51; // L: 945
									} else {
										var21 /= var14; // L: 948
										var23 /= var51; // L: 949
									}

									var46 = var28 - Rasterizer3D.method5269(); // L: 951
									var47 = var29 - Rasterizer3D.method5253(); // L: 952
									if (var46 > var16 && var46 < var17 && var47 > var23 && var47 < var21) { // L: 953
										var33 = true; // L: 954
									}
								}

								if (var33) { // L: 957
									if (this.isSingleTile) { // L: 958
										TileItem.method2757(var9);
									} else {
										var32 = true; // L: 959
									}
								}
							}

							int var50 = Rasterizer3D.method5269(); // L: 962
							var51 = Rasterizer3D.method5253(); // L: 963
							var46 = 0; // L: 964
							var47 = 0; // L: 965
							if (var1 != 0) { // L: 966
								var46 = field3037[var1]; // L: 967
								var47 = field3038[var1]; // L: 968
							}

							for (var37 = 0; var37 < this.verticesCount; ++var37) { // L: 970
								var38 = this.verticesX[var37]; // L: 971
								var39 = this.verticesY[var37]; // L: 972
								var40 = this.verticesZ[var37]; // L: 973
								if (var1 != 0) { // L: 974
									var41 = var40 * var46 + var38 * var47 >> 16; // L: 975
									var40 = var40 * var47 - var38 * var46 >> 16; // L: 976
									var38 = var41; // L: 977
								}

								var38 += var6; // L: 979
								var39 += var7; // L: 980
								var40 += var8; // L: 981
								var41 = var40 * var4 + var5 * var38 >> 16; // L: 982
								var40 = var5 * var40 - var38 * var4 >> 16; // L: 983
								var38 = var41; // L: 984
								var41 = var3 * var39 - var40 * var2 >> 16; // L: 985
								var40 = var39 * var2 + var3 * var40 >> 16; // L: 986
								field3015[var37] = var40 - var12; // L: 988
								if (var40 >= 50) { // L: 989
									modelViewportXs[var37] = var50 + var38 * Rasterizer3D.method5320() / var40; // L: 990
									modelViewportYs[var37] = var51 + var41 * Rasterizer3D.method5320() / var40; // L: 991
									field2987[var37] = SoundSystem.method871(var40); // L: 992
								} else {
									modelViewportXs[var37] = -5000; // L: 995
									var25 = true; // L: 996
								}

								if (var27) { // L: 998
									field3030[var37] = var38; // L: 999
									field3018[var37] = var41; // L: 1000
									field2989[var37] = var40; // L: 1001
								}
							}

							try {
								this.draw0(var25, var32, this.isSingleTile, var9); // L: 1005
							} catch (Exception var49) { // L: 1007
							}

						}
					}
				}
			}
		}
	} // L: 1008
}
