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

@ObfuscatedName("jm")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -349145457
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 469172561
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("aa")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 932214009
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1812215657
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("aq")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("al")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("an")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 51
		this.regionY = var2; // L: 52
		this.worldMapData1List = new LinkedList(); // L: 53
		this.icon0List = new LinkedList(); // L: 54
		this.iconMap = new HashMap(); // L: 55
		this.backgroundColor = var3 | -16777216; // L: 56
		this.fonts = var4; // L: 57
	} // L: 58

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1536160939"
	)
	void method5254(int var1, int var2, int var3) {
		SpritePixels var4 = class135.method3051(this.regionX, this.regionY, this.pixelsPerTile); // L: 61
		if (var4 != null) { // L: 62
			if (var3 == this.pixelsPerTile * 64) { // L: 63
				var4.drawAt(var1, var2); // L: 64
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljx;Ljava/util/List;I)V",
		garbageValue = "-2004305210"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 72
		this.worldMapData_0 = var1; // L: 73
		this.addAllToIconList(var2); // L: 74
	} // L: 75

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-1161990566"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 78
		Iterator var3 = var1.iterator(); // L: 79

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 80
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 82
				this.worldMapData1List.add(var4); // L: 83
			}
		}

		this.addAllToIconList(var2); // L: 87
	} // L: 88

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIILke;I)V",
		garbageValue = "-1191453077"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 91
			label75:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 92
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 93
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 94
					if (var9 != null && var9.length != 0) { // L: 95
						WorldMapDecoration[] var10 = var9; // L: 99

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 100
							ObjectComposition var13;
							boolean var14;
							label66: {
								WorldMapDecoration var12 = var10[var11]; // L: 101
								var13 = WorldMapElement.getObjectDefinition(var12.objectDefinitionId); // L: 103
								if (var13.transforms != null) { // L: 106
									int[] var15 = var13.transforms; // L: 108

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 109
										int var17 = var15[var16]; // L: 110
										ObjectComposition var18 = WorldMapElement.getObjectDefinition(var17); // L: 112
										if (var18.mapIconId != -1) { // L: 113
											var14 = true; // L: 114
											break label66;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 121
									var14 = true; // L: 122
									break label66; // L: 123
								}

								var14 = false; // L: 125
							}

							if (var14) { // L: 127
								this.getIcon(var13, var8, var6, var7, var5); // L: 130
								continue label75; // L: 131
							}
						}
					}
				}
			}
		}

	} // L: 138

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhv;IIILke;I)V",
		garbageValue = "882689979"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 141
		Coord var7 = null; // L: 142
		if (this.worldMapData_0 != null) { // L: 143
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 144
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 147
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 148
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 151
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 152
		} else {
			var9 = class138.WorldMapElement_get(var1.mapIconId); // L: 155
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 156
		}

		var9 = class138.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 158
		if (var9.field1949) { // L: 159
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 160
		}

	} // L: 162

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1774548488"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 165

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 166
			if (var2 instanceof WorldMapIcon_1) { // L: 168
				((WorldMapIcon_1)var2).init(); // L: 169
			}
		}

	} // L: 173

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "67"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 176

		while (var2.hasNext()) { // L: 187
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 177
			if (class138.WorldMapElement_get(var3.element).field1949 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 179 182
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5291(var3.element)); // L: 183
				this.icon0List.add(var4); // L: 184
			}
		}

	} // L: 188

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2029792015"
	)
	void method5186() {
		if (this.worldMapData_0 != null) { // L: 191
			this.worldMapData_0.reset(); // L: 192
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 195

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 196
				var2.reset(); // L: 198
			}
		}

	} // L: 202

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)Z",
		garbageValue = "0"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 205
		if (this.worldMapData_0 != null) { // L: 206
			this.worldMapData_0.loadGeography(var1); // L: 207
			if (this.worldMapData_0.isFullyLoaded()) { // L: 208
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 209
				return true; // L: 210
			} else {
				return false; // L: 212
			}
		} else {
			boolean var2 = true; // L: 215

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 216 220 222
				var4 = (WorldMapData_1)var3.next(); // L: 217
				var4.loadGeography(var1); // L: 219
			}

			if (var2) { // L: 223
				var3 = this.worldMapData1List.iterator(); // L: 224

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 225
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 227
				}
			}

			return var2; // L: 231
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILku;[Luk;Lnu;Lnu;I)V",
		garbageValue = "-2013967337"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 236
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 237
			if (class135.method3051(this.regionX, this.regionY, var1) == null) { // L: 240
				boolean var6 = true; // L: 243
				var6 &= this.loadGeography(var4); // L: 244
				int var8;
				if (this.worldMapData_0 != null) { // L: 247
					var8 = this.worldMapData_0.groupId; // L: 248
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 251
				}

				var6 &= var5.tryLoadGroup(var8); // L: 253
				if (var6) { // L: 254
					byte[] var7 = var5.takeFileFlat(var8); // L: 255
					WorldMapSprite var9;
					if (var7 == null) { // L: 258
						var9 = new WorldMapSprite(); // L: 259
					} else {
						var9 = new WorldMapSprite(WorldMapData_1.method5347(var7).pixels); // L: 262
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 265
					var11.setRaster(); // L: 266
					if (this.worldMapData_0 != null) { // L: 267
						this.method5191(var2, var3, var9); // L: 268
					} else {
						this.method5192(var2, var3, var9); // L: 271
					}

					int var12 = this.regionX; // L: 273
					int var13 = this.regionY; // L: 274
					int var14 = this.pixelsPerTile; // L: 275
					DemotingHashTable var15 = WorldMapRegion_cachedSprites; // L: 277
					long var17 = (long)(var14 << 16 | var12 << 8 | var13); // L: 281
					var15.put(var11, var17, var11.pixels.length * 4); // L: 283
					this.method5186(); // L: 285
				}
			}
		}
	} // L: 238 241 286

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-949668643"
	)
	void method5189(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 289
			var4 = new HashSet(); // L: 290
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 292
		this.drawMapLinks(var1, var2, var4, var3); // L: 293
	} // L: 294

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "808374140"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 297

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 298
			if (var5.hasValidElement()) { // L: 300
				int var6 = var5.getElement(); // L: 301
				if (var1.contains(var6)) { // L: 302
					WorldMapElement var7 = class138.WorldMapElement_get(var6); // L: 303
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 304
				}
			}
		}

		this.method5225(var1, var2, var3); // L: 308
	} // L: 309

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lku;[Luk;Lkd;B)V",
		garbageValue = "-44"
	)
	void method5191(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 312
			for (var5 = 0; var5 < 64; ++var5) { // L: 313
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 314
				this.method5195(var4, var5, this.worldMapData_0, var1); // L: 315
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 318
			for (var5 = 0; var5 < 64; ++var5) { // L: 319
				this.method5299(var4, var5, this.worldMapData_0, var1, var2); // L: 320
			}
		}

	} // L: 323

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lku;[Luk;Lkd;I)V",
		garbageValue = "-2115982333"
	)
	void method5192(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 326

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 327

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 329
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 330
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 331
					this.method5195(var6, var7, var5, var1); // L: 332
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 337

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 338

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 340
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 341
					this.method5299(var6, var7, var5, var1, var2); // L: 342
				}
			}
		}

	} // L: 347

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILke;Lku;[Luk;B)V",
		garbageValue = "32"
	)
	void method5299(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5287(var1, var2, var3); // L: 350
		this.method5197(var1, var2, var3, var5); // L: 351
	} // L: 352

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILke;Lku;Lkd;I)V",
		garbageValue = "-1336656209"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 355
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 356
		if (var6 == -1 && var7 == -1) { // L: 357
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 358
		}

		int var8 = 16711935; // L: 360
		int var9;
		if (var7 != -1) { // L: 361
			int var10 = this.backgroundColor; // L: 363
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 367
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 368
				var11 = var12; // L: 369
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 372
				var12 = new FloorOverlayDefinition(); // L: 373
				if (var13 != null) { // L: 374
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 375
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 376
				var11 = var12; // L: 377
			}

			if (var11 == null) { // L: 380
				var9 = var10; // L: 381
			} else {
				int var14;
				int var15;
				if (var11.secondaryRgb >= 0) { // L: 384
					var15 = HitSplatDefinition.method3887(var11.secondaryHue, var11.secondarySaturation, var11.secondaryLightness); // L: 385
					var14 = ApproximateRouteStrategy.method1227(var15, 96); // L: 386
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216; // L: 387
				} else if (var11.texture >= 0) { // L: 389
					var15 = ApproximateRouteStrategy.method1227(Rasterizer3D.field2536.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 390
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216; // L: 391
				} else if (var11.primaryRgb == 16711935) { // L: 393
					var9 = var10; // L: 394
				} else {
					var15 = HitSplatDefinition.method3887(var11.hue, var11.saturation, var11.lightness); // L: 397
					var14 = ApproximateRouteStrategy.method1227(var15, 96); // L: 398
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216; // L: 399
				}
			}

			var8 = var9; // L: 402
		}

		if (var7 > -1 && var3.field3014[0][var1][var2] == 0) { // L: 404
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 405
		} else {
			var9 = this.method5196(var1, var2, var3, var5); // L: 408
			if (var7 == -1) { // L: 409
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 410
			} else {
				var4.method5623(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3014[0][var1][var2], var3.field3000[0][var1][var2]); // L: 413
			}
		}
	} // L: 406 411 414

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILke;Lku;I)V",
		garbageValue = "-1187093526"
	)
	void method5195(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 417
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 418
			if (var6 > -1) { // L: 419
				int var8 = this.backgroundColor; // L: 421
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 425
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 426
					var9 = var10; // L: 427
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 430
					var10 = new FloorOverlayDefinition(); // L: 431
					if (var11 != null) { // L: 432
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 433
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 434
					var9 = var10; // L: 435
				}

				int var7;
				if (var9 == null) { // L: 438
					var7 = var8; // L: 439
				} else {
					int var12;
					int var13;
					if (var9.secondaryRgb >= 0) { // L: 442
						var13 = HitSplatDefinition.method3887(var9.secondaryHue, var9.secondarySaturation, var9.secondaryLightness); // L: 443
						var12 = ApproximateRouteStrategy.method1227(var13, 96); // L: 444
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 445
					} else if (var9.texture >= 0) { // L: 447
						var13 = ApproximateRouteStrategy.method1227(Rasterizer3D.field2536.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 448
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 449
					} else if (var9.primaryRgb == 16711935) { // L: 451
						var7 = var8; // L: 452
					} else {
						var13 = HitSplatDefinition.method3887(var9.hue, var9.saturation, var9.lightness); // L: 455
						var12 = ApproximateRouteStrategy.method1227(var13, 96); // L: 456
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 457
					}
				}

				if (var3.field3014[var5][var1][var2] == 0) { // L: 461
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 462
				} else {
					var4.method5623(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3014[var5][var1][var2], var3.field3000[var5][var1][var2]); // L: 465
				}
			}
		}

	} // L: 469

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILke;Lkd;I)I",
		garbageValue = "-1267425507"
	)
	int method5196(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 472 473 475
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILke;[Luk;I)V",
		garbageValue = "-2109687749"
	)
	void method5197(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 479
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 480
			if (var6 != null && var6.length != 0) { // L: 481
				WorldMapDecoration[] var7 = var6; // L: 485

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 486
					WorldMapDecoration var9 = var7[var8]; // L: 487
					if (!WorldMapLabel.method5489(var9.decoration)) { // L: 490
						int var11 = var9.decoration; // L: 492
						boolean var10 = var11 == WorldMapDecorationType.field3845.id; // L: 494
						if (!var10) { // L: 496
							continue;
						}
					}

					ObjectComposition var12 = WorldMapElement.getObjectDefinition(var9.objectDefinitionId); // L: 498
					if (var12.mapSceneId != -1) { // L: 499
						if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 500
							var4[var12.mapSceneId].method9480(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 504
						} else {
							var4[var12.mapSceneId].method9480(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 501
						}
					}
				}
			}
		}

	} // L: 512

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILke;I)V",
		garbageValue = "-1752874267"
	)
	void method5287(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 515
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 516
			if (var5 != null && var5.length != 0) { // L: 517
				WorldMapDecoration[] var6 = var5; // L: 521

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 522
					WorldMapDecoration var8 = var6[var7]; // L: 523
					if (class101.method2640(var8.decoration)) { // L: 525
						ObjectComposition var9 = WorldMapElement.getObjectDefinition(var8.objectDefinitionId); // L: 526
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 527
						if (var8.decoration == WorldMapDecorationType.field3828.id) { // L: 528
							this.method5212(var1, var2, var8.rotation, var10); // L: 529
						}

						if (var8.decoration == WorldMapDecorationType.field3825.id) { // L: 531
							this.method5212(var1, var2, var8.rotation, -3355444); // L: 532
							this.method5212(var1, var2, var8.rotation + 1, var10); // L: 533
						}

						if (var8.decoration == WorldMapDecorationType.field3826.id) { // L: 535
							if (var8.rotation == 0) { // L: 536
								Rasterizer2D.method9410(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9410(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 537
							}

							if (var8.rotation == 2) { // L: 538
								Rasterizer2D.method9410(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 539
								Rasterizer2D.method9410(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3844.id) { // L: 541
							int var11 = var8.rotation % 2; // L: 542
							int var12;
							if (var11 == 0) { // L: 543
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 544
									Rasterizer2D.method9410(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 545
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 549
									Rasterizer2D.method9410(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 550
								}
							}
						}
					}
				}
			}
		}

	} // L: 559

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-13"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 562
		float var6 = var5 / 2.0F; // L: 563
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 564

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 565
			Coord var9 = (Coord)var8.getKey(); // L: 567
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 568
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 569
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 570
			if (var12 != null && var12.hasValidElement()) { // L: 571
				var12.screenX = var10; // L: 572
				var12.screenY = var11; // L: 573
				WorldMapElement var13 = class138.WorldMapElement_get(var12.getElement()); // L: 574
				if (!var3.contains(var13.getObjectId())) { // L: 575
					this.method5183(var12, var10, var11, var5); // L: 576
				}
			}
		}

	} // L: 581

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1452687017"
	)
	void method5225(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 584

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 585
			if (var5.hasValidElement()) { // L: 587
				WorldMapElement var6 = class138.WorldMapElement_get(var5.getElement()); // L: 588
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 589
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 590
				}
			}
		}

	} // L: 594

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lhd;IIIII)V",
		garbageValue = "-54232319"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 597
		if (var6 != null) { // L: 598
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 601
			if (var4 % var5 < var5 / 2) { // L: 602
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 603
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 604
			}

		}
	} // L: 599 606

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkp;IIFB)V",
		garbageValue = "-45"
	)
	void method5183(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class138.WorldMapElement_get(var1.getElement()); // L: 609
		this.method5203(var5, var2, var3); // L: 610
		this.method5204(var1, var5, var2, var3, var4); // L: 611
	} // L: 612

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lhd;III)V",
		garbageValue = "1788573667"
	)
	void method5203(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 615
		if (var4 != null) { // L: 616
			int var5 = this.method5188(var4, var1.horizontalAlignment); // L: 617
			int var6 = this.method5207(var4, var1.verticalAlignment); // L: 618
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 619
		}

	} // L: 621

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lkp;Lhd;IIFI)V",
		garbageValue = "1203085844"
	)
	void method5204(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 624
		if (var6 != null) { // L: 625
			if (var6.size.method5058(var5)) { // L: 628
				Font var7 = (Font)this.fonts.get(var6.size); // L: 631
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1953, 0, 1, 0, var7.ascent / 2); // L: 632
			}
		}
	} // L: 626 629 633

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-21"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 636
		Iterator var6 = this.icon0List.iterator(); // L: 637

		while (var6.hasNext()) { // L: 646
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 638
			if (var7.hasValidElement()) { // L: 640
				int var8 = var7.coord2.x % 64; // L: 641
				int var9 = var7.coord2.y % 64; // L: 642
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 643
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 644
				if (!var3.contains(var7.getElement())) { // L: 645
					this.method5183(var7, var7.screenX, var7.screenY, var5); // L: 648
				}
			}
		}

	} // L: 651

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lui;Lhe;I)I",
		garbageValue = "2074198968"
	)
	int method5188(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 654
		case 0:
			return 0; // L: 657
		case 2:
			return -var1.subWidth / 2; // L: 661
		default:
			return -var1.subWidth; // L: 665
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lui;Lhy;I)I",
		garbageValue = "693958436"
	)
	int method5207(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 671
		case 0:
			return -var1.subHeight / 2; // L: 678
		case 1:
			return 0; // L: 674
		default:
			return -var1.subHeight; // L: 682
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkq;",
		garbageValue = "-90"
	)
	WorldMapLabel method5291(int var1) {
		WorldMapElement var2 = class138.WorldMapElement_get(var1); // L: 688
		return this.createMapLabel(var2); // L: 689
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lhd;I)Lkq;",
		garbageValue = "-1839741951"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 693
			int var3 = var1.textSize; // L: 697
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large}; // L: 702
			WorldMapLabelSize[] var5 = var4; // L: 704
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 715
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 706
				if (var3 == var7.field2880) { // L: 708
					var2 = var7; // L: 709
					break;
				}

				++var6; // L: 705
			}

			if (var2 == null) { // L: 718
				return null; // L: 719
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 721
				if (var14 == null) { // L: 722
					return null; // L: 723
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 725
					String[] var15 = new String[var6]; // L: 726
					var14.breakLines(var1.name, (int[])null, var15); // L: 727
					int var8 = var15.length * var14.ascent / 2; // L: 728
					int var9 = 0; // L: 729
					String[] var10 = var15; // L: 731

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 732
						String var12 = var10[var11]; // L: 733
						int var13 = var14.stringWidth(var12); // L: 735
						if (var13 > var9) { // L: 736
							var9 = var13; // L: 737
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 742
				}
			}
		} else {
			return null; // L: 694
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "4"
	)
	List method5210(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 746
		if (var4 >= var1 && var5 >= var2) { // L: 747
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 748
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 749
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 750
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 752
						var6.add(var8); // L: 753
					}
				}

				var7 = this.icon0List.iterator(); // L: 757

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 758
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 760
						var6.add(var8); // L: 761
					}
				}

				return var6; // L: 765
			} else {
				return var6; // L: 756
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "4"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 769
		var1.addAll(this.icon0List); // L: 770
		var1.addAll(this.iconMap.values()); // L: 771
		return var1; // L: 772
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-29"
	)
	void method5212(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 776
		if (var3 == 0) { // L: 777
			Rasterizer2D.method9385(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 778
			Rasterizer2D.method9410(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 779
			Rasterizer2D.method9385(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9410(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 780
		}

	} // L: 781
}
