import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public abstract class class496 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1027722541
	)
	int field4952;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -655717521
	)
	int field4949;
	@ObfuscatedName("aa")
	double field4951;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -893308173
	)
	int field4950;

	class496(int var1, int var2) {
		this.field4952 = 0; // L: 4
		this.field4949 = 0; // L: 5
		this.field4951 = 0.0D; // L: 6
		this.field4950 = 0; // L: 7
		this.field4952 = var1; // L: 11
		this.field4949 = 0; // L: 12
		this.field4950 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4951 = class209.method4207(this.field4949, this.field4952, this.field4950); // L: 14
	} // L: 15

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method8831() {
		if (this.field4949 < this.field4952) { // L: 18
			++this.field4949; // L: 19
			this.field4951 = class209.method4207(this.field4949, this.field4952, this.field4950); // L: 20
		}

	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-38619419"
	)
	double method8828() {
		return this.field4951; // L: 25
	}
}
