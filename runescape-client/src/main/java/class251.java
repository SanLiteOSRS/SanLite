import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class251 {
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1275003385
	)
	static int field2858;

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "514329403"
	)
	static final void method5059(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8387
			if (Client.isLowDetail && var0 != Clock.Client_plane) { // L: 8388
				return;
			}

			long var8 = 0L; // L: 8389
			boolean var10 = true; // L: 8390
			boolean var11 = false; // L: 8391
			boolean var12 = false; // L: 8392
			if (var1 == 0) { // L: 8393
				var8 = class36.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8394
				var8 = class36.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8395
				var8 = class36.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8396
				var8 = class36.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (0L != var8) { // L: 8397
				var13 = class36.scene.getObjectFlags(var0, var2, var3, var8); // L: 8398
				int var40 = class215.Entity_unpackID(var8); // L: 8399
				int var41 = var13 & 31; // L: 8400
				int var42 = var13 >> 6 & 3; // L: 8401
				ObjectComposition var14;
				if (var1 == 0) { // L: 8402
					class36.scene.method4529(var0, var2, var3); // L: 8403
					var14 = class175.getObjectDefinition(var40); // L: 8404
					if (var14.interactType != 0) { // L: 8405
						Client.collisionMaps[var0].method4179(var2, var3, var41, var42, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8407
					class36.scene.method4574(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8408
					class36.scene.removeGameObject(var0, var2, var3); // L: 8409
					var14 = class175.getObjectDefinition(var40); // L: 8410
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8411
						return;
					}

					if (var14.interactType != 0) { // L: 8412
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8414
					class36.scene.method4532(var0, var2, var3); // L: 8415
					var14 = class175.getObjectDefinition(var40); // L: 8416
					if (var14.interactType == 1) { // L: 8417
						Client.collisionMaps[var0].method4180(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8420
				var13 = var0; // L: 8421
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8422
					var13 = var0 + 1;
				}

				Scene var43 = class36.scene; // L: 8423
				CollisionMap var15 = Client.collisionMaps[var0]; // L: 8424
				ObjectComposition var16 = class175.getObjectDefinition(var4); // L: 8426
				int var17 = var7 >= 0 ? var7 : var16.animationId; // L: 8427
				int var18;
				int var19;
				if (var5 != 1 && var5 != 3) { // L: 8430
					var18 = var16.sizeX; // L: 8435
					var19 = var16.sizeY; // L: 8436
				} else {
					var18 = var16.sizeY; // L: 8431
					var19 = var16.sizeX; // L: 8432
				}

				int var20;
				int var21;
				if (var18 + var2 <= 104) { // L: 8442
					var20 = (var18 >> 1) + var2; // L: 8443
					var21 = var2 + (var18 + 1 >> 1); // L: 8444
				} else {
					var20 = var2; // L: 8447
					var21 = var2 + 1; // L: 8448
				}

				int var22;
				int var23;
				if (var3 + var19 <= 104) { // L: 8450
					var22 = var3 + (var19 >> 1); // L: 8451
					var23 = var3 + (var19 + 1 >> 1); // L: 8452
				} else {
					var22 = var3; // L: 8455
					var23 = var3 + 1; // L: 8456
				}

				int[][] var24 = Tiles.Tiles_heights[var13]; // L: 8458
				int var25 = var24[var21][var22] + var24[var20][var22] + var24[var20][var23] + var24[var21][var23] >> 2; // L: 8459
				int var26 = (var2 << 7) + (var18 << 6); // L: 8460
				int var27 = (var3 << 7) + (var19 << 6); // L: 8461
				long var28 = class394.calculateTag(var2, var3, 2, var16.int1 == 0, var4); // L: 8462
				int var30 = (var5 << 6) + var6; // L: 8463
				if (var16.int3 == 1) { // L: 8464
					var30 += 256;
				}

				Object var38;
				if (var6 == 22) { // L: 8465
					if (var17 == -1 && var16.transforms == null) { // L: 8467
						var38 = var16.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8468
					}

					var43.newGroundObject(var0, var2, var3, var25, (Renderable)var38, var28, var30); // L: 8469
					if (var16.interactType == 1) { // L: 8470
						var15.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8473
					if (var6 >= 12) { // L: 8481
						if (var17 == -1 && var16.transforms == null) { // L: 8483
							var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8484
						}

						var43.method4522(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8485
						if (var16.interactType != 0) { // L: 8486
							var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
						}
					} else if (var6 == 0) { // L: 8489
						if (var17 == -1 && var16.transforms == null) { // L: 8491
							var38 = var16.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8492
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1021[var5], 0, var28, var30); // L: 8493
						if (var16.interactType != 0) { // L: 8494
							var15.method4189(var2, var3, var6, var5, var16.boolean1);
						}
					} else if (var6 == 1) { // L: 8497
						if (var17 == -1 && var16.transforms == null) {
							var38 = var16.getModel(1, var5, var24, var26, var25, var27); // L: 8499
						} else {
							var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8500
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1022[var5], 0, var28, var30); // L: 8501
						if (var16.interactType != 0) { // L: 8502
							var15.method4189(var2, var3, var6, var5, var16.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) { // L: 8505
							var31 = var5 + 1 & 3; // L: 8506
							Object var33;
							Object var39;
							if (var17 == -1 && var16.transforms == null) { // L: 8509
								var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27); // L: 8510
								var33 = var16.getModel(2, var31, var24, var26, var25, var27); // L: 8511
							} else {
								var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8514
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8515
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field1021[var5], Tiles.field1021[var31], var28, var30); // L: 8517
							if (var16.interactType != 0) { // L: 8518
								var15.method4189(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 3) { // L: 8521
							if (var17 == -1 && var16.transforms == null) { // L: 8523
								var38 = var16.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8524
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1022[var5], 0, var28, var30); // L: 8525
							if (var16.interactType != 0) { // L: 8526
								var15.method4189(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 9) { // L: 8529
							if (var17 == -1 && var16.transforms == null) { // L: 8531
								var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8532
							}

							var43.method4522(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8533
							if (var16.interactType != 0) { // L: 8534
								var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
							}
						} else if (var6 == 4) { // L: 8537
							if (var17 == -1 && var16.transforms == null) { // L: 8539
								var38 = var16.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8540
							}

							var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1021[var5], 0, 0, 0, var28, var30); // L: 8541
						} else {
							long var32;
							Object var34;
							if (var6 == 5) { // L: 8544
								var31 = 16; // L: 8545
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8546
								if (var32 != 0L) { // L: 8547
									var31 = class175.getObjectDefinition(class215.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8549
									var34 = var16.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8550
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1021[var5], 0, var31 * Tiles.field1014[var5], var31 * Tiles.field1023[var5], var28, var30); // L: 8551
							} else if (var6 == 6) { // L: 8554
								var31 = 8; // L: 8555
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8556
								if (var32 != 0L) { // L: 8557
									var31 = class175.getObjectDefinition(class215.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8559
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8560
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1025[var5], var31 * Tiles.field1026[var5], var28, var30); // L: 8561
							} else if (var6 == 7) { // L: 8564
								int var37 = var5 + 2 & 3; // L: 8566
								if (var17 == -1 && var16.transforms == null) { // L: 8567
									var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
								} else {
									var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8568
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30); // L: 8569
							} else if (var6 == 8) { // L: 8572
								var31 = 8; // L: 8573
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8574
								if (0L != var32) { // L: 8575
									var31 = class175.getObjectDefinition(class215.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3; // L: 8578
								Object var35;
								if (var17 == -1 && var16.transforms == null) { // L: 8579
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27); // L: 8580
									var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27); // L: 8581
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8584
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8585
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1025[var5], var31 * Tiles.field1026[var5], var28, var30); // L: 8587
							}
						}
					}
				} else {
					if (var17 == -1 && var16.transforms == null) { // L: 8475
						var38 = var16.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8476
					}

					if (var38 != null) { // L: 8477
						var43.method4522(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var16.interactType != 0) { // L: 8478
						var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
					}
				}
			}
		}

	} // L: 8592
}
