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
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 826708985
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2120749695
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ae")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1414998421
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1716757635
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("aa")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("aj")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ad")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 42
		this.regionY = var2; // L: 43
		this.worldMapData1List = new LinkedList(); // L: 44
		this.icon0List = new LinkedList(); // L: 45
		this.iconMap = new HashMap(); // L: 46
		this.backgroundColor = var3 | -16777216; // L: 47
		this.fonts = var4; // L: 48
	} // L: 49

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1742525404"
	)
	void method5173(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 53
		int var6 = this.regionY; // L: 54
		int var7 = this.pixelsPerTile; // L: 55
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(class388.method7211(var5, var6, var7)); // L: 57
		if (var4 != null) { // L: 60
			if (var3 == this.pixelsPerTile * 64) { // L: 61
				var4.drawAt(var1, var2); // L: 62
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 65
			}

		}
	} // L: 67

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lja;Ljava/util/List;I)V",
		garbageValue = "1696632130"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 70
		this.worldMapData_0 = var1; // L: 71
		this.addAllToIconList(var2); // L: 72
	} // L: 73

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-743985556"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 76
		Iterator var3 = var1.iterator(); // L: 77

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 78
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 80
				this.worldMapData1List.add(var4); // L: 81
			}
		}

		this.addAllToIconList(var2); // L: 85
	} // L: 86

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIILkc;I)V",
		garbageValue = "-2027483026"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 89
			label50:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 90
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 91
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 92
					if (var9 != null && var9.length != 0) { // L: 93
						WorldMapDecoration[] var10 = var9; // L: 97

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 98
							WorldMapDecoration var12 = var10[var11]; // L: 99
							ObjectComposition var13 = class175.getObjectDefinition(var12.objectDefinitionId); // L: 101
							if (DecorativeObject.method5043(var13)) { // L: 102
								this.getIcon(var13, var8, var6, var7, var5); // L: 105
								continue label50; // L: 106
							}
						}
					}
				}
			}
		}

	} // L: 113

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIILkc;B)V",
		garbageValue = "-58"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 116
		Coord var7 = null; // L: 117
		if (this.worldMapData_0 != null) { // L: 118
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4); // L: 119
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 122
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8); // L: 123
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 126
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 127
		} else {
			var9 = class147.WorldMapElement_get(var1.mapIconId); // L: 130
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 131
		}

		var9 = class147.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 133
		if (var9.field1912) { // L: 134
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 135
		}

	} // L: 137

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 140

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 141
			if (var2 instanceof WorldMapIcon_1) { // L: 143
				((WorldMapIcon_1)var2).init(); // L: 144
			}
		}

	} // L: 148

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1896972134"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 151

		while (var2.hasNext()) { // L: 162
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 152
			if (class147.WorldMapElement_get(var3.element).field1912 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 154 157
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5202(var3.element)); // L: 158
				this.icon0List.add(var4); // L: 159
			}
		}

	} // L: 163

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2054180432"
	)
	void method5180() {
		if (this.worldMapData_0 != null) { // L: 166
			this.worldMapData_0.reset(); // L: 167
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 170

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 171
				var2.reset(); // L: 173
			}
		}

	} // L: 177

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)Z",
		garbageValue = "-151009247"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 180
		if (this.worldMapData_0 != null) { // L: 181
			this.worldMapData_0.loadGeography(var1); // L: 182
			if (this.worldMapData_0.isFullyLoaded()) { // L: 183
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 184
				return true; // L: 185
			} else {
				return false; // L: 187
			}
		} else {
			boolean var2 = true; // L: 190

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 191 195
				var4 = (WorldMapData_1)var3.next(); // L: 192
				var4.loadGeography(var1); // L: 194
			}

			if (var2) { // L: 198
				var3 = this.worldMapData1List.iterator(); // L: 199

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 200
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 202
				}
			}

			return var2; // L: 206
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILko;[Ltj;Lnq;Lnq;I)V",
		garbageValue = "1081758286"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 211
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 212
			int var7 = this.regionX; // L: 216
			int var8 = this.regionY; // L: 217
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(class388.method7211(var7, var8, var1)); // L: 219
			if (var6 == null) { // L: 221
				boolean var9 = true; // L: 224
				var9 &= this.loadGeography(var4); // L: 225
				int var11;
				if (this.worldMapData_0 != null) { // L: 228
					var11 = this.worldMapData_0.groupId; // L: 229
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 232
				}

				var9 &= var5.tryLoadGroup(var11); // L: 234
				if (var9) { // L: 235
					byte[] var10 = var5.takeFileFlat(var11); // L: 236
					WorldMapSprite var12;
					if (var10 == null) { // L: 239
						var12 = new WorldMapSprite(); // L: 240
					} else {
						var12 = new WorldMapSprite(Interpreter.method2032(var10).pixels); // L: 243
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 246
					var14.setRaster(); // L: 247
					if (this.worldMapData_0 != null) { // L: 248
						this.method5189(var2, var3, var12); // L: 249
					} else {
						this.method5186(var2, var3, var12); // L: 252
					}

					int var15 = this.regionX; // L: 254
					int var16 = this.regionY; // L: 255
					int var17 = this.pixelsPerTile; // L: 256
					WorldMapRegion_cachedSprites.put(var14, class388.method7211(var15, var16, var17), var14.pixels.length * 4); // L: 258
					this.method5180(); // L: 260
				}
			}
		}
	} // L: 213 222 261

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-337558975"
	)
	void method5274(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 264
			var4 = new HashSet(); // L: 265
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 267
		this.drawMapLinks(var1, var2, var4, var3); // L: 268
	} // L: 269

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-458659400"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 272

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 273
			if (var5.hasValidElement()) { // L: 275
				int var6 = var5.getElement(); // L: 276
				if (var1.contains(var6)) { // L: 277
					WorldMapElement var7 = class147.WorldMapElement_get(var6); // L: 278
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 279
				}
			}
		}

		this.method5194(var1, var2, var3); // L: 283
	} // L: 284

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lko;[Ltj;Lkv;I)V",
		garbageValue = "1079584404"
	)
	void method5189(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 287
			for (var5 = 0; var5 < 64; ++var5) { // L: 288
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 289
				this.method5247(var4, var5, this.worldMapData_0, var1); // L: 290
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 293
			for (var5 = 0; var5 < 64; ++var5) { // L: 294
				this.method5187(var4, var5, this.worldMapData_0, var1, var2); // L: 295
			}
		}

	} // L: 298

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lko;[Ltj;Lkv;B)V",
		garbageValue = "-23"
	)
	void method5186(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 301

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) { // L: 311
			var5 = (WorldMapData_1)var4.next(); // L: 302

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 304
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 305
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 306
					this.method5247(var6, var7, var5, var1); // L: 307
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 312

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 313

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 315
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 316
					this.method5187(var6, var7, var5, var1, var2); // L: 317
				}
			}
		}

	} // L: 322

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILkc;Lko;[Ltj;I)V",
		garbageValue = "-893648738"
	)
	void method5187(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5192(var1, var2, var3); // L: 325
		this.method5191(var1, var2, var3, var5); // L: 326
	} // L: 327

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILkc;Lko;Lkv;I)V",
		garbageValue = "-930175649"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 330
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 331
		if (var6 == -1 && var7 == -1) { // L: 332
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 333
		}

		int var8 = 16711935; // L: 335
		if (var7 != -1) { // L: 336
			var8 = FaceNormal.method4719(var7, this.backgroundColor); // L: 337
		}

		if (var7 > -1 && var3.field2988[0][var1][var2] == 0) { // L: 339
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 340
		} else {
			int var9 = this.method5190(var1, var2, var3, var5); // L: 343
			if (var7 == -1) { // L: 344
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 345
			} else {
				var4.method5560(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2988[0][var1][var2], var3.field2985[0][var1][var2]); // L: 348
			}
		}
	} // L: 341 346 349

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILkc;Lko;B)V",
		garbageValue = "-55"
	)
	void method5247(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 352
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 353
			if (var6 > -1) { // L: 354
				int var7 = FaceNormal.method4719(var6, this.backgroundColor); // L: 355
				if (var3.field2988[var5][var1][var2] == 0) { // L: 356
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 357
				} else {
					var4.method5560(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2988[var5][var1][var2], var3.field2985[var5][var1][var2]); // L: 360
				}
			}
		}

	} // L: 364

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILkc;Lkv;I)I",
		garbageValue = "1965746563"
	)
	int method5190(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 367 368 370
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILkc;[Ltj;B)V",
		garbageValue = "-6"
	)
	void method5191(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 374
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 375
			if (var6 != null && var6.length != 0) { // L: 376
				WorldMapDecoration[] var7 = var6; // L: 380

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 381
					WorldMapDecoration var9 = var7[var8]; // L: 382
					if (Client.method1203(var9.decoration) || FloorOverlayDefinition.method4035(var9.decoration)) { // L: 384
						ObjectComposition var10 = class175.getObjectDefinition(var9.objectDefinitionId); // L: 385
						if (var10.mapSceneId != -1) { // L: 386
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 387
								var4[var10.mapSceneId].method9367(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 391
							} else {
								var4[var10.mapSceneId].method9367(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 388
							}
						}
					}
				}
			}
		}

	} // L: 399

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILkc;S)V",
		garbageValue = "-22645"
	)
	void method5192(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 402
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 403
			if (var5 != null && var5.length != 0) { // L: 404
				WorldMapDecoration[] var6 = var5; // L: 408

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 409
					WorldMapDecoration var8 = var6[var7]; // L: 410
					if (class133.method3039(var8.decoration)) { // L: 412
						ObjectComposition var9 = class175.getObjectDefinition(var8.objectDefinitionId); // L: 413
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 414
						if (var8.decoration == WorldMapDecorationType.field3801.id) { // L: 415
							this.method5206(var1, var2, var8.rotation, var10); // L: 416
						}

						if (var8.decoration == WorldMapDecorationType.field3785.id) { // L: 418
							this.method5206(var1, var2, var8.rotation, -3355444); // L: 419
							this.method5206(var1, var2, var8.rotation + 1, var10); // L: 420
						}

						if (var8.decoration == WorldMapDecorationType.field3786.id) { // L: 422
							if (var8.rotation == 0) { // L: 423
								Rasterizer2D.method9262(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9262(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 424
							}

							if (var8.rotation == 2) { // L: 425
								Rasterizer2D.method9262(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 426
								Rasterizer2D.method9262(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3799.id) { // L: 428
							int var11 = var8.rotation % 2; // L: 429
							int var12;
							if (var11 == 0) { // L: 430
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 431
									Rasterizer2D.method9262(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 432
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 436
									Rasterizer2D.method9262(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 437
								}
							}
						}
					}
				}
			}
		}

	} // L: 446

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1970331708"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 449
		float var6 = var5 / 2.0F; // L: 450
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 451

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 452
			Coord var9 = (Coord)var8.getKey(); // L: 454
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 455
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 456
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 457
			if (var12 != null && var12.hasValidElement()) { // L: 458
				var12.screenX = var10; // L: 459
				var12.screenY = var11; // L: 460
				WorldMapElement var13 = class147.WorldMapElement_get(var12.getElement()); // L: 461
				if (!var3.contains(var13.getObjectId())) { // L: 462
					this.method5196(var12, var10, var11, var5); // L: 463
				}
			}
		}

	} // L: 468

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1358503581"
	)
	void method5194(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 471

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 472
			if (var5.hasValidElement()) { // L: 474
				WorldMapElement var6 = class147.WorldMapElement_get(var5.getElement()); // L: 475
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 476
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 477
				}
			}
		}

	} // L: 481

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIIII)V",
		garbageValue = "931602480"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 484
		if (var6 != null) { // L: 485
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 488
			if (var4 % var5 < var5 / 2) { // L: 489
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 490
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 491
			}

		}
	} // L: 486 493

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIFI)V",
		garbageValue = "-149482019"
	)
	void method5196(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class147.WorldMapElement_get(var1.getElement()); // L: 496
		this.method5197(var5, var2, var3); // L: 497
		this.method5198(var1, var5, var2, var3, var4); // L: 498
	} // L: 499

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIB)V",
		garbageValue = "7"
	)
	void method5197(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 502
		if (var4 != null) { // L: 503
			int var5 = this.method5183(var4, var1.horizontalAlignment); // L: 504
			int var6 = this.method5201(var4, var1.verticalAlignment); // L: 505
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 506
		}

	} // L: 508

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Lht;IIFI)V",
		garbageValue = "-2126462924"
	)
	void method5198(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 511
		if (var6 != null) { // L: 512
			if (var6.size.method5061(var5)) { // L: 515
				Font var7 = (Font)this.fonts.get(var6.size); // L: 518
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1909, 0, 1, 0, var7.ascent / 2); // L: 519
			}
		}
	} // L: 513 516 520

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IS)V",
		garbageValue = "-29289"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 523
		Iterator var6 = this.icon0List.iterator(); // L: 524

		while (var6.hasNext()) { // L: 537
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 525
			if (var7.hasValidElement()) { // L: 527
				int var8 = var7.coord2.x % 64; // L: 528
				int var9 = var7.coord2.y % 64; // L: 529
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 530
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 531
				if (!var3.contains(var7.getElement())) { // L: 532
					this.method5196(var7, var7.screenX, var7.screenY, var5); // L: 535
				}
			}
		}

	} // L: 538

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Lhw;I)I",
		garbageValue = "-251678181"
	)
	int method5183(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 541
		case 0:
			return 0; // L: 552
		case 2:
			return -var1.subWidth / 2; // L: 548
		default:
			return -var1.subWidth; // L: 544
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Lhq;I)I",
		garbageValue = "-2049275366"
	)
	int method5201(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 558
		case 0:
			return -var1.subHeight / 2; // L: 565
		case 2:
			return 0; // L: 569
		default:
			return -var1.subHeight; // L: 561
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)Lks;",
		garbageValue = "380861251"
	)
	WorldMapLabel method5202(int var1) {
		WorldMapElement var2 = class147.WorldMapElement_get(var1); // L: 596
		return this.createMapLabel(var2); // L: 597
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)Lks;",
		garbageValue = "-1414509388"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 601
			int var3 = var1.textSize; // L: 605
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large}; // L: 610
			WorldMapLabelSize[] var5 = var4; // L: 612
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 623
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 614
				if (var3 == var7.field2868) { // L: 616
					var2 = var7; // L: 617
					break;
				}

				++var6; // L: 613
			}

			if (var2 == null) { // L: 626
				return null; // L: 627
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 629
				if (var14 == null) { // L: 630
					return null; // L: 631
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 633
					String[] var15 = new String[var6]; // L: 634
					var14.breakLines(var1.name, (int[])null, var15); // L: 635
					int var8 = var15.length * var14.ascent / 2; // L: 636
					int var9 = 0; // L: 637
					String[] var10 = var15; // L: 639

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 640
						String var12 = var10[var11]; // L: 641
						int var13 = var14.stringWidth(var12); // L: 643
						if (var13 > var9) { // L: 644
							var9 = var13; // L: 645
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 650
				}
			}
		} else {
			return null; // L: 602
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "1798666620"
	)
	List method5204(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 654
		if (var4 >= var1 && var5 >= var2) { // L: 655
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 656
				Iterator var7 = this.iconMap.values().iterator(); // L: 657

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 658
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 660
						var6.add(var8); // L: 661
					}
				}

				var7 = this.icon0List.iterator(); // L: 665

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 666
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 668
						var6.add(var8); // L: 669
					}
				}

				return var6; // L: 673
			} else {
				return var6; // L: 664
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "53"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 677
		var1.addAll(this.icon0List); // L: 678
		var1.addAll(this.iconMap.values()); // L: 679
		return var1; // L: 680
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "4096"
	)
	void method5206(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 684
		if (var3 == 0) { // L: 685
			Rasterizer2D.method9264(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 686
			Rasterizer2D.method9262(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 687
			Rasterizer2D.method9264(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9262(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 688
		}

	} // L: 689

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1064007529"
	)
	static int method5289(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field868 - 7.0D) * 256.0D); // L: 4377
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldh;I)Z",
		garbageValue = "-65852552"
	)
	static boolean method5288(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5202
			return false;
		} else if (Projectile.localPlayer == var0) { // L: 5203
			return class104.method2664(); // L: 5222
		} else {
			boolean var1 = class497.method8848(); // L: 5204
			boolean var2;
			if (!var1) { // L: 5205
				var2 = (Client.drawPlayerNames & 1) != 0; // L: 5208
				var1 = var2 && var0.isFriend(); // L: 5210
			}

			var2 = var1; // L: 5212
			if (!var1) { // L: 5213
				boolean var3 = (Client.drawPlayerNames & 2) != 0; // L: 5216
				var2 = var3 && var0.isFriendsChatMember(); // L: 5218
			}

			return var2; // L: 5220
		}
	}
}
