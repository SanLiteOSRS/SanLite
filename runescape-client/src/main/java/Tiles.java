import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ds")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ws")
	static Iterator field1015;
	@ObfuscatedName("ai")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("aj")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 372263447
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("aw")
	static short[][][] field1018;
	@ObfuscatedName("ay")
	static short[][][] field1033;
	@ObfuscatedName("av")
	static byte[][][] field1019;
	@ObfuscatedName("au")
	static int[][] field1021;
	@ObfuscatedName("at")
	static final int[] field1023;
	@ObfuscatedName("af")
	static final int[] field1024;
	@ObfuscatedName("ae")
	static final int[] field1025;
	@ObfuscatedName("al")
	static final int[] field1030;
	@ObfuscatedName("aq")
	static final int[] field1027;
	@ObfuscatedName("ah")
	static final int[] field1031;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1467689653
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1035436953
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1023 = new int[]{1, 2, 4, 8};
		field1024 = new int[]{16, 32, 64, 128}; // L: 32
		field1025 = new int[]{1, 0, -1, 0}; // L: 33
		field1030 = new int[]{0, -1, 0, 1}; // L: 34
		field1027 = new int[]{1, -1, -1, 1}; // L: 35
		field1031 = new int[]{-1, -1, 1, 1}; // L: 36
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 37
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 38
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "2135566009"
	)
	public static String method2268(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILiw;[Lig;)V"
	)
	static final void method2209(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 269
		int var11 = -1; // L: 270

		while (true) {
			int var12 = var10.method9075(); // L: 272
			if (var12 == 0) { // L: 273
				return; // L: 300
			}

			var11 += var12; // L: 274
			int var13 = 0; // L: 275

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 277
				if (var14 == 0) { // L: 278
					break;
				}

				var13 += var14 - 1; // L: 279
				int var15 = var13 & 63; // L: 280
				int var16 = var13 >> 6 & 63; // L: 281
				int var17 = var13 >> 12; // L: 282
				int var18 = var10.readUnsignedByte(); // L: 283
				int var19 = var18 >> 2; // L: 284
				int var20 = var18 & 3; // L: 285
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 286
					ObjectComposition var21 = Language.getObjectDefinition(var11); // L: 287
					int var22 = var2 + class18.method304(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 288
					int var23 = var3 + ScriptFrame.method1197(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 289
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) { // L: 290
						int var24 = var1; // L: 291
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) { // L: 292
							var24 = var1 - 1;
						}

						CollisionMap var25 = null; // L: 293
						if (var24 >= 0) { // L: 294
							var25 = var9[var24];
						}

						class383.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25); // L: 295
					}
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpj;Lpj;B)V",
		garbageValue = "-25"
	)
	static void method2233(Font var0, Font var1) {
		if (SpotAnimationDefinition.worldSelectBackSprites == null) { // L: 1917
			SpotAnimationDefinition.worldSelectBackSprites = class505.method8943(Nameable.field4637, "sl_back", "");
		}

		IndexedSprite[] var2;
		Archive var3;
		int var4;
		int var5;
		IndexedSprite[] var6;
		boolean var7;
		byte[] var8;
		if (class170.worldSelectFlagSprites == null) { // L: 1918
			var3 = Nameable.field4637; // L: 1920
			if (!var3.isValidFileName("sl_flags", "")) { // L: 1922
				var2 = null; // L: 1923
			} else {
				var4 = var3.getGroupId("sl_flags"); // L: 1926
				var5 = var3.getFileId(var4, ""); // L: 1927
				var8 = var3.takeFile(var4, var5); // L: 1932
				if (var8 == null) { // L: 1933
					var7 = false; // L: 1934
				} else {
					GrandExchangeEvent.SpriteBuffer_decode(var8); // L: 1937
					var7 = true; // L: 1938
				}

				if (!var7) { // L: 1940
					var6 = null; // L: 1941
				} else {
					var6 = class231.method4797(); // L: 1944
				}

				var2 = var6; // L: 1946
			}

			class170.worldSelectFlagSprites = var2; // L: 1948
		}

		if (AttackOption.worldSelectArrows == null) { // L: 1950
			var3 = Nameable.field4637; // L: 1952
			if (!var3.isValidFileName("sl_arrows", "")) { // L: 1954
				var2 = null; // L: 1955
			} else {
				var4 = var3.getGroupId("sl_arrows"); // L: 1958
				var5 = var3.getFileId(var4, ""); // L: 1959
				var8 = var3.takeFile(var4, var5); // L: 1964
				if (var8 == null) { // L: 1965
					var7 = false; // L: 1966
				} else {
					GrandExchangeEvent.SpriteBuffer_decode(var8); // L: 1969
					var7 = true; // L: 1970
				}

				if (!var7) { // L: 1972
					var6 = null; // L: 1973
				} else {
					var6 = class231.method4797(); // L: 1976
				}

				var2 = var6; // L: 1978
			}

			AttackOption.worldSelectArrows = var2; // L: 1980
		}

		if (class295.worldSelectStars == null) { // L: 1982
			var3 = Nameable.field4637; // L: 1984
			if (!var3.isValidFileName("sl_stars", "")) { // L: 1986
				var2 = null; // L: 1987
			} else {
				var4 = var3.getGroupId("sl_stars"); // L: 1990
				var5 = var3.getFileId(var4, ""); // L: 1991
				var8 = var3.takeFile(var4, var5); // L: 1996
				if (var8 == null) { // L: 1997
					var7 = false; // L: 1998
				} else {
					GrandExchangeEvent.SpriteBuffer_decode(var8); // L: 2001
					var7 = true; // L: 2002
				}

				if (!var7) { // L: 2004
					var6 = null; // L: 2005
				} else {
					var6 = class231.method4797(); // L: 2008
				}

				var2 = var6; // L: 2010
			}

			class295.worldSelectStars = var2; // L: 2012
		}

		if (class25.worldSelectLeftSprite == null) { // L: 2014
			class25.worldSelectLeftSprite = UserComparator4.SpriteBuffer_getIndexedSpriteByName(Nameable.field4637, "leftarrow", "");
		}

		if (class14.worldSelectRightSprite == null) { // L: 2015
			class14.worldSelectRightSprite = UserComparator4.SpriteBuffer_getIndexedSpriteByName(Nameable.field4637, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 2016
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 2017
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 2018
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 2019
		if (class295.worldSelectStars != null) { // L: 2020
			class295.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 2021
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 2022
			class295.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 2023
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 2024
		}

		if (AttackOption.worldSelectArrows != null) { // L: 2026
			int var22 = Login.xPadding + 280; // L: 2027
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 2028
				AttackOption.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				AttackOption.worldSelectArrows[0].drawAt(var22, 4); // L: 2029
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 2030
				AttackOption.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				AttackOption.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 2031
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 2032
			int var23 = Login.xPadding + 390; // L: 2033
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 2034
				AttackOption.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				AttackOption.worldSelectArrows[0].drawAt(var23, 4); // L: 2035
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 2036
				AttackOption.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				AttackOption.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 2037
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 2038
			var4 = Login.xPadding + 500; // L: 2039
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 2040
				AttackOption.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				AttackOption.worldSelectArrows[0].drawAt(var4, 4); // L: 2041
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 2042
				AttackOption.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				AttackOption.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 2043
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 2044
			var5 = Login.xPadding + 610; // L: 2045
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 2046
				AttackOption.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				AttackOption.worldSelectArrows[0].drawAt(var5, 4); // L: 2047
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 2048
				AttackOption.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				AttackOption.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 2049
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 2050
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 2052
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 2053
		Login.hoveredWorldIndex = -1; // L: 2054
		if (SpotAnimationDefinition.worldSelectBackSprites != null) { // L: 2055
			byte var29 = 88; // L: 2056
			byte var30 = 19; // L: 2057
			var4 = 765 / (var29 + 1) - 1; // L: 2058
			var5 = 480 / (var30 + 1); // L: 2059

			int var24;
			int var27;
			do {
				var24 = var5; // L: 2061
				var27 = var4; // L: 2062
				if (var5 * (var4 - 1) >= World.World_count) { // L: 2063
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 2064
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 2065
					--var5;
				}
			} while(var24 != var5 || var4 != var27); // L: 2066

			var24 = (765 - var29 * var4) / (var4 + 1); // L: 2068
			if (var24 > 5) { // L: 2069
				var24 = 5;
			}

			var27 = (480 - var5 * var30) / (var5 + 1); // L: 2070
			if (var27 > 5) { // L: 2071
				var27 = 5;
			}

			int var25 = (765 - var29 * var4 - var24 * (var4 - 1)) / 2; // L: 2072
			int var9 = (480 - var5 * var30 - var27 * (var5 - 1)) / 2; // L: 2073
			int var10 = (var5 + World.World_count - 1) / var5; // L: 2074
			Login.worldSelectPagesCount = var10 - var4; // L: 2075
			if (class25.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 2076
				class25.worldSelectLeftSprite.drawAt(8, class370.canvasHeight / 2 - class25.worldSelectLeftSprite.subHeight / 2); // L: 2077
			}

			if (class14.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 2079
				class14.worldSelectRightSprite.drawAt(VarbitComposition.canvasWidth - class14.worldSelectRightSprite.subWidth - 8, class370.canvasHeight / 2 - class14.worldSelectRightSprite.subHeight / 2); // L: 2080
			}

			int var11 = var9 + 23; // L: 2082
			int var12 = var25 + Login.xPadding; // L: 2083
			int var13 = 0; // L: 2084
			boolean var14 = false; // L: 2085
			int var15 = Login.worldSelectPage; // L: 2086

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 2087 2088
				World var17 = class16.World_worlds[var16]; // L: 2091
				boolean var18 = true; // L: 2092
				String var19 = Integer.toString(var17.population); // L: 2093
				if (var17.population == -1) { // L: 2094
					var19 = "OFF"; // L: 2095
					var18 = false; // L: 2096
				} else if (var17.population > 1980) { // L: 2098
					var19 = "FULL"; // L: 2099
					var18 = false; // L: 2100
				}

				class108 var20 = null; // L: 2102
				int var21 = 0; // L: 2103
				if (var17.isBeta()) { // L: 2104
					var20 = var17.isMembersOnly() ? class108.field1382 : class108.field1376; // L: 2105
				} else if (var17.isDeadman()) { // L: 2107
					var20 = var17.isMembersOnly() ? class108.field1390 : class108.field1389; // L: 2108
				} else if (var17.method1836()) { // L: 2110
					var21 = 16711680; // L: 2111
					var20 = var17.isMembersOnly() ? class108.field1380 : class108.field1375; // L: 2112
				} else if (var17.method1823()) { // L: 2114
					var20 = var17.isMembersOnly() ? class108.field1377 : class108.field1383; // L: 2115
				} else if (var17.isPvp()) { // L: 2117
					var20 = var17.isMembersOnly() ? class108.field1378 : class108.field1379; // L: 2118
				} else if (var17.method1826()) { // L: 2120
					var20 = var17.isMembersOnly() ? class108.field1386 : class108.field1385; // L: 2121
				} else if (var17.method1821()) { // L: 2123
					var20 = var17.isMembersOnly() ? class108.field1391 : class108.field1381; // L: 2124
				}

				if (var20 == null || var20.field1387 >= SpotAnimationDefinition.worldSelectBackSprites.length) { // L: 2126
					var20 = var17.isMembersOnly() ? class108.field1388 : class108.field1384; // L: 2127
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var29 && MouseHandler.MouseHandler_y < var30 + var11 && var18) { // L: 2129
					Login.hoveredWorldIndex = var16; // L: 2130
					SpotAnimationDefinition.worldSelectBackSprites[var20.field1387].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 2131
					var14 = true; // L: 2132
				} else {
					SpotAnimationDefinition.worldSelectBackSprites[var20.field1387].drawAt(var12, var11); // L: 2134
				}

				if (class170.worldSelectFlagSprites != null) { // L: 2135
					class170.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var30 / 2 + var11 + 5, var21, -1); // L: 2136
				var1.drawCentered(var19, var12 + 60, var30 / 2 + var11 + 5, 268435455, -1); // L: 2137
				var11 = var11 + var30 + var27; // L: 2138
				++var13; // L: 2139
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 2140
					var12 = var12 + var24 + var29; // L: 2141
					var13 = 0; // L: 2142
					++var15; // L: 2143
				}
			}

			if (var14) { // L: 2146
				var16 = var1.stringWidth(class16.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 2147
				int var26 = var1.ascent + 8; // L: 2148
				int var28 = MouseHandler.MouseHandler_y + 25; // L: 2149
				if (var26 + var28 > 480) { // L: 2150
					var28 = MouseHandler.MouseHandler_y - 25 - var26; // L: 2151
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var28, var16, var26, 16777120); // L: 2153
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var28, var16, var26, 0); // L: 2154
				var1.drawCentered(class16.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var28 + var1.ascent + 4, 0, -1); // L: 2155
			}
		}

		KitDefinition.rasterProvider.drawFull(0, 0); // L: 2158
	} // L: 2159

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "1"
	)
	static int method2211(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3424
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3425
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3426
			return 1; // L: 3427
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3429
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3430
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3431
			return 1; // L: 3432
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3434
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3435
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3436
			return 1; // L: 3437
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3439
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3440
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3441
			return 1; // L: 3442
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3444
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3445
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3446
			return 1; // L: 3447
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3449
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3450
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3451
			return 1; // L: 3452
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3454
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3455
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3456
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3457
				return 1; // L: 3458
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3460
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3461
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3462
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3463
				return 1; // L: 3464
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3466
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3467
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3468
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3469
				return 1; // L: 3470
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3472
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3473
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3474
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3475
				return 1; // L: 3476
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3478
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3479
					if (LoginScreenAnimation.grandExchangeEvents != null) { // L: 3480
						LoginScreenAnimation.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3481
					}

					return 1; // L: 3483
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3485
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3486
					if (LoginScreenAnimation.grandExchangeEvents != null) { // L: 3487
						LoginScreenAnimation.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3488
					}

					return 1; // L: 3490
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3492
					Interpreter.Interpreter_intStackSize -= 2; // L: 3493
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 3494
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3495
					if (LoginScreenAnimation.grandExchangeEvents != null) { // L: 3496
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3497
						LoginScreenAnimation.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3498
					}

					return 1; // L: 3500
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3502
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3503
					if (LoginScreenAnimation.grandExchangeEvents != null) { // L: 3504
						LoginScreenAnimation.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3505
					}

					return 1; // L: 3507
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3509
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3510
					if (LoginScreenAnimation.grandExchangeEvents != null) { // L: 3511
						LoginScreenAnimation.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3512
					}

					return 1; // L: 3514
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3516
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginScreenAnimation.grandExchangeEvents == null ? 0 : LoginScreenAnimation.grandExchangeEvents.events.size(); // L: 3517
					return 1; // L: 3518
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3520
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3521
						var4 = (GrandExchangeEvent)LoginScreenAnimation.grandExchangeEvents.events.get(var3); // L: 3522
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 3523
						return 1; // L: 3524
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3526
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3527
						var4 = (GrandExchangeEvent)LoginScreenAnimation.grandExchangeEvents.events.get(var3); // L: 3528
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3529
						return 1; // L: 3530
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3532
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3533
						var4 = (GrandExchangeEvent)LoginScreenAnimation.grandExchangeEvents.events.get(var3); // L: 3534
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3535
						return 1; // L: 3536
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3538
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3539
						var4 = (GrandExchangeEvent)LoginScreenAnimation.grandExchangeEvents.events.get(var3); // L: 3540
						long var5 = AttackOption.method2714() - class168.field1806 - var4.age; // L: 3541
						int var7 = (int)(var5 / 3600000L); // L: 3542
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3543
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3544
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3545
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var10; // L: 3546
						return 1; // L: 3547
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3549
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3550
						var4 = (GrandExchangeEvent)LoginScreenAnimation.grandExchangeEvents.events.get(var3); // L: 3551
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3552
						return 1; // L: 3553
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3555
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3556
						var4 = (GrandExchangeEvent)LoginScreenAnimation.grandExchangeEvents.events.get(var3); // L: 3557
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3558
						return 1; // L: 3559
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3561
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3562
						var4 = (GrandExchangeEvent)LoginScreenAnimation.grandExchangeEvents.events.get(var3); // L: 3563
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3564
						return 1; // L: 3565
					} else if (var0 == 3939) { // L: 3567
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3568
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3569
						return 1; // L: 3570
					} else {
						return 2; // L: 3572
					}
				}
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IIII)V",
		garbageValue = "7889987"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class27.localPlayer != var0) { // L: 10483
			if (Client.menuOptionsCount < 400) { // L: 10484
				String var4;
				if (var0.skillLevel == 0) { // L: 10486
					var4 = var0.actions[0] + var0.username + var0.actions[1] + ClanChannelMember.method3229(var0.combatLevel, class27.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10487
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 10488
					class238.insertMenuItemNoShift("Use", Client.field661 + " " + "->" + " " + class17.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10489
				} else if (Client.isSpellSelected) { // L: 10492
					if ((class13.selectedSpellFlags & 8) == 8) { // L: 10493
						class238.insertMenuItemNoShift(Client.field665, Client.field666 + " " + "->" + " " + class17.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10494
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 10499
						if (Client.playerMenuActions[var5] != null) { // L: 10500
							short var6 = 0; // L: 10501
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 10502
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10503
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class27.localPlayer.combatLevel) { // L: 10504
									var6 = 2000; // L: 10505
								}

								if (class27.localPlayer.team != 0 && var0.team != 0) { // L: 10507
									if (var0.team == class27.localPlayer.team) { // L: 10508
										var6 = 2000;
									} else {
										var6 = 0; // L: 10509
									}
								} else if (AttackOption.field1343 == Client.playerAttackOption && var0.isClanMember()) { // L: 10511
									var6 = 2000; // L: 10512
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 10515
								var6 = 2000;
							}

							boolean var7 = false; // L: 10516
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10517
							class238.insertMenuItemNoShift(Client.playerMenuActions[var5], class17.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10518
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10523
					if (Client.menuOpcodes[var5] == 23) { // L: 10524
						Client.menuTargets[var5] = class17.colorStartTag(16777215) + var4; // L: 10525
						break;
					}
				}

			}
		}
	} // L: 10529
}
