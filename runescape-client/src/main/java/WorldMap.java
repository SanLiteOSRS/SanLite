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

@ObfuscatedName("pd")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("b")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("u")
	@Export("details")
	HashMap details;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	WorldMapArea field4701;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -850293795
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -98016257
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1979903129
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1050009173
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("v")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("aj")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 938797781
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 260211791
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -714911503
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -169868199
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1525044183
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -807646979
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("av")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ak")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1462826717
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 675061385
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 702195851
	)
	int field4715;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1387415351
	)
	int field4721;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 677131773
	)
	int field4722;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1873918795
	)
	int field4708;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 8220163670901273461L
	)
	long field4724;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1283673085
	)
	int field4741;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -826440143
	)
	int field4726;
	@ObfuscatedName("ai")
	boolean field4727;
	@ObfuscatedName("at")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ar")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("ay")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ax")
	HashSet field4731;
	@ObfuscatedName("aa")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1766726275
	)
	int field4712;
	@ObfuscatedName("bm")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bp")
	List field4732;
	@ObfuscatedName("bl")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bo")
	HashSet field4690;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bd")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 63800899
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -189654711
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1557687761
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 501848091
	)
	int field4744;

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
		this.field4715 = -1; // L: 76
		this.field4721 = -1; // L: 77
		this.field4722 = -1; // L: 78
		this.field4708 = -1; // L: 79
		this.field4727 = true; // L: 83
		this.enabledElements = new HashSet(); // L: 86
		this.enabledCategories = new HashSet(); // L: 87
		this.enabledElementIds = new HashSet(); // L: 88
		this.field4731 = new HashSet(); // L: 89
		this.elementsDisabled = false; // L: 90
		this.field4712 = 0; // L: 91
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 93
		this.field4690 = new HashSet(); // L: 96
		this.mouseCoord = null; // L: 97
		this.showCoord = false; // L: 98
		this.minCachedTileX = -1; // L: 101
		this.minCachedTileY = -1; // L: 102
		this.field4744 = -1; // L: 103
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;Llg;Lnl;Ljava/util/HashMap;[Lry;B)V",
		garbageValue = "1"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2954.name); // L: 117
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 118
		this.details = new HashMap(var8.length); // L: 119

		for (int var9 = 0; var9 < var8.length; ++var9) { // L: 120
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9])); // L: 121
			WorldMapArea var11 = new WorldMapArea(); // L: 122
			var11.read(var10, var8[var9]); // L: 123
			this.details.put(var11.getInternalName(), var11); // L: 124
			if (var11.getIsMain()) { // L: 125
				this.mainMapArea = var11; // L: 126
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 129
		this.field4701 = null; // L: 130
	} // L: 131

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1615857180"
	)
	public void method7866() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-1518478362"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method4996(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); ServerPacket.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field4690.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field4690.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						ServerPacket.runScriptEvent(var14); // L: 176
					}
				}

				this.field4690 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1983688485"
	)
	public void method8033(int var1, int var2, boolean var3, boolean var4) {
		long var5 = UserComparator8.method2748(); // L: 184
		this.method7955(var1, var2, var4, var5); // L: 185
		if (!this.hasTarget() && (var4 || var3) && !MusicPatchPcmStream.method5654()) { // L: 186
			if (var4) { // L: 187
				this.field4722 = var1; // L: 188
				this.field4708 = var2; // L: 189
				this.field4715 = this.centerTileX; // L: 190
				this.field4721 = this.centerTileY; // L: 191
			}

			if (this.field4715 != -1) { // L: 193
				int var7 = var1 - this.field4722; // L: 194
				int var8 = var2 - this.field4708; // L: 195
				this.setWorldMapPosition(this.field4715 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4721, false); // L: 196
			}
		} else {
			this.method7873(); // L: 200
		}

		if (var4) { // L: 202
			this.field4724 = var5; // L: 203
			this.field4741 = var1; // L: 204
			this.field4726 = var2; // L: 205
		}

	} // L: 207

	@ObfuscatedName("h")
	void method7955(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 210
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 211
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 212
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 213
			if (this.mouseCoord != null && var3) { // L: 214
				class199 var8 = Client.field733; // L: 217
				if (UserComparator3.method2773() && var8.method3956(82) && var8.method3956(81)) { // L: 220
					class143.method3054(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 221
				} else {
					boolean var10 = true; // L: 224
					if (this.field4727) { // L: 225
						int var11 = var1 - this.field4741; // L: 226
						int var12 = var2 - this.field4726; // L: 227
						if (var4 - this.field4724 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 228
							var10 = false; // L: 229
						}
					}

					if (var10) { // L: 232
						PacketBufferNode var13 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3038, Client.packetWriter.isaacCipher); // L: 233
						var13.packetBuffer.writeInt(this.mouseCoord.packed()); // L: 234
						Client.packetWriter.addNode(var13); // L: 235
						this.field4724 = 0L; // L: 236
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 241
		}

	} // L: 242

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (NetFileRequest.field4144 != null) { // L: 245
			this.zoom = this.zoomTarget; // L: 246
		} else {
			if (this.zoom < this.zoomTarget) { // L: 249
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 250
			}

			if (this.zoom > this.zoomTarget) { // L: 252
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 253
			}

		}
	} // L: 247 255

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-11137"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 258
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 261
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 262
			if (var1 != 0) { // L: 263
				var1 /= Math.min(8, Math.abs(var1)); // L: 264
			}

			if (var2 != 0) { // L: 266
				var2 /= Math.min(8, Math.abs(var2)); // L: 267
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 269
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 270
				this.worldMapTargetX = -1; // L: 271
				this.worldMapTargetY = -1; // L: 272
			}

		}
	} // L: 259 274

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-143529102"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 277
		this.centerTileY = var2; // L: 278
		UserComparator8.method2748(); // L: 279
		if (var3) {
			this.method7873(); // L: 280
		}

	} // L: 281

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	final void method7873() {
		this.field4708 = -1; // L: 284
		this.field4722 = -1; // L: 285
		this.field4721 = -1; // L: 286
		this.field4715 = -1; // L: 287
	} // L: 288

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 291
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lit;",
		garbageValue = "68"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 295

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 303
			}

			var5 = (WorldMapArea)var4.next(); // L: 296
		} while(!var5.containsCoord(var1, var2, var3)); // L: 298

		return var5; // L: 299
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-948636594"
	)
	public void method7888(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 307
		if (var5 == null) { // L: 308
			if (!var4) { // L: 309
				return; // L: 312
			}

			var5 = this.mainMapArea; // L: 310
		}

		boolean var6 = false; // L: 314
		if (var5 != this.field4701 || var4) { // L: 315
			this.field4701 = var5; // L: 316
			this.setCurrentMapArea(var5); // L: 317
			var6 = true; // L: 318
		}

		if (var6 || var4) { // L: 320
			this.jump(var1, var2, var3); // L: 321
		}

	} // L: 323

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1516695931"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 326
		if (var2 != null) { // L: 327
			this.setCurrentMapArea(var2); // L: 328
		}

	} // L: 330

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1445215381"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 333 334 336
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lit;",
		garbageValue = "1619805614"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 340
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lit;B)V",
		garbageValue = "1"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 344
			this.initializeWorldMapManager(var1); // L: 347
			this.jump(-1, -1, -1); // L: 348
		}
	} // L: 345 349

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lit;I)V",
		garbageValue = "1807495258"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 352
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 353
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 354
	} // L: 355

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lit;Lki;Lki;ZI)V",
		garbageValue = "-185253311"
	)
	public void method7882(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 358
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 361
				this.initializeWorldMapManager(var1); // L: 362
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 364
				this.jump(var2.plane, var2.x, var2.y); // L: 368
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 365
			}

		}
	} // L: 359 370

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "646475931"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 373
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 376
			if (var4 == null) { // L: 377
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 378
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 380
			this.worldMapTargetX = -1; // L: 381
			this.worldMapTargetY = -1; // L: 382
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 383
			this.zoomTarget = this.zoom; // L: 384
			this.field4732 = null; // L: 385
			this.iconIterator = null; // L: 386
			this.worldMapManager.clearIcons(); // L: 387
		}
	} // L: 374 388

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-604340740"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 391
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 392
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 393
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 394
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 395
		if (var7 < 100) { // L: 396
			this.drawLoading(var1, var2, var3, var4, var7); // L: 397
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 400
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 401
				if (!this.worldMapManager.isLoaded()) { // L: 402
					return; // L: 403
				}
			}

			if (this.flashingElements != null) { // L: 406
				++this.flashCycle; // L: 407
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 408
					this.flashCycle = 0; // L: 409
					++this.flashCount; // L: 410
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 412
					this.flashingElements = null; // L: 413
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 416
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 417
			AbstractWorldMapData.field2885 = Client.field789 >= 209; // L: 418
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 419
			if (!this.elementsDisabled) { // L: 420
				boolean var10 = false; // L: 421
				if (var5 - this.field4712 > 100) { // L: 422
					this.field4712 = var5; // L: 423
					var10 = true; // L: 424
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4731, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 426
			}

			this.method7886(var1, var2, var3, var4, var8, var9); // L: 428
			if (UserComparator3.method2773() && this.showCoord && this.mouseCoord != null) { // L: 429
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 430
			this.worldMapDisplayHeight = var9; // L: 431
			this.worldMapDisplayX = var1; // L: 432
			this.worldMapDisplayY = var2; // L: 433
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 434
		}
	} // L: 398 435

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-662940710"
	)
	boolean method7885(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 438
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 439
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 440
				return true;
			} else if (this.field4744 != Client.field793) { // L: 441
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 442
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 443
			} else {
				return true; // L: 444
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1794034327"
	)
	void method7886(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (NetFileRequest.field4144 != null) { // L: 448
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 449
			int var8 = var3 + 512; // L: 450
			int var9 = var4 + 512; // L: 451
			float var10 = 1.0F; // L: 452
			var8 = (int)((float)var8 / var10); // L: 453
			var9 = (int)((float)var9 / var10); // L: 454
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 455
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 456
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 457
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 458
			if (this.method7885(var8, var9, var13, var14, var3, var4)) { // L: 459
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 460
					Arrays.fill(this.sprite.pixels, 0); // L: 463
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 461
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 464
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 465
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 466
				NetFileRequest.field4144.method6539(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 467
				this.field4744 = Client.field793; // L: 468
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 469
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 470
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 472
			if (var10 == 1.0F) { // L: 473
				this.sprite.method8845(var13, var14, 192); // L: 474
			} else {
				this.sprite.method8848(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192); // L: 477
			}
		}

	} // L: 480

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1222473709"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 483
			if (!this.worldMapManager.isLoaded()) { // L: 486
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 487
				if (!this.worldMapManager.isLoaded()) { // L: 488
					return; // L: 489
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 492
		}
	} // L: 484 493

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "64"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 496
	} // L: 497

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "476743893"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 500
		int var7 = var3 / 2 + var1; // L: 501
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 502
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 503
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 504
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 505
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 506
	} // L: 507

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "-31403"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 510
			return 1.0F;
		} else if (var1 == 37) { // L: 511
			return 1.5F;
		} else if (var1 == 50) { // L: 512
			return 2.0F;
		} else if (var1 == 75) { // L: 513
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 514 515
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1330747646"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 519
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 520
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 521
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 522
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 523 524
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 528
	} // L: 529

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-102936002"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 532
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lit;",
		garbageValue = "10"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 536

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) { // L: 543
				return null; // L: 544
			}

			var3 = (WorldMapArea)var2.next(); // L: 537
		} while(var3.getId() != var1); // L: 539

		return var3; // L: 540
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-494208680"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 548
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 551
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 552
		}
	} // L: 549 553

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-117156986"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 556
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 559
			this.worldMapTargetX = -1; // L: 560
			this.worldMapTargetY = -1; // L: 561
		}
	} // L: 557 562

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-667248837"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 565
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 568
			if (var4 != null) { // L: 569
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 570
			}

		}
	} // L: 566 572

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "73"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 575
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 578
			if (var4 != null) { // L: 579
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 580
			}

		}
	} // L: 576 582

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-492150216"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 585 586 588
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1275261671"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 592 593 595
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lki;",
		garbageValue = "1"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 599 600 602
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "772230213"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 606
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-23147125"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 610
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-418313575"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 614
			this.maxFlashCount = var1; // L: 615
		}

	} // L: 617

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "482196308"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 620
	} // L: 621

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 624
			this.cyclesPerFlash = var1; // L: 625
		}

	} // L: 627

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2122492965"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 630
	} // L: 631

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1722635394"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 634
	} // L: 635

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-126"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 638
		this.flashingElements.add(var1); // L: 639
		this.flashCount = 0; // L: 640
		this.flashCycle = 0; // L: 641
	} // L: 642

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 645
		this.flashCount = 0; // L: 646
		this.flashCycle = 0; // L: 647

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 648
			if (Actor.WorldMapElement_get(var2) != null && Actor.WorldMapElement_get(var2).category == var1) { // L: 649 652
				this.flashingElements.add(Actor.WorldMapElement_get(var2).objectId); // L: 653
			}
		}

	} // L: 656

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 659
	} // L: 660

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1515647809"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 663
	} // L: 664

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "2"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 667
			this.enabledElements.add(var1); // L: 668
		} else {
			this.enabledElements.remove(var1); // L: 671
		}

		this.method7875(); // L: 673
	} // L: 674

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "1"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 677
			this.enabledCategories.add(var1); // L: 678
		} else {
			this.enabledCategories.remove(var1); // L: 681
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 683
			if (Actor.WorldMapElement_get(var3) != null && Actor.WorldMapElement_get(var3).category == var1) { // L: 684 687
				int var4 = Actor.WorldMapElement_get(var3).objectId; // L: 688
				if (!var2) { // L: 689
					this.enabledElementIds.add(var4); // L: 690
				} else {
					this.enabledElementIds.remove(var4); // L: 693
				}
			}
		}

		this.method7875(); // L: 697
	} // L: 698

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "9"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 701
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "84"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 705
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2028179974"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 709
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1172301175"
	)
	void method7875() {
		this.field4731.clear(); // L: 713
		this.field4731.addAll(this.enabledElements); // L: 714
		this.field4731.addAll(this.enabledElementIds); // L: 715
	} // L: 716

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1550367585"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 719
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 722
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 723
			List var9 = this.worldMapManager.method4996(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 724
			if (!var9.isEmpty()) { // L: 725
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 728
						return; // L: 744
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 729
					WorldMapElement var12 = Actor.WorldMapElement_get(var11.getElement()); // L: 731
					var13 = false; // L: 732

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 733
						if (var12.menuActions[var14] != null) { // L: 734
							class16.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 735
							var13 = true; // L: 736
						}
					}
				} while(!var13); // L: 739

			}
		}
	} // L: 720 726 740

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILki;I)Lki;",
		garbageValue = "414621035"
	)
	public Coord method7920(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 747
			return null; // L: 748
		} else if (!this.worldMapManager.isLoaded()) { // L: 750
			return null; // L: 751
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 753
			return null; // L: 754
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 756
			List var4 = (List)var3.get(var1); // L: 757
			if (var4 != null && !var4.isEmpty()) { // L: 758
				AbstractWorldMapIcon var5 = null; // L: 761
				int var6 = -1; // L: 762
				Iterator var7 = var4.iterator(); // L: 763

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) { // L: 777
							return var5.coord2; // L: 778
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 764
						int var9 = var8.coord2.x - var2.x; // L: 766
						int var10 = var8.coord2.y - var2.y; // L: 767
						var11 = var9 * var9 + var10 * var10; // L: 768
						if (var11 == 0) { // L: 769
							return var8.coord2; // L: 770
						}
					} while(var11 >= var6 && var5 != null); // L: 772

					var5 = var8; // L: 773
					var6 = var11; // L: 774
				}
			} else {
				return null; // L: 759
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IILki;Lki;I)V",
		garbageValue = "-1348007571"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 782
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 783
		var5.setArgs(new Object[]{var6}); // L: 784
		switch(var1) { // L: 785
		case 1008:
			var5.setType(10); // L: 798
			break; // L: 799
		case 1009:
			var5.setType(11); // L: 788
			break;
		case 1010:
			var5.setType(12); // L: 803
			break; // L: 804
		case 1011:
			var5.setType(13); // L: 793
			break; // L: 794
		case 1012:
			var5.setType(14); // L: 808
		}

		ServerPacket.runScriptEvent(var5); // L: 812
	} // L: 813

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Liq;",
		garbageValue = "-693900982"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 816
			return null; // L: 817
		} else if (!this.worldMapManager.isLoaded()) { // L: 819
			return null; // L: 820
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 822
			this.field4732 = new LinkedList(); // L: 823
			Iterator var2 = var1.values().iterator(); // L: 824

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 825
				this.field4732.addAll(var3); // L: 827
			}

			this.iconIterator = this.field4732.iterator(); // L: 830
			return this.iconNext(); // L: 831
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Liq;",
		garbageValue = "-60"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 835
			return null; // L: 836
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 838
					return null; // L: 844
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 839
			} while(var1.getElement() == -1); // L: 840

			return var1; // L: 841
		}
	}
}
