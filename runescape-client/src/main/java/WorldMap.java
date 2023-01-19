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

@ObfuscatedName("pb")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("o")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("k")
	@Export("details")
	HashMap details;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	WorldMapArea field4751;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1773386225
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 748703383
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1619468445
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -501054007
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("w")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("as")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1355078825
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -755638967
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1296170399
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -726353325
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1724975033
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1777796537
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("at")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ay")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -573659203
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1835981575
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -92688065
	)
	int field4772;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -201245539
	)
	int field4771;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1222606143
	)
	int field4793;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1330753451
	)
	int field4773;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 1000609109570499235L
	)
	long field4774;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2020869527
	)
	int field4788;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1001833691
	)
	int field4776;
	@ObfuscatedName("ah")
	boolean field4777;
	@ObfuscatedName("aq")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ap")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("aa")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ae")
	HashSet field4782;
	@ObfuscatedName("ac")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1283663091
	)
	int field4784;
	@ObfuscatedName("bf")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bo")
	List field4786;
	@ObfuscatedName("by")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bw")
	HashSet field4780;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bc")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 157893557
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -957451687
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1345620925
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1786908065
	)
	int field4779;

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
		this.field4772 = -1; // L: 76
		this.field4771 = -1; // L: 77
		this.field4793 = -1; // L: 78
		this.field4773 = -1; // L: 79
		this.field4777 = true; // L: 83
		this.enabledElements = new HashSet(); // L: 86
		this.enabledCategories = new HashSet(); // L: 87
		this.enabledElementIds = new HashSet(); // L: 88
		this.field4782 = new HashSet(); // L: 89
		this.elementsDisabled = false; // L: 90
		this.field4784 = 0; // L: 91
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 93
		this.field4780 = new HashSet(); // L: 96
		this.mouseCoord = null; // L: 97
		this.showCoord = false; // L: 98
		this.minCachedTileX = -1; // L: 101
		this.minCachedTileY = -1; // L: 102
		this.field4779 = -1; // L: 103
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;Lly;Lnv;Ljava/util/HashMap;[Lra;I)V",
		garbageValue = "1665959363"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3010.name); // L: 117
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
		this.field4751 = null; // L: 130
	} // L: 131

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "65"
	)
	public void method7989() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "-80"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method5108(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); WorldMapElement.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field4780.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field4780.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						WorldMapElement.runScriptEvent(var14); // L: 176
					}
				}

				this.field4780 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "2093168395"
	)
	public void method7991(int var1, int var2, boolean var3, boolean var4) {
		long var5 = Message.method1197(); // L: 184
		this.method7992(var1, var2, var4, var5); // L: 185
		if (!this.hasTarget() && (var4 || var3) && !class213.method4420()) { // L: 186
			if (var4) { // L: 187
				this.field4793 = var1; // L: 188
				this.field4773 = var2; // L: 189
				this.field4772 = this.centerTileX; // L: 190
				this.field4771 = this.centerTileY; // L: 191
			}

			if (this.field4772 != -1) { // L: 193
				int var7 = var1 - this.field4793; // L: 194
				int var8 = var2 - this.field4773; // L: 195
				this.setWorldMapPosition(this.field4772 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4771, false); // L: 196
			}
		} else {
			this.method7996(); // L: 200
		}

		if (var4) { // L: 202
			this.field4774 = var5; // L: 203
			this.field4788 = var1; // L: 204
			this.field4776 = var2; // L: 205
		}

	} // L: 207

	@ObfuscatedName("m")
	void method7992(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 210
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 211
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 212
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 213
			if (this.mouseCoord != null && var3) { // L: 214
				class201 var8 = Client.field747; // L: 217
				int var11;
				int var12;
				if (TaskHandler.method3443() && var8.method4106(82) && var8.method4106(81)) { // L: 220
					int var15 = this.mouseCoord.x; // L: 221
					var11 = this.mouseCoord.y; // L: 222
					var12 = this.mouseCoord.plane; // L: 223
					PacketBufferNode var13 = class136.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 226
					var13.packetBuffer.method8607(var11); // L: 227
					var13.packetBuffer.method8578(var12); // L: 228
					var13.packetBuffer.writeIntME(var15); // L: 229
					var13.packetBuffer.method8601(0); // L: 230
					Client.packetWriter.addNode(var13); // L: 231
				} else {
					boolean var10 = true; // L: 235
					if (this.field4777) { // L: 236
						var11 = var1 - this.field4788; // L: 237
						var12 = var2 - this.field4776; // L: 238
						if (var4 - this.field4774 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 239
							var10 = false; // L: 240
						}
					}

					if (var10) { // L: 243
						PacketBufferNode var14 = class136.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 244
						var14.packetBuffer.method8536(this.mouseCoord.packed()); // L: 245
						Client.packetWriter.addNode(var14); // L: 246
						this.field4774 = 0L; // L: 247
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 252
		}

	} // L: 253

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2010500013"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (GameEngine.field241 != null) { // L: 256
			this.zoom = this.zoomTarget; // L: 257
		} else {
			if (this.zoom < this.zoomTarget) { // L: 260
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 261
			}

			if (this.zoom > this.zoomTarget) { // L: 263
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 264
			}

		}
	} // L: 258 266

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 269
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 272
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 273
			if (var1 != 0) { // L: 274
				var1 /= Math.min(8, Math.abs(var1)); // L: 275
			}

			if (var2 != 0) { // L: 277
				var2 /= Math.min(8, Math.abs(var2)); // L: 278
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 280
			if (this.worldMapTargetX == this.centerTileX && this.worldMapTargetY == this.centerTileY) { // L: 281
				this.worldMapTargetX = -1; // L: 282
				this.worldMapTargetY = -1; // L: 283
			}

		}
	} // L: 270 285

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-91"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 288
		this.centerTileY = var2; // L: 289
		Message.method1197(); // L: 290
		if (var3) {
			this.method7996(); // L: 291
		}

	} // L: 292

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	final void method7996() {
		this.field4773 = -1; // L: 295
		this.field4793 = -1; // L: 296
		this.field4771 = -1; // L: 297
		this.field4772 = -1; // L: 298
	} // L: 299

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1536679262"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 302
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lit;",
		garbageValue = "-1244310700"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 306

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 314
			}

			var5 = (WorldMapArea)var4.next(); // L: 307
		} while(!var5.containsCoord(var1, var2, var3)); // L: 309

		return var5; // L: 310
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-45"
	)
	public void method7999(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 318
		if (var5 == null) { // L: 319
			if (!var4) { // L: 320
				return; // L: 323
			}

			var5 = this.mainMapArea; // L: 321
		}

		boolean var6 = false; // L: 325
		if (var5 != this.field4751 || var4) { // L: 326
			this.field4751 = var5; // L: 327
			this.setCurrentMapArea(var5); // L: 328
			var6 = true; // L: 329
		}

		if (var6 || var4) { // L: 331
			this.jump(var1, var2, var3); // L: 332
		}

	} // L: 334

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-507902482"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 337
		if (var2 != null) { // L: 338
			this.setCurrentMapArea(var2); // L: 339
		}

	} // L: 341

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "721663049"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 344 345 347
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lit;",
		garbageValue = "-1298329417"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 351
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lit;I)V",
		garbageValue = "182380675"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 355
			this.initializeWorldMapManager(var1); // L: 358
			this.jump(-1, -1, -1); // L: 359
		}
	} // L: 356 360

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lit;I)V",
		garbageValue = "-728911285"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 363
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 364
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 365
	} // L: 366

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lit;Lky;Lky;ZB)V",
		garbageValue = "-23"
	)
	public void method8046(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 369
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 372
				this.initializeWorldMapManager(var1); // L: 373
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 375
				this.jump(var2.plane, var2.x, var2.y); // L: 379
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 376
			}

		}
	} // L: 370 381

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-27723907"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 384
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 387
			if (var4 == null) { // L: 388
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 389
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 391
			this.worldMapTargetX = -1; // L: 392
			this.worldMapTargetY = -1; // L: 393
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 394
			this.zoomTarget = this.zoom; // L: 395
			this.field4786 = null; // L: 396
			this.iconIterator = null; // L: 397
			this.worldMapManager.clearIcons(); // L: 398
		}
	} // L: 385 399

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "12"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 402
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 403
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 404
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 405
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 406
		if (var7 < 100) { // L: 407
			this.drawLoading(var1, var2, var3, var4, var7); // L: 408
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 411
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 412
				if (!this.worldMapManager.isLoaded()) { // L: 413
					return; // L: 414
				}
			}

			if (this.flashingElements != null) { // L: 417
				++this.flashCycle; // L: 418
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 419
					this.flashCycle = 0; // L: 420
					++this.flashCount; // L: 421
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 423
					this.flashingElements = null; // L: 424
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 427
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 428
			AbstractWorldMapData.field2953 = Client.field515 >= 209; // L: 429
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 430
			if (!this.elementsDisabled) { // L: 431
				boolean var10 = false; // L: 432
				if (var5 - this.field4784 > 100) { // L: 433
					this.field4784 = var5; // L: 434
					var10 = true; // L: 435
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4782, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 437
			}

			this.method8033(var1, var2, var3, var4, var8, var9); // L: 439
			if (TaskHandler.method3443() && this.showCoord && this.mouseCoord != null) { // L: 440
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 441
			this.worldMapDisplayHeight = var9; // L: 442
			this.worldMapDisplayX = var1; // L: 443
			this.worldMapDisplayY = var2; // L: 444
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 445
		}
	} // L: 409 446

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "433512855"
	)
	boolean method8072(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 449
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 450
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 451
				return true;
			} else if (this.field4779 != Client.field801) {
				return true; // L: 452
			} else if (var3 <= 0 && var4 <= 0) { // L: 453
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 454
			} else {
				return true; // L: 455
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "48"
	)
	void method8033(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (GameEngine.field241 != null) { // L: 459
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 460
			int var8 = var3 + 512; // L: 461
			int var9 = var4 + 512; // L: 462
			float var10 = 1.0F; // L: 463
			var8 = (int)((float)var8 / var10); // L: 464
			var9 = (int)((float)var9 / var10); // L: 465
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 466
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 467
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 468
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 469
			if (this.method8072(var8, var9, var13, var14, var3, var4)) { // L: 470
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 471
					Arrays.fill(this.sprite.pixels, 0); // L: 474
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 472
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 475
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 476
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 477
				GameEngine.field241.method6668(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 478
				this.field4779 = Client.field801; // L: 479
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 480
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 481
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 483
			if (var10 == 1.0F) { // L: 484
				this.sprite.method9022(var13, var14, 192); // L: 485
			} else {
				this.sprite.method9024(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192); // L: 488
			}
		}

	} // L: 491

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "6700"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 494
			if (!this.worldMapManager.isLoaded()) { // L: 497
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 498
				if (!this.worldMapManager.isLoaded()) { // L: 499
					return; // L: 500
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 503
		}
	} // L: 495 504

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "300290373"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 507
	} // L: 508

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1152100668"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 511
		int var7 = var3 / 2 + var1; // L: 512
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 513
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 514
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 515
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 516
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 517
	} // L: 518

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-637752024"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 521
			return 1.0F;
		} else if (var1 == 37) { // L: 522
			return 1.5F;
		} else if (var1 == 50) { // L: 523
			return 2.0F;
		} else if (var1 == 75) { // L: 524
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 525 526
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 530
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 531
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 532
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 533
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 534 535
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "147"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 539
	} // L: 540

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "116"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 543
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-57693524"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 547

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 555
			}

			var3 = (WorldMapArea)var2.next(); // L: 548
		} while(var3.getId() != var1); // L: 550

		return var3; // L: 551
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1268402708"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 559
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 562
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 563
		}
	} // L: 560 564

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "8633"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 567
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 570
			this.worldMapTargetX = -1; // L: 571
			this.worldMapTargetY = -1; // L: 572
		}
	} // L: 568 573

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-117"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 576
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 579
			if (var4 != null) { // L: 580
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 581
			}

		}
	} // L: 577 583

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-806221160"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 586
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 589
			if (var4 != null) { // L: 590
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 591
			}

		}
	} // L: 587 593

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1261069561"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 596 597 599
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1276143435"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 603 604 606
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "-2028629896"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 610 611 613
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 617
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1743365451"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 621
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "223954080"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 625
			this.maxFlashCount = var1; // L: 626
		}

	} // L: 628

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2095954039"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 631
	} // L: 632

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1433856444"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 635
			this.cyclesPerFlash = var1; // L: 636
		}

	} // L: 638

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "123012858"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 641
	} // L: 642

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "73"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 645
	} // L: 646

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 649
		this.flashingElements.add(var1); // L: 650
		this.flashCount = 0; // L: 651
		this.flashCycle = 0; // L: 652
	} // L: 653

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-22102173"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 656
		this.flashCount = 0; // L: 657
		this.flashCycle = 0; // L: 658

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 659
			if (JagexCache.WorldMapElement_get(var2) != null && JagexCache.WorldMapElement_get(var2).category == var1) { // L: 660 663
				this.flashingElements.add(JagexCache.WorldMapElement_get(var2).objectId); // L: 664
			}
		}

	} // L: 667

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "684707173"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 670
	} // L: 671

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "532970017"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 674
	} // L: 675

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "96"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 678
			this.enabledElements.add(var1); // L: 679
		} else {
			this.enabledElements.remove(var1); // L: 682
		}

		this.method8039(); // L: 684
	} // L: 685

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1240383001"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 688
			this.enabledCategories.add(var1); // L: 689
		} else {
			this.enabledCategories.remove(var1); // L: 692
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 694
			if (JagexCache.WorldMapElement_get(var3) != null && JagexCache.WorldMapElement_get(var3).category == var1) { // L: 695 698
				int var4 = JagexCache.WorldMapElement_get(var3).objectId; // L: 699
				if (!var2) { // L: 700
					this.enabledElementIds.add(var4); // L: 701
				} else {
					this.enabledElementIds.remove(var4); // L: 704
				}
			}
		}

		this.method8039(); // L: 708
	} // L: 709

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "31025"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 712
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "741756632"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 716
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 720
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1750164070"
	)
	void method8039() {
		this.field4782.clear(); // L: 724
		this.field4782.addAll(this.enabledElements); // L: 725
		this.field4782.addAll(this.enabledElementIds); // L: 726
	} // L: 727

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "345816891"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 730
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 733
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 734
			List var9 = this.worldMapManager.method5108(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 735
			if (!var9.isEmpty()) { // L: 736
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 739
						return; // L: 755
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 740
					WorldMapElement var12 = JagexCache.WorldMapElement_get(var11.getElement()); // L: 742
					var13 = false; // L: 743

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 744
						if (var12.menuActions[var14] != null) { // L: 745
							ObjectSound.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 746
							var13 = true; // L: 747
						}
					}
				} while(!var13); // L: 750

			}
		}
	} // L: 731 737 751

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILky;I)Lky;",
		garbageValue = "1663996992"
	)
	public Coord method8041(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 758
			return null; // L: 759
		} else if (!this.worldMapManager.isLoaded()) { // L: 761
			return null; // L: 762
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 764
			return null; // L: 765
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 767
			List var4 = (List)var3.get(var1); // L: 768
			if (var4 != null && !var4.isEmpty()) { // L: 769
				AbstractWorldMapIcon var5 = null; // L: 772
				int var6 = -1; // L: 773
				Iterator var7 = var4.iterator(); // L: 774

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 789
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 775
						int var9 = var8.coord2.x - var2.x; // L: 777
						int var10 = var8.coord2.y - var2.y; // L: 778
						var11 = var9 * var9 + var10 * var10; // L: 779
						if (var11 == 0) { // L: 780
							return var8.coord2; // L: 781
						}
					} while(var11 >= var6 && var5 != null); // L: 783

					var5 = var8; // L: 784
					var6 = var11; // L: 785
				}
			} else {
				return null; // L: 770
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IILky;Lky;I)V",
		garbageValue = "334077152"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 793
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 794
		var5.setArgs(new Object[]{var6}); // L: 795
		switch(var1) { // L: 796
		case 1008:
			var5.setType(10); // L: 814
			break; // L: 815
		case 1009:
			var5.setType(11); // L: 819
			break;
		case 1010:
			var5.setType(12); // L: 809
			break; // L: 810
		case 1011:
			var5.setType(13); // L: 799
			break;
		case 1012:
			var5.setType(14); // L: 804
		}

		WorldMapElement.runScriptEvent(var5); // L: 823
	} // L: 824

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "1603094093"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 827
			return null; // L: 828
		} else if (!this.worldMapManager.isLoaded()) { // L: 830
			return null; // L: 831
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 833
			this.field4786 = new LinkedList(); // L: 834
			Iterator var2 = var1.values().iterator(); // L: 835

			while (var2.hasNext()) { // L: 840
				List var3 = (List)var2.next(); // L: 836
				this.field4786.addAll(var3); // L: 838
			}

			this.iconIterator = this.field4786.iterator(); // L: 841
			return this.iconNext(); // L: 842
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "1101774550"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 846
			return null; // L: 847
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 849
					return null; // L: 855
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 850
			} while(var1.getElement() == -1); // L: 851

			return var1; // L: 852
		}
	}
}
