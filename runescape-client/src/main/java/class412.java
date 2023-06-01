import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public final class class412 implements Comparable {
	@ObfuscatedName("ay")
	Object field4575;
	@ObfuscatedName("an")
	Object field4574;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -504955787494414637L
	)
	long field4573;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4072860295898087639L
	)
	long field4576;

	class412(Object var1, Object var2) {
		this.field4575 = var1; // L: 10
		this.field4574 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lps;B)I",
		garbageValue = "98"
	)
	int method7704(class412 var1) {
		if (this.field4576 < var1.field4576) {
			return -1; // L: 15
		} else {
			return this.field4576 > var1.field4576 ? 1 : 0; // L: 16 17
		}
	}

	public int hashCode() {
		return this.field4574.hashCode(); // L: 28
	}

	public int compareTo(Object var1) {
		return this.method7704((class412)var1); // L: 32
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class412) { // L: 22
			return this.field4574.equals(((class412)var1).field4574);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}
}
