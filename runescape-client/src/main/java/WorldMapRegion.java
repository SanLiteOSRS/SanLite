import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lfi;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ba")
	static String field281;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1496476917
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 159033397
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lh;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("u")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1241362547
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2000095907
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("o")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("n")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("x")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1;
		this.regionY = var2;
		this.worldMapData1List = new LinkedList();
		this.icon0List = new LinkedList();
		this.iconMap = new HashMap();
		this.backgroundColor = var3 | -16777216;
		this.fonts = var4;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "4"
	)
	void method521(int var1, int var2, int var3) {
		SpritePixels var4 = Buddy.method5321(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lh;Ljava/util/List;I)V",
		garbageValue = "-1766116567"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-555470431"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next();
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
				this.worldMapData1List.add(var4);
			}
		}

		this.addAllToIconList(var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IIIILav;B)V",
		garbageValue = "92"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label50:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							WorldMapDecoration var12 = var10[var11];
							ObjectComposition var13 = ScriptEvent.getObjectDefinition(var12.objectDefinitionId);
							if (PcmPlayer.method2598(var13)) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label50;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lje;IIILav;B)V",
		garbageValue = "-109"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 4096 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = class194.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = class194.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field3258) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1279150124"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator();

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
			if (var2 instanceof WorldMapIcon_1) {
				((WorldMapIcon_1)var2).init();
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Ljava/util/List;B)V",
		garbageValue = "3"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (class194.WorldMapElement_get(var3.element).field3258 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method550(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1315993718"
	)
	void method528() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator();

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next();
				var2.reset();
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Liw;I)Z",
		garbageValue = "-1635082422"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear();
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.loadGeography(var1);
			if (this.worldMapData_0.isFullyLoaded()) {
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var2 = true;

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) {
				var4 = (WorldMapData_1)var3.next();
				var4.loadGeography(var1);
			}

			if (var2) {
				var3 = this.worldMapData1List.iterator();

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next();
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(ILal;[Lle;Liw;Liw;I)V",
		garbageValue = "-406335289"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			if (Buddy.method5321(this.regionX, this.regionY, var1) == null) {
				boolean var6 = true;
				var6 &= this.loadGeography(var4);
				int var8;
				if (this.worldMapData_0 != null) {
					var8 = this.worldMapData_0.groupId;
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var6 &= var5.tryLoadGroup(var8);
				if (var6) {
					byte[] var7 = var5.takeFileFlat(var8);
					WorldMapSprite var9 = ChatChannel.method2375(var7);
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var10.setRaster();
					if (this.worldMapData_0 != null) {
						this.method533(var2, var3, var9);
					} else {
						this.method534(var2, var3, var9);
					}

					ModeWhere.method3814(var10, this.regionX, this.regionY, this.pixelsPerTile);
					this.method528();
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-134217045"
	)
	void method585(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-33"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = class194.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method540(var1, var2, var3);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Lal;[Lle;Lau;B)V",
		garbageValue = "-28"
	)
	void method533(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method623(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method535(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lal;[Lle;Lau;I)V",
		garbageValue = "1440356366"
	)
	void method534(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method623(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method535(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IILav;Lal;[Lle;I)V",
		garbageValue = "-2045754418"
	)
	void method535(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method630(var1, var2, var3);
		this.method539(var1, var2, var3, var5);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(IILav;Lal;Lau;S)V",
		garbageValue = "-3017"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}

		int var8 = 16711935;
		int var9;
		if (var7 != -1) {
			int var10 = this.backgroundColor;
			FloorOverlayDefinition var11 = PendingSpawn.method1839(var7);
			if (var11 == null) {
				var9 = var10;
			} else if (var11.secondaryRgb >= 0) {
				var9 = var11.secondaryRgb | -16777216;
			} else if (var11.texture >= 0) {
				int var12 = BuddyRankComparator.method3558(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
			} else if (var11.primaryRgb == 16711935) {
				var9 = var10;
			} else {
				int var13 = var11.hue;
				int var14 = var11.saturation;
				int var15 = var11.lightness;
				if (var15 > 179) {
					var14 /= 2;
				}

				if (var15 > 192) {
					var14 /= 2;
				}

				if (var15 > 217) {
					var14 /= 2;
				}

				if (var15 > 243) {
					var14 /= 2;
				}

				int var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10);
				int var17 = BuddyRankComparator.method3558(var16, 96);
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
			}

			var8 = var9;
		}

		if (var7 > -1 && var3.field196[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method538(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method826(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field196[0][var1][var2], var3.field187[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(IILav;Lal;I)V",
		garbageValue = "208983501"
	)
	void method623(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var9 = PendingSpawn.method1839(var6);
				int var7;
				if (var9 == null) {
					var7 = var8;
				} else if (var9.secondaryRgb >= 0) {
					var7 = var9.secondaryRgb | -16777216;
				} else if (var9.texture >= 0) {
					int var10 = BuddyRankComparator.method3558(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
				} else if (var9.primaryRgb == 16711935) {
					var7 = var8;
				} else {
					int var11 = var9.hue;
					int var12 = var9.saturation;
					int var13 = var9.lightness;
					if (var13 > 179) {
						var12 /= 2;
					}

					if (var13 > 192) {
						var12 /= 2;
					}

					if (var13 > 217) {
						var12 /= 2;
					}

					if (var13 > 243) {
						var12 /= 2;
					}

					int var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10);
					int var15 = BuddyRankComparator.method3558(var14, 96);
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
				}

				if (var3.field196[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method826(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field196[var5][var1][var2], var3.field187[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IILav;Lau;I)I",
		garbageValue = "-2000366066"
	)
	int method538(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IILav;[Lle;I)V",
		garbageValue = "2146304456"
	)
	void method539(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					if (GameObject.method3416(var9.decoration) || class7.method108(var9.decoration)) {
						ObjectComposition var10 = ScriptEvent.getObjectDefinition(var9.objectDefinitionId);
						if (var10.mapSceneId != -1) {
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) {
								var4[var10.mapSceneId].method6247(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
							} else {
								var4[var10.mapSceneId].method6247(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(IILav;I)V",
		garbageValue = "-1846642435"
	)
	void method630(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (LoginPacket.method3751(var8.decoration)) {
						ObjectComposition var9 = ScriptEvent.getObjectDefinition(var8.objectDefinitionId);
						int var10 = var9.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field2750.id) {
							this.method554(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field2748.id) {
							this.method554(var1, var2, var8.rotation, -3355444);
							this.method554(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field2754.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2751.id) {
							int var11 = var8.rotation % 2;
							int var12;
							if (var11 == 0) {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10);
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-66"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next();
			Coord var9 = (Coord)var8.getKey();
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6);
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = class194.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method544(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;IIS)V",
		garbageValue = "-19257"
	)
	void method540(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = class194.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(Lij;IIIII)V",
		garbageValue = "1701094485"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false);
		if (var6 != null) {
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
			if (var4 % var5 < var5 / 2) {
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(Lam;IIFB)V",
		garbageValue = "37"
	)
	void method544(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class194.WorldMapElement_get(var1.getElement());
		this.method545(var5, var2, var3);
		this.method599(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Lij;III)V",
		garbageValue = "-1898823455"
	)
	void method545(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method531(var4, var1.horizontalAlignment);
			int var6 = this.method549(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(Lam;Lij;IIFI)V",
		garbageValue = "-937867024"
	)
	void method599(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method277(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3245, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-97"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		Iterator var6 = this.icon0List.iterator();

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next();
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = (int)((float)var1 + var5 * (float)var8);
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
				if (!var3.contains(var7.getElement())) {
					this.method544(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(Llc;Ljy;I)I",
		garbageValue = "2012053105"
	)
	int method531(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 1:
			return 0;
		case 2:
			return -var1.subWidth / 2;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(Llc;Lir;B)I",
		garbageValue = "-1"
	)
	int method549(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 0:
			return 0;
		case 1:
			return -var1.subHeight / 2;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(II)Lai;",
		garbageValue = "-1045904165"
	)
	WorldMapLabel method550(int var1) {
		WorldMapElement var2 = class194.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(Lij;I)Lai;",
		garbageValue = "1905291224"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method273();
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null;
					break;
				}

				WorldMapLabelSize var6 = var4[var5];
				if (var3 == var6.field150) {
					var2 = var6;
					break;
				}

				++var5;
			}

			if (var2 == null) {
				return null;
			} else {
				Font var14 = (Font)this.fonts.get(var2);
				if (var14 == null) {
					return null;
				} else {
					int var15 = var14.lineCount(var1.name, 1000000);
					String[] var7 = new String[var15];
					var14.breakLines(var1.name, (int[])null, var7);
					int var8 = var7.length * var14.ascent / 2;
					int var9 = 0;
					String[] var10 = var7;

					for (int var11 = 0; var11 < var10.length; ++var11) {
						String var12 = var10[var11];
						int var13 = var14.stringWidth(var12);
						if (var13 > var9) {
							var9 = var13;
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-56"
	)
	List method609(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var3 + var2) {
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				}

				var7 = this.icon0List.iterator();

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				}

				return var6;
			} else {
				return var6;
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(B)Ljava/util/List;",
		garbageValue = "89"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-1518831838"
	)
	void method554(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		signature = "([Lht;IIIIIIIII)V",
		garbageValue = "-1261994565"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
					var11 = ++Client.rootWidgetCount - 1;
				} else {
					var11 = var8;
				}

				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if (!var10.isIf3 || !VertexNormal.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						WorldMapID.method664(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							ItemContainer.field572 = var0;
							WorldMapSprite.field256 = var6;
							GrandExchangeOffer.field87 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field859) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field860) {
								var15 = Client.field860;
							}

							if (var15 + var10.width > Client.field860 + Client.clickedWidgetParent.width) {
								var15 = Client.field860 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field861) {
								var16 = Client.field861;
							}

							if (var16 + var10.height > Client.field861 + Client.clickedWidgetParent.height) {
								var16 = Client.field861 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.type == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.width;
						var22 = var13 + var10.height;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (Client.displayFps) {
									var13 += 15;
									WorldMapCacheName.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var42 = Runtime.getRuntime();
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									WorldMapCacheName.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								ItemContainer.drawEntities(var12, var13, var10.width, var10.height);
								Client.field834[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								UserComparator10.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								WorldMapSectionType.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								KeyHandler.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
							}

							if (var10.contentType == 1401) {
								KeyHandler.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && VertexNormal.isComponentHidden(var10) && var10 != GrandExchangeEvent.mousedOverWidgetIf1) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.scrollY > var10.scrollHeight - var10.height) {
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) {
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var30 != null) {
								FriendsChatManager.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}

						if (Client.isResizable || Client.field745[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								WorldMapData_0.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								int var23;
								int var25;
								int var26;
								int var33;
								if (var10.type == 2) {
									var19 = 0;

									for (var20 = 0; var20 < var10.rawHeight; ++var20) {
										for (var21 = 0; var21 < var10.rawWidth; ++var21) {
											var22 = var12 + var21 * (var10.paddingX + 32);
											var23 = var13 + var20 * (var10.paddingY + 32);
											if (var19 < 20) {
												var22 += var10.inventoryXOffsets[var19];
												var23 += var10.inventoryYOffsets[var19];
											}

											if (var10.itemIds[var19] <= 0) {
												if (var10.inventorySprites != null && var19 < 20) {
													SpritePixels var37 = var10.getInventorySprite(var19);
													if (var37 != null) {
														var37.drawTransBgAt(var22, var23);
													} else if (Widget.field2677) {
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
													}
												}
											} else {
												boolean var46 = false;
												boolean var38 = false;
												var26 = var10.itemIds[var19] - 1;
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == GameBuild.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == InvDefinition.selectedItemSlot && var10.id == SpotAnimationDefinition.selectedItemWidget) {
														var35 = SceneTilePaint.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = SceneTilePaint.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
													}

													if (var35 != null) {
														if (var10 == GameBuild.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
															var33 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
															if (var33 < 5 && var33 > -5) {
																var33 = 0;
															}

															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) {
																var33 = 0;
																var25 = 0;
															}

															var35.drawTransAt(var22 + var33, var25 + var23, 128);
															if (var1 != -1) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field743 / 3;
																	if (var29 > Client.field743 * 10) {
																		var29 = Client.field743 * 10;
																	}

																	if (var29 > var28.scrollY) {
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29;
																	Client.draggedWidgetY += var29;
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var28);
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field743 / 3;
																	if (var29 > Client.field743 * 10) {
																		var29 = Client.field743 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29;
																	Client.draggedWidgetY -= var29;
																	GrandExchangeOfferOwnWorldComparator.invalidateWidget(var28);
																}
															}
														} else if (var10 == MouseHandler.field525 && var19 == Client.field788) {
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23);
														}
													} else {
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
													}
												}
											}

											++var19;
										}
									}
								} else if (var10.type == 3) {
									if (BufferedNetSocket.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field3897) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
									}
								} else {
									Font var39;
									if (var10.type == 4) {
										var39 = var10.getFont();
										if (var39 == null) {
											if (Widget.field2677) {
												GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
											}
										} else {
											String var43 = var10.text;
											if (BufferedNetSocket.runCs1(var10)) {
												var20 = var10.color2;
												if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) {
													var43 = var10.text2;
												}
											} else {
												var20 = var10.color;
												if (var10 == GrandExchangeEvent.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) {
												ItemComposition var45 = AbstractWorldMapData.ItemDefinition_get(var10.itemId);
												var43 = var45.name;
												if (var43 == null) {
													var43 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
													var43 = Client.colorStartTag(16748608) + var43 + "</col>" + " " + 'x' + InterfaceParent.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) {
												var43 = "Please wait...";
												var20 = var10.color;
											}

											if (!var10.isIf3) {
												var43 = class2.method39(var43, var10);
											}

											var39.drawLines(var43, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
										}
									} else if (var10.type == 5) {
										SpritePixels var40;
										if (!var10.isIf3) {
											var40 = var10.getSprite(BufferedNetSocket.runCs1(var10));
											if (var40 != null) {
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2677) {
												GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var40 = SceneTilePaint.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false);
											}

											if (var40 == null) {
												if (Widget.field2677) {
													GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width;
												var21 = var40.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var40.method6299(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var40.drawTransBgAt(var12, var13);
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var33 = 0; var33 < var22; ++var33) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var40.method6299(var20 / 2 + var12 + var20 * var33, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var40.drawTransAt(var12 + var20 * var33, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var33, var13 + var21 * var25);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemComposition var34;
										if (var10.type == 6) {
											boolean var36 = BufferedNetSocket.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var41 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												var34 = AbstractWorldMapData.ItemDefinition_get(var10.itemId);
												if (var34 != null) {
													var34 = var34.getCountObj(var10.itemQuantity);
													var41 = var34.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height / 2;
													} else {
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = PlayerType.localPlayer.getModel();
												}
											} else if (var20 == -1) {
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, PlayerType.localPlayer.appearance);
												if (var41 == null && Widget.field2677) {
													GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class105.SequenceDefinition_get(var20);
												var41 = var10.getModel(var47, var10.modelFrame, var36, PlayerType.localPlayer.appearance);
												if (var41 == null && Widget.field2677) {
													GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3174(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var33 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method3064(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var33);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method3025(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var33 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method3064(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var33 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type == 7) {
												var39 = var10.getFont();
												if (var39 == null) {
													if (Widget.field2677) {
														GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0;

												for (var21 = 0; var21 < var10.rawHeight; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var34 = AbstractWorldMapData.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var24;
															if (var34.isStackable != 1 && var10.itemQuantities[var20] == 1) {
																var24 = Client.colorStartTag(16748608) + var34.name + "</col>";
															} else {
																var24 = Client.colorStartTag(16748608) + var34.name + "</col>" + " " + 'x' + InterfaceParent.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115);
															var26 = var21 * (var10.paddingY + 12) + var13;
															if (var10.textXAlignment == 0) {
																var39.draw(var24, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) {
																var39.drawCentered(var24, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var24, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
															}
														}

														++var20;
													}
												}
											}

											if (var10.type == 8 && var10 == GrandExchangeOfferOwnWorldComparator.field677 && Client.field833 == Client.field832) {
												var19 = 0;
												var20 = 0;
												Font var31 = WorldMapCacheName.fontPlain12;
												String var32 = var10.text;

												String var44;
												for (var32 = class2.method39(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
													var33 = var32.indexOf("<br>");
													if (var33 != -1) {
														var44 = var32.substring(0, var33);
														var32 = var32.substring(var33 + 4);
													} else {
														var44 = var32;
														var32 = "";
													}

													var25 = var31.stringWidth(var44);
													if (var25 > var19) {
														var19 = var25;
													}
												}

												var19 += 6;
												var20 += 7;
												var33 = var12 + var10.width - 5 - var19;
												var25 = var13 + var10.height + 5;
												if (var33 < var12 + 5) {
													var33 = var12 + 5;
												}

												if (var33 + var19 > var4) {
													var33 = var4 - var19;
												}

												if (var25 + var20 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var33, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var33, var25, var19, var20, 0);
												var32 = var10.text;
												var26 = var25 + var31.ascent + 2;

												for (var32 = class2.method39(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
													int var27 = var32.indexOf("<br>");
													if (var27 != -1) {
														var44 = var32.substring(0, var27);
														var32 = var32.substring(var27 + 4);
													} else {
														var44 = var32;
														var32 = "";
													}

													var31.draw(var44, var33 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field2627) {
													var19 = var12;
													var20 = var13 + var10.height;
													var21 = var12 + var10.width;
													var22 = var13;
												} else {
													var19 = var12;
													var20 = var13;
													var21 = var12 + var10.width;
													var22 = var13 + var10.height;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
												} else {
													class300.method5419(var19, var20, var21, var22, var10.color, var10.lineWid);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
