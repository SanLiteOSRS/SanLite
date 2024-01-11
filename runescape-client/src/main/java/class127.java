import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class127 {
	@ObfuscatedName("aj")
	public static final float field1487;
	@ObfuscatedName("aq")
	public static final float field1490;
	@ObfuscatedName("ar")
	static float[] field1491;
	@ObfuscatedName("ag")
	static float[] field1492;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1489;

	static {
		field1487 = Math.ulp(1.0F); // L: 10
		field1490 = field1487 * 2.0F; // L: 11
		field1491 = new float[4]; // L: 12
		field1492 = new float[5]; // L: 13
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1765448394"
	)
	static void method3028(int var0) {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;I)V",
		garbageValue = "1712425930"
	)
	public static void method3027(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		class105.field1341 = var1; // L: 33
	} // L: 34

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "963760202"
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
}
