import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ag")
	int[] field1259;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1893283719
	)
	int field1255;
	@ObfuscatedName("ae")
	int[] field1261;
	@ObfuscatedName("aa")
	int[] field1262;
	@ObfuscatedName("au")
	int[] field1263;
	@ObfuscatedName("an")
	int[] field1264;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1920516857
	)
	int field1269;
	@ObfuscatedName("ax")
	int field1266;
	@ObfuscatedName("aw")
	int[] field1267;
	@ObfuscatedName("az")
	int[] field1268;
	@ObfuscatedName("av")
	int[] field1271;
	@ObfuscatedName("ak")
	int[] field1258;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 170101203
	)
	int field1265;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -84806288
	)
	int field1256;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -999232789
	)
	int field1273;

	@ObfuscatedSignature(
		descriptor = "([Lut;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1259 = new int[256]; // L: 13
		this.field1255 = 0; // L: 14
		this.field1269 = 0; // L: 19
		this.field1266 = 0; // L: 20
		this.field1265 = 0; // L: 25
		this.field1256 = 0; // L: 26
		this.field1273 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2144749053"
	)
	@Export("initColors")
	void initColors() {
		this.field1262 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1262[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1262[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1262[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1262[var1 + 192] = 16777215;
		}

		this.field1263 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1263[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1263[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1263[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1263[var1 + 192] = 16777215;
		}

		this.field1264 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1264[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1264[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1264[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1264[var1 + 192] = 16777215;
		}

		this.field1261 = new int[256];
		this.field1265 = 0;
		this.field1271 = new int[32768]; // L: 52
		this.field1258 = new int[32768]; // L: 53
		this.method2517((IndexedSprite)null);
		this.field1267 = new int[32768];
		this.field1268 = new int[32768];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2013516897"
	)
	void method2509() {
		this.field1262 = null;
		this.field1263 = null;
		this.field1264 = null;
		this.field1261 = null; // L: 63
		this.field1271 = null;
		this.field1258 = null;
		this.field1267 = null;
		this.field1268 = null;
		this.field1265 = 0;
		this.field1256 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-532887178"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1267 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1273 == 0) {
			this.field1273 = var2;
		}

		int var3 = var2 - this.field1273; // L: 79
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1273 = var2;
		if (var3 > 0) {
			this.method2502(var3);
		}

		this.method2504(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "93279662"
	)
	final void method2502(int var1) {
		this.field1265 += var1 * 128; // L: 89
		int var2;
		if (this.field1265 > this.field1271.length) {
			this.field1265 -= this.field1271.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2517(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1267[var3 + var2] - this.field1271[var2 + this.field1265 & this.field1271.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1267[var2++] = var6;
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1267[var9 + var8] = 255;
				} else {
					this.field1267[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1269 * 16 > 0) { // L: 113
			this.field1269 = this.field1269 * 16 - var1 * 4;
		}

		if (this.field1266 * -570726311 > 0) { // L: 114
			this.field1266 -= var1 * 1039499172;
		}

		if (this.field1269 * 16 == 0 && this.field1266 * -570726311 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1269 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1266 = -176184320;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1259[var7] = this.field1259[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1259[var7] = (int)(Math.sin((double)this.field1255 / 14.0D) * 16.0D + Math.sin((double)this.field1255 / 15.0D) * 14.0D + Math.sin((double)this.field1255 / 16.0D) * 12.0D); // L: 122
			++this.field1255; // L: 123
		}

		this.field1256 = this.field1256 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1256 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1267[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1256 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1267[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1267[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1268[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1268[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1268[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1267[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1619403608"
	)
	final int method2527(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	final void method2504(int var1) {
		int var2 = this.field1261.length; // L: 164
		if (this.field1269 * 16 > 0) { // L: 165
			this.method2505(this.field1269 * 16, this.field1263); // L: 166
		} else if (this.field1266 * -570726311 > 0) { // L: 168
			this.method2505(this.field1266 * -570726311, this.field1264); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1261[var3] = this.field1262[var3];
			}
		}

		this.method2506(var1); // L: 174
	} // L: 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1714337478"
	)
	final void method2505(int var1, int[] var2) {
		int var3 = this.field1261.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1261[var4] = this.method2527(this.field1262[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1261[var4] = var2[var4]; // L: 181
			} else {
				this.field1261[var4] = this.method2527(var2[var4], this.field1262[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-826706835"
	)
	final void method2506(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1259[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= WorldMapData_1.rasterProvider.width) { // L: 197
				var7 = WorldMapData_1.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * WorldMapData_1.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1267[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1261[var10]; // L: 208
					int var14 = WorldMapData_1.rasterProvider.pixels[var8]; // L: 209
					WorldMapData_1.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lut;I)V",
		garbageValue = "-781415280"
	)
	final void method2517(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1271.length; ++var2) { // L: 219
			this.field1271[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1271[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1258[var5] = (this.field1271[var5 + 1] + this.field1271[var5 + 128] + this.field1271[var5 - 128] + this.field1271[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1271; // L: 231
			this.field1271 = this.field1258; // L: 232
			this.field1258 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1271[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "593423002"
	)
	static float method2530(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 200

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 201
			var3 = var2 * var3 + var0[var4]; // L: 202
		}

		return var3; // L: 204
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1844567134"
	)
	public static void method2528(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) { // L: 44
			class319.field3461.clear(); // L: 47
			class319.field3462.clear(); // L: 48
			if (var5) { // L: 50
				class150.method3304(); // L: 51
			} else {
				for (int var6 = 0; var6 < class319.field3459.size(); ++var6) { // L: 54
					class331 var7 = (class331)class319.field3459.get(var6); // L: 55
					if (var7 == null) { // L: 56
						class319.field3459.remove(var6); // L: 57
						--var6; // L: 58
					} else if (var7.field3581) { // L: 60
						if (var7.field3582.field3499 > 0) { // L: 61
							--var7.field3582.field3499; // L: 62
						}

						var7.field3582.clear(); // L: 64
						var7.field3582.method6075(); // L: 65
						var7.field3582.setPcmStreamVolume(0); // L: 66
						class319.field3459.remove(var6); // L: 67
						--var6; // L: 68
					} else {
						var7.field3581 = true; // L: 71
					}
				}
			}

			ByteArrayPool.method8035(var0, var5); // L: 76
			if (!class319.field3461.isEmpty()) { // L: 77
				WorldMapRectangle.method5019(var1, var2, var3, var4); // L: 80
				class319.field3462.add(new class415((class422)null)); // L: 81
				class319.field3462.add(new class424((class422)null, class319.field3458, class319.field3455, class319.field3456)); // L: 82
				ArrayList var12 = new ArrayList(); // L: 83
				var12.add(new class419(new class421((class422)null, 0, true, class319.field3454))); // L: 84
				if (!class319.field3459.isEmpty()) { // L: 85
					ArrayList var13 = new ArrayList(); // L: 86
					var13.add(new class418(new class423((class422)null, var12), class319.field3465)); // L: 87
					ArrayList var9 = new ArrayList(); // L: 90
					Iterator var10 = class319.field3459.iterator(); // L: 91

					while (var10.hasNext()) {
						class331 var11 = (class331)var10.next(); // L: 92
						var9.add(var11); // L: 94
					}

					var13.add(new class418(new class420(new class417((class422)null, var9), 0, false, class319.field3464), class319.field3460)); // L: 100
					class319.field3462.add(new class423((class422)null, var13)); // L: 101
				} else {
					class319.field3462.add(new class418((class422)null, class319.field3465)); // L: 104
					class319.field3462.add(new class423((class422)null, var12)); // L: 105
				}

			}
		}
	} // L: 45 78 107

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-137066881"
	)
	public static void method2529() {
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 307
		PlayerComposition.archive10.clearFiles(); // L: 308
		PlayerComposition.field3652 = 0; // L: 309
	} // L: 310
}
