import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class212 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("archive6")
	static EvictingDualNodeHashTable archive6;

	static {
		archive6 = new EvictingDualNodeHashTable(64); // L: 8
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Lnm;",
		garbageValue = "-1852354008"
	)
	static Widget method3891(Widget var0) {
		int var2 = MouseRecorder.getWidgetFlags(var0); // L: 12694
		int var1 = var2 >> 17 & 7; // L: 12696
		int var3 = var1; // L: 12698
		if (var1 == 0) { // L: 12699
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 12700
				var0 = class33.field184.method6240(var0.parentId); // L: 12701
				if (var0 == null) { // L: 12702
					return null;
				}
			}

			return var0; // L: 12704
		}
	}
}
