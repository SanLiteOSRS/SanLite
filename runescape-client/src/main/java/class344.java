import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class344 {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = -1872004035
	)
	static int field3874;

	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(II)Ltx;",
		garbageValue = "2122507406"
	)
	static class506 method6604(int var0) {
		class506 var1 = (class506)Client.Widget_cachedModels.get((long)var0); // L: 12905
		if (var1 == null) { // L: 12906
			var1 = new class506(class343.field3869, UserComparator3.method2895(var0), class194.method3686(var0)); // L: 12907
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12908
		}

		return var1; // L: 12910
	}
}
