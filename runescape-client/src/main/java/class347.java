import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class347 implements Iterator {
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	public static class326 field4164;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	class348 field4167;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -957573263
	)
	int field4165;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -80556469
	)
	int field4166;

	@ObfuscatedSignature(
		descriptor = "(Lmj;)V"
	)
	class347(class348 var1) {
		this.field4165 = 0; // L: 177
		this.field4166 = this.field4167.field4172; // L: 178
		this.field4167 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4165 < this.field4167.field4169; // L: 186
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public Object next() {
		if (this.field4167.field4172 != this.field4166) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4165 < this.field4167.field4169) { // L: 193
			Object var1 = this.field4167.field4168[this.field4165].field4160; // L: 194
			++this.field4165; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgy;Lgl;B)V",
		garbageValue = "95"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 397 398 399
			if (var0 < Tiles.Tiles_minPlane) { // L: 402
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = FileSystem.getObjectDefinition(var3); // L: 403
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 406
				var9 = var8.sizeX; // L: 411
				var10 = var8.sizeY; // L: 412
			} else {
				var9 = var8.sizeY; // L: 407
				var10 = var8.sizeX; // L: 408
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 418
				var11 = (var9 >> 1) + var1; // L: 419
				var12 = (var9 + 1 >> 1) + var1; // L: 420
			} else {
				var11 = var1; // L: 423
				var12 = var1 + 1; // L: 424
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 426
				var13 = (var10 >> 1) + var2; // L: 427
				var14 = var2 + (var10 + 1 >> 1); // L: 428
			} else {
				var13 = var2; // L: 431
				var14 = var2 + 1; // L: 432
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 434
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 435
			int var17 = (var1 << 7) + (var9 << 6); // L: 436
			int var18 = (var2 << 7) + (var10 << 6); // L: 437
			long var19 = GroundObject.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 438
			int var21 = var5 + (var4 << 6); // L: 439
			if (var8.int3 == 1) { // L: 440
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 441
				Player.method2147(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 442
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 443
					if (var8.animationId == -1 && var8.transforms == null) { // L: 445
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 446
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 447
					if (var8.interactType == 1 && var7 != null) { // L: 448
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 451
					int[] var10000;
					if (var5 >= 12) { // L: 472
						if (var8.animationId == -1 && var8.transforms == null) { // L: 474
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 475
						}

						var6.method4061(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 476
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 477
							var10000 = class17.field92[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 478
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 481
						if (var8.animationId == -1 && var8.transforms == null) { // L: 483
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 484
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field977[var4], 0, var19, var21); // L: 485
						if (var4 == 0) { // L: 486
							if (var8.clipped) { // L: 487
								Tiles.field975[var0][var1][var2] = 50; // L: 488
								Tiles.field975[var0][var1][var2 + 1] = 50; // L: 489
							}

							if (var8.modelClipped) { // L: 491
								var10000 = class17.field92[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 493
							if (var8.clipped) { // L: 494
								Tiles.field975[var0][var1][var2 + 1] = 50; // L: 495
								Tiles.field975[var0][var1 + 1][var2 + 1] = 50; // L: 496
							}

							if (var8.modelClipped) { // L: 498
								var10000 = class17.field92[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 500
							if (var8.clipped) { // L: 501
								Tiles.field975[var0][var1 + 1][var2] = 50; // L: 502
								Tiles.field975[var0][var1 + 1][var2 + 1] = 50; // L: 503
							}

							if (var8.modelClipped) { // L: 505
								var10000 = class17.field92[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 507
							if (var8.clipped) { // L: 508
								Tiles.field975[var0][var1][var2] = 50; // L: 509
								Tiles.field975[var0][var1 + 1][var2] = 50; // L: 510
							}

							if (var8.modelClipped) { // L: 512
								var10000 = class17.field92[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 514
							var7.method3795(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 515
							var6.method4067(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 518
						if (var8.animationId == -1 && var8.transforms == null) { // L: 520
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 521
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field978[var4], 0, var19, var21); // L: 522
						if (var8.clipped) { // L: 523
							if (var4 == 0) { // L: 524
								Tiles.field975[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 525
								Tiles.field975[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 526
								Tiles.field975[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 527
								Tiles.field975[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 529
							var7.method3795(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 532
							var22 = var4 + 1 & 3; // L: 533
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 536
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 537
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 538
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 541
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 542
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field977[var4], Tiles.field977[var22], var19, var21); // L: 544
							if (var8.modelClipped) { // L: 545
								if (var4 == 0) { // L: 546
									var10000 = class17.field92[var0][var1]; // L: 547
									var10000[var2] |= 585;
									var10000 = class17.field92[var0][var1]; // L: 548
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 550
									var10000 = class17.field92[var0][var1]; // L: 551
									var10000[1 + var2] |= 1170;
									var10000 = class17.field92[var0][var1 + 1]; // L: 552
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 554
									var10000 = class17.field92[var0][var1 + 1]; // L: 555
									var10000[var2] |= 585;
									var10000 = class17.field92[var0][var1]; // L: 556
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 558
									var10000 = class17.field92[var0][var1]; // L: 559
									var10000[var2] |= 1170;
									var10000 = class17.field92[var0][var1]; // L: 560
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 563
								var7.method3795(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 564
								var6.method4067(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 567
							if (var8.animationId == -1 && var8.transforms == null) { // L: 569
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 570
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field978[var4], 0, var19, var21); // L: 571
							if (var8.clipped) { // L: 572
								if (var4 == 0) { // L: 573
									Tiles.field975[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 574
									Tiles.field975[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 575
									Tiles.field975[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 576
									Tiles.field975[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 578
								var7.method3795(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 581
							if (var8.animationId == -1 && var8.transforms == null) { // L: 583
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 584
							}

							var6.method4061(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 585
							if (var8.interactType != 0 && var7 != null) { // L: 586
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 587
								var6.method4067(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 590
							if (var8.animationId == -1 && var8.transforms == null) { // L: 592
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 593
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field977[var4], 0, 0, 0, var19, var21); // L: 594
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 597
								var22 = 16; // L: 598
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 599
								if (var23 != 0L) { // L: 600
									var22 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 602
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 603
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field977[var4], 0, var22 * Tiles.field979[var4], var22 * Tiles.field982[var4], var19, var21); // L: 604
							} else if (var5 == 6) { // L: 607
								var22 = 8; // L: 608
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 609
								if (var23 != 0L) { // L: 610
									var22 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 612
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 613
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field981[var4], var22 * Tiles.field970[var4], var19, var21); // L: 614
							} else if (var5 == 7) { // L: 617
								var28 = var4 + 2 & 3; // L: 619
								if (var8.animationId == -1 && var8.transforms == null) { // L: 620
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 621
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 622
							} else if (var5 == 8) { // L: 625
								var22 = 8; // L: 626
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 627
								if (var23 != 0L) { // L: 628
									var22 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 631
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 632
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 633
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 634
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 637
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 638
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field981[var4], var22 * Tiles.field970[var4], var19, var21); // L: 640
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 453
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 454
					}

					if (var29 != null && var6.method4061(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 455 456
						var28 = 15; // L: 457
						if (var29 instanceof Model) { // L: 458
							var28 = ((Model)var29).method4304() / 4; // L: 459
							if (var28 > 30) { // L: 460
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 462
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 463
								if (var28 > Tiles.field975[var0][var31 + var1][var32 + var2]) { // L: 464
									Tiles.field975[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 469
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 449 470 479 516 530 565 579 588 595 605 615 623 641 643

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-808402863"
	)
	static void method6250() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4816
			class9.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4817
		}

	} // L: 4819
}
