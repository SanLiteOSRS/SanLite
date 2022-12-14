import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class159 extends class152 {
	@ObfuscatedName("n")
	static int[][][] field1816;
	@ObfuscatedName("h")
	String field1814;
	@ObfuscatedName("e")
	byte field1813;
	@ObfuscatedName("v")
	byte field1815;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class159(class153 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "468341515"
	)
	void vmethod3336(Buffer var1) {
		this.field1814 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1814 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1813 = var1.readByte(); // L: 161
			this.field1815 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1227548281"
	)
	void vmethod3337(ClanChannel var1) {
		var1.name = this.field1814; // L: 167
		if (this.field1814 != null) { // L: 168
			var1.field1796 = this.field1813; // L: 169
			var1.field1799 = this.field1815; // L: 170
		}

	} // L: 172

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1927602287"
	)
	public static int method3346(int var0, int var1, int var2) {
		int var3 = Actor.method2362(var2 - var1 + 1); // L: 39
		var3 <<= var1; // L: 40
		return var0 & ~var3; // L: 41
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1850938391"
	)
	public static boolean method3345() {
		return class286.musicPlayerStatus != 0 ? true : class251.midiPcmStream.isReady(); // L: 65 66
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-141846119"
	)
	static final void method3339(String var0, int var1) {
		PacketBufferNode var2 = class136.getPacketBufferNode(ClientPacket.field3089, Client.packetWriter.isaacCipher); // L: 232
		var2.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 233
		var2.packetBuffer.method8578(var1); // L: 234
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 235
		Client.packetWriter.addNode(var2); // L: 236
	} // L: 237
}
