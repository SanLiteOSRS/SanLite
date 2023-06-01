import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public final class class437 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lqa;"
	)
	static class437[] field4689;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1948402603
	)
	static int field4684;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -843730395
	)
	static int field4683;
	@ObfuscatedName("ab")
	float field4686;
	@ObfuscatedName("at")
	float field4687;
	@ObfuscatedName("ax")
	float field4688;
	@ObfuscatedName("al")
	float field4691;

	static {
		field4689 = new class437[0]; // L: 4
		field4684 = 100; // L: 10
		field4689 = new class437[100]; // L: 11
		field4683 = 0; // L: 12
		new class437();
	} // L: 18

	class437() {
		this.method8115(); // L: 42
	} // L: 43

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-44503310"
	)
	public void method8118() {
		synchronized(field4689) { // L: 36
			if (field4683 < field4684 - 1) { // L: 37
				field4689[++field4683 - 1] = this;
			}

		}
	} // L: 39

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1396741989"
	)
	void method8114(float var1, float var2, float var3, float var4) {
		this.field4686 = var1; // L: 46
		this.field4687 = var2; // L: 47
		this.field4688 = var3; // L: 48
		this.field4691 = var4; // L: 49
	} // L: 50

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1812578810"
	)
	public void method8137(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 53
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 54
		this.field4686 = var1 * var5; // L: 55
		this.field4687 = var5 * var2; // L: 56
		this.field4688 = var5 * var3; // L: 57
		this.field4691 = var6; // L: 58
	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method8115() {
		this.field4688 = 0.0F; // L: 62
		this.field4687 = 0.0F; // L: 63
		this.field4686 = 0.0F; // L: 64
		this.field4691 = 1.0F; // L: 65
	} // L: 66

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V",
		garbageValue = "1569948236"
	)
	public final void method8116(class437 var1) {
		this.method8114(this.field4688 * var1.field4687 + var1.field4686 * this.field4691 + this.field4686 * var1.field4691 - var1.field4688 * this.field4687, this.field4687 * var1.field4691 - var1.field4686 * this.field4688 + this.field4691 * var1.field4687 + this.field4686 * var1.field4688, this.field4688 * var1.field4691 + var1.field4686 * this.field4687 - var1.field4687 * this.field4686 + var1.field4688 * this.field4691, this.field4691 * var1.field4691 - this.field4686 * var1.field4686 - this.field4687 * var1.field4687 - var1.field4688 * this.field4688); // L: 69
	} // L: 70

	public int hashCode() {
		boolean var1 = true; // L: 83
		float var2 = 1.0F; // L: 84
		var2 = var2 * 31.0F + this.field4686; // L: 85
		var2 = this.field4687 + 31.0F * var2; // L: 86
		var2 = var2 * 31.0F + this.field4688; // L: 87
		var2 = this.field4691 + 31.0F * var2; // L: 88
		return (int)var2; // L: 89
	}

	public String toString() {
		return this.field4686 + "," + this.field4687 + "," + this.field4688 + "," + this.field4691; // L: 94
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class437)) { // L: 74
			return false; // L: 78
		} else {
			class437 var2 = (class437)var1; // L: 75
			return var2.field4686 == this.field4686 && var2.field4687 == this.field4687 && this.field4688 == var2.field4688 && var2.field4691 == this.field4691; // L: 76
		}
	}
}
