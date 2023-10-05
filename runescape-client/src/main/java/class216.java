import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
final class class216 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 453
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-128"
	)
	static char method3940(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-541702419"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12623
			PacketBufferNode var1 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3233, Client.packetWriter.isaacCipher); // L: 12625
			var1.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var0)); // L: 12626
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12627
			Client.packetWriter.addNode(var1); // L: 12628
		}
	} // L: 12629
}
