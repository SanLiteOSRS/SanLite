import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
final class class102 implements class304 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmy;)V"
	)
	class102(Widget var1) {
		this.val$cc = var1; // L: 508
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "177803302"
	)
	public void vmethod5776() {
		if (this.val$cc != null && this.val$cc.method6163().field3450 != null) { // L: 510
			ScriptEvent var1 = new ScriptEvent(); // L: 511
			var1.method2260(this.val$cc); // L: 512
			var1.setArgs(this.val$cc.method6163().field3450); // L: 513
			class144.method3139().addFirst(var1); // L: 514
		}

	} // L: 516

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([FIFB)F",
		garbageValue = "0"
	)
	static float method2665(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var0[var4] + var3 * var2; // L: 110
		}

		return var3; // L: 112
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "62"
	)
	static int method2664(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 4343
	}
}
