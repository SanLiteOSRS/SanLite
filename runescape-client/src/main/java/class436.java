import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class436 {
	@ObfuscatedName("at")
	float field4671;
	@ObfuscatedName("an")
	float field4672;
	@ObfuscatedName("av")
	float field4673;

	static {
		new class436(0.0F, 0.0F, 0.0F); // L: 5
		new class436(1.0F, 1.0F, 1.0F); // L: 9
		new class436(1.0F, 0.0F, 0.0F); // L: 13
		new class436(0.0F, 1.0F, 0.0F); // L: 17
		new class436(0.0F, 0.0F, 1.0F); // L: 21
		AbstractSocket.method7950(100); // L: 25
	} // L: 26

	class436(float var1, float var2, float var3) {
		this.field4671 = var1; // L: 35
		this.field4672 = var2; // L: 36
		this.field4673 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "55"
	)
	final float method8058() {
		return (float)Math.sqrt((double)(this.field4672 * this.field4672 + this.field4671 * this.field4671 + this.field4673 * this.field4673)); // L: 41
	}

	public String toString() {
		return this.field4671 + ", " + this.field4672 + ", " + this.field4673; // L: 46
	}
}
