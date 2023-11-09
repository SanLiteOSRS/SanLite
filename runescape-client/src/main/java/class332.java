import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class332 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public static void method6579() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 51
	} // L: 52

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "115"
	)
	static final void method6585(boolean var0) {
		class156.method3359(); // L: 5965
		++Client.packetWriter.pendingWrites; // L: 5966
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5967
			Client.packetWriter.pendingWrites = 0; // L: 5968
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5969
				PacketBufferNode var1 = class217.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 5971
				Client.packetWriter.addNode(var1); // L: 5972

				try {
					Client.packetWriter.flush(); // L: 5974
				} catch (IOException var3) { // L: 5976
					Client.hadNetworkError = true; // L: 5977
				}
			}

		}
	} // L: 5980
}
