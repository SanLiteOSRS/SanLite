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

@ObfuscatedName("ot")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("g")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("b")
	@Export("details")
	HashMap details;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	WorldMapArea field4531;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1694384091
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1229026359
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 898724743
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -584578117
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("m")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ag")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 359704523
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -571346471
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 510585019
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1760632627
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1434795047
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1463646883
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("al")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ah")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1061769207
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1540168415
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 552419099
	)
	int field4565;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1985016597
	)
	int field4566;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1685784499
	)
	int field4534;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -590461729
	)
	int field4568;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -6310489792825093595L
	)
	long field4554;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1115693569
	)
	int field4570;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1844903131
	)
	int field4539;
	@ObfuscatedName("av")
	boolean field4572;
	@ObfuscatedName("ak")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ao")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("am")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ad")
	HashSet field4586;
	@ObfuscatedName("az")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1844713117
	)
	int field4578;
	@ObfuscatedName("bg")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bv")
	List field4579;
	@ObfuscatedName("ba")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bd")
	HashSet field4582;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bu")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1874279973
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1416349091
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1490585961
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -992280851
	)
	int field4580;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11; // L: 46
		fontNameVerdana13 = FontName.FontName_verdana13; // L: 47
		fontNameVerdana15 = FontName.FontName_verdana15; // L: 48
	}

	public WorldMap() {
		this.worldMapTargetX = -1; // L: 60
		this.worldMapTargetY = -1; // L: 61
		this.worldMapDisplayWidth = -1; // L: 64
		this.worldMapDisplayHeight = -1; // L: 65
		this.worldMapDisplayX = -1; // L: 66
		this.worldMapDisplayY = -1; // L: 67
		this.maxFlashCount = 3; // L: 68
		this.cyclesPerFlash = 50; // L: 69
		this.perpetualFlash = false; // L: 70
		this.flashingElements = null; // L: 71
		this.flashCount = -1; // L: 72
		this.flashCycle = -1; // L: 73
		this.field4565 = -1; // L: 74
		this.field4566 = -1; // L: 75
		this.field4534 = -1; // L: 76
		this.field4568 = -1; // L: 77
		this.field4572 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4586 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4578 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4582 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4580 = -1; // L: 101
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;Llc;Lmx;Ljava/util/HashMap;[Lql;I)V",
		garbageValue = "-87405813"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 105
		this.WorldMap_archive = var1; // L: 106
		this.WorldMap_geographyArchive = var2; // L: 107
		this.WorldMap_groundArchive = var3; // L: 108
		this.font = var4; // L: 109
		this.fonts = new HashMap(); // L: 110
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 111
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 113
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 114
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2867.name); // L: 115
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 116
		this.details = new HashMap(var8.length); // L: 117

		for (int var9 = 0; var9 < var8.length; ++var9) { // L: 118
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9])); // L: 119
			WorldMapArea var11 = new WorldMapArea(); // L: 120
			var11.read(var10, var8[var9]); // L: 121
			this.details.put(var11.getInternalName(), var11); // L: 122
			if (var11.getIsMain()) { // L: 123
				this.mainMapArea = var11; // L: 124
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 127
		this.field4531 = null; // L: 128
	} // L: 129

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1264546325"
	)
	public void method7224() {
		class220.method4530(); // L: 132
	} // L: 133

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-1001565013"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 136
			this.smoothZoom(); // L: 139
			this.scrollToTarget(); // L: 140
			if (var3) { // L: 141
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 144
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 145
				List var10 = this.worldMapManager.method4792(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 146
				HashSet var11 = new HashSet(); // L: 147

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class17.runScriptEvent(var14)) { // L: 148 161
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 149
					var11.add(var13); // L: 151
					var14 = new ScriptEvent(); // L: 152
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 153
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 154
					if (this.field4582.contains(var13)) { // L: 155
						var14.setType(17); // L: 156
					} else {
						var14.setType(15); // L: 159
					}
				}

				var12 = this.field4582.iterator(); // L: 164

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 165
					if (!var11.contains(var13)) { // L: 167
						var14 = new ScriptEvent(); // L: 168
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 169
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 170
						var14.setType(16); // L: 171
						class17.runScriptEvent(var14); // L: 172
					}
				}

				this.field4582 = var11; // L: 176
			}
		}
	} // L: 137 142 177

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1479777365"
	)
	public void method7226(int var1, int var2, boolean var3, boolean var4) {
		long var5 = class131.method2916(); // L: 180
		this.method7370(var1, var2, var4, var5); // L: 181
		if (!this.hasTarget() && (var4 || var3) && !class12.method161()) { // L: 182
			if (var4) { // L: 183
				this.field4534 = var1; // L: 184
				this.field4568 = var2; // L: 185
				this.field4565 = this.centerTileX; // L: 186
				this.field4566 = this.centerTileY; // L: 187
			}

			if (this.field4565 != -1) { // L: 189
				int var7 = var1 - this.field4534; // L: 190
				int var8 = var2 - this.field4568; // L: 191
				this.setWorldMapPosition(this.field4565 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4566, false); // L: 192
			}
		} else {
			this.method7234(); // L: 196
		}

		if (var4) { // L: 198
			this.field4554 = var5; // L: 199
			this.field4570 = var1; // L: 200
			this.field4539 = var2; // L: 201
		}

	} // L: 203

	@ObfuscatedName("c")
	void method7370(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 206
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 207
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 208
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 209
			if (this.mouseCoord != null && var3) { // L: 210
				boolean var8 = Client.staffModLevel >= 2; // L: 213
				int var10;
				int var11;
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 215
					int var14 = this.mouseCoord.x; // L: 216
					var10 = this.mouseCoord.y; // L: 217
					var11 = this.mouseCoord.plane; // L: 218
					PacketBufferNode var12 = class433.getPacketBufferNode(ClientPacket.field3016, Client.packetWriter.isaacCipher); // L: 221
					var12.packetBuffer.method7762(var11); // L: 222
					var12.packetBuffer.method7784(0); // L: 223
					var12.packetBuffer.writeIntME(var10); // L: 224
					var12.packetBuffer.writeIntME(var14); // L: 225
					Client.packetWriter.addNode(var12); // L: 226
				} else {
					boolean var9 = true; // L: 230
					if (this.field4572) { // L: 231
						var10 = var1 - this.field4570; // L: 232
						var11 = var2 - this.field4539; // L: 233
						if (var4 - this.field4554 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 234
							var9 = false; // L: 235
						}
					}

					if (var9) { // L: 238
						PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher); // L: 239
						var13.packetBuffer.method7784(this.mouseCoord.packed()); // L: 240
						Client.packetWriter.addNode(var13); // L: 241
						this.field4554 = 0L; // L: 242
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 247
		}

	} // L: 248

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class302.field3596 != null) { // L: 251
			this.zoom = this.zoomTarget; // L: 252
		} else {
			if (this.zoom < this.zoomTarget) { // L: 255
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 256
			}

			if (this.zoom > this.zoomTarget) { // L: 258
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 259
			}

		}
	} // L: 253 261

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-8335304"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 264
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 267
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 268
			if (var1 != 0) { // L: 269
				var1 /= Math.min(8, Math.abs(var1)); // L: 270
			}

			if (var2 != 0) { // L: 272
				var2 /= Math.min(8, Math.abs(var2)); // L: 273
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 275
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 276
				this.worldMapTargetX = -1; // L: 277
				this.worldMapTargetY = -1; // L: 278
			}

		}
	} // L: 265 280

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "1"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 283
		this.centerTileY = var2; // L: 284
		class131.method2916(); // L: 285
		if (var3) {
			this.method7234(); // L: 286
		}

	} // L: 287

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1328264783"
	)
	final void method7234() {
		this.field4568 = -1; // L: 290
		this.field4534 = -1; // L: 291
		this.field4566 = -1; // L: 292
		this.field4565 = -1; // L: 293
	} // L: 294

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 297
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lhw;",
		garbageValue = "29"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 301

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 309
			}

			var5 = (WorldMapArea)var4.next(); // L: 302
		} while(!var5.containsCoord(var1, var2, var3)); // L: 304

		return var5; // L: 305
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "484185553"
	)
	public void method7249(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 313
		if (var5 == null) { // L: 314
			if (!var4) { // L: 315
				return; // L: 318
			}

			var5 = this.mainMapArea; // L: 316
		}

		boolean var6 = false; // L: 320
		if (var5 != this.field4531 || var4) { // L: 321
			this.field4531 = var5; // L: 322
			this.setCurrentMapArea(var5); // L: 323
			var6 = true; // L: 324
		}

		if (var6 || var4) { // L: 326
			this.jump(var1, var2, var3); // L: 327
		}

	} // L: 329

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-648424484"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 332
		if (var2 != null) { // L: 333
			this.setCurrentMapArea(var2); // L: 334
		}

	} // L: 336

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "28337312"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 339 340 342
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "1919783972"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 346
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)V",
		garbageValue = "1491091934"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 350
			this.initializeWorldMapManager(var1); // L: 353
			this.jump(-1, -1, -1); // L: 354
		}
	} // L: 351 355

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhw;S)V",
		garbageValue = "-5527"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 358
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 359
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 360
	} // L: 361

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lhw;Lkp;Lkp;ZI)V",
		garbageValue = "161039961"
	)
	public void method7240(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 364
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 367
				this.initializeWorldMapManager(var1); // L: 368
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 370
				this.jump(var2.plane, var2.x, var2.y); // L: 374
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 371
			}

		}
	} // L: 365 376

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-5765"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 379
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 382
			if (var4 == null) { // L: 383
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 384
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 386
			this.worldMapTargetX = -1; // L: 387
			this.worldMapTargetY = -1; // L: 388
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 389
			this.zoomTarget = this.zoom; // L: 390
			this.field4579 = null; // L: 391
			this.iconIterator = null; // L: 392
			this.worldMapManager.clearIcons(); // L: 393
		}
	} // L: 380 394

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-14"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 397
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 398
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 399
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 400
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 401
		if (var7 < 100) { // L: 402
			this.drawLoading(var1, var2, var3, var4, var7); // L: 403
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 406
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 407
				if (!this.worldMapManager.isLoaded()) { // L: 408
					return; // L: 409
				}
			}

			if (this.flashingElements != null) { // L: 412
				++this.flashCycle; // L: 413
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 414
					this.flashCycle = 0; // L: 415
					++this.flashCount; // L: 416
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 418
					this.flashingElements = null; // L: 419
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 422
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 423
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 424
			boolean var10;
			if (!this.elementsDisabled) { // L: 425
				var10 = false; // L: 426
				if (var5 - this.field4578 > 100) { // L: 427
					this.field4578 = var5; // L: 428
					var10 = true; // L: 429
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4586, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 431
			}

			this.method7244(var1, var2, var3, var4, var8, var9); // L: 433
			var10 = Client.staffModLevel >= 2; // L: 436
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 438
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 439
			this.worldMapDisplayHeight = var9; // L: 440
			this.worldMapDisplayX = var1; // L: 441
			this.worldMapDisplayY = var2; // L: 442
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 443
		}
	} // L: 404 444

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-1748947282"
	)
	boolean method7272(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 447
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 448
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 449
				return true;
			} else if (this.field4580 != Client.field773) {
				return true; // L: 450
			} else if (var3 <= 0 && var4 <= 0) { // L: 451
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 452
			} else {
				return true; // L: 453
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-449769333"
	)
	void method7244(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class302.field3596 != null) { // L: 457
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 458
			int var8 = var3 + 512; // L: 459
			int var9 = var4 + 512; // L: 460
			float var10 = 1.0F; // L: 461
			var8 = (int)((float)var8 / var10); // L: 462
			var9 = (int)((float)var9 / var10); // L: 463
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 464
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 465
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 466
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 467
			if (this.method7272(var8, var9, var13, var14, var3, var4)) { // L: 468
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 469
					Arrays.fill(this.sprite.pixels, 0); // L: 472
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 470
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 473
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 474
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 475
				class302.field3596.method6060(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 476
				this.field4580 = Client.field773; // L: 477
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 478
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 479
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 481
			if (1.0F == var10) { // L: 482
				this.sprite.method8190(var13, var14, 192); // L: 483
			} else {
				this.sprite.method8186(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 486
			}
		}

	} // L: 489

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1227453797"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 492
			if (!this.worldMapManager.isLoaded()) { // L: 495
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 496
				if (!this.worldMapManager.isLoaded()) { // L: 497
					return; // L: 498
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 501
		}
	} // L: 493 502

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1833668268"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 505
	} // L: 506

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1372588137"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 509
		int var7 = var3 / 2 + var1; // L: 510
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 511
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 512
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 513
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 514
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 515
	} // L: 516

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "22"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 519
			return 1.0F;
		} else if (var1 == 37) { // L: 520
			return 1.5F;
		} else if (var1 == 50) { // L: 521
			return 2.0F;
		} else if (var1 == 75) { // L: 522
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 523 524
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1030134106"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 528
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) { // L: 529
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 530
			return 50;
		} else if (3.0D == (double)this.zoomTarget) { // L: 531
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 532 533
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1932355157"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 537
	} // L: 538

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1823664508"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 541
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhw;",
		garbageValue = "7"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 545

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 553
			}

			var3 = (WorldMapArea)var2.next(); // L: 546
		} while(var3.getId() != var1); // L: 548

		return var3; // L: 549
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1119306986"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 557
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 560
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 561
		}
	} // L: 558 562

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1657580962"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 565
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 568
			this.worldMapTargetX = -1; // L: 569
			this.worldMapTargetY = -1; // L: 570
		}
	} // L: 566 571

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-180026302"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 574
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 577
			if (var4 != null) { // L: 578
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 579
			}

		}
	} // L: 575 581

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1596595994"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 584
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 587
			if (var4 != null) { // L: 588
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 589
			}

		}
	} // L: 585 591

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1960141359"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 594 595 597
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 601 602 604
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lkp;",
		garbageValue = "-1788194441"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 608 609 611
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1219695958"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 615
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 619
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1223854841"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 623
			this.maxFlashCount = var1; // L: 624
		}

	} // L: 626

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1976490769"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 629
	} // L: 630

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1175720419"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 633
			this.cyclesPerFlash = var1; // L: 634
		}

	} // L: 636

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "627725443"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 639
	} // L: 640

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 643
	} // L: 644

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 647
		this.flashingElements.add(var1); // L: 648
		this.flashCount = 0; // L: 649
		this.flashCycle = 0; // L: 650
	} // L: 651

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "499170237"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 654
		this.flashCount = 0; // L: 655
		this.flashCycle = 0; // L: 656

		for (int var2 = 0; var2 < class432.WorldMapElement_count; ++var2) { // L: 657
			if (TileItem.WorldMapElement_get(var2) != null && TileItem.WorldMapElement_get(var2).category == var1) { // L: 658 661
				this.flashingElements.add(TileItem.WorldMapElement_get(var2).objectId); // L: 662
			}
		}

	} // L: 665

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1524902142"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 668
	} // L: 669

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2103791969"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 672
	} // L: 673

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1551269934"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 676
			this.enabledElements.add(var1); // L: 677
		} else {
			this.enabledElements.remove(var1); // L: 680
		}

		this.method7276(); // L: 682
	} // L: 683

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-886954783"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 686
			this.enabledCategories.add(var1); // L: 687
		} else {
			this.enabledCategories.remove(var1); // L: 690
		}

		for (int var3 = 0; var3 < class432.WorldMapElement_count; ++var3) { // L: 692
			if (TileItem.WorldMapElement_get(var3) != null && TileItem.WorldMapElement_get(var3).category == var1) { // L: 693 696
				int var4 = TileItem.WorldMapElement_get(var3).objectId; // L: 697
				if (!var2) { // L: 698
					this.enabledElementIds.add(var4); // L: 699
				} else {
					this.enabledElementIds.remove(var4); // L: 702
				}
			}
		}

		this.method7276(); // L: 706
	} // L: 707

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1991582401"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 710
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 714
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "414249162"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 718
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2082028521"
	)
	void method7276() {
		this.field4586.clear(); // L: 722
		this.field4586.addAll(this.enabledElements); // L: 723
		this.field4586.addAll(this.enabledElementIds); // L: 724
	} // L: 725

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "739278024"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 728
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 731
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 732
			List var9 = this.worldMapManager.method4792(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 733
			if (!var9.isEmpty()) { // L: 734
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 737
						return; // L: 753
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 738
					WorldMapElement var12 = TileItem.WorldMapElement_get(var11.getElement()); // L: 740
					var13 = false; // L: 741

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 742
						if (var12.menuActions[var14] != null) { // L: 743
							StructComposition.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 744
							var13 = true; // L: 745
						}
					}
				} while(!var13); // L: 748

			}
		}
	} // L: 729 735 749

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILkp;I)Lkp;",
		garbageValue = "359130043"
	)
	public Coord method7278(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 756
			return null; // L: 757
		} else if (!this.worldMapManager.isLoaded()) { // L: 759
			return null; // L: 760
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 762
			return null; // L: 763
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 765
			List var4 = (List)var3.get(var1); // L: 766
			if (var4 != null && !var4.isEmpty()) { // L: 767
				AbstractWorldMapIcon var5 = null; // L: 770
				int var6 = -1; // L: 771
				Iterator var7 = var4.iterator(); // L: 772

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 787
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 773
						int var9 = var8.coord2.x - var2.x; // L: 775
						int var10 = var8.coord2.y - var2.y; // L: 776
						var11 = var10 * var10 + var9 * var9; // L: 777
						if (var11 == 0) { // L: 778
							return var8.coord2; // L: 779
						}
					} while(var11 >= var6 && var5 != null); // L: 781

					var5 = var8; // L: 782
					var6 = var11; // L: 783
				}
			} else {
				return null; // L: 768
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IILkp;Lkp;I)V",
		garbageValue = "1555999811"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 791
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 792
		var5.setArgs(new Object[]{var6}); // L: 793
		switch(var1) { // L: 794
		case 1008:
			var5.setType(10); // L: 797
			break;
		case 1009:
			var5.setType(11); // L: 817
			break;
		case 1010:
			var5.setType(12); // L: 812
			break; // L: 813
		case 1011:
			var5.setType(13); // L: 807
			break; // L: 808
		case 1012:
			var5.setType(14); // L: 802
		}

		class17.runScriptEvent(var5); // L: 821
	} // L: 822

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)Lir;",
		garbageValue = "-5"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 825
			return null; // L: 826
		} else if (!this.worldMapManager.isLoaded()) { // L: 828
			return null; // L: 829
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 831
			this.field4579 = new LinkedList(); // L: 832
			Iterator var2 = var1.values().iterator(); // L: 833

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 834
				this.field4579.addAll(var3); // L: 836
			}

			this.iconIterator = this.field4579.iterator(); // L: 839
			return this.iconNext(); // L: 840
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)Lir;",
		garbageValue = "-108"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 844
			return null; // L: 845
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 847
					return null; // L: 853
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 848
			} while(var1.getElement() == -1); // L: 849

			return var1; // L: 850
		}
	}
}
