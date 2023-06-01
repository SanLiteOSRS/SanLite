import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class436 {
	@ObfuscatedName("ay")
	float field4677;
	@ObfuscatedName("an")
	float field4678;
	@ObfuscatedName("ar")
	float field4682;

	static {
		new class436(0.0F, 0.0F, 0.0F); // L: 5
		new class436(1.0F, 1.0F, 1.0F); // L: 9
		new class436(1.0F, 0.0F, 0.0F); // L: 13
		new class436(0.0F, 1.0F, 0.0F); // L: 17
		new class436(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class436(float var1, float var2, float var3) {
		this.field4677 = var1; // L: 33
		this.field4678 = var2; // L: 34
		this.field4682 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-340837385"
	)
	final float method8104() {
		return (float)Math.sqrt((double)(this.field4678 * this.field4678 + this.field4677 * this.field4677 + this.field4682 * this.field4682)); // L: 39
	}

	public String toString() {
		return this.field4677 + ", " + this.field4678 + ", " + this.field4682; // L: 44
	}
}
