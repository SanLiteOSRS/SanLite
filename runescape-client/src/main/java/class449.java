import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public final class class449 {
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lro;"
	)
	static class449[] field4731;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1516333537
	)
	static int field4730;
	@ObfuscatedName("at")
	float field4733;
	@ObfuscatedName("ac")
	float field4732;
	@ObfuscatedName("ai")
	float field4734;
	@ObfuscatedName("az")
	float field4729;

	static {
		field4731 = new class449[0]; // L: 4
		GrandExchangeOffer.method6886(100); // L: 9
		new class449();
	} // L: 14

	class449() {
		this.method8164(); // L: 44
	} // L: 45

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1516285968"
	)
	public void method8180() {
		synchronized(field4731) { // L: 38
			if (class338.field3816 < field4730 - 1) { // L: 39
				field4731[++class338.field3816 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-426853069"
	)
	void method8162(float var1, float var2, float var3, float var4) {
		this.field4733 = var1; // L: 48
		this.field4732 = var2; // L: 49
		this.field4734 = var3; // L: 50
		this.field4729 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-49952444"
	)
	public void method8163(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 56
		this.field4733 = var5 * var1; // L: 57
		this.field4732 = var2 * var5; // L: 58
		this.field4734 = var5 * var3; // L: 59
		this.field4729 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	final void method8164() {
		this.field4734 = 0.0F; // L: 64
		this.field4732 = 0.0F; // L: 65
		this.field4733 = 0.0F; // L: 66
		this.field4729 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lro;B)V",
		garbageValue = "-34"
	)
	public final void method8165(class449 var1) {
		this.method8162(this.field4733 * var1.field4729 + this.field4729 * var1.field4733 + this.field4734 * var1.field4732 - this.field4732 * var1.field4734, var1.field4734 * this.field4733 + this.field4729 * var1.field4732 + (var1.field4729 * this.field4732 - this.field4734 * var1.field4733), var1.field4734 * this.field4729 + (this.field4734 * var1.field4729 + this.field4732 * var1.field4733 - var1.field4732 * this.field4733), this.field4729 * var1.field4729 - this.field4733 * var1.field4733 - this.field4732 * var1.field4732 - var1.field4734 * this.field4734); // L: 71
	} // L: 72

	public boolean equals(Object var1) {
		if (!(var1 instanceof class449)) { // L: 76
			return false; // L: 80
		} else {
			class449 var2 = (class449)var1; // L: 77
			return var2.field4733 == this.field4733 && var2.field4732 == this.field4732 && var2.field4734 == this.field4734 && this.field4729 == var2.field4729; // L: 78
		}
	}

	public String toString() {
		return this.field4733 + "," + this.field4732 + "," + this.field4734 + "," + this.field4729; // L: 96
	}

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = this.field4733 + var2 * 31.0F; // L: 87
		var2 = this.field4732 + var2 * 31.0F; // L: 88
		var2 = this.field4734 + 31.0F * var2; // L: 89
		var2 = this.field4729 + 31.0F * var2; // L: 90
		return (int)var2; // L: 91
	}
}
