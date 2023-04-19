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

@ObfuscatedName("jr")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2122501643
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1858063995
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("at")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 973203971
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1897887643
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ao")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ax")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ai")
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "6"
	)
	void method5165(int var1, int var2, int var3) {
		SpritePixels var4 = VarpDefinition.method3654(this.regionX, this.regionY, this.pixelsPerTile); // L: 60
		if (var4 != null) { // L: 61
			if (var3 == this.pixelsPerTile * 64) { // L: 62
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	} // L: 68

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljm;Ljava/util/List;I)V",
		garbageValue = "1780260388"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 71
		this.worldMapData_0 = var1; // L: 72
		this.addAllToIconList(var2); // L: 73
	} // L: 74

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "1961953252"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 77
		Iterator var3 = var1.iterator(); // L: 78

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 79
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 81
				this.worldMapData1List.add(var4); // L: 82
			}
		}

		this.addAllToIconList(var2); // L: 86
	} // L: 87

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjz;I)V",
		garbageValue = "791967957"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 90
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 91
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 92
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 93
					if (var9 != null && var9.length != 0) { // L: 94
						WorldMapDecoration[] var10 = var9; // L: 98

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 99
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11]; // L: 100
								var13 = class144.getObjectDefinition(var12.objectDefinitionId); // L: 102
								if (var13.transforms != null) { // L: 105
									int[] var15 = var13.transforms; // L: 107

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 108
										int var17 = var15[var16]; // L: 109
										ObjectComposition var18 = class144.getObjectDefinition(var17); // L: 111
										if (var18.mapIconId != -1) { // L: 112
											var14 = true; // L: 113
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 120
									var14 = true; // L: 121
									break label67; // L: 122
								}

								var14 = false; // L: 124
							}

							if (var14) { // L: 126
								this.getIcon(var13, var8, var6, var7, var5); // L: 129
								continue label76; // L: 130
							}
						}
					}
				}
			}
		}

	} // L: 137

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIILjz;I)V",
		garbageValue = "881675685"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 140
		Coord var7 = null; // L: 141
		if (this.worldMapData_0 != null) { // L: 142
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, var4 + this.worldMapData_0.regionYLow * 64); // L: 143
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 146
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 147
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 150
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 151
		} else {
			var9 = class354.WorldMapElement_get(var1.mapIconId); // L: 154
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 155
		}

		var9 = class354.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 157
		if (var9.field1923) { // L: 158
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 159
		}

	} // L: 161

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1575710248"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 164

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 165
			if (var2 instanceof WorldMapIcon_1) { // L: 167
				((WorldMapIcon_1)var2).init(); // L: 168
			}
		}

	} // L: 172

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;S)V",
		garbageValue = "10781"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 175

		while (var2.hasNext()) { // L: 186
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 176
			if (class354.WorldMapElement_get(var3.element).field1923 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 178 181
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5193(var3.element)); // L: 182
				this.icon0List.add(var4); // L: 183
			}
		}

	} // L: 187

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1615699563"
	)
	void method5172() {
		if (this.worldMapData_0 != null) { // L: 190
			this.worldMapData_0.reset(); // L: 191
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 194

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 195
				var2.reset(); // L: 197
			}
		}

	} // L: 201

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnm;S)Z",
		garbageValue = "8372"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 204
		if (this.worldMapData_0 != null) { // L: 205
			this.worldMapData_0.loadGeography(var1); // L: 206
			if (this.worldMapData_0.isFullyLoaded()) { // L: 207
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 208
				return true; // L: 209
			} else {
				return false; // L: 211
			}
		} else {
			boolean var2 = true; // L: 214

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 215 219
				var4 = (WorldMapData_1)var3.next(); // L: 216
				var4.loadGeography(var1); // L: 218
			}

			if (var2) { // L: 222
				var3 = this.worldMapData1List.iterator(); // L: 223

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 224
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 226
				}
			}

			return var2; // L: 230
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILkj;[Ltc;Lnm;Lnm;I)V",
		garbageValue = "-818426546"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 235
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 236
			if (VarpDefinition.method3654(this.regionX, this.regionY, var1) == null) { // L: 239
				boolean var6 = true; // L: 242
				var6 &= this.loadGeography(var4); // L: 243
				int var8;
				if (this.worldMapData_0 != null) { // L: 246
					var8 = this.worldMapData_0.groupId; // L: 247
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 250
				}

				var6 &= var5.tryLoadGroup(var8); // L: 252
				if (var6) { // L: 253
					byte[] var7 = var5.takeFileFlat(var8); // L: 254
					WorldMapSprite var9;
					if (var7 == null) { // L: 257
						var9 = new WorldMapSprite(); // L: 258
					} else {
						var9 = new WorldMapSprite(Strings.method6601(var7).pixels); // L: 261
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 264
					var11.setRaster(); // L: 265
					if (this.worldMapData_0 != null) { // L: 266
						this.method5177(var2, var3, var9); // L: 267
					} else {
						this.method5202(var2, var3, var9); // L: 270
					}

					int var12 = this.regionX; // L: 272
					int var13 = this.regionY; // L: 273
					int var14 = this.pixelsPerTile; // L: 274
					WorldMapRegion_cachedSprites.put(var11, BuddyRankComparator.method2959(var12, var13, var14), var11.pixels.length * 4); // L: 276
					this.method5172(); // L: 278
				}
			}
		}
	} // L: 237 240 279

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "-48"
	)
	void method5175(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 282
			var4 = new HashSet(); // L: 283
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 285
		this.drawMapLinks(var1, var2, var4, var3); // L: 286
	} // L: 287

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1521624109"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 290

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 291
			if (var5.hasValidElement()) { // L: 293
				int var6 = var5.getElement(); // L: 294
				if (var1.contains(var6)) { // L: 295
					WorldMapElement var7 = class354.WorldMapElement_get(var6); // L: 296
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 297
				}
			}
		}

		this.method5164(var1, var2, var3); // L: 301
	} // L: 302

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lkj;[Ltc;Lkc;B)V",
		garbageValue = "84"
	)
	void method5177(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 305
			for (var5 = 0; var5 < 64; ++var5) { // L: 306
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 307
				this.method5262(var4, var5, this.worldMapData_0, var1); // L: 308
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 311
			for (var5 = 0; var5 < 64; ++var5) { // L: 312
				this.method5179(var4, var5, this.worldMapData_0, var1, var2); // L: 313
			}
		}

	} // L: 316

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lkj;[Ltc;Lkc;I)V",
		garbageValue = "390308152"
	)
	void method5202(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 319

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 320

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 322
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 323
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 324
					this.method5262(var6, var7, var5, var1); // L: 325
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 330

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 331

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 333
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 334
					this.method5179(var6, var7, var5, var1, var2); // L: 335
				}
			}
		}

	} // L: 340

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILjz;Lkj;[Ltc;I)V",
		garbageValue = "-711908357"
	)
	void method5179(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5184(var1, var2, var3); // L: 343
		this.method5233(var1, var2, var3, var5); // L: 344
	} // L: 345

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILjz;Lkj;Lkc;I)V",
		garbageValue = "-2045075746"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 348
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 349
		if (var6 == -1 && var7 == -1) { // L: 350
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 351
		}

		int var8 = 16711935; // L: 353
		int var9;
		if (var7 != -1) { // L: 354
			int var10 = this.backgroundColor; // L: 356
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 360
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 361
				var11 = var12; // L: 362
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 365
				var12 = new FloorOverlayDefinition(); // L: 366
				if (var13 != null) { // L: 367
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 368
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 369
				var11 = var12; // L: 370
			}

			if (var11 == null) { // L: 373
				var9 = var10; // L: 374
			} else {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var11.secondaryRgb >= 0) { // L: 377
					var14 = var11.secondaryHue; // L: 379
					var15 = var11.secondarySaturation; // L: 380
					var16 = var11.secondaryLightness; // L: 381
					if (var16 > 179) { // L: 383
						var15 /= 2;
					}

					if (var16 > 192) { // L: 384
						var15 /= 2;
					}

					if (var16 > 217) { // L: 385
						var15 /= 2;
					}

					if (var16 > 243) { // L: 386
						var15 /= 2;
					}

					var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 387
					var18 = class97.method2652(var17, 96); // L: 391
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 392
				} else if (var11.texture >= 0) { // L: 394
					int var19 = class97.method2652(Rasterizer3D.field2514.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 395
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216; // L: 396
				} else if (var11.primaryRgb == 16711935) { // L: 398
					var9 = var10; // L: 399
				} else {
					var14 = var11.hue; // L: 403
					var15 = var11.saturation; // L: 404
					var16 = var11.lightness; // L: 405
					if (var16 > 179) { // L: 407
						var15 /= 2;
					}

					if (var16 > 192) { // L: 408
						var15 /= 2;
					}

					if (var16 > 217) { // L: 409
						var15 /= 2;
					}

					if (var16 > 243) { // L: 410
						var15 /= 2;
					}

					var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 411
					var18 = class97.method2652(var17, 96); // L: 415
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 416
				}
			}

			var8 = var9; // L: 419
		}

		if (var7 > -1 && var3.field2990[0][var1][var2] == 0) { // L: 421
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 422
		} else {
			var9 = this.method5182(var1, var2, var3, var5); // L: 425
			if (var7 == -1) { // L: 426
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 427
			} else {
				var4.method5568(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2990[0][var1][var2], var3.field2996[0][var1][var2]); // L: 430
			}
		}
	} // L: 423 428 431

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILjz;Lkj;I)V",
		garbageValue = "1395300206"
	)
	void method5262(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 434
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 435
			if (var6 > -1) { // L: 436
				int var8 = this.backgroundColor; // L: 438
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 442
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 443
					var9 = var10; // L: 444
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 447
					var10 = new FloorOverlayDefinition(); // L: 448
					if (var11 != null) { // L: 449
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 450
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 451
					var9 = var10; // L: 452
				}

				int var7;
				if (var9 == null) { // L: 455
					var7 = var8; // L: 456
				} else {
					int var12;
					int var13;
					int var14;
					int var15;
					int var16;
					if (var9.secondaryRgb >= 0) { // L: 459
						var12 = var9.secondaryHue; // L: 461
						var13 = var9.secondarySaturation; // L: 462
						var14 = var9.secondaryLightness; // L: 463
						if (var14 > 179) { // L: 465
							var13 /= 2;
						}

						if (var14 > 192) { // L: 466
							var13 /= 2;
						}

						if (var14 > 217) { // L: 467
							var13 /= 2;
						}

						if (var14 > 243) { // L: 468
							var13 /= 2;
						}

						var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 469
						var16 = class97.method2652(var15, 96); // L: 473
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 474
					} else if (var9.texture >= 0) { // L: 476
						int var17 = class97.method2652(Rasterizer3D.field2514.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 477
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 478
					} else if (var9.primaryRgb == 16711935) { // L: 480
						var7 = var8; // L: 481
					} else {
						var12 = var9.hue; // L: 485
						var13 = var9.saturation; // L: 486
						var14 = var9.lightness; // L: 487
						if (var14 > 179) { // L: 489
							var13 /= 2;
						}

						if (var14 > 192) { // L: 490
							var13 /= 2;
						}

						if (var14 > 217) { // L: 491
							var13 /= 2;
						}

						if (var14 > 243) { // L: 492
							var13 /= 2;
						}

						var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 493
						var16 = class97.method2652(var15, 96); // L: 497
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 498
					}
				}

				if (var3.field2990[var5][var1][var2] == 0) { // L: 502
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 503
				} else {
					var4.method5568(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2990[var5][var1][var2], var3.field2996[var5][var1][var2]); // L: 506
				}
			}
		}

	} // L: 510

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILjz;Lkc;I)I",
		garbageValue = "390149173"
	)
	int method5182(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 513 514 516
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjz;[Ltc;I)V",
		garbageValue = "-926949025"
	)
	void method5233(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 520
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 521
			if (var6 != null && var6.length != 0) { // L: 522
				WorldMapDecoration[] var7 = var6; // L: 526

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 527
					WorldMapDecoration var9 = var7[var8]; // L: 528
					if (!ItemLayer.method4307(var9.decoration)) { // L: 531
						int var11 = var9.decoration; // L: 533
						boolean var10 = var11 == WorldMapDecorationType.field3770.id; // L: 535
						if (!var10) { // L: 537
							continue;
						}
					}

					ObjectComposition var12 = class144.getObjectDefinition(var9.objectDefinitionId); // L: 539
					if (var12.mapSceneId != -1) { // L: 540
						if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 541
							var4[var12.mapSceneId].method9492(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 545
						} else {
							var4[var12.mapSceneId].method9492(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 542
						}
					}
				}
			}
		}

	} // L: 553

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILjz;I)V",
		garbageValue = "-1855512856"
	)
	void method5184(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 556
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 557
			if (var5 != null && var5.length != 0) { // L: 558
				WorldMapDecoration[] var6 = var5; // L: 562

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 563
					WorldMapDecoration var8 = var6[var7]; // L: 564
					int var10 = var8.decoration; // L: 567
					boolean var9 = var10 >= WorldMapDecorationType.field3751.id && var10 <= WorldMapDecorationType.field3754.id || var10 == WorldMapDecorationType.field3752.id; // L: 569
					if (var9) { // L: 571
						ObjectComposition var11 = class144.getObjectDefinition(var8.objectDefinitionId); // L: 572
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 573
						if (var8.decoration == WorldMapDecorationType.field3751.id) { // L: 574
							this.method5188(var1, var2, var8.rotation, var12); // L: 575
						}

						if (var8.decoration == WorldMapDecorationType.field3750.id) { // L: 577
							this.method5188(var1, var2, var8.rotation, -3355444); // L: 578
							this.method5188(var1, var2, var8.rotation + 1, var12); // L: 579
						}

						if (var8.decoration == WorldMapDecorationType.field3754.id) { // L: 581
							if (var8.rotation == 0) { // L: 582
								Rasterizer2D.method9400(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) { // L: 583
								Rasterizer2D.method9400(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 584
								Rasterizer2D.method9400(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 585
								Rasterizer2D.method9400(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3752.id) { // L: 587
							int var13 = var8.rotation % 2; // L: 588
							int var14;
							if (var13 == 0) { // L: 589
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 590
									Rasterizer2D.method9400(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 591
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 595
									Rasterizer2D.method9400(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 596
								}
							}
						}
					}
				}
			}
		}

	} // L: 605

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1769642683"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 608
		float var6 = var5 / 2.0F; // L: 609
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 610

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 611
			Coord var9 = (Coord)var8.getKey(); // L: 613
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 614
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 615
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 616
			if (var12 != null && var12.hasValidElement()) { // L: 617
				var12.screenX = var10; // L: 618
				var12.screenY = var11; // L: 619
				WorldMapElement var13 = class354.WorldMapElement_get(var12.getElement()); // L: 620
				if (!var3.contains(var13.getObjectId())) { // L: 621
					this.method5187(var12, var10, var11, var5); // L: 622
				}
			}
		}

	} // L: 627

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIS)V",
		garbageValue = "20836"
	)
	void method5164(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 630

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 631
			if (var5.hasValidElement()) { // L: 633
				WorldMapElement var6 = class354.WorldMapElement_get(var5.getElement()); // L: 634
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 635
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 636
				}
			}
		}

	} // L: 640

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhw;IIIII)V",
		garbageValue = "-1649381751"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 643
		if (var6 != null) { // L: 644
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 647
			if (var4 % var5 < var5 / 2) { // L: 648
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 649
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 650
			}

		}
	} // L: 645 652

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lkg;IIFB)V",
		garbageValue = "62"
	)
	void method5187(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class354.WorldMapElement_get(var1.getElement()); // L: 655
		this.method5221(var5, var2, var3); // L: 656
		this.method5192(var1, var5, var2, var3, var4); // L: 657
	} // L: 658

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lhw;IIB)V",
		garbageValue = "0"
	)
	void method5221(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 661
		if (var4 != null) { // L: 662
			int var5 = this.method5205(var4, var1.horizontalAlignment); // L: 663
			int var6 = this.method5181(var4, var1.verticalAlignment); // L: 664
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 665
		}

	} // L: 667

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lkg;Lhw;IIFB)V",
		garbageValue = "8"
	)
	void method5192(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 670
		if (var6 != null) { // L: 671
			if (var6.size.method5046(var5)) { // L: 674
				Font var7 = (Font)this.fonts.get(var6.size); // L: 677
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1917, 0, 1, 0, var7.ascent / 2); // L: 678
			}
		}
	} // L: 672 675 679

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-2097457957"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 682
		Iterator var6 = this.icon0List.iterator(); // L: 683

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 684
			if (var7.hasValidElement()) { // L: 686
				int var8 = var7.coord2.x % 64; // L: 687
				int var9 = var7.coord2.y % 64; // L: 688
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 689
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 690
				if (!var3.contains(var7.getElement())) { // L: 691
					this.method5187(var7, var7.screenX, var7.screenY, var5); // L: 694
				}
			}
		}

	} // L: 697

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ltq;Lhd;B)I",
		garbageValue = "30"
	)
	int method5205(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 700
		case 0:
			return 0; // L: 703
		case 2:
			return -var1.subWidth / 2; // L: 707
		default:
			return -var1.subWidth; // L: 711
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ltq;Lhn;I)I",
		garbageValue = "-1956047929"
	)
	int method5181(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 717
		case 1:
			return -var1.subHeight / 2; // L: 724
		case 2:
			return 0; // L: 728
		default:
			return -var1.subHeight; // L: 720
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)Lku;",
		garbageValue = "-1151256626"
	)
	WorldMapLabel method5193(int var1) {
		WorldMapElement var2 = class354.WorldMapElement_get(var1); // L: 734
		return this.createMapLabel(var2); // L: 735
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)Lku;",
		garbageValue = "433294126"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 739
			WorldMapLabelSize var2 = WorldMapLabelSize.method5047(var1.textSize); // L: 742
			if (var2 == null) { // L: 743
				return null; // L: 744
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 746
				if (var3 == null) { // L: 747
					return null; // L: 748
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 750
					String[] var5 = new String[var4]; // L: 751
					var3.breakLines(var1.name, (int[])null, var5); // L: 752
					int var6 = var5.length * var3.ascent / 2; // L: 753
					int var7 = 0; // L: 754
					String[] var8 = var5; // L: 756

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 757
						String var10 = var8[var9]; // L: 758
						int var11 = var3.stringWidth(var10); // L: 760
						if (var11 > var7) { // L: 761
							var7 = var11; // L: 762
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 767
				}
			}
		} else {
			return null; // L: 740
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-100"
	)
	List method5264(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 771
		if (var4 >= var1 && var5 >= var2) { // L: 772
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 773
				Iterator var7 = this.iconMap.values().iterator(); // L: 774

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 775
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 777
						var6.add(var8); // L: 778
					}
				}

				var7 = this.icon0List.iterator(); // L: 782

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 783
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 785
						var6.add(var8); // L: 786
					}
				}

				return var6; // L: 790
			} else {
				return var6; // L: 781
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "26"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 794
		var1.addAll(this.icon0List); // L: 795
		var1.addAll(this.iconMap.values()); // L: 796
		return var1; // L: 797
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	void method5188(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 801
		if (var3 == 0) { // L: 802
			Rasterizer2D.method9439(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 803
			Rasterizer2D.method9400(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 804
			Rasterizer2D.method9439(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9400(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 805
		}

	} // L: 806

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-28927295"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69
}
