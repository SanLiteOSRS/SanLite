import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
final class class105 implements class321 {
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = 1072694307
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmb;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1; // L: 512
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	public void vmethod5986() {
		if (this.val$cc != null && this.val$cc.method6383().field3528 != null) { // L: 514
			ScriptEvent var1 = new ScriptEvent(); // L: 515
			var1.method2247(this.val$cc); // L: 516
			var1.setArgs(this.val$cc.method6383().field3528); // L: 517
			Message.method1177().addFirst(var1); // L: 518
		}

	} // L: 520

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2052906651"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11354
	} // L: 11355
}
