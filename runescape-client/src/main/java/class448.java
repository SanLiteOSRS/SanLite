import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class448 {
	@ObfuscatedName("ai")
	float field4722;
	@ObfuscatedName("aj")
	float field4720;
	@ObfuscatedName("ac")
	float field4719;

	static {
		new class448(0.0F, 0.0F, 0.0F); // L: 5
		new class448(1.0F, 1.0F, 1.0F); // L: 9
		new class448(1.0F, 0.0F, 0.0F); // L: 13
		new class448(0.0F, 1.0F, 0.0F); // L: 17
		new class448(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class448(float var1, float var2, float var3) {
		this.field4722 = var1; // L: 33
		this.field4720 = var2; // L: 34
		this.field4719 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "207915853"
	)
	final float method8168() {
		return (float)Math.sqrt((double)(this.field4722 * this.field4722 + this.field4720 * this.field4720 + this.field4719 * this.field4719)); // L: 39
	}

	public String toString() {
		return this.field4722 + ", " + this.field4720 + ", " + this.field4719; // L: 44
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltm;",
		garbageValue = "11"
	)
	static class506 method8169(int var0) {
		class506 var1 = (class506)Client.Widget_cachedModels.get((long)var0); // L: 12857
		if (var1 == null) { // L: 12858
			var1 = new class506(class170.field1811, UserComparator8.method2937(var0), ArchiveLoader.method2283(var0)); // L: 12859
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12860
		}

		return var1; // L: 12862
	}
}
