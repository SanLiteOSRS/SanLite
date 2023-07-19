import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class143 extends class144 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1255326041
	)
	int field1648;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class143(class147 var1) {
		this.this$0 = var1;
		this.field1648 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1648 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3294(this.field1648); // L: 123
	} // L: 124

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I)V",
		garbageValue = "99739336"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 38
		int var1 = Client.localPlayerIndex; // L: 39
		Player var2 = class27.localPlayer = Client.players[var1] = new Player(); // L: 40
		var2.index = var1; // L: 41
		int var3 = var0.readBits(30); // L: 42
		byte var4 = (byte)(var3 >> 28); // L: 43
		int var5 = var3 >> 14 & 16383; // L: 44
		int var6 = var3 & 16383; // L: 45
		var2.pathX[0] = var5 - class166.baseX * 64; // L: 46
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 47
		var2.pathY[0] = var6 - class9.baseY * 64; // L: 48
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 49
		BuddyRankComparator.Client_plane = var2.plane = var4; // L: 50
		if (Players.field1364[var1] != null) { // L: 51
			var2.read(Players.field1364[var1]);
		}

		Players.Players_count = 0; // L: 52
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 53
		Players.field1362[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) { // L: 57
				int var8 = var0.readBits(18); // L: 58
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597; // L: 61
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0; // L: 63
				Players.Players_targetIndices[var7] = -1; // L: 64
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1362[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnr;III)[Luq;",
		garbageValue = "1382852872"
	)
	public static SpritePixels[] method3200(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 54
		boolean var3;
		if (var4 == null) { // L: 55
			var3 = false; // L: 56
		} else {
			GrandExchangeEvent.SpriteBuffer_decode(var4); // L: 59
			var3 = true; // L: 60
		}

		if (!var3) { // L: 62
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class527.SpriteBuffer_spriteCount]; // L: 65

			for (int var6 = 0; var6 < class527.SpriteBuffer_spriteCount; ++var6) { // L: 66
				SpritePixels var7 = var5[var6] = new SpritePixels(); // L: 67
				var7.width = class527.SpriteBuffer_spriteWidth; // L: 68
				var7.height = class527.SpriteBuffer_spriteHeight; // L: 69
				var7.xOffset = class527.SpriteBuffer_xOffsets[var6]; // L: 70
				var7.yOffset = class527.SpriteBuffer_yOffsets[var6]; // L: 71
				var7.subWidth = class496.SpriteBuffer_spriteWidths[var6]; // L: 72
				var7.subHeight = BuddyRankComparator.SpriteBuffer_spriteHeights[var6]; // L: 73
				int var8 = var7.subWidth * var7.subHeight; // L: 74
				byte[] var9 = class464.SpriteBuffer_pixels[var6]; // L: 75
				var7.pixels = new int[var8]; // L: 76

				for (int var10 = 0; var10 < var8; ++var10) { // L: 77
					var7.pixels[var10] = class527.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			PlatformInfo.method8433(); // L: 79
			return var5; // L: 82
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lng;Ljava/lang/String;S)V",
		garbageValue = "-17755"
	)
	static void method3208(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1531
		Client.archiveLoaders.add(var2); // L: 1532
		Client.field797 += var2.groupCount; // L: 1533
	} // L: 1534

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIIII)V",
		garbageValue = "1474051932"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5297
			if (var0 instanceof NPC) { // L: 5298
				NPCComposition var6 = ((NPC)var0).definition; // L: 5299
				if (var6.transforms != null) { // L: 5300
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5301
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5303
			int[] var7 = Players.Players_indices; // L: 5304
			boolean var8 = var1 < var75; // L: 5305
			int var9 = -2; // L: 5306
			if (var0.overheadText != null && (!var8 || !var0.field1200 && (Client.publicChatMode == 4 || !var0.field1199 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2347())))) { // L: 5307 5308
				class390.method7287(var0, var0.defaultHeight); // L: 5309
				if (Client.viewportTempX > -1 && Client.field600 < Client.field526) { // L: 5310
					Client.field633[Client.field600] = class290.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5311
					Client.field604[Client.field600] = class290.fontBold12.ascent; // L: 5312
					Client.field593[Client.field600] = Client.viewportTempX; // L: 5313
					Client.field547[Client.field600] = Client.viewportTempY - var9; // L: 5314
					Client.field520[Client.field600] = var0.field1198; // L: 5315
					Client.field549[Client.field600] = var0.field1203; // L: 5316
					Client.field609[Client.field600] = var0.overheadTextCyclesRemaining; // L: 5317
					Client.field608[Client.field600] = var0.field1204; // L: 5318
					Client.field610[Client.field600] = var0.overheadText; // L: 5319
					++Client.field600; // L: 5320
					var9 += 12; // L: 5321
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7098()) { // L: 5325
				class390.method7287(var0, var0.defaultHeight + 15); // L: 5326

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5327
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5328
					if (var11 == null) { // L: 5329
						if (var10.isEmpty()) { // L: 5387
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5330
						SpritePixels var79 = var12.method3761(); // L: 5331
						SpritePixels var83 = var12.method3760(); // L: 5332
						int var84 = 0; // L: 5334
						if (var79 != null && var83 != null) { // L: 5335
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5336
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5337
						} else {
							var15 = var12.width; // L: 5339
						}

						int var81 = 255; // L: 5340
						boolean var85 = true; // L: 5341
						int var86 = Client.cycle - var11.cycle; // L: 5342
						int var87 = var15 * var11.health2 / var12.width; // L: 5343
						int var88;
						int var98;
						if (var11.cycleOffset > var86) { // L: 5344
							var88 = var12.field1972 == 0 ? 0 : var12.field1972 * (var86 / var12.field1972); // L: 5345
							var22 = var15 * var11.health / var12.width; // L: 5346
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5347
						} else {
							var98 = var87; // L: 5350
							var88 = var12.int5 + var11.cycleOffset - var86; // L: 5351
							if (var12.int3 >= 0) { // L: 5352
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) { // L: 5354
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5355
							if (var98 == var15) { // L: 5356
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5357
							}

							var88 = var79.subHeight; // L: 5358
							var9 += var88; // L: 5359
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5360
							var23 = var3 + Client.viewportTempY - var9; // L: 5361
							var22 -= var84; // L: 5362
							if (var81 >= 0 && var81 < 255) { // L: 5363
								var79.drawTransAt(var22, var23, var81); // L: 5364
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88); // L: 5365
								var83.drawTransAt(var22, var23, var81); // L: 5366
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5369
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var88 + var23); // L: 5370
								var83.drawTransBgAt(var22, var23); // L: 5371
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5373
							var9 += 2; // L: 5374
						} else {
							var9 += 5; // L: 5377
							if (Client.viewportTempX > -1) { // L: 5378
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5379
								var22 = var3 + Client.viewportTempY - var9; // L: 5380
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5381
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680); // L: 5382
							}

							var9 += 2; // L: 5384
						}
					}
				}
			}

			if (var9 == -2) { // L: 5390
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && class209.method4223((Player)var0)) { // L: 5391
				var89 = (Player)var0; // L: 5392
				if (var8) { // L: 5393
					class390.method7287(var0, var0.defaultHeight + 15); // L: 5394
					AbstractFont var90 = (AbstractFont)Client.field565.get(FontName.FontName_plain12); // L: 5395
					var9 += 4; // L: 5396
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5397
					var9 += 18; // L: 5398
				}
			}

			if (var8) { // L: 5401
				var89 = (Player)var0; // L: 5402
				if (var89.isHidden) { // L: 5403
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) { // L: 5404
					class390.method7287(var0, var0.defaultHeight + 15); // L: 5405
					if (Client.viewportTempX > -1) { // L: 5406
						if (var89.headIconPk != -1) { // L: 5407
							var9 += 25; // L: 5408
							class85.field1056[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5409
						}

						if (var89.headIconPrayer != -1) { // L: 5411
							var9 += 25; // L: 5412
							class156.field1746[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5413
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.field523) { // L: 5417
					class390.method7287(var0, var0.defaultHeight + 15); // L: 5418
					if (Client.viewportTempX > -1) { // L: 5419
						var9 += class191.field1979[1].subHeight; // L: 5420
						class191.field1979[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5421
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5426
				int[] var92 = var91.method2634(); // L: 5427
				short[] var93 = var91.method2688(); // L: 5428
				if (var93 != null && var92 != null) { // L: 5429
					for (int var13 = 0; var13 < var93.length; ++var13) { // L: 5430
						if (var93[var13] >= 0 && var92[var13] >= 0) { // L: 5431
							long var14 = (long)var92[var13] << 8 | (long)var93[var13]; // L: 5434
							SpritePixels var16 = (SpritePixels)Client.archive5.method7818(var14); // L: 5435
							if (var16 == null) { // L: 5436
								SpritePixels[] var17 = method3200(Nameable.field4637, var92[var13], 0); // L: 5437
								if (var17 != null && var93[var13] < var17.length) { // L: 5438
									var16 = var17[var93[var13]]; // L: 5439
									Client.archive5.method7805(var14, var16); // L: 5440
								}
							}

							if (var16 != null) { // L: 5443
								class390.method7287(var0, var0.defaultHeight + 15); // L: 5444
								if (Client.viewportTempX > -1) { // L: 5445
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5446
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.field674 && Client.cycle % 20 < 10) { // L: 5451
					class390.method7287(var0, var0.defaultHeight + 15); // L: 5452
					if (Client.viewportTempX > -1) { // L: 5453
						class191.field1979[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5456
				int var77 = var0.hitSplatCycles[var76]; // L: 5457
				int var78 = var0.hitSplatTypes[var76]; // L: 5458
				HitSplatDefinition var96 = null; // L: 5459
				int var80 = 0; // L: 5460
				if (var78 >= 0) { // L: 5461
					if (var77 <= Client.cycle) { // L: 5462
						continue;
					}

					var96 = class131.method3110(var0.hitSplatTypes[var76]); // L: 5463
					var80 = var96.field2150; // L: 5464
					if (var96 != null && var96.transforms != null) { // L: 5465
						var96 = var96.transform(); // L: 5466
						if (var96 == null) { // L: 5467
							var0.hitSplatCycles[var76] = -1; // L: 5468
							continue; // L: 5469
						}
					}
				} else if (var77 < 0) { // L: 5473
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 5474
				HitSplatDefinition var94 = null; // L: 5475
				if (var15 >= 0) { // L: 5476
					var94 = class131.method3110(var15); // L: 5477
					if (var94 != null && var94.transforms != null) { // L: 5478
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5480
					if (var96 == null) { // L: 5481
						var0.hitSplatCycles[var76] = -1; // L: 5482
					} else {
						class390.method7287(var0, var0.defaultHeight / 2); // L: 5485
						if (Client.viewportTempX > -1) { // L: 5486
							boolean var97 = true; // L: 5487
							if (var76 == 1) { // L: 5488
								Client.viewportTempY -= 20; // L: 5489
							}

							if (var76 == 2) { // L: 5491
								Client.viewportTempX -= 15; // L: 5492
								Client.viewportTempY -= 10; // L: 5493
							}

							if (var76 == 3) { // L: 5495
								Client.viewportTempX += 15; // L: 5496
								Client.viewportTempY -= 10; // L: 5497
							}

							SpritePixels var18 = null; // L: 5499
							SpritePixels var19 = null; // L: 5500
							SpritePixels var20 = null; // L: 5501
							SpritePixels var21 = null; // L: 5502
							var22 = 0; // L: 5503
							var23 = 0; // L: 5504
							int var24 = 0; // L: 5505
							int var25 = 0; // L: 5506
							int var26 = 0; // L: 5507
							int var27 = 0; // L: 5508
							int var28 = 0; // L: 5509
							int var29 = 0; // L: 5510
							SpritePixels var30 = null; // L: 5511
							SpritePixels var31 = null; // L: 5512
							SpritePixels var32 = null; // L: 5513
							SpritePixels var33 = null; // L: 5514
							int var34 = 0; // L: 5515
							int var35 = 0; // L: 5516
							int var36 = 0; // L: 5517
							int var37 = 0; // L: 5518
							int var38 = 0; // L: 5519
							int var39 = 0; // L: 5520
							int var40 = 0; // L: 5521
							int var41 = 0; // L: 5522
							int var42 = 0; // L: 5523
							var18 = var96.method3996(); // L: 5524
							int var43;
							if (var18 != null) { // L: 5525
								var22 = var18.subWidth; // L: 5526
								var43 = var18.subHeight; // L: 5527
								if (var43 > var42) { // L: 5528
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5529
							}

							var19 = var96.method3997(); // L: 5531
							if (var19 != null) { // L: 5532
								var23 = var19.subWidth; // L: 5533
								var43 = var19.subHeight; // L: 5534
								if (var43 > var42) { // L: 5535
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5536
							}

							var20 = var96.method3998(); // L: 5538
							if (var20 != null) { // L: 5539
								var24 = var20.subWidth; // L: 5540
								var43 = var20.subHeight; // L: 5541
								if (var43 > var42) { // L: 5542
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5543
							}

							var21 = var96.method4002(); // L: 5545
							if (var21 != null) { // L: 5546
								var25 = var21.subWidth; // L: 5547
								var43 = var21.subHeight; // L: 5548
								if (var43 > var42) { // L: 5549
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5550
							}

							if (var94 != null) { // L: 5552
								var30 = var94.method3996(); // L: 5553
								if (var30 != null) { // L: 5554
									var34 = var30.subWidth; // L: 5555
									var43 = var30.subHeight; // L: 5556
									if (var43 > var42) { // L: 5557
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5558
								}

								var31 = var94.method3997(); // L: 5560
								if (var31 != null) { // L: 5561
									var35 = var31.subWidth; // L: 5562
									var43 = var31.subHeight; // L: 5563
									if (var43 > var42) { // L: 5564
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5565
								}

								var32 = var94.method3998(); // L: 5567
								if (var32 != null) { // L: 5568
									var36 = var32.subWidth; // L: 5569
									var43 = var32.subHeight; // L: 5570
									if (var43 > var42) { // L: 5571
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5572
								}

								var33 = var94.method4002(); // L: 5574
								if (var33 != null) { // L: 5575
									var37 = var33.subWidth; // L: 5576
									var43 = var33.subHeight; // L: 5577
									if (var43 > var42) { // L: 5578
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5579
								}
							}

							Font var82 = var96.getFont(); // L: 5584
							if (var82 == null) { // L: 5585
								var82 = class149.field1683;
							}

							Font var44;
							if (var94 != null) { // L: 5586
								var44 = var94.getFont(); // L: 5587
								if (var44 == null) { // L: 5588
									var44 = class149.field1683;
								}
							} else {
								var44 = class149.field1683; // L: 5590
							}

							String var45 = null; // L: 5591
							String var46 = null; // L: 5592
							boolean var47 = false; // L: 5593
							int var48 = 0; // L: 5594
							var45 = var96.getString(var0.hitSplatValues[var76]); // L: 5595
							int var95 = var82.stringWidth(var45); // L: 5596
							if (var94 != null) { // L: 5597
								var46 = var94.getString(var0.hitSplatValues2[var76]); // L: 5598
								var48 = var44.stringWidth(var46); // L: 5599
							}

							int var49 = 0; // L: 5601
							int var50 = 0; // L: 5602
							if (var23 > 0) { // L: 5603
								if (var20 == null && var21 == null) { // L: 5604
									var49 = 1; // L: 5605
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) { // L: 5607 5608
								if (var32 == null && var33 == null) { // L: 5609
									var50 = 1; // L: 5610
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5613
							int var52 = var51; // L: 5614
							if (var22 > 0) { // L: 5615
								var51 += var22;
							}

							var51 += 2; // L: 5616
							int var53 = var51; // L: 5617
							if (var24 > 0) { // L: 5618
								var51 += var24;
							}

							int var54 = var51; // L: 5619
							int var55 = var51; // L: 5620
							int var56;
							if (var23 > 0) { // L: 5621
								var56 = var49 * var23; // L: 5622
								var51 += var56; // L: 5623
								var55 += (var56 - var95) / 2; // L: 5624
							} else {
								var51 += var95; // L: 5627
							}

							var56 = var51; // L: 5629
							if (var25 > 0) { // L: 5630
								var51 += var25;
							}

							int var57 = 0; // L: 5631
							int var58 = 0; // L: 5632
							int var59 = 0; // L: 5633
							int var60 = 0; // L: 5634
							int var61 = 0; // L: 5635
							int var62;
							if (var94 != null) { // L: 5636
								var51 += 2; // L: 5637
								var57 = var51; // L: 5638
								if (var34 > 0) { // L: 5639
									var51 += var34;
								}

								var51 += 2; // L: 5640
								var58 = var51; // L: 5641
								if (var36 > 0) { // L: 5642
									var51 += var36;
								}

								var59 = var51; // L: 5643
								var61 = var51; // L: 5644
								if (var35 > 0) { // L: 5645
									var62 = var35 * var50; // L: 5646
									var51 += var62; // L: 5647
									var61 += (var62 - var48) / 2; // L: 5648
								} else {
									var51 += var48; // L: 5651
								}

								var60 = var51; // L: 5653
								if (var37 > 0) { // L: 5654
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5656
							int var63 = var96.field2140 - var62 * var96.field2140 / var96.field2150; // L: 5657
							int var64 = var62 * var96.field2141 / var96.field2150 + -var96.field2141; // L: 5658
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5659
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5660
							int var67 = var66; // L: 5661
							int var68 = var42 + var66; // L: 5662
							int var69 = var66 + var96.field2126 + 15; // L: 5663
							int var70 = var69 - var82.maxAscent; // L: 5664
							int var71 = var69 + var82.maxDescent; // L: 5665
							if (var70 < var66) { // L: 5666
								var67 = var70;
							}

							if (var71 > var68) { // L: 5667
								var68 = var71;
							}

							int var72 = 0; // L: 5668
							int var73;
							int var74;
							if (var94 != null) { // L: 5669
								var72 = var66 + var94.field2126 + 15; // L: 5670
								var73 = var72 - var44.maxAscent; // L: 5671
								var74 = var72 + var44.maxDescent; // L: 5672
								if (var73 < var67) { // L: 5673
									;
								}

								if (var74 > var68) { // L: 5674
									;
								}
							}

							var73 = 255; // L: 5676
							if (var96.field2142 >= 0) { // L: 5677
								var73 = (var62 << 8) / (var96.field2150 - var96.field2142);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5678
								if (var18 != null) { // L: 5679
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5680
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5681
									for (var74 = 0; var74 < var49; ++var74) { // L: 5682
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73); // L: 5683
									}
								}

								if (var21 != null) { // L: 5686
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73); // L: 5687
								if (var94 != null) { // L: 5688
									if (var30 != null) { // L: 5689
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5690
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5691
										for (var74 = 0; var74 < var50; ++var74) { // L: 5692
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5693
										}
									}

									if (var33 != null) { // L: 5696
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var94.textColor, 0, var73); // L: 5697
								}
							} else {
								if (var18 != null) { // L: 5701
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5702
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5703
									for (var74 = 0; var74 < var49; ++var74) { // L: 5704
										var19.drawTransBgAt(var74 * var23 + (var65 + var54 - var27), var66); // L: 5705
									}
								}

								if (var21 != null) { // L: 5708
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0); // L: 5709
								if (var94 != null) { // L: 5710
									if (var30 != null) { // L: 5711
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5712
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5713
										for (var74 = 0; var74 < var50; ++var74) { // L: 5714
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5715
										}
									}

									if (var33 != null) { // L: 5718
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0); // L: 5719
								}
							}
						}
					}
				}
			}

		}
	} // L: 5724

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "18"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class217.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 10031
		var2.packetBuffer.writeIntME(var1); // L: 10032
		var2.packetBuffer.method9109(var0); // L: 10033
		Client.packetWriter.addNode(var2); // L: 10034
	} // L: 10035
}
