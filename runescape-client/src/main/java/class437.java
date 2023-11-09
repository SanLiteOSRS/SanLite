import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class437 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	public static class437[] field4677;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -971051793
	)
	static int field4680;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1349749605
	)
	public static int field4676;
	@ObfuscatedName("as")
	float field4678;
	@ObfuscatedName("ax")
	float field4675;
	@ObfuscatedName("ap")
	float field4679;
	@ObfuscatedName("ab")
	float field4674;

	static {
		field4677 = new class437[0]; // L: 4
		field4680 = 100; // L: 10
		field4677 = new class437[100]; // L: 11
		field4676 = 0; // L: 12
		new class437();
	} // L: 18

	public class437() {
		this.method8070(); // L: 32
	} // L: 33

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	public void method8076() {
		synchronized(field4677) { // L: 26
			if (field4676 < field4680 - 1) { // L: 27
				field4677[++field4676 - 1] = this;
			}

		}
	} // L: 29

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1858320120"
	)
	void method8068(float var1, float var2, float var3, float var4) {
		this.field4678 = var1; // L: 36
		this.field4675 = var2; // L: 37
		this.field4679 = var3; // L: 38
		this.field4674 = var4; // L: 39
	} // L: 40

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V",
		garbageValue = "19512"
	)
	public void method8069(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 43
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 44
		this.field4678 = var1 * var5; // L: 45
		this.field4675 = var2 * var5; // L: 46
		this.field4679 = var5 * var3; // L: 47
		this.field4674 = var6; // L: 48
	} // L: 49

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "978687872"
	)
	public final void method8070() {
		this.field4679 = 0.0F; // L: 52
		this.field4675 = 0.0F; // L: 53
		this.field4678 = 0.0F; // L: 54
		this.field4674 = 1.0F; // L: 55
	} // L: 56

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "-682588791"
	)
	public final void method8071(class437 var1) {
		this.method8068(var1.field4674 * this.field4678 + var1.field4678 * this.field4674 + this.field4679 * var1.field4675 - var1.field4679 * this.field4675, var1.field4675 * this.field4674 + (var1.field4674 * this.field4675 - var1.field4678 * this.field4679) + var1.field4679 * this.field4678, this.field4674 * var1.field4679 + (this.field4679 * var1.field4674 + this.field4675 * var1.field4678 - this.field4678 * var1.field4675), this.field4674 * var1.field4674 - var1.field4678 * this.field4678 - var1.field4675 * this.field4675 - var1.field4679 * this.field4679); // L: 59
	} // L: 60

	public String toString() {
		return this.field4678 + "," + this.field4675 + "," + this.field4679 + "," + this.field4674; // L: 84
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class437)) { // L: 64
			return false; // L: 68
		} else {
			class437 var2 = (class437)var1; // L: 65
			return var2.field4678 == this.field4678 && var2.field4675 == this.field4675 && var2.field4679 == this.field4679 && this.field4674 == var2.field4674; // L: 66
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 73
		float var2 = 1.0F; // L: 74
		var2 = this.field4678 + var2 * 31.0F; // L: 75
		var2 = 31.0F * var2 + this.field4675; // L: 76
		var2 = this.field4679 + var2 * 31.0F; // L: 77
		var2 = var2 * 31.0F + this.field4674; // L: 78
		return (int)var2; // L: 79
	}
}
