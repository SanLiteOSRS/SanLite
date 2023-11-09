import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class143 extends class139 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 950254081
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -263561057
	)
	int field1667;
	@ObfuscatedName("an")
	byte field1668;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class143(class142 var1) {
		this.this$0 = var1;
		this.field1667 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1667 = var1.readUnsignedShort(); // L: 134
		this.field1668 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.method3324(this.field1667, this.field1668); // L: 139
	} // L: 140

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "6"
	)
	static final int method3237(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "([Lmq;IB)V",
		garbageValue = "119"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11336
			Widget var3 = var0[var2]; // L: 11337
			if (var3 != null) { // L: 11338
				if (var3.type == 0) { // L: 11339
					if (var3.children != null) { // L: 11340
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11341
					if (var4 != null) { // L: 11342
						class127.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11344
					var5 = new ScriptEvent(); // L: 11345
					var5.widget = var3; // L: 11346
					var5.args = var3.onDialogAbort; // L: 11347
					HealthBarUpdate.runScriptEvent(var5); // L: 11348
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11350
					if (var3.childIndex >= 0) { // L: 11351
						Widget var6 = class165.getWidget(var3.id); // L: 11352
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11353
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11357
					var5.widget = var3; // L: 11358
					var5.args = var3.onSubChange; // L: 11359
					HealthBarUpdate.runScriptEvent(var5); // L: 11360
				}
			}
		}

	} // L: 11363

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1000953659"
	)
	public static Clipboard method3243() {
		return ScriptFrame.client.method520(); // L: 12266
	}
}
