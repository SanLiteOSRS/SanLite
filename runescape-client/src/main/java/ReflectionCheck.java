import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 808189433
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1434409415
	)
	@Export("size")
	int size;
	@ObfuscatedName("al")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ai")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ar")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("as")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aa")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("az")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-1"
	)
	static final void method661(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9398
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1001) { // L: 9399
			Client.mouseCrossX = var7; // L: 9400
			Client.mouseCrossY = var8; // L: 9401
			Client.mouseCrossColor = 2; // L: 9402
			Client.mouseCrossState = 0; // L: 9403
			Client.destinationX = var0; // L: 9404
			Client.destinationY = var1; // L: 9405
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3221, Client.packetWriter.isaacCipher); // L: 9407
			var9.packetBuffer.writeIntME(GameEngine.baseY * 8 + var1); // L: 9408
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0); // L: 9409
			var9.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9410
			var9.packetBuffer.writeIntME(var3); // L: 9411
			Client.packetWriter.addNode(var9); // L: 9412
		}

		Widget var14;
		PacketBufferNode var15;
		if (var2 == 58) { // L: 9414
			var14 = ArchiveLoader.field1070.method6433(var1, var0); // L: 9415
			if (var14 != null) { // L: 9416
				if (var14.field3833 != null) { // L: 9417
					ScriptEvent var10 = new ScriptEvent(); // L: 9418
					var10.widget = var14; // L: 9419
					var10.opIndex = var3; // L: 9420
					var10.targetName = var6; // L: 9421
					var10.args = var14.field3833; // L: 9422
					class177.runScriptEvent(var10); // L: 9423
				}

				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3230, Client.packetWriter.isaacCipher); // L: 9426
				var15.packetBuffer.method9677(class160.field1778); // L: 9427
				var15.packetBuffer.method9508(Client.field538); // L: 9428
				var15.packetBuffer.writeIntME(var0); // L: 9429
				var15.packetBuffer.writeInt(var1); // L: 9430
				var15.packetBuffer.writeIntME(Client.field695); // L: 9431
				var15.packetBuffer.writeShort(var4); // L: 9432
				Client.packetWriter.addNode(var15); // L: 9433
			}
		}

		if (var2 == 22) { // L: 9436
			Client.mouseCrossX = var7; // L: 9437
			Client.mouseCrossY = var8; // L: 9438
			Client.mouseCrossColor = 2; // L: 9439
			Client.mouseCrossState = 0; // L: 9440
			Client.destinationX = var0; // L: 9441
			Client.destinationY = var1; // L: 9442
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 9444
			var9.packetBuffer.method9540(Client.field792.method4466(82) ? 1 : 0); // L: 9445
			var9.packetBuffer.writeShort(GameEngine.baseY * 8 + var1); // L: 9446
			var9.packetBuffer.method9508(var3); // L: 9447
			var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 9448
			Client.packetWriter.addNode(var9); // L: 9449
		}

		if (var2 == 20) { // L: 9451
			Client.mouseCrossX = var7; // L: 9452
			Client.mouseCrossY = var8; // L: 9453
			Client.mouseCrossColor = 2; // L: 9454
			Client.mouseCrossState = 0; // L: 9455
			Client.destinationX = var0; // L: 9456
			Client.destinationY = var1; // L: 9457
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3241, Client.packetWriter.isaacCipher); // L: 9459
			var9.packetBuffer.method9508(GameEngine.baseY * 8 + var1); // L: 9460
			var9.packetBuffer.writeShort(var3); // L: 9461
			var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 9462
			var9.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9463
			Client.packetWriter.addNode(var9); // L: 9464
		}

		PacketBufferNode var11;
		NPC var16;
		if (var2 == 1003) { // L: 9466
			Client.mouseCrossX = var7; // L: 9467
			Client.mouseCrossY = var8; // L: 9468
			Client.mouseCrossColor = 2; // L: 9469
			Client.mouseCrossState = 0; // L: 9470
			var16 = Client.npcs[var3]; // L: 9471
			if (var16 != null) { // L: 9472
				NPCComposition var17 = var16.definition; // L: 9473
				if (var17.transforms != null) { // L: 9474
					var17 = var17.transform();
				}

				if (var17 != null) { // L: 9475
					var11 = ViewportMouse.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 9477
					var11.packetBuffer.writeShort(var17.id); // L: 9478
					Client.packetWriter.addNode(var11); // L: 9479
				}
			}
		}

		if (var2 == 3) { // L: 9483
			Client.mouseCrossX = var7; // L: 9484
			Client.mouseCrossY = var8; // L: 9485
			Client.mouseCrossColor = 2; // L: 9486
			Client.mouseCrossState = 0; // L: 9487
			Client.destinationX = var0; // L: 9488
			Client.destinationY = var1; // L: 9489
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9491
			var9.packetBuffer.writeShort(var3); // L: 9492
			var9.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9493
			var9.packetBuffer.method9508(GameEngine.baseY * 8 + var1); // L: 9494
			var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 9495
			Client.packetWriter.addNode(var9); // L: 9496
		}

		if (var2 == 16) { // L: 9498
			Client.mouseCrossX = var7; // L: 9499
			Client.mouseCrossY = var8; // L: 9500
			Client.mouseCrossColor = 2; // L: 9501
			Client.mouseCrossState = 0; // L: 9502
			Client.destinationX = var0; // L: 9503
			Client.destinationY = var1; // L: 9504
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3258, Client.packetWriter.isaacCipher); // L: 9506
			var9.packetBuffer.method9540(Client.field792.method4466(82) ? 1 : 0); // L: 9507
			var9.packetBuffer.method9508(class128.field1513); // L: 9508
			var9.packetBuffer.method9525(class324.field3537); // L: 9509
			var9.packetBuffer.method9548(class422.field4618); // L: 9510
			var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 9511
			var9.packetBuffer.method9548(var3); // L: 9512
			var9.packetBuffer.writeShort(GameEngine.baseY * 8 + var1); // L: 9513
			Client.packetWriter.addNode(var9); // L: 9514
		}

		if (var2 == 21) { // L: 9516
			Client.mouseCrossX = var7; // L: 9517
			Client.mouseCrossY = var8; // L: 9518
			Client.mouseCrossColor = 2; // L: 9519
			Client.mouseCrossState = 0; // L: 9520
			Client.destinationX = var0; // L: 9521
			Client.destinationY = var1; // L: 9522
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher); // L: 9524
			var9.packetBuffer.method9508(var3); // L: 9525
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0); // L: 9526
			var9.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0); // L: 9527
			var9.packetBuffer.writeShort(GameEngine.baseY * 8 + var1); // L: 9528
			Client.packetWriter.addNode(var9); // L: 9529
		}

		if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9531 9532
			class192.resumePauseWidget(var1, var0); // L: 9533
			Client.meslayerContinueWidget = ArchiveLoader.field1070.method6433(var1, var0); // L: 9534
			UserComparator5.invalidateWidget(Client.meslayerContinueWidget); // L: 9535
		}

		if (var2 == 4) { // L: 9538
			Client.mouseCrossX = var7; // L: 9539
			Client.mouseCrossY = var8; // L: 9540
			Client.mouseCrossColor = 2; // L: 9541
			Client.mouseCrossState = 0; // L: 9542
			Client.destinationX = var0; // L: 9543
			Client.destinationY = var1; // L: 9544
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3216, Client.packetWriter.isaacCipher); // L: 9546
			var9.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9547
			var9.packetBuffer.method9548(Projectile.baseX * 64 + var0); // L: 9548
			var9.packetBuffer.method9548(GameEngine.baseY * 8 + var1); // L: 9549
			var9.packetBuffer.writeIntME(var3); // L: 9550
			Client.packetWriter.addNode(var9); // L: 9551
		}

		if (var2 == 17) { // L: 9553
			Client.mouseCrossX = var7; // L: 9554
			Client.mouseCrossY = var8; // L: 9555
			Client.mouseCrossColor = 2; // L: 9556
			Client.mouseCrossState = 0; // L: 9557
			Client.destinationX = var0; // L: 9558
			Client.destinationY = var1; // L: 9559
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3253, Client.packetWriter.isaacCipher); // L: 9560
			var9.packetBuffer.writeIntME(var3); // L: 9561
			var9.packetBuffer.method9548(Projectile.baseX * 64 + var0); // L: 9562
			var9.packetBuffer.method9508(Client.field695); // L: 9563
			var9.packetBuffer.writeShort(GameEngine.baseY * 8 + var1); // L: 9564
			var9.packetBuffer.writeIntME(Client.field538); // L: 9565
			var9.packetBuffer.method9528(class160.field1778); // L: 9566
			var9.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9567
			Client.packetWriter.addNode(var9); // L: 9568
		}

		Player var18;
		if (var2 == 15) { // L: 9570
			var18 = Client.players[var3]; // L: 9571
			if (var18 != null) { // L: 9572
				Client.mouseCrossX = var7; // L: 9573
				Client.mouseCrossY = var8; // L: 9574
				Client.mouseCrossColor = 2; // L: 9575
				Client.mouseCrossState = 0; // L: 9576
				Client.destinationX = var0; // L: 9577
				Client.destinationY = var1; // L: 9578
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3219, Client.packetWriter.isaacCipher); // L: 9579
				var15.packetBuffer.method9528(class160.field1778); // L: 9580
				var15.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9581
				var15.packetBuffer.writeIntME(Client.field695); // L: 9582
				var15.packetBuffer.writeIntME(var3); // L: 9583
				var15.packetBuffer.writeShort(Client.field538); // L: 9584
				Client.packetWriter.addNode(var15); // L: 9585
			}
		}

		if (var2 == 9) { // L: 9588
			var16 = Client.npcs[var3]; // L: 9589
			if (var16 != null) { // L: 9590
				Client.mouseCrossX = var7; // L: 9591
				Client.mouseCrossY = var8; // L: 9592
				Client.mouseCrossColor = 2; // L: 9593
				Client.mouseCrossState = 0; // L: 9594
				Client.destinationX = var0; // L: 9595
				Client.destinationY = var1; // L: 9596
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3214, Client.packetWriter.isaacCipher); // L: 9598
				var15.packetBuffer.writeIntME(var3); // L: 9599
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9600
				Client.packetWriter.addNode(var15); // L: 9601
			}
		}

		if (var2 == 6) { // L: 9604
			Client.mouseCrossX = var7; // L: 9605
			Client.mouseCrossY = var8; // L: 9606
			Client.mouseCrossColor = 2; // L: 9607
			Client.mouseCrossState = 0; // L: 9608
			Client.destinationX = var0; // L: 9609
			Client.destinationY = var1; // L: 9610
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3266, Client.packetWriter.isaacCipher); // L: 9612
			var9.packetBuffer.method9548(GameEngine.baseY * 8 + var1); // L: 9613
			var9.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9614
			var9.packetBuffer.writeShort(var3); // L: 9615
			var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 9616
			Client.packetWriter.addNode(var9); // L: 9617
		}

		if (var2 == 49) { // L: 9619
			var18 = Client.players[var3]; // L: 9620
			if (var18 != null) { // L: 9621
				Client.mouseCrossX = var7; // L: 9622
				Client.mouseCrossY = var8; // L: 9623
				Client.mouseCrossColor = 2; // L: 9624
				Client.mouseCrossState = 0; // L: 9625
				Client.destinationX = var0; // L: 9626
				Client.destinationY = var1; // L: 9627
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3247, Client.packetWriter.isaacCipher); // L: 9629
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9630
				var15.packetBuffer.method9508(var3); // L: 9631
				Client.packetWriter.addNode(var15); // L: 9632
			}
		}

		if (var2 == 13) { // L: 9635
			var16 = Client.npcs[var3]; // L: 9636
			if (var16 != null) { // L: 9637
				Client.mouseCrossX = var7; // L: 9638
				Client.mouseCrossY = var8; // L: 9639
				Client.mouseCrossColor = 2; // L: 9640
				Client.mouseCrossState = 0; // L: 9641
				Client.destinationX = var0; // L: 9642
				Client.destinationY = var1; // L: 9643
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3231, Client.packetWriter.isaacCipher); // L: 9645
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9646
				var15.packetBuffer.method9508(var3); // L: 9647
				Client.packetWriter.addNode(var15); // L: 9648
			}
		}

		if (var2 == 1002) { // L: 9651
			Client.mouseCrossX = var7; // L: 9652
			Client.mouseCrossY = var8; // L: 9653
			Client.mouseCrossColor = 2; // L: 9654
			Client.mouseCrossState = 0; // L: 9655
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 9657
			var9.packetBuffer.writeIntME(var3); // L: 9658
			Client.packetWriter.addNode(var9); // L: 9659
		}

		if (var2 == 1004) { // L: 9661
			Client.mouseCrossX = var7; // L: 9662
			Client.mouseCrossY = var8; // L: 9663
			Client.mouseCrossColor = 2; // L: 9664
			Client.mouseCrossState = 0; // L: 9665
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3270, Client.packetWriter.isaacCipher); // L: 9667
			var9.packetBuffer.writeIntME(var3); // L: 9668
			var9.packetBuffer.method9548(GameEngine.baseY * 8 + var1); // L: 9669
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0); // L: 9670
			Client.packetWriter.addNode(var9); // L: 9671
		}

		if (var2 == 23) { // L: 9673
			if (Client.isMenuOpen) { // L: 9674
				Actor.scene.setViewportWalking(); // L: 9675
			} else {
				Actor.scene.menuOpen(class473.Client_plane, var0, var1, true); // L: 9678
			}
		}

		if (var2 == 48) { // L: 9681
			var18 = Client.players[var3]; // L: 9682
			if (var18 != null) { // L: 9683
				Client.mouseCrossX = var7; // L: 9684
				Client.mouseCrossY = var8; // L: 9685
				Client.mouseCrossColor = 2; // L: 9686
				Client.mouseCrossState = 0; // L: 9687
				Client.destinationX = var0; // L: 9688
				Client.destinationY = var1; // L: 9689
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3246, Client.packetWriter.isaacCipher); // L: 9691
				var15.packetBuffer.method9508(var3); // L: 9692
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9693
				Client.packetWriter.addNode(var15); // L: 9694
			}
		}

		if (var2 == 46) { // L: 9697
			var18 = Client.players[var3]; // L: 9698
			if (var18 != null) { // L: 9699
				Client.mouseCrossX = var7; // L: 9700
				Client.mouseCrossY = var8; // L: 9701
				Client.mouseCrossColor = 2; // L: 9702
				Client.mouseCrossState = 0; // L: 9703
				Client.destinationX = var0; // L: 9704
				Client.destinationY = var1; // L: 9705
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3218, Client.packetWriter.isaacCipher); // L: 9707
				var15.packetBuffer.writeIntME(var3); // L: 9708
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9709
				Client.packetWriter.addNode(var15); // L: 9710
			}
		}

		if (var2 == 14) { // L: 9713
			var18 = Client.players[var3]; // L: 9714
			if (var18 != null) { // L: 9715
				Client.mouseCrossX = var7; // L: 9716
				Client.mouseCrossY = var8; // L: 9717
				Client.mouseCrossColor = 2; // L: 9718
				Client.mouseCrossState = 0; // L: 9719
				Client.destinationX = var0; // L: 9720
				Client.destinationY = var1; // L: 9721
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3226, Client.packetWriter.isaacCipher); // L: 9723
				var15.packetBuffer.writeIntME(var3); // L: 9724
				var15.packetBuffer.method9525(class324.field3537); // L: 9725
				var15.packetBuffer.method9508(class128.field1513); // L: 9726
				var15.packetBuffer.method9548(class422.field4618); // L: 9727
				var15.packetBuffer.method9540(Client.field792.method4466(82) ? 1 : 0); // L: 9728
				Client.packetWriter.addNode(var15); // L: 9729
			}
		}

		if (var2 == 7) { // L: 9732
			var16 = Client.npcs[var3]; // L: 9733
			if (var16 != null) { // L: 9734
				Client.mouseCrossX = var7; // L: 9735
				Client.mouseCrossY = var8; // L: 9736
				Client.mouseCrossColor = 2; // L: 9737
				Client.mouseCrossState = 0; // L: 9738
				Client.destinationX = var0; // L: 9739
				Client.destinationY = var1; // L: 9740
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3239, Client.packetWriter.isaacCipher); // L: 9742
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9743
				var15.packetBuffer.method9525(class324.field3537); // L: 9744
				var15.packetBuffer.method9548(var3); // L: 9745
				var15.packetBuffer.method9548(class422.field4618); // L: 9746
				var15.packetBuffer.method9508(class128.field1513); // L: 9747
				Client.packetWriter.addNode(var15); // L: 9748
			}
		}

		if (var2 == 5) { // L: 9751
			Client.mouseCrossX = var7; // L: 9752
			Client.mouseCrossY = var8; // L: 9753
			Client.mouseCrossColor = 2; // L: 9754
			Client.mouseCrossState = 0; // L: 9755
			Client.destinationX = var0; // L: 9756
			Client.destinationY = var1; // L: 9757
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3264, Client.packetWriter.isaacCipher); // L: 9759
			var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 9760
			var9.packetBuffer.writeIntME(GameEngine.baseY * 8 + var1); // L: 9761
			var9.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9762
			var9.packetBuffer.method9548(var3); // L: 9763
			Client.packetWriter.addNode(var9); // L: 9764
		}

		if (var2 == 10) { // L: 9766
			var16 = Client.npcs[var3]; // L: 9767
			if (var16 != null) { // L: 9768
				Client.mouseCrossX = var7; // L: 9769
				Client.mouseCrossY = var8; // L: 9770
				Client.mouseCrossColor = 2; // L: 9771
				Client.mouseCrossState = 0; // L: 9772
				Client.destinationX = var0; // L: 9773
				Client.destinationY = var1; // L: 9774
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3237, Client.packetWriter.isaacCipher); // L: 9776
				var15.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0); // L: 9777
				var15.packetBuffer.method9548(var3); // L: 9778
				Client.packetWriter.addNode(var15); // L: 9779
			}
		}

		if (var2 == 47) { // L: 9782
			var18 = Client.players[var3]; // L: 9783
			if (var18 != null) { // L: 9784
				Client.mouseCrossX = var7; // L: 9785
				Client.mouseCrossY = var8; // L: 9786
				Client.mouseCrossColor = 2; // L: 9787
				Client.mouseCrossState = 0; // L: 9788
				Client.destinationX = var0; // L: 9789
				Client.destinationY = var1; // L: 9790
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3265, Client.packetWriter.isaacCipher); // L: 9792
				var15.packetBuffer.writeShort(var3); // L: 9793
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9794
				Client.packetWriter.addNode(var15); // L: 9795
			}
		}

		if (var2 == 57 || var2 == 1007) { // L: 9798
			var14 = ArchiveLoader.field1070.method6433(var1, var0); // L: 9799
			if (var14 != null) { // L: 9800
				class185.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9801
			}
		}

		if (var2 == 1) { // L: 9804
			Client.mouseCrossX = var7; // L: 9805
			Client.mouseCrossY = var8; // L: 9806
			Client.mouseCrossColor = 2; // L: 9807
			Client.mouseCrossState = 0; // L: 9808
			Client.destinationX = var0; // L: 9809
			Client.destinationY = var1; // L: 9810
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher); // L: 9812
			var9.packetBuffer.method9508(class128.field1513); // L: 9813
			var9.packetBuffer.method9548(GameEngine.baseY * 8 + var1); // L: 9814
			var9.packetBuffer.method9548(class422.field4618); // L: 9815
			var9.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9816
			var9.packetBuffer.method9508(Projectile.baseX * 64 + var0); // L: 9817
			var9.packetBuffer.writeShort(var3); // L: 9818
			var9.packetBuffer.method9677(class324.field3537); // L: 9819
			Client.packetWriter.addNode(var9); // L: 9820
		}

		if (var2 == 50) { // L: 9822
			var18 = Client.players[var3]; // L: 9823
			if (var18 != null) { // L: 9824
				Client.mouseCrossX = var7; // L: 9825
				Client.mouseCrossY = var8; // L: 9826
				Client.mouseCrossColor = 2; // L: 9827
				Client.mouseCrossState = 0; // L: 9828
				Client.destinationX = var0; // L: 9829
				Client.destinationY = var1; // L: 9830
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3207, Client.packetWriter.isaacCipher); // L: 9832
				var15.packetBuffer.method9505(Client.field792.method4466(82) ? 1 : 0); // L: 9833
				var15.packetBuffer.method9548(var3); // L: 9834
				Client.packetWriter.addNode(var15); // L: 9835
			}
		}

		if (var2 == 45) { // L: 9838
			var18 = Client.players[var3]; // L: 9839
			if (var18 != null) { // L: 9840
				Client.mouseCrossX = var7; // L: 9841
				Client.mouseCrossY = var8; // L: 9842
				Client.mouseCrossColor = 2; // L: 9843
				Client.mouseCrossState = 0; // L: 9844
				Client.destinationX = var0; // L: 9845
				Client.destinationY = var1; // L: 9846
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3222, Client.packetWriter.isaacCipher); // L: 9848
				var15.packetBuffer.method9508(var3); // L: 9849
				var15.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9850
				Client.packetWriter.addNode(var15); // L: 9851
			}
		}

		if (var2 == 18) { // L: 9854
			Client.mouseCrossX = var7; // L: 9855
			Client.mouseCrossY = var8; // L: 9856
			Client.mouseCrossColor = 2; // L: 9857
			Client.mouseCrossState = 0; // L: 9858
			Client.destinationX = var0; // L: 9859
			Client.destinationY = var1; // L: 9860
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3220, Client.packetWriter.isaacCipher); // L: 9862
			var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 9863
			var9.packetBuffer.method9548(GameEngine.baseY * 8 + var1); // L: 9864
			var9.packetBuffer.method9540(Client.field792.method4466(82) ? 1 : 0); // L: 9865
			var9.packetBuffer.writeShort(var3); // L: 9866
			Client.packetWriter.addNode(var9); // L: 9867
		}

		int var12;
		Widget var19;
		if (var2 == 28) { // L: 9869
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher); // L: 9871
			var9.packetBuffer.writeInt(var1); // L: 9872
			Client.packetWriter.addNode(var9); // L: 9873
			var19 = ArchiveLoader.field1070.method6431(var1); // L: 9874
			if (var19 != null && var19.cs1Instructions != null && var19.cs1Instructions[0][0] == 5) { // L: 9875
				var12 = var19.cs1Instructions[0][1]; // L: 9876
				Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12]; // L: 9877
				FriendSystem.changeGameOptions(var12); // L: 9878
			}
		}

		if (var2 == 12) { // L: 9881
			var16 = Client.npcs[var3]; // L: 9882
			if (var16 != null) { // L: 9883
				Client.mouseCrossX = var7; // L: 9884
				Client.mouseCrossY = var8; // L: 9885
				Client.mouseCrossColor = 2; // L: 9886
				Client.mouseCrossState = 0; // L: 9887
				Client.destinationX = var0; // L: 9888
				Client.destinationY = var1; // L: 9889
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher); // L: 9891
				var15.packetBuffer.method9548(var3); // L: 9892
				var15.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0); // L: 9893
				Client.packetWriter.addNode(var15); // L: 9894
			}
		}

		if (var2 == 26) { // L: 9897
			class272.method5372(); // L: 9898
		}

		if (var2 == 19) { // L: 9900
			Client.mouseCrossX = var7; // L: 9901
			Client.mouseCrossY = var8; // L: 9902
			Client.mouseCrossColor = 2; // L: 9903
			Client.mouseCrossState = 0; // L: 9904
			Client.destinationX = var0; // L: 9905
			Client.destinationY = var1; // L: 9906
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3250, Client.packetWriter.isaacCipher); // L: 9908
			var9.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0); // L: 9909
			var9.packetBuffer.method9508(var3); // L: 9910
			var9.packetBuffer.method9508(GameEngine.baseY * 8 + var1); // L: 9911
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0); // L: 9912
			Client.packetWriter.addNode(var9); // L: 9913
		}

		if (var2 == 11) { // L: 9915
			var16 = Client.npcs[var3]; // L: 9916
			if (var16 != null) { // L: 9917
				Client.mouseCrossX = var7; // L: 9918
				Client.mouseCrossY = var8; // L: 9919
				Client.mouseCrossColor = 2; // L: 9920
				Client.mouseCrossState = 0; // L: 9921
				Client.destinationX = var0; // L: 9922
				Client.destinationY = var1; // L: 9923
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher); // L: 9925
				var15.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9926
				var15.packetBuffer.writeIntME(var3); // L: 9927
				Client.packetWriter.addNode(var15); // L: 9928
			}
		}

		if (var2 == 51) { // L: 9931
			var18 = Client.players[var3]; // L: 9932
			if (var18 != null) { // L: 9933
				Client.mouseCrossX = var7; // L: 9934
				Client.mouseCrossY = var8; // L: 9935
				Client.mouseCrossColor = 2; // L: 9936
				Client.mouseCrossState = 0; // L: 9937
				Client.destinationX = var0; // L: 9938
				Client.destinationY = var1; // L: 9939
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher); // L: 9941
				var15.packetBuffer.method9503(Client.field792.method4466(82) ? 1 : 0); // L: 9942
				var15.packetBuffer.writeIntME(var3); // L: 9943
				Client.packetWriter.addNode(var15); // L: 9944
			}
		}

		if (var2 == 25) { // L: 9947
			var14 = ArchiveLoader.field1070.method6433(var1, var0); // L: 9948
			if (var14 != null) { // L: 9949
				GameObject.method5963(); // L: 9950
				VarbitComposition.method3820(var1, var0, TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var14)), var4); // L: 9951
				Client.isItemSelected = 0; // L: 9952
				Client.field696 = UserComparator9.Widget_getSpellActionName(var14); // L: 9953
				if (Client.field696 == null) { // L: 9954
					Client.field696 = "null";
				}

				if (var14.isIf3) { // L: 9955
					Client.field574 = var14.dataText + class370.colorStartTag(16777215);
				} else {
					Client.field574 = class370.colorStartTag(65280) + var14.field3785 + class370.colorStartTag(16777215); // L: 9956
				}
			}

		} else {
			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9960
				Tiles.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9961
			}

			if (var2 == 24) { // L: 9963
				var14 = ArchiveLoader.field1070.method6431(var1); // L: 9964
				if (var14 != null) { // L: 9965
					boolean var13 = true; // L: 9966
					if (var14.contentType > 0) { // L: 9967
						var13 = SoundSystem.method807(var14);
					}

					if (var13) { // L: 9968
						var11 = ViewportMouse.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher); // L: 9970
						var11.packetBuffer.writeInt(var1); // L: 9971
						Client.packetWriter.addNode(var11); // L: 9972
					}
				}
			}

			if (var2 == 29) { // L: 9976
				var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher); // L: 9978
				var9.packetBuffer.writeInt(var1); // L: 9979
				Client.packetWriter.addNode(var9); // L: 9980
				var19 = ArchiveLoader.field1070.method6431(var1); // L: 9981
				if (var19 != null && var19.cs1Instructions != null && var19.cs1Instructions[0][0] == 5) { // L: 9982
					var12 = var19.cs1Instructions[0][1]; // L: 9983
					if (Varps.Varps_main[var12] != var19.cs1ComparisonValues[0]) { // L: 9984
						Varps.Varps_main[var12] = var19.cs1ComparisonValues[0]; // L: 9985
						FriendSystem.changeGameOptions(var12); // L: 9986
					}
				}
			}

			if (var2 == 44) { // L: 9990
				var18 = Client.players[var3]; // L: 9991
				if (var18 != null) { // L: 9992
					Client.mouseCrossX = var7; // L: 9993
					Client.mouseCrossY = var8; // L: 9994
					Client.mouseCrossColor = 2; // L: 9995
					Client.mouseCrossState = 0; // L: 9996
					Client.destinationX = var0; // L: 9997
					Client.destinationY = var1; // L: 9998
					var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3211, Client.packetWriter.isaacCipher); // L: 10000
					var15.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0); // L: 10001
					var15.packetBuffer.method9508(var3); // L: 10002
					Client.packetWriter.addNode(var15); // L: 10003
				}
			}

			if (var2 == 2) { // L: 10006
				Client.mouseCrossX = var7; // L: 10007
				Client.mouseCrossY = var8; // L: 10008
				Client.mouseCrossColor = 2; // L: 10009
				Client.mouseCrossState = 0; // L: 10010
				Client.destinationX = var0; // L: 10011
				Client.destinationY = var1; // L: 10012
				var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3262, Client.packetWriter.isaacCipher); // L: 10013
				var9.packetBuffer.method9677(class160.field1778); // L: 10014
				var9.packetBuffer.writeIntME(var3); // L: 10015
				var9.packetBuffer.writeShort(Client.field695); // L: 10016
				var9.packetBuffer.method9508(GameEngine.baseY * 8 + var1); // L: 10017
				var9.packetBuffer.writeShort(Client.field538); // L: 10018
				var9.packetBuffer.writeIntME(Projectile.baseX * 64 + var0); // L: 10019
				var9.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0); // L: 10020
				Client.packetWriter.addNode(var9); // L: 10021
			}

			if (var2 == 8) { // L: 10023
				var16 = Client.npcs[var3]; // L: 10024
				if (var16 != null) { // L: 10025
					Client.mouseCrossX = var7; // L: 10026
					Client.mouseCrossY = var8; // L: 10027
					Client.mouseCrossColor = 2; // L: 10028
					Client.mouseCrossState = 0; // L: 10029
					Client.destinationX = var0; // L: 10030
					Client.destinationY = var1; // L: 10031
					var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3238, Client.packetWriter.isaacCipher); // L: 10032
					var15.packetBuffer.writeInt(class160.field1778); // L: 10033
					var15.packetBuffer.method9540(Client.field792.method4466(82) ? 1 : 0); // L: 10034
					var15.packetBuffer.writeIntME(var3); // L: 10035
					var15.packetBuffer.writeIntME(Client.field695); // L: 10036
					var15.packetBuffer.writeIntME(Client.field538); // L: 10037
					Client.packetWriter.addNode(var15); // L: 10038
				}
			}

			if (Client.isItemSelected != 0) { // L: 10041
				Client.isItemSelected = 0; // L: 10042
				UserComparator5.invalidateWidget(ArchiveLoader.field1070.method6431(class324.field3537)); // L: 10043
			}

			if (Client.isSpellSelected) { // L: 10045
				GameObject.method5963();
			}

		}
	} // L: 9958 10046
}
