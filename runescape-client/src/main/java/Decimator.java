import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2021266139
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2101247493
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ab")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(var9 - 7.0D + 1.0D); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(7.0D + var9); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9)); // L: 49
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "33076536"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var4 + var9] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "45"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2001424421"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1509749765"
	)
	public static int method1136(int var0) {
		return 255 - (var0 & 255); // L: 113
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lon;Lon;B)V",
		garbageValue = "-96"
	)
	static void method1127(Font var0, Font var1) {
		int var4;
		int var5;
		if (class476.worldSelectBackSprites == null) { // L: 1917
			Archive var3 = class452.archive8; // L: 1919
			SpritePixels[] var2;
			if (!var3.isValidFileName("sl_back", "")) { // L: 1921
				var2 = null; // L: 1922
			} else {
				var4 = var3.getGroupId("sl_back"); // L: 1925
				var5 = var3.getFileId(var4, ""); // L: 1926
				var2 = UserComparator3.method2923(var3, var4, var5); // L: 1927
			}

			class476.worldSelectBackSprites = var2; // L: 1929
		}

		if (class16.worldSelectFlagSprites == null) { // L: 1931
			class16.worldSelectFlagSprites = class314.method6353(class452.archive8, "sl_flags", "");
		}

		if (DevicePcmPlayerProvider.worldSelectArrows == null) { // L: 1932
			DevicePcmPlayerProvider.worldSelectArrows = class314.method6353(class452.archive8, "sl_arrows", "");
		}

		if (World.worldSelectStars == null) { // L: 1933
			World.worldSelectStars = class314.method6353(class452.archive8, "sl_stars", "");
		}

		if (PlayerType.worldSelectLeftSprite == null) { // L: 1934
			PlayerType.worldSelectLeftSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "leftarrow", "");
		}

		if (class13.worldSelectRightSprite == null) { // L: 1935
			class13.worldSelectRightSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1936
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1937
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1938
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1939
		if (World.worldSelectStars != null) { // L: 1940
			World.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1941
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1942
			World.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1943
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1944
		}

		if (DevicePcmPlayerProvider.worldSelectArrows != null) { // L: 1946
			int var22 = Login.xPadding + 280; // L: 1947
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1948
				DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var22, 4); // L: 1949
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1950
				DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1951
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1952
			int var23 = Login.xPadding + 390; // L: 1953
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1954
				DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var23, 4); // L: 1955
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1956
				DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1957
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1958
			var4 = Login.xPadding + 500; // L: 1959
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1960
				DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var4, 4); // L: 1961
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1962
				DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1963
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1964
			var5 = Login.xPadding + 610; // L: 1965
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1966
				DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var5, 4); // L: 1967
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1968
				DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1969
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1970
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1972
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1973
		Login.hoveredWorldIndex = -1; // L: 1974
		if (class476.worldSelectBackSprites != null) { // L: 1975
			byte var26 = 88; // L: 1976
			byte var27 = 19; // L: 1977
			var4 = 765 / (var26 + 1) - 1; // L: 1978
			var5 = 480 / (var27 + 1); // L: 1979

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1981
				var7 = var4; // L: 1982
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1983
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1984
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1985
					--var5;
				}
			} while(var5 != var6 || var7 != var4); // L: 1986

			var6 = (765 - var26 * var4) / (var4 + 1); // L: 1988
			if (var6 > 5) { // L: 1989
				var6 = 5;
			}

			var7 = (480 - var5 * var27) / (var5 + 1); // L: 1990
			if (var7 > 5) { // L: 1991
				var7 = 5;
			}

			int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2; // L: 1992
			int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2; // L: 1993
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1994
			Login.worldSelectPagesCount = var10 - var4; // L: 1995
			if (PlayerType.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1996
				PlayerType.worldSelectLeftSprite.drawAt(8, class262.canvasHeight / 2 - PlayerType.worldSelectLeftSprite.subHeight / 2); // L: 1997
			}

			if (class13.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1999
				class13.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class13.worldSelectRightSprite.subWidth - 8, class262.canvasHeight / 2 - class13.worldSelectRightSprite.subHeight / 2); // L: 2000
			}

			int var11 = var9 + 23; // L: 2002
			int var12 = var8 + Login.xPadding; // L: 2003
			int var13 = 0; // L: 2004
			boolean var14 = false; // L: 2005
			int var15 = Login.worldSelectPage; // L: 2006

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 2007 2008
				World var17 = class31.World_worlds[var16]; // L: 2011
				boolean var18 = true; // L: 2012
				String var19 = Integer.toString(var17.population); // L: 2013
				if (var17.population == -1) { // L: 2014
					var19 = "OFF"; // L: 2015
					var18 = false; // L: 2016
				} else if (var17.population > 1980) { // L: 2018
					var19 = "FULL"; // L: 2019
					var18 = false; // L: 2020
				}

				class103 var20 = null; // L: 2022
				int var21 = 0; // L: 2023
				if (var17.isBeta()) { // L: 2024
					var20 = var17.isMembersOnly() ? class103.field1352 : class103.field1354; // L: 2025
				} else if (var17.isDeadman()) { // L: 2027
					var20 = var17.isMembersOnly() ? class103.field1363 : class103.field1362; // L: 2028
				} else if (var17.method1806()) { // L: 2030
					var21 = 16711680; // L: 2031
					var20 = var17.isMembersOnly() ? class103.field1353 : class103.field1350; // L: 2032
				} else if (var17.method1780()) { // L: 2034
					var20 = var17.isMembersOnly() ? class103.field1364 : class103.field1355; // L: 2035
				} else if (var17.isPvp()) { // L: 2037
					var20 = var17.isMembersOnly() ? class103.field1351 : class103.field1359; // L: 2038
				} else if (var17.method1781()) { // L: 2040
					var20 = var17.isMembersOnly() ? class103.field1356 : class103.field1358; // L: 2041
				} else if (var17.method1782()) { // L: 2043
					var20 = var17.isMembersOnly() ? class103.field1361 : class103.field1360; // L: 2044
				}

				if (var20 == null || var20.field1348 >= class476.worldSelectBackSprites.length) { // L: 2046
					var20 = var17.isMembersOnly() ? class103.field1349 : class103.field1357; // L: 2047
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) { // L: 2049
					Login.hoveredWorldIndex = var16; // L: 2050
					class476.worldSelectBackSprites[var20.field1348].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 2051
					var14 = true; // L: 2052
				} else {
					class476.worldSelectBackSprites[var20.field1348].drawAt(var12, var11); // L: 2054
				}

				if (class16.worldSelectFlagSprites != null) { // L: 2055
					class16.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1); // L: 2056
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1); // L: 2057
				var11 = var11 + var7 + var27; // L: 2058
				++var13; // L: 2059
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 2060
					var12 = var12 + var26 + var6; // L: 2061
					var13 = 0; // L: 2062
					++var15; // L: 2063
				}
			}

			if (var14) { // L: 2066
				var16 = var1.stringWidth(class31.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 2067
				int var24 = var1.ascent + 8; // L: 2068
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 2069
				if (var24 + var25 > 480) { // L: 2070
					var25 = MouseHandler.MouseHandler_y - 25 - var24; // L: 2071
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120); // L: 2073
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0); // L: 2074
				var1.drawCentered(class31.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 2075
			}
		}

		RouteStrategy.rasterProvider.drawFull(0, 0); // L: 2078
	} // L: 2079

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-51"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field713 = 0L; // L: 4258
		if (var0 >= 2) { // L: 4259
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4260
		}

		if (GrandExchangeOfferNameComparator.getWindowedMode() == 1) { // L: 4261
			ScriptFrame.client.setMaxCanvasSize(765, 503); // L: 4262
		} else {
			ScriptFrame.client.setMaxCanvasSize(7680, 2160); // L: 4265
		}

		if (Client.gameState >= 25) { // L: 4267
			class1.method11();
		}

	} // L: 4268

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "101"
	)
	static final void method1135(int var0, int var1, boolean var2) {
		if (!var2 || var0 != KeyHandler.field164 || class425.field4671 != var1) { // L: 5587
			KeyHandler.field164 = var0; // L: 5590
			class425.field4671 = var1; // L: 5591
			class138.method3208(25); // L: 5592
			WorldMapDecoration.drawLoadingMessage("Loading - please wait.", true); // L: 5593
			int var3 = WorldMapData_0.baseX * 64; // L: 5594
			int var4 = GameObject.baseY * 64; // L: 5595
			WorldMapData_0.baseX = (var0 - 6) * 8; // L: 5596
			GameObject.baseY = (var1 - 6) * 8; // L: 5597
			int var5 = WorldMapData_0.baseX * 64 - var3; // L: 5598
			int var6 = GameObject.baseY * 64 - var4; // L: 5599
			var3 = WorldMapData_0.baseX * 64; // L: 5600
			var4 = GameObject.baseY * 64; // L: 5601

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5602
				NPC var19 = Client.npcs[var7]; // L: 5603
				if (var19 != null) { // L: 5604
					for (var9 = 0; var9 < 10; ++var9) { // L: 5605
						var10000 = var19.pathX; // L: 5606
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5607
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5609
					var19.y -= var6 * 128; // L: 5610
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5613
				Player var22 = Client.players[var7]; // L: 5614
				if (var22 != null) { // L: 5615
					for (var9 = 0; var9 < 10; ++var9) { // L: 5616
						var10000 = var22.pathX; // L: 5617
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5618
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5620
					var22.y -= var6 * 128; // L: 5621
				}
			}

			byte var20 = 0; // L: 5624
			byte var8 = 104; // L: 5625
			byte var21 = 1; // L: 5626
			if (var5 < 0) { // L: 5627
				var20 = 103; // L: 5628
				var8 = -1; // L: 5629
				var21 = -1; // L: 5630
			}

			byte var10 = 0; // L: 5632
			byte var11 = 104; // L: 5633
			byte var12 = 1; // L: 5634
			if (var6 < 0) { // L: 5635
				var10 = 103; // L: 5636
				var11 = -1; // L: 5637
				var12 = -1; // L: 5638
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5640
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5641
					int var15 = var5 + var13; // L: 5642
					int var16 = var14 + var6; // L: 5643

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5644
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5645
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5646
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5650 5651 5655
				var18.x -= var5; // L: 5652
				var18.y -= var6; // L: 5653
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5654
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5657
				Client.destinationX -= var5; // L: 5658
				Client.destinationY -= var6; // L: 5659
			}

			Client.soundEffectCount = 0; // L: 5661
			Client.isCameraLocked = false; // L: 5662
			class36.cameraX -= var5 << 7; // L: 5663
			class297.cameraZ -= var6 << 7; // L: 5664
			class33.oculusOrbFocalPointX -= var5 << 7; // L: 5665
			class144.oculusOrbFocalPointY -= var6 << 7; // L: 5666
			Client.field729 = -1; // L: 5667
			Client.graphicsObjects.clear(); // L: 5668
			Client.projectiles.clear(); // L: 5669

			for (var14 = 0; var14 < 4; ++var14) { // L: 5670
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5588 5671

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ldv;IILiu;I)V",
		garbageValue = "-1796483670"
	)
	static final void method1124(Player var0, int var1, int var2, class210 var3) {
		int var4 = var0.pathX[0]; // L: 8577
		int var5 = var0.pathY[0]; // L: 8578
		int var6 = var0.transformedSize(); // L: 8579
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8580
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8581
				int var9 = var0.transformedSize(); // L: 8584
				Client.field786.approxDestinationX = var1; // L: 8587
				Client.field786.approxDestinationY = var2; // L: 8588
				Client.field786.approxDestinationSizeX = 1; // L: 8589
				Client.field786.approxDestinationSizeY = 1; // L: 8590
				ApproximateRouteStrategy var10 = Client.field786; // L: 8591
				int var11 = class144.method3246(var4, var5, var9, var10, Client.collisionMaps[var0.plane], true, Client.field787, Client.field788); // L: 8593
				if (var11 >= 1) { // L: 8594
					for (int var12 = 0; var12 < var11 - 1; ++var12) { // L: 8595
						var0.method2302(Client.field787[var12], Client.field788[var12], var3);
					}

				}
			}
		}
	} // L: 8596
}
