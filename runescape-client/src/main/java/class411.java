import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public class class411 {
	@ObfuscatedName("h")
	float field4624;
	@ObfuscatedName("e")
	float field4617;
	@ObfuscatedName("v")
	float field4618;
	@ObfuscatedName("x")
	float field4625;
	@ObfuscatedName("m")
	float field4620;
	@ObfuscatedName("q")
	float field4621;
	@ObfuscatedName("f")
	float field4622;
	@ObfuscatedName("r")
	float field4623;
	@ObfuscatedName("u")
	float field4616;
	@ObfuscatedName("b")
	float field4627;
	@ObfuscatedName("j")
	float field4626;
	@ObfuscatedName("g")
	float field4619;

	static {
		new class411();
	} // L: 6

	class411() {
		this.method7837(); // L: 22
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	void method7837() {
		this.field4619 = 0.0F; // L: 26
		this.field4626 = 0.0F; // L: 27
		this.field4627 = 0.0F; // L: 28
		this.field4623 = 0.0F; // L: 29
		this.field4622 = 0.0F; // L: 30
		this.field4621 = 0.0F; // L: 31
		this.field4625 = 0.0F; // L: 32
		this.field4618 = 0.0F; // L: 33
		this.field4617 = 0.0F; // L: 34
		this.field4616 = 1.0F; // L: 35
		this.field4620 = 1.0F; // L: 36
		this.field4624 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "117"
	)
	void method7835(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4617; // L: 43
		float var5 = this.field4620; // L: 44
		float var6 = this.field4623; // L: 45
		float var7 = this.field4626; // L: 46
		this.field4617 = var4 * var2 - var3 * this.field4618; // L: 47
		this.field4618 = var2 * this.field4618 + var4 * var3; // L: 48
		this.field4620 = var2 * var5 - var3 * this.field4621; // L: 49
		this.field4621 = var5 * var3 + this.field4621 * var2; // L: 50
		this.field4623 = var2 * var6 - this.field4616 * var3; // L: 51
		this.field4616 = var6 * var3 + this.field4616 * var2; // L: 52
		this.field4626 = var7 * var2 - var3 * this.field4619; // L: 53
		this.field4619 = var2 * this.field4619 + var3 * var7; // L: 54
	} // L: 55

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-45"
	)
	void method7836(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4624; // L: 60
		float var5 = this.field4625; // L: 61
		float var6 = this.field4622; // L: 62
		float var7 = this.field4627; // L: 63
		this.field4624 = var3 * this.field4618 + var4 * var2; // L: 64
		this.field4618 = var2 * this.field4618 - var4 * var3; // L: 65
		this.field4625 = var3 * this.field4621 + var2 * var5; // L: 66
		this.field4621 = this.field4621 * var2 - var5 * var3; // L: 67
		this.field4622 = var3 * this.field4616 + var6 * var2; // L: 68
		this.field4616 = var2 * this.field4616 - var3 * var6; // L: 69
		this.field4627 = this.field4619 * var3 + var7 * var2; // L: 70
		this.field4619 = this.field4619 * var2 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1457477658"
	)
	void method7840(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4624; // L: 77
		float var5 = this.field4625; // L: 78
		float var6 = this.field4622; // L: 79
		float var7 = this.field4627; // L: 80
		this.field4624 = var4 * var2 - var3 * this.field4617; // L: 81
		this.field4617 = var4 * var3 + this.field4617 * var2; // L: 82
		this.field4625 = var5 * var2 - var3 * this.field4620; // L: 83
		this.field4620 = var5 * var3 + this.field4620 * var2; // L: 84
		this.field4622 = var6 * var2 - this.field4623 * var3; // L: 85
		this.field4623 = var2 * this.field4623 + var3 * var6; // L: 86
		this.field4627 = var2 * var7 - this.field4626 * var3; // L: 87
		this.field4626 = var7 * var3 + this.field4626 * var2; // L: 88
	} // L: 89

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "11"
	)
	void method7838(float var1, float var2, float var3) {
		this.field4627 += var1; // L: 92
		this.field4626 += var2; // L: 93
		this.field4619 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4624 + "," + this.field4625 + "," + this.field4622 + "," + this.field4627 + "\n" + this.field4617 + "," + this.field4620 + "," + this.field4623 + "," + this.field4626 + "\n" + this.field4618 + "," + this.field4621 + "," + this.field4616 + "," + this.field4619; // L: 99
	}
}
