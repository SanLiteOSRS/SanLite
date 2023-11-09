import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	final LoginType field4628;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 16
		this.field4628 = var1; // L: 17
	} // L: 18

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lqs;",
		garbageValue = "-1997275235"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored(); // L: 22
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqs;",
		garbageValue = "99"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 27
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "974375681"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) { // L: 31
			int var3 = var1.readUnsignedByte(); // L: 32
			if (var3 == 4) { // L: 33
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4628); // L: 34
				if (!var10.hasCleanName()) {
					throw new IllegalStateException(); // L: 35
				}

				boolean var11 = false; // L: 36
				class299.friendSystem.method1867(var10.getName(), var11); // L: 37
			} else {
				boolean var4 = (var3 & 1) != 0; // L: 40
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4628); // L: 41
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4628); // L: 42
				var1.readStringCp1252NullTerminated(); // L: 43
				if (!var5.hasCleanName()) { // L: 44
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 45
				if (var4) { // L: 46
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 47
					if (var8 != null && var7 != var8) { // L: 48
						if (var7 != null) { // L: 49
							this.remove(var8); // L: 50
						} else {
							var7 = var8; // L: 53
						}
					}
				}

				if (var7 != null) { // L: 57
					this.changeName(var7, var5, var6); // L: 58
				} else if (this.getSize() < 400) { // L: 60
					int var9 = this.getSize(); // L: 61
					var7 = (Ignored)this.addLast(var5, var6); // L: 62
					var7.id = var9; // L: 63
				}
			}
		}

	} // L: 67

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "5"
	)
	static final void method7814(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9386
			var2 -= 2000;
		}

		NPC var9;
		PacketBufferNode var10;
		if (var2 == 9) { // L: 9387
			var9 = Client.npcs[var3]; // L: 9388
			if (var9 != null) { // L: 9389
				Client.mouseCrossX = var7; // L: 9390
				Client.mouseCrossY = var8; // L: 9391
				Client.mouseCrossColor = 2; // L: 9392
				Client.mouseCrossState = 0; // L: 9393
				Client.destinationX = var0; // L: 9394
				Client.destinationY = var1; // L: 9395
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3196, Client.packetWriter.isaacCipher); // L: 9397
				var10.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9398
				var10.packetBuffer.method9213(var3); // L: 9399
				Client.packetWriter.addNode(var10); // L: 9400
			}
		}

		if (var2 == 12) { // L: 9403
			var9 = Client.npcs[var3]; // L: 9404
			if (var9 != null) { // L: 9405
				Client.mouseCrossX = var7; // L: 9406
				Client.mouseCrossY = var8; // L: 9407
				Client.mouseCrossColor = 2; // L: 9408
				Client.mouseCrossState = 0; // L: 9409
				Client.destinationX = var0; // L: 9410
				Client.destinationY = var1; // L: 9411
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher); // L: 9413
				var10.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9414
				var10.packetBuffer.writeShort(var3); // L: 9415
				Client.packetWriter.addNode(var10); // L: 9416
			}
		}

		Player var14;
		if (var2 == 45) { // L: 9419
			var14 = Client.players[var3]; // L: 9420
			if (var14 != null) { // L: 9421
				Client.mouseCrossX = var7; // L: 9422
				Client.mouseCrossY = var8; // L: 9423
				Client.mouseCrossColor = 2; // L: 9424
				Client.mouseCrossState = 0; // L: 9425
				Client.destinationX = var0; // L: 9426
				Client.destinationY = var1; // L: 9427
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3158, Client.packetWriter.isaacCipher); // L: 9429
				var10.packetBuffer.method9098(var3); // L: 9430
				var10.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9431
				Client.packetWriter.addNode(var10); // L: 9432
			}
		}

		if (var2 == 47) { // L: 9435
			var14 = Client.players[var3]; // L: 9436
			if (var14 != null) { // L: 9437
				Client.mouseCrossX = var7; // L: 9438
				Client.mouseCrossY = var8; // L: 9439
				Client.mouseCrossColor = 2; // L: 9440
				Client.mouseCrossState = 0; // L: 9441
				Client.destinationX = var0; // L: 9442
				Client.destinationY = var1; // L: 9443
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 9445
				var10.packetBuffer.method9213(var3); // L: 9446
				var10.packetBuffer.method9291(Client.field674.method4120(82) ? 1 : 0); // L: 9447
				Client.packetWriter.addNode(var10); // L: 9448
			}
		}

		Widget var15;
		if (var2 == 57 || var2 == 1007) { // L: 9451
			var15 = SoundCache.getWidgetChild(var1, var0); // L: 9452
			if (var15 != null) { // L: 9453
				class47.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9454
			}
		}

		PacketBufferNode var16;
		if (var2 == 19) { // L: 9457
			Client.mouseCrossX = var7; // L: 9458
			Client.mouseCrossY = var8; // L: 9459
			Client.mouseCrossColor = 2; // L: 9460
			Client.mouseCrossState = 0; // L: 9461
			Client.destinationX = var0; // L: 9462
			Client.destinationY = var1; // L: 9463
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher); // L: 9465
			var16.packetBuffer.writeShort(class47.baseY * 64 + var1); // L: 9466
			var16.packetBuffer.method9098(UrlRequester.baseX * 64 + var0); // L: 9467
			var16.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9468
			var16.packetBuffer.method9239(var3); // L: 9469
			Client.packetWriter.addNode(var16); // L: 9470
		}

		if (var2 == 1) { // L: 9472
			Client.mouseCrossX = var7; // L: 9473
			Client.mouseCrossY = var8; // L: 9474
			Client.mouseCrossColor = 2; // L: 9475
			Client.mouseCrossState = 0; // L: 9476
			Client.destinationX = var0; // L: 9477
			Client.destinationY = var1; // L: 9478
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher); // L: 9480
			var16.packetBuffer.method9213(class157.field1767); // L: 9481
			var16.packetBuffer.writeInt(class138.field1643); // L: 9482
			var16.packetBuffer.writeShort(WorldMapArea.field2916); // L: 9483
			var16.packetBuffer.method9098(var3); // L: 9484
			var16.packetBuffer.method9213(class47.baseY * 64 + var1); // L: 9485
			var16.packetBuffer.method9213(UrlRequester.baseX * 64 + var0); // L: 9486
			var16.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9487
			Client.packetWriter.addNode(var16); // L: 9488
		}

		if (var2 == 13) { // L: 9490
			var9 = Client.npcs[var3]; // L: 9491
			if (var9 != null) { // L: 9492
				Client.mouseCrossX = var7; // L: 9493
				Client.mouseCrossY = var8; // L: 9494
				Client.mouseCrossColor = 2; // L: 9495
				Client.mouseCrossState = 0; // L: 9496
				Client.destinationX = var0; // L: 9497
				Client.destinationY = var1; // L: 9498
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 9500
				var10.packetBuffer.method9110(Client.field674.method4120(82) ? 1 : 0); // L: 9501
				var10.packetBuffer.method9239(var3); // L: 9502
				Client.packetWriter.addNode(var10); // L: 9503
			}
		}

		if (var2 == 14) { // L: 9506
			var14 = Client.players[var3]; // L: 9507
			if (var14 != null) { // L: 9508
				Client.mouseCrossX = var7; // L: 9509
				Client.mouseCrossY = var8; // L: 9510
				Client.mouseCrossColor = 2; // L: 9511
				Client.mouseCrossState = 0; // L: 9512
				Client.destinationX = var0; // L: 9513
				Client.destinationY = var1; // L: 9514
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher); // L: 9516
				var10.packetBuffer.writeIntME(class138.field1643); // L: 9517
				var10.packetBuffer.method9213(class157.field1767); // L: 9518
				var10.packetBuffer.method9213(WorldMapArea.field2916); // L: 9519
				var10.packetBuffer.method9213(var3); // L: 9520
				var10.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9521
				Client.packetWriter.addNode(var10); // L: 9522
			}
		}

		if (var2 == 1002) { // L: 9525
			Client.mouseCrossX = var7; // L: 9526
			Client.mouseCrossY = var8; // L: 9527
			Client.mouseCrossColor = 2; // L: 9528
			Client.mouseCrossState = 0; // L: 9529
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 9531
			var16.packetBuffer.method9098(var3); // L: 9532
			Client.packetWriter.addNode(var16); // L: 9533
		}

		if (var2 == 10) { // L: 9535
			var9 = Client.npcs[var3]; // L: 9536
			if (var9 != null) { // L: 9537
				Client.mouseCrossX = var7; // L: 9538
				Client.mouseCrossY = var8; // L: 9539
				Client.mouseCrossColor = 2; // L: 9540
				Client.mouseCrossState = 0; // L: 9541
				Client.destinationX = var0; // L: 9542
				Client.destinationY = var1; // L: 9543
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 9545
				var10.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9546
				var10.packetBuffer.method9239(var3); // L: 9547
				Client.packetWriter.addNode(var10); // L: 9548
			}
		}

		if (var2 == 1001) { // L: 9551
			Client.mouseCrossX = var7; // L: 9552
			Client.mouseCrossY = var8; // L: 9553
			Client.mouseCrossColor = 2; // L: 9554
			Client.mouseCrossState = 0; // L: 9555
			Client.destinationX = var0; // L: 9556
			Client.destinationY = var1; // L: 9557
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher); // L: 9559
			var16.packetBuffer.method9098(class47.baseY * 64 + var1); // L: 9560
			var16.packetBuffer.method9239(UrlRequester.baseX * 64 + var0); // L: 9561
			var16.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9562
			var16.packetBuffer.method9213(var3); // L: 9563
			Client.packetWriter.addNode(var16); // L: 9564
		}

		if (var2 == 26) { // L: 9566
			WorldMapIcon_1.method5076(); // L: 9567
		}

		if (var2 == 8) { // L: 9569
			var9 = Client.npcs[var3]; // L: 9570
			if (var9 != null) { // L: 9571
				Client.mouseCrossX = var7; // L: 9572
				Client.mouseCrossY = var8; // L: 9573
				Client.mouseCrossColor = 2; // L: 9574
				Client.mouseCrossState = 0; // L: 9575
				Client.destinationX = var0; // L: 9576
				Client.destinationY = var1; // L: 9577
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 9578
				var10.packetBuffer.method9110(Client.field674.method4120(82) ? 1 : 0); // L: 9579
				var10.packetBuffer.method9213(var3); // L: 9580
				var10.packetBuffer.method9239(Client.selectedSpellItemId); // L: 9581
				var10.packetBuffer.method9112(ModeWhere.selectedSpellWidget); // L: 9582
				var10.packetBuffer.method9098(Client.selectedSpellChildIndex); // L: 9583
				Client.packetWriter.addNode(var10); // L: 9584
			}
		}

		if (var2 == 18) { // L: 9587
			Client.mouseCrossX = var7; // L: 9588
			Client.mouseCrossY = var8; // L: 9589
			Client.mouseCrossColor = 2; // L: 9590
			Client.mouseCrossState = 0; // L: 9591
			Client.destinationX = var0; // L: 9592
			Client.destinationY = var1; // L: 9593
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 9595
			var16.packetBuffer.method9213(var3); // L: 9596
			var16.packetBuffer.method9098(UrlRequester.baseX * 64 + var0); // L: 9597
			var16.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9598
			var16.packetBuffer.writeShort(class47.baseY * 64 + var1); // L: 9599
			Client.packetWriter.addNode(var16); // L: 9600
		}

		if (var2 == 23) { // L: 9602
			if (Client.isMenuOpen) { // L: 9603
				class130.scene.setViewportWalking(); // L: 9604
			} else {
				class130.scene.menuOpen(HealthBar.Client_plane, var0, var1, true); // L: 9607
			}
		}

		PacketBufferNode var11;
		if (var2 == 24) { // L: 9610
			var15 = class92.getWidget(var1); // L: 9611
			if (var15 != null) { // L: 9612
				boolean var12 = true; // L: 9613
				if (var15.contentType > 0) { // L: 9614
					var12 = Bounds.method8135(var15);
				}

				if (var12) { // L: 9615
					var11 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 9617
					var11.packetBuffer.writeInt(var1); // L: 9618
					Client.packetWriter.addNode(var11); // L: 9619
				}
			}
		}

		if (var2 == 11) { // L: 9623
			var9 = Client.npcs[var3]; // L: 9624
			if (var9 != null) { // L: 9625
				Client.mouseCrossX = var7; // L: 9626
				Client.mouseCrossY = var8; // L: 9627
				Client.mouseCrossColor = 2; // L: 9628
				Client.mouseCrossState = 0; // L: 9629
				Client.destinationX = var0; // L: 9630
				Client.destinationY = var1; // L: 9631
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 9633
				var10.packetBuffer.method9098(var3); // L: 9634
				var10.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9635
				Client.packetWriter.addNode(var10); // L: 9636
			}
		}

		if (var2 == 49) { // L: 9639
			var14 = Client.players[var3]; // L: 9640
			if (var14 != null) { // L: 9641
				Client.mouseCrossX = var7; // L: 9642
				Client.mouseCrossY = var8; // L: 9643
				Client.mouseCrossColor = 2; // L: 9644
				Client.mouseCrossState = 0; // L: 9645
				Client.destinationX = var0; // L: 9646
				Client.destinationY = var1; // L: 9647
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 9649
				var10.packetBuffer.method9213(var3); // L: 9650
				var10.packetBuffer.method9110(Client.field674.method4120(82) ? 1 : 0); // L: 9651
				Client.packetWriter.addNode(var10); // L: 9652
			}
		}

		if (var2 == 16) { // L: 9655
			Client.mouseCrossX = var7; // L: 9656
			Client.mouseCrossY = var8; // L: 9657
			Client.mouseCrossColor = 2; // L: 9658
			Client.mouseCrossState = 0; // L: 9659
			Client.destinationX = var0; // L: 9660
			Client.destinationY = var1; // L: 9661
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 9663
			var16.packetBuffer.method9098(class157.field1767); // L: 9664
			var16.packetBuffer.method9239(var3); // L: 9665
			var16.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9666
			var16.packetBuffer.method9213(WorldMapArea.field2916); // L: 9667
			var16.packetBuffer.method9239(UrlRequester.baseX * 64 + var0); // L: 9668
			var16.packetBuffer.method9213(class47.baseY * 64 + var1); // L: 9669
			var16.packetBuffer.method9111(class138.field1643); // L: 9670
			Client.packetWriter.addNode(var16); // L: 9671
		}

		if (var2 == 2) { // L: 9673
			Client.mouseCrossX = var7; // L: 9674
			Client.mouseCrossY = var8; // L: 9675
			Client.mouseCrossColor = 2; // L: 9676
			Client.mouseCrossState = 0; // L: 9677
			Client.destinationX = var0; // L: 9678
			Client.destinationY = var1; // L: 9679
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 9680
			var16.packetBuffer.method9098(var3); // L: 9681
			var16.packetBuffer.method9213(UrlRequester.baseX * 64 + var0); // L: 9682
			var16.packetBuffer.writeShort(class47.baseY * 64 + var1); // L: 9683
			var16.packetBuffer.method9098(Client.selectedSpellChildIndex); // L: 9684
			var16.packetBuffer.method9110(Client.field674.method4120(82) ? 1 : 0); // L: 9685
			var16.packetBuffer.method9098(Client.selectedSpellItemId); // L: 9686
			var16.packetBuffer.writeIntME(ModeWhere.selectedSpellWidget); // L: 9687
			Client.packetWriter.addNode(var16); // L: 9688
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9690
			Canvas.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9691
		}

		if (var2 == 6) { // L: 9693
			Client.mouseCrossX = var7; // L: 9694
			Client.mouseCrossY = var8; // L: 9695
			Client.mouseCrossColor = 2; // L: 9696
			Client.mouseCrossState = 0; // L: 9697
			Client.destinationX = var0; // L: 9698
			Client.destinationY = var1; // L: 9699
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 9701
			var16.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9702
			var16.packetBuffer.method9213(class47.baseY * 64 + var1); // L: 9703
			var16.packetBuffer.writeShort(var3); // L: 9704
			var16.packetBuffer.method9239(UrlRequester.baseX * 64 + var0); // L: 9705
			Client.packetWriter.addNode(var16); // L: 9706
		}

		if (var2 == 21) { // L: 9708
			Client.mouseCrossX = var7; // L: 9709
			Client.mouseCrossY = var8; // L: 9710
			Client.mouseCrossColor = 2; // L: 9711
			Client.mouseCrossState = 0; // L: 9712
			Client.destinationX = var0; // L: 9713
			Client.destinationY = var1; // L: 9714
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 9716
			var16.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9717
			var16.packetBuffer.method9239(UrlRequester.baseX * 64 + var0); // L: 9718
			var16.packetBuffer.method9213(class47.baseY * 64 + var1); // L: 9719
			var16.packetBuffer.method9239(var3); // L: 9720
			Client.packetWriter.addNode(var16); // L: 9721
		}

		if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9723 9724
			class466.resumePauseWidget(var1, var0); // L: 9725
			Client.meslayerContinueWidget = SoundCache.getWidgetChild(var1, var0); // L: 9726
			class218.invalidateWidget(Client.meslayerContinueWidget); // L: 9727
		}

		if (var2 == 15) { // L: 9730
			var14 = Client.players[var3]; // L: 9731
			if (var14 != null) { // L: 9732
				Client.mouseCrossX = var7; // L: 9733
				Client.mouseCrossY = var8; // L: 9734
				Client.mouseCrossColor = 2; // L: 9735
				Client.mouseCrossState = 0; // L: 9736
				Client.destinationX = var0; // L: 9737
				Client.destinationY = var1; // L: 9738
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 9739
				var10.packetBuffer.method9098(Client.selectedSpellChildIndex); // L: 9740
				var10.packetBuffer.method9239(Client.selectedSpellItemId); // L: 9741
				var10.packetBuffer.method9112(ModeWhere.selectedSpellWidget); // L: 9742
				var10.packetBuffer.method9239(var3); // L: 9743
				var10.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9744
				Client.packetWriter.addNode(var10); // L: 9745
			}
		}

		int var13;
		Widget var17;
		if (var2 == 28) { // L: 9748
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 9750
			var16.packetBuffer.writeInt(var1); // L: 9751
			Client.packetWriter.addNode(var16); // L: 9752
			var17 = class92.getWidget(var1); // L: 9753
			if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) { // L: 9754
				var13 = var17.cs1Instructions[0][1]; // L: 9755
				Varps.Varps_main[var13] = 1 - Varps.Varps_main[var13]; // L: 9756
				WorldMapDecoration.changeGameOptions(var13); // L: 9757
			}
		}

		if (var2 == 48) { // L: 9760
			var14 = Client.players[var3]; // L: 9761
			if (var14 != null) { // L: 9762
				Client.mouseCrossX = var7; // L: 9763
				Client.mouseCrossY = var8; // L: 9764
				Client.mouseCrossColor = 2; // L: 9765
				Client.mouseCrossState = 0; // L: 9766
				Client.destinationX = var0; // L: 9767
				Client.destinationY = var1; // L: 9768
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 9770
				var10.packetBuffer.method9213(var3); // L: 9771
				var10.packetBuffer.method9110(Client.field674.method4120(82) ? 1 : 0); // L: 9772
				Client.packetWriter.addNode(var10); // L: 9773
			}
		}

		if (var2 == 4) { // L: 9776
			Client.mouseCrossX = var7; // L: 9777
			Client.mouseCrossY = var8; // L: 9778
			Client.mouseCrossColor = 2; // L: 9779
			Client.mouseCrossState = 0; // L: 9780
			Client.destinationX = var0; // L: 9781
			Client.destinationY = var1; // L: 9782
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 9784
			var16.packetBuffer.writeShort(UrlRequester.baseX * 64 + var0); // L: 9785
			var16.packetBuffer.writeShort(class47.baseY * 64 + var1); // L: 9786
			var16.packetBuffer.method9239(var3); // L: 9787
			var16.packetBuffer.method9291(Client.field674.method4120(82) ? 1 : 0); // L: 9788
			Client.packetWriter.addNode(var16); // L: 9789
		}

		if (var2 == 29) { // L: 9791
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 9793
			var16.packetBuffer.writeInt(var1); // L: 9794
			Client.packetWriter.addNode(var16); // L: 9795
			var17 = class92.getWidget(var1); // L: 9796
			if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) { // L: 9797
				var13 = var17.cs1Instructions[0][1]; // L: 9798
				if (Varps.Varps_main[var13] != var17.cs1ComparisonValues[0]) { // L: 9799
					Varps.Varps_main[var13] = var17.cs1ComparisonValues[0]; // L: 9800
					WorldMapDecoration.changeGameOptions(var13); // L: 9801
				}
			}
		}

		if (var2 == 1003) { // L: 9805
			Client.mouseCrossX = var7; // L: 9806
			Client.mouseCrossY = var8; // L: 9807
			Client.mouseCrossColor = 2; // L: 9808
			Client.mouseCrossState = 0; // L: 9809
			var9 = Client.npcs[var3]; // L: 9810
			if (var9 != null) { // L: 9811
				NPCComposition var18 = var9.definition; // L: 9812
				if (var18.transforms != null) { // L: 9813
					var18 = var18.transform();
				}

				if (var18 != null) { // L: 9814
					var11 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 9816
					var11.packetBuffer.method9213(var18.id); // L: 9817
					Client.packetWriter.addNode(var11); // L: 9818
				}
			}
		}

		if (var2 == 44) { // L: 9822
			var14 = Client.players[var3]; // L: 9823
			if (var14 != null) { // L: 9824
				Client.mouseCrossX = var7; // L: 9825
				Client.mouseCrossY = var8; // L: 9826
				Client.mouseCrossColor = 2; // L: 9827
				Client.mouseCrossState = 0; // L: 9828
				Client.destinationX = var0; // L: 9829
				Client.destinationY = var1; // L: 9830
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 9832
				var10.packetBuffer.method9098(var3); // L: 9833
				var10.packetBuffer.method9110(Client.field674.method4120(82) ? 1 : 0); // L: 9834
				Client.packetWriter.addNode(var10); // L: 9835
			}
		}

		if (var2 == 1004) { // L: 9838
			Client.mouseCrossX = var7; // L: 9839
			Client.mouseCrossY = var8; // L: 9840
			Client.mouseCrossColor = 2; // L: 9841
			Client.mouseCrossState = 0; // L: 9842
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 9844
			var16.packetBuffer.writeShort(UrlRequester.baseX * 64 + var0); // L: 9845
			var16.packetBuffer.method9098(var3); // L: 9846
			var16.packetBuffer.method9239(class47.baseY * 64 + var1); // L: 9847
			Client.packetWriter.addNode(var16); // L: 9848
		}

		if (var2 == 46) { // L: 9850
			var14 = Client.players[var3]; // L: 9851
			if (var14 != null) { // L: 9852
				Client.mouseCrossX = var7; // L: 9853
				Client.mouseCrossY = var8; // L: 9854
				Client.mouseCrossColor = 2; // L: 9855
				Client.mouseCrossState = 0; // L: 9856
				Client.destinationX = var0; // L: 9857
				Client.destinationY = var1; // L: 9858
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3170, Client.packetWriter.isaacCipher); // L: 9860
				var10.packetBuffer.method9239(var3); // L: 9861
				var10.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9862
				Client.packetWriter.addNode(var10); // L: 9863
			}
		}

		if (var2 == 22) { // L: 9866
			Client.mouseCrossX = var7; // L: 9867
			Client.mouseCrossY = var8; // L: 9868
			Client.mouseCrossColor = 2; // L: 9869
			Client.mouseCrossState = 0; // L: 9870
			Client.destinationX = var0; // L: 9871
			Client.destinationY = var1; // L: 9872
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 9874
			var16.packetBuffer.method9098(UrlRequester.baseX * 64 + var0); // L: 9875
			var16.packetBuffer.writeShort(class47.baseY * 64 + var1); // L: 9876
			var16.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9877
			var16.packetBuffer.writeShort(var3); // L: 9878
			Client.packetWriter.addNode(var16); // L: 9879
		}

		if (var2 == 58) { // L: 9881
			var15 = SoundCache.getWidgetChild(var1, var0); // L: 9882
			if (var15 != null) { // L: 9883
				if (var15.field3754 != null) { // L: 9884
					ScriptEvent var19 = new ScriptEvent(); // L: 9885
					var19.widget = var15; // L: 9886
					var19.opIndex = var3; // L: 9887
					var19.targetName = var6; // L: 9888
					var19.args = var15.field3754; // L: 9889
					WorldMapSection1.runScriptEvent(var19); // L: 9890
				}

				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3121, Client.packetWriter.isaacCipher); // L: 9893
				var10.packetBuffer.method9213(Client.selectedSpellItemId); // L: 9894
				var10.packetBuffer.writeShort(var0); // L: 9895
				var10.packetBuffer.method9098(Client.selectedSpellChildIndex); // L: 9896
				var10.packetBuffer.writeShort(var4); // L: 9897
				var10.packetBuffer.method9112(ModeWhere.selectedSpellWidget); // L: 9898
				var10.packetBuffer.method9111(var1); // L: 9899
				Client.packetWriter.addNode(var10); // L: 9900
			}
		}

		if (var2 == 5) { // L: 9903
			Client.mouseCrossX = var7; // L: 9904
			Client.mouseCrossY = var8; // L: 9905
			Client.mouseCrossColor = 2; // L: 9906
			Client.mouseCrossState = 0; // L: 9907
			Client.destinationX = var0; // L: 9908
			Client.destinationY = var1; // L: 9909
			var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 9911
			var16.packetBuffer.writeShort(var3); // L: 9912
			var16.packetBuffer.method9098(UrlRequester.baseX * 64 + var0); // L: 9913
			var16.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9914
			var16.packetBuffer.writeShort(class47.baseY * 64 + var1); // L: 9915
			Client.packetWriter.addNode(var16); // L: 9916
		}

		if (var2 == 50) { // L: 9918
			var14 = Client.players[var3]; // L: 9919
			if (var14 != null) { // L: 9920
				Client.mouseCrossX = var7; // L: 9921
				Client.mouseCrossY = var8; // L: 9922
				Client.mouseCrossColor = 2; // L: 9923
				Client.mouseCrossState = 0; // L: 9924
				Client.destinationX = var0; // L: 9925
				Client.destinationY = var1; // L: 9926
				var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher); // L: 9928
				var10.packetBuffer.method9239(var3); // L: 9929
				var10.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9930
				Client.packetWriter.addNode(var10); // L: 9931
			}
		}

		if (var2 == 25) { // L: 9934
			var15 = SoundCache.getWidgetChild(var1, var0); // L: 9935
			if (var15 != null) { // L: 9936
				InvDefinition.Widget_runOnTargetLeave(); // L: 9937
				DirectByteArrayCopier.selectSpell(var1, var0, HealthBarDefinition.Widget_unpackTargetMask(class194.getWidgetFlags(var15)), var4); // L: 9938
				Client.isItemSelected = 0; // L: 9939
				Client.field709 = class300.Widget_getSpellActionName(var15); // L: 9940
				if (Client.field709 == null) { // L: 9941
					Client.field709 = "null";
				}

				if (var15.isIf3) { // L: 9942
					Client.field720 = var15.dataText + class217.colorStartTag(16777215);
				} else {
					Client.field720 = class217.colorStartTag(65280) + var15.field3758 + class217.colorStartTag(16777215); // L: 9943
				}
			}

		} else {
			if (var2 == 17) { // L: 9947
				Client.mouseCrossX = var7; // L: 9948
				Client.mouseCrossY = var8; // L: 9949
				Client.mouseCrossColor = 2; // L: 9950
				Client.mouseCrossState = 0; // L: 9951
				Client.destinationX = var0; // L: 9952
				Client.destinationY = var1; // L: 9953
				var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 9954
				var16.packetBuffer.method9239(UrlRequester.baseX * 64 + var0); // L: 9955
				var16.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9956
				var16.packetBuffer.method9213(Client.selectedSpellItemId); // L: 9957
				var16.packetBuffer.method9098(Client.selectedSpellChildIndex); // L: 9958
				var16.packetBuffer.method9112(ModeWhere.selectedSpellWidget); // L: 9959
				var16.packetBuffer.method9213(class47.baseY * 64 + var1); // L: 9960
				var16.packetBuffer.method9213(var3); // L: 9961
				Client.packetWriter.addNode(var16); // L: 9962
			}

			if (var2 == 20) { // L: 9964
				Client.mouseCrossX = var7; // L: 9965
				Client.mouseCrossY = var8; // L: 9966
				Client.mouseCrossColor = 2; // L: 9967
				Client.mouseCrossState = 0; // L: 9968
				Client.destinationX = var0; // L: 9969
				Client.destinationY = var1; // L: 9970
				var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 9972
				var16.packetBuffer.method9239(class47.baseY * 64 + var1); // L: 9973
				var16.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 9974
				var16.packetBuffer.method9098(var3); // L: 9975
				var16.packetBuffer.method9239(UrlRequester.baseX * 64 + var0); // L: 9976
				Client.packetWriter.addNode(var16); // L: 9977
			}

			if (var2 == 3) { // L: 9979
				Client.mouseCrossX = var7; // L: 9980
				Client.mouseCrossY = var8; // L: 9981
				Client.mouseCrossColor = 2; // L: 9982
				Client.mouseCrossState = 0; // L: 9983
				Client.destinationX = var0; // L: 9984
				Client.destinationY = var1; // L: 9985
				var16 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher); // L: 9987
				var16.packetBuffer.writeShort(UrlRequester.baseX * 64 + var0); // L: 9988
				var16.packetBuffer.method9239(class47.baseY * 64 + var1); // L: 9989
				var16.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 9990
				var16.packetBuffer.method9098(var3); // L: 9991
				Client.packetWriter.addNode(var16); // L: 9992
			}

			if (var2 == 51) { // L: 9994
				var14 = Client.players[var3]; // L: 9995
				if (var14 != null) { // L: 9996
					Client.mouseCrossX = var7; // L: 9997
					Client.mouseCrossY = var8; // L: 9998
					Client.mouseCrossColor = 2; // L: 9999
					Client.mouseCrossState = 0; // L: 10000
					Client.destinationX = var0; // L: 10001
					Client.destinationY = var1; // L: 10002
					var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher); // L: 10004
					var10.packetBuffer.writeByte(Client.field674.method4120(82) ? 1 : 0); // L: 10005
					var10.packetBuffer.method9213(var3); // L: 10006
					Client.packetWriter.addNode(var10); // L: 10007
				}
			}

			if (var2 == 7) { // L: 10010
				var9 = Client.npcs[var3]; // L: 10011
				if (var9 != null) { // L: 10012
					Client.mouseCrossX = var7; // L: 10013
					Client.mouseCrossY = var8; // L: 10014
					Client.mouseCrossColor = 2; // L: 10015
					Client.mouseCrossState = 0; // L: 10016
					Client.destinationX = var0; // L: 10017
					Client.destinationY = var1; // L: 10018
					var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher); // L: 10020
					var10.packetBuffer.method9239(WorldMapArea.field2916); // L: 10021
					var10.packetBuffer.method9239(class157.field1767); // L: 10022
					var10.packetBuffer.writeIntME(class138.field1643); // L: 10023
					var10.packetBuffer.method9239(var3); // L: 10024
					var10.packetBuffer.method9088(Client.field674.method4120(82) ? 1 : 0); // L: 10025
					Client.packetWriter.addNode(var10); // L: 10026
				}
			}

			if (Client.isItemSelected != 0) { // L: 10029
				Client.isItemSelected = 0; // L: 10030
				class218.invalidateWidget(class92.getWidget(class138.field1643)); // L: 10031
			}

			if (Client.isSpellSelected) { // L: 10033
				InvDefinition.Widget_runOnTargetLeave();
			}

		}
	} // L: 9945 10034

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(IS)Ltx;",
		garbageValue = "-11165"
	)
	static class506 method7815(int var0) {
		class506 var1 = (class506)Client.Widget_cachedFonts.get((long)var0); // L: 12914
		if (var1 == null) { // L: 12915
			var1 = new class506(class343.field3869, var0); // L: 12916
		}

		return var1; // L: 12918
	}
}
