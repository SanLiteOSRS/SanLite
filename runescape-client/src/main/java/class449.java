import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
public class class449 {
	@ObfuscatedName("aw")
	float field4731;
	@ObfuscatedName("ay")
	float field4730;
	@ObfuscatedName("ar")
	float field4729;

	static {
		new class449(0.0F, 0.0F, 0.0F); // L: 5
		new class449(1.0F, 1.0F, 1.0F); // L: 9
		new class449(1.0F, 0.0F, 0.0F); // L: 13
		new class449(0.0F, 1.0F, 0.0F); // L: 17
		new class449(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class449(float var1, float var2, float var3) {
		this.field4731 = var1; // L: 33
		this.field4730 = var2; // L: 34
		this.field4729 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-57"
	)
	final float method8214() {
		return (float)Math.sqrt((double)(this.field4731 * this.field4731 + this.field4730 * this.field4730 + this.field4729 * this.field4729)); // L: 39
	}

	public String toString() {
		return this.field4731 + ", " + this.field4730 + ", " + this.field4729; // L: 44
	}
}
