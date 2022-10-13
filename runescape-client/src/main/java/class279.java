import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public final class class279 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 4000121288852944069L
	)
	static long field3267;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 9079451671499507185L
	)
	static long field3268;

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-38"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = WorldMapDecoration.getWidgetChild(var1, var2); // L: 9783
		if (var5 != null) { // L: 9784
			if (var5.onOp != null) { // L: 9785
				ScriptEvent var6 = new ScriptEvent(); // L: 9786
				var6.widget = var5; // L: 9787
				var6.opIndex = var0; // L: 9788
				var6.targetName = var4; // L: 9789
				var6.args = var5.onOp; // L: 9790
				ServerPacket.runScriptEvent(var6); // L: 9791
			}

			boolean var11 = true; // L: 9793
			if (var5.contentType > 0) { // L: 9794
				var11 = MilliClock.method3373(var5);
			}

			if (var11) { // L: 9795
				int var8 = class197.getWidgetFlags(var5); // L: 9797
				int var9 = var0 - 1; // L: 9798
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9800
				if (var7) { // L: 9802
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9805
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3012, Client.packetWriter.isaacCipher); // L: 9807
						var10.packetBuffer.writeInt(var1); // L: 9808
						var10.packetBuffer.writeShort(var2); // L: 9809
						var10.packetBuffer.writeShort(var3); // L: 9810
						Client.packetWriter.addNode(var10); // L: 9811
					}

					if (var0 == 2) { // L: 9813
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3033, Client.packetWriter.isaacCipher); // L: 9815
						var10.packetBuffer.writeInt(var1); // L: 9816
						var10.packetBuffer.writeShort(var2); // L: 9817
						var10.packetBuffer.writeShort(var3); // L: 9818
						Client.packetWriter.addNode(var10); // L: 9819
					}

					if (var0 == 3) { // L: 9821
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3042, Client.packetWriter.isaacCipher); // L: 9823
						var10.packetBuffer.writeInt(var1); // L: 9824
						var10.packetBuffer.writeShort(var2); // L: 9825
						var10.packetBuffer.writeShort(var3); // L: 9826
						Client.packetWriter.addNode(var10); // L: 9827
					}

					if (var0 == 4) { // L: 9829
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3015, Client.packetWriter.isaacCipher); // L: 9831
						var10.packetBuffer.writeInt(var1); // L: 9832
						var10.packetBuffer.writeShort(var2); // L: 9833
						var10.packetBuffer.writeShort(var3); // L: 9834
						Client.packetWriter.addNode(var10); // L: 9835
					}

					if (var0 == 5) { // L: 9837
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3025, Client.packetWriter.isaacCipher); // L: 9839
						var10.packetBuffer.writeInt(var1); // L: 9840
						var10.packetBuffer.writeShort(var2); // L: 9841
						var10.packetBuffer.writeShort(var3); // L: 9842
						Client.packetWriter.addNode(var10); // L: 9843
					}

					if (var0 == 6) { // L: 9845
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3003, Client.packetWriter.isaacCipher); // L: 9847
						var10.packetBuffer.writeInt(var1); // L: 9848
						var10.packetBuffer.writeShort(var2); // L: 9849
						var10.packetBuffer.writeShort(var3); // L: 9850
						Client.packetWriter.addNode(var10); // L: 9851
					}

					if (var0 == 7) { // L: 9853
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3073, Client.packetWriter.isaacCipher); // L: 9855
						var10.packetBuffer.writeInt(var1); // L: 9856
						var10.packetBuffer.writeShort(var2); // L: 9857
						var10.packetBuffer.writeShort(var3); // L: 9858
						Client.packetWriter.addNode(var10); // L: 9859
					}

					if (var0 == 8) { // L: 9861
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3019, Client.packetWriter.isaacCipher); // L: 9863
						var10.packetBuffer.writeInt(var1); // L: 9864
						var10.packetBuffer.writeShort(var2); // L: 9865
						var10.packetBuffer.writeShort(var3); // L: 9866
						Client.packetWriter.addNode(var10); // L: 9867
					}

					if (var0 == 9) { // L: 9869
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3018, Client.packetWriter.isaacCipher); // L: 9871
						var10.packetBuffer.writeInt(var1); // L: 9872
						var10.packetBuffer.writeShort(var2); // L: 9873
						var10.packetBuffer.writeShort(var3); // L: 9874
						Client.packetWriter.addNode(var10); // L: 9875
					}

					if (var0 == 10) { // L: 9877
						var10 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3002, Client.packetWriter.isaacCipher); // L: 9879
						var10.packetBuffer.writeInt(var1); // L: 9880
						var10.packetBuffer.writeShort(var2); // L: 9881
						var10.packetBuffer.writeShort(var3); // L: 9882
						Client.packetWriter.addNode(var10); // L: 9883
					}

				}
			}
		}
	} // L: 9803 9885
}
