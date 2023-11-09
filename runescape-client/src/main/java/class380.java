import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class380 {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1330257380"
	)
	static final void method7375(String var0) {
		PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.field3067, Client.packetWriter.isaacCipher); // L: 187
		var1.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var0)); // L: 188
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 189
		Client.packetWriter.addNode(var1); // L: 190
	} // L: 191
}
