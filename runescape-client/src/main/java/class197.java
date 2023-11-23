import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class197 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("archive4")
	public static EvictingDualNodeHashTable archive4;

	static {
		archive4 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "73"
	)
	public static int method3811(int var0, int var1, int var2) {
		int var3 = class214.method4227(var2 - var1 + 1); // L: 45
		var3 <<= var1; // L: 46
		var0 |= var3; // L: 47
		return var0; // L: 48
	}
}
