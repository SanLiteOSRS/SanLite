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

@ObfuscatedName("tl")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ax")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("aj")
	@Export("details")
	HashMap details;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	WorldMapArea field5034;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 794279051
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -565689229
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1409230685
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1036497123
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ak")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bp")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -362082069
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 2008830735
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -886664503
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2100111929
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1760981221
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 446632919
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bo")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bx")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1527989167
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 651183449
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1271546775
	)
	int field5053;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -562744191
	)
	int field5054;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1829639347
	)
	int field5055;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 56350317
	)
	int field5072;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = -8158950987047012079L
	)
	long field5057;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1842932703
	)
	int field5058;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -103428547
	)
	int field5059;
	@ObfuscatedName("bt")
	boolean field5021;
	@ObfuscatedName("bw")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bm")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("ba")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bv")
	HashSet field5064;
	@ObfuscatedName("bg")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 171232517
	)
	int field5066;
	@ObfuscatedName("cr")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cy")
	List field5068;
	@ObfuscatedName("cg")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cl")
	HashSet field5070;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ci")
	public boolean field5031;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 295077879
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 219967895
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1194137575
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1815183219
	)
	int field5077;

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
		this.field5053 = -1; // L: 76
		this.field5054 = -1; // L: 77
		this.field5055 = -1; // L: 78
		this.field5072 = -1; // L: 79
		this.field5021 = true; // L: 83
		this.enabledElements = new HashSet(); // L: 86
		this.enabledCategories = new HashSet(); // L: 87
		this.enabledElementIds = new HashSet(); // L: 88
		this.field5064 = new HashSet(); // L: 89
		this.elementsDisabled = false; // L: 90
		this.field5066 = 0; // L: 91
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 93
		this.field5070 = new HashSet(); // L: 96
		this.mouseCoord = null; // L: 97
		this.field5031 = false; // L: 98
		this.minCachedTileX = -1; // L: 101
		this.minCachedTileY = -1; // L: 102
		this.field5077 = -1; // L: 103
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;Loc;Lpx;Ljava/util/HashMap;[Lvl;B)V",
		garbageValue = "-58"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3154.name); // L: 117
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
		this.field5034 = null; // L: 131
	} // L: 132

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	public void method8913() {
		class157.method3326(); // L: 135
	} // L: 136

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "1150921474"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 139
			this.smoothZoom(); // L: 142
			this.scrollToTarget(); // L: 143
			if (var3) { // L: 144
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 147
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 148
				List var10 = this.worldMapManager.method5489(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 149
				HashSet var11 = new HashSet(); // L: 150

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); AbstractWorldMapData.runScriptEvent(var14)) { // L: 151 164
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 152
					var11.add(var13); // L: 154
					var14 = new ScriptEvent(); // L: 155
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 156
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 157
					if (this.field5070.contains(var13)) { // L: 158
						var14.setType(17); // L: 159
					} else {
						var14.setType(15); // L: 162
					}
				}

				var12 = this.field5070.iterator(); // L: 167

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 168
					if (!var11.contains(var13)) { // L: 170
						var14 = new ScriptEvent(); // L: 171
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 172
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 173
						var14.setType(16); // L: 174
						AbstractWorldMapData.runScriptEvent(var14); // L: 175
					}
				}

				this.field5070 = var11; // L: 179
			}
		}
	} // L: 140 145 180

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "93"
	)
	public void method8843(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label39: {
			var5 = VerticalAlignment.method3924(); // L: 183
			this.method8859(var1, var2, var4, var5); // L: 184
			if (!this.hasTarget() && (var4 || var3)) { // L: 186
				boolean var7 = Client.clickedWidget != null; // L: 189
				if (!var7) { // L: 191
					if (var4) { // L: 192
						this.field5055 = var1; // L: 193
						this.field5072 = var2; // L: 194
						this.field5053 = this.centerTileX; // L: 195
						this.field5054 = this.centerTileY; // L: 196
					}

					if (this.field5053 != -1) { // L: 198
						int var8 = var1 - this.field5055; // L: 199
						int var9 = var2 - this.field5072; // L: 200
						this.setWorldMapPosition(this.field5053 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5054, false); // L: 201
					}
					break label39;
				}
			}

			this.method8716(); // L: 206
		}

		if (var4) { // L: 208
			this.field5057 = var5; // L: 209
			this.field5058 = var1; // L: 210
			this.field5059 = var2; // L: 211
		}

	} // L: 213

	@ObfuscatedName("an")
	void method8859(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 216
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 217
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 218
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 219
			if (this.mouseCoord != null && var3) { // L: 220
				class228 var8 = class522.method9126(); // L: 221
				if (class347.method6641() && var8.method4318(82) && var8.method4318(81)) { // L: 222
					HealthBarDefinition.method3818(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 223
				} else {
					boolean var9 = true; // L: 226
					if (this.field5021) { // L: 227
						int var10 = var1 - this.field5058; // L: 228
						int var11 = var2 - this.field5059; // L: 229
						if (var4 - this.field5057 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 230
							var9 = false; // L: 231
						}
					}

					if (var9) { // L: 234
						PacketBufferNode var12 = class425.getPacketBufferNode(ClientPacket.field3216, Client.packetWriter.isaacCipher); // L: 235
						var12.packetBuffer.method9315(this.mouseCoord.packed()); // L: 236
						Client.packetWriter.addNode(var12); // L: 237
						this.field5057 = 0L; // L: 238
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 243
		}

	} // L: 244

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1338389704"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class135.field1621 != null) { // L: 247
			this.zoom = this.zoomTarget; // L: 248
		} else {
			if (this.zoom < this.zoomTarget) { // L: 251
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 252
			}

			if (this.zoom > this.zoomTarget) { // L: 254
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 255
			}

		}
	} // L: 249 257

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 260
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 263
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 264
			if (var1 != 0) { // L: 265
				var1 /= Math.min(8, Math.abs(var1)); // L: 266
			}

			if (var2 != 0) { // L: 268
				var2 /= Math.min(8, Math.abs(var2)); // L: 269
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 271
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 272
				this.worldMapTargetX = -1; // L: 273
				this.worldMapTargetY = -1; // L: 274
			}

		}
	} // L: 261 276

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "946707645"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 279
		this.centerTileY = var2; // L: 280
		VerticalAlignment.method3924(); // L: 281
		if (var3) {
			this.method8716(); // L: 282
		}

	} // L: 283

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1697597972"
	)
	final void method8716() {
		this.field5072 = -1; // L: 286
		this.field5055 = -1; // L: 287
		this.field5054 = -1; // L: 288
		this.field5053 = -1; // L: 289
	} // L: 290

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1042578201"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 293
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lkf;",
		garbageValue = "-1242100761"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 297

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 305
			}

			var5 = (WorldMapArea)var4.next(); // L: 298
		} while(!var5.containsCoord(var1, var2, var3)); // L: 300

		return var5; // L: 301
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "4"
	)
	public void method8719(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 309
		if (var5 == null) { // L: 310
			if (!var4) { // L: 311
				return; // L: 314
			}

			var5 = this.mainMapArea; // L: 312
		}

		boolean var6 = false; // L: 316
		if (var5 != this.field5034 || var4) { // L: 317
			this.field5034 = var5; // L: 318
			this.setCurrentMapArea(var5); // L: 319
			var6 = true; // L: 320
		}

		if (var6 || var4) { // L: 322
			this.jump(var1, var2, var3); // L: 323
		}

	} // L: 325

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "91"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 328
		if (var2 != null) { // L: 329
			this.setCurrentMapArea(var2); // L: 330
		}

	} // L: 332

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 335 336 338
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lkf;",
		garbageValue = "968513950"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 342
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1723206488"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 346
			this.initializeWorldMapManager(var1); // L: 349
			this.jump(-1, -1, -1); // L: 350
		}
	} // L: 347 351

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "15"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 354
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 355
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 356
	} // L: 357

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lkf;Lnn;Lnn;ZI)V",
		garbageValue = "-327410404"
	)
	public void method8750(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 360
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 363
				this.initializeWorldMapManager(var1); // L: 364
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 366
				this.jump(var2.plane, var2.x, var2.y); // L: 370
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 367
			}

		}
	} // L: 361 372

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-256576246"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 375
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 378
			if (var4 == null) { // L: 379
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 380
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 382
			this.worldMapTargetX = -1; // L: 383
			this.worldMapTargetY = -1; // L: 384
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 385
			this.zoomTarget = this.zoom; // L: 386
			this.field5068 = null; // L: 387
			this.iconIterator = null; // L: 388
			this.worldMapManager.clearIcons(); // L: 389
		}
	} // L: 376 390

	@ObfuscatedName("av")
	public void method8727(int var1, int var2, int var3, int var4, int var5, double var6) {
		int[] var8 = new int[4]; // L: 393
		Rasterizer2D.Rasterizer2D_getClipArray(var8); // L: 394
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 395
		int var9 = this.cacheLoader.getPercentLoaded(); // L: 396
		if (var9 < 100) { // L: 397
			this.drawLoading(var1, var2, var3, var4, var9); // L: 398
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 401
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 402
				if (!this.worldMapManager.isLoaded()) { // L: 403
					return; // L: 404
				}
			}

			int var10 = class152.method3210(this.worldMapManager.method5492(), var6); // L: 407
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10); // L: 408
			if (this.flashingElements != null) { // L: 409
				++this.flashCycle; // L: 410
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 411
					this.flashCycle = 0; // L: 412
					++this.flashCount; // L: 413
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 415
					this.flashingElements = null; // L: 416
				}
			}

			int var11 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 419
			int var12 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 420
			this.worldMapManager.drawTiles(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 421
			if (!this.elementsDisabled) { // L: 422
				boolean var13 = false; // L: 423
				if (var5 - this.field5066 > 100) { // L: 424
					this.field5066 = var5; // L: 425
					var13 = true; // L: 426
				}

				this.worldMapManager.drawElements(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5064, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var13); // L: 428
			}

			this.method8730(var1, var2, var3, var4, var11, var12); // L: 430
			if (class347.method6641() && this.field5031 && this.mouseCoord != null) { // L: 431
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var11; // L: 432
			this.worldMapDisplayHeight = var12; // L: 433
			this.worldMapDisplayX = var1; // L: 434
			this.worldMapDisplayY = var2; // L: 435
			Rasterizer2D.Rasterizer2D_setClipArray(var8); // L: 436
		}
	} // L: 399 437

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	public void method8728() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 441
	} // L: 443

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "-51"
	)
	boolean method8833(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 446
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 447
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 448
				return true;
			} else if (this.field5077 != Client.field808) { // L: 449
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-664606114"
	)
	void method8730(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class135.field1621 != null) { // L: 456
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
			if (this.method8833(var8, var9, var13, var14, var3, var4)) { // L: 467
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 468
					Arrays.fill(this.sprite.pixels, 0); // L: 471
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 469
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 472
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 473
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 474
				class135.field1621.method7163(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 475
				this.field5077 = Client.field808; // L: 476
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 477
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 478
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 480
			if (1.0F == var10) { // L: 481
				this.sprite.method9795(var13, var14, 192); // L: 482
			} else {
				this.sprite.method9701(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192); // L: 485
			}
		}

	} // L: 488

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1677156033"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-16711936"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 504
	} // L: 505

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-84902061"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 508
		int var7 = var3 / 2 + var1; // L: 509
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 510
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 511
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 512
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 513
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 514
	} // L: 515

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1373747173"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 518
			return 1.0F;
		} else if (var1 == 37) { // L: 519
			return 1.5F;
		} else if (var1 == 50) { // L: 520
			return 2.0F;
		} else if (var1 == 75) { // L: 521
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 522 523
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "33510719"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.method8691(); // L: 536
	} // L: 537

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "702135416"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 540
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkf;",
		garbageValue = "-42"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 544

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 552
			}

			var3 = (WorldMapArea)var2.next(); // L: 545
		} while(var3.getId() != var1); // L: 547

		return var3; // L: 548
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "534042384"
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
		garbageValue = "1820017280"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 564
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 567
			this.worldMapTargetX = -1; // L: 568
			this.worldMapTargetY = -1; // L: 569
		}
	} // L: 565 570

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "28"
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "6"
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1650030456"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 593 594 596
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "306884247"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 600 601 603
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "-191255511"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 607 608 610
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 614
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "758163537"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 618
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "116300273"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 622
			this.maxFlashCount = var1; // L: 623
		}

	} // L: 625

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2095216786"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 628
	} // L: 629

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-39076550"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 632
			this.cyclesPerFlash = var1; // L: 633
		}

	} // L: 635

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-606239666"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 638
	} // L: 639

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1930099249"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 642
	} // L: 643

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1115639681"
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
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 653
		this.flashCount = 0; // L: 654
		this.flashCycle = 0; // L: 655

		for (int var2 = 0; var2 < UserComparator1.WorldMapElement_count; ++var2) { // L: 656
			if (class340.WorldMapElement_get(var2) != null && class340.WorldMapElement_get(var2).category == var1) { // L: 657 660
				this.flashingElements.add(class340.WorldMapElement_get(var2).objectId); // L: 661
			}
		}

	} // L: 664

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1786919552"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 667
	} // L: 668

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1743867014"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 671
	} // L: 672

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2006332486"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 675
			this.enabledElements.add(var1); // L: 676
		} else {
			this.enabledElements.remove(var1); // L: 679
		}

		this.method8762(); // L: 681
	} // L: 682

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "219922923"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 685
			this.enabledCategories.add(var1); // L: 686
		} else {
			this.enabledCategories.remove(var1); // L: 689
		}

		for (int var3 = 0; var3 < UserComparator1.WorldMapElement_count; ++var3) { // L: 691
			if (class340.WorldMapElement_get(var3) != null && class340.WorldMapElement_get(var3).category == var1) { // L: 692 695
				int var4 = class340.WorldMapElement_get(var3).objectId; // L: 696
				if (!var2) { // L: 697
					this.enabledElementIds.add(var4); // L: 698
				} else {
					this.enabledElementIds.remove(var4); // L: 701
				}
			}
		}

		this.method8762(); // L: 705
	} // L: 706

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1546918429"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 709
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "82"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 713
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1979864599"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 717
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1506161499"
	)
	void method8762() {
		this.field5064.clear(); // L: 721
		this.field5064.addAll(this.enabledElements); // L: 722
		this.field5064.addAll(this.enabledElementIds); // L: 723
	} // L: 724

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1753284485"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 727
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 730
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 731
			List var9 = this.worldMapManager.method5489(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 732
			if (!var9.isEmpty()) { // L: 733
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 736
						return; // L: 752
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 737
					WorldMapElement var12 = class340.WorldMapElement_get(var11.getElement()); // L: 739
					var13 = false; // L: 740

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 741
						if (var12.menuActions[var14] != null) { // L: 742
							Interpreter.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 743
							var13 = true; // L: 744
						}
					}
				} while(!var13); // L: 747

			}
		}
	} // L: 728 734 748

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILnn;I)Lnn;",
		garbageValue = "1297140528"
	)
	public Coord method8764(int var1, Coord var2) {
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
						var11 = var10 * var10 + var9 * var9; // L: 776
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IILnn;Lnn;I)V",
		garbageValue = "351358883"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 790
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 791
		var5.setArgs(new Object[]{var6}); // L: 792
		switch(var1) { // L: 793
		case 1008:
			var5.setType(10); // L: 811
			break; // L: 812
		case 1009:
			var5.setType(11); // L: 806
			break; // L: 807
		case 1010:
			var5.setType(12); // L: 801
			break; // L: 802
		case 1011:
			var5.setType(13); // L: 816
			break;
		case 1012:
			var5.setType(14); // L: 796
		}

		AbstractWorldMapData.runScriptEvent(var5); // L: 820
	} // L: 821

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;",
		garbageValue = "67"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 824
			return null; // L: 825
		} else if (!this.worldMapManager.isLoaded()) { // L: 827
			return null; // L: 828
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 830
			this.field5068 = new LinkedList(); // L: 831
			Iterator var2 = var1.values().iterator(); // L: 832

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 833
				this.field5068.addAll(var3); // L: 835
			}

			this.iconIterator = this.field5068.iterator(); // L: 838
			return this.iconNext(); // L: 839
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;",
		garbageValue = "7"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)V",
		garbageValue = "-1312697689"
	)
	public static void method8917(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		class183.field1945 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20
}
