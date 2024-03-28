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

@ObfuscatedName("kr")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1321583715
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1135339019
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ad")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -220162003
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1810434073
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ag")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ai")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ax")
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2056937306"
	)
	void method5372(int var1, int var2, int var3) {
		SpritePixels var4 = ClanChannelMember.method3164(this.regionX, this.regionY, this.pixelsPerTile); // L: 71
		if (var4 != null) { // L: 72
			if (var3 == this.pixelsPerTile * 64) { // L: 73
				var4.drawAt(var1, var2); // L: 74
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 77
			}

		}
	} // L: 79

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lka;Ljava/util/List;I)V",
		garbageValue = "240288249"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 82
		this.worldMapData_0 = var1; // L: 83
		this.addAllToIconList(var2); // L: 84
	} // L: 85

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "-116"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILkl;I)V",
		garbageValue = "1631744322"
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
							ObjectComposition var13 = MouseRecorder.getObjectDefinition(var12.objectDefinitionId); // L: 113
							if (SecureRandomCallable.method2276(var13)) { // L: 114
								this.getIcon(var13, var8, var6, var7, var5); // L: 117
								continue label50; // L: 118
							}
						}
					}
				}
			}
		}

	} // L: 125

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lis;IIILkl;I)V",
		garbageValue = "-966539525"
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
			var9 = class340.WorldMapElement_get(var1.mapIconId); // L: 142
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 143
		}

		var9 = class340.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 145
		if (var9.field2004) { // L: 146
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 147
		}

	} // L: 149

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-660381887"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "196972681"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 163

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 164
			if (class340.WorldMapElement_get(var3.element).field2004 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 166 169
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5401(var3.element)); // L: 170
				this.icon0List.add(var4); // L: 171
			}
		}

	} // L: 175

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1721053632"
	)
	void method5379() {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)Z",
		garbageValue = "-2112663916"
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

				while (var3.hasNext()) { // L: 216
					var4 = (WorldMapData_1)var3.next(); // L: 212
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 214
				}
			}

			return var2; // L: 218
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILlq;[Lvl;Loc;Loc;I)V",
		garbageValue = "991627936"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 223
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 224
			if (ClanChannelMember.method3164(this.regionX, this.regionY, var1) == null) { // L: 227
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
					WorldMapSprite var9;
					if (var7 == null) { // L: 245
						var9 = new WorldMapSprite(); // L: 246
					} else {
						var9 = new WorldMapSprite(GrandExchangeOfferUnitPriceComparator.method7149(var7).pixels); // L: 249
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 252
					var11.setRaster(); // L: 253
					if (this.worldMapData_0 != null) { // L: 254
						this.method5384(var2, var3, var9); // L: 255
					} else {
						this.method5409(var2, var3, var9); // L: 258
					}

					class227.method4308(var11, this.regionX, this.regionY, this.pixelsPerTile); // L: 260
					this.method5379(); // L: 261
				}
			}
		}
	} // L: 225 228 262

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-1120181498"
	)
	void method5419(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 265
			var4 = new HashSet(); // L: 266
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 268
		this.drawMapLinks(var1, var2, var4, var3); // L: 269
	} // L: 270

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "104"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 273

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 274
			if (var5.hasValidElement()) { // L: 276
				int var6 = var5.getElement(); // L: 277
				if (var1.contains(var6)) { // L: 278
					WorldMapElement var7 = class340.WorldMapElement_get(var6); // L: 279
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 280
				}
			}
		}

		this.method5393(var1, var2, var3); // L: 284
	} // L: 285

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llq;[Lvl;Lkw;I)V",
		garbageValue = "-486102076"
	)
	void method5384(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 288
			for (var5 = 0; var5 < 64; ++var5) { // L: 289
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 290
				this.method5388(var4, var5, this.worldMapData_0, var1); // L: 291
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 294
			for (var5 = 0; var5 < 64; ++var5) { // L: 295
				this.method5386(var4, var5, this.worldMapData_0, var1, var2); // L: 296
			}
		}

	} // L: 299

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llq;[Lvl;Lkw;B)V",
		garbageValue = "-7"
	)
	void method5409(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 302

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 303

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 305
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 306
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 307
					this.method5388(var6, var7, var5, var1); // L: 308
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 313

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 314

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 316
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 317
					this.method5386(var6, var7, var5, var1, var2); // L: 318
				}
			}
		}

	} // L: 323

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILkl;Llq;[Lvl;B)V",
		garbageValue = "81"
	)
	void method5386(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5466(var1, var2, var3); // L: 326
		this.method5457(var1, var2, var3, var5); // L: 327
	} // L: 328

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILkl;Llq;Lkw;I)V",
		garbageValue = "-2058278848"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 331
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 332
		if (var6 == -1 && var7 == -1) { // L: 333
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 334
		}

		int var8 = 16711935; // L: 336
		int var9;
		if (var7 != -1) { // L: 337
			int var10 = this.backgroundColor; // L: 339
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 343
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 344
				var11 = var12; // L: 345
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 348
				var12 = new FloorOverlayDefinition(); // L: 349
				if (var13 != null) { // L: 350
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 351
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 352
				var11 = var12; // L: 353
			}

			if (var11 == null) { // L: 356
				var9 = var10; // L: 357
			} else {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var11.secondaryRgb >= 0) { // L: 360
					var14 = var11.secondaryHue; // L: 362
					var15 = var11.secondarySaturation; // L: 363
					var16 = var11.secondaryLightness; // L: 364
					if (var16 > 179) { // L: 366
						var15 /= 2;
					}

					if (var16 > 192) { // L: 367
						var15 /= 2;
					}

					if (var16 > 217) { // L: 368
						var15 /= 2;
					}

					if (var16 > 243) { // L: 369
						var15 /= 2;
					}

					var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 370
					var18 = StructComposition.method4035(var17, 96); // L: 374
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 375
				} else if (var11.texture >= 0) { // L: 377
					int var19 = StructComposition.method4035(Rasterizer3D.field2611.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 378
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216; // L: 379
				} else if (var11.primaryRgb == 16711935) { // L: 381
					var9 = var10; // L: 382
				} else {
					var14 = var11.hue; // L: 386
					var15 = var11.saturation; // L: 387
					var16 = var11.lightness; // L: 388
					if (var16 > 179) { // L: 390
						var15 /= 2;
					}

					if (var16 > 192) { // L: 391
						var15 /= 2;
					}

					if (var16 > 217) { // L: 392
						var15 /= 2;
					}

					if (var16 > 243) { // L: 393
						var15 /= 2;
					}

					var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 394
					var18 = StructComposition.method4035(var17, 96); // L: 398
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 399
				}
			}

			var8 = var9; // L: 402
		}

		if (var7 > -1 && var3.field3100[0][var1][var2] == 0) { // L: 404
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 405
		} else {
			var9 = this.method5389(var1, var2, var3, var5); // L: 408
			if (var7 == -1) { // L: 409
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 410
			} else {
				var4.method5785(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3100[0][var1][var2], var3.field3101[0][var1][var2]); // L: 413
			}
		}
	} // L: 406 411 414

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILkl;Llq;B)V",
		garbageValue = "-16"
	)
	void method5388(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 417
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 418
			if (var6 > -1) { // L: 419
				int var8 = this.backgroundColor; // L: 421
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 425
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 426
					var9 = var10; // L: 427
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 430
					var10 = new FloorOverlayDefinition(); // L: 431
					if (var11 != null) { // L: 432
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 433
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 434
					var9 = var10; // L: 435
				}

				int var7;
				if (var9 == null) { // L: 438
					var7 = var8; // L: 439
				} else {
					int var12;
					int var13;
					int var14;
					int var15;
					int var16;
					if (var9.secondaryRgb >= 0) { // L: 442
						var12 = var9.secondaryHue; // L: 444
						var13 = var9.secondarySaturation; // L: 445
						var14 = var9.secondaryLightness; // L: 446
						if (var14 > 179) { // L: 448
							var13 /= 2;
						}

						if (var14 > 192) { // L: 449
							var13 /= 2;
						}

						if (var14 > 217) { // L: 450
							var13 /= 2;
						}

						if (var14 > 243) { // L: 451
							var13 /= 2;
						}

						var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 452
						var16 = StructComposition.method4035(var15, 96); // L: 456
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 457
					} else if (var9.texture >= 0) { // L: 459
						int var17 = StructComposition.method4035(Rasterizer3D.field2611.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 460
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 461
					} else if (var9.primaryRgb == 16711935) { // L: 463
						var7 = var8; // L: 464
					} else {
						var12 = var9.hue; // L: 468
						var13 = var9.saturation; // L: 469
						var14 = var9.lightness; // L: 470
						if (var14 > 179) { // L: 472
							var13 /= 2;
						}

						if (var14 > 192) { // L: 473
							var13 /= 2;
						}

						if (var14 > 217) {
							var13 /= 2; // L: 474
						}

						if (var14 > 243) { // L: 475
							var13 /= 2;
						}

						var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 476
						var16 = StructComposition.method4035(var15, 96); // L: 480
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 481
					}
				}

				if (var3.field3100[var5][var1][var2] == 0) { // L: 485
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 486
				} else {
					var4.method5785(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3100[var5][var1][var2], var3.field3101[var5][var1][var2]); // L: 489
				}
			}
		}

	} // L: 493

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IILkl;Lkw;I)I",
		garbageValue = "1200455594"
	)
	int method5389(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 496 497 499
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILkl;[Lvl;I)V",
		garbageValue = "1769198369"
	)
	void method5457(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 503
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 504
			if (var6 != null && var6.length != 0) { // L: 505
				WorldMapDecoration[] var7 = var6; // L: 509

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 510
					WorldMapDecoration var9 = var7[var8]; // L: 511
					if (!World.method1801(var9.decoration)) { // L: 514
						int var11 = var9.decoration; // L: 516
						boolean var10 = var11 == WorldMapDecorationType.field3923.id; // L: 518
						if (!var10) { // L: 520
							continue;
						}
					}

					ObjectComposition var12 = MouseRecorder.getObjectDefinition(var9.objectDefinitionId); // L: 522
					if (var12.mapSceneId != -1) { // L: 523
						if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 524
							var4[var12.mapSceneId].method9686(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 528
						} else {
							var4[var12.mapSceneId].method9686(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 525
						}
					}
				}
			}
		}

	} // L: 536

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILkl;I)V",
		garbageValue = "871169977"
	)
	void method5466(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 539
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 540
			if (var5 != null && var5.length != 0) { // L: 541
				WorldMapDecoration[] var6 = var5; // L: 545

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 546
					WorldMapDecoration var8 = var6[var7]; // L: 547
					if (class315.method5940(var8.decoration)) { // L: 549
						ObjectComposition var9 = MouseRecorder.getObjectDefinition(var8.objectDefinitionId); // L: 550
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 551
						if (var8.decoration == WorldMapDecorationType.field3927.id) { // L: 552
							this.method5405(var1, var2, var8.rotation, var10); // L: 553
						}

						if (var8.decoration == WorldMapDecorationType.field3925.id) { // L: 555
							this.method5405(var1, var2, var8.rotation, -3355444); // L: 556
							this.method5405(var1, var2, var8.rotation + 1, var10); // L: 557
						}

						if (var8.decoration == WorldMapDecorationType.field3939.id) { // L: 559
							if (var8.rotation == 0) { // L: 560
								Rasterizer2D.method9581(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9581(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 561
							}

							if (var8.rotation == 2) { // L: 562
								Rasterizer2D.method9581(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 563
								Rasterizer2D.method9581(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3942.id) { // L: 565
							int var11 = var8.rotation % 2; // L: 566
							int var12;
							if (var11 == 0) { // L: 567
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 568
									Rasterizer2D.method9581(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 569
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 573
									Rasterizer2D.method9581(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 574
								}
							}
						}
					}
				}
			}
		}

	} // L: 583

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1143874030"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 586
		float var6 = var5 / 2.0F; // L: 587
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 588

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 589
			Coord var9 = (Coord)var8.getKey(); // L: 591
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 592
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 593
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 594
			if (var12 != null && var12.hasValidElement()) { // L: 595
				var12.screenX = var10; // L: 596
				var12.screenY = var11; // L: 597
				WorldMapElement var13 = class340.WorldMapElement_get(var12.getElement()); // L: 598
				if (!var3.contains(var13.getObjectId())) { // L: 599
					this.method5432(var12, var10, var11, var5); // L: 600
				}
			}
		}

	} // L: 605

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1991643709"
	)
	void method5393(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 608

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 609
			if (var5.hasValidElement()) { // L: 611
				WorldMapElement var6 = class340.WorldMapElement_get(var5.getElement()); // L: 612
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 613
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 614
				}
			}
		}

	} // L: 618

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhw;IIIIB)V",
		garbageValue = "-80"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 621
		if (var6 != null) { // L: 622
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 625
			if (var4 % var5 < var5 / 2) { // L: 626
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 627
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 628
			}

		}
	} // L: 623 630

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llh;IIFI)V",
		garbageValue = "-2125890136"
	)
	void method5432(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class340.WorldMapElement_get(var1.getElement()); // L: 633
		this.method5396(var5, var2, var3); // L: 634
		this.method5397(var1, var5, var2, var3, var4); // L: 635
	} // L: 636

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lhw;III)V",
		garbageValue = "-1990538799"
	)
	void method5396(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 639
		if (var4 != null) { // L: 640
			int var5 = this.method5478(var4, var1.horizontalAlignment); // L: 641
			int var6 = this.method5400(var4, var1.verticalAlignment); // L: 642
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 643
		}

	} // L: 645

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Llh;Lhw;IIFI)V",
		garbageValue = "1884054561"
	)
	void method5397(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 648
		if (var6 != null) { // L: 649
			if (var6.size.method5238(var5)) { // L: 652
				Font var7 = (Font)this.fonts.get(var6.size); // L: 655
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field2011, 0, 1, 0, var7.ascent / 2); // L: 656
			}
		}
	} // L: 650 653 657

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "12"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 660
		Iterator var6 = this.icon0List.iterator(); // L: 661

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 662
			if (var7.hasValidElement()) { // L: 664
				int var8 = var7.coord2.x % 64; // L: 665
				int var9 = var7.coord2.y % 64; // L: 666
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 667
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9)); // L: 668
				if (!var3.contains(var7.getElement())) { // L: 669
					this.method5432(var7, var7.screenX, var7.screenY, var5); // L: 672
				}
			}
		}

	} // L: 675

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lvg;Lhn;I)I",
		garbageValue = "801006293"
	)
	int method5478(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 678
		case 1:
			return 0; // L: 681
		case 2:
			return -var1.subWidth / 2; // L: 685
		default:
			return -var1.subWidth; // L: 689
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lvg;Lif;I)I",
		garbageValue = "111028410"
	)
	int method5400(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 695
		case 0:
			return 0; // L: 706
		case 2:
			return -var1.subHeight / 2; // L: 702
		default:
			return -var1.subHeight; // L: 698
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)Lkz;",
		garbageValue = "-2056476355"
	)
	WorldMapLabel method5401(int var1) {
		WorldMapElement var2 = class340.WorldMapElement_get(var1); // L: 733
		return this.createMapLabel(var2); // L: 734
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)Lkz;",
		garbageValue = "-1520917729"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 738
			int var3 = var1.textSize; // L: 742
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method5242(); // L: 745
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null; // L: 756
					break;
				}

				WorldMapLabelSize var6 = var4[var5]; // L: 747
				if (var3 == var6.field2961) { // L: 749
					var2 = var6; // L: 750
					break;
				}

				++var5; // L: 746
			}

			if (var2 == null) { // L: 759
				return null; // L: 760
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 762
				if (var14 == null) { // L: 763
					return null; // L: 764
				} else {
					int var15 = var14.lineCount(var1.name, 1000000); // L: 766
					String[] var7 = new String[var15]; // L: 767
					var14.breakLines(var1.name, (int[])null, var7); // L: 768
					int var8 = var7.length * var14.ascent / 2; // L: 769
					int var9 = 0; // L: 770
					String[] var10 = var7; // L: 772

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 773
						String var12 = var10[var11]; // L: 774
						int var13 = var14.stringWidth(var12); // L: 776
						if (var13 > var9) { // L: 777
							var9 = var13; // L: 778
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 783
				}
			}
		} else {
			return null; // L: 739
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "2027936937"
	)
	List method5403(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 787
		if (var4 >= var1 && var5 >= var2) { // L: 788
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 789
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 790
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 791
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 793
						var6.add(var8); // L: 794
					}
				}

				var7 = this.icon0List.iterator(); // L: 798

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 799
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 801
						var6.add(var8); // L: 802
					}
				}

				return var6; // L: 806
			} else {
				return var6; // L: 797
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "840146495"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 810
		var1.addAll(this.icon0List); // L: 811
		var1.addAll(this.iconMap.values()); // L: 812
		return var1; // L: 813
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1532595165"
	)
	void method5405(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 817
		if (var3 == 0) { // L: 818
			Rasterizer2D.method9625(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 819
			Rasterizer2D.method9581(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 820
			Rasterizer2D.method9625(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9581(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 821
		}

	} // L: 822
}
