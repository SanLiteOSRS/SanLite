import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("av")
	int[] field1231;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1799581355
	)
	int field1234;
	@ObfuscatedName("ap")
	int[] field1235;
	@ObfuscatedName("ar")
	int[] field1236;
	@ObfuscatedName("ak")
	int[] field1237;
	@ObfuscatedName("ax")
	int[] field1238;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -987210543
	)
	int field1247;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 976671989
	)
	int field1229;
	@ObfuscatedName("am")
	int[] field1246;
	@ObfuscatedName("az")
	int[] field1242;
	@ObfuscatedName("ae")
	int[] field1243;
	@ObfuscatedName("au")
	int[] field1244;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -843108399
	)
	int field1245;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -316853488
	)
	int field1240;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1747294615
	)
	int field1233;

	@ObfuscatedSignature(
		descriptor = "([Lsp;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1231 = new int[256]; // L: 13
		this.field1234 = 0; // L: 14
		this.field1247 = 0; // L: 19
		this.field1229 = 0; // L: 20
		this.field1245 = 0; // L: 25
		this.field1240 = 0; // L: 26
		this.field1233 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	@Export("initColors")
	void initColors() {
		this.field1236 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1236[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1236[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1236[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1236[var1 + 192] = 16777215;
		}

		this.field1237 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1237[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1237[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1237[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1237[var1 + 192] = 16777215;
		}

		this.field1238 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1238[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1238[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1238[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1238[var1 + 192] = 16777215;
		}

		this.field1235 = new int[256]; // L: 50
		this.field1245 = 0; // L: 51
		this.field1243 = new int[32768]; // L: 52
		this.field1244 = new int[32768]; // L: 53
		this.method2394((IndexedSprite)null); // L: 54
		this.field1246 = new int[32768]; // L: 55
		this.field1242 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1947284022"
	)
	void method2418() {
		this.field1236 = null; // L: 60
		this.field1237 = null; // L: 61
		this.field1238 = null; // L: 62
		this.field1235 = null; // L: 63
		this.field1243 = null; // L: 64
		this.field1244 = null; // L: 65
		this.field1246 = null; // L: 66
		this.field1242 = null; // L: 67
		this.field1245 = 0; // L: 68
		this.field1240 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1856839217"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1246 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1233 == 0) { // L: 76
			this.field1233 = var2; // L: 77
		}

		int var3 = var2 - this.field1233; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1233 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2389(var3); // L: 83
		}

		this.method2391(var1); // L: 85
	} // L: 86

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2069106519"
	)
	final void method2389(int var1) {
		this.field1245 += 128 * var1; // L: 89
		int var2;
		if (this.field1245 > this.field1243.length) { // L: 90
			this.field1245 -= this.field1243.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2394(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1246[var2 + var3] - this.field1243[var2 + this.field1245 & this.field1243.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1246[var2++] = var6; // L: 101
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
					this.field1246[var8 + var9] = 255;
				} else {
					this.field1246[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1247 * 16 > 0) { // L: 113
			this.field1247 = this.field1247 * 16 - var1 * 4;
		}

		if (this.field1229 * 16 > 0) { // L: 114
			this.field1229 = this.field1229 * 16 - var1 * 4;
		}

		if (this.field1247 * 16 == 0 && this.field1229 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1247 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1229 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1231[var7] = this.field1231[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1231[var7] = (int)(Math.sin((double)this.field1234 / 14.0D) * 16.0D + Math.sin((double)this.field1234 / 15.0D) * 14.0D + Math.sin((double)this.field1234 / 16.0D) * 12.0D); // L: 122
			++this.field1234; // L: 123
		}

		this.field1240 = this.field1240 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1240 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1246[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1240 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1246[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1246[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1242[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1242[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1242[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1246[var11 + var14] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1192166879"
	)
	final int method2399(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	final void method2391(int var1) {
		int var2 = this.field1235.length; // L: 164
		if (this.field1247 * 16 > 0) { // L: 165
			this.method2392(this.field1247 * 16, this.field1237); // L: 166
		} else if (this.field1229 * 16 > 0) { // L: 168
			this.method2392(this.field1229 * 16, this.field1238); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1235[var3] = this.field1236[var3];
			}
		}

		this.method2393(var1); // L: 174
	} // L: 175

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "100"
	)
	final void method2392(int var1, int[] var2) {
		int var3 = this.field1235.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1235[var4] = this.method2399(this.field1236[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1235[var4] = var2[var4]; // L: 181
			} else {
				this.field1235[var4] = this.method2399(var2[var4], this.field1236[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	final void method2393(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1231[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= StudioGame.rasterProvider.width) { // L: 197
				var7 = StudioGame.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * StudioGame.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1246[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1235[var10]; // L: 208
					int var14 = StudioGame.rasterProvider.pixels[var8]; // L: 209
					StudioGame.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsp;B)V",
		garbageValue = "11"
	)
	final void method2394(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1243.length; ++var2) { // L: 219
			this.field1243[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1243[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1244[var5] = (this.field1243[var5 + 128] + this.field1243[var5 - 128] + this.field1243[var5 + 1] + this.field1243[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1243; // L: 231
			this.field1243 = this.field1244; // L: 232
			this.field1244 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1243[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248
}
