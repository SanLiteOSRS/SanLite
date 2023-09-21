import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public final class class439 implements Comparable {
	@ObfuscatedName("ac")
	Object field4666;
	@ObfuscatedName("al")
	Object field4664;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -3195273471768598669L
	)
	long field4665;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -3044479981880177795L
	)
	long field4663;

	class439(Object var1, Object var2) {
		this.field4666 = var1; // L: 10
		this.field4664 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)I",
		garbageValue = "-1884046273"
	)
	int method7947(class439 var1) {
		if (this.field4663 < var1.field4663) {
			return -1; // L: 15
		} else {
			return this.field4663 > var1.field4663 ? 1 : 0; // L: 16 17
		}
	}

	public int hashCode() {
		return this.field4664.hashCode(); // L: 28
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class439) { // L: 22
			return this.field4664.equals(((class439)var1).field4664);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int compareTo(Object var1) {
		return this.method7947((class439)var1); // L: 32
	}
}
