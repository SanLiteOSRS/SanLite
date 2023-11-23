import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public class class490 extends class492 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 742257353
	)
	int field4911;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1434247403
	)
	int field4912;

	public class490(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field4911 = 0; // L: 4
		this.field4912 = 0; // L: 5
		this.field4911 = var1; // L: 9
		this.field4912 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-287739597"
	)
	public int method8668() {
		double var1 = this.method8685(); // L: 14
		return (int)Math.round(var1 * (double)(this.field4912 - this.field4911) + (double)this.field4911); // L: 15
	}
}
