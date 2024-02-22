import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public abstract class class499 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 531678303
	)
	int field4981;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1713945335
	)
	int field4980;
	@ObfuscatedName("au")
	double field4979;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1186043735
	)
	int field4982;

	class499(int var1, int var2) {
		this.field4981 = 0; // L: 4
		this.field4980 = 0; // L: 5
		this.field4979 = 0.0D; // L: 6
		this.field4982 = 0; // L: 7
		this.field4981 = var1; // L: 11
		this.field4980 = 0; // L: 12
		this.field4982 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4979 = class328.method6345(this.field4980, this.field4981, this.field4982); // L: 14
	} // L: 15

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13291"
	)
	public void method8882() {
		if (this.field4980 < this.field4981) { // L: 18
			++this.field4980; // L: 19
			this.field4979 = class328.method6345(this.field4980, this.field4981, this.field4982); // L: 20
		}

	} // L: 22

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-623438626"
	)
	double method8876() {
		return this.field4979; // L: 25
	}
}
