import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class171 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static EvictingDualNodeHashTable field1802;

	static {
		field1802 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIIIIS)V",
		garbageValue = "-15628"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5192
			if (var0 instanceof NPC) { // L: 5193
				NPCComposition var6 = ((NPC)var0).definition; // L: 5194
				if (var6.transforms != null) { // L: 5195
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5196
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5198
			int[] var7 = Players.Players_indices; // L: 5199
			boolean var8 = var1 < var75; // L: 5200
			int var9 = -2; // L: 5201
			if (var0.field1225 != null && (!var8 || !var0.field1174 && (Client.publicChatMode == 4 || !var0.field1206 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2388())))) { // L: 5202 5203
				Canvas.method331(var0, var0.defaultHeight); // L: 5204
				if (Client.viewportTempX > -1 && Client.field780 < Client.field746) { // L: 5205
					Client.field594[Client.field780] = GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth(var0.field1225) / 2; // L: 5206
					Client.field734[Client.field780] = GrandExchangeOfferTotalQuantityComparator.fontBold12.ascent; // L: 5207
					Client.field591[Client.field780] = Client.viewportTempX; // L: 5208
					Client.field592[Client.field780] = Client.viewportTempY - var9; // L: 5209
					Client.field721[Client.field780] = var0.field1196; // L: 5210
					Client.field596[Client.field780] = var0.field1197; // L: 5211
					Client.field598[Client.field780] = var0.field1195; // L: 5212
					Client.field597[Client.field780] = var0.field1236; // L: 5213
					Client.field599[Client.field780] = var0.field1225; // L: 5214
					++Client.field780; // L: 5215
					var9 += 12; // L: 5216
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7350()) { // L: 5220
				Canvas.method331(var0, var0.defaultHeight + 15); // L: 5221

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5222
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5223
					if (var11 == null) { // L: 5224
						if (var10.isEmpty()) { // L: 5282
							var10.remove();
						}
					} else {
						HealthBarDefinition var77 = var10.definition; // L: 5225
						SpritePixels var78 = var77.method3635(); // L: 5226
						SpritePixels var84 = var77.method3634(); // L: 5227
						int var85 = 0; // L: 5229
						if (var78 != null && var84 != null) { // L: 5230
							if (var77.widthPadding * 2 < var84.subWidth) { // L: 5231
								var85 = var77.widthPadding;
							}

							var15 = var84.subWidth - var85 * 2; // L: 5232
						} else {
							var15 = var77.width; // L: 5234
						}

						int var82 = 255; // L: 5235
						boolean var86 = true; // L: 5236
						int var87 = Client.cycle - var11.cycle; // L: 5237
						int var88 = var15 * var11.health2 / var77.width; // L: 5238
						int var89;
						int var105;
						if (var11.cycleOffset > var87) { // L: 5239
							var89 = var77.field1874 == 0 ? 0 : var77.field1874 * (var87 / var77.field1874); // L: 5240
							var22 = var15 * var11.health / var77.width; // L: 5241
							var105 = var89 * (var88 - var22) / var11.cycleOffset + var22; // L: 5242
						} else {
							var105 = var88; // L: 5245
							var89 = var77.int5 + var11.cycleOffset - var87; // L: 5246
							if (var77.int3 >= 0) { // L: 5247
								var82 = (var89 << 8) / (var77.int5 - var77.int3);
							}
						}

						if (var11.health2 > 0 && var105 < 1) { // L: 5249
							var105 = 1;
						}

						if (var78 != null && var84 != null) { // L: 5250
							if (var105 == var15) { // L: 5251
								var105 += var85 * 2;
							} else {
								var105 += var85; // L: 5252
							}

							var89 = var78.subHeight; // L: 5253
							var9 += var89; // L: 5254
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5255
							var23 = var3 + Client.viewportTempY - var9; // L: 5256
							var22 -= var85; // L: 5257
							if (var82 >= 0 && var82 < 255) { // L: 5258
								var78.drawTransAt(var22, var23, var82); // L: 5259
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var105 + var22, var23 + var89); // L: 5260
								var84.drawTransAt(var22, var23, var82); // L: 5261
							} else {
								var78.drawTransBgAt(var22, var23); // L: 5264
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var105 + var22, var23 + var89); // L: 5265
								var84.drawTransBgAt(var22, var23); // L: 5266
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5268
							var9 += 2; // L: 5269
						} else {
							var9 += 5; // L: 5272
							if (Client.viewportTempX > -1) { // L: 5273
								var89 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5274
								var22 = var3 + Client.viewportTempY - var9; // L: 5275
								Rasterizer2D.Rasterizer2D_fillRectangle(var89, var22, var105, 5, 65280); // L: 5276
								Rasterizer2D.Rasterizer2D_fillRectangle(var105 + var89, var22, var15 - var105, 5, 16711680); // L: 5277
							}

							var9 += 2; // L: 5279
						}
					}
				}
			}

			if (var9 == -2) { // L: 5285
				var9 += 7;
			}

			if (var8 && var0.playerCycle == Client.cycle) { // L: 5286
				Player var92 = (Player)var0; // L: 5288
				boolean var76;
				if (Client.drawPlayerNames == 0) { // L: 5290
					var76 = false; // L: 5291
				} else if (var92 != class229.localPlayer) { // L: 5294
					boolean var12 = (Client.drawPlayerNames & 4) != 0; // L: 5297
					boolean var13 = var12 || AbstractByteArrayCopier.method6822() && var92.method2388(); // L: 5299
					if (!var13) { // L: 5300
						boolean var14 = (Client.drawPlayerNames & 2) != 0; // L: 5303
						var13 = var14 && var92.method2391(); // L: 5305
					}

					var76 = var13; // L: 5307
				} else {
					var76 = Projectile.method2209(); // L: 5309
				}

				if (var76) { // L: 5311
					Player var99 = (Player)var0; // L: 5312
					if (var8) { // L: 5313
						Canvas.method331(var0, var0.defaultHeight + 15); // L: 5314
						AbstractFont var102 = (AbstractFont)Client.field633.get(FontName.FontName_plain12); // L: 5315
						var9 += 4; // L: 5316
						var102.drawCentered(var99.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5317
						var9 += 18; // L: 5318
					}
				}
			}

			if (var8) { // L: 5322
				Player var90 = (Player)var0; // L: 5323
				if (var90.isHidden) { // L: 5324
					return;
				}

				if (var90.headIconPk != -1 || var90.headIconPrayer != -1) { // L: 5325
					Canvas.method331(var0, var0.defaultHeight + 15); // L: 5326
					if (Client.viewportTempX > -1) { // L: 5327
						if (var90.headIconPk != -1) { // L: 5328
							var9 += 25; // L: 5329
							UrlRequest.field1434[var90.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5330
						}

						if (var90.headIconPrayer != -1) { // L: 5332
							var9 += 25; // L: 5333
							AbstractByteArrayCopier.field3816[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5334
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.field508) { // L: 5338
					Canvas.method331(var0, var0.defaultHeight + 15); // L: 5339
					if (Client.viewportTempX > -1) { // L: 5340
						var9 += class60.field420[1].subHeight; // L: 5341
						class60.field420[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5342
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5347
				int[] var93 = var91.method2701(); // L: 5348
				short[] var101 = var91.method2667(); // L: 5349
				if (var101 != null && var93 != null) { // L: 5350
					for (int var95 = 0; var95 < var101.length; ++var95) { // L: 5351
						if (var101[var95] >= 0 && var93[var95] >= 0) { // L: 5352
							long var79 = (long)var93[var95] << 8 | (long)var101[var95]; // L: 5355
							SpritePixels var16 = (SpritePixels)Client.field779.method8022(var79); // L: 5356
							if (var16 == null) { // L: 5357
								SpritePixels[] var17 = VertexNormal.method5702(GrandExchangeOfferOwnWorldComparator.field481, var93[var95], 0); // L: 5358
								if (var17 != null && var101[var95] < var17.length) { // L: 5359
									var16 = var17[var101[var95]]; // L: 5360
									Client.field779.method8037(var79, var16); // L: 5361
								}
							}

							if (var16 != null) { // L: 5364
								Canvas.method331(var0, var0.defaultHeight + 15); // L: 5365
								if (Client.viewportTempX > -1) { // L: 5366
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5367
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.field507 && Client.cycle % 20 < 10) { // L: 5372
					Canvas.method331(var0, var0.defaultHeight + 15); // L: 5373
					if (Client.viewportTempX > -1) { // L: 5374
						class60.field420[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var100 = 0; var100 < 4; ++var100) { // L: 5377
				int var81 = var0.hitSplatCycles[var100]; // L: 5378
				int var94 = var0.hitSplatTypes[var100]; // L: 5379
				HitSplatDefinition var103 = null; // L: 5380
				int var96 = 0; // L: 5381
				if (var94 >= 0) { // L: 5382
					if (var81 <= Client.cycle) { // L: 5383
						continue;
					}

					var103 = class149.method3275(var0.hitSplatTypes[var100]); // L: 5384
					var96 = var103.field2060; // L: 5385
					if (var103 != null && var103.transforms != null) { // L: 5386
						var103 = var103.transform(); // L: 5387
						if (var103 == null) { // L: 5388
							var0.hitSplatCycles[var100] = -1; // L: 5389
							continue; // L: 5390
						}
					}
				} else if (var81 < 0) { // L: 5394
					continue;
				}

				var15 = var0.hitSplatTypes2[var100]; // L: 5395
				HitSplatDefinition var97 = null; // L: 5396
				if (var15 >= 0) { // L: 5397
					var97 = class149.method3275(var15); // L: 5398
					if (var97 != null && var97.transforms != null) { // L: 5399
						var97 = var97.transform();
					}
				}

				if (var81 - var96 <= Client.cycle) { // L: 5401
					if (var103 == null) { // L: 5402
						var0.hitSplatCycles[var100] = -1; // L: 5403
					} else {
						Canvas.method331(var0, var0.defaultHeight / 2); // L: 5406
						if (Client.viewportTempX > -1) { // L: 5407
							boolean var104 = true; // L: 5408
							if (var100 == 1) { // L: 5409
								Client.viewportTempY -= 20; // L: 5410
							}

							if (var100 == 2) { // L: 5412
								Client.viewportTempX -= 15; // L: 5413
								Client.viewportTempY -= 10; // L: 5414
							}

							if (var100 == 3) { // L: 5416
								Client.viewportTempX += 15; // L: 5417
								Client.viewportTempY -= 10; // L: 5418
							}

							SpritePixels var18 = null; // L: 5420
							SpritePixels var19 = null; // L: 5421
							SpritePixels var20 = null; // L: 5422
							SpritePixels var21 = null; // L: 5423
							var22 = 0; // L: 5424
							var23 = 0; // L: 5425
							int var24 = 0; // L: 5426
							int var25 = 0; // L: 5427
							int var26 = 0; // L: 5428
							int var27 = 0; // L: 5429
							int var28 = 0; // L: 5430
							int var29 = 0; // L: 5431
							SpritePixels var30 = null; // L: 5432
							SpritePixels var31 = null; // L: 5433
							SpritePixels var32 = null; // L: 5434
							SpritePixels var33 = null; // L: 5435
							int var34 = 0; // L: 5436
							int var35 = 0; // L: 5437
							int var36 = 0; // L: 5438
							int var37 = 0; // L: 5439
							int var38 = 0; // L: 5440
							int var39 = 0; // L: 5441
							int var40 = 0; // L: 5442
							int var41 = 0; // L: 5443
							int var42 = 0; // L: 5444
							var18 = var103.method3860(); // L: 5445
							int var43;
							if (var18 != null) { // L: 5446
								var22 = var18.subWidth; // L: 5447
								var43 = var18.subHeight; // L: 5448
								if (var43 > var42) { // L: 5449
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5450
							}

							var19 = var103.method3856(); // L: 5452
							if (var19 != null) { // L: 5453
								var23 = var19.subWidth; // L: 5454
								var43 = var19.subHeight; // L: 5455
								if (var43 > var42) { // L: 5456
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5457
							}

							var20 = var103.method3857(); // L: 5459
							if (var20 != null) { // L: 5460
								var24 = var20.subWidth; // L: 5461
								var43 = var20.subHeight; // L: 5462
								if (var43 > var42) { // L: 5463
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5464
							}

							var21 = var103.method3865(); // L: 5466
							if (var21 != null) { // L: 5467
								var25 = var21.subWidth; // L: 5468
								var43 = var21.subHeight; // L: 5469
								if (var43 > var42) { // L: 5470
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5471
							}

							if (var97 != null) { // L: 5473
								var30 = var97.method3860(); // L: 5474
								if (var30 != null) { // L: 5475
									var34 = var30.subWidth; // L: 5476
									var43 = var30.subHeight; // L: 5477
									if (var43 > var42) { // L: 5478
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5479
								}

								var31 = var97.method3856(); // L: 5481
								if (var31 != null) { // L: 5482
									var35 = var31.subWidth; // L: 5483
									var43 = var31.subHeight; // L: 5484
									if (var43 > var42) { // L: 5485
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5486
								}

								var32 = var97.method3857(); // L: 5488
								if (var32 != null) { // L: 5489
									var36 = var32.subWidth; // L: 5490
									var43 = var32.subHeight; // L: 5491
									if (var43 > var42) { // L: 5492
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5493
								}

								var33 = var97.method3865(); // L: 5495
								if (var33 != null) { // L: 5496
									var37 = var33.subWidth; // L: 5497
									var43 = var33.subHeight; // L: 5498
									if (var43 > var42) { // L: 5499
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5500
								}
							}

							Font var83 = var103.getFont(); // L: 5505
							if (var83 == null) { // L: 5506
								var83 = class369.field4300;
							}

							Font var44;
							if (var97 != null) { // L: 5507
								var44 = var97.getFont(); // L: 5508
								if (var44 == null) {
									var44 = class369.field4300; // L: 5509
								}
							} else {
								var44 = class369.field4300; // L: 5511
							}

							String var45 = null; // L: 5512
							String var46 = null; // L: 5513
							boolean var47 = false; // L: 5514
							int var48 = 0; // L: 5515
							var45 = var103.getString(var0.hitSplatValues[var100]); // L: 5516
							int var98 = var83.stringWidth(var45); // L: 5517
							if (var97 != null) { // L: 5518
								var46 = var97.getString(var0.hitSplatValues2[var100]); // L: 5519
								var48 = var44.stringWidth(var46); // L: 5520
							}

							int var49 = 0; // L: 5522
							int var50 = 0; // L: 5523
							if (var23 > 0) { // L: 5524
								if (var20 == null && var21 == null) { // L: 5525
									var49 = 1; // L: 5526
								} else {
									var49 = var98 / var23 + 1;
								}
							}

							if (var97 != null && var35 > 0) { // L: 5528 5529
								if (var32 == null && var33 == null) { // L: 5530
									var50 = 1; // L: 5531
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5534
							int var52 = var51; // L: 5535
							if (var22 > 0) { // L: 5536
								var51 += var22;
							}

							var51 += 2; // L: 5537
							int var53 = var51; // L: 5538
							if (var24 > 0) { // L: 5539
								var51 += var24;
							}

							int var54 = var51; // L: 5540
							int var55 = var51; // L: 5541
							int var56;
							if (var23 > 0) { // L: 5542
								var56 = var23 * var49; // L: 5543
								var51 += var56; // L: 5544
								var55 += (var56 - var98) / 2; // L: 5545
							} else {
								var51 += var98; // L: 5548
							}

							var56 = var51; // L: 5550
							if (var25 > 0) { // L: 5551
								var51 += var25;
							}

							int var57 = 0; // L: 5552
							int var58 = 0; // L: 5553
							int var59 = 0; // L: 5554
							int var60 = 0; // L: 5555
							int var61 = 0; // L: 5556
							int var62;
							if (var97 != null) { // L: 5557
								var51 += 2; // L: 5558
								var57 = var51; // L: 5559
								if (var34 > 0) { // L: 5560
									var51 += var34;
								}

								var51 += 2; // L: 5561
								var58 = var51; // L: 5562
								if (var36 > 0) { // L: 5563
									var51 += var36;
								}

								var59 = var51; // L: 5564
								var61 = var51; // L: 5565
								if (var35 > 0) { // L: 5566
									var62 = var35 * var50; // L: 5567
									var51 += var62; // L: 5568
									var61 += (var62 - var48) / 2; // L: 5569
								} else {
									var51 += var48; // L: 5572
								}

								var60 = var51; // L: 5574
								if (var37 > 0) { // L: 5575
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var100] - Client.cycle; // L: 5577
							int var63 = var103.field2065 - var62 * var103.field2065 / var103.field2060; // L: 5578
							int var64 = var62 * var103.field2066 / var103.field2060 + -var103.field2066; // L: 5579
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5580
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5581
							int var67 = var66; // L: 5582
							int var68 = var66 + var42; // L: 5583
							int var69 = var66 + var103.field2059 + 15; // L: 5584
							int var70 = var69 - var83.maxAscent; // L: 5585
							int var71 = var69 + var83.maxDescent; // L: 5586
							if (var70 < var66) { // L: 5587
								var67 = var70;
							}

							if (var71 > var68) { // L: 5588
								var68 = var71;
							}

							int var72 = 0; // L: 5589
							int var73;
							int var74;
							if (var97 != null) { // L: 5590
								var72 = var66 + var97.field2059 + 15; // L: 5591
								var73 = var72 - var44.maxAscent; // L: 5592
								var74 = var72 + var44.maxDescent; // L: 5593
								if (var73 < var67) { // L: 5594
									;
								}

								if (var74 > var68) { // L: 5595
									;
								}
							}

							var73 = 255; // L: 5597
							if (var103.field2067 >= 0) { // L: 5598
								var73 = (var62 << 8) / (var103.field2060 - var103.field2067);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5599
								if (var18 != null) { // L: 5600
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5601
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5602
									for (var74 = 0; var74 < var49; ++var74) { // L: 5603
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5604
									}
								}

								if (var21 != null) { // L: 5607
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var83.drawAlpha(var45, var55 + var65, var69, var103.textColor, 0, var73); // L: 5608
								if (var97 != null) { // L: 5609
									if (var30 != null) { // L: 5610
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5611
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5612
										for (var74 = 0; var74 < var50; ++var74) { // L: 5613
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73); // L: 5614
										}
									}

									if (var33 != null) { // L: 5617
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var97.textColor, 0, var73); // L: 5618
								}
							} else {
								if (var18 != null) { // L: 5622
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5623
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5624
									for (var74 = 0; var74 < var49; ++var74) { // L: 5625
										var19.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66); // L: 5626
									}
								}

								if (var21 != null) { // L: 5629
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var83.draw(var45, var65 + var55, var69, var103.textColor | -16777216, 0); // L: 5630
								if (var97 != null) { // L: 5631
									if (var30 != null) { // L: 5632
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5633
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5634
										for (var74 = 0; var74 < var50; ++var74) { // L: 5635
											var31.drawTransBgAt(var74 * var35 + (var59 + var65 - var39), var66); // L: 5636
										}
									}

									if (var33 != null) { // L: 5639
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var97.textColor | -16777216, 0); // L: 5640
								}
							}
						}
					}
				}
			}

		}
	} // L: 5645
}
