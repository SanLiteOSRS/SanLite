import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class424 implements Comparable {
	@ObfuscatedName("au")
	Object field4620;
	@ObfuscatedName("ae")
	Object field4621;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 7811919619489354263L
	)
	long field4622;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -5410299538867077373L
	)
	long field4623;

	class424(Object var1, Object var2) {
		this.field4620 = var1; // L: 10
		this.field4621 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqj;B)I",
		garbageValue = "1"
	)
	int method7797(class424 var1) {
		if (this.field4623 < var1.field4623) {
			return -1; // L: 15
		} else {
			return this.field4623 > var1.field4623 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class424) { // L: 22
			return this.field4621.equals(((class424)var1).field4621);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int compareTo(Object var1) {
		return this.method7797((class424)var1); // L: 32
	}

	public int hashCode() {
		return this.field4621.hashCode(); // L: 28
	}
}
