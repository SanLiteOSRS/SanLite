import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public enum class128 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	field1530(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	field1534(1, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	field1531(2, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	field1532(3, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	field1538(4, 4);

	@ObfuscatedName("al")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1352772367
	)
	final int field1529;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -497734091
	)
	final int field1535;

	class128(int var3, int var4) {
		this.field1529 = var3; // L: 121
		this.field1535 = var4; // L: 122
	} // L: 123

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1535; // L: 126
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILiv;Lis;I)V",
		garbageValue = "2027076041"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 341 342 343
			if (var0 < Tiles.Tiles_minPlane) { // L: 346
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = WorldMapElement.getObjectDefinition(var3); // L: 347
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 350
				var9 = var8.sizeX; // L: 355
				var10 = var8.sizeY; // L: 356
			} else {
				var9 = var8.sizeY; // L: 351
				var10 = var8.sizeX; // L: 352
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 362
				var11 = (var9 >> 1) + var1; // L: 363
				var12 = (var9 + 1 >> 1) + var1; // L: 364
			} else {
				var11 = var1; // L: 367
				var12 = var1 + 1; // L: 368
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 370
				var13 = (var10 >> 1) + var2; // L: 371
				var14 = var2 + (var10 + 1 >> 1); // L: 372
			} else {
				var13 = var2; // L: 375
				var14 = var2 + 1; // L: 376
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 378
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2; // L: 379
			int var17 = (var1 << 7) + (var9 << 6); // L: 380
			int var18 = (var2 << 7) + (var10 << 6); // L: 381
			long var19 = FontName.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 382
			int var21 = var5 + (var4 << 6); // L: 383
			if (var8.int3 == 1) { // L: 384
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 385
				class152.method3167(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 386
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 387
					if (var8.animationId == -1 && var8.transforms == null) { // L: 389
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 390
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 391
					if (var8.interactType == 1 && var7 != null) { // L: 392
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 395
					int[] var10000;
					if (var5 >= 12) { // L: 416
						if (var8.animationId == -1 && var8.transforms == null) { // L: 418
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 419
						}

						var6.method4535(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 420
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 421
							var10000 = BufferedNetSocket.field4679[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 422
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 425
						if (var8.animationId == -1 && var8.transforms == null) { // L: 427
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 428
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1042[var4], 0, var19, var21); // L: 429
						if (var4 == 0) { // L: 430
							if (var8.clipped) { // L: 431
								class217.field2409[var0][var1][var2] = 50; // L: 432
								class217.field2409[var0][var1][var2 + 1] = 50; // L: 433
							}

							if (var8.modelClipped) { // L: 435
								var10000 = BufferedNetSocket.field4679[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 437
							if (var8.clipped) { // L: 438
								class217.field2409[var0][var1][var2 + 1] = 50; // L: 439
								class217.field2409[var0][var1 + 1][var2 + 1] = 50; // L: 440
							}

							if (var8.modelClipped) { // L: 442
								var10000 = BufferedNetSocket.field4679[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 444
							if (var8.clipped) { // L: 445
								class217.field2409[var0][var1 + 1][var2] = 50; // L: 446
								class217.field2409[var0][var1 + 1][var2 + 1] = 50; // L: 447
							}

							if (var8.modelClipped) { // L: 449
								var10000 = BufferedNetSocket.field4679[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 451
							if (var8.clipped) { // L: 452
								class217.field2409[var0][var1][var2] = 50; // L: 453
								class217.field2409[var0][var1 + 1][var2] = 50; // L: 454
							}

							if (var8.modelClipped) { // L: 456
								var10000 = BufferedNetSocket.field4679[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 458
							var7.method4148(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 459
							var6.method4541(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 462
						if (var8.animationId == -1 && var8.transforms == null) { // L: 464
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 465
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1043[var4], 0, var19, var21); // L: 466
						if (var8.clipped) { // L: 467
							if (var4 == 0) { // L: 468
								class217.field2409[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 469
								class217.field2409[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 470
								class217.field2409[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 471
								class217.field2409[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 473
							var7.method4148(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 476
							var22 = var4 + 1 & 3; // L: 477
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 480
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 481
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 482
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 485
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 486
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1042[var4], Tiles.field1042[var22], var19, var21); // L: 488
							if (var8.modelClipped) { // L: 489
								if (var4 == 0) { // L: 490
									var10000 = BufferedNetSocket.field4679[var0][var1]; // L: 491
									var10000[var2] |= 585;
									var10000 = BufferedNetSocket.field4679[var0][var1]; // L: 492
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 494
									var10000 = BufferedNetSocket.field4679[var0][var1]; // L: 495
									var10000[var2 + 1] |= 1170;
									var10000 = BufferedNetSocket.field4679[var0][var1 + 1]; // L: 496
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 498
									var10000 = BufferedNetSocket.field4679[var0][var1 + 1]; // L: 499
									var10000[var2] |= 585;
									var10000 = BufferedNetSocket.field4679[var0][var1]; // L: 500
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 502
									var10000 = BufferedNetSocket.field4679[var0][var1]; // L: 503
									var10000[var2] |= 1170;
									var10000 = BufferedNetSocket.field4679[var0][var1]; // L: 504
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 507
								var7.method4148(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 508
								var6.method4541(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 511
							if (var8.animationId == -1 && var8.transforms == null) { // L: 513
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 514
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1043[var4], 0, var19, var21); // L: 515
							if (var8.clipped) { // L: 516
								if (var4 == 0) { // L: 517
									class217.field2409[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 518
									class217.field2409[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 519
									class217.field2409[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 520
									class217.field2409[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 522
								var7.method4148(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 525
							if (var8.animationId == -1 && var8.transforms == null) { // L: 527
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 528
							}

							var6.method4535(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 529
							if (var8.interactType != 0 && var7 != null) { // L: 530
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 531
								var6.method4541(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 534
							if (var8.animationId == -1 && var8.transforms == null) { // L: 536
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 537
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1042[var4], 0, 0, 0, var19, var21); // L: 538
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 541
								var22 = 16; // L: 542
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 543
								if (var23 != 0L) { // L: 544
									var22 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 546
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 547
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1042[var4], 0, var22 * Tiles.field1044[var4], var22 * Tiles.field1045[var4], var19, var21); // L: 548
							} else if (var5 == 6) { // L: 551
								var22 = 8; // L: 552
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 553
								if (var23 != 0L) { // L: 554
									var22 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 556
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 557
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1051[var4], var22 * Tiles.field1048[var4], var19, var21); // L: 558
							} else if (var5 == 7) { // L: 561
								var28 = var4 + 2 & 3; // L: 563
								if (var8.animationId == -1 && var8.transforms == null) { // L: 564
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 565
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 566
							} else if (var5 == 8) { // L: 569
								var22 = 8; // L: 570
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 571
								if (0L != var23) { // L: 572
									var22 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 575
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 576
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 577
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 578
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 581
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 582
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1051[var4], var22 * Tiles.field1048[var4], var19, var21); // L: 584
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 397
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 398
					}

					if (var29 != null && var6.method4535(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 399 400
						var28 = 15; // L: 401
						if (var29 instanceof Model) { // L: 402
							var28 = ((Model)var29).method4779() / 4; // L: 403
							if (var28 > 30) { // L: 404
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 406
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 407
								if (var28 > class217.field2409[var0][var31 + var1][var32 + var2]) { // L: 408
									class217.field2409[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 413
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 393 414 423 460 474 509 523 532 539 549 559 567 585 587
}
