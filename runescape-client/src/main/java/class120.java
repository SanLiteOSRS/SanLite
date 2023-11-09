import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class120 implements class112 {
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1513821552"
	)
	public static int method2735(int var0) {
		return WorldMapSection2.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 64
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "433143709"
	)
	public static void method2734() {
		ItemComposition.ItemComposition_cached.clear(); // L: 556
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 557
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 558
	} // L: 559
}
