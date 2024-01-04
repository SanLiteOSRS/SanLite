import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class407 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 719897105
	)
	int field4506;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class407(int var1, boolean var2) {
		this.field4506 = var1; // L: 7
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6521"
	)
	public int method7655() {
		return this.field4506; // L: 11
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "34"
	)
	static final void method7656(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9512
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1004) { // L: 9513
			Client.mouseCrossX = var7; // L: 9514
			Client.mouseCrossY = var8; // L: 9515
			Client.mouseCrossColor = 2; // L: 9516
			Client.mouseCrossState = 0; // L: 9517
			var9 = class113.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher); // L: 9519
			var9.packetBuffer.method9299(var3); // L: 9520
			var9.packetBuffer.writeShort(class101.baseY * 64 + var1); // L: 9521
			var9.packetBuffer.writeShort(class187.baseX * 64 + var0); // L: 9522
			Client.packetWriter.addNode(var9); // L: 9523
		}

		if (var2 == 26) { // L: 9525
			class520.method9190(); // L: 9526
		}

		if (var2 == 22) { // L: 9528
			Client.mouseCrossX = var7; // L: 9529
			Client.mouseCrossY = var8; // L: 9530
			Client.mouseCrossColor = 2; // L: 9531
			Client.mouseCrossState = 0; // L: 9532
			Client.destinationX = var0; // L: 9533
			Client.destinationY = var1; // L: 9534
			var9 = class113.getPacketBufferNode(ClientPacket.field3222, Client.packetWriter.isaacCipher); // L: 9536
			var9.packetBuffer.method9300(class101.baseY * 64 + var1); // L: 9537
			var9.packetBuffer.method9300(var3); // L: 9538
			var9.packetBuffer.method9300(class187.baseX * 64 + var0); // L: 9539
			var9.packetBuffer.method9292(Client.field724.method4316(82) ? 1 : 0); // L: 9540
			Client.packetWriter.addNode(var9); // L: 9541
		}

		Widget var18;
		if (var2 == 25) { // L: 9543
			var18 = HealthBarDefinition.field1877.method6279(var1, var0); // L: 9544
			if (var18 != null) { // L: 9545
				class53.method1111(); // L: 9546
				class416.method7830(var1, var0, WorldMapData_0.Widget_unpackTargetMask(class361.getWidgetFlags(var18)), var4); // L: 9547
				Client.isItemSelected = 0; // L: 9548
				Client.field655 = class89.Widget_getSpellActionName(var18); // L: 9549
				if (Client.field655 == null) { // L: 9550
					Client.field655 = "null";
				}

				if (var18.isIf3) { // L: 9551
					Client.field656 = var18.dataText + class167.colorStartTag(16777215);
				} else {
					Client.field656 = class167.colorStartTag(65280) + var18.field3788 + class167.colorStartTag(16777215); // L: 9552
				}
			}

		} else {
			if (var2 == 6) { // L: 9556
				Client.mouseCrossX = var7; // L: 9557
				Client.mouseCrossY = var8; // L: 9558
				Client.mouseCrossColor = 2; // L: 9559
				Client.mouseCrossState = 0; // L: 9560
				Client.destinationX = var0; // L: 9561
				Client.destinationY = var1; // L: 9562
				var9 = class113.getPacketBufferNode(ClientPacket.field3219, Client.packetWriter.isaacCipher); // L: 9564
				var9.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9565
				var9.packetBuffer.method9300(class101.baseY * 64 + var1); // L: 9566
				var9.packetBuffer.writeShort(var3); // L: 9567
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 9568
				Client.packetWriter.addNode(var9); // L: 9569
			}

			PacketBufferNode var10;
			NPC var14;
			if (var2 == 11) { // L: 9571
				var14 = Client.npcs[var3]; // L: 9572
				if (var14 != null) { // L: 9573
					Client.mouseCrossX = var7; // L: 9574
					Client.mouseCrossY = var8; // L: 9575
					Client.mouseCrossColor = 2; // L: 9576
					Client.mouseCrossState = 0; // L: 9577
					Client.destinationX = var0; // L: 9578
					Client.destinationY = var1; // L: 9579
					var10 = class113.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 9581
					var10.packetBuffer.method9300(var3); // L: 9582
					var10.packetBuffer.method9292(Client.field724.method4316(82) ? 1 : 0); // L: 9583
					Client.packetWriter.addNode(var10); // L: 9584
				}
			}

			if (var2 == 12) { // L: 9587
				var14 = Client.npcs[var3]; // L: 9588
				if (var14 != null) { // L: 9589
					Client.mouseCrossX = var7; // L: 9590
					Client.mouseCrossY = var8; // L: 9591
					Client.mouseCrossColor = 2; // L: 9592
					Client.mouseCrossState = 0; // L: 9593
					Client.destinationX = var0; // L: 9594
					Client.destinationY = var1; // L: 9595
					var10 = class113.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher); // L: 9597
					var10.packetBuffer.method9291(Client.field724.method4316(82) ? 1 : 0); // L: 9598
					var10.packetBuffer.writeShort(var3); // L: 9599
					Client.packetWriter.addNode(var10); // L: 9600
				}
			}

			Player var15;
			if (var2 == 48) { // L: 9603
				var15 = Client.players[var3]; // L: 9604
				if (var15 != null) { // L: 9605
					Client.mouseCrossX = var7; // L: 9606
					Client.mouseCrossY = var8; // L: 9607
					Client.mouseCrossColor = 2; // L: 9608
					Client.mouseCrossState = 0; // L: 9609
					Client.destinationX = var0; // L: 9610
					Client.destinationY = var1; // L: 9611
					var10 = class113.getPacketBufferNode(ClientPacket.field3224, Client.packetWriter.isaacCipher); // L: 9613
					var10.packetBuffer.method9300(var3); // L: 9614
					var10.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9615
					Client.packetWriter.addNode(var10); // L: 9616
				}
			}

			if (var2 == 3) { // L: 9619
				Client.mouseCrossX = var7; // L: 9620
				Client.mouseCrossY = var8; // L: 9621
				Client.mouseCrossColor = 2; // L: 9622
				Client.mouseCrossState = 0; // L: 9623
				Client.destinationX = var0; // L: 9624
				Client.destinationY = var1; // L: 9625
				var9 = class113.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 9627
				var9.packetBuffer.writeByte(Client.field724.method4316(82) ? 1 : 0); // L: 9628
				var9.packetBuffer.method9490(class101.baseY * 64 + var1); // L: 9629
				var9.packetBuffer.writeShort(class187.baseX * 64 + var0); // L: 9630
				var9.packetBuffer.method9299(var3); // L: 9631
				Client.packetWriter.addNode(var9); // L: 9632
			}

			if (var2 == 17) { // L: 9634
				Client.mouseCrossX = var7; // L: 9635
				Client.mouseCrossY = var8; // L: 9636
				Client.mouseCrossColor = 2; // L: 9637
				Client.mouseCrossState = 0; // L: 9638
				Client.destinationX = var0; // L: 9639
				Client.destinationY = var1; // L: 9640
				var9 = class113.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 9641
				var9.packetBuffer.method9490(class187.baseX * 64 + var0); // L: 9642
				var9.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9643
				var9.packetBuffer.method9299(class101.baseY * 64 + var1); // L: 9644
				var9.packetBuffer.writeIntME(class348.field3826); // L: 9645
				var9.packetBuffer.writeShort(Client.field534); // L: 9646
				var9.packetBuffer.writeShort(Client.field654); // L: 9647
				var9.packetBuffer.method9299(var3); // L: 9648
				Client.packetWriter.addNode(var9); // L: 9649
			}

			if (var2 == 20) { // L: 9651
				Client.mouseCrossX = var7; // L: 9652
				Client.mouseCrossY = var8; // L: 9653
				Client.mouseCrossColor = 2; // L: 9654
				Client.mouseCrossState = 0; // L: 9655
				Client.destinationX = var0; // L: 9656
				Client.destinationY = var1; // L: 9657
				var9 = class113.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 9659
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 9660
				var9.packetBuffer.writeShort(class101.baseY * 64 + var1); // L: 9661
				var9.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9662
				var9.packetBuffer.writeShort(var3); // L: 9663
				Client.packetWriter.addNode(var9); // L: 9664
			}

			if (var2 == 51) { // L: 9666
				var15 = Client.players[var3]; // L: 9667
				if (var15 != null) { // L: 9668
					Client.mouseCrossX = var7; // L: 9669
					Client.mouseCrossY = var8; // L: 9670
					Client.mouseCrossColor = 2; // L: 9671
					Client.mouseCrossState = 0; // L: 9672
					Client.destinationX = var0; // L: 9673
					Client.destinationY = var1; // L: 9674
					var10 = class113.getPacketBufferNode(ClientPacket.field3220, Client.packetWriter.isaacCipher); // L: 9676
					var10.packetBuffer.writeByte(Client.field724.method4316(82) ? 1 : 0); // L: 9677
					var10.packetBuffer.method9490(var3); // L: 9678
					Client.packetWriter.addNode(var10); // L: 9679
				}
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9682 9683
				class10.resumePauseWidget(var1, var0); // L: 9684
				Client.meslayerContinueWidget = HealthBarDefinition.field1877.method6279(var1, var0); // L: 9685
				class159.invalidateWidget(Client.meslayerContinueWidget); // L: 9686
			}

			if (var2 == 21) { // L: 9689
				Client.mouseCrossX = var7; // L: 9690
				Client.mouseCrossY = var8; // L: 9691
				Client.mouseCrossColor = 2; // L: 9692
				Client.mouseCrossState = 0; // L: 9693
				Client.destinationX = var0; // L: 9694
				Client.destinationY = var1; // L: 9695
				var9 = class113.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 9697
				var9.packetBuffer.method9300(class101.baseY * 64 + var1); // L: 9698
				var9.packetBuffer.writeShort(var3); // L: 9699
				var9.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9700
				var9.packetBuffer.method9300(class187.baseX * 64 + var0); // L: 9701
				Client.packetWriter.addNode(var9); // L: 9702
			}

			if (var2 == 50) { // L: 9704
				var15 = Client.players[var3]; // L: 9705
				if (var15 != null) { // L: 9706
					Client.mouseCrossX = var7; // L: 9707
					Client.mouseCrossY = var8; // L: 9708
					Client.mouseCrossColor = 2; // L: 9709
					Client.mouseCrossState = 0; // L: 9710
					Client.destinationX = var0; // L: 9711
					Client.destinationY = var1; // L: 9712
					var10 = class113.getPacketBufferNode(ClientPacket.field3149, Client.packetWriter.isaacCipher); // L: 9714
					var10.packetBuffer.method9490(var3); // L: 9715
					var10.packetBuffer.method9292(Client.field724.method4316(82) ? 1 : 0); // L: 9716
					Client.packetWriter.addNode(var10); // L: 9717
				}
			}

			if (var2 == 57 || var2 == 1007) { // L: 9720
				var18 = HealthBarDefinition.field1877.method6279(var1, var0); // L: 9721
				if (var18 != null) { // L: 9722
					FloorOverlayDefinition.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9723
				}
			}

			int var11;
			Widget var16;
			if (var2 == 28) { // L: 9726
				var9 = class113.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 9728
				var9.packetBuffer.writeInt(var1); // L: 9729
				Client.packetWriter.addNode(var9); // L: 9730
				var16 = HealthBarDefinition.field1877.method6285(var1); // L: 9731
				if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 9732
					var11 = var16.cs1Instructions[0][1]; // L: 9733
					Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9734
					Projectile.changeGameOptions(var11); // L: 9735
				}
			}

			PacketBufferNode var13;
			if (var2 == 24) { // L: 9738
				var18 = HealthBarDefinition.field1877.method6285(var1); // L: 9739
				if (var18 != null) { // L: 9740
					boolean var12 = true; // L: 9741
					if (var18.contentType > 0) { // L: 9742
						var12 = class101.method2724(var18);
					}

					if (var12) { // L: 9743
						var13 = class113.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 9745
						var13.packetBuffer.writeInt(var1); // L: 9746
						Client.packetWriter.addNode(var13); // L: 9747
					}
				}
			}

			if (var2 == 47) { // L: 9751
				var15 = Client.players[var3]; // L: 9752
				if (var15 != null) { // L: 9753
					Client.mouseCrossX = var7; // L: 9754
					Client.mouseCrossY = var8; // L: 9755
					Client.mouseCrossColor = 2; // L: 9756
					Client.mouseCrossState = 0; // L: 9757
					Client.destinationX = var0; // L: 9758
					Client.destinationY = var1; // L: 9759
					var10 = class113.getPacketBufferNode(ClientPacket.field3217, Client.packetWriter.isaacCipher); // L: 9761
					var10.packetBuffer.method9292(Client.field724.method4316(82) ? 1 : 0); // L: 9762
					var10.packetBuffer.method9300(var3); // L: 9763
					Client.packetWriter.addNode(var10); // L: 9764
				}
			}

			if (var2 == 2) { // L: 9767
				Client.mouseCrossX = var7; // L: 9768
				Client.mouseCrossY = var8; // L: 9769
				Client.mouseCrossColor = 2; // L: 9770
				Client.mouseCrossState = 0; // L: 9771
				Client.destinationX = var0; // L: 9772
				Client.destinationY = var1; // L: 9773
				var9 = class113.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher); // L: 9774
				var9.packetBuffer.method9299(var3); // L: 9775
				var9.packetBuffer.method9300(Client.field654); // L: 9776
				var9.packetBuffer.writeShort(Client.field534); // L: 9777
				var9.packetBuffer.method9490(class101.baseY * 64 + var1); // L: 9778
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 9779
				var9.packetBuffer.method9311(class348.field3826); // L: 9780
				var9.packetBuffer.writeByte(Client.field724.method4316(82) ? 1 : 0); // L: 9781
				Client.packetWriter.addNode(var9); // L: 9782
			}

			if (var2 == 1002) { // L: 9784
				Client.mouseCrossX = var7; // L: 9785
				Client.mouseCrossY = var8; // L: 9786
				Client.mouseCrossColor = 2; // L: 9787
				Client.mouseCrossState = 0; // L: 9788
				var9 = class113.getPacketBufferNode(ClientPacket.field3215, Client.packetWriter.isaacCipher); // L: 9790
				var9.packetBuffer.method9300(var3); // L: 9791
				Client.packetWriter.addNode(var9); // L: 9792
			}

			if (var2 == 8) { // L: 9794
				var14 = Client.npcs[var3]; // L: 9795
				if (var14 != null) { // L: 9796
					Client.mouseCrossX = var7; // L: 9797
					Client.mouseCrossY = var8; // L: 9798
					Client.mouseCrossColor = 2; // L: 9799
					Client.mouseCrossState = 0; // L: 9800
					Client.destinationX = var0; // L: 9801
					Client.destinationY = var1; // L: 9802
					var10 = class113.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 9803
					var10.packetBuffer.writeInt(class348.field3826); // L: 9804
					var10.packetBuffer.method9490(var3); // L: 9805
					var10.packetBuffer.method9291(Client.field724.method4316(82) ? 1 : 0); // L: 9806
					var10.packetBuffer.writeShort(Client.field534); // L: 9807
					var10.packetBuffer.method9299(Client.field654); // L: 9808
					Client.packetWriter.addNode(var10); // L: 9809
				}
			}

			if (var2 == 58) { // L: 9812
				var18 = HealthBarDefinition.field1877.method6279(var1, var0); // L: 9813
				if (var18 != null) { // L: 9814
					if (var18.field3648 != null) { // L: 9815
						ScriptEvent var17 = new ScriptEvent(); // L: 9816
						var17.widget = var18; // L: 9817
						var17.opIndex = var3; // L: 9818
						var17.targetName = var6; // L: 9819
						var17.args = var18.field3648; // L: 9820
						class157.runScriptEvent(var17); // L: 9821
					}

					var10 = class113.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 9824
					var10.packetBuffer.method9316(class348.field3826); // L: 9825
					var10.packetBuffer.method9299(var0); // L: 9826
					var10.packetBuffer.method9299(Client.field534); // L: 9827
					var10.packetBuffer.writeIntME(var1); // L: 9828
					var10.packetBuffer.method9299(var4); // L: 9829
					var10.packetBuffer.method9300(Client.field654); // L: 9830
					Client.packetWriter.addNode(var10); // L: 9831
				}
			}

			if (var2 == 16) { // L: 9834
				Client.mouseCrossX = var7; // L: 9835
				Client.mouseCrossY = var8; // L: 9836
				Client.mouseCrossColor = 2; // L: 9837
				Client.mouseCrossState = 0; // L: 9838
				Client.destinationX = var0; // L: 9839
				Client.destinationY = var1; // L: 9840
				var9 = class113.getPacketBufferNode(ClientPacket.field3170, Client.packetWriter.isaacCipher); // L: 9842
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 9843
				var9.packetBuffer.writeByte(Client.field724.method4316(82) ? 1 : 0); // L: 9844
				var9.packetBuffer.method9299(class59.field414); // L: 9845
				var9.packetBuffer.method9300(var3); // L: 9846
				var9.packetBuffer.method9300(class221.field2343); // L: 9847
				var9.packetBuffer.writeShort(class101.baseY * 64 + var1); // L: 9848
				var9.packetBuffer.writeInt(class195.field2021); // L: 9849
				Client.packetWriter.addNode(var9); // L: 9850
			}

			if (var2 == 1001) { // L: 9852
				Client.mouseCrossX = var7; // L: 9853
				Client.mouseCrossY = var8; // L: 9854
				Client.mouseCrossColor = 2; // L: 9855
				Client.mouseCrossState = 0; // L: 9856
				Client.destinationX = var0; // L: 9857
				Client.destinationY = var1; // L: 9858
				var9 = class113.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 9860
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 9861
				var9.packetBuffer.method9299(class101.baseY * 64 + var1); // L: 9862
				var9.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9863
				var9.packetBuffer.method9299(var3); // L: 9864
				Client.packetWriter.addNode(var9); // L: 9865
			}

			if (var2 == 10) { // L: 9867
				var14 = Client.npcs[var3]; // L: 9868
				if (var14 != null) { // L: 9869
					Client.mouseCrossX = var7; // L: 9870
					Client.mouseCrossY = var8; // L: 9871
					Client.mouseCrossColor = 2; // L: 9872
					Client.mouseCrossState = 0; // L: 9873
					Client.destinationX = var0; // L: 9874
					Client.destinationY = var1; // L: 9875
					var10 = class113.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 9877
					var10.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9878
					var10.packetBuffer.method9490(var3); // L: 9879
					Client.packetWriter.addNode(var10); // L: 9880
				}
			}

			if (var2 == 9) { // L: 9883
				var14 = Client.npcs[var3]; // L: 9884
				if (var14 != null) { // L: 9885
					Client.mouseCrossX = var7; // L: 9886
					Client.mouseCrossY = var8; // L: 9887
					Client.mouseCrossColor = 2; // L: 9888
					Client.mouseCrossState = 0; // L: 9889
					Client.destinationX = var0; // L: 9890
					Client.destinationY = var1; // L: 9891
					var10 = class113.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher); // L: 9893
					var10.packetBuffer.writeShort(var3); // L: 9894
					var10.packetBuffer.method9291(Client.field724.method4316(82) ? 1 : 0); // L: 9895
					Client.packetWriter.addNode(var10); // L: 9896
				}
			}

			if (var2 == 15) { // L: 9899
				var15 = Client.players[var3]; // L: 9900
				if (var15 != null) { // L: 9901
					Client.mouseCrossX = var7; // L: 9902
					Client.mouseCrossY = var8; // L: 9903
					Client.mouseCrossColor = 2; // L: 9904
					Client.mouseCrossState = 0; // L: 9905
					Client.destinationX = var0; // L: 9906
					Client.destinationY = var1; // L: 9907
					var10 = class113.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 9908
					var10.packetBuffer.method9291(Client.field724.method4316(82) ? 1 : 0); // L: 9909
					var10.packetBuffer.method9300(Client.field654); // L: 9910
					var10.packetBuffer.method9490(var3); // L: 9911
					var10.packetBuffer.method9299(Client.field534); // L: 9912
					var10.packetBuffer.writeIntME(class348.field3826); // L: 9913
					Client.packetWriter.addNode(var10); // L: 9914
				}
			}

			if (var2 == 1) { // L: 9917
				Client.mouseCrossX = var7; // L: 9918
				Client.mouseCrossY = var8; // L: 9919
				Client.mouseCrossColor = 2; // L: 9920
				Client.mouseCrossState = 0; // L: 9921
				Client.destinationX = var0; // L: 9922
				Client.destinationY = var1; // L: 9923
				var9 = class113.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 9925
				var9.packetBuffer.writeIntME(class195.field2021); // L: 9926
				var9.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 9927
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 9928
				var9.packetBuffer.method9490(class221.field2343); // L: 9929
				var9.packetBuffer.method9299(var3); // L: 9930
				var9.packetBuffer.method9490(class59.field414); // L: 9931
				var9.packetBuffer.method9299(class101.baseY * 64 + var1); // L: 9932
				Client.packetWriter.addNode(var9); // L: 9933
			}

			if (var2 == 1003) { // L: 9935
				Client.mouseCrossX = var7; // L: 9936
				Client.mouseCrossY = var8; // L: 9937
				Client.mouseCrossColor = 2; // L: 9938
				Client.mouseCrossState = 0; // L: 9939
				var14 = Client.npcs[var3]; // L: 9940
				if (var14 != null) { // L: 9941
					NPCComposition var19 = var14.definition; // L: 9942
					if (var19.transforms != null) { // L: 9943
						var19 = var19.transform();
					}

					if (var19 != null) { // L: 9944
						var13 = class113.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 9946
						var13.packetBuffer.method9300(var19.id); // L: 9947
						Client.packetWriter.addNode(var13); // L: 9948
					}
				}
			}

			if (var2 == 4) { // L: 9952
				Client.mouseCrossX = var7; // L: 9953
				Client.mouseCrossY = var8; // L: 9954
				Client.mouseCrossColor = 2; // L: 9955
				Client.mouseCrossState = 0; // L: 9956
				Client.destinationX = var0; // L: 9957
				Client.destinationY = var1; // L: 9958
				var9 = class113.getPacketBufferNode(ClientPacket.field3205, Client.packetWriter.isaacCipher); // L: 9960
				var9.packetBuffer.writeShort(class101.baseY * 64 + var1); // L: 9961
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 9962
				var9.packetBuffer.method9292(Client.field724.method4316(82) ? 1 : 0); // L: 9963
				var9.packetBuffer.writeShort(var3); // L: 9964
				Client.packetWriter.addNode(var9); // L: 9965
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9967
				class187.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9968
			}

			if (var2 == 49) { // L: 9970
				var15 = Client.players[var3]; // L: 9971
				if (var15 != null) { // L: 9972
					Client.mouseCrossX = var7; // L: 9973
					Client.mouseCrossY = var8; // L: 9974
					Client.mouseCrossColor = 2; // L: 9975
					Client.mouseCrossState = 0; // L: 9976
					Client.destinationX = var0; // L: 9977
					Client.destinationY = var1; // L: 9978
					var10 = class113.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 9980
					var10.packetBuffer.method9292(Client.field724.method4316(82) ? 1 : 0); // L: 9981
					var10.packetBuffer.writeShort(var3); // L: 9982
					Client.packetWriter.addNode(var10); // L: 9983
				}
			}

			if (var2 == 23) { // L: 9986
				if (Client.isMenuOpen) { // L: 9987
					class36.scene.setViewportWalking(); // L: 9988
				} else {
					class36.scene.menuOpen(ItemLayer.Client_plane, var0, var1, true); // L: 9991
				}
			}

			if (var2 == 44) { // L: 9994
				var15 = Client.players[var3]; // L: 9995
				if (var15 != null) { // L: 9996
					Client.mouseCrossX = var7; // L: 9997
					Client.mouseCrossY = var8; // L: 9998
					Client.mouseCrossColor = 2; // L: 9999
					Client.mouseCrossState = 0; // L: 10000
					Client.destinationX = var0; // L: 10001
					Client.destinationY = var1; // L: 10002
					var10 = class113.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 10004
					var10.packetBuffer.writeShort(var3); // L: 10005
					var10.packetBuffer.method9291(Client.field724.method4316(82) ? 1 : 0); // L: 10006
					Client.packetWriter.addNode(var10); // L: 10007
				}
			}

			if (var2 == 45) { // L: 10010
				var15 = Client.players[var3]; // L: 10011
				if (var15 != null) { // L: 10012
					Client.mouseCrossX = var7; // L: 10013
					Client.mouseCrossY = var8; // L: 10014
					Client.mouseCrossColor = 2; // L: 10015
					Client.mouseCrossState = 0; // L: 10016
					Client.destinationX = var0; // L: 10017
					Client.destinationY = var1; // L: 10018
					var10 = class113.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 10020
					var10.packetBuffer.method9291(Client.field724.method4316(82) ? 1 : 0); // L: 10021
					var10.packetBuffer.method9299(var3); // L: 10022
					Client.packetWriter.addNode(var10); // L: 10023
				}
			}

			if (var2 == 7) { // L: 10026
				var14 = Client.npcs[var3]; // L: 10027
				if (var14 != null) { // L: 10028
					Client.mouseCrossX = var7; // L: 10029
					Client.mouseCrossY = var8; // L: 10030
					Client.mouseCrossColor = 2; // L: 10031
					Client.mouseCrossState = 0; // L: 10032
					Client.destinationX = var0; // L: 10033
					Client.destinationY = var1; // L: 10034
					var10 = class113.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 10036
					var10.packetBuffer.method9300(var3); // L: 10037
					var10.packetBuffer.writeShort(class59.field414); // L: 10038
					var10.packetBuffer.writeByte(Client.field724.method4316(82) ? 1 : 0); // L: 10039
					var10.packetBuffer.method9311(class195.field2021); // L: 10040
					var10.packetBuffer.writeShort(class221.field2343); // L: 10041
					Client.packetWriter.addNode(var10); // L: 10042
				}
			}

			if (var2 == 29) { // L: 10045
				var9 = class113.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 10047
				var9.packetBuffer.writeInt(var1); // L: 10048
				Client.packetWriter.addNode(var9); // L: 10049
				var16 = HealthBarDefinition.field1877.method6285(var1); // L: 10050
				if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) { // L: 10051
					var11 = var16.cs1Instructions[0][1]; // L: 10052
					if (Varps.Varps_main[var11] != var16.cs1ComparisonValues[0]) { // L: 10053
						Varps.Varps_main[var11] = var16.cs1ComparisonValues[0]; // L: 10054
						Projectile.changeGameOptions(var11); // L: 10055
					}
				}
			}

			if (var2 == 13) { // L: 10059
				var14 = Client.npcs[var3]; // L: 10060
				if (var14 != null) { // L: 10061
					Client.mouseCrossX = var7; // L: 10062
					Client.mouseCrossY = var8; // L: 10063
					Client.mouseCrossColor = 2; // L: 10064
					Client.mouseCrossState = 0; // L: 10065
					Client.destinationX = var0; // L: 10066
					Client.destinationY = var1; // L: 10067
					var10 = class113.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 10069
					var10.packetBuffer.method9292(Client.field724.method4316(82) ? 1 : 0); // L: 10070
					var10.packetBuffer.writeShort(var3); // L: 10071
					Client.packetWriter.addNode(var10); // L: 10072
				}
			}

			if (var2 == 19) { // L: 10075
				Client.mouseCrossX = var7; // L: 10076
				Client.mouseCrossY = var8; // L: 10077
				Client.mouseCrossColor = 2; // L: 10078
				Client.mouseCrossState = 0; // L: 10079
				Client.destinationX = var0; // L: 10080
				Client.destinationY = var1; // L: 10081
				var9 = class113.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 10083
				var9.packetBuffer.writeByte(Client.field724.method4316(82) ? 1 : 0); // L: 10084
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 10085
				var9.packetBuffer.method9300(class101.baseY * 64 + var1); // L: 10086
				var9.packetBuffer.method9490(var3); // L: 10087
				Client.packetWriter.addNode(var9); // L: 10088
			}

			if (var2 == 14) { // L: 10090
				var15 = Client.players[var3]; // L: 10091
				if (var15 != null) { // L: 10092
					Client.mouseCrossX = var7; // L: 10093
					Client.mouseCrossY = var8; // L: 10094
					Client.mouseCrossColor = 2; // L: 10095
					Client.mouseCrossState = 0; // L: 10096
					Client.destinationX = var0; // L: 10097
					Client.destinationY = var1; // L: 10098
					var10 = class113.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 10100
					var10.packetBuffer.writeShort(class221.field2343); // L: 10101
					var10.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 10102
					var10.packetBuffer.method9490(class59.field414); // L: 10103
					var10.packetBuffer.method9490(var3); // L: 10104
					var10.packetBuffer.writeInt(class195.field2021); // L: 10105
					Client.packetWriter.addNode(var10); // L: 10106
				}
			}

			if (var2 == 5) { // L: 10109
				Client.mouseCrossX = var7; // L: 10110
				Client.mouseCrossY = var8; // L: 10111
				Client.mouseCrossColor = 2; // L: 10112
				Client.mouseCrossState = 0; // L: 10113
				Client.destinationX = var0; // L: 10114
				Client.destinationY = var1; // L: 10115
				var9 = class113.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 10117
				var9.packetBuffer.method9291(Client.field724.method4316(82) ? 1 : 0); // L: 10118
				var9.packetBuffer.method9300(class101.baseY * 64 + var1); // L: 10119
				var9.packetBuffer.method9299(class187.baseX * 64 + var0); // L: 10120
				var9.packetBuffer.method9299(var3); // L: 10121
				Client.packetWriter.addNode(var9); // L: 10122
			}

			if (var2 == 18) { // L: 10124
				Client.mouseCrossX = var7; // L: 10125
				Client.mouseCrossY = var8; // L: 10126
				Client.mouseCrossColor = 2; // L: 10127
				Client.mouseCrossState = 0; // L: 10128
				Client.destinationX = var0; // L: 10129
				Client.destinationY = var1; // L: 10130
				var9 = class113.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 10132
				var9.packetBuffer.writeShort(class101.baseY * 64 + var1); // L: 10133
				var9.packetBuffer.writeShort(class187.baseX * 64 + var0); // L: 10134
				var9.packetBuffer.method9490(var3); // L: 10135
				var9.packetBuffer.method9290(Client.field724.method4316(82) ? 1 : 0); // L: 10136
				Client.packetWriter.addNode(var9); // L: 10137
			}

			if (var2 == 46) { // L: 10139
				var15 = Client.players[var3]; // L: 10140
				if (var15 != null) { // L: 10141
					Client.mouseCrossX = var7; // L: 10142
					Client.mouseCrossY = var8; // L: 10143
					Client.mouseCrossColor = 2; // L: 10144
					Client.mouseCrossState = 0; // L: 10145
					Client.destinationX = var0; // L: 10146
					Client.destinationY = var1; // L: 10147
					var10 = class113.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 10149
					var10.packetBuffer.writeByte(Client.field724.method4316(82) ? 1 : 0); // L: 10150
					var10.packetBuffer.writeShort(var3); // L: 10151
					Client.packetWriter.addNode(var10); // L: 10152
				}
			}

			if (Client.isItemSelected != 0) { // L: 10155
				Client.isItemSelected = 0; // L: 10156
				class159.invalidateWidget(HealthBarDefinition.field1877.method6285(class195.field2021)); // L: 10157
			}

			if (Client.isSpellSelected) { // L: 10159
				class53.method1111();
			}

		}
	} // L: 9554 10160
}
