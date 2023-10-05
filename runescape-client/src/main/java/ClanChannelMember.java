import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ac")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1939235813
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1441597193"
	)
	public static int method3165(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var1;
		} else if (var2 == 1) { // L: 11
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0; // L: 12
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lvd;I)Llx;",
		garbageValue = "2045853930"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class306.method5863(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "1124709425"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field738) { // L: 12119
			Client.field739[var0.rootIndex] = true; // L: 12120
		}

	} // L: 12122
}
