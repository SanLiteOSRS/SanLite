import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
final class class101 implements class297 {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -2019861191
	)
	static int field1365;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 978763523
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lkd;)V"
	)
	class101(Widget var1) {
		this.val$cc = var1; // L: 508
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1798262930"
	)
	public void vmethod5829() {
		if (this.val$cc != null && this.val$cc.method6185().field3468 != null) { // L: 510
			ScriptEvent var1 = new ScriptEvent(); // L: 511
			var1.method2255(this.val$cc); // L: 512
			var1.setArgs(this.val$cc.method6185().field3468); // L: 513
			class216.method4611().addFirst(var1); // L: 514
		}

	} // L: 516

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1255396169"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field739 = 0L; // L: 4265
		if (var0 >= 2) { // L: 4266
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4267
		}

		if (Message.getWindowedMode() == 1) { // L: 4268
			BuddyRankComparator.client.setMaxCanvasSize(765, 503); // L: 4269
		} else {
			BuddyRankComparator.client.setMaxCanvasSize(7680, 2160); // L: 4272
		}

		if (Client.gameState >= 25) { // L: 4274
			GameEngine.method665();
		}

	} // L: 4275
}
