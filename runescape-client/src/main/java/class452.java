import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public class class452 {
	@ObfuscatedName("aw")
	float field4750;
	@ObfuscatedName("ay")
	float field4746;
	@ObfuscatedName("ar")
	float field4747;
	@ObfuscatedName("am")
	float field4754;
	@ObfuscatedName("as")
	float field4748;
	@ObfuscatedName("aj")
	float field4749;
	@ObfuscatedName("ag")
	float field4752;
	@ObfuscatedName("az")
	float field4745;
	@ObfuscatedName("av")
	float field4753;
	@ObfuscatedName("ap")
	float field4751;
	@ObfuscatedName("aq")
	float field4755;
	@ObfuscatedName("at")
	float field4756;

	static {
		new class452();
	} // L: 6

	class452() {
		this.method8331(); // L: 22
	} // L: 23

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	void method8331() {
		this.field4756 = 0.0F; // L: 26
		this.field4755 = 0.0F; // L: 27
		this.field4751 = 0.0F; // L: 28
		this.field4745 = 0.0F; // L: 29
		this.field4752 = 0.0F; // L: 30
		this.field4749 = 0.0F; // L: 31
		this.field4754 = 0.0F; // L: 32
		this.field4747 = 0.0F; // L: 33
		this.field4746 = 0.0F; // L: 34
		this.field4753 = 1.0F; // L: 35
		this.field4748 = 1.0F; // L: 36
		this.field4750 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "116"
	)
	void method8315(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4746; // L: 43
		float var5 = this.field4748; // L: 44
		float var6 = this.field4745; // L: 45
		float var7 = this.field4755; // L: 46
		this.field4746 = var2 * var4 - this.field4747 * var3; // L: 47
		this.field4747 = this.field4747 * var2 + var4 * var3; // L: 48
		this.field4748 = var5 * var2 - var3 * this.field4749; // L: 49
		this.field4749 = this.field4749 * var2 + var3 * var5; // L: 50
		this.field4745 = var6 * var2 - var3 * this.field4753; // L: 51
		this.field4753 = var3 * var6 + var2 * this.field4753; // L: 52
		this.field4755 = var2 * var7 - this.field4756 * var3; // L: 53
		this.field4756 = this.field4756 * var2 + var3 * var7; // L: 54
	} // L: 55

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "851748256"
	)
	void method8316(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4750; // L: 60
		float var5 = this.field4754; // L: 61
		float var6 = this.field4752; // L: 62
		float var7 = this.field4751; // L: 63
		this.field4750 = var4 * var2 + this.field4747 * var3; // L: 64
		this.field4747 = var2 * this.field4747 - var3 * var4; // L: 65
		this.field4754 = var2 * var5 + this.field4749 * var3; // L: 66
		this.field4749 = this.field4749 * var2 - var5 * var3; // L: 67
		this.field4752 = this.field4753 * var3 + var2 * var6; // L: 68
		this.field4753 = var2 * this.field4753 - var3 * var6; // L: 69
		this.field4751 = var3 * this.field4756 + var7 * var2; // L: 70
		this.field4756 = var2 * this.field4756 - var3 * var7; // L: 71
	} // L: 72

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "415453075"
	)
	void method8329(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4750; // L: 77
		float var5 = this.field4754; // L: 78
		float var6 = this.field4752; // L: 79
		float var7 = this.field4751; // L: 80
		this.field4750 = var4 * var2 - this.field4746 * var3; // L: 81
		this.field4746 = var4 * var3 + var2 * this.field4746; // L: 82
		this.field4754 = var2 * var5 - this.field4748 * var3; // L: 83
		this.field4748 = this.field4748 * var2 + var5 * var3; // L: 84
		this.field4752 = var2 * var6 - this.field4745 * var3; // L: 85
		this.field4745 = var3 * var6 + var2 * this.field4745; // L: 86
		this.field4751 = var2 * var7 - this.field4755 * var3; // L: 87
		this.field4755 = var3 * var7 + var2 * this.field4755; // L: 88
	} // L: 89

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1893116772"
	)
	void method8318(float var1, float var2, float var3) {
		this.field4751 += var1; // L: 92
		this.field4755 += var2; // L: 93
		this.field4756 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4750 + "," + this.field4754 + "," + this.field4752 + "," + this.field4751 + "\n" + this.field4746 + "," + this.field4748 + "," + this.field4745 + "," + this.field4755 + "\n" + this.field4747 + "," + this.field4749 + "," + this.field4753 + "," + this.field4756; // L: 99
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "128"
	)
	public static void method8324(int var0, int var1, int var2, int var3) {
		if (class306.field3394.size() > 1 && class306.field3394.get(0) != null && ((class318)class306.field3394.get(0)).field3516.isReady() && class306.field3394.get(1) != null && ((class318)class306.field3394.get(1)).field3516.isReady()) { // L: 121
			ArchiveLoader.method2259(var0, var1, var2, var3); // L: 122
			class306.field3399.add(new class401((class407)null)); // L: 123
			ArrayList var4 = new ArrayList(); // L: 124
			var4.add(new class403(new class406((class407)null, 1, false, class306.field3407), class306.field3403)); // L: 125
			var4.add(new class403(new class405((class407)null, 0, false, class306.field3402), class306.field3392)); // L: 126
			class306.field3399.add(new class408((class407)null, var4)); // L: 127
			if (class306.field3398.get(0) != null && class306.field3398.get(1) != null) { // L: 128
				class318 var5 = (class318)class306.field3398.get(0); // L: 129
				class306.field3398.set(0, class306.field3394.get(1)); // L: 130
				class306.field3398.set(1, var5); // L: 131
			}
		}

	} // L: 134
}
