import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("an")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("av")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-7"
	)
	static final int method2230(int var0, int var1) {
		if (var0 == -1) { // L: 969
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 970
			if (var1 < 2) { // L: 971
				var1 = 2;
			} else if (var1 > 126) { // L: 972
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 973
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1737946308"
	)
	static final void method2239(int var0) {
		int[] var1 = class33.sceneMinimapSprite.pixels; // L: 6211
		int var2 = var1.length; // L: 6212

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6213
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6214
			var4 = (103 - var3) * 2048 + 24628; // L: 6215

			for (var5 = 1; var5 < 103; ++var5) { // L: 6216
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6217
					class36.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6218
					class36.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6219
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6222
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6223
		class33.sceneMinimapSprite.setRaster(); // L: 6224

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6225
			for (var6 = 1; var6 < 103; ++var6) { // L: 6226
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6227
					UserComparator10.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6228
					UserComparator10.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 6231

		for (var5 = 0; var5 < 104; ++var5) { // L: 6232
			for (var6 = 0; var6 < 104; ++var6) { // L: 6233
				long var7 = class36.scene.getGroundObjectTag(Clock.Client_plane, var5, var6); // L: 6234
				if (var7 != 0L) { // L: 6235
					int var9 = class215.Entity_unpackID(var7); // L: 6236
					int var10 = class175.getObjectDefinition(var9).mapIconId; // L: 6237
					if (var10 >= 0 && class147.WorldMapElement_get(var10).field1908) { // L: 6238 6239
						Client.mapIcons[Client.mapIconCount] = class147.WorldMapElement_get(var10).getSpriteBool(false); // L: 6242
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 6243
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 6244
						++Client.mapIconCount; // L: 6245
					}
				}
			}
		}

		WorldMapSectionType.rasterProvider.apply(); // L: 6250
	} // L: 6251
}
