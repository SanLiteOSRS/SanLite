import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mr
@ObfuscatedName("op")
public final class class386 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$"); // L: 9
	} // L: 10

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "289831668"
	)
	static final void method7205(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12644
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3301()) { // L: 12645
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12646
				if (var2.rank == -1) { // L: 12647
					PacketBufferNode var3 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 12648
					var3.packetBuffer.writeByte(3 + AbstractSocket.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12649
					var3.packetBuffer.writeByte(var0); // L: 12650
					var3.packetBuffer.writeShort(var1); // L: 12651
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12652
					Client.packetWriter.addNode(var3); // L: 12653
				}
			}
		}
	} // L: 12654
}
