import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kn")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -183595775
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("al")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "354305543"
	)
	void method5368(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
			var8 = this.method5325(var8, var7);
			var7 = this.method5323(var7); // L: 16
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile); // L: 17
		}
	} // L: 18

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "295942057"
	)
	int method5325(int var1, int var2) {
		if (var2 == 9) { // L: 21
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) { // L: 22
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) { // L: 23
			var1 = var1 + 3 & 3;
		}

		return var1; // L: 24
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1852044276"
	)
	int method5323(int var1) {
		if (var1 != 9 && var1 != 10) { // L: 28
			return var1 == 11 ? 8 : var1; // L: 29
		} else {
			return 1; // L: 30
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1547047008"
	)
	@Export("init")
	void init() {
		if (this.tileTemplates == null) { // L: 34
			this.tileTemplates = new byte[8][4][]; // L: 37
			this.init0(); // L: 38
			this.init1(); // L: 39
			this.init2(); // L: 40
			this.init3(); // L: 41
			this.init4(); // L: 42
			this.init5(); // L: 43
			this.init6(); // L: 44
			this.init7(); // L: 45
		}
	} // L: 35 46

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "513334212"
	)
	@Export("init0")
	void init0() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 49
		int var2 = 0; // L: 50

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 51
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 52
				if (var4 <= var3) { // L: 53
					var1[var2] = -1;
				}

				++var2; // L: 54
			}
		}

		this.tileTemplates[0][0] = var1; // L: 57
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 58
		var2 = 0; // L: 59

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 60
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
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0; // L: 77

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3) { // L: 80
					var1[var2] = -1;
				}

				++var2; // L: 81
			}
		}

		this.tileTemplates[0][3] = var1; // L: 84
	} // L: 85

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2140987782"
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

		this.tileTemplates[1][1] = var1; // L: 109
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 110
		var2 = 0; // L: 111

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 112
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 113
				if (var4 <= var3 >> 1) { // L: 114
					var1[var2] = -1;
				}

				++var2; // L: 115
			}
		}

		this.tileTemplates[1][2] = var1; // L: 118
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 119
		var2 = 0; // L: 120

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 121
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 122
				if (var4 >= var3 << 1) { // L: 123
					var1[var2] = -1;
				}

				++var2; // L: 124
			}
		}

		this.tileTemplates[1][3] = var1; // L: 127
	} // L: 128

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1441100224"
	)
	@Export("init2")
	void init2() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 131
		int var2 = 0; // L: 132

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 133
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1120844163"
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
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 << 1) { // L: 201
					var1[var2] = -1;
				}

				++var2; // L: 202
			}
		}

		this.tileTemplates[3][3] = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("init4")
	void init4() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 209
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2; // L: 214
			}
		}

		this.tileTemplates[4][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 218
		var2 = 0; // L: 219

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 221
				if (var4 <= var3 << 1) { // L: 222
					var1[var2] = -1;
				}

				++var2; // L: 223
			}
		}

		this.tileTemplates[4][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 230
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][2] = var1; // L: 235
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-125892"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2032657108"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-956475054"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lmg;B)V",
		garbageValue = "0"
	)
	public static void method5372(Huffman var0) {
		class315.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lne;IIB)Lsn;",
		garbageValue = "1"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 70
		boolean var3;
		if (var4 == null) { // L: 71
			var3 = false; // L: 72
		} else {
			class212.SpriteBuffer_decode(var4); // L: 75
			var3 = true; // L: 76
		}

		return !var3 ? null : class7.method55(); // L: 78 79
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IIIIIII)V",
		garbageValue = "-1255218703"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class331.method6350(var1, var2, var3)) { // L: 194
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 195

			while (true) {
				var7 = var0.readUnsignedShort(); // L: 197
				if (var7 == 0) { // L: 198
					if (var1 == 0) { // L: 199
						Tiles.Tiles_heights[0][var2][var3] = -ItemLayer.method4162(var4 + 932731, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 200
					}
					break;
				}

				if (var7 == 1) { // L: 203
					int var8 = var0.readUnsignedByte(); // L: 204
					if (var8 == 1) { // L: 205
						var8 = 0;
					}

					if (var1 == 0) { // L: 206
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 207
					}
					break;
				}

				if (var7 <= 49) { // L: 210
					Tiles.field996[var1][var2][var3] = (short)var0.readShort(); // L: 211
					class16.field81[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 212
					Tiles.field997[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 213
				} else if (var7 <= 81) { // L: 216
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 217
				} else {
					Tiles.field995[var1][var2][var3] = (short)(var7 - 81); // L: 220
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort(); // L: 225
				if (var7 == 0) { // L: 226
					break;
				}

				if (var7 == 1) { // L: 227
					var0.readUnsignedByte(); // L: 228
					break; // L: 229
				}

				if (var7 <= 49) { // L: 231
					var0.readShort(); // L: 232
				}
			}
		}

	} // L: 236

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-2124660715"
	)
	static int method5374(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2746
			Interpreter.Interpreter_intStackSize -= 2; // L: 2747
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2748
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2749
			EnumComposition var10 = class132.getEnum(var3); // L: 2750
			if (var10.outputType != 's') { // L: 2751
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2752
				if (var9 == var10.keys[var6]) { // L: 2753
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2754
					var10 = null; // L: 2755
					break;
				}
			}

			if (var10 != null) { // L: 2759
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2760
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2762
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2788
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2789
				EnumComposition var4 = class132.getEnum(var3); // L: 2790
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2791
				return 1; // L: 2792
			} else {
				return 2; // L: 2794
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2763
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2764
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2765
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2766
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2767
			EnumComposition var7 = class132.getEnum(var5); // L: 2768
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2769
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2774
					if (var6 == var7.keys[var8]) { // L: 2775
						if (var9 == 115) { // L: 2776
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2777
						}

						var7 = null; // L: 2778
						break;
					}
				}

				if (var7 != null) { // L: 2782
					if (var9 == 115) { // L: 2783
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2784
					}
				}

				return 1; // L: 2786
			} else {
				if (var9 == 115) { // L: 2770
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2771
				}

				return 1; // L: 2772
			}
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Lmy;II)Ljava/lang/String;",
		garbageValue = "-666727144"
	)
	static String method5373(Widget var0, int var1) {
		int var3 = ParamComposition.getWidgetFlags(var0); // L: 12091
		boolean var2 = (var3 >> var1 + 1 & 1) != 0; // L: 12093
		if (!var2 && var0.onOp == null) { // L: 12095
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 12096 12097 12099
		}
	}
}
