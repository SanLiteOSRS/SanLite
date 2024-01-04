import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class182 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static EvictingDualNodeHashTable field1885;

	static {
		field1885 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-419579110"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	static void method3664() {
		ItemLayer.field2658 = null; // L: 1287
		class11.redHintArrowSprite = null; // L: 1288
		VarpDefinition.mapSceneSprites = null; // L: 1289
		UrlRequest.field1434 = null; // L: 1290
		AbstractByteArrayCopier.field3816 = null; // L: 1291
		class60.field420 = null; // L: 1292
		class12.field53 = null; // L: 1293
		VarpDefinition.field1816 = null; // L: 1294
		HorizontalAlignment.field1908 = null; // L: 1295
		class31.scrollBarSprites = null; // L: 1296
		class134.field1582 = null; // L: 1297
	} // L: 1298
}
