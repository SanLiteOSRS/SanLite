import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public enum class135 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	field1626(2, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	field1623(4, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	field1624(0, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	field1625(3, 3),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	field1630(1, 4);

	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 1009971383
	)
	static int field1629;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -236409277
	)
	public final int field1627;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1115089473
	)
	@Export("id")
	final int id;

	class135(int var3, int var4) {
		this.field1627 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Lkz;",
		garbageValue = "-1176907573"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class133.getWidget(var0); // L: 243
		if (var1 == -1) { // L: 244
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 245 246
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lch;",
		garbageValue = "381687737"
	)
	static class85[] method3131() {
		return new class85[]{class85.field1084, class85.field1089, class85.field1083, class85.field1086, class85.field1092}; // L: 16
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "([Lkz;IB)V",
		garbageValue = "10"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12427
			Widget var3 = var0[var2]; // L: 12428
			if (var3 != null) { // L: 12429
				if (var3.type == 0) { // L: 12430
					if (var3.children != null) { // L: 12431
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12432
					if (var4 != null) { // L: 12433
						class147.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 12435
					var5 = new ScriptEvent(); // L: 12436
					var5.widget = var3; // L: 12437
					var5.args = var3.onDialogAbort; // L: 12438
					WorldMapAreaData.runScriptEvent(var5); // L: 12439
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 12441
					if (var3.childIndex >= 0) { // L: 12442
						Widget var6 = class133.getWidget(var3.id); // L: 12443
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 12444
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 12448
					var5.widget = var3; // L: 12449
					var5.args = var3.onSubChange; // L: 12450
					WorldMapAreaData.runScriptEvent(var5); // L: 12451
				}
			}
		}

	} // L: 12454
}
