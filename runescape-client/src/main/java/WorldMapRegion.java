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

@ObfuscatedName("fm")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 450419663
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1693190573
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("b")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -384570115
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1826350773
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("x")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("k")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("r")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-923028723"
	)
	void method3271(int var1, int var2, int var3) {
		int var5 = this.regionX;
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		DemotingHashTable var8 = WorldMapRegion_cachedSprites;
		long var9 = (long)(var7 << 16 | var5 << 8 | var6);
		SpritePixels var4 = (SpritePixels)var8.get(var9);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lfh;Ljava/util/List;I)V",
		garbageValue = "-1532393491"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "55"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIILfw;B)V",
		garbageValue = "-114"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label49:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							WorldMapDecoration var12 = var10[var11];
							ObjectComposition var13 = AttackOption.getObjectDefinition(var12.objectDefinitionId);
							if (class13.method204(var13)) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label49;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIILfw;B)V",
		garbageValue = "1"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = WorldMapAreaData.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = WorldMapAreaData.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1557) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1777749852"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1899161773"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (WorldMapAreaData.WorldMapElement_get(var3.element).field1557 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method3283(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1381206848"
	)
	void method3361() {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)Z",
		garbageValue = "1351055595"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILgp;[Lof;Ljp;Ljp;I)V",
		garbageValue = "-1222887351"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var7 = this.regionX;
			int var8 = this.regionY;
			DemotingHashTable var9 = WorldMapRegion_cachedSprites;
			long var10 = (long)(var1 << 16 | var7 << 8 | var8);
			SpritePixels var6 = (SpritePixels)var9.get(var10);
			if (var6 == null) {
				boolean var14 = true;
				var14 &= this.loadGeography(var4);
				int var11;
				if (this.worldMapData_0 != null) {
					var11 = this.worldMapData_0.groupId;
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var14 &= var5.tryLoadGroup(var11);
				if (var14) {
					byte[] var15 = var5.takeFileFlat(var11);
					WorldMapSprite var12 = WorldMapSectionType.method3540(var15);
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var13.setRaster();
					if (this.worldMapData_0 != null) {
						this.method3284(var2, var3, var12);
					} else {
						this.method3285(var2, var3, var12);
					}

					FloorOverlayDefinition.method3052(var13, this.regionX, this.regionY, this.pixelsPerTile);
					this.method3361();
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "2047114965"
	)
	void method3282(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1306417176"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = WorldMapAreaData.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method3293(var1, var2, var3);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgp;[Lof;Lfu;I)V",
		garbageValue = "1457996080"
	)
	void method3284(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method3356(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method3286(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lgp;[Lof;Lfu;B)V",
		garbageValue = "43"
	)
	void method3285(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method3356(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method3286(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lgp;[Lof;B)V",
		garbageValue = "16"
	)
	void method3286(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method3291(var1, var2, var3);
		this.method3288(var1, var2, var3, var5);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lgp;Lfu;B)V",
		garbageValue = "9"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}

		int var8 = 16711935;
		if (var7 != -1) {
			var8 = ReflectionCheck.method1158(var7, this.backgroundColor);
		}

		if (var7 > -1 && var3.field2063[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method3289(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method3676(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2063[0][var1][var2], var3.field2064[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lgp;I)V",
		garbageValue = "-988381059"
	)
	void method3356(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = ReflectionCheck.method1158(var6, this.backgroundColor);
				if (var3.field2063[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method3676(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2063[var5][var1][var2], var3.field2064[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lfu;I)I",
		garbageValue = "-947933969"
	)
	int method3289(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILfw;[Lof;I)V",
		garbageValue = "2119156323"
	)
	void method3288(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field3165.id && var11 <= WorldMapDecorationType.field3151.id;
					if (var10 || method3399(var9.decoration)) {
						ObjectComposition var12 = AttackOption.getObjectDefinition(var9.objectDefinitionId);
						if (var12.mapSceneId != -1) {
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) {
								var4[var12.mapSceneId].method6846(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
							} else {
								var4[var12.mapSceneId].method6846(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILfw;I)V",
		garbageValue = "994519782"
	)
	void method3291(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (WorldMapRectangle.method3569(var8.decoration)) {
						ObjectComposition var9 = AttackOption.getObjectDefinition(var8.objectDefinitionId);
						int var10 = var9.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field3159.id) {
							this.method3305(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field3164.id) {
							this.method3305(var1, var2, var8.rotation, -3355444);
							this.method3305(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field3148.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.method6762(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method6762(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.method6762(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.method6762(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3162.id) {
							int var11 = var8.rotation % 2;
							int var12;
							if (var11 == 0) {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.method6762(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10);
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.method6762(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1579381896"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next();
			Coord var9 = (Coord)var8.getKey();
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6);
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = WorldMapAreaData.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method3295(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIS)V",
		garbageValue = "-3432"
	)
	void method3293(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = WorldMapAreaData.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Let;IIIII)V",
		garbageValue = "-1558532242"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgw;IIFI)V",
		garbageValue = "-615214658"
	)
	void method3295(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = WorldMapAreaData.WorldMapElement_get(var1.getElement());
		this.method3296(var5, var2, var3);
		this.method3297(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Let;IIB)V",
		garbageValue = "-27"
	)
	void method3296(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method3299(var4, var1.horizontalAlignment);
			int var6 = this.method3384(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgw;Let;IIFS)V",
		garbageValue = "-25727"
	)
	void method3297(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method3154(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1570, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1464580667"
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
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5);
				if (!var3.contains(var7.getElement())) {
					this.method3295(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Low;Leg;I)I",
		garbageValue = "866674988"
	)
	int method3299(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 0:
			return 0;
		case 1:
			return -var1.subWidth / 2;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Low;Lex;I)I",
		garbageValue = "-387662899"
	)
	int method3384(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subHeight / 2;
		case 1:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "1828067299"
	)
	WorldMapLabel method3283(int var1) {
		WorldMapElement var2 = WorldMapAreaData.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Let;I)Lfl;",
		garbageValue = "2136255067"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method3162(var1.textSize);
			if (var2 == null) {
				return null;
			} else {
				Font var3 = (Font)this.fonts.get(var2);
				if (var3 == null) {
					return null;
				} else {
					int var4 = var3.lineCount(var1.name, 1000000);
					String[] var5 = new String[var4];
					var3.breakLines(var1.name, (int[])null, var5);
					int var6 = var5.length * var3.ascent / 2;
					int var7 = 0;
					String[] var8 = var5;

					for (int var9 = 0; var9 < var8.length; ++var9) {
						String var10 = var8[var9];
						int var11 = var3.stringWidth(var10);
						if (var11 > var7) {
							var7 = var11;
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-79"
	)
	List method3303(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "0"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-74"
	)
	void method3305(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.method6764(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.method6762(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.method6764(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method6762(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lll;",
		garbageValue = "-1392612014"
	)
	static PrivateChatMode[] method3351() {
		return new PrivateChatMode[]{PrivateChatMode.field3901, PrivateChatMode.field3899, PrivateChatMode.field3900};
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1838028405"
	)
	public static void method3397(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var8 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "4"
	)
	public static boolean method3399(int var0) {
		return var0 == WorldMapDecorationType.field3167.id;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "680595351"
	)
	static void method3317(int var0, int var1) {
		int var2 = WorldMapArea.fontBold12.stringWidth("Choose Option");

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			Font var7 = WorldMapArea.fontBold12;
			String var8;
			if (var3 < 0) {
				var8 = "";
			} else if (Client.menuTargets[var3].length() > 0) {
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3];
			}

			int var6 = var7.stringWidth(var8);
			if (var6 > var2) {
				var2 = var6;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		int var4 = var0 - var2 / 2;
		if (var4 + var2 > GameEngine.canvasWidth) {
			var4 = GameEngine.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var1 + var3 > HealthBarDefinition.canvasHeight) {
			var5 = HealthBarDefinition.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		AbstractByteArrayCopier.menuX = var4;
		HitSplatDefinition.menuY = var5;
		SoundCache.menuWidth = var2;
		GrandExchangeOfferOwnWorldComparator.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
