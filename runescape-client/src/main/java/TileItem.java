import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 504973657
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1383840147
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		return AttackOption.ItemComposition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqz;B)V",
		garbageValue = "67"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = ScriptFrame.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - Decimator.baseX * 64; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - class7.baseY * 64; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		class268.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1308[var1] != null) { // L: 50
			var2.read(Players.field1308[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1297[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1297[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIIIIB)V",
		garbageValue = "75"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4979
			if (var0 instanceof NPC) { // L: 4980
				NPCComposition var6 = ((NPC)var0).definition; // L: 4981
				if (var6.transforms != null) { // L: 4982
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4983
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4985
			int[] var7 = Players.Players_indices; // L: 4986
			byte var8 = 0; // L: 4987
			if (var1 < var75 && var0.playerCycle == Client.cycle && CollisionMap.method3794((Player)var0)) { // L: 4988
				Player var9 = (Player)var0; // L: 4989
				if (var1 < var75) { // L: 4990
					SoundCache.method757(var0, var0.defaultHeight + 15); // L: 4991
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4992
					byte var11 = 9; // L: 4993
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 4994
					var8 = 18; // L: 4995
				}
			}

			int var76 = -2; // L: 4998
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6073()) { // L: 4999
				SoundCache.method757(var0, var0.defaultHeight + 15); // L: 5000

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 5001
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 5002
					if (var79 == null) { // L: 5003
						if (var87.isEmpty()) { // L: 5061
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 5004
						SpritePixels var13 = var80.getBackSprite(); // L: 5005
						SpritePixels var81 = var80.getFrontSprite(); // L: 5006
						int var82 = 0; // L: 5008
						if (var13 != null && var81 != null) { // L: 5009
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 5010
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 5011
						} else {
							var15 = var80.width; // L: 5013
						}

						int var17 = 255; // L: 5014
						boolean var83 = true; // L: 5015
						int var84 = Client.cycle - var79.cycle; // L: 5016
						int var85 = var15 * var79.health2 / var80.width; // L: 5017
						int var86;
						int var94;
						if (var79.cycleOffset > var84) { // L: 5018
							var86 = var80.field1867 == 0 ? 0 : var80.field1867 * (var84 / var80.field1867); // L: 5019
							var22 = var15 * var79.health / var80.width; // L: 5020
							var94 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 5021
						} else {
							var94 = var85; // L: 5024
							var86 = var79.cycleOffset + var80.int5 - var84; // L: 5025
							if (var80.int3 >= 0) { // L: 5026
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var94 < 1) { // L: 5028
							var94 = 1;
						}

						if (var13 != null && var81 != null) { // L: 5029
							if (var15 == var94) { // L: 5030
								var94 += var82 * 2;
							} else {
								var94 += var82; // L: 5031
							}

							var86 = var13.subHeight; // L: 5032
							var76 += var86; // L: 5033
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5034
							var23 = var3 + Client.viewportTempY - var76; // L: 5035
							var22 -= var82; // L: 5036
							if (var17 >= 0 && var17 < 255) { // L: 5037
								var13.drawTransAt(var22, var23, var17); // L: 5038
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var94, var23 + var86); // L: 5039
								var81.drawTransAt(var22, var23, var17); // L: 5040
							} else {
								var13.drawTransBgAt(var22, var23); // L: 5043
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var94 + var22, var23 + var86); // L: 5044
								var81.drawTransBgAt(var22, var23); // L: 5045
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5047
							var76 += 2; // L: 5048
						} else {
							var76 += 5; // L: 5051
							if (Client.viewportTempX > -1) { // L: 5052
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5053
								var22 = var3 + Client.viewportTempY - var76; // L: 5054
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var94, 5, 65280); // L: 5055
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var86, var22, var15 - var94, 5, 16711680); // L: 5056
							}

							var76 += 2; // L: 5058
						}
					}
				}
			}

			if (var76 == -2) { // L: 5064
				var76 += 7;
			}

			var76 += var8; // L: 5065
			if (var1 < var75) { // L: 5066
				Player var88 = (Player)var0; // L: 5067
				if (var88.isHidden) { // L: 5068
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 5069
					SoundCache.method757(var0, var0.defaultHeight + 15); // L: 5070
					if (Client.viewportTempX > -1) { // L: 5071
						if (var88.headIconPk != -1) { // L: 5072
							var76 += 25; // L: 5073
							BufferedSource.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5074
						}

						if (var88.headIconPrayer != -1) { // L: 5076
							var76 += 25; // L: 5077
							MusicPatchNode.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5078
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5082
					SoundCache.method757(var0, var0.defaultHeight + 15); // L: 5083
					if (Client.viewportTempX > -1) { // L: 5084
						var76 += class229.headIconHintSprites[1].subHeight; // L: 5085
						class229.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5086
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 5091
				if (var89.transforms != null) { // L: 5092
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < MusicPatchNode.headIconPrayerSprites.length) { // L: 5093
					SoundCache.method757(var0, var0.defaultHeight + 15); // L: 5094
					if (Client.viewportTempX > -1) { // L: 5095
						MusicPatchNode.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5096
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5099
					SoundCache.method757(var0, var0.defaultHeight + 15); // L: 5100
					if (Client.viewportTempX > -1) { // L: 5101
						class229.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1164 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5104 5105
				SoundCache.method757(var0, var0.defaultHeight); // L: 5106
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5107
					Client.overheadTextXOffsets[Client.overheadTextCount] = WorldMapSection2.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5108
					Client.overheadTextAscents[Client.overheadTextCount] = WorldMapSection2.fontBold12.ascent; // L: 5109
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5110
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5111
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5112
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5113
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5114
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5115
					++Client.overheadTextCount; // L: 5116
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 5120
				int var90 = var0.hitSplatCycles[var77]; // L: 5121
				int var12 = var0.hitSplatTypes[var77]; // L: 5122
				HitSplatDefinition var91 = null; // L: 5123
				int var14 = 0; // L: 5124
				if (var12 >= 0) { // L: 5125
					if (var90 <= Client.cycle) { // L: 5126
						continue;
					}

					var91 = HealthBar.method2311(var0.hitSplatTypes[var77]); // L: 5127
					var14 = var91.field2019; // L: 5128
					if (var91 != null && var91.transforms != null) { // L: 5129
						var91 = var91.transform(); // L: 5130
						if (var91 == null) { // L: 5131
							var0.hitSplatCycles[var77] = -1; // L: 5132
							continue; // L: 5133
						}
					}
				} else if (var90 < 0) { // L: 5137
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 5138
				HitSplatDefinition var16 = null; // L: 5139
				if (var15 >= 0) { // L: 5140
					var16 = HealthBar.method2311(var15); // L: 5141
					if (var16 != null && var16.transforms != null) { // L: 5142
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 5144
					if (var91 == null) { // L: 5145
						var0.hitSplatCycles[var77] = -1; // L: 5146
					} else {
						SoundCache.method757(var0, var0.defaultHeight / 2); // L: 5149
						if (Client.viewportTempX > -1) { // L: 5150
							boolean var92 = true; // L: 5151
							if (var77 == 1) { // L: 5152
								Client.viewportTempY -= 20; // L: 5153
							}

							if (var77 == 2) { // L: 5155
								Client.viewportTempX -= 15; // L: 5156
								Client.viewportTempY -= 10; // L: 5157
							}

							if (var77 == 3) { // L: 5159
								Client.viewportTempX += 15; // L: 5160
								Client.viewportTempY -= 10; // L: 5161
							}

							SpritePixels var18 = null; // L: 5163
							SpritePixels var19 = null; // L: 5164
							SpritePixels var20 = null; // L: 5165
							SpritePixels var21 = null; // L: 5166
							var22 = 0; // L: 5167
							var23 = 0; // L: 5168
							int var24 = 0; // L: 5169
							int var25 = 0; // L: 5170
							int var26 = 0; // L: 5171
							int var27 = 0; // L: 5172
							int var28 = 0; // L: 5173
							int var29 = 0; // L: 5174
							SpritePixels var30 = null; // L: 5175
							SpritePixels var31 = null; // L: 5176
							SpritePixels var32 = null; // L: 5177
							SpritePixels var33 = null; // L: 5178
							int var34 = 0; // L: 5179
							int var35 = 0; // L: 5180
							int var36 = 0; // L: 5181
							int var37 = 0; // L: 5182
							int var38 = 0; // L: 5183
							int var39 = 0; // L: 5184
							int var40 = 0; // L: 5185
							int var41 = 0; // L: 5186
							int var42 = 0; // L: 5187
							var18 = var91.method3551(); // L: 5188
							int var43;
							if (var18 != null) { // L: 5189
								var22 = var18.subWidth; // L: 5190
								var43 = var18.subHeight; // L: 5191
								if (var43 > var42) { // L: 5192
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5193
							}

							var19 = var91.method3552(); // L: 5195
							if (var19 != null) { // L: 5196
								var23 = var19.subWidth; // L: 5197
								var43 = var19.subHeight; // L: 5198
								if (var43 > var42) { // L: 5199
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5200
							}

							var20 = var91.method3556(); // L: 5202
							if (var20 != null) { // L: 5203
								var24 = var20.subWidth; // L: 5204
								var43 = var20.subHeight; // L: 5205
								if (var43 > var42) { // L: 5206
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5207
							}

							var21 = var91.method3563(); // L: 5209
							if (var21 != null) { // L: 5210
								var25 = var21.subWidth; // L: 5211
								var43 = var21.subHeight; // L: 5212
								if (var43 > var42) { // L: 5213
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5214
							}

							if (var16 != null) { // L: 5216
								var30 = var16.method3551(); // L: 5217
								if (var30 != null) { // L: 5218
									var34 = var30.subWidth; // L: 5219
									var43 = var30.subHeight; // L: 5220
									if (var43 > var42) { // L: 5221
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5222
								}

								var31 = var16.method3552(); // L: 5224
								if (var31 != null) { // L: 5225
									var35 = var31.subWidth; // L: 5226
									var43 = var31.subHeight; // L: 5227
									if (var43 > var42) { // L: 5228
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5229
								}

								var32 = var16.method3556(); // L: 5231
								if (var32 != null) { // L: 5232
									var36 = var32.subWidth; // L: 5233
									var43 = var32.subHeight; // L: 5234
									if (var43 > var42) { // L: 5235
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5236
								}

								var33 = var16.method3563(); // L: 5238
								if (var33 != null) { // L: 5239
									var37 = var33.subWidth; // L: 5240
									var43 = var33.subHeight; // L: 5241
									if (var43 > var42) { // L: 5242
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5243
								}
							}

							Font var78 = var91.getFont(); // L: 5248
							if (var78 == null) { // L: 5249
								var78 = class306.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5250
								var44 = var16.getFont(); // L: 5251
								if (var44 == null) { // L: 5252
									var44 = class306.fontPlain11;
								}
							} else {
								var44 = class306.fontPlain11; // L: 5254
							}

							String var45 = null; // L: 5255
							String var46 = null; // L: 5256
							boolean var47 = false; // L: 5257
							int var48 = 0; // L: 5258
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 5259
							int var93 = var78.stringWidth(var45); // L: 5260
							if (var16 != null) { // L: 5261
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 5262
								var48 = var44.stringWidth(var46); // L: 5263
							}

							int var49 = 0; // L: 5265
							int var50 = 0; // L: 5266
							if (var23 > 0) { // L: 5267
								if (var20 == null && var21 == null) { // L: 5268
									var49 = 1; // L: 5269
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5271 5272
								if (var32 == null && var33 == null) { // L: 5273
									var50 = 1; // L: 5274
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5277
							int var52 = var51; // L: 5278
							if (var22 > 0) { // L: 5279
								var51 += var22;
							}

							var51 += 2; // L: 5280
							int var53 = var51; // L: 5281
							if (var24 > 0) { // L: 5282
								var51 += var24;
							}

							int var54 = var51; // L: 5283
							int var55 = var51; // L: 5284
							int var56;
							if (var23 > 0) { // L: 5285
								var56 = var49 * var23; // L: 5286
								var51 += var56; // L: 5287
								var55 += (var56 - var93) / 2; // L: 5288
							} else {
								var51 += var93; // L: 5291
							}

							var56 = var51; // L: 5293
							if (var25 > 0) { // L: 5294
								var51 += var25;
							}

							int var57 = 0; // L: 5295
							int var58 = 0; // L: 5296
							int var59 = 0; // L: 5297
							int var60 = 0; // L: 5298
							int var61 = 0; // L: 5299
							int var62;
							if (var16 != null) { // L: 5300
								var51 += 2; // L: 5301
								var57 = var51; // L: 5302
								if (var34 > 0) { // L: 5303
									var51 += var34;
								}

								var51 += 2; // L: 5304
								var58 = var51; // L: 5305
								if (var36 > 0) { // L: 5306
									var51 += var36;
								}

								var59 = var51; // L: 5307
								var61 = var51; // L: 5308
								if (var35 > 0) { // L: 5309
									var62 = var35 * var50; // L: 5310
									var51 += var62; // L: 5311
									var61 += (var62 - var48) / 2; // L: 5312
								} else {
									var51 += var48; // L: 5315
								}

								var60 = var51; // L: 5317
								if (var37 > 0) { // L: 5318
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5320
							int var63 = var91.field2015 - var62 * var91.field2015 / var91.field2019; // L: 5321
							int var64 = var62 * var91.field2025 / var91.field2019 + -var91.field2025; // L: 5322
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5323
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5324
							int var67 = var66; // L: 5325
							int var68 = var66 + var42; // L: 5326
							int var69 = var66 + var91.field2031 + 15; // L: 5327
							int var70 = var69 - var78.maxAscent; // L: 5328
							int var71 = var69 + var78.maxDescent; // L: 5329
							if (var70 < var66) { // L: 5330
								var67 = var70;
							}

							if (var71 > var68) { // L: 5331
								var68 = var71;
							}

							int var72 = 0; // L: 5332
							int var73;
							int var74;
							if (var16 != null) { // L: 5333
								var72 = var66 + var16.field2031 + 15; // L: 5334
								var73 = var72 - var44.maxAscent; // L: 5335
								var74 = var72 + var44.maxDescent; // L: 5336
								if (var73 < var67) { // L: 5337
									;
								}

								if (var74 > var68) { // L: 5338
									;
								}
							}

							var73 = 255; // L: 5340
							if (var91.field2026 >= 0) { // L: 5341
								var73 = (var62 << 8) / (var91.field2019 - var91.field2026);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5342
								if (var18 != null) { // L: 5343
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5344
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5345
									for (var74 = 0; var74 < var49; ++var74) { // L: 5346
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 5347
									}
								}

								if (var21 != null) { // L: 5350
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var55 + var65, var69, var91.textColor, 0, var73); // L: 5351
								if (var16 != null) { // L: 5352
									if (var30 != null) { // L: 5353
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5354
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5355
										for (var74 = 0; var74 < var50; ++var74) { // L: 5356
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73); // L: 5357
										}
									}

									if (var33 != null) { // L: 5360
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 5361
								}
							} else {
								if (var18 != null) { // L: 5365
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5366
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5367
									for (var74 = 0; var74 < var49; ++var74) { // L: 5368
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66); // L: 5369
									}
								}

								if (var21 != null) { // L: 5372
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var78.draw(var45, var65 + var55, var69, var91.textColor | -16777216, 0); // L: 5373
								if (var16 != null) { // L: 5374
									if (var30 != null) { // L: 5375
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5376
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5377
										for (var74 = 0; var74 < var50; ++var74) { // L: 5378
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5379
										}
									}

									if (var33 != null) { // L: 5382
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 5383
								}
							}
						}
					}
				}
			}

		}
	} // L: 5388
}
