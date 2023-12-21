import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kl")
@Implements("SceneTileModel")
public final class SceneTileModel {
	@ObfuscatedName("ak")
	static int[] field2907;
	@ObfuscatedName("aj")
	static int[] field2923;
	@ObfuscatedName("am")
	static float[] field2921;
	@ObfuscatedName("aq")
	static int[] field2924;
	@ObfuscatedName("ai")
	static int[] field2925;
	@ObfuscatedName("aw")
	static int[] field2906;
	@ObfuscatedName("ae")
	static final int[][] field2927;
	@ObfuscatedName("an")
	static final int[][] field2928;
	@ObfuscatedName("at")
	@Export("vertexX")
	int[] vertexX;
	@ObfuscatedName("ah")
	@Export("vertexY")
	int[] vertexY;
	@ObfuscatedName("ar")
	@Export("vertexZ")
	int[] vertexZ;
	@ObfuscatedName("ao")
	@Export("triangleColorA")
	int[] triangleColorA;
	@ObfuscatedName("ab")
	@Export("triangleColorB")
	int[] triangleColorB;
	@ObfuscatedName("au")
	@Export("triangleColorC")
	int[] triangleColorC;
	@ObfuscatedName("aa")
	@Export("faceX")
	int[] faceX;
	@ObfuscatedName("ac")
	@Export("faceY")
	int[] faceY;
	@ObfuscatedName("al")
	@Export("faceZ")
	int[] faceZ;
	@ObfuscatedName("az")
	@Export("triangleTextureId")
	int[] triangleTextureId;
	@ObfuscatedName("ap")
	boolean field2916;
	@ObfuscatedName("av")
	@Export("shape")
	int shape;
	@ObfuscatedName("ax")
	@Export("rotation")
	int rotation;
	@ObfuscatedName("as")
	@Export("underlayRgb")
	int underlayRgb;
	@ObfuscatedName("ay")
	@Export("overlayRgb")
	int overlayRgb;

	static {
		field2907 = new int[6]; // L: 21
		field2923 = new int[6]; // L: 22
		field2921 = new float[6]; // L: 23
		field2924 = new int[6]; // L: 24
		field2925 = new int[6]; // L: 25
		field2906 = new int[6]; // L: 26
		field2927 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}}; // L: 27
		field2928 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}}; // L: 42
	}

	SceneTileModel(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
		this.field2916 = true; // L: 16
		if (var7 != var6 || var8 != var6 || var9 != var6) { // L: 59
			this.field2916 = false;
		}

		this.shape = var1; // L: 60
		this.rotation = var2; // L: 61
		this.underlayRgb = var18; // L: 62
		this.overlayRgb = var19; // L: 63
		short var20 = 128; // L: 64
		int var21 = var20 / 2; // L: 65
		int var22 = var20 / 4; // L: 66
		int var23 = var20 * 3 / 4; // L: 67
		int[] var24 = field2927[var1]; // L: 68
		int var25 = var24.length; // L: 69
		this.vertexX = new int[var25]; // L: 70
		this.vertexY = new int[var25]; // L: 71
		this.vertexZ = new int[var25]; // L: 72
		int[] var26 = new int[var25]; // L: 73
		int[] var27 = new int[var25]; // L: 74
		int var28 = var20 * var4; // L: 75
		int var29 = var5 * var20; // L: 76

		int var31;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		for (int var30 = 0; var30 < var25; ++var30) { // L: 77
			var31 = var24[var30]; // L: 78
			if ((var31 & 1) == 0 && var31 <= 8) { // L: 79
				var31 = (var31 - var2 - var2 - 1 & 7) + 1;
			}

			if (var31 > 8 && var31 <= 12) { // L: 80
				var31 = (var31 - 9 - var2 & 3) + 9;
			}

			if (var31 > 12 && var31 <= 16) { // L: 81
				var31 = (var31 - 13 - var2 & 3) + 13;
			}

			if (var31 == 1) { // L: 87
				var32 = var28; // L: 88
				var33 = var29; // L: 89
				var34 = var6; // L: 90
				var35 = var10; // L: 91
				var36 = var14; // L: 92
			} else if (var31 == 2) { // L: 94
				var32 = var28 + var21; // L: 95
				var33 = var29; // L: 96
				var34 = var7 + var6 >> 1; // L: 97
				var35 = var11 + var10 >> 1; // L: 98
				var36 = var15 + var14 >> 1; // L: 99
			} else if (var31 == 3) { // L: 101
				var32 = var28 + var20; // L: 102
				var33 = var29; // L: 103
				var34 = var7; // L: 104
				var35 = var11; // L: 105
				var36 = var15; // L: 106
			} else if (var31 == 4) { // L: 108
				var32 = var28 + var20; // L: 109
				var33 = var29 + var21; // L: 110
				var34 = var8 + var7 >> 1; // L: 111
				var35 = var11 + var12 >> 1; // L: 112
				var36 = var15 + var16 >> 1; // L: 113
			} else if (var31 == 5) { // L: 115
				var32 = var28 + var20; // L: 116
				var33 = var29 + var20; // L: 117
				var34 = var8; // L: 118
				var35 = var12; // L: 119
				var36 = var16; // L: 120
			} else if (var31 == 6) { // L: 122
				var32 = var28 + var21; // L: 123
				var33 = var29 + var20; // L: 124
				var34 = var8 + var9 >> 1; // L: 125
				var35 = var13 + var12 >> 1; // L: 126
				var36 = var17 + var16 >> 1; // L: 127
			} else if (var31 == 7) { // L: 129
				var32 = var28; // L: 130
				var33 = var29 + var20; // L: 131
				var34 = var9; // L: 132
				var35 = var13; // L: 133
				var36 = var17; // L: 134
			} else if (var31 == 8) { // L: 136
				var32 = var28; // L: 137
				var33 = var29 + var21; // L: 138
				var34 = var9 + var6 >> 1; // L: 139
				var35 = var13 + var10 >> 1; // L: 140
				var36 = var17 + var14 >> 1; // L: 141
			} else if (var31 == 9) { // L: 143
				var32 = var28 + var21; // L: 144
				var33 = var29 + var22; // L: 145
				var34 = var7 + var6 >> 1; // L: 146
				var35 = var11 + var10 >> 1; // L: 147
				var36 = var15 + var14 >> 1; // L: 148
			} else if (var31 == 10) { // L: 150
				var32 = var28 + var23; // L: 151
				var33 = var29 + var21; // L: 152
				var34 = var8 + var7 >> 1; // L: 153
				var35 = var11 + var12 >> 1; // L: 154
				var36 = var15 + var16 >> 1; // L: 155
			} else if (var31 == 11) { // L: 157
				var32 = var28 + var21; // L: 158
				var33 = var29 + var23; // L: 159
				var34 = var8 + var9 >> 1; // L: 160
				var35 = var13 + var12 >> 1; // L: 161
				var36 = var17 + var16 >> 1; // L: 162
			} else if (var31 == 12) { // L: 164
				var32 = var28 + var22; // L: 165
				var33 = var29 + var21; // L: 166
				var34 = var9 + var6 >> 1; // L: 167
				var35 = var13 + var10 >> 1; // L: 168
				var36 = var17 + var14 >> 1; // L: 169
			} else if (var31 == 13) { // L: 171
				var32 = var28 + var22; // L: 172
				var33 = var29 + var22; // L: 173
				var34 = var6; // L: 174
				var35 = var10; // L: 175
				var36 = var14; // L: 176
			} else if (var31 == 14) { // L: 178
				var32 = var28 + var23; // L: 179
				var33 = var29 + var22; // L: 180
				var34 = var7; // L: 181
				var35 = var11; // L: 182
				var36 = var15; // L: 183
			} else if (var31 == 15) { // L: 185
				var32 = var28 + var23; // L: 186
				var33 = var29 + var23; // L: 187
				var34 = var8; // L: 188
				var35 = var12; // L: 189
				var36 = var16; // L: 190
			} else {
				var32 = var28 + var22; // L: 193
				var33 = var29 + var23; // L: 194
				var34 = var9; // L: 195
				var35 = var13; // L: 196
				var36 = var17; // L: 197
			}

			this.vertexX[var30] = var32; // L: 199
			this.vertexY[var30] = var34; // L: 200
			this.vertexZ[var30] = var33; // L: 201
			var26[var30] = var35; // L: 202
			var27[var30] = var36; // L: 203
		}

		int[] var38 = field2928[var1]; // L: 205
		var31 = var38.length / 4; // L: 206
		this.faceX = new int[var31]; // L: 207
		this.faceY = new int[var31]; // L: 208
		this.faceZ = new int[var31]; // L: 209
		this.triangleColorA = new int[var31]; // L: 210
		this.triangleColorB = new int[var31]; // L: 211
		this.triangleColorC = new int[var31]; // L: 212
		if (var3 != -1) { // L: 213
			this.triangleTextureId = new int[var31];
		}

		var32 = 0; // L: 214

		for (var33 = 0; var33 < var31; ++var33) { // L: 215
			var34 = var38[var32]; // L: 216
			var35 = var38[var32 + 1]; // L: 217
			var36 = var38[var32 + 2]; // L: 218
			int var37 = var38[var32 + 3]; // L: 219
			var32 += 4; // L: 220
			if (var35 < 4) { // L: 221
				var35 = var35 - var2 & 3;
			}

			if (var36 < 4) { // L: 222
				var36 = var36 - var2 & 3;
			}

			if (var37 < 4) { // L: 223
				var37 = var37 - var2 & 3;
			}

			this.faceX[var33] = var35; // L: 224
			this.faceY[var33] = var36; // L: 225
			this.faceZ[var33] = var37; // L: 226
			if (var34 == 0) { // L: 227
				this.triangleColorA[var33] = var26[var35]; // L: 228
				this.triangleColorB[var33] = var26[var36]; // L: 229
				this.triangleColorC[var33] = var26[var37]; // L: 230
				if (this.triangleTextureId != null) { // L: 231
					this.triangleTextureId[var33] = -1;
				}
			} else {
				this.triangleColorA[var33] = var27[var35]; // L: 234
				this.triangleColorB[var33] = var27[var36]; // L: 235
				this.triangleColorC[var33] = var27[var37]; // L: 236
				if (this.triangleTextureId != null) { // L: 237
					this.triangleTextureId[var33] = var3;
				}
			}
		}

		var33 = var6; // L: 240
		var34 = var7; // L: 241
		if (var7 < var6) { // L: 242
			var33 = var7;
		}

		if (var7 > var7) { // L: 243
			var34 = var7;
		}

		if (var8 < var33) { // L: 244
			var33 = var8;
		}

		if (var8 > var34) { // L: 245
			var34 = var8;
		}

		if (var9 < var33) { // L: 246
			var33 = var9;
		}

		if (var9 > var34) { // L: 247
			var34 = var9;
		}

		var33 /= 14; // L: 248
		var34 /= 14; // L: 249
	} // L: 250
}
