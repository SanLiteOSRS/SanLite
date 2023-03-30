import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public enum class333 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	field4127(-1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	field4125(0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	field4124(1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	field4126(2);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1019178121
	)
	final int field4128;

	class333(int var3) {
		this.field4128 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4128; // L: 20
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-159586085"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class36.getWidgetChild(var1, var2); // L: 9599
		if (var5 != null) { // L: 9600
			if (var5.onOp != null) { // L: 9601
				ScriptEvent var6 = new ScriptEvent(); // L: 9602
				var6.widget = var5; // L: 9603
				var6.opIndex = var0; // L: 9604
				var6.targetName = var4; // L: 9605
				var6.args = var5.onOp; // L: 9606
				class9.runScriptEvent(var6); // L: 9607
			}

			boolean var11 = true; // L: 9609
			if (var5.contentType > 0) { // L: 9610
				var11 = class11.method103(var5);
			}

			if (var11) { // L: 9611
				int var8 = ParamComposition.getWidgetFlags(var5); // L: 9613
				int var9 = var0 - 1; // L: 9614
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9616
				if (var7) { // L: 9618
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9621
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3074, Client.packetWriter.isaacCipher); // L: 9623
						var10.packetBuffer.writeInt(var1); // L: 9624
						var10.packetBuffer.writeShort(var2); // L: 9625
						var10.packetBuffer.writeShort(var3); // L: 9626
						Client.packetWriter.addNode(var10); // L: 9627
					}

					if (var0 == 2) { // L: 9629
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher); // L: 9631
						var10.packetBuffer.writeInt(var1); // L: 9632
						var10.packetBuffer.writeShort(var2); // L: 9633
						var10.packetBuffer.writeShort(var3); // L: 9634
						Client.packetWriter.addNode(var10); // L: 9635
					}

					if (var0 == 3) { // L: 9637
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9639
						var10.packetBuffer.writeInt(var1); // L: 9640
						var10.packetBuffer.writeShort(var2); // L: 9641
						var10.packetBuffer.writeShort(var3); // L: 9642
						Client.packetWriter.addNode(var10); // L: 9643
					}

					if (var0 == 4) { // L: 9645
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3056, Client.packetWriter.isaacCipher); // L: 9647
						var10.packetBuffer.writeInt(var1); // L: 9648
						var10.packetBuffer.writeShort(var2); // L: 9649
						var10.packetBuffer.writeShort(var3); // L: 9650
						Client.packetWriter.addNode(var10); // L: 9651
					}

					if (var0 == 5) { // L: 9653
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 9655
						var10.packetBuffer.writeInt(var1); // L: 9656
						var10.packetBuffer.writeShort(var2); // L: 9657
						var10.packetBuffer.writeShort(var3); // L: 9658
						Client.packetWriter.addNode(var10); // L: 9659
					}

					if (var0 == 6) { // L: 9661
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher); // L: 9663
						var10.packetBuffer.writeInt(var1); // L: 9664
						var10.packetBuffer.writeShort(var2); // L: 9665
						var10.packetBuffer.writeShort(var3); // L: 9666
						Client.packetWriter.addNode(var10); // L: 9667
					}

					if (var0 == 7) { // L: 9669
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3061, Client.packetWriter.isaacCipher); // L: 9671
						var10.packetBuffer.writeInt(var1); // L: 9672
						var10.packetBuffer.writeShort(var2); // L: 9673
						var10.packetBuffer.writeShort(var3); // L: 9674
						Client.packetWriter.addNode(var10); // L: 9675
					}

					if (var0 == 8) { // L: 9677
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3077, Client.packetWriter.isaacCipher); // L: 9679
						var10.packetBuffer.writeInt(var1); // L: 9680
						var10.packetBuffer.writeShort(var2); // L: 9681
						var10.packetBuffer.writeShort(var3); // L: 9682
						Client.packetWriter.addNode(var10); // L: 9683
					}

					if (var0 == 9) { // L: 9685
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3080, Client.packetWriter.isaacCipher); // L: 9687
						var10.packetBuffer.writeInt(var1); // L: 9688
						var10.packetBuffer.writeShort(var2); // L: 9689
						var10.packetBuffer.writeShort(var3); // L: 9690
						Client.packetWriter.addNode(var10); // L: 9691
					}

					if (var0 == 10) { // L: 9693
						var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3078, Client.packetWriter.isaacCipher); // L: 9695
						var10.packetBuffer.writeInt(var1); // L: 9696
						var10.packetBuffer.writeShort(var2); // L: 9697
						var10.packetBuffer.writeShort(var3); // L: 9698
						Client.packetWriter.addNode(var10); // L: 9699
					}

				}
			}
		}
	} // L: 9619 9701
}
