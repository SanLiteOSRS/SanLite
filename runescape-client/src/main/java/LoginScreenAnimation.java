import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -1607769143
	)
	static int field1255;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ab")
	int[] field1243;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1914114845
	)
	int field1238;
	@ObfuscatedName("ae")
	int[] field1239;
	@ObfuscatedName("af")
	int[] field1240;
	@ObfuscatedName("ao")
	int[] field1241;
	@ObfuscatedName("aa")
	int[] field1242;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2099905589
	)
	int field1235;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 17894531
	)
	int field1237;
	@ObfuscatedName("ac")
	int[] field1245;
	@ObfuscatedName("ag")
	int[] field1246;
	@ObfuscatedName("ar")
	int[] field1250;
	@ObfuscatedName("ah")
	int[] field1247;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 591451375
	)
	int field1249;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -647223728
	)
	int field1248;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -935042527
	)
	int field1251;

	@ObfuscatedSignature(
		descriptor = "([Ltj;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1243 = new int[256]; // L: 13
		this.field1238 = 0; // L: 14
		this.field1235 = 0; // L: 19
		this.field1237 = 0; // L: 20
		this.field1249 = 0; // L: 25
		this.field1248 = 0; // L: 26
		this.field1251 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1396331421"
	)
	@Export("initColors")
	void initColors() {
		this.field1240 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1240[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1240[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1240[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1240[var1 + 192] = 16777215;
		}

		this.field1241 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1241[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1241[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1241[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1241[var1 + 192] = 16777215;
		}

		this.field1242 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1242[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1242[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1242[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1242[var1 + 192] = 16777215;
		}

		this.field1239 = new int[256]; // L: 50
		this.field1249 = 0; // L: 51
		this.field1250 = new int[32768]; // L: 52
		this.field1247 = new int[32768]; // L: 53
		this.method2408((IndexedSprite)null); // L: 54
		this.field1245 = new int[32768]; // L: 55
		this.field1246 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-888845669"
	)
	void method2402() {
		this.field1240 = null; // L: 60
		this.field1241 = null; // L: 61
		this.field1242 = null; // L: 62
		this.field1239 = null; // L: 63
		this.field1250 = null; // L: 64
		this.field1247 = null; // L: 65
		this.field1245 = null; // L: 66
		this.field1246 = null; // L: 67
		this.field1249 = 0; // L: 68
		this.field1248 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-693157530"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1245 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1251 == 0) { // L: 76
			this.field1251 = var2; // L: 77
		}

		int var3 = var2 - this.field1251; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1251 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2404(var3); // L: 83
		}

		this.method2406(var1); // L: 85
	} // L: 86

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "81"
	)
	final void method2404(int var1) {
		this.field1249 += var1 * 128; // L: 89
		int var2;
		if (this.field1249 > this.field1250.length) { // L: 90
			this.field1249 -= this.field1250.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2408(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1245[var2 + var3] - this.field1250[var2 + this.field1249 & this.field1250.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1245[var2++] = var6; // L: 101
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
					this.field1245[var8 + var9] = 255;
				} else {
					this.field1245[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1235 * 16 > 0) {
			this.field1235 = this.field1235 * 16 - var1 * 4;
		}

		if (this.field1237 * 16 > 0) { // L: 114
			this.field1237 = this.field1237 * 16 - var1 * 4;
		}

		if (this.field1235 * 16 == 0 && this.field1237 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1235 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1237 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1243[var7] = this.field1243[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1243[var7] = (int)(Math.sin((double)this.field1238 / 14.0D) * 16.0D + Math.sin((double)this.field1238 / 15.0D) * 14.0D + Math.sin((double)this.field1238 / 16.0D) * 12.0D); // L: 122
			++this.field1238; // L: 123
		}

		this.field1248 = this.field1248 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1248 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1245[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1248 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1245[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1245[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1246[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1246[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1246[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1245[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2006466006"
	)
	final int method2416(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2117632308"
	)
	final void method2406(int var1) {
		int var2 = this.field1239.length; // L: 164
		if (this.field1235 * 16 > 0) { // L: 165
			this.method2407(this.field1235 * 16, this.field1241); // L: 166
		} else if (this.field1237 * 16 > 0) { // L: 168
			this.method2407(this.field1237 * 16, this.field1242); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1239[var3] = this.field1240[var3];
			}
		}

		this.method2409(var1); // L: 174
	} // L: 175

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1720728483"
	)
	final void method2407(int var1, int[] var2) {
		int var3 = this.field1239.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1239[var4] = this.method2416(this.field1240[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1239[var4] = var2[var4]; // L: 181
			} else {
				this.field1239[var4] = this.method2416(var2[var4], this.field1240[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2056253148"
	)
	final void method2409(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1243[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= WorldMapSectionType.rasterProvider.width) { // L: 197
				var7 = WorldMapSectionType.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * WorldMapSectionType.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1245[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1239[var10]; // L: 208
					int var14 = WorldMapSectionType.rasterProvider.pixels[var8]; // L: 209
					WorldMapSectionType.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltj;B)V",
		garbageValue = "0"
	)
	final void method2408(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1250.length; ++var2) { // L: 219
			this.field1250[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1250[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1247[var5] = (this.field1250[var5 + 1] + this.field1250[var5 + 128] + this.field1250[var5 - 128] + this.field1250[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1250; // L: 231
			this.field1250 = this.field1247; // L: 232
			this.field1247 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1250[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-784910213"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 17
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)[Lfp;",
		garbageValue = "25777"
	)
	static class137[] method2429() {
		return new class137[]{class137.field1601, class137.field1593, class137.field1594, class137.field1595, class137.field1592, class137.field1597, class137.field1598, class137.field1599, class137.field1600}; // L: 113
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-59"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12682
		short[] var2 = new short[16]; // L: 12683
		int var3 = 0; // L: 12684

		for (int var4 = 0; var4 < class435.ItemComposition_fileCount; ++var4) { // L: 12685
			ItemComposition var9 = class300.ItemComposition_get(var4); // L: 12686
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12687 12688 12689
				if (var3 >= 250) { // L: 12690
					class105.foundItemIdCount = -1; // L: 12691
					class18.foundItemIds = null; // L: 12692
					return; // L: 12693
				}

				if (var3 >= var2.length) { // L: 12695
					short[] var6 = new short[var2.length * 2]; // L: 12696

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12697
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12698
				}

				var2[var3++] = (short)var4; // L: 12700
			}
		}

		class18.foundItemIds = var2; // L: 12702
		class13.foundItemIndex = 0; // L: 12703
		class105.foundItemIdCount = var3; // L: 12704
		String[] var8 = new String[class105.foundItemIdCount]; // L: 12705

		for (int var5 = 0; var5 < class105.foundItemIdCount; ++var5) { // L: 12706
			var8[var5] = class300.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = class18.foundItemIds; // L: 12707
		Archive.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12709
	} // L: 12711
}
