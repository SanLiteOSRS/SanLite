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

@ObfuscatedName("ja")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1463280083
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 204426275
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ap")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -611124617
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 868662197
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ax")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("as")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ay")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 54
		this.regionY = var2; // L: 55
		this.worldMapData1List = new LinkedList(); // L: 56
		this.icon0List = new LinkedList(); // L: 57
		this.iconMap = new HashMap(); // L: 58
		this.backgroundColor = var3 | -16777216; // L: 59
		this.fonts = var4; // L: 60
	} // L: 61

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1982933335"
	)
	void method4922(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 65
		int var6 = this.regionY; // L: 66
		int var7 = this.pixelsPerTile; // L: 67
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(class122.method2891(var5, var6, var7)); // L: 69
		if (var4 != null) { // L: 72
			if (var3 == this.pixelsPerTile * 64) { // L: 73
				var4.drawAt(var1, var2); // L: 74
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 77
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljo;Ljava/util/List;I)V",
		garbageValue = "2014323824"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	} // L: 85

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-1424204075"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 88
		Iterator var3 = var1.iterator(); // L: 89

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 90
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 92
				this.worldMapData1List.add(var4); // L: 93
			}
		}

		this.addAllToIconList(var2); // L: 97
	} // L: 98

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjs;I)V",
		garbageValue = "2043757237"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 101
			label50:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 102
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 103
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 104
					if (var9 != null && var9.length != 0) { // L: 105
						WorldMapDecoration[] var10 = var9; // L: 109

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 110
							WorldMapDecoration var12 = var10[var11]; // L: 111
							ObjectComposition var13 = DecorativeObject.getObjectDefinition(var12.objectDefinitionId); // L: 113
							if (class212.method4157(var13)) { // L: 114
								this.getIcon(var13, var8, var6, var7, var5); // L: 117
								continue label50; // L: 118
							}
						}
					}
				}
			}
		}

	} // L: 125

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhu;IIILjs;I)V",
		garbageValue = "1654853505"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 128
		Coord var7 = null; // L: 129
		if (this.worldMapData_0 != null) { // L: 130
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4); // L: 131
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 134
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8); // L: 135
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 138
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 139
		} else {
			var9 = class123.WorldMapElement_get(var1.mapIconId); // L: 142
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 143
		}

		var9 = class123.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 145
		if (var9.field1909) { // L: 146
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 147
		}

	} // L: 149

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1425541360"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 152

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 153
			if (var2 instanceof WorldMapIcon_1) { // L: 155
				((WorldMapIcon_1)var2).init(); // L: 156
			}
		}

	} // L: 160

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-1119956143"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 163

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 164
			if (class123.WorldMapElement_get(var3.element).field1909 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 166 169
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4987(var3.element)); // L: 170
				this.icon0List.add(var4); // L: 171
			}
		}

	} // L: 175

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-404163221"
	)
	void method4929() {
		if (this.worldMapData_0 != null) { // L: 178
			this.worldMapData_0.reset(); // L: 179
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 182

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 183
				var2.reset(); // L: 185
			}
		}

	} // L: 189

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)Z",
		garbageValue = "-1458813821"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 192
		if (this.worldMapData_0 != null) { // L: 193
			this.worldMapData_0.loadGeography(var1); // L: 194
			if (this.worldMapData_0.isFullyLoaded()) { // L: 195
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 196
				return true; // L: 197
			} else {
				return false; // L: 199
			}
		} else {
			boolean var2 = true; // L: 202

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 203 207
				var4 = (WorldMapData_1)var3.next(); // L: 204
				var4.loadGeography(var1); // L: 206
			}

			if (var2) { // L: 210
				var3 = this.worldMapData1List.iterator(); // L: 211

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 212
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 214
				}
			}

			return var2; // L: 218
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILkn;[Lsp;Lne;Lne;I)V",
		garbageValue = "88986449"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 223
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 224
			int var7 = this.regionX; // L: 228
			int var8 = this.regionY; // L: 229
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(class122.method2891(var7, var8, var1)); // L: 231
			if (var6 == null) { // L: 233
				boolean var9 = true; // L: 236
				var9 &= this.loadGeography(var4); // L: 237
				int var11;
				if (this.worldMapData_0 != null) { // L: 240
					var11 = this.worldMapData_0.groupId; // L: 241
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 244
				}

				var9 &= var5.tryLoadGroup(var11); // L: 246
				if (var9) { // L: 247
					byte[] var10 = var5.takeFileFlat(var11); // L: 248
					WorldMapSprite var12 = WorldMapLabelSize.method4796(var10); // L: 249
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 250
					var13.setRaster(); // L: 251
					if (this.worldMapData_0 != null) { // L: 252
						this.method4934(var2, var3, var12); // L: 253
					} else {
						this.method4935(var2, var3, var12); // L: 256
					}

					WorldMapArea.method4918(var13, this.regionX, this.regionY, this.pixelsPerTile); // L: 258
					this.method4929(); // L: 259
				}
			}
		}
	} // L: 225 234 260

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-1086147415"
	)
	void method4932(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 263
			var4 = new HashSet(); // L: 264
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 266
		this.drawMapLinks(var1, var2, var4, var3); // L: 267
	} // L: 268

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-86"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 271

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 272
			if (var5.hasValidElement()) { // L: 274
				int var6 = var5.getElement(); // L: 275
				if (var1.contains(var6)) { // L: 276
					WorldMapElement var7 = class123.WorldMapElement_get(var6); // L: 277
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 278
				}
			}
		}

		this.method4943(var1, var2, var3); // L: 282
	} // L: 283

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lkn;[Lsp;Ljn;I)V",
		garbageValue = "1204033665"
	)
	void method4934(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 286
			for (var5 = 0; var5 < 64; ++var5) { // L: 287
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 288
				this.method4938(var4, var5, this.worldMapData_0, var1); // L: 289
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 292
			for (var5 = 0; var5 < 64; ++var5) { // L: 293
				this.method4986(var4, var5, this.worldMapData_0, var1, var2); // L: 294
			}
		}

	} // L: 297

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkn;[Lsp;Ljn;B)V",
		garbageValue = "-108"
	)
	void method4935(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 300

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 301

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 303
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 304
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 305
					this.method4938(var6, var7, var5, var1); // L: 306
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 311

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 312

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 314
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 315
					this.method4986(var6, var7, var5, var1, var2); // L: 316
				}
			}
		}

	} // L: 321

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILjs;Lkn;[Lsp;B)V",
		garbageValue = "-79"
	)
	void method4986(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4941(var1, var2, var3); // L: 324
		this.method4940(var1, var2, var3, var5); // L: 325
	} // L: 326

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IILjs;Lkn;Ljn;I)V",
		garbageValue = "1894929838"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 329
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 330
		if (var6 == -1 && var7 == -1) { // L: 331
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 332
		}

		int var8 = 16711935; // L: 334
		int var9;
		if (var7 != -1) { // L: 335
			int var10 = this.backgroundColor; // L: 337
			FloorOverlayDefinition var11 = class13.method160(var7); // L: 339
			if (var11 == null) { // L: 340
				var9 = var10; // L: 341
			} else {
				int var12;
				int var13;
				if (var11.secondaryRgb >= 0) { // L: 344
					var12 = class156.method3300(var11.secondaryHue, var11.secondarySaturation, var11.secondaryLightness); // L: 345
					var13 = WorldMapLabelSize.method4800(var12, 96); // L: 346
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 347
				} else if (var11.texture >= 0) { // L: 349
					var12 = WorldMapLabelSize.method4800(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 350
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216; // L: 351
				} else if (var11.primaryRgb == 16711935) { // L: 353
					var9 = var10; // L: 354
				} else {
					var12 = class156.method3300(var11.hue, var11.saturation, var11.lightness); // L: 357
					var13 = WorldMapLabelSize.method4800(var12, 96); // L: 358
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216; // L: 359
				}
			}

			var8 = var9; // L: 362
		}

		if (var7 > -1 && var3.field2949[0][var1][var2] == 0) { // L: 364
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 365
		} else {
			var9 = this.method5051(var1, var2, var3, var5); // L: 368
			if (var7 == -1) { // L: 369
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 370
			} else {
				var4.method5368(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2949[0][var1][var2], var3.field2952[0][var1][var2]); // L: 373
			}
		}
	} // L: 366 371 374

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILjs;Lkn;I)V",
		garbageValue = "-1652835948"
	)
	void method4938(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 377
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 378
			if (var6 > -1) { // L: 379
				int var8 = this.backgroundColor; // L: 381
				FloorOverlayDefinition var9 = class13.method160(var6); // L: 383
				int var7;
				if (var9 == null) { // L: 384
					var7 = var8; // L: 385
				} else {
					int var10;
					int var11;
					if (var9.secondaryRgb >= 0) { // L: 388
						var10 = class156.method3300(var9.secondaryHue, var9.secondarySaturation, var9.secondaryLightness); // L: 389
						var11 = WorldMapLabelSize.method4800(var10, 96); // L: 390
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216; // L: 391
					} else if (var9.texture >= 0) { // L: 393
						var10 = WorldMapLabelSize.method4800(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 394
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 395
					} else if (var9.primaryRgb == 16711935) { // L: 397
						var7 = var8; // L: 398
					} else {
						var10 = class156.method3300(var9.hue, var9.saturation, var9.lightness); // L: 401
						var11 = WorldMapLabelSize.method4800(var10, 96); // L: 402
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216; // L: 403
					}
				}

				if (var3.field2949[var5][var1][var2] == 0) { // L: 407
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 408
				} else {
					var4.method5368(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2949[var5][var1][var2], var3.field2952[var5][var1][var2]); // L: 411
				}
			}
		}

	} // L: 415

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILjs;Ljn;S)I",
		garbageValue = "-5063"
	)
	int method5051(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 418 419 421
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILjs;[Lsp;B)V",
		garbageValue = "94"
	)
	void method4940(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 425
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 426
			if (var6 != null && var6.length != 0) { // L: 427
				WorldMapDecoration[] var7 = var6; // L: 431

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 432
					WorldMapDecoration var9 = var7[var8]; // L: 433
					if (!class258.method5230(var9.decoration)) { // L: 436
						int var11 = var9.decoration; // L: 438
						boolean var10 = var11 == WorldMapDecorationType.field3731.id; // L: 440
						if (!var10) { // L: 442
							continue;
						}
					}

					ObjectComposition var12 = DecorativeObject.getObjectDefinition(var9.objectDefinitionId); // L: 444
					if (var12.mapSceneId != -1) { // L: 445
						if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 446
							var4[var12.mapSceneId].method9034(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 450
						} else {
							var4[var12.mapSceneId].method9034(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 447
						}
					}
				}
			}
		}

	} // L: 458

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IILjs;I)V",
		garbageValue = "-1248991266"
	)
	void method4941(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 461
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 462
			if (var5 != null && var5.length != 0) { // L: 463
				WorldMapDecoration[] var6 = var5; // L: 467

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 468
					WorldMapDecoration var8 = var6[var7]; // L: 469
					if (Username.method9220(var8.decoration)) { // L: 471
						ObjectComposition var9 = DecorativeObject.getObjectDefinition(var8.objectDefinitionId); // L: 472
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 473
						if (var8.decoration == WorldMapDecorationType.field3721.id) { // L: 474
							this.method5001(var1, var2, var8.rotation, var10); // L: 475
						}

						if (var8.decoration == WorldMapDecorationType.field3711.id) { // L: 477
							this.method5001(var1, var2, var8.rotation, -3355444); // L: 478
							this.method5001(var1, var2, var8.rotation + 1, var10); // L: 479
						}

						if (var8.decoration == WorldMapDecorationType.field3729.id) { // L: 481
							if (var8.rotation == 0) { // L: 482
								Rasterizer2D.method8986(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method8986(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 483
							}

							if (var8.rotation == 2) { // L: 484
								Rasterizer2D.method8986(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 485
								Rasterizer2D.method8986(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3713.id) { // L: 487
							int var11 = var8.rotation % 2; // L: 488
							int var12;
							if (var11 == 0) { // L: 489
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 490
									Rasterizer2D.method8986(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 491
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 495
									Rasterizer2D.method8986(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 496
								}
							}
						}
					}
				}
			}
		}

	} // L: 505

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1908412017"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 508
		float var6 = var5 / 2.0F; // L: 509
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 510

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 511
			Coord var9 = (Coord)var8.getKey(); // L: 513
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 514
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 515
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 516
			if (var12 != null && var12.hasValidElement()) { // L: 517
				var12.screenX = var10; // L: 518
				var12.screenY = var11; // L: 519
				WorldMapElement var13 = class123.WorldMapElement_get(var12.getElement()); // L: 520
				if (!var3.contains(var13.getObjectId())) { // L: 521
					this.method4946(var12, var10, var11, var5); // L: 522
				}
			}
		}

	} // L: 527

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1342298392"
	)
	void method4943(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 530

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 531
			if (var5.hasValidElement()) { // L: 533
				WorldMapElement var6 = class123.WorldMapElement_get(var5.getElement()); // L: 534
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 535
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 536
				}
			}
		}

	} // L: 540

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lhd;IIIII)V",
		garbageValue = "1553688829"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 543
		if (var6 != null) { // L: 544
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 547
			if (var4 % var5 < var5 / 2) { // L: 548
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 549
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 550
			}

		}
	} // L: 545 552

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIFI)V",
		garbageValue = "-558166368"
	)
	void method4946(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class123.WorldMapElement_get(var1.getElement()); // L: 555
		this.method4977(var5, var2, var3); // L: 556
		this.method4947(var1, var5, var2, var3, var4); // L: 557
	} // L: 558

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lhd;III)V",
		garbageValue = "-338716339"
	)
	void method4977(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 561
		if (var4 != null) { // L: 562
			int var5 = this.method5040(var4, var1.horizontalAlignment); // L: 563
			int var6 = this.method4975(var4, var1.verticalAlignment); // L: 564
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 565
		}

	} // L: 567

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lhd;IIFB)V",
		garbageValue = "113"
	)
	void method4947(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 570
		if (var6 != null) { // L: 571
			if (var6.size.method4794(var5)) { // L: 574
				Font var7 = (Font)this.fonts.get(var6.size); // L: 577
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1899, 0, 1, 0, var7.ascent / 2); // L: 578
			}
		}
	} // L: 572 575 579

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1359594444"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 582
		Iterator var6 = this.icon0List.iterator(); // L: 583

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 584
			if (var7.hasValidElement()) { // L: 586
				int var8 = var7.coord2.x % 64; // L: 587
				int var9 = var7.coord2.y % 64; // L: 588
				var7.screenX = (int)((float)var8 * var5 + (float)var1); // L: 589
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 590
				if (!var3.contains(var7.getElement())) { // L: 591
					this.method4946(var7, var7.screenX, var7.screenY, var5); // L: 594
				}
			}
		}

	} // L: 597

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lsn;Lho;B)I",
		garbageValue = "-46"
	)
	int method5040(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 600
		case 0:
			return 0; // L: 611
		case 2:
			return -var1.subWidth / 2; // L: 607
		default:
			return -var1.subWidth; // L: 603
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lsn;Lhe;B)I",
		garbageValue = "112"
	)
	int method4975(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 617
		case 1:
			return 0; // L: 620
		case 2:
			return -var1.subHeight / 2; // L: 624
		default:
			return -var1.subHeight; // L: 628
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)Ljb;",
		garbageValue = "-1422221190"
	)
	WorldMapLabel method4987(int var1) {
		WorldMapElement var2 = class123.WorldMapElement_get(var1); // L: 655
		return this.createMapLabel(var2); // L: 656
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lhd;B)Ljb;",
		garbageValue = "6"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 660
			int var3 = var1.textSize; // L: 664
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method4795(); // L: 667
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 678
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 669
				if (var3 == var6.field2817) { // L: 671
					var2 = var6; // L: 672
					break;
				}

				++var5; // L: 668
			}

			if (var2 == null) { // L: 681
				return null; // L: 682
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 684
				if (var14 == null) { // L: 685
					return null; // L: 686
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 688
					String[] var7 = new String[var15]; // L: 689
					var14.breakLines(var1.name, (int[])null, var7); // L: 690
					int var8 = var7.length * var14.ascent / 2; // L: 691
					int var9 = 0; // L: 692
					String[] var10 = var7; // L: 694

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 695
						String var12 = var10[var11]; // L: 696
						int var13 = var14.stringWidth(var12); // L: 698
						if (var13 > var9) { // L: 699
							var9 = var13; // L: 700
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 705
				}
			}
		} else {
			return null; // L: 661
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "2030974632"
	)
	List method4971(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 709
		if (var4 >= var1 && var5 >= var2) { // L: 710
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 711
				Iterator var7 = this.iconMap.values().iterator(); // L: 712

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 713
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 715
						var6.add(var8); // L: 716
					}
				}

				var7 = this.icon0List.iterator(); // L: 720

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 721
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 723
						var6.add(var8); // L: 724
					}
				}

				return var6; // L: 728
			} else {
				return var6; // L: 719
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-1110781266"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 732
		var1.addAll(this.icon0List); // L: 733
		var1.addAll(this.iconMap.values()); // L: 734
		return var1; // L: 735
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "412302795"
	)
	void method5001(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 739
		if (var3 == 0) { // L: 740
			Rasterizer2D.method8970(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 741
			Rasterizer2D.method8986(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 742
			Rasterizer2D.method8970(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method8986(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 743
		}

	} // L: 744

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-1864704515"
	)
	public static Object method5050(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 25
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "36"
	)
	public static int method4951(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 24
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-999291246"
	)
	public static char method5007(byte var0) {
		int var1 = var0 & 255; // L: 79
		if (var1 == 0) { // L: 80
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 81
				char var2 = class365.cp1252AsciiExtension[var1 - 128]; // L: 82
				if (var2 == 0) { // L: 83
					var2 = '?';
				}

				var1 = var2; // L: 84
			}

			return (char)var1; // L: 86
		}
	}
}
