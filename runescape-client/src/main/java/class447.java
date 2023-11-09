import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public class class447 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-5"
	)
	static final void method8166(String var0, int var1) {
		PacketBufferNode var2 = class217.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 210
		var2.packetBuffer.writeByte(Player.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 211
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 212
		var2.packetBuffer.method9204(var1); // L: 213
		Client.packetWriter.addNode(var2); // L: 214
	} // L: 215
}
