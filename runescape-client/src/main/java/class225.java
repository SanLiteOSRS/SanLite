import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class225 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 896523557
	)
	static int field2777;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lkw;",
		garbageValue = "57239353"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2045310244"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class26.Client_plane][var0][var1];
		if (var2 == null) {
			WorldMapArea.scene.removeGroundItemPile(class26.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = class23.ItemDefinition_get(var6.id);
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
				WorldMapArea.scene.removeGroundItemPile(class26.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var12 = null;
				TileItem var11 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var12 == null) {
							var12 = var6;
						}

						if (var12.id != var6.id && var11 == null) {
							var11 = var6;
						}
					}
				}

				long var9 = AttackOption.calculateTag(var0, var1, 3, false, 0);
				WorldMapArea.scene.newGroundItemPile(class26.Client_plane, var0, var1, UserComparator7.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class26.Client_plane), var5, var9, var12, var11);
			}
		}
	}
}
