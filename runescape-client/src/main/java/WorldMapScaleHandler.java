import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2099566519
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ay")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "16748608"
	)
	void method5617(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) { // L: 14
			var8 = this.method5607(var8, var7); // L: 15
			var7 = this.method5605(var7); // L: 16
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile); // L: 17
		}
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "3"
	)
	int method5607(int var1, int var2) {
		if (var2 == 9) { // L: 21
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) { // L: 22
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3; // L: 23
		}

		return var1; // L: 24
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-535525298"
	)
	int method5605(int var1) {
		if (var1 != 9 && var1 != 10) { // L: 28
			return var1 == 11 ? 8 : var1; // L: 29
		} else {
			return 1; // L: 30
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1297790581"
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
				if (var4 >= var3 << 1) { // L: 144
					var1[var2] = -1;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1279427771"
	)
	@Export("init3")
	void init3() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 170
		int var2 = 0; // L: 171

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 >> 1) { // L: 174
					var1[var2] = -1;
				}

				++var2;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-267130347"
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
				if (var4 <= var3 << 1) {
					var1[var2] = -1; // L: 222
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2096123364"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1959856235"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "-4"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class387.World_worlds != null) { // L: 172
			class150.doWorldSorting(0, class387.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1004328214"
	)
	static int method5645(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class507 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5121
			if (var0 != 7501) { // L: 5143
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5152
					Interpreter.Interpreter_intStackSize -= 3; // L: 5153
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5154
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5155
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5156
					var20 = ViewportMouse.method4930(var19); // L: 5157
					var7 = Message.method1241(var19); // L: 5158
					int var21 = Timer.method7748(var19); // L: 5159
					class508 var26 = class424.method7827(var3); // L: 5160
					class506 var27 = AbstractSocket.method8105(var20); // L: 5161
					int[] var28 = var27.field5040[var7]; // L: 5162
					int var12 = 0; // L: 5163
					int var13 = var28.length; // L: 5164
					if (var21 >= 0) { // L: 5165
						if (var21 >= var13) { // L: 5166
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5167
						}

						var12 = var21; // L: 5169
						var13 = var21 + 1; // L: 5170
					}

					Object[] var14 = var26.method8996(var7); // L: 5172
					if (var14 == null && var27.field5042 != null) { // L: 5173 5174
						var14 = var27.field5042[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5176
						for (var15 = var12; var15 < var13; ++var15) { // L: 5177
							var16 = var28[var15]; // L: 5178
							class503 var22 = class395.method7456(var16); // L: 5179
							if (var22 == class503.field5028) { // L: 5180
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class346.method6649(var16); // L: 5181
							}
						}

						return 1; // L: 5183
					} else {
						var15 = var14.length / var28.length; // L: 5185
						if (var5 >= 0 && var5 < var15) { // L: 5186
							for (var16 = var12; var16 < var13; ++var16) { // L: 5189
								int var17 = var16 + var28.length * var5; // L: 5190
								class503 var18 = class395.method7456(var28[var16]); // L: 5191
								if (var18 == class503.field5028) { // L: 5192
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5193
								}
							}

							return 1; // L: 5195
						} else {
							throw new RuntimeException(); // L: 5187
						}
					}
				} else if (var0 == 7503) { // L: 5197
					Interpreter.Interpreter_intStackSize -= 2; // L: 5198
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5199
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5200
					var5 = 0; // L: 5201
					var20 = ViewportMouse.method4930(var19); // L: 5202
					var7 = Message.method1241(var19); // L: 5203
					class508 var25 = class424.method7827(var3); // L: 5204
					class506 var9 = AbstractSocket.method8105(var20); // L: 5205
					int[] var10 = var9.field5040[var7]; // L: 5206
					Object[] var11 = var25.method8996(var7); // L: 5207
					if (var11 == null && var9.field5042 != null) { // L: 5208 5209
						var11 = var9.field5042[var7]; // L: 5210
					}

					if (var11 != null) { // L: 5213
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 5214
					return 1; // L: 5215
				} else if (var0 != 7504 && var0 != 7510) { // L: 5217
					if (var0 == 7505) { // L: 5234
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5235
						class508 var24 = class424.method7827(var3); // L: 5236
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.field5048; // L: 5237
						return 1; // L: 5238
					} else if (var0 == 7506) { // L: 5240
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5241
						var19 = -1; // L: 5242
						if (WorldMapAreaData.field3056 != null && var3 >= 0 && var3 < WorldMapAreaData.field3056.size()) { // L: 5243
							var19 = (Integer)WorldMapAreaData.field3056.get(var3); // L: 5244
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 5246
						return 1; // L: 5247
					} else if (var0 != 7507 && var0 != 7509) { // L: 5249
						return 2; // L: 5276
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5250
						var4 = class102.method2648(var3); // L: 5251
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5252
						var6 = class477.method8476(var5); // L: 5253
						if (var6 == null) { // L: 5254
							throw new RuntimeException(); // L: 5255
						} else if (ViewportMouse.method4930(var5) != Client.field619) { // L: 5257
							throw new RuntimeException(); // L: 5258
						} else if (WorldMapAreaData.field3056 == null && WorldMapAreaData.field3056.isEmpty()) { // L: 5260
							throw new RuntimeException(); // L: 5261
						} else {
							var7 = Timer.method7748(var5); // L: 5263
							List var8 = var6.method8989(var4, var7); // L: 5264
							WorldMapAreaData.field3056 = new LinkedList(WorldMapAreaData.field3056); // L: 5265
							if (var8 != null) { // L: 5266
								WorldMapAreaData.field3056.retainAll(var8); // L: 5267
							} else {
								WorldMapAreaData.field3056.clear(); // L: 5270
							}

							class210.field2302 = WorldMapAreaData.field3056.iterator(); // L: 5272
							if (var0 == 7507) { // L: 5273
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapAreaData.field3056.size();
							}

							return 1; // L: 5274
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 5218
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5219
					class507 var23 = JagexCache.method3528(var3); // L: 5220
					if (var23 == null) { // L: 5221
						throw new RuntimeException(); // L: 5222
					} else {
						WorldMapAreaData.field3056 = var23.method8989(0, 0); // L: 5224
						var5 = 0; // L: 5225
						if (WorldMapAreaData.field3056 != null) { // L: 5226
							Client.field619 = var3; // L: 5227
							class210.field2302 = WorldMapAreaData.field3056.iterator(); // L: 5228
							var5 = WorldMapAreaData.field3056.size(); // L: 5229
						}

						if (var0 == 7504) { // L: 5231
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5232
					}
				}
			} else {
				if (class210.field2302 != null && class210.field2302.hasNext()) { // L: 5144
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class210.field2302.next(); // L: 5145
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5148
				}

				return 1; // L: 5150
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5122
			var4 = class102.method2648(var3); // L: 5123
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5124
			var6 = class477.method8476(var5); // L: 5125
			if (var6 == null) { // L: 5126
				throw new RuntimeException(); // L: 5127
			} else {
				var7 = Timer.method7748(var5); // L: 5129
				WorldMapAreaData.field3056 = var6.method8989(var4, var7); // L: 5130
				if (WorldMapAreaData.field3056 != null) { // L: 5131
					Client.field619 = ViewportMouse.method4930(var5); // L: 5132
					class210.field2302 = WorldMapAreaData.field3056.iterator(); // L: 5133
					if (var0 == 7500) { // L: 5134
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapAreaData.field3056.size();
					}
				} else {
					Client.field619 = -1; // L: 5137
					class210.field2302 = null; // L: 5138
					if (var0 == 7500) { // L: 5139
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5141
			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2986
		class159.method3336(); // L: 2987
		UserComparator5.scene.clear(); // L: 2988

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2989
			Client.collisionMaps[var0].clear();
		}

		Client.field612.method4119(); // L: 2990
		System.gc(); // L: 2991
		RouteStrategy.method4227(0, 0); // L: 2992
		class306.field3398.clear(); // L: 2994
		Client.playingJingle = false; // L: 2996
		class133.method3041(); // L: 2997
		class129.method2989(10); // L: 2998
	} // L: 2999
}
