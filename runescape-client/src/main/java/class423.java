import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class423 extends class426 {
	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	public class423(class426 var1) {
		super(var1); // L: 9
		super.field4651 = "StartSongTask"; // L: 10
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		Iterator var1 = class321.field3495.iterator(); // L: 15

		while (var1.hasNext()) {
			class333 var2 = (class333)var1.next(); // L: 16
			if (var2 != null && !var2.field3617 && var2.field3613 != null) { // L: 18
				try {
					var2.field3613.method6093(); // L: 22
					var2.field3613.setPcmStreamVolume(0); // L: 23
					if (var2.field3616 != null) { // L: 24
						var2.field3613.setMusicTrack(var2.field3616, var2.field3609); // L: 25
					}

					var2.field3616 = null; // L: 27
					var2.field3615 = null; // L: 28
					var2.field3614 = null; // L: 29
					var2.field3617 = true; // L: 30
				} catch (Exception var4) { // L: 32
					class180.RunException_sendStackTrace((String)null, var4); // L: 33
					this.method7844(var4.getMessage()); // L: 34
					return true; // L: 35
				}
			}
		}

		super.field4654 = true; // L: 39
		return true; // L: 40
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-40"
	)
	static final void method7813(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12777
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3394()) { // L: 12778
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12779
				if (var2.rank == -1) { // L: 12780
					PacketBufferNode var3 = class425.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher); // L: 12781
					var3.packetBuffer.writeByte(3 + SequenceDefinition.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12782
					var3.packetBuffer.writeByte(var0); // L: 12783
					var3.packetBuffer.writeShort(var1); // L: 12784
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12785
					Client.packetWriter.addNode(var3); // L: 12786
				}
			}
		}
	} // L: 12787
}
