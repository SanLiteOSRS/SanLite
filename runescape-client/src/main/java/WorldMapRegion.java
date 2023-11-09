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

@ObfuscatedName("jv")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 352775201
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1943756101
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("av")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2080291619
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -42641835
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("at")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ah")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ax")
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-587218786"
	)
	void method5214(int var1, int var2, int var3) {
		SpritePixels var4 = Canvas.method320(this.regionX, this.regionY, this.pixelsPerTile); // L: 57
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
		descriptor = "(Ljn;Ljava/util/List;I)V",
		garbageValue = "712917891"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 68
		this.worldMapData_0 = var1; // L: 69
		this.addAllToIconList(var2); // L: 70
	} // L: 71

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "789773548"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next();
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
				this.worldMapData1List.add(var4);
			}
		}

		this.addAllToIconList(var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIILkm;I)V",
		garbageValue = "600770936"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 89
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9; // L: 95

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 96
							WorldMapDecoration var12 = var10[var11]; // L: 97
							ObjectComposition var13 = class90.getObjectDefinition(var12.objectDefinitionId); // L: 99
							if (LoginScreenAnimation.method2431(var13)) { // L: 100
								this.getIcon(var13, var8, var6, var7, var5); // L: 103
								continue label51; // L: 104
							}
						}
					}
				}
			}
		}

	} // L: 111

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhb;IIILkm;S)V",
		garbageValue = "-21474"
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
			var9 = SequenceDefinition.WorldMapElement_get(var1.mapIconId); // L: 128
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 129
		}

		var9 = SequenceDefinition.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 131
		if (var9.field1919) { // L: 132
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 133
		}

	} // L: 135

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1453549620"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "-53"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 149

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 150
			if (SequenceDefinition.WorldMapElement_get(var3.element).field1919 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 152 155
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5241(var3.element)); // L: 156
				this.icon0List.add(var4); // L: 157
			}
		}

	} // L: 161

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1975212342"
	)
	void method5258() {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)Z",
		garbageValue = "-91"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILki;[Luu;Lnd;Lnd;B)V",
		garbageValue = "-100"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 209
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 210
			if (Canvas.method320(this.regionX, this.regionY, var1) == null) { // L: 213
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
						var9 = new WorldMapSprite(ClanChannelMember.method3152(var7).pixels); // L: 235
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 238
					var11.setRaster(); // L: 239
					if (this.worldMapData_0 != null) { // L: 240
						this.method5246(var2, var3, var9); // L: 241
					} else {
						this.method5227(var2, var3, var9); // L: 244
					}

					int var12 = this.regionX; // L: 246
					int var13 = this.regionY; // L: 247
					int var14 = this.pixelsPerTile; // L: 248
					DemotingHashTable var15 = WorldMapRegion_cachedSprites; // L: 250
					long var17 = (long)(var14 << 16 | var12 << 8 | var13); // L: 254
					var15.put(var11, var17, var11.pixels.length * 4); // L: 256
					this.method5258(); // L: 258
				}
			}
		}
	} // L: 211 214 259

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "12"
	)
	void method5224(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 262
			var4 = new HashSet(); // L: 263
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 265
		this.drawMapLinks(var1, var2, var4, var3); // L: 266
	} // L: 267

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1810904973"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 270

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 271
			if (var5.hasValidElement()) { // L: 273
				int var6 = var5.getElement(); // L: 274
				if (var1.contains(var6)) { // L: 275
					WorldMapElement var7 = SequenceDefinition.WorldMapElement_get(var6); // L: 276
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 277
				}
			}
		}

		this.method5234(var1, var2, var3); // L: 281
	} // L: 282

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lki;[Luu;Lkw;I)V",
		garbageValue = "-1395364958"
	)
	void method5246(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 285
			for (var5 = 0; var5 < 64; ++var5) { // L: 286
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 287
				this.method5229(var4, var5, this.worldMapData_0, var1); // L: 288
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 291
			for (var5 = 0; var5 < 64; ++var5) { // L: 292
				this.method5330(var4, var5, this.worldMapData_0, var1, var2); // L: 293
			}
		}

	} // L: 296

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lki;[Luu;Lkw;I)V",
		garbageValue = "-1253145142"
	)
	void method5227(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 299

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 300

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 302
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 303
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 304
					this.method5229(var6, var7, var5, var1); // L: 305
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 310

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 311

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 313
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 314
					this.method5330(var6, var7, var5, var1, var2); // L: 315
				}
			}
		}

	} // L: 320

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILkm;Lki;[Luu;I)V",
		garbageValue = "-1407383882"
	)
	void method5330(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5257(var1, var2, var3); // L: 323
		this.method5231(var1, var2, var3, var5); // L: 324
	} // L: 325

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILkm;Lki;Lkw;I)V",
		garbageValue = "-714242419"
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
			var8 = FontName.method8744(var7, this.backgroundColor); // L: 335
		}

		if (var7 > -1 && var3.field2981[0][var1][var2] == 0) { // L: 337
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 338
		} else {
			int var9 = this.method5221(var1, var2, var3, var5); // L: 341
			if (var7 == -1) { // L: 342
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 343
			} else {
				var4.method5617(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2981[0][var1][var2], var3.field2992[0][var1][var2]); // L: 346
			}
		}
	} // L: 339 344 347

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILkm;Lki;I)V",
		garbageValue = "-1830156506"
	)
	void method5229(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 350
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 351
			if (var6 > -1) { // L: 352
				int var7 = FontName.method8744(var6, this.backgroundColor); // L: 353
				if (var3.field2981[var5][var1][var2] == 0) { // L: 354
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 355
				} else {
					var4.method5617(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2981[var5][var1][var2], var3.field2992[var5][var1][var2]); // L: 358
				}
			}
		}

	} // L: 362

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILkm;Lkw;I)I",
		garbageValue = "1088231738"
	)
	int method5221(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 365 366 368
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILkm;[Luu;I)V",
		garbageValue = "2129518441"
	)
	void method5231(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 372
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 373
			if (var6 != null && var6.length != 0) { // L: 374
				WorldMapDecoration[] var7 = var6; // L: 378

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 379
					WorldMapDecoration var9 = var7[var8]; // L: 380
					int var11 = var9.decoration; // L: 383
					boolean var10 = var11 >= WorldMapDecorationType.field3829.id && var11 <= WorldMapDecorationType.field3823.id; // L: 385
					if (var10 || Players.method2700(var9.decoration)) { // L: 387
						ObjectComposition var12 = class90.getObjectDefinition(var9.objectDefinitionId); // L: 388
						if (var12.mapSceneId != -1) { // L: 389
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 390
								var4[var12.mapSceneId].method9542(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 394
							} else {
								var4[var12.mapSceneId].method9542(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 391
							}
						}
					}
				}
			}
		}

	} // L: 402

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILkm;B)V",
		garbageValue = "0"
	)
	void method5257(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 405
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 406
			if (var5 != null && var5.length != 0) { // L: 407
				WorldMapDecoration[] var6 = var5; // L: 411

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 412
					WorldMapDecoration var8 = var6[var7]; // L: 413
					int var10 = var8.decoration; // L: 416
					boolean var9 = var10 >= WorldMapDecorationType.field3810.id && var10 <= WorldMapDecorationType.field3809.id || var10 == WorldMapDecorationType.field3811.id; // L: 418
					if (var9) { // L: 420
						ObjectComposition var11 = class90.getObjectDefinition(var8.objectDefinitionId); // L: 421
						int var12 = var11.int1 != 0 ? -3407872 : -3355444; // L: 422
						if (var8.decoration == WorldMapDecorationType.field3810.id) { // L: 423
							this.method5245(var1, var2, var8.rotation, var12); // L: 424
						}

						if (var8.decoration == WorldMapDecorationType.field3808.id) { // L: 426
							this.method5245(var1, var2, var8.rotation, -3355444); // L: 427
							this.method5245(var1, var2, var8.rotation + 1, var12); // L: 428
						}

						if (var8.decoration == WorldMapDecorationType.field3809.id) { // L: 430
							if (var8.rotation == 0) {
								Rasterizer2D.method9438(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12); // L: 431
							}

							if (var8.rotation == 1) { // L: 432
								Rasterizer2D.method9438(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) { // L: 433
								Rasterizer2D.method9438(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) { // L: 434
								Rasterizer2D.method9438(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3811.id) { // L: 436
							int var13 = var8.rotation % 2; // L: 437
							int var14;
							if (var13 == 0) { // L: 438
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 439
									Rasterizer2D.method9438(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12); // L: 440
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) { // L: 444
									Rasterizer2D.method9438(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12); // L: 445
								}
							}
						}
					}
				}
			}
		}

	} // L: 454

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1126474202"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 457
		float var6 = var5 / 2.0F; // L: 458
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 459

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 460
			Coord var9 = (Coord)var8.getKey(); // L: 462
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 463
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 464
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 465
			if (var12 != null && var12.hasValidElement()) { // L: 466
				var12.screenX = var10; // L: 467
				var12.screenY = var11; // L: 468
				WorldMapElement var13 = SequenceDefinition.WorldMapElement_get(var12.getElement()); // L: 469
				if (!var3.contains(var13.getObjectId())) { // L: 470
					this.method5236(var12, var10, var11, var5); // L: 471
				}
			}
		}

	} // L: 476

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "33554432"
	)
	void method5234(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 479

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 480
			if (var5.hasValidElement()) { // L: 482
				WorldMapElement var6 = SequenceDefinition.WorldMapElement_get(var5.getElement()); // L: 483
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 484
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 485
				}
			}
		}

	} // L: 489

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lho;IIIII)V",
		garbageValue = "-756620409"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 492
		if (var6 != null) { // L: 493
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 496
			if (var4 % var5 < var5 / 2) { // L: 497
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 498
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 499
			}

		}
	} // L: 494 501

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lkv;IIFI)V",
		garbageValue = "652243452"
	)
	void method5236(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = SequenceDefinition.WorldMapElement_get(var1.getElement()); // L: 504
		this.method5237(var5, var2, var3); // L: 505
		this.method5238(var1, var5, var2, var3, var4); // L: 506
	} // L: 507

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lho;IIB)V",
		garbageValue = "1"
	)
	void method5237(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 510
		if (var4 != null) { // L: 511
			int var5 = this.method5230(var4, var1.horizontalAlignment); // L: 512
			int var6 = this.method5240(var4, var1.verticalAlignment); // L: 513
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 514
		}

	} // L: 516

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lkv;Lho;IIFB)V",
		garbageValue = "10"
	)
	void method5238(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 519
		if (var6 != null) { // L: 520
			if (var6.size.method5088(var5)) { // L: 523
				Font var7 = (Font)this.fonts.get(var6.size); // L: 526
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1922, 0, 1, 0, var7.ascent / 2); // L: 527
			}
		}
	} // L: 521 524 528

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IS)V",
		garbageValue = "12372"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 531
		Iterator var6 = this.icon0List.iterator(); // L: 532

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 533
			if (var7.hasValidElement()) { // L: 535
				int var8 = var7.coord2.x % 64; // L: 536
				int var9 = var7.coord2.y % 64; // L: 537
				var7.screenX = (int)((float)var8 * var5 + (float)var1); // L: 538
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5); // L: 539
				if (!var3.contains(var7.getElement())) { // L: 540
					this.method5236(var7, var7.screenX, var7.screenY, var5); // L: 543
				}
			}
		}

	} // L: 546

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lud;Lhz;B)I",
		garbageValue = "62"
	)
	int method5230(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 549
		case 0:
			return -var1.subWidth / 2; // L: 560
		case 1:
			return 0; // L: 552
		default:
			return -var1.subWidth; // L: 556
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lud;Lhl;I)I",
		garbageValue = "1142976391"
	)
	int method5240(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 566
		case 0:
			return 0; // L: 573
		case 2:
			return -var1.subHeight / 2; // L: 569
		default:
			return -var1.subHeight; // L: 577
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)Lka;",
		garbageValue = "-8386743"
	)
	WorldMapLabel method5241(int var1) {
		WorldMapElement var2 = SequenceDefinition.WorldMapElement_get(var1); // L: 604
		return this.createMapLabel(var2); // L: 605
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lho;B)Lka;",
		garbageValue = "28"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 609
			int var3 = var1.textSize; // L: 613
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large}; // L: 618
			WorldMapLabelSize[] var5 = var4; // L: 620
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 631
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 622
				if (var3 == var7.field2861) { // L: 624
					var2 = var7; // L: 625
					break;
				}

				++var6; // L: 621
			}

			if (var2 == null) { // L: 634
				return null; // L: 635
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 637
				if (var14 == null) { // L: 638
					return null; // L: 639
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 641
					String[] var15 = new String[var6]; // L: 642
					var14.breakLines(var1.name, (int[])null, var15); // L: 643
					int var8 = var15.length * var14.ascent / 2; // L: 644
					int var9 = 0; // L: 645
					String[] var10 = var15; // L: 647

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 648
						String var12 = var10[var11]; // L: 649
						int var13 = var14.stringWidth(var12); // L: 651
						if (var13 > var9) { // L: 652
							var9 = var13; // L: 653
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 658
				}
			}
		} else {
			return null; // L: 610
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "581283475"
	)
	List method5333(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 662
		if (var4 >= var1 && var5 >= var2) { // L: 663
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 664
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 665
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 666
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 668
						var6.add(var8); // L: 669
					}
				}

				var7 = this.icon0List.iterator(); // L: 673

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 674
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 676
						var6.add(var8); // L: 677
					}
				}

				return var6; // L: 681
			} else {
				return var6; // L: 672
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-1741054252"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 685
		var1.addAll(this.icon0List); // L: 686
		var1.addAll(this.iconMap.values()); // L: 687
		return var1; // L: 688
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2121569631"
	)
	void method5245(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 692
		if (var3 == 0) { // L: 693
			Rasterizer2D.method9440(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 694
			Rasterizer2D.method9438(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 695
			Rasterizer2D.method9440(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9438(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 696
		}

	} // L: 697

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "689945900"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 73
		if (var0 < 0 || var0 >= 65536) { // L: 74
			var0 >>>= 16; // L: 75
			var1 += 16; // L: 76
		}

		if (var0 >= 256) { // L: 78
			var0 >>>= 8; // L: 79
			var1 += 8; // L: 80
		}

		if (var0 >= 16) { // L: 82
			var0 >>>= 4; // L: 83
			var1 += 4; // L: 84
		}

		if (var0 >= 4) { // L: 86
			var0 >>>= 2; // L: 87
			var1 += 2; // L: 88
		}

		if (var0 >= 1) { // L: 90
			var0 >>>= 1; // L: 91
			++var1; // L: 92
		}

		return var0 + var1; // L: 94
	}
}
