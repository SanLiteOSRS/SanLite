import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public enum class309 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3961(-1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3957(0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3960(1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3958(2);

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1554888163
	)
	final int field3959;

	class309(int var3) {
		this.field3959 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3959; // L: 20
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgo;Lgr;I)V",
		garbageValue = "16711680"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 318 319 320
			if (var0 < Tiles.Tiles_minPlane) { // L: 323
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = WorldMapDecoration.getObjectDefinition(var3); // L: 324
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 327
				var9 = var8.sizeX; // L: 332
				var10 = var8.sizeY; // L: 333
			} else {
				var9 = var8.sizeY; // L: 328
				var10 = var8.sizeX; // L: 329
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 339
				var11 = (var9 >> 1) + var1; // L: 340
				var12 = (var9 + 1 >> 1) + var1; // L: 341
			} else {
				var11 = var1; // L: 344
				var12 = var1 + 1; // L: 345
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 347
				var13 = (var10 >> 1) + var2; // L: 348
				var14 = var2 + (var10 + 1 >> 1); // L: 349
			} else {
				var13 = var2; // L: 352
				var14 = var2 + 1; // L: 353
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 355
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 356
			int var17 = (var1 << 7) + (var9 << 6); // L: 357
			int var18 = (var2 << 7) + (var10 << 6); // L: 358
			long var19 = class394.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 359
			int var21 = var5 + (var4 << 6); // L: 360
			if (var8.int3 == 1) { // L: 361
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 362
				ObjectSound var22 = new ObjectSound(); // L: 363
				var22.plane = var0; // L: 364
				var22.x = var1 * 128; // L: 365
				var22.y = var2 * 128; // L: 366
				var23 = var8.sizeX; // L: 367
				var24 = var8.sizeY; // L: 368
				if (var4 == 1 || var4 == 3) { // L: 369
					var23 = var8.sizeY; // L: 370
					var24 = var8.sizeX; // L: 371
				}

				var22.maxX = (var23 + var1) * 128; // L: 373
				var22.maxY = (var24 + var2) * 128; // L: 374
				var22.soundEffectId = var8.ambientSoundId; // L: 375
				var22.field814 = var8.int7 * 128; // L: 376
				var22.field817 = var8.int5; // L: 377
				var22.field823 = var8.int6; // L: 378
				var22.soundEffectIds = var8.soundEffectIds; // L: 379
				if (var8.transforms != null) { // L: 380
					var22.obj = var8; // L: 381
					var22.set(); // L: 382
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 384
				if (var22.soundEffectIds != null) { // L: 385
					var22.field818 = var22.field817 + (int)(Math.random() * (double)(var22.field823 - var22.field817));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 387
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 388
					if (var8.animationId == -1 && var8.transforms == null) { // L: 390
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 391
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 392
					if (var8.interactType == 1 && var7 != null) { // L: 393
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 396
				int[] var10000;
				if (var5 >= 12) { // L: 417
					if (var8.animationId == -1 && var8.transforms == null) { // L: 419
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 420
					}

					var6.method4118(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 421
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 422
						var10000 = MouseRecorder.field1060[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 423
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 426
					if (var8.animationId == -1 && var8.transforms == null) { // L: 428
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 429
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1001[var4], 0, var19, var21); // L: 430
					if (var4 == 0) { // L: 431
						if (var8.clipped) { // L: 432
							Tiles.field998[var0][var1][var2] = 50; // L: 433
							Tiles.field998[var0][var1][var2 + 1] = 50; // L: 434
						}

						if (var8.modelClipped) { // L: 436
							var10000 = MouseRecorder.field1060[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 438
						if (var8.clipped) { // L: 439
							Tiles.field998[var0][var1][var2 + 1] = 50; // L: 440
							Tiles.field998[var0][var1 + 1][var2 + 1] = 50; // L: 441
						}

						if (var8.modelClipped) { // L: 443
							var10000 = MouseRecorder.field1060[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) { // L: 445
						if (var8.clipped) { // L: 446
							Tiles.field998[var0][var1 + 1][var2] = 50; // L: 447
							Tiles.field998[var0][var1 + 1][var2 + 1] = 50; // L: 448
						}

						if (var8.modelClipped) { // L: 450
							var10000 = MouseRecorder.field1060[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 452
						if (var8.clipped) { // L: 453
							Tiles.field998[var0][var1][var2] = 50; // L: 454
							Tiles.field998[var0][var1 + 1][var2] = 50; // L: 455
						}

						if (var8.modelClipped) { // L: 457
							var10000 = MouseRecorder.field1060[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 459
						var7.method3878(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 460
						var6.method4124(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 463
					if (var8.animationId == -1 && var8.transforms == null) { // L: 465
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 466
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1002[var4], 0, var19, var21); // L: 467
					if (var8.clipped) { // L: 468
						if (var4 == 0) { // L: 469
							Tiles.field998[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 470
							Tiles.field998[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 471
							Tiles.field998[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 472
							Tiles.field998[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 474
						var7.method3878(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 477
						var28 = var4 + 1 & 3; // L: 478
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 481
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 482
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 483
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 486
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 487
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field1001[var4], Tiles.field1001[var28], var19, var21); // L: 489
						if (var8.modelClipped) { // L: 490
							if (var4 == 0) { // L: 491
								var10000 = MouseRecorder.field1060[var0][var1]; // L: 492
								var10000[var2] |= 585;
								var10000 = MouseRecorder.field1060[var0][var1]; // L: 493
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) { // L: 495
								var10000 = MouseRecorder.field1060[var0][var1]; // L: 496
								var10000[var2 + 1] |= 1170;
								var10000 = MouseRecorder.field1060[var0][var1 + 1]; // L: 497
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 499
								var10000 = MouseRecorder.field1060[var0][var1 + 1]; // L: 500
								var10000[var2] |= 585;
								var10000 = MouseRecorder.field1060[var0][var1]; // L: 501
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 503
								var10000 = MouseRecorder.field1060[var0][var1]; // L: 504
								var10000[var2] |= 1170;
								var10000 = MouseRecorder.field1060[var0][var1]; // L: 505
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 508
							var7.method3878(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 509
							var6.method4124(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 512
						if (var8.animationId == -1 && var8.transforms == null) { // L: 514
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 515
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1002[var4], 0, var19, var21); // L: 516
						if (var8.clipped) { // L: 517
							if (var4 == 0) { // L: 518
								Tiles.field998[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 519
								Tiles.field998[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 520
								Tiles.field998[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 521
								Tiles.field998[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 523
							var7.method3878(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 526
						if (var8.animationId == -1 && var8.transforms == null) { // L: 528
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 529
						}

						var6.method4118(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 530
						if (var8.interactType != 0 && var7 != null) { // L: 531
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 532
							var6.method4124(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 535
						if (var8.animationId == -1 && var8.transforms == null) { // L: 537
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 538
						}

						var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1001[var4], 0, 0, 0, var19, var21); // L: 539
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 542
							var28 = 16; // L: 543
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 544
							if (var29 != 0L) { // L: 545
								var28 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 547
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 548
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1001[var4], 0, var28 * Tiles.field1008[var4], var28 * Tiles.field1009[var4], var19, var21); // L: 549
						} else if (var5 == 6) { // L: 552
							var28 = 8; // L: 553
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 554
							if (0L != var29) { // L: 555
								var28 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 557
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 558
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1005[var4], var28 * Tiles.field1006[var4], var19, var21); // L: 559
						} else if (var5 == 7) { // L: 562
							var23 = var4 + 2 & 3; // L: 564
							if (var8.animationId == -1 && var8.transforms == null) { // L: 565
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 566
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 567
						} else if (var5 == 8) { // L: 570
							var28 = 8; // L: 571
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 572
							if (var29 != 0L) { // L: 573
								var28 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 576
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 577
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 578
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 579
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 582
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 583
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1005[var4], var28 * Tiles.field1006[var4], var19, var21); // L: 585
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 398
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 399
				}

				if (var34 != null && var6.method4118(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 400 401
					var23 = 15; // L: 402
					if (var34 instanceof Model) { // L: 403
						var23 = ((Model)var34).method4350() / 4; // L: 404
						if (var23 > 30) { // L: 405
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 407
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 408
							if (var23 > Tiles.field998[var0][var24 + var1][var33 + var2]) { // L: 409
								Tiles.field998[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 414
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 394 415 424 461 475 510 524 533 540 550 560 568 586 588
}
