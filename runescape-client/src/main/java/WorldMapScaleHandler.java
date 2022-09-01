import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2146368821
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("h")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1; // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-42"
	)
	void method5037(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) { // L: 14
			var8 = this.method5016(var8, var7); // L: 15
			var7 = this.method5033(var7); // L: 16
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile); // L: 17
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-969764847"
	)
	int method5016(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2106538820"
	)
	int method5033(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1896016077"
	)
	@Export("init")
	void init() {
		if (this.tileTemplates == null) {
			this.tileTemplates = new byte[8][4][];
			this.init0();
			this.init1();
			this.init2();
			this.init3();
			this.init4();
			this.init5();
			this.init6();
			this.init7();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-317458625"
	)
	@Export("init0")
	void init0() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				++var2; // L: 54
			}
		}

		this.tileTemplates[0][0] = var1; // L: 57
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 61
				if (var4 <= var3) {
					var1[var2] = -1; // L: 62
				}

				++var2; // L: 63
			}
		}

		this.tileTemplates[0][1] = var1; // L: 66
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 67
		var2 = 0; // L: 68

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 69
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 70
				if (var4 >= var3) { // L: 71
					var1[var2] = -1;
				}

				++var2; // L: 72
			}
		}

		this.tileTemplates[0][2] = var1; // L: 75
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 76
		var2 = 0; // L: 77

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 78
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 79
				if (var4 >= var3) { // L: 80
					var1[var2] = -1;
				}

				++var2; // L: 81
			}
		}

		this.tileTemplates[0][3] = var1; // L: 84
	} // L: 85

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "423425230"
	)
	@Export("init1")
	void init1() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 88
		int var2 = 0; // L: 89

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 90
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 91
				if (var4 <= var3 >> 1) { // L: 92
					var1[var2] = -1;
				}

				++var2; // L: 93
			}
		}

		this.tileTemplates[1][0] = var1; // L: 96
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 97
		var2 = 0; // L: 98

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 99
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 100
				if (var2 >= 0 && var2 < var1.length) { // L: 101
					if (var4 >= var3 << 1) { // L: 105
						var1[var2] = -1;
					}

					++var2; // L: 106
				} else {
					++var2; // L: 102
				}
			}
		}

		this.tileTemplates[1][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 110
		var2 = 0; // L: 111

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 << 1) { // L: 123
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][3] = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-276026623"
	)
	@Export("init2")
	void init2() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 131
		int var2 = 0; // L: 132

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 134
				if (var4 <= var3 >> 1) { // L: 135
					var1[var2] = -1;
				}

				++var2; // L: 136
			}
		}

		this.tileTemplates[2][0] = var1; // L: 139
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 140
		var2 = 0; // L: 141

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 142
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 143
				if (var4 >= var3 << 1) {
					var1[var2] = -1; // L: 144
				}

				++var2; // L: 145
			}
		}

		this.tileTemplates[2][1] = var1; // L: 148
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 149
		var2 = 0; // L: 150

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 151
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 152
				if (var4 <= var3 >> 1) { // L: 153
					var1[var2] = -1;
				}

				++var2; // L: 154
			}
		}

		this.tileTemplates[2][2] = var1; // L: 157
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 158
		var2 = 0; // L: 159

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 160
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 161
				if (var4 >= var3 << 1) { // L: 162
					var1[var2] = -1;
				}

				++var2; // L: 163
			}
		}

		this.tileTemplates[2][3] = var1; // L: 166
	} // L: 167

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-363813803"
	)
	@Export("init3")
	void init3() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 170
		int var2 = 0; // L: 171

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 172
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 173
				if (var4 >= var3 >> 1) { // L: 174
					var1[var2] = -1;
				}

				++var2; // L: 175
			}
		}

		this.tileTemplates[3][0] = var1; // L: 178
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 179
		var2 = 0; // L: 180

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 181
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 182
				if (var4 <= var3 << 1) { // L: 183
					var1[var2] = -1;
				}

				++var2; // L: 184
			}
		}

		this.tileTemplates[3][1] = var1; // L: 187
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 188
		var2 = 0; // L: 189

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 190
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 191
				if (var4 >= var3 >> 1) { // L: 192
					var1[var2] = -1;
				}

				++var2; // L: 193
			}
		}

		this.tileTemplates[3][2] = var1; // L: 196
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 197
		var2 = 0; // L: 198

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 199
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 200
				if (var4 <= var3 << 1) { // L: 201
					var1[var2] = -1;
				}

				++var2; // L: 202
			}
		}

		this.tileTemplates[3][3] = var1; // L: 205
	} // L: 206

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	@Export("init4")
	void init4() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 209
		int var2 = 0; // L: 210

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 211
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 212
				if (var4 >= var3 >> 1) { // L: 213
					var1[var2] = -1;
				}

				++var2; // L: 214
			}
		}

		this.tileTemplates[4][0] = var1; // L: 217
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 218
		var2 = 0; // L: 219

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 220
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 221
				if (var4 <= var3 << 1) { // L: 222
					var1[var2] = -1;
				}

				++var2; // L: 223
			}
		}

		this.tileTemplates[4][1] = var1; // L: 226
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 227
		var2 = 0; // L: 228

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 229
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 230
				if (var4 >= var3 >> 1) { // L: 231
					var1[var2] = -1;
				}

				++var2; // L: 232
			}
		}

		this.tileTemplates[4][2] = var1; // L: 235
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 236
		var2 = 0; // L: 237

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 238
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 239
				if (var4 <= var3 << 1) { // L: 240
					var1[var2] = -1;
				}

				++var2; // L: 241
			}
		}

		this.tileTemplates[4][3] = var1; // L: 244
	} // L: 245

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "401219800"
	)
	@Export("init5")
	void init5() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 248
		boolean var2 = false; // L: 249
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 250
		int var5 = 0; // L: 251

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 252
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 253
				if (var4 <= this.pixelsPerTile / 2) { // L: 254
					var1[var5] = -1;
				}

				++var5; // L: 255
			}
		}

		this.tileTemplates[5][0] = var1; // L: 258
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 259
		var5 = 0; // L: 260

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 261
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 262
				if (var3 <= this.pixelsPerTile / 2) { // L: 263
					var1[var5] = -1;
				}

				++var5; // L: 264
			}
		}

		this.tileTemplates[5][1] = var1; // L: 267
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 268
		var5 = 0; // L: 269

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 270
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 271
				if (var4 >= this.pixelsPerTile / 2) { // L: 272
					var1[var5] = -1;
				}

				++var5; // L: 273
			}
		}

		this.tileTemplates[5][2] = var1; // L: 276
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 277
		var5 = 0; // L: 278

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 279
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 280
				if (var3 >= this.pixelsPerTile / 2) { // L: 281
					var1[var5] = -1;
				}

				++var5; // L: 282
			}
		}

		this.tileTemplates[5][3] = var1; // L: 285
	} // L: 286

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1623373953"
	)
	@Export("init6")
	void init6() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 289
		boolean var2 = false; // L: 290
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 291
		int var5 = 0; // L: 292

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 293
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 294
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 295
					var1[var5] = -1;
				}

				++var5; // L: 296
			}
		}

		this.tileTemplates[6][0] = var1; // L: 299
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 300
		var5 = 0; // L: 301

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 302
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 303
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 304
					var1[var5] = -1;
				}

				++var5; // L: 305
			}
		}

		this.tileTemplates[6][1] = var1; // L: 308
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 309
		var5 = 0; // L: 310

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 311
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 312
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 313
					var1[var5] = -1;
				}

				++var5; // L: 314
			}
		}

		this.tileTemplates[6][2] = var1; // L: 317
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 318
		var5 = 0; // L: 319

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 320
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 321
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 322
					var1[var5] = -1;
				}

				++var5; // L: 323
			}
		}

		this.tileTemplates[6][3] = var1; // L: 326
	} // L: 327

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "105389277"
	)
	@Export("init7")
	void init7() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 330
		boolean var2 = false; // L: 331
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 332
		int var5 = 0; // L: 333

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 334
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 335
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 336
					var1[var5] = -1;
				}

				++var5; // L: 337
			}
		}

		this.tileTemplates[7][0] = var1; // L: 340
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 341
		var5 = 0; // L: 342

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 343
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 344
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 345
					var1[var5] = -1;
				}

				++var5; // L: 346
			}
		}

		this.tileTemplates[7][1] = var1; // L: 349
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 350
		var5 = 0; // L: 351

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 352
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 353
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 354
					var1[var5] = -1;
				}

				++var5; // L: 355
			}
		}

		this.tileTemplates[7][2] = var1; // L: 358
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 359
		var5 = 0; // L: 360

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 361
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 362
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 363
					var1[var5] = -1;
				}

				++var5; // L: 364
			}
		}

		this.tileTemplates[7][3] = var1; // L: 367
	} // L: 368

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Ljava/lang/String;I)I",
		garbageValue = "-25177928"
	)
	public static int method5045(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		int var4 = var1.length(); // L: 21
		byte[] var5 = new byte[var4]; // L: 22

		for (int var6 = 0; var6 < var4; ++var6) { // L: 23
			char var7 = var1.charAt(var6); // L: 24
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 25
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 26
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 27
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 28
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 29
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 30
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 31
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 32
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 33
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 34
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 35
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 36
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 37
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 38
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 39
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 40
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 41
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 42
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 43
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 44
			} else if (var7 == 8212) { // L: 45
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 46
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 47
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 48
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 49
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 50
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 51
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 52
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 53
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 58
		var0.offset += class465.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lls;III)Lqn;",
		garbageValue = "1768522363"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) { // L: 109
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 112
			var4.width = class457.SpriteBuffer_spriteWidth; // L: 113
			var4.height = class457.SpriteBuffer_spriteHeight; // L: 114
			var4.xOffset = class457.SpriteBuffer_xOffsets[0]; // L: 115
			var4.yOffset = InterfaceParent.SpriteBuffer_yOffsets[0]; // L: 116
			var4.subWidth = class457.SpriteBuffer_spriteWidths[0]; // L: 117
			var4.subHeight = SoundCache.SpriteBuffer_spriteHeights[0]; // L: 118
			int var5 = var4.subHeight * var4.subWidth; // L: 119
			byte[] var6 = class181.SpriteBuffer_pixels[0]; // L: 120
			var4.pixels = new int[var5]; // L: 121

			for (int var7 = 0; var7 < var5; ++var7) { // L: 122
				var4.pixels[var7] = class457.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class457.SpriteBuffer_xOffsets = null; // L: 124
			InterfaceParent.SpriteBuffer_yOffsets = null; // L: 125
			class457.SpriteBuffer_spriteWidths = null; // L: 126
			SoundCache.SpriteBuffer_spriteHeights = null; // L: 127
			class457.SpriteBuffer_spritePalette = null; // L: 128
			class181.SpriteBuffer_pixels = null; // L: 129
			return var4; // L: 133
		}
	}
}
