import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field2817;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive9")
	static Archive archive9;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("ay")
	public static double method5007(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lmo;",
		garbageValue = "721746289"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = ArchiveDiskActionHandler.getWidget(var0); // L: 235
		if (var1 == -1) { // L: 236
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 237 238
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2018288898"
	)
	public static int method5006(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 101 102 105
			var2 = var2 << 1 | var0 & 1; // L: 103
			var0 >>>= 1; // L: 104
		}

		return var2; // L: 107
	}
}
