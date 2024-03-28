import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
final class class106 implements class339 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1419582299
	)
	static int field1375;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1; // L: 508
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847242304"
	)
	public void vmethod6279() {
		if (this.val$cc != null && this.val$cc.method6683().field3676 != null) { // L: 510
			ScriptEvent var1 = new ScriptEvent(); // L: 511
			var1.method2305(this.val$cc); // L: 512
			var1.setArgs(this.val$cc.method6683().field3676); // L: 513
			class131.method3048().addFirst(var1); // L: 514
		}

	} // L: 516

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "50"
	)
	static void method2699(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "380838610"
	)
	public static int method2696(int var0, int var1, int var2) {
		int var3 = class75.method2089(var2 - var1 + 1); // L: 59
		var3 <<= var1; // L: 60
		var0 |= var3; // L: 61
		return var0; // L: 62
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	public static void method2698() {
		KitDefinition.KitDefinition_cached.clear(); // L: 133
	} // L: 134

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "410458647"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		PacketBufferNode.method5930(); // L: 2952
		switch(var0) { // L: 2953
		case 1:
			class210.method3930(24); // L: 2965
			class59.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2966
			break;
		case 2:
			class210.method3930(24); // L: 2957
			class59.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2958
		}

	} // L: 2971
}
