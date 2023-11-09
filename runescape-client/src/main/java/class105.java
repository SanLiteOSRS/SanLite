import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
final class class105 implements class324 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1; // L: 503
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	public void vmethod6102() {
		if (this.val$cc != null && this.val$cc.method6471().field3556 != null) { // L: 505
			ScriptEvent var1 = new ScriptEvent(); // L: 506
			var1.method2290(this.val$cc); // L: 507
			var1.setArgs(this.val$cc.method6471().field3556); // L: 508
			ClientPacket.method5722().addFirst(var1); // L: 509
		}

	} // L: 511

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcx;",
		garbageValue = "-95"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static final void method2684() {
		if (VerticalAlignment.pcmPlayer1 != null) { // L: 3813
			VerticalAlignment.pcmPlayer1.run();
		}

	} // L: 3814
}
