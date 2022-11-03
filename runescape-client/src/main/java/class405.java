import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class405 {
	@ObfuscatedName("a")
	float field4553;
	@ObfuscatedName("f")
	float field4554;
	@ObfuscatedName("c")
	float field4552;

	static {
		new class405(0.0F, 0.0F, 0.0F); // L: 5
		new class405(1.0F, 1.0F, 1.0F); // L: 9
		new class405(1.0F, 0.0F, 0.0F); // L: 13
		new class405(0.0F, 1.0F, 0.0F); // L: 17
		new class405(0.0F, 0.0F, 1.0F); // L: 21
		PacketWriter.method2655(100); // L: 25
	} // L: 26

	class405(float var1, float var2, float var3) {
		this.field4553 = var1; // L: 35
		this.field4554 = var2; // L: 36
		this.field4552 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1976854042"
	)
	final float method7602() {
		return (float)Math.sqrt((double)(this.field4552 * this.field4552 + this.field4554 * this.field4554 + this.field4553 * this.field4553)); // L: 41
	}

	public String toString() {
		return this.field4553 + ", " + this.field4554 + ", " + this.field4552; // L: 46
	}
}
