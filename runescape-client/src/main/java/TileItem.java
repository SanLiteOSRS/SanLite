import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1605084495
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -49892943
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "-842208187"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class258.ItemComposition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfe;",
		garbageValue = "13"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}
}
