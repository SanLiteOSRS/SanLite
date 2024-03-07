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

@ObfuscatedName("ts")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("af")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("an")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	WorldMapArea field5048;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2013963741
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -431184265
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -555730485
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -276777597
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ap")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bu")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 822673281
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1492371901
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1335441053
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -955635637
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1795943101
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1255375909
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bk")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bm")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 187966457
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1949059973
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1235731787
	)
	int field5018;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1438880085
	)
	int field5025;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1512263179
	)
	int field5005;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1026726901
	)
	int field5027;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = 7079069170301631103L
	)
	long field5013;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 75176087
	)
	int field4992;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 641984765
	)
	int field5030;
	@ObfuscatedName("be")
	boolean field5031;
	@ObfuscatedName("bh")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bs")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bj")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bl")
	HashSet field5035;
	@ObfuscatedName("bx")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1919837551
	)
	int field5037;
	@ObfuscatedName("co")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cd")
	List field5008;
	@ObfuscatedName("cg")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cn")
	HashSet field5024;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ci")
	public boolean field5043;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1581898407
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1408932701
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 2093315525
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1371703741
	)
	int field5036;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11; // L: 48
		fontNameVerdana13 = FontName.FontName_verdana13; // L: 49
		fontNameVerdana15 = FontName.FontName_verdana15; // L: 50
	}

	public WorldMap() {
		this.worldMapTargetX = -1; // L: 62
		this.worldMapTargetY = -1; // L: 63
		this.worldMapDisplayWidth = -1; // L: 66
		this.worldMapDisplayHeight = -1; // L: 67
		this.worldMapDisplayX = -1; // L: 68
		this.worldMapDisplayY = -1; // L: 69
		this.maxFlashCount = 3; // L: 70
		this.cyclesPerFlash = 50; // L: 71
		this.perpetualFlash = false; // L: 72
		this.flashingElements = null; // L: 73
		this.flashCount = -1; // L: 74
		this.flashCycle = -1; // L: 75
		this.field5018 = -1; // L: 76
		this.field5025 = -1; // L: 77
		this.field5005 = -1; // L: 78
		this.field5027 = -1; // L: 79
		this.field5031 = true; // L: 83
		this.enabledElements = new HashSet(); // L: 86
		this.enabledCategories = new HashSet(); // L: 87
		this.enabledElementIds = new HashSet(); // L: 88
		this.field5035 = new HashSet(); // L: 89
		this.elementsDisabled = false; // L: 90
		this.field5037 = 0; // L: 91
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 93
		this.field5024 = new HashSet(); // L: 96
		this.mouseCoord = null; // L: 97
		this.field5043 = false; // L: 98
		this.minCachedTileX = -1; // L: 101
		this.minCachedTileY = -1; // L: 102
		this.field5036 = -1; // L: 103
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;Lof;Lpb;Ljava/util/HashMap;[Lvg;B)V",
		garbageValue = "17"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 107
		this.WorldMap_archive = var1; // L: 108
		this.WorldMap_geographyArchive = var2; // L: 109
		this.WorldMap_groundArchive = var3; // L: 110
		this.font = var4; // L: 111
		this.fonts = new HashMap(); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 113
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 114
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 115
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 116
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2680.name); // L: 117
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 118
		int var9 = var8 == null ? 0 : var8.length; // L: 119
		this.details = new HashMap(var9); // L: 120

		for (int var10 = 0; var10 < var9; ++var10) { // L: 121
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10])); // L: 122
			WorldMapArea var12 = new WorldMapArea(); // L: 123
			var12.read(var11, var8[var10]); // L: 124
			this.details.put(var12.getInternalName(), var12); // L: 125
			if (var12.getIsMain()) { // L: 126
				this.mainMapArea = var12; // L: 127
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 130
		this.field5048 = null; // L: 131
	} // L: 132

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1632616370"
	)
	public void method8901() {
		class237.method4617(); // L: 135
	} // L: 136

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-90985376"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 139
			this.smoothZoom(); // L: 142
			this.scrollToTarget(); // L: 143
			if (var3) { // L: 144
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 147
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 148
				List var10 = this.worldMapManager.method4860(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 149
				HashSet var11 = new HashSet(); // L: 150

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class177.runScriptEvent(var14)) { // L: 151 164
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 152
					var11.add(var13); // L: 154
					var14 = new ScriptEvent(); // L: 155
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 156
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 157
					if (this.field5024.contains(var13)) { // L: 158
						var14.setType(17); // L: 159
					} else {
						var14.setType(15); // L: 162
					}
				}

				var12 = this.field5024.iterator(); // L: 167

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 168
					if (!var11.contains(var13)) { // L: 170
						var14 = new ScriptEvent(); // L: 171
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 172
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 173
						var14.setType(16); // L: 174
						class177.runScriptEvent(var14); // L: 175
					}
				}

				this.field5024 = var11; // L: 179
			}
		}
	} // L: 140 145 180

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-233303932"
	)
	public void method8903(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label38: {
			var5 = SecureRandomCallable.method2320(); // L: 183
			this.method8904(var1, var2, var4, var5); // L: 184
			if (!this.hasTarget() && (var4 || var3)) { // L: 186
				boolean var7 = Client.clickedWidget != null; // L: 189
				if (!var7) { // L: 191
					if (var4) { // L: 192
						this.field5005 = var1; // L: 193
						this.field5027 = var2; // L: 194
						this.field5018 = this.centerTileX; // L: 195
						this.field5025 = this.centerTileY; // L: 196
					}

					if (this.field5018 != -1) { // L: 198
						int var8 = var1 - this.field5005; // L: 199
						int var9 = var2 - this.field5027; // L: 200
						this.setWorldMapPosition(this.field5018 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5025, false); // L: 201
					}
					break label38;
				}
			}

			this.method9053(); // L: 206
		}

		if (var4) { // L: 208
			this.field5013 = var5; // L: 209
			this.field4992 = var1; // L: 210
			this.field5030 = var2; // L: 211
		}

	} // L: 213

	@ObfuscatedName("ar")
	void method8904(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 216
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 217
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 218
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 219
			if (this.mouseCoord != null && var3) { // L: 220
				class228 var8 = PacketBufferNode.method6051(); // L: 221
				boolean var9 = Client.staffModLevel >= 2; // L: 224
				if (var9 && var8.method4466(82) && var8.method4466(81)) { // L: 226
					Login.method2195(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 227
				} else {
					boolean var10 = true; // L: 230
					if (this.field5031) { // L: 231
						int var11 = var1 - this.field4992; // L: 232
						int var12 = var2 - this.field5030; // L: 233
						if (var4 - this.field5013 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 234
							var10 = false; // L: 235
						}
					}

					if (var10) { // L: 238
						PacketBufferNode var13 = ViewportMouse.getPacketBufferNode(ClientPacket.field3236, Client.packetWriter.isaacCipher); // L: 239
						var13.packetBuffer.method9528(this.mouseCoord.packed()); // L: 240
						Client.packetWriter.addNode(var13); // L: 241
						this.field5013 = 0L; // L: 242
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 247
		}

	} // L: 248

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1765984401"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (MilliClock.field2352 != null) { // L: 251
			this.zoom = this.zoomTarget; // L: 252
		} else {
			if (this.zoom < this.zoomTarget) { // L: 255
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 256
			}

			if (this.zoom > this.zoomTarget) { // L: 258
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 259
			}

		}
	} // L: 253 261

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
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
			if (this.centerTileX == this.worldMapTargetX && this.worldMapTargetY == this.centerTileY) { // L: 276
				this.worldMapTargetX = -1; // L: 277
				this.worldMapTargetY = -1; // L: 278
			}

		}
	} // L: 265 280

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1425537239"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 283
		this.centerTileY = var2; // L: 284
		SecureRandomCallable.method2320(); // L: 285
		if (var3) {
			this.method9053(); // L: 286
		}

	} // L: 287

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2141378676"
	)
	final void method9053() {
		this.field5027 = -1; // L: 290
		this.field5005 = -1; // L: 291
		this.field5025 = -1; // L: 292
		this.field5018 = -1; // L: 293
	} // L: 294

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 297
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljw;",
		garbageValue = "-780530098"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-192887320"
	)
	public void method8911(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 313
		if (var5 == null) { // L: 314
			if (!var4) { // L: 315
				return; // L: 318
			}

			var5 = this.mainMapArea; // L: 316
		}

		boolean var6 = false; // L: 320
		if (var5 != this.field5048 || var4) { // L: 321
			this.field5048 = var5; // L: 322
			this.setCurrentMapArea(var5); // L: 323
			var6 = true; // L: 324
		}

		if (var6 || var4) { // L: 326
			this.jump(var1, var2, var3); // L: 327
		}

	} // L: 329

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1617478569"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 332
		if (var2 != null) { // L: 333
			this.setCurrentMapArea(var2); // L: 334
		}

	} // L: 336

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1904343222"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 339 340 342
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljw;",
		garbageValue = "1520434146"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 346
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljw;I)V",
		garbageValue = "-261684508"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 350
			this.initializeWorldMapManager(var1); // L: 353
			this.jump(-1, -1, -1); // L: 354
		}
	} // L: 351 355

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljw;I)V",
		garbageValue = "1299525649"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 358
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 359
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 360
	} // L: 361

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljw;Lns;Lns;ZI)V",
		garbageValue = "399176129"
	)
	public void method8925(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "350736645"
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
			this.field5008 = null; // L: 391
			this.iconIterator = null; // L: 392
			this.worldMapManager.clearIcons(); // L: 393
		}
	} // L: 380 394

	@ObfuscatedName("at")
	public void method8900(int var1, int var2, int var3, int var4, int var5, double var6) {
		int[] var8 = new int[4]; // L: 397
		Rasterizer2D.Rasterizer2D_getClipArray(var8); // L: 398
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 399
		int var9 = this.cacheLoader.getPercentLoaded(); // L: 400
		if (var9 < 100) { // L: 401
			this.drawLoading(var1, var2, var3, var4, var9); // L: 402
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 405
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 406
				if (!this.worldMapManager.isLoaded()) { // L: 407
					return; // L: 408
				}
			}

			int var10 = LoginScreenAnimation.method2525(this.worldMapManager.method4863(), var6); // L: 411
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10); // L: 412
			if (this.flashingElements != null) { // L: 413
				++this.flashCycle; // L: 414
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 415
					this.flashCycle = 0; // L: 416
					++this.flashCount; // L: 417
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 419
					this.flashingElements = null; // L: 420
				}
			}

			int var11 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 423
			int var12 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 424
			this.worldMapManager.drawTiles(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 425
			boolean var13;
			if (!this.elementsDisabled) { // L: 426
				var13 = false; // L: 427
				if (var5 - this.field5037 > 100) { // L: 428
					this.field5037 = var5; // L: 429
					var13 = true; // L: 430
				}

				this.worldMapManager.drawElements(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5035, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var13); // L: 432
			}

			this.method8965(var1, var2, var3, var4, var11, var12); // L: 434
			var13 = Client.staffModLevel >= 2; // L: 437
			if (var13 && this.field5043 && this.mouseCoord != null) { // L: 439
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var11; // L: 440
			this.worldMapDisplayHeight = var12; // L: 441
			this.worldMapDisplayX = var1; // L: 442
			this.worldMapDisplayY = var2; // L: 443
			Rasterizer2D.Rasterizer2D_setClipArray(var8); // L: 444
		}
	} // L: 403 445

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073568701"
	)
	public void method8920() {
		RouteStrategy.method4513(); // L: 448
	} // L: 449

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1910265960"
	)
	boolean method8921(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 452
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 453
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 454
				return true;
			} else if (this.field5036 != Client.field825) {
				return true; // L: 455
			} else if (var3 <= 0 && var4 <= 0) { // L: 456
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 457
			} else {
				return true; // L: 458
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "18171"
	)
	void method8965(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (MilliClock.field2352 != null) { // L: 462
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 463
			int var8 = var3 + 512; // L: 464
			int var9 = var4 + 512; // L: 465
			float var10 = 1.0F; // L: 466
			var8 = (int)((float)var8 / var10); // L: 467
			var9 = (int)((float)var9 / var10); // L: 468
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 469
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 470
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 471
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 472
			if (this.method8921(var8, var9, var13, var14, var3, var4)) { // L: 473
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 474
					Arrays.fill(this.sprite.pixels, 0); // L: 477
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 475
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 478
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 479
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 480
				MilliClock.field2352.method7323(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 481
				this.field5036 = Client.field825; // L: 482
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 483
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 484
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 486
			if (var10 == 1.0F) { // L: 487
				this.sprite.method9920(var13, var14, 192); // L: 488
			} else {
				this.sprite.method9970(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 491
			}
		}

	} // L: 494

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "102"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 497
			if (!this.worldMapManager.isLoaded()) { // L: 500
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 501
				if (!this.worldMapManager.isLoaded()) { // L: 502
					return; // L: 503
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 506
		}
	} // L: 498 507

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-22573265"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 510
	} // L: 511

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 514
		int var7 = var3 / 2 + var1; // L: 515
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 516
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 517
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 518
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 519
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 520
	} // L: 521

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "256"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 524
			return 1.0F;
		} else if (var1 == 37) { // L: 525
			return 1.5F;
		} else if (var1 == 50) { // L: 526
			return 2.0F;
		} else if (var1 == 75) { // L: 527
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 528 529
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1810611745"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 533
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) { // L: 534
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 535
			return 50;
		} else if (3.0D == (double)this.zoomTarget) { // L: 536
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 537 538
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1269096617"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 542
	} // L: 543

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-42"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 546
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljw;",
		garbageValue = "87"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 550

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 558
			}

			var3 = (WorldMapArea)var2.next(); // L: 551
		} while(var3.getId() != var1); // L: 553

		return var3; // L: 554
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-104"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 562
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 565
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 566
		}
	} // L: 563 567

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "119"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 570
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 573
			this.worldMapTargetX = -1; // L: 574
			this.worldMapTargetY = -1; // L: 575
		}
	} // L: 571 576

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "544994787"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 579
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 582
			if (var4 != null) { // L: 583
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 584
			}

		}
	} // L: 580 586

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "66728096"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 589
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 592
			if (var4 != null) { // L: 593
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 594
			}

		}
	} // L: 590 596

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "47"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 599 600 602
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 606 607 609
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lns;",
		garbageValue = "-1063680949"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 613 614 616
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2088463880"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 620
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-413757052"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 624
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "559637000"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 628
			this.maxFlashCount = var1; // L: 629
		}

	} // L: 631

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1318975641"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 634
	} // L: 635

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2125572039"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 638
			this.cyclesPerFlash = var1; // L: 639
		}

	} // L: 641

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1381505610"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 644
	} // L: 645

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1347499094"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 648
	} // L: 649

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "547450469"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 652
		this.flashingElements.add(var1); // L: 653
		this.flashCount = 0; // L: 654
		this.flashCycle = 0; // L: 655
	} // L: 656

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-298476347"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 659
		this.flashCount = 0; // L: 660
		this.flashCycle = 0; // L: 661

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 662
			if (class139.WorldMapElement_get(var2) != null && class139.WorldMapElement_get(var2).category == var1) { // L: 663 666
				this.flashingElements.add(class139.WorldMapElement_get(var2).objectId); // L: 667
			}
		}

	} // L: 670

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "750221544"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 673
	} // L: 674

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1058263558"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 677
	} // L: 678

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1594577479"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 681
			this.enabledElements.add(var1); // L: 682
		} else {
			this.enabledElements.remove(var1); // L: 685
		}

		this.method8954(); // L: 687
	} // L: 688

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "0"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 691
			this.enabledCategories.add(var1); // L: 692
		} else {
			this.enabledCategories.remove(var1); // L: 695
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 697
			if (class139.WorldMapElement_get(var3) != null && class139.WorldMapElement_get(var3).category == var1) { // L: 698 701
				int var4 = class139.WorldMapElement_get(var3).objectId; // L: 702
				if (!var2) { // L: 703
					this.enabledElementIds.add(var4); // L: 704
				} else {
					this.enabledElementIds.remove(var4); // L: 707
				}
			}
		}

		this.method8954(); // L: 711
	} // L: 712

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "920737516"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 715
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "64"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 719
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-80"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 723
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	void method8954() {
		this.field5035.clear(); // L: 727
		this.field5035.addAll(this.enabledElements); // L: 728
		this.field5035.addAll(this.enabledElementIds); // L: 729
	} // L: 730

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-45"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 733
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 736
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 737
			List var9 = this.worldMapManager.method4860(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 738
			if (!var9.isEmpty()) { // L: 739
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 742
						return; // L: 758
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 743
					WorldMapElement var12 = class139.WorldMapElement_get(var11.getElement()); // L: 745
					var13 = false; // L: 746

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 747
						if (var12.menuActions[var14] != null) { // L: 748
							UrlRequest.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 749
							var13 = true; // L: 750
						}
					}
				} while(!var13); // L: 753

			}
		}
	} // L: 734 740 754

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILns;I)Lns;",
		garbageValue = "-1864092893"
	)
	public Coord method8956(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 761
			return null; // L: 762
		} else if (!this.worldMapManager.isLoaded()) { // L: 764
			return null; // L: 765
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 767
			return null; // L: 768
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 770
			List var4 = (List)var3.get(var1); // L: 771
			if (var4 != null && !var4.isEmpty()) { // L: 772
				AbstractWorldMapIcon var5 = null; // L: 775
				int var6 = -1; // L: 776
				Iterator var7 = var4.iterator(); // L: 777

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 792
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 778
						int var9 = var8.coord2.x - var2.x; // L: 780
						int var10 = var8.coord2.y - var2.y; // L: 781
						var11 = var10 * var10 + var9 * var9; // L: 782
						if (var11 == 0) { // L: 783
							return var8.coord2; // L: 784
						}
					} while(var11 >= var6 && var5 != null); // L: 786

					var5 = var8; // L: 787
					var6 = var11; // L: 788
				}
			} else {
				return null; // L: 773
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IILns;Lns;I)V",
		garbageValue = "-738007378"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 796
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 797
		var5.setArgs(new Object[]{var6}); // L: 798
		switch(var1) { // L: 799
		case 1008:
			var5.setType(10); // L: 817
			break; // L: 818
		case 1009:
			var5.setType(11); // L: 802
			break;
		case 1010:
			var5.setType(12); // L: 812
			break; // L: 813
		case 1011:
			var5.setType(13); // L: 822
			break;
		case 1012:
			var5.setType(14); // L: 807
		}

		class177.runScriptEvent(var5); // L: 826
	} // L: 827

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-262342453"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 830
			return null; // L: 831
		} else if (!this.worldMapManager.isLoaded()) { // L: 833
			return null; // L: 834
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 836
			this.field5008 = new LinkedList(); // L: 837
			Iterator var2 = var1.values().iterator(); // L: 838

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 839
				this.field5008.addAll(var3); // L: 841
			}

			this.iconIterator = this.field5008.iterator(); // L: 844
			return this.iconNext(); // L: 845
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Ljd;",
		garbageValue = "110"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 849
			return null; // L: 850
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 852
					return null; // L: 858
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 853
			} while(var1.getElement() == -1); // L: 854

			return var1; // L: 855
		}
	}
}
