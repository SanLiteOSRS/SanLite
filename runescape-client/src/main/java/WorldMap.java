import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("an")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ab")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	WorldMapArea field4905;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1993834971
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -439956157
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1466565
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1024952423
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ak")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bh")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 595176605
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1908673183
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 533347459
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 608469061
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -157660715
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1078038505
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bs")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bm")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -507731773
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1509565263
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -505190469
	)
	int field4924;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1285196347
	)
	int field4925;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1888322425
	)
	int field4926;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -54159521
	)
	int field4927;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		longValue = -3279279265360802961L
	)
	long field4928;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -112274759
	)
	int field4941;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -478994675
	)
	int field4904;
	@ObfuscatedName("be")
	boolean field4931;
	@ObfuscatedName("bx")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bn")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bw")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bc")
	HashSet field4889;
	@ObfuscatedName("bg")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1663148075
	)
	int field4894;
	@ObfuscatedName("cm")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cn")
	List field4939;
	@ObfuscatedName("cs")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cx")
	HashSet field4937;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cd")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 128640385
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -635961085
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1030913965
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1737387481
	)
	int field4948;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11; // L: 47
		fontNameVerdana13 = FontName.FontName_verdana13; // L: 48
		fontNameVerdana15 = FontName.FontName_verdana15; // L: 49
	}

	public WorldMap() {
		this.worldMapTargetX = -1; // L: 61
		this.worldMapTargetY = -1; // L: 62
		this.worldMapDisplayWidth = -1; // L: 65
		this.worldMapDisplayHeight = -1; // L: 66
		this.worldMapDisplayX = -1; // L: 67
		this.worldMapDisplayY = -1; // L: 68
		this.maxFlashCount = 3; // L: 69
		this.cyclesPerFlash = 50; // L: 70
		this.perpetualFlash = false; // L: 71
		this.flashingElements = null; // L: 72
		this.flashCount = -1; // L: 73
		this.flashCycle = -1; // L: 74
		this.field4924 = -1; // L: 75
		this.field4925 = -1; // L: 76
		this.field4926 = -1; // L: 77
		this.field4927 = -1; // L: 78
		this.field4931 = true; // L: 82
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field4889 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field4894 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field4937 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.showCoord = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field4948 = -1; // L: 102
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;Lnu;Lpi;Ljava/util/HashMap;[Luk;I)V",
		garbageValue = "98819926"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 106
		this.WorldMap_archive = var1; // L: 107
		this.WorldMap_geographyArchive = var2; // L: 108
		this.WorldMap_groundArchive = var3; // L: 109
		this.font = var4; // L: 110
		this.fonts = new HashMap(); // L: 111
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 113
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 114
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 115
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3068.name); // L: 116
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 117
		int var9 = var8 == null ? 0 : var8.length; // L: 118
		this.details = new HashMap(var9); // L: 119

		for (int var10 = 0; var10 < var9; ++var10) { // L: 120
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10])); // L: 121
			WorldMapArea var12 = new WorldMapArea(); // L: 122
			var12.read(var11, var8[var10]); // L: 123
			this.details.put(var12.getInternalName(), var12); // L: 124
			if (var12.getIsMain()) { // L: 125
				this.mainMapArea = var12; // L: 126
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 129
		this.field4905 = null; // L: 130
	} // L: 131

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	public void method8498() {
		class18.method291(); // L: 134
	} // L: 135

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "10"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method5310(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); WorldMapSection1.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4937.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4937.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						WorldMapSection1.runScriptEvent(var14); // L: 174
					}
				}

				this.field4937 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1934928050"
	)
	public void method8500(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = GameEngine.method661(); // L: 182
			this.method8663(var1, var2, var4, var5); // L: 183
			if (!this.hasTarget() && (var4 || var3)) { // L: 185
				boolean var7 = Client.clickedWidget != null; // L: 188
				if (!var7) { // L: 190
					if (var4) { // L: 191
						this.field4926 = var1; // L: 192
						this.field4927 = var2; // L: 193
						this.field4924 = this.centerTileX; // L: 194
						this.field4925 = this.centerTileY; // L: 195
					}

					if (this.field4924 != -1) { // L: 197
						int var8 = var1 - this.field4926; // L: 198
						int var9 = var2 - this.field4927; // L: 199
						this.setWorldMapPosition(this.field4924 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4925, false); // L: 200
					}
					break label41;
				}
			}

			this.method8631(); // L: 205
		}

		if (var4) { // L: 207
			this.field4928 = var5; // L: 208
			this.field4941 = var1; // L: 209
			this.field4904 = var2; // L: 210
		}

	} // L: 212

	@ObfuscatedName("ac")
	void method8663(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 215
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 216
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 217
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 218
			if (this.mouseCoord != null && var3) { // L: 219
				class212 var8 = AbstractWorldMapData.method5477(); // L: 220
				boolean var9 = Client.staffModLevel >= 2; // L: 223
				if (var9 && var8.method4120(82) && var8.method4120(81)) { // L: 225
					NPC.method2637(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 226
				} else {
					boolean var10 = true; // L: 229
					if (this.field4931) { // L: 230
						int var11 = var1 - this.field4941; // L: 231
						int var12 = var2 - this.field4904; // L: 232
						if (var4 - this.field4928 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 233
							var10 = false; // L: 234
						}
					}

					if (var10) { // L: 237
						PacketBufferNode var13 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 238
						var13.packetBuffer.writeInt(this.mouseCoord.packed()); // L: 239
						Client.packetWriter.addNode(var13); // L: 240
						this.field4928 = 0L; // L: 241
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 246
		}

	} // L: 247

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-12314"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class390.field4441 != null) { // L: 250
			this.zoom = this.zoomTarget; // L: 251
		} else {
			if (this.zoom < this.zoomTarget) { // L: 254
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 255
			}

			if (this.zoom > this.zoomTarget) { // L: 257
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 258
			}

		}
	} // L: 252 260

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 263
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 266
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 267
			if (var1 != 0) { // L: 268
				var1 /= Math.min(8, Math.abs(var1)); // L: 269
			}

			if (var2 != 0) { // L: 271
				var2 /= Math.min(8, Math.abs(var2)); // L: 272
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 274
			if (this.worldMapTargetX == this.centerTileX && this.worldMapTargetY == this.centerTileY) { // L: 275
				this.worldMapTargetX = -1; // L: 276
				this.worldMapTargetY = -1; // L: 277
			}

		}
	} // L: 264 279

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 282
		this.centerTileY = var2; // L: 283
		GameEngine.method661(); // L: 284
		if (var3) {
			this.method8631(); // L: 285
		}

	} // L: 286

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "828394242"
	)
	final void method8631() {
		this.field4927 = -1; // L: 289
		this.field4926 = -1; // L: 290
		this.field4925 = -1; // L: 291
		this.field4924 = -1; // L: 292
	} // L: 293

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-778313072"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 296
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljf;",
		garbageValue = "442093441"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 300

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 308
			}

			var5 = (WorldMapArea)var4.next(); // L: 301
		} while(!var5.containsCoord(var1, var2, var3)); // L: 303

		return var5; // L: 304
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "88"
	)
	public void method8505(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 312
		if (var5 == null) { // L: 313
			if (!var4) { // L: 314
				return; // L: 317
			}

			var5 = this.mainMapArea; // L: 315
		}

		boolean var6 = false; // L: 319
		if (var5 != this.field4905 || var4) { // L: 320
			this.field4905 = var5; // L: 321
			this.setCurrentMapArea(var5); // L: 322
			var6 = true; // L: 323
		}

		if (var6 || var4) { // L: 325
			this.jump(var1, var2, var3); // L: 326
		}

	} // L: 328

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 331
		if (var2 != null) { // L: 332
			this.setCurrentMapArea(var2); // L: 333
		}

	} // L: 335

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2135473352"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 338 339 341
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljf;",
		garbageValue = "122"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 345
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-824827052"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 349
			this.initializeWorldMapManager(var1); // L: 352
			this.jump(-1, -1, -1); // L: 353
		}
	} // L: 350 354

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "1970114808"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 357
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 358
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 359
	} // L: 360

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Lmc;Lmc;ZI)V",
		garbageValue = "137024863"
	)
	public void method8514(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 363
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 366
				this.initializeWorldMapManager(var1); // L: 367
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 369
				this.jump(var2.plane, var2.x, var2.y); // L: 373
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 370
			}

		}
	} // L: 364 375

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 378
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 381
			if (var4 == null) { // L: 382
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 383
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 385
			this.worldMapTargetX = -1; // L: 386
			this.worldMapTargetY = -1; // L: 387
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 388
			this.zoomTarget = this.zoom; // L: 389
			this.field4939 = null; // L: 390
			this.iconIterator = null; // L: 391
			this.worldMapManager.clearIcons(); // L: 392
		}
	} // L: 379 393

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-27"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 396
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 397
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 398
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 399
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 400
		if (var7 < 100) { // L: 401
			this.drawLoading(var1, var2, var3, var4, var7); // L: 402
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 405
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 406
				if (!this.worldMapManager.isLoaded()) { // L: 407
					return; // L: 408
				}
			}

			if (this.flashingElements != null) { // L: 411
				++this.flashCycle; // L: 412
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 413
					this.flashCycle = 0; // L: 414
					++this.flashCount; // L: 415
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 417
					this.flashingElements = null; // L: 418
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 421
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 422
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 423
			boolean var10;
			if (!this.elementsDisabled) { // L: 424
				var10 = false; // L: 425
				if (var5 - this.field4894 > 100) { // L: 426
					this.field4894 = var5; // L: 427
					var10 = true; // L: 428
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4889, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 430
			}

			this.method8518(var1, var2, var3, var4, var8, var9); // L: 432
			var10 = Client.staffModLevel >= 2; // L: 435
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 437
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 438
			this.worldMapDisplayHeight = var9; // L: 439
			this.worldMapDisplayX = var1; // L: 440
			this.worldMapDisplayY = var2; // L: 441
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 442
		}
	} // L: 403 443

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1770915871"
	)
	boolean method8654(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 446
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 447
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 448
				return true;
			} else if (this.field4948 != Client.field649) { // L: 449
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 450
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 451
			} else {
				return true; // L: 452
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "512"
	)
	void method8518(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class390.field4441 != null) { // L: 456
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 457
			int var8 = var3 + 512; // L: 458
			int var9 = var4 + 512; // L: 459
			float var10 = 1.0F; // L: 460
			var8 = (int)((float)var8 / var10); // L: 461
			var9 = (int)((float)var9 / var10); // L: 462
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 463
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 464
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 465
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 466
			if (this.method8654(var8, var9, var13, var14, var3, var4)) { // L: 467
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 468
					Arrays.fill(this.sprite.pixels, 0); // L: 471
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 469
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 472
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 473
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 474
				class390.field4441.method6903(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 475
				this.field4948 = Client.field649; // L: 476
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 477
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 478
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 480
			if (var10 == 1.0F) { // L: 481
				this.sprite.method9610(var13, var14, 192); // L: 482
			} else {
				this.sprite.method9515(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192); // L: 485
			}
		}

	} // L: 488

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1287385022"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 491
			if (!this.worldMapManager.isLoaded()) { // L: 494
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 495
				if (!this.worldMapManager.isLoaded()) { // L: 496
					return; // L: 497
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 500
		}
	} // L: 492 501

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2033911390"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 504
	} // L: 505

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "4"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 508
		int var7 = var3 / 2 + var1; // L: 509
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 510
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 511
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 512
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 513
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 514
	} // L: 515

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "818777880"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 518
			return 1.0F;
		} else if (var1 == 37) { // L: 519
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 520
		} else if (var1 == 75) { // L: 521
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 522 523
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2077099147"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 527
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 528
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 529
			return 50;
		} else if (3.0D == (double)this.zoomTarget) { // L: 530
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 531 532
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 536
	} // L: 537

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-9"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 540
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljf;",
		garbageValue = "-2"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 544

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) { // L: 551
				return null; // L: 552
			}

			var3 = (WorldMapArea)var2.next(); // L: 545
		} while(var3.getId() != var1); // L: 547

		return var3; // L: 548
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-48"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 556
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 559
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 560
		}
	} // L: 557 561

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2049902032"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 564
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 567
			this.worldMapTargetX = -1; // L: 568
			this.worldMapTargetY = -1; // L: 569
		}
	} // L: 565 570

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2060098285"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 573
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 576
			if (var4 != null) { // L: 577
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 578
			}

		}
	} // L: 574 580

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-843499026"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 583
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 586
			if (var4 != null) { // L: 587
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 588
			}

		}
	} // L: 584 590

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "825863248"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 593 594 596
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "388146570"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 600 601 603
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lmc;",
		garbageValue = "1721090019"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 607 608 610
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-866759946"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 614
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1144156363"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 618
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "368918336"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 622
			this.maxFlashCount = var1; // L: 623
		}

	} // L: 625

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 628
	} // L: 629

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-30765"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 632
			this.cyclesPerFlash = var1; // L: 633
		}

	} // L: 635

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1849662360"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 638
	} // L: 639

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "21297146"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 642
	} // L: 643

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1601393714"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 646
		this.flashingElements.add(var1); // L: 647
		this.flashCount = 0; // L: 648
		this.flashCycle = 0; // L: 649
	} // L: 650

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1527059240"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 653
		this.flashCount = 0; // L: 654
		this.flashCycle = 0; // L: 655

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 656
			if (class138.WorldMapElement_get(var2) != null && class138.WorldMapElement_get(var2).category == var1) { // L: 657 660
				this.flashingElements.add(class138.WorldMapElement_get(var2).objectId); // L: 661
			}
		}

	} // L: 664

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2116976270"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 667
	} // L: 668

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1671616581"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 671
	} // L: 672

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "123"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 675
			this.enabledElements.add(var1); // L: 676
		} else {
			this.enabledElements.remove(var1); // L: 679
		}

		this.method8550(); // L: 681
	} // L: 682

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-9"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 685
			this.enabledCategories.add(var1); // L: 686
		} else {
			this.enabledCategories.remove(var1); // L: 689
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 691
			if (class138.WorldMapElement_get(var3) != null && class138.WorldMapElement_get(var3).category == var1) { // L: 692 695
				int var4 = class138.WorldMapElement_get(var3).objectId; // L: 696
				if (!var2) { // L: 697
					this.enabledElementIds.add(var4); // L: 698
				} else {
					this.enabledElementIds.remove(var4); // L: 701
				}
			}
		}

		this.method8550(); // L: 705
	} // L: 706

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-441970496"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 709
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "115"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 713
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-638712237"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 717
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-444126949"
	)
	void method8550() {
		this.field4889.clear(); // L: 721
		this.field4889.addAll(this.enabledElements); // L: 722
		this.field4889.addAll(this.enabledElementIds); // L: 723
	} // L: 724

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2039788697"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 727
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 730
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 731
			List var9 = this.worldMapManager.method5310(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 732
			if (!var9.isEmpty()) { // L: 733
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 736
						return; // L: 752
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 737
					WorldMapElement var12 = class138.WorldMapElement_get(var11.getElement()); // L: 739
					var13 = false; // L: 740

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 741
						if (var12.menuActions[var14] != null) { // L: 742
							class385.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 743
							var13 = true; // L: 744
						}
					}
				} while(!var13); // L: 747

			}
		}
	} // L: 728 734 748

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILmc;I)Lmc;",
		garbageValue = "501302871"
	)
	public Coord method8552(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 755
			return null; // L: 756
		} else if (!this.worldMapManager.isLoaded()) { // L: 758
			return null; // L: 759
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 761
			return null; // L: 762
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 764
			List var4 = (List)var3.get(var1); // L: 765
			if (var4 != null && !var4.isEmpty()) { // L: 766
				AbstractWorldMapIcon var5 = null; // L: 769
				int var6 = -1; // L: 770
				Iterator var7 = var4.iterator(); // L: 771

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 786
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 772
						int var9 = var8.coord2.x - var2.x; // L: 774
						int var10 = var8.coord2.y - var2.y; // L: 775
						var11 = var9 * var9 + var10 * var10; // L: 776
						if (var11 == 0) { // L: 777
							return var8.coord2; // L: 778
						}
					} while(var11 >= var6 && var5 != null); // L: 780

					var5 = var8; // L: 781
					var6 = var11; // L: 782
				}
			} else {
				return null; // L: 767
			}
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IILmc;Lmc;I)V",
		garbageValue = "-634310433"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 790
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 791
		var5.setArgs(new Object[]{var6}); // L: 792
		switch(var1) { // L: 793
		case 1008:
			var5.setType(10); // L: 801
			break; // L: 802
		case 1009:
			var5.setType(11); // L: 811
			break; // L: 812
		case 1010:
			var5.setType(12); // L: 796
			break;
		case 1011:
			var5.setType(13); // L: 816
			break;
		case 1012:
			var5.setType(14); // L: 806
		}

		WorldMapSection1.runScriptEvent(var5); // L: 820
	} // L: 821

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Lkp;",
		garbageValue = "1868927893"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 824
			return null; // L: 825
		} else if (!this.worldMapManager.isLoaded()) { // L: 827
			return null; // L: 828
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 830
			this.field4939 = new LinkedList(); // L: 831
			Iterator var2 = var1.values().iterator(); // L: 832

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 833
				this.field4939.addAll(var3); // L: 835
			}

			this.iconIterator = this.field4939.iterator(); // L: 838
			return this.iconNext(); // L: 839
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Lkp;",
		garbageValue = "-4783763"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 843
			return null; // L: 844
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 846
					return null; // L: 852
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 847
			} while(var1.getElement() == -1); // L: 848

			return var1; // L: 849
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I[B[BI)V",
		garbageValue = "359324490"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3697 == null) { // L: 1205
			if (var2 == null) { // L: 1206
				return; // L: 1212
			}

			var0.field3697 = new byte[11][]; // L: 1207
			var0.field3796 = new byte[11][]; // L: 1208
			var0.field3724 = new int[11]; // L: 1209
			var0.field3725 = new int[11]; // L: 1210
		}

		var0.field3697[var1] = var2; // L: 1214
		if (var2 != null) {
			var0.field3721 = true; // L: 1215
		} else {
			var0.field3721 = false; // L: 1217

			for (int var4 = 0; var4 < var0.field3697.length; ++var4) { // L: 1218
				if (var0.field3697[var4] != null) { // L: 1219
					var0.field3721 = true; // L: 1220
					break;
				}
			}
		}

		var0.field3796[var1] = var3; // L: 1225
	} // L: 1226

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1305820605"
	)
	static final void method8696(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8500
			if (Client.isLowDetail && var0 != HealthBar.Client_plane) { // L: 8501
				return;
			}

			long var8 = 0L; // L: 8502
			boolean var10 = true; // L: 8503
			boolean var11 = false; // L: 8504
			boolean var12 = false; // L: 8505
			if (var1 == 0) { // L: 8506
				var8 = class130.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8507
				var8 = class130.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8508
				var8 = class130.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8509
				var8 = class130.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) { // L: 8510
				var13 = class130.scene.getObjectFlags(var0, var2, var3, var8); // L: 8511
				int var40 = InvDefinition.Entity_unpackID(var8); // L: 8512
				int var41 = var13 & 31; // L: 8513
				int var42 = var13 >> 6 & 3; // L: 8514
				ObjectComposition var14;
				if (var1 == 0) { // L: 8515
					class130.scene.method4639(var0, var2, var3); // L: 8516
					var14 = WorldMapElement.getObjectDefinition(var40); // L: 8517
					if (var14.interactType != 0) { // L: 8518
						Client.collisionMaps[var0].method4153(var2, var3, var41, var42, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8520
					class130.scene.method4543(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8521
					class130.scene.removeGameObject(var0, var2, var3); // L: 8522
					var14 = WorldMapElement.getObjectDefinition(var40); // L: 8523
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8524
						return;
					}

					if (var14.interactType != 0) { // L: 8525
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8527
					class130.scene.method4545(var0, var2, var3); // L: 8528
					var14 = WorldMapElement.getObjectDefinition(var40); // L: 8529
					if (var14.interactType == 1) { // L: 8530
						Client.collisionMaps[var0].method4155(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8533
				var13 = var0; // L: 8534
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8535
					var13 = var0 + 1;
				}

				Scene var43 = class130.scene; // L: 8536
				CollisionMap var15 = Client.collisionMaps[var0]; // L: 8537
				ObjectComposition var16 = WorldMapElement.getObjectDefinition(var4); // L: 8539
				int var17 = var7 >= 0 ? var7 : var16.animationId; // L: 8540
				int var18;
				int var19;
				if (var5 != 1 && var5 != 3) { // L: 8543
					var18 = var16.sizeX; // L: 8548
					var19 = var16.sizeY; // L: 8549
				} else {
					var18 = var16.sizeY; // L: 8544
					var19 = var16.sizeX; // L: 8545
				}

				int var20;
				int var21;
				if (var18 + var2 <= 104) { // L: 8555
					var20 = (var18 >> 1) + var2; // L: 8556
					var21 = var2 + (var18 + 1 >> 1); // L: 8557
				} else {
					var20 = var2; // L: 8560
					var21 = var2 + 1; // L: 8561
				}

				int var22;
				int var23;
				if (var3 + var19 <= 104) { // L: 8563
					var22 = var3 + (var19 >> 1); // L: 8564
					var23 = var3 + (var19 + 1 >> 1); // L: 8565
				} else {
					var22 = var3; // L: 8568
					var23 = var3 + 1; // L: 8569
				}

				int[][] var24 = Tiles.Tiles_heights[var13]; // L: 8571
				int var25 = var24[var21][var22] + var24[var20][var22] + var24[var20][var23] + var24[var21][var23] >> 2; // L: 8572
				int var26 = (var2 << 7) + (var18 << 6); // L: 8573
				int var27 = (var3 << 7) + (var19 << 6); // L: 8574
				long var28 = FontName.calculateTag(var2, var3, 2, var16.int1 == 0, var4); // L: 8575
				int var30 = (var5 << 6) + var6; // L: 8576
				if (var16.int3 == 1) { // L: 8577
					var30 += 256;
				}

				Object var38;
				if (var6 == 22) { // L: 8578
					if (var17 == -1 && var16.transforms == null) { // L: 8580
						var38 = var16.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8581
					}

					var43.newGroundObject(var0, var2, var3, var25, (Renderable)var38, var28, var30); // L: 8582
					if (var16.interactType == 1) { // L: 8583
						var15.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8586
					if (var6 >= 12) { // L: 8594
						if (var17 == -1 && var16.transforms == null) { // L: 8596
							var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8597
						}

						var43.method4535(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8598
						if (var16.interactType != 0) { // L: 8599
							var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
						}
					} else if (var6 == 0) { // L: 8602
						if (var17 == -1 && var16.transforms == null) { // L: 8604
							var38 = var16.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8605
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1042[var5], 0, var28, var30); // L: 8606
						if (var16.interactType != 0) { // L: 8607
							var15.method4148(var2, var3, var6, var5, var16.boolean1);
						}
					} else if (var6 == 1) { // L: 8610
						if (var17 == -1 && var16.transforms == null) { // L: 8612
							var38 = var16.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8613
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1043[var5], 0, var28, var30); // L: 8614
						if (var16.interactType != 0) { // L: 8615
							var15.method4148(var2, var3, var6, var5, var16.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) { // L: 8618
							var31 = var5 + 1 & 3; // L: 8619
							Object var33;
							Object var39;
							if (var17 == -1 && var16.transforms == null) { // L: 8622
								var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27); // L: 8623
								var33 = var16.getModel(2, var31, var24, var26, var25, var27); // L: 8624
							} else {
								var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8627
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8628
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field1042[var5], Tiles.field1042[var31], var28, var30); // L: 8630
							if (var16.interactType != 0) { // L: 8631
								var15.method4148(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 3) { // L: 8634
							if (var17 == -1 && var16.transforms == null) { // L: 8636
								var38 = var16.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8637
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1043[var5], 0, var28, var30); // L: 8638
							if (var16.interactType != 0) { // L: 8639
								var15.method4148(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 9) { // L: 8642
							if (var17 == -1 && var16.transforms == null) { // L: 8644
								var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8645
							}

							var43.method4535(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8646
							if (var16.interactType != 0) { // L: 8647
								var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
							}
						} else if (var6 == 4) { // L: 8650
							if (var17 == -1 && var16.transforms == null) { // L: 8652
								var38 = var16.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8653
							}

							var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1042[var5], 0, 0, 0, var28, var30); // L: 8654
						} else {
							long var32;
							Object var34;
							if (var6 == 5) { // L: 8657
								var31 = 16; // L: 8658
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8659
								if (var32 != 0L) { // L: 8660
									var31 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8662
									var34 = var16.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8663
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1042[var5], 0, var31 * Tiles.field1044[var5], var31 * Tiles.field1045[var5], var28, var30); // L: 8664
							} else if (var6 == 6) { // L: 8667
								var31 = 8; // L: 8668
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8669
								if (var32 != 0L) { // L: 8670
									var31 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8672
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8673
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1051[var5], var31 * Tiles.field1048[var5], var28, var30); // L: 8674
							} else if (var6 == 7) { // L: 8677
								int var37 = var5 + 2 & 3; // L: 8679
								if (var17 == -1 && var16.transforms == null) { // L: 8680
									var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
								} else {
									var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8681
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30); // L: 8682
							} else if (var6 == 8) { // L: 8685
								var31 = 8; // L: 8686
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8687
								if (0L != var32) { // L: 8688
									var31 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3; // L: 8691
								Object var35;
								if (var17 == -1 && var16.transforms == null) { // L: 8692
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27); // L: 8693
									var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27); // L: 8694
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8697
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8698
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1051[var5], var31 * Tiles.field1048[var5], var28, var30); // L: 8700
							}
						}
					}
				} else {
					if (var17 == -1 && var16.transforms == null) { // L: 8588
						var38 = var16.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8589
					}

					if (var38 != null) { // L: 8590
						var43.method4535(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var16.interactType != 0) { // L: 8591
						var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
					}
				}
			}
		}

	} // L: 8705
}
