import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ah")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("at")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class470 field2827;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class470 field2850;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class470 field2783;
	@ObfuscatedName("bu")
	static boolean[] field2816;
	@ObfuscatedName("br")
	static boolean[] field2817;
	@ObfuscatedName("bb")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("by")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bk")
	static float[] field2820;
	@ObfuscatedName("bt")
	static int[] field2821;
	@ObfuscatedName("bq")
	static int[] field2822;
	@ObfuscatedName("bi")
	static int[] field2823;
	@ObfuscatedName("bw")
	static int[] field2824;
	@ObfuscatedName("ba")
	static char[] field2826;
	@ObfuscatedName("bv")
	static char[][] field2843;
	@ObfuscatedName("bg")
	static int[] field2819;
	@ObfuscatedName("cb")
	static int[][] field2831;
	@ObfuscatedName("cj")
	static int[] field2830;
	@ObfuscatedName("cr")
	static int[] field2801;
	@ObfuscatedName("cy")
	static int[] field2835;
	@ObfuscatedName("cg")
	static int[] field2832;
	@ObfuscatedName("cl")
	static float[] field2807;
	@ObfuscatedName("cw")
	static int[] field2795;
	@ObfuscatedName("ci")
	static int[] field2834;
	@ObfuscatedName("ct")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cm")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cd")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cc")
	static boolean field2840;
	@ObfuscatedName("cp")
	static int[] field2814;
	@ObfuscatedName("cu")
	static int[] field2844;
	@ObfuscatedName("ck")
	static int[] field2793;
	@ObfuscatedName("cs")
	static int[] field2846;
	@ObfuscatedName("cz")
	static final float field2849;
	@ObfuscatedName("aw")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ad")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("al")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("as")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ag")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ai")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ax")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ar")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("aj")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("au")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ay")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ap")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("av")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("aa")
	byte[] field2797;
	@ObfuscatedName("aq")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("am")
	public byte field2829;
	@ObfuscatedName("ac")
	public int field2845;
	@ObfuscatedName("ae")
	int[] field2854;
	@ObfuscatedName("ak")
	int[] field2802;
	@ObfuscatedName("bp")
	int[] field2803;
	@ObfuscatedName("bz")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bc")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bf")
	int[][] field2841;
	@ObfuscatedName("be")
	int[][] field2842;
	@ObfuscatedName("bn")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bd")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bo")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bx")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bl")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bh")
	@Export("radius")
	int radius;
	@ObfuscatedName("bs")
	HashMap field2782;
	@ObfuscatedName("ch")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cf")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cx")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cq")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ca")
	public short field2784;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2827 = new class470(); // L: 17
		field2850 = new class470(); // L: 18
		field2783 = new class470(); // L: 19
		field2816 = new boolean[6500]; // L: 55
		field2817 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2820 = new float[6500]; // L: 59
		field2821 = new int[6500]; // L: 60
		field2822 = new int[6500]; // L: 61
		field2823 = new int[6500]; // L: 62
		field2824 = new int[6500]; // L: 63
		field2826 = new char[6000]; // L: 65
		field2843 = new char[6000][512]; // L: 66
		field2819 = new int[12]; // L: 67
		field2831 = new int[12][2000]; // L: 68
		field2830 = new int[2000]; // L: 69
		field2801 = new int[2000]; // L: 70
		field2832 = new int[12]; // L: 71
		field2795 = new int[10]; // L: 72
		field2834 = new int[10]; // L: 73
		field2835 = new int[10]; // L: 74
		field2807 = new float[10]; // L: 75
		field2840 = true; // L: 79
		field2814 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field2844 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2793 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2846 = Rasterizer3D.field2609; // L: 85
		field2849 = class103.method2674(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2829 = 0;
		this.field2845 = 0;
		this.isSingleTile = false;
		this.field2782 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2829 = 0;
		this.field2845 = 0;
		this.isSingleTile = false;
		this.field2782 = new HashMap();
		this.method5023(var1, var2, var3); // L: 121
		this.field2829 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2845 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Ljn;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2829 = 0; // L: 35
		this.field2845 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2782 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2845 = 0; // L: 100
		this.field2829 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2845 += var4.field2845; // L: 107
				if (this.field2829 == -1) { // L: 108
					this.field2829 = var4.field2829;
				}
			}
		}

		this.method5023(this.verticesCount, this.indicesCount, this.field2845); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2845 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method5058(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("az")
	void method5023(int var1, int var2, int var3) {
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
			this.field2854 = new int[var3]; // L: 139
			this.field2802 = new int[var3]; // L: 140
			this.field2803 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	void method5020(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2829 != var1.field2829)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2829); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2797 == null && var1.field2797 != null) { // L: 159
			this.field2797 = new byte[var2]; // L: 160
			Arrays.fill(this.field2797, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	public void method5058(Model var1) {
		if (var1 != null) { // L: 166
			this.method5020(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2829; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2797 != null) { // L: 186
					if (var1.field2797 != null && var1.field2797[var2] != -1) { // L: 187
						this.field2797[this.indicesCount] = (byte)(var1.field2797[var2] + this.field2845); // L: 188
					} else {
						this.field2797[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2845; ++var2) { // L: 196
				this.field2854[this.field2845] = this.verticesCount + var1.field2854[var2]; // L: 197
				this.field2802[this.field2845] = this.verticesCount + var1.field2802[var2]; // L: 198
				this.field2803[this.field2845] = this.verticesCount + var1.field2803[var2]; // L: 199
				++this.field2845; // L: 200
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 202
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 203
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 204
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 205
				++this.verticesCount; // L: 206
			}

		}
	} // L: 167 208

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljn;"
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
					var11.field2845 = this.field2845; // L: 227
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
					var11.field2797 = this.field2797; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2829 = this.field2829; // L: 240
					var11.field2854 = this.field2854; // L: 241
					var11.field2802 = this.field2802; // L: 242
					var11.field2803 = this.field2803; // L: 243
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 288
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 289
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	public Model method5035(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZLjn;[B)Ljn;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2845 = this.field2845; // L: 300
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
		var2.field2797 = this.field2797; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2829 = this.field2829; // L: 330
		var2.field2854 = this.field2854; // L: 331
		var2.field2802 = this.field2802; // L: 332
		var2.field2803 = this.field2803; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2841 = this.field2841; // L: 336
		var2.field2842 = this.field2842; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("as")
	void method4954(int var1) {
		if (!this.field2782.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field2844[var1]; // L: 352
			int var9 = field2814[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var11 = class206.method3857(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 355
				int var12 = this.verticesY[var10]; // L: 356
				int var14 = this.verticesX[var10]; // L: 358
				int var15 = this.verticesZ[var10]; // L: 359
				int var13 = var8 * var15 - var14 * var9 >> 16; // L: 361
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

			class247 var17 = new class247((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 371
			boolean var18 = true; // L: 372
			if (var17.field2710 < 32) { // L: 373
				var17.field2710 = 32;
			}

			if (var17.field2712 < 32) { // L: 374
				var17.field2712 = 32;
			}

			if (this.isSingleTile) { // L: 375
				boolean var19 = true; // L: 376
				var17.field2710 += 8; // L: 377
				var17.field2712 += 8; // L: 378
			}

			this.field2782.put(var1, var17); // L: 380
		}
	} // L: 381

	@ObfuscatedName("ag")
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

	@ObfuscatedName("ai")
	void method4956() {
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
	public int method4947() {
		this.calculateBoundsCylinder(); // L: 420
		return this.xzRadius; // L: 421
	}

	@ObfuscatedName("ar")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 425
		this.field2782.clear(); // L: 426
	} // L: 427

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V"
	)
	public void method4960(class138 var1, int var2) {
		Skeleton var3 = var1.field1635; // L: 445
		class243 var4 = var3.method4697(); // L: 446
		if (var4 != null) { // L: 447
			var3.method4697().method4651(var1, var2); // L: 448
			this.method4962(var3.method4697(), var1.method3091()); // L: 449
		}

		if (var1.method3089()) { // L: 451
			this.method4961(var1, var2); // L: 452
		}

		this.resetBounds(); // L: 454
	} // L: 455

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V"
	)
	void method4961(class138 var1, int var2) {
		Skeleton var3 = var1.field1635; // L: 458

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 459
			int var5 = var3.transformTypes[var4]; // L: 460
			if (var5 == 5 && var1.field1633 != null && var1.field1633[var4] != null && var1.field1633[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 461 462
				class131 var6 = var1.field1633[var4][0]; // L: 463
				int[] var7 = var3.labels[var4]; // L: 464
				int var8 = var7.length; // L: 465

				for (int var9 = 0; var9 < var8; ++var9) { // L: 466
					int var10 = var7[var9]; // L: 467
					if (var10 < this.faceLabelsAlpha.length) { // L: 468
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 469

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 470
							int var13 = var11[var12]; // L: 471
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3025(var2) * 255.0F); // L: 472
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V"
	)
	void method4962(class243 var1, int var2) {
		this.method4982(var1, var2); // L: 486
	} // L: 488

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lja;ILja;I[I)V"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lfa;I[ZZZ)V"
	)
	public void method4964(Skeleton var1, class138 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class243 var7 = var1.method4697(); // L: 523
		if (var7 != null) { // L: 524
			var7.method4646(var2, var3, var4, var5); // L: 525
			if (var6) { // L: 526
				this.method4962(var7, var2.method3091()); // L: 527
			}
		}

		if (!var5 && var2.method3089()) { // L: 530
			this.method4961(var2, var3); // L: 531
		}

	} // L: 533

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lja;I[IZ)V"
	)
	public void method5060(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("am")
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
								var15 = field2814[var14]; // L: 620
								var16 = field2844[var14]; // L: 621
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 622
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 623
								this.verticesX[var11] = var17; // L: 624
							}

							if (var12 != 0) { // L: 626
								var15 = field2814[var12]; // L: 627
								var16 = field2844[var12]; // L: 628
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 629
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 630
								this.verticesY[var11] = var17; // L: 631
							}

							if (var13 != 0) { // L: 633
								var15 = field2814[var13]; // L: 634
								var16 = field2844[var13]; // L: 635
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

	@ObfuscatedName("ac")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 690
			int var2 = this.verticesX[var1]; // L: 691
			this.verticesX[var1] = this.verticesZ[var1]; // L: 692
			this.verticesZ[var1] = -var2; // L: 693
		}

		this.resetBounds(); // L: 695
	} // L: 696

	@ObfuscatedName("ae")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 699
			this.verticesX[var1] = -this.verticesX[var1]; // L: 700
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 701
		}

		this.resetBounds(); // L: 703
	} // L: 704

	@ObfuscatedName("ak")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 707
			int var2 = this.verticesZ[var1]; // L: 708
			this.verticesZ[var1] = this.verticesX[var1]; // L: 709
			this.verticesX[var1] = -var2; // L: 710
		}

		this.resetBounds(); // L: 712
	} // L: 713

	@ObfuscatedName("bp")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2814[var1]; // L: 716
		int var3 = field2844[var1]; // L: 717

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 718
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 719
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 720
			this.verticesY[var4] = var5; // L: 721
		}

		this.resetBounds(); // L: 723
	} // L: 724

	@ObfuscatedName("bz")
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

	@ObfuscatedName("bc")
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
	public final void method5031(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 745
			this.method4956();
		}

		int var8 = Rasterizer3D.method4567(); // L: 746
		int var9 = Rasterizer3D.method4568(); // L: 747
		int var10 = field2814[var1]; // L: 748
		int var11 = field2844[var1]; // L: 749
		int var12 = field2814[var2]; // L: 750
		int var13 = field2844[var2]; // L: 751
		int var14 = field2814[var3]; // L: 752
		int var15 = field2844[var3]; // L: 753
		int var16 = field2814[var4]; // L: 754
		int var17 = field2844[var4]; // L: 755
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
			field2821[var19] = var22 - var18; // L: 782
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method4620() / var22; // L: 783
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method4620() / var22; // L: 784
			field2820[var19] = class103.method2674(var22); // L: 785
			if (this.field2845 > 0) { // L: 786
				field2822[var19] = var20; // L: 787
				field2823[var19] = var23; // L: 788
				field2824[var19] = var22; // L: 789
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 793
		} catch (Exception var25) { // L: 795
		}

	} // L: 796

	@ObfuscatedName("be")
	public final void method4974(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 799
			this.method4956();
		}

		int var9 = Rasterizer3D.method4567(); // L: 800
		int var10 = Rasterizer3D.method4568(); // L: 801
		int var11 = field2814[var1]; // L: 802
		int var12 = field2844[var1]; // L: 803
		int var13 = field2814[var2]; // L: 804
		int var14 = field2844[var2]; // L: 805
		int var15 = field2814[var3]; // L: 806
		int var16 = field2844[var3]; // L: 807
		int var17 = field2814[var4]; // L: 808
		int var18 = field2844[var4]; // L: 809
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
			field2821[var20] = var23 - var19; // L: 836
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method4620() / var8; // L: 837
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method4620() / var8; // L: 838
			field2820[var20] = class103.method2674(var8); // L: 839
			if (this.field2845 > 0) { // L: 840
				field2822[var20] = var21; // L: 841
				field2823[var20] = var24; // L: 842
				field2824[var20] = var23; // L: 843
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 847
		} catch (Exception var26) { // L: 849
		}

	} // L: 850

	@ObfuscatedName("bn")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 984
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 985
				field2826[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 986

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 987
				if (this.faceColors3[var7] != -2) { // L: 988
					var8 = this.indices1[var7]; // L: 989
					var9 = this.indices2[var7]; // L: 990
					var10 = this.indices3[var7]; // L: 991
					var11 = modelViewportXs[var8]; // L: 992
					var12 = modelViewportXs[var9]; // L: 993
					var28 = modelViewportXs[var10]; // L: 994
					int var31;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 995
						if (var2 && ArchiveDiskActionHandler.method6905(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1021
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1024
							var2 = false; // L: 1026
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1028
							field2817[var7] = false; // L: 1029
							var31 = Rasterizer3D.method4574(); // L: 1030
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var31 && var12 <= var31 && var28 <= var31) { // L: 1031
								field2816[var7] = false; // L: 1032
							} else {
								field2816[var7] = true;
							}

							var15 = (field2821[var8] + field2821[var9] + field2821[var10]) / 3 + this.radius; // L: 1033
							field2843[var15][field2826[var15]++] = var7; // L: 1034
						}
					} else {
						var31 = field2822[var8]; // L: 996
						var15 = field2822[var9]; // L: 997
						var16 = field2822[var10]; // L: 998
						int var32 = field2823[var8]; // L: 999
						var18 = field2823[var9]; // L: 1000
						int var19 = field2823[var10]; // L: 1001
						int var20 = field2824[var8]; // L: 1002
						int var21 = field2824[var9]; // L: 1003
						int var22 = field2824[var10]; // L: 1004
						var31 -= var15; // L: 1005
						var16 -= var15; // L: 1006
						var32 -= var18; // L: 1007
						var19 -= var18; // L: 1008
						var20 -= var21; // L: 1009
						var22 -= var21; // L: 1010
						int var23 = var32 * var22 - var20 * var19; // L: 1011
						int var24 = var20 * var16 - var31 * var22; // L: 1012
						int var25 = var31 * var19 - var32 * var16; // L: 1013
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1014
							field2817[var7] = true; // L: 1015
							int var26 = (field2821[var8] + field2821[var9] + field2821[var10]) / 3 + this.radius; // L: 1016
							field2843[var26][field2826[var26]++] = var7; // L: 1017
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1038
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1039
					var34 = field2826[var33]; // L: 1040
					if (var34 > 0) { // L: 1041
						var27 = field2843[var33]; // L: 1042

						for (var10 = 0; var10 < var34; ++var10) { // L: 1043
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1048
					field2819[var33] = 0; // L: 1049
					field2832[var33] = 0; // L: 1050
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1052
					var34 = field2826[var33]; // L: 1053
					if (var34 > 0) { // L: 1054
						var27 = field2843[var33]; // L: 1055

						for (var10 = 0; var10 < var34; ++var10) { // L: 1056
							char var35 = var27[var10]; // L: 1057
							byte var36 = this.faceRenderPriorities[var35]; // L: 1058
							var28 = field2819[var36]++; // L: 1059
							field2831[var36][var28] = var35; // L: 1060
							if (var36 < 10) { // L: 1061
								int[] var37 = field2832;
								var37[var36] += var33;
							} else if (var36 == 10) { // L: 1062
								field2830[var28] = var33;
							} else {
								field2801[var28] = var33; // L: 1063
							}
						}
					}
				}

				var33 = 0; // L: 1067
				if (field2819[1] > 0 || field2819[2] > 0) { // L: 1068
					var33 = (field2832[1] + field2832[2]) / (field2819[1] + field2819[2]);
				}

				var8 = 0; // L: 1069
				if (field2819[3] > 0 || field2819[4] > 0) { // L: 1070
					var8 = (field2832[3] + field2832[4]) / (field2819[3] + field2819[4]);
				}

				var9 = 0; // L: 1071
				if (field2819[6] > 0 || field2819[8] > 0) { // L: 1072
					var9 = (field2832[8] + field2832[6]) / (field2819[8] + field2819[6]);
				}

				var11 = 0; // L: 1074
				var12 = field2819[10]; // L: 1075
				int[] var13 = field2831[10]; // L: 1076
				int[] var14 = field2830; // L: 1077
				if (var11 == var12) { // L: 1078
					var11 = 0; // L: 1079
					var12 = field2819[11]; // L: 1080
					var13 = field2831[11]; // L: 1081
					var14 = field2801; // L: 1082
				}

				if (var11 < var12) { // L: 1084
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1085
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1086
					while (var15 == 0 && var10 > var33) { // L: 1087
						this.drawFace(var13[var11++]); // L: 1088
						if (var11 == var12 && var13 != field2831[11]) { // L: 1089
							var11 = 0; // L: 1090
							var12 = field2819[11]; // L: 1091
							var13 = field2831[11]; // L: 1092
							var14 = field2801; // L: 1093
						}

						if (var11 < var12) { // L: 1095
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1096
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1098
						this.drawFace(var13[var11++]); // L: 1099
						if (var11 == var12 && var13 != field2831[11]) { // L: 1100
							var11 = 0; // L: 1101
							var12 = field2819[11]; // L: 1102
							var13 = field2831[11]; // L: 1103
							var14 = field2801; // L: 1104
						}

						if (var11 < var12) { // L: 1106
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1107
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1109
						this.drawFace(var13[var11++]); // L: 1110
						if (var11 == var12 && var13 != field2831[11]) { // L: 1111
							var11 = 0; // L: 1112
							var12 = field2819[11]; // L: 1113
							var13 = field2831[11]; // L: 1114
							var14 = field2801; // L: 1115
						}

						if (var11 < var12) { // L: 1117
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1118
						}
					}

					var16 = field2819[var15]; // L: 1120
					int[] var17 = field2831[var15]; // L: 1121

					for (var18 = 0; var18 < var16; ++var18) { // L: 1122
						this.drawFace(var17[var18]); // L: 1123
					}
				}

				while (var10 != -1000) { // L: 1126
					this.drawFace(var13[var11++]); // L: 1127
					if (var11 == var12 && var13 != field2831[11]) { // L: 1128
						var11 = 0; // L: 1129
						var13 = field2831[11]; // L: 1130
						var12 = field2819[11]; // L: 1131
						var14 = field2801; // L: 1132
					}

					if (var11 < var12) { // L: 1134
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1135
					}
				}

			}
		}
	} // L: 1046 1137

	@ObfuscatedName("bd")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2817[var1]) { // L: 1140
			this.method4980(var1); // L: 1141
		} else {
			int var2 = this.indices1[var1]; // L: 1144
			int var3 = this.indices2[var1]; // L: 1145
			int var4 = this.indices3[var1]; // L: 1146
			Rasterizer3D.field2611.field2893 = field2816[var1]; // L: 1147
			if (this.faceAlphas == null) { // L: 1148
				Rasterizer3D.field2611.field2886 = 0; // L: 1149
			} else {
				Rasterizer3D.field2611.field2886 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1152
			}

			this.method4979(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2820[var2], field2820[var3], field2820[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1154
		}
	} // L: 1142 1155

	@ObfuscatedName("bo")
	boolean method4978(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2784; // L: 1158
	}

	@ObfuscatedName("bx")
	final void method4979(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1162
			int var15;
			int var16;
			int var18;
			if (this.field2797 != null && this.field2797[var1] != -1) { // L: 1181
				int var17 = this.field2797[var1] & 255; // L: 1182
				var18 = this.field2854[var17]; // L: 1183
				var15 = this.field2802[var17]; // L: 1184
				var16 = this.field2803[var17]; // L: 1185
			} else {
				var18 = this.indices1[var1]; // L: 1188
				var15 = this.indices2[var1]; // L: 1189
				var16 = this.indices3[var1]; // L: 1190
			}

			if (this.faceColors3[var1] == -1) { // L: 1192
				Rasterizer3D.method4581(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2822[var18], field2822[var15], field2822[var16], field2823[var18], field2823[var15], field2823[var16], field2824[var18], field2824[var15], field2824[var16], this.faceTextures[var1]); // L: 1193
			} else {
				Rasterizer3D.method4581(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2822[var18], field2822[var15], field2822[var16], field2823[var18], field2823[var15], field2823[var16], field2824[var18], field2824[var15], field2824[var16], this.faceTextures[var1]); // L: 1196
			}
		} else {
			boolean var14 = this.method4978(var1); // L: 1163
			if (this.faceColors3[var1] == -1 && var14) { // L: 1164
				Rasterizer3D.method4634(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2793[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1165
			} else if (this.faceColors3[var1] == -1) { // L: 1167
				Rasterizer3D.method4582(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2793[this.faceColors1[var1]]); // L: 1168
			} else if (var14) { // L: 1170
				Rasterizer3D.method4607(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1171
			} else {
				Rasterizer3D.method4561(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1174
			}
		}

	} // L: 1199

	@ObfuscatedName("bl")
	final void method4980(int var1) {
		int var2 = Rasterizer3D.method4567(); // L: 1202
		int var3 = Rasterizer3D.method4568(); // L: 1203
		int var4 = 0; // L: 1204
		int var5 = this.indices1[var1]; // L: 1205
		int var6 = this.indices2[var1]; // L: 1206
		int var7 = this.indices3[var1]; // L: 1207
		int var8 = field2824[var5]; // L: 1208
		int var9 = field2824[var6]; // L: 1209
		int var10 = field2824[var7]; // L: 1210
		if (this.faceAlphas == null) { // L: 1211
			Rasterizer3D.field2611.field2886 = 0;
		} else {
			Rasterizer3D.field2611.field2886 = this.faceAlphas[var1] & 255; // L: 1212
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1213
			field2795[var4] = modelViewportXs[var5]; // L: 1214
			field2834[var4] = modelViewportYs[var5]; // L: 1215
			field2807[var4] = field2820[var7]; // L: 1216
			field2835[var4++] = this.faceColors1[var1]; // L: 1217
		} else {
			var11 = field2822[var5]; // L: 1220
			var12 = field2823[var5]; // L: 1221
			var13 = this.faceColors1[var1]; // L: 1222
			if (var10 >= 50) { // L: 1223
				var14 = field2846[var10 - var8] * (50 - var8); // L: 1224
				field2795[var4] = var2 + (var11 + ((field2822[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1225
				field2834[var4] = var3 + (var12 + ((field2823[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1226
				field2807[var4] = field2849; // L: 1227
				field2835[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1228
			}

			if (var9 >= 50) { // L: 1230
				var14 = field2846[var9 - var8] * (50 - var8); // L: 1231
				field2795[var4] = var2 + (var11 + ((field2822[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1232
				field2834[var4] = var3 + (var12 + ((field2823[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1233
				field2807[var4] = field2849; // L: 1234
				field2835[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1235
			}
		}

		if (var9 >= 50) { // L: 1238
			field2795[var4] = modelViewportXs[var6]; // L: 1239
			field2834[var4] = modelViewportYs[var6]; // L: 1240
			field2807[var4] = field2820[var7]; // L: 1241
			field2835[var4++] = this.faceColors2[var1]; // L: 1242
		} else {
			var11 = field2822[var6]; // L: 1245
			var12 = field2823[var6]; // L: 1246
			var13 = this.faceColors2[var1]; // L: 1247
			if (var8 >= 50) { // L: 1248
				var14 = field2846[var8 - var9] * (50 - var9); // L: 1249
				field2795[var4] = var2 + (var11 + ((field2822[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1250
				field2834[var4] = var3 + (var12 + ((field2823[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1251
				field2807[var4] = field2849; // L: 1252
				field2835[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1253
			}

			if (var10 >= 50) { // L: 1255
				var14 = field2846[var10 - var9] * (50 - var9); // L: 1256
				field2795[var4] = var2 + (var11 + ((field2822[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1257
				field2834[var4] = var3 + (var12 + ((field2823[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1258
				field2835[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1259
			}
		}

		if (var10 >= 50) { // L: 1262
			field2795[var4] = modelViewportXs[var7]; // L: 1263
			field2834[var4] = modelViewportYs[var7]; // L: 1264
			field2807[var4] = field2820[var7]; // L: 1265
			field2835[var4++] = this.faceColors3[var1]; // L: 1266
		} else {
			var11 = field2822[var7]; // L: 1269
			var12 = field2823[var7]; // L: 1270
			var13 = this.faceColors3[var1]; // L: 1271
			if (var9 >= 50) { // L: 1272
				var14 = field2846[var9 - var10] * (50 - var10); // L: 1273
				field2795[var4] = var2 + (var11 + ((field2822[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1274
				field2834[var4] = var3 + (var12 + ((field2823[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1275
				field2807[var4] = field2849; // L: 1276
				field2835[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1277
			}

			if (var8 >= 50) { // L: 1279
				var14 = field2846[var8 - var10] * (50 - var10); // L: 1280
				field2795[var4] = var2 + (var11 + ((field2822[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1281
				field2834[var4] = var3 + (var12 + ((field2823[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4620() / 50; // L: 1282
				field2807[var4] = field2849; // L: 1283
				field2835[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1284
			}
		}

		var11 = field2795[0]; // L: 1287
		var12 = field2795[1]; // L: 1288
		var13 = field2795[2]; // L: 1289
		var14 = field2834[0]; // L: 1290
		int var15 = field2834[1]; // L: 1291
		int var16 = field2834[2]; // L: 1292
		float var17 = field2807[0]; // L: 1293
		float var18 = field2807[1]; // L: 1294
		float var19 = field2807[2]; // L: 1295
		Rasterizer3D.field2611.field2893 = false; // L: 1296
		int var20 = Rasterizer3D.method4574(); // L: 1297
		if (var4 == 3) { // L: 1298
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1299
				Rasterizer3D.field2611.field2893 = true;
			}

			this.method4979(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2]); // L: 1300
		}

		if (var4 == 4) { // L: 1302
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2795[3] < 0 || field2795[3] > var20) { // L: 1303
				Rasterizer3D.field2611.field2893 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1304
				int var23;
				int var25;
				if (this.field2797 != null && this.field2797[var1] != -1) { // L: 1329
					int var24 = this.field2797[var1] & 255; // L: 1330
					var25 = this.field2854[var24]; // L: 1331
					var22 = this.field2802[var24]; // L: 1332
					var23 = this.field2803[var24]; // L: 1333
				} else {
					var25 = var5; // L: 1336
					var22 = var6; // L: 1337
					var23 = var7; // L: 1338
				}

				short var26 = this.faceTextures[var1]; // L: 1340
				if (this.faceColors3[var1] == -1) { // L: 1341
					Rasterizer3D.method4581(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26); // L: 1342
					Rasterizer3D.method4581(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26); // L: 1343
				} else {
					Rasterizer3D.method4581(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26); // L: 1346
					Rasterizer3D.method4581(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], field2835[0], field2835[2], field2835[3], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26); // L: 1347
				}
			} else {
				boolean var21 = this.method4978(var1); // L: 1305
				if (this.faceColors3[var1] == -1 && var21) { // L: 1306
					var22 = field2793[this.faceColors1[var1]]; // L: 1307
					Rasterizer3D.method4634(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1308
					Rasterizer3D.method4634(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1309
				} else if (this.faceColors3[var1] == -1) { // L: 1311
					var22 = field2793[this.faceColors1[var1]]; // L: 1312
					Rasterizer3D.method4582(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1313
					Rasterizer3D.method4582(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], var22); // L: 1314
				} else if (var21) { // L: 1316
					Rasterizer3D.method4607(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1317
					Rasterizer3D.method4607(var14, var16, field2834[3], var11, var13, field2795[3], 0.0F, 0.0F, 0.0F, field2835[0], field2835[2], field2835[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1318
				} else {
					Rasterizer3D.method4561(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2]); // L: 1321
					Rasterizer3D.method4561(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], field2835[0], field2835[2], field2835[3]); // L: 1322
				}
			}
		}

	} // L: 1351

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILsq;)V"
	)
	void method4981(int var1, class470 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1354
		float var4 = (float)(-this.verticesY[var1]); // L: 1355
		float var5 = (float)(-this.verticesZ[var1]); // L: 1356
		float var6 = 1.0F; // L: 1357
		this.verticesX[var1] = (int)(var2.field4872[0] * var3 + var2.field4872[4] * var4 + var2.field4872[8] * var5 + var2.field4872[12] * var6); // L: 1358
		this.verticesY[var1] = -((int)(var2.field4872[1] * var3 + var2.field4872[5] * var4 + var2.field4872[9] * var5 + var2.field4872[13] * var6)); // L: 1359
		this.verticesZ[var1] = -((int)(var2.field4872[2] * var3 + var2.field4872[6] * var4 + var2.field4872[10] * var5 + var2.field4872[14] * var6)); // L: 1360
	} // L: 1361

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V"
	)
	void method4982(class243 var1, int var2) {
		if (this.field2841 != null) { // L: 1364
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1365
				int[] var4 = this.field2841[var3]; // L: 1366
				if (var4 != null && var4.length != 0) { // L: 1367
					int[] var5 = this.field2842[var3]; // L: 1368
					field2827.method8435(); // L: 1369

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1370
						int var7 = var4[var6]; // L: 1371
						class128 var8 = var1.method4643(var7); // L: 1372
						if (var8 != null) { // L: 1373
							field2850.method8406((float)var5[var6] / 255.0F); // L: 1374
							field2783.method8411(var8.method2967(var2)); // L: 1375
							field2783.method8414(field2850); // L: 1376
							field2827.method8413(field2783); // L: 1377
						}
					}

					this.method4981(var3, field2827); // L: 1379
				}
			}

		}
	} // L: 1381

	@ObfuscatedName("dd")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 853
			this.calculateBoundsCylinder();
		}

		this.method4954(var1); // L: 854
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 855
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 856
		int var13 = var3 * this.xzRadius >> 16; // L: 857
		int var14 = var12 + var13; // L: 858
		if (var14 > 50 && var12 < 3500) { // L: 859
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 860
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method4620(); // L: 861
			if (var16 / var14 < Rasterizer3D.method4570()) { // L: 862
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method4620(); // L: 863
				if (var17 / var14 > Rasterizer3D.method4569()) { // L: 864
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 865
					int var19 = var2 * this.xzRadius >> 16; // L: 866
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 867
					int var21 = (var18 + var20) * Rasterizer3D.method4620(); // L: 868
					if (var21 / var14 > Rasterizer3D.method4590()) { // L: 869
						int var22 = (var3 * super.height >> 16) + var19; // L: 870
						int var23 = (var18 - var22) * Rasterizer3D.method4620(); // L: 871
						if (var23 / var14 < Rasterizer3D.method4603()) { // L: 872
							int var24 = var13 + (var2 * super.height >> 16); // L: 873
							boolean var25 = false; // L: 874
							boolean var26 = false; // L: 875
							if (var12 - var24 <= 50) { // L: 876
								var26 = true;
							}

							boolean var27 = var26 || this.field2845 > 0; // L: 877
							int var28 = ViewportMouse.ViewportMouse_x; // L: 880
							int var30 = ViewportMouse.ViewportMouse_y; // L: 885
							boolean var32 = Player.method2361(); // L: 888
							boolean var33 = var9 != 0L && !class152.method3219(var9); // L: 891
							boolean var35 = false; // L: 894
							int var37;
							int var38;
							int var39;
							if (var33 && var32) { // L: 895
								boolean var36 = false; // L: 896
								if (field2840) { // L: 897
									var36 = KitDefinition.method3805(this, var1, var6, var7, var8); // L: 898
								} else {
									var37 = var12 - var13; // L: 901
									if (var37 <= 50) { // L: 902
										var37 = 50;
									}

									if (var15 > 0) { // L: 903
										var16 /= var14; // L: 904
										var17 /= var37; // L: 905
									} else {
										var17 /= var14; // L: 908
										var16 /= var37; // L: 909
									}

									if (var18 > 0) { // L: 911
										var23 /= var14; // L: 912
										var21 /= var37; // L: 913
									} else {
										var21 /= var14; // L: 916
										var23 /= var37; // L: 917
									}

									var38 = var28 - Rasterizer3D.method4567(); // L: 919
									var39 = var30 - Rasterizer3D.method4568(); // L: 920
									if (var38 > var16 && var38 < var17 && var39 > var23 && var39 < var21) { // L: 921
										var36 = true; // L: 922
									}
								}

								if (var36) { // L: 925
									if (this.isSingleTile) { // L: 926
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 929
									} else {
										var35 = true; // L: 932
									}
								}
							}

							int var49 = Rasterizer3D.method4567(); // L: 935
							var37 = Rasterizer3D.method4568(); // L: 936
							var38 = 0; // L: 937
							var39 = 0; // L: 938
							if (var1 != 0) { // L: 939
								var38 = field2814[var1]; // L: 940
								var39 = field2844[var1]; // L: 941
							}

							for (int var40 = 0; var40 < this.verticesCount; ++var40) { // L: 943
								int var41 = this.verticesX[var40]; // L: 944
								int var42 = this.verticesY[var40]; // L: 945
								int var43 = this.verticesZ[var40]; // L: 946
								int var44;
								if (var1 != 0) { // L: 947
									var44 = var43 * var38 + var41 * var39 >> 16; // L: 948
									var43 = var43 * var39 - var41 * var38 >> 16; // L: 949
									var41 = var44; // L: 950
								}

								var41 += var6; // L: 952
								var42 += var7; // L: 953
								var43 += var8; // L: 954
								var44 = var43 * var4 + var5 * var41 >> 16; // L: 955
								var43 = var5 * var43 - var41 * var4 >> 16; // L: 956
								var41 = var44; // L: 957
								var44 = var3 * var42 - var43 * var2 >> 16; // L: 958
								var43 = var42 * var2 + var3 * var43 >> 16; // L: 959
								field2821[var40] = var43 - var12; // L: 961
								if (var43 >= 50) { // L: 962
									modelViewportXs[var40] = var49 + var41 * Rasterizer3D.method4620() / var43; // L: 963
									modelViewportYs[var40] = var37 + var44 * Rasterizer3D.method4620() / var43; // L: 964
									field2820[var40] = class103.method2674(var43); // L: 965
								} else {
									modelViewportXs[var40] = -5000; // L: 968
									var25 = true; // L: 969
								}

								if (var27) { // L: 971
									field2822[var40] = var41; // L: 972
									field2823[var40] = var44; // L: 973
									field2824[var40] = var43; // L: 974
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9); // L: 978
							} catch (Exception var48) { // L: 980
							}

						}
					}
				}
			}
		}
	} // L: 981
}
