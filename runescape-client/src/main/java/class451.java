import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class451 {
	@ObfuscatedName("ai")
	float field4739;
	@ObfuscatedName("aj")
	float field4737;
	@ObfuscatedName("ac")
	float field4738;
	@ObfuscatedName("aw")
	float field4749;
	@ObfuscatedName("ay")
	float field4736;
	@ObfuscatedName("ap")
	float field4742;
	@ObfuscatedName("av")
	float field4744;
	@ObfuscatedName("an")
	float field4743;
	@ObfuscatedName("au")
	float field4740;
	@ObfuscatedName("az")
	float field4745;
	@ObfuscatedName("ab")
	float field4746;
	@ObfuscatedName("ao")
	float field4747;

	static {
		new class451();
	} // L: 6

	class451() {
		this.method8267(); // L: 22
	} // L: 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	void method8267() {
		this.field4747 = 0.0F; // L: 26
		this.field4746 = 0.0F; // L: 27
		this.field4745 = 0.0F; // L: 28
		this.field4743 = 0.0F; // L: 29
		this.field4744 = 0.0F; // L: 30
		this.field4742 = 0.0F; // L: 31
		this.field4749 = 0.0F; // L: 32
		this.field4738 = 0.0F; // L: 33
		this.field4737 = 0.0F; // L: 34
		this.field4740 = 1.0F; // L: 35
		this.field4736 = 1.0F; // L: 36
		this.field4739 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-2007662651"
	)
	void method8277(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4737; // L: 43
		float var5 = this.field4736; // L: 44
		float var6 = this.field4743; // L: 45
		float var7 = this.field4746; // L: 46
		this.field4737 = var2 * var4 - var3 * this.field4738; // L: 47
		this.field4738 = this.field4738 * var2 + var4 * var3; // L: 48
		this.field4736 = var2 * var5 - var3 * this.field4742; // L: 49
		this.field4742 = var5 * var3 + this.field4742 * var2; // L: 50
		this.field4743 = var6 * var2 - var3 * this.field4740; // L: 51
		this.field4740 = var2 * this.field4740 + var3 * var6; // L: 52
		this.field4746 = var2 * var7 - var3 * this.field4747; // L: 53
		this.field4747 = this.field4747 * var2 + var7 * var3; // L: 54
	} // L: 55

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-2092326224"
	)
	void method8268(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4739; // L: 60
		float var5 = this.field4749; // L: 61
		float var6 = this.field4744; // L: 62
		float var7 = this.field4745; // L: 63
		this.field4739 = var4 * var2 + var3 * this.field4738; // L: 64
		this.field4738 = var2 * this.field4738 - var3 * var4; // L: 65
		this.field4749 = var2 * var5 + this.field4742 * var3; // L: 66
		this.field4742 = this.field4742 * var2 - var3 * var5; // L: 67
		this.field4744 = var3 * this.field4740 + var2 * var6; // L: 68
		this.field4740 = var2 * this.field4740 - var3 * var6; // L: 69
		this.field4745 = var7 * var2 + this.field4747 * var3; // L: 70
		this.field4747 = this.field4747 * var2 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "4173"
	)
	void method8269(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4739; // L: 77
		float var5 = this.field4749; // L: 78
		float var6 = this.field4744; // L: 79
		float var7 = this.field4745; // L: 80
		this.field4739 = var4 * var2 - var3 * this.field4737; // L: 81
		this.field4737 = this.field4737 * var2 + var4 * var3; // L: 82
		this.field4749 = var5 * var2 - var3 * this.field4736; // L: 83
		this.field4736 = var5 * var3 + this.field4736 * var2; // L: 84
		this.field4744 = var6 * var2 - this.field4743 * var3; // L: 85
		this.field4743 = var3 * var6 + var2 * this.field4743; // L: 86
		this.field4745 = var2 * var7 - var3 * this.field4746; // L: 87
		this.field4746 = var2 * this.field4746 + var3 * var7; // L: 88
	} // L: 89

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-198978535"
	)
	void method8271(float var1, float var2, float var3) {
		this.field4745 += var1; // L: 92
		this.field4746 += var2; // L: 93
		this.field4747 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4739 + "," + this.field4749 + "," + this.field4744 + "," + this.field4745 + "\n" + this.field4737 + "," + this.field4736 + "," + this.field4743 + "," + this.field4746 + "\n" + this.field4738 + "," + this.field4742 + "," + this.field4740 + "," + this.field4747; // L: 99
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "60"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 12091
			Widget[] var1 = class179.Widget_interfaceComponents[var0]; // L: 12092

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12093
				Widget var3 = var1[var2]; // L: 12094
				if (var3 != null) { // L: 12095
					var3.modelFrame = 0; // L: 12096
					var3.modelFrameCycle = 0; // L: 12097
				}
			}

		}
	} // L: 12099
}
