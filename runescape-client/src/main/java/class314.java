import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mb
@ObfuscatedName("mj")
public final class class314 {
	@ObfuscatedName("ak")
	static final HashMap field3402;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("clock")
	static Clock clock;

	static {
		field3402 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5898("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-1775212150"
	)
	static TimeZone method5898(String var0) {
		synchronized(field3402) { // L: 22
			TimeZone var2 = (TimeZone)field3402.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3402.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	public static boolean method5899(int var0) {
		return var0 >= WorldMapDecorationType.field3878.id && var0 <= WorldMapDecorationType.field3875.id; // L: 47
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "-13"
	)
	static Date method5897() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1221
		var0.set(2, 0); // L: 1222
		var0.set(5, 1); // L: 1223
		var0.set(1, 1900); // L: 1224
		return var0.getTime(); // L: 1225
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjt;Lih;I)V",
		garbageValue = "-1981678396"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 352 353 354
			if (var0 < Tiles.Tiles_minPlane) { // L: 357
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class91.getObjectDefinition(var3); // L: 358
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 361
				var9 = var8.sizeX; // L: 366
				var10 = var8.sizeY; // L: 367
			} else {
				var9 = var8.sizeY; // L: 362
				var10 = var8.sizeX; // L: 363
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 373
				var11 = (var9 >> 1) + var1; // L: 374
				var12 = (var9 + 1 >> 1) + var1; // L: 375
			} else {
				var11 = var1; // L: 378
				var12 = var1 + 1; // L: 379
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 381
				var13 = (var10 >> 1) + var2; // L: 382
				var14 = var2 + (var10 + 1 >> 1); // L: 383
			} else {
				var13 = var2; // L: 386
				var14 = var2 + 1; // L: 387
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 389
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 390
			int var17 = (var1 << 7) + (var9 << 6); // L: 391
			int var18 = (var2 << 7) + (var10 << 6); // L: 392
			long var19 = GrandExchangeOfferAgeComparator.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 393
			int var21 = var5 + (var4 << 6); // L: 394
			if (var8.int3 == 1) { // L: 395
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 396
				LoginScreenAnimation.method2497(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 397
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 398
					if (var8.animationId == -1 && var8.transforms == null) { // L: 400
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 401
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 402
					if (var8.interactType == 1 && var7 != null) { // L: 403
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 406
					int[] var10000;
					if (var5 >= 12) { // L: 427
						if (var8.animationId == -1 && var8.transforms == null) { // L: 429
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 430
						}

						var6.method4716(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 431
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 432
							var10000 = UserComparator6.field1486[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 433
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 436
						if (var8.animationId == -1 && var8.transforms == null) { // L: 438
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 439
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1036[var4], 0, var19, var21); // L: 440
						if (var4 == 0) { // L: 441
							if (var8.clipped) { // L: 442
								Tiles.field1045[var0][var1][var2] = 50; // L: 443
								Tiles.field1045[var0][var1][var2 + 1] = 50; // L: 444
							}

							if (var8.modelClipped) { // L: 446
								var10000 = UserComparator6.field1486[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 448
							if (var8.clipped) { // L: 449
								Tiles.field1045[var0][var1][var2 + 1] = 50; // L: 450
								Tiles.field1045[var0][var1 + 1][var2 + 1] = 50; // L: 451
							}

							if (var8.modelClipped) { // L: 453
								var10000 = UserComparator6.field1486[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 455
							if (var8.clipped) { // L: 456
								Tiles.field1045[var0][var1 + 1][var2] = 50; // L: 457
								Tiles.field1045[var0][var1 + 1][var2 + 1] = 50; // L: 458
							}

							if (var8.modelClipped) { // L: 460
								var10000 = UserComparator6.field1486[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 462
							if (var8.clipped) { // L: 463
								Tiles.field1045[var0][var1][var2] = 50; // L: 464
								Tiles.field1045[var0][var1 + 1][var2] = 50; // L: 465
							}

							if (var8.modelClipped) { // L: 467
								var10000 = UserComparator6.field1486[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 469
							var7.method4331(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 470
							var6.method4726(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 473
						if (var8.animationId == -1 && var8.transforms == null) { // L: 475
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 476
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1037[var4], 0, var19, var21); // L: 477
						if (var8.clipped) { // L: 478
							if (var4 == 0) { // L: 479
								Tiles.field1045[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 480
								Tiles.field1045[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 481
								Tiles.field1045[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 482
								Tiles.field1045[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 484
							var7.method4331(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 487
							var22 = var4 + 1 & 3; // L: 488
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 491
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 492
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 493
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 496
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 497
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1036[var4], Tiles.field1036[var22], var19, var21); // L: 499
							if (var8.modelClipped) { // L: 500
								if (var4 == 0) { // L: 501
									var10000 = UserComparator6.field1486[var0][var1]; // L: 502
									var10000[var2] |= 585;
									var10000 = UserComparator6.field1486[var0][var1]; // L: 503
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 505
									var10000 = UserComparator6.field1486[var0][var1]; // L: 506
									var10000[var2 + 1] |= 1170;
									var10000 = UserComparator6.field1486[var0][var1 + 1]; // L: 507
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 509
									var10000 = UserComparator6.field1486[var0][var1 + 1]; // L: 510
									var10000[var2] |= 585;
									var10000 = UserComparator6.field1486[var0][var1]; // L: 511
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 513
									var10000 = UserComparator6.field1486[var0][var1]; // L: 514
									var10000[var2] |= 1170;
									var10000 = UserComparator6.field1486[var0][var1]; // L: 515
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 518
								var7.method4331(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 519
								var6.method4726(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 522
							if (var8.animationId == -1 && var8.transforms == null) { // L: 524
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 525
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1037[var4], 0, var19, var21); // L: 526
							if (var8.clipped) { // L: 527
								if (var4 == 0) { // L: 528
									Tiles.field1045[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 529
									Tiles.field1045[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 530
									Tiles.field1045[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 531
									Tiles.field1045[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 533
								var7.method4331(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 536
							if (var8.animationId == -1 && var8.transforms == null) { // L: 538
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 539
							}

							var6.method4716(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 540
							if (var8.interactType != 0 && var7 != null) { // L: 541
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 542
								var6.method4726(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 545
							if (var8.animationId == -1 && var8.transforms == null) { // L: 547
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 548
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1036[var4], 0, 0, 0, var19, var21); // L: 549
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 552
								var22 = 16; // L: 553
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 554
								if (var23 != 0L) { // L: 555
									var22 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 557
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 558
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1036[var4], 0, var22 * Tiles.field1038[var4], var22 * Tiles.field1033[var4], var19, var21); // L: 559
							} else if (var5 == 6) { // L: 562
								var22 = 8; // L: 563
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 564
								if (var23 != 0L) { // L: 565
									var22 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 567
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 568
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1040[var4], var22 * Tiles.field1042[var4], var19, var21); // L: 569
							} else if (var5 == 7) { // L: 572
								var28 = var4 + 2 & 3; // L: 574
								if (var8.animationId == -1 && var8.transforms == null) { // L: 575
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 576
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 577
							} else if (var5 == 8) { // L: 580
								var22 = 8; // L: 581
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 582
								if (var23 != 0L) { // L: 583
									var22 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 586
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 587
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 588
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 589
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 592
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 593
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1040[var4], var22 * Tiles.field1042[var4], var19, var21); // L: 595
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 408
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 409
					}

					if (var29 != null && var6.method4716(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 410 411
						var28 = 15; // L: 412
						if (var29 instanceof Model) { // L: 413
							var28 = ((Model)var29).method4912() / 4; // L: 414
							if (var28 > 30) { // L: 415
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 417
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 418
								if (var28 > Tiles.field1045[var0][var31 + var1][var32 + var2]) { // L: 419
									Tiles.field1045[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 424
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 404 425 434 471 485 520 534 543 550 560 570 578 596 598

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-176913511"
	)
	static void method5896() {
		int var0;
		if (Client.field577 == class94.field1161) { // L: 1453
			class10.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1454

			for (var0 = 0; var0 < 4; ++var0) { // L: 1455
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			SpriteMask.field3559 = new SpritePixels(512, 512); // L: 1456
			Login.Login_loadingText = "Starting game engine..."; // L: 1457
			Login.Login_loadingPercent = 5; // L: 1458
			Client.field577 = class94.field1149; // L: 1459
		} else if (class94.field1149 == Client.field577) { // L: 1462
			Login.Login_loadingText = "Prepared visibility map"; // L: 1463
			Login.Login_loadingPercent = 10; // L: 1464
			Client.field577 = class94.field1156; // L: 1465
		} else {
			Archive var39;
			if (class94.field1156 == Client.field577) { // L: 1468
				class92.field1117 = class202.newArchive(0, false, true, true, false); // L: 1469
				class199.field2009 = class202.newArchive(1, false, true, true, false); // L: 1470
				SoundSystem.archive2 = class202.newArchive(2, true, false, true, false); // L: 1471
				AbstractByteArrayCopier.field3839 = class202.newArchive(3, false, true, true, false); // L: 1472
				class469.field4812 = class202.newArchive(4, false, true, true, false); // L: 1473
				class198.archive9 = class202.newArchive(5, true, true, true, false); // L: 1474
				CollisionMap.field2392 = class202.newArchive(6, true, true, true, false); // L: 1475
				GrandExchangeOfferOwnWorldComparator.field515 = class202.newArchive(7, false, true, true, false); // L: 1476
				class199.field2010 = class202.newArchive(8, false, true, true, false); // L: 1477
				class241.field2558 = class202.newArchive(9, false, true, true, false); // L: 1478
				class190.field1916 = class202.newArchive(10, false, true, true, false); // L: 1479
				Language.field4435 = class202.newArchive(11, false, true, true, false); // L: 1480
				class421.archive12 = class202.newArchive(12, false, true, true, false); // L: 1481
				class27.archive13 = class202.newArchive(13, true, false, true, false); // L: 1482
				ArchiveDiskAction.field4291 = class202.newArchive(14, false, true, true, false); // L: 1483
				class317.field3415 = class202.newArchive(15, false, true, true, false); // L: 1484
				WorldMapDecorationType.field3881 = class202.newArchive(17, true, true, true, false); // L: 1485
				class358.field3898 = class202.newArchive(18, false, true, true, false); // L: 1486
				class245.field2658 = class202.newArchive(19, false, true, true, false); // L: 1487
				HorizontalAlignment.field2028 = class202.newArchive(20, false, true, true, false); // L: 1488
				class313.field3396 = class202.newArchive(21, false, true, true, false); // L: 1489
				ArchiveDisk var36 = null; // L: 1492
				if (JagexCache.JagexCache_dat2File != null) { // L: 1493
					var36 = new ArchiveDisk(22, JagexCache.JagexCache_dat2File, UserComparator8.JagexCache_idxFiles[22], 1000000); // L: 1494
				}

				var39 = new Archive(var36, UserComparator10.field1480, class59.field452, 22, false, true, true, true, true); // L: 1496
				class319.field3442 = var39; // L: 1498
				Login.Login_loadingText = "Connecting to update server"; // L: 1499
				Login.Login_loadingPercent = 20; // L: 1500
				Client.field577 = class94.field1151; // L: 1501
			} else if (class94.field1151 == Client.field577) { // L: 1504
				byte var33 = 0; // L: 1505
				var0 = var33 + class92.field1117.percentage() * 4 / 100; // L: 1506
				var0 += class199.field2009.percentage() * 4 / 100; // L: 1507
				var0 += SoundSystem.archive2.percentage() * 2 / 100; // L: 1508
				var0 += AbstractByteArrayCopier.field3839.percentage() * 2 / 100; // L: 1509
				var0 += class469.field4812.percentage() * 6 / 100; // L: 1510
				var0 += class198.archive9.percentage() * 4 / 100; // L: 1511
				var0 += CollisionMap.field2392.percentage() * 2 / 100; // L: 1512
				var0 += GrandExchangeOfferOwnWorldComparator.field515.percentage() * 54 / 100; // L: 1513
				var0 += class199.field2010.percentage() * 2 / 100; // L: 1514
				var0 += class241.field2558.percentage() * 2 / 100; // L: 1515
				var0 += class190.field1916.percentage() * 2 / 100; // L: 1516
				var0 += Language.field4435.percentage() * 2 / 100; // L: 1517
				var0 += class421.archive12.percentage() * 2 / 100; // L: 1518
				var0 += class27.archive13.percentage() * 2 / 100; // L: 1519
				var0 += ArchiveDiskAction.field4291.percentage() * 2 / 100; // L: 1520
				var0 += class317.field3415.percentage() * 2 / 100; // L: 1521
				var0 += class245.field2658.percentage() / 100; // L: 1522
				var0 += class358.field3898.percentage() / 100; // L: 1523
				var0 += HorizontalAlignment.field2028.percentage() / 100; // L: 1524
				var0 += class313.field3396.percentage() / 100; // L: 1525
				var0 += class319.field3442.percentage() / 100; // L: 1526
				var0 += WorldMapDecorationType.field3881.method6856() && WorldMapDecorationType.field3881.isFullyLoaded() ? 1 : 0; // L: 1527
				if (var0 != 100) { // L: 1528
					if (var0 != 0) { // L: 1529
						Login.Login_loadingText = "Checking for updates - " + var0 + "%";
					}

					Login.Login_loadingPercent = 30; // L: 1530
				} else {
					class331.method6210(class92.field1117, "Animations"); // L: 1533
					class331.method6210(class199.field2009, "Skeletons"); // L: 1534
					class331.method6210(class469.field4812, "Sound FX"); // L: 1535
					class331.method6210(class198.archive9, "Maps"); // L: 1536
					class331.method6210(CollisionMap.field2392, "Music Tracks"); // L: 1537
					class331.method6210(GrandExchangeOfferOwnWorldComparator.field515, "Models"); // L: 1538
					class331.method6210(class199.field2010, "Sprites"); // L: 1539
					class331.method6210(Language.field4435, "Music Jingles"); // L: 1540
					class331.method6210(ArchiveDiskAction.field4291, "Music Samples"); // L: 1541
					class331.method6210(class317.field3415, "Music Patches"); // L: 1542
					class331.method6210(class245.field2658, "World Map"); // L: 1543
					class331.method6210(class358.field3898, "World Map Geography"); // L: 1544
					class331.method6210(HorizontalAlignment.field2028, "World Map Ground"); // L: 1545
					class241.field2562 = new GraphicsDefaults(); // L: 1546
					class241.field2562.decode(WorldMapDecorationType.field3881); // L: 1547
					Login.Login_loadingText = "Loaded update list"; // L: 1548
					Login.Login_loadingPercent = 30; // L: 1549
					Client.field577 = class94.field1152; // L: 1550
				}
			} else {
				int var5;
				if (class94.field1152 == Client.field577) { // L: 1553
					class133.method3060(22050, !Client.isLowDetail, 2); // L: 1554
					ArrayList var41 = new ArrayList(3); // L: 1555
					TaskHandler var28 = GameEngine.taskHandler; // L: 1557
					short var29 = 2048; // L: 1558
					if (var29 < 256) { // L: 1562
						var29 = 256;
					}

					PcmPlayer var34;
					try {
						PcmPlayer var25 = class16.pcmPlayerProvider.player(); // L: 1564
						var25.samples = new int[(class306.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 1565
						var25.field289 = var29; // L: 1566
						var25.init(); // L: 1567
						var25.capacity = (var29 & -1024) + 1024; // L: 1568
						if (var25.capacity > 16384) { // L: 1569
							var25.capacity = 16384;
						}

						var25.open(var25.capacity); // L: 1570
						if (class225.field2372 > 0 && UserComparator4.soundSystem == null) { // L: 1571
							UserComparator4.soundSystem = new SoundSystem(); // L: 1572
							class353.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 1573
							class353.soundSystemExecutor.scheduleAtFixedRate(UserComparator4.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 1574
						}

						if (UserComparator4.soundSystem != null) { // L: 1576
							if (UserComparator4.soundSystem.players[0] != null) { // L: 1577
								throw new IllegalArgumentException();
							}

							UserComparator4.soundSystem.players[0] = var25; // L: 1578
						}

						var34 = var25; // L: 1580
					} catch (Throwable var22) { // L: 1583
						var34 = new PcmPlayer(); // L: 1584
					}

					class171.pcmPlayer1 = var34; // L: 1586
					class140.pcmStreamMixer = new PcmStreamMixer(); // L: 1587
					PcmStreamMixer var27 = new PcmStreamMixer(); // L: 1588
					var27.addSubStream(class140.pcmStreamMixer); // L: 1589

					for (var5 = 0; var5 < 3; ++var5) { // L: 1590
						MidiPcmStream var31 = new MidiPcmStream(); // L: 1591
						var31.method5980(9, 128); // L: 1592
						var27.addSubStream(var31); // L: 1593
						var41.add(var31); // L: 1594
					}

					class171.pcmPlayer1.setStream(var27); // L: 1596
					class1.method9(class317.field3415, ArchiveDiskAction.field4291, class469.field4812, var41); // L: 1597
					class136.decimator = new Decimator(22050, PcmPlayer.field306); // L: 1598
					Login.Login_loadingText = "Prepared sound engine"; // L: 1599
					Login.Login_loadingPercent = 35; // L: 1600
					Client.field577 = class94.field1158; // L: 1601
					class353.field3846 = new Fonts(class199.field2010, class27.archive13); // L: 1602
				} else {
					int var14;
					if (class94.field1158 == Client.field577) { // L: 1605
						FontName[] var40 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13}; // L: 1608
						var14 = var40.length; // L: 1610
						Fonts var26 = class353.field3846; // L: 1611
						FontName[] var42 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13}; // L: 1614
						Client.field636 = var26.createMap(var42); // L: 1616
						if (Client.field636.size() < var14) { // L: 1617
							Login.Login_loadingText = "Loading fonts - " + Client.field636.size() * 100 / var14 + "%"; // L: 1618
							Login.Login_loadingPercent = 40; // L: 1619
						} else {
							class14.field80 = (Font)Client.field636.get(FontName.FontName_plain11); // L: 1622
							UserComparator6.fontPlain12 = (Font)Client.field636.get(FontName.FontName_plain12); // L: 1623
							SoundCache.fontBold12 = (Font)Client.field636.get(FontName.FontName_bold12); // L: 1624
							Skeleton.field2583 = Client.field737.get(); // L: 1625
							Login.Login_loadingText = "Loaded fonts"; // L: 1626
							Login.Login_loadingPercent = 40; // L: 1627
							Client.field577 = class94.field1154; // L: 1628
						}
					} else {
						Archive var2;
						int var3;
						if (Client.field577 == class94.field1154) { // L: 1631
							var0 = Archive.method6897(class190.field1916, class199.field2010); // L: 1632
							var2 = class199.field2010; // L: 1634
							var3 = Login.field939.length + Login.field962.length; // L: 1636
							String[] var24 = Login.field961; // L: 1638

							for (var5 = 0; var5 < var24.length; ++var5) { // L: 1639
								String var30 = var24[var5]; // L: 1640
								if (var2.getGroupId(var30) != -1) { // L: 1642
									++var3; // L: 1643
								}
							}

							if (var0 < var3) { // L: 1651
								Login.Login_loadingText = "Loading title screen - " + var0 * 100 / var3 + "%"; // L: 1652
								Login.Login_loadingPercent = 50; // L: 1653
							} else {
								Login.Login_loadingText = "Loaded title screen"; // L: 1656
								Login.Login_loadingPercent = 50; // L: 1657
								DefaultsGroup.method8263(5); // L: 1658
								Client.field577 = class94.field1155; // L: 1659
							}
						} else if (class94.field1155 == Client.field577) { // L: 1662
							if (!SoundSystem.archive2.isFullyLoaded()) { // L: 1663
								Login.Login_loadingText = "Loading config - " + SoundSystem.archive2.loadPercent() + "%"; // L: 1664
								Login.Login_loadingPercent = 60; // L: 1665
							} else if (!class313.field3396.isFullyLoaded()) { // L: 1668
								Login.Login_loadingText = "Loading config - " + (80 + class421.archive12.loadPercent() / 6) + "%"; // L: 1669
								Login.Login_loadingPercent = 60; // L: 1670
							} else {
								class191.method3628(SoundSystem.archive2); // L: 1673
								var39 = SoundSystem.archive2; // L: 1674
								FloorUnderlayDefinition.field2130 = var39; // L: 1676
								class145.method3155(SoundSystem.archive2, GrandExchangeOfferOwnWorldComparator.field515); // L: 1678
								class517.method9041(SoundSystem.archive2, GrandExchangeOfferOwnWorldComparator.field515, Client.isLowDetail); // L: 1679
								Archive var32 = SoundSystem.archive2; // L: 1680
								var2 = GrandExchangeOfferOwnWorldComparator.field515; // L: 1681
								NPCComposition.NpcDefinition_archive = var32; // L: 1683
								NPCComposition.field2085 = var2; // L: 1684
								class142.method3135(SoundSystem.archive2); // L: 1686
								Projectile.method2185(SoundSystem.archive2, GrandExchangeOfferOwnWorldComparator.field515, Client.isMembersWorld, class14.field80); // L: 1687
								class138.method3079(SoundSystem.archive2, class92.field1117, class199.field2009); // L: 1688
								Archive var15 = SoundSystem.archive2; // L: 1689
								Archive var4 = GrandExchangeOfferOwnWorldComparator.field515; // L: 1690
								SpotAnimationDefinition.SpotAnimationDefinition_archive = var15; // L: 1692
								SpotAnimationDefinition.field2116 = var4; // L: 1693
								Archive var43 = SoundSystem.archive2; // L: 1695
								VarbitComposition.VarbitDefinition_archive = var43; // L: 1697
								Archive var6 = SoundSystem.archive2; // L: 1699
								VarpDefinition.VarpDefinition_archive = var6; // L: 1701
								VarpDefinition.field1924 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1702
								class33.field184 = new class338(AbstractByteArrayCopier.field3839, GrandExchangeOfferOwnWorldComparator.field515, class199.field2010, class27.archive13, class319.field3442); // L: 1704
								Decimator.method1135(SoundSystem.archive2); // L: 1705
								class275.method5567(SoundSystem.archive2); // L: 1706
								class135.method3075(SoundSystem.archive2); // L: 1707
								Message.method1201(SoundSystem.archive2); // L: 1708
								FloorOverlayDefinition.method4157(SoundSystem.archive2); // L: 1709
								MilliClock.method3572(SoundSystem.archive2); // L: 1710
								Varcs.method2787(SoundSystem.archive2); // L: 1711
								HealthBarDefinition.Widget_cachedModels = new class512(UrlRequester.field1436, 54, WorldMapLabelSize.clientLanguage, SoundSystem.archive2); // L: 1712
								class53.Widget_cachedFonts = new class512(UrlRequester.field1436, 47, WorldMapLabelSize.clientLanguage, SoundSystem.archive2); // L: 1713
								class33.varcs = new Varcs(); // L: 1714
								UserComparator9.method2917(SoundSystem.archive2, class199.field2010, class27.archive13); // L: 1715
								Archive var35 = SoundSystem.archive2; // L: 1716
								Archive var8 = class199.field2010; // L: 1717
								HealthBarDefinition.HealthBarDefinition_archive = var35; // L: 1719
								HealthBarDefinition.field1979 = var8; // L: 1720
								Archive var37 = SoundSystem.archive2; // L: 1722
								Archive var10 = class199.field2010; // L: 1723
								WorldMapElement.WorldMapElement_archive = var10; // L: 1725
								if (var37.isFullyLoaded()) { // L: 1726
									DevicePcmPlayerProvider.WorldMapElement_count = var37.getGroupFileCount(35); // L: 1729
									WorldMapElement.WorldMapElement_cached = new WorldMapElement[DevicePcmPlayerProvider.WorldMapElement_count]; // L: 1730

									for (int var11 = 0; var11 < DevicePcmPlayerProvider.WorldMapElement_count; ++var11) { // L: 1731
										byte[] var12 = var37.takeFile(35, var11); // L: 1732
										WorldMapElement.WorldMapElement_cached[var11] = new WorldMapElement(var11); // L: 1733
										if (var12 != null) { // L: 1734
											WorldMapElement.WorldMapElement_cached[var11].decode(new Buffer(var12)); // L: 1735
											WorldMapElement.WorldMapElement_cached[var11].method3666(); // L: 1736
										}
									}
								}

								Login.Login_loadingText = "Loaded config"; // L: 1740
								Login.Login_loadingPercent = 60; // L: 1741
								Client.field577 = class94.field1159; // L: 1742
							}
						} else if (class94.field1159 == Client.field577) { // L: 1745
							var0 = 0; // L: 1746
							if (class404.field4490 == null) { // L: 1747
								class404.field4490 = class47.SpriteBuffer_getSprite(class199.field2010, class241.field2562.field4758, 0);
							} else {
								++var0; // L: 1748
							}

							if (ParamComposition.redHintArrowSprite == null) { // L: 1749
								ParamComposition.redHintArrowSprite = class47.SpriteBuffer_getSprite(class199.field2010, class241.field2562.field4750, 0);
							} else {
								++var0; // L: 1750
							}

							IndexedSprite[] var1;
							if (KitDefinition.mapSceneSprites == null) { // L: 1751
								var2 = class199.field2010; // L: 1753
								var3 = class241.field2562.field4752; // L: 1754
								if (!class164.method3376(var2, var3, 0)) { // L: 1756
									var1 = null; // L: 1757
								} else {
									var1 = class512.method9001(); // L: 1760
								}

								KitDefinition.mapSceneSprites = var1; // L: 1762
							} else {
								++var0; // L: 1764
							}

							SpritePixels var7;
							byte[] var9;
							SpritePixels[] var16;
							int var17;
							int var18;
							int var19;
							SpritePixels[] var23;
							if (UserComparator4.field1452 == null) { // L: 1765
								var2 = class199.field2010; // L: 1767
								var3 = class241.field2562.field4749; // L: 1768
								if (!class164.method3376(var2, var3, 0)) { // L: 1770
									var23 = null; // L: 1771
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount]; // L: 1776
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453(); // L: 1790
											var23 = var16; // L: 1793
											break;
										}

										var7 = var16[var17] = new SpritePixels(); // L: 1778
										var7.width = class159.SpriteBuffer_spriteWidth; // L: 1779
										var7.height = class500.SpriteBuffer_spriteHeight; // L: 1780
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17]; // L: 1781
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17]; // L: 1782
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17]; // L: 1783
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17]; // L: 1784
										var18 = var7.subWidth * var7.subHeight; // L: 1785
										var9 = class414.SpriteBuffer_pixels[var17]; // L: 1786
										var7.pixels = new int[var18]; // L: 1787

										for (var19 = 0; var19 < var18; ++var19) { // L: 1788
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17; // L: 1777
									}
								}

								UserComparator4.field1452 = var23; // L: 1795
							} else {
								++var0; // L: 1797
							}

							if (class157.field1730 == null) { // L: 1798
								var2 = class199.field2010; // L: 1800
								var3 = class241.field2562.field4753; // L: 1801
								if (!class164.method3376(var2, var3, 0)) { // L: 1803
									var23 = null; // L: 1804
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount]; // L: 1809
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453(); // L: 1823
											var23 = var16; // L: 1826
											break;
										}

										var7 = var16[var17] = new SpritePixels(); // L: 1811
										var7.width = class159.SpriteBuffer_spriteWidth; // L: 1812
										var7.height = class500.SpriteBuffer_spriteHeight; // L: 1813
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17]; // L: 1814
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17]; // L: 1815
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17]; // L: 1816
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17]; // L: 1817
										var18 = var7.subHeight * var7.subWidth; // L: 1818
										var9 = class414.SpriteBuffer_pixels[var17]; // L: 1819
										var7.pixels = new int[var18]; // L: 1820

										for (var19 = 0; var19 < var18; ++var19) { // L: 1821
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17; // L: 1810
									}
								}

								class157.field1730 = var23; // L: 1828
							} else {
								++var0; // L: 1830
							}

							if (UserComparator8.field1457 == null) { // L: 1831
								var2 = class199.field2010; // L: 1833
								var3 = class241.field2562.field4754; // L: 1834
								if (!class164.method3376(var2, var3, 0)) { // L: 1836
									var23 = null; // L: 1837
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount]; // L: 1842
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453(); // L: 1856
											var23 = var16; // L: 1859
											break;
										}

										var7 = var16[var17] = new SpritePixels(); // L: 1844
										var7.width = class159.SpriteBuffer_spriteWidth; // L: 1845
										var7.height = class500.SpriteBuffer_spriteHeight; // L: 1846
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17]; // L: 1847
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17]; // L: 1848
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17]; // L: 1849
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17]; // L: 1850
										var18 = var7.subHeight * var7.subWidth; // L: 1851
										var9 = class414.SpriteBuffer_pixels[var17]; // L: 1852
										var7.pixels = new int[var18]; // L: 1853

										for (var19 = 0; var19 < var18; ++var19) { // L: 1854
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17; // L: 1843
									}
								}

								UserComparator8.field1457 = var23; // L: 1861
							} else {
								++var0; // L: 1863
							}

							if (class47.field343 == null) { // L: 1864
								class47.field343 = ScriptEvent.method2331(class199.field2010, class241.field2562.field4755, 0);
							} else {
								++var0; // L: 1865
							}

							if (EnumComposition.field2021 == null) { // L: 1866
								var2 = class199.field2010; // L: 1868
								var3 = class241.field2562.field4756; // L: 1869
								if (!class164.method3376(var2, var3, 0)) { // L: 1871
									var23 = null; // L: 1872
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount]; // L: 1877
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453(); // L: 1891
											var23 = var16; // L: 1894
											break;
										}

										var7 = var16[var17] = new SpritePixels(); // L: 1879
										var7.width = class159.SpriteBuffer_spriteWidth; // L: 1880
										var7.height = class500.SpriteBuffer_spriteHeight; // L: 1881
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17]; // L: 1882
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17]; // L: 1883
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17]; // L: 1884
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17]; // L: 1885
										var18 = var7.subWidth * var7.subHeight; // L: 1886
										var9 = class414.SpriteBuffer_pixels[var17]; // L: 1887
										var7.pixels = new int[var18]; // L: 1888

										for (var19 = 0; var19 < var18; ++var19) { // L: 1889
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17; // L: 1878
									}
								}

								EnumComposition.field2021 = var23; // L: 1896
							} else {
								++var0; // L: 1898
							}

							if (class103.field1336 == null) { // L: 1899
								class103.field1336 = ScriptEvent.method2331(class199.field2010, class241.field2562.field4757, 0);
							} else {
								++var0; // L: 1900
							}

							if (class36.scrollBarSprites == null) { // L: 1901
								var2 = class199.field2010; // L: 1903
								var3 = class241.field2562.field4751; // L: 1904
								if (!class164.method3376(var2, var3, 0)) { // L: 1906
									var1 = null; // L: 1907
								} else {
									var1 = class512.method9001(); // L: 1910
								}

								class36.scrollBarSprites = var1; // L: 1912
							} else {
								++var0; // L: 1914
							}

							if (class178.field1854 == null) { // L: 1915
								var2 = class199.field2010; // L: 1917
								var3 = class241.field2562.field4759; // L: 1918
								if (!class164.method3376(var2, var3, 0)) { // L: 1920
									var1 = null; // L: 1921
								} else {
									var1 = class512.method9001(); // L: 1924
								}

								class178.field1854 = var1; // L: 1926
							} else {
								++var0; // L: 1928
							}

							if (var0 < 11) { // L: 1929
								Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%"; // L: 1930
								Login.Login_loadingPercent = 70; // L: 1931
							} else {
								AbstractFont.AbstractFont_modIconSprites = class178.field1854; // L: 1934
								ParamComposition.redHintArrowSprite.normalize(); // L: 1935
								var14 = (int)(Math.random() * 21.0D) - 10; // L: 1936
								int var20 = (int)(Math.random() * 21.0D) - 10; // L: 1937
								var3 = (int)(Math.random() * 21.0D) - 10; // L: 1938
								int var21 = (int)(Math.random() * 41.0D) - 20; // L: 1939
								KitDefinition.mapSceneSprites[0].shiftColors(var21 + var14, var20 + var21, var21 + var3); // L: 1940
								Login.Login_loadingText = "Loaded sprites"; // L: 1941
								Login.Login_loadingPercent = 70; // L: 1942
								Client.field577 = class94.field1157; // L: 1943
							}
						} else if (class94.field1157 == Client.field577) { // L: 1946
							if (!class241.field2558.isFullyLoaded()) { // L: 1947
								Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1948
								Login.Login_loadingPercent = 90; // L: 1949
							} else {
								class305.field3129 = new TextureProvider(class241.field2558, class199.field2010, 20, class91.clientPreferences.method2513(), Client.isLowDetail ? 64 : 128); // L: 1952
								Rasterizer3D.method4519(class305.field3129); // L: 1953
								Rasterizer3D.method4517(class91.clientPreferences.method2513()); // L: 1954
								Client.field577 = class94.field1164; // L: 1955
							}
						} else if (class94.field1164 == Client.field577) { // L: 1958
							var0 = class305.field3129.getLoadedPercentage(); // L: 1959
							if (var0 < 100) { // L: 1960
								Login.Login_loadingText = "Loading textures - " + var0 + "%"; // L: 1961
								Login.Login_loadingPercent = 90; // L: 1962
							} else {
								Login.Login_loadingText = "Loaded textures"; // L: 1965
								Login.Login_loadingPercent = 90; // L: 1966
								Client.field577 = class94.field1160; // L: 1967
							}
						} else if (class94.field1160 == Client.field577) { // L: 1970
							class233.mouseRecorder = new MouseRecorder(); // L: 1971
							GameEngine.taskHandler.newThreadTask(class233.mouseRecorder, 10); // L: 1972
							Login.Login_loadingText = "Loaded input handler"; // L: 1973
							Login.Login_loadingPercent = 92; // L: 1974
							Client.field577 = class94.field1148; // L: 1975
						} else if (Client.field577 == class94.field1148) { // L: 1978
							if (!class190.field1916.tryLoadFileByNames("huffman", "")) { // L: 1979
								Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1980
								Login.Login_loadingPercent = 94; // L: 1981
							} else {
								Huffman var38 = new Huffman(class190.field1916.takeFileByNames("huffman", "")); // L: 1984
								class349.huffman = var38; // L: 1986
								Login.Login_loadingText = "Loaded wordpack"; // L: 1988
								Login.Login_loadingPercent = 94; // L: 1989
								Client.field577 = class94.field1153; // L: 1990
							}
						} else if (class94.field1153 == Client.field577) { // L: 1993
							if (!AbstractByteArrayCopier.field3839.isFullyLoaded()) { // L: 1994
								Login.Login_loadingText = "Loading interfaces - " + AbstractByteArrayCopier.field3839.loadPercent() * 4 / 5 + "%"; // L: 1995
								Login.Login_loadingPercent = 96; // L: 1996
							} else if (!class319.field3442.isFullyLoaded()) { // L: 1999
								Login.Login_loadingText = "Loading interfaces - " + class319.field3442.loadPercent() * 4 / 5 + "%"; // L: 2000
								Login.Login_loadingPercent = 96; // L: 2001
							} else if (!class421.archive12.isFullyLoaded()) { // L: 2004
								Login.Login_loadingText = "Loading interfaces - " + (80 + class421.archive12.loadPercent() / 6) + "%"; // L: 2005
								Login.Login_loadingPercent = 96; // L: 2006
							} else if (!class27.archive13.isFullyLoaded()) { // L: 2009
								Login.Login_loadingText = "Loading interfaces - " + (96 + class27.archive13.loadPercent() / 50) + "%"; // L: 2010
								Login.Login_loadingPercent = 96; // L: 2011
							} else {
								Login.Login_loadingText = "Loaded interfaces"; // L: 2014
								Login.Login_loadingPercent = 98; // L: 2015
								if (class421.archive12.isValidFileName("version.dat", "")) { // L: 2016
									Buffer var13 = new Buffer(class421.archive12.takeFileByNames("version.dat", "")); // L: 2017
									var13.readUnsignedShort(); // L: 2018
								}

								Client.field577 = class94.field1162; // L: 2020
							}
						} else if (class94.field1162 == Client.field577) { // L: 2023
							Login.Login_loadingPercent = 100; // L: 2024
							if (class245.field2658.getGroupCount() > 0 && !class245.field2658.tryLoadGroupByName(WorldMapCacheName.field3095.name)) { // L: 2025
								Login.Login_loadingText = "Loading world map - " + class245.field2658.groupLoadPercentByName(WorldMapCacheName.field3095.name) / 10 + "%"; // L: 2026
							} else {
								if (class434.worldMap == null) { // L: 2029
									class434.worldMap = new WorldMap(); // L: 2030
									class434.worldMap.init(class245.field2658, class358.field3898, HorizontalAlignment.field2028, SoundCache.fontBold12, Client.field636, KitDefinition.mapSceneSprites); // L: 2031
								}

								Login.Login_loadingText = "Loaded world map"; // L: 2033
								Client.field577 = class94.field1163; // L: 2034
							}
						} else {
							if (class94.field1163 == Client.field577) { // L: 2037
								DefaultsGroup.method8263(10); // L: 2038
							}

						}
					}
				}
			}
		}
	} // L: 1460 1466 1502 1531 1551 1603 1620 1629 1654 1660 1666 1671 1743 1932 1944 1950 1956 1963 1968 1976 1982 1991 1997 2002 2007 2012 2021 2027 2035 2040
}
