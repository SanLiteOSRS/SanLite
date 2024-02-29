import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class174 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static EvictingDualNodeHashTable field1849;

	static {
		field1849 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "235599457"
	)
	public static int method3546(String var0) {
		return var0.length() + 2; // L: 132
	}
}
