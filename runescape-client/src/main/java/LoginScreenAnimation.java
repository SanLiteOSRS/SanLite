import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("k")
	int[] field1281;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1755494733
	)
	int field1294;
	@ObfuscatedName("h")
	int[] field1283;
	@ObfuscatedName("n")
	int[] field1282;
	@ObfuscatedName("l")
	int[] field1278;
	@ObfuscatedName("m")
	int[] field1286;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1742549311
	)
	int field1287;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -422706029
	)
	int field1288;
	@ObfuscatedName("j")
	int[] field1293;
	@ObfuscatedName("r")
	int[] field1290;
	@ObfuscatedName("q")
	int[] field1291;
	@ObfuscatedName("t")
	int[] field1292;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1149455035
	)
	int field1285;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1072672112
	)
	int field1295;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1587500061
	)
	int field1279;

	@ObfuscatedSignature(
		signature = "([Low;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1281 = new int[256];
		this.field1294 = 0;
		this.field1287 = 0;
		this.field1288 = 0;
		this.field1285 = 0;
		this.field1295 = 0;
		this.field1279 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1543224256"
	)
	@Export("initColors")
	void initColors() {
		this.field1282 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1 + 192] = 16777215;
		}

		this.field1278 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 192] = 16777215;
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

		this.field1283 = new int[256];
		this.field1285 = 0;
		this.field1291 = new int[32768];
		this.field1292 = new int[32768];
		this.method2211((IndexedSprite)null);
		this.field1293 = new int[32768];
		this.field1290 = new int[32768];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1034389776"
	)
	void method2192() {
		this.field1282 = null;
		this.field1278 = null;
		this.field1286 = null;
		this.field1283 = null;
		this.field1291 = null;
		this.field1292 = null;
		this.field1293 = null;
		this.field1290 = null;
		this.field1285 = 0;
		this.field1295 = 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-71179079"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1293 == null) {
			this.initColors();
		}

		if (this.field1279 == 0) {
			this.field1279 = var2;
		}

		int var3 = var2 - this.field1279;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1279 = var2;
		if (var3 > 0) {
			this.method2187(var3);
		}

		this.method2210(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-30"
	)
	final void method2187(int var1) {
		this.field1285 += 128 * var1;
		int var2;
		if (this.field1285 > this.field1291.length) {
			this.field1285 -= this.field1291.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2211(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1293[var3 + var2] - this.field1291[var2 + this.field1285 & this.field1291.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1293[var2++] = var6;
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
					this.field1293[var8 + var9] = 255;
				} else {
					this.field1293[var9 + var8] = 0;
				}
			}
		}

		if (this.field1287 * 16 > 0) {
			this.field1287 = this.field1287 * 16 - var1 * 4;
		}

		if (this.field1288 * 16 > 0) {
			this.field1288 = this.field1288 * 16 - var1 * 4;
		}

		if (this.field1287 * 16 == 0 && this.field1288 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1287 = 1024;
			}

			if (var7 == 1) {
				this.field1288 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1281[var7] = this.field1281[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1281[var7] = (int)(Math.sin((double)this.field1294 / 14.0D) * 16.0D + Math.sin((double)this.field1294 / 15.0D) * 14.0D + Math.sin((double)this.field1294 / 16.0D) * 12.0D);
			++this.field1294;
		}

		this.field1295 = this.field1295 * 10000 + 10000 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1295 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1293[var12 + (var13 << 7)] = 192;
			}

			this.field1295 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1293[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1293[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1290[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1290[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1290[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1293[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "-1592134518"
	)
	final int method2188(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "110"
	)
	final void method2210(int var1) {
		int var2 = this.field1283.length;
		if (this.field1287 * 16 > 0) {
			this.method2190(this.field1287 * 16, this.field1278);
		} else if (this.field1288 * 16 > 0) {
			this.method2190(this.field1288 * 16, this.field1286);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1283[var3] = this.field1282[var3];
			}
		}

		this.method2191(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I[IB)V",
		garbageValue = "-100"
	)
	final void method2190(int var1, int[] var2) {
		int var3 = this.field1283.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1283[var4] = this.method2188(this.field1282[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1283[var4] = var2[var4];
			} else {
				this.field1283[var4] = this.method2188(var2[var4], this.field1282[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "1"
	)
	final void method2191(int var1) {
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

			if (var5 + 128 >= GameEngine.rasterProvider.width) {
				var7 = GameEngine.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * GameEngine.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1293[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1283[var10];
					int var14 = GameEngine.rasterProvider.pixels[var8];
					GameEngine.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Low;I)V",
		garbageValue = "742969714"
	)
	final void method2211(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1291.length; ++var2) {
			this.field1291[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1291[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1292[var5] = (this.field1291[var5 + 128] + this.field1291[var5 - 128] + this.field1291[var5 + 1] + this.field1291[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1291;
			this.field1291 = this.field1292;
			this.field1292 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1291[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "932731"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		signature = "(IIZB)V",
		garbageValue = "-57"
	)
	static final void method2185(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class105.field1327 || Language.field3357 != var1) {
			class105.field1327 = var0;
			Language.field3357 = var1;
			class20.updateGameState(25);
			class2.drawLoadingMessage("Loading - please wait.", true);
			int var3 = ItemLayer.baseX * 64;
			int var4 = Tile.baseY * 64;
			ItemLayer.baseX = (var0 - 6) * 8;
			Tile.baseY = (var1 - 6) * 8;
			int var5 = ItemLayer.baseX * 64 - var3;
			int var6 = Tile.baseY * 64 - var4;
			var3 = ItemLayer.baseX * 64;
			var4 = Tile.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var8 = Client.npcs[var7];
				if (var8 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var8.pathX;
						var10000[var9] -= var5;
						var10000 = var8.pathY;
						var10000[var9] -= var6;
					}

					var8.x -= var5 * 128;
					var8.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var21 = Client.players[var7];
				if (var21 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var21.pathX;
						var10000[var9] -= var5;
						var10000 = var21.pathY;
						var10000[var9] -= var6;
					}

					var21.x -= var5 * 128;
					var21.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var18 = 104;
			byte var22 = 1;
			if (var5 < 0) {
				var20 = 103;
				var18 = -1;
				var22 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var13 != var18; var13 += var22) {
				for (var14 = var10; var14 != var11; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var14 + var6;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var19.x -= var5;
				var19.y -= var6;
				if (var19.x < 0 || var19.y < 0 || var19.x >= 104 || var19.y >= 104) {
					var19.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			ModeWhere.cameraX -= var5 << 7;
			ReflectionCheck.cameraZ -= var6 << 7;
			class6.oculusOrbFocalPointX -= var5 << 7;
			Players.oculusOrbFocalPointY -= var6 << 7;
			Client.field833 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-1808852837"
	)
	static final void method2198(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field812[var4] = true;
			}
		}

	}
}
