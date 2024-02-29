import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "[Lng;"
	)
	static Widget[] field3105;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "1337525422"
	)
	static class525 method5941(int var0) {
		class525 var1 = (class525)Client.Widget_cachedModels.get((long)var0); // L: 12981
		if (var1 == null) { // L: 12982
			var1 = new class525(class150.field1703, class133.method3115(var0), class227.method4423(var0)); // L: 12983
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12984
		}

		return var1; // L: 12986
	}
}
