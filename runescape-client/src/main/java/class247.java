import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class247 {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive7")
	static Archive archive7;

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1392845138"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class22.Client_plane) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = AbstractSocket.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = AbstractSocket.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = AbstractSocket.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = AbstractSocket.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) {
				var12 = AbstractSocket.scene.getObjectFlags(var0, var2, var3, var7);
				int var14 = class93.Entity_unpackID(var7);
				int var15 = var12 & 31;
				int var16 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					AbstractSocket.scene.removeBoundaryObject(var0, var2, var3);
					var13 = class23.getObjectDefinition(var14);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3156(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) {
					AbstractSocket.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					AbstractSocket.scene.removeGameObject(var0, var2, var3);
					var13 = class23.getObjectDefinition(var14);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) {
					AbstractSocket.scene.removeFloorDecoration(var0, var2, var3);
					var13 = class23.getObjectDefinition(var14);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3150(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}

				DevicePcmPlayerProvider.method386(var0, var12, var2, var3, var4, var5, var6, AbstractSocket.scene, Client.collisionMaps[var0]);
			}
		}

	}
}
