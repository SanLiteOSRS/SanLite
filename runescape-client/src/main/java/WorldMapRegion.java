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

@ObfuscatedName("jz")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ba")
	static String field2906;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1388785525
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1692613191
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ac")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1907936479
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 560060975
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("aw")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ae")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ah")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 57
		this.regionY = var2; // L: 58
		this.worldMapData1List = new LinkedList(); // L: 59
		this.icon0List = new LinkedList(); // L: 60
		this.iconMap = new HashMap(); // L: 61
		this.backgroundColor = var3 | -16777216; // L: 62
		this.fonts = var4; // L: 63
	} // L: 64

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-919499585"
	)
	void method5175(int var1, int var2, int var3) {
		SpritePixels var4 = class147.method3133(this.regionX, this.regionY, this.pixelsPerTile); // L: 67
		if (var4 != null) { // L: 68
			if (var3 == this.pixelsPerTile * 64) { // L: 69
				var4.drawAt(var1, var2); // L: 70
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 73
			}

		}
	} // L: 75

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/util/List;B)V",
		garbageValue = "3"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 78
		this.worldMapData_0 = var1; // L: 79
		this.addAllToIconList(var2); // L: 80
	} // L: 81

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "0"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 84
		Iterator var3 = var1.iterator(); // L: 85

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 86
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 88
				this.worldMapData1List.add(var4); // L: 89
			}
		}

		this.addAllToIconList(var2); // L: 93
	} // L: 94

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIILkv;B)V",
		garbageValue = "29"
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
							ObjectComposition var13 = class59.getObjectDefinition(var12.objectDefinitionId); // L: 109
							if (class181.method3524(var13)) { // L: 110
								this.getIcon(var13, var8, var6, var7, var5); // L: 113
								continue label50; // L: 114
							}
						}
					}
				}
			}
		}

	} // L: 121

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IIILkv;B)V",
		garbageValue = "-73"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 124
		Coord var7 = null; // L: 125
		if (this.worldMapData_0 != null) { // L: 126
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 127
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 130
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 131
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 134
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 135
		} else {
			var9 = class147.WorldMapElement_get(var1.mapIconId); // L: 138
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 139
		}

		var9 = class147.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 141
		if (var9.field1921) { // L: 142
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 143
		}

	} // L: 145

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1275434180"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 148

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 149
			if (var2 instanceof WorldMapIcon_1) { // L: 151
				((WorldMapIcon_1)var2).init(); // L: 152
			}
		}

	} // L: 156

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-142186610"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 159

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 160
			if (class147.WorldMapElement_get(var3.element).field1921 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 162 165
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5204(var3.element)); // L: 166
				this.icon0List.add(var4); // L: 167
			}
		}

	} // L: 171

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-31840"
	)
	void method5182() {
		if (this.worldMapData_0 != null) { // L: 174
			this.worldMapData_0.reset(); // L: 175
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 178

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 179
				var2.reset(); // L: 181
			}
		}

	} // L: 185

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)Z",
		garbageValue = "-1715657385"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 188
		if (this.worldMapData_0 != null) { // L: 189
			this.worldMapData_0.loadGeography(var1); // L: 190
			if (this.worldMapData_0.isFullyLoaded()) { // L: 191
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 192
				return true; // L: 193
			} else {
				return false; // L: 195
			}
		} else {
			boolean var2 = true; // L: 198

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 199 203
				var4 = (WorldMapData_1)var3.next(); // L: 200
				var4.loadGeography(var1); // L: 202
			}

			if (var2) { // L: 206
				var3 = this.worldMapData1List.iterator(); // L: 207

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 208
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 210
				}
			}

			return var2; // L: 214
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILkn;[Lty;Lni;Lni;I)V",
		garbageValue = "-1485346621"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 219
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 220
			if (class147.method3133(this.regionX, this.regionY, var1) == null) { // L: 223
				boolean var6 = true; // L: 226
				var6 &= this.loadGeography(var4); // L: 227
				int var8;
				if (this.worldMapData_0 != null) { // L: 230
					var8 = this.worldMapData_0.groupId; // L: 231
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 234
				}

				var6 &= var5.tryLoadGroup(var8); // L: 236
				if (var6) { // L: 237
					byte[] var7 = var5.takeFileFlat(var8); // L: 238
					WorldMapSprite var9 = MilliClock.method3508(var7); // L: 239
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 240
					var10.setRaster(); // L: 241
					if (this.worldMapData_0 != null) { // L: 242
						this.method5187(var2, var3, var9); // L: 243
					} else {
						this.method5300(var2, var3, var9); // L: 246
					}

					UserComparator6.method2900(var10, this.regionX, this.regionY, this.pixelsPerTile); // L: 248
					this.method5182(); // L: 249
				}
			}
		}
	} // L: 221 224 250

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "1"
	)
	void method5275(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 253
			var4 = new HashSet(); // L: 254
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 256
		this.drawMapLinks(var1, var2, var4, var3); // L: 257
	} // L: 258

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1721718750"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 261

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 262
			if (var5.hasValidElement()) { // L: 264
				int var6 = var5.getElement(); // L: 265
				if (var1.contains(var6)) { // L: 266
					WorldMapElement var7 = class147.WorldMapElement_get(var6); // L: 267
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 268
				}
			}
		}

		this.method5174(var1, var2, var3); // L: 272
	} // L: 273

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkn;[Lty;Lkk;B)V",
		garbageValue = "-98"
	)
	void method5187(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 276
			for (var5 = 0; var5 < 64; ++var5) { // L: 277
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 278
				this.method5191(var4, var5, this.worldMapData_0, var1); // L: 279
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 282
			for (var5 = 0; var5 < 64; ++var5) { // L: 283
				this.method5189(var4, var5, this.worldMapData_0, var1, var2); // L: 284
			}
		}

	} // L: 287

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lkn;[Lty;Lkk;B)V",
		garbageValue = "8"
	)
	void method5300(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 290

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 291

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 293
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 294
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 295
					this.method5191(var6, var7, var5, var1); // L: 296
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 301

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 302

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 304
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 305
					this.method5189(var6, var7, var5, var1, var2); // L: 306
				}
			}
		}

	} // L: 311

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Lkn;[Lty;B)V",
		garbageValue = "18"
	)
	void method5189(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5194(var1, var2, var3); // L: 314
		this.method5193(var1, var2, var3, var5); // L: 315
	} // L: 316

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Lkn;Lkk;I)V",
		garbageValue = "1493952822"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 319
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 320
		if (var6 == -1 && var7 == -1) { // L: 321
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 322
		}

		int var8 = 16711935; // L: 324
		int var9;
		if (var7 != -1) { // L: 325
			int var10 = this.backgroundColor; // L: 327
			FloorOverlayDefinition var11 = StructComposition.method3821(var7); // L: 329
			if (var11 == null) { // L: 330
				var9 = var10; // L: 331
			} else {
				int var12;
				int var13;
				if (var11.secondaryRgb >= 0) { // L: 334
					var12 = class59.hslToRgb(var11.secondaryHue, var11.secondarySaturation, var11.secondaryLightness); // L: 335
					var13 = WorldMapIcon_1.method5053(var12, 96); // L: 336
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 337
				} else if (var11.texture >= 0) { // L: 339
					var12 = WorldMapIcon_1.method5053(Rasterizer3D.field2512.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 340
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 341
				} else if (var11.primaryRgb == 16711935) { // L: 343
					var9 = var10; // L: 344
				} else {
					var12 = class59.hslToRgb(var11.hue, var11.saturation, var11.lightness); // L: 347
					var13 = WorldMapIcon_1.method5053(var12, 96); // L: 348
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 349
				}
			}

			var8 = var9; // L: 352
		}

		if (var7 > -1 && var3.field2993[0][var1][var2] == 0) { // L: 354
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 355
		} else {
			var9 = this.method5192(var1, var2, var3, var5); // L: 358
			if (var7 == -1) { // L: 359
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 360
			} else {
				var4.method5601(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2993[0][var1][var2], var3.field2994[0][var1][var2]); // L: 363
			}
		}
	} // L: 356 361 364

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Lkn;I)V",
		garbageValue = "-1178768950"
	)
	void method5191(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 367
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 368
			if (var6 > -1) { // L: 369
				int var8 = this.backgroundColor; // L: 371
				FloorOverlayDefinition var9 = StructComposition.method3821(var6); // L: 373
				int var7;
				if (var9 == null) { // L: 374
					var7 = var8; // L: 375
				} else {
					int var10;
					int var11;
					if (var9.secondaryRgb >= 0) { // L: 378
						var10 = class59.hslToRgb(var9.secondaryHue, var9.secondarySaturation, var9.secondaryLightness); // L: 379
						var11 = WorldMapIcon_1.method5053(var10, 96); // L: 380
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216; // L: 381
					} else if (var9.texture >= 0) { // L: 383
						var10 = WorldMapIcon_1.method5053(Rasterizer3D.field2512.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 384
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 385
					} else if (var9.primaryRgb == 16711935) { // L: 387
						var7 = var8; // L: 388
					} else {
						var10 = class59.hslToRgb(var9.hue, var9.saturation, var9.lightness); // L: 391
						var11 = WorldMapIcon_1.method5053(var10, 96); // L: 392
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216; // L: 393
					}
				}

				if (var3.field2993[var5][var1][var2] == 0) { // L: 397
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 398
				} else {
					var4.method5601(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2993[var5][var1][var2], var3.field2994[var5][var1][var2]); // L: 401
				}
			}
		}

	} // L: 405

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Lkk;B)I",
		garbageValue = "124"
	)
	int method5192(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 408 409 411
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILkv;[Lty;I)V",
		garbageValue = "1227362981"
	)
	void method5193(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 415
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 416
			if (var6 != null && var6.length != 0) { // L: 417
				WorldMapDecoration[] var7 = var6; // L: 421

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 422
					WorldMapDecoration var9 = var7[var8]; // L: 423
					int var11 = var9.decoration; // L: 426
					boolean var10 = var11 >= WorldMapDecorationType.field3818.id && var11 <= WorldMapDecorationType.field3819.id; // L: 428
					if (!var10) { // L: 431
						int var13 = var9.decoration; // L: 433
						boolean var12 = var13 == WorldMapDecorationType.field3820.id; // L: 435
						if (!var12) { // L: 437
							continue;
						}
					}

					ObjectComposition var14 = class59.getObjectDefinition(var9.objectDefinitionId); // L: 439
					if (var14.mapSceneId != -1) { // L: 440
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 441
							var4[var14.mapSceneId].method9409(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 445
						} else {
							var4[var14.mapSceneId].method9409(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 442
						}
					}
				}
			}
		}

	} // L: 453

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILkv;B)V",
		garbageValue = "74"
	)
	void method5194(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 456
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 457
			if (var5 != null && var5.length != 0) { // L: 458
				WorldMapDecoration[] var6 = var5; // L: 462

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 463
					WorldMapDecoration var8 = var6[var7]; // L: 464
					if (class144.method3120(var8.decoration)) { // L: 466
						ObjectComposition var9 = class59.getObjectDefinition(var8.objectDefinitionId); // L: 467
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 468
						if (var8.decoration == WorldMapDecorationType.field3801.id) { // L: 469
							this.method5208(var1, var2, var8.rotation, var10); // L: 470
						}

						if (var8.decoration == WorldMapDecorationType.field3807.id) { // L: 472
							this.method5208(var1, var2, var8.rotation, -3355444); // L: 473
							this.method5208(var1, var2, var8.rotation + 1, var10); // L: 474
						}

						if (var8.decoration == WorldMapDecorationType.field3810.id) { // L: 476
							if (var8.rotation == 0) { // L: 477
								Rasterizer2D.method9300(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9300(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 478
							}

							if (var8.rotation == 2) { // L: 479
								Rasterizer2D.method9300(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 480
								Rasterizer2D.method9300(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3802.id) { // L: 482
							int var11 = var8.rotation % 2; // L: 483
							int var12;
							if (var11 == 0) { // L: 484
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 485
									Rasterizer2D.method9300(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 486
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 490
									Rasterizer2D.method9300(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 491
								}
							}
						}
					}
				}
			}
		}

	} // L: 500

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "0"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 503
		float var6 = var5 / 2.0F; // L: 504
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 505

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 506
			Coord var9 = (Coord)var8.getKey(); // L: 508
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 509
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 510
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 511
			if (var12 != null && var12.hasValidElement()) { // L: 512
				var12.screenX = var10; // L: 513
				var12.screenY = var11; // L: 514
				WorldMapElement var13 = class147.WorldMapElement_get(var12.getElement()); // L: 515
				if (!var3.contains(var13.getObjectId())) { // L: 516
					this.method5198(var12, var10, var11, var5); // L: 517
				}
			}
		}

	} // L: 522

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-13502712"
	)
	void method5174(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 525

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 526
			if (var5.hasValidElement()) { // L: 528
				WorldMapElement var6 = class147.WorldMapElement_get(var5.getElement()); // L: 529
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 530
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 531
				}
			}
		}

	} // L: 535

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhk;IIIII)V",
		garbageValue = "-242463561"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 538
		if (var6 != null) { // L: 539
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 542
			if (var4 % var5 < var5 / 2) { // L: 543
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 544
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 545
			}

		}
	} // L: 540 547

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IIFI)V",
		garbageValue = "-1999537613"
	)
	void method5198(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class147.WorldMapElement_get(var1.getElement()); // L: 550
		this.method5199(var5, var2, var3); // L: 551
		this.method5200(var1, var5, var2, var3, var4); // L: 552
	} // L: 553

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lhk;IIB)V",
		garbageValue = "0"
	)
	void method5199(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 556
		if (var4 != null) { // L: 557
			int var5 = this.method5202(var4, var1.horizontalAlignment); // L: 558
			int var6 = this.method5203(var4, var1.verticalAlignment); // L: 559
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 560
		}

	} // L: 562

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lkx;Lhk;IIFI)V",
		garbageValue = "1835242240"
	)
	void method5200(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 565
		if (var6 != null) { // L: 566
			if (var6.size.method5040(var5)) { // L: 569
				Font var7 = (Font)this.fonts.get(var6.size); // L: 572
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1919, 0, 1, 0, var7.ascent / 2); // L: 573
			}
		}
	} // L: 567 570 574

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "32"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 577
		Iterator var6 = this.icon0List.iterator(); // L: 578

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 579
			if (var7.hasValidElement()) { // L: 581
				int var8 = var7.coord2.x % 64; // L: 582
				int var9 = var7.coord2.y % 64; // L: 583
				var7.screenX = (int)(var5 * (float)var8 + (float)var1); // L: 584
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5); // L: 585
				if (!var3.contains(var7.getElement())) { // L: 586
					this.method5198(var7, var7.screenX, var7.screenY, var5); // L: 589
				}
			}
		}

	} // L: 592

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ltt;Lhv;B)I",
		garbageValue = "-12"
	)
	int method5202(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 595
		case 0:
			return 0; // L: 598
		case 2:
			return -var1.subWidth / 2; // L: 606
		default:
			return -var1.subWidth; // L: 602
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ltt;Lhz;B)I",
		garbageValue = "0"
	)
	int method5203(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 612
		case 0:
			return -var1.subHeight / 2; // L: 615
		case 1:
			return 0; // L: 623
		default:
			return -var1.subHeight; // L: 619
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)Lko;",
		garbageValue = "-57"
	)
	WorldMapLabel method5204(int var1) {
		WorldMapElement var2 = class147.WorldMapElement_get(var1); // L: 650
		return this.createMapLabel(var2); // L: 651
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lhk;I)Lko;",
		garbageValue = "1343621853"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 655
			int var3 = var1.textSize; // L: 659
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large}; // L: 664
			WorldMapLabelSize[] var5 = var4; // L: 666
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 677
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 668
				if (var3 == var7.field2864) { // L: 670
					var2 = var7; // L: 671
					break;
				}

				++var6; // L: 667
			}

			if (var2 == null) { // L: 680
				return null; // L: 681
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 683
				if (var14 == null) { // L: 684
					return null; // L: 685
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 687
					String[] var15 = new String[var6]; // L: 688
					var14.breakLines(var1.name, (int[])null, var15); // L: 689
					int var8 = var15.length * var14.ascent / 2; // L: 690
					int var9 = 0; // L: 691
					String[] var10 = var15; // L: 693

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 694
						String var12 = var10[var11]; // L: 695
						int var13 = var14.stringWidth(var12); // L: 697
						if (var13 > var9) { // L: 698
							var9 = var13; // L: 699
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 704
				}
			}
		} else {
			return null; // L: 656
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-2139601904"
	)
	List method5206(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 708
		if (var4 >= var1 && var5 >= var2) { // L: 709
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 710
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 711
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 712
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 714
						var6.add(var8); // L: 715
					}
				}

				var7 = this.icon0List.iterator(); // L: 719

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 720
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 722
						var6.add(var8); // L: 723
					}
				}

				return var6; // L: 727
			} else {
				return var6; // L: 718
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/List;",
		garbageValue = "-13473"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 731
		var1.addAll(this.icon0List); // L: 732
		var1.addAll(this.iconMap.values()); // L: 733
		return var1; // L: 734
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "466106849"
	)
	void method5208(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 738
		if (var3 == 0) { // L: 739
			Rasterizer2D.method9302(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 740
			Rasterizer2D.method9300(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 741
			Rasterizer2D.method9302(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9300(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 742
		}

	} // L: 743

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;Lsc;B)Lsc;",
		garbageValue = "84"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = class298.method5751(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}
}
