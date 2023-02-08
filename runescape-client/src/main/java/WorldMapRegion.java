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

@ObfuscatedName("id")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -848371501
	)
	static int field2874;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -53448603
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1663409815
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("l")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -390684495
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1403435535
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("r")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("b")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("m")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 58
		this.regionY = var2; // L: 59
		this.worldMapData1List = new LinkedList(); // L: 60
		this.icon0List = new LinkedList(); // L: 61
		this.iconMap = new HashMap(); // L: 62
		this.backgroundColor = var3 | -16777216; // L: 63
		this.fonts = var4; // L: 64
	} // L: 65

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-583808564"
	)
	void method5145(int var1, int var2, int var3) {
		SpritePixels var4 = class70.method2088(this.regionX, this.regionY, this.pixelsPerTile); // L: 68
		if (var4 != null) { // L: 69
			if (var3 == this.pixelsPerTile * 64) { // L: 70
				var4.drawAt(var1, var2); // L: 71
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 74
			}

		}
	} // L: 76

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lih;Ljava/util/List;I)V",
		garbageValue = "1952397338"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 79
		this.worldMapData_0 = var1; // L: 80
		this.addAllToIconList(var2); // L: 81
	} // L: 82

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-1854355709"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 85
		Iterator var3 = var1.iterator(); // L: 86

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 87
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 89
				this.worldMapData1List.add(var4); // L: 90
			}
		}

		this.addAllToIconList(var2); // L: 94
	} // L: 95

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIILia;B)V",
		garbageValue = "29"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 98
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 99
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 100
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 101
					if (var9 != null && var9.length != 0) { // L: 102
						WorldMapDecoration[] var10 = var9; // L: 106

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 107
							WorldMapDecoration var12 = var10[var11]; // L: 108
							ObjectComposition var13 = class463.getObjectDefinition(var12.objectDefinitionId); // L: 110
							if (class10.method113(var13)) { // L: 111
								this.getIcon(var13, var8, var6, var7, var5); // L: 114
								continue label51; // L: 115
							}
						}
					}
				}
			}
		}

	} // L: 122

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILia;I)V",
		garbageValue = "-2086101831"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 125
		Coord var7 = null; // L: 126
		if (this.worldMapData_0 != null) { // L: 127
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 128
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 131
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 132
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 135
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 136
		} else {
			var9 = class4.WorldMapElement_get(var1.mapIconId); // L: 139
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 140
		}

		var9 = class4.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 142
		if (var9.field1942) { // L: 143
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 144
		}

	} // L: 146

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1064632767"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 149

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 150
			if (var2 instanceof WorldMapIcon_1) { // L: 152
				((WorldMapIcon_1)var2).init(); // L: 153
			}
		}

	} // L: 157

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1281796744"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 160

		while (var2.hasNext()) { // L: 164
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 161
			if (class4.WorldMapElement_get(var3.element).field1942 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 163 166
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5131(var3.element)); // L: 167
				this.icon0List.add(var4); // L: 168
			}
		}

	} // L: 172

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	void method5023() {
		if (this.worldMapData_0 != null) { // L: 175
			this.worldMapData_0.reset(); // L: 176
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 179

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 180
				var2.reset(); // L: 182
			}
		}

	} // L: 186

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)Z",
		garbageValue = "2127797424"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 189
		if (this.worldMapData_0 != null) { // L: 190
			this.worldMapData_0.loadGeography(var1); // L: 191
			if (this.worldMapData_0.isFullyLoaded()) { // L: 192
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 193
				return true; // L: 194
			} else {
				return false; // L: 196
			}
		} else {
			boolean var2 = true; // L: 199

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 200 204
				var4 = (WorldMapData_1)var3.next(); // L: 201
				var4.loadGeography(var1); // L: 203
			}

			if (var2) { // L: 207
				var3 = this.worldMapData1List.iterator(); // L: 208

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 209
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 211
				}
			}

			return var2; // L: 215
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjl;[Lrg;Lln;Lln;B)V",
		garbageValue = "-120"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 220
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 221
			if (class70.method2088(this.regionX, this.regionY, var1) == null) { // L: 224
				boolean var6 = true; // L: 227
				var6 &= this.loadGeography(var4); // L: 228
				int var8;
				if (this.worldMapData_0 != null) { // L: 231
					var8 = this.worldMapData_0.groupId; // L: 232
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 235
				}

				var6 &= var5.tryLoadGroup(var8); // L: 237
				if (var6) { // L: 238
					byte[] var7 = var5.takeFileFlat(var8); // L: 239
					WorldMapSprite var9 = Player.method2353(var7); // L: 240
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 241
					var10.setRaster(); // L: 242
					if (this.worldMapData_0 != null) { // L: 243
						this.method5019(var2, var3, var9); // L: 244
					} else {
						this.method5029(var2, var3, var9); // L: 247
					}

					class7.method65(var10, this.regionX, this.regionY, this.pixelsPerTile); // L: 249
					this.method5023(); // L: 250
				}
			}
		}
	} // L: 222 225 251

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "376150308"
	)
	void method5026(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 254
			var4 = new HashSet(); // L: 255
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 257
		this.drawMapLinks(var1, var2, var4, var3); // L: 258
	} // L: 259

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-108746469"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 262

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 263
			if (var5.hasValidElement()) { // L: 265
				int var6 = var5.getElement(); // L: 266
				if (var1.contains(var6)) { // L: 267
					WorldMapElement var7 = class4.WorldMapElement_get(var6); // L: 268
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 269
				}
			}
		}

		this.method5141(var1, var2, var3); // L: 273
	} // L: 274

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljl;[Lrg;Liy;I)V",
		garbageValue = "488380802"
	)
	void method5019(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 277
			for (var5 = 0; var5 < 64; ++var5) { // L: 278
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 279
				this.method5042(var4, var5, this.worldMapData_0, var1); // L: 280
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 283
			for (var5 = 0; var5 < 64; ++var5) { // L: 284
				this.method5030(var4, var5, this.worldMapData_0, var1, var2); // L: 285
			}
		}

	} // L: 288

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljl;[Lrg;Liy;B)V",
		garbageValue = "-62"
	)
	void method5029(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 291

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 292

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 294
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 295
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 296
					this.method5042(var6, var7, var5, var1); // L: 297
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 302

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 303

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 305
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 306
					this.method5030(var6, var7, var5, var1, var2); // L: 307
				}
			}
		}

	} // L: 312

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILia;Ljl;[Lrg;B)V",
		garbageValue = "0"
	)
	void method5030(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5035(var1, var2, var3); // L: 315
		this.method5063(var1, var2, var3, var5); // L: 316
	} // L: 317

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILia;Ljl;Liy;I)V",
		garbageValue = "-400072655"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 320
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 321
		if (var6 == -1 && var7 == -1) { // L: 322
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 323
		}

		int var8 = 16711935; // L: 325
		if (var7 != -1) { // L: 326
			var8 = class153.method3316(var7, this.backgroundColor); // L: 327
		}

		if (var7 > -1 && var3.field2960[0][var1][var2] == 0) { // L: 329
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 330
		} else {
			int var9 = this.method5033(var1, var2, var3, var5); // L: 333
			if (var7 == -1) { // L: 334
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 335
			} else {
				var4.method5429(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2960[0][var1][var2], var3.field2956[0][var1][var2]); // L: 338
			}
		}
	} // L: 331 336 339

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILia;Ljl;I)V",
		garbageValue = "1788876197"
	)
	void method5042(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 342
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 343
			if (var6 > -1) { // L: 344
				int var7 = class153.method3316(var6, this.backgroundColor); // L: 345
				if (var3.field2960[var5][var1][var2] == 0) { // L: 346
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 347
				} else {
					var4.method5429(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2960[var5][var1][var2], var3.field2956[var5][var1][var2]); // L: 350
				}
			}
		}

	} // L: 354

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILia;Liy;B)I",
		garbageValue = "-102"
	)
	int method5033(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 357 358 360
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILia;[Lrg;B)V",
		garbageValue = "5"
	)
	void method5063(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 364
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 365
			if (var6 != null && var6.length != 0) { // L: 366
				WorldMapDecoration[] var7 = var6; // L: 370

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 371
					WorldMapDecoration var9 = var7[var8]; // L: 372
					if (class327.method6445(var9.decoration) || HealthBar.method2609(var9.decoration)) { // L: 374
						ObjectComposition var10 = class463.getObjectDefinition(var9.objectDefinitionId); // L: 375
						if (var10.mapSceneId != -1) { // L: 376
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 377
								var4[var10.mapSceneId].method9071(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 381
							} else {
								var4[var10.mapSceneId].method9071(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 378
							}
						}
					}
				}
			}
		}

	} // L: 389

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILia;B)V",
		garbageValue = "1"
	)
	void method5035(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 392
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 393
			if (var5 != null && var5.length != 0) { // L: 394
				WorldMapDecoration[] var6 = var5; // L: 398

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 399
					WorldMapDecoration var8 = var6[var7]; // L: 400
					if (DecorativeObject.method4865(var8.decoration)) { // L: 402
						ObjectComposition var9 = class463.getObjectDefinition(var8.objectDefinitionId); // L: 403
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 404
						if (var8.decoration == WorldMapDecorationType.field3752.id) { // L: 405
							this.method5086(var1, var2, var8.rotation, var10); // L: 406
						}

						if (var8.decoration == WorldMapDecorationType.field3745.id) { // L: 408
							this.method5086(var1, var2, var8.rotation, -3355444); // L: 409
							this.method5086(var1, var2, var8.rotation + 1, var10); // L: 410
						}

						if (var8.decoration == WorldMapDecorationType.field3746.id) { // L: 412
							if (var8.rotation == 0) { // L: 413
								Rasterizer2D.method9014(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9014(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 414
							}

							if (var8.rotation == 2) { // L: 415
								Rasterizer2D.method9014(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 416
								Rasterizer2D.method9014(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3751.id) { // L: 418
							int var11 = var8.rotation % 2; // L: 419
							int var12;
							if (var11 == 0) { // L: 420
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 421
									Rasterizer2D.method9014(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 422
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 426
									Rasterizer2D.method9014(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 427
								}
							}
						}
					}
				}
			}
		}

	} // L: 436

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1278749111"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 439
		float var6 = var5 / 2.0F; // L: 440
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 441

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 442
			Coord var9 = (Coord)var8.getKey(); // L: 444
			int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6); // L: 445
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 446
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 447
			if (var12 != null && var12.hasValidElement()) { // L: 448
				var12.screenX = var10; // L: 449
				var12.screenY = var11; // L: 450
				WorldMapElement var13 = class4.WorldMapElement_get(var12.getElement()); // L: 451
				if (!var3.contains(var13.getObjectId())) { // L: 452
					this.method5055(var12, var10, var11, var5); // L: 453
				}
			}
		}

	} // L: 458

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-2127236588"
	)
	void method5141(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 461

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 462
			if (var5.hasValidElement()) { // L: 464
				WorldMapElement var6 = class4.WorldMapElement_get(var5.getElement()); // L: 465
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 466
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 467
				}
			}
		}

	} // L: 471

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lgk;IIIII)V",
		garbageValue = "14671839"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 474
		if (var6 != null) { // L: 475
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 478
			if (var4 % var5 < var5 / 2) { // L: 479
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 480
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 481
			}

		}
	} // L: 476 483

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIFI)V",
		garbageValue = "-1488187190"
	)
	void method5055(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class4.WorldMapElement_get(var1.getElement()); // L: 486
		this.method5092(var5, var2, var3); // L: 487
		this.method5041(var1, var5, var2, var3, var4); // L: 488
	} // L: 489

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgk;III)V",
		garbageValue = "-979030841"
	)
	void method5092(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 492
		if (var4 != null) { // L: 493
			int var5 = this.method5043(var4, var1.horizontalAlignment); // L: 494
			int var6 = this.method5044(var4, var1.verticalAlignment); // L: 495
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 496
		}

	} // L: 498

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lio;Lgk;IIFI)V",
		garbageValue = "-1699691180"
	)
	void method5041(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 501
		if (var6 != null) { // L: 502
			if (var6.size.method4887(var5)) { // L: 505
				Font var7 = (Font)this.fonts.get(var6.size); // L: 508
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1940, 0, 1, 0, var7.ascent / 2); // L: 509
			}
		}
	} // L: 503 506 510

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1723252228"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 513
		Iterator var6 = this.icon0List.iterator(); // L: 514

		while (var6.hasNext()) { // L: 523
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 515
			if (var7.hasValidElement()) { // L: 517
				int var8 = var7.coord2.x % 64; // L: 518
				int var9 = var7.coord2.y % 64; // L: 519
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 520
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 521
				if (!var3.contains(var7.getElement())) { // L: 522
					this.method5055(var7, var7.screenX, var7.screenY, var5); // L: 525
				}
			}
		}

	} // L: 528

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lgw;B)I",
		garbageValue = "-18"
	)
	int method5043(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 531
		case 0:
			return 0; // L: 538
		case 2:
			return -var1.subWidth / 2; // L: 534
		default:
			return -var1.subWidth; // L: 542
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lgd;B)I",
		garbageValue = "3"
	)
	int method5044(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 548
		case 1:
			return 0; // L: 555
		case 2:
			return -var1.subHeight / 2; // L: 559
		default:
			return -var1.subHeight; // L: 551
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lil;",
		garbageValue = "-2062233698"
	)
	WorldMapLabel method5131(int var1) {
		WorldMapElement var2 = class4.WorldMapElement_get(var1); // L: 586
		return this.createMapLabel(var2); // L: 587
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lgk;S)Lil;",
		garbageValue = "153"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 591
			int var3 = var1.textSize; // L: 595
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large}; // L: 600
			WorldMapLabelSize[] var5 = var4; // L: 602
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 613
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 604
				if (var3 == var7.field2823) { // L: 606
					var2 = var7; // L: 607
					break;
				}

				++var6; // L: 603
			}

			if (var2 == null) { // L: 616
				return null; // L: 617
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 619
				if (var14 == null) { // L: 620
					return null; // L: 621
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 623
					String[] var15 = new String[var6]; // L: 624
					var14.breakLines(var1.name, (int[])null, var15); // L: 625
					int var8 = var15.length * var14.ascent / 2; // L: 626
					int var9 = 0; // L: 627
					String[] var10 = var15; // L: 629

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 630
						String var12 = var10[var11]; // L: 631
						int var13 = var14.stringWidth(var12); // L: 633
						if (var13 > var9) { // L: 634
							var9 = var13; // L: 635
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 640
				}
			}
		} else {
			return null; // L: 592
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "461574791"
	)
	List method5047(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 644
		if (var4 >= var1 && var5 >= var2) { // L: 645
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 646
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 647
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 648
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 650
						var6.add(var8); // L: 651
					}
				}

				var7 = this.icon0List.iterator(); // L: 655

				while (var7.hasNext()) { // L: 662
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 656
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 658
						var6.add(var8); // L: 659
					}
				}

				return var6; // L: 663
			} else {
				return var6; // L: 654
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/List;",
		garbageValue = "128"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 667
		var1.addAll(this.icon0List); // L: 668
		var1.addAll(this.iconMap.values()); // L: 669
		return var1; // L: 670
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "6"
	)
	void method5086(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 674
		if (var3 == 0) { // L: 675
			Rasterizer2D.method8990(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 676
			Rasterizer2D.method9014(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 677
			Rasterizer2D.method8990(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9014(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 678
		}

	} // L: 679

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1582773873"
	)
	public static int method5148(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 25
			int var6 = var3; // L: 26
			var3 = var4; // L: 27
			var4 = var6; // L: 28
		}

		var2 &= 3; // L: 30
		if (var2 == 0) { // L: 31
			return var0;
		} else if (var2 == 1) { // L: 32
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 33 34
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lgr;IIZI)V",
		garbageValue = "612286939"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 11655
		byte var6 = -1; // L: 11656
		String var7 = null; // L: 11657
		if (var5 != null && var5[var3] != null) { // L: 11658
			if (var3 == 0) { // L: 11659
				var6 = 33;
			} else if (var3 == 1) { // L: 11660
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 11661
			} else if (var3 == 3) { // L: 11662
				var6 = 36;
			} else {
				var6 = 37; // L: 11663
			}

			var7 = var5[var3]; // L: 11664
		} else if (var3 == 4) { // L: 11667
			var6 = 37; // L: 11668
			var7 = "Drop"; // L: 11669
		}

		if (var6 != -1 && var7 != null) { // L: 11672
			class290.method5598(var7, class149.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4); // L: 11673
		}

	} // L: 11675
}
