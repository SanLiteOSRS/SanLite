import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1417914255
	)
	static int field1314;
	@ObfuscatedName("as")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -126580705
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1272655955
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1678180761
	)
	int field1317;

	TileItem() {
		this.field1317 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2082293600"
	)
	void method2649(int var1) {
		this.field1317 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "-1998422213"
	)
	@Export("getModel")
	protected final Model getModel() {
		return ParamComposition.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1678542179"
	)
	boolean method2651(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1317 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "112"
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
