import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ae")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("at")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static class450 field2705;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static class450 field2706;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static class450 field2707;
	@ObfuscatedName("bp")
	static boolean[] field2740;
	@ObfuscatedName("bu")
	static boolean[] field2741;
	@ObfuscatedName("bo")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bb")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("br")
	static float[] field2748;
	@ObfuscatedName("be")
	static int[] field2745;
	@ObfuscatedName("bi")
	static int[] field2746;
	@ObfuscatedName("bz")
	static int[] field2747;
	@ObfuscatedName("bx")
	static int[] field2753;
	@ObfuscatedName("bw")
	static char[] field2750;
	@ObfuscatedName("bc")
	static char[][] field2751;
	@ObfuscatedName("bg")
	static int[] field2752;
	@ObfuscatedName("cw")
	static int[][] field2749;
	@ObfuscatedName("cf")
	static int[] field2754;
	@ObfuscatedName("cm")
	static int[] field2708;
	@ObfuscatedName("cn")
	static int[] field2756;
	@ObfuscatedName("cs")
	static int[] field2757;
	@ObfuscatedName("cx")
	static int[] field2758;
	@ObfuscatedName("cr")
	static int[] field2759;
	@ObfuscatedName("cd")
	static float[] field2762;
	@ObfuscatedName("ce")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cq")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cp")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cv")
	static boolean field2764;
	@ObfuscatedName("cu")
	static int[] field2767;
	@ObfuscatedName("ch")
	static int[] field2768;
	@ObfuscatedName("ci")
	static int[] field2769;
	@ObfuscatedName("ca")
	static int[] field2732;
	@ObfuscatedName("cj")
	static final float field2773;
	@ObfuscatedName("ap")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("aa")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("af")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ad")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("aq")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("al")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("an")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ar")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ab")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ag")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("am")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ax")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("ah")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("as")
	byte[] field2721;
	@ObfuscatedName("ay")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("aj")
	public byte field2723;
	@ObfuscatedName("av")
	public int field2724;
	@ObfuscatedName("aw")
	int[] field2725;
	@ObfuscatedName("ak")
	int[] field2726;
	@ObfuscatedName("bh")
	int[] field2719;
	@ObfuscatedName("bj")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bk")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bv")
	int[][] field2730;
	@ObfuscatedName("bt")
	int[][] field2755;
	@ObfuscatedName("bd")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("by")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bs")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bm")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bf")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bq")
	@Export("radius")
	int radius;
	@ObfuscatedName("ba")
	HashMap field2738;
	@ObfuscatedName("cz")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("ct")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cy")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("ck")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cc")
	public short field2778;

	static {
		Model_sharedSequenceModel = new Model(); // L: 13
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 14
		Model_sharedSpotAnimationModel = new Model(); // L: 15
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 16
		field2705 = new class450(); // L: 17
		field2706 = new class450(); // L: 18
		field2707 = new class450(); // L: 19
		field2740 = new boolean[6500]; // L: 55
		field2741 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2748 = new float[6500]; // L: 59
		field2745 = new int[6500]; // L: 60
		field2746 = new int[6500]; // L: 61
		field2747 = new int[6500]; // L: 62
		field2753 = new int[6500]; // L: 63
		field2750 = new char[6000]; // L: 65
		field2751 = new char[6000][512]; // L: 66
		field2752 = new int[12]; // L: 67
		field2749 = new int[12][2000]; // L: 68
		field2754 = new int[2000]; // L: 69
		field2708 = new int[2000]; // L: 70
		field2756 = new int[12]; // L: 71
		field2757 = new int[10]; // L: 72
		field2758 = new int[10]; // L: 73
		field2759 = new int[10]; // L: 74
		field2762 = new float[10]; // L: 75
		field2764 = true; // L: 79
		field2767 = Rasterizer3D.Rasterizer3D_sine; // L: 82
		field2768 = Rasterizer3D.Rasterizer3D_cosine; // L: 83
		field2769 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 84
		field2732 = Rasterizer3D.field2533; // L: 85
		field2773 = AbstractWorldMapIcon.method5550(50); // L: 88
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2723 = 0;
		this.field2724 = 0;
		this.isSingleTile = false;
		this.field2738 = new HashMap();
	} // L: 95

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2723 = 0;
		this.field2724 = 0;
		this.isSingleTile = false;
		this.field2738 = new HashMap();
		this.method4769(var1, var2, var3); // L: 121
		this.field2723 = var4; // L: 122
		this.verticesCount = 0; // L: 123
		this.indicesCount = 0; // L: 124
		this.field2724 = 0; // L: 125
	} // L: 126

	@ObfuscatedSignature(
		descriptor = "([Ljr;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 20
		this.indicesCount = 0; // L: 24
		this.field2723 = 0; // L: 35
		this.field2724 = 0; // L: 36
		this.isSingleTile = false; // L: 44
		this.field2738 = new HashMap(); // L: 50
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2724 = 0; // L: 100
		this.field2723 = -1; // L: 101

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 102
			Model var4 = var1[var3]; // L: 103
			if (var4 != null) { // L: 104
				this.verticesCount += var4.verticesCount; // L: 105
				this.indicesCount += var4.indicesCount; // L: 106
				this.field2724 += var4.field2724; // L: 107
				if (this.field2723 == -1) { // L: 108
					this.field2723 = var4.field2723;
				}
			}
		}

		this.method4769(this.verticesCount, this.indicesCount, this.field2724); // L: 111
		this.verticesCount = 0; // L: 112
		this.indicesCount = 0; // L: 113
		this.field2724 = 0; // L: 114

		for (var3 = 0; var3 < var2; ++var3) { // L: 115
			this.method4842(var1[var3]); // L: 116
		}

	} // L: 118

	@ObfuscatedName("au")
	void method4769(int var1, int var2, int var3) {
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
			this.field2725 = new int[var3]; // L: 139
			this.field2726 = new int[var3]; // L: 140
			this.field2719 = new int[var3]; // L: 141
		}

	} // L: 143

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljr;)V"
	)
	void method4871(Model var1) {
		int var2 = this.indices1.length; // L: 146
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2723 != var1.field2723)) { // L: 147
			this.faceRenderPriorities = new byte[var2]; // L: 148
			Arrays.fill(this.faceRenderPriorities, this.field2723); // L: 149
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 151
			this.faceAlphas = new byte[var2]; // L: 152
			Arrays.fill(this.faceAlphas, (byte)0); // L: 153
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 155
			this.faceTextures = new short[var2]; // L: 156
			Arrays.fill(this.faceTextures, (short)-1); // L: 157
		}

		if (this.field2721 == null && var1.field2721 != null) { // L: 159
			this.field2721 = new byte[var2]; // L: 160
			Arrays.fill(this.field2721, (byte)-1); // L: 161
		}

	} // L: 163

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljr;)V"
	)
	public void method4842(Model var1) {
		if (var1 != null) { // L: 166
			this.method4871(var1); // L: 169

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 170
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 171
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 172
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 173
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 174
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 175
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 176
				if (this.faceRenderPriorities != null) { // L: 177
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2723; // L: 178
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 180
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 181
				}

				if (this.faceTextures != null) { // L: 183
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 184
				}

				if (this.field2721 != null) { // L: 186
					if (var1.field2721 != null && var1.field2721[var2] != -1) { // L: 187
						this.field2721[this.indicesCount] = (byte)(var1.field2721[var2] + this.field2724); // L: 188
					} else {
						this.field2721[this.indicesCount] = -1; // L: 191
					}
				}

				++this.indicesCount; // L: 194
			}

			for (var2 = 0; var2 < var1.field2724; ++var2) { // L: 196
				this.field2725[this.field2724] = this.verticesCount + var1.field2725[var2]; // L: 197
				this.field2726[this.field2724] = this.verticesCount + var1.field2726[var2]; // L: 198
				this.field2719[this.field2724] = this.verticesCount + var1.field2719[var2]; // L: 199
				++this.field2724; // L: 200
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
		descriptor = "([[IIIIZI)Ljr;"
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
					var11.field2724 = this.field2724; // L: 227
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
					var11.field2721 = this.field2721; // L: 238
					var11.faceTextures = this.faceTextures; // L: 239
					var11.field2723 = this.field2723; // L: 240
					var11.field2725 = this.field2725; // L: 241
					var11.field2726 = this.field2726; // L: 242
					var11.field2719 = this.field2719; // L: 243
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljr;"
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
		descriptor = "(Z)Ljr;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 293
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 294
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZLjr;[B)Ljr;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 298
		var2.indicesCount = this.indicesCount; // L: 299
		var2.field2724 = this.field2724; // L: 300
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
		var2.field2721 = this.field2721; // L: 328
		var2.faceTextures = this.faceTextures; // L: 329
		var2.field2723 = this.field2723; // L: 330
		var2.field2725 = this.field2725; // L: 331
		var2.field2726 = this.field2726; // L: 332
		var2.field2719 = this.field2719; // L: 333
		var2.vertexLabels = this.vertexLabels; // L: 334
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 335
		var2.field2730 = this.field2730; // L: 336
		var2.field2755 = this.field2755; // L: 337
		var2.isSingleTile = this.isSingleTile; // L: 338
		var2.resetBounds(); // L: 339
		var2.overrideAmount = 0; // L: 340
		return var2; // L: 341
	}

	@ObfuscatedName("ad")
	void method4880(int var1) {
		if (!this.field2738.containsKey(var1)) { // L: 345
			int var2 = 0; // L: 346
			int var3 = 0; // L: 347
			int var4 = 0; // L: 348
			int var5 = 0; // L: 349
			int var6 = 0; // L: 350
			int var7 = 0; // L: 351
			int var8 = field2768[var1]; // L: 352
			int var9 = field2767[var1]; // L: 353

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 354
				int var12 = this.verticesX[var10]; // L: 356
				int var13 = this.verticesZ[var10]; // L: 357
				int var11 = var12 * var8 + var13 * var9 >> 16; // L: 359
				int var15 = this.verticesY[var10]; // L: 362
				int var17 = this.verticesX[var10]; // L: 364
				int var18 = this.verticesZ[var10]; // L: 365
				int var16 = var18 * var8 - var9 * var17 >> 16; // L: 367
				if (var11 < var2) { // L: 370
					var2 = var11;
				}

				if (var11 > var5) { // L: 371
					var5 = var11;
				}

				if (var15 < var3) { // L: 372
					var3 = var15;
				}

				if (var15 > var6) { // L: 373
					var6 = var15;
				}

				if (var16 < var4) { // L: 374
					var4 = var16;
				}

				if (var16 > var7) { // L: 375
					var7 = var16;
				}
			}

			class231 var20 = new class231((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 377
			boolean var21 = true; // L: 378
			if (var20.field2632 < 32) { // L: 379
				var20.field2632 = 32;
			}

			if (var20.field2634 < 32) { // L: 380
				var20.field2634 = 32;
			}

			if (this.isSingleTile) { // L: 381
				boolean var22 = true; // L: 382
				var20.field2632 += 8; // L: 383
				var20.field2634 += 8; // L: 384
			}

			this.field2738.put(var1, var20); // L: 386
		}
	} // L: 387

	@ObfuscatedName("aq")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 390
			this.boundsType = 1; // L: 391
			super.height = 0; // L: 392
			this.bottomY = 0; // L: 393
			this.xzRadius = 0; // L: 394

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 395
				int var2 = this.verticesX[var1]; // L: 396
				int var3 = this.verticesY[var1]; // L: 397
				int var4 = this.verticesZ[var1]; // L: 398
				if (-var3 > super.height) { // L: 399
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 400
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 401
				if (var5 > this.xzRadius) { // L: 402
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 404
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 405
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 406
		}
	} // L: 407

	@ObfuscatedName("al")
	void method4872() {
		if (this.boundsType != 2) { // L: 410
			this.boundsType = 2; // L: 411
			this.xzRadius = 0; // L: 412

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 413
				int var2 = this.verticesX[var1]; // L: 414
				int var3 = this.verticesY[var1]; // L: 415
				int var4 = this.verticesZ[var1]; // L: 416
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 417
				if (var5 > this.xzRadius) { // L: 418
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 420
			this.radius = this.xzRadius; // L: 421
			this.diameter = this.xzRadius + this.xzRadius; // L: 422
		}
	} // L: 423

	@ObfuscatedName("an")
	public int method4779() {
		this.calculateBoundsCylinder(); // L: 426
		return this.xzRadius; // L: 427
	}

	@ObfuscatedName("ar")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 431
		this.field2738.clear(); // L: 432
	} // L: 433

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 436
			if (var2 != -1) { // L: 437
				Animation var3 = var1.frames[var2]; // L: 438
				Skeleton var4 = var3.skeleton; // L: 439
				Model_transformTempX = 0; // L: 440
				Model_transformTempY = 0; // L: 441
				Model_transformTempZ = 0; // L: 442

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 443
					int var6 = var3.transformSkeletonLabels[var5]; // L: 444
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 445
				}

				this.resetBounds(); // L: 447
			}
		}
	} // L: 448

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfv;I)V"
	)
	public void method4782(class137 var1, int var2) {
		Skeleton var3 = var1.field1622; // L: 451
		class227 var4 = var3.method4517(); // L: 452
		if (var4 != null) { // L: 453
			var3.method4517().method4464(var1, var2); // L: 454
			this.method4883(var3.method4517(), var1.method3059()); // L: 455
		}

		if (var1.method3060()) { // L: 457
			this.method4783(var1, var2); // L: 458
		}

		this.resetBounds(); // L: 460
	} // L: 461

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfv;I)V"
	)
	void method4783(class137 var1, int var2) {
		Skeleton var3 = var1.field1622; // L: 464

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 465
			int var5 = var3.transformTypes[var4]; // L: 466
			if (var5 == 5 && var1.field1627 != null && var1.field1627[var4] != null && var1.field1627[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 467 468
				class130 var6 = var1.field1627[var4][0]; // L: 469
				int[] var7 = var3.labels[var4]; // L: 470
				int var8 = var7.length; // L: 471

				for (int var9 = 0; var9 < var8; ++var9) { // L: 472
					int var10 = var7[var9]; // L: 473
					if (var10 < this.faceLabelsAlpha.length) { // L: 474
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 475

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 476
							int var13 = var11[var12]; // L: 477
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2994(var2) * 255.0F); // L: 478
							if (var14 < 0) { // L: 479
								var14 = 0;
							} else if (var14 > 255) { // L: 480
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 481
						}
					}
				}
			}
		}

	} // L: 488

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lim;I)V"
	)
	void method4883(class227 var1, int var2) {
		this.method4848(var1, var2); // L: 492
	} // L: 494

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljt;ILjt;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 497
			if (var5 != null && var4 != -1) { // L: 498
				Animation var6 = var1.frames[var2]; // L: 502
				Animation var7 = var3.frames[var4]; // L: 503
				Skeleton var8 = var6.skeleton; // L: 504
				Model_transformTempX = 0; // L: 505
				Model_transformTempY = 0; // L: 506
				Model_transformTempZ = 0; // L: 507
				byte var9 = 0; // L: 508
				int var13 = var9 + 1; // L: 509
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 510
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 511 512
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 513
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 515
				Model_transformTempY = 0; // L: 516
				Model_transformTempZ = 0; // L: 517
				var9 = 0; // L: 518
				var13 = var9 + 1; // L: 519
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 520
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 521 522
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 523
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 525
			} else {
				this.animate(var1, var2); // L: 499
			}
		}
	} // L: 500 526

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Liu;Lfv;I[ZZZ)V"
	)
	public void method4786(Skeleton var1, class137 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class227 var7 = var1.method4517(); // L: 529
		if (var7 != null) { // L: 530
			var7.method4465(var2, var3, var4, var5); // L: 531
			if (var6) { // L: 532
				this.method4883(var7, var2.method3059()); // L: 533
			}
		}

		if (!var5 && var2.method3060()) { // L: 536
			this.method4783(var2, var3); // L: 537
		}

	} // L: 539

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I[IZ)V"
	)
	public void method4787(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 542
			this.animate(var1, var2); // L: 543
		} else {
			Animation var5 = var1.frames[var2]; // L: 546
			Skeleton var6 = var5.skeleton; // L: 547
			byte var7 = 0; // L: 548
			int var11 = var7 + 1; // L: 549
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 550
			Model_transformTempY = 0; // L: 551
			Model_transformTempZ = 0; // L: 552

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 553
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 554 555
				}

				if (var4) { // L: 556
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 557
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 560
				}
			}

		}
	} // L: 544 563

	@ObfuscatedName("aj")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 566
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 567
			var7 = 0; // L: 568
			Model_transformTempX = 0; // L: 569
			Model_transformTempY = 0; // L: 570
			Model_transformTempZ = 0; // L: 571

			for (var8 = 0; var8 < var6; ++var8) { // L: 572
				int var18 = var2[var8]; // L: 573
				if (var18 < this.vertexLabels.length) { // L: 574
					int[] var19 = this.vertexLabels[var18]; // L: 575

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 576
						var12 = var19[var11]; // L: 577
						Model_transformTempX += this.verticesX[var12]; // L: 578
						Model_transformTempY += this.verticesY[var12]; // L: 579
						Model_transformTempZ += this.verticesZ[var12]; // L: 580
						++var7; // L: 581
					}
				}
			}

			if (var7 > 0) { // L: 585
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 586
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 587
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 588
			} else {
				Model_transformTempX = var3; // L: 591
				Model_transformTempY = var4; // L: 592
				Model_transformTempZ = var5; // L: 593
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 597
				for (var7 = 0; var7 < var6; ++var7) { // L: 598
					var8 = var2[var7]; // L: 599
					if (var8 < this.vertexLabels.length) { // L: 600
						var9 = this.vertexLabels[var8]; // L: 601

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 602
							var11 = var9[var10]; // L: 603
							var10000 = this.verticesX; // L: 604
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 605
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 606
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 612
				for (var7 = 0; var7 < var6; ++var7) { // L: 613
					var8 = var2[var7]; // L: 614
					if (var8 < this.vertexLabels.length) { // L: 615
						var9 = this.vertexLabels[var8]; // L: 616

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 617
							var11 = var9[var10]; // L: 618
							var10000 = this.verticesX; // L: 619
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 620
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 621
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 622
							int var13 = (var4 & 255) * 8; // L: 623
							int var14 = (var5 & 255) * 8; // L: 624
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 625
								var15 = field2767[var14]; // L: 626
								var16 = field2768[var14]; // L: 627
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 628
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 629
								this.verticesX[var11] = var17; // L: 630
							}

							if (var12 != 0) { // L: 632
								var15 = field2767[var12]; // L: 633
								var16 = field2768[var12]; // L: 634
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 635
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 636
								this.verticesY[var11] = var17; // L: 637
							}

							if (var13 != 0) { // L: 639
								var15 = field2767[var13]; // L: 640
								var16 = field2768[var13]; // L: 641
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 642
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 643
								this.verticesX[var11] = var17; // L: 644
							}

							var10000 = this.verticesX; // L: 646
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 647
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 648
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 654
				for (var7 = 0; var7 < var6; ++var7) { // L: 655
					var8 = var2[var7]; // L: 656
					if (var8 < this.vertexLabels.length) { // L: 657
						var9 = this.vertexLabels[var8]; // L: 658

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 659
							var11 = var9[var10]; // L: 660
							var10000 = this.verticesX; // L: 661
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 662
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 663
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 664
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 665
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 666
							var10000 = this.verticesX; // L: 667
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 668
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 669
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 675
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 676
					for (var7 = 0; var7 < var6; ++var7) { // L: 677
						var8 = var2[var7]; // L: 678
						if (var8 < this.faceLabelsAlpha.length) { // L: 679
							var9 = this.faceLabelsAlpha[var8]; // L: 680

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 681
								var11 = var9[var10]; // L: 682
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 683
								if (var12 < 0) { // L: 684
									var12 = 0;
								} else if (var12 > 255) { // L: 685
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 686
							}
						}
					}
				}

			}
		}
	} // L: 595 610 652 673 691 693

	@ObfuscatedName("av")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 696
			int var2 = this.verticesX[var1]; // L: 697
			this.verticesX[var1] = this.verticesZ[var1]; // L: 698
			this.verticesZ[var1] = -var2; // L: 699
		}

		this.resetBounds(); // L: 701
	} // L: 702

	@ObfuscatedName("aw")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 705
			this.verticesX[var1] = -this.verticesX[var1]; // L: 706
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 707
		}

		this.resetBounds(); // L: 709
	} // L: 710

	@ObfuscatedName("ak")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 713
			int var2 = this.verticesZ[var1]; // L: 714
			this.verticesZ[var1] = this.verticesX[var1]; // L: 715
			this.verticesX[var1] = -var2; // L: 716
		}

		this.resetBounds(); // L: 718
	} // L: 719

	@ObfuscatedName("bh")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2767[var1]; // L: 722
		int var3 = field2768[var1]; // L: 723

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 724
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 725
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 726
			this.verticesY[var4] = var5; // L: 727
		}

		this.resetBounds(); // L: 729
	} // L: 730

	@ObfuscatedName("bj")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 733
			int[] var10000 = this.verticesX; // L: 734
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 735
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 736
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 738
	} // L: 739

	@ObfuscatedName("bk")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 742
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 743
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 744
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 745
		}

		this.resetBounds(); // L: 747
	} // L: 748

	@ObfuscatedName("bv")
	public final void method4785(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 751
			this.method4872();
		}

		int var8 = Rasterizer3D.method4380(); // L: 752
		int var9 = Rasterizer3D.method4381(); // L: 753
		int var10 = field2767[var1]; // L: 754
		int var11 = field2768[var1]; // L: 755
		int var12 = field2767[var2]; // L: 756
		int var13 = field2768[var2]; // L: 757
		int var14 = field2767[var3]; // L: 758
		int var15 = field2768[var3]; // L: 759
		int var16 = field2767[var4]; // L: 760
		int var17 = field2768[var4]; // L: 761
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 762

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 763
			int var20 = this.verticesX[var19]; // L: 764
			int var21 = this.verticesY[var19]; // L: 765
			int var22 = this.verticesZ[var19]; // L: 766
			int var23;
			if (var3 != 0) { // L: 767
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 768
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 769
				var20 = var23; // L: 770
			}

			if (var1 != 0) { // L: 772
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 773
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 774
				var21 = var23; // L: 775
			}

			if (var2 != 0) { // L: 777
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 778
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 779
				var20 = var23; // L: 780
			}

			var20 += var5; // L: 782
			var21 += var6; // L: 783
			var22 += var7; // L: 784
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 785
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 786
			field2745[var19] = var22 - var18; // L: 788
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method4386() / var22; // L: 789
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method4386() / var22; // L: 790
			field2748[var19] = AbstractWorldMapIcon.method5550(var22); // L: 791
			if (this.field2724 > 0) { // L: 792
				field2746[var19] = var20; // L: 793
				field2747[var19] = var23; // L: 794
				field2753[var19] = var22; // L: 795
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 799
		} catch (Exception var25) { // L: 801
		}

	} // L: 802

	@ObfuscatedName("bt")
	public final void method4796(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 805
			this.method4872();
		}

		int var9 = Rasterizer3D.method4380(); // L: 806
		int var10 = Rasterizer3D.method4381(); // L: 807
		int var11 = field2767[var1]; // L: 808
		int var12 = field2768[var1]; // L: 809
		int var13 = field2767[var2]; // L: 810
		int var14 = field2768[var2]; // L: 811
		int var15 = field2767[var3]; // L: 812
		int var16 = field2768[var3]; // L: 813
		int var17 = field2767[var4]; // L: 814
		int var18 = field2768[var4]; // L: 815
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 816

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 817
			int var21 = this.verticesX[var20]; // L: 818
			int var22 = this.verticesY[var20]; // L: 819
			int var23 = this.verticesZ[var20]; // L: 820
			int var24;
			if (var3 != 0) { // L: 821
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 822
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 823
				var21 = var24; // L: 824
			}

			if (var1 != 0) { // L: 826
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 827
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 828
				var22 = var24; // L: 829
			}

			if (var2 != 0) { // L: 831
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 832
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 833
				var21 = var24; // L: 834
			}

			var21 += var5; // L: 836
			var22 += var6; // L: 837
			var23 += var7; // L: 838
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 839
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 840
			field2745[var20] = var23 - var19; // L: 842
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method4386() / var8; // L: 843
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method4386() / var8; // L: 844
			field2748[var20] = AbstractWorldMapIcon.method5550(var8); // L: 845
			if (this.field2724 > 0) { // L: 846
				field2746[var20] = var21; // L: 847
				field2747[var20] = var24; // L: 848
				field2753[var20] = var23; // L: 849
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 853
		} catch (Exception var26) { // L: 855
		}

	} // L: 856

	@ObfuscatedName("bd")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1042
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1043
				field2750[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1044

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1045
				if (this.faceColors3[var7] != -2) { // L: 1046
					var8 = this.indices1[var7]; // L: 1047
					var9 = this.indices2[var7]; // L: 1048
					var10 = this.indices3[var7]; // L: 1049
					var11 = modelViewportXs[var8]; // L: 1050
					var12 = modelViewportXs[var9]; // L: 1051
					var28 = modelViewportXs[var10]; // L: 1052
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1053
						if (var2) { // L: 1079
							var15 = modelViewportYs[var8]; // L: 1081
							var16 = modelViewportYs[var9]; // L: 1082
							var29 = modelViewportYs[var10]; // L: 1083
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 1085
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var29) { // L: 1086
								var37 = false; // L: 1087
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1090
								if (var18 > var15 && var18 > var16 && var18 > var29) { // L: 1091
									var37 = false; // L: 1092
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1095
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1096
										var37 = false; // L: 1097
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1100
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1101
											var37 = false; // L: 1102
										} else {
											var37 = true; // L: 1105
										}
									}
								}
							}

							if (var37) { // L: 1107
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1110
								var2 = false; // L: 1112
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1115
							field2741[var7] = false; // L: 1116
							var30 = Rasterizer3D.method4387(); // L: 1117
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var30 && var12 <= var30 && var28 <= var30) { // L: 1118
								field2740[var7] = false; // L: 1119
							} else {
								field2740[var7] = true;
							}

							var15 = (field2745[var8] + field2745[var9] + field2745[var10]) / 3 + this.radius; // L: 1120
							field2751[var15][field2750[var15]++] = var7; // L: 1121
						}
					} else {
						var30 = field2746[var8]; // L: 1054
						var15 = field2746[var9]; // L: 1055
						var16 = field2746[var10]; // L: 1056
						var29 = field2747[var8]; // L: 1057
						var18 = field2747[var9]; // L: 1058
						int var19 = field2747[var10]; // L: 1059
						int var20 = field2753[var8]; // L: 1060
						int var21 = field2753[var9]; // L: 1061
						int var22 = field2753[var10]; // L: 1062
						var30 -= var15; // L: 1063
						var16 -= var15; // L: 1064
						var29 -= var18; // L: 1065
						var19 -= var18; // L: 1066
						var20 -= var21; // L: 1067
						var22 -= var21; // L: 1068
						int var23 = var29 * var22 - var20 * var19; // L: 1069
						int var24 = var20 * var16 - var30 * var22; // L: 1070
						int var25 = var30 * var19 - var29 * var16; // L: 1071
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1072
							field2741[var7] = true; // L: 1073
							int var26 = (field2745[var8] + field2745[var9] + field2745[var10]) / 3 + this.radius; // L: 1074
							field2751[var26][field2750[var26]++] = var7; // L: 1075
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1125
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1126
					var34 = field2750[var33]; // L: 1127
					if (var34 > 0) { // L: 1128
						var27 = field2751[var33]; // L: 1129

						for (var10 = 0; var10 < var34; ++var10) { // L: 1130
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1135
					field2752[var33] = 0; // L: 1136
					field2756[var33] = 0; // L: 1137
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1139
					var34 = field2750[var33]; // L: 1140
					if (var34 > 0) { // L: 1141
						var27 = field2751[var33]; // L: 1142

						for (var10 = 0; var10 < var34; ++var10) { // L: 1143
							char var35 = var27[var10]; // L: 1144
							byte var36 = this.faceRenderPriorities[var35]; // L: 1145
							var28 = field2752[var36]++; // L: 1146
							field2749[var36][var28] = var35; // L: 1147
							if (var36 < 10) { // L: 1148
								int[] var38 = field2756;
								var38[var36] += var33;
							} else if (var36 == 10) { // L: 1149
								field2754[var28] = var33;
							} else {
								field2708[var28] = var33; // L: 1150
							}
						}
					}
				}

				var33 = 0; // L: 1154
				if (field2752[1] > 0 || field2752[2] > 0) { // L: 1155
					var33 = (field2756[1] + field2756[2]) / (field2752[1] + field2752[2]);
				}

				var8 = 0; // L: 1156
				if (field2752[3] > 0 || field2752[4] > 0) { // L: 1157
					var8 = (field2756[3] + field2756[4]) / (field2752[3] + field2752[4]);
				}

				var9 = 0; // L: 1158
				if (field2752[6] > 0 || field2752[8] > 0) { // L: 1159
					var9 = (field2756[8] + field2756[6]) / (field2752[8] + field2752[6]);
				}

				var11 = 0; // L: 1161
				var12 = field2752[10]; // L: 1162
				int[] var13 = field2749[10]; // L: 1163
				int[] var14 = field2754; // L: 1164
				if (var11 == var12) { // L: 1165
					var11 = 0; // L: 1166
					var12 = field2752[11]; // L: 1167
					var13 = field2749[11]; // L: 1168
					var14 = field2708; // L: 1169
				}

				if (var11 < var12) { // L: 1171
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1172
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1173
					while (var15 == 0 && var10 > var33) { // L: 1174
						this.drawFace(var13[var11++]); // L: 1175
						if (var11 == var12 && var13 != field2749[11]) { // L: 1176
							var11 = 0; // L: 1177
							var12 = field2752[11]; // L: 1178
							var13 = field2749[11]; // L: 1179
							var14 = field2708; // L: 1180
						}

						if (var11 < var12) { // L: 1182
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1183
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1185
						this.drawFace(var13[var11++]); // L: 1186
						if (var11 == var12 && var13 != field2749[11]) { // L: 1187
							var11 = 0; // L: 1188
							var12 = field2752[11]; // L: 1189
							var13 = field2749[11]; // L: 1190
							var14 = field2708; // L: 1191
						}

						if (var11 < var12) { // L: 1193
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1194
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1196
						this.drawFace(var13[var11++]); // L: 1197
						if (var11 == var12 && var13 != field2749[11]) { // L: 1198
							var11 = 0; // L: 1199
							var12 = field2752[11]; // L: 1200
							var13 = field2749[11]; // L: 1201
							var14 = field2708; // L: 1202
						}

						if (var11 < var12) { // L: 1204
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1205
						}
					}

					var16 = field2752[var15]; // L: 1207
					int[] var17 = field2749[var15]; // L: 1208

					for (var18 = 0; var18 < var16; ++var18) { // L: 1209
						this.drawFace(var17[var18]); // L: 1210
					}
				}

				while (var10 != -1000) { // L: 1213
					this.drawFace(var13[var11++]); // L: 1214
					if (var11 == var12 && var13 != field2749[11]) { // L: 1215
						var11 = 0; // L: 1216
						var13 = field2749[11]; // L: 1217
						var12 = field2752[11]; // L: 1218
						var14 = field2708; // L: 1219
					}

					if (var11 < var12) { // L: 1221
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1222
					}
				}

			}
		}
	} // L: 1133 1224

	@ObfuscatedName("by")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2741[var1]) { // L: 1227
			this.method4802(var1); // L: 1228
		} else {
			int var2 = this.indices1[var1]; // L: 1231
			int var3 = this.indices2[var1]; // L: 1232
			int var4 = this.indices3[var1]; // L: 1233
			Rasterizer3D.field2536.field2816 = field2740[var1]; // L: 1234
			if (this.faceAlphas == null) { // L: 1235
				Rasterizer3D.field2536.field2823 = 0; // L: 1236
			} else {
				Rasterizer3D.field2536.field2823 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1239
			}

			this.method4869(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2748[var2], field2748[var3], field2748[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1241
		}
	} // L: 1229 1242

	@ObfuscatedName("bs")
	boolean method4800(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2778; // L: 1245
	}

	@ObfuscatedName("bm")
	final void method4869(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1249
			int var15;
			int var16;
			int var18;
			if (this.field2721 != null && this.field2721[var1] != -1) { // L: 1268
				int var17 = this.field2721[var1] & 255; // L: 1269
				var18 = this.field2725[var17]; // L: 1270
				var15 = this.field2726[var17]; // L: 1271
				var16 = this.field2719[var17]; // L: 1272
			} else {
				var18 = this.indices1[var1]; // L: 1275
				var15 = this.indices2[var1]; // L: 1276
				var16 = this.indices3[var1]; // L: 1277
			}

			if (this.faceColors3[var1] == -1) { // L: 1279
				Rasterizer3D.method4396(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2746[var18], field2746[var15], field2746[var16], field2747[var18], field2747[var15], field2747[var16], field2753[var18], field2753[var15], field2753[var16], this.faceTextures[var1]); // L: 1280
			} else {
				Rasterizer3D.method4396(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2746[var18], field2746[var15], field2746[var16], field2747[var18], field2747[var15], field2747[var16], field2753[var18], field2753[var15], field2753[var16], this.faceTextures[var1]); // L: 1283
			}
		} else {
			boolean var14 = this.method4800(var1); // L: 1250
			if (this.faceColors3[var1] == -1 && var14) { // L: 1251
				Rasterizer3D.method4453(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2769[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1252
			} else if (this.faceColors3[var1] == -1) { // L: 1254
				Rasterizer3D.method4455(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2769[this.faceColors1[var1]]); // L: 1255
			} else if (var14) { // L: 1257
				Rasterizer3D.method4447(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1258
			} else {
				Rasterizer3D.method4398(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1261
			}
		}

	} // L: 1286

	@ObfuscatedName("bf")
	final void method4802(int var1) {
		int var2 = Rasterizer3D.method4380(); // L: 1289
		int var3 = Rasterizer3D.method4381(); // L: 1290
		int var4 = 0; // L: 1291
		int var5 = this.indices1[var1]; // L: 1292
		int var6 = this.indices2[var1]; // L: 1293
		int var7 = this.indices3[var1]; // L: 1294
		int var8 = field2753[var5]; // L: 1295
		int var9 = field2753[var6]; // L: 1296
		int var10 = field2753[var7]; // L: 1297
		if (this.faceAlphas == null) { // L: 1298
			Rasterizer3D.field2536.field2823 = 0;
		} else {
			Rasterizer3D.field2536.field2823 = this.faceAlphas[var1] & 255; // L: 1299
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1300
			field2757[var4] = modelViewportXs[var5]; // L: 1301
			field2758[var4] = modelViewportYs[var5]; // L: 1302
			field2762[var4] = field2748[var7]; // L: 1303
			field2759[var4++] = this.faceColors1[var1]; // L: 1304
		} else {
			var11 = field2746[var5]; // L: 1307
			var12 = field2747[var5]; // L: 1308
			var13 = this.faceColors1[var1]; // L: 1309
			if (var10 >= 50) { // L: 1310
				var14 = field2732[var10 - var8] * (50 - var8); // L: 1311
				field2757[var4] = var2 + (var11 + ((field2746[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1312
				field2758[var4] = var3 + (var12 + ((field2747[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1313
				field2762[var4] = field2773; // L: 1314
				field2759[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1315
			}

			if (var9 >= 50) { // L: 1317
				var14 = field2732[var9 - var8] * (50 - var8); // L: 1318
				field2757[var4] = var2 + (var11 + ((field2746[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1319
				field2758[var4] = var3 + (var12 + ((field2747[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1320
				field2762[var4] = field2773; // L: 1321
				field2759[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1322
			}
		}

		if (var9 >= 50) { // L: 1325
			field2757[var4] = modelViewportXs[var6]; // L: 1326
			field2758[var4] = modelViewportYs[var6]; // L: 1327
			field2762[var4] = field2748[var7]; // L: 1328
			field2759[var4++] = this.faceColors2[var1]; // L: 1329
		} else {
			var11 = field2746[var6]; // L: 1332
			var12 = field2747[var6]; // L: 1333
			var13 = this.faceColors2[var1]; // L: 1334
			if (var8 >= 50) { // L: 1335
				var14 = field2732[var8 - var9] * (50 - var9); // L: 1336
				field2757[var4] = var2 + (var11 + ((field2746[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1337
				field2758[var4] = var3 + (var12 + ((field2747[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1338
				field2762[var4] = field2773; // L: 1339
				field2759[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1340
			}

			if (var10 >= 50) { // L: 1342
				var14 = field2732[var10 - var9] * (50 - var9); // L: 1343
				field2757[var4] = var2 + (var11 + ((field2746[var7] - var11) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1344
				field2758[var4] = var3 + (var12 + ((field2747[var7] - var12) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1345
				field2759[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1346
			}
		}

		if (var10 >= 50) { // L: 1349
			field2757[var4] = modelViewportXs[var7]; // L: 1350
			field2758[var4] = modelViewportYs[var7]; // L: 1351
			field2762[var4] = field2748[var7]; // L: 1352
			field2759[var4++] = this.faceColors3[var1]; // L: 1353
		} else {
			var11 = field2746[var7]; // L: 1356
			var12 = field2747[var7]; // L: 1357
			var13 = this.faceColors3[var1]; // L: 1358
			if (var9 >= 50) { // L: 1359
				var14 = field2732[var9 - var10] * (50 - var10); // L: 1360
				field2757[var4] = var2 + (var11 + ((field2746[var6] - var11) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1361
				field2758[var4] = var3 + (var12 + ((field2747[var6] - var12) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1362
				field2762[var4] = field2773; // L: 1363
				field2759[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1364
			}

			if (var8 >= 50) { // L: 1366
				var14 = field2732[var8 - var10] * (50 - var10); // L: 1367
				field2757[var4] = var2 + (var11 + ((field2746[var5] - var11) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1368
				field2758[var4] = var3 + (var12 + ((field2747[var5] - var12) * var14 >> 16)) * Rasterizer3D.method4386() / 50; // L: 1369
				field2762[var4] = field2773; // L: 1370
				field2759[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1371
			}
		}

		var11 = field2757[0]; // L: 1374
		var12 = field2757[1]; // L: 1375
		var13 = field2757[2]; // L: 1376
		var14 = field2758[0]; // L: 1377
		int var15 = field2758[1]; // L: 1378
		int var16 = field2758[2]; // L: 1379
		float var17 = field2762[0]; // L: 1380
		float var18 = field2762[1]; // L: 1381
		float var19 = field2762[2]; // L: 1382
		Rasterizer3D.field2536.field2816 = false; // L: 1383
		int var20 = Rasterizer3D.method4387(); // L: 1384
		if (var4 == 3) { // L: 1385
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1386
				Rasterizer3D.field2536.field2816 = true;
			}

			this.method4869(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2759[0], field2759[1], field2759[2]); // L: 1387
		}

		if (var4 == 4) { // L: 1389
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2757[3] < 0 || field2757[3] > var20) { // L: 1390
				Rasterizer3D.field2536.field2816 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1391
				int var23;
				int var25;
				if (this.field2721 != null && this.field2721[var1] != -1) { // L: 1416
					int var24 = this.field2721[var1] & 255; // L: 1417
					var25 = this.field2725[var24]; // L: 1418
					var22 = this.field2726[var24]; // L: 1419
					var23 = this.field2719[var24]; // L: 1420
				} else {
					var25 = var5; // L: 1423
					var22 = var6; // L: 1424
					var23 = var7; // L: 1425
				}

				short var26 = this.faceTextures[var1]; // L: 1427
				if (this.faceColors3[var1] == -1) { // L: 1428
					Rasterizer3D.method4396(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2746[var25], field2746[var22], field2746[var23], field2747[var25], field2747[var22], field2747[var23], field2753[var25], field2753[var22], field2753[var23], var26); // L: 1429
					Rasterizer3D.method4396(var14, var16, field2758[3], var11, var13, field2757[3], var17, var19, field2762[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2746[var25], field2746[var22], field2746[var23], field2747[var25], field2747[var22], field2747[var23], field2753[var25], field2753[var22], field2753[var23], var26); // L: 1430
				} else {
					Rasterizer3D.method4396(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2759[0], field2759[1], field2759[2], field2746[var25], field2746[var22], field2746[var23], field2747[var25], field2747[var22], field2747[var23], field2753[var25], field2753[var22], field2753[var23], var26); // L: 1433
					Rasterizer3D.method4396(var14, var16, field2758[3], var11, var13, field2757[3], var17, var19, field2762[3], field2759[0], field2759[2], field2759[3], field2746[var25], field2746[var22], field2746[var23], field2747[var25], field2747[var22], field2747[var23], field2753[var25], field2753[var22], field2753[var23], var26); // L: 1434
				}
			} else {
				boolean var21 = this.method4800(var1); // L: 1392
				if (this.faceColors3[var1] == -1 && var21) { // L: 1393
					var22 = field2769[this.faceColors1[var1]]; // L: 1394
					Rasterizer3D.method4453(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1395
					Rasterizer3D.method4453(var14, var16, field2758[3], var11, var13, field2757[3], var17, var19, field2762[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1396
				} else if (this.faceColors3[var1] == -1) { // L: 1398
					var22 = field2769[this.faceColors1[var1]]; // L: 1399
					Rasterizer3D.method4455(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1400
					Rasterizer3D.method4455(var14, var16, field2758[3], var11, var13, field2757[3], var17, var19, field2762[3], var22); // L: 1401
				} else if (var21) { // L: 1403
					Rasterizer3D.method4447(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2759[0], field2759[1], field2759[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1404
					Rasterizer3D.method4447(var14, var16, field2758[3], var11, var13, field2757[3], 0.0F, 0.0F, 0.0F, field2759[0], field2759[2], field2759[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1405
				} else {
					Rasterizer3D.method4398(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2759[0], field2759[1], field2759[2]); // L: 1408
					Rasterizer3D.method4398(var14, var16, field2758[3], var11, var13, field2757[3], var17, var19, field2762[3], field2759[0], field2759[2], field2759[3]); // L: 1409
				}
			}
		}

	} // L: 1438

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILrz;)V"
	)
	void method4817(int var1, class450 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1441
		float var4 = (float)(-this.verticesY[var1]); // L: 1442
		float var5 = (float)(-this.verticesZ[var1]); // L: 1443
		float var6 = 1.0F; // L: 1444
		this.verticesX[var1] = (int)(var2.field4739[0] * var3 + var2.field4739[4] * var4 + var2.field4739[8] * var5 + var2.field4739[12] * var6); // L: 1445
		this.verticesY[var1] = -((int)(var2.field4739[1] * var3 + var2.field4739[5] * var4 + var2.field4739[9] * var5 + var2.field4739[13] * var6)); // L: 1446
		this.verticesZ[var1] = -((int)(var2.field4739[2] * var3 + var2.field4739[6] * var4 + var2.field4739[10] * var5 + var2.field4739[14] * var6)); // L: 1447
	} // L: 1448

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lim;I)V"
	)
	void method4848(class227 var1, int var2) {
		if (this.field2730 != null) { // L: 1451
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1452
				int[] var4 = this.field2730[var3]; // L: 1453
				if (var4 != null && var4.length != 0) { // L: 1454
					int[] var5 = this.field2755[var3]; // L: 1455
					field2705.method8195(); // L: 1456

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1457
						int var7 = var4[var6]; // L: 1458
						class127 var8 = var1.method4462(var7); // L: 1459
						if (var8 != null) { // L: 1460
							field2706.method8197((float)var5[var6] / 255.0F); // L: 1461
							field2707.method8221(var8.method2945(var2)); // L: 1462
							field2707.method8237(field2706); // L: 1463
							field2705.method8199(field2707); // L: 1464
						}
					}

					this.method4817(var3, field2705); // L: 1466
				}
			}

		}
	} // L: 1468

	@ObfuscatedName("db")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 859
			this.calculateBoundsCylinder();
		}

		this.method4880(var1); // L: 860
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 861
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 862
		int var13 = var3 * this.xzRadius >> 16; // L: 863
		int var14 = var12 + var13; // L: 864
		if (var14 > 50 && var12 < 3500) { // L: 865
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 866
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method4386(); // L: 867
			if (var16 / var14 < Rasterizer3D.method4379()) { // L: 868
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method4386(); // L: 869
				if (var17 / var14 > Rasterizer3D.method4382()) { // L: 870
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 871
					int var19 = var2 * this.xzRadius >> 16; // L: 872
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 873
					int var21 = (var18 + var20) * Rasterizer3D.method4386(); // L: 874
					if (var21 / var14 > Rasterizer3D.method4385()) { // L: 875
						int var22 = (var3 * super.height >> 16) + var19; // L: 876
						int var23 = (var18 - var22) * Rasterizer3D.method4386(); // L: 877
						if (var23 / var14 < Rasterizer3D.method4384()) { // L: 878
							int var24 = var13 + (var2 * super.height >> 16); // L: 879
							boolean var25 = false; // L: 880
							boolean var26 = false; // L: 881
							if (var12 - var24 <= 50) { // L: 882
								var26 = true;
							}

							boolean var27 = var26 || this.field2724 > 0; // L: 883
							int var28 = ViewportMouse.ViewportMouse_x; // L: 886
							int var30 = ViewportMouse.ViewportMouse_y; // L: 891
							boolean var32 = Decimator.method1135(); // L: 894
							boolean var34 = 0L != var9; // L: 897
							boolean var35;
							if (var34) { // L: 898
								var35 = (int)(var9 >>> 16 & 1L) == 1; // L: 901
								var34 = !var35; // L: 903
							}

							var35 = false; // L: 908
							int var40;
							int var41;
							int var42;
							int var43;
							int var44;
							int var49;
							int var50;
							int var56;
							if (var34 && var32) { // L: 909
								boolean var36 = false; // L: 910
								if (field2764) { // L: 911
									boolean var37;
									if (!Decimator.method1135()) { // L: 915
										var37 = false; // L: 916
									} else {
										class11.method96(); // L: 919
										class231 var39 = (class231)this.field2738.get(var1); // L: 920
										var40 = var39.field2635 + var6; // L: 921
										var41 = var7 + var39.field2629; // L: 922
										var42 = var8 + var39.field2631; // L: 923
										var43 = var39.field2632; // L: 924
										var44 = var39.field2633; // L: 925
										int var45 = var39.field2634; // L: 926
										int var46 = ViewportMouse.field2779 - var40; // L: 927
										int var47 = ViewportMouse.field2793 - var41; // L: 928
										int var48 = ViewportMouse.field2785 - var42; // L: 929
										if (Math.abs(var46) > var43 + ViewportMouse.field2787) { // L: 930
											var37 = false; // L: 931
										} else if (Math.abs(var47) > var44 + class7.field25) { // L: 934
											var37 = false; // L: 935
										} else if (Math.abs(var48) > var45 + class30.field167) { // L: 938
											var37 = false; // L: 939
										} else if (Math.abs(var48 * ViewportMouse.field2781 - var47 * Frames.field2642) > var44 * class30.field167 + var45 * class7.field25) { // L: 942
											var37 = false; // L: 943
										} else if (Math.abs(var46 * Frames.field2642 - var48 * class261.field2967) > var43 * class30.field167 + var45 * ViewportMouse.field2787) { // L: 946
											var37 = false; // L: 947
										} else if (Math.abs(var47 * class261.field2967 - var46 * ViewportMouse.field2781) > var43 * class7.field25 + var44 * ViewportMouse.field2787) { // L: 950
											var37 = false; // L: 951
										} else {
											var37 = true; // L: 954
										}
									}

									var36 = var37; // L: 956
								} else {
									var56 = var12 - var13; // L: 959
									if (var56 <= 50) { // L: 960
										var56 = 50;
									}

									if (var15 > 0) { // L: 961
										var16 /= var14; // L: 962
										var17 /= var56; // L: 963
									} else {
										var17 /= var14; // L: 966
										var16 /= var56; // L: 967
									}

									if (var18 > 0) { // L: 969
										var23 /= var14; // L: 970
										var21 /= var56; // L: 971
									} else {
										var21 /= var14; // L: 974
										var23 /= var56; // L: 975
									}

									var49 = var28 - Rasterizer3D.method4380(); // L: 977
									var50 = var30 - Rasterizer3D.method4381(); // L: 978
									if (var49 > var16 && var49 < var17 && var50 > var23 && var50 < var21) { // L: 979
										var36 = true; // L: 980
									}
								}

								if (var36) { // L: 983
									if (this.isSingleTile) { // L: 984
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 987
									} else {
										var35 = true; // L: 990
									}
								}
							}

							int var55 = Rasterizer3D.method4380(); // L: 993
							var56 = Rasterizer3D.method4381(); // L: 994
							var49 = 0; // L: 995
							var50 = 0; // L: 996
							if (var1 != 0) { // L: 997
								var49 = field2767[var1]; // L: 998
								var50 = field2768[var1]; // L: 999
							}

							for (var40 = 0; var40 < this.verticesCount; ++var40) { // L: 1001
								var41 = this.verticesX[var40]; // L: 1002
								var42 = this.verticesY[var40]; // L: 1003
								var43 = this.verticesZ[var40]; // L: 1004
								if (var1 != 0) { // L: 1005
									var44 = var43 * var49 + var41 * var50 >> 16; // L: 1006
									var43 = var43 * var50 - var41 * var49 >> 16; // L: 1007
									var41 = var44; // L: 1008
								}

								var41 += var6; // L: 1010
								var42 += var7; // L: 1011
								var43 += var8; // L: 1012
								var44 = var43 * var4 + var5 * var41 >> 16; // L: 1013
								var43 = var5 * var43 - var41 * var4 >> 16; // L: 1014
								var41 = var44; // L: 1015
								var44 = var3 * var42 - var43 * var2 >> 16; // L: 1016
								var43 = var42 * var2 + var3 * var43 >> 16; // L: 1017
								field2745[var40] = var43 - var12; // L: 1019
								if (var43 >= 50) { // L: 1020
									modelViewportXs[var40] = var55 + var41 * Rasterizer3D.method4386() / var43; // L: 1021
									modelViewportYs[var40] = var56 + var44 * Rasterizer3D.method4386() / var43; // L: 1022
									field2748[var40] = AbstractWorldMapIcon.method5550(var43); // L: 1023
								} else {
									modelViewportXs[var40] = -5000; // L: 1026
									var25 = true; // L: 1027
								}

								if (var27) { // L: 1029
									field2746[var40] = var41; // L: 1030
									field2747[var40] = var44; // L: 1031
									field2753[var40] = var43; // L: 1032
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9); // L: 1036
							} catch (Exception var54) { // L: 1038
							}

						}
					}
				}
			}
		}
	} // L: 1039
}
