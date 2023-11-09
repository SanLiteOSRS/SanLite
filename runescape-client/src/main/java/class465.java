import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class465 extends class467 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2088223559
	)
	int field4814;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 133450869
	)
	int field4811;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 283288989
	)
	int field4812;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 116830583
	)
	int field4813;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 319493363
	)
	int field4810;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1241299085
	)
	int field4815;

	public class465(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8); // L: 12
		this.field4814 = 0; // L: 4
		this.field4811 = 0; // L: 5
		this.field4812 = 0; // L: 6
		this.field4813 = 0; // L: 7
		this.field4810 = 0; // L: 8
		this.field4815 = 0; // L: 9
		this.field4814 = var1; // L: 13
		this.field4811 = var2; // L: 14
		this.field4812 = var3; // L: 15
		this.field4813 = var4; // L: 16
		this.field4810 = var5; // L: 17
		this.field4815 = var6; // L: 18
	} // L: 19

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public int vmethod8410() {
		double var1 = this.method8421(); // L: 22
		return (int)Math.round(var1 * (double)(this.field4813 - this.field4814) + (double)this.field4814); // L: 23
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2035088065"
	)
	public int vmethod8411() {
		double var1 = this.method8421(); // L: 27
		return (int)Math.round(var1 * (double)(this.field4810 - this.field4811) + (double)this.field4811); // L: 28
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-812959020"
	)
	public int vmethod8412() {
		double var1 = this.method8421(); // L: 32
		return (int)Math.round((double)(this.field4815 - this.field4812) * var1 + (double)this.field4812); // L: 33
	}
}
