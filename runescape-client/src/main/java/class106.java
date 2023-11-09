import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
final class class106 implements class323 {
	@ObfuscatedName("ae")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1371;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmi;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1; // L: 516
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	public void vmethod6045() {
		if (this.val$cc != null && this.val$cc.method6418().field3562 != null) { // L: 518
			ScriptEvent var1 = new ScriptEvent(); // L: 519
			var1.method2283(this.val$cc); // L: 520
			var1.setArgs(this.val$cc.method6418().field3562); // L: 521
			class30.method446().addFirst(var1); // L: 522
		}

	} // L: 524

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-47"
	)
	static final int method2692(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1030
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1031
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1032
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1033
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1034
		return var3; // L: 1035
	}
}
