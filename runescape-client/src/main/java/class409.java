import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public final class class409 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	static class409[] field4601;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1552768481
	)
	static int field4602;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1009623885
	)
	static int field4604;
	@ObfuscatedName("x")
	float field4600;
	@ObfuscatedName("m")
	float field4603;
	@ObfuscatedName("q")
	float field4605;
	@ObfuscatedName("f")
	float field4606;

	static {
		field4601 = new class409[0]; // L: 4
		field4602 = 100; // L: 10
		field4601 = new class409[100]; // L: 11
		field4604 = 0; // L: 12
		new class409();
	} // L: 18

	class409() {
		this.method7763(); // L: 42
	} // L: 43

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1171063218"
	)
	public void method7775() {
		synchronized(field4601) { // L: 36
			if (field4604 < field4602 - 1) { // L: 37
				field4601[++field4604 - 1] = this;
			}

		}
	} // L: 39

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1050402339"
	)
	void method7757(float var1, float var2, float var3, float var4) {
		this.field4603 = var1; // L: 46
		this.field4600 = var2; // L: 47
		this.field4605 = var3; // L: 48
		this.field4606 = var4; // L: 49
	} // L: 50

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-733251402"
	)
	public void method7758(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 53
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 54
		this.field4603 = var5 * var1; // L: 55
		this.field4600 = var5 * var2; // L: 56
		this.field4605 = var3 * var5; // L: 57
		this.field4606 = var6; // L: 58
	} // L: 59

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	final void method7763() {
		this.field4605 = 0.0F; // L: 62
		this.field4600 = 0.0F; // L: 63
		this.field4603 = 0.0F; // L: 64
		this.field4606 = 1.0F; // L: 65
	} // L: 66

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "665164038"
	)
	public final void method7760(class409 var1) {
		this.method7757(this.field4605 * var1.field4600 + this.field4603 * var1.field4606 + var1.field4603 * this.field4606 - this.field4600 * var1.field4605, this.field4606 * var1.field4600 + (var1.field4606 * this.field4600 - var1.field4603 * this.field4605) + var1.field4605 * this.field4603, this.field4600 * var1.field4603 + var1.field4606 * this.field4605 - var1.field4600 * this.field4603 + this.field4606 * var1.field4605, var1.field4606 * this.field4606 - this.field4603 * var1.field4603 - var1.field4600 * this.field4600 - this.field4605 * var1.field4605); // L: 69
	} // L: 70

	public int hashCode() {
		boolean var1 = true; // L: 83
		float var2 = 1.0F; // L: 84
		var2 = this.field4603 + var2 * 31.0F; // L: 85
		var2 = this.field4600 + 31.0F * var2; // L: 86
		var2 = var2 * 31.0F + this.field4605; // L: 87
		var2 = this.field4606 + var2 * 31.0F; // L: 88
		return (int)var2; // L: 89
	}

	public String toString() {
		return this.field4603 + "," + this.field4600 + "," + this.field4605 + "," + this.field4606; // L: 94
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class409)) { // L: 74
			return false; // L: 78
		} else {
			class409 var2 = (class409)var1; // L: 75
			return this.field4603 == var2.field4603 && this.field4600 == var2.field4600 && var2.field4605 == this.field4605 && this.field4606 == var2.field4606; // L: 76
		}
	}
}
