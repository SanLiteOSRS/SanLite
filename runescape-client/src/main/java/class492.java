import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public abstract class class492 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -866448335
	)
	int field4915;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1489920287
	)
	int field4914;
	@ObfuscatedName("az")
	double field4913;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -18135297
	)
	int field4916;

	class492(int var1, int var2) {
		this.field4915 = 0; // L: 4
		this.field4914 = 0; // L: 5
		this.field4913 = 0.0D; // L: 6
		this.field4916 = 0; // L: 7
		this.field4915 = var1; // L: 11
		this.field4914 = 0; // L: 12
		this.field4916 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4913 = PlayerType.method6883(this.field4914, this.field4915, this.field4916); // L: 14
	} // L: 15

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1511635495"
	)
	public void method8684() {
		if (this.field4914 < this.field4915) { // L: 18
			++this.field4914; // L: 19
			this.field4913 = PlayerType.method6883(this.field4914, this.field4915, this.field4916); // L: 20
		}

	} // L: 22

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "-60"
	)
	double method8685() {
		return this.field4913; // L: 25
	}
}
