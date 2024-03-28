import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class268 {
	@ObfuscatedName("aa")
	public static String field2956;

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	static void method5236() {
		for (int var0 = 0; var0 < Client.field533.size(); ++var0) { // L: 13014
			if (class192.method3717((Integer)Client.field533.get(var0)) != 2) { // L: 13015
				Client.field533.remove(var0); // L: 13016
				--var0; // L: 13017
			}
		}

	} // L: 13020
}
