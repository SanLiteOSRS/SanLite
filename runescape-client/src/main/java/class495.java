import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public abstract class class495 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -826744403
	)
	int field4921;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1323218663
	)
	int field4918;
	@ObfuscatedName("av")
	double field4919;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1942844467
	)
	int field4917;

	class495(int var1, int var2) {
		this.field4921 = 0; // L: 4
		this.field4918 = 0; // L: 5
		this.field4919 = 0.0D; // L: 6
		this.field4917 = 0; // L: 7
		this.field4921 = var1; // L: 11
		this.field4918 = 0; // L: 12
		this.field4917 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field4919 = MenuAction.method2122(this.field4918, this.field4921, this.field4917); // L: 14
	} // L: 15

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2121571736"
	)
	public void method8627() {
		if (this.field4918 < this.field4921) { // L: 18
			++this.field4918; // L: 19
			this.field4919 = MenuAction.method2122(this.field4918, this.field4921, this.field4917); // L: 20
		}

	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1788156713"
	)
	double method8628() {
		return this.field4919; // L: 25
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;[II)[Ljava/lang/Object;",
		garbageValue = "1602002103"
	)
	static Object[] method8635(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class517 var7 = Tile.method4516(var1[var5]); // L: 35
				var3[var6] = var7.method9032(var0); // L: 36
			}
		}

		return var3; // L: 39
	}
}
