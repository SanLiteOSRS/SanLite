import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("w")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("v")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1575431639"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8318
			if (Client.isLowDetail && var0 != class103.Client_plane) { // L: 8319
				return;
			}

			long var7 = 0L; // L: 8320
			boolean var9 = true; // L: 8321
			boolean var10 = false; // L: 8322
			boolean var11 = false; // L: 8323
			if (var1 == 0) { // L: 8324
				var7 = WorldMapAreaData.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8325
				var7 = WorldMapAreaData.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8326
				var7 = WorldMapAreaData.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8327
				var7 = WorldMapAreaData.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 8328
				var12 = WorldMapAreaData.scene.getObjectFlags(var0, var2, var3, var7); // L: 8329
				int var14 = class124.Entity_unpackID(var7); // L: 8330
				int var15 = var12 & 31; // L: 8331
				int var16 = var12 >> 6 & 3; // L: 8332
				ObjectComposition var13;
				if (var1 == 0) { // L: 8333
					WorldMapAreaData.scene.removeWallObject(var0, var2, var3); // L: 8334
					var13 = class463.getObjectDefinition(var14); // L: 8335
					if (var13.interactType != 0) { // L: 8336
						Client.collisionMaps[var0].method4200(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 8338
					WorldMapAreaData.scene.removeDecorativeObject(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8339
					WorldMapAreaData.scene.removeGameObject(var0, var2, var3); // L: 8340
					var13 = class463.getObjectDefinition(var14); // L: 8341
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 8342
						return;
					}

					if (var13.interactType != 0) { // L: 8343
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 8345
					WorldMapAreaData.scene.removeGroundObject(var0, var2, var3); // L: 8346
					var13 = class463.getObjectDefinition(var14); // L: 8347
					if (var13.interactType == 1) { // L: 8348
						Client.collisionMaps[var0].method4192(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8351
				var12 = var0; // L: 8352
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8353
					var12 = var0 + 1;
				}

				class155.method3331(var0, var12, var2, var3, var4, var5, var6, WorldMapAreaData.scene, Client.collisionMaps[var0]); // L: 8354
			}
		}

	} // L: 8357

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1079799001"
	)
	static void method6427(int var0, int var1) {
		MenuAction var2 = class148.tempMenuAction; // L: 12577
		if (var2 != null) { // L: 12579
			FileSystem.method3505(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field890, var2.field893, var2.action, var0, var1); // L: 12580
		}

		class148.tempMenuAction = null; // L: 12583
	} // L: 12584
}
