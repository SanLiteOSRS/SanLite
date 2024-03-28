import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class211 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2165;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2163;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2170;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2168;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2166;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2167;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2171;

	static {
		field2165 = new class211(0, class225.field2404); // L: 4
		field2163 = new class211(1, class225.field2407); // L: 5
		field2170 = new class211(2, class225.field2409); // L: 6
		field2168 = new class211(3, class225.field2401); // L: 7
		field2166 = new class211(4, class225.field2410); // L: 8
		field2167 = new class211(5, class225.field2408); // L: 9
		field2171 = new class211(6, class225.field2411); // L: 10
	}

	@ObfuscatedSignature(
		descriptor = "(ILiv;)V"
	)
	class211(int var1, class225 var2) {
	} // L: 12

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "123"
	)
	public static int method3933(int var0) {
		return class7.method60(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 44
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lud;",
		garbageValue = "1"
	)
	public static class522 method3931(int var0) {
		int var1 = class520.field5151[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class522.field5158; // L: 21
		} else if (var1 == 2) { // L: 23
			return class522.field5155; // L: 24
		} else {
			return var1 == 3 ? class522.field5160 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-181082999"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class425.getPacketBufferNode(ClientPacket.field3265, Client.packetWriter.isaacCipher); // L: 12757
		var0.packetBuffer.writeByte(0); // L: 12758
		Client.packetWriter.addNode(var0); // L: 12759
	} // L: 12760
}
