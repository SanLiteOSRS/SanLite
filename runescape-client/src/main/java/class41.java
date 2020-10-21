import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class41 {
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1092142465
	)
	@Export("port3")
	static int port3;

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "9"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var0][var1];
		if (var2 == null) {
			ModeWhere.scene.removeGroundItemPile(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = AbstractWorldMapData.ItemDefinition_get(var6.id);
				long var8 = (long)var7.price;
				if (var7.isStackable == 1) {
					var8 *= (long)(var6.quantity + 1);
				}

				if (var8 > var3) {
					var3 = var8;
					var5 = var6;
				}
			}

			if (var5 == null) {
				ModeWhere.scene.removeGroundItemPile(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var12 = null;
				TileItem var11 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.id != var6.id) {
						if (var12 == null) {
							var12 = var6;
						}

						if (var12.id != var6.id && var11 == null) {
							var11 = var6;
						}
					}
				}

				long var9 = GrandExchangeOfferOwnWorldComparator.calculateTag(var0, var1, 3, false, 0);
				ModeWhere.scene.newGroundItemPile(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1, GrandExchangeOfferWorldComparator.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GrandExchangeOfferUnitPriceComparator.Client_plane), var5, var9, var12, var11);
			}
		}
	}
}
