import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class466 extends class468 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field4812;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 770879393
	)
	int field4811;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1679615751
	)
	int field4810;

	public class466(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field4811 = 0; // L: 4
		this.field4810 = 0; // L: 5
		this.field4811 = var1; // L: 9
		this.field4810 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
	)
	public int method8343() {
		double var1 = this.method8361(); // L: 14
		return (int)Math.round(var1 * (double)(this.field4810 - this.field4811) + (double)this.field4811); // L: 15
	}
}
