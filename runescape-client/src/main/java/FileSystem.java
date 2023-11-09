import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("f")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("w")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("v")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)I",
		garbageValue = "-1394707617"
	)
	static int method3510(Widget var0) {
		if (var0.type != 11) { // L: 1518
			--class20.Interpreter_stringStackSize; // L: 1519
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 1520
			return 1; // L: 1521
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1523
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var0.method6216(var1); // L: 1524
			return 1; // L: 1525
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "1"
	)
	static final void method3505(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9410
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1) { // L: 9411
			Client.mouseCrossX = var7; // L: 9474
			Client.mouseCrossY = var8; // L: 9475
			Client.mouseCrossColor = 2; // L: 9476
			Client.mouseCrossState = 0; // L: 9477
			Client.destinationX = var0; // L: 9478
			Client.destinationY = var1; // L: 9479
			var9 = Renderable.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 9481
			var9.packetBuffer.method8696(WorldMapLabel.selectedItemWidget); // L: 9482
			var9.packetBuffer.method8683(ParamComposition.baseX * 64 + var0); // L: 9483
			var9.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 9484
			var9.packetBuffer.method8683(var3); // L: 9485
			var9.packetBuffer.method8683(WorldMapIcon_0.selectedItemSlot); // L: 9486
			var9.packetBuffer.method8683(class131.selectedItemId); // L: 9487
			var9.packetBuffer.writeIntME(Client.baseY * 64 + var1); // L: 9488
			Client.packetWriter.addNode(var9); // L: 9489
		} else if (var2 == 2) {
			Client.mouseCrossX = var7; // L: 9445
			Client.mouseCrossY = var8; // L: 9446
			Client.mouseCrossColor = 2; // L: 9447
			Client.mouseCrossState = 0; // L: 9448
			Client.destinationX = var0; // L: 9449
			Client.destinationY = var1; // L: 9450
			var9 = Renderable.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 9451
			var9.packetBuffer.method8682(Client.baseY * 64 + var1); // L: 9452
			var9.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9453
			var9.packetBuffer.method8696(class9.selectedSpellWidget); // L: 9454
			var9.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0); // L: 9455
			var9.packetBuffer.writeShort(ParamComposition.baseX * 64 + var0); // L: 9456
			var9.packetBuffer.method8682(var3); // L: 9457
			var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9458
			Client.packetWriter.addNode(var9); // L: 9459
		} else if (var2 == 3) {
			Client.mouseCrossX = var7; // L: 9603
			Client.mouseCrossY = var8; // L: 9604
			Client.mouseCrossColor = 2; // L: 9605
			Client.mouseCrossState = 0; // L: 9606
			Client.destinationX = var0; // L: 9607
			Client.destinationY = var1; // L: 9608
			var9 = Renderable.getPacketBufferNode(ClientPacket.field3084, Client.packetWriter.isaacCipher); // L: 9610
			var9.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 9611
			var9.packetBuffer.method8683(ParamComposition.baseX * 64 + var0); // L: 9612
			var9.packetBuffer.method8682(var3); // L: 9613
			var9.packetBuffer.writeShort(Client.baseY * 64 + var1); // L: 9614
			Client.packetWriter.addNode(var9); // L: 9615
		} else if (var2 == 4) {
			Client.mouseCrossX = var7; // L: 9722
			Client.mouseCrossY = var8; // L: 9723
			Client.mouseCrossColor = 2; // L: 9724
			Client.mouseCrossState = 0; // L: 9725
			Client.destinationX = var0; // L: 9726
			Client.destinationY = var1; // L: 9727
			var9 = Renderable.getPacketBufferNode(ClientPacket.field3102, Client.packetWriter.isaacCipher); // L: 9729
			var9.packetBuffer.method8683(var3); // L: 9730
			var9.packetBuffer.method8683(ParamComposition.baseX * 64 + var0); // L: 9731
			var9.packetBuffer.writeShort(Client.baseY * 64 + var1); // L: 9732
			var9.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 9733
			Client.packetWriter.addNode(var9); // L: 9734
		} else if (var2 == 5) {
			Client.mouseCrossX = var7; // L: 10201
			Client.mouseCrossY = var8; // L: 10202
			Client.mouseCrossColor = 2; // L: 10203
			Client.mouseCrossState = 0; // L: 10204
			Client.destinationX = var0; // L: 10205
			Client.destinationY = var1; // L: 10206
			var9 = Renderable.getPacketBufferNode(ClientPacket.field3078, Client.packetWriter.isaacCipher); // L: 10208
			var9.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 10209
			var9.packetBuffer.writeIntME(Client.baseY * 64 + var1); // L: 10210
			var9.packetBuffer.method8683(ParamComposition.baseX * 64 + var0); // L: 10211
			var9.packetBuffer.method8682(var3); // L: 10212
			Client.packetWriter.addNode(var9); // L: 10213
		} else if (var2 == 6) {
			Client.mouseCrossX = var7; // L: 9543
			Client.mouseCrossY = var8; // L: 9544
			Client.mouseCrossColor = 2; // L: 9545
			Client.mouseCrossState = 0; // L: 9546
			Client.destinationX = var0; // L: 9547
			Client.destinationY = var1; // L: 9548
			var9 = Renderable.getPacketBufferNode(ClientPacket.field3065, Client.packetWriter.isaacCipher); // L: 9550
			var9.packetBuffer.method8683(ParamComposition.baseX * 64 + var0); // L: 9551
			var9.packetBuffer.writeShort(Client.baseY * 64 + var1); // L: 9552
			var9.packetBuffer.writeShort(var3); // L: 9553
			var9.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 9554
			Client.packetWriter.addNode(var9); // L: 9555
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3]; // L: 9942
				if (var14 != null) { // L: 9943
					Client.mouseCrossX = var7; // L: 9944
					Client.mouseCrossY = var8; // L: 9945
					Client.mouseCrossColor = 2; // L: 9946
					Client.mouseCrossState = 0; // L: 9947
					Client.destinationX = var0; // L: 9948
					Client.destinationY = var1; // L: 9949
					var10 = Renderable.getPacketBufferNode(ClientPacket.field3069, Client.packetWriter.isaacCipher); // L: 9951
					var10.packetBuffer.method8683(WorldMapIcon_0.selectedItemSlot); // L: 9952
					var10.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 9953
					var10.packetBuffer.writeShort(class131.selectedItemId); // L: 9954
					var10.packetBuffer.method8648(WorldMapLabel.selectedItemWidget); // L: 9955
					var10.packetBuffer.method8682(var3); // L: 9956
					Client.packetWriter.addNode(var10); // L: 9957
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3]; // L: 10183
				if (var14 != null) { // L: 10184
					Client.mouseCrossX = var7; // L: 10185
					Client.mouseCrossY = var8; // L: 10186
					Client.mouseCrossColor = 2; // L: 10187
					Client.mouseCrossState = 0; // L: 10188
					Client.destinationX = var0; // L: 10189
					Client.destinationY = var1; // L: 10190
					var10 = Renderable.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 10191
					var10.packetBuffer.method8696(class9.selectedSpellWidget); // L: 10192
					var10.packetBuffer.method8682(Client.selectedSpellChildIndex); // L: 10193
					var10.packetBuffer.method8683(Client.selectedSpellItemId); // L: 10194
					var10.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 10195
					var10.packetBuffer.method8683(var3); // L: 10196
					Client.packetWriter.addNode(var10); // L: 10197
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3]; // L: 9659
				if (var14 != null) { // L: 9660
					Client.mouseCrossX = var7; // L: 9661
					Client.mouseCrossY = var8; // L: 9662
					Client.mouseCrossColor = 2; // L: 9663
					Client.mouseCrossState = 0; // L: 9664
					Client.destinationX = var0; // L: 9665
					Client.destinationY = var1; // L: 9666
					var10 = Renderable.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 9668
					var10.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 9669
					var10.packetBuffer.method8683(var3); // L: 9670
					Client.packetWriter.addNode(var10); // L: 9671
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3]; // L: 9898
				if (var14 != null) { // L: 9899
					Client.mouseCrossX = var7; // L: 9900
					Client.mouseCrossY = var8; // L: 9901
					Client.mouseCrossColor = 2; // L: 9902
					Client.mouseCrossState = 0; // L: 9903
					Client.destinationX = var0; // L: 9904
					Client.destinationY = var1; // L: 9905
					var10 = Renderable.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 9907
					var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0); // L: 9908
					var10.packetBuffer.writeIntME(var3); // L: 9909
					Client.packetWriter.addNode(var10); // L: 9910
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3]; // L: 9511
				if (var14 != null) { // L: 9512
					Client.mouseCrossX = var7; // L: 9513
					Client.mouseCrossY = var8; // L: 9514
					Client.mouseCrossColor = 2; // L: 9515
					Client.mouseCrossState = 0; // L: 9516
					Client.destinationX = var0; // L: 9517
					Client.destinationY = var1; // L: 9518
					var10 = Renderable.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9520
					var10.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 9521
					var10.packetBuffer.writeShort(var3); // L: 9522
					Client.packetWriter.addNode(var10); // L: 9523
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3]; // L: 9412
				if (var14 != null) { // L: 9413
					Client.mouseCrossX = var7; // L: 9414
					Client.mouseCrossY = var8; // L: 9415
					Client.mouseCrossColor = 2; // L: 9416
					Client.mouseCrossState = 0; // L: 9417
					Client.destinationX = var0; // L: 9418
					Client.destinationY = var1; // L: 9419
					var10 = Renderable.getPacketBufferNode(ClientPacket.field3077, Client.packetWriter.isaacCipher); // L: 9421
					var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0); // L: 9422
					var10.packetBuffer.method8682(var3); // L: 9423
					Client.packetWriter.addNode(var10); // L: 9424
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3]; // L: 9820
				if (var14 != null) { // L: 9821
					Client.mouseCrossX = var7; // L: 9822
					Client.mouseCrossY = var8; // L: 9823
					Client.mouseCrossColor = 2; // L: 9824
					Client.mouseCrossState = 0; // L: 9825
					Client.destinationX = var0; // L: 9826
					Client.destinationY = var1; // L: 9827
					var10 = Renderable.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher); // L: 9829
					var10.packetBuffer.method8683(var3); // L: 9830
					var10.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 9831
					Client.packetWriter.addNode(var10); // L: 9832
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3]; // L: 9640
					if (var16 != null) { // L: 9641
						Client.mouseCrossX = var7; // L: 9642
						Client.mouseCrossY = var8; // L: 9643
						Client.mouseCrossColor = 2; // L: 9644
						Client.mouseCrossState = 0; // L: 9645
						Client.destinationX = var0; // L: 9646
						Client.destinationY = var1; // L: 9647
						var10 = Renderable.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 9649
						var10.packetBuffer.writeIntME(var3); // L: 9650
						var10.packetBuffer.writeShort(class131.selectedItemId); // L: 9651
						var10.packetBuffer.method8846(WorldMapLabel.selectedItemWidget); // L: 9652
						var10.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 9653
						var10.packetBuffer.method8683(WorldMapIcon_0.selectedItemSlot); // L: 9654
						Client.packetWriter.addNode(var10); // L: 9655
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3]; // L: 9704
					if (var16 != null) { // L: 9705
						Client.mouseCrossX = var7; // L: 9706
						Client.mouseCrossY = var8; // L: 9707
						Client.mouseCrossColor = 2; // L: 9708
						Client.mouseCrossState = 0; // L: 9709
						Client.destinationX = var0; // L: 9710
						Client.destinationY = var1; // L: 9711
						var10 = Renderable.getPacketBufferNode(ClientPacket.field3121, Client.packetWriter.isaacCipher); // L: 9712
						var10.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 9713
						var10.packetBuffer.writeIntME(var3); // L: 9714
						var10.packetBuffer.writeInt(class9.selectedSpellWidget); // L: 9715
						var10.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9716
						var10.packetBuffer.method8683(Client.selectedSpellChildIndex); // L: 9717
						Client.packetWriter.addNode(var10); // L: 9718
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7; // L: 9686
					Client.mouseCrossY = var8; // L: 9687
					Client.mouseCrossColor = 2; // L: 9688
					Client.mouseCrossState = 0; // L: 9689
					Client.destinationX = var0; // L: 9690
					Client.destinationY = var1; // L: 9691
					var9 = Renderable.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 9693
					var9.packetBuffer.writeIntME(var3); // L: 9694
					var9.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 9695
					var9.packetBuffer.method8683(WorldMapIcon_0.selectedItemSlot); // L: 9696
					var9.packetBuffer.method8683(ParamComposition.baseX * 64 + var0); // L: 9697
					var9.packetBuffer.method8696(WorldMapLabel.selectedItemWidget); // L: 9698
					var9.packetBuffer.method8682(Client.baseY * 64 + var1); // L: 9699
					var9.packetBuffer.method8682(class131.selectedItemId); // L: 9700
					Client.packetWriter.addNode(var9); // L: 9701
				} else if (var2 == 17) {
					Client.mouseCrossX = var7; // L: 9881
					Client.mouseCrossY = var8; // L: 9882
					Client.mouseCrossColor = 2; // L: 9883
					Client.mouseCrossState = 0; // L: 9884
					Client.destinationX = var0; // L: 9885
					Client.destinationY = var1; // L: 9886
					var9 = Renderable.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher); // L: 9887
					var9.packetBuffer.writeShort(ParamComposition.baseX * 64 + var0); // L: 9888
					var9.packetBuffer.writeShort(var3); // L: 9889
					var9.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 9890
					var9.packetBuffer.method8683(Client.selectedSpellItemId); // L: 9891
					var9.packetBuffer.method8682(Client.selectedSpellChildIndex); // L: 9892
					var9.packetBuffer.method8648(class9.selectedSpellWidget); // L: 9893
					var9.packetBuffer.writeIntME(Client.baseY * 64 + var1); // L: 9894
					Client.packetWriter.addNode(var9); // L: 9895
				} else if (var2 == 18) {
					Client.mouseCrossX = var7; // L: 10054
					Client.mouseCrossY = var8; // L: 10055
					Client.mouseCrossColor = 2; // L: 10056
					Client.mouseCrossState = 0; // L: 10057
					Client.destinationX = var0; // L: 10058
					Client.destinationY = var1; // L: 10059
					var9 = Renderable.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 10061
					var9.packetBuffer.method8683(Client.baseY * 64 + var1); // L: 10062
					var9.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 10063
					var9.packetBuffer.writeIntME(ParamComposition.baseX * 64 + var0); // L: 10064
					var9.packetBuffer.method8682(var3); // L: 10065
					Client.packetWriter.addNode(var9); // L: 10066
				} else if (var2 == 19) {
					Client.mouseCrossX = var7; // L: 10168
					Client.mouseCrossY = var8; // L: 10169
					Client.mouseCrossColor = 2; // L: 10170
					Client.mouseCrossState = 0; // L: 10171
					Client.destinationX = var0; // L: 10172
					Client.destinationY = var1; // L: 10173
					var9 = Renderable.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher); // L: 10175
					var9.packetBuffer.writeIntME(var3); // L: 10176
					var9.packetBuffer.method8683(Client.baseY * 64 + var1); // L: 10177
					var9.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 10178
					var9.packetBuffer.method8682(ParamComposition.baseX * 64 + var0); // L: 10179
					Client.packetWriter.addNode(var9); // L: 10180
				} else if (var2 == 20) {
					Client.mouseCrossX = var7; // L: 9927
					Client.mouseCrossY = var8; // L: 9928
					Client.mouseCrossColor = 2; // L: 9929
					Client.mouseCrossState = 0; // L: 9930
					Client.destinationX = var0; // L: 9931
					Client.destinationY = var1; // L: 9932
					var9 = Renderable.getPacketBufferNode(ClientPacket.field3093, Client.packetWriter.isaacCipher); // L: 9934
					var9.packetBuffer.method8682(ParamComposition.baseX * 64 + var0); // L: 9935
					var9.packetBuffer.writeIntME(Client.baseY * 64 + var1); // L: 9936
					var9.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 9937
					var9.packetBuffer.method8683(var3); // L: 9938
					Client.packetWriter.addNode(var9); // L: 9939
				} else if (var2 == 21) {
					Client.mouseCrossX = var7; // L: 9769
					Client.mouseCrossY = var8; // L: 9770
					Client.mouseCrossColor = 2; // L: 9771
					Client.mouseCrossState = 0; // L: 9772
					Client.destinationX = var0; // L: 9773
					Client.destinationY = var1; // L: 9774
					var9 = Renderable.getPacketBufferNode(ClientPacket.field3076, Client.packetWriter.isaacCipher); // L: 9776
					var9.packetBuffer.writeIntME(var3); // L: 9777
					var9.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 9778
					var9.packetBuffer.method8683(ParamComposition.baseX * 64 + var0); // L: 9779
					var9.packetBuffer.writeIntME(Client.baseY * 64 + var1); // L: 9780
					Client.packetWriter.addNode(var9); // L: 9781
				} else if (var2 == 22) {
					Client.mouseCrossX = var7; // L: 9561
					Client.mouseCrossY = var8; // L: 9562
					Client.mouseCrossColor = 2; // L: 9563
					Client.mouseCrossState = 0; // L: 9564
					Client.destinationX = var0; // L: 9565
					Client.destinationY = var1; // L: 9566
					var9 = Renderable.getPacketBufferNode(ClientPacket.field3062, Client.packetWriter.isaacCipher); // L: 9568
					var9.packetBuffer.method8682(Client.baseY * 64 + var1); // L: 9569
					var9.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 9570
					var9.packetBuffer.writeShort(var3); // L: 9571
					var9.packetBuffer.writeIntME(ParamComposition.baseX * 64 + var0); // L: 9572
					Client.packetWriter.addNode(var9); // L: 9573
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 10129
						WorldMapAreaData.scene.setViewportWalking(); // L: 10130
					} else {
						WorldMapAreaData.scene.menuOpen(class103.Client_plane, var0, var1, true); // L: 10133
					}
				} else {
					PacketBufferNode var11;
					Widget var17;
					if (var2 == 24) {
						var17 = class133.getWidget(var1); // L: 9868
						if (var17 != null) { // L: 9869
							boolean var12 = true; // L: 9870
							if (var17.contentType > 0) { // L: 9871
								var12 = class276.method5534(var17);
							}

							if (var12) { // L: 9872
								var11 = Renderable.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 9874
								var11.packetBuffer.writeInt(var1); // L: 9875
								Client.packetWriter.addNode(var11); // L: 9876
							}
						}
					} else {
						if (var2 == 25) {
							var17 = class135.getWidgetChild(var1, var0); // L: 9914
							if (var17 != null) { // L: 9915
								class18.Widget_runOnTargetLeave(); // L: 9916
								ClanChannel.selectSpell(var1, var0, MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var17)), var4); // L: 9917
								Client.isItemSelected = 0; // L: 9918
								Client.selectedSpellActionName = class317.Widget_getSpellActionName(var17); // L: 9919
								if (Client.selectedSpellActionName == null) { // L: 9920
									Client.selectedSpellActionName = "null";
								}

								if (var17.isIf3) { // L: 9921
									Client.selectedSpellName = var17.dataText + class149.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class149.colorStartTag(65280) + var17.spellName + class149.colorStartTag(16777215); // L: 9922
								}
							}

							return; // L: 9924
						}

						if (var2 == 26) {
							SoundCache.method869(); // L: 10150
						} else {
							int var13;
							Widget var15;
							if (var2 == 28) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 10021
								var9.packetBuffer.writeInt(var1); // L: 10022
								Client.packetWriter.addNode(var9); // L: 10023
								var15 = class133.getWidget(var1); // L: 10024
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 10025
									var13 = var15.cs1Instructions[0][1]; // L: 10026
									Varps.Varps_main[var13] = 1 - Varps.Varps_main[var13]; // L: 10027
									ReflectionCheck.changeGameOptions(var13); // L: 10028
								}
							} else if (var2 == 29) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 9962
								var9.packetBuffer.writeInt(var1); // L: 9963
								Client.packetWriter.addNode(var9); // L: 9964
								var15 = class133.getWidget(var1); // L: 9965
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9966
									var13 = var15.cs1Instructions[0][1]; // L: 9967
									if (Varps.Varps_main[var13] != var15.cs1ComparisonValues[0]) { // L: 9968
										Varps.Varps_main[var13] = var15.cs1ComparisonValues[0]; // L: 9969
										ReflectionCheck.changeGameOptions(var13); // L: 9970
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9504
									class205.resumePauseWidget(var1, var0); // L: 9505
									Client.meslayerContinueWidget = class135.getWidgetChild(var1, var0); // L: 9506
									LoginScreenAnimation.invalidateWidget(Client.meslayerContinueWidget); // L: 9507
								}
							} else if (var2 == 31) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3088, Client.packetWriter.isaacCipher); // L: 9785
								var9.packetBuffer.method8682(WorldMapIcon_0.selectedItemSlot); // L: 9786
								var9.packetBuffer.method8683(var4); // L: 9787
								var9.packetBuffer.method8682(var0); // L: 9788
								var9.packetBuffer.method8846(WorldMapLabel.selectedItemWidget); // L: 9789
								var9.packetBuffer.writeInt(var1); // L: 9790
								var9.packetBuffer.writeIntME(class131.selectedItemId); // L: 9791
								Client.packetWriter.addNode(var9); // L: 9792
								Client.field743 = 0; // L: 9793
								class378.field4437 = class133.getWidget(var1); // L: 9794
								Client.field619 = var0; // L: 9795
							} else if (var2 == 32) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3080, Client.packetWriter.isaacCipher); // L: 10138
								var9.packetBuffer.writeIntME(var0); // L: 10139
								var9.packetBuffer.writeInt(var1); // L: 10140
								var9.packetBuffer.method8696(class9.selectedSpellWidget); // L: 10141
								var9.packetBuffer.method8683(var4); // L: 10142
								var9.packetBuffer.method8682(Client.selectedSpellChildIndex); // L: 10143
								Client.packetWriter.addNode(var9); // L: 10144
								Client.field743 = 0; // L: 10145
								class378.field4437 = class133.getWidget(var1); // L: 10146
								Client.field619 = var0; // L: 10147
							} else if (var2 == 33) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher); // L: 9630
								var9.packetBuffer.writeShort(var0); // L: 9631
								var9.packetBuffer.method8696(var1); // L: 9632
								var9.packetBuffer.writeIntME(var4); // L: 9633
								Client.packetWriter.addNode(var9); // L: 9634
								Client.field743 = 0; // L: 9635
								class378.field4437 = class133.getWidget(var1); // L: 9636
								Client.field619 = var0; // L: 9637
							} else if (var2 == 34) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 9976
								var9.packetBuffer.method8648(var1); // L: 9977
								var9.packetBuffer.writeIntME(var4); // L: 9978
								var9.packetBuffer.writeIntME(var0); // L: 9979
								Client.packetWriter.addNode(var9); // L: 9980
								Client.field743 = 0; // L: 9981
								class378.field4437 = class133.getWidget(var1); // L: 9982
								Client.field619 = var0; // L: 9983
							} else if (var2 == 35) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3094, Client.packetWriter.isaacCipher); // L: 10070
								var9.packetBuffer.method8683(var0); // L: 10071
								var9.packetBuffer.writeIntME(var4); // L: 10072
								var9.packetBuffer.method8696(var1); // L: 10073
								Client.packetWriter.addNode(var9); // L: 10074
								Client.field743 = 0; // L: 10075
								class378.field4437 = class133.getWidget(var1); // L: 10076
								Client.field619 = var0; // L: 10077
							} else if (var2 == 36) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 10000
								var9.packetBuffer.method8696(var1); // L: 10001
								var9.packetBuffer.method8682(var0); // L: 10002
								var9.packetBuffer.method8682(var4); // L: 10003
								Client.packetWriter.addNode(var9); // L: 10004
								Client.field743 = 0; // L: 10005
								class378.field4437 = class133.getWidget(var1); // L: 10006
								Client.field619 = var0; // L: 10007
							} else if (var2 == 37) {
								var9 = Renderable.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 9676
								var9.packetBuffer.writeShort(var0); // L: 9677
								var9.packetBuffer.writeInt(var1); // L: 9678
								var9.packetBuffer.method8682(var4); // L: 9679
								Client.packetWriter.addNode(var9); // L: 9680
								Client.field743 = 0; // L: 9681
								class378.field4437 = class133.getWidget(var1); // L: 9682
								Client.field619 = var0; // L: 9683
							} else {
								if (var2 == 38) {
									class18.Widget_runOnTargetLeave(); // L: 9462
									var17 = class133.getWidget(var1); // L: 9463
									Client.isItemSelected = 1; // L: 9464
									WorldMapIcon_0.selectedItemSlot = var0; // L: 9465
									WorldMapLabel.selectedItemWidget = var1; // L: 9466
									class131.selectedItemId = var4; // L: 9467
									LoginScreenAnimation.invalidateWidget(var17); // L: 9468
									Client.selectedItemName = class149.colorStartTag(16748608) + TileItem.ItemComposition_get(var4).name + class149.colorStartTag(16777215); // L: 9469
									if (Client.selectedItemName == null) { // L: 9470
										Client.selectedItemName = "null";
									}

									return; // L: 9471
								}

								if (var2 == 39) {
									var9 = Renderable.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher); // L: 9810
									var9.packetBuffer.writeShort(var4); // L: 9811
									var9.packetBuffer.writeShort(var0); // L: 9812
									var9.packetBuffer.writeInt(var1); // L: 9813
									Client.packetWriter.addNode(var9); // L: 9814
									Client.field743 = 0; // L: 9815
									class378.field4437 = class133.getWidget(var1); // L: 9816
									Client.field619 = var0; // L: 9817
								} else if (var2 == 40) {
									var9 = Renderable.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 10119
									var9.packetBuffer.method8683(var0); // L: 10120
									var9.packetBuffer.method8683(var4); // L: 10121
									var9.packetBuffer.method8846(var1); // L: 10122
									Client.packetWriter.addNode(var9); // L: 10123
									Client.field743 = 0; // L: 10124
									class378.field4437 = class133.getWidget(var1); // L: 10125
									Client.field619 = var0; // L: 10126
								} else if (var2 == 41) {
									var9 = Renderable.getPacketBufferNode(ClientPacket.field3099, Client.packetWriter.isaacCipher); // L: 9799
									var9.packetBuffer.method8846(var1); // L: 9800
									var9.packetBuffer.writeShort(var4); // L: 9801
									var9.packetBuffer.writeShort(var0); // L: 9802
									Client.packetWriter.addNode(var9); // L: 9803
									Client.field743 = 0; // L: 9804
									class378.field4437 = class133.getWidget(var1); // L: 9805
									Client.field619 = var0; // L: 9806
								} else if (var2 == 42) {
									var9 = Renderable.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher); // L: 9577
									var9.packetBuffer.writeShort(var4); // L: 9578
									var9.packetBuffer.method8682(var0); // L: 9579
									var9.packetBuffer.method8648(var1); // L: 9580
									Client.packetWriter.addNode(var9); // L: 9581
									Client.field743 = 0; // L: 9582
									class378.field4437 = class133.getWidget(var1); // L: 9583
									Client.field619 = var0; // L: 9584
								} else if (var2 == 43) {
									var9 = Renderable.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher); // L: 9619
									var9.packetBuffer.writeIntME(var4); // L: 9620
									var9.packetBuffer.method8682(var0); // L: 9621
									var9.packetBuffer.writeInt(var1); // L: 9622
									Client.packetWriter.addNode(var9); // L: 9623
									Client.field743 = 0; // L: 9624
									class378.field4437 = class133.getWidget(var1); // L: 9625
									Client.field619 = var0; // L: 9626
								} else if (var2 == 44) {
									var16 = Client.players[var3]; // L: 10080
									if (var16 != null) { // L: 10081
										Client.mouseCrossX = var7; // L: 10082
										Client.mouseCrossY = var8; // L: 10083
										Client.mouseCrossColor = 2; // L: 10084
										Client.mouseCrossState = 0; // L: 10085
										Client.destinationX = var0; // L: 10086
										Client.destinationY = var1; // L: 10087
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3082, Client.packetWriter.isaacCipher); // L: 10089
										var10.packetBuffer.writeIntME(var3); // L: 10090
										var10.packetBuffer.method8765(Client.field702.method4143(82) ? 1 : 0); // L: 10091
										Client.packetWriter.addNode(var10); // L: 10092
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3]; // L: 10032
									if (var16 != null) { // L: 10033
										Client.mouseCrossX = var7; // L: 10034
										Client.mouseCrossY = var8; // L: 10035
										Client.mouseCrossColor = 2; // L: 10036
										Client.mouseCrossState = 0; // L: 10037
										Client.destinationX = var0; // L: 10038
										Client.destinationY = var1; // L: 10039
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 10041
										var10.packetBuffer.method8683(var3); // L: 10042
										var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0); // L: 10043
										Client.packetWriter.addNode(var10); // L: 10044
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3]; // L: 9587
									if (var16 != null) { // L: 9588
										Client.mouseCrossX = var7; // L: 9589
										Client.mouseCrossY = var8; // L: 9590
										Client.mouseCrossColor = 2; // L: 9591
										Client.mouseCrossState = 0; // L: 9592
										Client.destinationX = var0; // L: 9593
										Client.destinationY = var1; // L: 9594
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher); // L: 9596
										var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0); // L: 9597
										var10.packetBuffer.method8683(var3); // L: 9598
										Client.packetWriter.addNode(var10); // L: 9599
									}
								} else if (var2 == 47) {
									var16 = Client.players[var3]; // L: 9737
									if (var16 != null) { // L: 9738
										Client.mouseCrossX = var7; // L: 9739
										Client.mouseCrossY = var8; // L: 9740
										Client.mouseCrossColor = 2; // L: 9741
										Client.mouseCrossState = 0; // L: 9742
										Client.destinationX = var0; // L: 9743
										Client.destinationY = var1; // L: 9744
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3149, Client.packetWriter.isaacCipher); // L: 9746
										var10.packetBuffer.writeShort(var3); // L: 9747
										var10.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 9748
										Client.packetWriter.addNode(var10); // L: 9749
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3]; // L: 9753
									if (var16 != null) { // L: 9754
										Client.mouseCrossX = var7; // L: 9755
										Client.mouseCrossY = var8; // L: 9756
										Client.mouseCrossColor = 2; // L: 9757
										Client.mouseCrossState = 0; // L: 9758
										Client.destinationX = var0; // L: 9759
										Client.destinationY = var1; // L: 9760
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher); // L: 9762
										var10.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 9763
										var10.packetBuffer.method8682(var3); // L: 9764
										Client.packetWriter.addNode(var10); // L: 9765
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3]; // L: 9852
									if (var16 != null) { // L: 9853
										Client.mouseCrossX = var7; // L: 9854
										Client.mouseCrossY = var8; // L: 9855
										Client.mouseCrossColor = 2; // L: 9856
										Client.mouseCrossState = 0; // L: 9857
										Client.destinationX = var0; // L: 9858
										Client.destinationY = var1; // L: 9859
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 9861
										var10.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 9862
										var10.packetBuffer.writeShort(var3); // L: 9863
										Client.packetWriter.addNode(var10); // L: 9864
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3]; // L: 9527
									if (var16 != null) { // L: 9528
										Client.mouseCrossX = var7; // L: 9529
										Client.mouseCrossY = var8; // L: 9530
										Client.mouseCrossColor = 2; // L: 9531
										Client.mouseCrossState = 0; // L: 9532
										Client.destinationX = var0; // L: 9533
										Client.destinationY = var1; // L: 9534
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3070, Client.packetWriter.isaacCipher); // L: 9536
										var10.packetBuffer.writeIntME(var3); // L: 9537
										var10.packetBuffer.method8673(Client.field702.method4143(82) ? 1 : 0); // L: 9538
										Client.packetWriter.addNode(var10); // L: 9539
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3]; // L: 9836
									if (var16 != null) { // L: 9837
										Client.mouseCrossX = var7; // L: 9838
										Client.mouseCrossY = var8; // L: 9839
										Client.mouseCrossColor = 2; // L: 9840
										Client.mouseCrossState = 0; // L: 9841
										Client.destinationX = var0; // L: 9842
										Client.destinationY = var1; // L: 9843
										var10 = Renderable.getPacketBufferNode(ClientPacket.field3072, Client.packetWriter.isaacCipher); // L: 9845
										var10.packetBuffer.writeByte(Client.field702.method4143(82) ? 1 : 0); // L: 9846
										var10.packetBuffer.method8683(var3); // L: 9847
										Client.packetWriter.addNode(var10); // L: 9848
									}
								} else {
									label651: {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = class135.getWidgetChild(var1, var0); // L: 10096
												if (var17 != null) { // L: 10097
													if (var17.field3664 != null) { // L: 10098
														ScriptEvent var19 = new ScriptEvent(); // L: 10099
														var19.widget = var17; // L: 10100
														var19.opIndex = var3; // L: 10101
														var19.targetName = var6; // L: 10102
														var19.args = var17.field3664; // L: 10103
														WorldMapAreaData.runScriptEvent(var19); // L: 10104
													}

													var10 = Renderable.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 10107
													var10.packetBuffer.method8682(var0); // L: 10108
													var10.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 10109
													var10.packetBuffer.method8696(class9.selectedSpellWidget); // L: 10110
													var10.packetBuffer.method8682(var4); // L: 10111
													var10.packetBuffer.method8683(Client.selectedSpellChildIndex); // L: 10112
													var10.packetBuffer.method8696(var1); // L: 10113
													Client.packetWriter.addNode(var10); // L: 10114
												}
												break label651;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var7; // L: 10153
												Client.mouseCrossY = var8; // L: 10154
												Client.mouseCrossColor = 2; // L: 10155
												Client.mouseCrossState = 0; // L: 10156
												Client.destinationX = var0; // L: 10157
												Client.destinationY = var1; // L: 10158
												var9 = Renderable.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 10160
												var9.packetBuffer.method8682(Client.baseY * 64 + var1); // L: 10161
												var9.packetBuffer.method8682(ParamComposition.baseX * 64 + var0); // L: 10162
												var9.packetBuffer.method8683(var3); // L: 10163
												var9.packetBuffer.method8674(Client.field702.method4143(82) ? 1 : 0); // L: 10164
												Client.packetWriter.addNode(var9); // L: 10165
												break label651;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var7; // L: 10010
												Client.mouseCrossY = var8; // L: 10011
												Client.mouseCrossColor = 2; // L: 10012
												Client.mouseCrossState = 0; // L: 10013
												var9 = Renderable.getPacketBufferNode(ClientPacket.field3061, Client.packetWriter.isaacCipher); // L: 10015
												var9.packetBuffer.writeIntME(var3); // L: 10016
												Client.packetWriter.addNode(var9); // L: 10017
												break label651;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var7; // L: 9428
												Client.mouseCrossY = var8; // L: 9429
												Client.mouseCrossColor = 2; // L: 9430
												Client.mouseCrossState = 0; // L: 9431
												var14 = Client.npcs[var3]; // L: 9432
												if (var14 != null) { // L: 9433
													NPCComposition var18 = var14.definition; // L: 9434
													if (var18.transforms != null) { // L: 9435
														var18 = var18.transform();
													}

													if (var18 != null) { // L: 9436
														var11 = Renderable.getPacketBufferNode(ClientPacket.field3081, Client.packetWriter.isaacCipher); // L: 9438
														var11.packetBuffer.method8682(var18.id); // L: 9439
														Client.packetWriter.addNode(var11); // L: 9440
													}
												}
												break label651;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var7; // L: 9492
												Client.mouseCrossY = var8; // L: 9493
												Client.mouseCrossColor = 2; // L: 9494
												Client.mouseCrossState = 0; // L: 9495
												var9 = Renderable.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 9497
												var9.packetBuffer.method8682(var3); // L: 9498
												var9.packetBuffer.writeShort(ParamComposition.baseX * 64 + var0); // L: 9499
												var9.packetBuffer.method8682(Client.baseY * 64 + var1); // L: 9500
												Client.packetWriter.addNode(var9); // L: 9501
												break label651;
											}

											if (var2 == 1005) {
												var17 = class133.getWidget(var1); // L: 9986
												if (var17 != null && var17.itemQuantities[var0] >= 100000) { // L: 9987
													class280.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + TileItem.ItemComposition_get(var4).name);
												} else {
													var10 = Renderable.getPacketBufferNode(ClientPacket.field3092, Client.packetWriter.isaacCipher); // L: 9990
													var10.packetBuffer.writeIntME(var4); // L: 9991
													Client.packetWriter.addNode(var10); // L: 9992
												}

												Client.field743 = 0; // L: 9994
												class378.field4437 = class133.getWidget(var1); // L: 9995
												Client.field619 = var0; // L: 9996
												break label651;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1011 || var2 == 1010 || var2 == 1008 || var2 == 1012) {
													GrandExchangeOfferUnitPriceComparator.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9558
												}
												break label651;
											}
										}

										var17 = class135.getWidgetChild(var1, var0); // L: 10048
										if (var17 != null) { // L: 10049
											class16.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 10050
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 10215
			Client.isItemSelected = 0; // L: 10216
			LoginScreenAnimation.invalidateWidget(class133.getWidget(WorldMapLabel.selectedItemWidget)); // L: 10217
		}

		if (Client.isSpellSelected) { // L: 10219
			class18.Widget_runOnTargetLeave();
		}

		if (class378.field4437 != null && Client.field743 == 0) { // L: 10220
			LoginScreenAnimation.invalidateWidget(class378.field4437);
		}

	} // L: 10221
}
