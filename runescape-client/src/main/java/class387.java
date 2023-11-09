import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public final class class387 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lni;"
	)
	static class387[] field4397;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 880421731
	)
	static int field4391;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 360696249
	)
	static int field4392;
	@ObfuscatedName("c")
	float field4393;
	@ObfuscatedName("q")
	float field4395;
	@ObfuscatedName("i")
	float field4394;
	@ObfuscatedName("k")
	float field4396;

	static {
		field4397 = new class387[0]; // L: 4
		field4391 = 100; // L: 10
		field4397 = new class387[100]; // L: 11
		field4392 = 0; // L: 12
		new class387();
	} // L: 18

	class387() {
		this.method6891(); // L: 42
	} // L: 43

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	public void method6881() {
		synchronized(field4397) { // L: 36
			if (field4392 < field4391 - 1) { // L: 37
				field4397[++field4392 - 1] = this;
			}

		}
	} // L: 39

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "52"
	)
	void method6886(float var1, float var2, float var3, float var4) {
		this.field4393 = var1; // L: 46
		this.field4395 = var2; // L: 47
		this.field4394 = var3; // L: 48
		this.field4396 = var4; // L: 49
	} // L: 50

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-2087766706"
	)
	public void method6883(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4)); // L: 53
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 54
		this.field4393 = var5 * var1; // L: 55
		this.field4395 = var5 * var2; // L: 56
		this.field4394 = var3 * var5; // L: 57
		this.field4396 = var6; // L: 58
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1536"
	)
	final void method6891() {
		this.field4394 = 0.0F; // L: 62
		this.field4395 = 0.0F; // L: 63
		this.field4393 = 0.0F; // L: 64
		this.field4396 = 1.0F; // L: 65
	} // L: 66

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-1080183652"
	)
	public final void method6885(class387 var1) {
		this.method6886(this.field4393 * var1.field4396 + this.field4396 * var1.field4393 + var1.field4395 * this.field4394 - this.field4395 * var1.field4394, var1.field4394 * this.field4393 + var1.field4395 * this.field4396 + (this.field4395 * var1.field4396 - var1.field4393 * this.field4394), var1.field4394 * this.field4396 + (this.field4394 * var1.field4396 + var1.field4393 * this.field4395 - var1.field4395 * this.field4393), var1.field4396 * this.field4396 - this.field4393 * var1.field4393 - var1.field4395 * this.field4395 - var1.field4394 * this.field4394); // L: 69
	} // L: 70

	public int hashCode() {
		boolean var1 = true; // L: 83
		float var2 = 1.0F; // L: 84
		var2 = this.field4393 + 31.0F * var2; // L: 85
		var2 = 31.0F * var2 + this.field4395; // L: 86
		var2 = this.field4394 + 31.0F * var2; // L: 87
		var2 = this.field4396 + var2 * 31.0F; // L: 88
		return (int)var2; // L: 89
	}

	public String toString() {
		return this.field4393 + "," + this.field4395 + "," + this.field4394 + "," + this.field4396; // L: 94
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) { // L: 74
			return false; // L: 78
		} else {
			class387 var2 = (class387)var1; // L: 75
			return var2.field4393 == this.field4393 && var2.field4395 == this.field4395 && this.field4394 == var2.field4394 && var2.field4396 == this.field4396; // L: 76
		}
	}
}
