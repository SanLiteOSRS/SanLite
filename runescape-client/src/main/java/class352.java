import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class352 {
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1322948655
	)
	static int field4196;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1313969477
	)
	int field4198;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1952344337
	)
	int field4197;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1717773869
	)
	int field4200;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1637668167
	)
	int field4199;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4198).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4200).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4197).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4198 + var5 + "Created: " + this.field4197 + var7 + "Total used: " + this.field4200 + var6 + "Max-In-Use: " + this.field4199; // L: 22
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method6435(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldj;FZB)F",
		garbageValue = "-101"
	)
	static float method6436(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 161
		if (var0 != null && var0.method2712() != 0) { // L: 162
			float var4 = (float)var0.field1441[0].field1400; // L: 165
			float var5 = (float)var0.field1441[var0.method2712() - 1].field1400; // L: 166
			float var6 = var5 - var4; // L: 167
			if (0.0D == (double)var6) { // L: 168
				return var0.field1441[0].field1399; // L: 169
			} else {
				float var7 = 0.0F; // L: 171
				if (var1 > var5) { // L: 172
					var7 = (var1 - var5) / var6; // L: 173
				} else {
					var7 = (var1 - var4) / var6; // L: 176
				}

				double var8 = (double)((int)var7); // L: 178
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 179
				float var11 = var10 * var6; // L: 180
				var8 = Math.abs(var8 + 1.0D); // L: 181
				double var12 = var8 / 2.0D; // L: 182
				double var14 = (double)((int)var12); // L: 183
				var10 = (float)(var12 - var14); // L: 184
				float var16;
				float var17;
				if (var2) { // L: 187
					if (var0.field1439 == class116.field1432) { // L: 188
						if (0.0D != (double)var10) { // L: 189
							var11 += var4; // L: 190
						} else {
							var11 = var5 - var11; // L: 193
						}
					} else if (var0.field1439 != class116.field1428 && var0.field1439 != class116.field1433) { // L: 196
						if (var0.field1439 == class116.field1431) { // L: 199
							var11 = var4 - var1; // L: 200
							var16 = var0.field1441[0].field1403; // L: 201
							var17 = var0.field1441[0].field1401; // L: 202
							var3 = var0.field1441[0].field1399; // L: 203
							if (0.0D != (double)var16) { // L: 204
								var3 -= var17 * var11 / var16; // L: 205
							}

							return var3; // L: 207
						}
					} else {
						var11 = var5 - var11; // L: 197
					}
				} else if (var0.field1449 == class116.field1432) { // L: 211
					if ((double)var10 != 0.0D) { // L: 212
						var11 = var5 - var11; // L: 213
					} else {
						var11 += var4; // L: 216
					}
				} else if (var0.field1449 != class116.field1428 && var0.field1449 != class116.field1433) { // L: 219
					if (var0.field1449 == class116.field1431) { // L: 222
						var11 = var1 - var5; // L: 223
						var16 = var0.field1441[var0.method2712() - 1].field1402; // L: 224
						var17 = var0.field1441[var0.method2712() - 1].field1398; // L: 225
						var3 = var0.field1441[var0.method2712() - 1].field1399; // L: 226
						if (0.0D != (double)var16) { // L: 227
							var3 += var17 * var11 / var16; // L: 228
						}

						return var3; // L: 230
					}
				} else {
					var11 += var4; // L: 220
				}

				var3 = class10.method86(var0, var11); // L: 233
				float var18;
				if (var2 && var0.field1439 == class116.field1433) { // L: 235
					var18 = var0.field1441[var0.method2712() - 1].field1399 - var0.field1441[0].field1399; // L: 236
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 237
				} else if (!var2 && var0.field1449 == class116.field1433) { // L: 239
					var18 = var0.field1441[var0.method2712() - 1].field1399 - var0.field1441[0].field1399; // L: 240
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 241
				}

				return var3; // L: 243
			}
		} else {
			return var3; // L: 163
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-8922583"
	)
	static void method6437() {
		if (ScriptFrame.localPlayer.x >> 7 == Client.destinationX && ScriptFrame.localPlayer.y >> 7 == Client.destinationY) { // L: 4810
			Client.destinationX = 0; // L: 4811
		}

	} // L: 4813

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-743463300"
	)
	static final void method6432(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 8404
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1) { // L: 8405
			Client.mouseCrossX = var7; // L: 8699
			Client.mouseCrossY = var8; // L: 8700
			Client.mouseCrossColor = 2; // L: 8701
			Client.mouseCrossState = 0; // L: 8702
			Client.destinationX = var0; // L: 8703
			Client.destinationY = var1; // L: 8704
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher); // L: 8706
			var9.packetBuffer.method7647(Decimator.baseX * 64 + var0); // L: 8707
			var9.packetBuffer.method7675(class67.selectedItemSlot); // L: 8708
			var9.packetBuffer.method7675(class7.baseY * 64 + var1); // L: 8709
			var9.packetBuffer.method7878(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8710
			var9.packetBuffer.writeIntME(Projectile.selectedItemId); // L: 8711
			var9.packetBuffer.method7687(class150.selectedItemWidget); // L: 8712
			var9.packetBuffer.method7675(var3); // L: 8713
			Client.packetWriter.addNode(var9); // L: 8714
		} else if (var2 == 2) {
			Client.mouseCrossX = var7; // L: 8720
			Client.mouseCrossY = var8; // L: 8721
			Client.mouseCrossColor = 2; // L: 8722
			Client.mouseCrossState = 0; // L: 8723
			Client.destinationX = var0; // L: 8724
			Client.destinationY = var1; // L: 8725
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher); // L: 8726
			var9.packetBuffer.method7675(Client.selectedSpellChildIndex); // L: 8727
			var9.packetBuffer.writeShort(class7.baseY * 64 + var1); // L: 8728
			var9.packetBuffer.method7675(Decimator.baseX * 64 + var0); // L: 8729
			var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 8730
			var9.packetBuffer.method7687(class282.selectedSpellWidget); // L: 8731
			var9.packetBuffer.method7647(var3); // L: 8732
			var9.packetBuffer.method7656(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8733
			Client.packetWriter.addNode(var9); // L: 8734
		} else if (var2 == 3) {
			Client.mouseCrossX = var7; // L: 8521
			Client.mouseCrossY = var8; // L: 8522
			Client.mouseCrossColor = 2; // L: 8523
			Client.mouseCrossState = 0; // L: 8524
			Client.destinationX = var0; // L: 8525
			Client.destinationY = var1; // L: 8526
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3006, Client.packetWriter.isaacCipher); // L: 8528
			var9.packetBuffer.writeShort(Decimator.baseX * 64 + var0); // L: 8529
			var9.packetBuffer.method7675(class7.baseY * 64 + var1); // L: 8530
			var9.packetBuffer.writeShort(var3); // L: 8531
			var9.packetBuffer.method7656(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8532
			Client.packetWriter.addNode(var9); // L: 8533
		} else if (var2 == 4) {
			Client.mouseCrossX = var7; // L: 8450
			Client.mouseCrossY = var8; // L: 8451
			Client.mouseCrossColor = 2; // L: 8452
			Client.mouseCrossState = 0; // L: 8453
			Client.destinationX = var0; // L: 8454
			Client.destinationY = var1; // L: 8455
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher); // L: 8457
			var9.packetBuffer.writeIntME(var3); // L: 8458
			var9.packetBuffer.writeIntME(Decimator.baseX * 64 + var0); // L: 8459
			var9.packetBuffer.method7675(class7.baseY * 64 + var1); // L: 8460
			var9.packetBuffer.method7878(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8461
			Client.packetWriter.addNode(var9); // L: 8462
		} else if (var2 == 5) {
			Client.mouseCrossX = var7; // L: 8406
			Client.mouseCrossY = var8; // L: 8407
			Client.mouseCrossColor = 2; // L: 8408
			Client.mouseCrossState = 0; // L: 8409
			Client.destinationX = var0; // L: 8410
			Client.destinationY = var1; // L: 8411
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2943, Client.packetWriter.isaacCipher); // L: 8413
			var9.packetBuffer.method7878(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8414
			var9.packetBuffer.writeIntME(class7.baseY * 64 + var1); // L: 8415
			var9.packetBuffer.method7647(var3); // L: 8416
			var9.packetBuffer.writeShort(Decimator.baseX * 64 + var0); // L: 8417
			Client.packetWriter.addNode(var9); // L: 8418
		} else if (var2 == 6) {
			Client.mouseCrossX = var7; // L: 9096
			Client.mouseCrossY = var8; // L: 9097
			Client.mouseCrossColor = 2; // L: 9098
			Client.mouseCrossState = 0; // L: 9099
			Client.destinationX = var0; // L: 9100
			Client.destinationY = var1; // L: 9101
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2955, Client.packetWriter.isaacCipher); // L: 9103
			var9.packetBuffer.writeShort(Decimator.baseX * 64 + var0); // L: 9104
			var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9105
			var9.packetBuffer.writeIntME(var3); // L: 9106
			var9.packetBuffer.method7675(class7.baseY * 64 + var1); // L: 9107
			Client.packetWriter.addNode(var9); // L: 9108
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3]; // L: 9011
				if (var14 != null) { // L: 9012
					Client.mouseCrossX = var7; // L: 9013
					Client.mouseCrossY = var8; // L: 9014
					Client.mouseCrossColor = 2; // L: 9015
					Client.mouseCrossState = 0; // L: 9016
					Client.destinationX = var0; // L: 9017
					Client.destinationY = var1; // L: 9018
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2964, Client.packetWriter.isaacCipher); // L: 9020
					var10.packetBuffer.writeIntME(var3); // L: 9021
					var10.packetBuffer.method7878(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9022
					var10.packetBuffer.method7675(class67.selectedItemSlot); // L: 9023
					var10.packetBuffer.method7675(Projectile.selectedItemId); // L: 9024
					var10.packetBuffer.method7686(class150.selectedItemWidget); // L: 9025
					Client.packetWriter.addNode(var10); // L: 9026
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3]; // L: 8492
				if (var14 != null) { // L: 8493
					Client.mouseCrossX = var7; // L: 8494
					Client.mouseCrossY = var8; // L: 8495
					Client.mouseCrossColor = 2; // L: 8496
					Client.mouseCrossState = 0; // L: 8497
					Client.destinationX = var0; // L: 8498
					Client.destinationY = var1; // L: 8499
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3019, Client.packetWriter.isaacCipher); // L: 8500
					var10.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8501
					var10.packetBuffer.writeInt(class282.selectedSpellWidget); // L: 8502
					var10.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 8503
					var10.packetBuffer.method7647(Client.selectedSpellChildIndex); // L: 8504
					var10.packetBuffer.writeShort(var3); // L: 8505
					Client.packetWriter.addNode(var10); // L: 8506
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3]; // L: 9111
				if (var14 != null) { // L: 9112
					Client.mouseCrossX = var7; // L: 9113
					Client.mouseCrossY = var8; // L: 9114
					Client.mouseCrossColor = 2; // L: 9115
					Client.mouseCrossState = 0; // L: 9116
					Client.destinationX = var0; // L: 9117
					Client.destinationY = var1; // L: 9118
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2982, Client.packetWriter.isaacCipher); // L: 9120
					var10.packetBuffer.method7675(var3); // L: 9121
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9122
					Client.packetWriter.addNode(var10); // L: 9123
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3]; // L: 8939
				if (var14 != null) { // L: 8940
					Client.mouseCrossX = var7; // L: 8941
					Client.mouseCrossY = var8; // L: 8942
					Client.mouseCrossColor = 2; // L: 8943
					Client.mouseCrossState = 0; // L: 8944
					Client.destinationX = var0; // L: 8945
					Client.destinationY = var1; // L: 8946
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher); // L: 8948
					var10.packetBuffer.method7656(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8949
					var10.packetBuffer.method7675(var3); // L: 8950
					Client.packetWriter.addNode(var10); // L: 8951
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3]; // L: 8859
				if (var14 != null) { // L: 8860
					Client.mouseCrossX = var7; // L: 8861
					Client.mouseCrossY = var8; // L: 8862
					Client.mouseCrossColor = 2; // L: 8863
					Client.mouseCrossState = 0; // L: 8864
					Client.destinationX = var0; // L: 8865
					Client.destinationY = var1; // L: 8866
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher); // L: 8868
					var10.packetBuffer.method7647(var3); // L: 8869
					var10.packetBuffer.method7656(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8870
					Client.packetWriter.addNode(var10); // L: 8871
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3]; // L: 8605
				if (var14 != null) { // L: 8606
					Client.mouseCrossX = var7; // L: 8607
					Client.mouseCrossY = var8; // L: 8608
					Client.mouseCrossColor = 2; // L: 8609
					Client.mouseCrossState = 0; // L: 8610
					Client.destinationX = var0; // L: 8611
					Client.destinationY = var1; // L: 8612
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher); // L: 8614
					var10.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8615
					var10.packetBuffer.method7675(var3); // L: 8616
					Client.packetWriter.addNode(var10); // L: 8617
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3]; // L: 9080
				if (var14 != null) { // L: 9081
					Client.mouseCrossX = var7; // L: 9082
					Client.mouseCrossY = var8; // L: 9083
					Client.mouseCrossColor = 2; // L: 9084
					Client.mouseCrossState = 0; // L: 9085
					Client.destinationX = var0; // L: 9086
					Client.destinationY = var1; // L: 9087
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 9089
					var10.packetBuffer.writeShort(var3); // L: 9090
					var10.packetBuffer.method7656(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9091
					Client.packetWriter.addNode(var10); // L: 9092
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3]; // L: 8805
					if (var16 != null) { // L: 8806
						Client.mouseCrossX = var7; // L: 8807
						Client.mouseCrossY = var8; // L: 8808
						Client.mouseCrossColor = 2; // L: 8809
						Client.mouseCrossState = 0; // L: 8810
						Client.destinationX = var0; // L: 8811
						Client.destinationY = var1; // L: 8812
						var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher); // L: 8814
						var10.packetBuffer.method7675(class67.selectedItemSlot); // L: 8815
						var10.packetBuffer.writeIntME(Projectile.selectedItemId); // L: 8816
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8817
						var10.packetBuffer.writeIntME(var3); // L: 8818
						var10.packetBuffer.method7687(class150.selectedItemWidget); // L: 8819
						Client.packetWriter.addNode(var10); // L: 8820
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3]; // L: 9167
					if (var16 != null) { // L: 9168
						Client.mouseCrossX = var7; // L: 9169
						Client.mouseCrossY = var8; // L: 9170
						Client.mouseCrossColor = 2; // L: 9171
						Client.mouseCrossState = 0; // L: 9172
						Client.destinationX = var0; // L: 9173
						Client.destinationY = var1; // L: 9174
						var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher); // L: 9175
						var10.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9176
						var10.packetBuffer.writeIntME(var3); // L: 9177
						var10.packetBuffer.method7647(Client.selectedSpellItemId); // L: 9178
						var10.packetBuffer.method7673(class282.selectedSpellWidget); // L: 9179
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9180
						Client.packetWriter.addNode(var10); // L: 9181
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7; // L: 8875
					Client.mouseCrossY = var8; // L: 8876
					Client.mouseCrossColor = 2; // L: 8877
					Client.mouseCrossState = 0; // L: 8878
					Client.destinationX = var0; // L: 8879
					Client.destinationY = var1; // L: 8880
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher); // L: 8882
					var9.packetBuffer.method7647(var3); // L: 8883
					var9.packetBuffer.method7687(class150.selectedItemWidget); // L: 8884
					var9.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8885
					var9.packetBuffer.writeShort(Projectile.selectedItemId); // L: 8886
					var9.packetBuffer.writeShort(class67.selectedItemSlot); // L: 8887
					var9.packetBuffer.writeIntME(Decimator.baseX * 64 + var0); // L: 8888
					var9.packetBuffer.method7675(class7.baseY * 64 + var1); // L: 8889
					Client.packetWriter.addNode(var9); // L: 8890
				} else if (var2 == 17) {
					Client.mouseCrossX = var7; // L: 8753
					Client.mouseCrossY = var8; // L: 8754
					Client.mouseCrossColor = 2; // L: 8755
					Client.mouseCrossState = 0; // L: 8756
					Client.destinationX = var0; // L: 8757
					Client.destinationY = var1; // L: 8758
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3018, Client.packetWriter.isaacCipher); // L: 8759
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8760
					var9.packetBuffer.method7686(class282.selectedSpellWidget); // L: 8761
					var9.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 8762
					var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 8763
					var9.packetBuffer.method7675(class7.baseY * 64 + var1); // L: 8764
					var9.packetBuffer.method7647(Decimator.baseX * 64 + var0); // L: 8765
					var9.packetBuffer.method7647(var3); // L: 8766
					Client.packetWriter.addNode(var9); // L: 8767
				} else if (var2 == 18) {
					Client.mouseCrossX = var7; // L: 8649
					Client.mouseCrossY = var8; // L: 8650
					Client.mouseCrossColor = 2; // L: 8651
					Client.mouseCrossState = 0; // L: 8652
					Client.destinationX = var0; // L: 8653
					Client.destinationY = var1; // L: 8654
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2941, Client.packetWriter.isaacCipher); // L: 8656
					var9.packetBuffer.writeIntME(var3); // L: 8657
					var9.packetBuffer.writeShort(Decimator.baseX * 64 + var0); // L: 8658
					var9.packetBuffer.writeIntME(class7.baseY * 64 + var1); // L: 8659
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8660
					Client.packetWriter.addNode(var9); // L: 8661
				} else if (var2 == 19) {
					Client.mouseCrossX = var7; // L: 9185
					Client.mouseCrossY = var8; // L: 9186
					Client.mouseCrossColor = 2; // L: 9187
					Client.mouseCrossState = 0; // L: 9188
					Client.destinationX = var0; // L: 9189
					Client.destinationY = var1; // L: 9190
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher); // L: 9192
					var9.packetBuffer.method7675(class7.baseY * 64 + var1); // L: 9193
					var9.packetBuffer.writeIntME(var3); // L: 9194
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9195
					var9.packetBuffer.method7675(Decimator.baseX * 64 + var0); // L: 9196
					Client.packetWriter.addNode(var9); // L: 9197
				} else if (var2 == 20) {
					Client.mouseCrossX = var7; // L: 8984
					Client.mouseCrossY = var8; // L: 8985
					Client.mouseCrossColor = 2; // L: 8986
					Client.mouseCrossState = 0; // L: 8987
					Client.destinationX = var0; // L: 8988
					Client.destinationY = var1; // L: 8989
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher); // L: 8991
					var9.packetBuffer.writeShort(var3); // L: 8992
					var9.packetBuffer.writeIntME(class7.baseY * 64 + var1); // L: 8993
					var9.packetBuffer.method7675(Decimator.baseX * 64 + var0); // L: 8994
					var9.packetBuffer.method7656(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8995
					Client.packetWriter.addNode(var9); // L: 8996
				} else if (var2 == 21) {
					Client.mouseCrossX = var7; // L: 8634
					Client.mouseCrossY = var8; // L: 8635
					Client.mouseCrossColor = 2; // L: 8636
					Client.mouseCrossState = 0; // L: 8637
					Client.destinationX = var0; // L: 8638
					Client.destinationY = var1; // L: 8639
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher); // L: 8641
					var9.packetBuffer.method7878(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8642
					var9.packetBuffer.method7647(class7.baseY * 64 + var1); // L: 8643
					var9.packetBuffer.method7675(var3); // L: 8644
					var9.packetBuffer.method7647(Decimator.baseX * 64 + var0); // L: 8645
					Client.packetWriter.addNode(var9); // L: 8646
				} else if (var2 == 22) {
					Client.mouseCrossX = var7; // L: 8969
					Client.mouseCrossY = var8; // L: 8970
					Client.mouseCrossColor = 2; // L: 8971
					Client.mouseCrossState = 0; // L: 8972
					Client.destinationX = var0; // L: 8973
					Client.destinationY = var1; // L: 8974
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3013, Client.packetWriter.isaacCipher); // L: 8976
					var9.packetBuffer.method7647(class7.baseY * 64 + var1); // L: 8977
					var9.packetBuffer.writeIntME(Decimator.baseX * 64 + var0); // L: 8978
					var9.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8979
					var9.packetBuffer.method7675(var3); // L: 8980
					Client.packetWriter.addNode(var9); // L: 8981
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8824
						class12.scene.setViewportWalking(); // L: 8825
					} else {
						class12.scene.menuOpen(class268.Client_plane, var0, var1, true); // L: 8828
					}
				} else {
					PacketBufferNode var13;
					Widget var17;
					if (var2 == 24) {
						var17 = HitSplatDefinition.getWidget(var1); // L: 8675
						if (var17 != null) { // L: 8676
							boolean var12 = true; // L: 8677
							if (var17.contentType > 0) { // L: 8678
								var12 = class18.method263(var17);
							}

							if (var12) { // L: 8679
								var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 8681
								var13.packetBuffer.writeInt(var1); // L: 8682
								Client.packetWriter.addNode(var13); // L: 8683
							}
						}
					} else {
						if (var2 == 25) {
							var17 = class128.getWidgetChild(var1, var0); // L: 9127
							if (var17 != null) { // L: 9128
								ReflectionCheck.Widget_runOnTargetLeave(); // L: 9129
								DynamicObject.selectSpell(var1, var0, ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var17)), var4); // L: 9130
								Client.isItemSelected = 0; // L: 9131
								Client.selectedSpellActionName = WorldMapDecoration.Widget_getSpellActionName(var17); // L: 9132
								if (Client.selectedSpellActionName == null) { // L: 9133
									Client.selectedSpellActionName = "null";
								}

								if (var17.isIf3) { // L: 9134
									Client.selectedSpellName = var17.dataText + Clock.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = Clock.colorStartTag(65280) + var17.spellName + Clock.colorStartTag(16777215); // L: 9135
								}
							}

							return; // L: 9137
						}

						if (var2 == 26) {
							WorldMapID.method4919(); // L: 8925
						} else {
							int var11;
							Widget var15;
							if (var2 == 28) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 9000
								var9.packetBuffer.writeInt(var1); // L: 9001
								Client.packetWriter.addNode(var9); // L: 9002
								var15 = HitSplatDefinition.getWidget(var1); // L: 9003
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9004
									var11 = var15.cs1Instructions[0][1]; // L: 9005
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9006
									class300.changeGameOptions(var11); // L: 9007
								}
							} else if (var2 == 29) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 8558
								var9.packetBuffer.writeInt(var1); // L: 8559
								Client.packetWriter.addNode(var9); // L: 8560
								var15 = HitSplatDefinition.getWidget(var1); // L: 8561
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 8562
									var11 = var15.cs1Instructions[0][1]; // L: 8563
									if (Varps.Varps_main[var11] != var15.cs1ComparisonValues[0]) { // L: 8564
										Varps.Varps_main[var11] = var15.cs1ComparisonValues[0]; // L: 8565
										class300.changeGameOptions(var11); // L: 8566
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8598
									Client.resumePauseWidget(var1, var0); // L: 8599
									Client.meslayerContinueWidget = class128.getWidgetChild(var1, var0); // L: 8600
									class125.invalidateWidget(Client.meslayerContinueWidget); // L: 8601
								}
							} else if (var2 == 31) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3016, Client.packetWriter.isaacCipher); // L: 8956
								var9.packetBuffer.method7675(var0); // L: 8957
								var9.packetBuffer.writeInt(class150.selectedItemWidget); // L: 8958
								var9.packetBuffer.method7687(var1); // L: 8959
								var9.packetBuffer.writeShort(class67.selectedItemSlot); // L: 8960
								var9.packetBuffer.method7675(var4); // L: 8961
								var9.packetBuffer.writeShort(Projectile.selectedItemId); // L: 8962
								Client.packetWriter.addNode(var9); // L: 8963
								Client.field593 = 0; // L: 8964
								WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8965
								Client.field594 = var0; // L: 8966
							} else if (var2 == 32) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2956, Client.packetWriter.isaacCipher); // L: 8622
								var9.packetBuffer.method7686(var1); // L: 8623
								var9.packetBuffer.writeIntME(var0); // L: 8624
								var9.packetBuffer.writeInt(class282.selectedSpellWidget); // L: 8625
								var9.packetBuffer.method7647(Client.selectedSpellChildIndex); // L: 8626
								var9.packetBuffer.method7647(var4); // L: 8627
								Client.packetWriter.addNode(var9); // L: 8628
								Client.field593 = 0; // L: 8629
								WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8630
								Client.field594 = var0; // L: 8631
							} else if (var2 == 33) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher); // L: 9031
								var9.packetBuffer.method7686(var1); // L: 9032
								var9.packetBuffer.method7675(var4); // L: 9033
								var9.packetBuffer.method7675(var0); // L: 9034
								Client.packetWriter.addNode(var9); // L: 9035
								Client.field593 = 0; // L: 9036
								WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 9037
								Client.field594 = var0; // L: 9038
							} else if (var2 == 34) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher); // L: 8929
								var9.packetBuffer.writeShort(var4); // L: 8930
								var9.packetBuffer.writeInt(var1); // L: 8931
								var9.packetBuffer.method7647(var0); // L: 8932
								Client.packetWriter.addNode(var9); // L: 8933
								Client.field593 = 0; // L: 8934
								WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8935
								Client.field594 = var0; // L: 8936
							} else if (var2 == 35) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2945, Client.packetWriter.isaacCipher); // L: 8572
								var9.packetBuffer.method7675(var0); // L: 8573
								var9.packetBuffer.method7673(var1); // L: 8574
								var9.packetBuffer.writeShort(var4); // L: 8575
								Client.packetWriter.addNode(var9); // L: 8576
								Client.field593 = 0; // L: 8577
								WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8578
								Client.field594 = var0; // L: 8579
							} else if (var2 == 36) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher); // L: 8547
								var9.packetBuffer.method7673(var1); // L: 8548
								var9.packetBuffer.method7675(var4); // L: 8549
								var9.packetBuffer.writeIntME(var0); // L: 8550
								Client.packetWriter.addNode(var9); // L: 8551
								Client.field593 = 0; // L: 8552
								WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8553
								Client.field594 = var0; // L: 8554
							} else if (var2 == 37) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher); // L: 8689
								var9.packetBuffer.method7647(var4); // L: 8690
								var9.packetBuffer.method7687(var1); // L: 8691
								var9.packetBuffer.method7675(var0); // L: 8692
								Client.packetWriter.addNode(var9); // L: 8693
								Client.field593 = 0; // L: 8694
								WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8695
								Client.field594 = var0; // L: 8696
							} else {
								if (var2 == 38) {
									ReflectionCheck.Widget_runOnTargetLeave(); // L: 9068
									var17 = HitSplatDefinition.getWidget(var1); // L: 9069
									Client.isItemSelected = 1; // L: 9070
									class67.selectedItemSlot = var0; // L: 9071
									class150.selectedItemWidget = var1; // L: 9072
									Projectile.selectedItemId = var4; // L: 9073
									class125.invalidateWidget(var17); // L: 9074
									Client.selectedItemName = Clock.colorStartTag(16748608) + AttackOption.ItemComposition_get(var4).name + Clock.colorStartTag(16777215); // L: 9075
									if (Client.selectedItemName == null) { // L: 9076
										Client.selectedItemName = "null";
									}

									return; // L: 9077
								}

								if (var2 == 39) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher); // L: 9042
									var9.packetBuffer.writeIntME(var4); // L: 9043
									var9.packetBuffer.method7686(var1); // L: 9044
									var9.packetBuffer.writeShort(var0); // L: 9045
									Client.packetWriter.addNode(var9); // L: 9046
									Client.field593 = 0; // L: 9047
									WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 9048
									Client.field594 = var0; // L: 9049
								} else if (var2 == 40) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2918, Client.packetWriter.isaacCipher); // L: 8849
									var9.packetBuffer.method7675(var4); // L: 8850
									var9.packetBuffer.method7673(var1); // L: 8851
									var9.packetBuffer.method7647(var0); // L: 8852
									Client.packetWriter.addNode(var9); // L: 8853
									Client.field593 = 0; // L: 8854
									WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8855
									Client.field594 = var0; // L: 8856
								} else if (var2 == 41) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3023, Client.packetWriter.isaacCipher); // L: 8511
									var9.packetBuffer.method7673(var1); // L: 8512
									var9.packetBuffer.method7675(var4); // L: 8513
									var9.packetBuffer.writeShort(var0); // L: 8514
									Client.packetWriter.addNode(var9); // L: 8515
									Client.field593 = 0; // L: 8516
									WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8517
									Client.field594 = var0; // L: 8518
								} else if (var2 == 42) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3001, Client.packetWriter.isaacCipher); // L: 8466
									var9.packetBuffer.method7673(var1); // L: 8467
									var9.packetBuffer.writeShort(var0); // L: 8468
									var9.packetBuffer.method7647(var4); // L: 8469
									Client.packetWriter.addNode(var9); // L: 8470
									Client.field593 = 0; // L: 8471
									WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8472
									Client.field594 = var0; // L: 8473
								} else if (var2 == 43) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher); // L: 8665
									var9.packetBuffer.method7647(var0); // L: 8666
									var9.packetBuffer.method7675(var4); // L: 8667
									var9.packetBuffer.method7686(var1); // L: 8668
									Client.packetWriter.addNode(var9); // L: 8669
									Client.field593 = 0; // L: 8670
									WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8671
									Client.field594 = var0; // L: 8672
								} else if (var2 == 44) {
									var16 = Client.players[var3]; // L: 8893
									if (var16 != null) { // L: 8894
										Client.mouseCrossX = var7; // L: 8895
										Client.mouseCrossY = var8; // L: 8896
										Client.mouseCrossColor = 2; // L: 8897
										Client.mouseCrossState = 0; // L: 8898
										Client.destinationX = var0; // L: 8899
										Client.destinationY = var1; // L: 8900
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2934, Client.packetWriter.isaacCipher); // L: 8902
										var10.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8903
										var10.packetBuffer.method7647(var3); // L: 8904
										Client.packetWriter.addNode(var10); // L: 8905
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3]; // L: 8582
									if (var16 != null) { // L: 8583
										Client.mouseCrossX = var7; // L: 8584
										Client.mouseCrossY = var8; // L: 8585
										Client.mouseCrossColor = 2; // L: 8586
										Client.mouseCrossState = 0; // L: 8587
										Client.destinationX = var0; // L: 8588
										Client.destinationY = var1; // L: 8589
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2959, Client.packetWriter.isaacCipher); // L: 8591
										var10.packetBuffer.method7675(var3); // L: 8592
										var10.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8593
										Client.packetWriter.addNode(var10); // L: 8594
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3]; // L: 9052
									if (var16 != null) { // L: 9053
										Client.mouseCrossX = var7; // L: 9054
										Client.mouseCrossY = var8; // L: 9055
										Client.mouseCrossColor = 2; // L: 9056
										Client.mouseCrossState = 0; // L: 9057
										Client.destinationX = var0; // L: 9058
										Client.destinationY = var1; // L: 9059
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher); // L: 9061
										var10.packetBuffer.method7675(var3); // L: 9062
										var10.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9063
										Client.packetWriter.addNode(var10); // L: 9064
									}
								} else if (var2 == 47) {
									var16 = Client.players[var3]; // L: 8832
									if (var16 != null) { // L: 8833
										Client.mouseCrossX = var7; // L: 8834
										Client.mouseCrossY = var8; // L: 8835
										Client.mouseCrossColor = 2; // L: 8836
										Client.mouseCrossState = 0; // L: 8837
										Client.destinationX = var0; // L: 8838
										Client.destinationY = var1; // L: 8839
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher); // L: 8841
										var10.packetBuffer.method7647(var3); // L: 8842
										var10.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8843
										Client.packetWriter.addNode(var10); // L: 8844
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3]; // L: 8476
									if (var16 != null) { // L: 8477
										Client.mouseCrossX = var7; // L: 8478
										Client.mouseCrossY = var8; // L: 8479
										Client.mouseCrossColor = 2; // L: 8480
										Client.mouseCrossState = 0; // L: 8481
										Client.destinationX = var0; // L: 8482
										Client.destinationY = var1; // L: 8483
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher); // L: 8485
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8486
										var10.packetBuffer.method7675(var3); // L: 8487
										Client.packetWriter.addNode(var10); // L: 8488
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3]; // L: 8737
									if (var16 != null) { // L: 8738
										Client.mouseCrossX = var7; // L: 8739
										Client.mouseCrossY = var8; // L: 8740
										Client.mouseCrossColor = 2; // L: 8741
										Client.mouseCrossState = 0; // L: 8742
										Client.destinationX = var0; // L: 8743
										Client.destinationY = var1; // L: 8744
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher); // L: 8746
										var10.packetBuffer.method7878(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8747
										var10.packetBuffer.method7647(var3); // L: 8748
										Client.packetWriter.addNode(var10); // L: 8749
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3]; // L: 8909
									if (var16 != null) { // L: 8910
										Client.mouseCrossX = var7; // L: 8911
										Client.mouseCrossY = var8; // L: 8912
										Client.mouseCrossColor = 2; // L: 8913
										Client.mouseCrossState = 0; // L: 8914
										Client.destinationX = var0; // L: 8915
										Client.destinationY = var1; // L: 8916
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 8918
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8919
										var10.packetBuffer.writeIntME(var3); // L: 8920
										Client.packetWriter.addNode(var10); // L: 8921
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3]; // L: 8770
									if (var16 != null) { // L: 8771
										Client.mouseCrossX = var7; // L: 8772
										Client.mouseCrossY = var8; // L: 8773
										Client.mouseCrossColor = 2; // L: 8774
										Client.mouseCrossState = 0; // L: 8775
										Client.destinationX = var0; // L: 8776
										Client.destinationY = var1; // L: 8777
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher); // L: 8779
										var10.packetBuffer.writeShort(var3); // L: 8780
										var10.packetBuffer.method7878(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8781
										Client.packetWriter.addNode(var10); // L: 8782
									}
								} else {
									label655: {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = class128.getWidgetChild(var1, var0); // L: 8436
												if (var17 != null) { // L: 8437
													var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 8439
													var10.packetBuffer.method7647(var0); // L: 8440
													var10.packetBuffer.method7687(var1); // L: 8441
													var10.packetBuffer.method7675(Client.selectedSpellItemId); // L: 8442
													var10.packetBuffer.method7673(class282.selectedSpellWidget); // L: 8443
													var10.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 8444
													var10.packetBuffer.writeShort(var4); // L: 8445
													Client.packetWriter.addNode(var10); // L: 8446
												}
												break label655;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var7; // L: 8421
												Client.mouseCrossY = var8; // L: 8422
												Client.mouseCrossColor = 2; // L: 8423
												Client.mouseCrossState = 0; // L: 8424
												Client.destinationX = var0; // L: 8425
												Client.destinationY = var1; // L: 8426
												var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher); // L: 8428
												var9.packetBuffer.writeShort(class7.baseY * 64 + var1); // L: 8429
												var9.packetBuffer.writeShort(Decimator.baseX * 64 + var0); // L: 8430
												var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8431
												var9.packetBuffer.writeShort(var3); // L: 8432
												Client.packetWriter.addNode(var9); // L: 8433
												break label655;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var7; // L: 9157
												Client.mouseCrossY = var8; // L: 9158
												Client.mouseCrossColor = 2; // L: 9159
												Client.mouseCrossState = 0; // L: 9160
												var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2949, Client.packetWriter.isaacCipher); // L: 9162
												var9.packetBuffer.method7675(var3); // L: 9163
												Client.packetWriter.addNode(var9); // L: 9164
												break label655;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var7; // L: 9140
												Client.mouseCrossY = var8; // L: 9141
												Client.mouseCrossColor = 2; // L: 9142
												Client.mouseCrossState = 0; // L: 9143
												var14 = Client.npcs[var3]; // L: 9144
												if (var14 != null) { // L: 9145
													NPCComposition var18 = var14.definition; // L: 9146
													if (var18.transforms != null) { // L: 9147
														var18 = var18.transform();
													}

													if (var18 != null) { // L: 9148
														var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3021, Client.packetWriter.isaacCipher); // L: 9150
														var13.packetBuffer.writeIntME(var18.id); // L: 9151
														Client.packetWriter.addNode(var13); // L: 9152
													}
												}
												break label655;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var7; // L: 8536
												Client.mouseCrossY = var8; // L: 8537
												Client.mouseCrossColor = 2; // L: 8538
												Client.mouseCrossState = 0; // L: 8539
												var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 8541
												var9.packetBuffer.method7675(var3); // L: 8542
												Client.packetWriter.addNode(var9); // L: 8543
												break label655;
											}

											if (var2 == 1005) {
												var17 = HitSplatDefinition.getWidget(var1); // L: 8792
												if (var17 != null && var17.itemQuantities[var0] >= 100000) { // L: 8793
													VarcInt.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + AttackOption.ItemComposition_get(var4).name);
												} else {
													var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 8796
													var10.packetBuffer.method7675(var4); // L: 8797
													Client.packetWriter.addNode(var10); // L: 8798
												}

												Client.field593 = 0; // L: 8800
												WallObject.field2634 = HitSplatDefinition.getWidget(var1); // L: 8801
												Client.field594 = var0; // L: 8802
												break label655;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
													ClientPacket.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8717
												}
												break label655;
											}
										}

										var17 = class128.getWidgetChild(var1, var0); // L: 8786
										if (var17 != null) { // L: 8787
											ArchiveDiskAction.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 8788
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9199
			Client.isItemSelected = 0; // L: 9200
			class125.invalidateWidget(HitSplatDefinition.getWidget(class150.selectedItemWidget)); // L: 9201
		}

		if (Client.isSpellSelected) { // L: 9203
			ReflectionCheck.Widget_runOnTargetLeave();
		}

		if (WallObject.field2634 != null && Client.field593 == 0) { // L: 9204
			class125.invalidateWidget(WallObject.field2634);
		}

	} // L: 9205

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1621699516"
	)
	static void method6438(int var0, int var1) {
		MenuAction var2 = WorldMapSprite.tempMenuAction; // L: 11464
		if (var2 != null) { // L: 11466
			method6432(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field859, var2.field857, var2.action, var0, var1); // L: 11467
		}

		WorldMapSprite.tempMenuAction = null; // L: 11470
	} // L: 11471
}
