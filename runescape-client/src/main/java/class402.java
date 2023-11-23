import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public final class class402 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1466470293
	)
	static int field4475;
	@ObfuscatedName("at")
	final Object field4474;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -775774973
	)
	int field4472;

	class402(Object var1, int var2) {
		this.field4474 = var1; // L: 170
		this.field4472 = var2; // L: 171
	} // L: 172

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-6"
	)
	static void method7472(int var0, String var1) {
		int var2 = Players.Players_count; // L: 10163
		int[] var3 = Players.Players_indices; // L: 10164
		boolean var4 = false; // L: 10165
		Username var5 = new Username(var1, class89.loginType); // L: 10166

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10167
			Player var7 = Client.players[var3[var6]]; // L: 10168
			if (var7 != null && var7 != class229.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10169
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10170
					var8 = class113.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 10172
					var8.packetBuffer.writeShort(var3[var6]); // L: 10173
					var8.packetBuffer.method9291(0); // L: 10174
					Client.packetWriter.addNode(var8); // L: 10175
				} else if (var0 == 4) { // L: 10177
					var8 = class113.getPacketBufferNode(ClientPacket.field3217, Client.packetWriter.isaacCipher); // L: 10179
					var8.packetBuffer.method9292(0); // L: 10180
					var8.packetBuffer.method9300(var3[var6]); // L: 10181
					Client.packetWriter.addNode(var8); // L: 10182
				} else if (var0 == 6) { // L: 10184
					var8 = class113.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 10186
					var8.packetBuffer.method9292(0); // L: 10187
					var8.packetBuffer.writeShort(var3[var6]); // L: 10188
					Client.packetWriter.addNode(var8); // L: 10189
				} else if (var0 == 7) { // L: 10191
					var8 = class113.getPacketBufferNode(ClientPacket.field3149, Client.packetWriter.isaacCipher); // L: 10193
					var8.packetBuffer.method9490(var3[var6]); // L: 10194
					var8.packetBuffer.method9292(0); // L: 10195
					Client.packetWriter.addNode(var8); // L: 10196
				}

				var4 = true; // L: 10198
				break;
			}
		}

		if (!var4) { // L: 10202
			GrandExchangeOfferUnitPriceComparator.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10203
}
