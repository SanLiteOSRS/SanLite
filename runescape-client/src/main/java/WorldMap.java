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

@ObfuscatedName("sq")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ax")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("au")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	WorldMapArea field4887;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -644616583
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1760412517
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1191756433
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2090273235
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("al")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bd")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -370033655
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 661123875
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1151782823
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1041995183
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1954177893
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1198442767
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bv")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bq")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1042774107
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1603375427
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1066812839
	)
	int field4899;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 112051835
	)
	int field4901;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1656218439
	)
	int field4922;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -257574923
	)
	int field4923;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = -8299193308012412741L
	)
	long field4924;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1875380277
	)
	int field4925;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -526708521
	)
	int field4915;
	@ObfuscatedName("bx")
	boolean field4937;
	@ObfuscatedName("bl")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bt")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("by")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bg")
	HashSet field4931;
	@ObfuscatedName("bj")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 281599667
	)
	int field4933;
	@ObfuscatedName("cz")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cb")
	List field4935;
	@ObfuscatedName("cs")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cj")
	HashSet field4907;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cw")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -979786125
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1311334497
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -608769943
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1070722367
	)
	int field4944;

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
		this.flashCycle = -1;
		this.field4899 = -1;
		this.field4901 = -1;
		this.field4922 = -1; // L: 77
		this.field4923 = -1; // L: 78
		this.field4937 = true;
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field4931 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field4933 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field4907 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.showCoord = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field4944 = -1; // L: 102
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;Lnd;Lpc;Ljava/util/HashMap;[Luu;I)V",
		garbageValue = "-1050451125"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3050.name); // L: 116
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
		this.field4887 = null; // L: 130
	} // L: 131

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	public void method8531() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-452264165"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method5369(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); GrandExchangeOfferOwnWorldComparator.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field4907.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field4907.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						GrandExchangeOfferOwnWorldComparator.runScriptEvent(var14); // L: 176
					}
				}

				this.field4907 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIZZS)V",
		garbageValue = "10233"
	)
	public void method8533(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = class113.method2835(); // L: 184
			this.method8534(var1, var2, var4, var5); // L: 185
			if (!this.hasTarget() && (var4 || var3)) { // L: 187
				boolean var7 = Client.clickedWidget != null; // L: 190
				if (!var7) { // L: 192
					if (var4) { // L: 193
						this.field4922 = var1; // L: 194
						this.field4923 = var2; // L: 195
						this.field4899 = this.centerTileX; // L: 196
						this.field4901 = this.centerTileY; // L: 197
					}

					if (this.field4899 != -1) { // L: 199
						int var8 = var1 - this.field4922; // L: 200
						int var9 = var2 - this.field4923; // L: 201
						this.setWorldMapPosition(this.field4899 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4901, false); // L: 202
					}
					break label41;
				}
			}

			this.method8538(); // L: 207
		}

		if (var4) { // L: 209
			this.field4924 = var5; // L: 210
			this.field4925 = var1; // L: 211
			this.field4915 = var2; // L: 212
		}

	} // L: 214

	@ObfuscatedName("as")
	void method8534(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 217
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 218
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 219
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 220
			if (this.mouseCoord != null && var3) { // L: 221
				class213 var8 = SceneTilePaint.method4952(); // L: 222
				int var10;
				int var11;
				if (class158.method3322() && var8.method4151(82) && var8.method4151(81)) { // L: 223
					int var14 = this.mouseCoord.x; // L: 224
					var10 = this.mouseCoord.y; // L: 225
					var11 = this.mouseCoord.plane; // L: 226
					PacketBufferNode var12 = class503.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 229
					var12.packetBuffer.method9138(0); // L: 230
					var12.packetBuffer.writeIntME(var14); // L: 231
					var12.packetBuffer.method9188(var11); // L: 232
					var12.packetBuffer.method9126(var10); // L: 233
					Client.packetWriter.addNode(var12); // L: 234
				} else {
					boolean var9 = true; // L: 238
					if (this.field4937) { // L: 239
						var10 = var1 - this.field4925; // L: 240
						var11 = var2 - this.field4915; // L: 241
						if (var4 - this.field4924 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 242
							var9 = false; // L: 243
						}
					}

					if (var9) { // L: 246
						PacketBufferNode var13 = class503.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 247
						var13.packetBuffer.method9139(this.mouseCoord.packed()); // L: 248
						Client.packetWriter.addNode(var13); // L: 249
						this.field4924 = 0L; // L: 250
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 255
		}

	} // L: 256

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "636317718"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (UserComparator7.field1455 != null) { // L: 259
			this.zoom = this.zoomTarget; // L: 260
		} else {
			if (this.zoom < this.zoomTarget) { // L: 263
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 264
			}

			if (this.zoom > this.zoomTarget) { // L: 266
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 267
			}

		}
	} // L: 261 269

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-2527"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 272
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 275
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 276
			if (var1 != 0) { // L: 277
				var1 /= Math.min(8, Math.abs(var1)); // L: 278
			}

			if (var2 != 0) { // L: 280
				var2 /= Math.min(8, Math.abs(var2)); // L: 281
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 283
			if (this.worldMapTargetX == this.centerTileX && this.worldMapTargetY == this.centerTileY) { // L: 284
				this.worldMapTargetX = -1; // L: 285
				this.worldMapTargetY = -1; // L: 286
			}

		}
	} // L: 273 288

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1787840553"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 291
		this.centerTileY = var2; // L: 292
		class113.method2835(); // L: 293
		if (var3) {
			this.method8538(); // L: 294
		}

	} // L: 295

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	final void method8538() {
		this.field4923 = -1; // L: 298
		this.field4922 = -1; // L: 299
		this.field4901 = -1; // L: 300
		this.field4899 = -1; // L: 301
	} // L: 302

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-11"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 305
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ljs;",
		garbageValue = "8"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 309

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 317
			}

			var5 = (WorldMapArea)var4.next(); // L: 310
		} while(!var5.containsCoord(var1, var2, var3)); // L: 312

		return var5; // L: 313
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1991480722"
	)
	public void method8541(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 321
		if (var5 == null) { // L: 322
			if (!var4) { // L: 323
				return; // L: 326
			}

			var5 = this.mainMapArea; // L: 324
		}

		boolean var6 = false; // L: 328
		if (var5 != this.field4887 || var4) { // L: 329
			this.field4887 = var5; // L: 330
			this.setCurrentMapArea(var5); // L: 331
			var6 = true; // L: 332
		}

		if (var6 || var4) { // L: 334
			this.jump(var1, var2, var3); // L: 335
		}

	} // L: 337

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "795116875"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 340
		if (var2 != null) { // L: 341
			this.setCurrentMapArea(var2); // L: 342
		}

	} // L: 344

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1338800765"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 347 348 350
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljs;",
		garbageValue = "-9922858"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 354
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "1656071073"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 358
			this.initializeWorldMapManager(var1); // L: 361
			this.jump(-1, -1, -1); // L: 362
		}
	} // L: 359 363

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "1127606129"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 366
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 367
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 368
	} // L: 369

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljs;Lmr;Lmr;ZB)V",
		garbageValue = "-74"
	)
	public void method8658(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 372
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 375
				this.initializeWorldMapManager(var1); // L: 376
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 378
				this.jump(var2.plane, var2.x, var2.y); // L: 382
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 379
			}

		}
	} // L: 373 384

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1717944144"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 387
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 390
			if (var4 == null) { // L: 391
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 392
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 394
			this.worldMapTargetX = -1; // L: 395
			this.worldMapTargetY = -1; // L: 396
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 397
			this.zoomTarget = this.zoom; // L: 398
			this.field4935 = null; // L: 399
			this.iconIterator = null; // L: 400
			this.worldMapManager.clearIcons(); // L: 401
		}
	} // L: 388 402

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1021505883"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 405
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 406
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 407
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 408
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 409
		if (var7 < 100) { // L: 410
			this.drawLoading(var1, var2, var3, var4, var7); // L: 411
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 414
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 415
				if (!this.worldMapManager.isLoaded()) { // L: 416
					return; // L: 417
				}
			}

			if (this.flashingElements != null) { // L: 420
				++this.flashCycle; // L: 421
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 422
					this.flashCycle = 0; // L: 423
					++this.flashCount; // L: 424
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 426
					this.flashingElements = null; // L: 427
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 430
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 431
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 432
			if (!this.elementsDisabled) { // L: 433
				boolean var10 = false; // L: 434
				if (var5 - this.field4933 > 100) { // L: 435
					this.field4933 = var5; // L: 436
					var10 = true; // L: 437
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4931, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 439
			}

			this.method8606(var1, var2, var3, var4, var8, var9); // L: 441
			if (class158.method3322() && this.showCoord && this.mouseCoord != null) { // L: 442
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 443
			this.worldMapDisplayHeight = var9; // L: 444
			this.worldMapDisplayX = var1; // L: 445
			this.worldMapDisplayY = var2; // L: 446
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 447
		}
	} // L: 412 448

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-2144848523"
	)
	boolean method8550(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 451
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 452
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 453
				return true;
			} else if (this.field4944 != Client.field792) { // L: 454
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 455
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 456
			} else {
				return true; // L: 457
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1743359113"
	)
	void method8606(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (UserComparator7.field1455 != null) { // L: 461
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 462
			int var8 = var3 + 512; // L: 463
			int var9 = var4 + 512; // L: 464
			float var10 = 1.0F; // L: 465
			var8 = (int)((float)var8 / var10); // L: 466
			var9 = (int)((float)var9 / var10); // L: 467
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 468
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 469
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 470
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 471
			if (this.method8550(var8, var9, var13, var14, var3, var4)) { // L: 472
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 473
					Arrays.fill(this.sprite.pixels, 0); // L: 476
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 474
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 477
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 478
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 479
				UserComparator7.field1455.method6967(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 480
				this.field4944 = Client.field792; // L: 481
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 482
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 483
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 485
			if (var10 == 1.0F) { // L: 486
				this.sprite.method9553(var13, var14, 192); // L: 487
			} else {
				this.sprite.method9672(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192); // L: 490
			}
		}

	} // L: 493

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1644929634"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 496
			if (!this.worldMapManager.isLoaded()) { // L: 499
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 500
				if (!this.worldMapManager.isLoaded()) { // L: 501
					return; // L: 502
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 505
		}
	} // L: 497 506

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1428442334"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 509
	} // L: 510

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-13"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 513
		int var7 = var3 / 2 + var1; // L: 514
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 515
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 516
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 517
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 518
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 519
	} // L: 520

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "235261607"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 523
			return 1.0F;
		} else if (var1 == 37) { // L: 524
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 525
		} else if (var1 == 75) { // L: 526
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 527 528
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1760344192"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) { // L: 532
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 533
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 534
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) { // L: 535
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 536 537
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4429"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 541
	} // L: 542

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 545
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)Ljs;",
		garbageValue = "-677998757"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 549

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 557
			}

			var3 = (WorldMapArea)var2.next(); // L: 550
		} while(var3.getId() != var1); // L: 552

		return var3; // L: 553
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 561
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 564
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 565
		}
	} // L: 562 566

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2050238957"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 569
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 572
			this.worldMapTargetX = -1; // L: 573
			this.worldMapTargetY = -1; // L: 574
		}
	} // L: 570 575

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "113"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 578
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 581
			if (var4 != null) { // L: 582
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 583
			}

		}
	} // L: 579 585

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-149555116"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 588
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 591
			if (var4 != null) { // L: 592
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 593
			}

		}
	} // L: 589 595

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1246259080"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 598 599 601
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1454089016"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 605 606 608
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "1323166356"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 612 613 615
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2052030046"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 619
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-640816926"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 623
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 627
			this.maxFlashCount = var1; // L: 628
		}

	} // L: 630

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-714878739"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 633
	} // L: 634

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1573369033"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 637
			this.cyclesPerFlash = var1; // L: 638
		}

	} // L: 640

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 643
	} // L: 644

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 647
	} // L: 648

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1425125593"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 651
		this.flashingElements.add(var1); // L: 652
		this.flashCount = 0; // L: 653
		this.flashCycle = 0; // L: 654
	} // L: 655

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 658
		this.flashCount = 0; // L: 659
		this.flashCycle = 0; // L: 660

		for (int var2 = 0; var2 < Decimator.WorldMapElement_count; ++var2) { // L: 661
			if (SequenceDefinition.WorldMapElement_get(var2) != null && SequenceDefinition.WorldMapElement_get(var2).category == var1) { // L: 662 665
				this.flashingElements.add(SequenceDefinition.WorldMapElement_get(var2).objectId); // L: 666
			}
		}

	} // L: 669

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1166571432"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 672
	} // L: 673

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-164706283"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 676
	} // L: 677

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "4"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 680
			this.enabledElements.add(var1); // L: 681
		} else {
			this.enabledElements.remove(var1); // L: 684
		}

		this.method8583(); // L: 686
	} // L: 687

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-1"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 690
			this.enabledCategories.add(var1); // L: 691
		} else {
			this.enabledCategories.remove(var1); // L: 694
		}

		for (int var3 = 0; var3 < Decimator.WorldMapElement_count; ++var3) { // L: 696
			if (SequenceDefinition.WorldMapElement_get(var3) != null && SequenceDefinition.WorldMapElement_get(var3).category == var1) { // L: 697 700
				int var4 = SequenceDefinition.WorldMapElement_get(var3).objectId; // L: 701
				if (!var2) { // L: 702
					this.enabledElementIds.add(var4); // L: 703
				} else {
					this.enabledElementIds.remove(var4); // L: 706
				}
			}
		}

		this.method8583(); // L: 710
	} // L: 711

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2113017491"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 714
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1784383589"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 718
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1533983317"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 722
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	void method8583() {
		this.field4931.clear(); // L: 726
		this.field4931.addAll(this.enabledElements); // L: 727
		this.field4931.addAll(this.enabledElementIds); // L: 728
	} // L: 729

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1942190894"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 732
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 735
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 736
			List var9 = this.worldMapManager.method5369(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 737
			if (!var9.isEmpty()) { // L: 738
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 741
						return; // L: 757
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 742
					WorldMapElement var12 = SequenceDefinition.WorldMapElement_get(var11.getElement()); // L: 744
					var13 = false; // L: 745

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 746
						if (var12.menuActions[var14] != null) { // L: 747
							JagexCache.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 748
							var13 = true; // L: 749
						}
					}
				} while(!var13); // L: 752

			}
		}
	} // L: 733 739 753

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILmr;B)Lmr;",
		garbageValue = "1"
	)
	public Coord method8585(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 760
			return null; // L: 761
		} else if (!this.worldMapManager.isLoaded()) { // L: 763
			return null; // L: 764
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 766
			return null; // L: 767
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 769
			List var4 = (List)var3.get(var1); // L: 770
			if (var4 != null && !var4.isEmpty()) { // L: 771
				AbstractWorldMapIcon var5 = null; // L: 774
				int var6 = -1; // L: 775
				Iterator var7 = var4.iterator(); // L: 776

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 791
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 777
						int var9 = var8.coord2.x - var2.x; // L: 779
						int var10 = var8.coord2.y - var2.y; // L: 780
						var11 = var10 * var10 + var9 * var9; // L: 781
						if (var11 == 0) { // L: 782
							return var8.coord2; // L: 783
						}
					} while(var11 >= var6 && var5 != null); // L: 785

					var5 = var8; // L: 786
					var6 = var11; // L: 787
				}
			} else {
				return null; // L: 772
			}
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IILmr;Lmr;B)V",
		garbageValue = "123"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 795
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 796
		var5.setArgs(new Object[]{var6}); // L: 797
		switch(var1) { // L: 798
		case 1008:
			var5.setType(10); // L: 801
			break;
		case 1009:
			var5.setType(11); // L: 811
			break; // L: 812
		case 1010:
			var5.setType(12); // L: 821
			break;
		case 1011:
			var5.setType(13); // L: 806
			break;
		case 1012:
			var5.setType(14); // L: 816
		}

		GrandExchangeOfferOwnWorldComparator.runScriptEvent(var5); // L: 825
	} // L: 826

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(S)Lkv;",
		garbageValue = "-27920"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 829
			return null; // L: 830
		} else if (!this.worldMapManager.isLoaded()) { // L: 832
			return null; // L: 833
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 835
			this.field4935 = new LinkedList(); // L: 836
			Iterator var2 = var1.values().iterator(); // L: 837

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 838
				this.field4935.addAll(var3); // L: 840
			}

			this.iconIterator = this.field4935.iterator(); // L: 843
			return this.iconNext(); // L: 844
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Lkv;",
		garbageValue = "1531693993"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 848
			return null; // L: 849
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 851
					return null; // L: 857
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 852
			} while(var1.getElement() == -1); // L: 853

			return var1; // L: 854
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IIB)Lud;",
		garbageValue = "0"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 74
		boolean var3;
		if (var4 == null) { // L: 75
			var3 = false; // L: 76
		} else {
			VarbitComposition.SpriteBuffer_decode(var4); // L: 79
			var3 = true; // L: 80
		}

		return !var3 ? null : FileSystem.method3536(); // L: 82 83
	}
}
