import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class199 extends DualNode {
	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lmb;III)V",
		garbageValue = "250084978"
	)
	public static void method3808(Widget var0, int var1, int var2) {
		var0.field3631.bodyColors[var1] = var2; // L: 1076
		var0.field3631.method6021(); // L: 1077
	} // L: 1078
}
