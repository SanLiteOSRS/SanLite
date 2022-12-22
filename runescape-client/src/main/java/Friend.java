import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("h")
	boolean field4519;
	@ObfuscatedName("e")
	boolean field4518;

	Friend() {
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)I",
		garbageValue = "-1480790073"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4519 && !var1.field4519) { // L: 16
			return -1;
		} else if (!this.field4519 && var1.field4519) { // L: 17
			return 1;
		} else if (this.field4518 && !var1.field4518) { // L: 18
			return -1;
		} else if (!this.field4518 && var1.field4518) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)I",
		garbageValue = "-1893146393"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12538
			PacketBufferNode var1 = class136.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 12540
			var1.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var0)); // L: 12541
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12542
			Client.packetWriter.addNode(var1); // L: 12543
		}
	} // L: 12544
}
