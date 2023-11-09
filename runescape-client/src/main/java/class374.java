import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class374 {
	@ObfuscatedName("f")
	public char field4411;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1789311753
	)
	public int field4408;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1330423029
	)
	public int field4410;

	class374() {
		this.field4408 = 0; // L: 5
		this.field4410 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	static final void method7187() {
		if (WorldMapSectionType.FriendsChatManager_inFriendsChat) { // L: 4048
			if (class463.friendsChatManager != null) { // L: 4049
				class463.friendsChatManager.sort(); // L: 4050
			}

			PacketBufferNode.method5557(); // L: 4052
			WorldMapSectionType.FriendsChatManager_inFriendsChat = false; // L: 4053
		}

	} // L: 4055

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lcb;IIIIII)V",
		garbageValue = "1942155419"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5176
			if (var0 instanceof NPC) { // L: 5177
				NPCComposition var6 = ((NPC)var0).definition; // L: 5178
				if (var6.transforms != null) { // L: 5179
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5180
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5182
			int[] var7 = Players.Players_indices; // L: 5183
			boolean var8 = var1 < var75; // L: 5184
			int var9 = -2; // L: 5185
			if (var0.overheadText != null && (!var8 || !var0.field1166 && (Client.publicChatMode == 4 || !var0.field1181 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5186 5187
				class31.method468(var0, var0.defaultHeight); // L: 5188
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.field571) { // L: 5189
					Client.overheadTextXOffsets[Client.overheadTextCount] = class19.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5190
					Client.overheadTextAscents[Client.overheadTextCount] = class19.fontBold12.ascent; // L: 5191
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5192
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9; // L: 5193
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1161; // L: 5194
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1185; // L: 5195
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5196
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5197
					++Client.overheadTextCount; // L: 5198
					var9 += 12; // L: 5199
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6900()) { // L: 5203
				class31.method468(var0, var0.defaultHeight + 15); // L: 5204

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5205
					HealthBarUpdate var11 = var10.get(Client.cycle); // L: 5206
					if (var11 == null) { // L: 5207
						if (var10.isEmpty()) { // L: 5265
							var10.remove();
						}
					} else {
						HealthBarDefinition var77 = var10.definition; // L: 5208
						SpritePixels var78 = var77.method3666(); // L: 5209
						SpritePixels var84 = var77.method3675(); // L: 5210
						int var85 = 0; // L: 5212
						if (var78 != null && var84 != null) { // L: 5213
							if (var77.widthPadding * 2 < var84.subWidth) { // L: 5214
								var85 = var77.widthPadding;
							}

							var15 = var84.subWidth - var85 * 2; // L: 5215
						} else {
							var15 = var77.width; // L: 5217
						}

						int var82 = 255; // L: 5218
						boolean var86 = true; // L: 5219
						int var87 = Client.cycle - var11.cycle; // L: 5220
						int var88 = var15 * var11.health2 / var77.width; // L: 5221
						int var89;
						int var105;
						if (var11.cycleOffset > var87) { // L: 5222
							var89 = var77.field1984 == 0 ? 0 : var77.field1984 * (var87 / var77.field1984); // L: 5223
							var22 = var15 * var11.health / var77.width; // L: 5224
							var105 = var89 * (var88 - var22) / var11.cycleOffset + var22; // L: 5225
						} else {
							var105 = var88; // L: 5228
							var89 = var77.int5 + var11.cycleOffset - var87; // L: 5229
							if (var77.int3 >= 0) { // L: 5230
								var82 = (var89 << 8) / (var77.int5 - var77.int3);
							}
						}

						if (var11.health2 > 0 && var105 < 1) { // L: 5232
							var105 = 1;
						}

						if (var78 != null && var84 != null) { // L: 5233
							if (var15 == var105) { // L: 5234
								var105 += var85 * 2;
							} else {
								var105 += var85; // L: 5235
							}

							var89 = var78.subHeight; // L: 5236
							var9 += var89; // L: 5237
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5238
							var23 = var3 + Client.viewportTempY - var9; // L: 5239
							var22 -= var85; // L: 5240
							if (var82 >= 0 && var82 < 255) { // L: 5241
								var78.drawTransAt(var22, var23, var82); // L: 5242
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var105 + var22, var89 + var23); // L: 5243
								var84.drawTransAt(var22, var23, var82); // L: 5244
							} else {
								var78.drawTransBgAt(var22, var23); // L: 5247
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var105 + var22, var23 + var89); // L: 5248
								var84.drawTransBgAt(var22, var23); // L: 5249
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5251
							var9 += 2; // L: 5252
						} else {
							var9 += 5; // L: 5255
							if (Client.viewportTempX > -1) { // L: 5256
								var89 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5257
								var22 = var3 + Client.viewportTempY - var9; // L: 5258
								Rasterizer2D.Rasterizer2D_fillRectangle(var89, var22, var105, 5, 65280); // L: 5259
								Rasterizer2D.Rasterizer2D_fillRectangle(var105 + var89, var22, var15 - var105, 5, 16711680); // L: 5260
							}

							var9 += 2; // L: 5262
						}
					}
				}
			}

			if (var9 == -2) { // L: 5268
				var9 += 7;
			}

			if (var8 && var0.playerCycle == Client.cycle) { // L: 5269
				Player var92 = (Player)var0; // L: 5271
				boolean var76;
				if (Client.drawPlayerNames == 0) { // L: 5273
					var76 = false; // L: 5274
				} else if (var92 == class387.localPlayer) { // L: 5277
					var76 = BuddyRankComparator.method2958(); // L: 5296
				} else {
					boolean var12 = DirectByteArrayCopier.method6408(); // L: 5278
					boolean var13;
					if (!var12) { // L: 5279
						var13 = (Client.drawPlayerNames & 1) != 0; // L: 5282
						var12 = var13 && var92.isFriend(); // L: 5284
					}

					var13 = var12; // L: 5286
					if (!var12) { // L: 5287
						boolean var14 = (Client.drawPlayerNames & 2) != 0; // L: 5290
						var13 = var14 && var92.isFriendsChatMember(); // L: 5292
					}

					var76 = var13; // L: 5294
				}

				if (var76) { // L: 5298
					Player var99 = (Player)var0; // L: 5299
					if (var8) { // L: 5300
						class31.method468(var0, var0.defaultHeight + 15); // L: 5301
						AbstractFont var102 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5302
						var9 += 4; // L: 5303
						var102.drawCentered(var99.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5304
						var9 += 18; // L: 5305
					}
				}
			}

			if (var8) { // L: 5309
				Player var90 = (Player)var0; // L: 5310
				if (var90.isHidden) { // L: 5311
					return;
				}

				if (var90.headIconPk != -1 || var90.headIconPrayer != -1) { // L: 5312
					class31.method468(var0, var0.defaultHeight + 15); // L: 5313
					if (Client.viewportTempX > -1) { // L: 5314
						if (var90.headIconPk != -1) { // L: 5315
							var9 += 25; // L: 5316
							ClanChannel.headIconPkSprites[var90.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5317
						}

						if (var90.headIconPrayer != -1) { // L: 5319
							var9 += 25; // L: 5320
							class367.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5321
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5325
					class31.method468(var0, var0.defaultHeight + 15); // L: 5326
					if (Client.viewportTempX > -1) { // L: 5327
						var9 += WorldMapSectionType.headIconHintSprites[1].subHeight; // L: 5328
						WorldMapSectionType.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5329
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5334
				int[] var93 = var91.method2655(); // L: 5335
				short[] var101 = var91.method2643(); // L: 5336
				if (var101 != null && var93 != null) { // L: 5337
					for (int var95 = 0; var95 < var101.length; ++var95) { // L: 5338
						if (var101[var95] >= 0 && var93[var95] >= 0) { // L: 5339
							long var79 = (long)var93[var95] << 8 | (long)var101[var95]; // L: 5342
							SpritePixels var16 = (SpritePixels)Client.archive5.method7483(var79); // L: 5343
							if (var16 == null) { // L: 5344
								SpritePixels[] var17 = class220.method4629(WorldMapEvent.archive8, var93[var95], 0); // L: 5345
								if (var17 != null && var101[var95] < var17.length) { // L: 5346
									var16 = var17[var101[var95]]; // L: 5347
									Client.archive5.method7484(var79, var16); // L: 5348
								}
							}

							if (var16 != null) { // L: 5351
								class31.method468(var0, var0.defaultHeight + 15); // L: 5352
								if (Client.viewportTempX > -1) { // L: 5353
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5354
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5359
					class31.method468(var0, var0.defaultHeight + 15); // L: 5360
					if (Client.viewportTempX > -1) { // L: 5361
						WorldMapSectionType.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var100 = 0; var100 < 4; ++var100) { // L: 5364
				int var81 = var0.hitSplatCycles[var100]; // L: 5365
				int var94 = var0.hitSplatTypes[var100]; // L: 5366
				HitSplatDefinition var103 = null; // L: 5367
				int var96 = 0; // L: 5368
				if (var94 >= 0) { // L: 5369
					if (var81 <= Client.cycle) { // L: 5370
						continue;
					}

					var103 = ChatChannel.method2224(var0.hitSplatTypes[var100]); // L: 5371
					var96 = var103.field2142; // L: 5372
					if (var103 != null && var103.transforms != null) { // L: 5373
						var103 = var103.transform(); // L: 5374
						if (var103 == null) { // L: 5375
							var0.hitSplatCycles[var100] = -1; // L: 5376
							continue; // L: 5377
						}
					}
				} else if (var81 < 0) { // L: 5381
					continue;
				}

				var15 = var0.hitSplatTypes2[var100]; // L: 5382
				HitSplatDefinition var97 = null; // L: 5383
				if (var15 >= 0) { // L: 5384
					var97 = ChatChannel.method2224(var15); // L: 5385
					if (var97 != null && var97.transforms != null) { // L: 5386
						var97 = var97.transform();
					}
				}

				if (var81 - var96 <= Client.cycle) { // L: 5388
					if (var103 == null) { // L: 5389
						var0.hitSplatCycles[var100] = -1; // L: 5390
					} else {
						class31.method468(var0, var0.defaultHeight / 2); // L: 5393
						if (Client.viewportTempX > -1) { // L: 5394
							boolean var104 = true; // L: 5395
							if (var100 == 1) { // L: 5396
								Client.viewportTempY -= 20; // L: 5397
							}

							if (var100 == 2) { // L: 5399
								Client.viewportTempX -= 15; // L: 5400
								Client.viewportTempY -= 10; // L: 5401
							}

							if (var100 == 3) { // L: 5403
								Client.viewportTempX += 15; // L: 5404
								Client.viewportTempY -= 10; // L: 5405
							}

							SpritePixels var18 = null; // L: 5407
							SpritePixels var19 = null; // L: 5408
							SpritePixels var20 = null; // L: 5409
							SpritePixels var21 = null; // L: 5410
							var22 = 0; // L: 5411
							var23 = 0; // L: 5412
							int var24 = 0; // L: 5413
							int var25 = 0; // L: 5414
							int var26 = 0; // L: 5415
							int var27 = 0; // L: 5416
							int var28 = 0; // L: 5417
							int var29 = 0; // L: 5418
							SpritePixels var30 = null; // L: 5419
							SpritePixels var31 = null; // L: 5420
							SpritePixels var32 = null; // L: 5421
							SpritePixels var33 = null; // L: 5422
							int var34 = 0; // L: 5423
							int var35 = 0; // L: 5424
							int var36 = 0; // L: 5425
							int var37 = 0; // L: 5426
							int var38 = 0; // L: 5427
							int var39 = 0; // L: 5428
							int var40 = 0; // L: 5429
							int var41 = 0; // L: 5430
							int var42 = 0; // L: 5431
							var18 = var103.method3877(); // L: 5432
							int var43;
							if (var18 != null) { // L: 5433
								var22 = var18.subWidth; // L: 5434
								var43 = var18.subHeight; // L: 5435
								if (var43 > var42) { // L: 5436
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5437
							}

							var19 = var103.method3879(); // L: 5439
							if (var19 != null) { // L: 5440
								var23 = var19.subWidth; // L: 5441
								var43 = var19.subHeight; // L: 5442
								if (var43 > var42) { // L: 5443
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5444
							}

							var20 = var103.method3884(); // L: 5446
							if (var20 != null) { // L: 5447
								var24 = var20.subWidth; // L: 5448
								var43 = var20.subHeight; // L: 5449
								if (var43 > var42) { // L: 5450
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5451
							}

							var21 = var103.method3875(); // L: 5453
							if (var21 != null) { // L: 5454
								var25 = var21.subWidth; // L: 5455
								var43 = var21.subHeight; // L: 5456
								if (var43 > var42) { // L: 5457
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5458
							}

							if (var97 != null) { // L: 5460
								var30 = var97.method3877(); // L: 5461
								if (var30 != null) { // L: 5462
									var34 = var30.subWidth; // L: 5463
									var43 = var30.subHeight; // L: 5464
									if (var43 > var42) { // L: 5465
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5466
								}

								var31 = var97.method3879(); // L: 5468
								if (var31 != null) { // L: 5469
									var35 = var31.subWidth; // L: 5470
									var43 = var31.subHeight; // L: 5471
									if (var43 > var42) { // L: 5472
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5473
								}

								var32 = var97.method3884(); // L: 5475
								if (var32 != null) { // L: 5476
									var36 = var32.subWidth; // L: 5477
									var43 = var32.subHeight; // L: 5478
									if (var43 > var42) { // L: 5479
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5480
								}

								var33 = var97.method3875(); // L: 5482
								if (var33 != null) { // L: 5483
									var37 = var33.subWidth; // L: 5484
									var43 = var33.subHeight; // L: 5485
									if (var43 > var42) { // L: 5486
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5487
								}
							}

							Font var83 = var103.getFont(); // L: 5492
							if (var83 == null) { // L: 5493
								var83 = class276.fontPlain11;
							}

							Font var44;
							if (var97 != null) { // L: 5494
								var44 = var97.getFont(); // L: 5495
								if (var44 == null) { // L: 5496
									var44 = class276.fontPlain11;
								}
							} else {
								var44 = class276.fontPlain11; // L: 5498
							}

							String var45 = null; // L: 5499
							String var46 = null; // L: 5500
							boolean var47 = false; // L: 5501
							int var48 = 0; // L: 5502
							var45 = var103.getString(var0.hitSplatValues[var100]); // L: 5503
							int var98 = var83.stringWidth(var45); // L: 5504
							if (var97 != null) { // L: 5505
								var46 = var97.getString(var0.hitSplatValues2[var100]); // L: 5506
								var48 = var44.stringWidth(var46); // L: 5507
							}

							int var49 = 0; // L: 5509
							int var50 = 0; // L: 5510
							if (var23 > 0) { // L: 5511
								if (var20 == null && var21 == null) { // L: 5512
									var49 = 1; // L: 5513
								} else {
									var49 = var98 / var23 + 1;
								}
							}

							if (var97 != null && var35 > 0) { // L: 5515 5516
								if (var32 == null && var33 == null) { // L: 5517
									var50 = 1; // L: 5518
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5521
							int var52 = var51; // L: 5522
							if (var22 > 0) { // L: 5523
								var51 += var22;
							}

							var51 += 2; // L: 5524
							int var53 = var51; // L: 5525
							if (var24 > 0) { // L: 5526
								var51 += var24;
							}

							int var54 = var51; // L: 5527
							int var55 = var51; // L: 5528
							int var56;
							if (var23 > 0) { // L: 5529
								var56 = var49 * var23; // L: 5530
								var51 += var56; // L: 5531
								var55 += (var56 - var98) / 2; // L: 5532
							} else {
								var51 += var98; // L: 5535
							}

							var56 = var51; // L: 5537
							if (var25 > 0) { // L: 5538
								var51 += var25;
							}

							int var57 = 0; // L: 5539
							int var58 = 0; // L: 5540
							int var59 = 0; // L: 5541
							int var60 = 0; // L: 5542
							int var61 = 0; // L: 5543
							int var62;
							if (var97 != null) { // L: 5544
								var51 += 2; // L: 5545
								var57 = var51; // L: 5546
								if (var34 > 0) { // L: 5547
									var51 += var34;
								}

								var51 += 2; // L: 5548
								var58 = var51; // L: 5549
								if (var36 > 0) { // L: 5550
									var51 += var36;
								}

								var59 = var51; // L: 5551
								var61 = var51; // L: 5552
								if (var35 > 0) { // L: 5553
									var62 = var35 * var50; // L: 5554
									var51 += var62; // L: 5555
									var61 += (var62 - var48) / 2; // L: 5556
								} else {
									var51 += var48; // L: 5559
								}

								var60 = var51; // L: 5561
								if (var37 > 0) { // L: 5562
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var100] - Client.cycle; // L: 5564
							int var63 = var103.field2141 - var62 * var103.field2141 / var103.field2142; // L: 5565
							int var64 = var62 * var103.field2148 / var103.field2142 + -var103.field2148; // L: 5566
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5567
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5568
							int var67 = var66; // L: 5569
							int var68 = var66 + var42; // L: 5570
							int var69 = var66 + var103.field2146 + 15; // L: 5571
							int var70 = var69 - var83.maxAscent; // L: 5572
							int var71 = var69 + var83.maxDescent; // L: 5573
							if (var70 < var66) { // L: 5574
								var67 = var70;
							}

							if (var71 > var68) { // L: 5575
								var68 = var71;
							}

							int var72 = 0; // L: 5576
							int var73;
							int var74;
							if (var97 != null) { // L: 5577
								var72 = var66 + var97.field2146 + 15; // L: 5578
								var73 = var72 - var44.maxAscent; // L: 5579
								var74 = var72 + var44.maxDescent; // L: 5580
								if (var73 < var67) { // L: 5581
									;
								}

								if (var74 > var68) { // L: 5582
									;
								}
							}

							var73 = 255; // L: 5584
							if (var103.field2143 >= 0) { // L: 5585
								var73 = (var62 << 8) / (var103.field2142 - var103.field2143);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5586
								if (var18 != null) { // L: 5587
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5588
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5589
									for (var74 = 0; var74 < var49; ++var74) { // L: 5590
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 5591
									}
								}

								if (var21 != null) { // L: 5594
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var83.drawAlpha(var45, var65 + var55, var69, var103.textColor, 0, var73); // L: 5595
								if (var97 != null) { // L: 5596
									if (var30 != null) { // L: 5597
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5598
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5599
										for (var74 = 0; var74 < var50; ++var74) { // L: 5600
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5601
										}
									}

									if (var33 != null) { // L: 5604
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var97.textColor, 0, var73); // L: 5605
								}
							} else {
								if (var18 != null) { // L: 5609
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5610
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5611
									for (var74 = 0; var74 < var49; ++var74) { // L: 5612
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66); // L: 5613
									}
								}

								if (var21 != null) { // L: 5616
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var83.draw(var45, var65 + var55, var69, var103.textColor | -16777216, 0); // L: 5617
								if (var97 != null) { // L: 5618
									if (var30 != null) { // L: 5619
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5620
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5621
										for (var74 = 0; var74 < var50; ++var74) { // L: 5622
											var31.drawTransBgAt(var74 * var35 + (var59 + var65 - var39), var66); // L: 5623
										}
									}

									if (var33 != null) { // L: 5626
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var97.textColor | -16777216, 0); // L: 5627
								}
							}
						}
					}
				}
			}

		}
	} // L: 5632

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "([Lkz;IIIZI)V",
		garbageValue = "2029451863"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11453
			Widget var6 = var0[var5]; // L: 11454
			if (var6 != null && var6.parentId == var1) { // L: 11455 11456
				Client.alignWidgetSize(var6, var2, var3, var4); // L: 11457
				Client.alignWidgetPosition(var6, var2, var3); // L: 11458
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11459
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11460
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 11461
				}

				if (var6.scrollY < 0) { // L: 11462
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11463
					AbstractWorldMapData.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11465
}
