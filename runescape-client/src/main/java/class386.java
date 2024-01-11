import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("of")
public class class386 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4440;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4439;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4438;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4441;

	static {
		field4440 = new class386(); // L: 4
		field4439 = new class386(); // L: 5
		field4438 = new class386(); // L: 6
		field4441 = new class386(); // L: 7
	}

	class386() {
	} // L: 9

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "10"
	)
	static int method7275(int var0, Script var1, boolean var2) {
		Widget var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1706
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1707
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1708
			return 1; // L: 1709
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1711
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1712
			return 1; // L: 1713
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1715
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.text; // L: 1716
			return 1; // L: 1717
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1719
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1720
			return 1; // L: 1721
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1723
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1724
			return 1; // L: 1725
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1727
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1728
			return 1; // L: 1729
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1731
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1732
			return 1; // L: 1733
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1735
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1736
			return 1; // L: 1737
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1739
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1740
			return 1; // L: 1741
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1743
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1744
			return 1; // L: 1745
		} else if (var0 == 2610) { // L: 1747
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1748
			return 1; // L: 1749
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1751
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color; // L: 1752
			return 1; // L: 1753
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1755
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color2; // L: 1756
			return 1; // L: 1757
		} else if (var0 == 2613) { // L: 1759
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1760
			return 1; // L: 1761
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1763
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1764
			return 1; // L: 1765
		} else {
			class339 var4;
			if (var0 == 2617) { // L: 1767
				var4 = var3.method6729(); // L: 1768
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3623 : 0; // L: 1769
			}

			if (var0 == 2618) { // L: 1771
				var4 = var3.method6729(); // L: 1772
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3619 : 0; // L: 1773
				return 1; // L: 1774
			} else {
				class344 var7;
				if (var0 == 2619) { // L: 1776
					var7 = var3.method6700(); // L: 1777
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6564().method7608() : ""; // L: 1778
					return 1; // L: 1779
				} else if (var0 == 2620) { // L: 1781
					var4 = var3.method6729(); // L: 1782
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3620 : 0; // L: 1783
					return 1; // L: 1784
				} else if (var0 == 2621) { // L: 1786
					var7 = var3.method6700(); // L: 1787
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6452() : 0; // L: 1788
					return 1; // L: 1789
				} else if (var0 == 2622) { // L: 1791
					var7 = var3.method6700(); // L: 1792
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6476() : 0; // L: 1793
					return 1; // L: 1794
				} else if (var0 == 2623) { // L: 1796
					var7 = var3.method6700(); // L: 1797
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6477() : 0; // L: 1798
					return 1; // L: 1799
				} else if (var0 == 2624) { // L: 1801
					var7 = var3.method6700(); // L: 1802
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6468() ? 1 : 0; // L: 1803
					return 1; // L: 1804
				} else if (var0 != 2625) { // L: 1806
					if (var0 == 2626) { // L: 1811
						var7 = var3.method6700(); // L: 1812
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6467().method7883() : ""; // L: 1813
						return 1; // L: 1814
					} else if (var0 == 2627) { // L: 1816
						var7 = var3.method6700(); // L: 1817
						int var5 = var7 != null ? var7.method6531() : 0; // L: 1818
						int var6 = var7 != null ? var7.method6471() : 0; // L: 1819
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1820
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1821
						return 1; // L: 1822
					} else if (var0 == 2628) { // L: 1824
						var7 = var3.method6700(); // L: 1825
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6471() : 0; // L: 1826
						return 1; // L: 1827
					} else if (var0 == 2629) { // L: 1829
						var7 = var3.method6700(); // L: 1830
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6479() : 0; // L: 1831
						return 1; // L: 1832
					} else if (var0 == 2630) { // L: 1834
						var7 = var3.method6700(); // L: 1835
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6663() : 0; // L: 1836
						return 1; // L: 1837
					} else if (var0 == 2631) { // L: 1839
						var7 = var3.method6700(); // L: 1840
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6480() : 0; // L: 1841
						return 1; // L: 1842
					} else if (var0 == 2632) { // L: 1844
						var7 = var3.method6700(); // L: 1845
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6593() : 0; // L: 1846
						return 1; // L: 1847
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1849
							var8 = var3.method6724(); // L: 1850
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method394(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0; // L: 1851
							return 1; // L: 1852
						} else if (var0 == 2634) { // L: 1854
							var8 = var3.method6724(); // L: 1855
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0; // L: 1856
							return 1; // L: 1857
						} else {
							return 2; // L: 1859
						}
					}
				} else {
					var7 = var3.method6700(); // L: 1807
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6672() ? 1 : 0; // L: 1808
					return 1; // L: 1809
				}
			}
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIIIIB)V",
		garbageValue = "-18"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5159
			if (var0 instanceof NPC) { // L: 5160
				NPCComposition var6 = ((NPC)var0).definition; // L: 5161
				if (var6.transforms != null) { // L: 5162
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5163
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5165
			int[] var7 = Players.Players_indices; // L: 5166
			boolean var8 = var1 < var75; // L: 5167
			int var9 = -2; // L: 5168
			if (var0.field1195 != null && (!var8 || !var0.field1194 && (Client.publicChatMode == 4 || !var0.field1202 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2388())))) { // L: 5169 5170
				class165.method3517(var0, var0.defaultHeight); // L: 5171
				if (Client.viewportTempX > -1 && Client.field601 < Client.field602) { // L: 5172
					Client.field606[Client.field601] = class90.fontBold12.stringWidth(var0.field1195) / 2; // L: 5173
					Client.field605[Client.field601] = class90.fontBold12.ascent; // L: 5174
					Client.field710[Client.field601] = Client.viewportTempX; // L: 5175
					Client.field604[Client.field601] = Client.viewportTempY - var9; // L: 5176
					Client.field795[Client.field601] = var0.field1185; // L: 5177
					Client.field752[Client.field601] = var0.field1197; // L: 5178
					Client.field610[Client.field601] = var0.field1212; // L: 5179
					Client.field609[Client.field601] = var0.field1198; // L: 5180
					Client.field611[Client.field601] = var0.field1195; // L: 5181
					++Client.field601; // L: 5182
					var9 += 12; // L: 5183
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7364()) { // L: 5187
				class165.method3517(var0, var0.defaultHeight + 15); // L: 5188

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5189
					HealthBarUpdate var11 = var10.get(Client.cycle); // L: 5190
					if (var11 == null) { // L: 5191
						if (var10.isEmpty()) { // L: 5249
							var10.remove();
						}
					} else {
						HealthBarDefinition var77 = var10.definition; // L: 5192
						SpritePixels var13 = var77.method3673(); // L: 5193
						SpritePixels var83 = var77.method3671(); // L: 5194
						int var84 = 0; // L: 5196
						if (var13 != null && var83 != null) { // L: 5197
							if (var77.widthPadding * 2 < var83.subWidth) { // L: 5198
								var84 = var77.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5199
						} else {
							var15 = var77.width; // L: 5201
						}

						int var81 = 255; // L: 5202
						boolean var85 = true; // L: 5203
						int var86 = Client.cycle - var11.cycle; // L: 5204
						int var87 = var15 * var11.health2 / var77.width; // L: 5205
						int var88;
						int var102;
						if (var11.cycleOffset > var86) { // L: 5206
							var88 = var77.field1885 == 0 ? 0 : var77.field1885 * (var86 / var77.field1885); // L: 5207
							var22 = var15 * var11.health / var77.width; // L: 5208
							var102 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5209
						} else {
							var102 = var87; // L: 5212
							var88 = var77.int5 + var11.cycleOffset - var86; // L: 5213
							if (var77.int3 >= 0) { // L: 5214
								var81 = (var88 << 8) / (var77.int5 - var77.int3);
							}
						}

						if (var11.health2 > 0 && var102 < 1) { // L: 5216
							var102 = 1;
						}

						if (var13 != null && var83 != null) { // L: 5217
							if (var15 == var102) { // L: 5218
								var102 += var84 * 2;
							} else {
								var102 += var84; // L: 5219
							}

							var88 = var13.subHeight; // L: 5220
							var9 += var88; // L: 5221
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5222
							var23 = var3 + Client.viewportTempY - var9; // L: 5223
							var22 -= var84; // L: 5224
							if (var81 >= 0 && var81 < 255) { // L: 5225
								var13.drawTransAt(var22, var23, var81); // L: 5226
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var102 + var22, var23 + var88); // L: 5227
								var83.drawTransAt(var22, var23, var81); // L: 5228
							} else {
								var13.drawTransBgAt(var22, var23); // L: 5231
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var102, var88 + var23); // L: 5232
								var83.drawTransBgAt(var22, var23); // L: 5233
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5235
							var9 += 2; // L: 5236
						} else {
							var9 += 5; // L: 5239
							if (Client.viewportTempX > -1) { // L: 5240
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5241
								var22 = var3 + Client.viewportTempY - var9; // L: 5242
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var102, 5, 65280); // L: 5243
								Rasterizer2D.Rasterizer2D_fillRectangle(var102 + var88, var22, var15 - var102, 5, 16711680); // L: 5244
							}

							var9 += 2; // L: 5246
						}
					}
				}
			}

			if (var9 == -2) { // L: 5252
				var9 += 7;
			}

			if (var8 && var0.playerCycle == Client.cycle) { // L: 5253
				Player var91 = (Player)var0; // L: 5255
				boolean var76;
				if (Client.drawPlayerNames == 0) { // L: 5257
					var76 = false; // L: 5258
				} else if (var91 == class25.localPlayer) { // L: 5261
					boolean var12 = (Client.drawPlayerNames & 8) != 0; // L: 5267
					var76 = var12; // L: 5269
				} else {
					var76 = class197.method3854() || class113.method2915() && var91.method2388() || class16.method220() && var91.method2391(); // L: 5262
				}

				if (var76) { // L: 5272
					Player var98 = (Player)var0; // L: 5273
					if (var8) { // L: 5274
						class165.method3517(var0, var0.defaultHeight + 15); // L: 5275
						AbstractFont var94 = (AbstractFont)Client.field565.get(FontName.FontName_plain12); // L: 5276
						var9 += 4; // L: 5277
						var94.drawCentered(var98.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5278
						var9 += 18; // L: 5279
					}
				}
			}

			if (var8) { // L: 5283
				Player var89 = (Player)var0; // L: 5284
				if (var89.isHidden) { // L: 5285
					return;
				}

				if (var89.field1099 != -1 || var89.field1100 != -1) { // L: 5286
					class165.method3517(var0, var0.defaultHeight + 15); // L: 5287
					if (Client.viewportTempX > -1) { // L: 5288
						if (var89.field1099 != -1) { // L: 5289
							var9 += 25; // L: 5290
							Actor.field1248[var89.field1099].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5291
						}

						if (var89.field1100 != -1) { // L: 5293
							var9 += 25; // L: 5294
							class13.field52[var89.field1100].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5295
						}
					}
				}

				if (var1 >= 0 && Client.field513 == 10 && var7[var1] == Client.field519) { // L: 5299
					class165.method3517(var0, var0.defaultHeight + 15); // L: 5300
					if (Client.viewportTempX > -1) { // L: 5301
						var9 += GrandExchangeOfferOwnWorldComparator.field495[1].subHeight; // L: 5302
						GrandExchangeOfferOwnWorldComparator.field495[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5303
					}
				}
			} else {
				NPC var90 = (NPC)var0; // L: 5308
				int[] var92 = var90.method2665(); // L: 5309
				short[] var100 = var90.method2686(); // L: 5310
				if (var100 != null && var92 != null) { // L: 5311
					for (int var78 = 0; var78 < var100.length; ++var78) { // L: 5312
						if (var100[var78] >= 0 && var92[var78] >= 0) { // L: 5313
							long var14 = (long)var92[var78] << 8 | (long)var100[var78]; // L: 5316
							SpritePixels var16 = (SpritePixels)Client.field791.method8139(var14); // L: 5317
							if (var16 == null) { // L: 5318
								SpritePixels[] var17 = class217.method4289(class19.field94, var92[var78], 0); // L: 5319
								if (var17 != null && var100[var78] < var17.length) { // L: 5320
									var16 = var17[var100[var78]]; // L: 5321
									Client.field791.method8146(var14, var16); // L: 5322
								}
							}

							if (var16 != null) { // L: 5325
								class165.method3517(var0, var0.defaultHeight + 15); // L: 5326
								if (Client.viewportTempX > -1) { // L: 5327
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5328
								}
							}
						}
					}
				}

				if (Client.field513 == 1 && Client.npcIndices[var1 - var75] == Client.field508 && Client.cycle % 20 < 10) { // L: 5333
					class165.method3517(var0, var0.defaultHeight + 15); // L: 5334
					if (Client.viewportTempX > -1) { // L: 5335
						GrandExchangeOfferOwnWorldComparator.field495[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var99 = 0; var99 < 4; ++var99) { // L: 5338
				int var79 = var0.hitSplatCycles[var99]; // L: 5339
				int var93 = var0.hitSplatTypes[var99]; // L: 5340
				HitSplatDefinition var95 = null; // L: 5341
				int var80 = 0; // L: 5342
				if (var93 >= 0) { // L: 5343
					if (var79 <= Client.cycle) { // L: 5344
						continue;
					}

					var95 = class192.method3790(var0.hitSplatTypes[var99]); // L: 5345
					var80 = var95.field2069; // L: 5346
					if (var95 != null && var95.transforms != null) { // L: 5347
						var95 = var95.transform(); // L: 5348
						if (var95 == null) { // L: 5349
							var0.hitSplatCycles[var99] = -1; // L: 5350
							continue; // L: 5351
						}
					}
				} else if (var79 < 0) { // L: 5355
					continue;
				}

				var15 = var0.hitSplatTypes2[var99]; // L: 5356
				HitSplatDefinition var96 = null; // L: 5357
				if (var15 >= 0) { // L: 5358
					var96 = class192.method3790(var15); // L: 5359
					if (var96 != null && var96.transforms != null) { // L: 5360
						var96 = var96.transform();
					}
				}

				if (var79 - var80 <= Client.cycle) { // L: 5362
					if (var95 == null) { // L: 5363
						var0.hitSplatCycles[var99] = -1; // L: 5364
					} else {
						class165.method3517(var0, var0.defaultHeight / 2); // L: 5367
						if (Client.viewportTempX > -1) { // L: 5368
							boolean var101 = true; // L: 5369
							if (var99 == 1) { // L: 5370
								Client.viewportTempY -= 20; // L: 5371
							}

							if (var99 == 2) { // L: 5373
								Client.viewportTempX -= 15; // L: 5374
								Client.viewportTempY -= 10; // L: 5375
							}

							if (var99 == 3) { // L: 5377
								Client.viewportTempX += 15; // L: 5378
								Client.viewportTempY -= 10; // L: 5379
							}

							SpritePixels var18 = null; // L: 5381
							SpritePixels var19 = null; // L: 5382
							SpritePixels var20 = null; // L: 5383
							SpritePixels var21 = null; // L: 5384
							var22 = 0; // L: 5385
							var23 = 0; // L: 5386
							int var24 = 0; // L: 5387
							int var25 = 0; // L: 5388
							int var26 = 0; // L: 5389
							int var27 = 0; // L: 5390
							int var28 = 0; // L: 5391
							int var29 = 0; // L: 5392
							SpritePixels var30 = null; // L: 5393
							SpritePixels var31 = null; // L: 5394
							SpritePixels var32 = null; // L: 5395
							SpritePixels var33 = null; // L: 5396
							int var34 = 0; // L: 5397
							int var35 = 0; // L: 5398
							int var36 = 0; // L: 5399
							int var37 = 0; // L: 5400
							int var38 = 0; // L: 5401
							int var39 = 0; // L: 5402
							int var40 = 0; // L: 5403
							int var41 = 0; // L: 5404
							int var42 = 0; // L: 5405
							var18 = var95.method3927(); // L: 5406
							int var43;
							if (var18 != null) { // L: 5407
								var22 = var18.subWidth; // L: 5408
								var43 = var18.subHeight; // L: 5409
								if (var43 > var42) { // L: 5410
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5411
							}

							var19 = var95.method3902(); // L: 5413
							if (var19 != null) { // L: 5414
								var23 = var19.subWidth; // L: 5415
								var43 = var19.subHeight; // L: 5416
								if (var43 > var42) { // L: 5417
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5418
							}

							var20 = var95.method3903(); // L: 5420
							if (var20 != null) { // L: 5421
								var24 = var20.subWidth; // L: 5422
								var43 = var20.subHeight; // L: 5423
								if (var43 > var42) { // L: 5424
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5425
							}

							var21 = var95.method3904(); // L: 5427
							if (var21 != null) { // L: 5428
								var25 = var21.subWidth; // L: 5429
								var43 = var21.subHeight; // L: 5430
								if (var43 > var42) { // L: 5431
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5432
							}

							if (var96 != null) { // L: 5434
								var30 = var96.method3927(); // L: 5435
								if (var30 != null) { // L: 5436
									var34 = var30.subWidth; // L: 5437
									var43 = var30.subHeight; // L: 5438
									if (var43 > var42) { // L: 5439
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5440
								}

								var31 = var96.method3902(); // L: 5442
								if (var31 != null) { // L: 5443
									var35 = var31.subWidth; // L: 5444
									var43 = var31.subHeight; // L: 5445
									if (var43 > var42) { // L: 5446
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5447
								}

								var32 = var96.method3903(); // L: 5449
								if (var32 != null) { // L: 5450
									var36 = var32.subWidth; // L: 5451
									var43 = var32.subHeight; // L: 5452
									if (var43 > var42) { // L: 5453
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5454
								}

								var33 = var96.method3904(); // L: 5456
								if (var33 != null) { // L: 5457
									var37 = var33.subWidth; // L: 5458
									var43 = var33.subHeight; // L: 5459
									if (var43 > var42) { // L: 5460
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5461
								}
							}

							Font var82 = var95.getFont(); // L: 5466
							if (var82 == null) { // L: 5467
								var82 = UserComparator5.field1453;
							}

							Font var44;
							if (var96 != null) { // L: 5468
								var44 = var96.getFont(); // L: 5469
								if (var44 == null) { // L: 5470
									var44 = UserComparator5.field1453;
								}
							} else {
								var44 = UserComparator5.field1453; // L: 5472
							}

							String var45 = null; // L: 5473
							String var46 = null; // L: 5474
							boolean var47 = false; // L: 5475
							int var48 = 0; // L: 5476
							var45 = var95.getString(var0.hitSplatValues[var99]); // L: 5477
							int var97 = var82.stringWidth(var45); // L: 5478
							if (var96 != null) { // L: 5479
								var46 = var96.getString(var0.hitSplatValues2[var99]); // L: 5480
								var48 = var44.stringWidth(var46); // L: 5481
							}

							int var49 = 0; // L: 5483
							int var50 = 0; // L: 5484
							if (var23 > 0) { // L: 5485
								if (var20 == null && var21 == null) { // L: 5486
									var49 = 1; // L: 5487
								} else {
									var49 = var97 / var23 + 1;
								}
							}

							if (var96 != null && var35 > 0) { // L: 5489 5490
								if (var32 == null && var33 == null) { // L: 5491
									var50 = 1; // L: 5492
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5495
							int var52 = var51; // L: 5496
							if (var22 > 0) { // L: 5497
								var51 += var22;
							}

							var51 += 2; // L: 5498
							int var53 = var51; // L: 5499
							if (var24 > 0) { // L: 5500
								var51 += var24;
							}

							int var54 = var51; // L: 5501
							int var55 = var51; // L: 5502
							int var56;
							if (var23 > 0) { // L: 5503
								var56 = var49 * var23; // L: 5504
								var51 += var56; // L: 5505
								var55 += (var56 - var97) / 2; // L: 5506
							} else {
								var51 += var97; // L: 5509
							}

							var56 = var51; // L: 5511
							if (var25 > 0) { // L: 5512
								var51 += var25;
							}

							int var57 = 0; // L: 5513
							int var58 = 0; // L: 5514
							int var59 = 0; // L: 5515
							int var60 = 0; // L: 5516
							int var61 = 0; // L: 5517
							int var62;
							if (var96 != null) { // L: 5518
								var51 += 2; // L: 5519
								var57 = var51; // L: 5520
								if (var34 > 0) { // L: 5521
									var51 += var34;
								}

								var51 += 2; // L: 5522
								var58 = var51; // L: 5523
								if (var36 > 0) { // L: 5524
									var51 += var36;
								}

								var59 = var51; // L: 5525
								var61 = var51; // L: 5526
								if (var35 > 0) { // L: 5527
									var62 = var35 * var50; // L: 5528
									var51 += var62; // L: 5529
									var61 += (var62 - var48) / 2; // L: 5530
								} else {
									var51 += var48; // L: 5533
								}

								var60 = var51; // L: 5535
								if (var37 > 0) { // L: 5536
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var99] - Client.cycle; // L: 5538
							int var63 = var95.field2081 - var62 * var95.field2081 / var95.field2069; // L: 5539
							int var64 = var62 * var95.field2089 / var95.field2069 + -var95.field2089; // L: 5540
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5541
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5542
							int var67 = var66; // L: 5543
							int var68 = var66 + var42; // L: 5544
							int var69 = var66 + var95.field2086 + 15; // L: 5545
							int var70 = var69 - var82.maxAscent; // L: 5546
							int var71 = var69 + var82.maxDescent; // L: 5547
							if (var70 < var66) { // L: 5548
								var67 = var70;
							}

							if (var71 > var68) { // L: 5549
								var68 = var71;
							}

							int var72 = 0; // L: 5550
							int var73;
							int var74;
							if (var96 != null) { // L: 5551
								var72 = var66 + var96.field2086 + 15; // L: 5552
								var73 = var72 - var44.maxAscent; // L: 5553
								var74 = var72 + var44.maxDescent; // L: 5554
								if (var73 < var67) { // L: 5555
									;
								}

								if (var74 > var68) { // L: 5556
									;
								}
							}

							var73 = 255; // L: 5558
							if (var95.field2083 >= 0) { // L: 5559
								var73 = (var62 << 8) / (var95.field2069 - var95.field2083);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5560
								if (var18 != null) { // L: 5561
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5562
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5563
									for (var74 = 0; var74 < var49; ++var74) { // L: 5564
										var19.drawTransAt(var74 * var23 + (var65 + var54 - var27), var66, var73); // L: 5565
									}
								}

								if (var21 != null) { // L: 5568
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var95.textColor, 0, var73); // L: 5569
								if (var96 != null) { // L: 5570
									if (var30 != null) { // L: 5571
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5572
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5573
										for (var74 = 0; var74 < var50; ++var74) { // L: 5574
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5575
										}
									}

									if (var33 != null) { // L: 5578
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var96.textColor, 0, var73); // L: 5579
								}
							} else {
								if (var18 != null) { // L: 5583
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5584
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5585
									for (var74 = 0; var74 < var49; ++var74) { // L: 5586
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66); // L: 5587
									}
								}

								if (var21 != null) { // L: 5590
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var95.textColor | -16777216, 0); // L: 5591
								if (var96 != null) { // L: 5592
									if (var30 != null) { // L: 5593
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5594
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5595
										for (var74 = 0; var74 < var50; ++var74) { // L: 5596
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5597
										}
									}

									if (var33 != null) { // L: 5600
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var96.textColor | -16777216, 0); // L: 5601
								}
							}
						}
					}
				}
			}

		}
	} // L: 5606
}
