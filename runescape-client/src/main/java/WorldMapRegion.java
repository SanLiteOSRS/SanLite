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

@ObfuscatedName("ke")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1732317023
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1867771279
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("am")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2107215945
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1524962913
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("aa")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ap")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ay")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 61
		this.regionY = var2; // L: 62
		this.worldMapData1List = new LinkedList(); // L: 63
		this.icon0List = new LinkedList(); // L: 64
		this.iconMap = new HashMap(); // L: 65
		this.backgroundColor = var3 | -16777216; // L: 66
		this.fonts = var4; // L: 67
	} // L: 68

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-15"
	)
	void method5346(int var1, int var2, int var3) {
		SpritePixels var4 = class33.method479(this.regionX, this.regionY, this.pixelsPerTile); // L: 71
		if (var4 != null) { // L: 72
			if (var3 == this.pixelsPerTile * 64) { // L: 73
				var4.drawAt(var1, var2); // L: 74
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 77
			}

		}
	} // L: 79

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Ljava/util/List;S)V",
		garbageValue = "-25171"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 82
		this.worldMapData_0 = var1; // L: 83
		this.addAllToIconList(var2); // L: 84
	} // L: 85

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-121213257"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIILkv;S)V",
		garbageValue = "29922"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 101
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 102
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 103
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 104
					if (var9 != null && var9.length != 0) { // L: 105
						WorldMapDecoration[] var10 = var9; // L: 109

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 110
							WorldMapDecoration var12 = var10[var11]; // L: 111
							ObjectComposition var13 = class91.getObjectDefinition(var12.objectDefinitionId); // L: 113
							if (TileItem.method2730(var13)) { // L: 114
								this.getIcon(var13, var8, var6, var7, var5); // L: 117
								continue label51; // L: 118
							}
						}
					}
				}
			}
		}

	} // L: 125

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liz;IIILkv;I)V",
		garbageValue = "1079014997"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 128
		Coord var7 = null; // L: 129
		if (this.worldMapData_0 != null) { // L: 130
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4); // L: 131
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 134
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 4096 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 4096 + var8.getChunkYLow() * 8); // L: 135
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 138
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 139
		} else {
			var9 = class148.WorldMapElement_get(var1.mapIconId); // L: 142
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 143
		}

		var9 = class148.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 145
		if (var9.field1940) { // L: 146
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 147
		}

	} // L: 149

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-1862948896"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 163

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 164
			if (class148.WorldMapElement_get(var3.element).field1940 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 166 169
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5366(var3.element)); // L: 170
				this.icon0List.add(var4); // L: 171
			}
		}

	} // L: 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2032089595"
	)
	void method5344() {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lom;B)Z",
		garbageValue = "24"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILlf;[Lun;Lom;Lom;B)V",
		garbageValue = "127"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 223
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 224
			if (class33.method479(this.regionX, this.regionY, var1) == null) { // L: 227
				boolean var6 = true; // L: 230
				var6 &= this.loadGeography(var4); // L: 231
				int var8;
				if (this.worldMapData_0 != null) { // L: 234
					var8 = this.worldMapData_0.groupId; // L: 235
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 238
				}

				var6 &= var5.tryLoadGroup(var8); // L: 240
				if (var6) { // L: 241
					byte[] var7 = var5.takeFileFlat(var8); // L: 242
					WorldMapSprite var9 = Nameable.method8067(var7); // L: 243
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 244
					var10.setRaster(); // L: 245
					if (this.worldMapData_0 != null) { // L: 246
						this.method5349(var2, var3, var9); // L: 247
					} else {
						this.method5350(var2, var3, var9); // L: 250
					}

					class354.method6777(var10, this.regionX, this.regionY, this.pixelsPerTile); // L: 252
					this.method5344(); // L: 253
				}
			}
		}
	} // L: 225 228 254

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "0"
	)
	void method5347(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 257
			var4 = new HashSet(); // L: 258
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 260
		this.drawMapLinks(var1, var2, var4, var3); // L: 261
	} // L: 262

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "28125091"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 265

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 266
			if (var5.hasValidElement()) { // L: 268
				int var6 = var5.getElement(); // L: 269
				if (var1.contains(var6)) { // L: 270
					WorldMapElement var7 = class148.WorldMapElement_get(var6); // L: 271
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 272
				}
			}
		}

		this.method5358(var1, var2, var3); // L: 276
	} // L: 277

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llf;[Lun;Lkc;I)V",
		garbageValue = "-1042706129"
	)
	void method5349(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 280
			for (var5 = 0; var5 < 64; ++var5) { // L: 281
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 282
				this.method5404(var4, var5, this.worldMapData_0, var1); // L: 283
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 286
			for (var5 = 0; var5 < 64; ++var5) { // L: 287
				this.method5385(var4, var5, this.worldMapData_0, var1, var2); // L: 288
			}
		}

	} // L: 291

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llf;[Lun;Lkc;I)V",
		garbageValue = "1664111804"
	)
	void method5350(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 294

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 295

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 297
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 298
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 299
					this.method5404(var6, var7, var5, var1); // L: 300
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 305

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 306

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 308
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 309
					this.method5385(var6, var7, var5, var1, var2); // L: 310
				}
			}
		}

	} // L: 315

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Llf;[Lun;I)V",
		garbageValue = "560650516"
	)
	void method5385(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5356(var1, var2, var3); // L: 318
		this.method5355(var1, var2, var3, var5); // L: 319
	} // L: 320

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Llf;Lkc;B)V",
		garbageValue = "120"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 323
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 324
		if (var6 == -1 && var7 == -1) { // L: 325
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 326
		}

		int var8 = 16711935; // L: 328
		if (var7 != -1) { // L: 329
			var8 = ScriptEvent.method2327(var7, this.backgroundColor); // L: 330
		}

		if (var7 > -1 && var3.field3034[0][var1][var2] == 0) { // L: 332
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 333
		} else {
			int var9 = this.method5354(var1, var2, var3, var5); // L: 336
			if (var7 == -1) { // L: 337
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 338
			} else {
				var4.method5786(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3034[0][var1][var2], var3.field3035[0][var1][var2]); // L: 341
			}
		}
	} // L: 334 339 342

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Llf;S)V",
		garbageValue = "-16059"
	)
	void method5404(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 345
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 346
			if (var6 > -1) { // L: 347
				int var7 = ScriptEvent.method2327(var6, this.backgroundColor); // L: 348
				if (var3.field3034[var5][var1][var2] == 0) { // L: 349
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 350
				} else {
					var4.method5786(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3034[var5][var1][var2], var3.field3035[var5][var1][var2]); // L: 353
				}
			}
		}

	} // L: 357

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILkv;Lkc;I)I",
		garbageValue = "-453973498"
	)
	int method5354(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 360 361 363
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILkv;[Lun;B)V",
		garbageValue = "-100"
	)
	void method5355(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 367
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 368
			if (var6 != null && var6.length != 0) { // L: 369
				WorldMapDecoration[] var7 = var6; // L: 373

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 374
					WorldMapDecoration var9 = var7[var8]; // L: 375
					if (class314.method5899(var9.decoration) || class209.method3851(var9.decoration)) { // L: 377
						ObjectComposition var10 = class91.getObjectDefinition(var9.objectDefinitionId); // L: 378
						if (var10.mapSceneId != -1) { // L: 379
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 380
								var4[var10.mapSceneId].method9662(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 384
							} else {
								var4[var10.mapSceneId].method9662(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 381
							}
						}
					}
				}
			}
		}

	} // L: 392

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILkv;I)V",
		garbageValue = "-428310467"
	)
	void method5356(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 395
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 396
			if (var5 != null && var5.length != 0) { // L: 397
				WorldMapDecoration[] var6 = var5; // L: 401

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 402
					WorldMapDecoration var8 = var6[var7]; // L: 403
					if (class60.method1185(var8.decoration)) { // L: 405
						ObjectComposition var9 = class91.getObjectDefinition(var8.objectDefinitionId); // L: 406
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 407
						if (var8.decoration == WorldMapDecorationType.field3876.id) { // L: 408
							this.method5446(var1, var2, var8.rotation, var10); // L: 409
						}

						if (var8.decoration == WorldMapDecorationType.field3859.id) { // L: 411
							this.method5446(var1, var2, var8.rotation, -3355444); // L: 412
							this.method5446(var1, var2, var8.rotation + 1, var10); // L: 413
						}

						if (var8.decoration == WorldMapDecorationType.field3860.id) { // L: 415
							if (var8.rotation == 0) { // L: 416
								Rasterizer2D.method9555(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9555(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 417
							}

							if (var8.rotation == 2) { // L: 418
								Rasterizer2D.method9555(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 419
								Rasterizer2D.method9555(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3861.id) { // L: 421
							int var11 = var8.rotation % 2; // L: 422
							int var12;
							if (var11 == 0) { // L: 423
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 424
									Rasterizer2D.method9555(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 425
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 429
									Rasterizer2D.method9555(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 430
								}
							}
						}
					}
				}
			}
		}

	} // L: 439

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1490709112"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 442
		float var6 = var5 / 2.0F; // L: 443
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 444

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 445
			Coord var9 = (Coord)var8.getKey(); // L: 447
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 448
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 449
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 450
			if (var12 != null && var12.hasValidElement()) { // L: 451
				var12.screenX = var10; // L: 452
				var12.screenY = var11; // L: 453
				WorldMapElement var13 = class148.WorldMapElement_get(var12.getElement()); // L: 454
				if (!var3.contains(var13.getObjectId())) { // L: 455
					this.method5360(var12, var10, var11, var5); // L: 456
				}
			}
		}

	} // L: 461

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1547039881"
	)
	void method5358(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 464

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 465
			if (var5.hasValidElement()) { // L: 467
				WorldMapElement var6 = class148.WorldMapElement_get(var5.getElement()); // L: 468
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 469
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 470
				}
			}
		}

	} // L: 474

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lhp;IIIII)V",
		garbageValue = "-1967099559"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 477
		if (var6 != null) { // L: 478
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 481
			if (var4 % var5 < var5 / 2) { // L: 482
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 483
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 484
			}

		}
	} // L: 479 486

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lll;IIFI)V",
		garbageValue = "543653437"
	)
	void method5360(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class148.WorldMapElement_get(var1.getElement()); // L: 489
		this.method5361(var5, var2, var3); // L: 490
		this.method5362(var1, var5, var2, var3, var4); // L: 491
	} // L: 492

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lhp;IIS)V",
		garbageValue = "18184"
	)
	void method5361(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 495
		if (var4 != null) { // L: 496
			int var5 = this.method5364(var4, var1.horizontalAlignment); // L: 497
			int var6 = this.method5365(var4, var1.verticalAlignment); // L: 498
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 499
		}

	} // L: 501

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lll;Lhp;IIFB)V",
		garbageValue = "-110"
	)
	void method5362(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 504
		if (var6 != null) { // L: 505
			if (var6.size.method5218(var5)) { // L: 508
				Font var7 = (Font)this.fonts.get(var6.size); // L: 511
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1953, 0, 1, 0, var7.ascent / 2); // L: 512
			}
		}
	} // L: 506 509 513

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "105"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 516
		Iterator var6 = this.icon0List.iterator(); // L: 517

		while (var6.hasNext()) { // L: 530
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 518
			if (var7.hasValidElement()) { // L: 520
				int var8 = var7.coord2.x % 64; // L: 521
				int var9 = var7.coord2.y % 64; // L: 522
				var7.screenX = (int)((float)var8 * var5 + (float)var1); // L: 523
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9)); // L: 524
				if (!var3.contains(var7.getElement())) { // L: 525
					this.method5360(var7, var7.screenX, var7.screenY, var5); // L: 528
				}
			}
		}

	} // L: 531

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lud;Lhb;B)I",
		garbageValue = "0"
	)
	int method5364(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 534
		case 0:
			return -var1.subWidth / 2; // L: 541
		case 1:
			return 0; // L: 537
		default:
			return -var1.subWidth; // L: 545
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lud;Lhr;I)I",
		garbageValue = "1581572144"
	)
	int method5365(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 551
		case 0:
			return -var1.subHeight / 2; // L: 554
		case 1:
			return 0; // L: 562
		default:
			return -var1.subHeight; // L: 558
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkd;",
		garbageValue = "91"
	)
	WorldMapLabel method5366(int var1) {
		WorldMapElement var2 = class148.WorldMapElement_get(var1); // L: 589
		return this.createMapLabel(var2); // L: 590
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lhp;I)Lkd;",
		garbageValue = "273104668"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 594
			WorldMapLabelSize var2 = WorldMapLabelSize.method5212(var1.textSize); // L: 597
			if (var2 == null) { // L: 598
				return null; // L: 599
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 601
				if (var3 == null) { // L: 602
					return null; // L: 603
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 605
					String[] var5 = new String[var4]; // L: 606
					var3.breakLines(var1.name, (int[])null, var5); // L: 607
					int var6 = var5.length * var3.ascent / 2; // L: 608
					int var7 = 0; // L: 609
					String[] var8 = var5; // L: 611

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 612
						String var10 = var8[var9]; // L: 613
						int var11 = var3.stringWidth(var10); // L: 615
						if (var11 > var7) { // L: 616
							var7 = var11; // L: 617
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 622
				}
			}
		} else {
			return null; // L: 595
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "217734504"
	)
	List method5368(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 626
		if (var4 >= var1 && var5 >= var2) { // L: 627
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 628
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 629
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 630
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 632
						var6.add(var8); // L: 633
					}
				}

				var7 = this.icon0List.iterator(); // L: 637

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 638
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 640
						var6.add(var8); // L: 641
					}
				}

				return var6; // L: 645
			} else {
				return var6; // L: 636
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-1898009311"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 649
		var1.addAll(this.icon0List); // L: 650
		var1.addAll(this.iconMap.values()); // L: 651
		return var1; // L: 652
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1887311417"
	)
	void method5446(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 656
		if (var3 == 0) { // L: 657
			Rasterizer2D.method9557(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 658
			Rasterizer2D.method9555(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 659
			Rasterizer2D.method9557(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9555(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 660
		}

	} // L: 661

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lcr;",
		garbageValue = "-1821344982"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}
}
