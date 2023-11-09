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

@ObfuscatedName("rb")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ai")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Ltc;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ah")
	@Export("details")
	HashMap details;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	WorldMapArea field4845;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -84102297
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -632186207
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 506744801
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1744520039
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ap")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("by")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1222006759
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1077411767
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 817997135
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1710969485
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1444238761
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1369293643
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bz")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bm")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 676356035
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1104873149
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1960645157
	)
	int field4847;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1246558373
	)
	int field4856;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -642077217
	)
	int field4813;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2058412227
	)
	int field4850;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = 492133368256496125L
	)
	long field4851;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1959248683
	)
	int field4852;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1379608603
	)
	int field4853;
	@ObfuscatedName("bq")
	boolean field4819;
	@ObfuscatedName("bl")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bp")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bc")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bh")
	HashSet field4858;
	@ObfuscatedName("bw")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 460446351
	)
	int field4860;
	@ObfuscatedName("cs")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cc")
	List field4862;
	@ObfuscatedName("cn")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("ca")
	HashSet field4837;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ck")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1547438523
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 334129421
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 627335149
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 2016965279
	)
	int field4871;

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
		this.field4847 = -1; // L: 75
		this.field4856 = -1; // L: 76
		this.field4813 = -1; // L: 77
		this.field4850 = -1; // L: 78
		this.field4819 = true; // L: 82
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field4858 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field4860 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field4837 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.showCoord = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field4871 = -1; // L: 102
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;Lnm;Lon;Ljava/util/HashMap;[Ltc;I)V",
		garbageValue = "87285163"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3054.name); // L: 116
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
		this.field4845 = null; // L: 130
	} // L: 131

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1355740161"
	)
	public void method8471() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-529416730"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method5307(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); HealthBarUpdate.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field4837.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field4837.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						HealthBarUpdate.runScriptEvent(var14); // L: 176
					}
				}

				this.field4837 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-591700137"
	)
	public void method8473(int var1, int var2, boolean var3, boolean var4) {
		long var5 = class96.method2634(); // L: 184
		this.method8474(var1, var2, var4, var5); // L: 185
		if (!this.hasTarget() && (var4 || var3) && !InvDefinition.method3646()) { // L: 186
			if (var4) { // L: 187
				this.field4813 = var1; // L: 188
				this.field4850 = var2; // L: 189
				this.field4847 = this.centerTileX; // L: 190
				this.field4856 = this.centerTileY; // L: 191
			}

			if (this.field4847 != -1) { // L: 193
				int var7 = var1 - this.field4813; // L: 194
				int var8 = var2 - this.field4850; // L: 195
				this.setWorldMapPosition(this.field4847 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4856, false); // L: 196
			}
		} else {
			this.method8478(); // L: 200
		}

		if (var4) { // L: 202
			this.field4851 = var5; // L: 203
			this.field4852 = var1; // L: 204
			this.field4853 = var2; // L: 205
		}

	} // L: 207

	@ObfuscatedName("au")
	void method8474(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 210
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 211
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 212
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 213
			if (this.mouseCoord != null && var3) { // L: 214
				class207 var8 = Client.field721; // L: 217
				boolean var10 = Client.staffModLevel >= 2; // L: 222
				int var12;
				int var13;
				if (var10 && var8.method4229(82) && var8.method4229(81)) { // L: 224
					int var16 = this.mouseCoord.x; // L: 225
					var12 = this.mouseCoord.y; // L: 226
					var13 = this.mouseCoord.plane; // L: 227
					PacketBufferNode var14 = class330.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 230
					var14.packetBuffer.method9043(0); // L: 231
					var14.packetBuffer.method9096(var16); // L: 232
					var14.packetBuffer.method9086(var13); // L: 233
					var14.packetBuffer.method9257(var12); // L: 234
					Client.packetWriter.addNode(var14); // L: 235
				} else {
					boolean var11 = true; // L: 239
					if (this.field4819) { // L: 240
						var12 = var1 - this.field4852; // L: 241
						var13 = var2 - this.field4853; // L: 242
						if (var4 - this.field4851 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) { // L: 243
							var11 = false; // L: 244
						}
					}

					if (var11) { // L: 247
						PacketBufferNode var15 = class330.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 248
						var15.packetBuffer.writeIntME(this.mouseCoord.packed()); // L: 249
						Client.packetWriter.addNode(var15); // L: 250
						this.field4851 = 0L; // L: 251
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 256
		}

	} // L: 257

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "796336724"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class132.field1585 != null) { // L: 260
			this.zoom = this.zoomTarget; // L: 261
		} else {
			if (this.zoom < this.zoomTarget) { // L: 264
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 265
			}

			if (this.zoom > this.zoomTarget) { // L: 267
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 268
			}

		}
	} // L: 262 270

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1737092003"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 273
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 276
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 277
			if (var1 != 0) { // L: 278
				var1 /= Math.min(8, Math.abs(var1)); // L: 279
			}

			if (var2 != 0) { // L: 281
				var2 /= Math.min(8, Math.abs(var2)); // L: 282
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 284
			if (this.worldMapTargetX == this.centerTileX && this.worldMapTargetY == this.centerTileY) { // L: 285
				this.worldMapTargetX = -1; // L: 286
				this.worldMapTargetY = -1; // L: 287
			}

		}
	} // L: 274 289

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIZS)V",
		garbageValue = "254"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 292
		this.centerTileY = var2; // L: 293
		class96.method2634(); // L: 294
		if (var3) {
			this.method8478(); // L: 295
		}

	} // L: 296

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1514974800"
	)
	final void method8478() {
		this.field4850 = -1; // L: 299
		this.field4813 = -1; // L: 300
		this.field4856 = -1; // L: 301
		this.field4847 = -1; // L: 302
	} // L: 303

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1874644883"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 306
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ljs;",
		garbageValue = "2"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 310

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 318
			}

			var5 = (WorldMapArea)var4.next(); // L: 311
		} while(!var5.containsCoord(var1, var2, var3)); // L: 313

		return var5; // L: 314
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "15"
	)
	public void method8628(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 322
		if (var5 == null) { // L: 323
			if (!var4) { // L: 324
				return; // L: 327
			}

			var5 = this.mainMapArea; // L: 325
		}

		boolean var6 = false; // L: 329
		if (var5 != this.field4845 || var4) { // L: 330
			this.field4845 = var5; // L: 331
			this.setCurrentMapArea(var5); // L: 332
			var6 = true; // L: 333
		}

		if (var6 || var4) { // L: 335
			this.jump(var1, var2, var3); // L: 336
		}

	} // L: 338

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-230803045"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 341
		if (var2 != null) { // L: 342
			this.setCurrentMapArea(var2); // L: 343
		}

	} // L: 345

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "307100006"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 348 349 351
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljs;",
		garbageValue = "76"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 355
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "-1483320853"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 359
			this.initializeWorldMapManager(var1); // L: 362
			this.jump(-1, -1, -1); // L: 363
		}
	} // L: 360 364

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "1081617147"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 367
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 368
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 369
	} // L: 370

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljs;Llb;Llb;ZI)V",
		garbageValue = "2112134948"
	)
	public void method8508(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 373
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 376
				this.initializeWorldMapManager(var1); // L: 377
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 379
				this.jump(var2.plane, var2.x, var2.y); // L: 383
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 380
			}

		}
	} // L: 374 385

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1605938577"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 388
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 391
			if (var4 == null) { // L: 392
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 393
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 395
			this.worldMapTargetX = -1; // L: 396
			this.worldMapTargetY = -1; // L: 397
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 398
			this.zoomTarget = this.zoom; // L: 399
			this.field4862 = null; // L: 400
			this.iconIterator = null; // L: 401
			this.worldMapManager.clearIcons(); // L: 402
		}
	} // L: 389 403

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2111380198"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 406
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 407
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 408
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 409
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 410
		if (var7 < 100) { // L: 411
			this.drawLoading(var1, var2, var3, var4, var7); // L: 412
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 415
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 416
				if (!this.worldMapManager.isLoaded()) { // L: 417
					return; // L: 418
				}
			}

			if (this.flashingElements != null) { // L: 421
				++this.flashCycle; // L: 422
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 423
					this.flashCycle = 0; // L: 424
					++this.flashCount; // L: 425
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 427
					this.flashingElements = null; // L: 428
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 431
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 432
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 433
			boolean var10;
			if (!this.elementsDisabled) { // L: 434
				var10 = false; // L: 435
				if (var5 - this.field4860 > 100) { // L: 436
					this.field4860 = var5; // L: 437
					var10 = true; // L: 438
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4858, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 440
			}

			this.method8491(var1, var2, var3, var4, var8, var9); // L: 442
			var10 = Client.staffModLevel >= 2; // L: 445
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 447
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 448
			this.worldMapDisplayHeight = var9; // L: 449
			this.worldMapDisplayX = var1; // L: 450
			this.worldMapDisplayY = var2; // L: 451
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 452
		}
	} // L: 413 453

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-879179620"
	)
	boolean method8528(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 456
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 457
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 458
				return true;
			} else if (this.field4871 != Client.field781) { // L: 459
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 460
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 461
			} else {
				return true; // L: 462
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1052800047"
	)
	void method8491(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class132.field1585 != null) { // L: 466
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 467
			int var8 = var3 + 512; // L: 468
			int var9 = var4 + 512; // L: 469
			float var10 = 1.0F; // L: 470
			var8 = (int)((float)var8 / var10); // L: 471
			var9 = (int)((float)var9 / var10); // L: 472
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 473
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 474
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 475
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 476
			if (this.method8528(var8, var9, var13, var14, var3, var4)) { // L: 477
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 478
					Arrays.fill(this.sprite.pixels, 0); // L: 481
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 479
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 482
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 483
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 484
				class132.field1585.method6902(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 485
				this.field4871 = Client.field781; // L: 486
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 487
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 488
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 490
			if (1.0F == var10) { // L: 491
				this.sprite.method9576(var13, var14, 192); // L: 492
			} else {
				this.sprite.method9509(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192); // L: 495
			}
		}

	} // L: 498

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "19"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 501
			if (!this.worldMapManager.isLoaded()) { // L: 504
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 505
				if (!this.worldMapManager.isLoaded()) { // L: 506
					return; // L: 507
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 510
		}
	} // L: 502 511

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-326136881"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 514
	} // L: 515

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2130359390"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 518
		int var7 = var3 / 2 + var1; // L: 519
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 520
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 521
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 522
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 523
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 524
	} // L: 525

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "271609225"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 528
			return 1.0F;
		} else if (var1 == 37) { // L: 529
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 530
		} else if (var1 == 75) { // L: 531
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 532 533
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) { // L: 537
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 538
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 539
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 540
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 541 542
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "216165054"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 546
	} // L: 547

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "142682982"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 550
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Ljs;",
		garbageValue = "-1827173071"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 554

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 562
			}

			var3 = (WorldMapArea)var2.next(); // L: 555
		} while(var3.getId() != var1); // L: 557

		return var3; // L: 558
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-80"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 566
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 569
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 570
		}
	} // L: 567 571

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "210272527"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 574
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 577
			this.worldMapTargetX = -1; // L: 578
			this.worldMapTargetY = -1; // L: 579
		}
	} // L: 575 580

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "103"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 583
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 586
			if (var4 != null) { // L: 587
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 588
			}

		}
	} // L: 584 590

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-319768384"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 593
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 596
			if (var4 != null) { // L: 597
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 598
			}

		}
	} // L: 594 600

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1755924564"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 603 604 606
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 610 611 613
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Llb;",
		garbageValue = "1721001715"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 617 618 620
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "103"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 624
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-947809621"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 628
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "88"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 632
			this.maxFlashCount = var1; // L: 633
		}

	} // L: 635

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 638
	} // L: 639

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 642
			this.cyclesPerFlash = var1; // L: 643
		}

	} // L: 645

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1035925725"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 648
	} // L: 649

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1485750131"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 652
	} // L: 653

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "185156955"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 656
		this.flashingElements.add(var1); // L: 657
		this.flashCount = 0; // L: 658
		this.flashCycle = 0; // L: 659
	} // L: 660

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "679532809"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 663
		this.flashCount = 0; // L: 664
		this.flashCycle = 0; // L: 665

		for (int var2 = 0; var2 < class328.WorldMapElement_count; ++var2) { // L: 666
			if (class354.WorldMapElement_get(var2) != null && class354.WorldMapElement_get(var2).category == var1) { // L: 667 670
				this.flashingElements.add(class354.WorldMapElement_get(var2).objectId); // L: 671
			}
		}

	} // L: 674

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "530218621"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 677
	} // L: 678

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "606617490"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 681
	} // L: 682

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1622935645"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 685
			this.enabledElements.add(var1); // L: 686
		} else {
			this.enabledElements.remove(var1); // L: 689
		}

		this.method8589(); // L: 691
	} // L: 692

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "21329646"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 695
			this.enabledCategories.add(var1); // L: 696
		} else {
			this.enabledCategories.remove(var1); // L: 699
		}

		for (int var3 = 0; var3 < class328.WorldMapElement_count; ++var3) { // L: 701
			if (class354.WorldMapElement_get(var3) != null && class354.WorldMapElement_get(var3).category == var1) { // L: 702 705
				int var4 = class354.WorldMapElement_get(var3).objectId; // L: 706
				if (!var2) { // L: 707
					this.enabledElementIds.add(var4); // L: 708
				} else {
					this.enabledElementIds.remove(var4); // L: 711
				}
			}
		}

		this.method8589(); // L: 715
	} // L: 716

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "480"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 719
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-939989355"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 723
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-101"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 727
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	void method8589() {
		this.field4858.clear(); // L: 731
		this.field4858.addAll(this.enabledElements); // L: 732
		this.field4858.addAll(this.enabledElementIds); // L: 733
	} // L: 734

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-746729453"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 737
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 740
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 741
			List var9 = this.worldMapManager.method5307(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 742
			if (!var9.isEmpty()) { // L: 743
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 746
						return; // L: 762
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 747
					WorldMapElement var12 = class354.WorldMapElement_get(var11.getElement()); // L: 749
					var13 = false; // L: 750

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 751
						if (var12.menuActions[var14] != null) { // L: 752
							MenuAction.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 753
							var13 = true; // L: 754
						}
					}
				} while(!var13); // L: 757

			}
		}
	} // L: 738 744 758

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILlb;I)Llb;",
		garbageValue = "-809326825"
	)
	public Coord method8660(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 765
			return null; // L: 766
		} else if (!this.worldMapManager.isLoaded()) { // L: 768
			return null; // L: 769
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 771
			return null; // L: 772
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 774
			List var4 = (List)var3.get(var1); // L: 775
			if (var4 != null && !var4.isEmpty()) { // L: 776
				AbstractWorldMapIcon var5 = null; // L: 779
				int var6 = -1; // L: 780
				Iterator var7 = var4.iterator(); // L: 781

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 796
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 782
						int var9 = var8.coord2.x - var2.x; // L: 784
						int var10 = var8.coord2.y - var2.y; // L: 785
						var11 = var9 * var9 + var10 * var10; // L: 786
						if (var11 == 0) { // L: 787
							return var8.coord2; // L: 788
						}
					} while(var11 >= var6 && var5 != null); // L: 790

					var5 = var8; // L: 791
					var6 = var11; // L: 792
				}
			} else {
				return null; // L: 777
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IILlb;Llb;I)V",
		garbageValue = "-1912180740"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 800
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 801
		var5.setArgs(new Object[]{var6}); // L: 802
		switch(var1) { // L: 803
		case 1008:
			var5.setType(10); // L: 811
			break; // L: 812
		case 1009:
			var5.setType(11); // L: 816
			break;
		case 1010:
			var5.setType(12); // L: 826
			break;
		case 1011:
			var5.setType(13); // L: 821
			break; // L: 822
		case 1012:
			var5.setType(14); // L: 806
		}

		HealthBarUpdate.runScriptEvent(var5); // L: 830
	} // L: 831

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Lkg;",
		garbageValue = "-156037818"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 834
			return null; // L: 835
		} else if (!this.worldMapManager.isLoaded()) { // L: 837
			return null; // L: 838
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 840
			this.field4862 = new LinkedList(); // L: 841
			Iterator var2 = var1.values().iterator(); // L: 842

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 843
				this.field4862.addAll(var3); // L: 845
			}

			this.iconIterator = this.field4862.iterator(); // L: 848
			return this.iconNext(); // L: 849
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Lkg;",
		garbageValue = "-14"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 853
			return null; // L: 854
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 856
					return null; // L: 862
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 857
			} while(var1.getElement() == -1); // L: 858

			return var1; // L: 859
		}
	}
}
