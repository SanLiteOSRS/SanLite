import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Ljc;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 781571635
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -212963879
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 486699853
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "972666705"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "317226197"
	)
	static final void method5389(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 8888
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1) { // L: 8889
			Client.mouseCrossX = var7; // L: 9100
			Client.mouseCrossY = var8; // L: 9101
			Client.mouseCrossColor = 2; // L: 9102
			Client.mouseCrossState = 0; // L: 9103
			Client.destinationX = var0; // L: 9104
			Client.destinationY = var1; // L: 9105
			var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3080, Client.packetWriter.isaacCipher); // L: 9107
			var9.packetBuffer.method8619(class1.selectedItemSlot); // L: 9108
			var9.packetBuffer.method8619(class69.selectedItemId); // L: 9109
			var9.packetBuffer.writeShort(class158.baseY * 64 + var1); // L: 9110
			var9.packetBuffer.method8443(class26.baseX * 64 + var0); // L: 9111
			var9.packetBuffer.method8437(class230.selectedItemWidget); // L: 9112
			var9.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 9113
			var9.packetBuffer.method8619(var3); // L: 9114
			Client.packetWriter.addNode(var9); // L: 9115
		} else if (var2 == 2) {
			Client.mouseCrossX = var7; // L: 9520
			Client.mouseCrossY = var8; // L: 9521
			Client.mouseCrossColor = 2; // L: 9522
			Client.mouseCrossState = 0; // L: 9523
			Client.destinationX = var0; // L: 9524
			Client.destinationY = var1; // L: 9525
			var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3050, Client.packetWriter.isaacCipher); // L: 9526
			var9.packetBuffer.method8635(class124.selectedSpellWidget); // L: 9527
			var9.packetBuffer.method8619(var3); // L: 9528
			var9.packetBuffer.writeIntME(class158.baseY * 64 + var1); // L: 9529
			var9.packetBuffer.method8619(Client.selectedSpellItemId); // L: 9530
			var9.packetBuffer.method8443(Client.selectedSpellChildIndex); // L: 9531
			var9.packetBuffer.method8443(class26.baseX * 64 + var0); // L: 9532
			var9.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9533
			Client.packetWriter.addNode(var9); // L: 9534
		} else if (var2 == 3) {
			Client.mouseCrossX = var7; // L: 9471
			Client.mouseCrossY = var8; // L: 9472
			Client.mouseCrossColor = 2; // L: 9473
			Client.mouseCrossState = 0; // L: 9474
			Client.destinationX = var0; // L: 9475
			Client.destinationY = var1; // L: 9476
			var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3078, Client.packetWriter.isaacCipher); // L: 9478
			var9.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9479
			var9.packetBuffer.method8619(class26.baseX * 64 + var0); // L: 9480
			var9.packetBuffer.method8443(class158.baseY * 64 + var1); // L: 9481
			var9.packetBuffer.writeShort(var3); // L: 9482
			Client.packetWriter.addNode(var9); // L: 9483
		} else if (var2 == 4) {
			Client.mouseCrossX = var7; // L: 9631
			Client.mouseCrossY = var8; // L: 9632
			Client.mouseCrossColor = 2; // L: 9633
			Client.mouseCrossState = 0; // L: 9634
			Client.destinationX = var0; // L: 9635
			Client.destinationY = var1; // L: 9636
			var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3089, Client.packetWriter.isaacCipher); // L: 9638
			var9.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9639
			var9.packetBuffer.writeShort(class26.baseX * 64 + var0); // L: 9640
			var9.packetBuffer.method8619(var3); // L: 9641
			var9.packetBuffer.writeIntME(class158.baseY * 64 + var1); // L: 9642
			Client.packetWriter.addNode(var9); // L: 9643
		} else if (var2 == 5) {
			Client.mouseCrossX = var7; // L: 9564
			Client.mouseCrossY = var8; // L: 9565
			Client.mouseCrossColor = 2; // L: 9566
			Client.mouseCrossState = 0; // L: 9567
			Client.destinationX = var0; // L: 9568
			Client.destinationY = var1; // L: 9569
			var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3007, Client.packetWriter.isaacCipher); // L: 9571
			var9.packetBuffer.method8619(class158.baseY * 64 + var1); // L: 9572
			var9.packetBuffer.method8619(class26.baseX * 64 + var0); // L: 9573
			var9.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 9574
			var9.packetBuffer.writeIntME(var3); // L: 9575
			Client.packetWriter.addNode(var9); // L: 9576
		} else if (var2 == 6) {
			Client.mouseCrossX = var7; // L: 9271
			Client.mouseCrossY = var8; // L: 9272
			Client.mouseCrossColor = 2; // L: 9273
			Client.mouseCrossState = 0; // L: 9274
			Client.destinationX = var0; // L: 9275
			Client.destinationY = var1; // L: 9276
			var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3010, Client.packetWriter.isaacCipher); // L: 9278
			var9.packetBuffer.method8443(class26.baseX * 64 + var0); // L: 9279
			var9.packetBuffer.method8630(Client.field733.method3956(82) ? 1 : 0); // L: 9280
			var9.packetBuffer.method8619(var3); // L: 9281
			var9.packetBuffer.method8443(class158.baseY * 64 + var1); // L: 9282
			Client.packetWriter.addNode(var9); // L: 9283
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3]; // L: 9252
				if (var14 != null) { // L: 9253
					Client.mouseCrossX = var7; // L: 9254
					Client.mouseCrossY = var8; // L: 9255
					Client.mouseCrossColor = 2; // L: 9256
					Client.mouseCrossState = 0; // L: 9257
					Client.destinationX = var0; // L: 9258
					Client.destinationY = var1; // L: 9259
					var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3068, Client.packetWriter.isaacCipher); // L: 9261
					var10.packetBuffer.method8443(class1.selectedItemSlot); // L: 9262
					var10.packetBuffer.writeIntME(class69.selectedItemId); // L: 9263
					var10.packetBuffer.method8619(var3); // L: 9264
					var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9265
					var10.packetBuffer.writeInt(class230.selectedItemWidget); // L: 9266
					Client.packetWriter.addNode(var10); // L: 9267
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3]; // L: 9315
				if (var14 != null) { // L: 9316
					Client.mouseCrossX = var7; // L: 9317
					Client.mouseCrossY = var8; // L: 9318
					Client.mouseCrossColor = 2; // L: 9319
					Client.mouseCrossState = 0; // L: 9320
					Client.destinationX = var0; // L: 9321
					Client.destinationY = var1; // L: 9322
					var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3076, Client.packetWriter.isaacCipher); // L: 9323
					var10.packetBuffer.method8443(var3); // L: 9324
					var10.packetBuffer.method8619(Client.selectedSpellChildIndex); // L: 9325
					var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9326
					var10.packetBuffer.method8619(Client.selectedSpellItemId); // L: 9327
					var10.packetBuffer.method8635(class124.selectedSpellWidget); // L: 9328
					Client.packetWriter.addNode(var10); // L: 9329
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3]; // L: 9646
				if (var14 != null) { // L: 9647
					Client.mouseCrossX = var7; // L: 9648
					Client.mouseCrossY = var8; // L: 9649
					Client.mouseCrossColor = 2; // L: 9650
					Client.mouseCrossState = 0; // L: 9651
					Client.destinationX = var0; // L: 9652
					Client.destinationY = var1; // L: 9653
					var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3026, Client.packetWriter.isaacCipher); // L: 9655
					var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9656
					var10.packetBuffer.writeShort(var3); // L: 9657
					Client.packetWriter.addNode(var10); // L: 9658
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3]; // L: 9579
				if (var14 != null) { // L: 9580
					Client.mouseCrossX = var7; // L: 9581
					Client.mouseCrossY = var8; // L: 9582
					Client.mouseCrossColor = 2; // L: 9583
					Client.mouseCrossState = 0; // L: 9584
					Client.destinationX = var0; // L: 9585
					Client.destinationY = var1; // L: 9586
					var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3079, Client.packetWriter.isaacCipher); // L: 9588
					var10.packetBuffer.method8619(var3); // L: 9589
					var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 9590
					Client.packetWriter.addNode(var10); // L: 9591
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3]; // L: 9236
				if (var14 != null) { // L: 9237
					Client.mouseCrossX = var7; // L: 9238
					Client.mouseCrossY = var8; // L: 9239
					Client.mouseCrossColor = 2; // L: 9240
					Client.mouseCrossState = 0; // L: 9241
					Client.destinationX = var0; // L: 9242
					Client.destinationY = var1; // L: 9243
					var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3013, Client.packetWriter.isaacCipher); // L: 9245
					var10.packetBuffer.method8619(var3); // L: 9246
					var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9247
					Client.packetWriter.addNode(var10); // L: 9248
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3]; // L: 9504
				if (var14 != null) { // L: 9505
					Client.mouseCrossX = var7; // L: 9506
					Client.mouseCrossY = var8; // L: 9507
					Client.mouseCrossColor = 2; // L: 9508
					Client.mouseCrossState = 0; // L: 9509
					Client.destinationX = var0; // L: 9510
					Client.destinationY = var1; // L: 9511
					var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3035, Client.packetWriter.isaacCipher); // L: 9513
					var10.packetBuffer.writeIntME(var3); // L: 9514
					var10.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9515
					Client.packetWriter.addNode(var10); // L: 9516
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3]; // L: 9548
				if (var14 != null) { // L: 9549
					Client.mouseCrossX = var7; // L: 9550
					Client.mouseCrossY = var8; // L: 9551
					Client.mouseCrossColor = 2; // L: 9552
					Client.mouseCrossState = 0; // L: 9553
					Client.destinationX = var0; // L: 9554
					Client.destinationY = var1; // L: 9555
					var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3005, Client.packetWriter.isaacCipher); // L: 9557
					var10.packetBuffer.method8443(var3); // L: 9558
					var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9559
					Client.packetWriter.addNode(var10); // L: 9560
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3]; // L: 8953
					if (var16 != null) { // L: 8954
						Client.mouseCrossX = var7; // L: 8955
						Client.mouseCrossY = var8; // L: 8956
						Client.mouseCrossColor = 2; // L: 8957
						Client.mouseCrossState = 0; // L: 8958
						Client.destinationX = var0; // L: 8959
						Client.destinationY = var1; // L: 8960
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher); // L: 8962
						var10.packetBuffer.method8635(class230.selectedItemWidget); // L: 8963
						var10.packetBuffer.method8443(class1.selectedItemSlot); // L: 8964
						var10.packetBuffer.method8443(class69.selectedItemId); // L: 8965
						var10.packetBuffer.method8619(var3); // L: 8966
						var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 8967
						Client.packetWriter.addNode(var10); // L: 8968
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3]; // L: 8988
					if (var16 != null) { // L: 8989
						Client.mouseCrossX = var7; // L: 8990
						Client.mouseCrossY = var8; // L: 8991
						Client.mouseCrossColor = 2; // L: 8992
						Client.mouseCrossState = 0; // L: 8993
						Client.destinationX = var0; // L: 8994
						Client.destinationY = var1; // L: 8995
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3102, Client.packetWriter.isaacCipher); // L: 8996
						var10.packetBuffer.method8437(class124.selectedSpellWidget); // L: 8997
						var10.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 8998
						var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 8999
						var10.packetBuffer.method8619(Client.selectedSpellChildIndex); // L: 9000
						var10.packetBuffer.method8443(var3); // L: 9001
						Client.packetWriter.addNode(var10); // L: 9002
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7; // L: 9486
					Client.mouseCrossY = var8; // L: 9487
					Client.mouseCrossColor = 2; // L: 9488
					Client.mouseCrossState = 0; // L: 9489
					Client.destinationX = var0; // L: 9490
					Client.destinationY = var1; // L: 9491
					var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher); // L: 9493
					var9.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9494
					var9.packetBuffer.method8619(class158.baseY * 64 + var1); // L: 9495
					var9.packetBuffer.writeIntME(class69.selectedItemId); // L: 9496
					var9.packetBuffer.method8443(var3); // L: 9497
					var9.packetBuffer.method8453(class230.selectedItemWidget); // L: 9498
					var9.packetBuffer.writeIntME(class1.selectedItemSlot); // L: 9499
					var9.packetBuffer.writeShort(class26.baseX * 64 + var0); // L: 9500
					Client.packetWriter.addNode(var9); // L: 9501
				} else if (var2 == 17) {
					Client.mouseCrossX = var7; // L: 9401
					Client.mouseCrossY = var8; // L: 9402
					Client.mouseCrossColor = 2; // L: 9403
					Client.mouseCrossState = 0; // L: 9404
					Client.destinationX = var0; // L: 9405
					Client.destinationY = var1; // L: 9406
					var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3044, Client.packetWriter.isaacCipher); // L: 9407
					var9.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9408
					var9.packetBuffer.writeIntME(class158.baseY * 64 + var1); // L: 9409
					var9.packetBuffer.method8453(class124.selectedSpellWidget); // L: 9410
					var9.packetBuffer.method8630(Client.field733.method3956(82) ? 1 : 0); // L: 9411
					var9.packetBuffer.writeIntME(class26.baseX * 64 + var0); // L: 9412
					var9.packetBuffer.writeIntME(var3); // L: 9413
					var9.packetBuffer.method8619(Client.selectedSpellItemId); // L: 9414
					Client.packetWriter.addNode(var9); // L: 9415
				} else if (var2 == 18) {
					Client.mouseCrossX = var7; // L: 9603
					Client.mouseCrossY = var8; // L: 9604
					Client.mouseCrossColor = 2; // L: 9605
					Client.mouseCrossState = 0; // L: 9606
					Client.destinationX = var0; // L: 9607
					Client.destinationY = var1; // L: 9608
					var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3037, Client.packetWriter.isaacCipher); // L: 9610
					var9.packetBuffer.writeShort(var3); // L: 9611
					var9.packetBuffer.method8443(class26.baseX * 64 + var0); // L: 9612
					var9.packetBuffer.method8630(Client.field733.method3956(82) ? 1 : 0); // L: 9613
					var9.packetBuffer.writeIntME(class158.baseY * 64 + var1); // L: 9614
					Client.packetWriter.addNode(var9); // L: 9615
				} else if (var2 == 19) {
					Client.mouseCrossX = var7; // L: 9206
					Client.mouseCrossY = var8; // L: 9207
					Client.mouseCrossColor = 2; // L: 9208
					Client.mouseCrossState = 0; // L: 9209
					Client.destinationX = var0; // L: 9210
					Client.destinationY = var1; // L: 9211
					var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3063, Client.packetWriter.isaacCipher); // L: 9213
					var9.packetBuffer.method8443(class158.baseY * 64 + var1); // L: 9214
					var9.packetBuffer.writeIntME(var3); // L: 9215
					var9.packetBuffer.method8630(Client.field733.method3956(82) ? 1 : 0); // L: 9216
					var9.packetBuffer.writeShort(class26.baseX * 64 + var0); // L: 9217
					Client.packetWriter.addNode(var9); // L: 9218
				} else if (var2 == 20) {
					Client.mouseCrossX = var7; // L: 9418
					Client.mouseCrossY = var8; // L: 9419
					Client.mouseCrossColor = 2; // L: 9420
					Client.mouseCrossState = 0; // L: 9421
					Client.destinationX = var0; // L: 9422
					Client.destinationY = var1; // L: 9423
					var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3049, Client.packetWriter.isaacCipher); // L: 9425
					var9.packetBuffer.writeShort(class26.baseX * 64 + var0); // L: 9426
					var9.packetBuffer.method8443(class158.baseY * 64 + var1); // L: 9427
					var9.packetBuffer.writeIntME(var3); // L: 9428
					var9.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 9429
					Client.packetWriter.addNode(var9); // L: 9430
				} else if (var2 == 21) {
					Client.mouseCrossX = var7; // L: 9130
					Client.mouseCrossY = var8; // L: 9131
					Client.mouseCrossColor = 2; // L: 9132
					Client.mouseCrossState = 0; // L: 9133
					Client.destinationX = var0; // L: 9134
					Client.destinationY = var1; // L: 9135
					var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3011, Client.packetWriter.isaacCipher); // L: 9137
					var9.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9138
					var9.packetBuffer.writeIntME(class158.baseY * 64 + var1); // L: 9139
					var9.packetBuffer.writeIntME(class26.baseX * 64 + var0); // L: 9140
					var9.packetBuffer.method8443(var3); // L: 9141
					Client.packetWriter.addNode(var9); // L: 9142
				} else if (var2 == 22) {
					Client.mouseCrossX = var7; // L: 9221
					Client.mouseCrossY = var8; // L: 9222
					Client.mouseCrossColor = 2; // L: 9223
					Client.mouseCrossState = 0; // L: 9224
					Client.destinationX = var0; // L: 9225
					Client.destinationY = var1; // L: 9226
					var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3041, Client.packetWriter.isaacCipher); // L: 9228
					var9.packetBuffer.method8443(class26.baseX * 64 + var0); // L: 9229
					var9.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9230
					var9.packetBuffer.method8443(var3); // L: 9231
					var9.packetBuffer.method8443(class158.baseY * 64 + var1); // L: 9232
					Client.packetWriter.addNode(var9); // L: 9233
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 9595
						class139.scene.setViewportWalking(); // L: 9596
					} else {
						class139.scene.menuOpen(ApproximateRouteStrategy.Client_plane, var0, var1, true); // L: 9599
					}
				} else {
					PacketBufferNode var11;
					Widget var17;
					if (var2 == 24) {
						var17 = class281.getWidget(var1); // L: 9444
						if (var17 != null) { // L: 9445
							boolean var13 = true; // L: 9446
							if (var17.contentType > 0) { // L: 9447
								var13 = MilliClock.method3373(var17);
							}

							if (var13) { // L: 9448
								var11 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher); // L: 9450
								var11.packetBuffer.writeInt(var1); // L: 9451
								Client.packetWriter.addNode(var11); // L: 9452
							}
						}
					} else {
						if (var2 == 25) {
							var17 = WorldMapDecoration.getWidgetChild(var1, var0); // L: 9681
							if (var17 != null) { // L: 9682
								class101.Widget_runOnTargetLeave(); // L: 9683
								class238.selectSpell(var1, var0, class167.Widget_unpackTargetMask(class197.getWidgetFlags(var17)), var4); // L: 9684
								Client.isItemSelected = 0; // L: 9685
								Client.selectedSpellActionName = class313.Widget_getSpellActionName(var17); // L: 9686
								if (Client.selectedSpellActionName == null) { // L: 9687
									Client.selectedSpellActionName = "null";
								}

								if (var17.isIf3) { // L: 9688
									Client.selectedSpellName = var17.dataText + GameObject.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = GameObject.colorStartTag(65280) + var17.spellName + GameObject.colorStartTag(16777215); // L: 9689
								}
							}

							return; // L: 9691
						}

						if (var2 == 26) {
							class354.method6769(); // L: 9678
						} else {
							int var12;
							Widget var15;
							if (var2 == 28) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher); // L: 9157
								var9.packetBuffer.writeInt(var1); // L: 9158
								Client.packetWriter.addNode(var9); // L: 9159
								var15 = class281.getWidget(var1); // L: 9160
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9161
									var12 = var15.cs1Instructions[0][1]; // L: 9162
									Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12]; // L: 9163
									ClanChannel.changeGameOptions(var12); // L: 9164
								}
							} else if (var2 == 29) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher); // L: 9458
								var9.packetBuffer.writeInt(var1); // L: 9459
								Client.packetWriter.addNode(var9); // L: 9460
								var15 = class281.getWidget(var1); // L: 9461
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9462
									var12 = var15.cs1Instructions[0][1]; // L: 9463
									if (Varps.Varps_main[var12] != var15.cs1ComparisonValues[0]) { // L: 9464
										Varps.Varps_main[var12] = var15.cs1ComparisonValues[0]; // L: 9465
										ClanChannel.changeGameOptions(var12); // L: 9466
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9378
									class453.resumePauseWidget(var1, var0); // L: 9379
									Client.meslayerContinueWidget = WorldMapDecoration.getWidgetChild(var1, var0); // L: 9380
									class143.invalidateWidget(Client.meslayerContinueWidget); // L: 9381
								}
							} else if (var2 == 31) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3053, Client.packetWriter.isaacCipher); // L: 8914
								var9.packetBuffer.method8619(class1.selectedItemSlot); // L: 8915
								var9.packetBuffer.method8635(class230.selectedItemWidget); // L: 8916
								var9.packetBuffer.method8635(var1); // L: 8917
								var9.packetBuffer.writeShort(var0); // L: 8918
								var9.packetBuffer.writeIntME(var4); // L: 8919
								var9.packetBuffer.writeShort(class69.selectedItemId); // L: 8920
								Client.packetWriter.addNode(var9); // L: 8921
								Client.field697 = 0; // L: 8922
								class133.field1575 = class281.getWidget(var1); // L: 8923
								Client.field745 = var0; // L: 8924
							} else if (var2 == 32) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher); // L: 9619
								var9.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9620
								var9.packetBuffer.method8443(var0); // L: 9621
								var9.packetBuffer.method8437(var1); // L: 9622
								var9.packetBuffer.writeInt(class124.selectedSpellWidget); // L: 9623
								var9.packetBuffer.writeIntME(var4); // L: 9624
								Client.packetWriter.addNode(var9); // L: 9625
								Client.field697 = 0; // L: 9626
								class133.field1575 = class281.getWidget(var1); // L: 9627
								Client.field745 = var0; // L: 9628
							} else if (var2 == 33) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3024, Client.packetWriter.isaacCipher); // L: 9538
								var9.packetBuffer.writeShort(var4); // L: 9539
								var9.packetBuffer.writeShort(var0); // L: 9540
								var9.packetBuffer.writeInt(var1); // L: 9541
								Client.packetWriter.addNode(var9); // L: 9542
								Client.field697 = 0; // L: 9543
								class133.field1575 = class281.getWidget(var1); // L: 9544
								Client.field745 = var0; // L: 9545
							} else if (var2 == 34) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3061, Client.packetWriter.isaacCipher); // L: 9434
								var9.packetBuffer.method8619(var0); // L: 9435
								var9.packetBuffer.writeShort(var4); // L: 9436
								var9.packetBuffer.method8437(var1); // L: 9437
								Client.packetWriter.addNode(var9); // L: 9438
								Client.field697 = 0; // L: 9439
								class133.field1575 = class281.getWidget(var1); // L: 9440
								Client.field745 = var0; // L: 9441
							} else if (var2 == 35) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3048, Client.packetWriter.isaacCipher); // L: 9196
								var9.packetBuffer.writeInt(var1); // L: 9197
								var9.packetBuffer.method8443(var4); // L: 9198
								var9.packetBuffer.writeShort(var0); // L: 9199
								Client.packetWriter.addNode(var9); // L: 9200
								Client.field697 = 0; // L: 9201
								class133.field1575 = class281.getWidget(var1); // L: 9202
								Client.field745 = var0; // L: 9203
							} else if (var2 == 36) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3064, Client.packetWriter.isaacCipher); // L: 9146
								var9.packetBuffer.writeInt(var1); // L: 9147
								var9.packetBuffer.method8619(var0); // L: 9148
								var9.packetBuffer.writeIntME(var4); // L: 9149
								Client.packetWriter.addNode(var9); // L: 9150
								Client.field697 = 0; // L: 9151
								class133.field1575 = class281.getWidget(var1); // L: 9152
								Client.field745 = var0; // L: 9153
							} else if (var2 == 37) {
								var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3082, Client.packetWriter.isaacCipher); // L: 9046
								var9.packetBuffer.writeShort(var0); // L: 9047
								var9.packetBuffer.method8443(var4); // L: 9048
								var9.packetBuffer.method8453(var1); // L: 9049
								Client.packetWriter.addNode(var9); // L: 9050
								Client.field697 = 0; // L: 9051
								class133.field1575 = class281.getWidget(var1); // L: 9052
								Client.field745 = var0; // L: 9053
							} else {
								if (var2 == 38) {
									class101.Widget_runOnTargetLeave(); // L: 9118
									var17 = class281.getWidget(var1); // L: 9119
									Client.isItemSelected = 1; // L: 9120
									class1.selectedItemSlot = var0; // L: 9121
									class230.selectedItemWidget = var1; // L: 9122
									class69.selectedItemId = var4; // L: 9123
									class143.invalidateWidget(var17); // L: 9124
									Client.selectedItemName = GameObject.colorStartTag(16748608) + MidiPcmStream.ItemComposition_get(var4).name + GameObject.colorStartTag(16777215); // L: 9125
									if (Client.selectedItemName == null) { // L: 9126
										Client.selectedItemName = "null";
									}

									return; // L: 9127
								}

								if (var2 == 39) {
									var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3043, Client.packetWriter.isaacCipher); // L: 9185
									var9.packetBuffer.method8453(var1); // L: 9186
									var9.packetBuffer.writeIntME(var4); // L: 9187
									var9.packetBuffer.writeShort(var0); // L: 9188
									Client.packetWriter.addNode(var9); // L: 9189
									Client.field697 = 0; // L: 9190
									class133.field1575 = class281.getWidget(var1); // L: 9191
									Client.field745 = var0; // L: 9192
								} else if (var2 == 40) {
									var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3029, Client.packetWriter.isaacCipher); // L: 9068
									var9.packetBuffer.method8635(var1); // L: 9069
									var9.packetBuffer.writeShort(var0); // L: 9070
									var9.packetBuffer.method8443(var4); // L: 9071
									Client.packetWriter.addNode(var9); // L: 9072
									Client.field697 = 0; // L: 9073
									class133.field1575 = class281.getWidget(var1); // L: 9074
									Client.field745 = var0; // L: 9075
								} else if (var2 == 41) {
									var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3055, Client.packetWriter.isaacCipher); // L: 9007
									var9.packetBuffer.writeIntME(var4); // L: 9008
									var9.packetBuffer.writeInt(var1); // L: 9009
									var9.packetBuffer.writeShort(var0); // L: 9010
									Client.packetWriter.addNode(var9); // L: 9011
									Client.field697 = 0; // L: 9012
									class133.field1575 = class281.getWidget(var1); // L: 9013
									Client.field745 = var0; // L: 9014
								} else if (var2 == 42) {
									var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3060, Client.packetWriter.isaacCipher); // L: 9057
									var9.packetBuffer.writeIntME(var4); // L: 9058
									var9.packetBuffer.method8635(var1); // L: 9059
									var9.packetBuffer.writeIntME(var0); // L: 9060
									Client.packetWriter.addNode(var9); // L: 9061
									Client.field697 = 0; // L: 9062
									class133.field1575 = class281.getWidget(var1); // L: 9063
									Client.field745 = var0; // L: 9064
								} else if (var2 == 43) {
									var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3087, Client.packetWriter.isaacCipher); // L: 9368
									var9.packetBuffer.method8619(var4); // L: 9369
									var9.packetBuffer.method8437(var1); // L: 9370
									var9.packetBuffer.writeIntME(var0); // L: 9371
									Client.packetWriter.addNode(var9); // L: 9372
									Client.field697 = 0; // L: 9373
									class133.field1575 = class281.getWidget(var1); // L: 9374
									Client.field745 = var0; // L: 9375
								} else if (var2 == 44) {
									var16 = Client.players[var3]; // L: 9168
									if (var16 != null) { // L: 9169
										Client.mouseCrossX = var7; // L: 9170
										Client.mouseCrossY = var8; // L: 9171
										Client.mouseCrossColor = 2; // L: 9172
										Client.mouseCrossState = 0; // L: 9173
										Client.destinationX = var0; // L: 9174
										Client.destinationY = var1; // L: 9175
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3067, Client.packetWriter.isaacCipher); // L: 9177
										var10.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9178
										var10.packetBuffer.method8443(var3); // L: 9179
										Client.packetWriter.addNode(var10); // L: 9180
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3]; // L: 9351
									if (var16 != null) { // L: 9352
										Client.mouseCrossX = var7; // L: 9353
										Client.mouseCrossY = var8; // L: 9354
										Client.mouseCrossColor = 2; // L: 9355
										Client.mouseCrossState = 0; // L: 9356
										Client.destinationX = var0; // L: 9357
										Client.destinationY = var1; // L: 9358
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3047, Client.packetWriter.isaacCipher); // L: 9360
										var10.packetBuffer.method8619(var3); // L: 9361
										var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9362
										Client.packetWriter.addNode(var10); // L: 9363
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3]; // L: 8972
									if (var16 != null) { // L: 8973
										Client.mouseCrossX = var7; // L: 8974
										Client.mouseCrossY = var8; // L: 8975
										Client.mouseCrossColor = 2; // L: 8976
										Client.mouseCrossState = 0; // L: 8977
										Client.destinationX = var0; // L: 8978
										Client.destinationY = var1; // L: 8979
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3001, Client.packetWriter.isaacCipher); // L: 8981
										var10.packetBuffer.method8619(var3); // L: 8982
										var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 8983
										Client.packetWriter.addNode(var10); // L: 8984
									}
								} else if (var2 == 47) {
									var16 = Client.players[var3]; // L: 9017
									if (var16 != null) { // L: 9018
										Client.mouseCrossX = var7; // L: 9019
										Client.mouseCrossY = var8; // L: 9020
										Client.mouseCrossColor = 2; // L: 9021
										Client.mouseCrossState = 0; // L: 9022
										Client.destinationX = var0; // L: 9023
										Client.destinationY = var1; // L: 9024
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 9026
										var10.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9027
										var10.packetBuffer.writeIntME(var3); // L: 9028
										Client.packetWriter.addNode(var10); // L: 9029
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3]; // L: 9385
									if (var16 != null) { // L: 9386
										Client.mouseCrossX = var7; // L: 9387
										Client.mouseCrossY = var8; // L: 9388
										Client.mouseCrossColor = 2; // L: 9389
										Client.mouseCrossState = 0; // L: 9390
										Client.destinationX = var0; // L: 9391
										Client.destinationY = var1; // L: 9392
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3098, Client.packetWriter.isaacCipher); // L: 9394
										var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9395
										var10.packetBuffer.writeShort(var3); // L: 9396
										Client.packetWriter.addNode(var10); // L: 9397
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3]; // L: 9299
									if (var16 != null) { // L: 9300
										Client.mouseCrossX = var7; // L: 9301
										Client.mouseCrossY = var8; // L: 9302
										Client.mouseCrossColor = 2; // L: 9303
										Client.mouseCrossState = 0; // L: 9304
										Client.destinationX = var0; // L: 9305
										Client.destinationY = var1; // L: 9306
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3027, Client.packetWriter.isaacCipher); // L: 9308
										var10.packetBuffer.method8443(var3); // L: 9309
										var10.packetBuffer.method8434(Client.field733.method3956(82) ? 1 : 0); // L: 9310
										Client.packetWriter.addNode(var10); // L: 9311
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3]; // L: 8937
									if (var16 != null) { // L: 8938
										Client.mouseCrossX = var7; // L: 8939
										Client.mouseCrossY = var8; // L: 8940
										Client.mouseCrossColor = 2; // L: 8941
										Client.mouseCrossState = 0; // L: 8942
										Client.destinationX = var0; // L: 8943
										Client.destinationY = var1; // L: 8944
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3046, Client.packetWriter.isaacCipher); // L: 8946
										var10.packetBuffer.writeShort(var3); // L: 8947
										var10.packetBuffer.writeByte(Client.field733.method3956(82) ? 1 : 0); // L: 8948
										Client.packetWriter.addNode(var10); // L: 8949
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3]; // L: 9662
									if (var16 != null) { // L: 9663
										Client.mouseCrossX = var7; // L: 9664
										Client.mouseCrossY = var8; // L: 9665
										Client.mouseCrossColor = 2; // L: 9666
										Client.mouseCrossState = 0; // L: 9667
										Client.destinationX = var0; // L: 9668
										Client.destinationY = var1; // L: 9669
										var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3052, Client.packetWriter.isaacCipher); // L: 9671
										var10.packetBuffer.method8619(var3); // L: 9672
										var10.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9673
										Client.packetWriter.addNode(var10); // L: 9674
									}
								} else {
									label662: {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = WorldMapDecoration.getWidgetChild(var1, var0); // L: 9078
												if (var17 != null) { // L: 9079
													if (var17.field3594 != null) { // L: 9080
														ScriptEvent var19 = new ScriptEvent(); // L: 9081
														var19.widget = var17; // L: 9082
														var19.opIndex = var3; // L: 9083
														var19.targetName = var6; // L: 9084
														var19.args = var17.field3594; // L: 9085
														ServerPacket.runScriptEvent(var19); // L: 9086
													}

													var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3088, Client.packetWriter.isaacCipher); // L: 9089
													var10.packetBuffer.method8443(Client.selectedSpellItemId); // L: 9090
													var10.packetBuffer.method8443(var0); // L: 9091
													var10.packetBuffer.method8437(class124.selectedSpellWidget); // L: 9092
													var10.packetBuffer.writeShort(var4); // L: 9093
													var10.packetBuffer.method8453(var1); // L: 9094
													var10.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9095
													Client.packetWriter.addNode(var10); // L: 9096
												}
												break label662;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var7; // L: 9336
												Client.mouseCrossY = var8; // L: 9337
												Client.mouseCrossColor = 2; // L: 9338
												Client.mouseCrossState = 0; // L: 9339
												Client.destinationX = var0; // L: 9340
												Client.destinationY = var1; // L: 9341
												var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3021, Client.packetWriter.isaacCipher); // L: 9343
												var9.packetBuffer.method8443(class158.baseY * 64 + var1); // L: 9344
												var9.packetBuffer.writeShort(class26.baseX * 64 + var0); // L: 9345
												var9.packetBuffer.method8443(var3); // L: 9346
												var9.packetBuffer.method8546(Client.field733.method3956(82) ? 1 : 0); // L: 9347
												Client.packetWriter.addNode(var9); // L: 9348
												break label662;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var7; // L: 8927
												Client.mouseCrossY = var8; // L: 8928
												Client.mouseCrossColor = 2; // L: 8929
												Client.mouseCrossState = 0; // L: 8930
												var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3083, Client.packetWriter.isaacCipher); // L: 8932
												var9.packetBuffer.writeShort(var3); // L: 8933
												Client.packetWriter.addNode(var9); // L: 8934
												break label662;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var7; // L: 8896
												Client.mouseCrossY = var8; // L: 8897
												Client.mouseCrossColor = 2; // L: 8898
												Client.mouseCrossState = 0; // L: 8899
												var14 = Client.npcs[var3]; // L: 8900
												if (var14 != null) { // L: 8901
													NPCComposition var18 = var14.definition; // L: 8902
													if (var18.transforms != null) { // L: 8903
														var18 = var18.transform();
													}

													if (var18 != null) { // L: 8904
														var11 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3017, Client.packetWriter.isaacCipher); // L: 8906
														var11.packetBuffer.method8443(var18.id); // L: 8907
														Client.packetWriter.addNode(var11); // L: 8908
													}
												}
												break label662;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var7; // L: 9033
												Client.mouseCrossY = var8; // L: 9034
												Client.mouseCrossColor = 2; // L: 9035
												Client.mouseCrossState = 0; // L: 9036
												var9 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3095, Client.packetWriter.isaacCipher); // L: 9038
												var9.packetBuffer.writeShort(class26.baseX * 64 + var0); // L: 9039
												var9.packetBuffer.method8619(var3); // L: 9040
												var9.packetBuffer.writeShort(class158.baseY * 64 + var1); // L: 9041
												Client.packetWriter.addNode(var9); // L: 9042
												break label662;
											}

											if (var2 == 1005) {
												var17 = class281.getWidget(var1); // L: 9286
												if (var17 != null && var17.itemQuantities[var0] >= 100000) { // L: 9287
													MouseHandler.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + MidiPcmStream.ItemComposition_get(var4).name);
												} else {
													var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3096, Client.packetWriter.isaacCipher); // L: 9290
													var10.packetBuffer.writeIntME(var4); // L: 9291
													Client.packetWriter.addNode(var10); // L: 9292
												}

												Client.field697 = 0; // L: 9294
												class133.field1575 = class281.getWidget(var1); // L: 9295
												Client.field745 = var0; // L: 9296
												break label662;
											}

											if (var2 != 1007) {
												if (var2 == 1010 || var2 == 1008 || var2 == 1009 || var2 == 1011 || var2 == 1012) {
													class7.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9333
												}
												break label662;
											}
										}

										var17 = WorldMapDecoration.getWidgetChild(var1, var0); // L: 8890
										if (var17 != null) { // L: 8891
											class279.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 8892
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9693
			Client.isItemSelected = 0; // L: 9694
			class143.invalidateWidget(class281.getWidget(class230.selectedItemWidget)); // L: 9695
		}

		if (Client.isSpellSelected) { // L: 9697
			class101.Widget_runOnTargetLeave();
		}

		if (class133.field1575 != null && Client.field697 == 0) { // L: 9698
			class143.invalidateWidget(class133.field1575);
		}

	} // L: 9699
}
