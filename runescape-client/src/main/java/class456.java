import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class456 extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static AbstractArchive field4841;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("c")
	public int[][] field4840;
	@ObfuscatedName("x")
	public Object[][] field4842;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class456() {
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-779817529"
	)
	void method8282(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.method8285(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "1887043738"
	)
	void method8285(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			int var3 = var1.readUnsignedByte(); // L: 39
			if (this.field4840 == null) { // L: 40
				this.field4840 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 41 42 69
				int var5 = var4 & 127; // L: 43
				boolean var6 = (var4 & 128) != 0; // L: 44
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 45

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 46
					var7[var8] = var1.readUShortSmart(); // L: 47
				}

				this.field4840[var5] = var7; // L: 49
				if (var6) { // L: 50
					if (this.field4842 == null) {
						this.field4842 = new Object[this.field4840.length][]; // L: 51
					}

					Object[][] var17 = this.field4842; // L: 52
					int var11 = var1.readUShortSmart(); // L: 56
					Object[] var12 = new Object[var7.length * var11]; // L: 57

					for (int var13 = 0; var13 < var11; ++var13) { // L: 58
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 59
							int var15 = var14 + var7.length * var13; // L: 60
							class453 var16 = class230.method4679(var7[var14]); // L: 61
							var12[var15] = var16.method8257(var1); // L: 62
						}
					}

					var17[var5] = var12; // L: 67
				}
			}
		}

	} // L: 73

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "24652616"
	)
	void method8284() {
	} // L: 75

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILhf;Lgr;I)V",
		garbageValue = "675846473"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 325 326 327
			if (var0 < Tiles.Tiles_minPlane) { // L: 330
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = InterfaceParent.getObjectDefinition(var3); // L: 331
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 334
				var9 = var8.sizeX; // L: 339
				var10 = var8.sizeY; // L: 340
			} else {
				var9 = var8.sizeY; // L: 335
				var10 = var8.sizeX; // L: 336
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 346
				var11 = (var9 >> 1) + var1; // L: 347
				var12 = (var9 + 1 >> 1) + var1; // L: 348
			} else {
				var11 = var1; // L: 351
				var12 = var1 + 1; // L: 352
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 354
				var13 = (var10 >> 1) + var2; // L: 355
				var14 = var2 + (var10 + 1 >> 1); // L: 356
			} else {
				var13 = var2; // L: 359
				var14 = var2 + 1; // L: 360
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 362
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2; // L: 363
			int var17 = (var1 << 7) + (var9 << 6); // L: 364
			int var18 = (var2 << 7) + (var10 << 6); // L: 365
			long var19 = SpotAnimationDefinition.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 366
			int var21 = var5 + (var4 << 6); // L: 367
			if (var8.int3 == 1) { // L: 368
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 369
				ObjectSound var22 = new ObjectSound(); // L: 370
				var22.plane = var0; // L: 371
				var22.x = var1 * 16384; // L: 372
				var22.y = var2 * 128; // L: 373
				var23 = var8.sizeX; // L: 374
				var24 = var8.sizeY; // L: 375
				if (var4 == 1 || var4 == 3) { // L: 376
					var23 = var8.sizeY; // L: 377
					var24 = var8.sizeX; // L: 378
				}

				var22.maxX = (var23 + var1) * 16384; // L: 380
				var22.maxY = (var24 + var2) * 128; // L: 381
				var22.soundEffectId = var8.ambientSoundId; // L: 382
				var22.field824 = var8.int7 * 128; // L: 383
				var22.field830 = var8.int5; // L: 384
				var22.field831 = var8.int6; // L: 385
				var22.soundEffectIds = var8.soundEffectIds; // L: 386
				if (var8.transforms != null) { // L: 387
					var22.obj = var8; // L: 388
					var22.set(); // L: 389
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 391
				if (var22.soundEffectIds != null) { // L: 392
					var22.field821 = var22.field830 + (int)(Math.random() * (double)(var22.field831 - var22.field830));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 394
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 395
					if (var8.animationId == -1 && var8.transforms == null) { // L: 397
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 398
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 399
					if (var8.interactType == 1 && var7 != null) { // L: 400
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 403
				int[] var10000;
				if (var5 >= 12) { // L: 424
					if (var8.animationId == -1 && var8.transforms == null) { // L: 426
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 427
					}

					var6.method4315(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 428
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 429
						var10000 = UserComparator7.field1410[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 430
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 433
					if (var8.animationId == -1 && var8.transforms == null) { // L: 435
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 436
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field999[var4], 0, var19, var21); // L: 437
					if (var4 == 0) { // L: 438
						if (var8.clipped) { // L: 439
							class32.field179[var0][var1][var2] = 50; // L: 440
							class32.field179[var0][var1][var2 + 1] = 50; // L: 441
						}

						if (var8.modelClipped) { // L: 443
							var10000 = UserComparator7.field1410[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 445
						if (var8.clipped) { // L: 446
							class32.field179[var0][var1][var2 + 1] = 50; // L: 447
							class32.field179[var0][var1 + 1][var2 + 1] = 50; // L: 448
						}

						if (var8.modelClipped) { // L: 450
							var10000 = UserComparator7.field1410[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) { // L: 452
						if (var8.clipped) { // L: 453
							class32.field179[var0][var1 + 1][var2] = 50; // L: 454
							class32.field179[var0][var1 + 1][var2 + 1] = 50; // L: 455
						}

						if (var8.modelClipped) { // L: 457
							var10000 = UserComparator7.field1410[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 459
						if (var8.clipped) { // L: 460
							class32.field179[var0][var1][var2] = 50; // L: 461
							class32.field179[var0][var1 + 1][var2] = 50; // L: 462
						}

						if (var8.modelClipped) { // L: 464
							var10000 = UserComparator7.field1410[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 466
						var7.method4002(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 467
						var6.method4287(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 470
					if (var8.animationId == -1 && var8.transforms == null) { // L: 472
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 473
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1000[var4], 0, var19, var21); // L: 474
					if (var8.clipped) { // L: 475
						if (var4 == 0) { // L: 476
							class32.field179[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 477
							class32.field179[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 478
							class32.field179[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 479
							class32.field179[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 481
						var7.method4002(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 484
						var28 = var4 + 1 & 3; // L: 485
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 488
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 489
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 490
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 493
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 494
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field999[var4], Tiles.field999[var28], var19, var21); // L: 496
						if (var8.modelClipped) { // L: 497
							if (var4 == 0) { // L: 498
								var10000 = UserComparator7.field1410[var0][var1]; // L: 499
								var10000[var2] |= 585;
								var10000 = UserComparator7.field1410[var0][var1]; // L: 500
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) { // L: 502
								var10000 = UserComparator7.field1410[var0][var1]; // L: 503
								var10000[var2 + 1] |= 1170;
								var10000 = UserComparator7.field1410[var0][var1 + 1]; // L: 504
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 506
								var10000 = UserComparator7.field1410[var0][var1 + 1]; // L: 507
								var10000[var2] |= 585;
								var10000 = UserComparator7.field1410[var0][var1]; // L: 508
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 510
								var10000 = UserComparator7.field1410[var0][var1]; // L: 511
								var10000[var2] |= 1170;
								var10000 = UserComparator7.field1410[var0][var1]; // L: 512
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 515
							var7.method4002(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 516
							var6.method4287(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 519
						if (var8.animationId == -1 && var8.transforms == null) { // L: 521
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 522
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1000[var4], 0, var19, var21); // L: 523
						if (var8.clipped) { // L: 524
							if (var4 == 0) { // L: 525
								class32.field179[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 526
								class32.field179[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 527
								class32.field179[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 528
								class32.field179[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 530
							var7.method4002(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 533
						if (var8.animationId == -1 && var8.transforms == null) { // L: 535
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 536
						}

						var6.method4315(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 537
						if (var8.interactType != 0 && var7 != null) { // L: 538
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 539
							var6.method4287(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 542
						if (var8.animationId == -1 && var8.transforms == null) { // L: 544
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 545
						}

						var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field999[var4], 0, 0, 0, var19, var21); // L: 546
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 549
							var28 = 16; // L: 550
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 551
							if (var29 != 0L) { // L: 552
								var28 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 554
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 555
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field999[var4], 0, var28 * Tiles.field991[var4], var28 * Tiles.field1003[var4], var19, var21); // L: 556
						} else if (var5 == 6) { // L: 559
							var28 = 8; // L: 560
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 561
							if (var29 != 0L) { // L: 562
								var28 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 564
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 565
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field993[var4], var28 * Tiles.field1004[var4], var19, var21); // L: 566
						} else if (var5 == 7) { // L: 569
							var23 = var4 + 2 & 3; // L: 571
							if (var8.animationId == -1 && var8.transforms == null) { // L: 572
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 573
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 574
						} else if (var5 == 8) { // L: 577
							var28 = 8; // L: 578
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 579
							if (var29 != 0L) { // L: 580
								var28 = InterfaceParent.getObjectDefinition(AttackOption.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 583
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 584
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 585
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 586
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 589
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 590
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field993[var4], var28 * Tiles.field1004[var4], var19, var21); // L: 592
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 405
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 406
				}

				if (var34 != null && var6.method4315(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 407 408
					var23 = 15; // L: 409
					if (var34 instanceof Model) { // L: 410
						var23 = ((Model)var34).method4510() / 4; // L: 411
						if (var23 > 30) { // L: 412
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 414
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 415
							if (var23 > class32.field179[var0][var24 + var1][var33 + var2]) { // L: 416
								class32.field179[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 421
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 401 422 431 468 482 517 531 540 547 557 567 575 593 595
}
