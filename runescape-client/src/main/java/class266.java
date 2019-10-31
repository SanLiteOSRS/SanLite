import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class266 {
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "69"
	)
	static final void method5060() {
		PacketBufferNode var0 = SoundSystem.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
