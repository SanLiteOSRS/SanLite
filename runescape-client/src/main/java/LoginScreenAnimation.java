import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1927847537
	)
	static int field1070;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -2129317287
	)
	static int field1076;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "[Lls;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("x")
	int[] field1075;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1085104337
	)
	int field1062;
	@ObfuscatedName("g")
	int[] field1063;
	@ObfuscatedName("m")
	int[] field1064;
	@ObfuscatedName("n")
	int[] field1065;
	@ObfuscatedName("d")
	int[] field1069;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1554150183
	)
	int field1060;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1740894799
	)
	int field1068;
	@ObfuscatedName("q")
	int[] field1058;
	@ObfuscatedName("c")
	int[] field1066;
	@ObfuscatedName("f")
	int[] field1071;
	@ObfuscatedName("y")
	int[] field1072;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1648829389
	)
	int field1073;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2105557172
	)
	int field1074;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -554680455
	)
	int field1077;

	@ObfuscatedSignature(
		signature = "([Lls;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1075 = new int[256];
		this.field1062 = 0;
		this.field1060 = 0;
		this.field1068 = 0;
		this.field1073 = 0;
		this.field1074 = 0;
		this.field1077 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "87"
	)
	@Export("initColors")
	void initColors() {
		this.field1064 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1064[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1064[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1064[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1064[var1 + 192] = 16777215;
		}

		this.field1065 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1 + 192] = 16777215;
		}

		this.field1069 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1 + 192] = 16777215;
		}

		this.field1063 = new int[256];
		this.field1073 = 0;
		this.field1071 = new int[32768];
		this.field1072 = new int[32768];
		this.method1881((IndexedSprite)null);
		this.field1058 = new int[32768];
		this.field1066 = new int[32768];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "268957642"
	)
	void method1904() {
		this.field1064 = null;
		this.field1065 = null;
		this.field1069 = null;
		this.field1063 = null;
		this.field1071 = null;
		this.field1072 = null;
		this.field1058 = null;
		this.field1066 = null;
		this.field1073 = 0;
		this.field1074 = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "0"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1058 == null) {
			this.initColors();
		}

		if (this.field1077 == 0) {
			this.field1077 = var2;
		}

		int var3 = var2 - this.field1077;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1077 = var2;
		if (var3 > 0) {
			this.method1877(var3);
		}

		this.method1880(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1223871781"
	)
	final void method1877(int var1) {
		this.field1073 += 128 * var1;
		int var2;
		if (this.field1073 > this.field1071.length) {
			this.field1073 -= this.field1071.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method1881(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1058[var2 + var3] - this.field1071[var2 + this.field1073 & this.field1071.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1058[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1058[var8 + var9] = 255;
				} else {
					this.field1058[var8 + var9] = 0;
				}
			}
		}

		if (this.field1060 * 16 > 0) {
			this.field1060 = this.field1060 * 16 - var1 * 4;
		}

		if (this.field1068 * 16 > 0) {
			this.field1068 = this.field1068 * 16 - var1 * 4;
		}

		if (this.field1060 * 16 == 0 && this.field1068 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1060 = 1024;
			}

			if (var7 == 1) {
				this.field1068 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1075[var7] = this.field1075[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1075[var7] = (int)(Math.sin((double)this.field1062 / 14.0D) * 16.0D + Math.sin((double)this.field1062 / 15.0D) * 14.0D + Math.sin((double)this.field1062 / 16.0D) * 12.0D);
			++this.field1062;
		}

		this.field1074 = this.field1074 * 10000 + 100 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1074 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1058[var12 + (var13 << 7)] = 192;
			}

			this.field1074 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1058[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1058[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1066[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1066[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1066[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1058[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "-1180038945"
	)
	final int method1878(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "714944672"
	)
	final void method1880(int var1) {
		int var2 = this.field1063.length;
		if (this.field1060 * 16 > 0) {
			this.method1903(this.field1060 * 16, this.field1065);
		} else if (this.field1068 * 16 > 0) {
			this.method1903(this.field1068 * 16, this.field1069);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1063[var3] = this.field1064[var3];
			}
		}

		this.method1896(var1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I[II)V",
		garbageValue = "-563057357"
	)
	final void method1903(int var1, int[] var2) {
		int var3 = this.field1063.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1063[var4] = this.method1878(this.field1064[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1063[var4] = var2[var4];
			} else {
				this.field1063[var4] = this.method1878(var2[var4], this.field1064[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IS)V",
		garbageValue = "19083"
	)
	final void method1896(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1075[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= WorldMapSprite.rasterProvider.width) {
				var7 = WorldMapSprite.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * WorldMapSprite.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1058[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1063[var10];
					int var14 = WorldMapSprite.rasterProvider.pixels[var8];
					WorldMapSprite.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lls;I)V",
		garbageValue = "-1439965330"
	)
	final void method1881(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1071.length; ++var2) {
			this.field1071[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1071[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1072[var5] = (this.field1071[var5 + 1] + this.field1071[var5 - 128] + this.field1071[var5 + 128] + this.field1071[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1071;
			this.field1071 = this.field1072;
			this.field1072 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1071[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(CB)C",
		garbageValue = "29"
	)
	static char method1879(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1831741176"
	)
	static boolean method1905(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
	}
}
