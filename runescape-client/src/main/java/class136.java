import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public abstract class class136 extends Node {
	class136() {
	} // L: 68

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1101327225"
	)
	abstract void vmethod3349(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "839088249"
	)
	abstract void vmethod3350(ClanSettings var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Lrg;B)Ljx;",
		garbageValue = "107"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class109.method2781(); // L: 27
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2080647324"
	)
	public static boolean method3075(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6278"
	)
	static void method3073() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12031
			int var1 = var0.group; // L: 12032
			if (Players.loadInterface(var1)) { // L: 12033
				boolean var2 = true; // L: 12034
				Widget[] var3 = class71.Widget_interfaceComponents[var1]; // L: 12035

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12036
					if (var3[var4] != null) { // L: 12037
						var2 = var3[var4].isIf3; // L: 12038
						break;
					}
				}

				if (!var2) { // L: 12042
					var4 = (int)var0.key; // L: 12043
					Widget var5 = class175.getWidget(var4); // L: 12044
					if (var5 != null) { // L: 12045
						class69.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12049
}
