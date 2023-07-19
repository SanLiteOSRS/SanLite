import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("av")
	int[] field1269;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2112427919
	)
	int field1267;
	@ObfuscatedName("au")
	int[] field1270;
	@ObfuscatedName("az")
	int[] field1272;
	@ObfuscatedName("ab")
	int[] field1277;
	@ObfuscatedName("ao")
	int[] field1271;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -215237855
	)
	int field1264;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1792702465
	)
	int field1268;
	@ObfuscatedName("ag")
	int[] field1274;
	@ObfuscatedName("aa")
	int[] field1275;
	@ObfuscatedName("ar")
	int[] field1276;
	@ObfuscatedName("ad")
	int[] field1282;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -568233803
	)
	int field1278;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -511818576
	)
	int field1261;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1580525949
	)
	int field1280;

	@ObfuscatedSignature(
		descriptor = "([Lum;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1269 = new int[256]; // L: 13
		this.field1267 = 0; // L: 14
		this.field1264 = 0; // L: 19
		this.field1268 = 0; // L: 20
		this.field1278 = 0; // L: 25
		this.field1261 = 0; // L: 26
		this.field1280 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27090277"
	)
	@Export("initColors")
	void initColors() {
		this.field1272 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1272[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1272[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1272[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1272[var1 + 192] = 16777215;
		}

		this.field1277 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1277[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1277[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1277[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1277[var1 + 192] = 16777215;
		}

		this.field1271 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1271[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1271[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1271[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1271[var1 + 192] = 16777215;
		}

		this.field1270 = new int[256]; // L: 50
		this.field1278 = 0; // L: 51
		this.field1276 = new int[32768]; // L: 52
		this.field1282 = new int[32768]; // L: 53
		this.method2467((IndexedSprite)null); // L: 54
		this.field1274 = new int[32768]; // L: 55
		this.field1275 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1229571756"
	)
	void method2487() {
		this.field1272 = null; // L: 60
		this.field1277 = null; // L: 61
		this.field1271 = null; // L: 62
		this.field1270 = null; // L: 63
		this.field1276 = null; // L: 64
		this.field1282 = null; // L: 65
		this.field1274 = null; // L: 66
		this.field1275 = null; // L: 67
		this.field1278 = 0; // L: 68
		this.field1261 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1341415489"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1274 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1280 == 0) { // L: 76
			this.field1280 = var2; // L: 77
		}

		int var3 = var2 - this.field1280; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1280 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2462(var3); // L: 83
		}

		this.method2477(var1); // L: 85
	} // L: 86

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-545339927"
	)
	final void method2462(int var1) {
		this.field1278 += 128 * var1; // L: 89
		int var2;
		if (this.field1278 > this.field1276.length) { // L: 90
			this.field1278 -= this.field1276.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2467(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1274[var2 + var3] - this.field1276[var2 + this.field1278 & this.field1276.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1274[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 105
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1274[var9 + var8] = 255;
				} else {
					this.field1274[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1264 * 16 > 0) { // L: 113
			this.field1264 = this.field1264 * 16 - var1 * 4;
		}

		if (this.field1268 * 16 > 0) { // L: 114
			this.field1268 = this.field1268 * 16 - var1 * 4;
		}

		if (this.field1264 * 16 == 0 && this.field1268 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1264 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1268 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1269[var7] = this.field1269[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1269[var7] = (int)(Math.sin((double)this.field1267 / 14.0D) * 16.0D + Math.sin((double)this.field1267 / 15.0D) * 14.0D + Math.sin((double)this.field1267 / 16.0D) * 12.0D); // L: 122
			++this.field1267; // L: 123
		}

		this.field1261 = this.field1261 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1261 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1274[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1261 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1274[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1274[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1275[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1275[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1275[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1274[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "475804736"
	)
	final int method2459(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) >> 8; // L: 160
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-437980227"
	)
	final void method2477(int var1) {
		int var2 = this.field1270.length; // L: 164
		if (this.field1264 * 16 > 0) { // L: 165
			this.method2495(this.field1264 * 16, this.field1277); // L: 166
		} else if (this.field1268 * 16 > 0) { // L: 168
			this.method2495(this.field1268 * 16, this.field1271); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1270[var3] = this.field1272[var3];
			}
		}

		this.method2478(var1); // L: 174
	} // L: 175

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-695827164"
	)
	final void method2495(int var1, int[] var2) {
		int var3 = this.field1270.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1270[var4] = this.method2459(this.field1272[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1270[var4] = var2[var4]; // L: 181
			} else {
				this.field1270[var4] = this.method2459(var2[var4], this.field1272[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1668766886"
	)
	final void method2478(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1269[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= KitDefinition.rasterProvider.width) { // L: 197
				var7 = KitDefinition.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * KitDefinition.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1274[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1270[var10]; // L: 208
					int var14 = KitDefinition.rasterProvider.pixels[var8]; // L: 209
					KitDefinition.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lum;I)V",
		garbageValue = "-322477939"
	)
	final void method2467(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1276.length; ++var2) { // L: 219
			this.field1276[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1276[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1282[var5] = (this.field1276[var5 - 128] + this.field1276[var5 + 1] + this.field1276[var5 + 128] + this.field1276[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1276; // L: 231
			this.field1276 = this.field1282; // L: 232
			this.field1282 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1276[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V",
		garbageValue = "-327371417"
	)
	public static void method2497(AbstractArchive var0) {
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltf;IB)Z",
		garbageValue = "-55"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 369
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 370
			if (var0.readBits(1) != 0) { // L: 371
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 372
			var4 = var0.readBits(13); // L: 373
			boolean var12 = var0.readBits(1) == 1; // L: 374
			if (var12) { // L: 375
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 376
				throw new RuntimeException(); // L: 377
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 379
				var11.index = var1; // L: 380
				if (Players.field1364[var1] != null) { // L: 381
					var11.read(Players.field1364[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 382
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 383
				var7 = Players.Players_regions[var1]; // L: 384
				var8 = var7 >> 28; // L: 385
				var9 = var7 >> 14 & 255; // L: 386
				var10 = var7 & 255; // L: 387
				var11.pathTraversed[0] = Players.field1363[var1]; // L: 388
				var11.plane = (byte)var8; // L: 389
				var11.resetPath((var9 << 13) + var3 - class166.baseX * 64, (var10 << 13) + var4 - class9.baseY * 64); // L: 390
				var11.field1138 = false; // L: 391
				return true; // L: 392
			}
		} else if (var2 == 1) { // L: 394
			var3 = var0.readBits(2); // L: 395
			var4 = Players.Players_regions[var1]; // L: 396
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 397
			return false; // L: 398
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 400
				var3 = var0.readBits(5); // L: 401
				var4 = var3 >> 3; // L: 402
				var5 = var3 & 7; // L: 403
				var6 = Players.Players_regions[var1]; // L: 404
				var7 = (var6 >> 28) + var4 & 3; // L: 405
				var8 = var6 >> 14 & 255; // L: 406
				var9 = var6 & 255; // L: 407
				if (var5 == 0) { // L: 408
					--var8; // L: 409
					--var9; // L: 410
				}

				if (var5 == 1) { // L: 412
					--var9;
				}

				if (var5 == 2) { // L: 413
					++var8; // L: 414
					--var9; // L: 415
				}

				if (var5 == 3) { // L: 417
					--var8;
				}

				if (var5 == 4) { // L: 418
					++var8;
				}

				if (var5 == 5) { // L: 419
					--var8; // L: 420
					++var9; // L: 421
				}

				if (var5 == 6) { // L: 423
					++var9;
				}

				if (var5 == 7) { // L: 424
					++var8; // L: 425
					++var9; // L: 426
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 428
				return false; // L: 429
			} else {
				var3 = var0.readBits(18); // L: 431
				var4 = var3 >> 16; // L: 432
				var5 = var3 >> 8 & 255; // L: 433
				var6 = var3 & 255; // L: 434
				var7 = Players.Players_regions[var1]; // L: 435
				var8 = (var7 >> 28) + var4 & 3; // L: 436
				var9 = var5 + (var7 >> 14) & 255; // L: 437
				var10 = var6 + var7 & 255; // L: 438
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 439
				return false; // L: 440
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "84"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 143
		int var4 = 0; // L: 144

		for (int var5 = 0; var5 < var2; ++var5) { // L: 145
			int var6 = var0[var5 + var1] & 255; // L: 146
			if (var6 != 0) { // L: 147
				if (var6 >= 128 && var6 < 160) { // L: 148
					char var7 = class384.cp1252AsciiExtension[var6 - 128]; // L: 149
					if (var7 == 0) { // L: 150
						var7 = '?';
					}

					var6 = var7; // L: 151
				}

				var3[var4++] = (char)var6; // L: 153
			}
		}

		return new String(var3, 0, var4); // L: 155
	}
}
