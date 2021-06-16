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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fn")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -91763405
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1756122927
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("h")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -314457837
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 605397793
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("b")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("i")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("k")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1948817139"
	)
	void method3407(int var1, int var2, int var3) {
		int var5 = this.regionX;
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(GameEngine.method716(var5, var6, var7));
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lfo;Ljava/util/List;I)V",
		garbageValue = "-2121590512"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "2112928302"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIILfy;I)V",
		garbageValue = "831467254"
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
								var13 = Tiles.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = Tiles.getObjectDefinition(var17);
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lez;IIILfy;B)V",
		garbageValue = "111"
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
			var9 = Archive.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = Archive.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1569) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-95285337"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "631658105"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (Archive.WorldMapElement_get(var3.element).field1569 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method3435(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1612272147"
	)
	void method3414() {
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljp;B)Z",
		garbageValue = "37"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILgs;[Lof;Ljp;Ljp;B)V",
		garbageValue = "-40"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var7 = this.regionX;
			int var8 = this.regionY;
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(GameEngine.method716(var7, var8, var1));
			if (var6 == null) {
				boolean var9 = true;
				var9 &= this.loadGeography(var4);
				int var11;
				if (this.worldMapData_0 != null) {
					var11 = this.worldMapData_0.groupId;
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var9 &= var5.tryLoadGroup(var11);
				if (var9) {
					byte[] var10 = var5.takeFileFlat(var11);
					WorldMapSprite var12;
					if (var10 == null) {
						var12 = new WorldMapSprite();
					} else {
						var12 = new WorldMapSprite(class125.convertJpgToSprite(var10).pixels);
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var14.setRaster();
					if (this.worldMapData_0 != null) {
						this.method3419(var2, var3, var12);
					} else {
						this.method3420(var2, var3, var12);
					}

					int var15 = this.regionX;
					int var16 = this.regionY;
					int var17 = this.pixelsPerTile;
					WorldMapRegion_cachedSprites.put(var14, GameEngine.method716(var15, var16, var17), var14.pixels.length * 4);
					this.method3414();
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "92"
	)
	void method3417(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1184159068"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = Archive.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method3488(var1, var2, var3);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lgs;[Lof;Lfk;B)V",
		garbageValue = "0"
	)
	void method3419(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method3423(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method3421(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgs;[Lof;Lfk;B)V",
		garbageValue = "39"
	)
	void method3420(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method3423(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method3421(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lgs;[Lof;B)V",
		garbageValue = "56"
	)
	void method3421(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method3426(var1, var2, var3);
		this.method3425(var1, var2, var3, var5);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lgs;Lfk;I)V",
		garbageValue = "1645371529"
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
			FloorOverlayDefinition var11 = WorldMapSectionType.method3677(var7);
			if (var11 == null) {
				var9 = var10;
			} else if (var11.secondaryRgb >= 0) {
				var9 = var11.secondaryRgb | -16777216;
			} else {
				int var12;
				if (var11.texture >= 0) {
					var12 = WorldMapID.method3718(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
				} else if (var11.primaryRgb == 16711935) {
					var9 = var10;
				} else {
					var12 = ClientPreferences.method2330(var11.hue, var11.saturation, var11.lightness);
					int var13 = WorldMapID.method3718(var12, 96);
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216;
				}
			}

			var8 = var9;
		}

		if (var7 > -1 && var3.field2068[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method3424(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method3819(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2068[0][var1][var2], var3.field2074[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lgs;B)V",
		garbageValue = "1"
	)
	void method3423(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var9 = WorldMapSectionType.method3677(var6);
				int var7;
				if (var9 == null) {
					var7 = var8;
				} else if (var9.secondaryRgb >= 0) {
					var7 = var9.secondaryRgb | -16777216;
				} else {
					int var10;
					if (var9.texture >= 0) {
						var10 = WorldMapID.method3718(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
					} else if (var9.primaryRgb == 16711935) {
						var7 = var8;
					} else {
						var10 = ClientPreferences.method2330(var9.hue, var9.saturation, var9.lightness);
						int var11 = WorldMapID.method3718(var10, 96);
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216;
					}
				}

				if (var3.field2068[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method3819(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2068[var5][var1][var2], var3.field2074[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IILfy;Lfk;B)I",
		garbageValue = "37"
	)
	int method3424(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILfy;[Lof;I)V",
		garbageValue = "-1994135211"
	)
	void method3425(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field3154.id && var11 <= WorldMapDecorationType.field3167.id;
					if (var10 || class32.method384(var9.decoration)) {
						ObjectComposition var12 = Tiles.getObjectDefinition(var9.objectDefinitionId);
						if (var12.mapSceneId != -1) {
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) {
								var4[var12.mapSceneId].method6997(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
							} else {
								var4[var12.mapSceneId].method6997(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILfy;B)V",
		garbageValue = "22"
	)
	void method3426(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (Login.method2058(var8.decoration)) {
						ObjectComposition var9 = Tiles.getObjectDefinition(var8.objectDefinitionId);
						int var10 = var9.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field3160.id) {
							this.method3439(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field3148.id) {
							this.method3439(var1, var2, var8.rotation, -3355444);
							this.method3439(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field3170.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3150.id) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-34"
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
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = Archive.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method3429(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-466157918"
	)
	void method3488(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = Archive.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lek;IIIII)V",
		garbageValue = "-380618886"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgh;IIFB)V",
		garbageValue = "41"
	)
	void method3429(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = Archive.WorldMapElement_get(var1.getElement());
		this.method3477(var5, var2, var3);
		this.method3431(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lek;III)V",
		garbageValue = "2103112249"
	)
	void method3477(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method3433(var4, var1.horizontalAlignment);
			int var6 = this.method3409(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgh;Lek;IIFI)V",
		garbageValue = "-796895701"
	)
	void method3431(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method3278(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1563, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-281265080"
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
				var7.screenX = (int)((float)var1 + (float)var8 * var5);
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5);
				if (!var3.contains(var7.getElement())) {
					this.method3429(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Loa;Leq;I)I",
		garbageValue = "2137509015"
	)
	int method3433(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 1:
			return 0;
		case 2:
			return -var1.subWidth / 2;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Loa;Lee;I)I",
		garbageValue = "-128811790"
	)
	int method3409(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subHeight / 2;
		case 2:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfd;",
		garbageValue = "1"
	)
	WorldMapLabel method3435(int var1) {
		WorldMapElement var2 = Archive.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Lfd;",
		garbageValue = "282116482"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method3281(var1.textSize);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "0"
	)
	List method3437(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-1092434212"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-767493128"
	)
	void method3439(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1078417152"
	)
	static int method3472(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1896402361"
	)
	static final void method3519(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method49()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketWriter var3 = Client.packetWriter;
					PacketBufferNode var4 = InterfaceParent.getPacketBufferNode(ClientPacket.field2584, var3.isaacCipher);
					var4.packetBuffer.writeByte(3 + class44.stringCp1252NullTerminatedByteSize(var2.name));
					var4.packetBuffer.writeByte(var0);
					var4.packetBuffer.writeShort(var1);
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.name);
					var3.addNode(var4);
				}
			}
		}
	}
}
