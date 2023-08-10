import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public final class class344 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -627034483
	)
	static int field3852;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -27007069
	)
	static int field3842;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("Ignored_cached")
	static class498 Ignored_cached;

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-512665068"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class36.Client_plane][var0][var1]; // L: 8695
		if (var2 == null) { // L: 8696
			UserComparator5.scene.removeGroundItemPile(class36.Client_plane, var0, var1); // L: 8697
		} else {
			long var3 = -99999999L; // L: 8700
			TileItem var5 = null; // L: 8701

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8702 8703 8713
				ItemComposition var7 = class125.ItemComposition_get(var6.id); // L: 8704
				long var11 = (long)var7.price; // L: 8705
				if (var7.isStackable == 1) { // L: 8706
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8707
				}

				if (var11 > var3) { // L: 8709
					var3 = var11; // L: 8710
					var5 = var6; // L: 8711
				}
			}

			if (var5 == null) { // L: 8715
				UserComparator5.scene.removeGroundItemPile(class36.Client_plane, var0, var1); // L: 8716
			} else {
				var2.addLast(var5); // L: 8719
				TileItem var13 = null; // L: 8720
				TileItem var8 = null; // L: 8721

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8722 8723 8728
					if (var5.id != var6.id) { // L: 8724
						if (var13 == null) { // L: 8725
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 8726
							var8 = var6;
						}
					}
				}

				long var9 = BufferedNetSocket.calculateTag(var0, var1, 3, false, 0); // L: 8730
				UserComparator5.scene.newGroundItemPile(class36.Client_plane, var0, var1, class306.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class36.Client_plane), var5, var9, var13, var8); // L: 8731
			}
		}
	} // L: 8698 8717 8732
}
