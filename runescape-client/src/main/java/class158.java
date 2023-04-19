import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class158 extends class139 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static IndexedSprite field1766;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1899901343
	)
	int field1765;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class158(class142 var1) {
		this.this$0 = var1;
		this.field1765 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1765 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.method3301(this.field1765); // L: 153
	} // L: 154

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	static void method3413() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 99
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 100
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 101
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 102
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 103
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 104
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 105
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 106
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 107
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 108
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 109
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 110
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 111
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 114
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 115
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 116
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 117
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 118
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 119
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 120
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 121
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 122
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 123
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 124
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 125
		}

	} // L: 127

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhg;",
		garbageValue = "-428444865"
	)
	public static VarbitComposition method3409(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 34
			var1 = new VarbitComposition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lmq;IIZI)V",
		garbageValue = "-2141631151"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10506
		int var5 = var0.height; // L: 10507
		if (var0.widthAlignment == 0) { // L: 10508
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10509
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10510
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10511
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10512
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 10513
		}

		if (var0.widthAlignment == 4) { // L: 10514
			var0.width = var0.field3586 * var0.height / var0.field3587;
		}

		if (var0.heightAlignment == 4) { // L: 10515
			var0.height = var0.field3587 * var0.width / var0.field3586;
		}

		if (var0.contentType == 1337) { // L: 10516
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 10517
			var0.method6392().method6092(var0.width, var0.height); // L: 10518
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10520
			ScriptEvent var6 = new ScriptEvent(); // L: 10521
			var6.widget = var0; // L: 10522
			var6.args = var0.onResize; // L: 10523
			Client.scriptEvents.addFirst(var6); // L: 10524
		}

	} // L: 10526
}
