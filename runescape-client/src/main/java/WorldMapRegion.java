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

@ObfuscatedName("jl")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -584179489
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -523067815
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("al")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -278802829
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2115657887
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("av")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ax")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("as")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 47
		this.regionY = var2; // L: 48
		this.worldMapData1List = new LinkedList(); // L: 49
		this.icon0List = new LinkedList(); // L: 50
		this.iconMap = new HashMap(); // L: 51
		this.backgroundColor = var3 | -16777216; // L: 52
		this.fonts = var4; // L: 53
	} // L: 54

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1077363567"
	)
	void method4625(int var1, int var2, int var3) {
		SpritePixels var4 = class130.method3096(this.regionX, this.regionY, this.pixelsPerTile); // L: 57
		if (var4 != null) { // L: 58
			if (var3 == this.pixelsPerTile * 64) { // L: 59
				var4.drawAt(var1, var2); // L: 60
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 63
			}

		}
	} // L: 65

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lii;Ljava/util/List;I)V",
		garbageValue = "1079022526"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 68
		this.worldMapData_0 = var1; // L: 69
		this.addAllToIconList(var2); // L: 70
	} // L: 71

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;S)V",
		garbageValue = "363"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 74
		Iterator var3 = var1.iterator(); // L: 75

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 76
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 78
				this.worldMapData1List.add(var4); // L: 79
			}
		}

		this.addAllToIconList(var2); // L: 83
	} // L: 84

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILjm;I)V",
		garbageValue = "-1882994474"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 87
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 88
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 89
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 90
					if (var9 != null && var9.length != 0) { // L: 91
						WorldMapDecoration[] var10 = var9; // L: 95

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 96
							WorldMapDecoration var12 = var10[var11]; // L: 97
							ObjectComposition var13 = WorldMapSection2.getObjectDefinition(var12.objectDefinitionId); // L: 99
							if (class351.method6852(var13)) { // L: 100
								this.getIcon(var13, var8, var6, var7, var5); // L: 103
								continue label51; // L: 104
							}
						}
					}
				}
			}
		}

	} // L: 111

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIILjm;B)V",
		garbageValue = "-49"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 114
		Coord var7 = null; // L: 115
		if (this.worldMapData_0 != null) { // L: 116
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, var4 + this.worldMapData_0.regionYLow * 64); // L: 117
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 120
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8); // L: 121
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 124
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 125
		} else {
			var9 = class141.WorldMapElement_get(var1.mapIconId); // L: 128
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 129
		}

		var9 = class141.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 131
		if (var9.field1825) { // L: 132
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 133
		}

	} // L: 135

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1468543514"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 138

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 139
			if (var2 instanceof WorldMapIcon_1) { // L: 141
				((WorldMapIcon_1)var2).init(); // L: 142
			}
		}

	} // L: 146

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-1918438816"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 149

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 150
			if (class141.WorldMapElement_get(var3.element).field1825 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 152 155
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4653(var3.element)); // L: 156
				this.icon0List.add(var4); // L: 157
			}
		}

	} // L: 161

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	void method4624() {
		if (this.worldMapData_0 != null) { // L: 164
			this.worldMapData_0.reset(); // L: 165
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 168

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 169
				var2.reset(); // L: 171
			}
		}

	} // L: 175

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)Z",
		garbageValue = "-207493702"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 178
		if (this.worldMapData_0 != null) { // L: 179
			this.worldMapData_0.loadGeography(var1); // L: 180
			if (this.worldMapData_0.isFullyLoaded()) { // L: 181
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 182
				return true; // L: 183
			} else {
				return false; // L: 185
			}
		} else {
			boolean var2 = true; // L: 188

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 189 193
				var4 = (WorldMapData_1)var3.next(); // L: 190
				var4.loadGeography(var1); // L: 192
			}

			if (var2) { // L: 196
				var3 = this.worldMapData1List.iterator(); // L: 197

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 198
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 200
				}
			}

			return var2; // L: 204
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILja;[Lup;Lol;Lol;I)V",
		garbageValue = "-67039997"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 209
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 210
			if (class130.method3096(this.regionX, this.regionY, var1) == null) { // L: 213
				boolean var6 = true; // L: 216
				var6 &= this.loadGeography(var4); // L: 217
				int var8;
				if (this.worldMapData_0 != null) { // L: 220
					var8 = this.worldMapData_0.groupId; // L: 221
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 224
				}

				var6 &= var5.tryLoadGroup(var8); // L: 226
				if (var6) { // L: 227
					byte[] var7 = var5.takeFileFlat(var8); // L: 228
					WorldMapSprite var9;
					if (var7 == null) { // L: 231
						var9 = new WorldMapSprite(); // L: 232
					} else {
						var9 = new WorldMapSprite(WorldMapArchiveLoader.method8710(var7).pixels); // L: 235
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 238
					var11.setRaster(); // L: 239
					if (this.worldMapData_0 != null) { // L: 240
						this.method4636(var2, var3, var9); // L: 241
					} else {
						this.method4731(var2, var3, var9); // L: 244
					}

					int var12 = this.regionX; // L: 246
					int var13 = this.regionY; // L: 247
					int var14 = this.pixelsPerTile; // L: 248
					DemotingHashTable var15 = WorldMapRegion_cachedSprites; // L: 250
					long var17 = (long)(var14 << 16 | var12 << 8 | var13); // L: 254
					var15.put(var11, var17, var11.pixels.length * 4); // L: 256
					this.method4624(); // L: 258
				}
			}
		}
	} // L: 211 214 259

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "99"
	)
	void method4634(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 262
			var4 = new HashSet(); // L: 263
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 265
		this.drawMapLinks(var1, var2, var4, var3); // L: 266
	} // L: 267

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1303977769"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 270

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 271
			if (var5.hasValidElement()) { // L: 273
				int var6 = var5.getElement(); // L: 274
				if (var1.contains(var6)) { // L: 275
					WorldMapElement var7 = class141.WorldMapElement_get(var6); // L: 276
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 277
				}
			}
		}

		this.method4645(var1, var2, var3); // L: 281
	} // L: 282

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lja;[Lup;Lju;B)V",
		garbageValue = "41"
	)
	void method4636(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 285
			for (var5 = 0; var5 < 64; ++var5) { // L: 286
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 287
				this.method4640(var4, var5, this.worldMapData_0, var1); // L: 288
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 291
			for (var5 = 0; var5 < 64; ++var5) { // L: 292
				this.method4668(var4, var5, this.worldMapData_0, var1, var2); // L: 293
			}
		}

	} // L: 296

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lja;[Lup;Lju;B)V",
		garbageValue = "85"
	)
	void method4731(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 299

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 300

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 302
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 303
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 304
					this.method4640(var6, var7, var5, var1); // L: 305
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 310

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 311

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 313
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 314
					this.method4668(var6, var7, var5, var1, var2); // L: 315
				}
			}
		}

	} // L: 320

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjm;Lja;[Lup;I)V",
		garbageValue = "1144109783"
	)
	void method4668(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4711(var1, var2, var3); // L: 323
		this.method4642(var1, var2, var3, var5); // L: 324
	} // L: 325

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILjm;Lja;Lju;I)V",
		garbageValue = "-102705399"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 328
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 329
		if (var6 == -1 && var7 == -1) { // L: 330
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 331
		}

		int var8 = 16711935; // L: 333
		if (var7 != -1) { // L: 334
			var8 = TriBool.method8281(var7, this.backgroundColor); // L: 335
		}

		if (var7 > -1 && var3.field2560[0][var1][var2] == 0) { // L: 337
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 338
		} else {
			int var9 = this.method4641(var1, var2, var3, var5); // L: 341
			if (var7 == -1) { // L: 342
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 343
			} else {
				var4.method5048(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2560[0][var1][var2], var3.field2571[0][var1][var2]); // L: 346
			}
		}
	} // L: 339 344 347

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILjm;Lja;I)V",
		garbageValue = "-700567043"
	)
	void method4640(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 350
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 351
			if (var6 > -1) { // L: 352
				int var7 = TriBool.method8281(var6, this.backgroundColor); // L: 353
				if (var3.field2560[var5][var1][var2] == 0) { // L: 354
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 355
				} else {
					var4.method5048(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2560[var5][var1][var2], var3.field2571[var5][var1][var2]); // L: 358
				}
			}
		}

	} // L: 362

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILjm;Lju;B)I",
		garbageValue = "0"
	)
	int method4641(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 365 366 368
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILjm;[Lup;S)V",
		garbageValue = "168"
	)
	void method4642(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 372
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 373
			if (var6 != null && var6.length != 0) { // L: 374
				WorldMapDecoration[] var7 = var6; // L: 378

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 379
					WorldMapDecoration var9 = var7[var8]; // L: 380
					int var11 = var9.decoration; // L: 383
					boolean var10 = var11 >= WorldMapDecorationType.field3863.id && var11 <= WorldMapDecorationType.field3856.id; // L: 385
					if (!var10) { // L: 388
						int var13 = var9.decoration; // L: 390
						boolean var12 = var13 == WorldMapDecorationType.field3844.id; // L: 392
						if (!var12) { // L: 394
							continue;
						}
					}

					ObjectComposition var14 = WorldMapSection2.getObjectDefinition(var9.objectDefinitionId); // L: 396
					if (var14.mapSceneId != -1) { // L: 397
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) { // L: 398
							var4[var14.mapSceneId].method9718(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 402
						} else {
							var4[var14.mapSceneId].method9718(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 399
						}
					}
				}
			}
		}

	} // L: 410

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILjm;I)V",
		garbageValue = "-393075620"
	)
	void method4711(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 413
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 414
			if (var5 != null && var5.length != 0) { // L: 415
				WorldMapDecoration[] var6 = var5; // L: 419

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 420
					WorldMapDecoration var8 = var6[var7]; // L: 421
					int var10 = var8.decoration; // L: 424
					boolean var9 = var10 >= WorldMapDecorationType.field3864.id && var10 <= WorldMapDecorationType.field3846.id || var10 == WorldMapDecorationType.field3847.id; // L: 426
					if (var9) { // L: 428
						ObjectComposition var11 = WorldMapSection2.getObjectDefinition(var8.objectDefinitionId); // L: 429
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 430
						if (var8.decoration == WorldMapDecorationType.field3864.id) { // L: 431
							this.method4657(var1, var2, var8.rotation, var12); // L: 432
						}

						if (var8.decoration == WorldMapDecorationType.field3851.id) { // L: 434
							this.method4657(var1, var2, var8.rotation, -3355444); // L: 435
							this.method4657(var1, var2, var8.rotation + 1, var12); // L: 436
						}

						if (var8.decoration == WorldMapDecorationType.field3846.id) { // L: 438
							if (var8.rotation == 0) {
								Rasterizer2D.method9623(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12); // L: 439
							}

							if (var8.rotation == 1) { // L: 440
								Rasterizer2D.method9623(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 441
								Rasterizer2D.method9623(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 442
								Rasterizer2D.method9623(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3847.id) { // L: 444
							int var13 = var8.rotation % 2; // L: 445
							int var14;
							if (var13 == 0) { // L: 446
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 447
									Rasterizer2D.method9623(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 448
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 452
									Rasterizer2D.method9623(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 453
								}
							}
						}
					}
				}
			}
		}

	} // L: 462

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IS)V",
		garbageValue = "3124"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 465
		float var6 = var5 / 2.0F; // L: 466
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 467

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 468
			Coord var9 = (Coord)var8.getKey(); // L: 470
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 471
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 472
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 473
			if (var12 != null && var12.hasValidElement()) { // L: 474
				var12.screenX = var10; // L: 475
				var12.screenY = var11; // L: 476
				WorldMapElement var13 = class141.WorldMapElement_get(var12.getElement()); // L: 477
				if (!var3.contains(var13.getObjectId())) { // L: 478
					this.method4647(var12, var10, var11, var5); // L: 479
				}
			}
		}

	} // L: 484

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-44"
	)
	void method4645(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 487

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 488
			if (var5.hasValidElement()) { // L: 490
				WorldMapElement var6 = class141.WorldMapElement_get(var5.getElement()); // L: 491
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 492
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 493
				}
			}
		}

	} // L: 497

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgr;IIIII)V",
		garbageValue = "1904364897"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 500
		if (var6 != null) { // L: 501
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 504
			if (var4 % var5 < var5 / 2) { // L: 505
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 506
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 507
			}

		}
	} // L: 502 509

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljc;IIFI)V",
		garbageValue = "1545285255"
	)
	void method4647(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class141.WorldMapElement_get(var1.getElement()); // L: 512
		this.method4648(var5, var2, var3); // L: 513
		this.method4649(var1, var5, var2, var3, var4); // L: 514
	} // L: 515

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lgr;III)V",
		garbageValue = "-980453833"
	)
	void method4648(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 518
		if (var4 != null) { // L: 519
			int var5 = this.method4651(var4, var1.horizontalAlignment); // L: 520
			int var6 = this.method4652(var4, var1.verticalAlignment); // L: 521
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 522
		}

	} // L: 524

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljc;Lgr;IIFI)V",
		garbageValue = "1339330901"
	)
	void method4649(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 527
		if (var6 != null) { // L: 528
			if (var6.size.method4486(var5)) { // L: 531
				Font var7 = (Font)this.fonts.get(var6.size); // L: 534
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1830, 0, 1, 0, var7.ascent / 2); // L: 535
			}
		}
	} // L: 529 532 536

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "57"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 539
		Iterator var6 = this.icon0List.iterator(); // L: 540

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 541
			if (var7.hasValidElement()) { // L: 543
				int var8 = var7.coord2.x % 64; // L: 544
				int var9 = var7.coord2.y % 64; // L: 545
				var7.screenX = (int)((float)var8 * var5 + (float)var1); // L: 546
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9)); // L: 547
				if (!var3.contains(var7.getElement())) { // L: 548
					this.method4647(var7, var7.screenX, var7.screenY, var5); // L: 551
				}
			}
		}

	} // L: 554

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Luz;Lhq;I)I",
		garbageValue = "1376501823"
	)
	int method4651(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 557
		case 0:
			return 0; // L: 560
		case 2:
			return -var1.subWidth / 2; // L: 568
		default:
			return -var1.subWidth; // L: 564
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Luz;Lhg;I)I",
		garbageValue = "1990886316"
	)
	int method4652(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 574
		case 0:
			return -var1.subHeight / 2; // L: 577
		case 2:
			return 0; // L: 585
		default:
			return -var1.subHeight; // L: 581
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljk;",
		garbageValue = "1"
	)
	WorldMapLabel method4653(int var1) {
		WorldMapElement var2 = class141.WorldMapElement_get(var1); // L: 612
		return this.createMapLabel(var2); // L: 613
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)Ljk;",
		garbageValue = "1614567762"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 617
			WorldMapLabelSize var2 = WorldMapLabelSize.method4487(var1.textSize); // L: 620
			if (var2 == null) { // L: 621
				return null; // L: 622
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 624
				if (var3 == null) { // L: 625
					return null; // L: 626
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 628
					String[] var5 = new String[var4]; // L: 629
					var3.breakLines(var1.name, (int[])null, var5); // L: 630
					int var6 = var5.length * var3.ascent / 2; // L: 631
					int var7 = 0; // L: 632
					String[] var8 = var5; // L: 634

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 635
						String var10 = var8[var9]; // L: 636
						int var11 = var3.stringWidth(var10); // L: 638
						if (var11 > var7) { // L: 639
							var7 = var11; // L: 640
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 645
				}
			}
		} else {
			return null; // L: 618
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "102"
	)
	List method4699(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 649
		if (var4 >= var1 && var5 >= var2) { // L: 650
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 651
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 652
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 653
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 655
						var6.add(var8); // L: 656
					}
				}

				var7 = this.icon0List.iterator(); // L: 660

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 661
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 663
						var6.add(var8); // L: 664
					}
				}

				return var6; // L: 668
			} else {
				return var6; // L: 659
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "201703863"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 672
		var1.addAll(this.icon0List); // L: 673
		var1.addAll(this.iconMap.values()); // L: 674
		return var1; // L: 675
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-164238097"
	)
	void method4657(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 679
		if (var3 == 0) { // L: 680
			Rasterizer2D.method9693(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 681
			Rasterizer2D.method9623(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 682
			Rasterizer2D.method9693(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9623(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 683
		}

	} // L: 684
}
