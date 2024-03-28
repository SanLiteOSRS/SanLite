import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements class495 {
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -1362867791
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 472604941
	)
	int field4954;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 658503565
	)
	int field4955;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1733336851
	)
	int field4952;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lta;",
		garbageValue = "-3"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (class268.field2956.startsWith("win")) { // L: 16
			var1 = 1;
		} else if (class268.field2956.startsWith("mac")) { // L: 17
			var1 = 2;
		} else if (class268.field2956.startsWith("linux")) { // L: 18
			var1 = 3;
		} else {
			var1 = 4; // L: 19
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase(); // L: 23
		} catch (Exception var32) { // L: 25
			var2 = ""; // L: 26
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase(); // L: 29
		} catch (Exception var31) { // L: 31
			var3 = ""; // L: 32
		}

		String var4 = "Unknown"; // L: 34
		String var5 = "1.1"; // L: 35

		try {
			var4 = System.getProperty("java.vendor"); // L: 37
			var5 = System.getProperty("java.version"); // L: 38
		} catch (Exception var30) { // L: 40
		}

		boolean var29;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) { // L: 42
			var29 = false; // L: 43
		} else {
			var29 = true;
		}

		byte var7 = 0; // L: 44
		if (var1 == 1) { // L: 45
			if (var3.indexOf("4.0") != -1) { // L: 46
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) { // L: 47
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) { // L: 48
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) { // L: 49
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) { // L: 50
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) { // L: 51
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) { // L: 52
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) { // L: 53
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) { // L: 54
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) { // L: 55
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) { // L: 56
				var7 = 11;
			}
		} else if (var1 == 2) { // L: 58
			if (var3.indexOf("10.4") != -1) { // L: 59
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) { // L: 60
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) { // L: 61
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) { // L: 62
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) { // L: 63
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) { // L: 64
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) { // L: 65
				var7 = 26;
			} else if (var3.indexOf("10.11") != -1) { // L: 66
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) { // L: 67
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) { // L: 68
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) { // L: 71
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) { // L: 72
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) { // L: 73
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) { // L: 74
			var8 = 5;
		} else {
			var8 = 4; // L: 75
		}

		this.method8621(var5); // L: 76
		boolean var9 = false; // L: 77
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1; // L: 78
		int var11;
		if (this.field4954 > 3) { // L: 81
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0; // L: 82
		}

		byte var12 = 0; // L: 83
		String var13 = ""; // L: 84
		String var14 = ""; // L: 85
		String var15 = ""; // L: 86
		String var16 = ""; // L: 87
		String var17 = ""; // L: 88
		String var18 = ""; // L: 89
		boolean var19 = false; // L: 90
		boolean var20 = false; // L: 91
		boolean var21 = false; // L: 92
		boolean var22 = false; // L: 93
		int[] var23 = new int[3]; // L: 94
		boolean var24 = false; // L: 95
		String var25 = ""; // L: 96
		String var26 = ""; // L: 97
		String var27 = ""; // L: 98
		boolean var28 = false;
		return new PlatformInfo(var1, var29, var7, var8, this.field4954, this.field4955, this.field4952, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27); // L: 100
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-836150936"
	)
	void method8621(String var1) {
		if (var1.startsWith("1.")) { // L: 104
			this.method8609(var1); // L: 105
		} else {
			this.method8610(var1); // L: 108
		}

	} // L: 110

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "39"
	)
	void method8609(String var1) {
		String[] var2 = var1.split("\\."); // L: 113

		try {
			this.field4954 = Integer.parseInt(var2[1]); // L: 115
			var2 = var2[2].split("_"); // L: 116
			this.field4955 = Integer.parseInt(var2[0]); // L: 117
			this.field4952 = Integer.parseInt(var2[1]); // L: 118
		} catch (Exception var4) { // L: 120
		}

	} // L: 121

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "82"
	)
	void method8610(String var1) {
		String[] var2 = var1.split("\\."); // L: 124

		try {
			this.field4954 = Integer.parseInt(var2[0]); // L: 126
			this.field4955 = Integer.parseInt(var2[1]); // L: 127
			this.field4952 = Integer.parseInt(var2[2]); // L: 128
		} catch (Exception var4) { // L: 130
		}

	} // L: 131

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1822817273"
	)
	static int method8619(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 99
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjp;Lix;B)V",
		garbageValue = "94"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 366 367 368
			if (var0 < Tiles.Tiles_minPlane) { // L: 371
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = MouseRecorder.getObjectDefinition(var3); // L: 372
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 375
				var9 = var8.sizeX; // L: 380
				var10 = var8.sizeY; // L: 381
			} else {
				var9 = var8.sizeY; // L: 376
				var10 = var8.sizeX; // L: 377
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 387
				var11 = (var9 >> 1) + var1; // L: 388
				var12 = (var9 + 1 >> 1) + var1; // L: 389
			} else {
				var11 = var1; // L: 392
				var12 = var1 + 1; // L: 393
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 395
				var13 = (var10 >> 1) + var2; // L: 396
				var14 = var2 + (var10 + 1 >> 1); // L: 397
			} else {
				var13 = var2; // L: 400
				var14 = var2 + 1; // L: 401
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 403
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2; // L: 404
			int var17 = (var1 << 7) + (var9 << 6); // L: 405
			int var18 = (var2 << 7) + (var10 << 6); // L: 406
			long var19 = class154.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 407
			int var21 = var5 + (var4 << 6); // L: 408
			if (var8.int3 == 1) { // L: 409
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 410
				class379.method7069(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 411
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 412
					if (var8.animationId == -1 && var8.transforms == null) { // L: 414
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 415
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 416
					if (var8.interactType == 1 && var7 != null) { // L: 417
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 420
					int[] var10000;
					if (var5 >= 12) { // L: 441
						if (var8.animationId == -1 && var8.transforms == null) { // L: 443
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 444
						}

						var6.method4751(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 445
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 446
							var10000 = class168.field1833[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 447
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 450
						if (var8.animationId == -1 && var8.transforms == null) { // L: 452
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 453
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1035[var4], 0, var19, var21); // L: 454
						if (var4 == 0) { // L: 455
							if (var8.clipped) { // L: 456
								TextureProvider.field2750[var0][var1][var2] = 50; // L: 457
								TextureProvider.field2750[var0][var1][var2 + 1] = 50; // L: 458
							}

							if (var8.modelClipped) { // L: 460
								var10000 = class168.field1833[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 462
							if (var8.clipped) { // L: 463
								TextureProvider.field2750[var0][var1][var2 + 1] = 50; // L: 464
								TextureProvider.field2750[var0][var1 + 1][var2 + 1] = 50; // L: 465
							}

							if (var8.modelClipped) { // L: 467
								var10000 = class168.field1833[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 469
							if (var8.clipped) { // L: 470
								TextureProvider.field2750[var0][var1 + 1][var2] = 50; // L: 471
								TextureProvider.field2750[var0][var1 + 1][var2 + 1] = 50; // L: 472
							}

							if (var8.modelClipped) { // L: 474
								var10000 = class168.field1833[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 476
							if (var8.clipped) { // L: 477
								TextureProvider.field2750[var0][var1][var2] = 50; // L: 478
								TextureProvider.field2750[var0][var1 + 1][var2] = 50; // L: 479
							}

							if (var8.modelClipped) { // L: 481
								var10000 = class168.field1833[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 483
							var7.method4353(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 484
							var6.method4835(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 487
						if (var8.animationId == -1 && var8.transforms == null) { // L: 489
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 490
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1044[var4], 0, var19, var21); // L: 491
						if (var8.clipped) { // L: 492
							if (var4 == 0) { // L: 493
								TextureProvider.field2750[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 494
								TextureProvider.field2750[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 495
								TextureProvider.field2750[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 496
								TextureProvider.field2750[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 498
							var7.method4353(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 501
							var22 = var4 + 1 & 3; // L: 502
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 505
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 506
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 507
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 510
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 511
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1035[var4], Tiles.field1035[var22], var19, var21); // L: 513
							if (var8.modelClipped) { // L: 514
								if (var4 == 0) { // L: 515
									var10000 = class168.field1833[var0][var1]; // L: 516
									var10000[var2] |= 585;
									var10000 = class168.field1833[var0][var1]; // L: 517
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 519
									var10000 = class168.field1833[var0][var1]; // L: 520
									var10000[1 + var2] |= 1170;
									var10000 = class168.field1833[var0][var1 + 1]; // L: 521
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 523
									var10000 = class168.field1833[var0][var1 + 1]; // L: 524
									var10000[var2] |= 585;
									var10000 = class168.field1833[var0][var1]; // L: 525
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 527
									var10000 = class168.field1833[var0][var1]; // L: 528
									var10000[var2] |= 1170;
									var10000 = class168.field1833[var0][var1]; // L: 529
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 532
								var7.method4353(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 533
								var6.method4835(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 536
							if (var8.animationId == -1 && var8.transforms == null) { // L: 538
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 539
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1044[var4], 0, var19, var21); // L: 540
							if (var8.clipped) { // L: 541
								if (var4 == 0) { // L: 542
									TextureProvider.field2750[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 543
									TextureProvider.field2750[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 544
									TextureProvider.field2750[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 545
									TextureProvider.field2750[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 547
								var7.method4353(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 550
							if (var8.animationId == -1 && var8.transforms == null) { // L: 552
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 553
							}

							var6.method4751(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 554
							if (var8.interactType != 0 && var7 != null) { // L: 555
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 556
								var6.method4835(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 559
							if (var8.animationId == -1 && var8.transforms == null) { // L: 561
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 562
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1035[var4], 0, 0, 0, var19, var21); // L: 563
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 566
								var22 = 16; // L: 567
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 568
								if (0L != var23) { // L: 569
									var22 = MouseRecorder.getObjectDefinition(class206.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 571
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 572
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1035[var4], 0, var22 * Tiles.field1037[var4], var22 * Tiles.field1038[var4], var19, var21); // L: 573
							} else if (var5 == 6) { // L: 576
								var22 = 8; // L: 577
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 578
								if (0L != var23) { // L: 579
									var22 = MouseRecorder.getObjectDefinition(class206.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 581
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 582
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1039[var4], var22 * Tiles.field1040[var4], var19, var21); // L: 583
							} else if (var5 == 7) { // L: 586
								var28 = var4 + 2 & 3; // L: 588
								if (var8.animationId == -1 && var8.transforms == null) { // L: 589
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 590
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 591
							} else if (var5 == 8) { // L: 594
								var22 = 8; // L: 595
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 596
								if (0L != var23) { // L: 597
									var22 = MouseRecorder.getObjectDefinition(class206.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 600
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 601
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 602
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 603
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 606
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 607
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1039[var4], var22 * Tiles.field1040[var4], var19, var21); // L: 609
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 422
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 423
					}

					if (var29 != null && var6.method4751(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 424 425
						var28 = 15; // L: 426
						if (var29 instanceof Model) { // L: 427
							var28 = ((Model)var29).method4947() / 4; // L: 428
							if (var28 > 30) { // L: 429
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 431
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 432
								if (var28 > TextureProvider.field2750[var0][var31 + var1][var32 + var2]) { // L: 433
									TextureProvider.field2750[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 438
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 418 439 448 485 499 534 548 557 564 574 584 592 610 612
}
