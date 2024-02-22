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
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1500010557
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -505850255
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ao")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2018215391
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1516038777
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ah")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("aj")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("af")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 65
		this.regionY = var2; // L: 66
		this.worldMapData1List = new LinkedList(); // L: 67
		this.icon0List = new LinkedList(); // L: 68
		this.iconMap = new HashMap(); // L: 69
		this.backgroundColor = var3 | -16777216; // L: 70
		this.fonts = var4; // L: 71
	} // L: 72

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1298422342"
	)
	void method4741(int var1, int var2, int var3) {
		SpritePixels var4 = class159.method3417(this.regionX, this.regionY, this.pixelsPerTile); // L: 75
		if (var4 != null) { // L: 76
			if (var3 == this.pixelsPerTile * 64) { // L: 77
				var4.drawAt(var1, var2); // L: 78
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 81
			}

		}
	} // L: 83

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lji;Ljava/util/List;S)V",
		garbageValue = "9660"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 86
		this.worldMapData_0 = var1; // L: 87
		this.addAllToIconList(var2); // L: 88
	} // L: 89

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "54"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 92
		Iterator var3 = var1.iterator(); // L: 93

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 94
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 96
				this.worldMapData1List.add(var4); // L: 97
			}
		}

		this.addAllToIconList(var2); // L: 101
	} // L: 102

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIILjo;I)V",
		garbageValue = "1473425385"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 105
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 106
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 107
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 108
					if (var9 != null && var9.length != 0) { // L: 109
						WorldMapDecoration[] var10 = var9; // L: 113

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 114
							WorldMapDecoration var12 = var10[var11]; // L: 115
							ObjectComposition var13 = class127.getObjectDefinition(var12.objectDefinitionId); // L: 117
							if (class233.method4568(var13)) { // L: 118
								this.getIcon(var13, var8, var6, var7, var5); // L: 121
								continue label51; // L: 122
							}
						}
					}
				}
			}
		}

	} // L: 129

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIILjo;I)V",
		garbageValue = "-659744094"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 132
		Coord var7 = null; // L: 133
		if (this.worldMapData_0 != null) { // L: 134
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 135
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 138
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 139
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 142
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 143
		} else {
			var9 = class139.WorldMapElement_get(var1.mapIconId); // L: 146
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 147
		}

		var9 = class139.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 149
		if (var9.field1867) { // L: 150
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 151
		}

	} // L: 153

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 156

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 157
			if (var2 instanceof WorldMapIcon_1) { // L: 159
				((WorldMapIcon_1)var2).init(); // L: 160
			}
		}

	} // L: 164

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "-111"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 167

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 168
			if (class139.WorldMapElement_get(var3.element).field1867 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 170 173
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4769(var3.element)); // L: 174
				this.icon0List.add(var4); // L: 175
			}
		}

	} // L: 179

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1606058217"
	)
	void method4748() {
		if (this.worldMapData_0 != null) { // L: 182
			this.worldMapData_0.reset(); // L: 183
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 186

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 187
				var2.reset(); // L: 189
			}
		}

	} // L: 193

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)Z",
		garbageValue = "-62690226"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 196
		if (this.worldMapData_0 != null) { // L: 197
			this.worldMapData_0.loadGeography(var1); // L: 198
			if (this.worldMapData_0.isFullyLoaded()) { // L: 199
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 200
				return true; // L: 201
			} else {
				return false; // L: 203
			}
		} else {
			boolean var2 = true; // L: 206

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 207 211
				var4 = (WorldMapData_1)var3.next(); // L: 208
				var4.loadGeography(var1); // L: 210
			}

			if (var2) { // L: 214
				var3 = this.worldMapData1List.iterator(); // L: 215

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 216
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 218
				}
			}

			return var2; // L: 222
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILkc;[Lvg;Lof;Lof;I)V",
		garbageValue = "2130697272"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 227
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 228
			if (class159.method3417(this.regionX, this.regionY, var1) == null) { // L: 231
				boolean var6 = true; // L: 234
				var6 &= this.loadGeography(var4); // L: 235
				int var8;
				if (this.worldMapData_0 != null) { // L: 238
					var8 = this.worldMapData_0.groupId; // L: 239
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 242
				}

				var6 &= var5.tryLoadGroup(var8); // L: 244
				if (var6) { // L: 245
					byte[] var7 = var5.takeFileFlat(var8); // L: 246
					WorldMapSprite var9;
					if (var7 == null) { // L: 249
						var9 = new WorldMapSprite(); // L: 250
					} else {
						var9 = new WorldMapSprite(class202.method3920(var7).pixels); // L: 253
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 256
					var11.setRaster(); // L: 257
					if (this.worldMapData_0 != null) { // L: 258
						this.method4785(var2, var3, var9); // L: 259
					} else {
						this.method4852(var2, var3, var9); // L: 262
					}

					CollisionMap.method4469(var11, this.regionX, this.regionY, this.pixelsPerTile); // L: 264
					this.method4748(); // L: 265
				}
			}
		}
	} // L: 229 232 266

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "81"
	)
	void method4853(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 269
			var4 = new HashSet(); // L: 270
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 272
		this.drawMapLinks(var1, var2, var4, var3); // L: 273
	} // L: 274

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1164162888"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 277

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 278
			if (var5.hasValidElement()) { // L: 280
				int var6 = var5.getElement(); // L: 281
				if (var1.contains(var6)) { // L: 282
					WorldMapElement var7 = class139.WorldMapElement_get(var6); // L: 283
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 284
				}
			}
		}

		this.method4761(var1, var2, var3); // L: 288
	} // L: 289

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkc;[Lvg;Lje;I)V",
		garbageValue = "-401853836"
	)
	void method4785(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 292
			for (var5 = 0; var5 < 64; ++var5) { // L: 293
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 294
				this.method4833(var4, var5, this.worldMapData_0, var1); // L: 295
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 298
			for (var5 = 0; var5 < 64; ++var5) { // L: 299
				this.method4746(var4, var5, this.worldMapData_0, var1, var2); // L: 300
			}
		}

	} // L: 303

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lkc;[Lvg;Lje;I)V",
		garbageValue = "-1271098445"
	)
	void method4852(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 306

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 307

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 309
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 310
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 311
					this.method4833(var6, var7, var5, var1); // L: 312
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 317

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 318

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 320
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 321
					this.method4746(var6, var7, var5, var1, var2); // L: 322
				}
			}
		}

	} // L: 327

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILjo;Lkc;[Lvg;I)V",
		garbageValue = "-525953953"
	)
	void method4746(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4759(var1, var2, var3); // L: 330
		this.method4758(var1, var2, var3, var5); // L: 331
	} // L: 332

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IILjo;Lkc;Lje;I)V",
		garbageValue = "1196914870"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 335
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 336
		if (var6 == -1 && var7 == -1) { // L: 337
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 338
		}

		int var8 = 16711935; // L: 340
		if (var7 != -1) { // L: 341
			var8 = class86.method2348(var7, this.backgroundColor); // L: 342
		}

		if (var7 > -1 && var3.field2623[0][var1][var2] == 0) { // L: 344
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 345
		} else {
			int var9 = this.method4757(var1, var2, var3, var5); // L: 348
			if (var7 == -1) { // L: 349
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 350
			} else {
				var4.method5143(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2623[0][var1][var2], var3.field2626[0][var1][var2]); // L: 353
			}
		}
	} // L: 346 351 354

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILjo;Lkc;I)V",
		garbageValue = "-2014932929"
	)
	void method4833(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 357
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 358
			if (var6 > -1) { // L: 359
				int var7 = class86.method2348(var6, this.backgroundColor); // L: 360
				if (var3.field2623[var5][var1][var2] == 0) { // L: 361
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 362
				} else {
					var4.method5143(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2623[var5][var1][var2], var3.field2626[var5][var1][var2]); // L: 365
				}
			}
		}

	} // L: 369

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILjo;Lje;B)I",
		garbageValue = "0"
	)
	int method4757(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 372 373 375
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjo;[Lvg;I)V",
		garbageValue = "500198341"
	)
	void method4758(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 379
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 380
			if (var6 != null && var6.length != 0) { // L: 381
				WorldMapDecoration[] var7 = var6; // L: 385

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 386
					WorldMapDecoration var9 = var7[var8]; // L: 387
					if (!WorldMapManager.method4882(var9.decoration)) { // L: 390
						int var11 = var9.decoration; // L: 392
						boolean var10 = var11 == WorldMapDecorationType.field3916.id; // L: 394
						if (!var10) { // L: 396
							continue;
						}
					}

					ObjectComposition var12 = class127.getObjectDefinition(var9.objectDefinitionId); // L: 398
					if (var12.mapSceneId != -1) { // L: 399
						if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 400
							var4[var12.mapSceneId].method9884(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 404
						} else {
							var4[var12.mapSceneId].method9884(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 401
						}
					}
				}
			}
		}

	} // L: 412

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILjo;I)V",
		garbageValue = "-1736492163"
	)
	void method4759(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 415
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 416
			if (var5 != null && var5.length != 0) { // L: 417
				WorldMapDecoration[] var6 = var5; // L: 421

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 422
					WorldMapDecoration var8 = var6[var7]; // L: 423
					int var10 = var8.decoration; // L: 426
					boolean var9 = var10 >= WorldMapDecorationType.field3917.id && var10 <= WorldMapDecorationType.field3911.id || var10 == WorldMapDecorationType.field3913.id; // L: 428
					if (var9) { // L: 430
						ObjectComposition var11 = class127.getObjectDefinition(var8.objectDefinitionId); // L: 431
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 432
						if (var8.decoration == WorldMapDecorationType.field3917.id) { // L: 433
							this.method4751(var1, var2, var8.rotation, var12); // L: 434
						}

						if (var8.decoration == WorldMapDecorationType.field3931.id) { // L: 436
							this.method4751(var1, var2, var8.rotation, -3355444); // L: 437
							this.method4751(var1, var2, var8.rotation + 1, var12); // L: 438
						}

						if (var8.decoration == WorldMapDecorationType.field3911.id) { // L: 440
							if (var8.rotation == 0) { // L: 441
								Rasterizer2D.method9794(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) { // L: 442
								Rasterizer2D.method9794(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 443
								Rasterizer2D.method9794(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 444
								Rasterizer2D.method9794(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3913.id) { // L: 446
							int var13 = var8.rotation % 2; // L: 447
							int var14;
							if (var13 == 0) { // L: 448
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 449
									Rasterizer2D.method9794(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 450
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 454
									Rasterizer2D.method9794(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 455
								}
							}
						}
					}
				}
			}
		}

	} // L: 464

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1372211116"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 467
		float var6 = var5 / 2.0F; // L: 468
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 469

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 470
			Coord var9 = (Coord)var8.getKey(); // L: 472
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 473
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 474
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 475
			if (var12 != null && var12.hasValidElement()) { // L: 476
				var12.screenX = var10; // L: 477
				var12.screenY = var11; // L: 478
				WorldMapElement var13 = class139.WorldMapElement_get(var12.getElement()); // L: 479
				if (!var3.contains(var13.getObjectId())) { // L: 480
					this.method4763(var12, var10, var11, var5); // L: 481
				}
			}
		}

	} // L: 486

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-10"
	)
	void method4761(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 489

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 490
			if (var5.hasValidElement()) { // L: 492
				WorldMapElement var6 = class139.WorldMapElement_get(var5.getElement()); // L: 493
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 494
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 495
				}
			}
		}

	} // L: 499

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lgv;IIIIB)V",
		garbageValue = "-53"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 502
		if (var6 != null) { // L: 503
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 506
			if (var4 % var5 < var5 / 2) { // L: 507
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 508
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 509
			}

		}
	} // L: 504 511

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIFI)V",
		garbageValue = "304329205"
	)
	void method4763(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class139.WorldMapElement_get(var1.getElement()); // L: 514
		this.method4764(var5, var2, var3); // L: 515
		this.method4765(var1, var5, var2, var3, var4); // L: 516
	} // L: 517

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lgv;IIB)V",
		garbageValue = "55"
	)
	void method4764(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 520
		if (var4 != null) { // L: 521
			int var5 = this.method4835(var4, var1.horizontalAlignment); // L: 522
			int var6 = this.method4773(var4, var1.verticalAlignment); // L: 523
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 524
		}

	} // L: 526

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljd;Lgv;IIFS)V",
		garbageValue = "-6160"
	)
	void method4765(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 529
		if (var6 != null) { // L: 530
			if (var6.size.method4620(var5)) { // L: 533
				Font var7 = (Font)this.fonts.get(var6.size); // L: 536
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1873, 0, 1, 0, var7.ascent / 2); // L: 537
			}
		}
	} // L: 531 534 538

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "346189365"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 541
		Iterator var6 = this.icon0List.iterator(); // L: 542

		while (var6.hasNext()) { // L: 551
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 543
			if (var7.hasValidElement()) { // L: 545
				int var8 = var7.coord2.x % 64; // L: 546
				int var9 = var7.coord2.y % 64; // L: 547
				var7.screenX = (int)((float)var8 * var5 + (float)var1); // L: 548
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5); // L: 549
				if (!var3.contains(var7.getElement())) { // L: 550
					this.method4763(var7, var7.screenX, var7.screenY, var5); // L: 553
				}
			}
		}

	} // L: 556

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lvd;Lhj;I)I",
		garbageValue = "-1312618285"
	)
	int method4835(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 559
		case 1:
			return -var1.subWidth / 2; // L: 570
		case 2:
			return 0; // L: 562
		default:
			return -var1.subWidth; // L: 566
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lvd;Lhk;I)I",
		garbageValue = "-1330221290"
	)
	int method4773(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 576
		case 1:
			return -var1.subHeight / 2; // L: 583
		case 2:
			return 0; // L: 587
		default:
			return -var1.subHeight; // L: 579
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)Lja;",
		garbageValue = "18"
	)
	WorldMapLabel method4769(int var1) {
		WorldMapElement var2 = class139.WorldMapElement_get(var1); // L: 614
		return this.createMapLabel(var2); // L: 615
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;B)Lja;",
		garbageValue = "1"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 619
			WorldMapLabelSize var2 = WorldMapLabelSize.method4621(var1.textSize); // L: 622
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "1"
	)
	List method4770(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "1656915940"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 674
		var1.addAll(this.icon0List); // L: 675
		var1.addAll(this.iconMap.values()); // L: 676
		return var1; // L: 677
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-173502220"
	)
	void method4751(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 681
		if (var3 == 0) { // L: 682
			Rasterizer2D.method9796(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 683
			Rasterizer2D.method9794(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 684
			Rasterizer2D.method9796(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9794(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 685
		}

	} // L: 686
}
