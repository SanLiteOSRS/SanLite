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

@ObfuscatedName("al")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lfp;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("u")
	static String field277;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1185290071
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1059284245
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Ll;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("g")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1881987389
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1196076883
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("d")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("h")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("a")
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-1575156019"
	)
	void method505(int var1, int var2, int var3) {
		int var5 = this.regionX;
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(MenuAction.method2139(var5, var6, var7));
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ll;Ljava/util/List;I)V",
		garbageValue = "-1730892204"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "1"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIIILan;I)V",
		garbageValue = "121581751"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label73:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label64: {
								WorldMapDecoration var12 = var10[var11];
								var13 = MidiPcmStream.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = MidiPcmStream.getObjectDefinition(var17);
										if (var18.mapIconId != -1) {
											var14 = true;
											break label64;
										}
									}
								} else if (var13.mapIconId != -1) {
									var14 = true;
									break label64;
								}

								var14 = false;
							}

							if (var14) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label73;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljg;IIILan;I)V",
		garbageValue = "329414981"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 4096 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8);
		}

		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			WorldMapElement var9 = WorldMapSection0.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		this.iconMap.put(new Coord(0, var3, var4), var10);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1946946990"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/util/List;I)V",
		garbageValue = "-2052830022"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method529(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "478350201"
	)
	void method507() {
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lic;B)Z",
		garbageValue = "-62"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(ILaf;[Lls;Lic;Lic;B)V",
		garbageValue = "-79"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var7 = this.regionX;
			int var8 = this.regionY;
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(MenuAction.method2139(var7, var8, var1));
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
					WorldMapSprite var12 = class39.method613(var10);
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var13.setRaster();
					if (this.worldMapData_0 != null) {
						this.method553(var2, var3, var12);
					} else {
						this.method502(var2, var3, var12);
					}

					AbstractWorldMapData.method353(var13, this.regionX, this.regionY, this.pixelsPerTile);
					this.method507();
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(IIILjava/util/HashSet;I)V",
		garbageValue = "1940218585"
	)
	void method569(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;III)V",
		garbageValue = "2015143479"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = WorldMapSection0.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method521(var1, var2, var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Laf;[Lls;Lat;I)V",
		garbageValue = "-1361448318"
	)
	void method553(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method499(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method545(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Laf;[Lls;Lat;B)V",
		garbageValue = "-121"
	)
	void method502(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method499(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method545(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(IILan;Laf;[Lls;I)V",
		garbageValue = "553934135"
	)
	void method545(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method519(var1, var2, var3);
		this.method533(var1, var2, var3, var5);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IILan;Laf;Lat;I)V",
		garbageValue = "-1873495133"
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
			FloorOverlayDefinition var11 = SoundSystem.method2594(var7);
			if (var11 == null) {
				var9 = var10;
			} else if (var11.secondaryRgb >= 0) {
				var9 = var11.secondaryRgb | -16777216;
			} else if (var11.texture >= 0) {
				int var12 = GrandExchangeOfferTotalQuantityComparator.method172(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
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
				int var17 = GrandExchangeOfferTotalQuantityComparator.method172(var16, 96);
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
			}

			var8 = var9;
		}

		if (var7 > -1 && var3.field198[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method517(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method802(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field198[0][var1][var2], var3.field191[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IILan;Laf;I)V",
		garbageValue = "-100065860"
	)
	void method499(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var9 = SoundSystem.method2594(var6);
				int var7;
				if (var9 == null) {
					var7 = var8;
				} else if (var9.secondaryRgb >= 0) {
					var7 = var9.secondaryRgb | -16777216;
				} else if (var9.texture >= 0) {
					int var10 = GrandExchangeOfferTotalQuantityComparator.method172(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
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
					int var15 = GrandExchangeOfferTotalQuantityComparator.method172(var14, 96);
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
				}

				if (var3.field198[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method802(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field198[var5][var1][var2], var3.field191[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IILan;Lat;I)I",
		garbageValue = "1234221167"
	)
	int method517(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IILan;[Lls;B)V",
		garbageValue = "-109"
	)
	void method533(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field2777.id && var11 <= WorldMapDecorationType.field2778.id;
					if (!var10) {
						int var13 = var9.decoration;
						boolean var12 = var13 == WorldMapDecorationType.field2779.id;
						if (!var12) {
							continue;
						}
					}

					ObjectComposition var14 = MidiPcmStream.getObjectDefinition(var9.objectDefinitionId);
					if (var14.mapSceneId != -1) {
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) {
							var4[var14.mapSceneId].method6217(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						} else {
							var4[var14.mapSceneId].method6217(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(IILan;B)V",
		garbageValue = "-118"
	)
	void method519(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (TextureProvider.method2876(var8.decoration)) {
						ObjectComposition var9 = MidiPcmStream.getObjectDefinition(var8.objectDefinitionId);
						int var10 = var9.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field2760.id) {
							this.method585(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field2763.id) {
							this.method585(var1, var2, var8.rotation, -3355444);
							this.method585(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field2757.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field2761.id) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(IILjava/util/HashSet;II)V",
		garbageValue = "-473063416"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next();
			Coord var9 = (Coord)var8.getKey();
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6);
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = WorldMapSection0.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method523(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1020675379"
	)
	void method521(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = WorldMapSection0.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(Liv;IIIII)V",
		garbageValue = "-1177603152"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(Laz;IIFI)V",
		garbageValue = "-1943029754"
	)
	void method523(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = WorldMapSection0.WorldMapElement_get(var1.getElement());
		this.method524(var5, var2, var3);
		this.method567(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(Liv;III)V",
		garbageValue = "1650240142"
	)
	void method524(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method527(var4, var1.horizontalAlignment);
			int var6 = this.method528(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(Laz;Liv;IIFB)V",
		garbageValue = "-60"
	)
	void method567(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method274(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3243, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1868522380"
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
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2);
				if (!var3.contains(var7.getElement())) {
					this.method523(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Llp;Lju;I)I",
		garbageValue = "-249160527"
	)
	int method527(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subWidth / 2;
		case 1:
			return 0;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(Llp;Lit;I)I",
		garbageValue = "-74495504"
	)
	int method528(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subHeight / 2;
		case 1:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(II)Laq;",
		garbageValue = "-576832449"
	)
	WorldMapLabel method529(int var1) {
		WorldMapElement var2 = WorldMapSection0.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(Liv;I)Laq;",
		garbageValue = "-1919467673"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method270(var1.textSize);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(IIIIII)Ljava/util/List;",
		garbageValue = "-2065951782"
	)
	List method531(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(I)Ljava/util/List;",
		garbageValue = "-715702618"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-301130878"
	)
	void method585(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)Ljm;",
		garbageValue = "-91"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lic;IIB)Lls;",
		garbageValue = "20"
	)
	static IndexedSprite method611(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			Occluder.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : InvDefinition.method4448();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IIIZIZI)V",
		garbageValue = "783564244"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = AbstractByteArrayCopier.World_worlds[var6];
			AbstractByteArrayCopier.World_worlds[var6] = AbstractByteArrayCopier.World_worlds[var1];
			AbstractByteArrayCopier.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (ModelData0.method3376(AbstractByteArrayCopier.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = AbstractByteArrayCopier.World_worlds[var9];
					AbstractByteArrayCopier.World_worlds[var9] = AbstractByteArrayCopier.World_worlds[var7];
					AbstractByteArrayCopier.World_worlds[var7++] = var10;
				}
			}

			AbstractByteArrayCopier.World_worlds[var1] = AbstractByteArrayCopier.World_worlds[var7];
			AbstractByteArrayCopier.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1201601061"
	)
	static final void method609(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		WorldMapRectangle.addGameMessage(30, "", var1);
	}
}
