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

@ObfuscatedName("qf")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("m")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lrg;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("h")
	@Export("details")
	HashMap details;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	WorldMapArea field4775;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1537061305
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1170014177
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -707664571
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 574119903
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("y")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("af")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -54302221
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 893627559
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1042774927
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 213551861
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2126009923
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1428282463
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("at")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("aj")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -588816537
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1812932443
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -364678207
	)
	int field4794;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 24997925
	)
	int field4795;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1092313519
	)
	int field4796;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1057320749
	)
	int field4801;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 5072112181657406691L
	)
	long field4797;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1078577369
	)
	int field4799;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1803960029
	)
	int field4800;
	@ObfuscatedName("ae")
	boolean field4787;
	@ObfuscatedName("ab")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("an")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("am")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("as")
	HashSet field4805;
	@ObfuscatedName("ao")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -35562695
	)
	int field4798;
	@ObfuscatedName("bz")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("br")
	List field4809;
	@ObfuscatedName("bm")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("be")
	HashSet field4818;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bl")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1567657197
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -443062895
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 198888267
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1484417525
	)
	int field4816;

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
		this.field4794 = -1; // L: 76
		this.field4795 = -1; // L: 77
		this.field4796 = -1; // L: 78
		this.field4801 = -1; // L: 79
		this.field4787 = true; // L: 83
		this.enabledElements = new HashSet(); // L: 86
		this.enabledCategories = new HashSet(); // L: 87
		this.enabledElementIds = new HashSet(); // L: 88
		this.field4805 = new HashSet(); // L: 89
		this.elementsDisabled = false; // L: 90
		this.field4798 = 0; // L: 91
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 93
		this.field4818 = new HashSet(); // L: 96
		this.mouseCoord = null; // L: 97
		this.showCoord = false; // L: 98
		this.minCachedTileX = -1; // L: 101
		this.minCachedTileY = -1; // L: 102
		this.field4816 = -1; // L: 103
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;Lln;Lnv;Ljava/util/HashMap;[Lrg;B)V",
		garbageValue = "34"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3013.name); // L: 117
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
		this.field4775 = null; // L: 130
	} // L: 131

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	public void method8113() {
		World.method1830(); // L: 134
	} // L: 135

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "25"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method5156(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); WorldMapAreaData.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4818.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4818.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						WorldMapAreaData.runScriptEvent(var14); // L: 174
					}
				}

				this.field4818 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "-126"
	)
	public void method8115(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = class153.method3317(); // L: 182
			this.method8149(var1, var2, var4, var5); // L: 183
			if (!this.hasTarget() && (var4 || var3)) { // L: 185
				boolean var7 = Client.clickedWidget != null; // L: 188
				if (!var7) { // L: 190
					if (var4) { // L: 191
						this.field4796 = var1; // L: 192
						this.field4801 = var2; // L: 193
						this.field4794 = this.centerTileX; // L: 194
						this.field4795 = this.centerTileY; // L: 195
					}

					if (this.field4794 != -1) { // L: 197
						int var8 = var1 - this.field4796; // L: 198
						int var9 = var2 - this.field4801; // L: 199
						this.setWorldMapPosition(this.field4794 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4795, false); // L: 200
					}
					break label41;
				}
			}

			this.method8120(); // L: 205
		}

		if (var4) { // L: 207
			this.field4797 = var5; // L: 208
			this.field4799 = var1; // L: 209
			this.field4800 = var2; // L: 210
		}

	} // L: 212

	@ObfuscatedName("z")
	void method8149(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 215
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 216
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 217
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 218
			if (this.mouseCoord != null && var3) { // L: 219
				class205 var8 = Client.field702; // L: 222
				boolean var10 = Client.staffModLevel >= 2; // L: 227
				if (var10 && var8.method4143(82) && var8.method4143(81)) { // L: 229
					class168.method3487(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 230
				} else {
					boolean var11 = true; // L: 233
					if (this.field4787) { // L: 234
						int var12 = var1 - this.field4799; // L: 235
						int var13 = var2 - this.field4800; // L: 236
						if (var4 - this.field4797 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) { // L: 237
							var11 = false; // L: 238
						}
					}

					if (var11) { // L: 241
						PacketBufferNode var14 = Renderable.getPacketBufferNode(ClientPacket.field3073, Client.packetWriter.isaacCipher); // L: 242
						var14.packetBuffer.method8696(this.mouseCoord.packed()); // L: 243
						Client.packetWriter.addNode(var14); // L: 244
						this.field4797 = 0L; // L: 245
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 250
		}

	} // L: 251

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-93072878"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class136.field1633 != null) { // L: 254
			this.zoom = this.zoomTarget; // L: 255
		} else {
			if (this.zoom < this.zoomTarget) { // L: 258
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 259
			}

			if (this.zoom > this.zoomTarget) { // L: 261
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 262
			}

		}
	} // L: 256 264

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 267
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 270
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 271
			if (var1 != 0) { // L: 272
				var1 /= Math.min(8, Math.abs(var1)); // L: 273
			}

			if (var2 != 0) { // L: 275
				var2 /= Math.min(8, Math.abs(var2)); // L: 276
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 278
			if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) { // L: 279
				this.worldMapTargetX = -1; // L: 280
				this.worldMapTargetY = -1; // L: 281
			}

		}
	} // L: 268 283

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "16777215"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 286
		this.centerTileY = var2; // L: 287
		class153.method3317(); // L: 288
		if (var3) {
			this.method8120(); // L: 289
		}

	} // L: 290

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-551839852"
	)
	final void method8120() {
		this.field4801 = -1; // L: 293
		this.field4796 = -1; // L: 294
		this.field4795 = -1; // L: 295
		this.field4794 = -1; // L: 296
	} // L: 297

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-927578331"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 300
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lii;",
		garbageValue = "1229700088"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 304

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 312
			}

			var5 = (WorldMapArea)var4.next(); // L: 305
		} while(!var5.containsCoord(var1, var2, var3)); // L: 307

		return var5; // L: 308
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "60"
	)
	public void method8306(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 316
		if (var5 == null) { // L: 317
			if (!var4) { // L: 318
				return; // L: 321
			}

			var5 = this.mainMapArea; // L: 319
		}

		boolean var6 = false; // L: 323
		if (var5 != this.field4775 || var4) { // L: 324
			this.field4775 = var5; // L: 325
			this.setCurrentMapArea(var5); // L: 326
			var6 = true; // L: 327
		}

		if (var6 || var4) { // L: 329
			this.jump(var1, var2, var3); // L: 330
		}

	} // L: 332

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "457504951"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 335
		if (var2 != null) { // L: 336
			this.setCurrentMapArea(var2); // L: 337
		}

	} // L: 339

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1557630063"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 342 343 345
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lii;",
		garbageValue = "-1507356521"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 349
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lii;B)V",
		garbageValue = "-52"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 353
			this.initializeWorldMapManager(var1); // L: 356
			this.jump(-1, -1, -1); // L: 357
		}
	} // L: 354 358

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V",
		garbageValue = "-1465346013"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 361
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 362
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 363
	} // L: 364

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lii;Lko;Lko;ZI)V",
		garbageValue = "-1866070089"
	)
	public void method8298(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 367
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 370
				this.initializeWorldMapManager(var1); // L: 371
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 373
				this.jump(var2.plane, var2.x, var2.y); // L: 377
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 374
			}

		}
	} // L: 368 379

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "919622634"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 382
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 385
			if (var4 == null) { // L: 386
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 387
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 389
			this.worldMapTargetX = -1; // L: 390
			this.worldMapTargetY = -1; // L: 391
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 392
			this.zoomTarget = this.zoom; // L: 393
			this.field4809 = null; // L: 394
			this.iconIterator = null; // L: 395
			this.worldMapManager.clearIcons(); // L: 396
		}
	} // L: 383 397

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-93"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 400
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 401
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 402
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 403
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 404
		if (var7 < 100) { // L: 405
			this.drawLoading(var1, var2, var3, var4, var7); // L: 406
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 409
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 410
				if (!this.worldMapManager.isLoaded()) { // L: 411
					return; // L: 412
				}
			}

			if (this.flashingElements != null) { // L: 415
				++this.flashCycle; // L: 416
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 417
					this.flashCycle = 0; // L: 418
					++this.flashCount; // L: 419
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 421
					this.flashingElements = null; // L: 422
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 425
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 426
			AbstractWorldMapData.field2951 = Client.field505 >= 209; // L: 427
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 428
			boolean var10;
			if (!this.elementsDisabled) { // L: 429
				var10 = false; // L: 430
				if (var5 - this.field4798 > 100) { // L: 431
					this.field4798 = var5; // L: 432
					var10 = true; // L: 433
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4805, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 435
			}

			this.method8133(var1, var2, var3, var4, var8, var9); // L: 437
			var10 = Client.staffModLevel >= 2; // L: 440
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 442
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 443
			this.worldMapDisplayHeight = var9; // L: 444
			this.worldMapDisplayX = var1; // L: 445
			this.worldMapDisplayY = var2; // L: 446
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 447
		}
	} // L: 407 448

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "2017068327"
	)
	boolean method8132(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 451
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 452
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 453
				return true;
			} else if (this.field4816 != Client.field796) {
				return true; // L: 454
			} else if (var3 <= 0 && var4 <= 0) { // L: 455
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 456
			} else {
				return true; // L: 457
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1125583707"
	)
	void method8133(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class136.field1633 != null) { // L: 461
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 462
			int var8 = var3 + 512; // L: 463
			int var9 = var4 + 512; // L: 464
			float var10 = 1.0F; // L: 465
			var8 = (int)((float)var8 / var10); // L: 466
			var9 = (int)((float)var9 / var10); // L: 467
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 468
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 469
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 470
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 471
			if (this.method8132(var8, var9, var13, var14, var3, var4)) { // L: 472
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 473
					Arrays.fill(this.sprite.pixels, 0); // L: 476
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 474
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 477
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 478
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 479
				class136.field1633.method6760(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 480
				this.field4816 = Client.field796; // L: 481
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 482
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 483
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 485
			if (var10 == 1.0F) { // L: 486
				this.sprite.method9149(var13, var14, 192); // L: 487
			} else {
				this.sprite.method9112(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192); // L: 490
			}
		}

	} // L: 493

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "47"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 509
	} // L: 510

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-649934539"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 513
		int var7 = var3 / 2 + var1; // L: 514
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 515
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 516
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 517
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 518
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 519
	} // L: 520

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-961955181"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 523
			return 1.0F;
		} else if (var1 == 37) { // L: 524
			return 1.5F;
		} else if (var1 == 50) { // L: 525
			return 2.0F;
		} else if (var1 == 75) { // L: 526
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 527 528
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1942588571"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) { // L: 532
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) { // L: 533
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 534
			return 50;
		} else if (3.0D == (double)this.zoomTarget) { // L: 535
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 536 537
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2119000297"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 541
	} // L: 542

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 545
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lii;",
		garbageValue = "-146016730"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-68"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 561
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 564
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 565
		}
	} // L: 562 566

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2031555898"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 569
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 572
			this.worldMapTargetX = -1; // L: 573
			this.worldMapTargetY = -1; // L: 574
		}
	} // L: 570 575

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-6727"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1578409200"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1087726374"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 598 599 601
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-114"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 605 606 608
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lko;",
		garbageValue = "0"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 612 613 615
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1696300360"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 619
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 623
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1687867671"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 627
			this.maxFlashCount = var1; // L: 628
		}

	} // L: 630

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-269686963"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 633
	} // L: 634

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "468851874"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 637
			this.cyclesPerFlash = var1; // L: 638
		}

	} // L: 640

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 643
	} // L: 644

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1156633968"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 647
	} // L: 648

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 651
		this.flashingElements.add(var1); // L: 652
		this.flashCount = 0; // L: 653
		this.flashCycle = 0; // L: 654
	} // L: 655

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1867265492"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 658
		this.flashCount = 0; // L: 659
		this.flashCycle = 0; // L: 660

		for (int var2 = 0; var2 < class361.WorldMapElement_count; ++var2) { // L: 661
			if (class4.WorldMapElement_get(var2) != null && class4.WorldMapElement_get(var2).category == var1) { // L: 662 665
				this.flashingElements.add(class4.WorldMapElement_get(var2).objectId); // L: 666
			}
		}

	} // L: 669

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-998180334"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 672
	} // L: 673

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1449129322"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 676
	} // L: 677

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1064049912"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 680
			this.enabledElements.add(var1); // L: 681
		} else {
			this.enabledElements.remove(var1); // L: 684
		}

		this.method8165(); // L: 686
	} // L: 687

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZS)V",
		garbageValue = "26480"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 690
			this.enabledCategories.add(var1); // L: 691
		} else {
			this.enabledCategories.remove(var1); // L: 694
		}

		for (int var3 = 0; var3 < class361.WorldMapElement_count; ++var3) { // L: 696
			if (class4.WorldMapElement_get(var3) != null && class4.WorldMapElement_get(var3).category == var1) { // L: 697 700
				int var4 = class4.WorldMapElement_get(var3).objectId; // L: 701
				if (!var2) { // L: 702
					this.enabledElementIds.add(var4); // L: 703
				} else {
					this.enabledElementIds.remove(var4); // L: 706
				}
			}
		}

		this.method8165(); // L: 710
	} // L: 711

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2073114555"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 714
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1249266830"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 718
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1383476360"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 722
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	void method8165() {
		this.field4805.clear(); // L: 726
		this.field4805.addAll(this.enabledElements); // L: 727
		this.field4805.addAll(this.enabledElementIds); // L: 728
	} // L: 729

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "51725757"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 732
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 735
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 736
			List var9 = this.worldMapManager.method5156(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 737
			if (!var9.isEmpty()) { // L: 738
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 741
						return; // L: 757
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 742
					WorldMapElement var12 = class4.WorldMapElement_get(var11.getElement()); // L: 744
					var13 = false; // L: 745

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 746
						if (var12.menuActions[var14] != null) { // L: 747
							WorldMapManager.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 748
							var13 = true; // L: 749
						}
					}
				} while(!var13); // L: 752

			}
		}
	} // L: 733 739 753

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILko;B)Lko;",
		garbageValue = "91"
	)
	public Coord method8114(int var1, Coord var2) {
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
						var11 = var9 * var9 + var10 * var10; // L: 781
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IILko;Lko;I)V",
		garbageValue = "-1523313738"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 795
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 796
		var5.setArgs(new Object[]{var6}); // L: 797
		switch(var1) { // L: 798
		case 1008:
			var5.setType(10); // L: 816
			break; // L: 817
		case 1009:
			var5.setType(11); // L: 811
			break; // L: 812
		case 1010:
			var5.setType(12); // L: 806
			break; // L: 807
		case 1011:
			var5.setType(13); // L: 821
			break;
		case 1012:
			var5.setType(14); // L: 801
		}

		WorldMapAreaData.runScriptEvent(var5); // L: 825
	} // L: 826

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lio;",
		garbageValue = "1232678817"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 829
			return null; // L: 830
		} else if (!this.worldMapManager.isLoaded()) { // L: 832
			return null; // L: 833
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 835
			this.field4809 = new LinkedList(); // L: 836
			Iterator var2 = var1.values().iterator(); // L: 837

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 838
				this.field4809.addAll(var3); // L: 840
			}

			this.iconIterator = this.field4809.iterator(); // L: 843
			return this.iconNext(); // L: 844
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Lio;",
		garbageValue = "-444518880"
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
}
