import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class165 {
	@ObfuscatedName("cz")
	@Export("otp")
	static String otp;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "1"
	)
	public static int method3441(CharSequence var0, int var1) {
		return GrandExchangeOffer.method6969(var0, var1, true); // L: 81
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-76"
	)
	static final void method3442(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12634
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3423()) { // L: 12635
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12636
				if (var2.rank == -1) { // L: 12637
					PacketBufferNode var3 = class217.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 12638
					var3.packetBuffer.writeByte(3 + Player.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12639
					var3.packetBuffer.writeByte(var0); // L: 12640
					var3.packetBuffer.writeShort(var1); // L: 12641
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12642
					Client.packetWriter.addNode(var3); // L: 12643
				}
			}
		}
	} // L: 12644
}
