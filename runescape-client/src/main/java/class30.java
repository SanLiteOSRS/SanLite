import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class30 {
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 1420334919
	)
	@Export("menuHeight")
	static int menuHeight;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILir;Liz;I)V",
		garbageValue = "795706327"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 373 374 375
			if (var0 < Tiles.Tiles_minPlane) { // L: 378
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = DecorativeObject.getObjectDefinition(var3); // L: 379
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 382
				var9 = var8.sizeX; // L: 387
				var10 = var8.sizeY; // L: 388
			} else {
				var9 = var8.sizeY; // L: 383
				var10 = var8.sizeX; // L: 384
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 394
				var11 = (var9 >> 1) + var1; // L: 395
				var12 = (var9 + 1 >> 1) + var1; // L: 396
			} else {
				var11 = var1; // L: 399
				var12 = var1 + 1; // L: 400
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 402
				var13 = (var10 >> 1) + var2; // L: 403
				var14 = var2 + (var10 + 1 >> 1); // L: 404
			} else {
				var13 = var2; // L: 407
				var14 = var2 + 1; // L: 408
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 410
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2; // L: 411
			int var17 = (var1 << 7) + (var9 << 6); // L: 412
			int var18 = (var2 << 7) + (var10 << 6); // L: 413
			long var19 = class103.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 414
			int var21 = var5 + (var4 << 6); // L: 415
			if (var8.int3 == 1) { // L: 416
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 417
				class388.method7347(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 418
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 419
					if (var8.animationId == -1 && var8.transforms == null) { // L: 421
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 422
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 423
					if (var8.interactType == 1 && var7 != null) { // L: 424
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 427
					int[] var10000;
					if (var5 >= 12) { // L: 448
						if (var8.animationId == -1 && var8.transforms == null) { // L: 450
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 451
						}

						var6.method4532(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 452
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 453
							var10000 = class17.field88[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 454
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 457
						if (var8.animationId == -1 && var8.transforms == null) { // L: 459
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 460
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field998[var4], 0, var19, var21); // L: 461
						if (var4 == 0) { // L: 462
							if (var8.clipped) { // L: 463
								Decimator.field405[var0][var1][var2] = 50; // L: 464
								Decimator.field405[var0][var1][var2 + 1] = 50; // L: 465
							}

							if (var8.modelClipped) { // L: 467
								var10000 = class17.field88[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 469
							if (var8.clipped) { // L: 470
								Decimator.field405[var0][var1][var2 + 1] = 50; // L: 471
								Decimator.field405[var0][var1 + 1][var2 + 1] = 50; // L: 472
							}

							if (var8.modelClipped) { // L: 474
								var10000 = class17.field88[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 476
							if (var8.clipped) { // L: 477
								Decimator.field405[var0][var1 + 1][var2] = 50; // L: 478
								Decimator.field405[var0][var1 + 1][var2 + 1] = 50; // L: 479
							}

							if (var8.modelClipped) { // L: 481
								var10000 = class17.field88[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 483
							if (var8.clipped) { // L: 484
								Decimator.field405[var0][var1][var2] = 50; // L: 485
								Decimator.field405[var0][var1 + 1][var2] = 50; // L: 486
							}

							if (var8.modelClipped) { // L: 488
								var10000 = class17.field88[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 490
							var7.method4114(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 491
							var6.method4531(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 494
						if (var8.animationId == -1 && var8.transforms == null) { // L: 496
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 497
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21); // L: 498
						if (var8.clipped) { // L: 499
							if (var4 == 0) { // L: 500
								Decimator.field405[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 501
								Decimator.field405[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 502
								Decimator.field405[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 503
								Decimator.field405[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 505
							var7.method4114(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 508
							var22 = var4 + 1 & 3; // L: 509
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 512
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 513
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 514
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 517
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 518
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field998[var4], Tiles.field998[var22], var19, var21); // L: 520
							if (var8.modelClipped) { // L: 521
								if (var4 == 0) { // L: 522
									var10000 = class17.field88[var0][var1]; // L: 523
									var10000[var2] |= 585;
									var10000 = class17.field88[var0][var1]; // L: 524
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) { // L: 526
									var10000 = class17.field88[var0][var1]; // L: 527
									var10000[1 + var2] |= 1170;
									var10000 = class17.field88[var0][var1 + 1]; // L: 528
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 530
									var10000 = class17.field88[var0][var1 + 1]; // L: 531
									var10000[var2] |= 585;
									var10000 = class17.field88[var0][var1]; // L: 532
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 534
									var10000 = class17.field88[var0][var1]; // L: 535
									var10000[var2] |= 1170;
									var10000 = class17.field88[var0][var1]; // L: 536
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 539
								var7.method4114(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 540
								var6.method4531(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 543
							if (var8.animationId == -1 && var8.transforms == null) { // L: 545
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 546
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21); // L: 547
							if (var8.clipped) { // L: 548
								if (var4 == 0) { // L: 549
									Decimator.field405[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 550
									Decimator.field405[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 551
									Decimator.field405[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 552
									Decimator.field405[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 554
								var7.method4114(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 557
							if (var8.animationId == -1 && var8.transforms == null) { // L: 559
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 560
							}

							var6.method4532(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 561
							if (var8.interactType != 0 && var7 != null) { // L: 562
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 563
								var6.method4531(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 566
							if (var8.animationId == -1 && var8.transforms == null) { // L: 568
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 569
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field998[var4], 0, 0, 0, var19, var21); // L: 570
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 573
								var22 = 16; // L: 574
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 575
								if (var23 != 0L) { // L: 576
									var22 = DecorativeObject.getObjectDefinition(class279.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 578
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 579
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field998[var4], 0, var22 * Tiles.field1000[var4], var22 * Tiles.field1002[var4], var19, var21); // L: 580
							} else if (var5 == 6) { // L: 583
								var22 = 8; // L: 584
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 585
								if (0L != var23) { // L: 586
									var22 = DecorativeObject.getObjectDefinition(class279.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 588
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 589
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1003[var4], var22 * Tiles.field1004[var4], var19, var21); // L: 590
							} else if (var5 == 7) { // L: 593
								var28 = var4 + 2 & 3; // L: 595
								if (var8.animationId == -1 && var8.transforms == null) { // L: 596
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 597
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 598
							} else if (var5 == 8) { // L: 601
								var22 = 8; // L: 602
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 603
								if (0L != var23) { // L: 604
									var22 = DecorativeObject.getObjectDefinition(class279.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 607
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 608
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 609
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 610
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 613
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 614
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1003[var4], var22 * Tiles.field1004[var4], var19, var21); // L: 616
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 429
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 430
					}

					if (var29 != null && var6.method4532(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 431 432
						var28 = 15; // L: 433
						if (var29 instanceof Model) { // L: 434
							var28 = ((Model)var29).method4625() / 4; // L: 435
							if (var28 > 30) { // L: 436
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 438
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 439
								if (var28 > Decimator.field405[var0][var31 + var1][var32 + var2]) { // L: 440
									Decimator.field405[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 445
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 425 446 455 492 506 541 555 564 571 581 591 599 617 619
}
