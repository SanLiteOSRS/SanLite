import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class418 {
	@ObfuscatedName("f")
	float field4652;
	@ObfuscatedName("w")
	float field4648;
	@ObfuscatedName("v")
	float field4649;
	@ObfuscatedName("s")
	float field4650;
	@ObfuscatedName("z")
	float field4651;
	@ObfuscatedName("j")
	float field4653;
	@ObfuscatedName("i")
	float field4654;
	@ObfuscatedName("n")
	float field4655;
	@ObfuscatedName("l")
	float field4658;
	@ObfuscatedName("k")
	float field4656;
	@ObfuscatedName("c")
	float field4657;
	@ObfuscatedName("r")
	float field4647;

	static {
		new class418();
	} // L: 6

	class418() {
		this.method7966(); // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method7966() {
		this.field4647 = 0.0F; // L: 26
		this.field4657 = 0.0F; // L: 27
		this.field4656 = 0.0F; // L: 28
		this.field4655 = 0.0F; // L: 29
		this.field4654 = 0.0F; // L: 30
		this.field4653 = 0.0F; // L: 31
		this.field4650 = 0.0F; // L: 32
		this.field4649 = 0.0F; // L: 33
		this.field4648 = 0.0F; // L: 34
		this.field4658 = 1.0F; // L: 35
		this.field4651 = 1.0F; // L: 36
		this.field4652 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1145729820"
	)
	void method7968(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4648; // L: 43
		float var5 = this.field4651; // L: 44
		float var6 = this.field4655; // L: 45
		float var7 = this.field4657; // L: 46
		this.field4648 = var4 * var2 - this.field4649 * var3; // L: 47
		this.field4649 = var4 * var3 + var2 * this.field4649; // L: 48
		this.field4651 = var2 * var5 - var3 * this.field4653; // L: 49
		this.field4653 = var2 * this.field4653 + var3 * var5; // L: 50
		this.field4655 = var2 * var6 - var3 * this.field4658; // L: 51
		this.field4658 = this.field4658 * var2 + var6 * var3; // L: 52
		this.field4657 = var7 * var2 - var3 * this.field4647; // L: 53
		this.field4647 = var2 * this.field4647 + var3 * var7; // L: 54
	} // L: 55

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-2"
	)
	void method7980(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4652; // L: 60
		float var5 = this.field4650; // L: 61
		float var6 = this.field4654; // L: 62
		float var7 = this.field4656; // L: 63
		this.field4652 = this.field4649 * var3 + var4 * var2; // L: 64
		this.field4649 = var2 * this.field4649 - var3 * var4; // L: 65
		this.field4650 = var3 * this.field4653 + var5 * var2; // L: 66
		this.field4653 = this.field4653 * var2 - var5 * var3; // L: 67
		this.field4654 = var3 * this.field4658 + var6 * var2; // L: 68
		this.field4658 = this.field4658 * var2 - var6 * var3; // L: 69
		this.field4656 = var2 * var7 + this.field4647 * var3; // L: 70
		this.field4647 = this.field4647 * var2 - var3 * var7; // L: 71
	} // L: 72

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "906584628"
	)
	void method7969(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4652; // L: 77
		float var5 = this.field4650; // L: 78
		float var6 = this.field4654; // L: 79
		float var7 = this.field4656; // L: 80
		this.field4652 = var4 * var2 - var3 * this.field4648; // L: 81
		this.field4648 = var2 * this.field4648 + var4 * var3; // L: 82
		this.field4650 = var5 * var2 - var3 * this.field4651; // L: 83
		this.field4651 = this.field4651 * var2 + var3 * var5; // L: 84
		this.field4654 = var6 * var2 - var3 * this.field4655; // L: 85
		this.field4655 = var2 * this.field4655 + var3 * var6; // L: 86
		this.field4656 = var2 * var7 - this.field4657 * var3; // L: 87
		this.field4657 = var3 * var7 + this.field4657 * var2; // L: 88
	} // L: 89

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "722764913"
	)
	void method7970(float var1, float var2, float var3) {
		this.field4656 += var1; // L: 92
		this.field4657 += var2; // L: 93
		this.field4647 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4652 + "," + this.field4650 + "," + this.field4654 + "," + this.field4656 + "\n" + this.field4648 + "," + this.field4651 + "," + this.field4655 + "," + this.field4657 + "\n" + this.field4649 + "," + this.field4653 + "," + this.field4658 + "," + this.field4647; // L: 99
	}
}
