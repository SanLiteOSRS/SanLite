import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class171 implements class170 {
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1877711272"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class4.getPacketBufferNode(ClientPacket.field2253, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method5674(var1);
		var2.packetBuffer.method5684(var0);
		Client.packetWriter.addNode(var2);
	}
}
