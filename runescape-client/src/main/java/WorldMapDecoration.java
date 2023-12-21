import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1757511385
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -982756641
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 805230653
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lrz;",
		garbageValue = "55"
	)
	public static class462 method4928() {
		synchronized(class462.field4770) { // L: 27
			if (DirectByteArrayCopier.field3822 == 0) { // L: 28
				return new class462();
			} else {
				class462.field4770[--DirectByteArrayCopier.field3822].method8457(); // L: 30
				return class462.field4770[DirectByteArrayCopier.field3822]; // L: 31
			}
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "750324904"
	)
	static final void method4929(int var0) {
		int[] var1 = class102.sceneMinimapSprite.pixels; // L: 6101
		int var2 = var1.length; // L: 6102

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6103
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6104
			var4 = (103 - var3) * 2048 + 24628; // L: 6105

			for (var5 = 1; var5 < 103; ++var5) { // L: 6106
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6107
					class36.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6108
					class36.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6109
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6112
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6113
		class102.sceneMinimapSprite.setRaster(); // L: 6114

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6115
			for (var6 = 1; var6 < 103; ++var6) { // L: 6116
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6117
					class511.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6118
					class511.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 6121

		for (var5 = 0; var5 < 104; ++var5) { // L: 6122
			for (var6 = 0; var6 < 104; ++var6) { // L: 6123
				long var7 = class36.scene.getGroundObjectTag(ItemLayer.Client_plane, var5, var6); // L: 6124
				if (0L != var7) { // L: 6125
					int var9 = class232.Entity_unpackID(var7); // L: 6126
					int var10 = WorldMapSection2.getObjectDefinition(var9).mapIconId; // L: 6127
					if (var10 >= 0 && class141.WorldMapElement_get(var10).field1824) { // L: 6128 6129
						Client.mapIcons[Client.mapIconCount] = class141.WorldMapElement_get(var10).getSpriteBool(false); // L: 6132
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 6133
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 6134
						++Client.mapIconCount; // L: 6135
					}
				}
			}
		}

		class338.rasterProvider.apply(); // L: 6141
	} // L: 6143
}
