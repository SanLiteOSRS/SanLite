import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
@Implements("Rasterizer2D")
public class Rasterizer2D extends DualNode {
	@ObfuscatedName("af")
	@Export("Rasterizer2D_pixels")
	public static int[] Rasterizer2D_pixels;
	@ObfuscatedName("ai")
	@Export("Rasterizer2D_width")
	public static int Rasterizer2D_width;
	@ObfuscatedName("al")
	@Export("Rasterizer2D_height")
	public static int Rasterizer2D_height;
	@ObfuscatedName("bd")
	public static float[] field5139;
	@ObfuscatedName("bn")
	@Export("Rasterizer2D_yClipStart")
	public static int Rasterizer2D_yClipStart;
	@ObfuscatedName("ba")
	@Export("Rasterizer2D_yClipEnd")
	public static int Rasterizer2D_yClipEnd;
	@ObfuscatedName("bf")
	@Export("Rasterizer2D_xClipStart")
	public static int Rasterizer2D_xClipStart;
	@ObfuscatedName("bs")
	@Export("Rasterizer2D_xClipEnd")
	public static int Rasterizer2D_xClipEnd;

	static {
		Rasterizer2D_yClipStart = 0; // L: 14
		Rasterizer2D_yClipEnd = 0; // L: 15
		Rasterizer2D_xClipStart = 0; // L: 16
		Rasterizer2D_xClipEnd = 0; // L: 17
	}

	protected Rasterizer2D() {
	} // L: 19

	@ObfuscatedName("ed")
	protected static void method9442(int[] var0, int var1, int var2, float[] var3) {
		Rasterizer2D_pixels = var0; // L: 22
		Rasterizer2D_width = var1; // L: 23
		Rasterizer2D_height = var2; // L: 24
		field5139 = var3; // L: 25
		Rasterizer2D_setClip(0, 0, var1, var2); // L: 26
	} // L: 27

	@ObfuscatedName("ea")
	@Export("Rasterizer2D_resetClip")
	public static void Rasterizer2D_resetClip() {
		Rasterizer2D_xClipStart = 0; // L: 30
		Rasterizer2D_yClipStart = 0; // L: 31
		Rasterizer2D_xClipEnd = Rasterizer2D_width; // L: 32
		Rasterizer2D_yClipEnd = Rasterizer2D_height; // L: 33
	} // L: 34

	@ObfuscatedName("ex")
	@Export("Rasterizer2D_setClip")
	public static void Rasterizer2D_setClip(int var0, int var1, int var2, int var3) {
		if (var0 < 0) { // L: 37
			var0 = 0;
		}

		if (var1 < 0) { // L: 38
			var1 = 0;
		}

		if (var2 > Rasterizer2D_width) { // L: 39
			var2 = Rasterizer2D_width;
		}

		if (var3 > Rasterizer2D_height) {
			var3 = Rasterizer2D_height; // L: 40
		}

		Rasterizer2D_xClipStart = var0; // L: 41
		Rasterizer2D_yClipStart = var1; // L: 42
		Rasterizer2D_xClipEnd = var2; // L: 43
		Rasterizer2D_yClipEnd = var3; // L: 44
	} // L: 45

	@ObfuscatedName("ef")
	@Export("Rasterizer2D_expandClip")
	public static void Rasterizer2D_expandClip(int var0, int var1, int var2, int var3) {
		if (Rasterizer2D_xClipStart < var0) { // L: 48
			Rasterizer2D_xClipStart = var0;
		}

		if (Rasterizer2D_yClipStart < var1) { // L: 49
			Rasterizer2D_yClipStart = var1;
		}

		if (Rasterizer2D_xClipEnd > var2) { // L: 50
			Rasterizer2D_xClipEnd = var2;
		}

		if (Rasterizer2D_yClipEnd > var3) { // L: 51
			Rasterizer2D_yClipEnd = var3;
		}

	} // L: 52

	@ObfuscatedName("ev")
	@Export("Rasterizer2D_getClipArray")
	public static void Rasterizer2D_getClipArray(int[] var0) {
		var0[0] = Rasterizer2D_xClipStart; // L: 55
		var0[1] = Rasterizer2D_yClipStart; // L: 56
		var0[2] = Rasterizer2D_xClipEnd; // L: 57
		var0[3] = Rasterizer2D_yClipEnd; // L: 58
	} // L: 59

	@ObfuscatedName("ez")
	@Export("Rasterizer2D_setClipArray")
	public static void Rasterizer2D_setClipArray(int[] var0) {
		Rasterizer2D_xClipStart = var0[0]; // L: 62
		Rasterizer2D_yClipStart = var0[1]; // L: 63
		Rasterizer2D_xClipEnd = var0[2]; // L: 64
		Rasterizer2D_yClipEnd = var0[3]; // L: 65
	} // L: 66

	@ObfuscatedName("ek")
	@Export("Rasterizer2D_clear")
	public static void Rasterizer2D_clear() {
		int var0 = 0; // L: 69

		int var1;
		for (var1 = Rasterizer2D_width * Rasterizer2D_height - 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) { // L: 70 71 79
			Rasterizer2D_pixels[var0++] = 0; // L: 72
			Rasterizer2D_pixels[var0++] = 0; // L: 73
			Rasterizer2D_pixels[var0++] = 0; // L: 74
			Rasterizer2D_pixels[var0++] = 0; // L: 75
			Rasterizer2D_pixels[var0++] = 0; // L: 76
			Rasterizer2D_pixels[var0++] = 0; // L: 77
			Rasterizer2D_pixels[var0++] = 0; // L: 78
		}

		for (var1 += 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) { // L: 81 82
		}

		method9445(); // L: 83
	} // L: 84

	@ObfuscatedName("eu")
	@Export("drawCircle")
	static void drawCircle(int var0, int var1, int var2, int var3) {
		if (var2 == 0) { // L: 87
			Rasterizer2D_setPixel(var0, var1, var3); // L: 88
		} else {
			if (var2 < 0) { // L: 91
				var2 = -var2;
			}

			int var4 = var1 - var2; // L: 92
			if (var4 < Rasterizer2D_yClipStart) { // L: 93
				var4 = Rasterizer2D_yClipStart;
			}

			int var5 = var2 + var1 + 1; // L: 94
			if (var5 > Rasterizer2D_yClipEnd) { // L: 95
				var5 = Rasterizer2D_yClipEnd;
			}

			int var6 = var4; // L: 96
			int var7 = var2 * var2; // L: 97
			int var8 = 0; // L: 98
			int var9 = var1 - var4; // L: 99
			int var10 = var9 * var9; // L: 100
			int var11 = var10 - var9; // L: 101
			if (var1 > var5) { // L: 102
				var1 = var5;
			}

			int var12;
			int var13;
			int var14;
			int var15;
			while (var6 < var1) { // L: 103
				while (var11 <= var7 || var10 <= var7) { // L: 104
					var10 = var10 + var8 + var8; // L: 105
					var11 += var8++ + var8; // L: 106
				}

				var12 = var0 - var8 + 1; // L: 108
				if (var12 < Rasterizer2D_xClipStart) { // L: 109
					var12 = Rasterizer2D_xClipStart;
				}

				var13 = var0 + var8; // L: 110
				if (var13 > Rasterizer2D_xClipEnd) { // L: 111
					var13 = Rasterizer2D_xClipEnd;
				}

				var14 = var12 + var6 * Rasterizer2D_width; // L: 112

				for (var15 = var12; var15 < var13; ++var15) { // L: 113
					Rasterizer2D_pixels[var14++] = var3;
				}

				++var6; // L: 114
				var10 -= var9-- + var9; // L: 115
				var11 -= var9 + var9; // L: 116
			}

			var8 = var2; // L: 118
			var9 = var6 - var1; // L: 119
			var11 = var7 + var9 * var9; // L: 120
			var10 = var11 - var2; // L: 121

			for (var11 -= var9; var6 < var5; var10 += var9++ + var9) { // L: 122 123 136
				while (var11 > var7 && var10 > var7) { // L: 124
					var11 -= var8-- + var8; // L: 125
					var10 -= var8 + var8; // L: 126
				}

				var12 = var0 - var8; // L: 128
				if (var12 < Rasterizer2D_xClipStart) { // L: 129
					var12 = Rasterizer2D_xClipStart;
				}

				var13 = var0 + var8; // L: 130
				if (var13 > Rasterizer2D_xClipEnd - 1) { // L: 131
					var13 = Rasterizer2D_xClipEnd - 1;
				}

				var14 = var12 + var6 * Rasterizer2D_width; // L: 132

				for (var15 = var12; var15 <= var13; ++var15) {
					Rasterizer2D_pixels[var14++] = var3; // L: 133
				}

				++var6; // L: 134
				var11 = var11 + var9 + var9; // L: 135
			}

		}
	} // L: 89 138

	@ObfuscatedName("ep")
	@Export("Rasterizer2D_drawCircleAlpha")
	public static void Rasterizer2D_drawCircleAlpha(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) { // L: 141
			if (var4 == 256) { // L: 142
				drawCircle(var0, var1, var2, var3); // L: 143
			} else {
				if (var2 < 0) { // L: 146
					var2 = -var2;
				}

				int var5 = 256 - var4; // L: 147
				int var6 = (var3 >> 16 & 255) * var4; // L: 148
				int var7 = (var3 >> 8 & 255) * var4; // L: 149
				int var8 = var4 * (var3 & 255); // L: 150
				int var12 = var1 - var2; // L: 154
				if (var12 < Rasterizer2D_yClipStart) { // L: 155
					var12 = Rasterizer2D_yClipStart;
				}

				int var13 = var2 + var1 + 1; // L: 156
				if (var13 > Rasterizer2D_yClipEnd) { // L: 157
					var13 = Rasterizer2D_yClipEnd;
				}

				int var14 = var12; // L: 158
				int var15 = var2 * var2; // L: 159
				int var16 = 0; // L: 160
				int var17 = var1 - var12; // L: 161
				int var18 = var17 * var17; // L: 162
				int var19 = var18 - var17; // L: 163
				if (var1 > var13) { // L: 164
					var1 = var13;
				}

				int var9;
				int var10;
				int var11;
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				while (var14 < var1) { // L: 165
					while (var19 <= var15 || var18 <= var15) { // L: 166
						var18 = var18 + var16 + var16; // L: 167
						var19 += var16++ + var16; // L: 168
					}

					var20 = var0 - var16 + 1; // L: 170
					if (var20 < Rasterizer2D_xClipStart) { // L: 171
						var20 = Rasterizer2D_xClipStart;
					}

					var21 = var0 + var16; // L: 172
					if (var21 > Rasterizer2D_xClipEnd) { // L: 173
						var21 = Rasterizer2D_xClipEnd;
					}

					var22 = var20 + var14 * Rasterizer2D_width; // L: 174

					for (var23 = var20; var23 < var21; ++var23) { // L: 175
						var9 = var5 * (Rasterizer2D_pixels[var22] >> 16 & 255); // L: 176
						var10 = (Rasterizer2D_pixels[var22] >> 8 & 255) * var5; // L: 177
						var11 = var5 * (Rasterizer2D_pixels[var22] & 255); // L: 178
						var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 179
						Rasterizer2D_pixels[var22++] = var24; // L: 180
					}

					++var14; // L: 182
					var18 -= var17-- + var17; // L: 183
					var19 -= var17 + var17; // L: 184
				}

				var16 = var2; // L: 186
				var17 = -var17; // L: 187
				var19 = var15 + var17 * var17; // L: 188
				var18 = var19 - var2; // L: 189

				for (var19 -= var17; var14 < var13; var18 += var17++ + var17) { // L: 190 191 210
					while (var19 > var15 && var18 > var15) { // L: 192
						var19 -= var16-- + var16; // L: 193
						var18 -= var16 + var16; // L: 194
					}

					var20 = var0 - var16; // L: 196
					if (var20 < Rasterizer2D_xClipStart) { // L: 197
						var20 = Rasterizer2D_xClipStart;
					}

					var21 = var0 + var16; // L: 198
					if (var21 > Rasterizer2D_xClipEnd - 1) { // L: 199
						var21 = Rasterizer2D_xClipEnd - 1;
					}

					var22 = var20 + var14 * Rasterizer2D_width; // L: 200

					for (var23 = var20; var23 <= var21; ++var23) { // L: 201
						var9 = var5 * (Rasterizer2D_pixels[var22] >> 16 & 255); // L: 202
						var10 = (Rasterizer2D_pixels[var22] >> 8 & 255) * var5; // L: 203
						var11 = var5 * (Rasterizer2D_pixels[var22] & 255); // L: 204
						var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 205
						Rasterizer2D_pixels[var22++] = var24; // L: 206
					}

					++var14; // L: 208
					var19 = var19 + var17 + var17; // L: 209
				}

			}
		}
	} // L: 144 212

	@ObfuscatedName("fm")
	@Export("Rasterizer2D_fillRectangleAlpha")
	public static void Rasterizer2D_fillRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < Rasterizer2D_xClipStart) { // L: 215
			var2 -= Rasterizer2D_xClipStart - var0; // L: 216
			var0 = Rasterizer2D_xClipStart; // L: 217
		}

		if (var1 < Rasterizer2D_yClipStart) { // L: 219
			var3 -= Rasterizer2D_yClipStart - var1; // L: 220
			var1 = Rasterizer2D_yClipStart; // L: 221
		}

		if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 223
			var2 = Rasterizer2D_xClipEnd - var0;
		}

		if (var3 + var1 > Rasterizer2D_yClipEnd) { // L: 224
			var3 = Rasterizer2D_yClipEnd - var1;
		}

		var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & 65280) >> 8 & 65280); // L: 225
		int var6 = 256 - var5; // L: 226
		int var7 = Rasterizer2D_width - var2; // L: 227
		int var8 = var0 + Rasterizer2D_width * var1; // L: 228

		for (int var9 = 0; var9 < var3; ++var9) { // L: 229
			for (int var10 = -var2; var10 < 0; ++var10) { // L: 230
				int var11 = Rasterizer2D_pixels[var8]; // L: 231
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & 65280) >> 8 & 65280); // L: 232
				Rasterizer2D_pixels[var8++] = var11 + var4; // L: 233
			}

			var8 += var7; // L: 235
		}

	} // L: 237

	@ObfuscatedName("fa")
	@Export("Rasterizer2D_fillRectangle")
	public static void Rasterizer2D_fillRectangle(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < Rasterizer2D_xClipStart) { // L: 240
			var2 -= Rasterizer2D_xClipStart - var0; // L: 241
			var0 = Rasterizer2D_xClipStart; // L: 242
		}

		if (var1 < Rasterizer2D_yClipStart) { // L: 244
			var3 -= Rasterizer2D_yClipStart - var1; // L: 245
			var1 = Rasterizer2D_yClipStart; // L: 246
		}

		if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 248
			var2 = Rasterizer2D_xClipEnd - var0;
		}

		if (var3 + var1 > Rasterizer2D_yClipEnd) {
			var3 = Rasterizer2D_yClipEnd - var1; // L: 249
		}

		int var5 = Rasterizer2D_width - var2; // L: 250
		int var6 = var0 + Rasterizer2D_width * var1; // L: 251

		for (int var7 = -var3; var7 < 0; ++var7) { // L: 252
			for (int var8 = -var2; var8 < 0; ++var8) { // L: 253
				Rasterizer2D_pixels[var6++] = var4; // L: 254
			}

			var6 += var5; // L: 256
		}

	} // L: 258

	@ObfuscatedName("fg")
	@Export("Rasterizer2D_fillRectangleGradient")
	public static void Rasterizer2D_fillRectangleGradient(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) { // L: 261
			int var6 = 0; // L: 262
			int var7 = 65536 / var3; // L: 263
			if (var0 < Rasterizer2D_xClipStart) { // L: 264
				var2 -= Rasterizer2D_xClipStart - var0; // L: 265
				var0 = Rasterizer2D_xClipStart; // L: 266
			}

			if (var1 < Rasterizer2D_yClipStart) { // L: 268
				var6 += (Rasterizer2D_yClipStart - var1) * var7; // L: 269
				var3 -= Rasterizer2D_yClipStart - var1; // L: 270
				var1 = Rasterizer2D_yClipStart; // L: 271
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 273
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			if (var3 + var1 > Rasterizer2D_yClipEnd) { // L: 274
				var3 = Rasterizer2D_yClipEnd - var1;
			}

			int var8 = Rasterizer2D_width - var2; // L: 275
			int var9 = var0 + Rasterizer2D_width * var1; // L: 276

			for (int var10 = -var3; var10 < 0; ++var10) { // L: 277
				int var11 = 65536 - var6 >> 8; // L: 278
				int var12 = var6 >> 8; // L: 279
				int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & 65280) + var11 * (var4 & 65280) & 16711680) >>> 8; // L: 280

				for (int var14 = -var2; var14 < 0; ++var14) { // L: 281
					Rasterizer2D_pixels[var9++] = var13; // L: 282
				}

				var9 += var8; // L: 284
				var6 += var7; // L: 285
			}

		}
	} // L: 287

	@ObfuscatedName("fq")
	@Export("Rasterizer2D_fillRectangleGradientAlpha")
	public static void Rasterizer2D_fillRectangleGradientAlpha(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) { // L: 290
			int var8 = 0; // L: 291
			int var9 = 65536 / var3; // L: 292
			if (var0 < Rasterizer2D_xClipStart) { // L: 293
				var2 -= Rasterizer2D_xClipStart - var0; // L: 294
				var0 = Rasterizer2D_xClipStart; // L: 295
			}

			if (var1 < Rasterizer2D_yClipStart) { // L: 297
				var8 += (Rasterizer2D_yClipStart - var1) * var9; // L: 298
				var3 -= Rasterizer2D_yClipStart - var1; // L: 299
				var1 = Rasterizer2D_yClipStart; // L: 300
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 302
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			if (var3 + var1 > Rasterizer2D_yClipEnd) { // L: 303
				var3 = Rasterizer2D_yClipEnd - var1;
			}

			int var10 = Rasterizer2D_width - var2; // L: 304
			int var11 = var0 + Rasterizer2D_width * var1; // L: 305

			for (int var12 = -var3; var12 < 0; ++var12) { // L: 306
				int var13 = 65536 - var8 >> 8; // L: 307
				int var14 = var8 >> 8; // L: 308
				int var15 = (var13 * var6 + var14 * var7 & 65280) >>> 8; // L: 309
				if (var15 == 0) { // L: 310
					var11 += Rasterizer2D_width; // L: 311
					var8 += var9; // L: 312
				} else {
					int var16 = (var14 * (var5 & 16711935) + var13 * (var4 & 16711935) & -16711936) + (var14 * (var5 & 65280) + var13 * (var4 & 65280) & 16711680) >>> 8; // L: 315
					int var17 = 255 - var15; // L: 316
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & 65280) >> 8 & 65280); // L: 317

					for (int var19 = -var2; var19 < 0; ++var19) { // L: 318
						int var20 = Rasterizer2D_pixels[var11]; // L: 319
						if (var20 == 0) { // L: 320
							Rasterizer2D_pixels[var11++] = var18; // L: 321
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & 65280) >> 8 & 65280); // L: 324
							Rasterizer2D_pixels[var11++] = var18 + var20; // L: 325
						}
					}

					var11 += var10; // L: 328
					var8 += var9; // L: 329
				}
			}

		}
	} // L: 331

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[BIZ)V",
		garbageValue = "1"
	)
	@Export("Rasterizer2D_drawGradientPixels")
	public static void Rasterizer2D_drawGradientPixels(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
		if (var0 + var2 >= 0 && var3 + var1 >= 0) { // L: 334
			if (var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) { // L: 335
				int var8 = 0; // L: 336
				int var9 = 0; // L: 337
				if (var0 < 0) { // L: 338
					var8 -= var0; // L: 339
					var2 += var0; // L: 340
				}

				if (var1 < 0) { // L: 342
					var9 -= var1; // L: 343
					var3 += var1; // L: 344
				}

				if (var0 + var2 > Rasterizer2D_width) { // L: 346
					var2 = Rasterizer2D_width - var0; // L: 347
				}

				if (var3 + var1 > Rasterizer2D_height) { // L: 349
					var3 = Rasterizer2D_height - var1; // L: 350
				}

				int var10 = var6.length / var7; // L: 352
				int var11 = Rasterizer2D_width - var2; // L: 353
				int var12 = var4 >>> 24; // L: 354
				int var13 = var5 >>> 24; // L: 355
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var12 == 255 && var13 == 255) { // L: 356
					var14 = var0 + var8 + (var9 + var1) * Rasterizer2D_width; // L: 357

					for (var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) { // L: 358
						for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) { // L: 359
							var17 = (var15 - var1) % var10; // L: 360
							var18 = (var16 - var0) % var7; // L: 361
							if (var6[var18 + var17 * var7] != 0) { // L: 362
								Rasterizer2D_pixels[var14++] = var5;
							} else {
								Rasterizer2D_pixels[var14++] = var4; // L: 363
							}
						}

						var14 += var11; // L: 365
					}
				} else {
					var14 = var0 + var8 + (var9 + var1) * Rasterizer2D_width; // L: 369

					for (var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) { // L: 370
						for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) { // L: 371
							var17 = (var15 - var1) % var10; // L: 372
							var18 = (var16 - var0) % var7; // L: 373
							int var19 = var4; // L: 374
							if (var6[var18 + var17 * var7] != 0) { // L: 375
								var19 = var5;
							}

							int var20 = var19 >>> 24; // L: 376
							int var21 = 255 - var20; // L: 377
							int var22 = Rasterizer2D_pixels[var14]; // L: 378
							int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + (var20 * (var19 & 65280) + var21 * (var22 & 65280) & 16711680) >> 8; // L: 379
							Rasterizer2D_pixels[var14++] = var23; // L: 380
						}

						var14 += var11; // L: 382
					}
				}

			}
		}
	} // L: 385

	@ObfuscatedName("fp")
	@Export("Rasterizer2D_drawRectangle")
	public static void Rasterizer2D_drawRectangle(int var0, int var1, int var2, int var3, int var4) {
		method9438(var0, var1, var2, var4); // L: 388
		method9438(var0, var3 + var1 - 1, var2, var4); // L: 389
		method9440(var0, var1, var3, var4); // L: 390
		method9440(var0 + var2 - 1, var1, var3, var4); // L: 391
	} // L: 392

	@ObfuscatedName("fz")
	@Export("Rasterizer2D_drawRectangleAlpha")
	public static void Rasterizer2D_drawRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
		Rasterizer2D_drawHorizontalLineAlpha(var0, var1, var2, var4, var5); // L: 395
		Rasterizer2D_drawHorizontalLineAlpha(var0, var3 + var1 - 1, var2, var4, var5); // L: 396
		if (var3 >= 3) { // L: 397
			Rasterizer2D_drawVerticalLineAlpha(var0, var1 + 1, var3 - 2, var4, var5); // L: 398
			Rasterizer2D_drawVerticalLineAlpha(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5); // L: 399
		}

	} // L: 401

	@ObfuscatedName("fj")
	public static void method9438(int var0, int var1, int var2, int var3) {
		if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) { // L: 404
			if (var0 < Rasterizer2D_xClipStart) { // L: 405
				var2 -= Rasterizer2D_xClipStart - var0; // L: 406
				var0 = Rasterizer2D_xClipStart; // L: 407
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 409
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			int var4 = var0 + Rasterizer2D_width * var1; // L: 410

			for (int var5 = 0; var5 < var2; ++var5) { // L: 411
				Rasterizer2D_pixels[var4 + var5] = var3;
			}

		}
	} // L: 412

	@ObfuscatedName("fb")
	@Export("Rasterizer2D_drawHorizontalLineAlpha")
	static void Rasterizer2D_drawHorizontalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) { // L: 415
			if (var0 < Rasterizer2D_xClipStart) { // L: 416
				var2 -= Rasterizer2D_xClipStart - var0; // L: 417
				var0 = Rasterizer2D_xClipStart; // L: 418
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 420
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			int var5 = 256 - var4; // L: 421
			int var6 = (var3 >> 16 & 255) * var4; // L: 422
			int var7 = (var3 >> 8 & 255) * var4; // L: 423
			int var8 = var4 * (var3 & 255); // L: 424
			int var12 = var0 + Rasterizer2D_width * var1; // L: 428

			for (int var13 = 0; var13 < var2; ++var13) { // L: 429
				int var9 = var5 * (Rasterizer2D_pixels[var12] >> 16 & 255); // L: 430
				int var10 = (Rasterizer2D_pixels[var12] >> 8 & 255) * var5; // L: 431
				int var11 = var5 * (Rasterizer2D_pixels[var12] & 255); // L: 432
				int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 433
				Rasterizer2D_pixels[var12++] = var14; // L: 434
			}

		}
	} // L: 436

	@ObfuscatedName("fl")
	public static void method9440(int var0, int var1, int var2, int var3) {
		if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) { // L: 439
			if (var1 < Rasterizer2D_yClipStart) { // L: 440
				var2 -= Rasterizer2D_yClipStart - var1; // L: 441
				var1 = Rasterizer2D_yClipStart; // L: 442
			}

			if (var2 + var1 > Rasterizer2D_yClipEnd) { // L: 444
				var2 = Rasterizer2D_yClipEnd - var1;
			}

			int var4 = var0 + Rasterizer2D_width * var1; // L: 445

			for (int var5 = 0; var5 < var2; ++var5) { // L: 446
				Rasterizer2D_pixels[var4 + var5 * Rasterizer2D_width] = var3;
			}

		}
	} // L: 447

	@ObfuscatedName("fd")
	@Export("Rasterizer2D_drawVerticalLineAlpha")
	static void Rasterizer2D_drawVerticalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) { // L: 450
			if (var1 < Rasterizer2D_yClipStart) { // L: 451
				var2 -= Rasterizer2D_yClipStart - var1; // L: 452
				var1 = Rasterizer2D_yClipStart; // L: 453
			}

			if (var2 + var1 > Rasterizer2D_yClipEnd) { // L: 455
				var2 = Rasterizer2D_yClipEnd - var1;
			}

			int var5 = 256 - var4; // L: 456
			int var6 = (var3 >> 16 & 255) * var4; // L: 457
			int var7 = (var3 >> 8 & 255) * var4; // L: 458
			int var8 = var4 * (var3 & 255); // L: 459
			int var12 = var0 + Rasterizer2D_width * var1; // L: 463

			for (int var13 = 0; var13 < var2; ++var13) { // L: 464
				int var9 = var5 * (Rasterizer2D_pixels[var12] >> 16 & 255); // L: 465
				int var10 = (Rasterizer2D_pixels[var12] >> 8 & 255) * var5; // L: 466
				int var11 = var5 * (Rasterizer2D_pixels[var12] & 255); // L: 467
				int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 468
				Rasterizer2D_pixels[var12] = var14; // L: 469
				var12 += Rasterizer2D_width; // L: 470
			}

		}
	} // L: 472

	@ObfuscatedName("fh")
	@Export("Rasterizer2D_drawLine")
	public static void Rasterizer2D_drawLine(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0; // L: 475
		var3 -= var1; // L: 476
		if (var3 == 0) { // L: 477
			if (var2 >= 0) { // L: 478
				method9438(var0, var1, var2 + 1, var4);
			} else {
				method9438(var0 + var2, var1, -var2 + 1, var4); // L: 479
			}

		} else if (var2 == 0) { // L: 482
			if (var3 >= 0) { // L: 483
				method9440(var0, var1, var3 + 1, var4);
			} else {
				method9440(var0, var3 + var1, -var3 + 1, var4); // L: 484
			}

		} else {
			if (var3 + var2 < 0) { // L: 487
				var0 += var2; // L: 488
				var2 = -var2; // L: 489
				var1 += var3; // L: 490
				var3 = -var3; // L: 491
			}

			int var5;
			int var6;
			if (var2 > var3) { // L: 493
				var1 <<= 16; // L: 494
				var1 += 32768; // L: 495
				var3 <<= 16; // L: 496
				var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D); // L: 497
				var2 += var0; // L: 498
				if (var0 < Rasterizer2D_xClipStart) { // L: 499
					var1 += var5 * (Rasterizer2D_xClipStart - var0); // L: 500
					var0 = Rasterizer2D_xClipStart; // L: 501
				}

				if (var2 >= Rasterizer2D_xClipEnd) { // L: 503
					var2 = Rasterizer2D_xClipEnd - 1;
				}

				while (var0 <= var2) { // L: 504
					var6 = var1 >> 16; // L: 505
					if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) { // L: 506
						Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4;
					}

					var1 += var5; // L: 507
					++var0; // L: 508
				}
			} else {
				var0 <<= 16; // L: 512
				var0 += 32768; // L: 513
				var2 <<= 16; // L: 514
				var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D); // L: 515
				var3 += var1; // L: 516
				if (var1 < Rasterizer2D_yClipStart) { // L: 517
					var0 += (Rasterizer2D_yClipStart - var1) * var5; // L: 518
					var1 = Rasterizer2D_yClipStart; // L: 519
				}

				if (var3 >= Rasterizer2D_yClipEnd) { // L: 521
					var3 = Rasterizer2D_yClipEnd - 1;
				}

				while (var1 <= var3) { // L: 522
					var6 = var0 >> 16; // L: 523
					if (var6 >= Rasterizer2D_xClipStart && var6 < Rasterizer2D_xClipEnd) { // L: 524
						Rasterizer2D_pixels[var6 + Rasterizer2D_width * var1] = var4;
					}

					var0 += var5; // L: 525
					++var1; // L: 526
				}
			}

		}
	} // L: 480 485 529

	@ObfuscatedName("fc")
	@Export("Rasterizer2D_setPixel")
	static void Rasterizer2D_setPixel(int var0, int var1, int var2) {
		if (var0 >= Rasterizer2D_xClipStart && var1 >= Rasterizer2D_yClipStart && var0 < Rasterizer2D_xClipEnd && var1 < Rasterizer2D_yClipEnd) { // L: 532
			Rasterizer2D_pixels[var0 + Rasterizer2D_width * var1] = var2; // L: 533
		}
	} // L: 534

	@ObfuscatedName("fu")
	@Export("Rasterizer2D_fillMaskedRectangle")
	public static void Rasterizer2D_fillMaskedRectangle(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + Rasterizer2D_width * var1; // L: 537

		for (var1 = 0; var1 < var3.length; ++var1) { // L: 538
			int var6 = var5 + var3[var1]; // L: 539

			for (var0 = -var4[var1]; var0 < 0; ++var0) { // L: 540
				Rasterizer2D_pixels[var6++] = var2;
			}

			var5 += Rasterizer2D_width; // L: 541
		}

	} // L: 543

	@ObfuscatedName("fv")
	public static void method9445() {
		if (field5139 != null) { // L: 546
			int var0;
			int var1;
			int var2;
			if (Rasterizer2D_xClipStart == 0 && Rasterizer2D_xClipEnd == Rasterizer2D_width && Rasterizer2D_yClipStart == 0 && Rasterizer2D_yClipEnd == Rasterizer2D_height) { // L: 547
				var0 = field5139.length; // L: 548
				var1 = var0 - (var0 & 7); // L: 549

				for (var2 = 0; var2 < var1; field5139[var2++] = 0.0F) { // L: 550 551 559
					field5139[var2++] = 0.0F; // L: 552
					field5139[var2++] = 0.0F; // L: 553
					field5139[var2++] = 0.0F; // L: 554
					field5139[var2++] = 0.0F; // L: 555
					field5139[var2++] = 0.0F; // L: 556
					field5139[var2++] = 0.0F; // L: 557
					field5139[var2++] = 0.0F; // L: 558
				}

				while (var2 < var0) {
					field5139[var2++] = 0.0F; // L: 561
				}
			} else {
				var0 = Rasterizer2D_xClipEnd - Rasterizer2D_xClipStart; // L: 564
				var1 = Rasterizer2D_yClipEnd - Rasterizer2D_yClipStart; // L: 565
				var2 = Rasterizer2D_width - var0; // L: 566
				int var3 = Rasterizer2D_yClipStart * Rasterizer2D_width + Rasterizer2D_xClipStart; // L: 567
				int var4 = var0 >> 3; // L: 568
				int var5 = var0 & 7; // L: 569
				var0 = var3 - 1; // L: 570

				for (int var7 = -var1; var7 < 0; ++var7) { // L: 572
					int var6;
					if (var4 > 0) { // L: 573
						var6 = var4; // L: 574

						do {
							++var0;
							field5139[var0] = 0.0F; // L: 576
							++var0;
							field5139[var0] = 0.0F; // L: 577
							++var0;
							field5139[var0] = 0.0F; // L: 578
							++var0;
							field5139[var0] = 0.0F; // L: 579
							++var0;
							field5139[var0] = 0.0F; // L: 580
							++var0;
							field5139[var0] = 0.0F; // L: 581
							++var0;
							field5139[var0] = 0.0F; // L: 582
							++var0;
							field5139[var0] = 0.0F; // L: 583
							--var6; // L: 584
						} while(var6 > 0);
					}

					if (var5 > 0) { // L: 586
						var6 = var5; // L: 587

						do {
							++var0;
							field5139[var0] = 0.0F; // L: 589
							--var6; // L: 590
						} while(var6 > 0);
					}

					var0 += var2; // L: 592
				}
			}

		}
	} // L: 595

	@ObfuscatedName("fr")
	public static void method9446() {
		if (field5139 != null) { // L: 598
			int var0 = field5139.length; // L: 599

			for (int var1 = 0; var1 < var0; ++var1) { // L: 600 601 606
				if (var1 % Rasterizer2D_width < Rasterizer2D_width / 2 && field5139[var1] > 0.0F) { // L: 602
					int var2 = (int)(255.0F * ClientPreferences.method2577(field5139[var1])); // L: 603
					Rasterizer2D_pixels[var1] = var2 << 16 | var2 << 8 | var2; // L: 604
				}
			}

		}
	} // L: 608
}
