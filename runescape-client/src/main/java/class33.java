import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class33 {
	@ObfuscatedName("ay")
	public static short[][] field187;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static class338 field184;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 861053849
	)
	int field177;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -122370825
	)
	int field181;

	class33(int var1, int var2) {
		this.field177 = var1; // L: 14
		this.field181 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbd;I)Z",
		garbageValue = "-114567882"
	)
	boolean method475(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field177) { // L: 20
			case 1:
				return var1.vmethod4264(this.field181); // L: 24
			case 2:
				return var1.vmethod4251(this.field181); // L: 22
			case 3:
				return var1.vmethod4275((char)this.field181); // L: 26
			case 4:
				return var1.vmethod4254(this.field181 == 1); // L: 28
			default:
				return false; // L: 30
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lud;",
		garbageValue = "1018953264"
	)
	static SpritePixels method479(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "973188034"
	)
	public static void method476() {
		WorldMapElement.Ignored_cached.clear(); // L: 159
	} // L: 160

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "102"
	)
	static final void method477(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9455
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 16) { // L: 9456
			Client.mouseCrossX = var7; // L: 9457
			Client.mouseCrossY = var8; // L: 9458
			Client.mouseCrossColor = 2; // L: 9459
			Client.mouseCrossState = 0; // L: 9460
			Client.destinationX = var0; // L: 9461
			Client.destinationY = var1; // L: 9462
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3225, Client.packetWriter.isaacCipher); // L: 9464
			var9.packetBuffer.method9244(Actor.selectedItemSlot); // L: 9465
			var9.packetBuffer.method9344(var3); // L: 9466
			var9.packetBuffer.method9423(class4.field10); // L: 9467
			var9.packetBuffer.method9244(class20.baseX * 64 + var0); // L: 9468
			var9.packetBuffer.writeShort(class129.field1520); // L: 9469
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 9470
			var9.packetBuffer.method9344(class19.baseY * 64 + var1); // L: 9471
			Client.packetWriter.addNode(var9); // L: 9472
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9474
			class434.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9475
		}

		Widget var10;
		int var11;
		if (var2 == 28) { // L: 9477
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 9479
			var9.packetBuffer.writeInt(var1); // L: 9480
			Client.packetWriter.addNode(var9); // L: 9481
			var10 = field184.method6240(var1); // L: 9482
			if (var10 != null && var10.cs1Instructions != null && var10.cs1Instructions[0][0] == 5) { // L: 9483
				var11 = var10.cs1Instructions[0][1]; // L: 9484
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9485
				ScriptEvent.changeGameOptions(var11); // L: 9486
			}
		}

		if (var2 == 4) { // L: 9489
			Client.mouseCrossX = var7; // L: 9490
			Client.mouseCrossY = var8; // L: 9491
			Client.mouseCrossColor = 2; // L: 9492
			Client.mouseCrossState = 0; // L: 9493
			Client.destinationX = var0; // L: 9494
			Client.destinationY = var1; // L: 9495
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3204, Client.packetWriter.isaacCipher); // L: 9497
			var9.packetBuffer.method9244(var3); // L: 9498
			var9.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 9499
			var9.packetBuffer.method9244(class20.baseX * 64 + var0); // L: 9500
			var9.packetBuffer.method9344(class19.baseY * 64 + var1); // L: 9501
			Client.packetWriter.addNode(var9); // L: 9502
		}

		if (var2 == 1) { // L: 9504
			Client.mouseCrossX = var7; // L: 9505
			Client.mouseCrossY = var8; // L: 9506
			Client.mouseCrossColor = 2; // L: 9507
			Client.mouseCrossState = 0; // L: 9508
			Client.destinationX = var0; // L: 9509
			Client.destinationY = var1; // L: 9510
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 9512
			var9.packetBuffer.method9258(class4.field10); // L: 9513
			var9.packetBuffer.method9344(class20.baseX * 64 + var0); // L: 9514
			var9.packetBuffer.writeShort(Actor.selectedItemSlot); // L: 9515
			var9.packetBuffer.method9244(class129.field1520); // L: 9516
			var9.packetBuffer.writeShort(var3); // L: 9517
			var9.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 9518
			var9.packetBuffer.method9243(class19.baseY * 64 + var1); // L: 9519
			Client.packetWriter.addNode(var9); // L: 9520
		}

		if (var2 == 20) { // L: 9522
			Client.mouseCrossX = var7; // L: 9523
			Client.mouseCrossY = var8; // L: 9524
			Client.mouseCrossColor = 2; // L: 9525
			Client.mouseCrossState = 0; // L: 9526
			Client.destinationX = var0; // L: 9527
			Client.destinationY = var1; // L: 9528
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3222, Client.packetWriter.isaacCipher); // L: 9530
			var9.packetBuffer.method9344(class19.baseY * 64 + var1); // L: 9531
			var9.packetBuffer.method9243(var3); // L: 9532
			var9.packetBuffer.method9243(class20.baseX * 64 + var0); // L: 9533
			var9.packetBuffer.method9323(Client.field755.method4280(82) ? 1 : 0); // L: 9534
			Client.packetWriter.addNode(var9); // L: 9535
		}

		PacketBufferNode var14;
		NPC var15;
		if (var2 == 7) { // L: 9537
			var15 = Client.npcs[var3]; // L: 9538
			if (var15 != null) { // L: 9539
				Client.mouseCrossX = var7; // L: 9540
				Client.mouseCrossY = var8; // L: 9541
				Client.mouseCrossColor = 2; // L: 9542
				Client.mouseCrossState = 0; // L: 9543
				Client.destinationX = var0; // L: 9544
				Client.destinationY = var1; // L: 9545
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 9547
				var14.packetBuffer.method9244(Actor.selectedItemSlot); // L: 9548
				var14.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 9549
				var14.packetBuffer.writeInt(class4.field10); // L: 9550
				var14.packetBuffer.method9344(var3); // L: 9551
				var14.packetBuffer.method9243(class129.field1520); // L: 9552
				Client.packetWriter.addNode(var14); // L: 9553
			}
		}

		if (var2 == 6) { // L: 9556
			Client.mouseCrossX = var7; // L: 9557
			Client.mouseCrossY = var8; // L: 9558
			Client.mouseCrossColor = 2; // L: 9559
			Client.mouseCrossState = 0; // L: 9560
			Client.destinationX = var0; // L: 9561
			Client.destinationY = var1; // L: 9562
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3212, Client.packetWriter.isaacCipher); // L: 9564
			var9.packetBuffer.method9344(class19.baseY * 64 + var1); // L: 9565
			var9.packetBuffer.method9243(var3); // L: 9566
			var9.packetBuffer.method9243(class20.baseX * 64 + var0); // L: 9567
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 9568
			Client.packetWriter.addNode(var9); // L: 9569
		}

		Player var16;
		if (var2 == 14) { // L: 9571
			var16 = Client.players[var3]; // L: 9572
			if (var16 != null) { // L: 9573
				Client.mouseCrossX = var7; // L: 9574
				Client.mouseCrossY = var8; // L: 9575
				Client.mouseCrossColor = 2; // L: 9576
				Client.mouseCrossState = 0; // L: 9577
				Client.destinationX = var0; // L: 9578
				Client.destinationY = var1; // L: 9579
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 9581
				var14.packetBuffer.method9423(class4.field10); // L: 9582
				var14.packetBuffer.method9244(Actor.selectedItemSlot); // L: 9583
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0); // L: 9584
				var14.packetBuffer.method9244(var3); // L: 9585
				var14.packetBuffer.method9243(class129.field1520); // L: 9586
				Client.packetWriter.addNode(var14); // L: 9587
			}
		}

		Widget var17;
		if (var2 == 57 || var2 == 1007) { // L: 9590
			var17 = field184.method6241(var1, var0); // L: 9591
			if (var17 != null) { // L: 9592
				TextureProvider.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9593
			}
		}

		if (var2 == 48) { // L: 9596
			var16 = Client.players[var3]; // L: 9597
			if (var16 != null) { // L: 9598
				Client.mouseCrossX = var7; // L: 9599
				Client.mouseCrossY = var8; // L: 9600
				Client.mouseCrossColor = 2; // L: 9601
				Client.mouseCrossState = 0; // L: 9602
				Client.destinationX = var0; // L: 9603
				Client.destinationY = var1; // L: 9604
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3218, Client.packetWriter.isaacCipher); // L: 9606
				var14.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 9607
				var14.packetBuffer.method9344(var3); // L: 9608
				Client.packetWriter.addNode(var14); // L: 9609
			}
		}

		if (var2 == 50) { // L: 9612
			var16 = Client.players[var3]; // L: 9613
			if (var16 != null) { // L: 9614
				Client.mouseCrossX = var7; // L: 9615
				Client.mouseCrossY = var8; // L: 9616
				Client.mouseCrossColor = 2; // L: 9617
				Client.mouseCrossState = 0; // L: 9618
				Client.destinationX = var0; // L: 9619
				Client.destinationY = var1; // L: 9620
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher); // L: 9622
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0); // L: 9623
				var14.packetBuffer.writeShort(var3); // L: 9624
				Client.packetWriter.addNode(var14); // L: 9625
			}
		}

		if (var2 == 23) { // L: 9628
			if (Client.isMenuOpen) { // L: 9629
				class10.scene.setViewportWalking(); // L: 9630
			} else {
				class10.scene.menuOpen(class87.Client_plane, var0, var1, true); // L: 9633
			}
		}

		if (var2 == 13) { // L: 9636
			var15 = Client.npcs[var3]; // L: 9637
			if (var15 != null) { // L: 9638
				Client.mouseCrossX = var7; // L: 9639
				Client.mouseCrossY = var8; // L: 9640
				Client.mouseCrossColor = 2; // L: 9641
				Client.mouseCrossState = 0; // L: 9642
				Client.destinationX = var0; // L: 9643
				Client.destinationY = var1; // L: 9644
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher); // L: 9646
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0); // L: 9647
				var14.packetBuffer.method9344(var3); // L: 9648
				Client.packetWriter.addNode(var14); // L: 9649
			}
		}

		PacketBufferNode var12;
		if (var2 == 1003) { // L: 9652
			Client.mouseCrossX = var7; // L: 9653
			Client.mouseCrossY = var8; // L: 9654
			Client.mouseCrossColor = 2; // L: 9655
			Client.mouseCrossState = 0; // L: 9656
			var15 = Client.npcs[var3]; // L: 9657
			if (var15 != null) { // L: 9658
				NPCComposition var18 = var15.definition; // L: 9659
				if (var18.transforms != null) { // L: 9660
					var18 = var18.transform();
				}

				if (var18 != null) { // L: 9661
					var12 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3200, Client.packetWriter.isaacCipher); // L: 9663
					var12.packetBuffer.method9243(var18.id); // L: 9664
					Client.packetWriter.addNode(var12); // L: 9665
				}
			}
		}

		if (var2 == 21) { // L: 9669
			Client.mouseCrossX = var7; // L: 9670
			Client.mouseCrossY = var8; // L: 9671
			Client.mouseCrossColor = 2; // L: 9672
			Client.mouseCrossState = 0; // L: 9673
			Client.destinationX = var0; // L: 9674
			Client.destinationY = var1; // L: 9675
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher); // L: 9677
			var9.packetBuffer.method9244(var3); // L: 9678
			var9.packetBuffer.writeShort(class20.baseX * 64 + var0); // L: 9679
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1); // L: 9680
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 9681
			Client.packetWriter.addNode(var9); // L: 9682
		}

		if (var2 == 44) { // L: 9684
			var16 = Client.players[var3]; // L: 9685
			if (var16 != null) { // L: 9686
				Client.mouseCrossX = var7; // L: 9687
				Client.mouseCrossY = var8; // L: 9688
				Client.mouseCrossColor = 2; // L: 9689
				Client.mouseCrossState = 0; // L: 9690
				Client.destinationX = var0; // L: 9691
				Client.destinationY = var1; // L: 9692
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 9694
				var14.packetBuffer.method9323(Client.field755.method4280(82) ? 1 : 0); // L: 9695
				var14.packetBuffer.method9243(var3); // L: 9696
				Client.packetWriter.addNode(var14); // L: 9697
			}
		}

		if (var2 == 11) { // L: 9700
			var15 = Client.npcs[var3]; // L: 9701
			if (var15 != null) { // L: 9702
				Client.mouseCrossX = var7; // L: 9703
				Client.mouseCrossY = var8; // L: 9704
				Client.mouseCrossColor = 2; // L: 9705
				Client.mouseCrossState = 0; // L: 9706
				Client.destinationX = var0; // L: 9707
				Client.destinationY = var1; // L: 9708
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 9710
				var14.packetBuffer.method9323(Client.field755.method4280(82) ? 1 : 0); // L: 9711
				var14.packetBuffer.method9243(var3); // L: 9712
				Client.packetWriter.addNode(var14); // L: 9713
			}
		}

		if (var2 == 5) { // L: 9716
			Client.mouseCrossX = var7; // L: 9717
			Client.mouseCrossY = var8; // L: 9718
			Client.mouseCrossColor = 2; // L: 9719
			Client.mouseCrossState = 0; // L: 9720
			Client.destinationX = var0; // L: 9721
			Client.destinationY = var1; // L: 9722
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher); // L: 9724
			var9.packetBuffer.method9243(class19.baseY * 64 + var1); // L: 9725
			var9.packetBuffer.writeShort(var3); // L: 9726
			var9.packetBuffer.method9344(class20.baseX * 64 + var0); // L: 9727
			var9.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 9728
			Client.packetWriter.addNode(var9); // L: 9729
		}

		if (var2 == 15) { // L: 9731
			var16 = Client.players[var3]; // L: 9732
			if (var16 != null) { // L: 9733
				Client.mouseCrossX = var7; // L: 9734
				Client.mouseCrossY = var8; // L: 9735
				Client.mouseCrossColor = 2; // L: 9736
				Client.mouseCrossState = 0; // L: 9737
				Client.destinationX = var0; // L: 9738
				Client.destinationY = var1; // L: 9739
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 9740
				var14.packetBuffer.writeShort(Client.field686); // L: 9741
				var14.packetBuffer.method9244(Client.field585); // L: 9742
				var14.packetBuffer.method9256(JagexCache.field1841); // L: 9743
				var14.packetBuffer.method9344(var3); // L: 9744
				var14.packetBuffer.method9323(Client.field755.method4280(82) ? 1 : 0); // L: 9745
				Client.packetWriter.addNode(var14); // L: 9746
			}
		}

		if (var2 == 51) { // L: 9749
			var16 = Client.players[var3]; // L: 9750
			if (var16 != null) { // L: 9751
				Client.mouseCrossX = var7; // L: 9752
				Client.mouseCrossY = var8; // L: 9753
				Client.mouseCrossColor = 2; // L: 9754
				Client.mouseCrossState = 0; // L: 9755
				Client.destinationX = var0; // L: 9756
				Client.destinationY = var1; // L: 9757
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 9759
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0); // L: 9760
				var14.packetBuffer.method9344(var3); // L: 9761
				Client.packetWriter.addNode(var14); // L: 9762
			}
		}

		if (var2 == 22) { // L: 9765
			Client.mouseCrossX = var7; // L: 9766
			Client.mouseCrossY = var8; // L: 9767
			Client.mouseCrossColor = 2; // L: 9768
			Client.mouseCrossState = 0; // L: 9769
			Client.destinationX = var0; // L: 9770
			Client.destinationY = var1; // L: 9771
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 9773
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 9774
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1); // L: 9775
			var9.packetBuffer.method9344(class20.baseX * 64 + var0); // L: 9776
			var9.packetBuffer.method9243(var3); // L: 9777
			Client.packetWriter.addNode(var9); // L: 9778
		}

		if (var2 == 24) { // L: 9780
			var17 = field184.method6240(var1); // L: 9781
			if (var17 != null) { // L: 9782
				boolean var13 = true; // L: 9783
				if (var17.contentType > 0) { // L: 9784
					var13 = EnumComposition.method3761(var17);
				}

				if (var13) { // L: 9785
					var12 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 9787
					var12.packetBuffer.writeInt(var1); // L: 9788
					Client.packetWriter.addNode(var12); // L: 9789
				}
			}
		}

		if (var2 == 2) { // L: 9793
			Client.mouseCrossX = var7; // L: 9794
			Client.mouseCrossY = var8; // L: 9795
			Client.mouseCrossColor = 2; // L: 9796
			Client.mouseCrossState = 0; // L: 9797
			Client.destinationX = var0; // L: 9798
			Client.destinationY = var1; // L: 9799
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher); // L: 9800
			var9.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 9801
			var9.packetBuffer.method9243(Client.field585); // L: 9802
			var9.packetBuffer.writeShort(class20.baseX * 64 + var0); // L: 9803
			var9.packetBuffer.method9258(JagexCache.field1841); // L: 9804
			var9.packetBuffer.method9344(var3); // L: 9805
			var9.packetBuffer.method9344(class19.baseY * 64 + var1); // L: 9806
			var9.packetBuffer.method9244(Client.field686); // L: 9807
			Client.packetWriter.addNode(var9); // L: 9808
		}

		if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9810 9811
			class174.resumePauseWidget(var1, var0); // L: 9812
			Client.meslayerContinueWidget = field184.method6241(var1, var0); // L: 9813
			ClanChannelMember.invalidateWidget(Client.meslayerContinueWidget); // L: 9814
		}

		if (var2 == 12) { // L: 9817
			var15 = Client.npcs[var3]; // L: 9818
			if (var15 != null) { // L: 9819
				Client.mouseCrossX = var7; // L: 9820
				Client.mouseCrossY = var8; // L: 9821
				Client.mouseCrossColor = 2; // L: 9822
				Client.mouseCrossState = 0; // L: 9823
				Client.destinationX = var0; // L: 9824
				Client.destinationY = var1; // L: 9825
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher); // L: 9827
				var14.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 9828
				var14.packetBuffer.writeShort(var3); // L: 9829
				Client.packetWriter.addNode(var14); // L: 9830
			}
		}

		if (var2 == 9) { // L: 9833
			var15 = Client.npcs[var3]; // L: 9834
			if (var15 != null) { // L: 9835
				Client.mouseCrossX = var7; // L: 9836
				Client.mouseCrossY = var8; // L: 9837
				Client.mouseCrossColor = 2; // L: 9838
				Client.mouseCrossState = 0; // L: 9839
				Client.destinationX = var0; // L: 9840
				Client.destinationY = var1; // L: 9841
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3203, Client.packetWriter.isaacCipher); // L: 9843
				var14.packetBuffer.method9244(var3); // L: 9844
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0); // L: 9845
				Client.packetWriter.addNode(var14); // L: 9846
			}
		}

		if (var2 == 49) { // L: 9849
			var16 = Client.players[var3]; // L: 9850
			if (var16 != null) { // L: 9851
				Client.mouseCrossX = var7; // L: 9852
				Client.mouseCrossY = var8; // L: 9853
				Client.mouseCrossColor = 2; // L: 9854
				Client.mouseCrossState = 0; // L: 9855
				Client.destinationX = var0; // L: 9856
				Client.destinationY = var1; // L: 9857
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher); // L: 9859
				var14.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 9860
				var14.packetBuffer.method9344(var3); // L: 9861
				Client.packetWriter.addNode(var14); // L: 9862
			}
		}

		if (var2 == 19) { // L: 9865
			Client.mouseCrossX = var7; // L: 9866
			Client.mouseCrossY = var8; // L: 9867
			Client.mouseCrossColor = 2; // L: 9868
			Client.mouseCrossState = 0; // L: 9869
			Client.destinationX = var0; // L: 9870
			Client.destinationY = var1; // L: 9871
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9873
			var9.packetBuffer.method9243(class20.baseX * 64 + var0); // L: 9874
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1); // L: 9875
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 9876
			var9.packetBuffer.method9244(var3); // L: 9877
			Client.packetWriter.addNode(var9); // L: 9878
		}

		if (var2 == 1002) { // L: 9880
			Client.mouseCrossX = var7; // L: 9881
			Client.mouseCrossY = var8; // L: 9882
			Client.mouseCrossColor = 2; // L: 9883
			Client.mouseCrossState = 0; // L: 9884
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher); // L: 9886
			var9.packetBuffer.method9244(var3); // L: 9887
			Client.packetWriter.addNode(var9); // L: 9888
		}

		if (var2 == 17) { // L: 9890
			Client.mouseCrossX = var7; // L: 9891
			Client.mouseCrossY = var8; // L: 9892
			Client.mouseCrossColor = 2; // L: 9893
			Client.mouseCrossState = 0; // L: 9894
			Client.destinationX = var0; // L: 9895
			Client.destinationY = var1; // L: 9896
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3228, Client.packetWriter.isaacCipher); // L: 9897
			var9.packetBuffer.method9244(var3); // L: 9898
			var9.packetBuffer.method9323(Client.field755.method4280(82) ? 1 : 0); // L: 9899
			var9.packetBuffer.writeInt(JagexCache.field1841); // L: 9900
			var9.packetBuffer.writeShort(Client.field686); // L: 9901
			var9.packetBuffer.method9243(class19.baseY * 64 + var1); // L: 9902
			var9.packetBuffer.method9243(class20.baseX * 64 + var0); // L: 9903
			var9.packetBuffer.method9344(Client.field585); // L: 9904
			Client.packetWriter.addNode(var9); // L: 9905
		}

		if (var2 == 46) { // L: 9907
			var16 = Client.players[var3]; // L: 9908
			if (var16 != null) { // L: 9909
				Client.mouseCrossX = var7; // L: 9910
				Client.mouseCrossY = var8; // L: 9911
				Client.mouseCrossColor = 2; // L: 9912
				Client.mouseCrossState = 0; // L: 9913
				Client.destinationX = var0; // L: 9914
				Client.destinationY = var1; // L: 9915
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher); // L: 9917
				var14.packetBuffer.method9244(var3); // L: 9918
				var14.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0); // L: 9919
				Client.packetWriter.addNode(var14); // L: 9920
			}
		}

		if (var2 == 3) { // L: 9923
			Client.mouseCrossX = var7; // L: 9924
			Client.mouseCrossY = var8; // L: 9925
			Client.mouseCrossColor = 2; // L: 9926
			Client.mouseCrossState = 0; // L: 9927
			Client.destinationX = var0; // L: 9928
			Client.destinationY = var1; // L: 9929
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 9931
			var9.packetBuffer.method9244(class20.baseX * 64 + var0); // L: 9932
			var9.packetBuffer.method9243(class19.baseY * 64 + var1); // L: 9933
			var9.packetBuffer.method9243(var3); // L: 9934
			var9.packetBuffer.writeByte(Client.field755.method4280(82) ? 1 : 0); // L: 9935
			Client.packetWriter.addNode(var9); // L: 9936
		}

		if (var2 == 45) { // L: 9938
			var16 = Client.players[var3]; // L: 9939
			if (var16 != null) { // L: 9940
				Client.mouseCrossX = var7; // L: 9941
				Client.mouseCrossY = var8; // L: 9942
				Client.mouseCrossColor = 2; // L: 9943
				Client.mouseCrossState = 0; // L: 9944
				Client.destinationX = var0; // L: 9945
				Client.destinationY = var1; // L: 9946
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher); // L: 9948
				var14.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 9949
				var14.packetBuffer.writeShort(var3); // L: 9950
				Client.packetWriter.addNode(var14); // L: 9951
			}
		}

		if (var2 == 10) { // L: 9954
			var15 = Client.npcs[var3]; // L: 9955
			if (var15 != null) { // L: 9956
				Client.mouseCrossX = var7; // L: 9957
				Client.mouseCrossY = var8; // L: 9958
				Client.mouseCrossColor = 2; // L: 9959
				Client.mouseCrossState = 0; // L: 9960
				Client.destinationX = var0; // L: 9961
				Client.destinationY = var1; // L: 9962
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 9964
				var14.packetBuffer.method9323(Client.field755.method4280(82) ? 1 : 0); // L: 9965
				var14.packetBuffer.method9244(var3); // L: 9966
				Client.packetWriter.addNode(var14); // L: 9967
			}
		}

		if (var2 == 1004) { // L: 9970
			Client.mouseCrossX = var7; // L: 9971
			Client.mouseCrossY = var8; // L: 9972
			Client.mouseCrossColor = 2; // L: 9973
			Client.mouseCrossState = 0; // L: 9974
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 9976
			var9.packetBuffer.writeShort(class19.baseY * 64 + var1); // L: 9977
			var9.packetBuffer.writeShort(class20.baseX * 64 + var0); // L: 9978
			var9.packetBuffer.method9244(var3); // L: 9979
			Client.packetWriter.addNode(var9); // L: 9980
		}

		if (var2 == 58) { // L: 9982
			var17 = field184.method6241(var1, var0); // L: 9983
			if (var17 != null) { // L: 9984
				if (var17.field3785 != null) { // L: 9985
					ScriptEvent var19 = new ScriptEvent(); // L: 9986
					var19.widget = var17; // L: 9987
					var19.opIndex = var3; // L: 9988
					var19.targetName = var6; // L: 9989
					var19.args = var17.field3785; // L: 9990
					Interpreter.runScriptEvent(var19); // L: 9991
				}

				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 9994
				var14.packetBuffer.method9243(Client.field585); // L: 9995
				var14.packetBuffer.writeInt(var1); // L: 9996
				var14.packetBuffer.method9244(var4); // L: 9997
				var14.packetBuffer.method9258(JagexCache.field1841); // L: 9998
				var14.packetBuffer.method9243(Client.field686); // L: 9999
				var14.packetBuffer.method9243(var0); // L: 10000
				Client.packetWriter.addNode(var14); // L: 10001
			}
		}

		if (var2 == 18) { // L: 10004
			Client.mouseCrossX = var7; // L: 10005
			Client.mouseCrossY = var8; // L: 10006
			Client.mouseCrossColor = 2; // L: 10007
			Client.mouseCrossState = 0; // L: 10008
			Client.destinationX = var0; // L: 10009
			Client.destinationY = var1; // L: 10010
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 10012
			var9.packetBuffer.method9244(class19.baseY * 64 + var1); // L: 10013
			var9.packetBuffer.method9235(Client.field755.method4280(82) ? 1 : 0); // L: 10014
			var9.packetBuffer.method9244(class20.baseX * 64 + var0); // L: 10015
			var9.packetBuffer.writeShort(var3); // L: 10016
			Client.packetWriter.addNode(var9); // L: 10017
		}

		if (var2 == 1001) { // L: 10019
			Client.mouseCrossX = var7; // L: 10020
			Client.mouseCrossY = var8; // L: 10021
			Client.mouseCrossColor = 2; // L: 10022
			Client.mouseCrossState = 0; // L: 10023
			Client.destinationX = var0; // L: 10024
			Client.destinationY = var1; // L: 10025
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher); // L: 10027
			var9.packetBuffer.writeShort(var3); // L: 10028
			var9.packetBuffer.method9244(class19.baseY * 64 + var1); // L: 10029
			var9.packetBuffer.method9244(class20.baseX * 64 + var0); // L: 10030
			var9.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 10031
			Client.packetWriter.addNode(var9); // L: 10032
		}

		if (var2 == 29) { // L: 10034
			var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 10036
			var9.packetBuffer.writeInt(var1); // L: 10037
			Client.packetWriter.addNode(var9); // L: 10038
			var10 = field184.method6240(var1); // L: 10039
			if (var10 != null && var10.cs1Instructions != null && var10.cs1Instructions[0][0] == 5) { // L: 10040
				var11 = var10.cs1Instructions[0][1]; // L: 10041
				if (Varps.Varps_main[var11] != var10.cs1ComparisonValues[0]) { // L: 10042
					Varps.Varps_main[var11] = var10.cs1ComparisonValues[0]; // L: 10043
					ScriptEvent.changeGameOptions(var11); // L: 10044
				}
			}
		}

		if (var2 == 47) { // L: 10048
			var16 = Client.players[var3]; // L: 10049
			if (var16 != null) { // L: 10050
				Client.mouseCrossX = var7; // L: 10051
				Client.mouseCrossY = var8; // L: 10052
				Client.mouseCrossColor = 2; // L: 10053
				Client.mouseCrossState = 0; // L: 10054
				Client.destinationX = var0; // L: 10055
				Client.destinationY = var1; // L: 10056
				var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 10058
				var14.packetBuffer.method9243(var3); // L: 10059
				var14.packetBuffer.method9234(Client.field755.method4280(82) ? 1 : 0); // L: 10060
				Client.packetWriter.addNode(var14); // L: 10061
			}
		}

		if (var2 == 26) { // L: 10064
			GrandExchangeOfferOwnWorldComparator.method1240(); // L: 10065
		}

		if (var2 == 25) { // L: 10067
			var17 = field184.method6241(var1, var0); // L: 10068
			if (var17 != null) { // L: 10069
				class286.method5663(); // L: 10070
				class478.method8514(var1, var0, KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var17)), var4); // L: 10071
				Client.isItemSelected = 0; // L: 10072
				Client.field751 = class155.Widget_getSpellActionName(var17); // L: 10073
				if (Client.field751 == null) { // L: 10074
					Client.field751 = "null";
				}

				if (var17.isIf3) { // L: 10075
					Client.field688 = var17.dataText + Client.colorStartTag(16777215);
				} else {
					Client.field688 = Client.colorStartTag(65280) + var17.field3806 + Client.colorStartTag(16777215); // L: 10076
				}
			}

		} else {
			if (var2 == 8) { // L: 10080
				var15 = Client.npcs[var3]; // L: 10081
				if (var15 != null) { // L: 10082
					Client.mouseCrossX = var7; // L: 10083
					Client.mouseCrossY = var8; // L: 10084
					Client.mouseCrossColor = 2; // L: 10085
					Client.mouseCrossState = 0; // L: 10086
					Client.destinationX = var0; // L: 10087
					Client.destinationY = var1; // L: 10088
					var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3229, Client.packetWriter.isaacCipher); // L: 10089
					var14.packetBuffer.method9258(JagexCache.field1841); // L: 10090
					var14.packetBuffer.method9244(Client.field686); // L: 10091
					var14.packetBuffer.method9323(Client.field755.method4280(82) ? 1 : 0); // L: 10092
					var14.packetBuffer.method9344(Client.field585); // L: 10093
					var14.packetBuffer.method9243(var3); // L: 10094
					Client.packetWriter.addNode(var14); // L: 10095
				}
			}

			if (Client.isItemSelected != 0) { // L: 10098
				Client.isItemSelected = 0; // L: 10099
				ClanChannelMember.invalidateWidget(field184.method6240(class4.field10)); // L: 10100
			}

			if (Client.isSpellSelected) { // L: 10102
				class286.method5663();
			}

		}
	} // L: 10078 10103
}
