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

@ObfuscatedName("tc")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ax")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("az")
	@Export("details")
	HashMap details;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	WorldMapArea field4995;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1795500135
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1321290045
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1731609689
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 927440405
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("at")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bj")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1611990621
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -274807867
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2140306871
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 110200243
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1522619027
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 25504827
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bn")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("by")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1914671675
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2011013947
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 596491845
	)
	int field4998;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 594590453
	)
	int field4999;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -151043657
	)
	int field5000;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 215073433
	)
	int field5001;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = -2611102848712317391L
	)
	long field5018;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1599533973
	)
	int field4962;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 2038933639
	)
	int field5004;
	@ObfuscatedName("bw")
	boolean field5005;
	@ObfuscatedName("be")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bs")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bl")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bz")
	HashSet field5010;
	@ObfuscatedName("bo")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1002114819
	)
	int field5012;
	@ObfuscatedName("ci")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cv")
	List field5014;
	@ObfuscatedName("ct")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cp")
	HashSet field5016;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cl")
	public boolean field4990;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1476091809
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 921525119
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1118198033
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1721942129
	)
	int field5023;

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
		this.field4998 = -1; // L: 75
		this.field4999 = -1; // L: 76
		this.field5000 = -1; // L: 77
		this.field5001 = -1; // L: 78
		this.field5005 = true; // L: 82
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field5010 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field5012 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field5016 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.field4990 = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field5023 = -1; // L: 102
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Low;Lpv;Ljava/util/HashMap;[Lut;B)V",
		garbageValue = "-25"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2669.name); // L: 116
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
		this.field4995 = null; // L: 130
	} // L: 131

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-122"
	)
	public void method8852() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "-12"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method4858(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); WorldMapSectionType.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field5016.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field5016.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						WorldMapSectionType.runScriptEvent(var14); // L: 176
					}
				}

				this.field5016 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-2055491223"
	)
	public void method8854(int var1, int var2, boolean var3, boolean var4) {
		long var5 = UserComparator9.method2973(); // L: 184
		this.method8965(var1, var2, var4, var5); // L: 185
		if (!this.hasTarget() && (var4 || var3) && !class72.method2148()) { // L: 186
			if (var4) { // L: 187
				this.field5000 = var1; // L: 188
				this.field5001 = var2; // L: 189
				this.field4998 = this.centerTileX; // L: 190
				this.field4999 = this.centerTileY; // L: 191
			}

			if (this.field4998 != -1) { // L: 193
				int var7 = var1 - this.field5000; // L: 194
				int var8 = var2 - this.field5001; // L: 195
				this.setWorldMapPosition(this.field4998 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4999, false); // L: 196
			}
		} else {
			this.method9002(); // L: 200
		}

		if (var4) { // L: 202
			this.field5018 = var5; // L: 203
			this.field4962 = var1; // L: 204
			this.field5004 = var2; // L: 205
		}

	} // L: 207

	@ObfuscatedName("aq")
	void method8965(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 210
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 211
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 212
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 213
			if (this.mouseCoord != null && var3) { // L: 214
				class226 var8 = SoundSystem.method879(); // L: 215
				int var10;
				int var11;
				if (class36.method733() && var8.method4426(82) && var8.method4426(81)) { // L: 216
					int var14 = this.mouseCoord.x; // L: 217
					var10 = this.mouseCoord.y; // L: 218
					var11 = this.mouseCoord.plane; // L: 219
					PacketBufferNode var12 = class482.getPacketBufferNode(ClientPacket.field3213, Client.packetWriter.isaacCipher); // L: 222
					var12.packetBuffer.method9439(0); // L: 223
					var12.packetBuffer.method9557(var14); // L: 224
					var12.packetBuffer.writeByte(var11); // L: 225
					var12.packetBuffer.writeShort(var10); // L: 226
					Client.packetWriter.addNode(var12); // L: 227
				} else {
					boolean var9 = true; // L: 231
					if (this.field5005) { // L: 232
						var10 = var1 - this.field4962; // L: 233
						var11 = var2 - this.field5004; // L: 234
						if (var4 - this.field5018 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) { // L: 235
							var9 = false; // L: 236
						}
					}

					if (var9) { // L: 239
						PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.field3237, Client.packetWriter.isaacCipher); // L: 240
						var13.packetBuffer.method9494(this.mouseCoord.packed()); // L: 241
						Client.packetWriter.addNode(var13); // L: 242
						this.field5018 = 0L; // L: 243
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 248
		}

	} // L: 249

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (Varps.field3599 != null) { // L: 252
			this.zoom = this.zoomTarget; // L: 253
		} else {
			if (this.zoom < this.zoomTarget) { // L: 256
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 257
			}

			if (this.zoom > this.zoomTarget) { // L: 259
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 260
			}

		}
	} // L: 254 262

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1987824046"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 265
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 268
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 269
			if (var1 != 0) { // L: 270
				var1 /= Math.min(8, Math.abs(var1)); // L: 271
			}

			if (var2 != 0) { // L: 273
				var2 /= Math.min(8, Math.abs(var2)); // L: 274
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 276
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 277
				this.worldMapTargetX = -1; // L: 278
				this.worldMapTargetY = -1; // L: 279
			}

		}
	} // L: 266 281

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2003774069"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 284
		this.centerTileY = var2; // L: 285
		UserComparator9.method2973(); // L: 286
		if (var3) {
			this.method9002(); // L: 287
		}

	} // L: 288

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	final void method9002() {
		this.field5001 = -1; // L: 291
		this.field5000 = -1; // L: 292
		this.field4999 = -1; // L: 293
		this.field4998 = -1; // L: 294
	} // L: 295

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-54738174"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 298
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljr;",
		garbageValue = "-668000767"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 302

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 310
			}

			var5 = (WorldMapArea)var4.next(); // L: 303
		} while(!var5.containsCoord(var1, var2, var3)); // L: 305

		return var5; // L: 306
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-52"
	)
	public void method9017(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 314
		if (var5 == null) { // L: 315
			if (!var4) { // L: 316
				return; // L: 319
			}

			var5 = this.mainMapArea; // L: 317
		}

		boolean var6 = false; // L: 321
		if (var5 != this.field4995 || var4) { // L: 322
			this.field4995 = var5; // L: 323
			this.setCurrentMapArea(var5); // L: 324
			var6 = true; // L: 325
		}

		if (var6 || var4) { // L: 327
			this.jump(var1, var2, var3); // L: 328
		}

	} // L: 330

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1750659377"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 333
		if (var2 != null) { // L: 334
			this.setCurrentMapArea(var2); // L: 335
		}

	} // L: 337

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "592735084"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 340 341 343
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "52"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 347
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V",
		garbageValue = "498964160"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 351
			this.initializeWorldMapManager(var1); // L: 354
			this.jump(-1, -1, -1); // L: 355
		}
	} // L: 352 356

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljr;B)V",
		garbageValue = "-1"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 359
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 360
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 361
	} // L: 362

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljr;Lmu;Lmu;ZI)V",
		garbageValue = "-220821050"
	)
	public void method8867(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 365
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 368
				this.initializeWorldMapManager(var1); // L: 369
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 371
				this.jump(var2.plane, var2.x, var2.y); // L: 375
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 372
			}

		}
	} // L: 366 377

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "7"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 380
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 383
			if (var4 == null) { // L: 384
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 385
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 387
			this.worldMapTargetX = -1; // L: 388
			this.worldMapTargetY = -1; // L: 389
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 390
			this.zoomTarget = this.zoom; // L: 391
			this.field5014 = null; // L: 392
			this.iconIterator = null; // L: 393
			this.worldMapManager.clearIcons(); // L: 394
		}
	} // L: 381 395

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "43"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 398
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 399
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 400
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

			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, this.worldMapManager.method4861()); // L: 412
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

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 423
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 424
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 425
			if (!this.elementsDisabled) { // L: 426
				boolean var10 = false; // L: 427
				if (var5 - this.field5012 > 100) { // L: 428
					this.field5012 = var5; // L: 429
					var10 = true; // L: 430
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5010, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 432
			}

			this.method8926(var1, var2, var3, var4, var8, var9); // L: 434
			if (class36.method733() && this.field4990 && this.mouseCoord != null) { // L: 435
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 436
			this.worldMapDisplayHeight = var9; // L: 437
			this.worldMapDisplayX = var1; // L: 438
			this.worldMapDisplayY = var2; // L: 439
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 440
		}
	} // L: 404 441

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-8321220"
	)
	boolean method8870(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 444
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 445
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 446
				return true;
			} else if (this.field5023 != Client.field758) { // L: 447
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 448
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 449
			} else {
				return true; // L: 450
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1837584380"
	)
	void method8926(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Varps.field3599 != null) { // L: 454
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 455
			int var8 = var3 + 512; // L: 456
			int var9 = var4 + 512; // L: 457
			float var10 = 1.0F; // L: 458
			var8 = (int)((float)var8 / var10); // L: 459
			var9 = (int)((float)var9 / var10); // L: 460
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 461
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 462
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 463
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 464
			if (this.method8870(var8, var9, var13, var14, var3, var4)) { // L: 465
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 466
					Arrays.fill(this.sprite.pixels, 0); // L: 469
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 467
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 470
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 471
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 472
				Varps.field3599.method7254(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 473
				this.field5023 = Client.field758; // L: 474
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 475
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 476
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 478
			if (1.0F == var10) { // L: 479
				this.sprite.method9848(var13, var14, 192); // L: 480
			} else {
				this.sprite.method9836(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192); // L: 483
			}
		}

	} // L: 486

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2131248647"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 489
			if (!this.worldMapManager.isLoaded()) { // L: 492
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 493
				if (!this.worldMapManager.isLoaded()) { // L: 494
					return; // L: 495
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 498
		}
	} // L: 490 499

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2145141909"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 502
	} // L: 503

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1719793463"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 506
		int var7 = var3 / 2 + var1; // L: 507
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 508
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 509
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 510
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 511
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 512
	} // L: 513

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-559850623"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 516
			return 1.0F;
		} else if (var1 == 37) { // L: 517
			return 1.5F;
		} else if (var1 == 50) { // L: 518
			return 2.0F;
		} else if (var1 == 75) { // L: 519
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 520 521
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-73"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 525
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 526
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 527
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 528
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 529 530
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.method8848(); // L: 534
	} // L: 535

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-10652"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 538
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)Ljr;",
		garbageValue = "-1750030387"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 542

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) { // L: 549
				return null; // L: 550
			}

			var3 = (WorldMapArea)var2.next(); // L: 543
		} while(var3.getId() != var1); // L: 545

		return var3; // L: 546
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1492959932"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 554
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 557
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 558
		}
	} // L: 555 559

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 562
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 565
			this.worldMapTargetX = -1; // L: 566
			this.worldMapTargetY = -1; // L: 567
		}
	} // L: 563 568

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "38"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 571
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 574
			if (var4 != null) { // L: 575
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 576
			}

		}
	} // L: 572 578

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "984792423"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 581
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 584
			if (var4 != null) { // L: 585
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 586
			}

		}
	} // L: 582 588

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1493746011"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 591 592 594
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "678019107"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 598 599 601
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lmu;",
		garbageValue = "-101"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 605 606 608
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-15906"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 612
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 616
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-22"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 620
			this.maxFlashCount = var1; // L: 621
		}

	} // L: 623

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "180"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 626
	} // L: 627

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 630
			this.cyclesPerFlash = var1; // L: 631
		}

	} // L: 633

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 636
	} // L: 637

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "743196713"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 640
	} // L: 641

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2087664072"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 644
		this.flashingElements.add(var1); // L: 645
		this.flashCount = 0; // L: 646
		this.flashCycle = 0; // L: 647
	} // L: 648

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1592481467"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 651
		this.flashCount = 0; // L: 652
		this.flashCycle = 0; // L: 653

		for (int var2 = 0; var2 < class152.WorldMapElement_count; ++var2) { // L: 654
			if (class423.WorldMapElement_get(var2) != null && class423.WorldMapElement_get(var2).category == var1) { // L: 655 658
				this.flashingElements.add(class423.WorldMapElement_get(var2).objectId); // L: 659
			}
		}

	} // L: 662

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "219"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 665
	} // L: 666

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 669
	} // L: 670

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1889973787"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 673
			this.enabledElements.add(var1); // L: 674
		} else {
			this.enabledElements.remove(var1); // L: 677
		}

		this.method8994(); // L: 679
	} // L: 680

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1686832418"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 683
			this.enabledCategories.add(var1); // L: 684
		} else {
			this.enabledCategories.remove(var1); // L: 687
		}

		for (int var3 = 0; var3 < class152.WorldMapElement_count; ++var3) { // L: 689
			if (class423.WorldMapElement_get(var3) != null && class423.WorldMapElement_get(var3).category == var1) { // L: 690 693
				int var4 = class423.WorldMapElement_get(var3).objectId; // L: 694
				if (!var2) { // L: 695
					this.enabledElementIds.add(var4); // L: 696
				} else {
					this.enabledElementIds.remove(var4); // L: 699
				}
			}
		}

		this.method8994(); // L: 703
	} // L: 704

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2122001100"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 707
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1402919525"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 711
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "469789416"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 715
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	void method8994() {
		this.field5010.clear(); // L: 719
		this.field5010.addAll(this.enabledElements); // L: 720
		this.field5010.addAll(this.enabledElementIds); // L: 721
	} // L: 722

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2045373489"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 725
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 728
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 729
			List var9 = this.worldMapManager.method4858(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 730
			if (!var9.isEmpty()) { // L: 731
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 734
						return; // L: 750
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 735
					WorldMapElement var12 = class423.WorldMapElement_get(var11.getElement()); // L: 737
					var13 = false; // L: 738

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 739
						if (var12.menuActions[var14] != null) { // L: 740
							class385.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 741
							var13 = true; // L: 742
						}
					}
				} while(!var13); // L: 745

			}
		}
	} // L: 726 732 746

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(ILmu;I)Lmu;",
		garbageValue = "1851325904"
	)
	public Coord method9025(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 753
			return null; // L: 754
		} else if (!this.worldMapManager.isLoaded()) { // L: 756
			return null; // L: 757
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 759
			return null; // L: 760
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 762
			List var4 = (List)var3.get(var1); // L: 763
			if (var4 != null && !var4.isEmpty()) { // L: 764
				AbstractWorldMapIcon var5 = null; // L: 767
				int var6 = -1; // L: 768
				Iterator var7 = var4.iterator(); // L: 769

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 784
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 770
						int var9 = var8.coord2.x - var2.x; // L: 772
						int var10 = var8.coord2.y - var2.y; // L: 773
						var11 = var9 * var9 + var10 * var10; // L: 774
						if (var11 == 0) { // L: 775
							return var8.coord2; // L: 776
						}
					} while(var11 >= var6 && var5 != null); // L: 778

					var5 = var8; // L: 779
					var6 = var11; // L: 780
				}
			} else {
				return null; // L: 765
			}
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IILmu;Lmu;B)V",
		garbageValue = "11"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 788
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 789
		var5.setArgs(new Object[]{var6}); // L: 790
		switch(var1) { // L: 791
		case 1008:
			var5.setType(10); // L: 794
			break;
		case 1009:
			var5.setType(11); // L: 804
			break; // L: 805
		case 1010:
			var5.setType(12); // L: 809
			break; // L: 810
		case 1011:
			var5.setType(13); // L: 814
			break;
		case 1012:
			var5.setType(14); // L: 799
		}

		WorldMapSectionType.runScriptEvent(var5); // L: 818
	} // L: 819

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)Ljq;",
		garbageValue = "0"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 822
			return null; // L: 823
		} else if (!this.worldMapManager.isLoaded()) { // L: 825
			return null; // L: 826
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 828
			this.field5014 = new LinkedList(); // L: 829
			Iterator var2 = var1.values().iterator(); // L: 830

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 831
				this.field5014.addAll(var3); // L: 833
			}

			this.iconIterator = this.field5014.iterator(); // L: 836
			return this.iconNext(); // L: 837
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljq;",
		garbageValue = "-1214298311"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 841
			return null; // L: 842
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 844
					return null; // L: 850
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 845
			} while(var1.getElement() == -1); // L: 846

			return var1; // L: 847
		}
	}
}
