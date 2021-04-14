import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("u")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 256731231
	)
	@Export("width")
	public int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1327457593
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2076883796"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "-60"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2104011211"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		signature = "(IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = WorldMapArea.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (0L != var5) {
			var7 = WorldMapArea.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var11 = 0L != var5 && !class10.method137(var5);
			if (var11) {
				var10 = var4;
			}

			int[] var12 = class19.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = WorldMapSection1.Entity_unpackID(var5);
			ObjectComposition var15 = class19.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = class18.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var17 + var1 * 4 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 1) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var12[var13] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = WorldMapArea.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = WorldMapArea.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = WorldMapSection1.Entity_unpackID(var5);
			ObjectComposition var19 = class19.getObjectDefinition(var10);
			if (var19.mapSceneId != -1) {
				IndexedSprite var26 = class18.mapSceneSprites[var19.mapSceneId];
				if (var26 != null) {
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2;
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2;
					var26.drawAt(var1 * 4 + var13 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				int var22 = 15658734;
				boolean var27 = 0L != var5 && !class10.method137(var5);
				if (var27) {
					var22 = 15597568;
				}

				int[] var23 = class19.sceneMinimapSprite.pixels;
				int var24 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var23[var24] = var22;
					var23[var24 + 1 + 512] = var22;
					var23[var24 + 1024 + 2] = var22;
					var23[var24 + 1536 + 3] = var22;
				} else {
					var23[var24 + 1536] = var22;
					var23[var24 + 1 + 1024] = var22;
					var23[var24 + 512 + 2] = var22;
					var23[var24 + 3] = var22;
				}
			}
		}

		var5 = WorldMapArea.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = WorldMapSection1.Entity_unpackID(var5);
			ObjectComposition var20 = class19.getObjectDefinition(var7);
			if (var20.mapSceneId != -1) {
				IndexedSprite var21 = class18.mapSceneSprites[var20.mapSceneId];
				if (var21 != null) {
					var10 = (var20.sizeX * 4 - var21.subWidth) / 2;
					int var25 = (var20.sizeY * 4 - var21.subHeight) / 2;
					var21.drawAt(var10 + var1 * 4 + 48, var25 + (104 - var2 - var20.sizeY) * 4 + 48);
				}
			}
		}

	}
}
