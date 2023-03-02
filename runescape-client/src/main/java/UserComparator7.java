import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -943480781
	)
	static int field1444;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;I)I",
		garbageValue = "-743510609"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-805212170"
	)
	static final void method2926() {
		Client.field709 = Client.cycleCntr; // L: 13112
	} // L: 13113

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "993311164"
	)
	static final void method2927(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 13177
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3359()) { // L: 13178
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 13179
				PacketBufferNode var4 = Renderable.getPacketBufferNode(ClientPacket.field3085, Client.packetWriter.isaacCipher); // L: 13180
				var4.packetBuffer.writeByte(4 + class96.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 13181
				var4.packetBuffer.writeByte(var0); // L: 13182
				var4.packetBuffer.writeShort(var1); // L: 13183
				var4.packetBuffer.writeBoolean(var2); // L: 13184
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 13185
				Client.packetWriter.addNode(var4); // L: 13186
			}
		}
	} // L: 13187
}
