import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public final class class420 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lqh;"
	)
	static class420[] field4606;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -35721733
	)
	static int field4601;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -116575971
	)
	static int field4600;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ab")
	float field4602;
	@ObfuscatedName("an")
	float field4604;
	@ObfuscatedName("ao")
	float field4605;
	@ObfuscatedName("av")
	float field4603;

	static {
		field4606 = new class420[0]; // L: 4
		field4601 = 100; // L: 10
		field4606 = new class420[100]; // L: 11
		field4600 = 0; // L: 12
		new class420();
	} // L: 18

	class420() {
		this.method7818(); // L: 42
	} // L: 43

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2102226462"
	)
	public void method7824() {
		synchronized(field4606) { // L: 36
			if (field4600 < field4601 - 1) { // L: 37
				field4606[++field4600 - 1] = this;
			}

		}
	} // L: 39

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "441781311"
	)
	void method7822(float var1, float var2, float var3, float var4) {
		this.field4602 = var1; // L: 46
		this.field4604 = var2; // L: 47
		this.field4605 = var3; // L: 48
		this.field4603 = var4; // L: 49
	} // L: 50

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V",
		garbageValue = "-17071"
	)
	public void method7820(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 53
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 54
		this.field4602 = var1 * var5; // L: 55
		this.field4604 = var5 * var2; // L: 56
		this.field4605 = var5 * var3; // L: 57
		this.field4603 = var6; // L: 58
	} // L: 59

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1786182791"
	)
	final void method7818() {
		this.field4605 = 0.0F; // L: 62
		this.field4604 = 0.0F; // L: 63
		this.field4602 = 0.0F; // L: 64
		this.field4603 = 1.0F; // L: 65
	} // L: 66

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)V",
		garbageValue = "701492316"
	)
	public final void method7819(class420 var1) {
		this.method7822(this.field4605 * var1.field4604 + this.field4603 * var1.field4602 + this.field4602 * var1.field4603 - var1.field4605 * this.field4604, this.field4603 * var1.field4604 + (var1.field4603 * this.field4604 - this.field4605 * var1.field4602) + this.field4602 * var1.field4605, this.field4604 * var1.field4602 + this.field4605 * var1.field4603 - var1.field4604 * this.field4602 + var1.field4605 * this.field4603, this.field4603 * var1.field4603 - var1.field4602 * this.field4602 - this.field4604 * var1.field4604 - this.field4605 * var1.field4605); // L: 69
	} // L: 70

	public int hashCode() {
		boolean var1 = true; // L: 83
		float var2 = 1.0F; // L: 84
		var2 = var2 * 31.0F + this.field4602; // L: 85
		var2 = var2 * 31.0F + this.field4604; // L: 86
		var2 = this.field4605 + var2 * 31.0F; // L: 87
		var2 = 31.0F * var2 + this.field4603; // L: 88
		return (int)var2; // L: 89
	}

	public String toString() {
		return this.field4602 + "," + this.field4604 + "," + this.field4605 + "," + this.field4603; // L: 94
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class420)) { // L: 74
			return false; // L: 78
		} else {
			class420 var2 = (class420)var1; // L: 75
			return this.field4602 == var2.field4602 && this.field4604 == var2.field4604 && this.field4605 == var2.field4605 && this.field4603 == var2.field4603; // L: 76
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)I",
		garbageValue = "1453188088"
	)
	static int method7841(Widget var0) {
		if (var0.type != 11) { // L: 1533
			Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 1534
			return 1; // L: 1535
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1537
			Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var0.method6110(var1); // L: 1538
			return 1; // L: 1539
		}
	}
}
