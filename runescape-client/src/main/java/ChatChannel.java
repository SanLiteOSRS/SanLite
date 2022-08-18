import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bw")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1544977785
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 86
	} // L: 89

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbd;",
		garbageValue = "-1539024033"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 92

		for (int var6 = this.count; var6 > 0; --var6) { // L: 93
			if (var6 != 100) { // L: 94
				this.messages[var6] = this.messages[var6 - 1]; // L: 95
			}
		}

		if (var5 == null) { // L: 97
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 99
			var5.removeDual(); // L: 100
			var5.set(var1, var2, var4, var3); // L: 101
		}

		this.messages[0] = var5; // L: 103
		if (this.count < 100) { // L: 104
			++this.count;
		}

		return var5; // L: 105
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lbd;",
		garbageValue = "678592769"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 109 110
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1952695024"
	)
	@Export("size")
	int size() {
		return this.count; // L: 114
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "42"
	)
	public static int method2060(int var0) {
		return class402.field4457[var0 & 16383]; // L: 33
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "76"
	)
	static final void method2056(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 154
			for (int var4 = 0; var4 < 8; ++var4) { // L: 155
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 157
			for (var3 = 1; var3 < 8; ++var3) { // L: 158
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 160
			for (var3 = 1; var3 < 8; ++var3) { // L: 161
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 165
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 166

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "112"
	)
	static int method2058(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3830
			Client.logoutTimer = 250; // L: 3831
			return 1; // L: 3832
		} else if (var0 != 5631 && var0 != 5633) { // L: 3834
			if (var0 == 5632) { // L: 3838
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 26; // L: 3839
				return 1; // L: 3840
			} else {
				return 2; // L: 3842
			}
		} else {
			GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3835
			return 1; // L: 3836
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lcz;B)Z",
		garbageValue = "-73"
	)
	static boolean method2057(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5127
			return false;
		} else if (class28.localPlayer != var0) { // L: 5128
			boolean var1 = (Client.drawPlayerNames & 4) != 0; // L: 5131
			boolean var2 = var1; // L: 5133
			boolean var3;
			if (!var1) { // L: 5134
				var3 = (Client.drawPlayerNames & 1) != 0; // L: 5137
				var2 = var3 && var0.isFriend(); // L: 5139
			}

			var3 = var2; // L: 5141
			if (!var2) { // L: 5142
				boolean var4 = (Client.drawPlayerNames & 2) != 0; // L: 5145
				var3 = var4 && var0.isFriendsChatMember(); // L: 5147
			}

			return var3; // L: 5149
		} else {
			return class306.method5766(); // L: 5151
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIIIII)V",
		garbageValue = "-2052471165"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5155
			if (var0 instanceof NPC) { // L: 5156
				NPCComposition var6 = ((NPC)var0).definition; // L: 5157
				if (var6.transforms != null) { // L: 5158
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5159
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5161
			int[] var7 = Players.Players_indices; // L: 5162
			byte var8 = 0; // L: 5163
			if (var1 < var75 && var0.playerCycle == Client.cycle && method2057((Player)var0)) { // L: 5164
				Player var9 = (Player)var0; // L: 5165
				if (var1 < var75) { // L: 5166
					ObjectSound.method1776(var0, var0.defaultHeight + 15); // L: 5167
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5168
					byte var11 = 9; // L: 5169
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 5170
					var8 = 18; // L: 5171
				}
			}

			int var76 = -2; // L: 5174
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6165()) { // L: 5175
				ObjectSound.method1776(var0, var0.defaultHeight + 15); // L: 5176

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 5177
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 5178
					if (var79 == null) { // L: 5179
						if (var87.isEmpty()) { // L: 5237
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 5180
						SpritePixels var13 = var80.getBackSprite(); // L: 5181
						SpritePixels var81 = var80.getFrontSprite(); // L: 5182
						int var82 = 0; // L: 5184
						if (var13 != null && var81 != null) { // L: 5185
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 5186
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 5187
						} else {
							var15 = var80.width; // L: 5189
						}

						int var17 = 255; // L: 5190
						boolean var83 = true; // L: 5191
						int var84 = Client.cycle - var79.cycle; // L: 5192
						int var85 = var15 * var79.health2 / var80.width; // L: 5193
						int var86;
						int var94;
						if (var79.cycleOffset > var84) { // L: 5194
							var86 = var80.field1872 == 0 ? 0 : var80.field1872 * (var84 / var80.field1872); // L: 5195
							var22 = var15 * var79.health / var80.width; // L: 5196
							var94 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 5197
						} else {
							var94 = var85; // L: 5200
							var86 = var79.cycleOffset + var80.int5 - var84; // L: 5201
							if (var80.int3 >= 0) { // L: 5202
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var94 < 1) { // L: 5204
							var94 = 1;
						}

						if (var13 != null && var81 != null) { // L: 5205
							if (var94 == var15) { // L: 5206
								var94 += var82 * 2;
							} else {
								var94 += var82; // L: 5207
							}

							var86 = var13.subHeight; // L: 5208
							var76 += var86; // L: 5209
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5210
							var23 = var3 + Client.viewportTempY - var76; // L: 5211
							var22 -= var82; // L: 5212
							if (var17 >= 0 && var17 < 255) { // L: 5213
								var13.drawTransAt(var22, var23, var17); // L: 5214
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var94, var23 + var86); // L: 5215
								var81.drawTransAt(var22, var23, var17); // L: 5216
							} else {
								var13.drawTransBgAt(var22, var23); // L: 5219
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var94 + var22, var86 + var23); // L: 5220
								var81.drawTransBgAt(var22, var23); // L: 5221
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5223
							var76 += 2; // L: 5224
						} else {
							var76 += 5; // L: 5227
							if (Client.viewportTempX > -1) { // L: 5228
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5229
								var22 = var3 + Client.viewportTempY - var76; // L: 5230
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var94, 5, 65280); // L: 5231
								Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var94, var22, var15 - var94, 5, 16711680); // L: 5232
							}

							var76 += 2; // L: 5234
						}
					}
				}
			}

			if (var76 == -2) { // L: 5240
				var76 += 7;
			}

			var76 += var8; // L: 5241
			if (var1 < var75) { // L: 5242
				Player var88 = (Player)var0; // L: 5243
				if (var88.isHidden) { // L: 5244
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 5245
					ObjectSound.method1776(var0, var0.defaultHeight + 15); // L: 5246
					if (Client.viewportTempX > -1) { // L: 5247
						if (var88.headIconPk != -1) { // L: 5248
							var76 += 25; // L: 5249
							class11.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5250
						}

						if (var88.headIconPrayer != -1) { // L: 5252
							var76 += 25; // L: 5253
							DirectByteArrayCopier.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5254
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5258
					ObjectSound.method1776(var0, var0.defaultHeight + 15); // L: 5259
					if (Client.viewportTempX > -1) { // L: 5260
						var76 += class92.headIconHintSprites[1].subHeight; // L: 5261
						class92.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5262
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 5267
				if (var89.transforms != null) { // L: 5268
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < DirectByteArrayCopier.headIconPrayerSprites.length) { // L: 5269
					ObjectSound.method1776(var0, var0.defaultHeight + 15); // L: 5270
					if (Client.viewportTempX > -1) { // L: 5271
						DirectByteArrayCopier.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5272
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5275
					ObjectSound.method1776(var0, var0.defaultHeight + 15); // L: 5276
					if (Client.viewportTempX > -1) { // L: 5277
						class92.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1151 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5280 5281
				ObjectSound.method1776(var0, var0.defaultHeight); // L: 5282
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5283
					Client.overheadTextXOffsets[Client.overheadTextCount] = class116.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5284
					Client.overheadTextAscents[Client.overheadTextCount] = class116.fontBold12.ascent; // L: 5285
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5286
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5287
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5288
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5289
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5290
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5291
					++Client.overheadTextCount; // L: 5292
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 5296
				int var90 = var0.hitSplatCycles[var77]; // L: 5297
				int var12 = var0.hitSplatTypes[var77]; // L: 5298
				HitSplatDefinition var91 = null; // L: 5299
				int var14 = 0; // L: 5300
				if (var12 >= 0) { // L: 5301
					if (var90 <= Client.cycle) { // L: 5302
						continue;
					}

					var91 = GrandExchangeOfferOwnWorldComparator.method1095(var0.hitSplatTypes[var77]); // L: 5303
					var14 = var91.field2014; // L: 5304
					if (var91 != null && var91.transforms != null) { // L: 5305
						var91 = var91.transform(); // L: 5306
						if (var91 == null) { // L: 5307
							var0.hitSplatCycles[var77] = -1; // L: 5308
							continue; // L: 5309
						}
					}
				} else if (var90 < 0) { // L: 5313
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 5314
				HitSplatDefinition var16 = null; // L: 5315
				if (var15 >= 0) { // L: 5316
					var16 = GrandExchangeOfferOwnWorldComparator.method1095(var15); // L: 5317
					if (var16 != null && var16.transforms != null) { // L: 5318
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 5320
					if (var91 == null) { // L: 5321
						var0.hitSplatCycles[var77] = -1; // L: 5322
					} else {
						ObjectSound.method1776(var0, var0.defaultHeight / 2); // L: 5325
						if (Client.viewportTempX > -1) { // L: 5326
							boolean var92 = true; // L: 5327
							if (var77 == 1) { // L: 5328
								Client.viewportTempY -= 20; // L: 5329
							}

							if (var77 == 2) { // L: 5331
								Client.viewportTempX -= 15; // L: 5332
								Client.viewportTempY -= 10; // L: 5333
							}

							if (var77 == 3) { // L: 5335
								Client.viewportTempX += 15; // L: 5336
								Client.viewportTempY -= 10; // L: 5337
							}

							SpritePixels var18 = null; // L: 5339
							SpritePixels var19 = null; // L: 5340
							SpritePixels var20 = null; // L: 5341
							SpritePixels var21 = null; // L: 5342
							var22 = 0; // L: 5343
							var23 = 0; // L: 5344
							int var24 = 0; // L: 5345
							int var25 = 0; // L: 5346
							int var26 = 0; // L: 5347
							int var27 = 0; // L: 5348
							int var28 = 0; // L: 5349
							int var29 = 0; // L: 5350
							SpritePixels var30 = null; // L: 5351
							SpritePixels var31 = null; // L: 5352
							SpritePixels var32 = null; // L: 5353
							SpritePixels var33 = null; // L: 5354
							int var34 = 0; // L: 5355
							int var35 = 0; // L: 5356
							int var36 = 0; // L: 5357
							int var37 = 0; // L: 5358
							int var38 = 0; // L: 5359
							int var39 = 0; // L: 5360
							int var40 = 0; // L: 5361
							int var41 = 0; // L: 5362
							int var42 = 0; // L: 5363
							var18 = var91.method3630(); // L: 5364
							int var43;
							if (var18 != null) { // L: 5365
								var22 = var18.subWidth; // L: 5366
								var43 = var18.subHeight; // L: 5367
								if (var43 > var42) { // L: 5368
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5369
							}

							var19 = var91.method3607(); // L: 5371
							if (var19 != null) { // L: 5372
								var23 = var19.subWidth; // L: 5373
								var43 = var19.subHeight; // L: 5374
								if (var43 > var42) { // L: 5375
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5376
							}

							var20 = var91.method3608(); // L: 5378
							if (var20 != null) { // L: 5379
								var24 = var20.subWidth; // L: 5380
								var43 = var20.subHeight; // L: 5381
								if (var43 > var42) { // L: 5382
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5383
							}

							var21 = var91.method3609(); // L: 5385
							if (var21 != null) { // L: 5386
								var25 = var21.subWidth; // L: 5387
								var43 = var21.subHeight; // L: 5388
								if (var43 > var42) { // L: 5389
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5390
							}

							if (var16 != null) { // L: 5392
								var30 = var16.method3630(); // L: 5393
								if (var30 != null) { // L: 5394
									var34 = var30.subWidth; // L: 5395
									var43 = var30.subHeight; // L: 5396
									if (var43 > var42) { // L: 5397
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5398
								}

								var31 = var16.method3607(); // L: 5400
								if (var31 != null) { // L: 5401
									var35 = var31.subWidth; // L: 5402
									var43 = var31.subHeight; // L: 5403
									if (var43 > var42) { // L: 5404
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5405
								}

								var32 = var16.method3608(); // L: 5407
								if (var32 != null) { // L: 5408
									var36 = var32.subWidth; // L: 5409
									var43 = var32.subHeight; // L: 5410
									if (var43 > var42) { // L: 5411
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5412
								}

								var33 = var16.method3609(); // L: 5414
								if (var33 != null) { // L: 5415
									var37 = var33.subWidth; // L: 5416
									var43 = var33.subHeight; // L: 5417
									if (var43 > var42) { // L: 5418
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5419
								}
							}

							Font var78 = var91.getFont(); // L: 5424
							if (var78 == null) { // L: 5425
								var78 = class116.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5426
								var44 = var16.getFont(); // L: 5427
								if (var44 == null) { // L: 5428
									var44 = class116.fontPlain11;
								}
							} else {
								var44 = class116.fontPlain11; // L: 5430
							}

							String var45 = null; // L: 5431
							String var46 = null; // L: 5432
							boolean var47 = false; // L: 5433
							int var48 = 0; // L: 5434
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 5435
							int var93 = var78.stringWidth(var45); // L: 5436
							if (var16 != null) { // L: 5437
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 5438
								var48 = var44.stringWidth(var46); // L: 5439
							}

							int var49 = 0; // L: 5441
							int var50 = 0; // L: 5442
							if (var23 > 0) { // L: 5443
								if (var20 == null && var21 == null) { // L: 5444
									var49 = 1; // L: 5445
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5447 5448
								if (var32 == null && var33 == null) { // L: 5449
									var50 = 1; // L: 5450
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5453
							int var52 = var51; // L: 5454
							if (var22 > 0) { // L: 5455
								var51 += var22;
							}

							var51 += 2; // L: 5456
							int var53 = var51; // L: 5457
							if (var24 > 0) { // L: 5458
								var51 += var24;
							}

							int var54 = var51; // L: 5459
							int var55 = var51; // L: 5460
							int var56;
							if (var23 > 0) { // L: 5461
								var56 = var23 * var49; // L: 5462
								var51 += var56; // L: 5463
								var55 += (var56 - var93) / 2; // L: 5464
							} else {
								var51 += var93; // L: 5467
							}

							var56 = var51; // L: 5469
							if (var25 > 0) { // L: 5470
								var51 += var25;
							}

							int var57 = 0; // L: 5471
							int var58 = 0; // L: 5472
							int var59 = 0; // L: 5473
							int var60 = 0; // L: 5474
							int var61 = 0; // L: 5475
							int var62;
							if (var16 != null) { // L: 5476
								var51 += 2; // L: 5477
								var57 = var51; // L: 5478
								if (var34 > 0) { // L: 5479
									var51 += var34;
								}

								var51 += 2; // L: 5480
								var58 = var51; // L: 5481
								if (var36 > 0) { // L: 5482
									var51 += var36;
								}

								var59 = var51; // L: 5483
								var61 = var51; // L: 5484
								if (var35 > 0) { // L: 5485
									var62 = var50 * var35; // L: 5486
									var51 += var62; // L: 5487
									var61 += (var62 - var48) / 2; // L: 5488
								} else {
									var51 += var48; // L: 5491
								}

								var60 = var51; // L: 5493
								if (var37 > 0) { // L: 5494
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5496
							int var63 = var91.field2019 - var62 * var91.field2019 / var91.field2014; // L: 5497
							int var64 = var62 * var91.field2021 / var91.field2014 + -var91.field2021; // L: 5498
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5499
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5500
							int var67 = var66; // L: 5501
							int var68 = var66 + var42; // L: 5502
							int var69 = var66 + var91.field2024 + 15; // L: 5503
							int var70 = var69 - var78.maxAscent; // L: 5504
							int var71 = var69 + var78.maxDescent; // L: 5505
							if (var70 < var66) { // L: 5506
								var67 = var70;
							}

							if (var71 > var68) { // L: 5507
								var68 = var71;
							}

							int var72 = 0; // L: 5508
							int var73;
							int var74;
							if (var16 != null) { // L: 5509
								var72 = var66 + var16.field2024 + 15; // L: 5510
								var73 = var72 - var44.maxAscent; // L: 5511
								var74 = var72 + var44.maxDescent; // L: 5512
								if (var73 < var67) { // L: 5513
									;
								}

								if (var74 > var68) { // L: 5514
									;
								}
							}

							var73 = 255; // L: 5516
							if (var91.field2025 >= 0) { // L: 5517
								var73 = (var62 << 8) / (var91.field2014 - var91.field2025);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5518
								if (var18 != null) { // L: 5519
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5520
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5521
									for (var74 = 0; var74 < var49; ++var74) { // L: 5522
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 5523
									}
								}

								if (var21 != null) { // L: 5526
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var65 + var55, var69, var91.textColor, 0, var73); // L: 5527
								if (var16 != null) { // L: 5528
									if (var30 != null) { // L: 5529
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5530
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5531
										for (var74 = 0; var74 < var50; ++var74) { // L: 5532
											var31.drawTransAt(var35 * var74 + (var65 + var59 - var39), var66, var73); // L: 5533
										}
									}

									if (var33 != null) { // L: 5536
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var16.textColor, 0, var73); // L: 5537
								}
							} else {
								if (var18 != null) { // L: 5541
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5542
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5543
									for (var74 = 0; var74 < var49; ++var74) { // L: 5544
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66); // L: 5545
									}
								}

								if (var21 != null) { // L: 5548
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var78.draw(var45, var65 + var55, var69, var91.textColor | -16777216, 0); // L: 5549
								if (var16 != null) { // L: 5550
									if (var30 != null) { // L: 5551
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5552
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5553
										for (var74 = 0; var74 < var50; ++var74) { // L: 5554
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66); // L: 5555
										}
									}

									if (var33 != null) { // L: 5558
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 5559
								}
							}
						}
					}
				}
			}

		}
	} // L: 5564
}
