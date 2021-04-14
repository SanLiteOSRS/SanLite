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

@ObfuscatedName("ew")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgo;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -945646571
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 557518487
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lem;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("h")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1255950001
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -465902583
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("m")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("d")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("c")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-1387360033"
	)
	void method2805(int var1, int var2, int var3) {
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
		signature = "(Lem;Ljava/util/List;I)V",
		garbageValue = "180621664"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "1703141389"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIIILee;I)V",
		garbageValue = "2023835510"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label74:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label65: {
								WorldMapDecoration var12 = var10[var11];
								var13 = class19.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = class19.getObjectDefinition(var17);
										if (var18.mapIconId != -1) {
											var14 = true;
											break label65;
										}
									}
								} else if (var13.mapIconId != -1) {
									var14 = true;
									break label65;
								}

								var14 = false;
							}

							if (var14) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label74;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkj;IIILee;I)V",
		garbageValue = "1552882899"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = ByteArrayPool.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = ByteArrayPool.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field3411) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-559628958"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/util/List;B)V",
		garbageValue = "89"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (ByteArrayPool.WorldMapElement_get(var3.element).field3411 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method2834(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-896441711"
	)
	void method2812() {
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lir;B)Z",
		garbageValue = "0"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(ILfw;[Low;Lir;Lir;I)V",
		garbageValue = "-1670034680"
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
				boolean var22 = true;
				var22 &= this.loadGeography(var4);
				int var11;
				if (this.worldMapData_0 != null) {
					var11 = this.worldMapData_0.groupId;
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var22 &= var5.tryLoadGroup(var11);
				if (var22) {
					byte[] var23 = var5.takeFileFlat(var11);
					WorldMapSprite var12;
					if (var23 == null) {
						var12 = new WorldMapSprite();
					} else {
						var12 = new WorldMapSprite(WorldMapDecorationType.convertJpgToSprite(var23).pixels);
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var14.setRaster();
					if (this.worldMapData_0 != null) {
						this.method2817(var2, var3, var12);
					} else {
						this.method2858(var2, var3, var12);
					}

					int var15 = this.regionX;
					int var16 = this.regionY;
					int var17 = this.pixelsPerTile;
					DemotingHashTable var18 = WorldMapRegion_cachedSprites;
					long var20 = (long)(var17 << 16 | var15 << 8 | var16);
					var18.put(var14, var20, var14.pixels.length * 4);
					this.method2812();
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-2125781425"
	)
	void method2815(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-114"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = ByteArrayPool.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method2855(var1, var2, var3);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lfw;[Low;Lea;B)V",
		garbageValue = "-4"
	)
	void method2817(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method2827(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method2819(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Lfw;[Low;Lea;I)V",
		garbageValue = "1276390377"
	)
	void method2858(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method2827(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method2819(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IILee;Lfw;[Low;B)V",
		garbageValue = "0"
	)
	void method2819(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method2824(var1, var2, var3);
		this.method2823(var1, var2, var3, var5);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(IILee;Lfw;Lea;B)V",
		garbageValue = "0"
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
			var8 = class10.method136(var7, this.backgroundColor);
		}

		if (var7 > -1 && var3.field1690[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method2822(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method3223(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field1690[0][var1][var2], var3.field1700[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IILee;Lfw;I)V",
		garbageValue = "-1595724187"
	)
	void method2827(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = class10.method136(var6, this.backgroundColor);
				if (var3.field1690[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method3223(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field1690[var5][var1][var2], var3.field1700[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IILee;Lea;I)I",
		garbageValue = "-1683449387"
	)
	int method2822(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(IILee;[Low;I)V",
		garbageValue = "164067153"
	)
	void method2823(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					if (WorldMapSectionType.method3066(var9.decoration) || class244.method4402(var9.decoration)) {
						ObjectComposition var10 = class19.getObjectDefinition(var9.objectDefinitionId);
						if (var10.mapSceneId != -1) {
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) {
								var4[var10.mapSceneId].method6951(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
							} else {
								var4[var10.mapSceneId].method6951(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IILee;I)V",
		garbageValue = "-1141468534"
	)
	void method2824(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = var10 >= WorldMapDecorationType.field2820.id && var10 <= WorldMapDecorationType.field2817.id || var10 == WorldMapDecorationType.field2818.id;
					if (var9) {
						ObjectComposition var11 = class19.getObjectDefinition(var8.objectDefinitionId);
						int var12 = var11.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field2820.id) {
							this.method2838(var1, var2, var8.rotation, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field2816.id) {
							this.method2838(var1, var2, var8.rotation, -3355444);
							this.method2838(var1, var2, var8.rotation + 1, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field2817.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2818.id) {
							int var13 = var8.rotation % 2;
							int var14;
							if (var13 == 0) {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12);
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IILjava/util/HashSet;IB)V",
		garbageValue = "25"
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
				WorldMapElement var13 = ByteArrayPool.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method2828(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;III)V",
		garbageValue = "1107537620"
	)
	void method2855(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = ByteArrayPool.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Ljy;IIIII)V",
		garbageValue = "-2097553050"
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
		signature = "(Lfg;IIFI)V",
		garbageValue = "1220317543"
	)
	void method2828(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = ByteArrayPool.WorldMapElement_get(var1.getElement());
		this.method2887(var5, var2, var3);
		this.method2830(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Ljy;III)V",
		garbageValue = "2016144673"
	)
	void method2887(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method2832(var4, var1.horizontalAlignment);
			int var6 = this.method2833(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Lfg;Ljy;IIFI)V",
		garbageValue = "-1614908131"
	)
	void method2830(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method2671(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3417, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1979423677"
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
				var7.screenX = (int)(var5 * (float)var8 + (float)var1);
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
				if (!var3.contains(var7.getElement())) {
					this.method2828(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(Loh;Ljd;I)I",
		garbageValue = "-2143469237"
	)
	int method2832(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 0:
			return 0;
		case 1:
			return -var1.subWidth / 2;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(Loh;Lkf;B)I",
		garbageValue = "-70"
	)
	int method2833(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subHeight / 2;
		case 1:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(IB)Lfi;",
		garbageValue = "1"
	)
	WorldMapLabel method2834(int var1) {
		WorldMapElement var2 = ByteArrayPool.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(Ljy;B)Lfi;",
		garbageValue = "2"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method2670(var1.textSize);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-84"
	)
	List method2895(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(I)Ljava/util/List;",
		garbageValue = "-221640680"
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
		garbageValue = "-2020684426"
	)
	void method2838(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1279999644"
	)
	public static void method2929(int var0) {
		if (var0 != -1) {
			if (class69.Widget_loadedInterfaces[var0]) {
				FloorDecoration.Widget_archive.clearFilesGroup(var0);
				if (Widget.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
						if (Widget.Widget_interfaceComponents[var0][var2] != null) {
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null;
					}

					class69.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
