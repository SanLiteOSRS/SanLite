import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class253 {
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-597857379"
	)
	static final void method5283() {
		if (class383.Client_plane != Client.field619) { // L: 3543
			Client.field619 = class383.Client_plane; // L: 3544
			int var0 = class383.Client_plane; // L: 3545
			int[] var1 = GameObject.sceneMinimapSprite.pixels; // L: 3547
			int var2 = var1.length; // L: 3548

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 3549
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 3550
				var4 = (103 - var3) * 2048 + 24628; // L: 3551

				for (var5 = 1; var5 < 103; ++var5) { // L: 3552
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 3553
						ReflectionCheck.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						ReflectionCheck.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3); // L: 3554
					}

					var4 += 4; // L: 3555
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3558
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3559
			GameObject.sceneMinimapSprite.setRaster(); // L: 3560

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 3561
				for (var6 = 1; var6 < 103; ++var6) { // L: 3562
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 3563
						class182.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 3564
						class182.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 3567

			for (var5 = 0; var5 < 104; ++var5) { // L: 3568
				for (var6 = 0; var6 < 104; ++var6) { // L: 3569
					long var7 = ReflectionCheck.scene.getGroundObjectTag(class383.Client_plane, var5, var6); // L: 3570
					if (var7 != 0L) { // L: 3571
						int var9 = Occluder.Entity_unpackID(var7); // L: 3572
						int var10 = VarpDefinition.getObjectDefinition(var9).mapIconId; // L: 3573
						if (var10 >= 0 && JagexCache.WorldMapElement_get(var10).field1940) { // L: 3574 3575
							Client.mapIcons[Client.mapIconCount] = JagexCache.WorldMapElement_get(var10).getSpriteBool(false); // L: 3578
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 3579
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 3580
							++Client.mapIconCount; // L: 3581
						}
					}
				}
			}

			RouteStrategy.rasterProvider.apply(); // L: 3586
		}

	} // L: 3589
}
