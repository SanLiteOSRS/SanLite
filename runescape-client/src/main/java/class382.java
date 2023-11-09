import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public final class class382 implements Comparable {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("a")
	Object field4454;
	@ObfuscatedName("f")
	Object field4450;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 3657456693374392661L
	)
	long field4451;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -4404056477913896287L
	)
	long field4453;

	class382(Object var1, Object var2) {
		this.field4454 = var1; // L: 10
		this.field4450 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)I",
		garbageValue = "6"
	)
	int method7224(class382 var1) {
		if (this.field4453 < var1.field4453) {
			return -1; // L: 15
		} else {
			return this.field4453 > var1.field4453 ? 1 : 0; // L: 16 17
		}
	}

	public int hashCode() {
		return this.field4450.hashCode(); // L: 28
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class382) { // L: 22
			return this.field4450.equals(((class382)var1).field4450);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int compareTo(Object var1) {
		return this.method7224((class382)var1); // L: 32
	}
}
