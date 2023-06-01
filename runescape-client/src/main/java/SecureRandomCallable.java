import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("da")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ax")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("al")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -244779067
	)
	static int field1012;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 48
		var2.nextInt(); // L: 49
		return var2; // L: 52
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILih;Lir;I)V",
		garbageValue = "-687622964"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 348 349 350
			if (var0 < Tiles.Tiles_minPlane) { // L: 353
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class59.getObjectDefinition(var3); // L: 354
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 357
				var9 = var8.sizeX; // L: 362
				var10 = var8.sizeY; // L: 363
			} else {
				var9 = var8.sizeY; // L: 358
				var10 = var8.sizeX; // L: 359
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 369
				var11 = (var9 >> 1) + var1; // L: 370
				var12 = (var9 + 1 >> 1) + var1; // L: 371
			} else {
				var11 = var1; // L: 374
				var12 = var1 + 1; // L: 375
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 377
				var13 = (var10 >> 1) + var2; // L: 378
				var14 = var2 + (var10 + 1 >> 1); // L: 379
			} else {
				var13 = var2; // L: 382
				var14 = var2 + 1; // L: 383
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 385
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 386
			int var17 = (var1 << 7) + (var9 << 6); // L: 387
			int var18 = (var2 << 7) + (var10 << 6); // L: 388
			long var19 = ArchiveLoader.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 389
			int var21 = var5 + (var4 << 6); // L: 390
			if (var8.int3 == 1) { // L: 391
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 392
				Buffer.method9207(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 393
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 394
					if (var8.animationId == -1 && var8.transforms == null) { // L: 396
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 397
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 398
					if (var8.interactType == 1 && var7 != null) { // L: 399
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 402
					int[] var10000;
					if (var5 >= 12) { // L: 423
						if (var8.animationId == -1 && var8.transforms == null) { // L: 425
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 426
						}

						var6.method4597(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 427
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 428
							var10000 = Tiles.field999[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 429
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 432
						if (var8.animationId == -1 && var8.transforms == null) { // L: 434
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 435
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1000[var4], 0, var19, var21); // L: 436
						if (var4 == 0) { // L: 437
							if (var8.clipped) { // L: 438
								Tiles.field995[var0][var1][var2] = 50; // L: 439
								Tiles.field995[var0][var1][var2 + 1] = 50; // L: 440
							}

							if (var8.modelClipped) { // L: 442
								var10000 = Tiles.field999[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 444
							if (var8.clipped) { // L: 445
								Tiles.field995[var0][var1][var2 + 1] = 50; // L: 446
								Tiles.field995[var0][var1 + 1][var2 + 1] = 50; // L: 447
							}

							if (var8.modelClipped) { // L: 449
								var10000 = Tiles.field999[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 451
							if (var8.clipped) { // L: 452
								Tiles.field995[var0][var1 + 1][var2] = 50; // L: 453
								Tiles.field995[var0][var1 + 1][var2 + 1] = 50; // L: 454
							}

							if (var8.modelClipped) { // L: 456
								var10000 = Tiles.field999[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 458
							if (var8.clipped) { // L: 459
								Tiles.field995[var0][var1][var2] = 50; // L: 460
								Tiles.field995[var0][var1 + 1][var2] = 50; // L: 461
							}

							if (var8.modelClipped) { // L: 463
								var10000 = Tiles.field999[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 465
							var7.method4121(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 466
							var6.method4490(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 469
						if (var8.animationId == -1 && var8.transforms == null) { // L: 471
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 472
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field997[var4], 0, var19, var21); // L: 473
						if (var8.clipped) { // L: 474
							if (var4 == 0) { // L: 475
								Tiles.field995[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 476
								Tiles.field995[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 477
								Tiles.field995[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 478
								Tiles.field995[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 480
							var7.method4121(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 483
							var22 = var4 + 1 & 3; // L: 484
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 487
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 488
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 489
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 492
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 493
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1000[var4], Tiles.field1000[var22], var19, var21); // L: 495
							if (var8.modelClipped) { // L: 496
								if (var4 == 0) { // L: 497
									var10000 = Tiles.field999[var0][var1]; // L: 498
									var10000[var2] |= 585;
									var10000 = Tiles.field999[var0][var1]; // L: 499
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) { // L: 501
									var10000 = Tiles.field999[var0][var1]; // L: 502
									var10000[var2 + 1] |= 1170;
									var10000 = Tiles.field999[var0][var1 + 1]; // L: 503
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 505
									var10000 = Tiles.field999[var0][var1 + 1]; // L: 506
									var10000[var2] |= 585;
									var10000 = Tiles.field999[var0][var1]; // L: 507
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 509
									var10000 = Tiles.field999[var0][var1]; // L: 510
									var10000[var2] |= 1170;
									var10000 = Tiles.field999[var0][var1]; // L: 511
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 514
								var7.method4121(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 515
								var6.method4490(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 518
							if (var8.animationId == -1 && var8.transforms == null) { // L: 520
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 521
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field997[var4], 0, var19, var21); // L: 522
							if (var8.clipped) { // L: 523
								if (var4 == 0) { // L: 524
									Tiles.field995[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 525
									Tiles.field995[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 526
									Tiles.field995[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 527
									Tiles.field995[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 529
								var7.method4121(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 532
							if (var8.animationId == -1 && var8.transforms == null) { // L: 534
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 535
							}

							var6.method4597(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 536
							if (var8.interactType != 0 && var7 != null) { // L: 537
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 538
								var6.method4490(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 541
							if (var8.animationId == -1 && var8.transforms == null) { // L: 543
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 544
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1000[var4], 0, 0, 0, var19, var21); // L: 545
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 548
								var22 = 16; // L: 549
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 550
								if (0L != var23) { // L: 551
									var22 = class59.getObjectDefinition(class299.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 553
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 554
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1000[var4], 0, var22 * Tiles.field1002[var4], var22 * Tiles.field1003[var4], var19, var21); // L: 555
							} else if (var5 == 6) { // L: 558
								var22 = 8; // L: 559
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 560
								if (0L != var23) { // L: 561
									var22 = class59.getObjectDefinition(class299.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 563
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 564
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1007[var4], var22 * Tiles.field1005[var4], var19, var21); // L: 565
							} else if (var5 == 7) { // L: 568
								var28 = var4 + 2 & 3; // L: 570
								if (var8.animationId == -1 && var8.transforms == null) { // L: 571
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 572
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 573
							} else if (var5 == 8) { // L: 576
								var22 = 8; // L: 577
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 578
								if (var23 != 0L) { // L: 579
									var22 = class59.getObjectDefinition(class299.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 582
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 583
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 584
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 585
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 588
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 589
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1007[var4], var22 * Tiles.field1005[var4], var19, var21); // L: 591
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 404
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 405
					}

					if (var29 != null && var6.method4597(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 406 407
						var28 = 15; // L: 408
						if (var29 instanceof Model) { // L: 409
							var28 = ((Model)var29).method4757() / 4; // L: 410
							if (var28 > 30) { // L: 411
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 413
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 414
								if (var28 > Tiles.field995[var0][var31 + var1][var32 + var2]) { // L: 415
									Tiles.field995[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 420
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 400 421 430 467 481 516 530 539 546 556 566 574 592 594

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "32"
	)
	static int method2211(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4333
			class336.Interpreter_intStackSize -= 2; // L: 4334
			var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4335
			int var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4336
			if (!Client.isCameraLocked) { // L: 4337
				Client.camAngleX = var3; // L: 4338
				Client.camAngleY = var4; // L: 4339
			}

			return 1; // L: 4341
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4343
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4344
			return 1; // L: 4345
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4347
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4348
			return 1; // L: 4349
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4351
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4352
			if (var3 < 0) { // L: 4353
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4354
			return 1; // L: 4355
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4357
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4358
			return 1; // L: 4359
		} else {
			return 2; // L: 4361
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1612036885"
	)
	static final void method2213(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10724
		int var7 = var3 - var1; // L: 10725
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10726
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10727
		int var10 = var8; // L: 10728
		if (var8 < var9) { // L: 10729
			var10 = var9;
		}

		if (var10 != 0) { // L: 10730
			int var11 = (var6 << 16) / var10; // L: 10731
			int var12 = (var7 << 16) / var10; // L: 10732
			if (var12 <= var11) { // L: 10733
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10734
			}

			int var13 = var5 * var12 >> 17; // L: 10735
			int var14 = var5 * var12 + 1 >> 17; // L: 10736
			int var15 = var5 * var11 >> 17; // L: 10737
			int var16 = var5 * var11 + 1 >> 17; // L: 10738
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10739
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10740
			int var17 = var0 + var13; // L: 10741
			int var18 = var0 - var14; // L: 10742
			int var19 = var0 + var6 - var14; // L: 10743
			int var20 = var0 + var6 + var13; // L: 10744
			int var21 = var15 + var1; // L: 10745
			int var22 = var1 - var16; // L: 10746
			int var23 = var7 + var1 - var16; // L: 10747
			int var24 = var7 + var15 + var1; // L: 10748
			Rasterizer3D.method4401(var17, var18, var19); // L: 10749
			Rasterizer3D.method4338(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 10750
			Rasterizer3D.method4401(var17, var19, var20); // L: 10751
			Rasterizer3D.method4338(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 10752
		}
	} // L: 10753
}
