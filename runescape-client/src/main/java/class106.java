import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
final class class106 implements class339 {
	@ObfuscatedName("cm")
	static String field1372;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lng;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1; // L: 507
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void vmethod6430() {
		if (this.val$cc != null && this.val$cc.method6841().field3654 != null) { // L: 509
			ScriptEvent var1 = new ScriptEvent(); // L: 510
			var1.method2355(this.val$cc); // L: 511
			var1.setArgs(this.val$cc.method6841().field3654); // L: 512
			DirectByteArrayCopier.method6959().addFirst(var1); // L: 513
		}

	} // L: 515

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcy;",
		garbageValue = "-93"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1485975719"
	)
	static final void method2774(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9295
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9296
				Client.field721[var4] = true;
			}
		}

	} // L: 9298

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V",
		garbageValue = "-1004297114"
	)
	static final void method2775(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		class246.method4955(var0, var1, var2, var3, var4, var5, var6, false); // L: 10275
	} // L: 10276
}
