import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class59 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	VorbisFloor field424;
	@ObfuscatedName("ap")
	boolean field425;
	@ObfuscatedName("af")
	int[] field427;
	@ObfuscatedName("aj")
	int[] field426;
	@ObfuscatedName("aq")
	boolean[] field428;

	@ObfuscatedSignature(
		descriptor = "(Lbq;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field424 = var1; // L: 11
		this.field425 = var2; // L: 12
		this.field427 = var3; // L: 13
		this.field426 = var4; // L: 14
		this.field428 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "1875848056"
	)
	void method1168(float[] var1, int var2) {
		int var3 = this.field424.field274.length; // L: 19
		VorbisFloor var10000 = this.field424; // L: 20
		int var4 = VorbisFloor.field276[this.field424.multiplier - 1];
		boolean[] var5 = this.field428; // L: 21
		this.field428[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field424.method797(this.field427, var6); // L: 25
			var8 = this.field424.method794(this.field427, var6); // L: 26
			var9 = this.field424.method790(this.field427[var7], this.field426[var7], this.field427[var8], this.field426[var8], this.field427[var6]);
			var10 = this.field426[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) {
				boolean[] var14 = this.field428;
				this.field428[var8] = true;
				var14[var7] = true;
				this.field428[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field426[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field426[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field428[var6] = false; // L: 46
				this.field426[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field424.multiplier * this.field426[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field428[var8]) { // L: 54
				var9 = this.field427[var8]; // L: 55
				var10 = this.field424.multiplier * this.field426[var8]; // L: 56
				this.field424.method791(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field424; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1391104652"
	)
	boolean method1169() {
		return this.field425; // L: 68
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-972309169"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field427[var1]; // L: 74
			int var5 = this.field426[var1]; // L: 75
			boolean var6 = this.field428[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field427[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field427[var3] = var8; // L: 80
					this.field426[var3] = this.field426[var7]; // L: 81
					this.field428[var3] = this.field428[var7]; // L: 82
					++var3; // L: 83
					this.field427[var7] = this.field427[var3]; // L: 84
					this.field426[var7] = this.field426[var3]; // L: 85
					this.field428[var7] = this.field428[var3]; // L: 86
				}
			}

			this.field427[var3] = var4; // L: 89
			this.field426[var3] = var5; // L: 90
			this.field428[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1422970877"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 27
		VarbitComposition var1;
		if (var2 != null) { // L: 28
			var1 = var2; // L: 29
		} else {
			byte[] var3 = class436.VarbitDefinition_archive.takeFile(14, var0); // L: 32
			var2 = new VarbitComposition(); // L: 33
			if (var3 != null) { // L: 34
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 35
			var1 = var2; // L: 36
		}

		int var7 = var1.baseVar; // L: 39
		int var4 = var1.startBit; // L: 40
		int var5 = var1.endBit; // L: 41
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 42
		return Varps.Varps_main[var7] >> var4 & var6; // L: 43
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "11"
	)
	static final void method1167(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 154
			for (int var4 = 0; var4 < 8; ++var4) { // L: 155
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 157
			for (var3 = 1; var3 < 8; ++var3) { // L: 158
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 160
			for (var3 = 1; var3 < 8; ++var3) { // L: 161
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 165
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 166

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1324312558"
	)
	static final boolean method1184() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 98
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkn;Lii;B)V",
		garbageValue = "90"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 394 395 396
			if (var0 < Tiles.Tiles_minPlane) { // L: 399
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class137.getObjectDefinition(var3); // L: 400
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
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2; // L: 432
			int var17 = (var1 << 7) + (var9 << 6); // L: 433
			int var18 = (var2 << 7) + (var10 << 6); // L: 434
			long var19 = DynamicObject.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 435
			int var21 = var5 + (var4 << 6); // L: 436
			if (var8.int3 == 1) { // L: 437
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 438
				class7.method47(var0, var1, var2, var8, var4);
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

						var6.method5521(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 473
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 474
							var10000 = Tiles.field1012[var0][var1];
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

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1014[var4], 0, var19, var21); // L: 482
						if (var4 == 0) { // L: 483
							if (var8.clipped) { // L: 484
								AbstractRasterProvider.field5260[var0][var1][var2] = 50; // L: 485
								AbstractRasterProvider.field5260[var0][var1][var2 + 1] = 50; // L: 486
							}

							if (var8.modelClipped) { // L: 488
								var10000 = Tiles.field1012[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 490
							if (var8.clipped) { // L: 491
								AbstractRasterProvider.field5260[var0][var1][var2 + 1] = 50; // L: 492
								AbstractRasterProvider.field5260[var0][var1 + 1][var2 + 1] = 50; // L: 493
							}

							if (var8.modelClipped) { // L: 495
								var10000 = Tiles.field1012[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 497
							if (var8.clipped) { // L: 498
								AbstractRasterProvider.field5260[var0][var1 + 1][var2] = 50; // L: 499
								AbstractRasterProvider.field5260[var0][var1 + 1][var2 + 1] = 50; // L: 500
							}

							if (var8.modelClipped) { // L: 502
								var10000 = Tiles.field1012[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 504
							if (var8.clipped) { // L: 505
								AbstractRasterProvider.field5260[var0][var1][var2] = 50; // L: 506
								AbstractRasterProvider.field5260[var0][var1 + 1][var2] = 50; // L: 507
							}

							if (var8.modelClipped) { // L: 509
								var10000 = Tiles.field1012[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 511
							var7.method4466(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 512
							var6.method5398(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 515
						if (var8.animationId == -1 && var8.transforms == null) { // L: 517
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 518
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1015[var4], 0, var19, var21); // L: 519
						if (var8.clipped) { // L: 520
							if (var4 == 0) { // L: 521
								AbstractRasterProvider.field5260[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 522
								AbstractRasterProvider.field5260[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 523
								AbstractRasterProvider.field5260[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 524
								AbstractRasterProvider.field5260[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 526
							var7.method4466(var1, var2, var5, var4, var8.boolean1);
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

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1014[var4], Tiles.field1014[var22], var19, var21); // L: 541
							if (var8.modelClipped) { // L: 542
								if (var4 == 0) { // L: 543
									var10000 = Tiles.field1012[var0][var1]; // L: 544
									var10000[var2] |= 585;
									var10000 = Tiles.field1012[var0][var1]; // L: 545
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 547
									var10000 = Tiles.field1012[var0][var1]; // L: 548
									var10000[1 + var2] |= 1170;
									var10000 = Tiles.field1012[var0][var1 + 1]; // L: 549
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 551
									var10000 = Tiles.field1012[var0][var1 + 1]; // L: 552
									var10000[var2] |= 585;
									var10000 = Tiles.field1012[var0][var1]; // L: 553
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 555
									var10000 = Tiles.field1012[var0][var1]; // L: 556
									var10000[var2] |= 1170;
									var10000 = Tiles.field1012[var0][var1]; // L: 557
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 560
								var7.method4466(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 561
								var6.method5398(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 564
							if (var8.animationId == -1 && var8.transforms == null) { // L: 566
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 567
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1015[var4], 0, var19, var21); // L: 568
							if (var8.clipped) { // L: 569
								if (var4 == 0) { // L: 570
									AbstractRasterProvider.field5260[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 571
									AbstractRasterProvider.field5260[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 572
									AbstractRasterProvider.field5260[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 573
									AbstractRasterProvider.field5260[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 575
								var7.method4466(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 578
							if (var8.animationId == -1 && var8.transforms == null) { // L: 580
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 581
							}

							var6.method5521(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 582
							if (var8.interactType != 0 && var7 != null) { // L: 583
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 584
								var6.method5398(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 587
							if (var8.animationId == -1 && var8.transforms == null) { // L: 589
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 590
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1014[var4], 0, 0, 0, var19, var21); // L: 591
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 594
								var22 = 16; // L: 595
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 596
								if (var23 != 0L) { // L: 597
									var22 = class137.getObjectDefinition(class167.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 599
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 600
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1014[var4], 0, var22 * Tiles.field1018[var4], var22 * Tiles.field1017[var4], var19, var21); // L: 601
							} else if (var5 == 6) { // L: 604
								var22 = 8; // L: 605
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 606
								if (var23 != 0L) { // L: 607
									var22 = class137.getObjectDefinition(class167.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 609
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 610
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1010[var4], var22 * Tiles.field1007[var4], var19, var21); // L: 611
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
									var22 = class137.getObjectDefinition(class167.Entity_unpackID(var23)).int2 / 2;
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

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1010[var4], var22 * Tiles.field1007[var4], var19, var21); // L: 637
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 450
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 451
					}

					if (var29 != null && var6.method5521(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 452 453
						var28 = 15; // L: 454
						if (var29 instanceof Model) { // L: 455
							var28 = ((Model)var29).method5644() / 4; // L: 456
							if (var28 > 30) { // L: 457
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 459
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 460
								if (var28 > AbstractRasterProvider.field5260[var0][var31 + var1][var32 + var2]) { // L: 461
									AbstractRasterProvider.field5260[var0][var31 + var1][var32 + var2] = (byte)var28;
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1023307831"
	)
	static int method1186(int var0, Script var1, boolean var2) {
		return 2; // L: 5329
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	static final void method1170(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class25.field134 || class184.field1925 != var1) { // L: 5877
			class25.field134 = var0; // L: 5880
			class184.field1925 = var1; // L: 5881
			class131.method3087(25); // L: 5882
			StructComposition.drawLoadingMessage("Loading - please wait.", true); // L: 5883
			int var3 = HealthBarDefinition.baseX * 64; // L: 5884
			int var4 = WorldMapScaleHandler.baseY * 64; // L: 5885
			HealthBarDefinition.baseX = (var0 - 6) * 8; // L: 5886
			WorldMapScaleHandler.baseY = (var1 - 6) * 8; // L: 5887
			int var5 = HealthBarDefinition.baseX * 64 - var3; // L: 5888
			int var6 = WorldMapScaleHandler.baseY * 64 - var4; // L: 5889
			var3 = HealthBarDefinition.baseX * 64; // L: 5890
			var4 = WorldMapScaleHandler.baseY * 64; // L: 5891

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5892
				NPC var19 = Client.npcs[var7]; // L: 5893
				if (var19 != null) { // L: 5894
					for (var9 = 0; var9 < 10; ++var9) { // L: 5895
						var10000 = var19.pathX; // L: 5896
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5897
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5899
					var19.y -= var6 * 128; // L: 5900
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5903
				Player var22 = Client.players[var7]; // L: 5904
				if (var22 != null) { // L: 5905
					for (var9 = 0; var9 < 10; ++var9) { // L: 5906
						var10000 = var22.pathX; // L: 5907
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5908
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5910
					var22.y -= var6 * 128; // L: 5911
				}
			}

			byte var20 = 0; // L: 5914
			byte var8 = 104; // L: 5915
			byte var21 = 1; // L: 5916
			if (var5 < 0) { // L: 5917
				var20 = 103; // L: 5918
				var8 = -1; // L: 5919
				var21 = -1; // L: 5920
			}

			byte var10 = 0; // L: 5922
			byte var11 = 104; // L: 5923
			byte var12 = 1; // L: 5924
			if (var6 < 0) { // L: 5925
				var10 = 103; // L: 5926
				var11 = -1; // L: 5927
				var12 = -1; // L: 5928
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5930
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5931
					int var15 = var5 + var13; // L: 5932
					int var16 = var6 + var14; // L: 5933

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5934
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5935
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5936
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5940 5941 5945
				var18.x -= var5; // L: 5942
				var18.y -= var6; // L: 5943
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5944
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5947
				Client.destinationX -= var5; // L: 5948
				Client.destinationY -= var6; // L: 5949
			}

			Client.soundEffectCount = 0; // L: 5951
			Client.isCameraLocked = false; // L: 5952
			GameEngine.cameraX -= var5 << 7; // L: 5953
			GrandExchangeOfferTotalQuantityComparator.cameraZ -= var6 << 7; // L: 5954
			class367.oculusOrbFocalPointX -= var5 << 7; // L: 5955
			WorldMapCacheName.oculusOrbFocalPointY -= var6 << 7; // L: 5956
			Client.field732 = -1; // L: 5957
			Client.graphicsObjects.clear(); // L: 5958
			Client.projectiles.clear(); // L: 5959

			for (var14 = 0; var14 < 4; ++var14) { // L: 5960
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5878 5961

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "56"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class380.field4414.method6347(var1, var2); // L: 10016
		if (var5 != null) { // L: 10017
			if (var5.onOp != null) { // L: 10018
				ScriptEvent var6 = new ScriptEvent(); // L: 10019
				var6.widget = var5; // L: 10020
				var6.opIndex = var0; // L: 10021
				var6.targetName = var4; // L: 10022
				var6.args = var5.onOp; // L: 10023
				WorldMapSectionType.runScriptEvent(var6); // L: 10024
			}

			boolean var11 = true; // L: 10026
			if (var5.contentType > 0) { // L: 10027
				var11 = Coord.method6334(var5);
			}

			if (var11) { // L: 10028
				int var8 = class405.getWidgetFlags(var5); // L: 10030
				int var9 = var0 - 1; // L: 10031
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 10033
				if (var7) { // L: 10035
					PacketBufferNode var10;
					if (var0 == 1) { // L: 10038
						var10 = class482.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 10040
						var10.packetBuffer.method9373(var1); // L: 10041
						var10.packetBuffer.writeShort(var2); // L: 10042
						var10.packetBuffer.writeShort(var3); // L: 10043
						Client.packetWriter.addNode(var10); // L: 10044
					}

					if (var0 == 2) { // L: 10046
						var10 = class482.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 10048
						var10.packetBuffer.method9373(var1); // L: 10049
						var10.packetBuffer.writeShort(var2); // L: 10050
						var10.packetBuffer.writeShort(var3); // L: 10051
						Client.packetWriter.addNode(var10); // L: 10052
					}

					if (var0 == 3) { // L: 10054
						var10 = class482.getPacketBufferNode(ClientPacket.field3232, Client.packetWriter.isaacCipher); // L: 10056
						var10.packetBuffer.method9373(var1); // L: 10057
						var10.packetBuffer.writeShort(var2); // L: 10058
						var10.packetBuffer.writeShort(var3); // L: 10059
						Client.packetWriter.addNode(var10); // L: 10060
					}

					if (var0 == 4) { // L: 10062
						var10 = class482.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 10064
						var10.packetBuffer.method9373(var1); // L: 10065
						var10.packetBuffer.writeShort(var2); // L: 10066
						var10.packetBuffer.writeShort(var3); // L: 10067
						Client.packetWriter.addNode(var10); // L: 10068
					}

					if (var0 == 5) { // L: 10070
						var10 = class482.getPacketBufferNode(ClientPacket.field3183, Client.packetWriter.isaacCipher); // L: 10072
						var10.packetBuffer.method9373(var1); // L: 10073
						var10.packetBuffer.writeShort(var2); // L: 10074
						var10.packetBuffer.writeShort(var3); // L: 10075
						Client.packetWriter.addNode(var10); // L: 10076
					}

					if (var0 == 6) { // L: 10078
						var10 = class482.getPacketBufferNode(ClientPacket.field3247, Client.packetWriter.isaacCipher); // L: 10080
						var10.packetBuffer.method9373(var1); // L: 10081
						var10.packetBuffer.writeShort(var2); // L: 10082
						var10.packetBuffer.writeShort(var3); // L: 10083
						Client.packetWriter.addNode(var10); // L: 10084
					}

					if (var0 == 7) { // L: 10086
						var10 = class482.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 10088
						var10.packetBuffer.method9373(var1); // L: 10089
						var10.packetBuffer.writeShort(var2); // L: 10090
						var10.packetBuffer.writeShort(var3); // L: 10091
						Client.packetWriter.addNode(var10); // L: 10092
					}

					if (var0 == 8) { // L: 10094
						var10 = class482.getPacketBufferNode(ClientPacket.field3170, Client.packetWriter.isaacCipher); // L: 10096
						var10.packetBuffer.method9373(var1); // L: 10097
						var10.packetBuffer.writeShort(var2); // L: 10098
						var10.packetBuffer.writeShort(var3); // L: 10099
						Client.packetWriter.addNode(var10); // L: 10100
					}

					if (var0 == 9) { // L: 10102
						var10 = class482.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher); // L: 10104
						var10.packetBuffer.method9373(var1); // L: 10105
						var10.packetBuffer.writeShort(var2); // L: 10106
						var10.packetBuffer.writeShort(var3); // L: 10107
						Client.packetWriter.addNode(var10); // L: 10108
					}

					if (var0 == 10) { // L: 10110
						var10 = class482.getPacketBufferNode(ClientPacket.field3226, Client.packetWriter.isaacCipher); // L: 10112
						var10.packetBuffer.method9373(var1); // L: 10113
						var10.packetBuffer.writeShort(var2); // L: 10114
						var10.packetBuffer.writeShort(var3); // L: 10115
						Client.packetWriter.addNode(var10); // L: 10116
					}

				}
			}
		}
	} // L: 10036 10118

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-355075135"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12564
	}
}
