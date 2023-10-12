import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
public class class417 extends class421 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8570152430470197323L
	)
	long field4564;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2113605799
	)
	int field4565;

	@ObfuscatedSignature(
		descriptor = "(Lqm;I)V"
	)
	public class417(class421 var1, int var2) {
		super(var1); // L: 8
		this.field4565 = var2; // L: 9
		super.field4572 = "DelayFadeTask"; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (this.field4564 < (long)this.field4565) { // L: 15
			++this.field4564; // L: 16
			return false; // L: 17
		} else {
			return true; // L: 19
		}
	}
}
