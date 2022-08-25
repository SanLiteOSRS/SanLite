import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
class class361 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	final class362 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmv;)V"
	)
	class361(class362 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;I)I",
		garbageValue = "397999183"
	)
	int method6493(class363 var1, class363 var2) {
		if (var1.field4270 > var2.field4270) { // L: 9
			return 1;
		} else {
			return var1.field4270 < var2.field4270 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6493((class363)var1, (class363)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}
}
