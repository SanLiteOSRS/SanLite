import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public final class class416 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	public static class416[] field4635;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1658617253
	)
	static int field4634;
	@ObfuscatedName("z")
	float field4639;
	@ObfuscatedName("j")
	float field4636;
	@ObfuscatedName("i")
	float field4637;
	@ObfuscatedName("n")
	float field4638;

	static {
		field4635 = new class416[0]; // L: 4
		class365.method7022(100); // L: 9
		new class416();
	} // L: 14

	public class416() {
		this.method7882(); // L: 34
	} // L: 35

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	public void method7894() {
		synchronized(field4635) { // L: 28
			if (class388.field4510 < field4634 - 1) { // L: 29
				field4635[++class388.field4510 - 1] = this;
			}

		}
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1022734820"
	)
	void method7881(float var1, float var2, float var3, float var4) {
		this.field4636 = var1; // L: 38
		this.field4637 = var2; // L: 39
		this.field4638 = var3; // L: 40
		this.field4639 = var4; // L: 41
	} // L: 42

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1628774920"
	)
	public void method7897(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 45
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 46
		this.field4636 = var1 * var5; // L: 47
		this.field4637 = var2 * var5; // L: 48
		this.field4638 = var5 * var3; // L: 49
		this.field4639 = var6; // L: 50
	} // L: 51

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1066361998"
	)
	public final void method7882() {
		this.field4638 = 0.0F; // L: 54
		this.field4637 = 0.0F; // L: 55
		this.field4636 = 0.0F; // L: 56
		this.field4639 = 1.0F; // L: 57
	} // L: 58

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V",
		garbageValue = "232975455"
	)
	public final void method7883(class416 var1) {
		this.method7881(var1.field4637 * this.field4638 + this.field4639 * var1.field4636 + var1.field4639 * this.field4636 - this.field4637 * var1.field4638, this.field4636 * var1.field4638 + this.field4637 * var1.field4639 - var1.field4636 * this.field4638 + var1.field4637 * this.field4639, var1.field4639 * this.field4638 + var1.field4636 * this.field4637 - this.field4636 * var1.field4637 + var1.field4638 * this.field4639, var1.field4639 * this.field4639 - this.field4636 * var1.field4636 - var1.field4637 * this.field4637 - var1.field4638 * this.field4638); // L: 61
	} // L: 62

	public boolean equals(Object var1) {
		if (!(var1 instanceof class416)) { // L: 66
			return false; // L: 70
		} else {
			class416 var2 = (class416)var1; // L: 67
			return this.field4636 == var2.field4636 && var2.field4637 == this.field4637 && var2.field4638 == this.field4638 && var2.field4639 == this.field4639; // L: 68
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 75
		float var2 = 1.0F; // L: 76
		var2 = var2 * 31.0F + this.field4636; // L: 77
		var2 = this.field4637 + 31.0F * var2; // L: 78
		var2 = this.field4638 + var2 * 31.0F; // L: 79
		var2 = 31.0F * var2 + this.field4639; // L: 80
		return (int)var2; // L: 81
	}

	public String toString() {
		return this.field4636 + "," + this.field4637 + "," + this.field4638 + "," + this.field4639; // L: 86
	}
}
