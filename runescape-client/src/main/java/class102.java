import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class102 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1665237913
	)
	int field1337;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1230111439
	)
	int field1334;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1467233549
	)
	int field1336;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -627091163
	)
	int field1338;

	class102(int var1, int var2, int var3, int var4) {
		this.field1337 = var1; // L: 10
		this.field1334 = var2; // L: 11
		this.field1336 = var3; // L: 12
		this.field1338 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "55"
	)
	int method2698() {
		return this.field1337; // L: 17
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2699() {
		return this.field1334; // L: 21
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "738159282"
	)
	int method2703() {
		return this.field1336; // L: 25
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-790332753"
	)
	int method2711() {
		return this.field1338; // L: 29
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class217.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher); // L: 12614
		var0.packetBuffer.writeByte(0); // L: 12615
		Client.packetWriter.addNode(var0); // L: 12616
	} // L: 12617
}
