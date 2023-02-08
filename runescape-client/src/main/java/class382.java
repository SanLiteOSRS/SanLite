import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class382 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lda;FB)F",
		garbageValue = "1"
	)
	static float method7405(class125 var0, float var1) {
		if (var0 == null) { // L: 211
			return 0.0F; // L: 212
		} else {
			float var2 = var1 - var0.field1520; // L: 214
			return var2 * (var0.field1543 + (var0.field1528 * var2 + var0.field1529) * var2) + var0.field1531; // L: 215
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "953377843"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 13258
		short[] var2 = new short[16]; // L: 13259
		int var3 = 0; // L: 13260

		for (int var4 = 0; var4 < ItemComposition.ItemComposition_fileCount; ++var4) { // L: 13261
			ItemComposition var9 = TileItem.ItemComposition_get(var4); // L: 13262
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 13263 13264 13265
				if (var3 >= 250) { // L: 13266
					class378.foundItemIdCount = -1; // L: 13267
					VarbitComposition.foundItemIds = null; // L: 13268
					return; // L: 13269
				}

				if (var3 >= var2.length) { // L: 13271
					short[] var6 = new short[var2.length * 2]; // L: 13272

					for (int var7 = 0; var7 < var3; ++var7) { // L: 13273
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 13274
				}

				var2[var3++] = (short)var4; // L: 13276
			}
		}

		VarbitComposition.foundItemIds = var2; // L: 13278
		WorldMapLabelSize.foundItemIndex = 0; // L: 13279
		class378.foundItemIdCount = var3; // L: 13280
		String[] var8 = new String[class378.foundItemIdCount]; // L: 13281

		for (int var5 = 0; var5 < class378.foundItemIdCount; ++var5) { // L: 13282
			var8[var5] = TileItem.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = VarbitComposition.foundItemIds; // L: 13283
		WorldMapCacheName.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 13285
	} // L: 13287
}
