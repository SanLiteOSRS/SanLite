import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -411248035
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 410725973
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1700327617
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -623481861
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1750556275
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1209713311
	)
	int field1168;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -7205691
	)
	int field1169;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 952908339
	)
	int field1173;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 243961051
	)
	int field1171;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2017659571
	)
	int field1170;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 593252615
	)
	int field1172;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2080090047
	)
	int field1174;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1028756101
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2036158661
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1174 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2117178902"
	)
	void method2376(int var1) {
		this.field1174 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1391421037"
	)
	boolean method2372(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1174 & 1 << var1) != 0;
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnw;",
		garbageValue = "-1780334162"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_normal, PlayerType.field4214, PlayerType.field4228, PlayerType.field4230, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ironman, PlayerType.field4221, PlayerType.field4231, PlayerType.PlayerType_ultimateIronman, PlayerType.field4226, PlayerType.field4224, PlayerType.PlayerType_playerModerator, PlayerType.field4223, PlayerType.field4227, PlayerType.field4225, PlayerType.field4222}; // L: 30
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILiz;Lij;I)V",
		garbageValue = "235941196"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 345 346 347
			if (var0 < Tiles.Tiles_minPlane) { // L: 350
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class90.getObjectDefinition(var3); // L: 351
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 354
				var9 = var8.sizeX; // L: 359
				var10 = var8.sizeY; // L: 360
			} else {
				var9 = var8.sizeY; // L: 355
				var10 = var8.sizeX; // L: 356
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 366
				var11 = (var9 >> 1) + var1; // L: 367
				var12 = (var9 + 1 >> 1) + var1; // L: 368
			} else {
				var11 = var1; // L: 371
				var12 = var1 + 1; // L: 372
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 374
				var13 = (var10 >> 1) + var2; // L: 375
				var14 = var2 + (var10 + 1 >> 1); // L: 376
			} else {
				var13 = var2; // L: 379
				var14 = var2 + 1; // L: 380
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 382
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2; // L: 383
			int var17 = (var1 << 7) + (var9 << 6); // L: 384
			int var18 = (var2 << 7) + (var10 << 6); // L: 385
			long var19 = BufferedNetSocket.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 386
			int var21 = var5 + (var4 << 6); // L: 387
			if (var8.int3 == 1) { // L: 388
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 389
				GrandExchangeOfferOwnWorldComparator.method1250(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 390
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 391
					if (var8.animationId == -1 && var8.transforms == null) { // L: 393
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 394
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 395
					if (var8.interactType == 1 && var7 != null) { // L: 396
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 399
					int[] var10000;
					if (var5 >= 12) { // L: 420
						if (var8.animationId == -1 && var8.transforms == null) { // L: 422
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 423
						}

						var6.method4569(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 424
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 425
							var10000 = BufferedNetSocket.field4681[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 426
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 429
						if (var8.animationId == -1 && var8.transforms == null) { // L: 431
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 432
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1027[var4], 0, var19, var21); // L: 433
						if (var4 == 0) { // L: 434
							if (var8.clipped) { // L: 435
								InvDefinition.field1899[var0][var1][var2] = 50; // L: 436
								InvDefinition.field1899[var0][var1][var2 + 1] = 50; // L: 437
							}

							if (var8.modelClipped) { // L: 439
								var10000 = BufferedNetSocket.field4681[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 441
							if (var8.clipped) { // L: 442
								InvDefinition.field1899[var0][var1][var2 + 1] = 50; // L: 443
								InvDefinition.field1899[var0][var1 + 1][var2 + 1] = 50; // L: 444
							}

							if (var8.modelClipped) { // L: 446
								var10000 = BufferedNetSocket.field4681[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 448
							if (var8.clipped) { // L: 449
								InvDefinition.field1899[var0][var1 + 1][var2] = 50; // L: 450
								InvDefinition.field1899[var0][var1 + 1][var2 + 1] = 50; // L: 451
							}

							if (var8.modelClipped) { // L: 453
								var10000 = BufferedNetSocket.field4681[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 455
							if (var8.clipped) { // L: 456
								InvDefinition.field1899[var0][var1][var2] = 50; // L: 457
								InvDefinition.field1899[var0][var1 + 1][var2] = 50; // L: 458
							}

							if (var8.modelClipped) { // L: 460
								var10000 = BufferedNetSocket.field4681[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 462
							var7.method4191(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 463
							var6.method4575(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 466
						if (var8.animationId == -1 && var8.transforms == null) { // L: 468
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 469
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1028[var4], 0, var19, var21); // L: 470
						if (var8.clipped) { // L: 471
							if (var4 == 0) { // L: 472
								InvDefinition.field1899[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 473
								InvDefinition.field1899[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 474
								InvDefinition.field1899[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 475
								InvDefinition.field1899[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 477
							var7.method4191(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 480
							var22 = var4 + 1 & 3; // L: 481
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 484
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 485
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 486
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 489
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 490
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1027[var4], Tiles.field1027[var22], var19, var21); // L: 492
							if (var8.modelClipped) { // L: 493
								if (var4 == 0) { // L: 494
									var10000 = BufferedNetSocket.field4681[var0][var1]; // L: 495
									var10000[var2] |= 585;
									var10000 = BufferedNetSocket.field4681[var0][var1]; // L: 496
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 498
									var10000 = BufferedNetSocket.field4681[var0][var1]; // L: 499
									var10000[var2 + 1] |= 1170;
									var10000 = BufferedNetSocket.field4681[var0][var1 + 1]; // L: 500
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 502
									var10000 = BufferedNetSocket.field4681[var0][var1 + 1]; // L: 503
									var10000[var2] |= 585;
									var10000 = BufferedNetSocket.field4681[var0][var1]; // L: 504
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 506
									var10000 = BufferedNetSocket.field4681[var0][var1]; // L: 507
									var10000[var2] |= 1170;
									var10000 = BufferedNetSocket.field4681[var0][var1]; // L: 508
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 511
								var7.method4191(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 512
								var6.method4575(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 515
							if (var8.animationId == -1 && var8.transforms == null) { // L: 517
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 518
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1028[var4], 0, var19, var21); // L: 519
							if (var8.clipped) { // L: 520
								if (var4 == 0) { // L: 521
									InvDefinition.field1899[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 522
									InvDefinition.field1899[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 523
									InvDefinition.field1899[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 524
									InvDefinition.field1899[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 526
								var7.method4191(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 529
							if (var8.animationId == -1 && var8.transforms == null) { // L: 531
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 532
							}

							var6.method4569(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 533
							if (var8.interactType != 0 && var7 != null) { // L: 534
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 535
								var6.method4575(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 538
							if (var8.animationId == -1 && var8.transforms == null) { // L: 540
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 541
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1027[var4], 0, 0, 0, var19, var21); // L: 542
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 545
								var22 = 16; // L: 546
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 547
								if (0L != var23) { // L: 548
									var22 = class90.getObjectDefinition(class458.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 550
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 551
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1027[var4], 0, var22 * Tiles.field1037[var4], var22 * Tiles.field1034[var4], var19, var21); // L: 552
							} else if (var5 == 6) { // L: 555
								var22 = 8; // L: 556
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 557
								if (var23 != 0L) { // L: 558
									var22 = class90.getObjectDefinition(class458.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 560
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 561
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1031[var4], var22 * Tiles.field1032[var4], var19, var21); // L: 562
							} else if (var5 == 7) { // L: 565
								var28 = var4 + 2 & 3; // L: 567
								if (var8.animationId == -1 && var8.transforms == null) { // L: 568
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 569
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 570
							} else if (var5 == 8) { // L: 573
								var22 = 8; // L: 574
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 575
								if (0L != var23) { // L: 576
									var22 = class90.getObjectDefinition(class458.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 579
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 580
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 581
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 582
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 585
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 586
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1031[var4], var22 * Tiles.field1032[var4], var19, var21); // L: 588
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 401
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 402
					}

					if (var29 != null && var6.method4569(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 403 404
						var28 = 15; // L: 405
						if (var29 instanceof Model) { // L: 406
							var28 = ((Model)var29).method4800() / 4; // L: 407
							if (var28 > 30) { // L: 408
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 410
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 411
								if (var28 > InvDefinition.field1899[var0][var31 + var1][var32 + var2]) { // L: 412
									InvDefinition.field1899[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 417
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 397 418 427 464 478 513 527 536 543 553 563 571 589 591

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-230258157"
	)
	public static void method2378(boolean var0) {
		if (var0 != class502.ItemComposition_inMembersWorld) { // L: 594
			GrandExchangeOfferOwnWorldComparator.method1251(); // L: 595
			class502.ItemComposition_inMembersWorld = var0; // L: 596
		}

	} // L: 598

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IZZZZS)Lny;",
		garbageValue = "-12533"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2078
		if (JagexCache.JagexCache_dat2File != null) { // L: 2079
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class302.JagexCache_idxFiles[var0], 1000000); // L: 2080
		}

		return new Archive(var5, class158.field1749, class153.field1700, var0, var1, var2, var3, var4); // L: 2082
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1729163536"
	)
	static long method2375() {
		return Client.field642; // L: 3024
	}
}
