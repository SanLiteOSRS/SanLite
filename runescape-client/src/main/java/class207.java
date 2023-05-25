import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class207 implements class29 {
	@ObfuscatedName("af")
	char[] field2355;
	@ObfuscatedName("an")
	int[] field2359;
	@ObfuscatedName("aw")
	public int[] field2349;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1888573011
	)
	public int field2363;
	@ObfuscatedName("au")
	int[] field2353;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2082731989
	)
	int field2354;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 73809669
	)
	int field2350;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1384260729
	)
	int field2364;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -147657295
	)
	int field2357;
	@ObfuscatedName("aa")
	boolean[] field2358;
	@ObfuscatedName("ay")
	boolean[] field2351;
	@ObfuscatedName("ao")
	boolean[] field2360;
	@ObfuscatedName("ax")
	public char field2361;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 546317845
	)
	public int field2362;

	public class207() {
		this.field2355 = new char[128]; // L: 8
		this.field2359 = new int[128]; // L: 9
		this.field2349 = new int[128]; // L: 10
		this.field2363 = 0; // L: 11
		this.field2353 = new int[128]; // L: 12
		this.field2354 = 0; // L: 13
		this.field2350 = 0; // L: 14
		this.field2364 = 0; // L: 15
		this.field2357 = 0; // L: 16
		this.field2358 = new boolean[112]; // L: 17
		this.field2351 = new boolean[112]; // L: 18
		this.field2360 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1311192309"
	)
	public boolean vmethod4207(int var1) {
		this.method4210(var1); // L: 24
		this.field2358[var1] = true; // L: 25
		this.field2351[var1] = true; // L: 26
		this.field2360[var1] = false; // L: 27
		this.field2349[++this.field2363 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1312051339"
	)
	public boolean vmethod4217(int var1) {
		this.field2358[var1] = false; // L: 33
		this.field2351[var1] = false; // L: 34
		this.field2360[var1] = true; // L: 35
		this.field2353[++this.field2354 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2018590760"
	)
	public boolean vmethod4234(char var1) {
		int var2 = this.field2364 + 1 & 127; // L: 41
		if (var2 != this.field2350) { // L: 42
			this.field2359[this.field2364] = -1; // L: 43
			this.field2355[this.field2364] = var1; // L: 44
			this.field2364 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-16"
	)
	public boolean vmethod4224(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	void method4210(int var1) {
		int var2 = this.field2364 + 1 & 127; // L: 51
		if (var2 != this.field2350) { // L: 52
			this.field2359[this.field2364] = var1; // L: 53
			this.field2355[this.field2364] = 0; // L: 54
			this.field2364 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method4212() {
		this.field2350 = this.field2357; // L: 64
		this.field2357 = this.field2364; // L: 65
		this.field2363 = 0; // L: 66
		this.field2354 = 0; // L: 67
		Arrays.fill(this.field2351, false); // L: 68
		Arrays.fill(this.field2360, false); // L: 69
	} // L: 70

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1805139264"
	)
	public final boolean method4215() {
		if (this.field2357 == this.field2350) { // L: 73
			return false;
		} else {
			this.field2362 = this.field2359[this.field2350]; // L: 74
			this.field2361 = this.field2355[this.field2350]; // L: 75
			this.field2350 = this.field2350 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "92"
	)
	public boolean method4214(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2351[var1] : false; // L: 81 82
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "847321512"
	)
	public boolean method4229(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2358[var1] : false; // L: 86 87
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1556637445"
	)
	public boolean method4231(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2360[var1] : false; // L: 91 92
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1282850562"
	)
	public int[] method4216() {
		int[] var1 = new int[this.field2363]; // L: 96

		for (int var2 = 0; var2 < this.field2363; ++var2) { // L: 97
			var1[var2] = this.field2349[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1821496925"
	)
	public int[] method4213() {
		int[] var1 = new int[this.field2354]; // L: 104

		for (int var2 = 0; var2 < this.field2354; ++var2) { // L: 105
			var1[var2] = this.field2353[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILie;Lif;I)V",
		garbageValue = "-1625886951"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 394 395 396
			if (var0 < Tiles.Tiles_minPlane) { // L: 399
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class144.getObjectDefinition(var3); // L: 400
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 403
				var9 = var8.sizeX; // L: 408
				var10 = var8.sizeY; // L: 409
			} else {
				var9 = var8.sizeY; // L: 404
				var10 = var8.sizeX; // L: 405
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 415
				var11 = (var9 >> 1) + var1; // L: 416
				var12 = (var9 + 1 >> 1) + var1; // L: 417
			} else {
				var11 = var1; // L: 420
				var12 = var1 + 1; // L: 421
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 423
				var13 = (var10 >> 1) + var2; // L: 424
				var14 = var2 + (var10 + 1 >> 1); // L: 425
			} else {
				var13 = var2; // L: 428
				var14 = var2 + 1; // L: 429
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 431
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2; // L: 432
			int var17 = (var1 << 7) + (var9 << 6); // L: 433
			int var18 = (var2 << 7) + (var10 << 6); // L: 434
			long var19 = FaceNormal.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 435
			int var21 = var5 + (var4 << 6); // L: 436
			if (var8.int3 == 1) { // L: 437
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 438
				GameEngine.method684(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 439
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 440
					if (var8.animationId == -1 && var8.transforms == null) { // L: 442
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 443
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 444
					if (var8.interactType == 1 && var7 != null) { // L: 445
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 448
					int[] var10000;
					if (var5 >= 12) { // L: 469
						if (var8.animationId == -1 && var8.transforms == null) { // L: 471
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 472
						}

						var6.method4687(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 473
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 474
							var10000 = class161.field1782[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 475
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 478
						if (var8.animationId == -1 && var8.transforms == null) { // L: 480
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 481
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field995[var4], 0, var19, var21); // L: 482
						if (var4 == 0) { // L: 483
							if (var8.clipped) { // L: 484
								Tiles.field994[var0][var1][var2] = 50; // L: 485
								Tiles.field994[var0][var1][var2 + 1] = 50; // L: 486
							}

							if (var8.modelClipped) { // L: 488
								var10000 = class161.field1782[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 490
							if (var8.clipped) { // L: 491
								Tiles.field994[var0][var1][var2 + 1] = 50; // L: 492
								Tiles.field994[var0][var1 + 1][var2 + 1] = 50; // L: 493
							}

							if (var8.modelClipped) { // L: 495
								var10000 = class161.field1782[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 497
							if (var8.clipped) { // L: 498
								Tiles.field994[var0][var1 + 1][var2] = 50; // L: 499
								Tiles.field994[var0][var1 + 1][var2 + 1] = 50; // L: 500
							}

							if (var8.modelClipped) { // L: 502
								var10000 = class161.field1782[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 504
							if (var8.clipped) { // L: 505
								Tiles.field994[var0][var1][var2] = 50; // L: 506
								Tiles.field994[var0][var1 + 1][var2] = 50; // L: 507
							}

							if (var8.modelClipped) { // L: 509
								var10000 = class161.field1782[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 511
							var7.method4247(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 512
							var6.method4558(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 515
						if (var8.animationId == -1 && var8.transforms == null) { // L: 517
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 518
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21); // L: 519
						if (var8.clipped) { // L: 520
							if (var4 == 0) { // L: 521
								Tiles.field994[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 522
								Tiles.field994[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 523
								Tiles.field994[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 524
								Tiles.field994[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 526
							var7.method4247(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 529
							var22 = var4 + 1 & 3; // L: 530
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 533
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 534
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 535
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 538
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 539
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field995[var4], Tiles.field995[var22], var19, var21); // L: 541
							if (var8.modelClipped) { // L: 542
								if (var4 == 0) { // L: 543
									var10000 = class161.field1782[var0][var1]; // L: 544
									var10000[var2] |= 585;
									var10000 = class161.field1782[var0][var1]; // L: 545
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 547
									var10000 = class161.field1782[var0][var1]; // L: 548
									var10000[1 + var2] |= 1170;
									var10000 = class161.field1782[var0][var1 + 1]; // L: 549
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 551
									var10000 = class161.field1782[var0][var1 + 1]; // L: 552
									var10000[var2] |= 585;
									var10000 = class161.field1782[var0][var1]; // L: 553
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 555
									var10000 = class161.field1782[var0][var1]; // L: 556
									var10000[var2] |= 1170;
									var10000 = class161.field1782[var0][var1]; // L: 557
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 560
								var7.method4247(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 561
								var6.method4558(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 564
							if (var8.animationId == -1 && var8.transforms == null) { // L: 566
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 567
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21); // L: 568
							if (var8.clipped) { // L: 569
								if (var4 == 0) { // L: 570
									Tiles.field994[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 571
									Tiles.field994[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 572
									Tiles.field994[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 573
									Tiles.field994[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 575
								var7.method4247(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 578
							if (var8.animationId == -1 && var8.transforms == null) { // L: 580
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 581
							}

							var6.method4687(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 582
							if (var8.interactType != 0 && var7 != null) { // L: 583
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 584
								var6.method4558(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 587
							if (var8.animationId == -1 && var8.transforms == null) { // L: 589
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 590
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field995[var4], 0, 0, 0, var19, var21); // L: 591
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 594
								var22 = 16; // L: 595
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 596
								if (0L != var23) { // L: 597
									var22 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 599
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 600
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field995[var4], 0, var22 * Tiles.field1007[var4], var22 * Tiles.field1003[var4], var19, var21); // L: 601
							} else if (var5 == 6) { // L: 604
								var22 = 8; // L: 605
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 606
								if (0L != var23) { // L: 607
									var22 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 609
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 610
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1009[var4], var22 * Tiles.field1010[var4], var19, var21); // L: 611
							} else if (var5 == 7) { // L: 614
								var28 = var4 + 2 & 3; // L: 616
								if (var8.animationId == -1 && var8.transforms == null) { // L: 617
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 618
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 619
							} else if (var5 == 8) { // L: 622
								var22 = 8; // L: 623
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 624
								if (0L != var23) { // L: 625
									var22 = class144.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 628
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 629
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 630
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 631
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 634
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 635
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1009[var4], var22 * Tiles.field1010[var4], var19, var21); // L: 637
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 450
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 451
					}

					if (var29 != null && var6.method4687(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 452 453
						var28 = 15; // L: 454
						if (var29 instanceof Model) { // L: 455
							var28 = ((Model)var29).method4762() / 4; // L: 456
							if (var28 > 30) { // L: 457
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 459
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 460
								if (var28 > Tiles.field994[var0][var31 + var1][var32 + var2]) { // L: 461
									Tiles.field994[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 466
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 446 467 476 513 527 562 576 585 592 602 612 620 638 640

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lbp;I)V",
		garbageValue = "2037910040"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 259
		if (var0.sound != null) { // L: 260
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 261
		}

	} // L: 262

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1334904246"
	)
	static final void method4244() {
		int var0 = Players.Players_count; // L: 3794
		int[] var1 = Players.Players_indices; // L: 3795

		for (int var2 = 0; var2 < var0; ++var2) { // L: 3796
			Player var3 = Client.players[var1[var2]]; // L: 3797
			if (var3 != null) { // L: 3798
				ReflectionCheck.updateActorSequence(var3, 1); // L: 3799
			}
		}

	} // L: 3802
}
