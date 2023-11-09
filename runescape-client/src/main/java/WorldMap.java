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

@ObfuscatedName("sz")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ah")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("as")
	@Export("details")
	HashMap details;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	WorldMapArea field4847;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1403618189
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 238422199
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -353222109
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -396762593
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ai")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bp")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -850098137
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1181384723
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -254483935
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -2107826965
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -751752949
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 632407753
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bo")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("be")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1790689205
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -833761167
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -611828289
	)
	int field4868;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -732981209
	)
	int field4867;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 972426169
	)
	int field4876;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 16352121
	)
	int field4832;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = 8594336836151528743L
	)
	long field4870;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1310152761
	)
	int field4862;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1908325549
	)
	int field4872;
	@ObfuscatedName("bb")
	boolean field4878;
	@ObfuscatedName("bd")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bn")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("ba")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bj")
	HashSet field4877;
	@ObfuscatedName("br")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 860006419
	)
	int field4879;
	@ObfuscatedName("cr")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("ce")
	List field4881;
	@ObfuscatedName("cn")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cd")
	HashSet field4871;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cl")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -2110603567
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1100940125
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1584272967
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1123780581
	)
	int field4890;

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
		this.field4868 = -1; // L: 75
		this.field4867 = -1; // L: 76
		this.field4876 = -1; // L: 77
		this.field4832 = -1; // L: 78
		this.field4878 = true; // L: 82
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field4877 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field4879 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field4871 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.showCoord = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field4890 = -1; // L: 102
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;Lni;Lpa;Ljava/util/HashMap;[Lty;B)V",
		garbageValue = "-2"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 106
		this.WorldMap_archive = var1; // L: 107
		this.WorldMap_geographyArchive = var2; // L: 108
		this.WorldMap_groundArchive = var3; // L: 109
		this.font = var4; // L: 110
		this.fonts = new HashMap();
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 113
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 114
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 115
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3053.name); // L: 116
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
		this.field4847 = null; // L: 130
	} // L: 131

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	public void method8462() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "898460867"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method5302(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class260.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field4871.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field4871.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						class260.runScriptEvent(var14); // L: 176
					}
				}

				this.field4871 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "92"
	)
	public void method8446(int var1, int var2, boolean var3, boolean var4) {
		long var5 = Canvas.method310(); // L: 184
		this.method8447(var1, var2, var4, var5); // L: 185
		if (!this.hasTarget() && (var4 || var3) && !class4.method14()) { // L: 186
			if (var4) { // L: 187
				this.field4876 = var1; // L: 188
				this.field4832 = var2; // L: 189
				this.field4868 = this.centerTileX; // L: 190
				this.field4867 = this.centerTileY; // L: 191
			}

			if (this.field4868 != -1) { // L: 193
				int var7 = var1 - this.field4876; // L: 194
				int var8 = var2 - this.field4832; // L: 195
				this.setWorldMapPosition(this.field4868 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4867, false); // L: 196
			}
		} else {
			this.method8451(); // L: 200
		}

		if (var4) { // L: 202
			this.field4870 = var5; // L: 203
			this.field4862 = var1; // L: 204
			this.field4872 = var2; // L: 205
		}

	} // L: 207

	@ObfuscatedName("at")
	void method8447(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 210
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 211
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 212
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 213
			if (this.mouseCoord != null && var3) { // L: 214
				class211 var8 = Client.field759; // L: 217
				if (DevicePcmPlayerProvider.method300() && var8.method4087(82) && var8.method4087(81)) { // L: 220
					Decimator.method1104(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 221
				} else {
					boolean var10 = true; // L: 224
					if (this.field4878) { // L: 225
						int var11 = var1 - this.field4862; // L: 226
						int var12 = var2 - this.field4872; // L: 227
						if (var4 - this.field4870 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 228
							var10 = false; // L: 229
						}
					}

					if (var10) { // L: 232
						PacketBufferNode var13 = class251.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 233
						var13.packetBuffer.method9088(this.mouseCoord.packed()); // L: 234
						Client.packetWriter.addNode(var13); // L: 235
						this.field4870 = 0L; // L: 236
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 241
		}

	} // L: 242

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1703062874"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (HitSplatDefinition.field2141 != null) { // L: 245
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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
			if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) { // L: 270
				this.worldMapTargetX = -1; // L: 271
				this.worldMapTargetY = -1; // L: 272
			}

		}
	} // L: 259 274

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-986756726"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 277
		this.centerTileY = var2; // L: 278
		Canvas.method310(); // L: 279
		if (var3) {
			this.method8451(); // L: 280
		}

	} // L: 281

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	final void method8451() {
		this.field4832 = -1; // L: 284
		this.field4876 = -1; // L: 285
		this.field4867 = -1; // L: 286
		this.field4868 = -1; // L: 287
	} // L: 288

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-22"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 291
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lju;",
		garbageValue = "-1289682149"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 295

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) { // L: 302
				return null; // L: 303
			}

			var5 = (WorldMapArea)var4.next(); // L: 296
		} while(!var5.containsCoord(var1, var2, var3)); // L: 298

		return var5; // L: 299
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "2074269218"
	)
	public void method8444(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 307
		if (var5 == null) { // L: 308
			if (!var4) { // L: 309
				return; // L: 312
			}

			var5 = this.mainMapArea; // L: 310
		}

		boolean var6 = false; // L: 314
		if (var5 != this.field4847 || var4) { // L: 315
			this.field4847 = var5; // L: 316
			this.setCurrentMapArea(var5); // L: 317
			var6 = true; // L: 318
		}

		if (var6 || var4) { // L: 320
			this.jump(var1, var2, var3); // L: 321
		}

	} // L: 323

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 326
		if (var2 != null) { // L: 327
			this.setCurrentMapArea(var2); // L: 328
		}

	} // L: 330

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1729928232"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 333 334 336
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lju;",
		garbageValue = "18515035"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 340
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lju;B)V",
		garbageValue = "2"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 344
			this.initializeWorldMapManager(var1); // L: 347
			this.jump(-1, -1, -1); // L: 348
		}
	} // L: 345 349

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lju;I)V",
		garbageValue = "-1848325841"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 352
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 353
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 354
	} // L: 355

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lju;Lms;Lms;ZI)V",
		garbageValue = "1968232110"
	)
	public void method8551(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "16"
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
			this.field4881 = null; // L: 385
			this.iconIterator = null; // L: 386
			this.worldMapManager.clearIcons(); // L: 387
		}
	} // L: 374 388

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-123177183"
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
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 418
			if (!this.elementsDisabled) { // L: 419
				boolean var10 = false; // L: 420
				if (var5 - this.field4879 > 100) { // L: 421
					this.field4879 = var5; // L: 422
					var10 = true; // L: 423
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4877, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 425
			}

			this.method8464(var1, var2, var3, var4, var8, var9); // L: 427
			if (DevicePcmPlayerProvider.method300() && this.showCoord && this.mouseCoord != null) { // L: 428
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 429
			this.worldMapDisplayHeight = var9; // L: 430
			this.worldMapDisplayX = var1; // L: 431
			this.worldMapDisplayY = var2; // L: 432
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 433
		}
	} // L: 398 434

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "-68"
	)
	boolean method8463(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 437
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 438
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 439
				return true;
			} else if (this.field4890 != Client.field776) { // L: 440
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 441
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 442
			} else {
				return true; // L: 443
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1273782532"
	)
	void method8464(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (HitSplatDefinition.field2141 != null) { // L: 447
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 448
			int var8 = var3 + 512; // L: 449
			int var9 = var4 + 512; // L: 450
			float var10 = 1.0F; // L: 451
			var8 = (int)((float)var8 / var10); // L: 452
			var9 = (int)((float)var9 / var10); // L: 453
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 454
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 455
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 456
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 457
			if (this.method8463(var8, var9, var13, var14, var3, var4)) { // L: 458
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 459
					Arrays.fill(this.sprite.pixels, 0); // L: 462
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 460
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 463
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 464
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 465
				HitSplatDefinition.field2141.method6912(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 466
				this.field4890 = Client.field776; // L: 467
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 468
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 469
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 471
			if (var10 == 1.0F) { // L: 472
				this.sprite.method9441(var13, var14, 192); // L: 473
			} else {
				this.sprite.method9444(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 476
			}
		}

	} // L: 479

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2062987718"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 482
			if (!this.worldMapManager.isLoaded()) { // L: 485
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 486
				if (!this.worldMapManager.isLoaded()) { // L: 487
					return; // L: 488
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 491
		}
	} // L: 483 492

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-10572"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 495
	} // L: 496

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-92"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 499
		int var7 = var3 / 2 + var1; // L: 500
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 501
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 502
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 503
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 504
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 505
	} // L: 506

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "811623041"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 509
			return 1.0F;
		} else if (var1 == 37) { // L: 510
			return 1.5F;
		} else if (var1 == 50) { // L: 511
			return 2.0F;
		} else if (var1 == 75) { // L: 512
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 513 514
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "996134533"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 518
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 519
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 520
			return 50;
		} else if (3.0D == (double)this.zoomTarget) { // L: 521
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 522 523
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1256763100"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 527
	} // L: 528

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "61"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 531
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Lju;",
		garbageValue = "1393595081"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 535

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 543
			}

			var3 = (WorldMapArea)var2.next(); // L: 536
		} while(var3.getId() != var1); // L: 538

		return var3; // L: 539
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-41"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 547
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 550
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 551
		}
	} // L: 548 552

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "936051833"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 555
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 558
			this.worldMapTargetX = -1; // L: 559
			this.worldMapTargetY = -1; // L: 560
		}
	} // L: 556 561

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1354050115"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 564
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 567
			if (var4 != null) { // L: 568
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 569
			}

		}
	} // L: 565 571

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "112"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 574
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 577
			if (var4 != null) { // L: 578
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 579
			}

		}
	} // L: 575 581

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2095757267"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 584 585 587
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1732143583"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 591 592 594
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Lms;",
		garbageValue = "1"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 598 599 601
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 605
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2043413250"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 609
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1401970965"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 613
			this.maxFlashCount = var1; // L: 614
		}

	} // L: 616

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 619
	} // L: 620

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1940883533"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 623
			this.cyclesPerFlash = var1; // L: 624
		}

	} // L: 626

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 629
	} // L: 630

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1413341381"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 633
	} // L: 634

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1968396997"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 637
		this.flashingElements.add(var1); // L: 638
		this.flashCount = 0; // L: 639
		this.flashCycle = 0; // L: 640
	} // L: 641

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1799220081"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 644
		this.flashCount = 0; // L: 645
		this.flashCycle = 0; // L: 646

		for (int var2 = 0; var2 < class161.WorldMapElement_count; ++var2) { // L: 647
			if (class147.WorldMapElement_get(var2) != null && class147.WorldMapElement_get(var2).category == var1) { // L: 648 651
				this.flashingElements.add(class147.WorldMapElement_get(var2).objectId); // L: 652
			}
		}

	} // L: 655

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1950641719"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 658
	} // L: 659

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1752705938"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 662
	} // L: 663

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "917491849"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 666
			this.enabledElements.add(var1); // L: 667
		} else {
			this.enabledElements.remove(var1); // L: 670
		}

		this.method8502(); // L: 672
	} // L: 673

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "123"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 676
			this.enabledCategories.add(var1); // L: 677
		} else {
			this.enabledCategories.remove(var1); // L: 680
		}

		for (int var3 = 0; var3 < class161.WorldMapElement_count; ++var3) { // L: 682
			if (class147.WorldMapElement_get(var3) != null && class147.WorldMapElement_get(var3).category == var1) { // L: 683 686
				int var4 = class147.WorldMapElement_get(var3).objectId; // L: 687
				if (!var2) { // L: 688
					this.enabledElementIds.add(var4); // L: 689
				} else {
					this.enabledElementIds.remove(var4); // L: 692
				}
			}
		}

		this.method8502(); // L: 696
	} // L: 697

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-227242973"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 700
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "346755284"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 704
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1207028070"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 708
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	void method8502() {
		this.field4877.clear(); // L: 712
		this.field4877.addAll(this.enabledElements); // L: 713
		this.field4877.addAll(this.enabledElementIds); // L: 714
	} // L: 715

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "0"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 718
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 721
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 722
			List var9 = this.worldMapManager.method5302(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 723
			if (!var9.isEmpty()) { // L: 724
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 727
						return; // L: 743
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 728
					WorldMapElement var12 = class147.WorldMapElement_get(var11.getElement()); // L: 730
					var13 = false; // L: 731

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 732
						if (var12.menuActions[var14] != null) { // L: 733
							class388.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 734
							var13 = true; // L: 735
						}
					}
				} while(!var13); // L: 738

			}
		}
	} // L: 719 725 739

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(ILms;I)Lms;",
		garbageValue = "729418403"
	)
	public Coord method8498(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 746
			return null; // L: 747
		} else if (!this.worldMapManager.isLoaded()) { // L: 749
			return null; // L: 750
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 752
			return null; // L: 753
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 755
			List var4 = (List)var3.get(var1); // L: 756
			if (var4 != null && !var4.isEmpty()) { // L: 757
				AbstractWorldMapIcon var5 = null; // L: 760
				int var6 = -1; // L: 761
				Iterator var7 = var4.iterator(); // L: 762

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 777
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 763
						int var9 = var8.coord2.x - var2.x; // L: 765
						int var10 = var8.coord2.y - var2.y; // L: 766
						var11 = var9 * var9 + var10 * var10; // L: 767
						if (var11 == 0) { // L: 768
							return var8.coord2; // L: 769
						}
					} while(var11 >= var6 && var5 != null); // L: 771

					var5 = var8; // L: 772
					var6 = var11; // L: 773
				}
			} else {
				return null; // L: 758
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IILms;Lms;B)V",
		garbageValue = "61"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 781
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 782
		var5.setArgs(new Object[]{var6}); // L: 783
		switch(var1) { // L: 784
		case 1008:
			var5.setType(10); // L: 787
			break;
		case 1009:
			var5.setType(11); // L: 807
			break;
		case 1010:
			var5.setType(12); // L: 797
			break; // L: 798
		case 1011:
			var5.setType(13); // L: 792
			break; // L: 793
		case 1012:
			var5.setType(14); // L: 802
		}

		class260.runScriptEvent(var5); // L: 811
	} // L: 812

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)Lkx;",
		garbageValue = "94"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 815
			return null; // L: 816
		} else if (!this.worldMapManager.isLoaded()) { // L: 818
			return null; // L: 819
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 821
			this.field4881 = new LinkedList(); // L: 822
			Iterator var2 = var1.values().iterator(); // L: 823

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 824
				this.field4881.addAll(var3); // L: 826
			}

			this.iconIterator = this.field4881.iterator(); // L: 829
			return this.iconNext(); // L: 830
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(S)Lkx;",
		garbageValue = "256"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 834
			return null; // L: 835
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 837
					return null; // L: 843
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 838
			} while(var1.getElement() == -1); // L: 839

			return var1; // L: 840
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-87349135"
	)
	public static int method8636(int var0) {
		return 255 - (var0 & 255); // L: 111
	}
}
