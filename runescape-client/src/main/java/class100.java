import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
final class class100 implements class294 {
	@ObfuscatedName("vq")
	static Iterator field1305;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lkn;)V"
	)
	class100(Widget var1) {
		this.val$cc = var1; // L: 516
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-462679777"
	)
	public void vmethod5708() {
		if (this.val$cc != null && this.val$cc.method6079().field3414 != null) { // L: 518
			ScriptEvent var1 = new ScriptEvent(); // L: 519
			var1.method2233(this.val$cc); // L: 520
			var1.setArgs(this.val$cc.method6079().field3414); // L: 521
			class420.method7802().addFirst(var1); // L: 522
		}

	} // L: 524

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-784697867"
	)
	public static int method2559(CharSequence var0) {
		return class19.method286(var0, 10, true); // L: 77
	}
}
