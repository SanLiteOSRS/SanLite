import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class172 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field1815;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = -254885888
	)
	static int field1817;

	static {
		field1815 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "70"
	)
	public static int method3570(int var0) {
		return class480.field4859[var0 & 16383]; // L: 33
	}
}
