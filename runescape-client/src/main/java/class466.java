import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class466 {
	@ObfuscatedName("ac")
	float field4797;
	@ObfuscatedName("al")
	float field4790;
	@ObfuscatedName("ak")
	float field4798;
	@ObfuscatedName("ax")
	float field4792;
	@ObfuscatedName("ao")
	float field4793;
	@ObfuscatedName("ah")
	float field4789;
	@ObfuscatedName("ar")
	float field4795;
	@ObfuscatedName("ab")
	float field4796;
	@ObfuscatedName("am")
	float field4800;
	@ObfuscatedName("av")
	float field4794;
	@ObfuscatedName("ag")
	float field4799;
	@ObfuscatedName("aa")
	float field4791;

	static {
		new class466();
	} // L: 6

	class466() {
		this.method8419(); // L: 22
	} // L: 23

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1690063443"
	)
	void method8419() {
		this.field4791 = 0.0F; // L: 26
		this.field4799 = 0.0F; // L: 27
		this.field4794 = 0.0F; // L: 28
		this.field4796 = 0.0F; // L: 29
		this.field4795 = 0.0F; // L: 30
		this.field4789 = 0.0F; // L: 31
		this.field4792 = 0.0F; // L: 32
		this.field4798 = 0.0F; // L: 33
		this.field4790 = 0.0F; // L: 34
		this.field4800 = 1.0F; // L: 35
		this.field4793 = 1.0F; // L: 36
		this.field4797 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-16"
	)
	void method8418(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4790; // L: 43
		float var5 = this.field4793; // L: 44
		float var6 = this.field4796; // L: 45
		float var7 = this.field4799; // L: 46
		this.field4790 = var2 * var4 - var3 * this.field4798; // L: 47
		this.field4798 = var3 * var4 + var2 * this.field4798; // L: 48
		this.field4793 = var2 * var5 - this.field4789 * var3; // L: 49
		this.field4789 = var5 * var3 + var2 * this.field4789; // L: 50
		this.field4796 = var2 * var6 - this.field4800 * var3; // L: 51
		this.field4800 = var6 * var3 + this.field4800 * var2; // L: 52
		this.field4799 = var7 * var2 - this.field4791 * var3; // L: 53
		this.field4791 = var3 * var7 + this.field4791 * var2; // L: 54
	} // L: 55

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "121"
	)
	void method8413(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4797; // L: 60
		float var5 = this.field4792; // L: 61
		float var6 = this.field4795; // L: 62
		float var7 = this.field4794; // L: 63
		this.field4797 = var3 * this.field4798 + var2 * var4; // L: 64
		this.field4798 = var2 * this.field4798 - var4 * var3; // L: 65
		this.field4792 = var5 * var2 + var3 * this.field4789; // L: 66
		this.field4789 = var2 * this.field4789 - var5 * var3; // L: 67
		this.field4795 = var6 * var2 + var3 * this.field4800; // L: 68
		this.field4800 = var2 * this.field4800 - var6 * var3; // L: 69
		this.field4794 = this.field4791 * var3 + var7 * var2; // L: 70
		this.field4791 = this.field4791 * var2 - var3 * var7; // L: 71
	} // L: 72

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1352671223"
	)
	void method8414(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4797; // L: 77
		float var5 = this.field4792; // L: 78
		float var6 = this.field4795; // L: 79
		float var7 = this.field4794; // L: 80
		this.field4797 = var2 * var4 - var3 * this.field4790; // L: 81
		this.field4790 = var3 * var4 + this.field4790 * var2; // L: 82
		this.field4792 = var5 * var2 - this.field4793 * var3; // L: 83
		this.field4793 = var5 * var3 + var2 * this.field4793; // L: 84
		this.field4795 = var6 * var2 - this.field4796 * var3; // L: 85
		this.field4796 = var6 * var3 + this.field4796 * var2; // L: 86
		this.field4794 = var7 * var2 - var3 * this.field4799; // L: 87
		this.field4799 = var3 * var7 + var2 * this.field4799; // L: 88
	} // L: 89

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1852296601"
	)
	void method8415(float var1, float var2, float var3) {
		this.field4794 += var1; // L: 92
		this.field4799 += var2; // L: 93
		this.field4791 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4797 + "," + this.field4792 + "," + this.field4795 + "," + this.field4794 + "\n" + this.field4790 + "," + this.field4793 + "," + this.field4796 + "," + this.field4799 + "\n" + this.field4798 + "," + this.field4789 + "," + this.field4800 + "," + this.field4791; // L: 99
	}
}
