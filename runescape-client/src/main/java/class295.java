import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class295 {
	@ObfuscatedName("af")
	static int[] field3369;

	static {
		new Object();
		field3369 = new int[33]; // L: 10
		field3369[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3369[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method5745() {
		if (NetCache.NetCache_socket != null) { // L: 270
			NetCache.NetCache_socket.close();
		}

	} // L: 271
}
