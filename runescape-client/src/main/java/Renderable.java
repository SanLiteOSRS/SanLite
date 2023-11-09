import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1550732737
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-112"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("df")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-407537410"
	)
	static void method4701() {
		class186.field1976 = null; // L: 61
		Tiles.field997 = null; // L: 62
		Tiles.field1008 = null; // L: 63
		Tiles.field999 = null; // L: 64
		class161.field1782 = null; // L: 65
		Tiles.field994 = null; // L: 66
		Tiles.field996 = null; // L: 67
		FileSystem.Tiles_hue = null; // L: 68
		Tiles.Tiles_saturation = null; // L: 69
		class283.Tiles_lightness = null; // L: 70
		UserComparator4.Tiles_hueMultiplier = null; // L: 71
		class31.field176 = null; // L: 72
	} // L: 73
}
