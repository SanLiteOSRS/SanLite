import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1665755063
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ar")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("am")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-922438804"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5284
			if (Login.loadInterface(var0)) { // L: 5285
				Widget[] var1 = ArchiveLoader.Widget_interfaceComponents[var0]; // L: 5286

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5287
					Widget var3 = var1[var2]; // L: 5288
					if (var3.onLoad != null) { // L: 5289
						ScriptEvent var4 = new ScriptEvent(); // L: 5290
						var4.widget = var3; // L: 5291
						var4.args = var3.onLoad; // L: 5292
						UserComparator8.runScript(var4, 5000000, 0); // L: 5293
					}
				}

			}
		}
	} // L: 5296

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	static final void method1208() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8455 8456 8462
			if (var0.hitpoints == -1) { // L: 8457
				var0.delay = 0; // L: 8458
				class11.method112(var0); // L: 8459
			} else {
				var0.remove(); // L: 8461
			}
		}

	} // L: 8464
}
