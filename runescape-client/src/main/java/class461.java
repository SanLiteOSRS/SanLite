import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public final class class461 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lrq;"
	)
	static class461[] field4764;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1183641813
	)
	static int field4763;
	@ObfuscatedName("ao")
	float field4768;
	@ObfuscatedName("ab")
	float field4765;
	@ObfuscatedName("au")
	float field4766;
	@ObfuscatedName("aa")
	float field4767;

	static {
		field4764 = new class461[0]; // L: 4
		FontName.method8929(100); // L: 9
		new class461();
	} // L: 14

	class461() {
		this.method8409(); // L: 44
	} // L: 45

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-905673513"
	)
	public void method8424() {
		synchronized(field4764) { // L: 38
			if (IgnoreList.field4663 < field4763 - 1) { // L: 39
				field4764[++IgnoreList.field4663 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1133120924"
	)
	void method8423(float var1, float var2, float var3, float var4) {
		this.field4768 = var1; // L: 48
		this.field4765 = var2; // L: 49
		this.field4766 = var3; // L: 50
		this.field4767 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1735434078"
	)
	public void method8408(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 56
		this.field4768 = var1 * var5; // L: 57
		this.field4765 = var5 * var2; // L: 58
		this.field4766 = var3 * var5; // L: 59
		this.field4767 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "210229291"
	)
	final void method8409() {
		this.field4766 = 0.0F; // L: 64
		this.field4765 = 0.0F; // L: 65
		this.field4768 = 0.0F; // L: 66
		this.field4767 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "992983838"
	)
	public final void method8410(class461 var1) {
		this.method8423(this.field4766 * var1.field4765 + var1.field4767 * this.field4768 + this.field4767 * var1.field4768 - var1.field4766 * this.field4765, var1.field4765 * this.field4767 + (this.field4765 * var1.field4767 - var1.field4768 * this.field4766) + this.field4768 * var1.field4766, this.field4767 * var1.field4766 + (var1.field4768 * this.field4765 + this.field4766 * var1.field4767 - this.field4768 * var1.field4765), var1.field4767 * this.field4767 - var1.field4768 * this.field4768 - var1.field4765 * this.field4765 - var1.field4766 * this.field4766); // L: 71
	} // L: 72

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = 31.0F * var2 + this.field4768; // L: 87
		var2 = this.field4765 + 31.0F * var2; // L: 88
		var2 = 31.0F * var2 + this.field4766; // L: 89
		var2 = this.field4767 + 31.0F * var2; // L: 90
		return (int)var2; // L: 91
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class461)) { // L: 76
			return false; // L: 80
		} else {
			class461 var2 = (class461)var1; // L: 77
			return var2.field4768 == this.field4768 && var2.field4765 == this.field4765 && this.field4766 == var2.field4766 && var2.field4767 == this.field4767; // L: 78
		}
	}

	public String toString() {
		return this.field4768 + "," + this.field4765 + "," + this.field4766 + "," + this.field4767; // L: 96
	}
}
