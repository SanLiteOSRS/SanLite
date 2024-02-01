import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
final class class106 implements class337 {
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1503351495
	)
	static int field1342;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1; // L: 517
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1083303950"
	)
	public void vmethod6342() {
		if (this.val$cc != null && this.val$cc.method6716().field3632 != null) { // L: 519
			ScriptEvent var1 = new ScriptEvent(); // L: 520
			var1.method2355(this.val$cc); // L: 521
			var1.setArgs(this.val$cc.method6716().field3632); // L: 522
			class27.method401().addFirst(var1); // L: 523
		}

	} // L: 525

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1518339493"
	)
	public static void method2774() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 334

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) { // L: 335
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 336
			JagexCache.JagexCache_randomDat.close(); // L: 337
		} catch (Exception var2) { // L: 339
		}

	} // L: 340
}
