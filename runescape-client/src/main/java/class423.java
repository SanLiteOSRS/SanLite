import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class423 {
	@ObfuscatedName("af")
	float field4655;
	@ObfuscatedName("an")
	float field4652;
	@ObfuscatedName("aw")
	float field4654;

	static {
		new class423(0.0F, 0.0F, 0.0F); // L: 5
		new class423(1.0F, 1.0F, 1.0F); // L: 9
		new class423(1.0F, 0.0F, 0.0F); // L: 13
		new class423(0.0F, 1.0F, 0.0F); // L: 17
		new class423(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class423(float var1, float var2, float var3) {
		this.field4655 = var1; // L: 33
		this.field4652 = var2; // L: 34
		this.field4654 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "79"
	)
	final float method8131() {
		return (float)Math.sqrt((double)(this.field4654 * this.field4654 + this.field4655 * this.field4655 + this.field4652 * this.field4652)); // L: 39
	}

	public String toString() {
		return this.field4655 + ", " + this.field4652 + ", " + this.field4654; // L: 44
	}
}
