import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public class class251 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lte;I)Llt;",
		garbageValue = "-1821001104"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class137.method3066(); // L: 27
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1033998081"
	)
	public static String method5039(String var0) {
		int var1 = var0.length(); // L: 192
		char[] var2 = new char[var1]; // L: 193
		byte var3 = 2; // L: 194

		for (int var4 = 0; var4 < var1; ++var4) { // L: 195
			char var5 = var0.charAt(var4); // L: 196
			if (var3 == 0) { // L: 197
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 198
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 201
					var6 = Character.toTitleCase(var5); // L: 205
				} else {
					var6 = var5; // L: 202
				}

				var5 = var6; // L: 207
			}

			if (Character.isLetter(var5)) {
				var3 = 0; // L: 209
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 210
				if (Character.isSpaceChar(var5)) { // L: 211
					if (var3 != 2) { // L: 212
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 214
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 215
		}

		return new String(var2); // L: 217
	}
}
