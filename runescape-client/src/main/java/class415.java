import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class415 {
	@ObfuscatedName("f")
	float field4632;
	@ObfuscatedName("w")
	float field4631;
	@ObfuscatedName("v")
	float field4630;

	static {
		new class415(0.0F, 0.0F, 0.0F); // L: 5
		new class415(1.0F, 1.0F, 1.0F); // L: 9
		new class415(1.0F, 0.0F, 0.0F); // L: 13
		new class415(0.0F, 1.0F, 0.0F); // L: 17
		new class415(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class415(float var1, float var2, float var3) {
		this.field4632 = var1; // L: 33
		this.field4631 = var2; // L: 34
		this.field4630 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-98"
	)
	final float method7872() {
		return (float)Math.sqrt((double)(this.field4630 * this.field4630 + this.field4631 * this.field4631 + this.field4632 * this.field4632)); // L: 39
	}

	public String toString() {
		return this.field4632 + ", " + this.field4631 + ", " + this.field4630; // L: 44
	}
}
