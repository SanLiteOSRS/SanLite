import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class36 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	static Archive field239;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-105"
	)
	public static int method674(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-75"
	)
	static void method675() {
		Tiles.field995 = null; // L: 65
		Tiles.field996 = null; // L: 66
		class16.field81 = null; // L: 67
		Tiles.field997 = null; // L: 68
		class17.field88 = null; // L: 69
		Decimator.field405 = null; // L: 70
		class306.field3445 = null; // L: 71
		Tiles.Tiles_hue = null; // L: 72
		class134.Tiles_saturation = null; // L: 73
		Language.Tiles_lightness = null; // L: 74
		TileItem.Tiles_hueMultiplier = null; // L: 75
		Interpreter.field840 = null; // L: 76
	} // L: 77

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lmy;",
		garbageValue = "1"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = WorldMapSection1.getWidget(var0); // L: 244
		if (var1 == -1) { // L: 245
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 246 247
		}
	}
}
