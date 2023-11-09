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

@ObfuscatedName("iy")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1399324249
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2131113479
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("u")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -487091827
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2116405889
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("g")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("i")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("o")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "117"
	)
	void method4976(int var1, int var2, int var3) {
		SpritePixels var4 = ItemLayer.method4197(this.regionX, this.regionY, this.pixelsPerTile); // L: 67
		if (var4 != null) { // L: 68
			if (var3 == this.pixelsPerTile * 64) { // L: 69
				var4.drawAt(var1, var2); // L: 70
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 73
			}

		}
	} // L: 75

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lhd;Ljava/util/List;I)V",
		garbageValue = "1558977159"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 78
		this.worldMapData_0 = var1; // L: 79
		this.addAllToIconList(var2); // L: 80
	} // L: 81

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "-39"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIILin;I)V",
		garbageValue = "469885005"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 97
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 98
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 99
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 100
					if (var9 != null && var9.length != 0) { // L: 101
						WorldMapDecoration[] var10 = var9; // L: 105

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 106
							WorldMapDecoration var12 = var10[var11]; // L: 107
							ObjectComposition var13 = VarpDefinition.getObjectDefinition(var12.objectDefinitionId); // L: 109
							if (class98.method2602(var13)) { // L: 110
								this.getIcon(var13, var8, var6, var7, var5); // L: 113
								continue label51; // L: 114
							}
						}
					}
				}
			}
		}

	} // L: 121

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIILin;I)V",
		garbageValue = "-1481118072"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 124
		Coord var7 = null; // L: 125
		if (this.worldMapData_0 != null) { // L: 126
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4); // L: 127
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 130
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 4096 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 4096 + var8.getChunkYLow() * 8); // L: 131
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 134
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 135
		} else {
			var9 = JagexCache.WorldMapElement_get(var1.mapIconId); // L: 138
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 139
		}

		var9 = JagexCache.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 141
		if (var9.field1936) { // L: 142
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 143
		}

	} // L: 145

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16842753"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "69"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 159

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 160
			if (JagexCache.WorldMapElement_get(var3.element).field1936 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 162 165
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5004(var3.element)); // L: 166
				this.icon0List.add(var4); // L: 167
			}
		}

	} // L: 171

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1768631519"
	)
	void method5077() {
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)Z",
		garbageValue = "21"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILih;[Lra;Lly;Lly;B)V",
		garbageValue = "6"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 219
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 220
			if (ItemLayer.method4197(this.regionX, this.regionY, var1) == null) { // L: 223
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
					WorldMapSprite var9;
					if (var7 == null) { // L: 241
						var9 = new WorldMapSprite(); // L: 242
					} else {
						var9 = new WorldMapSprite(Language.method6693(var7).pixels); // L: 245
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 248
					var11.setRaster(); // L: 249
					if (this.worldMapData_0 != null) { // L: 250
						this.method4988(var2, var3, var9); // L: 251
					} else {
						this.method5011(var2, var3, var9); // L: 254
					}

					VerticalAlignment.method3726(var11, this.regionX, this.regionY, this.pixelsPerTile); // L: 256
					this.method5077(); // L: 257
				}
			}
		}
	} // L: 221 224 258

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;S)V",
		garbageValue = "22940"
	)
	void method4986(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 261
			var4 = new HashSet(); // L: 262
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 264
		this.drawMapLinks(var1, var2, var4, var3); // L: 265
	} // L: 266

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1301690164"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 269

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 270
			if (var5.hasValidElement()) { // L: 272
				int var6 = var5.getElement(); // L: 273
				if (var1.contains(var6)) { // L: 274
					WorldMapElement var7 = JagexCache.WorldMapElement_get(var6); // L: 275
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 276
				}
			}
		}

		this.method5012(var1, var2, var3); // L: 280
	} // L: 281

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lih;[Lra;Lir;B)V",
		garbageValue = "3"
	)
	void method4988(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 284
			for (var5 = 0; var5 < 64; ++var5) { // L: 285
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 286
				this.method4992(var4, var5, this.worldMapData_0, var1); // L: 287
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 290
			for (var5 = 0; var5 < 64; ++var5) { // L: 291
				this.method4990(var4, var5, this.worldMapData_0, var1, var2); // L: 292
			}
		}

	} // L: 295

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lih;[Lra;Lir;B)V",
		garbageValue = "0"
	)
	void method5011(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 298

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 299

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 301
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 302
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 303
					this.method4992(var6, var7, var5, var1); // L: 304
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 309

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 310

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 312
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 313
					this.method4990(var6, var7, var5, var1, var2); // L: 314
				}
			}
		}

	} // L: 319

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILin;Lih;[Lra;I)V",
		garbageValue = "1755721464"
	)
	void method4990(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4994(var1, var2, var3); // L: 322
		this.method5006(var1, var2, var3, var5); // L: 323
	} // L: 324

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IILin;Lih;Lir;I)V",
		garbageValue = "688113712"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 327
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 328
		if (var6 == -1 && var7 == -1) { // L: 329
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 330
		}

		int var8 = 16711935; // L: 332
		if (var7 != -1) { // L: 333
			var8 = Interpreter.method1988(var7, this.backgroundColor); // L: 334
		}

		if (var7 > -1 && var3.field2950[0][var1][var2] == 0) { // L: 336
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 337
		} else {
			int var9 = this.method4993(var1, var2, var3, var5); // L: 340
			if (var7 == -1) { // L: 341
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 342
			} else {
				var4.method5368(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2950[0][var1][var2], var3.field2951[0][var1][var2]); // L: 345
			}
		}
	} // L: 338 343 346

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILin;Lih;I)V",
		garbageValue = "-1969198767"
	)
	void method4992(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 349
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 350
			if (var6 > -1) { // L: 351
				int var7 = Interpreter.method1988(var6, this.backgroundColor); // L: 352
				if (var3.field2950[var5][var1][var2] == 0) { // L: 353
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 354
				} else {
					var4.method5368(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2950[var5][var1][var2], var3.field2951[var5][var1][var2]); // L: 357
				}
			}
		}

	} // L: 361

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILin;Lir;I)I",
		garbageValue = "-1742874756"
	)
	int method4993(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 364 365 367
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILin;[Lra;B)V",
		garbageValue = "1"
	)
	void method5006(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 371
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 372
			if (var6 != null && var6.length != 0) { // L: 373
				WorldMapDecoration[] var7 = var6; // L: 377

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 378
					WorldMapDecoration var9 = var7[var8]; // L: 379
					int var11 = var9.decoration; // L: 382
					boolean var10 = var11 >= WorldMapDecorationType.field3747.id && var11 <= WorldMapDecorationType.field3748.id; // L: 384
					if (var10 || class150.method3261(var9.decoration)) { // L: 386
						ObjectComposition var12 = VarpDefinition.getObjectDefinition(var9.objectDefinitionId); // L: 387
						if (var12.mapSceneId != -1) { // L: 388
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 389
								var4[var12.mapSceneId].method8993(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 393
							} else {
								var4[var12.mapSceneId].method8993(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 390
							}
						}
					}
				}
			}
		}

	} // L: 401

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILin;I)V",
		garbageValue = "-731314133"
	)
	void method4994(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 404
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 405
			if (var5 != null && var5.length != 0) { // L: 406
				WorldMapDecoration[] var6 = var5; // L: 410

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 411
					WorldMapDecoration var8 = var6[var7]; // L: 412
					int var10 = var8.decoration; // L: 415
					boolean var9 = var10 >= WorldMapDecorationType.field3727.id && var10 <= WorldMapDecorationType.field3736.id || var10 == WorldMapDecorationType.field3742.id; // L: 417
					if (var9) { // L: 419
						ObjectComposition var11 = VarpDefinition.getObjectDefinition(var8.objectDefinitionId); // L: 420
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 421
						if (var8.decoration == WorldMapDecorationType.field3727.id) { // L: 422
							this.method5008(var1, var2, var8.rotation, var12); // L: 423
						}

						if (var8.decoration == WorldMapDecorationType.field3729.id) { // L: 425
							this.method5008(var1, var2, var8.rotation, -3355444); // L: 426
							this.method5008(var1, var2, var8.rotation + 1, var12); // L: 427
						}

						if (var8.decoration == WorldMapDecorationType.field3736.id) { // L: 429
							if (var8.rotation == 0) {
								Rasterizer2D.method8892(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12); // L: 430
							}

							if (var8.rotation == 1) { // L: 431
								Rasterizer2D.method8892(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 432
								Rasterizer2D.method8892(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 433
								Rasterizer2D.method8892(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3742.id) { // L: 435
							int var13 = var8.rotation % 2; // L: 436
							int var14;
							if (var13 == 0) { // L: 437
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 438
									Rasterizer2D.method8892(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 439
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 443
									Rasterizer2D.method8892(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 444
								}
							}
						}
					}
				}
			}
		}

	} // L: 453

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1350959975"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 456
		float var6 = var5 / 2.0F; // L: 457
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 458

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 459
			Coord var9 = (Coord)var8.getKey(); // L: 461
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 462
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 463
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 464
			if (var12 != null && var12.hasValidElement()) { // L: 465
				var12.screenX = var10; // L: 466
				var12.screenY = var11; // L: 467
				WorldMapElement var13 = JagexCache.WorldMapElement_get(var12.getElement()); // L: 468
				if (!var3.contains(var13.getObjectId())) { // L: 469
					this.method5036(var12, var10, var11, var5); // L: 470
				}
			}
		}

	} // L: 475

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1289511837"
	)
	void method5012(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 478

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 479
			if (var5.hasValidElement()) { // L: 481
				WorldMapElement var6 = JagexCache.WorldMapElement_get(var5.getElement()); // L: 482
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 483
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 484
				}
			}
		}

	} // L: 488

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IIIIB)V",
		garbageValue = "-8"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 491
		if (var6 != null) { // L: 492
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 495
			if (var4 % var5 < var5 / 2) { // L: 496
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 497
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 498
			}

		}
	} // L: 493 500

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lix;IIFI)V",
		garbageValue = "314321366"
	)
	void method5036(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = JagexCache.WorldMapElement_get(var1.getElement()); // L: 503
		this.method5072(var5, var2, var3); // L: 504
		this.method4999(var1, var5, var2, var3, var4); // L: 505
	} // L: 506

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lfm;III)V",
		garbageValue = "-1811455271"
	)
	void method5072(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 509
		if (var4 != null) { // L: 510
			int var5 = this.method5071(var4, var1.horizontalAlignment); // L: 511
			int var6 = this.method4996(var4, var1.verticalAlignment); // L: 512
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 513
		}

	} // L: 515

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lix;Lfm;IIFI)V",
		garbageValue = "-1717501749"
	)
	void method4999(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 518
		if (var6 != null) { // L: 519
			if (var6.size.method4859(var5)) { // L: 522
				Font var7 = (Font)this.fonts.get(var6.size); // L: 525
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1947, 0, 1, 0, var7.ascent / 2); // L: 526
			}
		}
	} // L: 520 523 527

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "106"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 530
		Iterator var6 = this.icon0List.iterator(); // L: 531

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 532
			if (var7.hasValidElement()) { // L: 534
				int var8 = var7.coord2.x % 64; // L: 535
				int var9 = var7.coord2.y % 64; // L: 536
				var7.screenX = (int)((float)var1 + var5 * (float)var8); // L: 537
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 538
				if (!var3.contains(var7.getElement())) { // L: 539
					this.method5036(var7, var7.screenX, var7.screenY, var5); // L: 542
				}
			}
		}

	} // L: 545

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lgj;I)I",
		garbageValue = "2040136984"
	)
	int method5071(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 548
		case 1:
			return -var1.subWidth / 2; // L: 555
		case 2:
			return 0; // L: 559
		default:
			return -var1.subWidth; // L: 551
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lgl;B)I",
		garbageValue = "-74"
	)
	int method4996(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 565
		case 0:
			return 0; // L: 572
		case 2:
			return -var1.subHeight / 2; // L: 576
		default:
			return -var1.subHeight; // L: 568
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lii;",
		garbageValue = "-1016818948"
	)
	WorldMapLabel method5004(int var1) {
		WorldMapElement var2 = JagexCache.WorldMapElement_get(var1); // L: 603
		return this.createMapLabel(var2); // L: 604
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)Lii;",
		garbageValue = "-824345653"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 608
			int var3 = var1.textSize; // L: 612
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method4851(); // L: 615
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 626
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 617
				if (var3 == var6.field2828) { // L: 619
					var2 = var6; // L: 620
					break;
				}

				++var5; // L: 616
			}

			if (var2 == null) { // L: 629
				return null; // L: 630
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 632
				if (var14 == null) { // L: 633
					return null; // L: 634
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 636
					String[] var7 = new String[var15]; // L: 637
					var14.breakLines(var1.name, (int[])null, var7); // L: 638
					int var8 = var7.length * var14.ascent / 2; // L: 639
					int var9 = 0; // L: 640
					String[] var10 = var7; // L: 642

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 643
						String var12 = var10[var11]; // L: 644
						int var13 = var14.stringWidth(var12); // L: 646
						if (var13 > var9) { // L: 647
							var9 = var13; // L: 648
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 653
				}
			}
		} else {
			return null; // L: 609
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)Ljava/util/List;",
		garbageValue = "1000"
	)
	List method5035(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 657
		if (var4 >= var1 && var5 >= var2) { // L: 658
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 659
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 660
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 661
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 663
						var6.add(var8); // L: 664
					}
				}

				var7 = this.icon0List.iterator(); // L: 668

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 669
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 671
						var6.add(var8); // L: 672
					}
				}

				return var6; // L: 676
			} else {
				return var6; // L: 667
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "-27"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 680
		var1.addAll(this.icon0List); // L: 681
		var1.addAll(this.iconMap.values()); // L: 682
		return var1; // L: 683
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "350887459"
	)
	void method5008(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 687
		if (var3 == 0) { // L: 688
			Rasterizer2D.method8894(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 689
			Rasterizer2D.method8892(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 690
			Rasterizer2D.method8894(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method8892(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 691
		}

	} // L: 692
}
