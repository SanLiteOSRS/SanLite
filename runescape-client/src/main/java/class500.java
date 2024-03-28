import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public abstract class class500 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 2052906341
	)
	static int field5007;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -966293089
	)
	int field5006;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2000901253
	)
	int field5010;
	@ObfuscatedName("al")
	double field5008;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1415847201
	)
	int field5009;

	class500(int var1, int var2) {
		this.field5006 = 0; // L: 4
		this.field5010 = 0; // L: 5
		this.field5008 = 0.0D; // L: 6
		this.field5009 = 0; // L: 7
		this.field5006 = var1; // L: 11
		this.field5010 = 0; // L: 12
		this.field5009 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field5008 = class14.method185(this.field5010, this.field5006, this.field5009); // L: 14
	} // L: 15

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1134109703"
	)
	public void method8685() {
		if (this.field5010 < this.field5006) { // L: 18
			++this.field5010; // L: 19
			this.field5008 = class14.method185(this.field5010, this.field5006, this.field5009); // L: 20
		}

	} // L: 22

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "782653360"
	)
	double method8680() {
		return this.field5008; // L: 25
	}
}
