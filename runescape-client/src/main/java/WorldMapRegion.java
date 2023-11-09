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

@ObfuscatedName("hp")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	static Archive field2708;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -295948569
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 20438857
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("h")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1250201981
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 112229007
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("n")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("x")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("g")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-25"
	)
	void method4658(int var1, int var2, int var3) {
		SpritePixels var4 = Language.method6088(this.regionX, this.regionY, this.pixelsPerTile); // L: 65
		if (var4 != null) { // L: 66
			if (var3 == this.pixelsPerTile * 64) { // L: 67
				var4.drawAt(var1, var2); // L: 68
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhb;Ljava/util/List;I)V",
		garbageValue = "-1317342986"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1; // L: 77
		this.addAllToIconList(var2);
	} // L: 79

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "2077127138"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIILht;I)V",
		garbageValue = "1264264345"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 95
			label75:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 96
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 97
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 98
					if (var9 != null && var9.length != 0) { // L: 99
						WorldMapDecoration[] var10 = var9; // L: 103

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 104
							ObjectComposition var13;
							boolean var14;
							label66: {
								WorldMapDecoration var12 = var10[var11]; // L: 105
								var13 = WorldMapDecoration.getObjectDefinition(var12.objectDefinitionId); // L: 107
								if (var13.transforms != null) { // L: 110
									int[] var15 = var13.transforms; // L: 112

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 113
										int var17 = var15[var16]; // L: 114
										ObjectComposition var18 = WorldMapDecoration.getObjectDefinition(var17); // L: 116
										if (var18.mapIconId != -1) { // L: 117
											var14 = true; // L: 118
											break label66;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 125
									var14 = true; // L: 126
									break label66; // L: 127
								}

								var14 = false; // L: 129
							}

							if (var14) { // L: 131
								this.getIcon(var13, var8, var6, var7, var5); // L: 134
								continue label75; // L: 135
							}
						}
					}
				}
			}
		}

	} // L: 142

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgx;IIILht;I)V",
		garbageValue = "1287274151"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 145
		Coord var7 = null; // L: 146
		if (this.worldMapData_0 != null) { // L: 147
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4); // L: 148
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 151
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8); // L: 152
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 155
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 156
		} else {
			var9 = TileItem.WorldMapElement_get(var1.mapIconId); // L: 159
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 160
		}

		var9 = TileItem.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 162
		if (var9.field1828) { // L: 163
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 164
		}

	} // L: 166

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1833965606"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 169

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 170
			if (var2 instanceof WorldMapIcon_1) { // L: 172
				((WorldMapIcon_1)var2).init(); // L: 173
			}
		}

	} // L: 177

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "2006591851"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 180

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 181
			if (TileItem.WorldMapElement_get(var3.element).field1828 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 183 186
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4687(var3.element)); // L: 187
				this.icon0List.add(var4); // L: 188
			}
		}

	} // L: 192

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1101661346"
	)
	void method4657() {
		if (this.worldMapData_0 != null) { // L: 195
			this.worldMapData_0.reset(); // L: 196
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 199

			while (var1.hasNext()) { // L: 204
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 200
				var2.reset(); // L: 202
			}
		}

	} // L: 206

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)Z",
		garbageValue = "-1367339058"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 209
		if (this.worldMapData_0 != null) { // L: 210
			this.worldMapData_0.loadGeography(var1); // L: 211
			if (this.worldMapData_0.isFullyLoaded()) { // L: 212
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 213
				return true; // L: 214
			} else {
				return false; // L: 216
			}
		} else {
			boolean var2 = true; // L: 219

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 220 224
				var4 = (WorldMapData_1)var3.next(); // L: 221
				var4.loadGeography(var1); // L: 223
			}

			if (var2) { // L: 227
				var3 = this.worldMapData1List.iterator(); // L: 228

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 229
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 231
				}
			}

			return var2; // L: 235
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILib;[Lql;Llc;Llc;I)V",
		garbageValue = "366112318"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 240
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 241
			if (Language.method6088(this.regionX, this.regionY, var1) == null) { // L: 244
				boolean var6 = true; // L: 247
				var6 &= this.loadGeography(var4); // L: 248
				int var8;
				if (this.worldMapData_0 != null) { // L: 251
					var8 = this.worldMapData_0.groupId; // L: 252
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 255
				}

				var6 &= var5.tryLoadGroup(var8); // L: 257
				if (var6) { // L: 258
					byte[] var7 = var5.takeFileFlat(var8); // L: 259
					WorldMapSprite var9 = Messages.method2574(var7); // L: 260
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 261
					var10.setRaster(); // L: 262
					if (this.worldMapData_0 != null) { // L: 263
						this.method4718(var2, var3, var9); // L: 264
					} else {
						this.method4671(var2, var3, var9); // L: 267
					}

					int var11 = this.regionX; // L: 269
					int var12 = this.regionY; // L: 270
					int var13 = this.pixelsPerTile; // L: 271
					DemotingHashTable var14 = WorldMapRegion_cachedSprites; // L: 273
					long var16 = (long)(var13 << 16 | var11 << 8 | var12); // L: 277
					var14.put(var10, var16, var10.pixels.length * 4); // L: 279
					this.method4657(); // L: 281
				}
			}
		}
	} // L: 242 245 282

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-205516615"
	)
	void method4668(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 285
			var4 = new HashSet(); // L: 286
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 288
		this.drawMapLinks(var1, var2, var4, var3); // L: 289
	} // L: 290

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "2089735233"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 293

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 294
			if (var5.hasValidElement()) { // L: 296
				int var6 = var5.getElement(); // L: 297
				if (var1.contains(var6)) { // L: 298
					WorldMapElement var7 = TileItem.WorldMapElement_get(var6); // L: 299
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 300
				}
			}
		}

		this.method4725(var1, var2, var3); // L: 304
	} // L: 305

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lib;[Lql;Lic;I)V",
		garbageValue = "1211128484"
	)
	void method4718(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 308
			for (var5 = 0; var5 < 64; ++var5) { // L: 309
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 310
				this.method4747(var4, var5, this.worldMapData_0, var1); // L: 311
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 314
			for (var5 = 0; var5 < 64; ++var5) { // L: 315
				this.method4672(var4, var5, this.worldMapData_0, var1, var2); // L: 316
			}
		}

	} // L: 319

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lib;[Lql;Lic;B)V",
		garbageValue = "8"
	)
	void method4671(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 322

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 323

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 325
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 326
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 327
					this.method4747(var6, var7, var5, var1); // L: 328
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 333

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 334

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 336
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 337
					this.method4672(var6, var7, var5, var1, var2); // L: 338
				}
			}
		}

	} // L: 343

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILht;Lib;[Lql;B)V",
		garbageValue = "3"
	)
	void method4672(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4677(var1, var2, var3); // L: 346
		this.method4670(var1, var2, var3, var5); // L: 347
	} // L: 348

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IILht;Lib;Lic;I)V",
		garbageValue = "909687502"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 351
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 352
		if (var6 == -1 && var7 == -1) { // L: 353
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 354
		}

		int var8 = 16711935; // L: 356
		if (var7 != -1) { // L: 357
			var8 = class270.method5223(var7, this.backgroundColor); // L: 358
		}

		if (var7 > -1 && var3.field2796[0][var1][var2] == 0) { // L: 360
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 361
		} else {
			int var9 = this.method4674(var1, var2, var3, var5); // L: 364
			if (var7 == -1) { // L: 365
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 366
			} else {
				var4.method5092(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[0][var1][var2], var3.field2793[0][var1][var2]); // L: 369
			}
		}
	} // L: 362 367 370

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IILht;Lib;I)V",
		garbageValue = "-1394777620"
	)
	void method4747(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 373
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 374
			if (var6 > -1) { // L: 375
				int var7 = class270.method5223(var6, this.backgroundColor); // L: 376
				if (var3.field2796[var5][var1][var2] == 0) { // L: 377
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 378
				} else {
					var4.method5092(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[var5][var1][var2], var3.field2793[var5][var1][var2]); // L: 381
				}
			}
		}

	} // L: 385

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILht;Lic;B)I",
		garbageValue = "1"
	)
	int method4674(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 388 389 391
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILht;[Lql;I)V",
		garbageValue = "-1260699356"
	)
	void method4670(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 395
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 396
			if (var6 != null && var6.length != 0) { // L: 397
				WorldMapDecoration[] var7 = var6; // L: 401

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 402
					WorldMapDecoration var9 = var7[var8]; // L: 403
					int var11 = var9.decoration; // L: 406
					boolean var10 = var11 >= WorldMapDecorationType.field3558.id && var11 <= WorldMapDecorationType.field3546.id; // L: 408
					if (!var10) { // L: 411
						int var13 = var9.decoration; // L: 413
						boolean var12 = var13 == WorldMapDecorationType.field3560.id; // L: 415
						if (!var12) { // L: 417
							continue;
						}
					}

					ObjectComposition var14 = WorldMapDecoration.getObjectDefinition(var9.objectDefinitionId); // L: 419
					if (var14.mapSceneId != -1) { // L: 420
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 421
							var4[var14.mapSceneId].method8148(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 425
						} else {
							var4[var14.mapSceneId].method8148(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 422
						}
					}
				}
			}
		}

	} // L: 433

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IILht;B)V",
		garbageValue = "-34"
	)
	void method4677(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 436
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 437
			if (var5 != null && var5.length != 0) { // L: 438
				WorldMapDecoration[] var6 = var5; // L: 442

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 443
					WorldMapDecoration var8 = var6[var7]; // L: 444
					int var10 = var8.decoration; // L: 447
					boolean var9 = var10 >= WorldMapDecorationType.field3541.id && var10 <= WorldMapDecorationType.field3559.id || var10 == WorldMapDecorationType.field3542.id; // L: 449
					if (var9) { // L: 451
						ObjectComposition var11 = WorldMapDecoration.getObjectDefinition(var8.objectDefinitionId); // L: 452
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 453
						if (var8.decoration == WorldMapDecorationType.field3541.id) { // L: 454
							this.method4691(var1, var2, var8.rotation, var12); // L: 455
						}

						if (var8.decoration == WorldMapDecorationType.field3540.id) { // L: 457
							this.method4691(var1, var2, var8.rotation, -3355444); // L: 458
							this.method4691(var1, var2, var8.rotation + 1, var12); // L: 459
						}

						if (var8.decoration == WorldMapDecorationType.field3559.id) { // L: 461
							if (var8.rotation == 0) { // L: 462
								Rasterizer2D.method8058(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) { // L: 463
								Rasterizer2D.method8058(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 464
								Rasterizer2D.method8058(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 465
								Rasterizer2D.method8058(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3542.id) { // L: 467
							int var13 = var8.rotation % 2; // L: 468
							int var14;
							if (var13 == 0) { // L: 469
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 470
									Rasterizer2D.method8058(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 471
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 475
									Rasterizer2D.method8058(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 476
								}
							}
						}
					}
				}
			}
		}

	} // L: 485

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "2016206561"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 488
		float var6 = var5 / 2.0F; // L: 489
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 490

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 491
			Coord var9 = (Coord)var8.getKey(); // L: 493
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 494
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 495
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 496
			if (var12 != null && var12.hasValidElement()) { // L: 497
				var12.screenX = var10; // L: 498
				var12.screenY = var11; // L: 499
				WorldMapElement var13 = TileItem.WorldMapElement_get(var12.getElement()); // L: 500
				if (!var3.contains(var13.getObjectId())) { // L: 501
					this.method4724(var12, var10, var11, var5); // L: 502
				}
			}
		}

	} // L: 507

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1842261388"
	)
	void method4725(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 510

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 511
			if (var5.hasValidElement()) { // L: 513
				WorldMapElement var6 = TileItem.WorldMapElement_get(var5.getElement()); // L: 514
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 515
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 516
				}
			}
		}

	} // L: 520

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lfe;IIIIB)V",
		garbageValue = "40"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 523
		if (var6 != null) { // L: 524
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 527
			if (var4 % var5 < var5 / 2) { // L: 528
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 529
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 530
			}

		}
	} // L: 525 532

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lir;IIFI)V",
		garbageValue = "-1971059873"
	)
	void method4724(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = TileItem.WorldMapElement_get(var1.getElement()); // L: 535
		this.method4682(var5, var2, var3); // L: 536
		this.method4683(var1, var5, var2, var3, var4); // L: 537
	} // L: 538

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfe;IIB)V",
		garbageValue = "-51"
	)
	void method4682(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 541
		if (var4 != null) { // L: 542
			int var5 = this.method4685(var4, var1.horizontalAlignment); // L: 543
			int var6 = this.method4666(var4, var1.verticalAlignment); // L: 544
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 545
		}

	} // L: 547

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lfe;IIFI)V",
		garbageValue = "-1263116902"
	)
	void method4683(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 550
		if (var6 != null) { // L: 551
			if (var6.size.method4533(var5)) { // L: 554
				Font var7 = (Font)this.fonts.get(var6.size); // L: 557
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1825, 0, 1, 0, var7.ascent / 2); // L: 558
			}
		}
	} // L: 552 555 559

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-91"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 562
		Iterator var6 = this.icon0List.iterator(); // L: 563

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 564
			if (var7.hasValidElement()) { // L: 566
				int var8 = var7.coord2.x % 64; // L: 567
				int var9 = var7.coord2.y % 64; // L: 568
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 569
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 570
				if (!var3.contains(var7.getElement())) { // L: 571
					this.method4724(var7, var7.screenX, var7.screenY, var5); // L: 574
				}
			}
		}

	} // L: 577

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqj;Lfq;I)I",
		garbageValue = "264539152"
	)
	int method4685(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 580
		case 1:
			return -var1.subWidth / 2; // L: 591
		case 2:
			return 0; // L: 587
		default:
			return -var1.subWidth; // L: 583
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqj;Lfd;I)I",
		garbageValue = "-1006100043"
	)
	int method4666(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 597
		case 0:
			return 0; // L: 600
		case 1:
			return -var1.subHeight / 2; // L: 608
		default:
			return -var1.subHeight; // L: 604
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Liy;",
		garbageValue = "712675174"
	)
	WorldMapLabel method4687(int var1) {
		WorldMapElement var2 = TileItem.WorldMapElement_get(var1); // L: 614
		return this.createMapLabel(var2); // L: 615
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)Liy;",
		garbageValue = "2068502670"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 619
			WorldMapLabelSize var2 = WorldMapLabelSize.method4534(var1.textSize); // L: 622
			if (var2 == null) { // L: 623
				return null; // L: 624
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 626
				if (var3 == null) { // L: 627
					return null; // L: 628
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 630
					String[] var5 = new String[var4]; // L: 631
					var3.breakLines(var1.name, (int[])null, var5); // L: 632
					int var6 = var5.length * var3.ascent / 2; // L: 633
					int var7 = 0; // L: 634
					String[] var8 = var5; // L: 636

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 637
						String var10 = var8[var9]; // L: 638
						int var11 = var3.stringWidth(var10); // L: 640
						if (var11 > var7) { // L: 641
							var7 = var11; // L: 642
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 647
				}
			}
		} else {
			return null; // L: 620
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "29"
	)
	List method4689(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 651
		if (var4 >= var1 && var5 >= var2) { // L: 652
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 653
				Iterator var7 = this.iconMap.values().iterator(); // L: 654

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 655
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 657
						var6.add(var8); // L: 658
					}
				}

				var7 = this.icon0List.iterator(); // L: 662

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 663
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 665
						var6.add(var8); // L: 666
					}
				}

				return var6; // L: 670
			} else {
				return var6; // L: 661
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "1"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 674
		var1.addAll(this.icon0List); // L: 675
		var1.addAll(this.iconMap.values()); // L: 676
		return var1; // L: 677
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1509302758"
	)
	void method4691(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 681
		if (var3 == 0) { // L: 682
			Rasterizer2D.method8071(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 683
			Rasterizer2D.method8058(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 684
			Rasterizer2D.method8071(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method8058(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 685
		}

	} // L: 686

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method4785() {
		StringBuilder var0 = new StringBuilder(); // L: 71

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 72 78 80
			var2 = (Message)var1.next(); // L: 73
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 75
				var0.append(var2.sender).append(':'); // L: 76
			}
		}

		return var0.toString(); // L: 81
	}
}
