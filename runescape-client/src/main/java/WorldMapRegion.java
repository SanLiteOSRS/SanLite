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

@ObfuscatedName("jj")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -807429635
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 264543245
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("au")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 486709055
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1103982567
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ao")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("as")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("am")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 55
		this.regionY = var2; // L: 56
		this.worldMapData1List = new LinkedList(); // L: 57
		this.icon0List = new LinkedList(); // L: 58
		this.iconMap = new HashMap(); // L: 59
		this.backgroundColor = var3 | -16777216; // L: 60
		this.fonts = var4; // L: 61
	} // L: 62

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-796440115"
	)
	void method5265(int var1, int var2, int var3) {
		SpritePixels var4 = Players.method2756(this.regionX, this.regionY, this.pixelsPerTile); // L: 65
		if (var4 != null) { // L: 66
			if (var3 == this.pixelsPerTile * 64) { // L: 67
				var4.drawAt(var1, var2); // L: 68
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 71
			}

		}
	} // L: 73

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljn;Ljava/util/List;B)V",
		garbageValue = "-44"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 76
		this.worldMapData_0 = var1; // L: 77
		this.addAllToIconList(var2); // L: 78
	} // L: 79

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "417819342"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 82
		Iterator var3 = var1.iterator(); // L: 83

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 84
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 86
				this.worldMapData1List.add(var4); // L: 87
			}
		}

		this.addAllToIconList(var2); // L: 91
	} // L: 92

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIILky;I)V",
		garbageValue = "-2105255552"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 95
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 96
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 97
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 98
					if (var9 != null && var9.length != 0) { // L: 99
						WorldMapDecoration[] var10 = var9; // L: 103

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 104
							WorldMapDecoration var12 = var10[var11]; // L: 105
							ObjectComposition var13 = Language.getObjectDefinition(var12.objectDefinitionId); // L: 107
							if (PcmPlayer.method842(var13)) { // L: 108
								this.getIcon(var13, var8, var6, var7, var5); // L: 111
								continue label51; // L: 112
							}
						}
					}
				}
			}
		}

	} // L: 119

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhj;IIILky;I)V",
		garbageValue = "1619368814"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 122
		Coord var7 = null; // L: 123
		if (this.worldMapData_0 != null) { // L: 124
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4); // L: 125
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 128
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8); // L: 129
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 132
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 133
		} else {
			var9 = class127.WorldMapElement_get(var1.mapIconId); // L: 136
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 137
		}

		var9 = class127.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 139
		if (var9.field1929) { // L: 140
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 141
		}

	} // L: 143

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 146

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 147
			if (var2 instanceof WorldMapIcon_1) { // L: 149
				((WorldMapIcon_1)var2).init(); // L: 150
			}
		}

	} // L: 154

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1473125767"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 157

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 158
			if (class127.WorldMapElement_get(var3.element).field1929 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 160 163
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5290(var3.element)); // L: 164
				this.icon0List.add(var4); // L: 165
			}
		}

	} // L: 169

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-792197810"
	)
	void method5364() {
		if (this.worldMapData_0 != null) { // L: 172
			this.worldMapData_0.reset(); // L: 173
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 176

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 177
				var2.reset(); // L: 179
			}
		}

	} // L: 183

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)Z",
		garbageValue = "520233375"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 186
		if (this.worldMapData_0 != null) { // L: 187
			this.worldMapData_0.loadGeography(var1); // L: 188
			if (this.worldMapData_0.isFullyLoaded()) { // L: 189
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 190
				return true; // L: 191
			} else {
				return false; // L: 193
			}
		} else {
			boolean var2 = true; // L: 196

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 197 201
				var4 = (WorldMapData_1)var3.next(); // L: 198
				var4.loadGeography(var1); // L: 200
			}

			if (var2) { // L: 204
				var3 = this.worldMapData1List.iterator(); // L: 205

				while (var3.hasNext()) { // L: 210
					var4 = (WorldMapData_1)var3.next(); // L: 206
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 208
				}
			}

			return var2; // L: 212
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILkt;[Lum;Lnr;Lnr;I)V",
		garbageValue = "2115783441"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 217
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 218
			if (Players.method2756(this.regionX, this.regionY, var1) == null) { // L: 221
				boolean var6 = true; // L: 224
				var6 &= this.loadGeography(var4); // L: 225
				int var8;
				if (this.worldMapData_0 != null) { // L: 228
					var8 = this.worldMapData_0.groupId; // L: 229
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 232
				}

				var6 &= var5.tryLoadGroup(var8); // L: 234
				if (var6) { // L: 235
					byte[] var7 = var5.takeFileFlat(var8); // L: 236
					WorldMapSprite var9;
					if (var7 == null) { // L: 239
						var9 = new WorldMapSprite(); // L: 240
					} else {
						var9 = new WorldMapSprite(class496.method8837(var7).pixels); // L: 243
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 246
					var11.setRaster(); // L: 247
					if (this.worldMapData_0 != null) { // L: 248
						this.method5263(var2, var3, var9); // L: 249
					} else {
						this.method5275(var2, var3, var9); // L: 252
					}

					int var12 = this.regionX; // L: 254
					int var13 = this.regionY; // L: 255
					int var14 = this.pixelsPerTile; // L: 256
					DemotingHashTable var15 = WorldMapRegion_cachedSprites; // L: 258
					long var17 = (long)(var14 << 16 | var12 << 8 | var13); // L: 262
					var15.put(var11, var17, var11.pixels.length * 4); // L: 264
					this.method5364(); // L: 266
				}
			}
		}
	} // L: 219 222 267

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "0"
	)
	void method5348(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 270
			var4 = new HashSet(); // L: 271
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 273
		this.drawMapLinks(var1, var2, var4, var3); // L: 274
	} // L: 275

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "900009081"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 278

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 279
			if (var5.hasValidElement()) { // L: 281
				int var6 = var5.getElement(); // L: 282
				if (var1.contains(var6)) { // L: 283
					WorldMapElement var7 = class127.WorldMapElement_get(var6); // L: 284
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 285
				}
			}
		}

		this.method5272(var1, var2, var3); // L: 289
	} // L: 290

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkt;[Lum;Lkl;B)V",
		garbageValue = "-91"
	)
	void method5263(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 293
			for (var5 = 0; var5 < 64; ++var5) { // L: 294
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 295
				this.method5314(var4, var5, this.worldMapData_0, var1); // L: 296
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 299
			for (var5 = 0; var5 < 64; ++var5) { // L: 300
				this.method5276(var4, var5, this.worldMapData_0, var1, var2); // L: 301
			}
		}

	} // L: 304

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkt;[Lum;Lkl;I)V",
		garbageValue = "2003493803"
	)
	void method5275(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 307

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 308

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 310
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 311
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 312
					this.method5314(var6, var7, var5, var1); // L: 313
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 318

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 319

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 321
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 322
					this.method5276(var6, var7, var5, var1, var2); // L: 323
				}
			}
		}

	} // L: 328

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILky;Lkt;[Lum;I)V",
		garbageValue = "-2085055948"
	)
	void method5276(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5280(var1, var2, var3); // L: 331
		this.method5279(var1, var2, var3, var5); // L: 332
	} // L: 333

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IILky;Lkt;Lkl;I)V",
		garbageValue = "-2116518544"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 336
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 337
		if (var6 == -1 && var7 == -1) { // L: 338
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 339
		}

		int var8 = 16711935; // L: 341
		int var9;
		if (var7 != -1) { // L: 342
			int var10 = this.backgroundColor; // L: 344
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 348
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 349
				var11 = var12; // L: 350
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 353
				var12 = new FloorOverlayDefinition(); // L: 354
				if (var13 != null) { // L: 355
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 356
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 357
				var11 = var12; // L: 358
			}

			if (var11 == null) { // L: 361
				var9 = var10; // L: 362
			} else {
				int var14;
				int var15;
				if (var11.secondaryRgb >= 0) { // L: 365
					var15 = class344.method6653(var11.secondaryHue, var11.secondarySaturation, var11.secondaryLightness); // L: 366
					var14 = class36.method699(var15, 96); // L: 367
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216; // L: 368
				} else if (var11.texture >= 0) { // L: 370
					var15 = class36.method699(Rasterizer3D.field2528.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 371
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 372
				} else if (var11.primaryRgb == 16711935) { // L: 374
					var9 = var10; // L: 375
				} else {
					var15 = class344.method6653(var11.hue, var11.saturation, var11.lightness); // L: 378
					var14 = class36.method699(var15, 96); // L: 379
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216; // L: 380
				}
			}

			var8 = var9; // L: 383
		}

		if (var7 > -1 && var3.field3008[0][var1][var2] == 0) { // L: 385
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 386
		} else {
			var9 = this.method5278(var1, var2, var3, var5); // L: 389
			if (var7 == -1) { // L: 390
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 391
			} else {
				var4.method5662(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3008[0][var1][var2], var3.field2994[0][var1][var2]); // L: 394
			}
		}
	} // L: 387 392 395

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILky;Lkt;I)V",
		garbageValue = "-2140961749"
	)
	void method5314(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 398
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 399
			if (var6 > -1) { // L: 400
				int var8 = this.backgroundColor; // L: 402
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 406
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 407
					var9 = var10; // L: 408
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 411
					var10 = new FloorOverlayDefinition(); // L: 412
					if (var11 != null) { // L: 413
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 414
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 415
					var9 = var10; // L: 416
				}

				int var7;
				if (var9 == null) { // L: 419
					var7 = var8; // L: 420
				} else {
					int var12;
					int var13;
					if (var9.secondaryRgb >= 0) { // L: 423
						var13 = class344.method6653(var9.secondaryHue, var9.secondarySaturation, var9.secondaryLightness); // L: 424
						var12 = class36.method699(var13, 96); // L: 425
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 426
					} else if (var9.texture >= 0) { // L: 428
						var13 = class36.method699(Rasterizer3D.field2528.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 429
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 430
					} else if (var9.primaryRgb == 16711935) { // L: 432
						var7 = var8; // L: 433
					} else {
						var13 = class344.method6653(var9.hue, var9.saturation, var9.lightness); // L: 436
						var12 = class36.method699(var13, 96); // L: 437
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 438
					}
				}

				if (var3.field3008[var5][var1][var2] == 0) { // L: 442
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 443
				} else {
					var4.method5662(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3008[var5][var1][var2], var3.field2994[var5][var1][var2]); // L: 446
				}
			}
		}

	} // L: 450

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILky;Lkl;S)I",
		garbageValue = "500"
	)
	int method5278(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 453 454 456
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILky;[Lum;B)V",
		garbageValue = "-67"
	)
	void method5279(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 460
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 461
			if (var6 != null && var6.length != 0) { // L: 462
				WorldMapDecoration[] var7 = var6; // L: 466

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 467
					WorldMapDecoration var9 = var7[var8]; // L: 468
					int var11 = var9.decoration; // L: 471
					boolean var10 = var11 >= WorldMapDecorationType.field3820.id && var11 <= WorldMapDecorationType.field3821.id; // L: 473
					if (!var10) { // L: 476
						int var13 = var9.decoration; // L: 478
						boolean var12 = var13 == WorldMapDecorationType.field3809.id; // L: 480
						if (!var12) { // L: 482
							continue;
						}
					}

					ObjectComposition var14 = Language.getObjectDefinition(var9.objectDefinitionId); // L: 484
					if (var14.mapSceneId != -1) { // L: 485
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 486
							var4[var14.mapSceneId].method9508(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 490
						} else {
							var4[var14.mapSceneId].method9508(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 487
						}
					}
				}
			}
		}

	} // L: 498

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILky;B)V",
		garbageValue = "-109"
	)
	void method5280(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 501
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 502
			if (var5 != null && var5.length != 0) { // L: 503
				WorldMapDecoration[] var6 = var5; // L: 507

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 508
					WorldMapDecoration var8 = var6[var7]; // L: 509
					int var10 = var8.decoration; // L: 512
					boolean var9 = var10 >= WorldMapDecorationType.field3811.id && var10 <= WorldMapDecorationType.field3816.id || var10 == WorldMapDecorationType.field3814.id; // L: 514
					if (var9) { // L: 516
						ObjectComposition var11 = Language.getObjectDefinition(var8.objectDefinitionId); // L: 517
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 518
						if (var8.decoration == WorldMapDecorationType.field3811.id) { // L: 519
							this.method5294(var1, var2, var8.rotation, var12); // L: 520
						}

						if (var8.decoration == WorldMapDecorationType.field3802.id) { // L: 522
							this.method5294(var1, var2, var8.rotation, -3355444); // L: 523
							this.method5294(var1, var2, var8.rotation + 1, var12); // L: 524
						}

						if (var8.decoration == WorldMapDecorationType.field3816.id) { // L: 526
							if (var8.rotation == 0) { // L: 527
								Rasterizer2D.method9408(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) { // L: 528
								Rasterizer2D.method9408(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 529
								Rasterizer2D.method9408(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 530
								Rasterizer2D.method9408(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3814.id) { // L: 532
							int var13 = var8.rotation % 2; // L: 533
							int var14;
							if (var13 == 0) { // L: 534
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 535
									Rasterizer2D.method9408(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 536
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 540
									Rasterizer2D.method9408(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 541
								}
							}
						}
					}
				}
			}
		}

	} // L: 550

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1722049699"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 553
		float var6 = var5 / 2.0F; // L: 554
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 555

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 556
			Coord var9 = (Coord)var8.getKey(); // L: 558
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 559
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 560
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 561
			if (var12 != null && var12.hasValidElement()) { // L: 562
				var12.screenX = var10; // L: 563
				var12.screenY = var11; // L: 564
				WorldMapElement var13 = class127.WorldMapElement_get(var12.getElement()); // L: 565
				if (!var3.contains(var13.getObjectId())) { // L: 566
					this.method5365(var12, var10, var11, var5); // L: 567
				}
			}
		}

	} // L: 572

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-240677963"
	)
	void method5272(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 575

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 576
			if (var5.hasValidElement()) { // L: 578
				WorldMapElement var6 = class127.WorldMapElement_get(var5.getElement()); // L: 579
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 580
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 581
				}
			}
		}

	} // L: 585

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIIIB)V",
		garbageValue = "56"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 588
		if (var6 != null) { // L: 589
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 592
			if (var4 % var5 < var5 / 2) { // L: 593
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 594
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 595
			}

		}
	} // L: 590 597

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIFI)V",
		garbageValue = "-1697448450"
	)
	void method5365(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class127.WorldMapElement_get(var1.getElement()); // L: 600
		this.method5334(var5, var2, var3); // L: 601
		this.method5286(var1, var5, var2, var3, var4); // L: 602
	} // L: 603

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lhg;III)V",
		garbageValue = "-1701054639"
	)
	void method5334(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 606
		if (var4 != null) { // L: 607
			int var5 = this.method5288(var4, var1.horizontalAlignment); // L: 608
			int var6 = this.method5289(var4, var1.verticalAlignment); // L: 609
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 610
		}

	} // L: 612

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Lhg;IIFB)V",
		garbageValue = "-26"
	)
	void method5286(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 615
		if (var6 != null) { // L: 616
			if (var6.size.method5137(var5)) { // L: 619
				Font var7 = (Font)this.fonts.get(var6.size); // L: 622
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1940, 0, 1, 0, var7.ascent / 2); // L: 623
			}
		}
	} // L: 617 620 624

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1182908331"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 627
		Iterator var6 = this.icon0List.iterator(); // L: 628

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 629
			if (var7.hasValidElement()) { // L: 631
				int var8 = var7.coord2.x % 64; // L: 632
				int var9 = var7.coord2.y % 64; // L: 633
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 634
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9)); // L: 635
				if (!var3.contains(var7.getElement())) { // L: 636
					this.method5365(var7, var7.screenX, var7.screenY, var5); // L: 639
				}
			}
		}

	} // L: 642

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Luq;Lhu;B)I",
		garbageValue = "22"
	)
	int method5288(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 645
		case 0:
			return 0; // L: 656
		case 1:
			return -var1.subWidth / 2; // L: 652
		default:
			return -var1.subWidth; // L: 648
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Luq;Lhz;B)I",
		garbageValue = "-42"
	)
	int method5289(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 662
		case 0:
			return 0; // L: 665
		case 2:
			return -var1.subHeight / 2; // L: 669
		default:
			return -var1.subHeight; // L: 673
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)Lkc;",
		garbageValue = "1473443885"
	)
	WorldMapLabel method5290(int var1) {
		WorldMapElement var2 = class127.WorldMapElement_get(var1); // L: 700
		return this.createMapLabel(var2); // L: 701
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lhg;B)Lkc;",
		garbageValue = "8"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 705
			int var3 = var1.textSize; // L: 709
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method5144(); // L: 712
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 723
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 714
				if (var3 == var6.field2869) { // L: 716
					var2 = var6; // L: 717
					break;
				}

				++var5; // L: 713
			}

			if (var2 == null) { // L: 726
				return null; // L: 727
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 729
				if (var14 == null) { // L: 730
					return null; // L: 731
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 733
					String[] var7 = new String[var15]; // L: 734
					var14.breakLines(var1.name, (int[])null, var7); // L: 735
					int var8 = var7.length * var14.ascent / 2; // L: 736
					int var9 = 0; // L: 737
					String[] var10 = var7; // L: 739

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 740
						String var12 = var10[var11]; // L: 741
						int var13 = var14.stringWidth(var12); // L: 743
						if (var13 > var9) { // L: 744
							var9 = var13; // L: 745
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 750
				}
			}
		} else {
			return null; // L: 706
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "330527541"
	)
	List method5292(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 754
		if (var4 >= var1 && var5 >= var2) { // L: 755
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 756
				Iterator var7 = this.iconMap.values().iterator(); // L: 757

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 758
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 760
						var6.add(var8); // L: 761
					}
				}

				var7 = this.icon0List.iterator(); // L: 765

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 766
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 768
						var6.add(var8); // L: 769
					}
				}

				return var6; // L: 773
			} else {
				return var6; // L: 764
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-559181929"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 777
		var1.addAll(this.icon0List); // L: 778
		var1.addAll(this.iconMap.values()); // L: 779
		return var1; // L: 780
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-430894796"
	)
	void method5294(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 784
		if (var3 == 0) { // L: 785
			Rasterizer2D.method9410(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 786
			Rasterizer2D.method9408(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 787
			Rasterizer2D.method9410(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9408(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 788
		}

	} // L: 789

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	public static void method5378() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 37
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 38
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 39
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 40
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 41
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 42
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 43
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 44
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 45
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 46
		}
	} // L: 48
}
