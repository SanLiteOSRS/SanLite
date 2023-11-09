import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public abstract class class468 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 759052865
	)
	int field4820;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 888755041
	)
	int field4819;
	@ObfuscatedName("ag")
	double field4821;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2074043037
	)
	int field4818;

	class468(int var1, int var2) {
		this.field4820 = 0; // L: 4
		this.field4819 = 0; // L: 5
		this.field4821 = 0.0D; // L: 6
		this.field4818 = 0; // L: 7
		this.field4820 = var1; // L: 11
		this.field4819 = 0; // L: 12
		this.field4818 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4821 = NetFileRequest.method6720(this.field4819, this.field4820, this.field4818); // L: 14
	} // L: 15

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10714"
	)
	public void method8420() {
		if (this.field4819 < this.field4820) { // L: 18
			++this.field4819; // L: 19
			this.field4821 = NetFileRequest.method6720(this.field4819, this.field4820, this.field4818); // L: 20
		}

	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-509822556"
	)
	double method8421() {
		return this.field4821; // L: 25
	}
}
