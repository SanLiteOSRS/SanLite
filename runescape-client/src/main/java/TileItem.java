import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 418956957
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1152551687
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -63855207
	)
	int field1368;

	TileItem() {
		this.field1368 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "255610960"
	)
	void method2758(int var1) {
		this.field1368 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		return ArchiveDiskActionHandler.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-20"
	)
	boolean method2760(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1368 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}
}
