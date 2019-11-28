import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public final class class290 {
	@ObfuscatedName("o")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-250466939"
	)
	static final void method5392() {
		PacketBufferNode var0 = ModelData0.getPacketBufferNode(ClientPacket.field2314, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
