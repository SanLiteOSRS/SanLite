import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class479 extends class481 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 515837457
	)
	int field4870;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1926180899
	)
	int field4871;

	public class479(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field4870 = 0; // L: 4
		this.field4871 = 0; // L: 5
		this.field4870 = var1; // L: 9
		this.field4871 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method8493() {
		double var1 = this.method8504(); // L: 14
		return (int)Math.round(var1 * (double)(this.field4871 - this.field4870) + (double)this.field4870); // L: 15
	}
}
