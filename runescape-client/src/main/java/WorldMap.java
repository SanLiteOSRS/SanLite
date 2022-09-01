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

@ObfuscatedName("os")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("u")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("z")
	@Export("details")
	HashMap details;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	WorldMapArea field4531;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1809475727
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -981838319
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -548578113
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -837036363
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("g")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ar")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1316145909
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1978968537
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 758850675
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -49193687
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -91835289
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -496189577
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("au")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ae")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1047087863
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1304352567
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2088023961
	)
	int field4529;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2031999733
	)
	int field4551;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1284061055
	)
	int field4552;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1246475869
	)
	int field4553;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 950666765666561931L
	)
	long field4565;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1737543787
	)
	int field4555;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -789334205
	)
	int field4519;
	@ObfuscatedName("an")
	boolean field4557;
	@ObfuscatedName("am")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ao")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("at")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("al")
	HashSet field4561;
	@ObfuscatedName("ac")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1025282557
	)
	int field4563;
	@ObfuscatedName("bl")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bv")
	List field4564;
	@ObfuscatedName("bu")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bb")
	HashSet field4567;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bw")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1467781265
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -523247993
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1560573609
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1980932935
	)
	int field4533;

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
		this.field4529 = -1; // L: 74
		this.field4551 = -1; // L: 75
		this.field4552 = -1; // L: 76
		this.field4553 = -1; // L: 77
		this.field4557 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4561 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4563 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4567 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4533 = -1; // L: 101
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;Lls;Lmg;Ljava/util/HashMap;[Lqe;B)V",
		garbageValue = "-35"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2872.name); // L: 115
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-37661624"
	)
	public void method7218() {
		class135.method2871(); // L: 132
	} // L: 133

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "93"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 136
			this.smoothZoom(); // L: 139
			this.scrollToTarget(); // L: 140
			if (var3) { // L: 141
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 144
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 145
				List var10 = this.worldMapManager.method4721(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 146
				HashSet var11 = new HashSet(); // L: 147

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); SceneTilePaint.runScriptEvent(var14)) { // L: 148 161
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 149
					var11.add(var13); // L: 151
					var14 = new ScriptEvent(); // L: 152
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 153
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 154
					if (this.field4567.contains(var13)) { // L: 155
						var14.setType(17); // L: 156
					} else {
						var14.setType(15); // L: 159
					}
				}

				var12 = this.field4567.iterator(); // L: 164

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 165
					if (!var11.contains(var13)) { // L: 167
						var14 = new ScriptEvent(); // L: 168
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 169
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 170
						var14.setType(16); // L: 171
						SceneTilePaint.runScriptEvent(var14); // L: 172
					}
				}

				this.field4567 = var11; // L: 176
			}
		}
	} // L: 137 142 177

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "-72"
	)
	public void method7283(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label39: {
			var5 = class181.method3483(); // L: 180
			this.method7144(var1, var2, var4, var5); // L: 181
			if (!this.hasTarget() && (var4 || var3)) { // L: 183
				boolean var7 = Client.clickedWidget != null; // L: 186
				if (!var7) { // L: 188
					if (var4) { // L: 189
						this.field4552 = var1; // L: 190
						this.field4553 = var2; // L: 191
						this.field4529 = this.centerTileX; // L: 192
						this.field4551 = this.centerTileY; // L: 193
					}

					if (this.field4529 != -1) { // L: 195
						int var8 = var1 - this.field4552; // L: 196
						int var9 = var2 - this.field4553; // L: 197
						this.setWorldMapPosition(this.field4529 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4551, false); // L: 198
					}
					break label39;
				}
			}

			this.method7127(); // L: 203
		}

		if (var4) { // L: 205
			this.field4565 = var5; // L: 206
			this.field4555 = var1; // L: 207
			this.field4519 = var2; // L: 208
		}

	} // L: 210

	@ObfuscatedName("c")
	void method7144(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 213
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 214
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 215
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 216
			if (this.mouseCoord != null && var3) { // L: 217
				if (UrlRequest.method2525() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 218
					class9.method79(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 219
				} else {
					boolean var8 = true; // L: 222
					if (this.field4557) { // L: 223
						int var9 = var1 - this.field4555; // L: 224
						int var10 = var2 - this.field4519; // L: 225
						if (var4 - this.field4565 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) { // L: 226
							var8 = false; // L: 227
						}
					}

					if (var8) { // L: 230
						PacketBufferNode var11 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2944, Client.packetWriter.isaacCipher); // L: 231
						var11.packetBuffer.method7687(this.mouseCoord.packed()); // L: 232
						Client.packetWriter.addNode(var11); // L: 233
						this.field4565 = 0L; // L: 234
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 239
		}

	} // L: 240

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class347.field4164 != null) { // L: 243
			this.zoom = this.zoomTarget; // L: 244
		} else {
			if (this.zoom < this.zoomTarget) { // L: 247
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 248
			}

			if (this.zoom > this.zoomTarget) { // L: 250
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 251
			}

		}
	} // L: 245 253

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1607677011"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 256
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 259
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 260
			if (var1 != 0) { // L: 261
				var1 /= Math.min(8, Math.abs(var1)); // L: 262
			}

			if (var2 != 0) { // L: 264
				var2 /= Math.min(8, Math.abs(var2)); // L: 265
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 267
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 268
				this.worldMapTargetX = -1; // L: 269
				this.worldMapTargetY = -1; // L: 270
			}

		}
	} // L: 257 272

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-65"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 275
		this.centerTileY = var2; // L: 276
		class181.method3483(); // L: 277
		if (var3) {
			this.method7127(); // L: 278
		}

	} // L: 279

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "405145914"
	)
	final void method7127() {
		this.field4553 = -1; // L: 282
		this.field4552 = -1; // L: 283
		this.field4551 = -1; // L: 284
		this.field4529 = -1; // L: 285
	} // L: 286

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 289
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lht;",
		garbageValue = "16"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 293

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 301
			}

			var5 = (WorldMapArea)var4.next(); // L: 294
		} while(!var5.containsCoord(var1, var2, var3)); // L: 296

		return var5; // L: 297
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1031263999"
	)
	public void method7130(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 305
		if (var5 == null) { // L: 306
			if (!var4) { // L: 307
				return; // L: 310
			}

			var5 = this.mainMapArea; // L: 308
		}

		boolean var6 = false; // L: 312
		if (var5 != this.field4531 || var4) { // L: 313
			this.field4531 = var5; // L: 314
			this.setCurrentMapArea(var5); // L: 315
			var6 = true; // L: 316
		}

		if (var6 || var4) { // L: 318
			this.jump(var1, var2, var3); // L: 319
		}

	} // L: 321

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1786504954"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 324
		if (var2 != null) { // L: 325
			this.setCurrentMapArea(var2); // L: 326
		}

	} // L: 328

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 331 332 334
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lht;",
		garbageValue = "1273060438"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 338
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)V",
		garbageValue = "-74"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 342
			this.initializeWorldMapManager(var1); // L: 345
			this.jump(-1, -1, -1); // L: 346
		}
	} // L: 343 347

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "-229315984"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 350
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 351
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 352
	} // L: 353

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lht;Lku;Lku;ZB)V",
		garbageValue = "7"
	)
	public void method7279(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 356
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 359
				this.initializeWorldMapManager(var1); // L: 360
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 362
				this.jump(var2.plane, var2.x, var2.y); // L: 366
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 363
			}

		}
	} // L: 357 368

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1260946396"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 371
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 374
			if (var4 == null) { // L: 375
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 376
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 378
			this.worldMapTargetX = -1; // L: 379
			this.worldMapTargetY = -1; // L: 380
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 381
			this.zoomTarget = this.zoom; // L: 382
			this.field4564 = null; // L: 383
			this.iconIterator = null; // L: 384
			this.worldMapManager.clearIcons(); // L: 385
		}
	} // L: 372 386

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1201425729"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 389
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 390
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 391
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 392
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 393
		if (var7 < 100) { // L: 394
			this.drawLoading(var1, var2, var3, var4, var7); // L: 395
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 398
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 399
				if (!this.worldMapManager.isLoaded()) { // L: 400
					return; // L: 401
				}
			}

			if (this.flashingElements != null) { // L: 404
				++this.flashCycle; // L: 405
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 406
					this.flashCycle = 0; // L: 407
					++this.flashCount; // L: 408
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 410
					this.flashingElements = null; // L: 411
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 414
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 415
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 416
			if (!this.elementsDisabled) { // L: 417
				boolean var10 = false; // L: 418
				if (var5 - this.field4563 > 100) { // L: 419
					this.field4563 = var5; // L: 420
					var10 = true; // L: 421
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4561, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 423
			}

			this.method7124(var1, var2, var3, var4, var8, var9); // L: 425
			if (UrlRequest.method2525() && this.showCoord && this.mouseCoord != null) { // L: 426
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 427
			this.worldMapDisplayHeight = var9; // L: 428
			this.worldMapDisplayX = var1; // L: 429
			this.worldMapDisplayY = var2; // L: 430
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 431
		}
	} // L: 396 432

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-1394954959"
	)
	boolean method7240(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 435
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 436
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 437
				return true;
			} else if (this.field4533 != Client.field765) { // L: 438
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 439
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 440
			} else {
				return true; // L: 441
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "530061141"
	)
	void method7124(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class347.field4164 != null) { // L: 445
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 446
			int var8 = var3 + 512; // L: 447
			int var9 = var4 + 512; // L: 448
			float var10 = 1.0F; // L: 449
			var8 = (int)((float)var8 / var10); // L: 450
			var9 = (int)((float)var9 / var10); // L: 451
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 452
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 453
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 454
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 455
			if (this.method7240(var8, var9, var13, var14, var3, var4)) { // L: 456
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 457
					Arrays.fill(this.sprite.pixels, 0); // L: 460
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 458
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 461
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 462
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 463
				class347.field4164.method5965(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 464
				this.field4533 = Client.field765; // L: 465
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 466
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 467
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 469
			if (var10 == 1.0F) { // L: 470
				this.sprite.method8085(var13, var14, 192); // L: 471
			} else {
				this.sprite.method8088(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192); // L: 474
			}
		}

	} // L: 477

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "7"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 480
			if (!this.worldMapManager.isLoaded()) { // L: 483
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 484
				if (!this.worldMapManager.isLoaded()) { // L: 485
					return; // L: 486
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 489
		}
	} // L: 481 490

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 493
	} // L: 494

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1380444019"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 497
		int var7 = var3 / 2 + var1; // L: 498
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 499
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 500
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 501
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 502
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 503
	} // L: 504

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1601542935"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 507
			return 1.0F;
		} else if (var1 == 37) { // L: 508
			return 1.5F;
		} else if (var1 == 50) { // L: 509
			return 2.0F;
		} else if (var1 == 75) { // L: 510
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 511 512
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1563995269"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 516
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 517
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 518
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) { // L: 519
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 520 521
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "873691163"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 525
	} // L: 526

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-10"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 529
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "2129410994"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 533

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 541
			}

			var3 = (WorldMapArea)var2.next(); // L: 534
		} while(var3.getId() != var1); // L: 536

		return var3; // L: 537
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2016534123"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 545
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 548
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 549
		}
	} // L: 546 550

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-13"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 553
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 556
			this.worldMapTargetX = -1; // L: 557
			this.worldMapTargetY = -1; // L: 558
		}
	} // L: 554 559

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1791187108"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 562
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 565
			if (var4 != null) { // L: 566
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 567
			}

		}
	} // L: 563 569

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 572
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 575
			if (var4 != null) { // L: 576
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 577
			}

		}
	} // L: 573 579

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2044745801"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 582 583 585
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2064200115"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 589 590 592
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "-1269437106"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 596 597 599
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1524771488"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 603
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1110802441"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 607
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1741541844"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 611
			this.maxFlashCount = var1; // L: 612
		}

	} // L: 614

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "104567985"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 617
	} // L: 618

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "979078706"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 621
			this.cyclesPerFlash = var1; // L: 622
		}

	} // L: 624

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1820738487"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 627
	} // L: 628

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-122700482"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 631
	} // L: 632

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-101"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 635
		this.flashingElements.add(var1); // L: 636
		this.flashCount = 0; // L: 637
		this.flashCycle = 0; // L: 638
	} // L: 639

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 642
		this.flashCount = 0; // L: 643
		this.flashCycle = 0; // L: 644

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 645
			if (EnumComposition.WorldMapElement_get(var2) != null && EnumComposition.WorldMapElement_get(var2).category == var1) { // L: 646 649
				this.flashingElements.add(EnumComposition.WorldMapElement_get(var2).objectId); // L: 650
			}
		}

	} // L: 653

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "946988417"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 656
	} // L: 657

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "58"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 660
	} // L: 661

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1542615113"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 664
			this.enabledElements.add(var1); // L: 665
		} else {
			this.enabledElements.remove(var1); // L: 668
		}

		this.method7172(); // L: 670
	} // L: 671

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-62"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 674
			this.enabledCategories.add(var1); // L: 675
		} else {
			this.enabledCategories.remove(var1); // L: 678
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 680
			if (EnumComposition.WorldMapElement_get(var3) != null && EnumComposition.WorldMapElement_get(var3).category == var1) { // L: 681 684
				int var4 = EnumComposition.WorldMapElement_get(var3).objectId; // L: 685
				if (!var2) { // L: 686
					this.enabledElementIds.add(var4); // L: 687
				} else {
					this.enabledElementIds.remove(var4); // L: 690
				}
			}
		}

		this.method7172(); // L: 694
	} // L: 695

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-116"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 698
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1896527498"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 702
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "750022762"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 706
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "32694054"
	)
	void method7172() {
		this.field4561.clear(); // L: 710
		this.field4561.addAll(this.enabledElements); // L: 711
		this.field4561.addAll(this.enabledElementIds); // L: 712
	} // L: 713

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "124"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 716
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 719
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 720
			List var9 = this.worldMapManager.method4721(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 721
			if (!var9.isEmpty()) { // L: 722
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 725
						return; // L: 741
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 726
					WorldMapElement var12 = EnumComposition.WorldMapElement_get(var11.getElement()); // L: 728
					var13 = false; // L: 729

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 730
						if (var12.menuActions[var14] != null) { // L: 731
							ChatChannel.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 732
							var13 = true; // L: 733
						}
					}
				} while(!var13); // L: 736

			}
		}
	} // L: 717 723 737

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILku;B)Lku;",
		garbageValue = "102"
	)
	public Coord method7174(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 744
			return null; // L: 745
		} else if (!this.worldMapManager.isLoaded()) { // L: 747
			return null; // L: 748
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 750
			return null; // L: 751
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 753
			List var4 = (List)var3.get(var1); // L: 754
			if (var4 != null && !var4.isEmpty()) { // L: 755
				AbstractWorldMapIcon var5 = null; // L: 758
				int var6 = -1; // L: 759
				Iterator var7 = var4.iterator(); // L: 760

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 775
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 761
						int var9 = var8.coord2.x - var2.x; // L: 763
						int var10 = var8.coord2.y - var2.y; // L: 764
						var11 = var9 * var9 + var10 * var10; // L: 765
						if (var11 == 0) { // L: 766
							return var8.coord2; // L: 767
						}
					} while(var11 >= var6 && var5 != null); // L: 769

					var5 = var8; // L: 770
					var6 = var11; // L: 771
				}
			} else {
				return null; // L: 756
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IILku;Lku;I)V",
		garbageValue = "1303014145"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 779
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 780
		var5.setArgs(new Object[]{var6}); // L: 781
		switch(var1) { // L: 782
		case 1008:
			var5.setType(10); // L: 785
			break;
		case 1009:
			var5.setType(11); // L: 800
			break; // L: 801
		case 1010:
			var5.setType(12); // L: 795
			break; // L: 796
		case 1011:
			var5.setType(13); // L: 805
			break;
		case 1012:
			var5.setType(14); // L: 790
		}

		SceneTilePaint.runScriptEvent(var5); // L: 809
	} // L: 810

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "-1484391047"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 813
			return null; // L: 814
		} else if (!this.worldMapManager.isLoaded()) { // L: 816
			return null; // L: 817
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 819
			this.field4564 = new LinkedList(); // L: 820
			Iterator var2 = var1.values().iterator(); // L: 821

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 822
				this.field4564.addAll(var3); // L: 824
			}

			this.iconIterator = this.field4564.iterator(); // L: 827
			return this.iconNext(); // L: 828
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "872323159"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 832
			return null; // L: 833
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 835
					return null; // L: 841
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 836
			} while(var1.getElement() == -1); // L: 837

			return var1; // L: 838
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)V",
		garbageValue = "231338394"
	)
	static final void method7319(PendingSpawn var0) {
		long var1 = 0L; // L: 7743
		int var3 = -1; // L: 7744
		int var4 = 0; // L: 7745
		int var5 = 0; // L: 7746
		if (var0.type == 0) { // L: 7747
			var1 = class12.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7748
			var1 = class12.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7749
			var1 = class12.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class12.scene.getGroundObjectTag(var0.plane, var0.x, var0.y); // L: 7750
		}

		if (0L != var1) { // L: 7751
			int var6 = class12.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7752
			var3 = WorldMapSection2.Entity_unpackID(var1); // L: 7753
			var4 = var6 & 31; // L: 7754
			var5 = var6 >> 6 & 3; // L: 7755
		}

		var0.objectId = var3; // L: 7757
		var0.field1119 = var4; // L: 7758
		var0.field1118 = var5; // L: 7759
	} // L: 7760
}
