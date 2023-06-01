import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
final class class104 implements class321 {
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	class104(Widget var1) {
		this.val$cc = var1; // L: 502
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2105224768"
	)
	public void vmethod6091() {
		if (this.val$cc != null && this.val$cc.method6490().field3536 != null) { // L: 504
			ScriptEvent var1 = new ScriptEvent(); // L: 505
			var1.method2243(this.val$cc); // L: 506
			var1.setArgs(this.val$cc.method6490().field3536); // L: 507
			class101.method2634().addFirst(var1); // L: 508
		}

	} // L: 510

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "256"
	)
	public static int method2654() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-4"
	)
	public static int method2655(String var0) {
		return var0.length() + 2; // L: 123
	}
}
