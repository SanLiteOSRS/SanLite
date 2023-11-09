import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class330 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-113"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1078923778"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5245
			if (WorldMapAreaData.loadInterface(var0)) { // L: 5246
				Widget[] var1 = UserComparator6.Widget_interfaceComponents[var0]; // L: 5247

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5248
					Widget var3 = var1[var2]; // L: 5249
					if (var3.onLoad != null) { // L: 5250
						ScriptEvent var4 = new ScriptEvent(); // L: 5251
						var4.widget = var3; // L: 5252
						var4.args = var3.onLoad; // L: 5253
						class291.runScript(var4, 5000000, 0); // L: 5254
					}
				}

			}
		}
	} // L: 5257
}
