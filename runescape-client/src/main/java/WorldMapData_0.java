import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "106235772"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field2984.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 64; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method8568(); // L: 19
			super.fileId = var1.method8568(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1703912011"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field2950 = new byte[super.planes][64][64]; // L: 28
		super.field2951 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class251.field2976.value) { // L: 32
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return super.regionX == var2.regionX && var2.regionY == super.regionY; // L: 53
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "649826417"
	)
	static final void method4844(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 8978
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1) { // L: 8979
			Client.mouseCrossX = var7; // L: 9136
			Client.mouseCrossY = var8; // L: 9137
			Client.mouseCrossColor = 2; // L: 9138
			Client.mouseCrossState = 0; // L: 9139
			Client.destinationX = var0; // L: 9140
			Client.destinationY = var1; // L: 9141
			var9 = class136.getPacketBufferNode(ClientPacket.field3069, Client.packetWriter.isaacCipher); // L: 9143
			var9.packetBuffer.method8607(var3); // L: 9144
			var9.packetBuffer.method8607(class365.baseY * 64 + var1); // L: 9145
			var9.packetBuffer.method8607(class101.selectedItemSlot); // L: 9146
			var9.packetBuffer.writeIntME(HealthBarUpdate.selectedItemId); // L: 9147
			var9.packetBuffer.method8599(ModeWhere.selectedItemWidget); // L: 9148
			var9.packetBuffer.writeIntME(class154.baseX * 64 + var0); // L: 9149
			var9.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 9150
			Client.packetWriter.addNode(var9); // L: 9151
		} else if (var2 == 2) {
			Client.mouseCrossX = var7; // L: 9724
			Client.mouseCrossY = var8; // L: 9725
			Client.mouseCrossColor = 2; // L: 9726
			Client.mouseCrossState = 0; // L: 9727
			Client.destinationX = var0; // L: 9728
			Client.destinationY = var1; // L: 9729
			var9 = class136.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 9730
			var9.packetBuffer.method8589(class154.baseX * 64 + var0); // L: 9731
			var9.packetBuffer.method8607(Client.selectedSpellChildIndex); // L: 9732
			var9.packetBuffer.method8600(class358.selectedSpellWidget); // L: 9733
			var9.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9734
			var9.packetBuffer.writeShort(class365.baseY * 64 + var1); // L: 9735
			var9.packetBuffer.method8579(Client.field747.method4106(82) ? 1 : 0); // L: 9736
			var9.packetBuffer.writeIntME(var3); // L: 9737
			Client.packetWriter.addNode(var9); // L: 9738
		} else if (var2 == 3) {
			Client.mouseCrossX = var7; // L: 8980
			Client.mouseCrossY = var8; // L: 8981
			Client.mouseCrossColor = 2; // L: 8982
			Client.mouseCrossState = 0; // L: 8983
			Client.destinationX = var0; // L: 8984
			Client.destinationY = var1; // L: 8985
			var9 = class136.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 8987
			var9.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 8988
			var9.packetBuffer.method8589(class154.baseX * 64 + var0); // L: 8989
			var9.packetBuffer.writeIntME(class365.baseY * 64 + var1); // L: 8990
			var9.packetBuffer.writeShort(var3); // L: 8991
			Client.packetWriter.addNode(var9); // L: 8992
		} else if (var2 == 4) {
			Client.mouseCrossX = var7; // L: 9350
			Client.mouseCrossY = var8; // L: 9351
			Client.mouseCrossColor = 2; // L: 9352
			Client.mouseCrossState = 0; // L: 9353
			Client.destinationX = var0; // L: 9354
			Client.destinationY = var1; // L: 9355
			var9 = class136.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher); // L: 9357
			var9.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9358
			var9.packetBuffer.method8607(var3); // L: 9359
			var9.packetBuffer.method8589(class365.baseY * 64 + var1); // L: 9360
			var9.packetBuffer.method8607(class154.baseX * 64 + var0); // L: 9361
			Client.packetWriter.addNode(var9); // L: 9362
		} else if (var2 == 5) {
			Client.mouseCrossX = var7; // L: 9365
			Client.mouseCrossY = var8; // L: 9366
			Client.mouseCrossColor = 2; // L: 9367
			Client.mouseCrossState = 0; // L: 9368
			Client.destinationX = var0; // L: 9369
			Client.destinationY = var1; // L: 9370
			var9 = class136.getPacketBufferNode(ClientPacket.field3080, Client.packetWriter.isaacCipher); // L: 9372
			var9.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9373
			var9.packetBuffer.method8589(class365.baseY * 64 + var1); // L: 9374
			var9.packetBuffer.writeIntME(class154.baseX * 64 + var0); // L: 9375
			var9.packetBuffer.writeIntME(var3); // L: 9376
			Client.packetWriter.addNode(var9); // L: 9377
		} else if (var2 == 6) {
			Client.mouseCrossX = var7; // L: 9409
			Client.mouseCrossY = var8; // L: 9410
			Client.mouseCrossColor = 2; // L: 9411
			Client.mouseCrossState = 0; // L: 9412
			Client.destinationX = var0; // L: 9413
			Client.destinationY = var1; // L: 9414
			var9 = class136.getPacketBufferNode(ClientPacket.field3071, Client.packetWriter.isaacCipher); // L: 9416
			var9.packetBuffer.writeShort(var3); // L: 9417
			var9.packetBuffer.method8579(Client.field747.method4106(82) ? 1 : 0); // L: 9418
			var9.packetBuffer.method8589(class365.baseY * 64 + var1); // L: 9419
			var9.packetBuffer.method8607(class154.baseX * 64 + var0); // L: 9420
			Client.packetWriter.addNode(var9); // L: 9421
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3]; // L: 9064
				if (var14 != null) { // L: 9065
					Client.mouseCrossX = var7; // L: 9066
					Client.mouseCrossY = var8; // L: 9067
					Client.mouseCrossColor = 2; // L: 9068
					Client.mouseCrossState = 0; // L: 9069
					Client.destinationX = var0; // L: 9070
					Client.destinationY = var1; // L: 9071
					var10 = class136.getPacketBufferNode(ClientPacket.field3082, Client.packetWriter.isaacCipher); // L: 9073
					var10.packetBuffer.method8600(ModeWhere.selectedItemWidget); // L: 9074
					var10.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9075
					var10.packetBuffer.method8589(var3); // L: 9076
					var10.packetBuffer.writeIntME(class101.selectedItemSlot); // L: 9077
					var10.packetBuffer.writeIntME(HealthBarUpdate.selectedItemId); // L: 9078
					Client.packetWriter.addNode(var10); // L: 9079
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3]; // L: 9639
				if (var14 != null) { // L: 9640
					Client.mouseCrossX = var7; // L: 9641
					Client.mouseCrossY = var8; // L: 9642
					Client.mouseCrossColor = 2; // L: 9643
					Client.mouseCrossState = 0; // L: 9644
					Client.destinationX = var0; // L: 9645
					Client.destinationY = var1; // L: 9646
					var10 = class136.getPacketBufferNode(ClientPacket.field3053, Client.packetWriter.isaacCipher); // L: 9647
					var10.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9648
					var10.packetBuffer.method8589(var3); // L: 9649
					var10.packetBuffer.writeInt(class358.selectedSpellWidget); // L: 9650
					var10.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9651
					var10.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9652
					Client.packetWriter.addNode(var10); // L: 9653
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3]; // L: 9334
				if (var14 != null) { // L: 9335
					Client.mouseCrossX = var7; // L: 9336
					Client.mouseCrossY = var8; // L: 9337
					Client.mouseCrossColor = 2; // L: 9338
					Client.mouseCrossState = 0; // L: 9339
					Client.destinationX = var0; // L: 9340
					Client.destinationY = var1; // L: 9341
					var10 = class136.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 9343
					var10.packetBuffer.method8607(var3); // L: 9344
					var10.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9345
					Client.packetWriter.addNode(var10); // L: 9346
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3]; // L: 9488
				if (var14 != null) { // L: 9489
					Client.mouseCrossX = var7; // L: 9490
					Client.mouseCrossY = var8; // L: 9491
					Client.mouseCrossColor = 2; // L: 9492
					Client.mouseCrossState = 0; // L: 9493
					Client.destinationX = var0; // L: 9494
					Client.destinationY = var1; // L: 9495
					var10 = class136.getPacketBufferNode(ClientPacket.field3068, Client.packetWriter.isaacCipher); // L: 9497
					var10.packetBuffer.method8589(var3); // L: 9498
					var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 9499
					Client.packetWriter.addNode(var10); // L: 9500
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3]; // L: 9741
				if (var14 != null) { // L: 9742
					Client.mouseCrossX = var7; // L: 9743
					Client.mouseCrossY = var8; // L: 9744
					Client.mouseCrossColor = 2; // L: 9745
					Client.mouseCrossState = 0; // L: 9746
					Client.destinationX = var0; // L: 9747
					Client.destinationY = var1; // L: 9748
					var10 = class136.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 9750
					var10.packetBuffer.writeIntME(var3); // L: 9751
					var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 9752
					Client.packetWriter.addNode(var10); // L: 9753
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3]; // L: 9580
				if (var14 != null) { // L: 9581
					Client.mouseCrossX = var7; // L: 9582
					Client.mouseCrossY = var8; // L: 9583
					Client.mouseCrossColor = 2; // L: 9584
					Client.mouseCrossState = 0; // L: 9585
					Client.destinationX = var0; // L: 9586
					Client.destinationY = var1; // L: 9587
					var10 = class136.getPacketBufferNode(ClientPacket.field3102, Client.packetWriter.isaacCipher); // L: 9589
					var10.packetBuffer.method8579(Client.field747.method4106(82) ? 1 : 0); // L: 9590
					var10.packetBuffer.writeShort(var3); // L: 9591
					Client.packetWriter.addNode(var10); // L: 9592
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3]; // L: 9608
				if (var14 != null) { // L: 9609
					Client.mouseCrossX = var7; // L: 9610
					Client.mouseCrossY = var8; // L: 9611
					Client.mouseCrossColor = 2; // L: 9612
					Client.mouseCrossState = 0; // L: 9613
					Client.destinationX = var0; // L: 9614
					Client.destinationY = var1; // L: 9615
					var10 = class136.getPacketBufferNode(ClientPacket.field3067, Client.packetWriter.isaacCipher); // L: 9617
					var10.packetBuffer.method8589(var3); // L: 9618
					var10.packetBuffer.method8579(Client.field747.method4106(82) ? 1 : 0); // L: 9619
					Client.packetWriter.addNode(var10); // L: 9620
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3]; // L: 9199
					if (var16 != null) { // L: 9200
						Client.mouseCrossX = var7; // L: 9201
						Client.mouseCrossY = var8; // L: 9202
						Client.mouseCrossColor = 2; // L: 9203
						Client.mouseCrossState = 0; // L: 9204
						Client.destinationX = var0; // L: 9205
						Client.destinationY = var1; // L: 9206
						var10 = class136.getPacketBufferNode(ClientPacket.field3086, Client.packetWriter.isaacCipher); // L: 9208
						var10.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9209
						var10.packetBuffer.writeInt(ModeWhere.selectedItemWidget); // L: 9210
						var10.packetBuffer.method8589(class101.selectedItemSlot); // L: 9211
						var10.packetBuffer.method8589(HealthBarUpdate.selectedItemId); // L: 9212
						var10.packetBuffer.writeIntME(var3); // L: 9213
						Client.packetWriter.addNode(var10); // L: 9214
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3]; // L: 9380
					if (var16 != null) { // L: 9381
						Client.mouseCrossX = var7; // L: 9382
						Client.mouseCrossY = var8; // L: 9383
						Client.mouseCrossColor = 2; // L: 9384
						Client.mouseCrossState = 0; // L: 9385
						Client.destinationX = var0; // L: 9386
						Client.destinationY = var1; // L: 9387
						var10 = class136.getPacketBufferNode(ClientPacket.field3096, Client.packetWriter.isaacCipher); // L: 9388
						var10.packetBuffer.writeShort(var3); // L: 9389
						var10.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9390
						var10.packetBuffer.method8607(Client.selectedSpellChildIndex); // L: 9391
						var10.packetBuffer.method8536(class358.selectedSpellWidget); // L: 9392
						var10.packetBuffer.method8589(Client.selectedSpellItemId); // L: 9393
						Client.packetWriter.addNode(var10); // L: 9394
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7; // L: 9270
					Client.mouseCrossY = var8; // L: 9271
					Client.mouseCrossColor = 2; // L: 9272
					Client.mouseCrossState = 0; // L: 9273
					Client.destinationX = var0; // L: 9274
					Client.destinationY = var1; // L: 9275
					var9 = class136.getPacketBufferNode(ClientPacket.field3061, Client.packetWriter.isaacCipher); // L: 9277
					var9.packetBuffer.writeShort(var3); // L: 9278
					var9.packetBuffer.writeIntME(class365.baseY * 64 + var1); // L: 9279
					var9.packetBuffer.method8579(Client.field747.method4106(82) ? 1 : 0); // L: 9280
					var9.packetBuffer.method8589(class101.selectedItemSlot); // L: 9281
					var9.packetBuffer.method8536(ModeWhere.selectedItemWidget); // L: 9282
					var9.packetBuffer.method8589(HealthBarUpdate.selectedItemId); // L: 9283
					var9.packetBuffer.writeIntME(class154.baseX * 64 + var0); // L: 9284
					Client.packetWriter.addNode(var9); // L: 9285
				} else if (var2 == 17) {
					Client.mouseCrossX = var7; // L: 9033
					Client.mouseCrossY = var8; // L: 9034
					Client.mouseCrossColor = 2; // L: 9035
					Client.mouseCrossState = 0; // L: 9036
					Client.destinationX = var0; // L: 9037
					Client.destinationY = var1; // L: 9038
					var9 = class136.getPacketBufferNode(ClientPacket.field3064, Client.packetWriter.isaacCipher); // L: 9039
					var9.packetBuffer.writeShort(class365.baseY * 64 + var1); // L: 9040
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9041
					var9.packetBuffer.writeInt(class358.selectedSpellWidget); // L: 9042
					var9.packetBuffer.method8589(class154.baseX * 64 + var0); // L: 9043
					var9.packetBuffer.writeShort(var3); // L: 9044
					var9.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9045
					var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9046
					Client.packetWriter.addNode(var9); // L: 9047
				} else if (var2 == 18) {
					Client.mouseCrossX = var7; // L: 9288
					Client.mouseCrossY = var8; // L: 9289
					Client.mouseCrossColor = 2; // L: 9290
					Client.mouseCrossState = 0; // L: 9291
					Client.destinationX = var0; // L: 9292
					Client.destinationY = var1; // L: 9293
					var9 = class136.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 9295
					var9.packetBuffer.method8607(class365.baseY * 64 + var1); // L: 9296
					var9.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 9297
					var9.packetBuffer.method8589(var3); // L: 9298
					var9.packetBuffer.method8607(class154.baseX * 64 + var0); // L: 9299
					Client.packetWriter.addNode(var9); // L: 9300
				} else if (var2 == 19) {
					Client.mouseCrossX = var7; // L: 9552
					Client.mouseCrossY = var8; // L: 9553
					Client.mouseCrossColor = 2; // L: 9554
					Client.mouseCrossState = 0; // L: 9555
					Client.destinationX = var0; // L: 9556
					Client.destinationY = var1; // L: 9557
					var9 = class136.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher); // L: 9559
					var9.packetBuffer.method8607(var3); // L: 9560
					var9.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9561
					var9.packetBuffer.writeShort(class365.baseY * 64 + var1); // L: 9562
					var9.packetBuffer.writeIntME(class154.baseX * 64 + var0); // L: 9563
					Client.packetWriter.addNode(var9); // L: 9564
				} else if (var2 == 20) {
					Client.mouseCrossX = var7; // L: 9447
					Client.mouseCrossY = var8; // L: 9448
					Client.mouseCrossColor = 2; // L: 9449
					Client.mouseCrossState = 0; // L: 9450
					Client.destinationX = var0; // L: 9451
					Client.destinationY = var1; // L: 9452
					var9 = class136.getPacketBufferNode(ClientPacket.field3062, Client.packetWriter.isaacCipher); // L: 9454
					var9.packetBuffer.writeIntME(class154.baseX * 64 + var0); // L: 9455
					var9.packetBuffer.method8607(var3); // L: 9456
					var9.packetBuffer.method8607(class365.baseY * 64 + var1); // L: 9457
					var9.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9458
					Client.packetWriter.addNode(var9); // L: 9459
				} else if (var2 == 21) {
					Client.mouseCrossX = var7; // L: 9083
					Client.mouseCrossY = var8; // L: 9084
					Client.mouseCrossColor = 2; // L: 9085
					Client.mouseCrossState = 0; // L: 9086
					Client.destinationX = var0; // L: 9087
					Client.destinationY = var1; // L: 9088
					var9 = class136.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 9090
					var9.packetBuffer.writeIntME(class154.baseX * 64 + var0); // L: 9091
					var9.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9092
					var9.packetBuffer.writeShort(class365.baseY * 64 + var1); // L: 9093
					var9.packetBuffer.writeShort(var3); // L: 9094
					Client.packetWriter.addNode(var9); // L: 9095
				} else if (var2 == 22) {
					Client.mouseCrossX = var7; // L: 9624
					Client.mouseCrossY = var8; // L: 9625
					Client.mouseCrossColor = 2; // L: 9626
					Client.mouseCrossState = 0; // L: 9627
					Client.destinationX = var0; // L: 9628
					Client.destinationY = var1; // L: 9629
					var9 = class136.getPacketBufferNode(ClientPacket.field3123, Client.packetWriter.isaacCipher); // L: 9631
					var9.packetBuffer.method8589(class365.baseY * 64 + var1); // L: 9632
					var9.packetBuffer.method8607(var3); // L: 9633
					var9.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9634
					var9.packetBuffer.method8607(class154.baseX * 64 + var0); // L: 9635
					Client.packetWriter.addNode(var9); // L: 9636
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 9462
						ReflectionCheck.scene.setViewportWalking(); // L: 9463
					} else {
						ReflectionCheck.scene.menuOpen(class383.Client_plane, var0, var1, true); // L: 9466
					}
				} else {
					PacketBufferNode var13;
					Widget var17;
					if (var2 == 24) {
						var17 = class175.getWidget(var1); // L: 9567
						if (var17 != null) { // L: 9568
							boolean var12 = true; // L: 9569
							if (var17.contentType > 0) { // L: 9570
								var12 = NPC.method2583(var17);
							}

							if (var12) { // L: 9571
								var13 = class136.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 9573
								var13.packetBuffer.method8536(var1); // L: 9574
								Client.packetWriter.addNode(var13); // L: 9575
							}
						}
					} else {
						if (var2 == 25) {
							var17 = AttackOption.getWidgetChild(var1, var0); // L: 9684
							if (var17 != null) { // L: 9685
								Widget.Widget_runOnTargetLeave(); // L: 9686
								class32.selectSpell(var1, var0, PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var17)), var4); // L: 9687
								Client.isItemSelected = 0; // L: 9688
								Client.selectedSpellActionName = ArchiveLoader.Widget_getSpellActionName(var17); // L: 9689
								if (Client.selectedSpellActionName == null) { // L: 9690
									Client.selectedSpellActionName = "null";
								}

								if (var17.isIf3) { // L: 9691
									Client.selectedSpellName = var17.dataText + MouseRecorder.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = MouseRecorder.colorStartTag(65280) + var17.spellName + MouseRecorder.colorStartTag(16777215); // L: 9692
								}
							}

							return; // L: 9694
						}

						if (var2 == 26) {
							WorldMapSectionType.method5236(); // L: 9196
						} else {
							int var11;
							Widget var15;
							if (var2 == 28) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 9155
								var9.packetBuffer.method8536(var1); // L: 9156
								Client.packetWriter.addNode(var9); // L: 9157
								var15 = class175.getWidget(var1); // L: 9158
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9159
									var11 = var15.cs1Instructions[0][1]; // L: 9160
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9161
									MouseRecorder.changeGameOptions(var11); // L: 9162
								}
							} else if (var2 == 29) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 9167
								var9.packetBuffer.method8536(var1); // L: 9168
								Client.packetWriter.addNode(var9); // L: 9169
								var15 = class175.getWidget(var1); // L: 9170
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9171
									var11 = var15.cs1Instructions[0][1]; // L: 9172
									if (Varps.Varps_main[var11] != var15.cs1ComparisonValues[0]) { // L: 9173
										Varps.Varps_main[var11] = var15.cs1ComparisonValues[0]; // L: 9174
										MouseRecorder.changeGameOptions(var11); // L: 9175
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9440
									class262.resumePauseWidget(var1, var0); // L: 9441
									Client.meslayerContinueWidget = AttackOption.getWidgetChild(var1, var0); // L: 9442
									class69.invalidateWidget(Client.meslayerContinueWidget); // L: 9443
								}
							} else if (var2 == 31) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9051
								var9.packetBuffer.writeInt(var1); // L: 9052
								var9.packetBuffer.method8599(ModeWhere.selectedItemWidget); // L: 9053
								var9.packetBuffer.writeShort(var4); // L: 9054
								var9.packetBuffer.method8607(class101.selectedItemSlot); // L: 9055
								var9.packetBuffer.method8607(var0); // L: 9056
								var9.packetBuffer.writeShort(HealthBarUpdate.selectedItemId); // L: 9057
								Client.packetWriter.addNode(var9); // L: 9058
								Client.field624 = 0; // L: 9059
								MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9060
								Client.field625 = var0; // L: 9061
							} else if (var2 == 32) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3049, Client.packetWriter.isaacCipher); // L: 9540
								var9.packetBuffer.method8607(Client.selectedSpellChildIndex); // L: 9541
								var9.packetBuffer.method8589(var4); // L: 9542
								var9.packetBuffer.method8600(class358.selectedSpellWidget); // L: 9543
								var9.packetBuffer.method8589(var0); // L: 9544
								var9.packetBuffer.method8599(var1); // L: 9545
								Client.packetWriter.addNode(var9); // L: 9546
								Client.field624 = 0; // L: 9547
								MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9548
								Client.field625 = var0; // L: 9549
							} else if (var2 == 33) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3095, Client.packetWriter.isaacCipher); // L: 9505
								var9.packetBuffer.method8607(var0); // L: 9506
								var9.packetBuffer.writeInt(var1); // L: 9507
								var9.packetBuffer.writeIntME(var4); // L: 9508
								Client.packetWriter.addNode(var9); // L: 9509
								Client.field624 = 0; // L: 9510
								MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9511
								Client.field625 = var0; // L: 9512
							} else if (var2 == 34) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3101, Client.packetWriter.isaacCipher); // L: 9007
								var9.packetBuffer.method8589(var4); // L: 9008
								var9.packetBuffer.method8599(var1); // L: 9009
								var9.packetBuffer.method8607(var0); // L: 9010
								Client.packetWriter.addNode(var9); // L: 9011
								Client.field624 = 0; // L: 9012
								MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9013
								Client.field625 = var0; // L: 9014
							} else if (var2 == 35) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3093, Client.packetWriter.isaacCipher); // L: 9399
								var9.packetBuffer.method8536(var1); // L: 9400
								var9.packetBuffer.writeIntME(var4); // L: 9401
								var9.packetBuffer.writeIntME(var0); // L: 9402
								Client.packetWriter.addNode(var9); // L: 9403
								Client.field624 = 0; // L: 9404
								MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9405
								Client.field625 = var0; // L: 9406
							} else if (var2 == 36) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 9529
								var9.packetBuffer.writeInt(var1); // L: 9530
								var9.packetBuffer.writeShort(var0); // L: 9531
								var9.packetBuffer.method8589(var4); // L: 9532
								Client.packetWriter.addNode(var9); // L: 9533
								Client.field624 = 0; // L: 9534
								MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9535
								Client.field625 = var0; // L: 9536
							} else if (var2 == 37) {
								var9 = class136.getPacketBufferNode(ClientPacket.field3104, Client.packetWriter.isaacCipher); // L: 9249
								var9.packetBuffer.writeInt(var1); // L: 9250
								var9.packetBuffer.writeShort(var4); // L: 9251
								var9.packetBuffer.writeIntME(var0); // L: 9252
								Client.packetWriter.addNode(var9); // L: 9253
								Client.field624 = 0; // L: 9254
								MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9255
								Client.field625 = var0; // L: 9256
							} else {
								if (var2 == 38) {
									Widget.Widget_runOnTargetLeave(); // L: 9476
									var17 = class175.getWidget(var1); // L: 9477
									Client.isItemSelected = 1; // L: 9478
									class101.selectedItemSlot = var0; // L: 9479
									ModeWhere.selectedItemWidget = var1; // L: 9480
									HealthBarUpdate.selectedItemId = var4; // L: 9481
									class69.invalidateWidget(var17); // L: 9482
									Client.selectedItemName = MouseRecorder.colorStartTag(16748608) + NPCComposition.ItemComposition_get(var4).name + MouseRecorder.colorStartTag(16777215); // L: 9483
									if (Client.selectedItemName == null) { // L: 9484
										Client.selectedItemName = "null";
									}

									return; // L: 9485
								}

								if (var2 == 39) {
									var9 = class136.getPacketBufferNode(ClientPacket.field3059, Client.packetWriter.isaacCipher); // L: 9238
									var9.packetBuffer.method8536(var1); // L: 9239
									var9.packetBuffer.writeIntME(var4); // L: 9240
									var9.packetBuffer.method8589(var0); // L: 9241
									Client.packetWriter.addNode(var9); // L: 9242
									Client.field624 = 0; // L: 9243
									MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9244
									Client.field625 = var0; // L: 9245
								} else if (var2 == 40) {
									var9 = class136.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 9674
									var9.packetBuffer.writeShort(var0); // L: 9675
									var9.packetBuffer.method8536(var1); // L: 9676
									var9.packetBuffer.method8607(var4); // L: 9677
									Client.packetWriter.addNode(var9); // L: 9678
									Client.field624 = 0; // L: 9679
									MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9680
									Client.field625 = var0; // L: 9681
								} else if (var2 == 41) {
									var9 = class136.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 9260
									var9.packetBuffer.method8600(var1); // L: 9261
									var9.packetBuffer.method8589(var0); // L: 9262
									var9.packetBuffer.writeIntME(var4); // L: 9263
									Client.packetWriter.addNode(var9); // L: 9264
									Client.field624 = 0; // L: 9265
									MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9266
									Client.field625 = var0; // L: 9267
								} else if (var2 == 42) {
									var9 = class136.getPacketBufferNode(ClientPacket.field3056, Client.packetWriter.isaacCipher); // L: 9758
									var9.packetBuffer.method8607(var0); // L: 9759
									var9.packetBuffer.method8607(var4); // L: 9760
									var9.packetBuffer.writeInt(var1); // L: 9761
									Client.packetWriter.addNode(var9); // L: 9762
									Client.field624 = 0; // L: 9763
									MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9764
									Client.field625 = var0; // L: 9765
								} else if (var2 == 43) {
									var9 = class136.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher); // L: 8996
									var9.packetBuffer.writeShort(var4); // L: 8997
									var9.packetBuffer.writeIntME(var0); // L: 8998
									var9.packetBuffer.method8599(var1); // L: 8999
									Client.packetWriter.addNode(var9); // L: 9000
									Client.field624 = 0; // L: 9001
									MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9002
									Client.field625 = var0; // L: 9003
								} else if (var2 == 44) {
									var16 = Client.players[var3]; // L: 9424
									if (var16 != null) { // L: 9425
										Client.mouseCrossX = var7; // L: 9426
										Client.mouseCrossY = var8; // L: 9427
										Client.mouseCrossColor = 2; // L: 9428
										Client.mouseCrossState = 0; // L: 9429
										Client.destinationX = var0; // L: 9430
										Client.destinationY = var1; // L: 9431
										var10 = class136.getPacketBufferNode(ClientPacket.field3091, Client.packetWriter.isaacCipher); // L: 9433
										var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 9434
										var10.packetBuffer.writeShort(var3); // L: 9435
										Client.packetWriter.addNode(var10); // L: 9436
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3]; // L: 9657
									if (var16 != null) { // L: 9658
										Client.mouseCrossX = var7; // L: 9659
										Client.mouseCrossY = var8; // L: 9660
										Client.mouseCrossColor = 2; // L: 9661
										Client.mouseCrossState = 0; // L: 9662
										Client.destinationX = var0; // L: 9663
										Client.destinationY = var1; // L: 9664
										var10 = class136.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 9666
										var10.packetBuffer.writeIntME(var3); // L: 9667
										var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 9668
										Client.packetWriter.addNode(var10); // L: 9669
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3]; // L: 9221
									if (var16 != null) { // L: 9222
										Client.mouseCrossX = var7; // L: 9223
										Client.mouseCrossY = var8; // L: 9224
										Client.mouseCrossColor = 2; // L: 9225
										Client.mouseCrossState = 0; // L: 9226
										Client.destinationX = var0; // L: 9227
										Client.destinationY = var1; // L: 9228
										var10 = class136.getPacketBufferNode(ClientPacket.field3094, Client.packetWriter.isaacCipher); // L: 9230
										var10.packetBuffer.writeByte(Client.field747.method4106(82) ? 1 : 0); // L: 9231
										var10.packetBuffer.method8589(var3); // L: 9232
										Client.packetWriter.addNode(var10); // L: 9233
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
										var10 = class136.getPacketBufferNode(ClientPacket.field3047, Client.packetWriter.isaacCipher); // L: 9026
										var10.packetBuffer.writeShort(var3); // L: 9027
										var10.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9028
										Client.packetWriter.addNode(var10); // L: 9029
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3]; // L: 9303
									if (var16 != null) { // L: 9304
										Client.mouseCrossX = var7; // L: 9305
										Client.mouseCrossY = var8; // L: 9306
										Client.mouseCrossColor = 2; // L: 9307
										Client.mouseCrossState = 0; // L: 9308
										Client.destinationX = var0; // L: 9309
										Client.destinationY = var1; // L: 9310
										var10 = class136.getPacketBufferNode(ClientPacket.field3088, Client.packetWriter.isaacCipher); // L: 9312
										var10.packetBuffer.method8607(var3); // L: 9313
										var10.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9314
										Client.packetWriter.addNode(var10); // L: 9315
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3]; // L: 9180
									if (var16 != null) { // L: 9181
										Client.mouseCrossX = var7; // L: 9182
										Client.mouseCrossY = var8; // L: 9183
										Client.mouseCrossColor = 2; // L: 9184
										Client.mouseCrossState = 0; // L: 9185
										Client.destinationX = var0; // L: 9186
										Client.destinationY = var1; // L: 9187
										var10 = class136.getPacketBufferNode(ClientPacket.field3066, Client.packetWriter.isaacCipher); // L: 9189
										var10.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9190
										var10.packetBuffer.writeShort(var3); // L: 9191
										Client.packetWriter.addNode(var10); // L: 9192
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3]; // L: 9768
									if (var16 != null) { // L: 9769
										Client.mouseCrossX = var7; // L: 9770
										Client.mouseCrossY = var8; // L: 9771
										Client.mouseCrossColor = 2; // L: 9772
										Client.mouseCrossState = 0; // L: 9773
										Client.destinationX = var0; // L: 9774
										Client.destinationY = var1; // L: 9775
										var10 = class136.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher); // L: 9777
										var10.packetBuffer.method8589(var3); // L: 9778
										var10.packetBuffer.method8580(Client.field747.method4106(82) ? 1 : 0); // L: 9779
										Client.packetWriter.addNode(var10); // L: 9780
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3]; // L: 9120
									if (var16 != null) { // L: 9121
										Client.mouseCrossX = var7; // L: 9122
										Client.mouseCrossY = var8; // L: 9123
										Client.mouseCrossColor = 2; // L: 9124
										Client.mouseCrossState = 0; // L: 9125
										Client.destinationX = var0; // L: 9126
										Client.destinationY = var1; // L: 9127
										var10 = class136.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher); // L: 9129
										var10.packetBuffer.method8589(var3); // L: 9130
										var10.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9131
										Client.packetWriter.addNode(var10); // L: 9132
									}
								} else {
									label652: {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = AttackOption.getWidgetChild(var1, var0); // L: 9098
												if (var17 != null) { // L: 9099
													if (var17.field3654 != null) { // L: 9100
														ScriptEvent var19 = new ScriptEvent(); // L: 9101
														var19.widget = var17; // L: 9102
														var19.opIndex = var3; // L: 9103
														var19.targetName = var6; // L: 9104
														var19.args = var17.field3654; // L: 9105
														WorldMapElement.runScriptEvent(var19); // L: 9106
													}

													var10 = class136.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 9109
													var10.packetBuffer.method8607(Client.selectedSpellItemId); // L: 9110
													var10.packetBuffer.method8536(var1); // L: 9111
													var10.packetBuffer.writeInt(class358.selectedSpellWidget); // L: 9112
													var10.packetBuffer.method8589(Client.selectedSpellChildIndex); // L: 9113
													var10.packetBuffer.method8607(var0); // L: 9114
													var10.packetBuffer.method8589(var4); // L: 9115
													Client.packetWriter.addNode(var10); // L: 9116
												}
												break label652;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var7; // L: 9319
												Client.mouseCrossY = var8; // L: 9320
												Client.mouseCrossColor = 2; // L: 9321
												Client.mouseCrossState = 0; // L: 9322
												Client.destinationX = var0; // L: 9323
												Client.destinationY = var1; // L: 9324
												var9 = class136.getPacketBufferNode(ClientPacket.field3119, Client.packetWriter.isaacCipher); // L: 9326
												var9.packetBuffer.method8589(class365.baseY * 64 + var1); // L: 9327
												var9.packetBuffer.writeShort(class154.baseX * 64 + var0); // L: 9328
												var9.packetBuffer.writeIntME(var3); // L: 9329
												var9.packetBuffer.method8578(Client.field747.method4106(82) ? 1 : 0); // L: 9330
												Client.packetWriter.addNode(var9); // L: 9331
												break label652;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var7; // L: 9697
												Client.mouseCrossY = var8; // L: 9698
												Client.mouseCrossColor = 2; // L: 9699
												Client.mouseCrossState = 0; // L: 9700
												var9 = class136.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 9702
												var9.packetBuffer.method8589(var3); // L: 9703
												Client.packetWriter.addNode(var9); // L: 9704
												break label652;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var7; // L: 9707
												Client.mouseCrossY = var8; // L: 9708
												Client.mouseCrossColor = 2; // L: 9709
												Client.mouseCrossState = 0; // L: 9710
												var14 = Client.npcs[var3]; // L: 9711
												if (var14 != null) { // L: 9712
													NPCComposition var18 = var14.definition; // L: 9713
													if (var18.transforms != null) { // L: 9714
														var18 = var18.transform();
													}

													if (var18 != null) { // L: 9715
														var13 = class136.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 9717
														var13.packetBuffer.method8589(var18.id); // L: 9718
														Client.packetWriter.addNode(var13); // L: 9719
													}
												}
												break label652;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var7; // L: 9596
												Client.mouseCrossY = var8; // L: 9597
												Client.mouseCrossColor = 2; // L: 9598
												Client.mouseCrossState = 0; // L: 9599
												var9 = class136.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 9601
												var9.packetBuffer.writeIntME(class154.baseX * 64 + var0); // L: 9602
												var9.packetBuffer.writeShort(class365.baseY * 64 + var1); // L: 9603
												var9.packetBuffer.method8589(var3); // L: 9604
												Client.packetWriter.addNode(var9); // L: 9605
												break label652;
											}

											if (var2 == 1005) {
												var17 = class175.getWidget(var1); // L: 9515
												if (var17 != null && var17.itemQuantities[var0] >= 100000) { // L: 9516
													KitDefinition.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + NPCComposition.ItemComposition_get(var4).name);
												} else {
													var10 = class136.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 9519
													var10.packetBuffer.method8589(var4); // L: 9520
													Client.packetWriter.addNode(var10); // L: 9521
												}

												Client.field624 = 0; // L: 9523
												MusicPatchPcmStream.field3411 = class175.getWidget(var1); // L: 9524
												Client.field625 = var0; // L: 9525
												break label652;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1011 || var2 == 1008 || var2 == 1010 || var2 == 1012) {
													KitDefinition.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9218
												}
												break label652;
											}
										}

										var17 = AttackOption.getWidgetChild(var1, var0); // L: 9470
										if (var17 != null) { // L: 9471
											ModelData0.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9472
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9783
			Client.isItemSelected = 0; // L: 9784
			class69.invalidateWidget(class175.getWidget(ModeWhere.selectedItemWidget)); // L: 9785
		}

		if (Client.isSpellSelected) { // L: 9787
			Widget.Widget_runOnTargetLeave();
		}

		if (MusicPatchPcmStream.field3411 != null && Client.field624 == 0) { // L: 9788
			class69.invalidateWidget(MusicPatchPcmStream.field3411);
		}

	} // L: 9789

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1283712243"
	)
	static void method4848() {
		StructComposition.clientPreferences.method2431(Client.field511); // L: 12736
	} // L: 12737
}
