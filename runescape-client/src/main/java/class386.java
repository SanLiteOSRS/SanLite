import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class386 {
	@ObfuscatedName("s")
	float field4387;
	@ObfuscatedName("h")
	float field4386;
	@ObfuscatedName("w")
	float field4388;

	static {
		new class386(0.0F, 0.0F, 0.0F); // L: 5
		new class386(1.0F, 1.0F, 1.0F); // L: 9
		new class386(1.0F, 0.0F, 0.0F); // L: 13
		new class386(0.0F, 1.0F, 0.0F); // L: 17
		new class386(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class386(float var1, float var2, float var3) {
		this.field4387 = var1; // L: 33
		this.field4386 = var2; // L: 34
		this.field4388 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-181887763"
	)
	final float method6874() {
		return (float)Math.sqrt((double)(this.field4386 * this.field4386 + this.field4387 * this.field4387 + this.field4388 * this.field4388)); // L: 39
	}

	public String toString() {
		return this.field4387 + ", " + this.field4386 + ", " + this.field4388; // L: 44
	}
}
