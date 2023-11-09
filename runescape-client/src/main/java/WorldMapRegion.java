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

@ObfuscatedName("hq")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1762838535
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 848398355
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("o")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -634393379
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 159236289
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("a")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("m")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("u")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 46
		this.regionY = var2; // L: 47
		this.worldMapData1List = new LinkedList(); // L: 48
		this.icon0List = new LinkedList(); // L: 49
		this.iconMap = new HashMap(); // L: 50
		this.backgroundColor = var3 | -16777216; // L: 51
		this.fonts = var4; // L: 52
	} // L: 53

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "2"
	)
	void method4587(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 57
		int var6 = this.regionY; // L: 58
		int var7 = this.pixelsPerTile; // L: 59
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(WorldMapIcon_0.method4840(var5, var6, var7)); // L: 61
		if (var4 != null) { // L: 64
			if (var3 == this.pixelsPerTile * 64) { // L: 65
				var4.drawAt(var1, var2); // L: 66
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 69
			}

		}
	} // L: 71

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhu;Ljava/util/List;I)V",
		garbageValue = "-802355833"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 74
		this.worldMapData_0 = var1; // L: 75
		this.addAllToIconList(var2); // L: 76
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-2119563453"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 80
		Iterator var3 = var1.iterator(); // L: 81

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 82
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 84
				this.worldMapData1List.add(var4); // L: 85
			}
		}

		this.addAllToIconList(var2); // L: 89
	} // L: 90

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIILhc;I)V",
		garbageValue = "1355885748"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 93
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 94
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 95
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 96
					if (var9 != null && var9.length != 0) { // L: 97
						WorldMapDecoration[] var10 = var9; // L: 101

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 102
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11]; // L: 103
								var13 = FileSystem.getObjectDefinition(var12.objectDefinitionId); // L: 105
								if (var13.transforms != null) { // L: 108
									int[] var15 = var13.transforms; // L: 110

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 111
										int var17 = var15[var16]; // L: 112
										ObjectComposition var18 = FileSystem.getObjectDefinition(var17); // L: 114
										if (var18.mapIconId != -1) { // L: 115
											var14 = true; // L: 116
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 123
									var14 = true; // L: 124
									break label67; // L: 125
								}

								var14 = false; // L: 127
							}

							if (var14) { // L: 129
								this.getIcon(var13, var8, var6, var7, var5); // L: 132
								continue label76; // L: 133
							}
						}
					}
				}
			}
		}

	} // L: 140

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IIILhc;I)V",
		garbageValue = "-1167572618"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 143
		Coord var7 = null; // L: 144
		if (this.worldMapData_0 != null) { // L: 145
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4); // L: 146
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 149
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8); // L: 150
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 153
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 154
		} else {
			var9 = EnumComposition.WorldMapElement_get(var1.mapIconId); // L: 157
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 158
		}

		var9 = EnumComposition.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 160
		if (var9.field1820) { // L: 161
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 162
		}

	} // L: 164

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2022561952"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 167

		while (var1.hasNext()) { // L: 174
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 168
			if (var2 instanceof WorldMapIcon_1) { // L: 170
				((WorldMapIcon_1)var2).init(); // L: 171
			}
		}

	} // L: 175

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "48"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 178

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 179
			if (EnumComposition.WorldMapElement_get(var3.element).field1820 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 181
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4602(var3.element));
				this.icon0List.add(var4); // L: 186
			}
		}

	} // L: 190

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	void method4703() {
		if (this.worldMapData_0 != null) { // L: 193
			this.worldMapData_0.reset(); // L: 194
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 197

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 198
				var2.reset(); // L: 200
			}
		}

	} // L: 204

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)Z",
		garbageValue = "-2124708956"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 207
		if (this.worldMapData_0 != null) { // L: 208
			this.worldMapData_0.loadGeography(var1); // L: 209
			if (this.worldMapData_0.isFullyLoaded()) { // L: 210
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 211
				return true; // L: 212
			} else {
				return false; // L: 214
			}
		} else {
			boolean var2 = true; // L: 217

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 218 222
				var4 = (WorldMapData_1)var3.next(); // L: 219
				var4.loadGeography(var1); // L: 221
			}

			if (var2) { // L: 225
				var3 = this.worldMapData1List.iterator(); // L: 226

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 227
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 229
				}
			}

			return var2; // L: 233
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILih;[Lqe;Lls;Lls;B)V",
		garbageValue = "17"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 238
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 239
			int var7 = this.regionX; // L: 243
			int var8 = this.regionY; // L: 244
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(WorldMapIcon_0.method4840(var7, var8, var1)); // L: 246
			if (var6 == null) { // L: 248
				boolean var9 = true; // L: 251
				var9 &= this.loadGeography(var4); // L: 252
				int var11;
				if (this.worldMapData_0 != null) { // L: 255
					var11 = this.worldMapData_0.groupId; // L: 256
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 259
				}

				var9 &= var5.tryLoadGroup(var11); // L: 261
				if (var9) { // L: 262
					byte[] var10 = var5.takeFileFlat(var11); // L: 263
					WorldMapSprite var12 = ScriptEvent.method2063(var10); // L: 264
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 265
					var13.setRaster(); // L: 266
					if (this.worldMapData_0 != null) { // L: 267
						this.method4586(var2, var3, var12); // L: 268
					} else {
						this.method4611(var2, var3, var12); // L: 271
					}

					int var14 = this.regionX; // L: 273
					int var15 = this.regionY; // L: 274
					int var16 = this.pixelsPerTile; // L: 275
					WorldMapRegion_cachedSprites.put(var13, WorldMapIcon_0.method4840(var14, var15, var16), var13.pixels.length * 4); // L: 277
					this.method4703(); // L: 279
				}
			}
		}
	} // L: 240 249 280

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-1599311865"
	)
	void method4597(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 283
			var4 = new HashSet(); // L: 284
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 286
		this.drawMapLinks(var1, var2, var4, var3); // L: 287
	} // L: 288

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "46"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 291

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 292
			if (var5.hasValidElement()) { // L: 294
				int var6 = var5.getElement(); // L: 295
				if (var1.contains(var6)) { // L: 296
					WorldMapElement var7 = EnumComposition.WorldMapElement_get(var6); // L: 297
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 298
				}
			}
		}

		this.method4704(var1, var2, var3); // L: 302
	} // L: 303

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lih;[Lqe;Lii;I)V",
		garbageValue = "2062922494"
	)
	void method4586(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 306
			for (var5 = 0; var5 < 64; ++var5) { // L: 307
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 308
				this.method4603(var4, var5, this.worldMapData_0, var1); // L: 309
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 312
			for (var5 = 0; var5 < 64; ++var5) { // L: 313
				this.method4664(var4, var5, this.worldMapData_0, var1, var2); // L: 314
			}
		}

	} // L: 317

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lih;[Lqe;Lii;I)V",
		garbageValue = "-1735070362"
	)
	void method4611(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 320

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 321

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 323
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 324
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 325
					this.method4603(var6, var7, var5, var1); // L: 326
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 331

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 332

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 334
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 335
					this.method4664(var6, var7, var5, var1, var2); // L: 336
				}
			}
		}

	} // L: 341

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILhc;Lih;[Lqe;I)V",
		garbageValue = "1285903936"
	)
	void method4664(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4689(var1, var2, var3); // L: 344
		this.method4605(var1, var2, var3, var5); // L: 345
	} // L: 346

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILhc;Lih;Lii;I)V",
		garbageValue = "831500559"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 349
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 350
		if (var6 == -1 && var7 == -1) { // L: 351
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 352
		}

		int var8 = 16711935; // L: 354
		if (var7 != -1) { // L: 355
			var8 = GameEngine.method428(var7, this.backgroundColor); // L: 356
		}

		if (var7 > -1 && var3.field2814[0][var1][var2] == 0) { // L: 358
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 359
		} else {
			int var9 = this.method4604(var1, var2, var3, var5); // L: 362
			if (var7 == -1) { // L: 363
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 364
			} else {
				var4.method5037(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2814[0][var1][var2], var3.field2808[0][var1][var2]); // L: 367
			}
		}
	} // L: 360 365 368

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILhc;Lih;I)V",
		garbageValue = "-1273458561"
	)
	void method4603(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 371
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 372
			if (var6 > -1) { // L: 373
				int var7 = GameEngine.method428(var6, this.backgroundColor); // L: 374
				if (var3.field2814[var5][var1][var2] == 0) { // L: 375
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 376
				} else {
					var4.method5037(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2814[var5][var1][var2], var3.field2808[var5][var1][var2]); // L: 379
				}
			}
		}

	} // L: 383

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILhc;Lii;I)I",
		garbageValue = "-1846005797"
	)
	int method4604(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 386 387 389
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILhc;[Lqe;I)V",
		garbageValue = "1879739800"
	)
	void method4605(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 393
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 394
			if (var6 != null && var6.length != 0) { // L: 395
				WorldMapDecoration[] var7 = var6; // L: 399

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 400
					WorldMapDecoration var9 = var7[var8]; // L: 401
					int var11 = var9.decoration; // L: 404
					boolean var10 = var11 >= WorldMapDecorationType.field3538.id && var11 <= WorldMapDecorationType.field3539.id; // L: 406
					if (!var10) { // L: 409
						int var13 = var9.decoration; // L: 411
						boolean var12 = var13 == WorldMapDecorationType.field3526.id; // L: 413
						if (!var12) { // L: 415
							continue;
						}
					}

					ObjectComposition var14 = FileSystem.getObjectDefinition(var9.objectDefinitionId); // L: 417
					if (var14.mapSceneId != -1) { // L: 418
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 419
							var4[var14.mapSceneId].method8048(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 423
						} else {
							var4[var14.mapSceneId].method8048(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 420
						}
					}
				}
			}
		}

	} // L: 431

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILhc;B)V",
		garbageValue = "105"
	)
	void method4689(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 434
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 435
			if (var5 != null && var5.length != 0) { // L: 436
				WorldMapDecoration[] var6 = var5; // L: 440

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 441
					WorldMapDecoration var8 = var6[var7]; // L: 442
					int var10 = var8.decoration; // L: 445
					boolean var9 = var10 >= WorldMapDecorationType.field3532.id && var10 <= WorldMapDecorationType.field3531.id || var10 == WorldMapDecorationType.field3520.id; // L: 447
					if (var9) { // L: 449
						ObjectComposition var11 = FileSystem.getObjectDefinition(var8.objectDefinitionId); // L: 450
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 451
						if (var8.decoration == WorldMapDecorationType.field3532.id) { // L: 452
							this.method4694(var1, var2, var8.rotation, var12); // L: 453
						}

						if (var8.decoration == WorldMapDecorationType.field3523.id) { // L: 455
							this.method4694(var1, var2, var8.rotation, -3355444); // L: 456
							this.method4694(var1, var2, var8.rotation + 1, var12); // L: 457
						}

						if (var8.decoration == WorldMapDecorationType.field3531.id) { // L: 459
							if (var8.rotation == 0) {
								Rasterizer2D.method7967(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12); // L: 460
							}

							if (var8.rotation == 1) { // L: 461
								Rasterizer2D.method7967(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 462
								Rasterizer2D.method7967(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 463
								Rasterizer2D.method7967(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3520.id) { // L: 465
							int var13 = var8.rotation % 2; // L: 466
							int var14;
							if (var13 == 0) { // L: 467
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 468
									Rasterizer2D.method7967(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 469
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 473
									Rasterizer2D.method7967(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 474
								}
							}
						}
					}
				}
			}
		}

	} // L: 483

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1994701313"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 486
		float var6 = var5 / 2.0F; // L: 487
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 488

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 489
			Coord var9 = (Coord)var8.getKey(); // L: 491
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 492
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 493
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 494
			if (var12 != null && var12.hasValidElement()) { // L: 495
				var12.screenX = var10; // L: 496
				var12.screenY = var11; // L: 497
				WorldMapElement var13 = EnumComposition.WorldMapElement_get(var12.getElement()); // L: 498
				if (!var3.contains(var13.getObjectId())) { // L: 499
					this.method4688(var12, var10, var11, var5); // L: 500
				}
			}
		}

	} // L: 505

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-125"
	)
	void method4704(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 508

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 509
			if (var5.hasValidElement()) { // L: 511
				WorldMapElement var6 = EnumComposition.WorldMapElement_get(var5.getElement()); // L: 512
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 513
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 514
				}
			}
		}

	} // L: 518

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lfy;IIIIB)V",
		garbageValue = "8"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 521
		if (var6 != null) { // L: 522
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 525
			if (var4 % var5 < var5 / 2) { // L: 526
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 527
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 528
			}

		}
	} // L: 523 530

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lil;IIFI)V",
		garbageValue = "-861515573"
	)
	void method4688(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = EnumComposition.WorldMapElement_get(var1.getElement()); // L: 533
		this.method4637(var5, var2, var3); // L: 534
		this.method4612(var1, var5, var2, var3, var4); // L: 535
	} // L: 536

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfy;III)V",
		garbageValue = "659058237"
	)
	void method4637(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 539
		if (var4 != null) { // L: 540
			int var5 = this.method4627(var4, var1.horizontalAlignment); // L: 541
			int var6 = this.method4615(var4, var1.verticalAlignment); // L: 542
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 543
		}

	} // L: 545

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lil;Lfy;IIFB)V",
		garbageValue = "27"
	)
	void method4612(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 548
		if (var6 != null) { // L: 549
			if (var6.size.method4450(var5)) { // L: 552
				Font var7 = (Font)this.fonts.get(var6.size); // L: 555
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1817, 0, 1, 0, var7.ascent / 2); // L: 556
			}
		}
	} // L: 550 553 557

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-75"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 560
		Iterator var6 = this.icon0List.iterator(); // L: 561

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 562
			if (var7.hasValidElement()) { // L: 564
				int var8 = var7.coord2.x % 64; // L: 565
				int var9 = var7.coord2.y % 64; // L: 566
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 567
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 568
				if (!var3.contains(var7.getElement())) { // L: 569
					this.method4688(var7, var7.screenX, var7.screenY, var5); // L: 572
				}
			}
		}

	} // L: 575

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lfo;I)I",
		garbageValue = "245044303"
	)
	int method4627(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 578
		case 0:
			return -var1.subWidth / 2; // L: 585
		case 1:
			return 0; // L: 581
		default:
			return -var1.subWidth; // L: 589
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lfl;I)I",
		garbageValue = "-816706088"
	)
	int method4615(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 595
		case 0:
			return -var1.subHeight / 2; // L: 602
		case 2:
			return 0; // L: 606
		default:
			return -var1.subHeight; // L: 598
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)Liw;",
		garbageValue = "16474"
	)
	WorldMapLabel method4602(int var1) {
		WorldMapElement var2 = EnumComposition.WorldMapElement_get(var1); // L: 612
		return this.createMapLabel(var2); // L: 613
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I)Liw;",
		garbageValue = "-752095543"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 617
			int var3 = var1.textSize; // L: 621
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method4455(); // L: 624
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 635
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 626
				if (var3 == var6.field2680) { // L: 628
					var2 = var6; // L: 629
					break;
				}

				++var5; // L: 625
			}

			if (var2 == null) { // L: 638
				return null; // L: 639
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 641
				if (var14 == null) { // L: 642
					return null; // L: 643
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 645
					String[] var7 = new String[var15]; // L: 646
					var14.breakLines(var1.name, (int[])null, var7); // L: 647
					int var8 = var7.length * var14.ascent / 2; // L: 648
					int var9 = 0; // L: 649
					String[] var10 = var7; // L: 651

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 652
						String var12 = var10[var11]; // L: 653
						int var13 = var14.stringWidth(var12); // L: 655
						if (var13 > var9) { // L: 656
							var9 = var13; // L: 657
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 662
				}
			}
		} else {
			return null; // L: 618
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "1426425280"
	)
	List method4618(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 666
		if (var4 >= var1 && var5 >= var2) { // L: 667
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 668
				Iterator var7 = this.iconMap.values().iterator(); // L: 669

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 670
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 672
						var6.add(var8); // L: 673
					}
				}

				var7 = this.icon0List.iterator(); // L: 677

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 678
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 680
						var6.add(var8); // L: 681
					}
				}

				return var6; // L: 685
			} else {
				return var6; // L: 676
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "1796664376"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 689
		var1.addAll(this.icon0List); // L: 690
		var1.addAll(this.iconMap.values()); // L: 691
		return var1; // L: 692
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-661543454"
	)
	void method4694(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 696
		if (var3 == 0) { // L: 697
			Rasterizer2D.method7975(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 698
			Rasterizer2D.method7967(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 699
			Rasterizer2D.method7975(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method7967(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 700
		}

	} // L: 701

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "1846438611"
	)
	public static String method4713(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 183

		for (int var3 = 0; var3 < var1; ++var3) { // L: 184
			var2[var3] = var0;
		}

		return new String(var2); // L: 185
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIIIIII)V",
		garbageValue = "2063217212"
	)
	static final void method4607(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field554) { // L: 10421
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10422
		}

		Client.field554 = false; // L: 10423
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10424
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10425
				var0.scrollY -= 4; // L: 10426
				class125.invalidateWidget(var0); // L: 10427
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10429
				var0.scrollY += 4; // L: 10430
				class125.invalidateWidget(var0); // L: 10431
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10433
				var7 = var3 * (var3 - 32) / var4; // L: 10434
				if (var7 < 8) { // L: 10435
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10436
				int var9 = var3 - 32 - var7; // L: 10437
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10438
				class125.invalidateWidget(var0); // L: 10439
				Client.field554 = true; // L: 10440
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10443
			var7 = var0.width; // L: 10444
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10445
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10446
				class125.invalidateWidget(var0); // L: 10447
			}
		}

	} // L: 10450

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Z",
		garbageValue = "1488409927"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10471
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10472
				int var2 = GrandExchangeEvents.method5876(var0, var1); // L: 10473
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10474
				if (var0.cs1Comparisons[var1] == 2) { // L: 10475
					if (var2 >= var3) { // L: 10476
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10478
					if (var2 <= var3) { // L: 10479
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10481
					if (var3 == var2) { // L: 10482
						return false;
					}
				} else if (var3 != var2) { // L: 10484
					return false;
				}
			}

			return true; // L: 10486
		}
	}
}
