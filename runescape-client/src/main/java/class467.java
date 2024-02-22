import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class467 {
	@ObfuscatedName("aq")
	float field4828;
	@ObfuscatedName("aw")
	float field4830;
	@ObfuscatedName("al")
	float field4829;

	static {
		new class467(0.0F, 0.0F, 0.0F); // L: 5
		new class467(1.0F, 1.0F, 1.0F); // L: 9
		new class467(1.0F, 0.0F, 0.0F); // L: 13
		new class467(0.0F, 1.0F, 0.0F); // L: 17
		new class467(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class467(float var1, float var2, float var3) {
		this.field4828 = var1; // L: 33
		this.field4830 = var2; // L: 34
		this.field4829 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-1"
	)
	final float method8586() {
		return (float)Math.sqrt((double)(this.field4829 * this.field4829 + this.field4828 * this.field4828 + this.field4830 * this.field4830)); // L: 39
	}

	public String toString() {
		return this.field4828 + ", " + this.field4830 + ", " + this.field4829; // L: 44
	}
}
