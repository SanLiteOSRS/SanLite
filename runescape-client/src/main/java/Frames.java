import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lga;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 11
		int var6 = var1.getGroupFileCount(var3); // L: 12
		this.frames = new Animation[var6]; // L: 13
		int[] var7 = var1.getGroupFileIds(var3); // L: 14

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 15
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 16
			Skeleton var10 = null; // L: 17
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 18

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 19 20 25
				if (var11 == var12.id) { // L: 21
					var10 = var12; // L: 22
					break;
				}
			}

			if (var10 == null) { // L: 27
				byte[] var13 = var2.getFile(var11, 0); // L: 30
				var10 = new Skeleton(var11, var13); // L: 31
				var5.addFirst(var10); // L: 32
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 34
		}

	} // L: 36

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1979341269"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 39
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "8"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7788
			if (Client.isLowDetail && var0 != class268.Client_plane) { // L: 7789
				return;
			}

			long var7 = 0L; // L: 7790
			boolean var9 = true; // L: 7791
			boolean var10 = false; // L: 7792
			boolean var11 = false; // L: 7793
			if (var1 == 0) { // L: 7794
				var7 = class12.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7795
				var7 = class12.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7796
				var7 = class12.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7797
				var7 = class12.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 7798
				var12 = class12.scene.getObjectFlags(var0, var2, var3, var7); // L: 7799
				int var14 = WorldMapSection2.Entity_unpackID(var7); // L: 7800
				int var15 = var12 & 31; // L: 7801
				int var16 = var12 >> 6 & 3; // L: 7802
				ObjectComposition var13;
				if (var1 == 0) { // L: 7803
					class12.scene.removeWallObject(var0, var2, var3); // L: 7804
					var13 = FileSystem.getObjectDefinition(var14); // L: 7805
					if (var13.interactType != 0) { // L: 7806
						Client.collisionMaps[var0].method3778(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7808
					class12.scene.removeDecorativeObject(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7809
					class12.scene.removeGameObject(var0, var2, var3); // L: 7810
					var13 = FileSystem.getObjectDefinition(var14); // L: 7811
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7812
						return;
					}

					if (var13.interactType != 0) { // L: 7813
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7815
					class12.scene.removeGroundObject(var0, var2, var3); // L: 7816
					var13 = FileSystem.getObjectDefinition(var14); // L: 7817
					if (var13.interactType == 1) { // L: 7818
						Client.collisionMaps[var0].method3781(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7821
				var12 = var0; // L: 7822
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7823
					var12 = var0 + 1;
				}

				class14.method174(var0, var12, var2, var3, var4, var5, var6, class12.scene, Client.collisionMaps[var0]); // L: 7824
			}
		}

	} // L: 7827
}
