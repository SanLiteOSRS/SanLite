import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("ParamComposition_cached")
	static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = 533863423
	)
	static int field2040;
	@ObfuscatedName("ar")
	@Export("type")
	char type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -349054401
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ab")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("au")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-2107778896"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "56"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.type = class17.method262(var1.readByte()); // L: 47
		} else if (var2 == 2) { // L: 49
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 50
		} else if (var2 == 5) { // L: 51
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 53

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-232171801"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 56
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;B)V",
		garbageValue = "74"
	)
	static void method3830(Font var0, Font var1) {
		if (class108.worldSelectBackSprites == null) { // L: 2063
			class108.worldSelectBackSprites = Players.method2779(GrandExchangeOfferOwnWorldComparator.field481, "sl_back", "");
		}

		if (class130.worldSelectFlagSprites == null) { // L: 2064
			class130.worldSelectFlagSprites = Skills.method6857(GrandExchangeOfferOwnWorldComparator.field481, "sl_flags", "");
		}

		if (class148.worldSelectArrows == null) { // L: 2065
			class148.worldSelectArrows = Skills.method6857(GrandExchangeOfferOwnWorldComparator.field481, "sl_arrows", "");
		}

		if (class228.worldSelectStars == null) { // L: 2066
			class228.worldSelectStars = Skills.method6857(GrandExchangeOfferOwnWorldComparator.field481, "sl_stars", "");
		}

		if (Varps.worldSelectLeftSprite == null) { // L: 2067
			Varps.worldSelectLeftSprite = class313.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.field481, "leftarrow", "");
		}

		if (class105.worldSelectRightSprite == null) { // L: 2068
			class105.worldSelectRightSprite = class313.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.field481, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 2069
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 2070
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 2071
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 2072
		if (class228.worldSelectStars != null) { // L: 2073
			class228.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 2074
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 2075
			class228.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 2076
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 2077
		}

		int var4;
		int var5;
		if (class148.worldSelectArrows != null) { // L: 2079
			int var2 = Login.xPadding + 280; // L: 2080
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 2081
				class148.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var2, 4); // L: 2082
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 2083
				class148.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var2 + 15, 4); // L: 2084
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1); // L: 2085
			int var3 = Login.xPadding + 390; // L: 2086
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 2087
				class148.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var3, 4); // L: 2088
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 2089
				class148.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var3 + 15, 4); // L: 2090
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1); // L: 2091
			var4 = Login.xPadding + 500; // L: 2092
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 2093
				class148.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var4, 4); // L: 2094
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 2095
				class148.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 2096
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 2097
			var5 = Login.xPadding + 610; // L: 2098
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 2099
				class148.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var5, 4); // L: 2100
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 2101
				class148.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 2102
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 2103
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 2105
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 2106
		Login.hoveredWorldIndex = -1; // L: 2107
		if (class108.worldSelectBackSprites != null) { // L: 2108
			byte var23 = 88; // L: 2109
			byte var24 = 19; // L: 2110
			var4 = 765 / (var23 + 1) - 1; // L: 2111
			var5 = 480 / (var24 + 1); // L: 2112

			int var6;
			int var7;
			do {
				var6 = var5; // L: 2114
				var7 = var4; // L: 2115
				if (var5 * (var4 - 1) >= World.World_count) { // L: 2116
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 2117
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 2118
					--var5;
				}
			} while(var5 != var6 || var4 != var7); // L: 2119

			var6 = (765 - var4 * var23) / (var4 + 1); // L: 2121
			if (var6 > 5) { // L: 2122
				var6 = 5;
			}

			var7 = (480 - var24 * var5) / (var5 + 1); // L: 2123
			if (var7 > 5) { // L: 2124
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2; // L: 2125
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2; // L: 2126
			int var10 = (var5 + World.World_count - 1) / var5; // L: 2127
			Login.worldSelectPagesCount = var10 - var4; // L: 2128
			if (Varps.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 2129
				Varps.worldSelectLeftSprite.drawAt(8, class47.canvasHeight / 2 - Varps.worldSelectLeftSprite.subHeight / 2); // L: 2130
			}

			if (class105.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 2132
				class105.worldSelectRightSprite.drawAt(Language.canvasWidth - class105.worldSelectRightSprite.subWidth - 8, class47.canvasHeight / 2 - class105.worldSelectRightSprite.subHeight / 2); // L: 2133
			}

			int var11 = var9 + 23; // L: 2135
			int var12 = var8 + Login.xPadding; // L: 2136
			int var13 = 0; // L: 2137
			boolean var14 = false; // L: 2138
			int var15 = Login.worldSelectPage; // L: 2139

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 2140 2141
				World var17 = class361.World_worlds[var16]; // L: 2144
				boolean var18 = true; // L: 2145
				String var19 = Integer.toString(var17.population); // L: 2146
				if (var17.population == -1) { // L: 2147
					var19 = "OFF"; // L: 2148
					var18 = false; // L: 2149
				} else if (var17.population > 1980) { // L: 2151
					var19 = "FULL"; // L: 2152
					var18 = false; // L: 2153
				}

				class108 var20 = null; // L: 2155
				int var21 = 0; // L: 2156
				if (var17.isBeta()) { // L: 2157
					var20 = var17.isMembersOnly() ? class108.field1374 : class108.field1376; // L: 2158
				} else if (var17.isDeadman()) { // L: 2160
					var20 = var17.isMembersOnly() ? class108.field1385 : class108.field1384; // L: 2161
				} else if (var17.method1856()) { // L: 2163
					var21 = 16711680; // L: 2164
					var20 = var17.isMembersOnly() ? class108.field1377 : class108.field1382; // L: 2165
				} else if (var17.method1858()) { // L: 2167
					var20 = var17.isMembersOnly() ? class108.field1372 : class108.field1378; // L: 2168
				} else if (var17.isPvp()) { // L: 2170
					var20 = var17.isMembersOnly() ? class108.field1373 : class108.field1370; // L: 2171
				} else if (var17.method1859()) { // L: 2173
					var20 = var17.isMembersOnly() ? class108.field1381 : class108.field1380; // L: 2174
				} else if (var17.method1869()) { // L: 2176
					var20 = var17.isMembersOnly() ? class108.field1383 : class108.field1375; // L: 2177
				}

				if (var20 == null || var20.field1386 >= class108.worldSelectBackSprites.length) { // L: 2179
					var20 = var17.isMembersOnly() ? class108.field1371 : class108.field1379; // L: 2180
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var23 + var12 && MouseHandler.MouseHandler_y < var11 + var24 && var18) { // L: 2182
					Login.hoveredWorldIndex = var16; // L: 2183
					class108.worldSelectBackSprites[var20.field1386].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 2184
					var14 = true; // L: 2185
				} else {
					class108.worldSelectBackSprites[var20.field1386].drawAt(var12, var11); // L: 2187
				}

				if (class130.worldSelectFlagSprites != null) { // L: 2188
					class130.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1); // L: 2189
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1); // L: 2190
				var11 = var11 + var7 + var24; // L: 2191
				++var13; // L: 2192
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 2193
					var12 = var12 + var23 + var6; // L: 2194
					var13 = 0; // L: 2195
					++var15; // L: 2196
				}
			}

			if (var14) { // L: 2199
				var16 = var1.stringWidth(class361.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 2200
				int var22 = var1.ascent + 8; // L: 2201
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 2202
				if (var25 + var22 > 480) { // L: 2203
					var25 = MouseHandler.MouseHandler_y - 25 - var22; // L: 2204
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120); // L: 2206
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0); // L: 2207
				var1.drawCentered(class361.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 2208
			}
		}

	} // L: 2211
}
