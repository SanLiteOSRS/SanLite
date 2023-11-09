import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1035251675"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field3024.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 64; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method9152(); // L: 19
			super.fileId = var1.method9152(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "81"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field2981 = new byte[super.planes][64][64]; // L: 28
		super.field2992 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class271.field3021.value) { // L: 32
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return var2.regionX == super.regionX && var2.regionY == super.regionY; // L: 53
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2074287323"
	)
	static void method5080() {
		if (Login.clearLoginScreen) { // L: 275
			Login.titleboxSprite = null; // L: 276
			Login.field923 = null; // L: 277
			Login.field920 = null; // L: 278
			class407.leftTitleSprite = null; // L: 279
			ScriptFrame.rightTitleSprite = null; // L: 280
			Login.logoSprite = null; // L: 281
			class304.title_muteSprite = null; // L: 282
			WorldMapLabelSize.field2862 = null; // L: 283
			class11.field63 = null; // L: 284
			class131.worldSelectBackSprites = null; // L: 285
			class292.worldSelectFlagSprites = null; // L: 286
			class30.worldSelectArrows = null; // L: 287
			class218.worldSelectStars = null; // L: 288
			class465.field4784 = null; // L: 289
			class165.loginScreenRunesAnimation.method2459(); // L: 290
			RouteStrategy.method4227(0, 100); // L: 291
			class360 var0 = class153.field1700; // L: 294
			var0.method6845(true); // L: 296
			Login.clearLoginScreen = false; // L: 297
		}
	} // L: 298

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lpc;Lpc;I)V",
		garbageValue = "-548197541"
	)
	static void method5082(Font var0, Font var1) {
		int var4;
		int var5;
		if (class131.worldSelectBackSprites == null) { // L: 1871
			Archive var3 = class386.field4436; // L: 1873
			SpritePixels[] var2;
			if (!var3.isValidFileName("sl_back", "")) { // L: 1875
				var2 = null; // L: 1876
			} else {
				var4 = var3.getGroupId("sl_back"); // L: 1879
				var5 = var3.getFileId(var4, ""); // L: 1880
				var2 = class453.method8339(var3, var4, var5); // L: 1881
			}

			class131.worldSelectBackSprites = var2; // L: 1883
		}

		if (class292.worldSelectFlagSprites == null) { // L: 1885
			class292.worldSelectFlagSprites = DesktopPlatformInfoProvider.method8449(class386.field4436, "sl_flags", "");
		}

		if (class30.worldSelectArrows == null) { // L: 1886
			class30.worldSelectArrows = DesktopPlatformInfoProvider.method8449(class386.field4436, "sl_arrows", "");
		}

		if (class218.worldSelectStars == null) { // L: 1887
			class218.worldSelectStars = DesktopPlatformInfoProvider.method8449(class386.field4436, "sl_stars", "");
		}

		if (class47.worldSelectLeftSprite == null) { // L: 1888
			class47.worldSelectLeftSprite = class451.SpriteBuffer_getIndexedSpriteByName(class386.field4436, "leftarrow", "");
		}

		if (FontName.worldSelectRightSprite == null) { // L: 1889
			FontName.worldSelectRightSprite = class451.SpriteBuffer_getIndexedSpriteByName(class386.field4436, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1890
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1891
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1892
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1893
		if (class218.worldSelectStars != null) { // L: 1894
			class218.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1895
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1896
			class218.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1897
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1898
		}

		if (class30.worldSelectArrows != null) { // L: 1900
			int var22 = Login.xPadding + 280; // L: 1901
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1902
				class30.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var22, 4); // L: 1903
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1904
				class30.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1905
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1906
			int var23 = Login.xPadding + 390; // L: 1907
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1908
				class30.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var23, 4); // L: 1909
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1910
				class30.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1911
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1912
			var4 = Login.xPadding + 500; // L: 1913
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1914
				class30.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var4, 4); // L: 1915
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1916
				class30.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1917
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1918
			var5 = Login.xPadding + 610; // L: 1919
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1920
				class30.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var5, 4); // L: 1921
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1922
				class30.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1923
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1924
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1926
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1927
		Login.hoveredWorldIndex = -1; // L: 1928
		if (class131.worldSelectBackSprites != null) { // L: 1929
			byte var26 = 88; // L: 1930
			byte var27 = 19; // L: 1931
			var4 = 765 / (var26 + 1) - 1; // L: 1932
			var5 = 480 / (var27 + 1); // L: 1933

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1935
				var7 = var4; // L: 1936
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1937
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1938
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1939
					--var5;
				}
			} while(var5 != var6 || var4 != var7); // L: 1940

			var6 = (765 - var26 * var4) / (var4 + 1); // L: 1942
			if (var6 > 5) { // L: 1943
				var6 = 5;
			}

			var7 = (480 - var27 * var5) / (var5 + 1); // L: 1944
			if (var7 > 5) { // L: 1945
				var7 = 5;
			}

			int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2; // L: 1946
			int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2; // L: 1947
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1948
			Login.worldSelectPagesCount = var10 - var4; // L: 1949
			if (class47.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1950
				class47.worldSelectLeftSprite.drawAt(8, WorldMapArchiveLoader.canvasHeight / 2 - class47.worldSelectLeftSprite.subHeight / 2); // L: 1951
			}

			if (FontName.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1953
				FontName.worldSelectRightSprite.drawAt(GrandExchangeOfferTotalQuantityComparator.canvasWidth - FontName.worldSelectRightSprite.subWidth - 8, WorldMapArchiveLoader.canvasHeight / 2 - FontName.worldSelectRightSprite.subHeight / 2); // L: 1954
			}

			int var11 = var9 + 23; // L: 1956
			int var12 = var8 + Login.xPadding; // L: 1957
			int var13 = 0; // L: 1958
			boolean var14 = false; // L: 1959
			int var15 = Login.worldSelectPage; // L: 1960

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1961 1962
				World var17 = class387.World_worlds[var16]; // L: 1965
				boolean var18 = true; // L: 1966
				String var19 = Integer.toString(var17.population); // L: 1967
				if (var17.population == -1) { // L: 1968
					var19 = "OFF"; // L: 1969
					var18 = false; // L: 1970
				} else if (var17.population > 1980) { // L: 1972
					var19 = "FULL"; // L: 1973
					var18 = false; // L: 1974
				}

				class108 var20 = null; // L: 1976
				int var21 = 0; // L: 1977
				if (var17.isBeta()) { // L: 1978
					var20 = var17.isMembersOnly() ? class108.field1384 : class108.field1389; // L: 1979
				} else if (var17.isDeadman()) { // L: 1981
					var20 = var17.isMembersOnly() ? class108.field1386 : class108.field1391; // L: 1982
				} else if (var17.method1846()) { // L: 1984
					var21 = 16711680; // L: 1985
					var20 = var17.isMembersOnly() ? class108.field1382 : class108.field1392; // L: 1986
				} else if (var17.method1815()) { // L: 1988
					var20 = var17.isMembersOnly() ? class108.field1381 : class108.field1385; // L: 1989
				} else if (var17.isPvp()) { // L: 1991
					var20 = var17.isMembersOnly() ? class108.field1380 : class108.field1379; // L: 1992
				} else if (var17.method1816()) { // L: 1994
					var20 = var17.isMembersOnly() ? class108.field1393 : class108.field1387; // L: 1995
				} else if (var17.method1817()) { // L: 1997
					var20 = var17.isMembersOnly() ? class108.field1390 : class108.field1377; // L: 1998
				}

				if (var20 == null || var20.field1388 >= class131.worldSelectBackSprites.length) { // L: 2000
					var20 = var17.isMembersOnly() ? class108.field1378 : class108.field1383; // L: 2001
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var11 + var27 && var18) { // L: 2003
					Login.hoveredWorldIndex = var16; // L: 2004
					class131.worldSelectBackSprites[var20.field1388].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 2005
					var14 = true; // L: 2006
				} else {
					class131.worldSelectBackSprites[var20.field1388].drawAt(var12, var11); // L: 2008
				}

				if (class292.worldSelectFlagSprites != null) { // L: 2009
					class292.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1); // L: 2010
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1); // L: 2011
				var11 = var11 + var27 + var7; // L: 2012
				++var13; // L: 2013
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 2014
					var12 = var12 + var26 + var6; // L: 2015
					var13 = 0; // L: 2016
					++var15; // L: 2017
				}
			}

			if (var14) { // L: 2020
				var16 = var1.stringWidth(class387.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 2021
				int var24 = var1.ascent + 8; // L: 2022
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 2023
				if (var25 + var24 > 480) { // L: 2024
					var25 = MouseHandler.MouseHandler_y - 25 - var24; // L: 2025
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120); // L: 2027
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0); // L: 2028
				var1.drawCentered(class387.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 2029
			}
		}

		class156.rasterProvider.drawFull(0, 0); // L: 2032
	} // L: 2033

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "18"
	)
	static final void method5083(String var0, int var1) {
		PacketBufferNode var2 = class503.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 234
		var2.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 235
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 236
		var2.packetBuffer.method9118(var1); // L: 237
		Client.packetWriter.addNode(var2); // L: 238
	} // L: 239
}
