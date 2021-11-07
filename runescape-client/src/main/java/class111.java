import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class111 implements class110 {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-721238808"
	)
	public static final synchronized long method2516() {
		long var0 = System.currentTimeMillis();
		if (var0 < class397.field4289) {
			class397.field4288 += class397.field4289 - var0;
		}

		class397.field4289 = var0;
		return var0 + class397.field4288;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1420142897"
	)
	public static boolean method2514(int var0) {
		return (var0 >> 31 & 1) != 0;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-600085887"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = GameBuild.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) {
			var7 = GameBuild.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (ItemLayer.method4106(var5)) {
				var10 = var4;
			}

			int[] var11 = class10.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = class21.Entity_unpackID(var5);
			ObjectComposition var14 = KitDefinition.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = TriBool.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight * 470302976) / 2;
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = GameBuild.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = GameBuild.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = class21.Entity_unpackID(var5);
			ObjectComposition var24 = KitDefinition.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = TriBool.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight * 470302976) / 2;
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (ItemLayer.method4106(var5)) {
					var12 = 15597568;
				}

				int[] var18 = class10.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}

		var5 = GameBuild.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class21.Entity_unpackID(var5);
			ObjectComposition var21 = KitDefinition.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = TriBool.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight * 470302976) / 2;
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
				}
			}
		}

	}
}
