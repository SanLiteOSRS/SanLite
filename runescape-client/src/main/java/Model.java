import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ah")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ao")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static class462 field2933;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static class462 field2934;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static class462 field2996;
	@ObfuscatedName("bo")
	static boolean[] field2932;
	@ObfuscatedName("bt")
	static boolean[] field2957;
	@ObfuscatedName("bu")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("by")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bh")
	static float[] field2972;
	@ObfuscatedName("bz")
	static int[] field2973;
	@ObfuscatedName("bc")
	static int[] field2974;
	@ObfuscatedName("bs")
	static int[] field2959;
	@ObfuscatedName("bx")
	static int[] field2976;
	@ObfuscatedName("bk")
	static char[] field2978;
	@ObfuscatedName("br")
	static char[][] field2979;
	@ObfuscatedName("bq")
	static int[] field2980;
	@ObfuscatedName("cf")
	static int[][] field2981;
	@ObfuscatedName("cg")
	static int[] field2982;
	@ObfuscatedName("cv")
	static int[] field2987;
	@ObfuscatedName("cx")
	static int[] field2986;
	@ObfuscatedName("cp")
	static int[] field2984;
	@ObfuscatedName("ce")
	static int[] field2937;
	@ObfuscatedName("ci")
	static int[] field2983;
	@ObfuscatedName("ct")
	static float[] field2971;
	@ObfuscatedName("cw")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cq")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cl")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cs")
	static boolean field2992;
	@ObfuscatedName("cn")
	static int[] field2995;
	@ObfuscatedName("cr")
	static int[] field3001;
	@ObfuscatedName("cj")
	static int[] field2997;
	@ObfuscatedName("ca")
	static int[] field2975;
	@ObfuscatedName("ch")
	static final float field2941;
	@ObfuscatedName("ac")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("al")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("az")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ap")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("av")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ax")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("as")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ay")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ak")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("aj")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("am")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("aq")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ai")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("aw")
	byte[] field2949;
	@ObfuscatedName("ae")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("an")
	public byte field2951;
	@ObfuscatedName("ag")
	public int field2952;
	@ObfuscatedName("ad")
	int[] field2953;
	@ObfuscatedName("af")
	int[] field2985;
	@ObfuscatedName("be")
	int[] field2955;
	@ObfuscatedName("bd")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bl")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bi")
	int[][] field2958;
	@ObfuscatedName("bv")
	int[][] field2935;
	@ObfuscatedName("bf")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bg")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("ba")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bm")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bp")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bw")
	@Export("radius")
	int radius;
	@ObfuscatedName("bj")
	HashMap field2943;
	@ObfuscatedName("cb")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cz")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cy")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("ck")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cd")
	public short field3006;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2933 = new class462(); // L: 17
		field2934 = new class462(); // L: 18
		field2996 = new class462(); // L: 19
		field2932 = new boolean[6500]; // L: 55
		field2957 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2972 = new float[6500]; // L: 59
		field2973 = new int[6500]; // L: 60
		field2974 = new int[6500]; // L: 61
		field2959 = new int[6500]; // L: 62
		field2976 = new int[6500]; // L: 63
		field2978 = new char[6000]; // L: 65
		field2979 = new char[6000][512]; // L: 66
		field2980 = new int[12]; // L: 67
		field2981 = new int[12][2000]; // L: 68
		field2982 = new int[2000]; // L: 69
		field2987 = new int[2000]; // L: 70
		field2984 = new int[12]; // L: 71
		field2937 = new int[10]; // L: 72
		field2986 = new int[10]; // L: 73
		field2983 = new int[10]; // L: 74
		field2971 = new float[10]; // L: 75
		field2992 = true; // L: 79
		field2995 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field3001 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2997 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2975 = Rasterizer3D.field2775; // L: 85
		field2941 = WorldMapAreaData.method5039(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2951 = 0;
		this.field2952 = 0;
		this.isSingleTile = false;
		this.field2943 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2951 = 0;
		this.field2952 = 0;
		this.isSingleTile = false;
		this.field2943 = new HashMap();
		this.method5594(var1, var2, var3); // L: 121
		this.field2951 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2952 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Lka;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2951 = 0; // L: 35
		this.field2952 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2943 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2952 = 0; // L: 100
		this.field2951 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2952 += var4.field2952; // L: 107
				if (this.field2951 == -1) { // L: 108
					this.field2951 = var4.field2951;
				}
			}
		}

		this.method5594(this.verticesCount, this.indicesCount, this.field2952); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2952 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method5644(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("at")
	void method5594(int var1, int var2, int var3) {
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
			this.field2953 = new int[var3]; // L: 139
			this.field2985 = new int[var3]; // L: 140
			this.field2955 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lka;)V"
	)
	void method5575(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2951 != var1.field2951)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2951); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2949 == null && var1.field2949 != null) { // L: 159
			this.field2949 = new byte[var2]; // L: 160
			Arrays.fill(this.field2949, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lka;)V"
	)
	public void method5644(Model var1) {
		if (var1 != null) { // L: 166
			this.method5575(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2951; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2949 != null) { // L: 186
					if (var1.field2949 != null && var1.field2949[var2] != -1) { // L: 187
						this.field2949[this.indicesCount] = (byte)(var1.field2949[var2] + this.field2952); // L: 188
					} else {
						this.field2949[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2952; ++var2) { // L: 196
				this.field2953[this.field2952] = this.verticesCount + var1.field2953[var2]; // L: 197
				this.field2985[this.field2952] = this.verticesCount + var1.field2985[var2]; // L: 198
				this.field2955[this.field2952] = this.verticesCount + var1.field2955[var2]; // L: 199
				++this.field2952; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lka;"
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
					var11.field2952 = this.field2952; // L: 227
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
					var11.field2949 = this.field2949; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2951 = this.field2951; // L: 240
					var11.field2953 = this.field2953; // L: 241
					var11.field2985 = this.field2985; // L: 242
					var11.field2955 = this.field2955; // L: 243
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Z)Lka;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)Lka;"
	)
	public Model method5636(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZLka;[B)Lka;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2952 = this.field2952; // L: 300
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
		var2.field2949 = this.field2949; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2951 = this.field2951; // L: 330
		var2.field2953 = this.field2953; // L: 331
		var2.field2985 = this.field2985; // L: 332
		var2.field2955 = this.field2955; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2958 = this.field2958; // L: 336
		var2.field2935 = this.field2935; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("ax")
	void method5566(int var1) {
		if (!this.field2943.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field3001[var1]; // L: 352
			int var9 = field2995[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var11 = WorldMapEvent.method5098(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 355
				int var12 = this.verticesY[var10]; // L: 356
				int var14 = this.verticesX[var10]; // L: 358
				int var15 = this.verticesZ[var10]; // L: 359
				int var13 = var15 * var8 - var9 * var14 >> 16; // L: 361
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

			class271 var17 = new class271((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 371
			boolean var18 = true; // L: 372
			if (var17.field2866 < 32) { // L: 373
				var17.field2866 = 32;
			}

			if (var17.field2868 < 32) { // L: 374
				var17.field2868 = 32;
			}

			if (this.isSingleTile) { // L: 375
				boolean var19 = true; // L: 376
				var17.field2866 += 8; // L: 377
				var17.field2868 += 8; // L: 378
			}

			this.field2943.put(var1, var17); // L: 380
		}
	} // L: 381

	@ObfuscatedName("as")
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

	@ObfuscatedName("ay")
	void method5568() {
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

	@ObfuscatedName("ak")
	public int method5569() {
		this.calculateBoundsCylinder(); // L: 420
		return this.xzRadius; // L: 421
	}

	@ObfuscatedName("aj")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 425
		this.field2943.clear(); // L: 426
	} // L: 427

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V"
	)
	public void method5572(class139 var1, int var2) {
		Skeleton var3 = var1.field1600; // L: 445
		class267 var4 = var3.method5317(); // L: 446
		if (var4 != null) { // L: 447
			var3.method5317().method5272(var1, var2); // L: 448
			this.method5626(var3.method5317(), var1.method3190()); // L: 449
		}

		if (var1.method3187()) { // L: 451
			this.method5573(var1, var2); // L: 452
		}

		this.resetBounds(); // L: 454
	} // L: 455

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V"
	)
	void method5573(class139 var1, int var2) {
		Skeleton var3 = var1.field1600; // L: 458

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 459
			int var5 = var3.transformTypes[var4]; // L: 460
			if (var5 == 5 && var1.field1596 != null && var1.field1596[var4] != null && var1.field1596[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 461 462
				class131 var6 = var1.field1596[var4][0]; // L: 463
				int[] var7 = var3.labels[var4]; // L: 464
				int var8 = var7.length; // L: 465

				for (int var9 = 0; var9 < var8; ++var9) { // L: 466
					int var10 = var7[var9]; // L: 467
					if (var10 < this.faceLabelsAlpha.length) { // L: 468
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 469

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 470
							int var13 = var11[var12]; // L: 471
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3100(var2) * 255.0F); // L: 472
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V"
	)
	void method5626(class267 var1, int var2) {
		this.method5660(var1, var2); // L: 486
	} // L: 488

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lko;ILko;I[I)V"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Lfo;I[ZZZ)V"
	)
	public void method5576(Skeleton var1, class139 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class267 var7 = var1.method5317(); // L: 523
		if (var7 != null) { // L: 524
			var7.method5282(var2, var3, var4, var5); // L: 525
			if (var6) { // L: 526
				this.method5626(var7, var2.method3190()); // L: 527
			}
		}

		if (!var5 && var2.method3187()) { // L: 530
			this.method5573(var2, var3); // L: 531
		}

	} // L: 533

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lko;I[IZ)V"
	)
	public void method5577(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ad")
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
								var15 = field2995[var14]; // L: 620
								var16 = field3001[var14]; // L: 621
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 622
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 623
								this.verticesX[var11] = var17; // L: 624
							}

							if (var12 != 0) { // L: 626
								var15 = field2995[var12]; // L: 627
								var16 = field3001[var12]; // L: 628
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 629
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 630
								this.verticesY[var11] = var17; // L: 631
							}

							if (var13 != 0) { // L: 633
								var15 = field2995[var13]; // L: 634
								var16 = field3001[var13]; // L: 635
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

	@ObfuscatedName("af")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 690
			int var2 = this.verticesX[var1]; // L: 691
			this.verticesX[var1] = this.verticesZ[var1]; // L: 692
			this.verticesZ[var1] = -var2; // L: 693
		}

		this.resetBounds(); // L: 695
	} // L: 696

	@ObfuscatedName("be")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 699
			this.verticesX[var1] = -this.verticesX[var1]; // L: 700
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 701
		}

		this.resetBounds(); // L: 703
	} // L: 704

	@ObfuscatedName("bd")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 707
			int var2 = this.verticesZ[var1]; // L: 708
			this.verticesZ[var1] = this.verticesX[var1]; // L: 709
			this.verticesX[var1] = -var2; // L: 710
		}

		this.resetBounds(); // L: 712
	} // L: 713

	@ObfuscatedName("bl")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2995[var1]; // L: 716
		int var3 = field3001[var1]; // L: 717

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 718
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 719
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 720
			this.verticesY[var4] = var5; // L: 721
		}

		this.resetBounds(); // L: 723
	} // L: 724

	@ObfuscatedName("bi")
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

	@ObfuscatedName("bv")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 736
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 737
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 738
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 739
		}

		this.resetBounds(); // L: 741
	} // L: 742

	@ObfuscatedName("bf")
	public final void method5558(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 745
			this.method5568();
		}

		int var8 = Rasterizer3D.method5194(); // L: 746
		int var9 = Rasterizer3D.method5195(); // L: 747
		int var10 = field2995[var1]; // L: 748
		int var11 = field3001[var1]; // L: 749
		int var12 = field2995[var2]; // L: 750
		int var13 = field3001[var2]; // L: 751
		int var14 = field2995[var3]; // L: 752
		int var15 = field3001[var3]; // L: 753
		int var16 = field2995[var4]; // L: 754
		int var17 = field3001[var4]; // L: 755
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
			field2973[var19] = var22 - var18; // L: 782
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method5200() / var22; // L: 783
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method5200() / var22; // L: 784
			field2972[var19] = WorldMapAreaData.method5039(var22); // L: 785
			if (this.field2952 > 0) { // L: 786
				field2974[var19] = var20; // L: 787
				field2959[var19] = var23; // L: 788
				field2976[var19] = var22; // L: 789
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 793
		} catch (Exception var25) { // L: 795
		}

	} // L: 796

	@ObfuscatedName("bg")
	public final void method5586(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 799
			this.method5568();
		}

		int var9 = Rasterizer3D.method5194(); // L: 800
		int var10 = Rasterizer3D.method5195(); // L: 801
		int var11 = field2995[var1]; // L: 802
		int var12 = field3001[var1]; // L: 803
		int var13 = field2995[var2]; // L: 804
		int var14 = field3001[var2]; // L: 805
		int var15 = field2995[var3]; // L: 806
		int var16 = field3001[var3]; // L: 807
		int var17 = field2995[var4]; // L: 808
		int var18 = field3001[var4]; // L: 809
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
			field2973[var20] = var23 - var19; // L: 836
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method5200() / var8; // L: 837
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method5200() / var8; // L: 838
			field2972[var20] = WorldMapAreaData.method5039(var8); // L: 839
			if (this.field2952 > 0) { // L: 840
				field2974[var20] = var21; // L: 841
				field2959[var20] = var24; // L: 842
				field2976[var20] = var23; // L: 843
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 847
		} catch (Exception var26) { // L: 849
		}

	} // L: 850

	@ObfuscatedName("ba")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1082
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1083
				field2978[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1084

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1085
				if (this.faceColors3[var7] != -2) { // L: 1086
					var8 = this.indices1[var7]; // L: 1087
					var9 = this.indices2[var7]; // L: 1088
					var10 = this.indices3[var7]; // L: 1089
					var11 = modelViewportXs[var8]; // L: 1090
					var12 = modelViewportXs[var9]; // L: 1091
					var28 = modelViewportXs[var10]; // L: 1092
					int var29;
					if (var1 && (var11 == -5000 || var12 == -5000 || var28 == -5000)) { // L: 1093
						var29 = field2974[var8]; // L: 1094
						var15 = field2974[var9]; // L: 1095
						var16 = field2974[var10]; // L: 1096
						int var30 = field2959[var8]; // L: 1097
						var18 = field2959[var9]; // L: 1098
						int var19 = field2959[var10]; // L: 1099
						int var20 = field2976[var8]; // L: 1100
						int var21 = field2976[var9]; // L: 1101
						int var22 = field2976[var10]; // L: 1102
						var29 -= var15; // L: 1103
						var16 -= var15; // L: 1104
						var30 -= var18; // L: 1105
						var19 -= var18; // L: 1106
						var20 -= var21; // L: 1107
						var22 -= var21; // L: 1108
						int var23 = var30 * var22 - var20 * var19; // L: 1109
						int var24 = var20 * var16 - var29 * var22; // L: 1110
						int var25 = var29 * var19 - var30 * var16; // L: 1111
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1112
							field2957[var7] = true; // L: 1113
							int var26 = (field2973[var8] + field2973[var9] + field2973[var10]) / 3 + this.radius; // L: 1114
							field2979[var26][field2978[var26]++] = var7; // L: 1115
						}
					} else {
						if (var2 && class225.method4388(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1119
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1122
							var2 = false; // L: 1124
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1126
							field2957[var7] = false; // L: 1127
							var29 = Rasterizer3D.method5237(); // L: 1128
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1129
								field2932[var7] = false; // L: 1130
							} else {
								field2932[var7] = true;
							}

							var15 = (field2973[var8] + field2973[var9] + field2973[var10]) / 3 + this.radius; // L: 1131
							field2979[var15][field2978[var15]++] = var7; // L: 1132
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1136
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1137
					var34 = field2978[var33]; // L: 1138
					if (var34 > 0) { // L: 1139
						var27 = field2979[var33]; // L: 1140

						for (var10 = 0; var10 < var34; ++var10) { // L: 1141
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1146
					field2980[var33] = 0; // L: 1147
					field2984[var33] = 0; // L: 1148
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1150
					var34 = field2978[var33]; // L: 1151
					if (var34 > 0) { // L: 1152
						var27 = field2979[var33]; // L: 1153

						for (var10 = 0; var10 < var34; ++var10) { // L: 1154
							char var35 = var27[var10]; // L: 1155
							byte var36 = this.faceRenderPriorities[var35]; // L: 1156
							var28 = field2980[var36]++; // L: 1157
							field2981[var36][var28] = var35; // L: 1158
							if (var36 < 10) { // L: 1159
								int[] var37 = field2984;
								var37[var36] += var33;
							} else if (var36 == 10) { // L: 1160
								field2982[var28] = var33;
							} else {
								field2987[var28] = var33; // L: 1161
							}
						}
					}
				}

				var33 = 0; // L: 1165
				if (field2980[1] > 0 || field2980[2] > 0) { // L: 1166
					var33 = (field2984[1] + field2984[2]) / (field2980[1] + field2980[2]);
				}

				var8 = 0; // L: 1167
				if (field2980[3] > 0 || field2980[4] > 0) { // L: 1168
					var8 = (field2984[3] + field2984[4]) / (field2980[3] + field2980[4]);
				}

				var9 = 0; // L: 1169
				if (field2980[6] > 0 || field2980[8] > 0) { // L: 1170
					var9 = (field2984[8] + field2984[6]) / (field2980[8] + field2980[6]);
				}

				var11 = 0; // L: 1172
				var12 = field2980[10]; // L: 1173
				int[] var13 = field2981[10]; // L: 1174
				int[] var14 = field2982; // L: 1175
				if (var11 == var12) { // L: 1176
					var11 = 0; // L: 1177
					var12 = field2980[11]; // L: 1178
					var13 = field2981[11]; // L: 1179
					var14 = field2987; // L: 1180
				}

				if (var11 < var12) { // L: 1182
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1183
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1184
					while (var15 == 0 && var10 > var33) { // L: 1185
						this.drawFace(var13[var11++]); // L: 1186
						if (var11 == var12 && var13 != field2981[11]) { // L: 1187
							var11 = 0; // L: 1188
							var12 = field2980[11]; // L: 1189
							var13 = field2981[11]; // L: 1190
							var14 = field2987; // L: 1191
						}

						if (var11 < var12) { // L: 1193
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1194
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1196
						this.drawFace(var13[var11++]); // L: 1197
						if (var11 == var12 && var13 != field2981[11]) { // L: 1198
							var11 = 0; // L: 1199
							var12 = field2980[11]; // L: 1200
							var13 = field2981[11]; // L: 1201
							var14 = field2987; // L: 1202
						}

						if (var11 < var12) { // L: 1204
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1205
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1207
						this.drawFace(var13[var11++]); // L: 1208
						if (var11 == var12 && var13 != field2981[11]) { // L: 1209
							var11 = 0; // L: 1210
							var12 = field2980[11]; // L: 1211
							var13 = field2981[11]; // L: 1212
							var14 = field2987; // L: 1213
						}

						if (var11 < var12) { // L: 1215
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1216
						}
					}

					var16 = field2980[var15]; // L: 1218
					int[] var17 = field2981[var15]; // L: 1219

					for (var18 = 0; var18 < var16; ++var18) { // L: 1220
						this.drawFace(var17[var18]); // L: 1221
					}
				}

				while (var10 != -1000) { // L: 1224
					this.drawFace(var13[var11++]); // L: 1225
					if (var11 == var12 && var13 != field2981[11]) { // L: 1226
						var11 = 0; // L: 1227
						var13 = field2981[11]; // L: 1228
						var12 = field2980[11]; // L: 1229
						var14 = field2987; // L: 1230
					}

					if (var11 < var12) { // L: 1232
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1233
					}
				}

			}
		}
	} // L: 1144 1235

	@ObfuscatedName("bm")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2957[var1]) { // L: 1238
			this.method5592(var1); // L: 1239
		} else {
			int var2 = this.indices1[var1]; // L: 1242
			int var3 = this.indices2[var1]; // L: 1243
			int var4 = this.indices3[var1]; // L: 1244
			Rasterizer3D.field2772.field3036 = field2932[var1]; // L: 1245
			if (this.faceAlphas == null) { // L: 1246
				Rasterizer3D.field2772.field3051 = 0; // L: 1247
			} else {
				Rasterizer3D.field2772.field3051 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1250
			}

			this.method5591(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2972[var2], field2972[var3], field2972[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1252
		}
	} // L: 1240 1253

	@ObfuscatedName("bp")
	boolean method5590(int var1) {
		return this.overrideAmount > 0 && var1 < this.field3006; // L: 1256
	}

	@ObfuscatedName("bw")
	final void method5591(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1260
			int var15;
			int var16;
			int var18;
			if (this.field2949 != null && this.field2949[var1] != -1) { // L: 1279
				int var17 = this.field2949[var1] & 255; // L: 1280
				var18 = this.field2953[var17]; // L: 1281
				var15 = this.field2985[var17]; // L: 1282
				var16 = this.field2955[var17]; // L: 1283
			} else {
				var18 = this.indices1[var1]; // L: 1286
				var15 = this.indices2[var1]; // L: 1287
				var16 = this.indices3[var1]; // L: 1288
			}

			if (this.faceColors3[var1] == -1) { // L: 1290
				Rasterizer3D.method5266(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2974[var18], field2974[var15], field2974[var16], field2959[var18], field2959[var15], field2959[var16], field2976[var18], field2976[var15], field2976[var16], this.faceTextures[var1]); // L: 1291
			} else {
				Rasterizer3D.method5266(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2974[var18], field2974[var15], field2974[var16], field2959[var18], field2959[var15], field2959[var16], field2976[var18], field2976[var15], field2976[var16], this.faceTextures[var1]); // L: 1294
			}
		} else {
			boolean var14 = this.method5590(var1); // L: 1261
			if (this.faceColors3[var1] == -1 && var14) { // L: 1262
				Rasterizer3D.method5213(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2997[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1263
			} else if (this.faceColors3[var1] == -1) { // L: 1265
				Rasterizer3D.method5209(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2997[this.faceColors1[var1]]); // L: 1266
			} else if (var14) { // L: 1268
				Rasterizer3D.method5212(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1269
			} else {
				Rasterizer3D.method5214(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1272
			}
		}

	} // L: 1297

	@ObfuscatedName("bj")
	final void method5592(int var1) {
		int var2 = Rasterizer3D.method5194(); // L: 1300
		int var3 = Rasterizer3D.method5195(); // L: 1301
		int var4 = 0; // L: 1302
		int var5 = this.indices1[var1]; // L: 1303
		int var6 = this.indices2[var1]; // L: 1304
		int var7 = this.indices3[var1]; // L: 1305
		int var8 = field2976[var5]; // L: 1306
		int var9 = field2976[var6]; // L: 1307
		int var10 = field2976[var7]; // L: 1308
		if (this.faceAlphas == null) { // L: 1309
			Rasterizer3D.field2772.field3051 = 0;
		} else {
			Rasterizer3D.field2772.field3051 = this.faceAlphas[var1] & 255; // L: 1310
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1311
			field2937[var4] = modelViewportXs[var5]; // L: 1312
			field2986[var4] = modelViewportYs[var5]; // L: 1313
			field2971[var4] = field2972[var7]; // L: 1314
			field2983[var4++] = this.faceColors1[var1]; // L: 1315
		} else {
			var11 = field2974[var5]; // L: 1318
			var12 = field2959[var5]; // L: 1319
			var13 = this.faceColors1[var1]; // L: 1320
			if (var10 >= 50) { // L: 1321
				var14 = field2975[var10 - var8] * (50 - var8); // L: 1322
				field2937[var4] = var2 + (var11 + ((field2974[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1323
				field2986[var4] = var3 + (var12 + ((field2959[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1324
				field2971[var4] = field2941; // L: 1325
				field2983[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1326
			}

			if (var9 >= 50) { // L: 1328
				var14 = field2975[var9 - var8] * (50 - var8); // L: 1329
				field2937[var4] = var2 + (var11 + ((field2974[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1330
				field2986[var4] = var3 + (var12 + ((field2959[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1331
				field2971[var4] = field2941; // L: 1332
				field2983[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1333
			}
		}

		if (var9 >= 50) { // L: 1336
			field2937[var4] = modelViewportXs[var6]; // L: 1337
			field2986[var4] = modelViewportYs[var6]; // L: 1338
			field2971[var4] = field2972[var7]; // L: 1339
			field2983[var4++] = this.faceColors2[var1]; // L: 1340
		} else {
			var11 = field2974[var6]; // L: 1343
			var12 = field2959[var6]; // L: 1344
			var13 = this.faceColors2[var1]; // L: 1345
			if (var8 >= 50) { // L: 1346
				var14 = field2975[var8 - var9] * (50 - var9); // L: 1347
				field2937[var4] = var2 + (var11 + ((field2974[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1348
				field2986[var4] = var3 + (var12 + ((field2959[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1349
				field2971[var4] = field2941; // L: 1350
				field2983[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1351
			}

			if (var10 >= 50) { // L: 1353
				var14 = field2975[var10 - var9] * (50 - var9); // L: 1354
				field2937[var4] = var2 + (var11 + ((field2974[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1355
				field2986[var4] = var3 + (var12 + ((field2959[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1356
				field2983[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1357
			}
		}

		if (var10 >= 50) { // L: 1360
			field2937[var4] = modelViewportXs[var7]; // L: 1361
			field2986[var4] = modelViewportYs[var7]; // L: 1362
			field2971[var4] = field2972[var7]; // L: 1363
			field2983[var4++] = this.faceColors3[var1]; // L: 1364
		} else {
			var11 = field2974[var7]; // L: 1367
			var12 = field2959[var7]; // L: 1368
			var13 = this.faceColors3[var1]; // L: 1369
			if (var9 >= 50) { // L: 1370
				var14 = field2975[var9 - var10] * (50 - var10); // L: 1371
				field2937[var4] = var2 + (var11 + ((field2974[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1372
				field2986[var4] = var3 + (var12 + ((field2959[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1373
				field2971[var4] = field2941; // L: 1374
				field2983[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1375
			}

			if (var8 >= 50) { // L: 1377
				var14 = field2975[var8 - var10] * (50 - var10); // L: 1378
				field2937[var4] = var2 + (var11 + ((field2974[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1379
				field2986[var4] = var3 + (var12 + ((field2959[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5200() / 50; // L: 1380
				field2971[var4] = field2941; // L: 1381
				field2983[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1382
			}
		}

		var11 = field2937[0]; // L: 1385
		var12 = field2937[1]; // L: 1386
		var13 = field2937[2]; // L: 1387
		var14 = field2986[0]; // L: 1388
		int var15 = field2986[1]; // L: 1389
		int var16 = field2986[2]; // L: 1390
		float var17 = field2971[0]; // L: 1391
		float var18 = field2971[1]; // L: 1392
		float var19 = field2971[2]; // L: 1393
		Rasterizer3D.field2772.field3036 = false; // L: 1394
		int var20 = Rasterizer3D.method5237(); // L: 1395
		if (var4 == 3) { // L: 1396
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1397
				Rasterizer3D.field2772.field3036 = true;
			}

			this.method5591(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2983[0], field2983[1], field2983[2]); // L: 1398
		}

		if (var4 == 4) { // L: 1400
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2937[3] < 0 || field2937[3] > var20) { // L: 1401
				Rasterizer3D.field2772.field3036 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1402
				int var23;
				int var25;
				if (this.field2949 != null && this.field2949[var1] != -1) { // L: 1427
					int var24 = this.field2949[var1] & 255; // L: 1428
					var25 = this.field2953[var24]; // L: 1429
					var22 = this.field2985[var24]; // L: 1430
					var23 = this.field2955[var24]; // L: 1431
				} else {
					var25 = var5; // L: 1434
					var22 = var6; // L: 1435
					var23 = var7; // L: 1436
				}

				short var26 = this.faceTextures[var1]; // L: 1438
				if (this.faceColors3[var1] == -1) { // L: 1439
					Rasterizer3D.method5266(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2974[var25], field2974[var22], field2974[var23], field2959[var25], field2959[var22], field2959[var23], field2976[var25], field2976[var22], field2976[var23], var26); // L: 1440
					Rasterizer3D.method5266(var14, var16, field2986[3], var11, var13, field2937[3], var17, var19, field2971[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2974[var25], field2974[var22], field2974[var23], field2959[var25], field2959[var22], field2959[var23], field2976[var25], field2976[var22], field2976[var23], var26); // L: 1441
				} else {
					Rasterizer3D.method5266(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2983[0], field2983[1], field2983[2], field2974[var25], field2974[var22], field2974[var23], field2959[var25], field2959[var22], field2959[var23], field2976[var25], field2976[var22], field2976[var23], var26); // L: 1444
					Rasterizer3D.method5266(var14, var16, field2986[3], var11, var13, field2937[3], var17, var19, field2971[3], field2983[0], field2983[2], field2983[3], field2974[var25], field2974[var22], field2974[var23], field2959[var25], field2959[var22], field2959[var23], field2976[var25], field2976[var22], field2976[var23], var26); // L: 1445
				}
			} else {
				boolean var21 = this.method5590(var1); // L: 1403
				if (this.faceColors3[var1] == -1 && var21) { // L: 1404
					var22 = field2997[this.faceColors1[var1]]; // L: 1405
					Rasterizer3D.method5213(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1406
					Rasterizer3D.method5213(var14, var16, field2986[3], var11, var13, field2937[3], var17, var19, field2971[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1407
				} else if (this.faceColors3[var1] == -1) { // L: 1409
					var22 = field2997[this.faceColors1[var1]]; // L: 1410
					Rasterizer3D.method5209(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1411
					Rasterizer3D.method5209(var14, var16, field2986[3], var11, var13, field2937[3], var17, var19, field2971[3], var22); // L: 1412
				} else if (var21) { // L: 1414
					Rasterizer3D.method5212(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2983[0], field2983[1], field2983[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1415
					Rasterizer3D.method5212(var14, var16, field2986[3], var11, var13, field2937[3], 0.0F, 0.0F, 0.0F, field2983[0], field2983[2], field2983[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1416
				} else {
					Rasterizer3D.method5214(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2983[0], field2983[1], field2983[2]); // L: 1419
					Rasterizer3D.method5214(var14, var16, field2986[3], var11, var13, field2937[3], var17, var19, field2971[3], field2983[0], field2983[2], field2983[3]); // L: 1420
				}
			}
		}

	} // L: 1449

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILrz;)V"
	)
	void method5593(int var1, class462 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1452
		float var4 = (float)(-this.verticesY[var1]); // L: 1453
		float var5 = (float)(-this.verticesZ[var1]); // L: 1454
		float var6 = 1.0F; // L: 1455
		this.verticesX[var1] = (int)(var2.field4772[0] * var3 + var2.field4772[4] * var4 + var2.field4772[8] * var5 + var2.field4772[12] * var6); // L: 1456
		this.verticesY[var1] = -((int)(var2.field4772[1] * var3 + var2.field4772[5] * var4 + var2.field4772[9] * var5 + var2.field4772[13] * var6)); // L: 1457
		this.verticesZ[var1] = -((int)(var2.field4772[2] * var3 + var2.field4772[6] * var4 + var2.field4772[10] * var5 + var2.field4772[14] * var6)); // L: 1458
	} // L: 1459

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V"
	)
	void method5660(class267 var1, int var2) {
		if (this.field2958 != null) { // L: 1462
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1463
				int[] var4 = this.field2958[var3]; // L: 1464
				if (var4 != null && var4.length != 0) { // L: 1465
					int[] var5 = this.field2935[var3]; // L: 1466
					field2933.method8488(); // L: 1467

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1468
						int var7 = var4[var6]; // L: 1469
						class128 var8 = var1.method5270(var7); // L: 1470
						if (var8 != null) { // L: 1471
							field2934.method8462((float)var5[var6] / 255.0F); // L: 1472
							field2996.method8435(var8.method3055(var2)); // L: 1473
							field2996.method8445(field2934); // L: 1474
							field2933.method8442(field2996); // L: 1475
						}
					}

					this.method5593(var3, field2933); // L: 1477
				}
			}

		}
	} // L: 1479

	@ObfuscatedName("dw")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 853
			this.calculateBoundsCylinder();
		}

		this.method5566(var1); // L: 854
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 855
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 856
		int var13 = var3 * this.xzRadius >> 16; // L: 857
		int var14 = var12 + var13; // L: 858
		if (var14 > 50 && var12 < 3500) { // L: 859
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 860
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method5200(); // L: 861
			if (var16 / var14 < Rasterizer3D.method5197()) { // L: 862
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method5200(); // L: 863
				if (var17 / var14 > Rasterizer3D.method5198()) { // L: 864
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 865
					int var19 = var2 * this.xzRadius >> 16; // L: 866
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 867
					int var21 = (var18 + var20) * Rasterizer3D.method5200(); // L: 868
					if (var21 / var14 > Rasterizer3D.method5199()) { // L: 869
						int var22 = (var3 * super.height >> 16) + var19; // L: 870
						int var23 = (var18 - var22) * Rasterizer3D.method5200(); // L: 871
						if (var23 / var14 < Rasterizer3D.method5202()) { // L: 872
							int var24 = var13 + (var2 * super.height >> 16); // L: 873
							boolean var25 = false; // L: 874
							boolean var26 = false; // L: 875
							if (var12 - var24 <= 50) { // L: 876
								var26 = true;
							}

							boolean var27 = var26 || this.field2952 > 0; // L: 877
							int var28 = ViewportMouse.ViewportMouse_x; // L: 880
							int var30 = ViewportMouse.ViewportMouse_y; // L: 885
							boolean var32 = ViewportMouse.ViewportMouse_isInViewport; // L: 890
							boolean var34 = class207.method4113(var9); // L: 893
							boolean var35 = false; // L: 894
							int var40;
							int var41;
							int var42;
							int var43;
							int var56;
							int var61;
							int var62;
							int var63;
							if (var34 && var32) { // L: 895
								boolean var36 = false; // L: 896
								if (field2992) { // L: 897
									boolean var39 = ViewportMouse.ViewportMouse_isInViewport; // L: 903
									boolean var37;
									if (!var39) { // L: 905
										var37 = false; // L: 906
									} else {
										int var46;
										int var47;
										int var48;
										int var49;
										int var64;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 910
											var40 = Scene.Scene_cameraPitchSine; // L: 911
											var41 = Scene.Scene_cameraPitchCosine; // L: 912
											var42 = Scene.Scene_cameraYawSine; // L: 913
											var43 = Scene.Scene_cameraYawCosine; // L: 914
											byte var44 = 50; // L: 915
											short var45 = 3500; // L: 916
											var46 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5194()) * var44 / Rasterizer3D.method5200(); // L: 917
											var47 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5195()) * var44 / Rasterizer3D.method5200(); // L: 918
											var48 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5194()) * var45 / Rasterizer3D.method5200(); // L: 919
											var49 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5195()) * var45 / Rasterizer3D.method5200(); // L: 920
											int var51 = var40 * var44 + var41 * var47 >> 16; // L: 924
											int var52 = var44 * var41 - var40 * var47 >> 16; // L: 929
											int var53 = var49 * var41 + var40 * var45 >> 16; // L: 935
											int var54 = var41 * var45 - var49 * var40 >> 16; // L: 940
											int var50 = LoginScreenAnimation.method2532(var46, var52, var43, var42); // L: 944
											var63 = class167.method3503(var46, var52, var43, var42); // L: 945
											var46 = var50; // L: 946
											var50 = LoginScreenAnimation.method2532(var48, var54, var43, var42); // L: 947
											var64 = class167.method3503(var48, var54, var43, var42); // L: 948
											class422.field4568 = (var50 + var46) / 2; // L: 950
											class106.field1352 = (var51 + var53) / 2; // L: 951
											class169.field1790 = (var64 + var63) / 2; // L: 952
											class303.field3123 = (var50 - var46) / 2; // L: 953
											class402.field4475 = (var53 - var51) / 2; // L: 954
											ViewportMouse.field3011 = (var64 - var63) / 2; // L: 955
											ViewportMouse.field3013 = Math.abs(class303.field3123); // L: 956
											MusicPatchNode2.field3403 = Math.abs(class402.field4475); // L: 957
											ViewportMouse.field3008 = Math.abs(ViewportMouse.field3011); // L: 958
										}

										class271 var55 = (class271)this.field2943.get(var1); // L: 960
										var41 = var55.field2871 + var6; // L: 961
										var42 = var7 + var55.field2867; // L: 962
										var43 = var8 + var55.field2869; // L: 963
										var63 = var55.field2866; // L: 964
										var64 = var55.field2870; // L: 965
										var46 = var55.field2868; // L: 966
										var47 = class422.field4568 - var41; // L: 967
										var48 = class106.field1352 - var42; // L: 968
										var49 = class169.field1790 - var43; // L: 969
										if (Math.abs(var47) > var63 + ViewportMouse.field3013) { // L: 970
											var37 = false; // L: 971
										} else if (Math.abs(var48) > var64 + MusicPatchNode2.field3403) { // L: 974
											var37 = false; // L: 975
										} else if (Math.abs(var49) > var46 + ViewportMouse.field3008) { // L: 978
											var37 = false; // L: 979
										} else if (Math.abs(var49 * class402.field4475 - var48 * ViewportMouse.field3011) > var46 * MusicPatchNode2.field3403 + var64 * ViewportMouse.field3008) { // L: 982
											var37 = false; // L: 983
										} else if (Math.abs(var47 * ViewportMouse.field3011 - var49 * class303.field3123) > var46 * ViewportMouse.field3013 + var63 * ViewportMouse.field3008) { // L: 986
											var37 = false; // L: 987
										} else if (Math.abs(var48 * class303.field3123 - var47 * class402.field4475) > var63 * MusicPatchNode2.field3403 + var64 * ViewportMouse.field3013) { // L: 990
											var37 = false; // L: 991
										} else {
											var37 = true; // L: 994
										}
									}

									var36 = var37; // L: 996
								} else {
									var62 = var12 - var13; // L: 999
									if (var62 <= 50) { // L: 1000
										var62 = 50;
									}

									if (var15 > 0) { // L: 1001
										var16 /= var14; // L: 1002
										var17 /= var62; // L: 1003
									} else {
										var17 /= var14; // L: 1006
										var16 /= var62; // L: 1007
									}

									if (var18 > 0) { // L: 1009
										var23 /= var14; // L: 1010
										var21 /= var62; // L: 1011
									} else {
										var21 /= var14; // L: 1014
										var23 /= var62; // L: 1015
									}

									var56 = var28 - Rasterizer3D.method5194(); // L: 1017
									var61 = var30 - Rasterizer3D.method5195(); // L: 1018
									if (var56 > var16 && var56 < var17 && var61 > var23 && var61 < var21) { // L: 1019
										var36 = true; // L: 1020
									}
								}

								if (var36) { // L: 1023
									if (this.isSingleTile) { // L: 1024
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 1027
									} else {
										var35 = true; // L: 1030
									}
								}
							}

							int var60 = Rasterizer3D.method5194(); // L: 1033
							var62 = Rasterizer3D.method5195(); // L: 1034
							var56 = 0; // L: 1035
							var61 = 0; // L: 1036
							if (var1 != 0) { // L: 1037
								var56 = field2995[var1]; // L: 1038
								var61 = field3001[var1]; // L: 1039
							}

							for (var40 = 0; var40 < this.verticesCount; ++var40) { // L: 1041
								var41 = this.verticesX[var40]; // L: 1042
								var42 = this.verticesY[var40]; // L: 1043
								var43 = this.verticesZ[var40]; // L: 1044
								if (var1 != 0) { // L: 1045
									var63 = var43 * var56 + var41 * var61 >> 16; // L: 1046
									var43 = var43 * var61 - var41 * var56 >> 16; // L: 1047
									var41 = var63; // L: 1048
								}

								var41 += var6; // L: 1050
								var42 += var7; // L: 1051
								var43 += var8; // L: 1052
								var63 = var43 * var4 + var5 * var41 >> 16; // L: 1053
								var43 = var5 * var43 - var41 * var4 >> 16; // L: 1054
								var41 = var63; // L: 1055
								var63 = var3 * var42 - var43 * var2 >> 16; // L: 1056
								var43 = var42 * var2 + var3 * var43 >> 16; // L: 1057
								field2973[var40] = var43 - var12; // L: 1059
								if (var43 >= 50) { // L: 1060
									modelViewportXs[var40] = var60 + var41 * Rasterizer3D.method5200() / var43; // L: 1061
									modelViewportYs[var40] = var62 + var63 * Rasterizer3D.method5200() / var43; // L: 1062
									field2972[var40] = WorldMapAreaData.method5039(var43); // L: 1063
								} else {
									modelViewportXs[var40] = -5000; // L: 1066
									var25 = true; // L: 1067
								}

								if (var27) { // L: 1069
									field2974[var40] = var41; // L: 1070
									field2959[var40] = var63; // L: 1071
									field2976[var40] = var43; // L: 1072
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9); // L: 1076
							} catch (Exception var59) { // L: 1078
							}

						}
					}
				}
			}
		}
	} // L: 1079
}
