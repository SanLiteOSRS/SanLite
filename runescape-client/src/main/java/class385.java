import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class385 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1249793384"
	)
	static final void method7407(String var0, int var1) {
		PacketBufferNode var2 = Renderable.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher); // L: 248
		var2.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 249
		var2.packetBuffer.method8765(var1); // L: 250
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 251
		Client.packetWriter.addNode(var2); // L: 252
	} // L: 253
}
