import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("ai")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -548165481
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("bo")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field1409;
	@ObfuscatedName("ty")
	static boolean field1412;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)Lib;",
		garbageValue = "89"
	)
	public static class212 method2838() {
		return Client.field519; // L: 1089
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "411345955"
	)
	static final void method2839(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8396
			if (Client.isLowDetail && var0 != BuddyRankComparator.Client_plane) { // L: 8397
				return;
			}

			long var8 = 0L; // L: 8398
			boolean var10 = true; // L: 8399
			boolean var11 = false; // L: 8400
			boolean var12 = false; // L: 8401
			if (var1 == 0) { // L: 8402
				var8 = class173.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8403
				var8 = class173.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8404
				var8 = class173.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8405
				var8 = class173.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) { // L: 8406
				var13 = class173.scene.getObjectFlags(var0, var2, var3, var8); // L: 8407
				int var40 = class318.Entity_unpackID(var8); // L: 8408
				int var41 = var13 & 31; // L: 8409
				int var42 = var13 >> 6 & 3; // L: 8410
				ObjectComposition var14;
				if (var1 == 0) { // L: 8411
					class173.scene.method4631(var0, var2, var3); // L: 8412
					var14 = Language.getObjectDefinition(var40); // L: 8413
					if (var14.interactType != 0) { // L: 8414
						Client.collisionMaps[var0].method4316(var2, var3, var41, var42, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8416
					class173.scene.method4632(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8417
					class173.scene.removeGameObject(var0, var2, var3); // L: 8418
					var14 = Language.getObjectDefinition(var40); // L: 8419
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8420
						return;
					}

					if (var14.interactType != 0) { // L: 8421
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8423
					class173.scene.method4634(var0, var2, var3); // L: 8424
					var14 = Language.getObjectDefinition(var40); // L: 8425
					if (var14.interactType == 1) { // L: 8426
						Client.collisionMaps[var0].method4306(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8429
				var13 = var0; // L: 8430
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8431
					var13 = var0 + 1;
				}

				Scene var43 = class173.scene; // L: 8432
				CollisionMap var15 = Client.collisionMaps[var0]; // L: 8433
				ObjectComposition var16 = Language.getObjectDefinition(var4); // L: 8435
				int var17 = var7 >= 0 ? var7 : var16.animationId; // L: 8436
				int var18;
				int var19;
				if (var5 != 1 && var5 != 3) { // L: 8439
					var18 = var16.sizeX; // L: 8444
					var19 = var16.sizeY; // L: 8445
				} else {
					var18 = var16.sizeY; // L: 8440
					var19 = var16.sizeX; // L: 8441
				}

				int var20;
				int var21;
				if (var18 + var2 <= 104) { // L: 8451
					var20 = (var18 >> 1) + var2; // L: 8452
					var21 = var2 + (var18 + 1 >> 1); // L: 8453
				} else {
					var20 = var2; // L: 8456
					var21 = var2 + 1; // L: 8457
				}

				int var22;
				int var23;
				if (var3 + var19 <= 104) { // L: 8459
					var22 = var3 + (var19 >> 1); // L: 8460
					var23 = var3 + (var19 + 1 >> 1); // L: 8461
				} else {
					var22 = var3; // L: 8464
					var23 = var3 + 1; // L: 8465
				}

				int[][] var24 = Tiles.Tiles_heights[var13]; // L: 8467
				int var25 = var24[var21][var23] + var24[var21][var22] + var24[var20][var22] + var24[var20][var23] >> 2; // L: 8468
				int var26 = (var2 << 7) + (var18 << 6); // L: 8469
				int var27 = (var3 << 7) + (var19 << 6); // L: 8470
				long var28 = ChatChannel.calculateTag(var2, var3, 2, var16.int1 == 0, var4); // L: 8471
				int var30 = (var5 << 6) + var6; // L: 8472
				if (var16.int3 == 1) { // L: 8473
					var30 += 256;
				}

				Object var38;
				if (var6 == 22) { // L: 8474
					if (var17 == -1 && var16.transforms == null) { // L: 8476
						var38 = var16.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8477
					}

					var43.newGroundObject(var0, var2, var3, var25, (Renderable)var38, var28, var30); // L: 8478
					if (var16.interactType == 1) { // L: 8479
						var15.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8482
					if (var6 >= 12) { // L: 8490
						if (var17 == -1 && var16.transforms == null) { // L: 8492
							var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8493
						}

						var43.method4786(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8494
						if (var16.interactType != 0) { // L: 8495
							var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
						}
					} else if (var6 == 0) { // L: 8498
						if (var17 == -1 && var16.transforms == null) { // L: 8500
							var38 = var16.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8501
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1023[var5], 0, var28, var30); // L: 8502
						if (var16.interactType != 0) { // L: 8503
							var15.method4302(var2, var3, var6, var5, var16.boolean1);
						}
					} else if (var6 == 1) { // L: 8506
						if (var17 == -1 && var16.transforms == null) { // L: 8508
							var38 = var16.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8509
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1024[var5], 0, var28, var30); // L: 8510
						if (var16.interactType != 0) { // L: 8511
							var15.method4302(var2, var3, var6, var5, var16.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) { // L: 8514
							var31 = var5 + 1 & 3; // L: 8515
							Object var33;
							Object var39;
							if (var17 == -1 && var16.transforms == null) { // L: 8518
								var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27); // L: 8519
								var33 = var16.getModel(2, var31, var24, var26, var25, var27); // L: 8520
							} else {
								var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8523
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8524
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field1023[var5], Tiles.field1023[var31], var28, var30); // L: 8526
							if (var16.interactType != 0) { // L: 8527
								var15.method4302(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 3) { // L: 8530
							if (var17 == -1 && var16.transforms == null) { // L: 8532
								var38 = var16.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8533
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1024[var5], 0, var28, var30); // L: 8534
							if (var16.interactType != 0) { // L: 8535
								var15.method4302(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 9) { // L: 8538
							if (var17 == -1 && var16.transforms == null) { // L: 8540
								var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8541
							}

							var43.method4786(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8542
							if (var16.interactType != 0) { // L: 8543
								var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
							}
						} else if (var6 == 4) { // L: 8546
							if (var17 == -1 && var16.transforms == null) { // L: 8548
								var38 = var16.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8549
							}

							var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1023[var5], 0, 0, 0, var28, var30); // L: 8550
						} else {
							long var32;
							Object var34;
							if (var6 == 5) { // L: 8553
								var31 = 16; // L: 8554
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8555
								if (var32 != 0L) { // L: 8556
									var31 = Language.getObjectDefinition(class318.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8558
									var34 = var16.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8559
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1023[var5], 0, var31 * Tiles.field1025[var5], var31 * Tiles.field1030[var5], var28, var30); // L: 8560
							} else if (var6 == 6) { // L: 8563
								var31 = 8; // L: 8564
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8565
								if (0L != var32) { // L: 8566
									var31 = Language.getObjectDefinition(class318.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8568
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8569
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1027[var5], var31 * Tiles.field1031[var5], var28, var30); // L: 8570
							} else if (var6 == 7) { // L: 8573
								int var37 = var5 + 2 & 3; // L: 8575
								if (var17 == -1 && var16.transforms == null) { // L: 8576
									var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
								} else {
									var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8577
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30); // L: 8578
							} else if (var6 == 8) { // L: 8581
								var31 = 8; // L: 8582
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8583
								if (0L != var32) { // L: 8584
									var31 = Language.getObjectDefinition(class318.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3; // L: 8587
								Object var35;
								if (var17 == -1 && var16.transforms == null) { // L: 8588
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27); // L: 8589
									var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27); // L: 8590
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8593
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8594
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1027[var5], var31 * Tiles.field1031[var5], var28, var30); // L: 8596
							}
						}
					}
				} else {
					if (var17 == -1 && var16.transforms == null) { // L: 8484
						var38 = var16.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8485
					}

					if (var38 != null) { // L: 8486
						var43.method4786(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var16.interactType != 0) { // L: 8487
						var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
					}
				}
			}
		}

	} // L: 8601
}
