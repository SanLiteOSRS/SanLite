import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class466 extends class468 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 644710405
	)
	int field4817;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -742682503
	)
	int field4816;

	public class466(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field4817 = 0; // L: 4
		this.field4816 = 0; // L: 5
		this.field4817 = var1; // L: 9
		this.field4816 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "288174234"
	)
	public int method8408() {
		double var1 = this.method8421(); // L: 14
		return (int)Math.round((double)this.field4817 + (double)(this.field4816 - this.field4817) * var1); // L: 15
	}
}
