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

@ObfuscatedName("jt")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 167112865
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1293918551
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ae")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -134391751
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2013516897
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("an")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ad")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ax")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 50
		this.regionY = var2; // L: 51
		this.worldMapData1List = new LinkedList(); // L: 52
		this.icon0List = new LinkedList(); // L: 53
		this.iconMap = new HashMap(); // L: 54
		this.backgroundColor = var3 | -16777216; // L: 55
		this.fonts = var4; // L: 56
	} // L: 57

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-5025"
	)
	void method4730(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 61
		int var6 = this.regionY; // L: 62
		int var7 = this.pixelsPerTile; // L: 63
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(SoundSystem.method870(var5, var6, var7)); // L: 65
		if (var4 != null) { // L: 68
			if (var3 == this.pixelsPerTile * 64) { // L: 69
				var4.drawAt(var1, var2); // L: 70
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 73
			}

		}
	} // L: 75

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljava/util/List;I)V",
		garbageValue = "-1586624663"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 78
		this.worldMapData_0 = var1; // L: 79
		this.addAllToIconList(var2); // L: 80
	} // L: 81

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-673677418"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 84
		Iterator var3 = var1.iterator(); // L: 85

		while (var3.hasNext()) { // L: 92
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 86
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 88
				this.worldMapData1List.add(var4); // L: 89
			}
		}

		this.addAllToIconList(var2); // L: 93
	} // L: 94

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIILjw;B)V",
		garbageValue = "103"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 97
			label50:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 98
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 99
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 100
					if (var9 != null && var9.length != 0) { // L: 101
						WorldMapDecoration[] var10 = var9; // L: 105

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 106
							WorldMapDecoration var12 = var10[var11]; // L: 107
							ObjectComposition var13 = class137.getObjectDefinition(var12.objectDefinitionId); // L: 109
							if (class152.method3324(var13)) { // L: 110
								this.getIcon(var13, var8, var6, var7, var5); // L: 113
								continue label50;
							}
						}
					}
				}
			}
		}

	} // L: 121

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIILjw;I)V",
		garbageValue = "2112550046"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 124
		Coord var7 = null; // L: 125
		if (this.worldMapData_0 != null) { // L: 126
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4); // L: 127
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 4096 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = class423.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 139
		}

		var9 = class423.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1848) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1939196071"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "-77"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (class423.WorldMapElement_get(var3.element).field1848 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 162
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4758(var3.element)); // L: 166
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-815398361"
	)
	void method4748() {
		if (this.worldMapData_0 != null) { // L: 174
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 178

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 179
				var2.reset();
			}
		}

	} // L: 185

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Low;I)Z",
		garbageValue = "-359314357"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 188
		if (this.worldMapData_0 != null) { // L: 189
			this.worldMapData_0.loadGeography(var1);
			if (this.worldMapData_0.isFullyLoaded()) {
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 192
				return true; // L: 193
			} else {
				return false;
			}
		} else {
			boolean var2 = true; // L: 198

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 203
				var4 = (WorldMapData_1)var3.next();
				var4.loadGeography(var1); // L: 202
			}

			if (var2) {
				var3 = this.worldMapData1List.iterator(); // L: 207

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 208
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILki;[Lut;Low;Low;I)V",
		garbageValue = "-1103158966"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var7 = this.regionX; // L: 224
			int var8 = this.regionY;
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(SoundSystem.method870(var7, var8, var1));
			if (var6 == null) { // L: 229
				boolean var9 = true;
				var9 &= this.loadGeography(var4); // L: 233
				int var11;
				if (this.worldMapData_0 != null) {
					var11 = this.worldMapData_0.groupId;
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var9 &= var5.tryLoadGroup(var11);
				if (var9) { // L: 243
					byte[] var10 = var5.takeFileFlat(var11); // L: 244
					WorldMapSprite var12 = class14.method182(var10);
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var13.setRaster(); // L: 247
					if (this.worldMapData_0 != null) { // L: 248
						this.method4786(var2, var3, var12);
					} else {
						this.method4822(var2, var3, var12); // L: 252
					}

					class432.method8066(var13, this.regionX, this.regionY, this.pixelsPerTile);
					this.method4748(); // L: 255
				}
			}
		}
	} // L: 256

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "36600940"
	)
	void method4810(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 259
			var4 = new HashSet(); // L: 260
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "789197284"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 267

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) { // L: 270
				int var6 = var5.getElement(); // L: 271
				if (var1.contains(var6)) {
					WorldMapElement var7 = class423.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 274
				}
			}
		}

		this.method4751(var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lki;[Lut;Ljo;I)V",
		garbageValue = "-522815545"
	)
	void method4786(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method4746(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method4744(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lki;[Lut;Ljo;I)V",
		garbageValue = "644821941"
	)
	void method4822(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 297

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 301
					this.method4746(var6, var7, var5, var1); // L: 302
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method4744(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjw;Lki;[Lut;I)V",
		garbageValue = "-1700491954"
	)
	void method4744(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4749(var1, var2, var3);
		this.method4844(var1, var2, var3, var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILjw;Lki;Ljo;B)V",
		garbageValue = "7"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 325
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) { // L: 327
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 328
		}

		int var8 = 16711935;
		int var9;
		if (var7 != -1) {
			int var10 = this.backgroundColor;
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 337
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 338
				var11 = var12;
			} else {
				byte[] var13 = class419.FloorOverlayDefinition_archive.takeFile(4, var7);
				var12 = new FloorOverlayDefinition(); // L: 343
				if (var13 != null) { // L: 344
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode();
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7);
				var11 = var12; // L: 347
			}

			if (var11 == null) {
				var9 = var10;
			} else {
				int var14;
				int var15;
				if (var11.secondaryRgb >= 0) {
					var15 = class189.method3781(var11.secondaryHue, var11.secondarySaturation, var11.secondaryLightness);
					var14 = WorldMapIcon_1.method4627(var15, 96); // L: 356
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216; // L: 357
				} else if (var11.texture >= 0) {
					var15 = WorldMapIcon_1.method4627(Rasterizer3D.field2809.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
				} else if (var11.primaryRgb == 16711935) { // L: 363
					var9 = var10;
				} else {
					var15 = class189.method3781(var11.hue, var11.saturation, var11.lightness);
					var14 = WorldMapIcon_1.method4627(var15, 96); // L: 368
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216; // L: 369
				}
			}

			var8 = var9; // L: 372
		}

		if (var7 > -1 && var3.field2615[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method4739(var1, var2, var3, var5); // L: 378
			if (var7 == -1) { // L: 379
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method5113(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2615[0][var1][var2], var3.field2617[0][var1][var2]); // L: 383
			}
		}
	} // L: 381

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILjw;Lki;B)V",
		garbageValue = "-71"
	)
	void method4746(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 387
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 395
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 396
					var9 = var10; // L: 397
				} else {
					byte[] var11 = class419.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 400
					var10 = new FloorOverlayDefinition(); // L: 401
					if (var11 != null) { // L: 402
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 403
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6);
					var9 = var10;
				}

				int var7;
				if (var9 == null) {
					var7 = var8;
				} else {
					int var12;
					int var13;
					if (var9.secondaryRgb >= 0) { // L: 412
						var13 = class189.method3781(var9.secondaryHue, var9.secondarySaturation, var9.secondaryLightness); // L: 413
						var12 = WorldMapIcon_1.method4627(var13, 96); // L: 414
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
					} else if (var9.texture >= 0) {
						var13 = WorldMapIcon_1.method4627(Rasterizer3D.field2809.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 418
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216;
					} else if (var9.primaryRgb == 16711935) {
						var7 = var8; // L: 422
					} else {
						var13 = class189.method3781(var9.hue, var9.saturation, var9.lightness); // L: 425
						var12 = WorldMapIcon_1.method4627(var13, 96); // L: 426
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
					}
				}

				if (var3.field2615[var5][var1][var2] == 0) { // L: 431
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 432
				} else {
					var4.method5113(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2615[var5][var1][var2], var3.field2617[var5][var1][var2]); // L: 435
				}
			}
		}

	} // L: 439

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILjw;Ljo;I)I",
		garbageValue = "749036841"
	)
	int method4739(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 442 443 445
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILjw;[Lut;S)V",
		garbageValue = "-10283"
	)
	void method4844(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 449
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 450
			if (var6 != null && var6.length != 0) { // L: 451
				WorldMapDecoration[] var7 = var6; // L: 455

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 456
					WorldMapDecoration var9 = var7[var8]; // L: 457
					int var11 = var9.decoration; // L: 460
					boolean var10 = var11 >= WorldMapDecorationType.field3904.id && var11 <= WorldMapDecorationType.field3905.id; // L: 462
					if (var10 || class138.method3165(var9.decoration)) { // L: 464
						ObjectComposition var12 = class137.getObjectDefinition(var9.objectDefinitionId); // L: 465
						if (var12.mapSceneId != -1) { // L: 466
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 467
								var4[var12.mapSceneId].method9811(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 471
							} else {
								var4[var12.mapSceneId].method9811(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 468
							}
						}
					}
				}
			}
		}

	} // L: 479

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILjw;I)V",
		garbageValue = "348118714"
	)
	void method4749(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 482
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 483
			if (var5 != null && var5.length != 0) { // L: 484
				WorldMapDecoration[] var6 = var5; // L: 488

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 489
					WorldMapDecoration var8 = var6[var7]; // L: 490
					if (class162.method3477(var8.decoration)) { // L: 492
						ObjectComposition var9 = class137.getObjectDefinition(var8.objectDefinitionId); // L: 493
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 494
						if (var8.decoration == WorldMapDecorationType.field3894.id) { // L: 495
							this.method4762(var1, var2, var8.rotation, var10); // L: 496
						}

						if (var8.decoration == WorldMapDecorationType.field3886.id) { // L: 498
							this.method4762(var1, var2, var8.rotation, -3355444); // L: 499
							this.method4762(var1, var2, var8.rotation + 1, var10); // L: 500
						}

						if (var8.decoration == WorldMapDecorationType.field3887.id) { // L: 502
							if (var8.rotation == 0) { // L: 503
								Rasterizer2D.method9749(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9749(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 504
							}

							if (var8.rotation == 2) { // L: 505
								Rasterizer2D.method9749(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 506
								Rasterizer2D.method9749(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3884.id) { // L: 508
							int var11 = var8.rotation % 2; // L: 509
							int var12;
							if (var11 == 0) { // L: 510
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 511
									Rasterizer2D.method9749(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 512
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 516
									Rasterizer2D.method9749(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 517
								}
							}
						}
					}
				}
			}
		}

	} // L: 526

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-11"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 529
		float var6 = var5 / 2.0F; // L: 530
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 531

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 532
			Coord var9 = (Coord)var8.getKey(); // L: 534
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6); // L: 535
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 536
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 537
			if (var12 != null && var12.hasValidElement()) { // L: 538
				var12.screenX = var10; // L: 539
				var12.screenY = var11; // L: 540
				WorldMapElement var13 = class423.WorldMapElement_get(var12.getElement()); // L: 541
				if (!var3.contains(var13.getObjectId())) { // L: 542
					this.method4800(var12, var10, var11, var5); // L: 543
				}
			}
		}

	} // L: 548

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-6"
	)
	void method4751(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 551

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 552
			if (var5.hasValidElement()) { // L: 554
				WorldMapElement var6 = class423.WorldMapElement_get(var5.getElement()); // L: 555
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 556
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 557
				}
			}
		}

	} // L: 561

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgw;IIIIB)V",
		garbageValue = "7"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 564
		if (var6 != null) { // L: 565
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 568
			if (var4 % var5 < var5 / 2) { // L: 569
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 570
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 571
			}

		}
	} // L: 566 573

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljq;IIFB)V",
		garbageValue = "-1"
	)
	void method4800(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class423.WorldMapElement_get(var1.getElement()); // L: 576
		this.method4801(var5, var2, var3); // L: 577
		this.method4826(var1, var5, var2, var3, var4); // L: 578
	} // L: 579

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lgw;III)V",
		garbageValue = "1656400789"
	)
	void method4801(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 582
		if (var4 != null) { // L: 583
			int var5 = this.method4756(var4, var1.horizontalAlignment); // L: 584
			int var6 = this.method4795(var4, var1.verticalAlignment); // L: 585
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 586
		}

	} // L: 588

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljq;Lgw;IIFB)V",
		garbageValue = "-37"
	)
	void method4826(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 591
		if (var6 != null) { // L: 592
			if (var6.size.method4606(var5)) { // L: 595
				Font var7 = (Font)this.fonts.get(var6.size); // L: 598
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1845, 0, 1, 0, var7.ascent / 2); // L: 599
			}
		}
	} // L: 593 596 600

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "942282908"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 603
		Iterator var6 = this.icon0List.iterator(); // L: 604

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 605
			if (var7.hasValidElement()) { // L: 607
				int var8 = var7.coord2.x % 64; // L: 608
				int var9 = var7.coord2.y % 64; // L: 609
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 610
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5); // L: 611
				if (!var3.contains(var7.getElement())) { // L: 612
					this.method4800(var7, var7.screenX, var7.screenY, var5); // L: 615
				}
			}
		}

	} // L: 618

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Luc;Lhn;I)I",
		garbageValue = "1711589396"
	)
	int method4756(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 621
		case 0:
			return 0; // L: 624
		case 2:
			return -var1.subWidth / 2; // L: 632
		default:
			return -var1.subWidth; // L: 628
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Luc;Lhe;I)I",
		garbageValue = "-1474664885"
	)
	int method4795(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 638
		case 0:
			return 0; // L: 649
		case 1:
			return -var1.subHeight / 2; // L: 641
		default:
			return -var1.subHeight; // L: 645
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)Ljz;",
		garbageValue = "-1973146995"
	)
	WorldMapLabel method4758(int var1) {
		WorldMapElement var2 = class423.WorldMapElement_get(var1); // L: 676
		return this.createMapLabel(var2); // L: 677
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)Ljz;",
		garbageValue = "-215076757"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 681
			WorldMapLabelSize var2 = WorldMapLabelSize.method4607(var1.textSize); // L: 684
			if (var2 == null) { // L: 685
				return null; // L: 686
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 688
				if (var3 == null) { // L: 689
					return null; // L: 690
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 692
					String[] var5 = new String[var4]; // L: 693
					var3.breakLines(var1.name, (int[])null, var5); // L: 694
					int var6 = var5.length * var3.ascent / 2; // L: 695
					int var7 = 0; // L: 696
					String[] var8 = var5; // L: 698

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 699
						String var10 = var8[var9]; // L: 700
						int var11 = var3.stringWidth(var10); // L: 702
						if (var11 > var7) { // L: 703
							var7 = var11; // L: 704
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 709
				}
			}
		} else {
			return null; // L: 682
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-385780649"
	)
	List method4760(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 713
		if (var4 >= var1 && var5 >= var2) { // L: 714
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 715
				Iterator var7 = this.iconMap.values().iterator(); // L: 716

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 717
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 719
						var6.add(var8); // L: 720
					}
				}

				var7 = this.icon0List.iterator(); // L: 724

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 725
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 727
						var6.add(var8); // L: 728
					}
				}

				return var6; // L: 732
			} else {
				return var6; // L: 723
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-1620490315"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 736
		var1.addAll(this.icon0List); // L: 737
		var1.addAll(this.iconMap.values()); // L: 738
		return var1; // L: 739
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-12"
	)
	void method4762(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 743
		if (var3 == 0) { // L: 744
			Rasterizer2D.method9736(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 745
			Rasterizer2D.method9749(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 746
			Rasterizer2D.method9736(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9749(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 747
		}

	} // L: 748

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Ldd;IIB)V",
		garbageValue = "3"
	)
	static void method4850(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 128
		UserComparator6.Interpreter_intStackSize = 0; // L: 129
		class211.Interpreter_stringStackSize = 0; // L: 130
		int var5 = -1; // L: 131
		int[] var6 = var1.opcodes; // L: 132
		int[] var7 = var1.intOperands; // L: 133
		byte var8 = -1; // L: 134
		Interpreter.Interpreter_frameDepth = 0; // L: 135
		Interpreter.field857 = false; // L: 136
		boolean var9 = false; // L: 137
		int var10 = 0; // L: 138
		boolean var29 = false;

		label930: {
			label931: {
				try {
					int var13;
					try {
						var29 = true; // L: 140
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 141
						int var11 = 0; // L: 142
						UserComparator9.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 143
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 144
							if (var4[var13] instanceof Integer) { // L: 145
								var14 = (Integer)var4[var13]; // L: 146
								if (var14 == -2147483647) { // L: 147
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 148
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 149
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 150
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 151
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 152
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 153
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 154
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 155
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14; // L: 156
							} else if (var4[var13] instanceof String) { // L: 158
								var20 = (String)var4[var13]; // L: 159
								if (var20.equals("event_opbase")) { // L: 160
									var20 = var0.targetName;
								}

								UserComparator9.Interpreter_stringLocals[var12++] = var20; // L: 161
							}
						}

						Interpreter.field860 = var0.field1065; // L: 165

						while (true) {
							++var10; // L: 167
							if (var10 > var2) { // L: 168
								throw new RuntimeException();
							}

							++var5; // L: 169
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 170
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 388
									var34 = true;
								} else {
									var34 = false; // L: 389
								}

								var14 = RouteStrategy.method4507(var32, var1, var34); // L: 390
								switch(var14) { // L: 391
								case 0:
									var29 = false;
									break label931;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 398
								}
							} else if (var32 == 0) { // L: 171
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7[var5]; // L: 172
							} else if (var32 == 1) { // L: 175
								var13 = var7[var5]; // L: 176
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 177
							} else if (var32 == 2) { // L: 180
								var13 = var7[var5]; // L: 181
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 182
								class136.changeGameOptions(var13); // L: 183
							} else if (var32 == 3) { // L: 186
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 187
							} else if (var32 == 6) { // L: 190
								var5 += var7[var5]; // L: 191
							} else if (var32 == 7) { // L: 194
								UserComparator6.Interpreter_intStackSize -= 2; // L: 195
								if (Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]) { // L: 196
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 199
								UserComparator6.Interpreter_intStackSize -= 2; // L: 200
								if (Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]) { // L: 201
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 204
								UserComparator6.Interpreter_intStackSize -= 2; // L: 205
								if (Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]) { // L: 206
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 209
								UserComparator6.Interpreter_intStackSize -= 2; // L: 210
								if (Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]) { // L: 211
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 214
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label930;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 216
								var1 = var39.script; // L: 217
								var6 = var1.opcodes; // L: 218
								var7 = var1.intOperands; // L: 219
								var5 = var39.pc; // L: 220
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 221
								UserComparator9.Interpreter_stringLocals = var39.stringLocals; // L: 222
							} else if (var32 == 25) { // L: 225
								var13 = var7[var5]; // L: 226
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class59.getVarbit(var13); // L: 227
							} else if (var32 == 27) { // L: 230
								var13 = var7[var5]; // L: 231
								class244.method4940(var13, Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 232
							} else if (var32 == 31) { // L: 235
								UserComparator6.Interpreter_intStackSize -= 2; // L: 236
								if (Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]) { // L: 237
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 240
								UserComparator6.Interpreter_intStackSize -= 2; // L: 241
								if (Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]) { // L: 242
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 245
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 246
							} else if (var32 == 34) { // L: 249
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 250
							} else if (var32 == 35) { // L: 253
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = UserComparator9.Interpreter_stringLocals[var7[var5]]; // L: 254
							} else if (var32 == 36) { // L: 257
								UserComparator9.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 258
							} else if (var32 == 37) { // L: 261
								var13 = var7[var5]; // L: 262
								class211.Interpreter_stringStackSize -= var13; // L: 263
								var20 = class341.method6369(Interpreter.Interpreter_stringStack, class211.Interpreter_stringStackSize, var13); // L: 264
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var20; // L: 265
							} else if (var32 == 38) { // L: 268
								--UserComparator6.Interpreter_intStackSize; // L: 269
							} else if (var32 == 39) { // L: 272
								--class211.Interpreter_stringStackSize; // L: 273
							} else {
								int var17;
								if (var32 != 40) { // L: 276
									if (var32 == 42) { // L: 299
										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClientPreferences.varcs.getInt(var7[var5]); // L: 300
									} else if (var32 == 43) { // L: 303
										ClientPreferences.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 304
									} else if (var32 == 44) { // L: 307
										var13 = var7[var5] >> 16; // L: 308
										var14 = var7[var5] & 65535; // L: 309
										int var23 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 310
										if (var23 < 0 || var23 > 5000) { // L: 311
											throw new RuntimeException(); // L: 312
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 314
										byte var24 = -1; // L: 315
										if (var14 == 105) { // L: 316
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 317
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 320
										var13 = var7[var5]; // L: 321
										var14 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 322
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 323
											throw new RuntimeException(); // L: 324
										}

										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 326
									} else if (var32 == 46) { // L: 329
										var13 = var7[var5]; // L: 330
										UserComparator6.Interpreter_intStackSize -= 2; // L: 331
										var14 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 332
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 333
											throw new RuntimeException(); // L: 334
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 336
									} else {
										String var21;
										if (var32 == 47) { // L: 339
											var21 = ClientPreferences.varcs.getStringOld(var7[var5]); // L: 340
											if (var21 == null) { // L: 341
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var21; // L: 342
										} else if (var32 == 48) { // L: 345
											ClientPreferences.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]); // L: 346
										} else if (var32 == 49) { // L: 349
											var21 = ClientPreferences.varcs.getString(var7[var5]); // L: 350
											Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var21; // L: 351
										} else if (var32 == 50) { // L: 354
											ClientPreferences.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]); // L: 355
										} else if (var32 == 60) { // L: 358
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 359
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 360
											if (var36 != null) { // L: 361
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 364
												var38 = GrandExchangeOfferUnitPriceComparator.field4432.getTitleGroupValue(var7[var5]); // L: 365
												if (var38 == null) { // L: 366
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 367
												} else {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var38; // L: 370
												}
											} else {
												if (var32 != 76) { // L: 374
													throw new IllegalStateException(); // L: 384
												}

												var38 = class407.field4517.method8647(var7[var5]); // L: 375
												if (var38 == null) { // L: 376
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 377
												} else {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var38; // L: 380
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 277
									Script var35 = Skeleton.getScript(var13); // L: 278
									int[] var15 = new int[var35.localIntCount]; // L: 279
									String[] var16 = new String[var35.localStringCount]; // L: 280

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 281
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (UserComparator6.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 282
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class211.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									UserComparator6.Interpreter_intStackSize -= var35.intArgumentCount; // L: 283
									class211.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 284
									ScriptFrame var22 = new ScriptFrame(); // L: 285
									var22.script = var1; // L: 286
									var22.pc = var5; // L: 287
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 288
									var22.stringLocals = UserComparator9.Interpreter_stringLocals; // L: 289
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 290
									var1 = var35; // L: 291
									var6 = var35.opcodes; // L: 292
									var7 = var35.intOperands; // L: 293
									var5 = -1; // L: 294
									Interpreter.Interpreter_intLocals = var15; // L: 295
									UserComparator9.Interpreter_stringLocals = var16; // L: 296
								}
							}
						}
					} catch (Exception var30) { // L: 404
						var9 = true; // L: 405
						StringBuilder var26 = new StringBuilder(30); // L: 407
						var26.append("").append(var1.key).append(" "); // L: 408
						var13 = Interpreter.Interpreter_frameDepth - 1; // L: 409

						while (true) {
							if (var13 < 0) {
								var26.append("").append(var8); // L: 410
								class368.RunException_sendStackTrace(var26.toString(), var30); // L: 411
								var29 = false;
								break;
							}

							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var29) {
						while (Interpreter.field849.size() > 0) {
							class102 var19 = (class102)Interpreter.field849.remove(0); // L: 416
							class59.widgetDefaultMenuAction(var19.method2727(), var19.method2729(), var19.method2728(), var19.method2730(), "");
						}

						if (Interpreter.field857) { // L: 419
							Interpreter.field857 = false; // L: 420
							class47.method910(); // L: 421
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class368.RunException_sendStackTrace("Warning: Script " + var1.field979 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field849.size() > 0) { // L: 415
					class102 var25 = (class102)Interpreter.field849.remove(0);
					class59.widgetDefaultMenuAction(var25.method2727(), var25.method2729(), var25.method2728(), var25.method2730(), "");
				}

				if (Interpreter.field857) {
					Interpreter.field857 = false;
					class47.method910();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class368.RunException_sendStackTrace("Warning: Script " + var1.field979 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return; // L: 427
			}

			while (Interpreter.field849.size() > 0) {
				class102 var33 = (class102)Interpreter.field849.remove(0);
				class59.widgetDefaultMenuAction(var33.method2727(), var33.method2729(), var33.method2728(), var33.method2730(), ""); // L: 417
			}

			if (Interpreter.field857) {
				Interpreter.field857 = false;
				class47.method910();
			}

			if (!var9 && var3 > 0 && var10 >= var3) { // L: 423
				class368.RunException_sendStackTrace("Warning: Script " + var1.field979 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 424
			}

			return; // L: 393
		}

		while (Interpreter.field849.size() > 0) {
			class102 var40 = (class102)Interpreter.field849.remove(0);
			class59.widgetDefaultMenuAction(var40.method2727(), var40.method2729(), var40.method2728(), var40.method2730(), "");
		}

		if (Interpreter.field857) {
			Interpreter.field857 = false;
			class47.method910();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class368.RunException_sendStackTrace("Warning: Script " + var1.field979 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	} // L: 215

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IIIIIIII)V",
		garbageValue = "1593625354"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11301
			Widget var9 = var0[var8]; // L: 11302
			if (var9 != null && var9.parentId == var1 && (var9.method6702() || class405.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11303 11304 11305
				if (var9.isIf3) { // L: 11306
					if (class59.isComponentHidden(var9)) { // L: 11307
						continue;
					}
				} else if (var9.type == 0 && var9 != class433.mousedOverWidgetIf1 && class59.isComponentHidden(var9)) { // L: 11310
					continue;
				}

				if (var9.type == 11) { // L: 11312
					if (var9.method6719(class380.field4414, class113.urlRequester)) { // L: 11313
						if (var9.method6762()) { // L: 11314
							FaceNormal.invalidateWidget(var9); // L: 11315
							class16.revalidateWidgetScroll(var9.children, var9, true); // L: 11316
							var9.method6718().method4142().method4280(3, var9.method6718().method4154()); // L: 11317
						}

						if (var9.field3825 != null) { // L: 11319
							ScriptEvent var10 = new ScriptEvent(); // L: 11320
							var10.widget = var9; // L: 11321
							var10.args = var9.field3825; // L: 11322
							Client.scriptEvents.addFirst(var10); // L: 11323
						}
					}
				} else if (var9.type == 12 && var9.method6727(class380.field4414)) { // L: 11327 11328
					FaceNormal.invalidateWidget(var9); // L: 11329
				}

				int var26 = var9.x + var6; // L: 11332
				int var11 = var7 + var9.y; // L: 11333
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11338
					var16 = var26; // L: 11339
					var17 = var11; // L: 11340
					var18 = var26 + var9.width; // L: 11341
					int var19 = var11 + var9.height; // L: 11342
					if (var18 < var26) { // L: 11343
						var16 = var18; // L: 11345
						var18 = var26; // L: 11346
					}

					if (var19 < var11) { // L: 11348
						var17 = var19; // L: 11350
						var19 = var11; // L: 11351
					}

					++var18; // L: 11353
					++var19; // L: 11354
					var12 = var16 > var2 ? var16 : var2; // L: 11355
					var13 = var17 > var3 ? var17 : var3; // L: 11356
					var14 = var18 < var4 ? var18 : var4; // L: 11357
					var15 = var19 < var5 ? var19 : var5; // L: 11358
				} else {
					var16 = var26 + var9.width; // L: 11361
					var17 = var11 + var9.height; // L: 11362
					var12 = var26 > var2 ? var26 : var2; // L: 11363
					var13 = var11 > var3 ? var11 : var3; // L: 11364
					var14 = var16 < var4 ? var16 : var4; // L: 11365
					var15 = var17 < var5 ? var17 : var5; // L: 11366
				}

				if (var9 == Client.clickedWidget) { // L: 11368
					Client.field714 = true; // L: 11369
					Client.field719 = var26; // L: 11370
					Client.field692 = var11; // L: 11371
				}

				boolean var34 = false; // L: 11373
				if (var9.field3776) { // L: 11374
					switch(Client.field798) { // L: 11375
					case 0:
						var34 = true; // L: 11387
					case 1:
					default:
						break;
					case 2:
						if (Client.field673 == var9.id >>> 16) { // L: 11382
							var34 = true; // L: 11383
						}
						break;
					case 3:
						if (var9.id == Client.field673) { // L: 11377
							var34 = true; // L: 11378
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11391
					if (var9.isIf3) { // L: 11392
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11393
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11394
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11395
									if (var27.field1056) { // L: 11396
										var27.remove(); // L: 11397
										var27.widget.field3722 = false; // L: 11398
									}
								}

								class12.method168(); // L: 11401
								if (class10.widgetDragDuration == 0) { // L: 11402
									Client.clickedWidget = null; // L: 11403
									Client.clickedWidgetParent = null; // L: 11404
								}

								if (!Client.isMenuOpen) { // L: 11406
									class365.addCancelMenuEntry(); // L: 11407
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11411 11412
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11413
								if (var27.field1056 && var27.widget.onScroll == var27.args) { // L: 11414
									var27.remove(); // L: 11415
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11421
					var18 = MouseHandler.MouseHandler_y; // L: 11422
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11423
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11424
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11425
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11427
					if (var9.contentType == 1337) { // L: 11428
						if (!Client.field690 && !Client.isMenuOpen && var35) { // L: 11429
							class414.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11432
						class231.checkIfMinimapClicked(var9, var26, var11); // L: 11433
					} else {
						if (var9.contentType == 1400) { // L: 11436
							GrandExchangeOfferUnitPriceComparator.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11437
						}

						if (!Client.isMenuOpen && var35) { // L: 11439
							if (var9.contentType == 1400) { // L: 11440
								GrandExchangeOfferUnitPriceComparator.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11441
							} else {
								WorldMapSprite.method5026(var9); // L: 11444
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11447
							for (int var20 = 0; var20 < var9.field3775.length; ++var20) { // L: 11448
								var21 = false; // L: 11449
								boolean var28 = false; // L: 11450
								if (!var21 && var9.field3775[var20] != null) { // L: 11451
									for (var23 = 0; var23 < var9.field3775[var20].length; ++var23) { // L: 11452
										boolean var24 = false; // L: 11453
										if (var9.field3847 != null) { // L: 11454
											var24 = Client.field661.method4426(var9.field3775[var20][var23]); // L: 11455
										}

										if (UserComparator5.method2958(var9.field3775[var20][var23]) || var24) { // L: 11457
											var21 = true; // L: 11458
											if (var9.field3847 != null && var9.field3847[var20] > Client.cycle) { // L: 11459
												break;
											}

											byte var33 = var9.field3796[var20][var23]; // L: 11460
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field661.method4426(86) && !Client.field661.method4426(82) && !Client.field661.method4426(81)) && ((var33 & 2) == 0 || Client.field661.method4426(86)) && ((var33 & 1) == 0 || Client.field661.method4426(82)) && ((var33 & 4) == 0 || Client.field661.method4426(81))) { // L: 11461 11462 11463 11464 11465
												var28 = true; // L: 11467
												break;
											}
										}
									}
								}

								if (var28) { // L: 11473
									if (var20 < 10) { // L: 11474
										class59.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11475
										ArchiveDiskActionHandler.method6981(); // L: 11476
										Timer.method8063(var9.id, var9.childIndex, class155.Widget_unpackTargetMask(class405.getWidgetFlags(var9)), var9.itemId); // L: 11477
										Client.field668 = FontName.Widget_getSpellActionName(var9); // L: 11478
										if (Client.field668 == null) { // L: 11479
											Client.field668 = "null";
										}

										Client.field669 = var9.dataText + class208.colorStartTag(16777215); // L: 11480
									}

									var23 = var9.field3779[var20]; // L: 11482
									if (var9.field3847 == null) { // L: 11483
										var9.field3847 = new int[var9.field3775.length];
									}

									if (var9.field3787 == null) { // L: 11484
										var9.field3787 = new int[var9.field3775.length];
									}

									if (var23 != 0) { // L: 11485
										if (var9.field3847[var20] == 0) { // L: 11486
											var9.field3847[var20] = var23 + Client.cycle + var9.field3787[var20];
										} else {
											var9.field3847[var20] = var23 + Client.cycle; // L: 11487
										}
									} else {
										var9.field3847[var20] = Integer.MAX_VALUE; // L: 11489
									}
								}

								if (!var21 && var9.field3847 != null) { // L: 11491 11492
									var9.field3847[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11496
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11497
								var35 = true;
							} else {
								var35 = false; // L: 11498
							}

							boolean var36 = false; // L: 11499
							if ((MouseHandler.MouseHandler_currentButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11500
								var36 = true;
							}

							var21 = false; // L: 11501
							if ((MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11502
								var21 = true;
							}

							if (var21) { // L: 11503
								class220.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11504
							}

							if (var9.method6703()) { // L: 11506
								if (var21) { // L: 11507
									Client.field716.addFirst(new class225(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11508
								}

								if (var36) { // L: 11510
									Client.field716.addFirst(new class225(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11511
								}
							}

							if (var9.contentType == 1400) { // L: 11514
								GrandExchangeOfferUnitPriceComparator.worldMap.method8854(var17, var18, var35 & var36, var35 & var21); // L: 11515
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Skeleton.method5378(class405.getWidgetFlags(var9))) { // L: 11517
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11518
								Client.field739 = true; // L: 11519
								Client.field688 = var26; // L: 11520
								Client.field689 = var11; // L: 11521
							}

							if (var9.hasListener) { // L: 11523
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11524
									var22 = new ScriptEvent(); // L: 11525
									var22.field1056 = true; // L: 11526
									var22.widget = var9; // L: 11527
									var22.mouseY = Client.mouseWheelRotation; // L: 11528
									var22.args = var9.onScroll; // L: 11529
									Client.scriptEvents.addFirst(var22); // L: 11530
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11532
									var21 = false; // L: 11533
									var36 = false; // L: 11534
									var35 = false; // L: 11535
								}

								if (!var9.field3840 && var21) { // L: 11537
									var9.field3840 = true; // L: 11538
									if (var9.onClick != null) { // L: 11539
										var22 = new ScriptEvent(); // L: 11540
										var22.field1056 = true; // L: 11541
										var22.widget = var9; // L: 11542
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11543
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11544
										var22.args = var9.onClick; // L: 11545
										Client.scriptEvents.addFirst(var22); // L: 11546
									}
								}

								if (var9.field3840 && var36 && var9.onClickRepeat != null) { // L: 11549 11550
									var22 = new ScriptEvent(); // L: 11551
									var22.field1056 = true; // L: 11552
									var22.widget = var9; // L: 11553
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11554
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11555
									var22.args = var9.onClickRepeat; // L: 11556
									Client.scriptEvents.addFirst(var22); // L: 11557
								}

								if (var9.field3840 && !var36) { // L: 11560
									var9.field3840 = false; // L: 11561
									if (var9.onRelease != null) { // L: 11562
										var22 = new ScriptEvent(); // L: 11563
										var22.field1056 = true; // L: 11564
										var22.widget = var9; // L: 11565
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11566
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11567
										var22.args = var9.onRelease; // L: 11568
										Client.field715.addFirst(var22); // L: 11569
									}
								}

								if (var36 && var9.onHold != null) { // L: 11572 11573
									var22 = new ScriptEvent(); // L: 11574
									var22.field1056 = true; // L: 11575
									var22.widget = var9; // L: 11576
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11577
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11578
									var22.args = var9.onHold; // L: 11579
									Client.scriptEvents.addFirst(var22); // L: 11580
								}

								if (!var9.field3722 && var35) { // L: 11583
									var9.field3722 = true; // L: 11584
									if (var9.onMouseOver != null) { // L: 11585
										var22 = new ScriptEvent(); // L: 11586
										var22.field1056 = true; // L: 11587
										var22.widget = var9; // L: 11588
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11589
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11590
										var22.args = var9.onMouseOver; // L: 11591
										Client.scriptEvents.addFirst(var22); // L: 11592
									}
								}

								if (var9.field3722 && var35 && var9.onMouseRepeat != null) { // L: 11595 11596
									var22 = new ScriptEvent(); // L: 11597
									var22.field1056 = true; // L: 11598
									var22.widget = var9; // L: 11599
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11600
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11601
									var22.args = var9.onMouseRepeat; // L: 11602
									Client.scriptEvents.addFirst(var22); // L: 11603
								}

								if (var9.field3722 && !var35) { // L: 11606
									var9.field3722 = false; // L: 11607
									if (var9.onMouseLeave != null) { // L: 11608
										var22 = new ScriptEvent(); // L: 11609
										var22.field1056 = true; // L: 11610
										var22.widget = var9; // L: 11611
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11612
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11613
										var22.args = var9.onMouseLeave; // L: 11614
										Client.field715.addFirst(var22); // L: 11615
									}
								}

								if (var9.onTimer != null) { // L: 11618
									var22 = new ScriptEvent(); // L: 11619
									var22.widget = var9; // L: 11620
									var22.args = var9.onTimer; // L: 11621
									Client.field631.addFirst(var22); // L: 11622
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field696 > var9.field3842) { // L: 11624
									if (var9.varTransmitTriggers != null && Client.field696 - var9.field3842 <= 32) { // L: 11625
										label822:
										for (var39 = var9.field3842; var39 < Client.field696; ++var39) { // L: 11632
											var23 = Client.field497[var39 & 31]; // L: 11633

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11634
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11635
													var25 = new ScriptEvent(); // L: 11636
													var25.widget = var9; // L: 11637
													var25.args = var9.onVarTransmit; // L: 11638
													Client.scriptEvents.addFirst(var25); // L: 11639
													break label822; // L: 11640
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11626
										var22.widget = var9; // L: 11627
										var22.args = var9.onVarTransmit; // L: 11628
										Client.scriptEvents.addFirst(var22); // L: 11629
									}

									var9.field3842 = Client.field696; // L: 11645
								}

								if (var9.onInvTransmit != null && Client.field777 > var9.field3843) { // L: 11647
									if (var9.invTransmitTriggers != null && Client.field777 - var9.field3843 <= 32) { // L: 11648
										label798:
										for (var39 = var9.field3843; var39 < Client.field777; ++var39) { // L: 11655
											var23 = Client.field697[var39 & 31]; // L: 11656

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11657
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11658
													var25 = new ScriptEvent(); // L: 11659
													var25.widget = var9; // L: 11660
													var25.args = var9.onInvTransmit; // L: 11661
													Client.scriptEvents.addFirst(var25); // L: 11662
													break label798; // L: 11663
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11649
										var22.widget = var9; // L: 11650
										var22.args = var9.onInvTransmit; // L: 11651
										Client.scriptEvents.addFirst(var22); // L: 11652
									}

									var9.field3843 = Client.field777; // L: 11668
								}

								if (var9.onStatTransmit != null && Client.field665 > var9.field3844) { // L: 11670
									if (var9.statTransmitTriggers != null && Client.field665 - var9.field3844 <= 32) { // L: 11671
										label774:
										for (var39 = var9.field3844; var39 < Client.field665; ++var39) { // L: 11678
											var23 = Client.field551[var39 & 31]; // L: 11679

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11680
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11681
													var25 = new ScriptEvent(); // L: 11682
													var25.widget = var9; // L: 11683
													var25.args = var9.onStatTransmit; // L: 11684
													Client.scriptEvents.addFirst(var25); // L: 11685
													break label774; // L: 11686
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11672
										var22.widget = var9; // L: 11673
										var22.args = var9.onStatTransmit; // L: 11674
										Client.scriptEvents.addFirst(var22); // L: 11675
									}

									var9.field3844 = Client.field665; // L: 11691
								}

								if (Client.chatCycle > var9.field3836 && var9.onChatTransmit != null) { // L: 11693
									var22 = new ScriptEvent(); // L: 11694
									var22.widget = var9; // L: 11695
									var22.args = var9.onChatTransmit; // L: 11696
									Client.scriptEvents.addFirst(var22); // L: 11697
								}

								if (Client.field704 > var9.field3836 && var9.onFriendTransmit != null) { // L: 11699
									var22 = new ScriptEvent(); // L: 11700
									var22.widget = var9; // L: 11701
									var22.args = var9.onFriendTransmit; // L: 11702
									Client.scriptEvents.addFirst(var22); // L: 11703
								}

								if (Client.field705 > var9.field3836 && var9.onClanTransmit != null) { // L: 11705
									var22 = new ScriptEvent(); // L: 11706
									var22.widget = var9; // L: 11707
									var22.args = var9.onClanTransmit; // L: 11708
									Client.scriptEvents.addFirst(var22); // L: 11709
								}

								if (Client.field706 > var9.field3836 && var9.field3817 != null) { // L: 11711
									var22 = new ScriptEvent(); // L: 11712
									var22.widget = var9; // L: 11713
									var22.args = var9.field3817; // L: 11714
									Client.scriptEvents.addFirst(var22); // L: 11715
								}

								if (Client.field707 > var9.field3836 && var9.field3818 != null) { // L: 11717
									var22 = new ScriptEvent(); // L: 11718
									var22.widget = var9; // L: 11719
									var22.args = var9.field3818; // L: 11720
									Client.scriptEvents.addFirst(var22); // L: 11721
								}

								if (Client.field590 > var9.field3836 && var9.onStockTransmit != null) { // L: 11723
									var22 = new ScriptEvent(); // L: 11724
									var22.widget = var9; // L: 11725
									var22.args = var9.onStockTransmit; // L: 11726
									Client.scriptEvents.addFirst(var22); // L: 11727
								}

								if (Client.field709 > var9.field3836 && var9.field3824 != null) { // L: 11729
									var22 = new ScriptEvent(); // L: 11730
									var22.widget = var9; // L: 11731
									var22.args = var9.field3824; // L: 11732
									Client.scriptEvents.addFirst(var22); // L: 11733
								}

								if (Client.field592 > var9.field3836 && var9.onMiscTransmit != null) { // L: 11735
									var22 = new ScriptEvent(); // L: 11736
									var22.widget = var9; // L: 11737
									var22.args = var9.onMiscTransmit; // L: 11738
									Client.scriptEvents.addFirst(var22); // L: 11739
								}

								var9.field3836 = Client.cycleCntr; // L: 11741
								if (var9.onKey != null) { // L: 11742
									for (var39 = 0; var39 < Client.field738; ++var39) { // L: 11743
										ScriptEvent var32 = new ScriptEvent(); // L: 11744
										var32.widget = var9; // L: 11745
										var32.keyTyped = Client.field559[var39]; // L: 11746
										var32.keyPressed = Client.field617[var39]; // L: 11747
										var32.args = var9.onKey; // L: 11748
										Client.scriptEvents.addFirst(var32); // L: 11749
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3813 != null) { // L: 11752
									var38 = Client.field661.method4428(); // L: 11753

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11754
										var31 = new ScriptEvent(); // L: 11755
										var31.widget = var9; // L: 11756
										var31.keyTyped = var38[var23]; // L: 11757
										var31.args = var9.field3813; // L: 11758
										Client.scriptEvents.addFirst(var31); // L: 11759
									}
								}

								if (var9.field3814 != null) { // L: 11762
									var38 = Client.field661.method4429(); // L: 11763

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11764
										var31 = new ScriptEvent(); // L: 11765
										var31.widget = var9; // L: 11766
										var31.keyTyped = var38[var23]; // L: 11767
										var31.args = var9.field3814; // L: 11768
										Client.scriptEvents.addFirst(var31); // L: 11769
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11774
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11775
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3778 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11776
								if (var9.mouseOverRedirect >= 0) { // L: 11777
									class433.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class433.mousedOverWidgetIf1 = var9; // L: 11778
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11780
								class209.field2287 = var9; // L: 11781
							}

							if (var9.scrollHeight > var9.height) { // L: 11783
								class436.method8125(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11785
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11786
							if (var9.children != null) { // L: 11787
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11788
							if (var29 != null) { // L: 11789
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11790
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11791
										if (var30.field1056) { // L: 11792
											var30.remove(); // L: 11793
											var30.widget.field3722 = false; // L: 11794
										}
									}

									if (class10.widgetDragDuration == 0) { // L: 11797
										Client.clickedWidget = null; // L: 11798
										Client.clickedWidgetParent = null; // L: 11799
									}

									if (!Client.isMenuOpen) { // L: 11801
										class365.addCancelMenuEntry(); // L: 11802
									}
								}

								KeyHandler.addPendingSpawnToScene(var29.group, var12, var13, var14, var15, var26, var11); // L: 11805
							}
						}
					}
				}
			}
		}

	} // L: 11809
}
