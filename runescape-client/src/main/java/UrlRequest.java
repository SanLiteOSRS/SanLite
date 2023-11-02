import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2141798813
	)
	static int field1443;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1310086125
	)
	static int field1446;
	@ObfuscatedName("ac")
	final URL field1444;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1914643579
	)
	volatile int field1445;
	@ObfuscatedName("ao")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1443 = -1; // L: 134
		field1446 = -2; // L: 135
	}

	UrlRequest(URL var1) {
		this.field1445 = field1443; // L: 136
		this.field1444 = var1; // L: 140
	} // L: 141

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1445 != field1443; // L: 144
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "365015590"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 148
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-570806933"
	)
	public String method2868() {
		return this.field1444.toString(); // L: 152
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1964306071"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 57
		if (var1 == null) { // L: 58
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 59 60
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)V",
		garbageValue = "-1837392633"
	)
	public static void method2875(Widget var0, int var1, int var2) {
		var0.field3734.bodyColors[var1] = var2; // L: 1030
		var0.field3734.method6291(); // L: 1031
	} // L: 1032

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILmo;ZI)V",
		garbageValue = "-2002889011"
	)
	static void method2876(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class153.getWorldMap().getMapArea(var0); // L: 5334
		int var4 = TextureProvider.localPlayer.plane; // L: 5335
		int var5 = class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7); // L: 5336
		int var6 = class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7); // L: 5337
		Coord var7 = new Coord(var4, var5, var6); // L: 5338
		class153.getWorldMap().method8670(var3, var7, var1, var2); // L: 5339
	} // L: 5340

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "-1816644009"
	)
	static final void method2877(class309 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8246
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class309.field3245 == var0) { // L: 8247
			var2 = var1.readUnsignedByte(); // L: 8248
			var3 = (var2 >> 4 & 7) + Clock.field1891; // L: 8249
			var4 = (var2 & 7) + class354.field3856; // L: 8250
			var5 = var1.method9238(); // L: 8251
			var6 = var5 >> 2; // L: 8252
			var7 = var5 & 3; // L: 8253
			var8 = Client.field596[var6]; // L: 8254
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8255
				class19.method280(class87.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8256
			}

		} else {
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			Projectile var35;
			byte var37;
			int var41;
			int var42;
			if (class309.field3243 == var0) { // L: 8260
				var2 = var1.method9236() * 4; // L: 8261
				var3 = var1.method9236(); // L: 8262
				byte var38 = var1.method9239(); // L: 8263
				var5 = var1.method9245(); // L: 8264
				var37 = var1.method9240(); // L: 8265
				var7 = var1.method9237(); // L: 8266
				var8 = (var7 >> 4 & 7) + Clock.field1891; // L: 8267
				var9 = (var7 & 7) + class354.field3856; // L: 8268
				var10 = var1.method9254(); // L: 8269
				var11 = var1.readUnsignedShort(); // L: 8270
				var12 = var1.method9255(); // L: 8271
				var13 = var1.method9237(); // L: 8272
				var41 = var1.method9245(); // L: 8273
				var42 = var1.method9238() * 4; // L: 8274
				var6 = var37 + var8; // L: 8275
				var4 = var38 + var9; // L: 8276
				if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var6 >= 0 && var4 >= 0 && var6 < 104 && var4 < 104 && var11 != 65535) { // L: 8277
					var8 = var8 * 128 + 64; // L: 8278
					var9 = var9 * 128 + 64; // L: 8279
					var6 = var6 * 128 + 64; // L: 8280
					var4 = var4 * 128 + 64; // L: 8281
					var35 = new Projectile(var11, class87.Client_plane, var8, var9, class115.getTileHeight(var8, var9, class87.Client_plane) - var42, var5 + Client.cycle, var41 + Client.cycle, var3, var13, var12, var10, var2); // L: 8282
					var35.setDestination(var6, var4, class115.getTileHeight(var6, var4, class87.Client_plane) - var2, var5 + Client.cycle); // L: 8283
					Client.projectiles.addFirst(var35); // L: 8284
				}

			} else if (class309.field3244 == var0) { // L: 8288
				var2 = var1.method9183(); // L: 8289
				var3 = var1.method9238(); // L: 8290
				var4 = (var3 >> 4 & 7) + Clock.field1891; // L: 8291
				var5 = (var3 & 7) + class354.field3856; // L: 8292
				var6 = var1.method9259(); // L: 8293
				var7 = var1.method9260(); // L: 8294
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8295
					NodeDeque var44 = Client.groundItems[class87.Client_plane][var4][var5]; // L: 8296
					if (var44 != null) { // L: 8297
						for (TileItem var36 = (TileItem)var44.last(); var36 != null; var36 = (TileItem)var44.previous()) { // L: 8298 8299 8304
							if ((var2 & 32767) == var36.id && var7 == var36.quantity) { // L: 8300
								var36.quantity = var6; // L: 8301
								break;
							}
						}

						class30.updateItemPile(var4, var5); // L: 8306
					}
				}

			} else {
				byte var14;
				if (class309.field3236 == var0) { // L: 8311
					var2 = var1.readUnsignedByte() * 4; // L: 8312
					var3 = var1.method9245(); // L: 8313
					var4 = var1.method9254(); // L: 8314
					var5 = var1.readUnsignedByte() * 4; // L: 8315
					var6 = var1.method9183(); // L: 8316
					var7 = var1.method9254(); // L: 8317
					var8 = var1.method9245(); // L: 8318
					var9 = var1.method9184(); // L: 8319
					var10 = var1.method9238(); // L: 8320
					var11 = (var10 >> 4 & 7) + Clock.field1891; // L: 8321
					var12 = (var10 & 7) + class354.field3856; // L: 8322
					byte var40 = var1.method9239(); // L: 8323
					var14 = var1.readByte(); // L: 8324
					var42 = var1.method9238(); // L: 8325
					var13 = var40 + var11; // L: 8326
					var41 = var14 + var12; // L: 8327
					if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var13 >= 0 && var41 >= 0 && var13 < 104 && var41 < 104 && var8 != 65535) { // L: 8328
						var11 = var11 * 128 + 64; // L: 8329
						var12 = var12 * 128 + 64; // L: 8330
						var13 = var13 * 128 + 64; // L: 8331
						var41 = var41 * 128 + 64; // L: 8332
						var35 = new Projectile(var8, class87.Client_plane, var11, var12, class115.getTileHeight(var11, var12, class87.Client_plane) - var5, var6 + Client.cycle, var3 + Client.cycle, var42, var9, var4, var7, var2); // L: 8333
						var35.setDestination(var13, var41, class115.getTileHeight(var13, var41, class87.Client_plane) - var2, var6 + Client.cycle); // L: 8334
						Client.projectiles.addFirst(var35); // L: 8335
					}

				} else if (class309.field3246 == var0) { // L: 8339
					var2 = var1.method9237(); // L: 8340
					var3 = var1.method9245(); // L: 8341
					var4 = var1.method9238(); // L: 8342
					var5 = (var4 >> 4 & 7) + Clock.field1891; // L: 8343
					var6 = (var4 & 7) + class354.field3856; // L: 8344
					var7 = var1.readUnsignedByte() * 4; // L: 8345
					var8 = var1.method9245(); // L: 8346
					var9 = var1.method9208(); // L: 8347
					var10 = var1.method9237() * 4; // L: 8348
					var11 = var1.method9184(); // L: 8349
					byte var39 = var1.readByte(); // L: 8350
					var13 = var1.method9237(); // L: 8351
					var14 = var1.method9241(); // L: 8352
					var12 = var39 + var5; // L: 8353
					var41 = var14 + var6; // L: 8354
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var12 >= 0 && var41 >= 0 && var12 < 104 && var41 < 104 && var3 != 65535) { // L: 8355
						var5 = var5 * 128 + 64; // L: 8356
						var6 = var6 * 128 + 64; // L: 8357
						var12 = var12 * 128 + 64; // L: 8358
						var41 = var41 * 128 + 64; // L: 8359
						Projectile var34 = new Projectile(var3, class87.Client_plane, var5, var6, class115.getTileHeight(var5, var6, class87.Client_plane) - var7, var11 + Client.cycle, var8 + Client.cycle, var2, var13, var9, var10); // L: 8360
						var34.setDestination(var12, var41, class115.getTileHeight(var12, var41, class87.Client_plane) - var10, var11 + Client.cycle); // L: 8361
						Client.projectiles.addFirst(var34); // L: 8362
					}

				} else if (class309.field3239 == var0) { // L: 8366
					var2 = var1.method9183(); // L: 8367
					var3 = var1.method9238(); // L: 8368
					var4 = (var3 >> 4 & 7) + Clock.field1891; // L: 8369
					var5 = (var3 & 7) + class354.field3856; // L: 8370
					var6 = var1.method9236(); // L: 8371
					var7 = var6 >> 2; // L: 8372
					var8 = var6 & 3; // L: 8373
					var9 = Client.field596[var7]; // L: 8374
					if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) { // L: 8375
						if (var9 == 0) { // L: 8376
							WallObject var33 = class10.scene.method4681(class87.Client_plane, var4, var5); // L: 8377
							if (var33 != null) { // L: 8378
								var11 = SecureRandomFuture.Entity_unpackID(var33.tag); // L: 8379
								if (var7 == 2) { // L: 8380
									var33.renderable1 = new DynamicObject(var11, 2, var8 + 4, class87.Client_plane, var4, var5, var2, false, var33.renderable1); // L: 8381
									var33.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class87.Client_plane, var4, var5, var2, false, var33.renderable2); // L: 8382
								} else {
									var33.renderable1 = new DynamicObject(var11, var7, var8, class87.Client_plane, var4, var5, var2, false, var33.renderable1); // L: 8384
								}

								return; // L: 8385
							}
						}

						if (var9 == 1) { // L: 8388
							DecorativeObject var45 = class10.scene.method4682(class87.Client_plane, var4, var5); // L: 8389
							if (var45 != null) { // L: 8390
								var11 = SecureRandomFuture.Entity_unpackID(var45.tag); // L: 8391
								if (var7 != 4 && var7 != 5) { // L: 8392
									if (var7 == 6) { // L: 8393
										var45.renderable1 = new DynamicObject(var11, 4, var8 + 4, class87.Client_plane, var4, var5, var2, false, var45.renderable1);
									} else if (var7 == 7) { // L: 8394
										var45.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class87.Client_plane, var4, var5, var2, false, var45.renderable1);
									} else if (var7 == 8) { // L: 8395
										var45.renderable1 = new DynamicObject(var11, 4, var8 + 4, class87.Client_plane, var4, var5, var2, false, var45.renderable1); // L: 8396
										var45.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class87.Client_plane, var4, var5, var2, false, var45.renderable2); // L: 8397
									}
								} else {
									var45.renderable1 = new DynamicObject(var11, 4, var8, class87.Client_plane, var4, var5, var2, false, var45.renderable1);
								}

								return; // L: 8399
							}
						}

						if (var9 == 2) { // L: 8402
							GameObject var46 = class10.scene.getGameObject(class87.Client_plane, var4, var5); // L: 8403
							if (var7 == 11) { // L: 8404
								var7 = 10;
							}

							if (var46 != null) { // L: 8405
								var46.renderable = new DynamicObject(SecureRandomFuture.Entity_unpackID(var46.tag), var7, var8, class87.Client_plane, var4, var5, var2, false, var46.renderable); // L: 8406
								return; // L: 8407
							}
						}

						if (var9 == 3) { // L: 8410
							GroundObject var47 = class10.scene.getGroundObject(class87.Client_plane, var4, var5); // L: 8411
							if (var47 != null) { // L: 8412
								var47.renderable = new DynamicObject(SecureRandomFuture.Entity_unpackID(var47.tag), 22, var8, class87.Client_plane, var4, var5, var2, false, var47.renderable); // L: 8413
								return; // L: 8414
							}
						}

						class266.method5208(class87.Client_plane, var4, var5, var9, var2); // L: 8417
					}

				} else {
					if (class309.field3235 == var0) { // L: 8421
						var2 = var1.method9236(); // L: 8422
						var3 = var1.method9245(); // L: 8423
						var4 = var1.method9238(); // L: 8424
						var5 = var4 >> 4 & 15; // L: 8425
						var6 = var4 & 7; // L: 8426
						var7 = var1.method9236(); // L: 8427
						var8 = (var7 >> 4 & 7) + Clock.field1891; // L: 8428
						var9 = (var7 & 7) + class354.field3856; // L: 8429
						if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 8430
							var10 = var5 + 1; // L: 8431
							if (TextureProvider.localPlayer.pathX[0] >= var8 - var10 && TextureProvider.localPlayer.pathX[0] <= var10 + var8 && TextureProvider.localPlayer.pathY[0] >= var9 - var10 && TextureProvider.localPlayer.pathY[0] <= var10 + var9 && class91.clientPreferences.method2589() != 0 && var6 > 0 && Client.soundEffectCount < 50) { // L: 8432 8433
								Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 8434
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 8435
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 8436
								Client.soundEffects[Client.soundEffectCount] = null; // L: 8437
								Client.soundLocations[Client.soundEffectCount] = var5 + (var9 << 8) + (var8 << 16); // L: 8438
								++Client.soundEffectCount; // L: 8439
							}
						}
					}

					if (class309.field3234 == var0) { // L: 8444
						var2 = var1.method9183(); // L: 8445
						var3 = var1.readUnsignedByte(); // L: 8446
						var4 = (var3 >> 4 & 7) + Clock.field1891; // L: 8447
						var5 = (var3 & 7) + class354.field3856; // L: 8448
						var37 = var1.method9241(); // L: 8449
						var7 = var1.method9245(); // L: 8450
						var8 = var1.readUnsignedShort(); // L: 8451
						var9 = var1.method9184(); // L: 8452
						var10 = var1.method9237(); // L: 8453
						var11 = var10 >> 2; // L: 8454
						var12 = var10 & 3; // L: 8455
						var13 = Client.field596[var11]; // L: 8456
						var14 = var1.method9240(); // L: 8457
						byte var15 = var1.method9241(); // L: 8458
						byte var16 = var1.method9239(); // L: 8459
						Player var17;
						if (var7 == Client.localPlayerIndex) { // L: 8461
							var17 = TextureProvider.localPlayer;
						} else {
							var17 = Client.players[var7]; // L: 8462
						}

						if (var17 != null) { // L: 8463
							ObjectComposition var18 = class91.getObjectDefinition(var8); // L: 8464
							int var19;
							int var20;
							if (var12 != 1 && var12 != 3) { // L: 8467
								var19 = var18.sizeX; // L: 8472
								var20 = var18.sizeY; // L: 8473
							} else {
								var19 = var18.sizeY; // L: 8468
								var20 = var18.sizeX; // L: 8469
							}

							int var21 = var4 + (var19 >> 1); // L: 8475
							int var22 = var4 + (var19 + 1 >> 1); // L: 8476
							int var23 = var5 + (var20 >> 1); // L: 8477
							int var24 = var5 + (var20 + 1 >> 1); // L: 8478
							int[][] var25 = Tiles.Tiles_heights[class87.Client_plane]; // L: 8479
							int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2; // L: 8480
							int var27 = (var4 << 7) + (var19 << 6); // L: 8481
							int var28 = (var5 << 7) + (var20 << 6); // L: 8482
							Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28); // L: 8483
							if (var29 != null) { // L: 8484
								class19.method280(class87.Client_plane, var4, var5, var13, -1, 0, 0, 31, var2 + 1, var9 + 1); // L: 8485
								var17.animationCycleStart = var2 + Client.cycle; // L: 8486
								var17.animationCycleEnd = var9 + Client.cycle; // L: 8487
								var17.model0 = var29; // L: 8488
								var17.field1128 = var4 * 128 + var19 * 64; // L: 8489
								var17.field1120 = var5 * 128 + var20 * 64; // L: 8490
								var17.tileHeight2 = var26; // L: 8491
								byte var30;
								if (var16 > var37) { // L: 8492
									var30 = var16; // L: 8493
									var16 = var37; // L: 8494
									var37 = var30; // L: 8495
								}

								if (var14 > var15) { // L: 8497
									var30 = var14; // L: 8498
									var14 = var15; // L: 8499
									var15 = var30; // L: 8500
								}

								var17.minX = var16 + var4; // L: 8502
								var17.maxX = var37 + var4; // L: 8503
								var17.minY = var14 + var5; // L: 8504
								var17.maxY = var15 + var5; // L: 8505
							}
						}
					}

					TileItem var31;
					if (class309.field3238 == var0) { // L: 8509
						var2 = var1.method9236(); // L: 8510
						var3 = var1.method9261(); // L: 8511
						var4 = var1.method9236(); // L: 8512
						var5 = (var4 >> 4 & 7) + Clock.field1891; // L: 8513
						var6 = (var4 & 7) + class354.field3856; // L: 8514
						var1.method9236(); // L: 8515
						var1.method9183(); // L: 8516
						var1.method9238(); // L: 8517
						var7 = var1.readUnsignedShort(); // L: 8518
						var1.readUnsignedShort(); // L: 8519
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8520
							var31 = new TileItem(); // L: 8521
							var31.id = var7; // L: 8522
							var31.quantity = var3; // L: 8523
							var31.method2724(var2); // L: 8524
							if (Client.groundItems[class87.Client_plane][var5][var6] == null) { // L: 8525
								Client.groundItems[class87.Client_plane][var5][var6] = new NodeDeque(); // L: 8526
							}

							Client.groundItems[class87.Client_plane][var5][var6].addFirst(var31); // L: 8528
							class30.updateItemPile(var5, var6); // L: 8529
						}

					} else {
						NodeDeque var32;
						if (class309.field3237 == var0) { // L: 8533
							var2 = var1.method9236(); // L: 8534
							var3 = (var2 >> 4 & 7) + Clock.field1891; // L: 8535
							var4 = (var2 & 7) + class354.field3856; // L: 8536
							var5 = var1.readUnsignedShort(); // L: 8537
							var6 = var1.method9238(); // L: 8538
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8539
								var32 = Client.groundItems[class87.Client_plane][var3][var4]; // L: 8540
								if (var32 != null) { // L: 8541
									for (var31 = (TileItem)var32.last(); var31 != null; var31 = (TileItem)var32.previous()) { // L: 8542 8543 8548
										if ((var5 & 32767) == var31.id) { // L: 8544
											var31.method2724(var6); // L: 8545
											break;
										}
									}
								}
							}

						} else if (class309.field3240 != var0) { // L: 8554
							if (class309.field3241 == var0) { // L: 8577
								var2 = var1.readUnsignedShort(); // L: 8578
								var3 = var1.readUnsignedShort(); // L: 8579
								var4 = var1.readUnsignedByte(); // L: 8580
								var5 = (var4 >> 4 & 7) + Clock.field1891; // L: 8581
								var6 = (var4 & 7) + class354.field3856; // L: 8582
								var7 = var1.method9237(); // L: 8583
								if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8584
									var5 = var5 * 128 + 64; // L: 8585
									var6 = var6 * 128 + 64; // L: 8586
									GraphicsObject var43 = new GraphicsObject(var3, class87.Client_plane, var5, var6, class115.getTileHeight(var5, var6, class87.Client_plane) - var7, var2, Client.cycle); // L: 8587
									Client.graphicsObjects.addFirst(var43); // L: 8588
								}

							} else if (class309.field3242 == var0) { // L: 8592
								var2 = var1.readUnsignedByte(); // L: 8593
								var3 = var1.method9236(); // L: 8594
								var4 = var3 >> 2; // L: 8595
								var5 = var3 & 3; // L: 8596
								var6 = Client.field596[var4]; // L: 8597
								var7 = var1.method9236(); // L: 8598
								var8 = (var7 >> 4 & 7) + Clock.field1891; // L: 8599
								var9 = (var7 & 7) + class354.field3856; // L: 8600
								var10 = var1.method9184(); // L: 8601
								if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 8602
									class19.method280(class87.Client_plane, var8, var9, var6, var10, var4, var5, var2, 0, -1); // L: 8603
								}

							}
						} else {
							var2 = var1.method9259(); // L: 8555
							var3 = var1.method9236(); // L: 8556
							var4 = (var3 >> 4 & 7) + Clock.field1891; // L: 8557
							var5 = (var3 & 7) + class354.field3856; // L: 8558
							var6 = var1.method9183(); // L: 8559
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8560
								var32 = Client.groundItems[class87.Client_plane][var4][var5]; // L: 8561
								if (var32 != null) { // L: 8562
									for (var31 = (TileItem)var32.last(); var31 != null; var31 = (TileItem)var32.previous()) { // L: 8563 8564 8569
										if ((var6 & 32767) == var31.id && var2 == var31.quantity) { // L: 8565
											var31.remove(); // L: 8566
											break;
										}
									}

									if (var32.last() == null) { // L: 8571
										Client.groundItems[class87.Client_plane][var4][var5] = null;
									}

									class30.updateItemPile(var4, var5); // L: 8572
								}
							}

						}
					}
				}
			}
		}
	} // L: 8258 8286 8309 8337 8364 8419 8531 8552 8575 8590 8605 8607
}
