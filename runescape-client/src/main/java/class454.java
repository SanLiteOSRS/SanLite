import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class454 extends class456 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -17285747
	)
	int field4799;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1288305887
	)
	int field4800;

	public class454(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field4799 = 0; // L: 4
		this.field4800 = 0; // L: 5
		this.field4799 = var1; // L: 9
		this.field4800 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1656253558"
	)
	public int method8427() {
		double var1 = this.method8447(); // L: 14
		return (int)Math.round((double)this.field4799 + (double)(this.field4800 - this.field4799) * var1); // L: 15
	}
}
