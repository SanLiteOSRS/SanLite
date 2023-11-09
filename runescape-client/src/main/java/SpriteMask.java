import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("mouseWheel")
	static class173 mouseWheel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -881674491
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2129286853
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("av")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("as")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1108
		this.height = var2; // L: 1109
		this.xWidths = var3; // L: 1110
		this.xStarts = var4; // L: 1111
	} // L: 1112

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "46"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1115
			int var3 = this.xStarts[var2]; // L: 1116
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1117
				return true;
			}
		}

		return false; // L: 1119
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILqc;Lny;B)V",
		garbageValue = "-52"
	)
	static void method5955(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 30
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 31
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 32
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) { // L: 33
					var3 = var5.data; // L: 34
					break; // L: 35
				}
			}
		}

		if (var3 != null) { // L: 39
			var2.load(var1, var0, var3, true); // L: 40
		} else {
			byte[] var4 = var1.read(var0); // L: 43
			var2.load(var1, var0, var4, true); // L: 44
		}
	} // L: 41 45

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILiz;Lic;I)V",
		garbageValue = "1713121323"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 320 321 322
			if (var0 < Tiles.Tiles_minPlane) { // L: 325
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class175.getObjectDefinition(var3); // L: 326
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 329
				var9 = var8.sizeX; // L: 334
				var10 = var8.sizeY; // L: 335
			} else {
				var9 = var8.sizeY; // L: 330
				var10 = var8.sizeX; // L: 331
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 341
				var11 = (var9 >> 1) + var1; // L: 342
				var12 = (var9 + 1 >> 1) + var1; // L: 343
			} else {
				var11 = var1; // L: 346
				var12 = var1 + 1; // L: 347
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 349
				var13 = (var10 >> 1) + var2; // L: 350
				var14 = var2 + (var10 + 1 >> 1); // L: 351
			} else {
				var13 = var2; // L: 354
				var14 = var2 + 1; // L: 355
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 357
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2; // L: 358
			int var17 = (var1 << 7) + (var9 << 6); // L: 359
			int var18 = (var2 << 7) + (var10 << 6); // L: 360
			long var19 = class394.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 361
			int var21 = var5 + (var4 << 6); // L: 362
			if (var8.int3 == 1) { // L: 363
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 364
				FontName.method8578(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 365
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 366
					if (var8.animationId == -1 && var8.transforms == null) { // L: 368
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 369
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 370
					if (var8.interactType == 1 && var7 != null) { // L: 371
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 374
					int[] var10000;
					if (var5 >= 12) { // L: 395
						if (var8.animationId == -1 && var8.transforms == null) { // L: 397
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 398
						}

						var6.method4522(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 399
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 400
							var10000 = Tiles.field1020[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 401
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 404
						if (var8.animationId == -1 && var8.transforms == null) { // L: 406
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 407
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1021[var4], 0, var19, var21); // L: 408
						if (var4 == 0) { // L: 409
							if (var8.clipped) { // L: 410
								class305.field3399[var0][var1][var2] = 50; // L: 411
								class305.field3399[var0][var1][var2 + 1] = 50; // L: 412
							}

							if (var8.modelClipped) { // L: 414
								var10000 = Tiles.field1020[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 416
							if (var8.clipped) { // L: 417
								class305.field3399[var0][var1][var2 + 1] = 50; // L: 418
								class305.field3399[var0][var1 + 1][var2 + 1] = 50; // L: 419
							}

							if (var8.modelClipped) { // L: 421
								var10000 = Tiles.field1020[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 423
							if (var8.clipped) { // L: 424
								class305.field3399[var0][var1 + 1][var2] = 50; // L: 425
								class305.field3399[var0][var1 + 1][var2 + 1] = 50; // L: 426
							}

							if (var8.modelClipped) { // L: 428
								var10000 = Tiles.field1020[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 430
							if (var8.clipped) { // L: 431
								class305.field3399[var0][var1][var2] = 50; // L: 432
								class305.field3399[var0][var1 + 1][var2] = 50; // L: 433
							}

							if (var8.modelClipped) { // L: 435
								var10000 = Tiles.field1020[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 437
							var7.method4189(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 438
							var6.method4550(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 441
						if (var8.animationId == -1 && var8.transforms == null) { // L: 443
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 444
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1022[var4], 0, var19, var21); // L: 445
						if (var8.clipped) { // L: 446
							if (var4 == 0) { // L: 447
								class305.field3399[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 448
								class305.field3399[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 449
								class305.field3399[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 450
								class305.field3399[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 452
							var7.method4189(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 455
							var22 = var4 + 1 & 3; // L: 456
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 459
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 460
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 461
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 464
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 465
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1021[var4], Tiles.field1021[var22], var19, var21); // L: 467
							if (var8.modelClipped) { // L: 468
								if (var4 == 0) { // L: 469
									var10000 = Tiles.field1020[var0][var1]; // L: 470
									var10000[var2] |= 585;
									var10000 = Tiles.field1020[var0][var1]; // L: 471
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 473
									var10000 = Tiles.field1020[var0][var1]; // L: 474
									var10000[1 + var2] |= 1170;
									var10000 = Tiles.field1020[var0][var1 + 1]; // L: 475
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 477
									var10000 = Tiles.field1020[var0][var1 + 1]; // L: 478
									var10000[var2] |= 585;
									var10000 = Tiles.field1020[var0][var1]; // L: 479
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 481
									var10000 = Tiles.field1020[var0][var1]; // L: 482
									var10000[var2] |= 1170;
									var10000 = Tiles.field1020[var0][var1]; // L: 483
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 486
								var7.method4189(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 487
								var6.method4550(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 490
							if (var8.animationId == -1 && var8.transforms == null) { // L: 492
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 493
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1022[var4], 0, var19, var21); // L: 494
							if (var8.clipped) { // L: 495
								if (var4 == 0) { // L: 496
									class305.field3399[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 497
									class305.field3399[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 498
									class305.field3399[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 499
									class305.field3399[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 501
								var7.method4189(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 504
							if (var8.animationId == -1 && var8.transforms == null) { // L: 506
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 507
							}

							var6.method4522(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 508
							if (var8.interactType != 0 && var7 != null) { // L: 509
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 510
								var6.method4550(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 513
							if (var8.animationId == -1 && var8.transforms == null) { // L: 515
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 516
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1021[var4], 0, 0, 0, var19, var21); // L: 517
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 520
								var22 = 16; // L: 521
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 522
								if (0L != var23) { // L: 523
									var22 = class175.getObjectDefinition(class215.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 525
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 526
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1021[var4], 0, var22 * Tiles.field1014[var4], var22 * Tiles.field1023[var4], var19, var21); // L: 527
							} else if (var5 == 6) { // L: 530
								var22 = 8; // L: 531
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 532
								if (var23 != 0L) { // L: 533
									var22 = class175.getObjectDefinition(class215.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 535
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 536
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1025[var4], var22 * Tiles.field1026[var4], var19, var21); // L: 537
							} else if (var5 == 7) { // L: 540
								var28 = var4 + 2 & 3; // L: 542
								if (var8.animationId == -1 && var8.transforms == null) { // L: 543
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 544
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 545
							} else if (var5 == 8) { // L: 548
								var22 = 8; // L: 549
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 550
								if (0L != var23) { // L: 551
									var22 = class175.getObjectDefinition(class215.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 554
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 555
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 556
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 557
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 560
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 561
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1025[var4], var22 * Tiles.field1026[var4], var19, var21); // L: 563
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 376
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 377
					}

					if (var29 != null && var6.method4522(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 378 379
						var28 = 15; // L: 380
						if (var29 instanceof Model) { // L: 381
							var28 = ((Model)var29).method4846() / 4; // L: 382
							if (var28 > 30) { // L: 383
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 385
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 386
								if (var28 > class305.field3399[var0][var31 + var1][var32 + var2]) { // L: 387
									class305.field3399[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 392
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 372 393 402 439 453 488 502 511 518 528 538 546 564 566

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "88"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class10.clientPreferences.method2445() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3750
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3751
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3752
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3753
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3754
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3755
			++Client.soundEffectCount; // L: 3756
		}

	} // L: 3758
}
