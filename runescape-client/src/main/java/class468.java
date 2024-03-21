import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public final class class468 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lsf;"
	)
	static class468[] field4833;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -239332155
	)
	static int field4838;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1473148381
	)
	static int field4834;
	@ObfuscatedName("ai")
	float field4835;
	@ObfuscatedName("ar")
	float field4836;
	@ObfuscatedName("as")
	float field4837;
	@ObfuscatedName("aa")
	float field4832;

	static {
		field4833 = new class468[0]; // L: 4
		field4838 = 100; // L: 10
		field4833 = new class468[100]; // L: 11
		field4834 = 0; // L: 12
		new class468();
	} // L: 18

	class468() {
		this.method8593(); // L: 42
	} // L: 43

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method8597() {
		synchronized(field4833) { // L: 36
			if (field4834 < field4838 - 1) { // L: 37
				field4833[++field4834 - 1] = this;
			}

		}
	} // L: 39

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-101"
	)
	void method8596(float var1, float var2, float var3, float var4) {
		this.field4835 = var1; // L: 46
		this.field4836 = var2; // L: 47
		this.field4837 = var3; // L: 48
		this.field4832 = var4; // L: 49
	} // L: 50

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1089175706"
	)
	public void method8592(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4)); // L: 53
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 54
		this.field4835 = var1 * var5; // L: 55
		this.field4836 = var2 * var5; // L: 56
		this.field4837 = var3 * var5; // L: 57
		this.field4832 = var6; // L: 58
	} // L: 59

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "752088087"
	)
	final void method8593() {
		this.field4837 = 0.0F; // L: 62
		this.field4836 = 0.0F; // L: 63
		this.field4835 = 0.0F; // L: 64
		this.field4832 = 1.0F; // L: 65
	} // L: 66

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsf;I)V",
		garbageValue = "1990416396"
	)
	public final void method8594(class468 var1) {
		this.method8596(var1.field4835 * this.field4832 + this.field4835 * var1.field4832 + var1.field4836 * this.field4837 - var1.field4837 * this.field4836, var1.field4836 * this.field4832 + (var1.field4832 * this.field4836 - this.field4837 * var1.field4835) + this.field4835 * var1.field4837, var1.field4832 * this.field4837 + this.field4836 * var1.field4835 - this.field4835 * var1.field4836 + this.field4832 * var1.field4837, var1.field4832 * this.field4832 - this.field4835 * var1.field4835 - var1.field4836 * this.field4836 - var1.field4837 * this.field4837); // L: 69
	} // L: 70

	public String toString() {
		return this.field4835 + "," + this.field4836 + "," + this.field4837 + "," + this.field4832; // L: 94
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class468)) { // L: 74
			return false; // L: 78
		} else {
			class468 var2 = (class468)var1; // L: 75
			return this.field4835 == var2.field4835 && var2.field4836 == this.field4836 && var2.field4837 == this.field4837 && var2.field4832 == this.field4832; // L: 76
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 83
		float var2 = 1.0F; // L: 84
		var2 = var2 * 31.0F + this.field4835; // L: 85
		var2 = var2 * 31.0F + this.field4836; // L: 86
		var2 = var2 * 31.0F + this.field4837; // L: 87
		var2 = var2 * 31.0F + this.field4832; // L: 88
		return (int)var2; // L: 89
	}
}
