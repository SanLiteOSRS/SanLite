import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 1808683231
	)
	static int field2950;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1363425531
	)
	@Export("element")
	final int element;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1314968857
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -476045711
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;ILks;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class147.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1551656659"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lks;",
		garbageValue = "1263568545"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-755698376"
	)
	static final void method5391(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9289
			var2 -= 2000;
		}

		Player var9;
		PacketBufferNode var10;
		if (var2 == 45) { // L: 9290
			var9 = Client.players[var3]; // L: 9291
			if (var9 != null) { // L: 9292
				Client.mouseCrossX = var7; // L: 9293
				Client.mouseCrossY = var8; // L: 9294
				Client.mouseCrossColor = 2; // L: 9295
				Client.mouseCrossState = 0; // L: 9296
				Client.destinationX = var0; // L: 9297
				Client.destinationY = var1; // L: 9298
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 9300
				var10.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9301
				var10.packetBuffer.writeShort(var3); // L: 9302
				Client.packetWriter.addNode(var10); // L: 9303
			}
		}

		if (var2 == 44) { // L: 9306
			var9 = Client.players[var3]; // L: 9307
			if (var9 != null) { // L: 9308
				Client.mouseCrossX = var7; // L: 9309
				Client.mouseCrossY = var8; // L: 9310
				Client.mouseCrossColor = 2; // L: 9311
				Client.mouseCrossState = 0; // L: 9312
				Client.destinationX = var0; // L: 9313
				Client.destinationY = var1; // L: 9314
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 9316
				var10.packetBuffer.method8940(Client.field739.method4134(82) ? 1 : 0); // L: 9317
				var10.packetBuffer.method8948(var3); // L: 9318
				Client.packetWriter.addNode(var10); // L: 9319
			}
		}

		if (var2 == 50) { // L: 9322
			var9 = Client.players[var3]; // L: 9323
			if (var9 != null) { // L: 9324
				Client.mouseCrossX = var7; // L: 9325
				Client.mouseCrossY = var8; // L: 9326
				Client.mouseCrossColor = 2; // L: 9327
				Client.mouseCrossState = 0; // L: 9328
				Client.destinationX = var0; // L: 9329
				Client.destinationY = var1; // L: 9330
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3102, Client.packetWriter.isaacCipher); // L: 9332
				var10.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9333
				var10.packetBuffer.method8949(var3); // L: 9334
				Client.packetWriter.addNode(var10); // L: 9335
			}
		}

		if (var2 == 15) { // L: 9338
			var9 = Client.players[var3]; // L: 9339
			if (var9 != null) { // L: 9340
				Client.mouseCrossX = var7; // L: 9341
				Client.mouseCrossY = var8; // L: 9342
				Client.mouseCrossColor = 2; // L: 9343
				Client.mouseCrossState = 0; // L: 9344
				Client.destinationX = var0; // L: 9345
				Client.destinationY = var1; // L: 9346
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 9347
				var10.packetBuffer.writeShort(var3); // L: 9348
				var10.packetBuffer.method8919(ScriptFrame.selectedSpellWidget); // L: 9349
				var10.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9350
				var10.packetBuffer.method9000(Client.selectedSpellChildIndex); // L: 9351
				var10.packetBuffer.method8939(Client.field739.method4134(82) ? 1 : 0); // L: 9352
				Client.packetWriter.addNode(var10); // L: 9353
			}
		}

		if (var2 == 26) { // L: 9356
			class36.method664(); // L: 9357
		}

		if (var2 == 49) { // L: 9359
			var9 = Client.players[var3]; // L: 9360
			if (var9 != null) { // L: 9361
				Client.mouseCrossX = var7; // L: 9362
				Client.mouseCrossY = var8; // L: 9363
				Client.mouseCrossColor = 2; // L: 9364
				Client.mouseCrossState = 0; // L: 9365
				Client.destinationX = var0; // L: 9366
				Client.destinationY = var1; // L: 9367
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9369
				var10.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9370
				var10.packetBuffer.writeShort(var3); // L: 9371
				Client.packetWriter.addNode(var10); // L: 9372
			}
		}

		int var11;
		PacketBufferNode var14;
		Widget var16;
		if (var2 == 29) { // L: 9375
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 9377
			var14.packetBuffer.writeInt(var1); // L: 9378
			Client.packetWriter.addNode(var14); // L: 9379
			var16 = FriendSystem.getWidget(var1); // L: 9380
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 9381
				var11 = var16.cs1Instructions[0][1]; // L: 9382
				if (Varps.Varps_main[var11] != var16.cs1ComparisonValues[0]) { // L: 9383
					Varps.Varps_main[var11] = var16.cs1ComparisonValues[0]; // L: 9384
					class393.changeGameOptions(var11); // L: 9385
				}
			}
		}

		if (var2 == 19) { // L: 9389
			Client.mouseCrossX = var7; // L: 9390
			Client.mouseCrossY = var8; // L: 9391
			Client.mouseCrossColor = 2; // L: 9392
			Client.mouseCrossState = 0; // L: 9393
			Client.destinationX = var0; // L: 9394
			Client.destinationY = var1; // L: 9395
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 9397
			var14.packetBuffer.method9000(var3); // L: 9398
			var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9399
			var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9400
			var14.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9401
			Client.packetWriter.addNode(var14); // L: 9402
		}

		NPC var15;
		if (var2 == 10) { // L: 9404
			var15 = Client.npcs[var3]; // L: 9405
			if (var15 != null) { // L: 9406
				Client.mouseCrossX = var7; // L: 9407
				Client.mouseCrossY = var8; // L: 9408
				Client.mouseCrossColor = 2; // L: 9409
				Client.mouseCrossState = 0; // L: 9410
				Client.destinationX = var0; // L: 9411
				Client.destinationY = var1; // L: 9412
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 9414
				var10.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9415
				var10.packetBuffer.method9000(var3); // L: 9416
				Client.packetWriter.addNode(var10); // L: 9417
			}
		}

		if (var2 == 13) { // L: 9420
			var15 = Client.npcs[var3]; // L: 9421
			if (var15 != null) { // L: 9422
				Client.mouseCrossX = var7; // L: 9423
				Client.mouseCrossY = var8; // L: 9424
				Client.mouseCrossColor = 2; // L: 9425
				Client.mouseCrossState = 0; // L: 9426
				Client.destinationX = var0; // L: 9427
				Client.destinationY = var1; // L: 9428
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 9430
				var10.packetBuffer.method9000(var3); // L: 9431
				var10.packetBuffer.method8939(Client.field739.method4134(82) ? 1 : 0); // L: 9432
				Client.packetWriter.addNode(var10); // L: 9433
			}
		}

		if (var2 == 47) { // L: 9436
			var9 = Client.players[var3]; // L: 9437
			if (var9 != null) { // L: 9438
				Client.mouseCrossX = var7; // L: 9439
				Client.mouseCrossY = var8; // L: 9440
				Client.mouseCrossColor = 2; // L: 9441
				Client.mouseCrossState = 0; // L: 9442
				Client.destinationX = var0; // L: 9443
				Client.destinationY = var1; // L: 9444
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 9446
				var10.packetBuffer.method9000(var3); // L: 9447
				var10.packetBuffer.method8939(Client.field739.method4134(82) ? 1 : 0); // L: 9448
				Client.packetWriter.addNode(var10); // L: 9449
			}
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9452
			ScriptFrame.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9453
		}

		if (var2 == 16) { // L: 9455
			Client.mouseCrossX = var7; // L: 9456
			Client.mouseCrossY = var8; // L: 9457
			Client.mouseCrossColor = 2; // L: 9458
			Client.mouseCrossState = 0; // L: 9459
			Client.destinationX = var0; // L: 9460
			Client.destinationY = var1; // L: 9461
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 9463
			var14.packetBuffer.method8961(ScriptFrame.field474); // L: 9464
			var14.packetBuffer.writeShort(class213.baseX * 64 + var0); // L: 9465
			var14.packetBuffer.method8948(TaskHandler.field1820); // L: 9466
			var14.packetBuffer.method8939(Client.field739.method4134(82) ? 1 : 0); // L: 9467
			var14.packetBuffer.writeShort(class101.baseY * 64 + var1); // L: 9468
			var14.packetBuffer.method8948(var3); // L: 9469
			var14.packetBuffer.method8949(Renderable.field2619); // L: 9470
			Client.packetWriter.addNode(var14); // L: 9471
		}

		if (var2 == 7) { // L: 9473
			var15 = Client.npcs[var3]; // L: 9474
			if (var15 != null) { // L: 9475
				Client.mouseCrossX = var7; // L: 9476
				Client.mouseCrossY = var8; // L: 9477
				Client.mouseCrossColor = 2; // L: 9478
				Client.mouseCrossState = 0; // L: 9479
				Client.destinationX = var0; // L: 9480
				Client.destinationY = var1; // L: 9481
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 9483
				var10.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9484
				var10.packetBuffer.method8919(ScriptFrame.field474); // L: 9485
				var10.packetBuffer.method8948(TaskHandler.field1820); // L: 9486
				var10.packetBuffer.writeShort(Renderable.field2619); // L: 9487
				var10.packetBuffer.writeShort(var3); // L: 9488
				Client.packetWriter.addNode(var10); // L: 9489
			}
		}

		if (var2 == 4) { // L: 9492
			Client.mouseCrossX = var7; // L: 9493
			Client.mouseCrossY = var8; // L: 9494
			Client.mouseCrossColor = 2; // L: 9495
			Client.mouseCrossState = 0; // L: 9496
			Client.destinationX = var0; // L: 9497
			Client.destinationY = var1; // L: 9498
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher); // L: 9500
			var14.packetBuffer.method8948(class213.baseX * 64 + var0); // L: 9501
			var14.packetBuffer.method8948(class101.baseY * 64 + var1); // L: 9502
			var14.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9503
			var14.packetBuffer.method8949(var3); // L: 9504
			Client.packetWriter.addNode(var14); // L: 9505
		}

		if (var2 == 22) { // L: 9507
			Client.mouseCrossX = var7; // L: 9508
			Client.mouseCrossY = var8; // L: 9509
			Client.mouseCrossColor = 2; // L: 9510
			Client.mouseCrossState = 0; // L: 9511
			Client.destinationX = var0; // L: 9512
			Client.destinationY = var1; // L: 9513
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher); // L: 9515
			var14.packetBuffer.method9000(var3); // L: 9516
			var14.packetBuffer.method8940(Client.field739.method4134(82) ? 1 : 0); // L: 9517
			var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9518
			var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9519
			Client.packetWriter.addNode(var14); // L: 9520
		}

		if (var2 == 23) { // L: 9522
			if (Client.isMenuOpen) { // L: 9523
				class36.scene.setViewportWalking(); // L: 9524
			} else {
				class36.scene.menuOpen(Clock.Client_plane, var0, var1, true); // L: 9527
			}
		}

		if (var2 == 11) { // L: 9530
			var15 = Client.npcs[var3]; // L: 9531
			if (var15 != null) { // L: 9532
				Client.mouseCrossX = var7; // L: 9533
				Client.mouseCrossY = var8; // L: 9534
				Client.mouseCrossColor = 2; // L: 9535
				Client.mouseCrossState = 0; // L: 9536
				Client.destinationX = var0; // L: 9537
				Client.destinationY = var1; // L: 9538
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 9540
				var10.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9541
				var10.packetBuffer.writeShort(var3); // L: 9542
				Client.packetWriter.addNode(var10); // L: 9543
			}
		}

		PacketBufferNode var13;
		Widget var17;
		if (var2 == 24) { // L: 9546
			var17 = FriendSystem.getWidget(var1); // L: 9547
			if (var17 != null) { // L: 9548
				boolean var12 = true; // L: 9549
				if (var17.contentType > 0) { // L: 9550
					var12 = FloorOverlayDefinition.method4043(var17);
				}

				if (var12) { // L: 9551
					var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 9553
					var13.packetBuffer.writeInt(var1); // L: 9554
					Client.packetWriter.addNode(var13); // L: 9555
				}
			}
		}

		if (var2 == 57 || var2 == 1007) { // L: 9559
			var17 = class158.getWidgetChild(var1, var0); // L: 9560
			if (var17 != null) { // L: 9561
				InvDefinition.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9562
			}
		}

		if (var2 == 21) { // L: 9565
			Client.mouseCrossX = var7; // L: 9566
			Client.mouseCrossY = var8; // L: 9567
			Client.mouseCrossColor = 2; // L: 9568
			Client.mouseCrossState = 0; // L: 9569
			Client.destinationX = var0; // L: 9570
			Client.destinationY = var1; // L: 9571
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher); // L: 9573
			var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9574
			var14.packetBuffer.method8940(Client.field739.method4134(82) ? 1 : 0); // L: 9575
			var14.packetBuffer.method9000(var3); // L: 9576
			var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9577
			Client.packetWriter.addNode(var14); // L: 9578
		}

		if (var2 == 2) { // L: 9580
			Client.mouseCrossX = var7; // L: 9581
			Client.mouseCrossY = var8; // L: 9582
			Client.mouseCrossColor = 2; // L: 9583
			Client.mouseCrossState = 0; // L: 9584
			Client.destinationX = var0; // L: 9585
			Client.destinationY = var1; // L: 9586
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher); // L: 9587
			var14.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9588
			var14.packetBuffer.method8949(Client.selectedSpellItemId); // L: 9589
			var14.packetBuffer.writeShort(var3); // L: 9590
			var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9591
			var14.packetBuffer.method8939(Client.field739.method4134(82) ? 1 : 0); // L: 9592
			var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9593
			var14.packetBuffer.method8919(ScriptFrame.selectedSpellWidget); // L: 9594
			Client.packetWriter.addNode(var14); // L: 9595
		}

		if (var2 == 1002) { // L: 9597
			Client.mouseCrossX = var7; // L: 9598
			Client.mouseCrossY = var8; // L: 9599
			Client.mouseCrossColor = 2; // L: 9600
			Client.mouseCrossState = 0; // L: 9601
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher); // L: 9603
			var14.packetBuffer.method8948(var3); // L: 9604
			Client.packetWriter.addNode(var14); // L: 9605
		}

		if (var2 == 51) { // L: 9607
			var9 = Client.players[var3]; // L: 9608
			if (var9 != null) { // L: 9609
				Client.mouseCrossX = var7; // L: 9610
				Client.mouseCrossY = var8; // L: 9611
				Client.mouseCrossColor = 2; // L: 9612
				Client.mouseCrossState = 0; // L: 9613
				Client.destinationX = var0; // L: 9614
				Client.destinationY = var1; // L: 9615
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 9617
				var10.packetBuffer.method8948(var3); // L: 9618
				var10.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9619
				Client.packetWriter.addNode(var10); // L: 9620
			}
		}

		if (var2 == 12) { // L: 9623
			var15 = Client.npcs[var3]; // L: 9624
			if (var15 != null) { // L: 9625
				Client.mouseCrossX = var7; // L: 9626
				Client.mouseCrossY = var8; // L: 9627
				Client.mouseCrossColor = 2; // L: 9628
				Client.mouseCrossState = 0; // L: 9629
				Client.destinationX = var0; // L: 9630
				Client.destinationY = var1; // L: 9631
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 9633
				var10.packetBuffer.method8939(Client.field739.method4134(82) ? 1 : 0); // L: 9634
				var10.packetBuffer.method9000(var3); // L: 9635
				Client.packetWriter.addNode(var10); // L: 9636
			}
		}

		if (var2 == 3) { // L: 9639
			Client.mouseCrossX = var7; // L: 9640
			Client.mouseCrossY = var8; // L: 9641
			Client.mouseCrossColor = 2; // L: 9642
			Client.mouseCrossState = 0; // L: 9643
			Client.destinationX = var0; // L: 9644
			Client.destinationY = var1; // L: 9645
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 9647
			var14.packetBuffer.method8948(var3); // L: 9648
			var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9649
			var14.packetBuffer.method8940(Client.field739.method4134(82) ? 1 : 0); // L: 9650
			var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9651
			Client.packetWriter.addNode(var14); // L: 9652
		}

		if (var2 == 14) { // L: 9654
			var9 = Client.players[var3]; // L: 9655
			if (var9 != null) { // L: 9656
				Client.mouseCrossX = var7; // L: 9657
				Client.mouseCrossY = var8; // L: 9658
				Client.mouseCrossColor = 2; // L: 9659
				Client.mouseCrossState = 0; // L: 9660
				Client.destinationX = var0; // L: 9661
				Client.destinationY = var1; // L: 9662
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 9664
				var10.packetBuffer.method8940(Client.field739.method4134(82) ? 1 : 0); // L: 9665
				var10.packetBuffer.method8961(ScriptFrame.field474); // L: 9666
				var10.packetBuffer.method8948(Renderable.field2619); // L: 9667
				var10.packetBuffer.method8948(TaskHandler.field1820); // L: 9668
				var10.packetBuffer.method8949(var3); // L: 9669
				Client.packetWriter.addNode(var10); // L: 9670
			}
		}

		if (var2 == 46) { // L: 9673
			var9 = Client.players[var3]; // L: 9674
			if (var9 != null) { // L: 9675
				Client.mouseCrossX = var7; // L: 9676
				Client.mouseCrossY = var8; // L: 9677
				Client.mouseCrossColor = 2; // L: 9678
				Client.mouseCrossState = 0; // L: 9679
				Client.destinationX = var0; // L: 9680
				Client.destinationY = var1; // L: 9681
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 9683
				var10.packetBuffer.method8948(var3); // L: 9684
				var10.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9685
				Client.packetWriter.addNode(var10); // L: 9686
			}
		}

		if (var2 == 1) { // L: 9689
			Client.mouseCrossX = var7; // L: 9690
			Client.mouseCrossY = var8; // L: 9691
			Client.mouseCrossColor = 2; // L: 9692
			Client.mouseCrossState = 0; // L: 9693
			Client.destinationX = var0; // L: 9694
			Client.destinationY = var1; // L: 9695
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 9697
			var14.packetBuffer.method8962(ScriptFrame.field474); // L: 9698
			var14.packetBuffer.method8949(Renderable.field2619); // L: 9699
			var14.packetBuffer.method9000(class101.baseY * 64 + var1); // L: 9700
			var14.packetBuffer.method9000(var3); // L: 9701
			var14.packetBuffer.method8948(TaskHandler.field1820); // L: 9702
			var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9703
			var14.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9704
			Client.packetWriter.addNode(var14); // L: 9705
		}

		if (var2 == 18) { // L: 9707
			Client.mouseCrossX = var7; // L: 9708
			Client.mouseCrossY = var8; // L: 9709
			Client.mouseCrossColor = 2; // L: 9710
			Client.mouseCrossState = 0; // L: 9711
			Client.destinationX = var0; // L: 9712
			Client.destinationY = var1; // L: 9713
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher); // L: 9715
			var14.packetBuffer.method8948(var3); // L: 9716
			var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9717
			var14.packetBuffer.method9000(class213.baseX * 64 + var0); // L: 9718
			var14.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9719
			Client.packetWriter.addNode(var14); // L: 9720
		}

		if (var2 == 20) { // L: 9722
			Client.mouseCrossX = var7; // L: 9723
			Client.mouseCrossY = var8; // L: 9724
			Client.mouseCrossColor = 2; // L: 9725
			Client.mouseCrossState = 0; // L: 9726
			Client.destinationX = var0; // L: 9727
			Client.destinationY = var1; // L: 9728
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher); // L: 9730
			var14.packetBuffer.method8949(var3); // L: 9731
			var14.packetBuffer.method9000(class101.baseY * 64 + var1); // L: 9732
			var14.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9733
			var14.packetBuffer.writeShort(class213.baseX * 64 + var0); // L: 9734
			Client.packetWriter.addNode(var14); // L: 9735
		}

		if (var2 == 28) { // L: 9737
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 9739
			var14.packetBuffer.writeInt(var1); // L: 9740
			Client.packetWriter.addNode(var14); // L: 9741
			var16 = FriendSystem.getWidget(var1); // L: 9742
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 9743
				var11 = var16.cs1Instructions[0][1]; // L: 9744
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9745
				class393.changeGameOptions(var11); // L: 9746
			}
		}

		if (var2 == 58) { // L: 9749
			var17 = class158.getWidgetChild(var1, var0); // L: 9750
			if (var17 != null) { // L: 9751
				if (var17.field3739 != null) { // L: 9752
					ScriptEvent var18 = new ScriptEvent(); // L: 9753
					var18.widget = var17; // L: 9754
					var18.opIndex = var3; // L: 9755
					var18.targetName = var6; // L: 9756
					var18.args = var17.field3739; // L: 9757
					Clock.runScriptEvent(var18); // L: 9758
				}

				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher); // L: 9761
				var10.packetBuffer.method9000(Client.selectedSpellChildIndex); // L: 9762
				var10.packetBuffer.method8949(var0); // L: 9763
				var10.packetBuffer.method9000(Client.selectedSpellItemId); // L: 9764
				var10.packetBuffer.method8949(var4); // L: 9765
				var10.packetBuffer.method8919(var1); // L: 9766
				var10.packetBuffer.method8961(ScriptFrame.selectedSpellWidget); // L: 9767
				Client.packetWriter.addNode(var10); // L: 9768
			}
		}

		if (var2 == 6) { // L: 9771
			Client.mouseCrossX = var7; // L: 9772
			Client.mouseCrossY = var8; // L: 9773
			Client.mouseCrossColor = 2; // L: 9774
			Client.mouseCrossState = 0; // L: 9775
			Client.destinationX = var0; // L: 9776
			Client.destinationY = var1; // L: 9777
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 9779
			var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9780
			var14.packetBuffer.method8948(class213.baseX * 64 + var0); // L: 9781
			var14.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9782
			var14.packetBuffer.method9000(var3); // L: 9783
			Client.packetWriter.addNode(var14); // L: 9784
		}

		if (var2 == 25) { // L: 9786
			var17 = class158.getWidgetChild(var1, var0); // L: 9787
			if (var17 != null) { // L: 9788
				FriendsList.Widget_runOnTargetLeave(); // L: 9789
				FriendLoginUpdate.selectSpell(var1, var0, LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var17)), var4); // L: 9790
				Client.isItemSelected = 0; // L: 9791
				Client.field671 = BuddyRankComparator.Widget_getSpellActionName(var17); // L: 9792
				if (Client.field671 == null) { // L: 9793
					Client.field671 = "null";
				}

				if (var17.isIf3) { // L: 9794
					Client.field716 = var17.dataText + class349.colorStartTag(16777215);
				} else {
					Client.field716 = class349.colorStartTag(65280) + var17.field3731 + class349.colorStartTag(16777215); // L: 9795
				}
			}

		} else {
			if (var2 == 1003) { // L: 9799
				Client.mouseCrossX = var7; // L: 9800
				Client.mouseCrossY = var8; // L: 9801
				Client.mouseCrossColor = 2; // L: 9802
				Client.mouseCrossState = 0; // L: 9803
				var15 = Client.npcs[var3]; // L: 9804
				if (var15 != null) { // L: 9805
					NPCComposition var19 = var15.definition; // L: 9806
					if (var19.transforms != null) { // L: 9807
						var19 = var19.transform();
					}

					if (var19 != null) { // L: 9808
						var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 9810
						var13.packetBuffer.method9000(var19.id); // L: 9811
						Client.packetWriter.addNode(var13); // L: 9812
					}
				}
			}

			if (var2 == 1001) { // L: 9816
				Client.mouseCrossX = var7; // L: 9817
				Client.mouseCrossY = var8; // L: 9818
				Client.mouseCrossColor = 2; // L: 9819
				Client.mouseCrossState = 0; // L: 9820
				Client.destinationX = var0; // L: 9821
				Client.destinationY = var1; // L: 9822
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 9824
				var14.packetBuffer.method8939(Client.field739.method4134(82) ? 1 : 0); // L: 9825
				var14.packetBuffer.method8949(class101.baseY * 64 + var1); // L: 9826
				var14.packetBuffer.writeShort(class213.baseX * 64 + var0); // L: 9827
				var14.packetBuffer.method8948(var3); // L: 9828
				Client.packetWriter.addNode(var14); // L: 9829
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9831 9832
				GroundObject.resumePauseWidget(var1, var0); // L: 9833
				Client.meslayerContinueWidget = class158.getWidgetChild(var1, var0); // L: 9834
				Messages.invalidateWidget(Client.meslayerContinueWidget); // L: 9835
			}

			if (var2 == 1004) { // L: 9838
				Client.mouseCrossX = var7; // L: 9839
				Client.mouseCrossY = var8; // L: 9840
				Client.mouseCrossColor = 2; // L: 9841
				Client.mouseCrossState = 0; // L: 9842
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher); // L: 9844
				var14.packetBuffer.method9000(var3); // L: 9845
				var14.packetBuffer.method8948(class101.baseY * 64 + var1); // L: 9846
				var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9847
				Client.packetWriter.addNode(var14); // L: 9848
			}

			if (var2 == 17) { // L: 9850
				Client.mouseCrossX = var7; // L: 9851
				Client.mouseCrossY = var8; // L: 9852
				Client.mouseCrossColor = 2; // L: 9853
				Client.mouseCrossState = 0; // L: 9854
				Client.destinationX = var0; // L: 9855
				Client.destinationY = var1; // L: 9856
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 9857
				var14.packetBuffer.writeShort(class101.baseY * 64 + var1); // L: 9858
				var14.packetBuffer.method8948(Client.selectedSpellChildIndex); // L: 9859
				var14.packetBuffer.method8961(ScriptFrame.selectedSpellWidget); // L: 9860
				var14.packetBuffer.method9000(Client.selectedSpellItemId); // L: 9861
				var14.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9862
				var14.packetBuffer.method9000(var3); // L: 9863
				var14.packetBuffer.method8948(class213.baseX * 64 + var0); // L: 9864
				Client.packetWriter.addNode(var14); // L: 9865
			}

			if (var2 == 48) { // L: 9867
				var9 = Client.players[var3]; // L: 9868
				if (var9 != null) { // L: 9869
					Client.mouseCrossX = var7; // L: 9870
					Client.mouseCrossY = var8; // L: 9871
					Client.mouseCrossColor = 2; // L: 9872
					Client.mouseCrossState = 0; // L: 9873
					Client.destinationX = var0; // L: 9874
					Client.destinationY = var1; // L: 9875
					var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 9877
					var10.packetBuffer.method8949(var3); // L: 9878
					var10.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9879
					Client.packetWriter.addNode(var10); // L: 9880
				}
			}

			if (var2 == 8) { // L: 9883
				var15 = Client.npcs[var3]; // L: 9884
				if (var15 != null) { // L: 9885
					Client.mouseCrossX = var7; // L: 9886
					Client.mouseCrossY = var8; // L: 9887
					Client.mouseCrossColor = 2; // L: 9888
					Client.mouseCrossState = 0; // L: 9889
					Client.destinationX = var0; // L: 9890
					Client.destinationY = var1; // L: 9891
					var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher); // L: 9892
					var10.packetBuffer.method9000(var3); // L: 9893
					var10.packetBuffer.method8962(ScriptFrame.selectedSpellWidget); // L: 9894
					var10.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9895
					var10.packetBuffer.method8948(Client.selectedSpellItemId); // L: 9896
					var10.packetBuffer.method9000(Client.selectedSpellChildIndex); // L: 9897
					Client.packetWriter.addNode(var10); // L: 9898
				}
			}

			if (var2 == 5) { // L: 9901
				Client.mouseCrossX = var7; // L: 9902
				Client.mouseCrossY = var8; // L: 9903
				Client.mouseCrossColor = 2; // L: 9904
				Client.mouseCrossState = 0; // L: 9905
				Client.destinationX = var0; // L: 9906
				Client.destinationY = var1; // L: 9907
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 9909
				var14.packetBuffer.method8949(var3); // L: 9910
				var14.packetBuffer.method8949(class213.baseX * 64 + var0); // L: 9911
				var14.packetBuffer.writeIntME(Client.field739.method4134(82) ? 1 : 0); // L: 9912
				var14.packetBuffer.method9000(class101.baseY * 64 + var1); // L: 9913
				Client.packetWriter.addNode(var14); // L: 9914
			}

			if (var2 == 9) { // L: 9916
				var15 = Client.npcs[var3]; // L: 9917
				if (var15 != null) { // L: 9918
					Client.mouseCrossX = var7; // L: 9919
					Client.mouseCrossY = var8; // L: 9920
					Client.mouseCrossColor = 2; // L: 9921
					Client.mouseCrossState = 0; // L: 9922
					Client.destinationX = var0; // L: 9923
					Client.destinationY = var1; // L: 9924
					var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9926
					var10.packetBuffer.writeByte(Client.field739.method4134(82) ? 1 : 0); // L: 9927
					var10.packetBuffer.method8948(var3); // L: 9928
					Client.packetWriter.addNode(var10); // L: 9929
				}
			}

			if (Client.isItemSelected != 0) { // L: 9932
				Client.isItemSelected = 0; // L: 9933
				Messages.invalidateWidget(FriendSystem.getWidget(ScriptFrame.field474)); // L: 9934
			}

			if (Client.isSpellSelected) { // L: 9936
				FriendsList.Widget_runOnTargetLeave();
			}

		}
	} // L: 9797 9937
}
