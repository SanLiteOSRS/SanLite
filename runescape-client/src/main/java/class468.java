import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
public class class468 {
	@ObfuscatedName("az")
	float field4859;
	@ObfuscatedName("ah")
	float field4860;
	@ObfuscatedName("af")
	float field4861;

	static {
		new class468(0.0F, 0.0F, 0.0F); // L: 5
		new class468(1.0F, 1.0F, 1.0F); // L: 9
		new class468(1.0F, 0.0F, 0.0F); // L: 13
		new class468(0.0F, 1.0F, 0.0F); // L: 17
		new class468(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class468(float var1, float var2, float var3) {
		this.field4859 = var1; // L: 33
		this.field4860 = var2; // L: 34
		this.field4861 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "116"
	)
	final float method8372() {
		return (float)Math.sqrt((double)(this.field4859 * this.field4859 + this.field4860 * this.field4860 + this.field4861 * this.field4861)); // L: 39
	}

	public String toString() {
		return this.field4859 + ", " + this.field4860 + ", " + this.field4861; // L: 44
	}
}
