import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ag")
	int[] field1273;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 672511713
	)
	int field1276;
	@ObfuscatedName("av")
	int[] field1286;
	@ObfuscatedName("ap")
	int[] field1282;
	@ObfuscatedName("aq")
	int[] field1277;
	@ObfuscatedName("at")
	int[] field1278;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1138607883
	)
	int field1279;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1208447611
	)
	int field1280;
	@ObfuscatedName("aa")
	int[] field1281;
	@ObfuscatedName("au")
	int[] field1283;
	@ObfuscatedName("ae")
	int[] field1268;
	@ObfuscatedName("ab")
	int[] field1274;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1851485799
	)
	int field1285;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 659817712
	)
	int field1271;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1659001705
	)
	int field1287;

	@ObfuscatedSignature(
		descriptor = "([Luu;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1273 = new int[256]; // L: 13
		this.field1276 = 0; // L: 14
		this.field1279 = 0; // L: 19
		this.field1280 = 0; // L: 20
		this.field1285 = 0; // L: 25
		this.field1271 = 0; // L: 26
		this.field1287 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1971878867"
	)
	@Export("initColors")
	void initColors() {
		this.field1282 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1282[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1282[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1282[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1282[var1 + 192] = 16777215;
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

		this.field1278 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1278[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1278[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1278[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1278[var1 + 192] = 16777215;
		}

		this.field1286 = new int[256]; // L: 50
		this.field1285 = 0; // L: 51
		this.field1268 = new int[32768]; // L: 52
		this.field1274 = new int[32768]; // L: 53
		this.method2437((IndexedSprite)null); // L: 54
		this.field1281 = new int[32768]; // L: 55
		this.field1283 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	void method2459() {
		this.field1282 = null; // L: 60
		this.field1277 = null; // L: 61
		this.field1278 = null; // L: 62
		this.field1286 = null; // L: 63
		this.field1268 = null; // L: 64
		this.field1274 = null; // L: 65
		this.field1281 = null; // L: 66
		this.field1283 = null; // L: 67
		this.field1285 = 0; // L: 68
		this.field1271 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2005060089"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1281 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1287 == 0) { // L: 76
			this.field1287 = var2; // L: 77
		}

		int var3 = var2 - this.field1287; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1287 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2432(var3); // L: 83
		}

		this.method2428(var1); // L: 85
	} // L: 86

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "16626"
	)
	final void method2432(int var1) {
		this.field1285 += var1 * 128; // L: 89
		int var2;
		if (this.field1285 > this.field1268.length) { // L: 90
			this.field1285 -= this.field1268.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2437(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1281[var2 + var3] - this.field1268[var2 + this.field1285 & this.field1268.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1281[var2++] = var6; // L: 101
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
					this.field1281[var9 + var8] = 255;
				} else {
					this.field1281[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1279 * 16 > 0) { // L: 113
			this.field1279 = this.field1279 * 16 - var1 * 4;
		}

		if (this.field1280 * 16 > 0) { // L: 114
			this.field1280 = this.field1280 * 16 - var1 * 4;
		}

		if (this.field1279 * 16 == 0 && this.field1280 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1279 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1280 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1273[var7] = this.field1273[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1273[var7] = (int)(Math.sin((double)this.field1276 / 14.0D) * 16.0D + Math.sin((double)this.field1276 / 15.0D) * 14.0D + Math.sin((double)this.field1276 / 16.0D) * 12.0D); // L: 122
			++this.field1276; // L: 123
		}

		this.field1271 = this.field1271 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1271 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1281[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1271 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1281[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1281[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1283[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) { // L: 150
						var12 += this.field1283[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1283[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1281[var11 + var14] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "24"
	)
	final int method2434(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2121548101"
	)
	final void method2428(int var1) {
		int var2 = this.field1286.length; // L: 164
		if (this.field1279 * 16 > 0) { // L: 165
			this.method2435(this.field1279 * 16, this.field1277); // L: 166
		} else if (this.field1280 * 16 > 0) { // L: 168
			this.method2435(this.field1280 * 16, this.field1278); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1286[var3] = this.field1282[var3];
			}
		}

		this.method2436(var1); // L: 174
	} // L: 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "2"
	)
	final void method2435(int var1, int[] var2) {
		int var3 = this.field1286.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1286[var4] = this.method2434(this.field1282[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1286[var4] = var2[var4]; // L: 181
			} else {
				this.field1286[var4] = this.method2434(var2[var4], this.field1282[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2130924481"
	)
	final void method2436(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1273[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= class156.rasterProvider.width) { // L: 197
				var7 = class156.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * class156.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1281[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1286[var10]; // L: 208
					int var14 = class156.rasterProvider.pixels[var8]; // L: 209
					class156.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luu;B)V",
		garbageValue = "38"
	)
	final void method2437(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1268.length; ++var2) { // L: 219
			this.field1268[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1268[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1274[var5] = (this.field1268[var5 - 128] + this.field1268[var5 + 1] + this.field1268[var5 + 128] + this.field1268[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1268; // L: 231
			this.field1268 = this.field1274; // L: 232
			this.field1274 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1268[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-66"
	)
	static final int method2460(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)Z",
		garbageValue = "1149776403"
	)
	static boolean method2431(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 583
			int[] var1 = var0.transforms; // L: 585

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 586
				int var3 = var1[var2]; // L: 587
				ObjectComposition var4 = class90.getObjectDefinition(var3); // L: 589
				if (var4.mapIconId != -1) { // L: 590
					return true; // L: 591
				}
			}
		} else if (var0.mapIconId != -1) { // L: 597
			return true; // L: 598
		}

		return false; // L: 600
	}
}
