import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class354 {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1854178059"
	)
	static int method6859(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 4430
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-390178192"
	)
	static void method6858(Buffer var0) {
		if (Client.randomDatData != null) { // L: 12870
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 12871
		} else {
			byte[] var1 = class139.method3193(); // L: 12874
			var0.writeBytes(var1, 0, var1.length); // L: 12875
		}
	} // L: 12872 12876
}
