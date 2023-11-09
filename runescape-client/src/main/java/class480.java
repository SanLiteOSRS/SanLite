import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public abstract class class480 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2033898981
	)
	int field4865;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1910078403
	)
	int field4864;
	@ObfuscatedName("az")
	double field4866;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -152402393
	)
	int field4867;

	class480(int var1, int var2) {
		this.field4865 = 0; // L: 4
		this.field4864 = 0; // L: 5
		this.field4866 = 0.0D; // L: 6
		this.field4867 = 0; // L: 7
		this.field4865 = var1; // L: 11
		this.field4864 = 0; // L: 12
		this.field4867 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4866 = Strings.method6678(this.field4864, this.field4865, this.field4867); // L: 14
	} // L: 15

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "363928278"
	)
	public void method8480() {
		if (this.field4864 < this.field4865) { // L: 18
			++this.field4864; // L: 19
			this.field4866 = Strings.method6678(this.field4864, this.field4865, this.field4867); // L: 20
		}

	} // L: 22

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "-18"
	)
	double method8488() {
		return this.field4866; // L: 25
	}
}
