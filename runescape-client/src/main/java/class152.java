import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class152 extends class143 {
	@ObfuscatedName("ad")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("aw")
	String field1695;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class152(class146 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1695 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.name = this.field1695; // L: 237
	} // L: 238

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "42723484"
	)
	static int method3212(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1107
			if (var1 <= var0 + 30) { // L: 1108
				return var2; // L: 1109
			}

			var0 += 30; // L: 1111
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1112
		}

		return 0; // L: 1114
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2070877225"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12651
			PacketBufferNode var1 = class503.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher); // L: 12653
			var1.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var0)); // L: 12654
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12655
			Client.packetWriter.addNode(var1); // L: 12656
		}
	} // L: 12657
}
