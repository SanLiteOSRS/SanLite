import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
final class class105 implements class337 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static AbstractArchive field1341;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 685664599
	)
	static int field1340;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1; // L: 507
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1083303950"
	)
	public void vmethod6342() {
		if (this.val$cc != null && this.val$cc.method6716().field3634 != null) { // L: 509
			ScriptEvent var1 = new ScriptEvent(); // L: 510
			var1.method2355(this.val$cc); // L: 511
			var1.setArgs(this.val$cc.method6716().field3634); // L: 512
			class27.method401().addFirst(var1); // L: 513
		}

	} // L: 515
}
