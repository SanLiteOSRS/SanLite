import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "2088056836"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1513593399"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1554709844"
	)
	static final void method6400(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class482.guestClanChannel; // L: 13150
		if (var2 != null && var1 >= 0 && var1 < var2.method3359()) { // L: 13151
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 13152
			if (var3.rank == -1) { // L: 13153
				String var4 = var3.username.getName(); // L: 13154
				PacketBufferNode var5 = Renderable.getPacketBufferNode(ClientPacket.field3095, Client.packetWriter.isaacCipher); // L: 13155
				var5.packetBuffer.writeByte(3 + class96.stringCp1252NullTerminatedByteSize(var4)); // L: 13156
				var5.packetBuffer.writeByte(var0); // L: 13157
				var5.packetBuffer.writeShort(var1); // L: 13158
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 13159
				Client.packetWriter.addNode(var5); // L: 13160
			}
		}
	} // L: 13161
}
