import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class377 {
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1486030117"
	)
	static void method7197() {
		if (NetFileRequest.field4144 != null) { // L: 12793
			Client.field793 = Client.cycle; // L: 12794
			NetFileRequest.field4144.method6538(); // L: 12795

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12796
				if (Client.players[var0] != null) { // L: 12797
					NetFileRequest.field4144.method6537(class26.baseX * 64 + (Client.players[var0].x >> 7), class158.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12798
				}
			}
		}

	} // L: 12802
}
