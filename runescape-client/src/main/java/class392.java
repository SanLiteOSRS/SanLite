import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public final class class392 implements Comparable {
	@ObfuscatedName("f")
	Object field4531;
	@ObfuscatedName("w")
	Object field4529;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 4992861188022597753L
	)
	long field4530;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 5886928149660461869L
	)
	long field4528;

	class392(Object var1, Object var2) {
		this.field4531 = var1; // L: 10
		this.field4529 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loh;I)I",
		garbageValue = "-1562673330"
	)
	int method7505(class392 var1) {
		if (this.field4528 < var1.field4528) {
			return -1; // L: 15
		} else {
			return this.field4528 > var1.field4528 ? 1 : 0; // L: 16 17
		}
	}

	public int compareTo(Object var1) {
		return this.method7505((class392)var1); // L: 32
	}

	public int hashCode() {
		return this.field4529.hashCode(); // L: 28
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class392) { // L: 22
			return this.field4529.equals(((class392)var1).field4529);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}
}
