import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class319 {
	@ObfuscatedName("aq")
	static int[] field3463;

	static {
		new Object();
		field3463 = new int[33]; // L: 10
		field3463[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3463[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/Object;",
		garbageValue = "6380"
	)
	static Object method6108(int var0) {
		return class317.method6067((class521)class356.findEnumerated(class521.method9335(), var0)); // L: 5392
	}
}
