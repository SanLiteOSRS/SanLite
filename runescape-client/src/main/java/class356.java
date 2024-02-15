import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class356 {
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static class378 field3897;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Lpp;IB)Lpp;",
		garbageValue = "0"
	)
	@Export("findEnumerated")
	public static class390 findEnumerated(class390[] var0, int var1) {
		class390[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class390 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}
}
