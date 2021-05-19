import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("t")
	int[] field1281;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 741566833
	)
	int field1291;
	@ObfuscatedName("b")
	int[] field1288;
	@ObfuscatedName("q")
	int[] field1284;
	@ObfuscatedName("i")
	int[] field1285;
	@ObfuscatedName("x")
	int[] field1286;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1396163051
	)
	int field1287;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 906725841
	)
	int field1292;
	@ObfuscatedName("p")
	int[] field1276;
	@ObfuscatedName("a")
	int[] field1289;
	@ObfuscatedName("e")
	int[] field1282;
	@ObfuscatedName("d")
	int[] field1290;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1651028079
	)
	int field1283;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1684769680
	)
	int field1294;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1434372763
	)
	int field1295;

	@ObfuscatedSignature(
		descriptor = "([Lof;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1281 = new int[256];
		this.field1291 = 0;
		this.field1287 = 0;
		this.field1292 = 0;
		this.field1283 = 0;
		this.field1294 = 0;
		this.field1295 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2114989388"
	)
	@Export("initColors")
	void initColors() {
		this.field1284 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1284[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1284[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1284[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1284[var1 + 192] = 16777215;
		}

		this.field1285 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1285[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1285[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1285[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1285[var1 + 192] = 16777215;
		}

		this.field1286 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1 + 192] = 16777215;
		}

		this.field1288 = new int[256];
		this.field1283 = 0;
		this.field1282 = new int[32768];
		this.field1290 = new int[32768];
		this.method2218((IndexedSprite)null);
		this.field1276 = new int[32768];
		this.field1289 = new int[32768];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711680"
	)
	void method2207() {
		this.field1284 = null;
		this.field1285 = null;
		this.field1286 = null;
		this.field1288 = null;
		this.field1282 = null;
		this.field1290 = null;
		this.field1276 = null;
		this.field1289 = null;
		this.field1283 = 0;
		this.field1294 = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "91"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1276 == null) {
			this.initColors();
		}

		if (this.field1295 == 0) {
			this.field1295 = var2;
		}

		int var3 = var2 - this.field1295;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1295 = var2;
		if (var3 > 0) {
			this.method2209(var3);
		}

		this.method2211(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1781173943"
	)
	final void method2209(int var1) {
		this.field1283 += 128 * var1;
		int var2;
		if (this.field1283 > this.field1282.length) {
			this.field1283 -= this.field1282.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2218(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1276[var2 + var3] - this.field1282[var2 + this.field1283 & this.field1282.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1276[var2++] = var6;
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
					this.field1276[var8 + var9] = 255;
				} else {
					this.field1276[var8 + var9] = 0;
				}
			}
		}

		if (this.field1287 * 16 > 0) {
			this.field1287 = this.field1287 * 16 - var1 * 4;
		}

		if (this.field1292 * 16 > 0) {
			this.field1292 = this.field1292 * 16 - var1 * 4;
		}

		if (this.field1287 * 16 == 0 && this.field1292 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1287 = 1024;
			}

			if (var7 == 1) {
				this.field1292 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1281[var7] = this.field1281[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1281[var7] = (int)(Math.sin((double)this.field1291 / 14.0D) * 16.0D + Math.sin((double)this.field1291 / 15.0D) * 14.0D + Math.sin((double)this.field1291 / 16.0D) * 12.0D);
			++this.field1291;
		}

		this.field1294 = this.field1294 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1294 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1276[var12 + (var13 << 7)] = 192;
			}

			this.field1294 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1276[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1276[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1289[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1289[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1289[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1276[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1814586002"
	)
	final int method2210(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-809072308"
	)
	final void method2211(int var1) {
		int var2 = this.field1288.length;
		if (this.field1287 * 16 > 0) {
			this.method2212(this.field1287 * 16, this.field1285);
		} else if (this.field1292 * 16 > 0) {
			this.method2212(this.field1292 * 16, this.field1286);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1288[var3] = this.field1284[var3];
			}
		}

		this.method2213(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1544752849"
	)
	final void method2212(int var1, int[] var2) {
		int var3 = this.field1288.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1288[var4] = this.method2210(this.field1284[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1288[var4] = var2[var4];
			} else {
				this.field1288[var4] = this.method2210(var2[var4], this.field1284[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1976947254"
	)
	final void method2213(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1281[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= WorldMapDecorationType.rasterProvider.width) {
				var7 = WorldMapDecorationType.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * WorldMapDecorationType.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1276[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1288[var10];
					int var14 = WorldMapDecorationType.rasterProvider.pixels[var8];
					WorldMapDecorationType.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "871990485"
	)
	final void method2218(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1282.length; ++var2) {
			this.field1282[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1282[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1290[var5] = (this.field1282[var5 - 128] + this.field1282[var5 + 1] + this.field1282[var5 + 128] + this.field1282[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1282;
			this.field1282 = this.field1290;
			this.field1290 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1282[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-2141894611"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = Messages.World_worlds[var6];
			Messages.World_worlds[var6] = Messages.World_worlds[var1];
			Messages.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (Widget.method4688(Messages.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = Messages.World_worlds[var9];
					Messages.World_worlds[var9] = Messages.World_worlds[var7];
					Messages.World_worlds[var7++] = var10;
				}
			}

			Messages.World_worlds[var1] = Messages.World_worlds[var7];
			Messages.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
