import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			Messages.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	static final void method870(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12657
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3301()) { // L: 12658
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12659
				PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher); // L: 12660
				var4.packetBuffer.writeByte(4 + AbstractSocket.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12661
				var4.packetBuffer.writeByte(var0); // L: 12662
				var4.packetBuffer.writeShort(var1); // L: 12663
				var4.packetBuffer.writeBoolean(var2); // L: 12664
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12665
				Client.packetWriter.addNode(var4); // L: 12666
			}
		}
	} // L: 12667
}
