import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class254 {
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 370047429
	)
	static int field2776;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2095764740"
	)
	public static int method4942(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 101
		return (var0 + var2) / var1 - var2; // L: 102
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	static final void method4939() {
		KitDefinition.field2034 = null; // L: 3089
		KitDefinition.KitDefinition_modelsArchive = null; // L: 3090
		class12.field56 = 0; // L: 3091
	} // L: 3093
}
