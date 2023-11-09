import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2091348261
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1750766831
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1589620863
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1917723923
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -215829263
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2017792735
	)
	int field1128;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1031118679
	)
	int field1130;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1609452867
	)
	int field1135;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1840767699
	)
	int field1131;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1919497029
	)
	int field1132;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2144249083
	)
	int field1133;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -974620651
	)
	int field1134;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 412374047
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 468175117
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1134 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1524864888"
	)
	void method2344(int var1) {
		this.field1134 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "37"
	)
	boolean method2345(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1134 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIILip;Liz;I)Z",
		garbageValue = "806683414"
	)
	static final boolean method2343(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 315
		int var6 = var1; // L: 316
		byte var7 = 64; // L: 317
		byte var8 = 64; // L: 318
		int var9 = var0 - var7; // L: 319
		int var10 = var1 - var8; // L: 320
		class212.directions[var7][var8] = 99; // L: 321
		class212.distances[var7][var8] = 0; // L: 322
		byte var11 = 0; // L: 323
		int var12 = 0; // L: 324
		class212.bufferX[var11] = var0; // L: 325
		int var20 = var11 + 1;
		class212.bufferY[var11] = var1; // L: 326
		int[][] var13 = var4.flags; // L: 327

		while (true) {
			label305:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label282:
							do {
								if (var20 == var12) { // L: 328
									class212.field2344 = var5; // L: 447
									class83.field1035 = var6; // L: 448
									return false; // L: 449
								}

								var5 = class212.bufferX[var12]; // L: 329
								var6 = class212.bufferY[var12]; // L: 330
								var12 = var12 + 1 & 4095; // L: 331
								var18 = var5 - var9; // L: 332
								var19 = var6 - var10; // L: 333
								var14 = var5 - var4.xInset; // L: 334
								var15 = var6 - var4.yInset; // L: 335
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 336
									class212.field2344 = var5; // L: 337
									class83.field1035 = var6; // L: 338
									return true; // L: 339
								}

								var16 = class212.distances[var18][var19] + 1; // L: 341
								if (var18 > 0 && class212.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 342 343 344 345
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class212.bufferX[var20] = var5 - 1; // L: 349
											class212.bufferY[var20] = var6; // L: 350
											var20 = var20 + 1 & 4095; // L: 351
											class212.directions[var18 - 1][var19] = 2; // L: 352
											class212.distances[var18 - 1][var19] = var16; // L: 353
											break;
										}

										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) { // L: 347
											break;
										}

										++var17; // L: 346
									}
								}

								if (var18 < 128 - var2 && class212.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 355 356 357 358
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class212.bufferX[var20] = var5 + 1; // L: 362
											class212.bufferY[var20] = var6; // L: 363
											var20 = var20 + 1 & 4095; // L: 364
											class212.directions[var18 + 1][var19] = 8; // L: 365
											class212.distances[var18 + 1][var19] = var16; // L: 366
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 360
											break;
										}

										++var17; // L: 359
									}
								}

								if (var19 > 0 && class212.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 368 369 370 371
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class212.bufferX[var20] = var5; // L: 375
											class212.bufferY[var20] = var6 - 1; // L: 376
											var20 = var20 + 1 & 4095; // L: 377
											class212.directions[var18][var19 - 1] = 1; // L: 378
											class212.distances[var18][var19 - 1] = var16; // L: 379
											break;
										}

										if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 373
											break;
										}

										++var17; // L: 372
									}
								}

								if (var19 < 128 - var2 && class212.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 381 382 383 384
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class212.bufferX[var20] = var5; // L: 388
											class212.bufferY[var20] = var6 + 1; // L: 389
											var20 = var20 + 1 & 4095; // L: 390
											class212.directions[var18][var19 + 1] = 4; // L: 391
											class212.distances[var18][var19 + 1] = var16; // L: 392
											break;
										}

										if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) { // L: 386
											break;
										}

										++var17; // L: 385
									}
								}

								if (var18 > 0 && var19 > 0 && class212.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 394 395 396
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class212.bufferX[var20] = var5 - 1; // L: 401
											class212.bufferY[var20] = var6 - 1; // L: 402
											var20 = var20 + 1 & 4095; // L: 403
											class212.directions[var18 - 1][var19 - 1] = 3; // L: 404
											class212.distances[var18 - 1][var19 - 1] = var16; // L: 405
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 398 399
											break;
										}

										++var17; // L: 397
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class212.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 407 408 409
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class212.bufferX[var20] = var5 + 1; // L: 414
											class212.bufferY[var20] = var6 - 1; // L: 415
											var20 = var20 + 1 & 4095; // L: 416
											class212.directions[var18 + 1][var19 - 1] = 9; // L: 417
											class212.distances[var18 + 1][var19 - 1] = var16; // L: 418
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 411 412
											break;
										}

										++var17; // L: 410
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class212.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 420 421 422
									for (var17 = 1; var17 < var2; ++var17) { // L: 423
										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 424 425
											continue label282;
										}
									}

									class212.bufferX[var20] = var5 - 1; // L: 427
									class212.bufferY[var20] = var6 + 1; // L: 428
									var20 = var20 + 1 & 4095; // L: 429
									class212.directions[var18 - 1][var19 + 1] = 6; // L: 430
									class212.distances[var18 - 1][var19 + 1] = var16; // L: 431
								}
							} while(var18 >= 128 - var2); // L: 433
						} while(var19 >= 128 - var2);
					} while(class212.directions[var18 + 1][var19 + 1] != 0); // L: 434
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 435

				for (var17 = 1; var17 < var2; ++var17) { // L: 436
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) { // L: 437 438
						continue label305;
					}
				}

				class212.bufferX[var20] = var5 + 1; // L: 440
				class212.bufferY[var20] = var6 + 1; // L: 441
				var20 = var20 + 1 & 4095; // L: 442
				class212.directions[var18 + 1][var19 + 1] = 12; // L: 443
				class212.distances[var18 + 1][var19 + 1] = var16; // L: 444
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-183595775"
	)
	static final void method2350() {
		if (Client.logoutTimer > 0) { // L: 2993
			class278.logOut(); // L: 2994
		} else {
			Client.timer.method7323(); // L: 2997
			class19.method280(40); // L: 2998
			GroundObject.field2411 = Client.packetWriter.getSocket(); // L: 2999
			Client.packetWriter.removeSocket(); // L: 3000
		}
	} // L: 2995 3001

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-587511051"
	)
	static final void method2351(int var0, int var1, int var2) {
		if (class381.cameraX < var0) { // L: 3833
			class381.cameraX = (var0 - class381.cameraX) * class313.field3676 / 1000 + class381.cameraX + class19.field104; // L: 3834
			if (class381.cameraX > var0) { // L: 3835
				class381.cameraX = var0;
			}
		}

		if (class381.cameraX > var0) { // L: 3837
			class381.cameraX -= (class381.cameraX - var0) * class313.field3676 / 1000 + class19.field104; // L: 3838
			if (class381.cameraX < var0) { // L: 3839
				class381.cameraX = var0;
			}
		}

		if (class351.cameraY < var1) { // L: 3841
			class351.cameraY = (var1 - class351.cameraY) * class313.field3676 / 1000 + class351.cameraY + class19.field104; // L: 3842
			if (class351.cameraY > var1) { // L: 3843
				class351.cameraY = var1;
			}
		}

		if (class351.cameraY > var1) { // L: 3845
			class351.cameraY -= (class351.cameraY - var1) * class313.field3676 / 1000 + class19.field104; // L: 3846
			if (class351.cameraY < var1) { // L: 3847
				class351.cameraY = var1;
			}
		}

		if (class471.cameraZ < var2) { // L: 3849
			class471.cameraZ = (var2 - class471.cameraZ) * class313.field3676 / 1000 + class471.cameraZ + class19.field104; // L: 3850
			if (class471.cameraZ > var2) { // L: 3851
				class471.cameraZ = var2;
			}
		}

		if (class471.cameraZ > var2) { // L: 3853
			class471.cameraZ -= (class471.cameraZ - var2) * class313.field3676 / 1000 + class19.field104; // L: 3854
			if (class471.cameraZ < var2) { // L: 3855
				class471.cameraZ = var2;
			}
		}

	} // L: 3857

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ldq;IB)V",
		garbageValue = "-47"
	)
	static final void method2355(Actor var0, int var1) {
		GrandExchangeOfferUnitPriceComparator.worldToScreen(var0.x, var0.y, var1); // L: 5466
	} // L: 5467

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "49"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12137
		short[] var2 = new short[16]; // L: 12138
		int var3 = 0; // L: 12139

		for (int var4 = 0; var4 < ChatChannel.ItemComposition_fileCount; ++var4) { // L: 12140
			ItemComposition var9 = ParamComposition.ItemComposition_get(var4); // L: 12141
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12142 12143 12144
				if (var3 >= 250) { // L: 12145
					class323.foundItemIdCount = -1; // L: 12146
					GrandExchangeEvents.foundItemIds = null; // L: 12147
					return; // L: 12148
				}

				if (var3 >= var2.length) { // L: 12150
					short[] var6 = new short[var2.length * 2]; // L: 12151

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12152
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12153
				}

				var2[var3++] = (short)var4; // L: 12155
			}
		}

		GrandExchangeEvents.foundItemIds = var2; // L: 12157
		class173.foundItemIndex = 0; // L: 12158
		class323.foundItemIdCount = var3; // L: 12159
		String[] var8 = new String[class323.foundItemIdCount]; // L: 12160

		for (int var5 = 0; var5 < class323.foundItemIdCount; ++var5) { // L: 12161
			var8[var5] = ParamComposition.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = GrandExchangeEvents.foundItemIds; // L: 12162
		MouseRecorder.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12164
	} // L: 12166
}
