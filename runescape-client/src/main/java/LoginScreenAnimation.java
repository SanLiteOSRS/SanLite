import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -549479619
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ab")
	int[] field1288;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -911474439
	)
	int field1289;
	@ObfuscatedName("ad")
	int[] field1290;
	@ObfuscatedName("al")
	int[] field1291;
	@ObfuscatedName("as")
	int[] field1292;
	@ObfuscatedName("ag")
	int[] field1286;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 74901507
	)
	int field1301;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 115615185
	)
	int field1283;
	@ObfuscatedName("ar")
	int[] field1294;
	@ObfuscatedName("aj")
	int[] field1300;
	@ObfuscatedName("au")
	int[] field1298;
	@ObfuscatedName("ay")
	int[] field1299;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1820880793
	)
	int field1293;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2085532876
	)
	int field1295;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -85121957
	)
	int field1302;

	@ObfuscatedSignature(
		descriptor = "([Lvl;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1288 = new int[256]; // L: 13
		this.field1289 = 0; // L: 14
		this.field1301 = 0; // L: 19
		this.field1283 = 0; // L: 20
		this.field1293 = 0; // L: 25
		this.field1295 = 0; // L: 26
		this.field1302 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1665687449"
	)
	@Export("initColors")
	void initColors() {
		this.field1291 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1291[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1291[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1291[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1291[var1 + 192] = 16777215;
		}

		this.field1292 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1292[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1292[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1292[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1292[var1 + 192] = 16777215;
		}

		this.field1286 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1286[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1286[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1286[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1286[var1 + 192] = 16777215;
		}

		this.field1290 = new int[256]; // L: 50
		this.field1293 = 0; // L: 51
		this.field1298 = new int[32768]; // L: 52
		this.field1299 = new int[32768]; // L: 53
		this.method2440((IndexedSprite)null); // L: 54
		this.field1294 = new int[32768]; // L: 55
		this.field1300 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31515"
	)
	void method2433() {
		this.field1291 = null; // L: 60
		this.field1292 = null; // L: 61
		this.field1286 = null; // L: 62
		this.field1290 = null; // L: 63
		this.field1298 = null; // L: 64
		this.field1299 = null; // L: 65
		this.field1294 = null; // L: 66
		this.field1300 = null; // L: 67
		this.field1293 = 0; // L: 68
		this.field1295 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-826629596"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1294 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1302 == 0) { // L: 76
			this.field1302 = var2; // L: 77
		}

		int var3 = var2 - this.field1302; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1302 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2434(var3); // L: 83
		}

		this.method2437(var1); // L: 85
	} // L: 86

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	final void method2434(int var1) {
		this.field1293 += 128 * var1; // L: 89
		int var2;
		if (this.field1293 > this.field1298.length) { // L: 90
			this.field1293 -= this.field1298.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2440(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1294[var2 + var3] - this.field1298[var2 + this.field1293 & this.field1298.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1294[var2++] = var6; // L: 101
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
					this.field1294[var9 + var8] = 255;
				} else {
					this.field1294[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1301 * 16 > 0) { // L: 113
			this.field1301 = this.field1301 * 16 - var1 * 4;
		}

		if (this.field1283 * 16 > 0) { // L: 114
			this.field1283 = this.field1283 * 16 - var1 * 4;
		}

		if (this.field1301 * 16 == 0 && this.field1283 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1301 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1283 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1288[var7] = this.field1288[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1288[var7] = (int)(Math.sin((double)this.field1289 / 14.0D) * 16.0D + Math.sin((double)this.field1289 / 15.0D) * 14.0D + Math.sin((double)this.field1289 / 16.0D) * 12.0D); // L: 122
			++this.field1289; // L: 123
		}

		this.field1295 = this.field1295 * 10000 + var1 * 100; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1295 * 10000; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1294[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1295 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1294[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1294[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1300[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) { // L: 150
						var12 += this.field1300[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1300[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1294[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1749331098"
	)
	final int method2436(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) + (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) >> 8; // L: 160
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "124"
	)
	final void method2437(int var1) {
		int var2 = this.field1290.length; // L: 164
		if (this.field1301 * 16 > 0) { // L: 165
			this.method2432(this.field1301 * 16, this.field1292); // L: 166
		} else if (this.field1283 * 16 > 0) { // L: 168
			this.method2432(this.field1283 * 16, this.field1286); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1290[var3] = this.field1291[var3];
			}
		}

		this.method2438(var1); // L: 174
	} // L: 175

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1361327655"
	)
	final void method2432(int var1, int[] var2) {
		int var3 = this.field1290.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1290[var4] = this.method2436(this.field1291[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1290[var4] = var2[var4]; // L: 181
			} else {
				this.field1290[var4] = this.method2436(var2[var4], this.field1291[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1162704482"
	)
	final void method2438(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1288[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= UserComparator9.rasterProvider.width) { // L: 197
				var7 = UserComparator9.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * UserComparator9.rasterProvider.width; // L: 200
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1294[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1290[var10];
					int var14 = UserComparator9.rasterProvider.pixels[var8]; // L: 209
					UserComparator9.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvl;S)V",
		garbageValue = "8073"
	)
	final void method2440(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1298.length; ++var2) {
			this.field1298[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1298[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7);
					this.field1299[var5] = (this.field1298[var5 + 128] + this.field1298[var5 - 128] + this.field1298[var5 + 1] + this.field1298[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1298; // L: 231
			this.field1298 = this.field1299;
			this.field1299 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight * 61063424; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1298[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lun;IB)V",
		garbageValue = "103"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 201
		if (var2) { // L: 202
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 203
		Player var4 = Client.players[var1]; // L: 204
		if (var3 == 0) { // L: 205
			if (var2) { // L: 206
				var4.field1147 = false; // L: 207
			} else if (Client.localPlayerIndex == var1) { // L: 210
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (DevicePcmPlayerProvider.baseY * 64 + var4.pathY[0] >> 13) + (GrandExchangeOfferOwnWorldComparator.baseX * 64 + var4.pathX[0] >> 13 << 14); // L: 211
				if (var4.field1272 != -1) { // L: 212
					Players.Players_orientations[var1] = var4.field1272;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 213
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 214
				Client.players[var1] = null; // L: 215
				if (var0.readBits(1) != 0) { // L: 216
					class362.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 219
				var5 = var0.readBits(3); // L: 220
				var6 = var4.pathX[0]; // L: 221
				var7 = var4.pathY[0]; // L: 222
				if (var5 == 0) { // L: 223
					--var6; // L: 224
					--var7; // L: 225
				} else if (var5 == 1) { // L: 227
					--var7;
				} else if (var5 == 2) { // L: 228
					++var6; // L: 229
					--var7; // L: 230
				} else if (var5 == 3) { // L: 232
					--var6;
				} else if (var5 == 4) { // L: 233
					++var6;
				} else if (var5 == 5) { // L: 234
					--var6; // L: 235
					++var7; // L: 236
				} else if (var5 == 6) { // L: 238
					++var7;
				} else if (var5 == 7) { // L: 239
					++var6; // L: 240
					++var7; // L: 241
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 243
					var4.resetPath(var6, var7); // L: 244
					var4.field1147 = false; // L: 245
				} else if (var2) { // L: 247
					var4.field1147 = true; // L: 248
					var4.tileX = var6; // L: 249
					var4.tileY = var7; // L: 250
				} else {
					var4.field1147 = false; // L: 253
					var4.method2342(var6, var7, Players.field1383[var1]); // L: 254
				}

			} else if (var3 == 2) { // L: 258
				var5 = var0.readBits(4); // L: 259
				var6 = var4.pathX[0]; // L: 260
				var7 = var4.pathY[0]; // L: 261
				if (var5 == 0) { // L: 262
					var6 -= 2; // L: 263
					var7 -= 2; // L: 264
				} else if (var5 == 1) { // L: 266
					--var6; // L: 267
					var7 -= 2; // L: 268
				} else if (var5 == 2) { // L: 270
					var7 -= 2;
				} else if (var5 == 3) { // L: 271
					++var6; // L: 272
					var7 -= 2; // L: 273
				} else if (var5 == 4) { // L: 275
					var6 += 2; // L: 276
					var7 -= 2; // L: 277
				} else if (var5 == 5) { // L: 279
					var6 -= 2; // L: 280
					--var7; // L: 281
				} else if (var5 == 6) { // L: 283
					var6 += 2; // L: 284
					--var7; // L: 285
				} else if (var5 == 7) { // L: 287
					var6 -= 2;
				} else if (var5 == 8) { // L: 288
					var6 += 2;
				} else if (var5 == 9) { // L: 289
					var6 -= 2; // L: 290
					++var7; // L: 291
				} else if (var5 == 10) { // L: 293
					var6 += 2; // L: 294
					++var7; // L: 295
				} else if (var5 == 11) { // L: 297
					var6 -= 2; // L: 298
					var7 += 2; // L: 299
				} else if (var5 == 12) { // L: 301
					--var6; // L: 302
					var7 += 2; // L: 303
				} else if (var5 == 13) { // L: 305
					var7 += 2;
				} else if (var5 == 14) { // L: 306
					++var6; // L: 307
					var7 += 2; // L: 308
				} else if (var5 == 15) { // L: 310
					var6 += 2; // L: 311
					var7 += 2; // L: 312
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 314
					var4.resetPath(var6, var7); // L: 315
					var4.field1147 = false; // L: 316
				} else if (var2) { // L: 318
					var4.field1147 = true; // L: 319
					var4.tileX = var6; // L: 320
					var4.tileY = var7; // L: 321
				} else {
					var4.field1147 = false; // L: 324
					var4.method2342(var6, var7, Players.field1383[var1]); // L: 325
				}

			} else {
				var5 = var0.readBits(1); // L: 329
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 330
					var6 = var0.readBits(12); // L: 331
					var7 = var6 >> 10; // L: 332
					var8 = var6 >> 5 & 31; // L: 333
					if (var8 > 15) { // L: 334
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 335
					if (var9 > 15) { // L: 336
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 337
					var11 = var9 + var4.pathY[0]; // L: 338
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 339
						if (var2) { // L: 343
							var4.field1147 = true; // L: 344
							var4.tileX = var10; // L: 345
							var4.tileY = var11; // L: 346
						} else {
							var4.field1147 = false; // L: 349
							var4.method2342(var10, var11, Players.field1383[var1]); // L: 350
						}
					} else {
						var4.resetPath(var10, var11); // L: 340
						var4.field1147 = false; // L: 341
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 352
					if (Client.localPlayerIndex == var1) { // L: 353
						class172.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 356
					var7 = var6 >> 28; // L: 357
					var8 = var6 >> 14 & 16383; // L: 358
					var9 = var6 & 16383; // L: 359
					var10 = (GrandExchangeOfferOwnWorldComparator.baseX * 64 + var8 + var4.pathX[0] & 16383) - GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 360
					var11 = (DevicePcmPlayerProvider.baseY * 64 + var9 + var4.pathY[0] & 16383) - DevicePcmPlayerProvider.baseY * 64; // L: 361
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 362
						var4.resetPath(var10, var11); // L: 363
						var4.field1147 = false; // L: 364
					} else if (var2) { // L: 366
						var4.field1147 = true; // L: 367
						var4.tileX = var10; // L: 368
						var4.tileY = var11; // L: 369
					} else {
						var4.field1147 = false; // L: 372
						var4.method2342(var10, var11, Players.field1383[var1]); // L: 373
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 375
					if (Client.localPlayerIndex == var1) { // L: 376
						class172.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 208 217 256 327 354 377

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-113724725"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3836 == null) { // L: 1280
			throw new RuntimeException(); // L: 1281
		} else {
			if (var0.field3766 == null) { // L: 1283
				var0.field3766 = new int[var0.field3836.length]; // L: 1284
			}

			var0.field3766[var1] = Integer.MAX_VALUE; // L: 1286
		}
	} // L: 1287
}
