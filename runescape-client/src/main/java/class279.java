import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class279 {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		signature = "[Llp;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;IB)V",
		garbageValue = "71"
	)
	static final void method5092(String var0, int var1) {
		PacketBufferNode var2 = Client.getPacketBufferNode(ClientPacket.field2345, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByte(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1031149310"
	)
	static void method5091() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
