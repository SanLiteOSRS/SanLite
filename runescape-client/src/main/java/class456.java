import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public abstract class class456 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 71849511
	)
	int field4803;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1095678947
	)
	int field4801;
	@ObfuscatedName("aa")
	double field4804;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 570638463
	)
	int field4802;

	class456(int var1, int var2) {
		this.field4803 = 0; // L: 4
		this.field4801 = 0; // L: 5
		this.field4804 = 0.0D; // L: 6
		this.field4802 = 0; // L: 7
		this.field4803 = var1; // L: 11
		this.field4801 = 0; // L: 12
		this.field4802 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4804 = class70.method2045(this.field4801, this.field4803, this.field4802); // L: 14
	} // L: 15

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1056608867"
	)
	public void method8441() {
		if (this.field4801 < this.field4803) { // L: 18
			++this.field4801; // L: 19
			this.field4804 = class70.method2045(this.field4801, this.field4803, this.field4802); // L: 20
		}

	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1089057010"
	)
	double method8447() {
		return this.field4804; // L: 25
	}
}
