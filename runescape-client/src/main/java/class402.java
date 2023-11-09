import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class402 extends class406 {
	@ObfuscatedName("ag")
	static String[] field4514;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -5325232572376689765L
	)
	long field4512;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 942710907
	)
	int field4513;

	@ObfuscatedSignature(
		descriptor = "(Lpm;I)V"
	)
	public class402(class406 var1, int var2) {
		super(var1); // L: 8
		this.field4513 = var2; // L: 9
		super.field4523 = "DelayFadeTask"; // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (this.field4512 < (long)this.field4513) { // L: 15
			++this.field4512; // L: 16
			return false; // L: 17
		} else {
			return true; // L: 19
		}
	}
}
