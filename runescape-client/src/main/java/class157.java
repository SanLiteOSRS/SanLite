import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class157 extends class160 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -599683801
	)
	int field1752;
	@ObfuscatedName("aj")
	byte field1748;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -591130243
	)
	int field1750;
	@ObfuscatedName("aw")
	String field1751;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class157(class161 var1) {
		this.this$0 = var1;
		this.field1752 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1847441946"
	)
	void vmethod3451(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1752 = var1.readUnsignedShort(); // L: 134
		this.field1748 = var1.readByte(); // L: 135
		this.field1750 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1751 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "-1976910783"
	)
	void vmethod3453(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1752); // L: 143
		var2.rank = this.field1748; // L: 144
		var2.world = this.field1750; // L: 145
		var2.username = new Username(this.field1751); // L: 146
	} // L: 147

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V",
		garbageValue = "-831896227"
	)
	public static void method3368(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "823753250"
	)
	public static final void method3369() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 78
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 79
	} // L: 80

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-270421783"
	)
	static final void method3364(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9306
			var2 -= 2000;
		}

		Widget var9;
		PacketBufferNode var11;
		if (var2 == 24) { // L: 9307
			var9 = Interpreter.getWidget(var1); // L: 9308
			if (var9 != null) { // L: 9309
				boolean var10 = true; // L: 9310
				if (var9.contentType > 0) { // L: 9311
					var10 = class10.method115(var9);
				}

				if (var10) { // L: 9312
					var11 = class217.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 9314
					var11.packetBuffer.writeInt(var1); // L: 9315
					Client.packetWriter.addNode(var11); // L: 9316
				}
			}
		}

		if (var2 == 57 || var2 == 1007) { // L: 9320
			var9 = ServerPacket.getWidgetChild(var1, var0); // L: 9321
			if (var9 != null) { // L: 9322
				class33.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9323
			}
		}

		PacketBufferNode var12;
		NPC var14;
		if (var2 == 10) { // L: 9326
			var14 = Client.npcs[var3]; // L: 9327
			if (var14 != null) { // L: 9328
				Client.mouseCrossX = var7; // L: 9329
				Client.mouseCrossY = var8; // L: 9330
				Client.mouseCrossColor = 2; // L: 9331
				Client.mouseCrossState = 0; // L: 9332
				Client.destinationX = var0; // L: 9333
				Client.destinationY = var1; // L: 9334
				var12 = class217.getPacketBufferNode(ClientPacket.field3183, Client.packetWriter.isaacCipher); // L: 9336
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9337
				var12.packetBuffer.method9096(var3); // L: 9338
				Client.packetWriter.addNode(var12); // L: 9339
			}
		}

		PacketBufferNode var15;
		if (var2 == 19) { // L: 9342
			Client.mouseCrossX = var7; // L: 9343
			Client.mouseCrossY = var8; // L: 9344
			Client.mouseCrossColor = 2; // L: 9345
			Client.mouseCrossState = 0; // L: 9346
			Client.destinationX = var0; // L: 9347
			Client.destinationY = var1; // L: 9348
			var15 = class217.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 9350
			var15.packetBuffer.method9096(class166.baseX * 64 + var0); // L: 9351
			var15.packetBuffer.method9088(Client.field519.method4285(82) ? 1 : 0); // L: 9352
			var15.packetBuffer.method9096(var3); // L: 9353
			var15.packetBuffer.writeIntME(class9.baseY * 64 + var1); // L: 9354
			Client.packetWriter.addNode(var15); // L: 9355
		}

		int var13;
		Widget var16;
		if (var2 == 29) { // L: 9357
			var15 = class217.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 9359
			var15.packetBuffer.writeInt(var1); // L: 9360
			Client.packetWriter.addNode(var15); // L: 9361
			var16 = Interpreter.getWidget(var1); // L: 9362
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 9363
				var13 = var16.cs1Instructions[0][1]; // L: 9364
				if (Varps.Varps_main[var13] != var16.cs1ComparisonValues[0]) { // L: 9365
					Varps.Varps_main[var13] = var16.cs1ComparisonValues[0]; // L: 9366
					Varcs.changeGameOptions(var13); // L: 9367
				}
			}
		}

		if (var2 == 58) { // L: 9371
			var9 = ServerPacket.getWidgetChild(var1, var0); // L: 9372
			if (var9 != null) { // L: 9373
				if (var9.field3735 != null) { // L: 9374
					ScriptEvent var17 = new ScriptEvent(); // L: 9375
					var17.widget = var9; // L: 9376
					var17.opIndex = var3; // L: 9377
					var17.targetName = var6; // L: 9378
					var17.args = var9.field3735; // L: 9379
					class170.runScriptEvent(var17); // L: 9380
				}

				var12 = class217.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 9383
				var12.packetBuffer.method9097(Client.selectedSpellItemId); // L: 9384
				var12.packetBuffer.method9096(var0); // L: 9385
				var12.packetBuffer.method9097(Client.selectedSpellChildIndex); // L: 9386
				var12.packetBuffer.writeIntME(var4); // L: 9387
				var12.packetBuffer.method9109(Canvas.selectedSpellWidget); // L: 9388
				var12.packetBuffer.method9109(var1); // L: 9389
				Client.packetWriter.addNode(var12); // L: 9390
			}
		}

		if (var2 == 5) { // L: 9393
			Client.mouseCrossX = var7; // L: 9394
			Client.mouseCrossY = var8; // L: 9395
			Client.mouseCrossColor = 2; // L: 9396
			Client.mouseCrossState = 0; // L: 9397
			Client.destinationX = var0; // L: 9398
			Client.destinationY = var1; // L: 9399
			var15 = class217.getPacketBufferNode(ClientPacket.field3149, Client.packetWriter.isaacCipher); // L: 9401
			var15.packetBuffer.method9097(class166.baseX * 64 + var0); // L: 9402
			var15.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9403
			var15.packetBuffer.method9097(class9.baseY * 64 + var1); // L: 9404
			var15.packetBuffer.writeIntME(var3); // L: 9405
			Client.packetWriter.addNode(var15); // L: 9406
		}

		if (var2 == 17) { // L: 9408
			Client.mouseCrossX = var7; // L: 9409
			Client.mouseCrossY = var8; // L: 9410
			Client.mouseCrossColor = 2; // L: 9411
			Client.mouseCrossState = 0; // L: 9412
			Client.destinationX = var0; // L: 9413
			Client.destinationY = var1; // L: 9414
			var15 = class217.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 9415
			var15.packetBuffer.method9096(class9.baseY * 64 + var1); // L: 9416
			var15.packetBuffer.method9097(Client.selectedSpellChildIndex); // L: 9417
			var15.packetBuffer.method9097(var3); // L: 9418
			var15.packetBuffer.method9108(Canvas.selectedSpellWidget); // L: 9419
			var15.packetBuffer.method9097(Client.selectedSpellItemId); // L: 9420
			var15.packetBuffer.method9088(Client.field519.method4285(82) ? 1 : 0); // L: 9421
			var15.packetBuffer.writeShort(class166.baseX * 64 + var0); // L: 9422
			Client.packetWriter.addNode(var15); // L: 9423
		}

		if (var2 == 4) { // L: 9425
			Client.mouseCrossX = var7; // L: 9426
			Client.mouseCrossY = var8; // L: 9427
			Client.mouseCrossColor = 2; // L: 9428
			Client.mouseCrossState = 0; // L: 9429
			Client.destinationX = var0; // L: 9430
			Client.destinationY = var1; // L: 9431
			var15 = class217.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 9433
			var15.packetBuffer.method9096(class9.baseY * 64 + var1); // L: 9434
			var15.packetBuffer.writeIntME(var3); // L: 9435
			var15.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9436
			var15.packetBuffer.method9097(class166.baseX * 64 + var0); // L: 9437
			Client.packetWriter.addNode(var15); // L: 9438
		}

		if (var2 == 20) { // L: 9440
			Client.mouseCrossX = var7; // L: 9441
			Client.mouseCrossY = var8; // L: 9442
			Client.mouseCrossColor = 2; // L: 9443
			Client.mouseCrossState = 0; // L: 9444
			Client.destinationX = var0; // L: 9445
			Client.destinationY = var1; // L: 9446
			var15 = class217.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 9448
			var15.packetBuffer.method9097(class166.baseX * 64 + var0); // L: 9449
			var15.packetBuffer.method9097(var3); // L: 9450
			var15.packetBuffer.method9096(class9.baseY * 64 + var1); // L: 9451
			var15.packetBuffer.method9088(Client.field519.method4285(82) ? 1 : 0); // L: 9452
			Client.packetWriter.addNode(var15); // L: 9453
		}

		if (var2 == 16) { // L: 9455
			Client.mouseCrossX = var7; // L: 9456
			Client.mouseCrossY = var8; // L: 9457
			Client.mouseCrossColor = 2; // L: 9458
			Client.mouseCrossState = 0; // L: 9459
			Client.destinationX = var0; // L: 9460
			Client.destinationY = var1; // L: 9461
			var15 = class217.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 9463
			var15.packetBuffer.method9096(GrandExchangeOfferWorldComparator.field4321); // L: 9464
			var15.packetBuffer.method9096(class535.field5223); // L: 9465
			var15.packetBuffer.method9096(var3); // L: 9466
			var15.packetBuffer.method9096(class9.baseY * 64 + var1); // L: 9467
			var15.packetBuffer.writeIntME(class166.baseX * 64 + var0); // L: 9468
			var15.packetBuffer.method9087(Client.field519.method4285(82) ? 1 : 0); // L: 9469
			var15.packetBuffer.method9109(class33.field176); // L: 9470
			Client.packetWriter.addNode(var15); // L: 9471
		}

		if (var2 == 1001) { // L: 9473
			Client.mouseCrossX = var7; // L: 9474
			Client.mouseCrossY = var8; // L: 9475
			Client.mouseCrossColor = 2; // L: 9476
			Client.mouseCrossState = 0; // L: 9477
			Client.destinationX = var0; // L: 9478
			Client.destinationY = var1; // L: 9479
			var15 = class217.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher); // L: 9481
			var15.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9482
			var15.packetBuffer.writeIntME(var3); // L: 9483
			var15.packetBuffer.writeIntME(class9.baseY * 64 + var1); // L: 9484
			var15.packetBuffer.writeIntME(class166.baseX * 64 + var0); // L: 9485
			Client.packetWriter.addNode(var15); // L: 9486
		}

		if (var2 == 1003) { // L: 9488
			Client.mouseCrossX = var7; // L: 9489
			Client.mouseCrossY = var8; // L: 9490
			Client.mouseCrossColor = 2; // L: 9491
			Client.mouseCrossState = 0; // L: 9492
			var14 = Client.npcs[var3]; // L: 9493
			if (var14 != null) { // L: 9494
				NPCComposition var18 = var14.definition; // L: 9495
				if (var18.transforms != null) { // L: 9496
					var18 = var18.transform();
				}

				if (var18 != null) { // L: 9497
					var11 = class217.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 9499
					var11.packetBuffer.method9097(var18.id); // L: 9500
					Client.packetWriter.addNode(var11); // L: 9501
				}
			}
		}

		if (var2 == 1004) { // L: 9505
			Client.mouseCrossX = var7; // L: 9506
			Client.mouseCrossY = var8; // L: 9507
			Client.mouseCrossColor = 2; // L: 9508
			Client.mouseCrossState = 0; // L: 9509
			var15 = class217.getPacketBufferNode(ClientPacket.field3119, Client.packetWriter.isaacCipher); // L: 9511
			var15.packetBuffer.method9096(class166.baseX * 64 + var0); // L: 9512
			var15.packetBuffer.method9097(var3); // L: 9513
			var15.packetBuffer.writeIntME(class9.baseY * 64 + var1); // L: 9514
			Client.packetWriter.addNode(var15); // L: 9515
		}

		if (var2 == 1002) { // L: 9517
			Client.mouseCrossX = var7; // L: 9518
			Client.mouseCrossY = var8; // L: 9519
			Client.mouseCrossColor = 2; // L: 9520
			Client.mouseCrossState = 0; // L: 9521
			var15 = class217.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 9523
			var15.packetBuffer.writeShort(var3); // L: 9524
			Client.packetWriter.addNode(var15); // L: 9525
		}

		Player var19;
		if (var2 == 46) { // L: 9527
			var19 = Client.players[var3]; // L: 9528
			if (var19 != null) { // L: 9529
				Client.mouseCrossX = var7; // L: 9530
				Client.mouseCrossY = var8; // L: 9531
				Client.mouseCrossColor = 2; // L: 9532
				Client.mouseCrossState = 0; // L: 9533
				Client.destinationX = var0; // L: 9534
				Client.destinationY = var1; // L: 9535
				var12 = class217.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 9537
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9538
				var12.packetBuffer.writeShort(var3); // L: 9539
				Client.packetWriter.addNode(var12); // L: 9540
			}
		}

		if (var2 == 23) { // L: 9543
			if (Client.isMenuOpen) { // L: 9544
				class173.scene.setViewportWalking(); // L: 9545
			} else {
				class173.scene.menuOpen(BuddyRankComparator.Client_plane, var0, var1, true); // L: 9548
			}
		}

		if (var2 == 44) { // L: 9551
			var19 = Client.players[var3]; // L: 9552
			if (var19 != null) { // L: 9553
				Client.mouseCrossX = var7; // L: 9554
				Client.mouseCrossY = var8; // L: 9555
				Client.mouseCrossColor = 2; // L: 9556
				Client.mouseCrossState = 0; // L: 9557
				Client.destinationX = var0; // L: 9558
				Client.destinationY = var1; // L: 9559
				var12 = class217.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 9561
				var12.packetBuffer.writeIntME(var3); // L: 9562
				var12.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9563
				Client.packetWriter.addNode(var12); // L: 9564
			}
		}

		if (var2 == 51) { // L: 9567
			var19 = Client.players[var3]; // L: 9568
			if (var19 != null) { // L: 9569
				Client.mouseCrossX = var7; // L: 9570
				Client.mouseCrossY = var8; // L: 9571
				Client.mouseCrossColor = 2; // L: 9572
				Client.mouseCrossState = 0; // L: 9573
				Client.destinationX = var0; // L: 9574
				Client.destinationY = var1; // L: 9575
				var12 = class217.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 9577
				var12.packetBuffer.writeIntME(var3); // L: 9578
				var12.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9579
				Client.packetWriter.addNode(var12); // L: 9580
			}
		}

		if (var2 == 22) { // L: 9583
			Client.mouseCrossX = var7; // L: 9584
			Client.mouseCrossY = var8; // L: 9585
			Client.mouseCrossColor = 2; // L: 9586
			Client.mouseCrossState = 0; // L: 9587
			Client.destinationX = var0; // L: 9588
			Client.destinationY = var1; // L: 9589
			var15 = class217.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 9591
			var15.packetBuffer.method9097(class166.baseX * 64 + var0); // L: 9592
			var15.packetBuffer.method9087(Client.field519.method4285(82) ? 1 : 0); // L: 9593
			var15.packetBuffer.method9097(var3); // L: 9594
			var15.packetBuffer.method9097(class9.baseY * 64 + var1); // L: 9595
			Client.packetWriter.addNode(var15); // L: 9596
		}

		if (var2 == 14) { // L: 9598
			var19 = Client.players[var3]; // L: 9599
			if (var19 != null) { // L: 9600
				Client.mouseCrossX = var7; // L: 9601
				Client.mouseCrossY = var8; // L: 9602
				Client.mouseCrossColor = 2; // L: 9603
				Client.mouseCrossState = 0; // L: 9604
				Client.destinationX = var0; // L: 9605
				Client.destinationY = var1; // L: 9606
				var12 = class217.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher); // L: 9608
				var12.packetBuffer.writeIntME(class535.field5223); // L: 9609
				var12.packetBuffer.writeIntME(GrandExchangeOfferWorldComparator.field4321); // L: 9610
				var12.packetBuffer.method9108(class33.field176); // L: 9611
				var12.packetBuffer.writeShort(var3); // L: 9612
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9613
				Client.packetWriter.addNode(var12); // L: 9614
			}
		}

		if (var2 == 13) { // L: 9617
			var14 = Client.npcs[var3]; // L: 9618
			if (var14 != null) { // L: 9619
				Client.mouseCrossX = var7; // L: 9620
				Client.mouseCrossY = var8; // L: 9621
				Client.mouseCrossColor = 2; // L: 9622
				Client.mouseCrossState = 0; // L: 9623
				Client.destinationX = var0; // L: 9624
				Client.destinationY = var1; // L: 9625
				var12 = class217.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 9627
				var12.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9628
				var12.packetBuffer.writeShort(var3); // L: 9629
				Client.packetWriter.addNode(var12); // L: 9630
			}
		}

		if (var2 == 49) { // L: 9633
			var19 = Client.players[var3]; // L: 9634
			if (var19 != null) { // L: 9635
				Client.mouseCrossX = var7; // L: 9636
				Client.mouseCrossY = var8; // L: 9637
				Client.mouseCrossColor = 2; // L: 9638
				Client.mouseCrossState = 0; // L: 9639
				Client.destinationX = var0; // L: 9640
				Client.destinationY = var1; // L: 9641
				var12 = class217.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9643
				var12.packetBuffer.writeIntME(var3); // L: 9644
				var12.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9645
				Client.packetWriter.addNode(var12); // L: 9646
			}
		}

		if (var2 == 48) { // L: 9649
			var19 = Client.players[var3]; // L: 9650
			if (var19 != null) { // L: 9651
				Client.mouseCrossX = var7; // L: 9652
				Client.mouseCrossY = var8; // L: 9653
				Client.mouseCrossColor = 2; // L: 9654
				Client.mouseCrossState = 0; // L: 9655
				Client.destinationX = var0; // L: 9656
				Client.destinationY = var1; // L: 9657
				var12 = class217.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 9659
				var12.packetBuffer.method9097(var3); // L: 9660
				var12.packetBuffer.method9088(Client.field519.method4285(82) ? 1 : 0); // L: 9661
				Client.packetWriter.addNode(var12); // L: 9662
			}
		}

		if (var2 == 45) { // L: 9665
			var19 = Client.players[var3]; // L: 9666
			if (var19 != null) { // L: 9667
				Client.mouseCrossX = var7; // L: 9668
				Client.mouseCrossY = var8; // L: 9669
				Client.mouseCrossColor = 2; // L: 9670
				Client.mouseCrossState = 0; // L: 9671
				Client.destinationX = var0; // L: 9672
				Client.destinationY = var1; // L: 9673
				var12 = class217.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 9675
				var12.packetBuffer.writeIntME(var3); // L: 9676
				var12.packetBuffer.method9088(Client.field519.method4285(82) ? 1 : 0); // L: 9677
				Client.packetWriter.addNode(var12); // L: 9678
			}
		}

		if (var2 == 50) { // L: 9681
			var19 = Client.players[var3]; // L: 9682
			if (var19 != null) { // L: 9683
				Client.mouseCrossX = var7; // L: 9684
				Client.mouseCrossY = var8; // L: 9685
				Client.mouseCrossColor = 2; // L: 9686
				Client.mouseCrossState = 0; // L: 9687
				Client.destinationX = var0; // L: 9688
				Client.destinationY = var1; // L: 9689
				var12 = class217.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9691
				var12.packetBuffer.writeShort(var3); // L: 9692
				var12.packetBuffer.method9088(Client.field519.method4285(82) ? 1 : 0); // L: 9693
				Client.packetWriter.addNode(var12); // L: 9694
			}
		}

		if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9697 9698
			class143.resumePauseWidget(var1, var0); // L: 9699
			Client.meslayerContinueWidget = ServerPacket.getWidgetChild(var1, var0); // L: 9700
			class303.invalidateWidget(Client.meslayerContinueWidget); // L: 9701
		}

		if (var2 == 3) { // L: 9704
			Client.mouseCrossX = var7; // L: 9705
			Client.mouseCrossY = var8; // L: 9706
			Client.mouseCrossColor = 2; // L: 9707
			Client.mouseCrossState = 0; // L: 9708
			Client.destinationX = var0; // L: 9709
			Client.destinationY = var1; // L: 9710
			var15 = class217.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 9712
			var15.packetBuffer.method9096(class9.baseY * 64 + var1); // L: 9713
			var15.packetBuffer.method9096(class166.baseX * 64 + var0); // L: 9714
			var15.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9715
			var15.packetBuffer.writeShort(var3); // L: 9716
			Client.packetWriter.addNode(var15); // L: 9717
		}

		if (var2 == 18) { // L: 9719
			Client.mouseCrossX = var7; // L: 9720
			Client.mouseCrossY = var8; // L: 9721
			Client.mouseCrossColor = 2; // L: 9722
			Client.mouseCrossState = 0; // L: 9723
			Client.destinationX = var0; // L: 9724
			Client.destinationY = var1; // L: 9725
			var15 = class217.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 9727
			var15.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9728
			var15.packetBuffer.writeIntME(class9.baseY * 64 + var1); // L: 9729
			var15.packetBuffer.writeIntME(var3); // L: 9730
			var15.packetBuffer.writeIntME(class166.baseX * 64 + var0); // L: 9731
			Client.packetWriter.addNode(var15); // L: 9732
		}

		if (var2 == 7) { // L: 9734
			var14 = Client.npcs[var3]; // L: 9735
			if (var14 != null) { // L: 9736
				Client.mouseCrossX = var7; // L: 9737
				Client.mouseCrossY = var8; // L: 9738
				Client.mouseCrossColor = 2; // L: 9739
				Client.mouseCrossState = 0; // L: 9740
				Client.destinationX = var0; // L: 9741
				Client.destinationY = var1; // L: 9742
				var12 = class217.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 9744
				var12.packetBuffer.method9097(GrandExchangeOfferWorldComparator.field4321); // L: 9745
				var12.packetBuffer.writeIntME(class535.field5223); // L: 9746
				var12.packetBuffer.method9110(class33.field176); // L: 9747
				var12.packetBuffer.method9097(var3); // L: 9748
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9749
				Client.packetWriter.addNode(var12); // L: 9750
			}
		}

		if (var2 == 12) { // L: 9753
			var14 = Client.npcs[var3]; // L: 9754
			if (var14 != null) { // L: 9755
				Client.mouseCrossX = var7; // L: 9756
				Client.mouseCrossY = var8; // L: 9757
				Client.mouseCrossColor = 2; // L: 9758
				Client.mouseCrossState = 0; // L: 9759
				Client.destinationX = var0; // L: 9760
				Client.destinationY = var1; // L: 9761
				var12 = class217.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 9763
				var12.packetBuffer.method9096(var3); // L: 9764
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9765
				Client.packetWriter.addNode(var12); // L: 9766
			}
		}

		if (var2 == 11) { // L: 9769
			var14 = Client.npcs[var3]; // L: 9770
			if (var14 != null) { // L: 9771
				Client.mouseCrossX = var7; // L: 9772
				Client.mouseCrossY = var8; // L: 9773
				Client.mouseCrossColor = 2; // L: 9774
				Client.mouseCrossState = 0; // L: 9775
				Client.destinationX = var0; // L: 9776
				Client.destinationY = var1; // L: 9777
				var12 = class217.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher); // L: 9779
				var12.packetBuffer.writeShort(var3); // L: 9780
				var12.packetBuffer.method9087(Client.field519.method4285(82) ? 1 : 0); // L: 9781
				Client.packetWriter.addNode(var12); // L: 9782
			}
		}

		if (var2 == 9) { // L: 9785
			var14 = Client.npcs[var3]; // L: 9786
			if (var14 != null) { // L: 9787
				Client.mouseCrossX = var7; // L: 9788
				Client.mouseCrossY = var8; // L: 9789
				Client.mouseCrossColor = 2; // L: 9790
				Client.mouseCrossState = 0; // L: 9791
				Client.destinationX = var0; // L: 9792
				Client.destinationY = var1; // L: 9793
				var12 = class217.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher); // L: 9795
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9796
				var12.packetBuffer.writeIntME(var3); // L: 9797
				Client.packetWriter.addNode(var12); // L: 9798
			}
		}

		if (var2 == 47) { // L: 9801
			var19 = Client.players[var3]; // L: 9802
			if (var19 != null) { // L: 9803
				Client.mouseCrossX = var7; // L: 9804
				Client.mouseCrossY = var8; // L: 9805
				Client.mouseCrossColor = 2; // L: 9806
				Client.mouseCrossState = 0; // L: 9807
				Client.destinationX = var0; // L: 9808
				Client.destinationY = var1; // L: 9809
				var12 = class217.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 9811
				var12.packetBuffer.method9097(var3); // L: 9812
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9813
				Client.packetWriter.addNode(var12); // L: 9814
			}
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9817
			ScriptFrame.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9818
		}

		if (var2 == 8) { // L: 9820
			var14 = Client.npcs[var3]; // L: 9821
			if (var14 != null) { // L: 9822
				Client.mouseCrossX = var7; // L: 9823
				Client.mouseCrossY = var8; // L: 9824
				Client.mouseCrossColor = 2; // L: 9825
				Client.mouseCrossState = 0; // L: 9826
				Client.destinationX = var0; // L: 9827
				Client.destinationY = var1; // L: 9828
				var12 = class217.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 9829
				var12.packetBuffer.method9110(Canvas.selectedSpellWidget); // L: 9830
				var12.packetBuffer.method9096(Client.selectedSpellChildIndex); // L: 9831
				var12.packetBuffer.method9096(Client.selectedSpellItemId); // L: 9832
				var12.packetBuffer.method9096(var3); // L: 9833
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9834
				Client.packetWriter.addNode(var12); // L: 9835
			}
		}

		if (var2 == 2) { // L: 9838
			Client.mouseCrossX = var7; // L: 9839
			Client.mouseCrossY = var8; // L: 9840
			Client.mouseCrossColor = 2; // L: 9841
			Client.mouseCrossState = 0; // L: 9842
			Client.destinationX = var0; // L: 9843
			Client.destinationY = var1; // L: 9844
			var15 = class217.getPacketBufferNode(ClientPacket.field3196, Client.packetWriter.isaacCipher); // L: 9845
			var15.packetBuffer.method9088(Client.field519.method4285(82) ? 1 : 0); // L: 9846
			var15.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9847
			var15.packetBuffer.writeShort(var3); // L: 9848
			var15.packetBuffer.writeShort(class9.baseY * 64 + var1); // L: 9849
			var15.packetBuffer.method9097(class166.baseX * 64 + var0); // L: 9850
			var15.packetBuffer.method9096(Client.selectedSpellChildIndex); // L: 9851
			var15.packetBuffer.method9110(Canvas.selectedSpellWidget); // L: 9852
			Client.packetWriter.addNode(var15); // L: 9853
		}

		if (var2 == 28) { // L: 9855
			var15 = class217.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 9857
			var15.packetBuffer.writeInt(var1); // L: 9858
			Client.packetWriter.addNode(var15); // L: 9859
			var16 = Interpreter.getWidget(var1); // L: 9860
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 9861
				var13 = var16.cs1Instructions[0][1]; // L: 9862
				Varps.Varps_main[var13] = 1 - Varps.Varps_main[var13]; // L: 9863
				Varcs.changeGameOptions(var13); // L: 9864
			}
		}

		if (var2 == 1) { // L: 9867
			Client.mouseCrossX = var7; // L: 9868
			Client.mouseCrossY = var8; // L: 9869
			Client.mouseCrossColor = 2; // L: 9870
			Client.mouseCrossState = 0; // L: 9871
			Client.destinationX = var0; // L: 9872
			Client.destinationY = var1; // L: 9873
			var15 = class217.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 9875
			var15.packetBuffer.method9096(var3); // L: 9876
			var15.packetBuffer.method9096(class535.field5223); // L: 9877
			var15.packetBuffer.method9096(GrandExchangeOfferWorldComparator.field4321); // L: 9878
			var15.packetBuffer.method9096(class166.baseX * 64 + var0); // L: 9879
			var15.packetBuffer.method9087(Client.field519.method4285(82) ? 1 : 0); // L: 9880
			var15.packetBuffer.writeInt(class33.field176); // L: 9881
			var15.packetBuffer.method9096(class9.baseY * 64 + var1); // L: 9882
			Client.packetWriter.addNode(var15); // L: 9883
		}

		if (var2 == 15) { // L: 9885
			var19 = Client.players[var3]; // L: 9886
			if (var19 != null) { // L: 9887
				Client.mouseCrossX = var7; // L: 9888
				Client.mouseCrossY = var8; // L: 9889
				Client.mouseCrossColor = 2; // L: 9890
				Client.mouseCrossState = 0; // L: 9891
				Client.destinationX = var0; // L: 9892
				Client.destinationY = var1; // L: 9893
				var12 = class217.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 9894
				var12.packetBuffer.method9097(var3); // L: 9895
				var12.packetBuffer.method9109(Canvas.selectedSpellWidget); // L: 9896
				var12.packetBuffer.writeByte(Client.field519.method4285(82) ? 1 : 0); // L: 9897
				var12.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9898
				var12.packetBuffer.method9096(Client.selectedSpellChildIndex); // L: 9899
				Client.packetWriter.addNode(var12); // L: 9900
			}
		}

		if (var2 == 25) { // L: 9903
			var9 = ServerPacket.getWidgetChild(var1, var0); // L: 9904
			if (var9 != null) { // L: 9905
				class167.Widget_runOnTargetLeave(); // L: 9906
				FloorOverlayDefinition.selectSpell(var1, var0, UserComparator4.Widget_unpackTargetMask(class19.getWidgetFlags(var9)), var4); // L: 9907
				Client.isItemSelected = 0; // L: 9908
				Client.field665 = class108.Widget_getSpellActionName(var9); // L: 9909
				if (Client.field665 == null) { // L: 9910
					Client.field665 = "null";
				}

				if (var9.isIf3) { // L: 9911
					Client.field666 = var9.dataText + class17.colorStartTag(16777215);
				} else {
					Client.field666 = class17.colorStartTag(65280) + var9.field3756 + class17.colorStartTag(16777215); // L: 9912
				}
			}

		} else {
			if (var2 == 6) { // L: 9916
				Client.mouseCrossX = var7; // L: 9917
				Client.mouseCrossY = var8; // L: 9918
				Client.mouseCrossColor = 2; // L: 9919
				Client.mouseCrossState = 0; // L: 9920
				Client.destinationX = var0; // L: 9921
				Client.destinationY = var1; // L: 9922
				var15 = class217.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher); // L: 9924
				var15.packetBuffer.writeIntME(class9.baseY * 64 + var1); // L: 9925
				var15.packetBuffer.method9096(class166.baseX * 64 + var0); // L: 9926
				var15.packetBuffer.writeShort(var3); // L: 9927
				var15.packetBuffer.method9087(Client.field519.method4285(82) ? 1 : 0); // L: 9928
				Client.packetWriter.addNode(var15); // L: 9929
			}

			if (var2 == 26) { // L: 9931
				SoundCache.method880(); // L: 9932
			}

			if (var2 == 21) { // L: 9934
				Client.mouseCrossX = var7; // L: 9935
				Client.mouseCrossY = var8; // L: 9936
				Client.mouseCrossColor = 2; // L: 9937
				Client.mouseCrossState = 0; // L: 9938
				Client.destinationX = var0; // L: 9939
				Client.destinationY = var1; // L: 9940
				var15 = class217.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 9942
				var15.packetBuffer.method9204(Client.field519.method4285(82) ? 1 : 0); // L: 9943
				var15.packetBuffer.method9096(var3); // L: 9944
				var15.packetBuffer.writeIntME(class9.baseY * 64 + var1); // L: 9945
				var15.packetBuffer.writeIntME(class166.baseX * 64 + var0); // L: 9946
				Client.packetWriter.addNode(var15); // L: 9947
			}

			if (Client.isItemSelected != 0) { // L: 9949
				Client.isItemSelected = 0; // L: 9950
				class303.invalidateWidget(Interpreter.getWidget(class33.field176)); // L: 9951
			}

			if (Client.isSpellSelected) { // L: 9953
				class167.Widget_runOnTargetLeave();
			}

		}
	} // L: 9914 9954
}
