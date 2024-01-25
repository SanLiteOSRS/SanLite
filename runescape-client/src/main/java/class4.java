import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public final class class4 {
	@ObfuscatedName("ge")
	static String field4;

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-467280453"
	)
	static void method16(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = Client.groundItems[var0][var1][var2]; // L: 8340
		if (var6 != null) { // L: 8341
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) { // L: 8342 8343 8348
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) { // L: 8344
					var7.quantity = var5; // L: 8345
					break;
				}
			}

			class134.method3141(var0, var1, var2); // L: 8350
		}

	} // L: 8352

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1850141553"
	)
	static void method17(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3213, Client.packetWriter.isaacCipher); // L: 12678
		var4.packetBuffer.method9439(var3 ? Client.field800 : 0); // L: 12679
		var4.packetBuffer.method9557(var0); // L: 12680
		var4.packetBuffer.writeByte(var2); // L: 12681
		var4.packetBuffer.writeShort(var1); // L: 12682
		Client.packetWriter.addNode(var4); // L: 12683
	} // L: 12684
}
