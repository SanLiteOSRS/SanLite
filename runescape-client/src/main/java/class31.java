import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class31 {
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -729686907
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("am")
	public static Applet field163;
	@ObfuscatedName("ap")
	public static String field161;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("bh")
	protected static boolean field160;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1289889713
	)
	static int field168;

	static {
		field163 = null; // L: 10
		field161 = ""; // L: 11
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lag;",
		garbageValue = "-2066796076"
	)
	public static class6[] method467() {
		return new class6[]{class6.field8}; // L: 12
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdn;I)V",
		garbageValue = "-1065598634"
	)
	static void method466(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = class137.getObjectDefinition(var6); // L: 8355
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) { // L: 8358
			var15 = var14.sizeX; // L: 8363
			var16 = var14.sizeY; // L: 8364
		} else {
			var15 = var14.sizeY; // L: 8359
			var16 = var14.sizeX; // L: 8360
		}

		int var17 = (var15 >> 1) + var1; // L: 8366
		int var18 = (var15 + 1 >> 1) + var1; // L: 8367
		int var19 = (var16 >> 1) + var2; // L: 8368
		int var20 = var2 + (var16 + 1 >> 1); // L: 8369
		int[][] var21 = Tiles.Tiles_heights[var0]; // L: 8370
		int var22 = var21[var18][var20] + var21[var17][var19] + var21[var18][var19] + var21[var17][var20] >> 2; // L: 8371
		int var23 = (var1 << 7) + (var15 << 6); // L: 8372
		int var24 = (var2 << 7) + (var16 << 6); // L: 8373
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24); // L: 8374
		if (var25 != null) { // L: 8375
			class482.method8736(var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1); // L: 8376
			var13.animationCycleStart = var7 + Client.cycle; // L: 8377
			var13.animationCycleEnd = var8 + Client.cycle; // L: 8378
			var13.model0 = var25; // L: 8379
			var13.field1108 = var1 * 128 + var15 * 64; // L: 8380
			var13.field1120 = var2 * 128 + var16 * 64; // L: 8381
			var13.tileHeight2 = var22; // L: 8382
			int var26;
			if (var9 > var11) { // L: 8383
				var26 = var9; // L: 8384
				var9 = var11; // L: 8385
				var11 = var26; // L: 8386
			}

			if (var10 > var12) { // L: 8388
				var26 = var10; // L: 8389
				var10 = var12; // L: 8390
				var12 = var26; // L: 8391
			}

			var13.minX = var9 + var1; // L: 8393
			var13.maxX = var11 + var1; // L: 8394
			var13.minY = var10 + var2; // L: 8395
			var13.maxY = var2 + var12; // L: 8396
		}

	} // L: 8398

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "90"
	)
	static final void method461(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9284
			var2 -= 2000;
		}

		Widget var15;
		if (var2 == 25) { // L: 9285
			var15 = class380.field4414.method6347(var1, var0); // L: 9286
			if (var15 != null) { // L: 9287
				ArchiveDiskActionHandler.method6981(); // L: 9288
				Timer.method8063(var1, var0, class155.Widget_unpackTargetMask(class405.getWidgetFlags(var15)), var4); // L: 9289
				Client.isItemSelected = 0; // L: 9290
				Client.field668 = FontName.Widget_getSpellActionName(var15); // L: 9291
				if (Client.field668 == null) { // L: 9292
					Client.field668 = "null";
				}

				if (var15.isIf3) { // L: 9293
					Client.field669 = var15.dataText + class208.colorStartTag(16777215);
				} else {
					Client.field669 = class208.colorStartTag(65280) + var15.field3830 + class208.colorStartTag(16777215); // L: 9294
				}
			}

		} else {
			Player var9;
			PacketBufferNode var10;
			if (var2 == 47) { // L: 9298
				var9 = Client.players[var3]; // L: 9299
				if (var9 != null) { // L: 9300
					Client.mouseCrossX = var7; // L: 9301
					Client.mouseCrossY = var8; // L: 9302
					Client.mouseCrossColor = 2; // L: 9303
					Client.mouseCrossState = 0; // L: 9304
					Client.destinationX = var0; // L: 9305
					Client.destinationY = var1; // L: 9306
					var10 = class482.getPacketBufferNode(ClientPacket.field3236, Client.packetWriter.isaacCipher); // L: 9308
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9309
					var10.packetBuffer.method9427(var3); // L: 9310
					Client.packetWriter.addNode(var10); // L: 9311
				}
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9314
				GrandExchangeOfferUnitPriceComparator.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9315
			}

			PacketBufferNode var14;
			if (var2 == 3) { // L: 9317
				Client.mouseCrossX = var7; // L: 9318
				Client.mouseCrossY = var8; // L: 9319
				Client.mouseCrossColor = 2; // L: 9320
				Client.mouseCrossState = 0; // L: 9321
				Client.destinationX = var0; // L: 9322
				Client.destinationY = var1; // L: 9323
				var14 = class482.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 9325
				var14.packetBuffer.writeIntME(WorldMapScaleHandler.baseY * 64 + var1); // L: 9326
				var14.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9327
				var14.packetBuffer.writeIntME(HealthBarDefinition.baseX * 64 + var0); // L: 9328
				var14.packetBuffer.method9427(var3); // L: 9329
				Client.packetWriter.addNode(var14); // L: 9330
			}

			if (var2 == 14) { // L: 9332
				var9 = Client.players[var3]; // L: 9333
				if (var9 != null) { // L: 9334
					Client.mouseCrossX = var7; // L: 9335
					Client.mouseCrossY = var8; // L: 9336
					Client.mouseCrossColor = 2; // L: 9337
					Client.mouseCrossState = 0; // L: 9338
					Client.destinationX = var0; // L: 9339
					Client.destinationY = var1; // L: 9340
					var10 = class482.getPacketBufferNode(ClientPacket.field3228, Client.packetWriter.isaacCipher); // L: 9342
					var10.packetBuffer.writeIntME(var3); // L: 9343
					var10.packetBuffer.writeIntME(Decimator.field404); // L: 9344
					var10.packetBuffer.method9427(PlayerType.field4320); // L: 9345
					var10.packetBuffer.method9373(class25.field131); // L: 9346
					var10.packetBuffer.method9416(Client.field661.method4426(82) ? 1 : 0); // L: 9347
					Client.packetWriter.addNode(var10); // L: 9348
				}
			}

			if (var2 == 57 || var2 == 1007) { // L: 9351
				var15 = class380.field4414.method6347(var1, var0); // L: 9352
				if (var15 != null) { // L: 9353
					class59.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9354
				}
			}

			if (var2 == 1001) { // L: 9357
				Client.mouseCrossX = var7; // L: 9358
				Client.mouseCrossY = var8; // L: 9359
				Client.mouseCrossColor = 2; // L: 9360
				Client.mouseCrossState = 0; // L: 9361
				Client.destinationX = var0; // L: 9362
				Client.destinationY = var1; // L: 9363
				var14 = class482.getPacketBufferNode(ClientPacket.field3214, Client.packetWriter.isaacCipher); // L: 9365
				var14.packetBuffer.method9416(Client.field661.method4426(82) ? 1 : 0); // L: 9366
				var14.packetBuffer.method9557(HealthBarDefinition.baseX * 64 + var0); // L: 9367
				var14.packetBuffer.writeShort(WorldMapScaleHandler.baseY * 64 + var1); // L: 9368
				var14.packetBuffer.method9557(var3); // L: 9369
				Client.packetWriter.addNode(var14); // L: 9370
			}

			if (var2 == 58) { // L: 9372
				var15 = class380.field4414.method6347(var1, var0); // L: 9373
				if (var15 != null) { // L: 9374
					if (var15.field3809 != null) { // L: 9375
						ScriptEvent var16 = new ScriptEvent(); // L: 9376
						var16.widget = var15; // L: 9377
						var16.opIndex = var3; // L: 9378
						var16.targetName = var6; // L: 9379
						var16.args = var15.field3809; // L: 9380
						WorldMapSectionType.runScriptEvent(var16); // L: 9381
					}

					var10 = class482.getPacketBufferNode(ClientPacket.field3253, Client.packetWriter.isaacCipher); // L: 9384
					var10.packetBuffer.method9439(var1); // L: 9385
					var10.packetBuffer.writeIntME(var0); // L: 9386
					var10.packetBuffer.method9437(ModelData0.field3101); // L: 9387
					var10.packetBuffer.method9557(Client.field666); // L: 9388
					var10.packetBuffer.writeShort(Client.field554); // L: 9389
					var10.packetBuffer.writeIntME(var4); // L: 9390
					Client.packetWriter.addNode(var10); // L: 9391
				}
			}

			int var11;
			Widget var17;
			if (var2 == 29) { // L: 9394
				var14 = class482.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 9396
				var14.packetBuffer.method9373(var1); // L: 9397
				Client.packetWriter.addNode(var14); // L: 9398
				var17 = class380.field4414.method6348(var1); // L: 9399
				if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) { // L: 9400
					var11 = var17.cs1Instructions[0][1]; // L: 9401
					if (Varps.Varps_main[var11] != var17.cs1ComparisonValues[0]) { // L: 9402
						Varps.Varps_main[var11] = var17.cs1ComparisonValues[0]; // L: 9403
						class136.changeGameOptions(var11); // L: 9404
					}
				}
			}

			if (var2 == 16) { // L: 9408
				Client.mouseCrossX = var7; // L: 9409
				Client.mouseCrossY = var8; // L: 9410
				Client.mouseCrossColor = 2; // L: 9411
				Client.mouseCrossState = 0; // L: 9412
				Client.destinationX = var0; // L: 9413
				Client.destinationY = var1; // L: 9414
				var14 = class482.getPacketBufferNode(ClientPacket.field3242, Client.packetWriter.isaacCipher); // L: 9416
				var14.packetBuffer.writeIntME(var3); // L: 9417
				var14.packetBuffer.method9427(WorldMapScaleHandler.baseY * 64 + var1); // L: 9418
				var14.packetBuffer.method9494(class25.field131); // L: 9419
				var14.packetBuffer.method9427(HealthBarDefinition.baseX * 64 + var0); // L: 9420
				var14.packetBuffer.writeIntME(PlayerType.field4320); // L: 9421
				var14.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9422
				var14.packetBuffer.method9557(Decimator.field404); // L: 9423
				Client.packetWriter.addNode(var14); // L: 9424
			}

			if (var2 == 46) { // L: 9426
				var9 = Client.players[var3]; // L: 9427
				if (var9 != null) { // L: 9428
					Client.mouseCrossX = var7; // L: 9429
					Client.mouseCrossY = var8; // L: 9430
					Client.mouseCrossColor = 2; // L: 9431
					Client.mouseCrossState = 0; // L: 9432
					Client.destinationX = var0; // L: 9433
					Client.destinationY = var1; // L: 9434
					var10 = class482.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher); // L: 9436
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9437
					var10.packetBuffer.method9427(var3); // L: 9438
					Client.packetWriter.addNode(var10); // L: 9439
				}
			}

			if (var2 == 49) { // L: 9442
				var9 = Client.players[var3]; // L: 9443
				if (var9 != null) { // L: 9444
					Client.mouseCrossX = var7; // L: 9445
					Client.mouseCrossY = var8; // L: 9446
					Client.mouseCrossColor = 2; // L: 9447
					Client.mouseCrossState = 0; // L: 9448
					Client.destinationX = var0; // L: 9449
					Client.destinationY = var1; // L: 9450
					var10 = class482.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 9452
					var10.packetBuffer.writeShort(var3); // L: 9453
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9454
					Client.packetWriter.addNode(var10); // L: 9455
				}
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9458 9459
				Occluder.resumePauseWidget(var1, var0); // L: 9460
				Client.meslayerContinueWidget = class380.field4414.method6347(var1, var0); // L: 9461
				FaceNormal.invalidateWidget(Client.meslayerContinueWidget); // L: 9462
			}

			if (var2 == 5) { // L: 9465
				Client.mouseCrossX = var7; // L: 9466
				Client.mouseCrossY = var8; // L: 9467
				Client.mouseCrossColor = 2; // L: 9468
				Client.mouseCrossState = 0; // L: 9469
				Client.destinationX = var0; // L: 9470
				Client.destinationY = var1; // L: 9471
				var14 = class482.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 9473
				var14.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9474
				var14.packetBuffer.writeIntME(WorldMapScaleHandler.baseY * 64 + var1); // L: 9475
				var14.packetBuffer.writeIntME(var3); // L: 9476
				var14.packetBuffer.method9557(HealthBarDefinition.baseX * 64 + var0); // L: 9477
				Client.packetWriter.addNode(var14); // L: 9478
			}

			if (var2 == 17) { // L: 9480
				Client.mouseCrossX = var7; // L: 9481
				Client.mouseCrossY = var8; // L: 9482
				Client.mouseCrossColor = 2; // L: 9483
				Client.mouseCrossState = 0; // L: 9484
				Client.destinationX = var0; // L: 9485
				Client.destinationY = var1; // L: 9486
				var14 = class482.getPacketBufferNode(ClientPacket.field3257, Client.packetWriter.isaacCipher); // L: 9487
				var14.packetBuffer.method9437(ModelData0.field3101); // L: 9488
				var14.packetBuffer.method9427(Client.field666); // L: 9489
				var14.packetBuffer.method9427(var3); // L: 9490
				var14.packetBuffer.writeIntME(HealthBarDefinition.baseX * 64 + var0); // L: 9491
				var14.packetBuffer.writeShort(WorldMapScaleHandler.baseY * 64 + var1); // L: 9492
				var14.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9493
				var14.packetBuffer.writeIntME(Client.field554); // L: 9494
				Client.packetWriter.addNode(var14); // L: 9495
			}

			if (var2 == 48) { // L: 9497
				var9 = Client.players[var3]; // L: 9498
				if (var9 != null) { // L: 9499
					Client.mouseCrossX = var7; // L: 9500
					Client.mouseCrossY = var8; // L: 9501
					Client.mouseCrossColor = 2; // L: 9502
					Client.mouseCrossState = 0; // L: 9503
					Client.destinationX = var0; // L: 9504
					Client.destinationY = var1; // L: 9505
					var10 = class482.getPacketBufferNode(ClientPacket.field3207, Client.packetWriter.isaacCipher); // L: 9507
					var10.packetBuffer.writeShort(var3); // L: 9508
					var10.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9509
					Client.packetWriter.addNode(var10); // L: 9510
				}
			}

			NPC var18;
			if (var2 == 13) { // L: 9513
				var18 = Client.npcs[var3]; // L: 9514
				if (var18 != null) { // L: 9515
					Client.mouseCrossX = var7; // L: 9516
					Client.mouseCrossY = var8; // L: 9517
					Client.mouseCrossColor = 2; // L: 9518
					Client.mouseCrossState = 0; // L: 9519
					Client.destinationX = var0; // L: 9520
					Client.destinationY = var1; // L: 9521
					var10 = class482.getPacketBufferNode(ClientPacket.field3220, Client.packetWriter.isaacCipher); // L: 9523
					var10.packetBuffer.method9416(Client.field661.method4426(82) ? 1 : 0); // L: 9524
					var10.packetBuffer.method9557(var3); // L: 9525
					Client.packetWriter.addNode(var10); // L: 9526
				}
			}

			if (var2 == 18) { // L: 9529
				Client.mouseCrossX = var7; // L: 9530
				Client.mouseCrossY = var8; // L: 9531
				Client.mouseCrossColor = 2; // L: 9532
				Client.mouseCrossState = 0; // L: 9533
				Client.destinationX = var0; // L: 9534
				Client.destinationY = var1; // L: 9535
				var14 = class482.getPacketBufferNode(ClientPacket.field3244, Client.packetWriter.isaacCipher); // L: 9537
				var14.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9538
				var14.packetBuffer.method9557(WorldMapScaleHandler.baseY * 64 + var1); // L: 9539
				var14.packetBuffer.method9427(var3); // L: 9540
				var14.packetBuffer.method9427(HealthBarDefinition.baseX * 64 + var0); // L: 9541
				Client.packetWriter.addNode(var14); // L: 9542
			}

			if (var2 == 15) { // L: 9544
				var9 = Client.players[var3]; // L: 9545
				if (var9 != null) { // L: 9546
					Client.mouseCrossX = var7; // L: 9547
					Client.mouseCrossY = var8; // L: 9548
					Client.mouseCrossColor = 2; // L: 9549
					Client.mouseCrossState = 0; // L: 9550
					Client.destinationX = var0; // L: 9551
					Client.destinationY = var1; // L: 9552
					var10 = class482.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher); // L: 9553
					var10.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9554
					var10.packetBuffer.method9557(Client.field554); // L: 9555
					var10.packetBuffer.method9557(Client.field666); // L: 9556
					var10.packetBuffer.method9439(ModelData0.field3101); // L: 9557
					var10.packetBuffer.method9557(var3); // L: 9558
					Client.packetWriter.addNode(var10); // L: 9559
				}
			}

			if (var2 == 22) { // L: 9562
				Client.mouseCrossX = var7; // L: 9563
				Client.mouseCrossY = var8; // L: 9564
				Client.mouseCrossColor = 2; // L: 9565
				Client.mouseCrossState = 0; // L: 9566
				Client.destinationX = var0; // L: 9567
				Client.destinationY = var1; // L: 9568
				var14 = class482.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher); // L: 9570
				var14.packetBuffer.method9427(var3); // L: 9571
				var14.packetBuffer.method9557(HealthBarDefinition.baseX * 64 + var0); // L: 9572
				var14.packetBuffer.method9557(WorldMapScaleHandler.baseY * 64 + var1); // L: 9573
				var14.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9574
				Client.packetWriter.addNode(var14); // L: 9575
			}

			if (var2 == 1002) { // L: 9577
				Client.mouseCrossX = var7; // L: 9578
				Client.mouseCrossY = var8; // L: 9579
				Client.mouseCrossColor = 2; // L: 9580
				Client.mouseCrossState = 0; // L: 9581
				var14 = class482.getPacketBufferNode(ClientPacket.field3248, Client.packetWriter.isaacCipher); // L: 9583
				var14.packetBuffer.method9557(var3); // L: 9584
				Client.packetWriter.addNode(var14); // L: 9585
			}

			if (var2 == 10) { // L: 9587
				var18 = Client.npcs[var3]; // L: 9588
				if (var18 != null) { // L: 9589
					Client.mouseCrossX = var7; // L: 9590
					Client.mouseCrossY = var8; // L: 9591
					Client.mouseCrossColor = 2; // L: 9592
					Client.mouseCrossState = 0; // L: 9593
					Client.destinationX = var0; // L: 9594
					Client.destinationY = var1; // L: 9595
					var10 = class482.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 9597
					var10.packetBuffer.writeIntME(var3); // L: 9598
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9599
					Client.packetWriter.addNode(var10); // L: 9600
				}
			}

			if (var2 == 6) { // L: 9603
				Client.mouseCrossX = var7; // L: 9604
				Client.mouseCrossY = var8; // L: 9605
				Client.mouseCrossColor = 2; // L: 9606
				Client.mouseCrossState = 0; // L: 9607
				Client.destinationX = var0; // L: 9608
				Client.destinationY = var1; // L: 9609
				var14 = class482.getPacketBufferNode(ClientPacket.field3229, Client.packetWriter.isaacCipher); // L: 9611
				var14.packetBuffer.method9557(var3); // L: 9612
				var14.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9613
				var14.packetBuffer.writeIntME(WorldMapScaleHandler.baseY * 64 + var1); // L: 9614
				var14.packetBuffer.method9427(HealthBarDefinition.baseX * 64 + var0); // L: 9615
				Client.packetWriter.addNode(var14); // L: 9616
			}

			if (var2 == 2) { // L: 9618
				Client.mouseCrossX = var7; // L: 9619
				Client.mouseCrossY = var8; // L: 9620
				Client.mouseCrossColor = 2; // L: 9621
				Client.mouseCrossState = 0; // L: 9622
				Client.destinationX = var0; // L: 9623
				Client.destinationY = var1; // L: 9624
				var14 = class482.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 9625
				var14.packetBuffer.writeIntME(WorldMapScaleHandler.baseY * 64 + var1); // L: 9626
				var14.packetBuffer.method9427(var3); // L: 9627
				var14.packetBuffer.method9427(Client.field666); // L: 9628
				var14.packetBuffer.method9437(ModelData0.field3101); // L: 9629
				var14.packetBuffer.writeShort(HealthBarDefinition.baseX * 64 + var0); // L: 9630
				var14.packetBuffer.method9557(Client.field554); // L: 9631
				var14.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9632
				Client.packetWriter.addNode(var14); // L: 9633
			}

			if (var2 == 8) { // L: 9635
				var18 = Client.npcs[var3]; // L: 9636
				if (var18 != null) { // L: 9637
					Client.mouseCrossX = var7; // L: 9638
					Client.mouseCrossY = var8; // L: 9639
					Client.mouseCrossColor = 2; // L: 9640
					Client.mouseCrossState = 0; // L: 9641
					Client.destinationX = var0; // L: 9642
					Client.destinationY = var1; // L: 9643
					var10 = class482.getPacketBufferNode(ClientPacket.field3238, Client.packetWriter.isaacCipher); // L: 9644
					var10.packetBuffer.writeShort(var3); // L: 9645
					var10.packetBuffer.method9437(ModelData0.field3101); // L: 9646
					var10.packetBuffer.writeShort(Client.field666); // L: 9647
					var10.packetBuffer.method9427(Client.field554); // L: 9648
					var10.packetBuffer.method9416(Client.field661.method4426(82) ? 1 : 0); // L: 9649
					Client.packetWriter.addNode(var10); // L: 9650
				}
			}

			if (var2 == 20) { // L: 9653
				Client.mouseCrossX = var7; // L: 9654
				Client.mouseCrossY = var8; // L: 9655
				Client.mouseCrossColor = 2; // L: 9656
				Client.mouseCrossState = 0; // L: 9657
				Client.destinationX = var0; // L: 9658
				Client.destinationY = var1; // L: 9659
				var14 = class482.getPacketBufferNode(ClientPacket.field3211, Client.packetWriter.isaacCipher); // L: 9661
				var14.packetBuffer.method9557(var3); // L: 9662
				var14.packetBuffer.method9427(HealthBarDefinition.baseX * 64 + var0); // L: 9663
				var14.packetBuffer.writeIntME(WorldMapScaleHandler.baseY * 64 + var1); // L: 9664
				var14.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9665
				Client.packetWriter.addNode(var14); // L: 9666
			}

			if (var2 == 11) { // L: 9668
				var18 = Client.npcs[var3]; // L: 9669
				if (var18 != null) { // L: 9670
					Client.mouseCrossX = var7; // L: 9671
					Client.mouseCrossY = var8; // L: 9672
					Client.mouseCrossColor = 2; // L: 9673
					Client.mouseCrossState = 0; // L: 9674
					Client.destinationX = var0; // L: 9675
					Client.destinationY = var1; // L: 9676
					var10 = class482.getPacketBufferNode(ClientPacket.field3197, Client.packetWriter.isaacCipher); // L: 9678
					var10.packetBuffer.method9427(var3); // L: 9679
					var10.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9680
					Client.packetWriter.addNode(var10); // L: 9681
				}
			}

			if (var2 == 28) { // L: 9684
				var14 = class482.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 9686
				var14.packetBuffer.method9373(var1); // L: 9687
				Client.packetWriter.addNode(var14); // L: 9688
				var17 = class380.field4414.method6348(var1); // L: 9689
				if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) { // L: 9690
					var11 = var17.cs1Instructions[0][1]; // L: 9691
					Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9692
					class136.changeGameOptions(var11); // L: 9693
				}
			}

			if (var2 == 19) { // L: 9696
				Client.mouseCrossX = var7; // L: 9697
				Client.mouseCrossY = var8; // L: 9698
				Client.mouseCrossColor = 2; // L: 9699
				Client.mouseCrossState = 0; // L: 9700
				Client.destinationX = var0; // L: 9701
				Client.destinationY = var1; // L: 9702
				var14 = class482.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 9704
				var14.packetBuffer.method9427(HealthBarDefinition.baseX * 64 + var0); // L: 9705
				var14.packetBuffer.method9557(WorldMapScaleHandler.baseY * 64 + var1); // L: 9706
				var14.packetBuffer.writeShort(var3); // L: 9707
				var14.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9708
				Client.packetWriter.addNode(var14); // L: 9709
			}

			if (var2 == 23) { // L: 9711
				if (Client.isMenuOpen) { // L: 9712
					GrandExchangeOfferOwnWorldComparator.scene.setViewportWalking(); // L: 9713
				} else {
					GrandExchangeOfferOwnWorldComparator.scene.menuOpen(class113.Client_plane, var0, var1, true); // L: 9716
				}
			}

			PacketBufferNode var12;
			if (var2 == 1003) { // L: 9719
				Client.mouseCrossX = var7; // L: 9720
				Client.mouseCrossY = var8; // L: 9721
				Client.mouseCrossColor = 2; // L: 9722
				Client.mouseCrossState = 0; // L: 9723
				var18 = Client.npcs[var3]; // L: 9724
				if (var18 != null) { // L: 9725
					NPCComposition var19 = var18.definition; // L: 9726
					if (var19.transforms != null) { // L: 9727
						var19 = var19.transform();
					}

					if (var19 != null) { // L: 9728
						var12 = class482.getPacketBufferNode(ClientPacket.field3262, Client.packetWriter.isaacCipher); // L: 9730
						var12.packetBuffer.writeIntME(var19.id); // L: 9731
						Client.packetWriter.addNode(var12); // L: 9732
					}
				}
			}

			if (var2 == 7) { // L: 9736
				var18 = Client.npcs[var3]; // L: 9737
				if (var18 != null) { // L: 9738
					Client.mouseCrossX = var7; // L: 9739
					Client.mouseCrossY = var8; // L: 9740
					Client.mouseCrossColor = 2; // L: 9741
					Client.mouseCrossState = 0; // L: 9742
					Client.destinationX = var0; // L: 9743
					Client.destinationY = var1; // L: 9744
					var10 = class482.getPacketBufferNode(ClientPacket.field3212, Client.packetWriter.isaacCipher); // L: 9746
					var10.packetBuffer.writeIntME(PlayerType.field4320); // L: 9747
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9748
					var10.packetBuffer.method9494(class25.field131); // L: 9749
					var10.packetBuffer.method9557(Decimator.field404); // L: 9750
					var10.packetBuffer.writeIntME(var3); // L: 9751
					Client.packetWriter.addNode(var10); // L: 9752
				}
			}

			if (var2 == 26) { // L: 9755
				class47.method910(); // L: 9756
			}

			if (var2 == 1004) { // L: 9758
				Client.mouseCrossX = var7; // L: 9759
				Client.mouseCrossY = var8; // L: 9760
				Client.mouseCrossColor = 2; // L: 9761
				Client.mouseCrossState = 0; // L: 9762
				var14 = class482.getPacketBufferNode(ClientPacket.field3224, Client.packetWriter.isaacCipher); // L: 9764
				var14.packetBuffer.method9427(var3); // L: 9765
				var14.packetBuffer.method9427(WorldMapScaleHandler.baseY * 64 + var1); // L: 9766
				var14.packetBuffer.writeIntME(HealthBarDefinition.baseX * 64 + var0); // L: 9767
				Client.packetWriter.addNode(var14); // L: 9768
			}

			if (var2 == 12) { // L: 9770
				var18 = Client.npcs[var3]; // L: 9771
				if (var18 != null) { // L: 9772
					Client.mouseCrossX = var7; // L: 9773
					Client.mouseCrossY = var8; // L: 9774
					Client.mouseCrossColor = 2; // L: 9775
					Client.mouseCrossState = 0; // L: 9776
					Client.destinationX = var0; // L: 9777
					Client.destinationY = var1; // L: 9778
					var10 = class482.getPacketBufferNode(ClientPacket.field3233, Client.packetWriter.isaacCipher); // L: 9780
					var10.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9781
					var10.packetBuffer.method9557(var3); // L: 9782
					Client.packetWriter.addNode(var10); // L: 9783
				}
			}

			if (var2 == 51) { // L: 9786
				var9 = Client.players[var3]; // L: 9787
				if (var9 != null) { // L: 9788
					Client.mouseCrossX = var7; // L: 9789
					Client.mouseCrossY = var8; // L: 9790
					Client.mouseCrossColor = 2; // L: 9791
					Client.mouseCrossState = 0; // L: 9792
					Client.destinationX = var0; // L: 9793
					Client.destinationY = var1; // L: 9794
					var10 = class482.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 9796
					var10.packetBuffer.method9557(var3); // L: 9797
					var10.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9798
					Client.packetWriter.addNode(var10); // L: 9799
				}
			}

			if (var2 == 44) { // L: 9802
				var9 = Client.players[var3]; // L: 9803
				if (var9 != null) { // L: 9804
					Client.mouseCrossX = var7; // L: 9805
					Client.mouseCrossY = var8; // L: 9806
					Client.mouseCrossColor = 2; // L: 9807
					Client.mouseCrossState = 0; // L: 9808
					Client.destinationX = var0; // L: 9809
					Client.destinationY = var1; // L: 9810
					var10 = class482.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 9812
					var10.packetBuffer.writeIntME(var3); // L: 9813
					var10.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9814
					Client.packetWriter.addNode(var10); // L: 9815
				}
			}

			if (var2 == 9) { // L: 9818
				var18 = Client.npcs[var3]; // L: 9819
				if (var18 != null) { // L: 9820
					Client.mouseCrossX = var7; // L: 9821
					Client.mouseCrossY = var8; // L: 9822
					Client.mouseCrossColor = 2; // L: 9823
					Client.mouseCrossState = 0; // L: 9824
					Client.destinationX = var0; // L: 9825
					Client.destinationY = var1; // L: 9826
					var10 = class482.getPacketBufferNode(ClientPacket.field3208, Client.packetWriter.isaacCipher); // L: 9828
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9829
					var10.packetBuffer.writeIntME(var3); // L: 9830
					Client.packetWriter.addNode(var10); // L: 9831
				}
			}

			if (var2 == 24) { // L: 9834
				var15 = class380.field4414.method6348(var1); // L: 9835
				if (var15 != null) { // L: 9836
					boolean var13 = true; // L: 9837
					if (var15.contentType > 0) { // L: 9838
						var13 = Coord.method6334(var15);
					}

					if (var13) { // L: 9839
						var12 = class482.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 9841
						var12.packetBuffer.method9373(var1); // L: 9842
						Client.packetWriter.addNode(var12); // L: 9843
					}
				}
			}

			if (var2 == 45) { // L: 9847
				var9 = Client.players[var3]; // L: 9848
				if (var9 != null) { // L: 9849
					Client.mouseCrossX = var7; // L: 9850
					Client.mouseCrossY = var8; // L: 9851
					Client.mouseCrossColor = 2; // L: 9852
					Client.mouseCrossState = 0; // L: 9853
					Client.destinationX = var0; // L: 9854
					Client.destinationY = var1; // L: 9855
					var10 = class482.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 9857
					var10.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9858
					var10.packetBuffer.writeIntME(var3); // L: 9859
					Client.packetWriter.addNode(var10); // L: 9860
				}
			}

			if (var2 == 50) { // L: 9863
				var9 = Client.players[var3]; // L: 9864
				if (var9 != null) { // L: 9865
					Client.mouseCrossX = var7; // L: 9866
					Client.mouseCrossY = var8; // L: 9867
					Client.mouseCrossColor = 2; // L: 9868
					Client.mouseCrossState = 0; // L: 9869
					Client.destinationX = var0; // L: 9870
					Client.destinationY = var1; // L: 9871
					var10 = class482.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9873
					var10.packetBuffer.writeShort(var3); // L: 9874
					var10.packetBuffer.writeByte(Client.field661.method4426(82) ? 1 : 0); // L: 9875
					Client.packetWriter.addNode(var10); // L: 9876
				}
			}

			if (var2 == 1) { // L: 9879
				Client.mouseCrossX = var7; // L: 9880
				Client.mouseCrossY = var8; // L: 9881
				Client.mouseCrossColor = 2; // L: 9882
				Client.mouseCrossState = 0; // L: 9883
				Client.destinationX = var0; // L: 9884
				Client.destinationY = var1; // L: 9885
				var14 = class482.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher); // L: 9887
				var14.packetBuffer.writeIntME(PlayerType.field4320); // L: 9888
				var14.packetBuffer.method9427(var3); // L: 9889
				var14.packetBuffer.method9437(class25.field131); // L: 9890
				var14.packetBuffer.method9385(Client.field661.method4426(82) ? 1 : 0); // L: 9891
				var14.packetBuffer.method9557(HealthBarDefinition.baseX * 64 + var0); // L: 9892
				var14.packetBuffer.writeShort(WorldMapScaleHandler.baseY * 64 + var1); // L: 9893
				var14.packetBuffer.writeIntME(Decimator.field404); // L: 9894
				Client.packetWriter.addNode(var14); // L: 9895
			}

			if (var2 == 4) { // L: 9897
				Client.mouseCrossX = var7; // L: 9898
				Client.mouseCrossY = var8; // L: 9899
				Client.mouseCrossColor = 2; // L: 9900
				Client.mouseCrossState = 0; // L: 9901
				Client.destinationX = var0; // L: 9902
				Client.destinationY = var1; // L: 9903
				var14 = class482.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher); // L: 9905
				var14.packetBuffer.method9557(var3); // L: 9906
				var14.packetBuffer.writeIntME(WorldMapScaleHandler.baseY * 64 + var1); // L: 9907
				var14.packetBuffer.writeIntME(HealthBarDefinition.baseX * 64 + var0); // L: 9908
				var14.packetBuffer.method9416(Client.field661.method4426(82) ? 1 : 0); // L: 9909
				Client.packetWriter.addNode(var14); // L: 9910
			}

			if (var2 == 21) { // L: 9912
				Client.mouseCrossX = var7; // L: 9913
				Client.mouseCrossY = var8; // L: 9914
				Client.mouseCrossColor = 2; // L: 9915
				Client.mouseCrossState = 0; // L: 9916
				Client.destinationX = var0; // L: 9917
				Client.destinationY = var1; // L: 9918
				var14 = class482.getPacketBufferNode(ClientPacket.field3245, Client.packetWriter.isaacCipher); // L: 9920
				var14.packetBuffer.writeIntME(var3); // L: 9921
				var14.packetBuffer.writeIntME(WorldMapScaleHandler.baseY * 64 + var1); // L: 9922
				var14.packetBuffer.method9483(Client.field661.method4426(82) ? 1 : 0); // L: 9923
				var14.packetBuffer.method9427(HealthBarDefinition.baseX * 64 + var0); // L: 9924
				Client.packetWriter.addNode(var14); // L: 9925
			}

			if (Client.isItemSelected != 0) { // L: 9927
				Client.isItemSelected = 0; // L: 9928
				FaceNormal.invalidateWidget(class380.field4414.method6348(class25.field131)); // L: 9929
			}

			if (Client.isSpellSelected) { // L: 9931
				ArchiveDiskActionHandler.method6981();
			}

		}
	} // L: 9296 9932
}
