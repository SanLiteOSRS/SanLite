import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ke")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -103174417
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1006037985
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2135927327
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 514582153
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1945820401
	)
	@Export("type")
	int type;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1573918785
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -266623797
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 373914063
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -632899747
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1480224713
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -242515549
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -225533837
	)
	int field2942;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1155392615
	)
	int field2937;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -910623109
	)
	int field2946;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2123943263
	)
	int field2941;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1524963301
	)
	int field2945;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1245318489
	)
	int field2947;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -84973589
	)
	int field2943;

	Occluder() {
	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1558434695"
	)
	static int method5636(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1677
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1678
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1679
			return 1; // L: 1680
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1682
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1683
			return 1; // L: 1684
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1686
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1687
			return 1; // L: 1688
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1690
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1691
			return 1; // L: 1692
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1694
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1695
			return 1; // L: 1696
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1698
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1699
			return 1; // L: 1700
		} else {
			return 2; // L: 1702
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIII)V",
		garbageValue = "613641165"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5215
			if (var0 instanceof NPC) { // L: 5216
				NPCComposition var6 = ((NPC)var0).definition; // L: 5217
				if (var6.transforms != null) { // L: 5218
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5219
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5221
			int[] var7 = Players.Players_indices; // L: 5222
			boolean var8 = var1 < var75; // L: 5223
			int var9 = -2; // L: 5224
			if (var0.overheadText != null && (!var8 || !var0.field1205 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2386())))) { // L: 5225 5226
				ClientPreferences.method2639(var0, var0.defaultHeight); // L: 5227
				if (Client.viewportTempX > -1 && Client.field629 < Client.field630) { // L: 5228
					Client.field562[Client.field629] = class166.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5229
					Client.field633[Client.field629] = class166.fontBold12.ascent; // L: 5230
					Client.field631[Client.field629] = Client.viewportTempX; // L: 5231
					Client.field796[Client.field629] = Client.viewportTempY - var9; // L: 5232
					Client.field635[Client.field629] = var0.overheadTextColor; // L: 5233
					Client.field636[Client.field629] = var0.overheadTextEffect; // L: 5234
					Client.field638[Client.field629] = var0.overheadTextCyclesRemaining; // L: 5235
					Client.field637[Client.field629] = var0.field1226; // L: 5236
					Client.field769[Client.field629] = var0.overheadText; // L: 5237
					++Client.field629; // L: 5238
					var9 += 12; // L: 5239
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7456()) { // L: 5243
				ClientPreferences.method2639(var0, var0.defaultHeight + 15); // L: 5244

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5245
					HealthBarUpdate var11 = var10.get(Client.cycle); // L: 5246
					if (var11 == null) { // L: 5247
						if (var10.isEmpty()) { // L: 5305
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5248
						SpritePixels var79 = var12.method3642(); // L: 5249
						SpritePixels var83 = var12.getFrontSprite(); // L: 5250
						int var84 = 0; // L: 5252
						if (var79 != null && var83 != null) { // L: 5253
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5254
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5255
						} else {
							var15 = var12.width; // L: 5257
						}

						int var81 = 255; // L: 5258
						boolean var85 = true; // L: 5259
						int var86 = Client.cycle - var11.cycle; // L: 5260
						int var87 = var15 * var11.health2 / var12.width; // L: 5261
						int var88;
						int var98;
						if (var11.cycleOffset > var86) { // L: 5262
							var88 = var12.field1916 == 0 ? 0 : var12.field1916 * (var86 / var12.field1916); // L: 5263
							var22 = var15 * var11.health / var12.width; // L: 5264
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5265
						} else {
							var98 = var87; // L: 5268
							var88 = var12.int5 + var11.cycleOffset - var86; // L: 5269
							if (var12.int3 >= 0) { // L: 5270
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) { // L: 5272
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5273
							if (var98 == var15) { // L: 5274
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5275
							}

							var88 = var79.subHeight; // L: 5276
							var9 += var88; // L: 5277
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5278
							var23 = var3 + Client.viewportTempY - var9; // L: 5279
							var22 -= var84; // L: 5280
							if (var81 >= 0 && var81 < 255) { // L: 5281
								var79.drawTransAt(var22, var23, var81); // L: 5282
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88); // L: 5283
								var83.drawTransAt(var22, var23, var81); // L: 5284
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5287
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88); // L: 5288
								var83.drawTransBgAt(var22, var23); // L: 5289
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5291
							var9 += 2; // L: 5292
						} else {
							var9 += 5; // L: 5295
							if (Client.viewportTempX > -1) { // L: 5296
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5297
								var22 = var3 + Client.viewportTempY - var9; // L: 5298
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5299
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680); // L: 5300
							}

							var9 += 2; // L: 5302
						}
					}
				}
			}

			if (var9 == -2) { // L: 5308
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && SpotAnimationDefinition.method3798((Player)var0)) { // L: 5309
				var89 = (Player)var0; // L: 5310
				if (var8) { // L: 5311
					ClientPreferences.method2639(var0, var0.defaultHeight + 15); // L: 5312
					AbstractFont var90 = (AbstractFont)Client.field743.get(FontName.FontName_plain12); // L: 5313
					var9 += 4; // L: 5314
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5315
					var9 += 18; // L: 5316
				}
			}

			if (var8) { // L: 5319
				var89 = (Player)var0; // L: 5320
				if (var89.isHidden) { // L: 5321
					return;
				}

				if (var89.field1135 != -1 || var89.field1159 != -1) { // L: 5322
					ClientPreferences.method2639(var0, var0.defaultHeight + 15); // L: 5323
					if (Client.viewportTempX > -1) { // L: 5324
						if (var89.field1135 != -1) { // L: 5325
							var9 += 25; // L: 5326
							class13.field61[var89.field1135].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5327
						}

						if (var89.field1159 != -1) { // L: 5329
							var9 += 25; // L: 5330
							class168.field1826[var89.field1159].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5331
						}
					}
				}

				if (var1 >= 0 && Client.field542 == 10 && var7[var1] == Client.field536) { // L: 5335
					ClientPreferences.method2639(var0, var0.defaultHeight + 15); // L: 5336
					if (Client.viewportTempX > -1) { // L: 5337
						var9 += ChatChannel.field1041[1].subHeight; // L: 5338
						ChatChannel.field1041[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5339
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5344
				int[] var92 = var91.method2715(); // L: 5345
				short[] var93 = var91.method2722(); // L: 5346
				if (var93 != null && var92 != null) { // L: 5347
					for (int var13 = 0; var13 < var93.length; ++var13) { // L: 5348
						if (var93[var13] >= 0 && var92[var13] >= 0) { // L: 5349
							long var14 = (long)var92[var13] << 8 | (long)var93[var13]; // L: 5352
							SpritePixels var16 = (SpritePixels)Client.field821.method8198(var14); // L: 5353
							if (var16 == null) { // L: 5354
								SpritePixels[] var17 = class138.method3146(class311.field3274, var92[var13], 0); // L: 5355
								if (var17 != null && var93[var13] < var17.length) { // L: 5356
									var16 = var17[var93[var13]]; // L: 5357
									Client.field821.method8201(var14, var16); // L: 5358
								}
							}

							if (var16 != null) { // L: 5361
								ClientPreferences.method2639(var0, var0.defaultHeight + 15); // L: 5362
								if (Client.viewportTempX > -1) { // L: 5363
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5364
								}
							}
						}
					}
				}

				if (Client.field542 == 1 && Client.npcIndices[var1 - var75] == Client.field543 && Client.cycle % 20 < 10) { // L: 5369
					ClientPreferences.method2639(var0, var0.defaultHeight + 15); // L: 5370
					if (Client.viewportTempX > -1) { // L: 5371
						ChatChannel.field1041[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5374
				int var77 = var0.hitSplatCycles[var76]; // L: 5375
				int var78 = var0.hitSplatTypes[var76]; // L: 5376
				HitSplatDefinition var96 = null; // L: 5377
				int var80 = 0; // L: 5378
				if (var78 >= 0) { // L: 5379
					if (var77 <= Client.cycle) { // L: 5380
						continue;
					}

					var96 = Language.method7357(var0.hitSplatTypes[var76]); // L: 5381
					var80 = var96.field2092; // L: 5382
					if (var96 != null && var96.transforms != null) { // L: 5383
						var96 = var96.transform(); // L: 5384
						if (var96 == null) { // L: 5385
							var0.hitSplatCycles[var76] = -1; // L: 5386
							continue; // L: 5387
						}
					}
				} else if (var77 < 0) { // L: 5391
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 5392
				HitSplatDefinition var94 = null; // L: 5393
				if (var15 >= 0) { // L: 5394
					var94 = Language.method7357(var15); // L: 5395
					if (var94 != null && var94.transforms != null) { // L: 5396
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5398
					if (var96 == null) { // L: 5399
						var0.hitSplatCycles[var76] = -1; // L: 5400
					} else {
						ClientPreferences.method2639(var0, var0.defaultHeight / 2); // L: 5403
						if (Client.viewportTempX > -1) { // L: 5404
							boolean var97 = true; // L: 5405
							if (var76 == 1) { // L: 5406
								Client.viewportTempY -= 20; // L: 5407
							}

							if (var76 == 2) { // L: 5409
								Client.viewportTempX -= 15; // L: 5410
								Client.viewportTempY -= 10; // L: 5411
							}

							if (var76 == 3) { // L: 5413
								Client.viewportTempX += 15; // L: 5414
								Client.viewportTempY -= 10; // L: 5415
							}

							SpritePixels var18 = null; // L: 5417
							SpritePixels var19 = null; // L: 5418
							SpritePixels var20 = null; // L: 5419
							SpritePixels var21 = null; // L: 5420
							var22 = 0; // L: 5421
							var23 = 0; // L: 5422
							int var24 = 0; // L: 5423
							int var25 = 0; // L: 5424
							int var26 = 0; // L: 5425
							int var27 = 0; // L: 5426
							int var28 = 0; // L: 5427
							int var29 = 0; // L: 5428
							SpritePixels var30 = null; // L: 5429
							SpritePixels var31 = null; // L: 5430
							SpritePixels var32 = null; // L: 5431
							SpritePixels var33 = null; // L: 5432
							int var34 = 0; // L: 5433
							int var35 = 0; // L: 5434
							int var36 = 0; // L: 5435
							int var37 = 0; // L: 5436
							int var38 = 0; // L: 5437
							int var39 = 0; // L: 5438
							int var40 = 0; // L: 5439
							int var41 = 0; // L: 5440
							int var42 = 0; // L: 5441
							var18 = var96.method3914(); // L: 5442
							int var43;
							if (var18 != null) { // L: 5443
								var22 = var18.subWidth; // L: 5444
								var43 = var18.subHeight; // L: 5445
								if (var43 > var42) { // L: 5446
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5447
							}

							var19 = var96.method3884(); // L: 5449
							if (var19 != null) { // L: 5450
								var23 = var19.subWidth; // L: 5451
								var43 = var19.subHeight; // L: 5452
								if (var43 > var42) { // L: 5453
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5454
							}

							var20 = var96.method3904(); // L: 5456
							if (var20 != null) { // L: 5457
								var24 = var20.subWidth; // L: 5458
								var43 = var20.subHeight; // L: 5459
								if (var43 > var42) { // L: 5460
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5461
							}

							var21 = var96.method3886(); // L: 5463
							if (var21 != null) { // L: 5464
								var25 = var21.subWidth; // L: 5465
								var43 = var21.subHeight; // L: 5466
								if (var43 > var42) { // L: 5467
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5468
							}

							if (var94 != null) { // L: 5470
								var30 = var94.method3914(); // L: 5471
								if (var30 != null) { // L: 5472
									var34 = var30.subWidth; // L: 5473
									var43 = var30.subHeight; // L: 5474
									if (var43 > var42) { // L: 5475
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5476
								}

								var31 = var94.method3884(); // L: 5478
								if (var31 != null) { // L: 5479
									var35 = var31.subWidth; // L: 5480
									var43 = var31.subHeight; // L: 5481
									if (var43 > var42) { // L: 5482
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5483
								}

								var32 = var94.method3904(); // L: 5485
								if (var32 != null) { // L: 5486
									var36 = var32.subWidth; // L: 5487
									var43 = var32.subHeight; // L: 5488
									if (var43 > var42) { // L: 5489
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5490
								}

								var33 = var94.method3886(); // L: 5492
								if (var33 != null) { // L: 5493
									var37 = var33.subWidth; // L: 5494
									var43 = var33.subHeight; // L: 5495
									if (var43 > var42) { // L: 5496
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5497
								}
							}

							Font var82 = var96.getFont(); // L: 5502
							if (var82 == null) { // L: 5503
								var82 = class60.field435;
							}

							Font var44;
							if (var94 != null) { // L: 5504
								var44 = var94.getFont(); // L: 5505
								if (var44 == null) { // L: 5506
									var44 = class60.field435;
								}
							} else {
								var44 = class60.field435; // L: 5508
							}

							String var45 = null; // L: 5509
							String var46 = null; // L: 5510
							boolean var47 = false; // L: 5511
							int var48 = 0; // L: 5512
							var45 = var96.getString(var0.hitSplatValues[var76]); // L: 5513
							int var95 = var82.stringWidth(var45); // L: 5514
							if (var94 != null) { // L: 5515
								var46 = var94.getString(var0.hitSplatValues2[var76]); // L: 5516
								var48 = var44.stringWidth(var46); // L: 5517
							}

							int var49 = 0; // L: 5519
							int var50 = 0; // L: 5520
							if (var23 > 0) { // L: 5521
								if (var20 == null && var21 == null) { // L: 5522
									var49 = 1; // L: 5523
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) { // L: 5525 5526
								if (var32 == null && var33 == null) { // L: 5527
									var50 = 1; // L: 5528
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5531
							int var52 = var51; // L: 5532
							if (var22 > 0) { // L: 5533
								var51 += var22;
							}

							var51 += 2; // L: 5534
							int var53 = var51; // L: 5535
							if (var24 > 0) { // L: 5536
								var51 += var24;
							}

							int var54 = var51; // L: 5537
							int var55 = var51; // L: 5538
							int var56;
							if (var23 > 0) { // L: 5539
								var56 = var49 * var23; // L: 5540
								var51 += var56; // L: 5541
								var55 += (var56 - var95) / 2; // L: 5542
							} else {
								var51 += var95; // L: 5545
							}

							var56 = var51; // L: 5547
							if (var25 > 0) { // L: 5548
								var51 += var25;
							}

							int var57 = 0; // L: 5549
							int var58 = 0; // L: 5550
							int var59 = 0; // L: 5551
							int var60 = 0; // L: 5552
							int var61 = 0; // L: 5553
							int var62;
							if (var94 != null) { // L: 5554
								var51 += 2; // L: 5555
								var57 = var51; // L: 5556
								if (var34 > 0) { // L: 5557
									var51 += var34;
								}

								var51 += 2; // L: 5558
								var58 = var51; // L: 5559
								if (var36 > 0) { // L: 5560
									var51 += var36;
								}

								var59 = var51; // L: 5561
								var61 = var51; // L: 5562
								if (var35 > 0) { // L: 5563
									var62 = var35 * var50; // L: 5564
									var51 += var62; // L: 5565
									var61 += (var62 - var48) / 2; // L: 5566
								} else {
									var51 += var48; // L: 5569
								}

								var60 = var51; // L: 5571
								if (var37 > 0) { // L: 5572
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5574
							int var63 = var96.field2100 - var62 * var96.field2100 / var96.field2092; // L: 5575
							int var64 = var62 * var96.field2098 / var96.field2092 + -var96.field2098; // L: 5576
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5577
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5578
							int var67 = var66; // L: 5579
							int var68 = var66 + var42; // L: 5580
							int var69 = var66 + var96.field2090 + 15; // L: 5581
							int var70 = var69 - var82.maxAscent; // L: 5582
							int var71 = var69 + var82.maxDescent; // L: 5583
							if (var70 < var66) { // L: 5584
								var67 = var70;
							}

							if (var71 > var68) { // L: 5585
								var68 = var71;
							}

							int var72 = 0; // L: 5586
							int var73;
							int var74;
							if (var94 != null) { // L: 5587
								var72 = var66 + var94.field2090 + 15; // L: 5588
								var73 = var72 - var44.maxAscent; // L: 5589
								var74 = var72 + var44.maxDescent; // L: 5590
								if (var73 < var67) { // L: 5591
									;
								}

								if (var74 > var68) { // L: 5592
									;
								}
							}

							var73 = 255; // L: 5594
							if (var96.field2099 >= 0) { // L: 5595
								var73 = (var62 << 8) / (var96.field2092 - var96.field2099);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5596
								if (var18 != null) { // L: 5597
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5598
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5599
									for (var74 = 0; var74 < var49; ++var74) { // L: 5600
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73); // L: 5601
									}
								}

								if (var21 != null) { // L: 5604
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73); // L: 5605
								if (var94 != null) { // L: 5606
									if (var30 != null) { // L: 5607
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5608
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5609
										for (var74 = 0; var74 < var50; ++var74) { // L: 5610
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73); // L: 5611
										}
									}

									if (var33 != null) { // L: 5614
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var94.textColor, 0, var73); // L: 5615
								}
							} else {
								if (var18 != null) { // L: 5619
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5620
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5621
									for (var74 = 0; var74 < var49; ++var74) { // L: 5622
										var19.drawTransBgAt(var74 * var23 + (var65 + var54 - var27), var66); // L: 5623
									}
								}

								if (var21 != null) { // L: 5626
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0); // L: 5627
								if (var94 != null) { // L: 5628
									if (var30 != null) { // L: 5629
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5630
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5631
										for (var74 = 0; var74 < var50; ++var74) { // L: 5632
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66); // L: 5633
										}
									}

									if (var33 != null) { // L: 5636
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0); // L: 5637
								}
							}
						}
					}
				}
			}

		}
	} // L: 5642
}
