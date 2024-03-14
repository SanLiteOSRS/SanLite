import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class360 {
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "0"
	)
	static void method6993(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2]; // L: 8491
		if (var5 != null) { // L: 8492
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) { // L: 8493 8494 8499
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) { // L: 8495
					var6.remove(); // L: 8496
					break;
				}
			}

			if (var5.last() == null) { // L: 8501
				Client.groundItems[var0][var1][var2] = null;
			}

			class73.method2117(var0, var1, var2); // L: 8502
		}

	} // L: 8504
}
