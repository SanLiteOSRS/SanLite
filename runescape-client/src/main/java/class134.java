import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class134 implements class125 {
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "28"
	)
	static void method3141(int var0, int var1, int var2) {
		NodeDeque var3 = Client.groundItems[var0][var1][var2]; // L: 8614
		if (var3 == null) { // L: 8615
			GrandExchangeOfferOwnWorldComparator.scene.method5403(var0, var1, var2); // L: 8616
		} else {
			long var4 = -99999999L; // L: 8619
			TileItem var6 = null; // L: 8620

			TileItem var7;
			for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) { // L: 8621 8622 8632
				ItemComposition var8 = class341.ItemComposition_get(var7.id); // L: 8623
				long var12 = (long)var8.price; // L: 8624
				if (var8.isStackable == 1) { // L: 8625
					var12 *= var7.quantity < Integer.MAX_VALUE ? (long)(var7.quantity + 1) : (long)var7.quantity; // L: 8626
				}

				if (var12 > var4) { // L: 8628
					var4 = var12; // L: 8629
					var6 = var7; // L: 8630
				}
			}

			if (var6 == null) { // L: 8634
				GrandExchangeOfferOwnWorldComparator.scene.method5403(var0, var1, var2); // L: 8635
			} else {
				var3.addLast(var6); // L: 8638
				TileItem var14 = null; // L: 8639
				TileItem var9 = null; // L: 8640

				for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) { // L: 8641 8642 8647
					if (var6.id != var7.id) { // L: 8643
						if (var14 == null) { // L: 8644
							var14 = var7;
						}

						if (var7.id != var14.id && var9 == null) { // L: 8645
							var9 = var7;
						}
					}
				}

				long var10 = DynamicObject.calculateTag(var1, var2, 3, false, 0); // L: 8649
				GrandExchangeOfferOwnWorldComparator.scene.newGroundItemPile(var0, var1, var2, class19.getTileHeight(var1 * 128 + 64, var2 * 128 + 64, var0), var6, var10, var14, var9); // L: 8650
			}
		}
	} // L: 8617 8636 8651
}
