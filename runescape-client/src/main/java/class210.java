import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class210 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field2158;

	static {
		field2158 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-334440030"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 157
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "139624089"
	)
	static void method3930(int var0) {
		if (var0 != Login.loginIndex) { // L: 2013
			Login.loginIndex = var0; // L: 2014
		}
	} // L: 2015

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1087730208"
	)
	static void method3929() {
		Client.packetWriter.addNode(class425.getPacketBufferNode(ClientPacket.field3282, Client.packetWriter.isaacCipher)); // L: 12920
		Client.oculusOrbState = 0; // L: 12921
	} // L: 12922
}
