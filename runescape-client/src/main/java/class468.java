import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public abstract class class468 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1238147959
	)
	int field4815;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -805297035
	)
	int field4816;
	@ObfuscatedName("af")
	double field4817;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -422186143
	)
	int field4818;

	class468(int var1, int var2) {
		this.field4815 = 0; // L: 4
		this.field4816 = 0; // L: 5
		this.field4817 = 0.0D; // L: 6
		this.field4818 = 0; // L: 7
		this.field4815 = var1; // L: 11
		this.field4816 = 0; // L: 12
		this.field4818 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4817 = World.method1801(this.field4816, this.field4815, this.field4818); // L: 14
	} // L: 15

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-786703556"
	)
	public void method8359() {
		if (this.field4816 < this.field4815) { // L: 18
			++this.field4816; // L: 19
			this.field4817 = World.method1801(this.field4816, this.field4815, this.field4818); // L: 20
		}

	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "-3"
	)
	double method8361() {
		return this.field4817; // L: 25
	}
}
