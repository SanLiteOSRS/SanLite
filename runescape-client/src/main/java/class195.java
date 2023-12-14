import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class195 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("archive6")
	public static EvictingDualNodeHashTable archive6;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1432282275
	)
	static int field2021;

	static {
		archive6 = new EvictingDualNodeHashTable(64); // L: 8
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "13"
	)
	public static int method3800(int var0) {
		return class476.field4820[var0 & 16383]; // L: 32
	}
}
