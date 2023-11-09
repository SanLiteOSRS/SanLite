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

@ObfuscatedName("ii")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1505137813
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -113933645
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("n")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -508576805
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 170570097
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("s")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("p")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("b")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 50
		this.regionY = var2; // L: 51
		this.worldMapData1List = new LinkedList(); // L: 52
		this.icon0List = new LinkedList(); // L: 53
		this.iconMap = new HashMap(); // L: 54
		this.backgroundColor = var3 | -16777216; // L: 55
		this.fonts = var4; // L: 56
	} // L: 57

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "514"
	)
	void method4829(int var1, int var2, int var3) {
		SpritePixels var4 = HealthBarDefinition.method3494(this.regionX, this.regionY, this.pixelsPerTile); // L: 60
		if (var4 != null) { // L: 61
			if (var3 == this.pixelsPerTile * 64) { // L: 62
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	} // L: 68

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lht;Ljava/util/List;I)V",
		garbageValue = "1714994286"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 71
		this.worldMapData_0 = var1; // L: 72
		this.addAllToIconList(var2); // L: 73
	} // L: 74

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-34628115"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 77
		Iterator var3 = var1.iterator(); // L: 78

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 79
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 81
				this.worldMapData1List.add(var4); // L: 82
			}
		}

		this.addAllToIconList(var2); // L: 86
	} // L: 87

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIILie;I)V",
		garbageValue = "-508709856"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 90
			label49:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 91
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 92
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7]; // L: 93
					if (var9 != null && var9.length != 0) { // L: 94
						WorldMapDecoration[] var10 = var9; // L: 98

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 99
							WorldMapDecoration var12 = var10[var11]; // L: 100
							ObjectComposition var13 = InterfaceParent.getObjectDefinition(var12.objectDefinitionId); // L: 102
							if (class152.method3186(var13)) { // L: 103
								this.getIcon(var13, var8, var6, var7, var5); // L: 106
								continue label49; // L: 107
							}
						}
					}
				}
			}
		}

	} // L: 114

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lgm;IIILie;I)V",
		garbageValue = "-35500709"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 117
		Coord var7 = null; // L: 118
		if (this.worldMapData_0 != null) { // L: 119
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4); // L: 120
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 123
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 4096 + var8.getChunkYLow() * 8); // L: 124
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 127
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 128
		} else {
			var9 = Actor.WorldMapElement_get(var1.mapIconId); // L: 131
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 132
		}

		var9 = Actor.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 134
		if (var9.field1879) { // L: 135
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 136
		}

	} // L: 138

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-187541676"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 141

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 142
			if (var2 instanceof WorldMapIcon_1) { // L: 144
				((WorldMapIcon_1)var2).init(); // L: 145
			}
		}

	} // L: 149

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V",
		garbageValue = "1"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 152

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 153
			if (Actor.WorldMapElement_get(var3.element).field1879 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 155 158
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4916(var3.element)); // L: 159
				this.icon0List.add(var4); // L: 160
			}
		}

	} // L: 164

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	void method4836() {
		if (this.worldMapData_0 != null) { // L: 167
			this.worldMapData_0.reset(); // L: 168
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 171

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next();
				var2.reset();
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llg;B)Z",
		garbageValue = "-66"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear();
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.loadGeography(var1); // L: 183
			if (this.worldMapData_0.isFullyLoaded()) { // L: 184
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var2 = true;

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 196
				var4 = (WorldMapData_1)var3.next(); // L: 193
				var4.loadGeography(var1);
			}

			if (var2) { // L: 199
				var3 = this.worldMapData1List.iterator();

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next();
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILif;[Lry;Llg;Llg;I)V",
		garbageValue = "-1727272163"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 212
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 213
			if (HealthBarDefinition.method3494(this.regionX, this.regionY, var1) == null) {
				boolean var6 = true; // L: 219
				var6 &= this.loadGeography(var4); // L: 220
				int var8;
				if (this.worldMapData_0 != null) { // L: 223
					var8 = this.worldMapData_0.groupId; // L: 224
				} else {
					var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 227
				}

				var6 &= var5.tryLoadGroup(var8); // L: 229
				if (var6) { // L: 230
					byte[] var7 = var5.takeFileFlat(var8); // L: 231
					WorldMapSprite var9;
					if (var7 == null) { // L: 234
						var9 = new WorldMapSprite(); // L: 235
					} else {
						var9 = new WorldMapSprite(class26.method394(var7).pixels); // L: 238
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 241
					var11.setRaster(); // L: 242
					if (this.worldMapData_0 != null) { // L: 243
						this.method4938(var2, var3, var9); // L: 244
					} else {
						this.method4841(var2, var3, var9); // L: 247
					}

					int var12 = this.regionX; // L: 249
					int var13 = this.regionY; // L: 250
					int var14 = this.pixelsPerTile; // L: 251
					WorldMapRegion_cachedSprites.put(var11, SpotAnimationDefinition.method3591(var12, var13, var14), var11.pixels.length * 4); // L: 253
					this.method4836(); // L: 255
				}
			}
		}
	} // L: 214 217 256

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "8"
	)
	void method4914(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 259
			var4 = new HashSet(); // L: 260
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 262
		this.drawMapLinks(var1, var2, var4, var3); // L: 263
	} // L: 264

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1136019254"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 267

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 268
			if (var5.hasValidElement()) { // L: 270
				int var6 = var5.getElement(); // L: 271
				if (var1.contains(var6)) { // L: 272
					WorldMapElement var7 = Actor.WorldMapElement_get(var6); // L: 273
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 274
				}
			}
		}

		this.method4849(var1, var2, var3); // L: 278
	} // L: 279

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lif;[Lry;Lig;B)V",
		garbageValue = "5"
	)
	void method4938(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 282
			for (var5 = 0; var5 < 64; ++var5) { // L: 283
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 284
				this.method4922(var4, var5, this.worldMapData_0, var1); // L: 285
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 288
			for (var5 = 0; var5 < 64; ++var5) { // L: 289
				this.method4842(var4, var5, this.worldMapData_0, var1, var2); // L: 290
			}
		}

	} // L: 293

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lif;[Lry;Lig;I)V",
		garbageValue = "1271958949"
	)
	void method4841(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 296

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 297

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 299
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 300
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 301
					this.method4922(var6, var7, var5, var1); // L: 302
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 307

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 308

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 310
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 311
					this.method4842(var6, var7, var5, var1, var2); // L: 312
				}
			}
		}

	} // L: 317

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILie;Lif;[Lry;I)V",
		garbageValue = "2137387765"
	)
	void method4842(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4847(var1, var2, var3); // L: 320
		this.method4839(var1, var2, var3, var5); // L: 321
	} // L: 322

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IILie;Lif;Lig;I)V",
		garbageValue = "-382747084"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 325
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 326
		if (var6 == -1 && var7 == -1) { // L: 327
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 328
		}

		int var8 = 16711935; // L: 330
		int var9;
		if (var7 != -1) { // L: 331
			int var10 = this.backgroundColor; // L: 333
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 337
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 338
				var11 = var12; // L: 339
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 342
				var12 = new FloorOverlayDefinition(); // L: 343
				if (var13 != null) { // L: 344
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 345
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 346
				var11 = var12; // L: 347
			}

			if (var11 == null) { // L: 350
				var9 = var10; // L: 351
			} else if (var11.secondaryRgb >= 0) { // L: 354
				var9 = var11.secondaryRgb | -16777216; // L: 355
			} else {
				int var14;
				int var22;
				if (var11.texture >= 0) { // L: 357
					var14 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture); // L: 359
					byte var15 = 96; // L: 360
					int var21;
					if (var14 == -2) { // L: 362
						var21 = 12345678; // L: 363
					} else if (var14 == -1) { // L: 366
						if (var15 < 0) { // L: 367
							var15 = 0; // L: 368
						} else if (var15 > 127) { // L: 370
							var15 = 127; // L: 371
						}

						var22 = 127 - var15; // L: 373
						var21 = var22; // L: 374
					} else {
						var22 = var15 * (var14 & 127) / 128; // L: 377
						if (var22 < 2) { // L: 378
							var22 = 2;
						} else if (var22 > 126) { // L: 379
							var22 = 126;
						}

						var21 = var22 + (var14 & 65408); // L: 380
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var21] | -16777216; // L: 383
				} else if (var11.primaryRgb == 16711935) { // L: 385
					var9 = var10; // L: 386
				} else {
					var14 = var11.hue; // L: 390
					var22 = var11.saturation; // L: 391
					int var16 = var11.lightness; // L: 392
					if (var16 > 179) { // L: 394
						var22 /= 2;
					}

					if (var16 > 192) { // L: 395
						var22 /= 2;
					}

					if (var16 > 217) { // L: 396
						var22 /= 2;
					}

					if (var16 > 243) { // L: 397
						var22 /= 2;
					}

					int var17 = (var22 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 398
					byte var19 = 96; // L: 403
					int var18;
					if (var17 == -2) { // L: 405
						var18 = 12345678; // L: 406
					} else {
						int var23;
						if (var17 == -1) { // L: 409
							if (var19 < 0) { // L: 410
								var19 = 0; // L: 411
							} else if (var19 > 127) { // L: 413
								var19 = 127; // L: 414
							}

							var23 = 127 - var19; // L: 416
							var18 = var23; // L: 417
						} else {
							var23 = var19 * (var17 & 127) / 128; // L: 420
							if (var23 < 2) { // L: 421
								var23 = 2;
							} else if (var23 > 126) { // L: 422
								var23 = 126;
							}

							var18 = var23 + (var17 & 65408); // L: 423
						}
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 426
				}
			}

			var8 = var9; // L: 429
		}

		if (var7 > -1 && var3.field2886[0][var1][var2] == 0) { // L: 431
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 432
		} else {
			var9 = this.method4845(var1, var2, var3, var5); // L: 435
			if (var7 == -1) { // L: 436
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 437
			} else {
				var4.method5286(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2886[0][var1][var2], var3.field2887[0][var1][var2]); // L: 440
			}
		}
	} // L: 433 438 441

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILie;Lif;I)V",
		garbageValue = "-2013884571"
	)
	void method4922(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 444
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 445
			if (var6 > -1) { // L: 446
				int var8 = this.backgroundColor; // L: 448
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 452
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 453
					var9 = var10; // L: 454
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 457
					var10 = new FloorOverlayDefinition(); // L: 458
					if (var11 != null) { // L: 459
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 460
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 461
					var9 = var10; // L: 462
				}

				int var7;
				if (var9 == null) { // L: 465
					var7 = var8; // L: 466
				} else if (var9.secondaryRgb >= 0) { // L: 469
					var7 = var9.secondaryRgb | -16777216; // L: 470
				} else {
					int var12;
					int var21;
					if (var9.texture >= 0) { // L: 472
						var12 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture); // L: 474
						byte var13 = 96; // L: 475
						int var19;
						if (var12 == -2) { // L: 477
							var19 = 12345678; // L: 478
						} else if (var12 == -1) { // L: 481
							if (var13 < 0) { // L: 482
								var13 = 0; // L: 483
							} else if (var13 > 127) { // L: 485
								var13 = 127; // L: 486
							}

							var21 = 127 - var13; // L: 488
							var19 = var21; // L: 489
						} else {
							var21 = var13 * (var12 & 127) / 128; // L: 492
							if (var21 < 2) {
								var21 = 2; // L: 493
							} else if (var21 > 126) { // L: 494
								var21 = 126;
							}

							var19 = var21 + (var12 & 65408); // L: 495
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216; // L: 498
					} else if (var9.primaryRgb == 16711935) { // L: 500
						var7 = var8; // L: 501
					} else {
						var12 = var9.hue; // L: 505
						var21 = var9.saturation; // L: 506
						int var14 = var9.lightness; // L: 507
						if (var14 > 179) { // L: 509
							var21 /= 2;
						}

						if (var14 > 192) { // L: 510
							var21 /= 2;
						}

						if (var14 > 217) { // L: 511
							var21 /= 2;
						}

						if (var14 > 243) { // L: 512
							var21 /= 2;
						}

						int var15 = (var21 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 513
						byte var17 = 96; // L: 518
						int var16;
						if (var15 == -2) { // L: 520
							var16 = 12345678; // L: 521
						} else {
							int var22;
							if (var15 == -1) { // L: 524
								if (var17 < 0) { // L: 525
									var17 = 0; // L: 526
								} else if (var17 > 127) { // L: 528
									var17 = 127; // L: 529
								}

								var22 = 127 - var17; // L: 531
								var16 = var22; // L: 532
							} else {
								var22 = var17 * (var15 & 127) / 128; // L: 535
								if (var22 < 2) { // L: 536
									var22 = 2;
								} else if (var22 > 126) { // L: 537
									var22 = 126;
								}

								var16 = var22 + (var15 & 65408); // L: 538
							}
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 541
					}
				}

				if (var3.field2886[var5][var1][var2] == 0) { // L: 545
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 546
				} else {
					var4.method5286(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2886[var5][var1][var2], var3.field2887[var5][var1][var2]); // L: 549
				}
			}
		}

	} // L: 553

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILie;Lig;S)I",
		garbageValue = "22414"
	)
	int method4845(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 556 557 559
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILie;[Lry;B)V",
		garbageValue = "1"
	)
	void method4839(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 563
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 564
			if (var6 != null && var6.length != 0) { // L: 565
				WorldMapDecoration[] var7 = var6; // L: 569

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 570
					WorldMapDecoration var9 = var7[var8]; // L: 571
					int var11 = var9.decoration; // L: 574
					boolean var10 = var11 >= WorldMapDecorationType.field3692.id && var11 <= WorldMapDecorationType.field3682.id; // L: 576
					if (var10 || ItemContainer.method2221(var9.decoration)) { // L: 578
						ObjectComposition var12 = InterfaceParent.getObjectDefinition(var9.objectDefinitionId); // L: 579
						if (var12.mapSceneId != -1) { // L: 580
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) { // L: 581
								var4[var12.mapSceneId].method8806(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 585
							} else {
								var4[var12.mapSceneId].method8806(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 582
							}
						}
					}
				}
			}
		}

	} // L: 593

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILie;I)V",
		garbageValue = "1702557254"
	)
	void method4847(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 596
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 597
			if (var5 != null && var5.length != 0) { // L: 598
				WorldMapDecoration[] var6 = var5; // L: 602

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 603
					WorldMapDecoration var8 = var6[var7]; // L: 604
					if (AbstractWorldMapData.method5144(var8.decoration)) { // L: 606
						ObjectComposition var9 = InterfaceParent.getObjectDefinition(var8.objectDefinitionId); // L: 607
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 608
						if (var8.decoration == WorldMapDecorationType.field3685.id) { // L: 609
							this.method4861(var1, var2, var8.rotation, var10); // L: 610
						}

						if (var8.decoration == WorldMapDecorationType.field3684.id) { // L: 612
							this.method4861(var1, var2, var8.rotation, -3355444); // L: 613
							this.method4861(var1, var2, var8.rotation + 1, var10); // L: 614
						}

						if (var8.decoration == WorldMapDecorationType.field3688.id) { // L: 616
							if (var8.rotation == 0) { // L: 617
								Rasterizer2D.method8720(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method8720(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 618
							}

							if (var8.rotation == 2) { // L: 619
								Rasterizer2D.method8720(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 620
								Rasterizer2D.method8720(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3676.id) { // L: 622
							int var11 = var8.rotation % 2; // L: 623
							int var12;
							if (var11 == 0) { // L: 624
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 625
									Rasterizer2D.method8720(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 626
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 630
									Rasterizer2D.method8720(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 631
								}
							}
						}
					}
				}
			}
		}

	} // L: 640

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "2008207626"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 643
		float var6 = var5 / 2.0F; // L: 644
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 645

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 646
			Coord var9 = (Coord)var8.getKey(); // L: 648
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6); // L: 649
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 650
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 651
			if (var12 != null && var12.hasValidElement()) { // L: 652
				var12.screenX = var10; // L: 653
				var12.screenY = var11; // L: 654
				WorldMapElement var13 = Actor.WorldMapElement_get(var12.getElement()); // L: 655
				if (!var3.contains(var13.getObjectId())) { // L: 656
					this.method4851(var12, var10, var11, var5); // L: 657
				}
			}
		}

	} // L: 662

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1125443658"
	)
	void method4849(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 665

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 666
			if (var5.hasValidElement()) { // L: 668
				WorldMapElement var6 = Actor.WorldMapElement_get(var5.getElement()); // L: 669
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 670
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 671
				}
			}
		}

	} // L: 675

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfd;IIIIB)V",
		garbageValue = "-78"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 678
		if (var6 != null) { // L: 679
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 682
			if (var4 % var5 < var5 / 2) { // L: 683
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 684
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 685
			}

		}
	} // L: 680 687

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Liq;IIFI)V",
		garbageValue = "1755619389"
	)
	void method4851(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = Actor.WorldMapElement_get(var1.getElement()); // L: 690
		this.method4852(var5, var2, var3); // L: 691
		this.method4857(var1, var5, var2, var3, var4); // L: 692
	} // L: 693

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfd;III)V",
		garbageValue = "-1395404143"
	)
	void method4852(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 696
		if (var4 != null) { // L: 697
			int var5 = this.method4890(var4, var1.horizontalAlignment); // L: 698
			int var6 = this.method4856(var4, var1.verticalAlignment); // L: 699
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 700
		}

	} // L: 702

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Liq;Lfd;IIFI)V",
		garbageValue = "-1112729221"
	)
	void method4857(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 705
		if (var6 != null) { // L: 706
			if (var6.size.method4685(var5)) { // L: 709
				Font var7 = (Font)this.fonts.get(var6.size); // L: 712
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1883, 0, 1, 0, var7.ascent / 2); // L: 713
			}
		}
	} // L: 707 710 714

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-83"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 717
		Iterator var6 = this.icon0List.iterator(); // L: 718

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 719
			if (var7.hasValidElement()) { // L: 721
				int var8 = var7.coord2.x % 64; // L: 722
				int var9 = var7.coord2.y % 64; // L: 723
				var7.screenX = (int)((float)var8 * var5 + (float)var1); // L: 724
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2); // L: 725
				if (!var3.contains(var7.getElement())) { // L: 726
					this.method4851(var7, var7.screenX, var7.screenY, var5); // L: 729
				}
			}
		}

	} // L: 732

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lgl;B)I",
		garbageValue = "-16"
	)
	int method4890(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 735
		case 0:
			return -var1.subWidth / 2; // L: 738
		case 1:
			return 0; // L: 746
		default:
			return -var1.subWidth; // L: 742
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lga;B)I",
		garbageValue = "-56"
	)
	int method4856(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 752
		case 0:
			return 0; // L: 763
		case 1:
			return -var1.subHeight / 2; // L: 755
		default:
			return -var1.subHeight; // L: 759
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Liz;",
		garbageValue = "1929154767"
	)
	WorldMapLabel method4916(int var1) {
		WorldMapElement var2 = Actor.WorldMapElement_get(var1); // L: 790
		return this.createMapLabel(var2); // L: 791
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfd;B)Liz;",
		garbageValue = "6"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 795
			WorldMapLabelSize var2 = WorldMapLabelSize.method4686(var1.textSize); // L: 798
			if (var2 == null) { // L: 799
				return null; // L: 800
			} else {
				Font var3 = (Font)this.fonts.get(var2); // L: 802
				if (var3 == null) { // L: 803
					return null; // L: 804
				} else {
					int var4 = var3.lineCount(var1.name, 1000000); // L: 806
					String[] var5 = new String[var4]; // L: 807
					var3.breakLines(var1.name, (int[])null, var5); // L: 808
					int var6 = var5.length * var3.ascent / 2; // L: 809
					int var7 = 0; // L: 810
					String[] var8 = var5; // L: 812

					for (int var9 = 0; var9 < var8.length; ++var9) { // L: 813
						String var10 = var8[var9]; // L: 814
						int var11 = var3.stringWidth(var10); // L: 816
						if (var11 > var7) { // L: 817
							var7 = var11; // L: 818
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2); // L: 823
				}
			}
		} else {
			return null; // L: 796
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "203643147"
	)
	List method4859(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 827
		if (var4 >= var1 && var5 >= var2) { // L: 828
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 829
				Iterator var7 = this.iconMap.values().iterator(); // L: 830

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 831
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 833
						var6.add(var8); // L: 834
					}
				}

				var7 = this.icon0List.iterator(); // L: 838

				while (var7.hasNext()) { // L: 845
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 839
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 841
						var6.add(var8); // L: 842
					}
				}

				return var6; // L: 846
			} else {
				return var6; // L: 837
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "-19"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 850
		var1.addAll(this.icon0List); // L: 851
		var1.addAll(this.iconMap.values()); // L: 852
		return var1; // L: 853
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	void method4861(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 857
		if (var3 == 0) { // L: 858
			Rasterizer2D.method8721(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 859
			Rasterizer2D.method8720(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 860
			Rasterizer2D.method8721(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method8720(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 861
		}

	} // L: 862

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IIIIIII)V",
		garbageValue = "-970443379"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = Client.field789 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) { // L: 174
						Tiles.Tiles_heights[0][var2][var3] = -class4.method15(932731 + var2 + var4, var5 + 556238 + var3) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 175
					}
					break;
				}

				if (var7 == 1) { // L: 178
					int var8 = var0.readUnsignedByte(); // L: 179
					if (var8 == 1) { // L: 180
						var8 = 0;
					}

					if (var1 == 0) { // L: 181
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 182
					}
					break;
				}

				if (var7 <= 49) { // L: 185
					Tiles.field1001[var1][var2][var3] = Client.field789 < 209 ? (short)var0.readByte() : (short)var0.readShort(); // L: 186
					Tiles.field996[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 187
					class174.field1852[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 188
				} else if (var7 <= 81) { // L: 191
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 192
				} else {
					Tiles.field994[var1][var2][var3] = (short)(var7 - 81); // L: 195
				}
			}
		} else {
			while (true) {
				var7 = Client.field789 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort(); // L: 200
				if (var7 == 0) { // L: 201
					break;
				}

				if (var7 == 1) { // L: 202
					var0.readUnsignedByte(); // L: 203
					break;
				}

				if (var7 <= 49) { // L: 206
					if (Client.field789 < 209) { // L: 207
						var0.readByte(); // L: 208
					} else {
						var0.readShort(); // L: 211
					}
				}
			}
		}

	} // L: 216

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lqr;J)V"
	)
	static void method4963(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67
}
