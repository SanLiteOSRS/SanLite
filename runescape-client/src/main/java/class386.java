import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class386 {
	@ObfuscatedName("o")
	float field4400;
	@ObfuscatedName("q")
	float field4396;
	@ObfuscatedName("f")
	float field4398;

	static {
		new class386(0.0F, 0.0F, 0.0F); // L: 5
		new class386(1.0F, 1.0F, 1.0F); // L: 9
		new class386(1.0F, 0.0F, 0.0F); // L: 13
		new class386(0.0F, 1.0F, 0.0F); // L: 17
		new class386(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class386(float var1, float var2, float var3) {
		this.field4400 = var1; // L: 33
		this.field4396 = var2; // L: 34
		this.field4398 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1827518031"
	)
	final float method6962() {
		return (float)Math.sqrt((double)(this.field4398 * this.field4398 + this.field4400 * this.field4400 + this.field4396 * this.field4396)); // L: 39
	}

	public String toString() {
		return this.field4400 + ", " + this.field4396 + ", " + this.field4398; // L: 44
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)[Lqe;",
		garbageValue = "-3146"
	)
	@Export("FillMode_values")
	public static class454[] FillMode_values() {
		return new class454[]{class454.field4783, class454.SOLID, class454.field4785}; // L: 15
	}
}
