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

@ObfuscatedName("tu")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ay")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("aj")
	@Export("details")
	HashMap details;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	WorldMapArea field4945;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1138031561
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1714174325
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1423859991
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1752145375
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ad")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bn")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 914309993
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -955591779
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 368677635
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -733666833
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -63573285
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2129672665
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bz")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bb")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1739091487
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1703216709
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 160879441
	)
	int field4964;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1958251927
	)
	int field4934;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 971501849
	)
	int field4936;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1491739787
	)
	int field4929;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		longValue = 5279704877414616075L
	)
	long field4949;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 950567027
	)
	int field4969;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1738604533
	)
	int field4970;
	@ObfuscatedName("bh")
	boolean field4971;
	@ObfuscatedName("bj")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bx")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bi")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bq")
	HashSet field4984;
	@ObfuscatedName("bw")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -679343005
	)
	int field4960;
	@ObfuscatedName("cw")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("co")
	List field4979;
	@ObfuscatedName("cc")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cg")
	HashSet field4981;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cy")
	public boolean field4983;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 308640389
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 280039857
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -725460461
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1463195709
	)
	int field4974;

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
		this.field4964 = -1; // L: 75
		this.field4934 = -1; // L: 76
		this.field4936 = -1; // L: 77
		this.field4929 = -1; // L: 78
		this.field4971 = true; // L: 82
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field4984 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field4960 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field4981 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.field4983 = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field4974 = -1; // L: 102
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;Lom;Lpu;Ljava/util/HashMap;[Lun;B)V",
		garbageValue = "-35"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3095.name); // L: 116
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 117
		int var9 = var8 == null ? 0 : var8.length; // L: 118
		this.details = new HashMap(var9); // L: 119

		for (int var10 = 0; var10 < var9; ++var10) { // L: 120
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10])); // L: 121
			WorldMapArea var12 = new WorldMapArea(); // L: 122
			var12.method5266(var11, var8[var10], Client.field527 >= 217); // L: 123
			this.details.put(var12.getInternalName(), var12); // L: 124
			if (var12.getIsMain()) { // L: 125
				this.mainMapArea = var12; // L: 126
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 129
		this.field4945 = null; // L: 130
	} // L: 131

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "400049492"
	)
	public void method8718() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "217069528"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method5473(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); Interpreter.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field4981.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field4981.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						Interpreter.runScriptEvent(var14); // L: 176
					}
				}

				this.field4981 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1429275185"
	)
	public void method8656(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label39: {
			var5 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 184
			this.method8657(var1, var2, var4, var5); // L: 185
			if (!this.hasTarget() && (var4 || var3)) { // L: 187
				boolean var7 = Client.clickedWidget != null; // L: 190
				if (!var7) { // L: 192
					if (var4) { // L: 193
						this.field4936 = var1; // L: 194
						this.field4929 = var2; // L: 195
						this.field4964 = this.centerTileX; // L: 196
						this.field4934 = this.centerTileY; // L: 197
					}

					if (this.field4964 != -1) { // L: 199
						int var8 = var1 - this.field4936; // L: 200
						int var9 = var2 - this.field4929; // L: 201
						this.setWorldMapPosition(this.field4964 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4934, false); // L: 202
					}
					break label39;
				}
			}

			this.method8752(); // L: 207
		}

		if (var4) { // L: 209
			this.field4949 = var5; // L: 210
			this.field4969 = var1; // L: 211
			this.field4970 = var2; // L: 212
		}

	} // L: 214

	@ObfuscatedName("ao")
	void method8657(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 217
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 218
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 219
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 220
			if (this.mouseCoord != null && var3) { // L: 221
				class226 var8 = class284.method5657(); // L: 222
				boolean var9 = Client.staffModLevel >= 2; // L: 225
				int var11;
				int var12;
				if (var9 && var8.method4280(82) && var8.method4280(81)) { // L: 227
					int var15 = this.mouseCoord.x; // L: 228
					var11 = this.mouseCoord.y; // L: 229
					var12 = this.mouseCoord.plane; // L: 230
					PacketBufferNode var13 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 233
					var13.packetBuffer.method9243(var15); // L: 234
					var13.packetBuffer.method9344(var11); // L: 235
					var13.packetBuffer.writeInt(0); // L: 236
					var13.packetBuffer.method9323(var12); // L: 237
					Client.packetWriter.addNode(var13); // L: 238
				} else {
					boolean var10 = true; // L: 242
					if (this.field4971) { // L: 243
						var11 = var1 - this.field4969; // L: 244
						var12 = var2 - this.field4970; // L: 245
						if (var4 - this.field4949 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 246
							var10 = false; // L: 247
						}
					}

					if (var10) { // L: 250
						PacketBufferNode var14 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher); // L: 251
						var14.packetBuffer.writeInt(this.mouseCoord.packed()); // L: 252
						Client.packetWriter.addNode(var14); // L: 253
						this.field4949 = 0L; // L: 254
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 259
		}

	} // L: 260

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2036397007"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (DecorativeObject.field2871 != null) { // L: 263
			this.zoom = this.zoomTarget; // L: 264
		} else {
			if (this.zoom < this.zoomTarget) { // L: 267
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 268
			}

			if (this.zoom > this.zoomTarget) { // L: 270
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 271
			}

		}
	} // L: 265 273

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 276
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 279
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 280
			if (var1 != 0) { // L: 281
				var1 /= Math.min(8, Math.abs(var1)); // L: 282
			}

			if (var2 != 0) { // L: 284
				var2 /= Math.min(8, Math.abs(var2)); // L: 285
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 287
			if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) { // L: 288
				this.worldMapTargetX = -1; // L: 289
				this.worldMapTargetY = -1; // L: 290
			}

		}
	} // L: 277 292

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "118256723"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 295
		this.centerTileY = var2; // L: 296
		GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 297
		if (var3) {
			this.method8752(); // L: 298
		}

	} // L: 299

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	final void method8752() {
		this.field4929 = -1; // L: 302
		this.field4936 = -1; // L: 303
		this.field4934 = -1; // L: 304
		this.field4964 = -1; // L: 305
	} // L: 306

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "412429797"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 309
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lkz;",
		garbageValue = "117"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 313

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 321
			}

			var5 = (WorldMapArea)var4.next(); // L: 314
		} while(!var5.containsCoord(var1, var2, var3)); // L: 316

		return var5; // L: 317
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "30"
	)
	public void method8664(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 325
		if (var5 == null) { // L: 326
			if (!var4) { // L: 327
				return; // L: 330
			}

			var5 = this.mainMapArea; // L: 328
		}

		boolean var6 = false; // L: 332
		if (var5 != this.field4945 || var4) { // L: 333
			this.field4945 = var5; // L: 334
			this.setCurrentMapArea(var5); // L: 335
			var6 = true; // L: 336
		}

		if (var6 || var4) { // L: 338
			this.jump(var1, var2, var3); // L: 339
		}

	} // L: 341

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 344
		if (var2 != null) { // L: 345
			this.setCurrentMapArea(var2); // L: 346
		}

	} // L: 348

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 351 352 354
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "-221227669"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 358
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkz;B)V",
		garbageValue = "1"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 362
			this.initializeWorldMapManager(var1); // L: 365
			this.jump(-1, -1, -1); // L: 366
		}
	} // L: 363 367

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkz;B)V",
		garbageValue = "111"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 370
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 371
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 372
	} // L: 373

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lmo;Lmo;ZI)V",
		garbageValue = "1877422890"
	)
	public void method8670(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 376
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 379
				this.initializeWorldMapManager(var1); // L: 380
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 382
				this.jump(var2.plane, var2.x, var2.y); // L: 386
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 383
			}

		}
	} // L: 377 388

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "758116550"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 391
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 394
			if (var4 == null) { // L: 395
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 396
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 398
			this.worldMapTargetX = -1; // L: 399
			this.worldMapTargetY = -1; // L: 400
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 401
			this.zoomTarget = this.zoom; // L: 402
			this.field4979 = null; // L: 403
			this.iconIterator = null; // L: 404
			this.worldMapManager.clearIcons(); // L: 405
		}
	} // L: 392 406

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "372049411"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 409
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 410
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 411
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 412
		if (var7 < 100) { // L: 413
			this.drawLoading(var1, var2, var3, var4, var7); // L: 414
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 417
				this.worldMapManager.method5468(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld, Client.field527 >= 217); // L: 418
				if (!this.worldMapManager.isLoaded()) { // L: 419
					return; // L: 420
				}
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, this.worldMapManager.method5476()); // L: 423
			if (this.flashingElements != null) { // L: 424
				++this.flashCycle; // L: 425
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 426
					this.flashCycle = 0; // L: 427
					++this.flashCount; // L: 428
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 430
					this.flashingElements = null; // L: 431
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 434
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 435
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 436
			if (!this.elementsDisabled) { // L: 437
				boolean var10 = false; // L: 438
				if (var5 - this.field4960 > 100) { // L: 439
					this.field4960 = var5; // L: 440
					var10 = true; // L: 441
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4984, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 443
			}

			this.method8731(var1, var2, var3, var4, var8, var9); // L: 445
			if (class92.method2358() && this.field4983 && this.mouseCoord != null) { // L: 446
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 447
			this.worldMapDisplayHeight = var9; // L: 448
			this.worldMapDisplayX = var1; // L: 449
			this.worldMapDisplayY = var2; // L: 450
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 451
		}
	} // L: 415 452

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "-107"
	)
	boolean method8821(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 455
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 456
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 457
				return true;
			} else if (this.field4974 != Client.field814) { // L: 458
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 459
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 460
			} else {
				return true; // L: 461
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "105561208"
	)
	void method8731(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (DecorativeObject.field2871 != null) { // L: 465
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 466
			int var8 = var3 + 512; // L: 467
			int var9 = var4 + 512; // L: 468
			float var10 = 1.0F; // L: 469
			var8 = (int)((float)var8 / var10); // L: 470
			var9 = (int)((float)var9 / var10); // L: 471
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 472
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 473
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 474
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 475
			if (this.method8821(var8, var9, var13, var14, var3, var4)) { // L: 476
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 477
					Arrays.fill(this.sprite.pixels, 0); // L: 480
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 478
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 481
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 482
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 483
				DecorativeObject.field2871.method7121(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 484
				this.field4974 = Client.field814; // L: 485
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 486
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 487
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 489
			if (var10 == 1.0F) { // L: 490
				this.sprite.method9691(var13, var14, 192); // L: 491
			} else {
				this.sprite.method9716(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192); // L: 494
			}
		}

	} // L: 497

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1890990429"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 500
			if (!this.worldMapManager.isLoaded()) { // L: 503
				this.worldMapManager.method5468(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld, Client.field527 >= 217); // L: 504
				if (!this.worldMapManager.isLoaded()) { // L: 505
					return; // L: 506
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 509
		}
	} // L: 501 510

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-91789765"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 513
	} // L: 514

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "76184385"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 517
		int var7 = var3 / 2 + var1; // L: 518
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 519
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 520
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 521
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 522
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 523
	} // L: 524

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "5"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 527
			return 1.0F;
		} else if (var1 == 37) { // L: 528
			return 1.5F;
		} else if (var1 == 50) { // L: 529
			return 2.0F;
		} else if (var1 == 75) { // L: 530
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 531 532
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-52"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) { // L: 536
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 537
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 538
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 539
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 540 541
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1930237841"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.method8637(); // L: 545
	} // L: 546

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "19517"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 549
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkz;",
		garbageValue = "73"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 553

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) { // L: 560
				return null; // L: 561
			}

			var3 = (WorldMapArea)var2.next(); // L: 554
		} while(var3.getId() != var1); // L: 556

		return var3; // L: 557
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1843882941"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 565
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 568
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 569
		}
	} // L: 566 570

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-31"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 573
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 576
			this.worldMapTargetX = -1; // L: 577
			this.worldMapTargetY = -1; // L: 578
		}
	} // L: 574 579

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "107"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 582
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 585
			if (var4 != null) { // L: 586
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 587
			}

		}
	} // L: 583 589

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "30"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 592
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 595
			if (var4 != null) { // L: 596
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 597
			}

		}
	} // L: 593 599

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-696270991"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 602 603 605
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 609 610 612
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "635022283"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 616 617 619
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350169881"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 623
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-756132894"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 627
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-15167"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 631
			this.maxFlashCount = var1; // L: 632
		}

	} // L: 634

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2080903444"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 637
	} // L: 638

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-629779711"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 641
			this.cyclesPerFlash = var1; // L: 642
		}

	} // L: 644

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "970345063"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 647
	} // L: 648

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-685582392"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 651
	} // L: 652

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "94114012"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 655
		this.flashingElements.add(var1); // L: 656
		this.flashCount = 0; // L: 657
		this.flashCycle = 0; // L: 658
	} // L: 659

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-230402435"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 662
		this.flashCount = 0; // L: 663
		this.flashCycle = 0; // L: 664

		for (int var2 = 0; var2 < DevicePcmPlayerProvider.WorldMapElement_count; ++var2) { // L: 665
			if (class148.WorldMapElement_get(var2) != null && class148.WorldMapElement_get(var2).category == var1) { // L: 666 669
				this.flashingElements.add(class148.WorldMapElement_get(var2).objectId); // L: 670
			}
		}

	} // L: 673

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 676
	} // L: 677

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-8"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 680
	} // L: 681

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-769968427"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 684
			this.enabledElements.add(var1); // L: 685
		} else {
			this.enabledElements.remove(var1); // L: 688
		}

		this.method8729(); // L: 690
	} // L: 691

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "41"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 694
			this.enabledCategories.add(var1); // L: 695
		} else {
			this.enabledCategories.remove(var1); // L: 698
		}

		for (int var3 = 0; var3 < DevicePcmPlayerProvider.WorldMapElement_count; ++var3) { // L: 700
			if (class148.WorldMapElement_get(var3) != null && class148.WorldMapElement_get(var3).category == var1) { // L: 701 704
				int var4 = class148.WorldMapElement_get(var3).objectId; // L: 705
				if (!var2) { // L: 706
					this.enabledElementIds.add(var4); // L: 707
				} else {
					this.enabledElementIds.remove(var4); // L: 710
				}
			}
		}

		this.method8729(); // L: 714
	} // L: 715

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1516672500"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 718
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-12"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 722
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2114625315"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 726
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1459658126"
	)
	void method8729() {
		this.field4984.clear(); // L: 730
		this.field4984.addAll(this.enabledElements); // L: 731
		this.field4984.addAll(this.enabledElementIds); // L: 732
	} // L: 733

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "331775866"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 736
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 739
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 740
			List var9 = this.worldMapManager.method5473(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 741
			if (!var9.isEmpty()) { // L: 742
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 745
						return; // L: 761
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 746
					WorldMapElement var12 = class148.WorldMapElement_get(var11.getElement()); // L: 748
					var13 = false; // L: 749

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 750
						if (var12.menuActions[var14] != null) { // L: 751
							class153.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 752
							var13 = true; // L: 753
						}
					}
				} while(!var13); // L: 756

			}
		}
	} // L: 737 743 757

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(ILmo;I)Lmo;",
		garbageValue = "1156685308"
	)
	public Coord method8708(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 764
			return null; // L: 765
		} else if (!this.worldMapManager.isLoaded()) { // L: 767
			return null; // L: 768
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 770
			return null; // L: 771
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 773
			List var4 = (List)var3.get(var1); // L: 774
			if (var4 != null && !var4.isEmpty()) { // L: 775
				AbstractWorldMapIcon var5 = null; // L: 778
				int var6 = -1; // L: 779
				Iterator var7 = var4.iterator(); // L: 780

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 795
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 781
						int var9 = var8.coord2.x - var2.x; // L: 783
						int var10 = var8.coord2.y - var2.y; // L: 784
						var11 = var10 * var10 + var9 * var9; // L: 785
						if (var11 == 0) { // L: 786
							return var8.coord2; // L: 787
						}
					} while(var11 >= var6 && var5 != null); // L: 789

					var5 = var8; // L: 790
					var6 = var11; // L: 791
				}
			} else {
				return null; // L: 776
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IILmo;Lmo;I)V",
		garbageValue = "-559043995"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 799
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 800
		var5.setArgs(new Object[]{var6}); // L: 801
		switch(var1) { // L: 802
		case 1008:
			var5.setType(10); // L: 815
			break; // L: 816
		case 1009:
			var5.setType(11); // L: 820
			break; // L: 821
		case 1010:
			var5.setType(12); // L: 810
			break; // L: 811
		case 1011:
			var5.setType(13); // L: 805
			break;
		case 1012:
			var5.setType(14); // L: 825
		}

		Interpreter.runScriptEvent(var5); // L: 829
	} // L: 830

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Lll;",
		garbageValue = "-1734759912"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 833
			return null; // L: 834
		} else if (!this.worldMapManager.isLoaded()) { // L: 836
			return null; // L: 837
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 839
			this.field4979 = new LinkedList(); // L: 840
			Iterator var2 = var1.values().iterator(); // L: 841

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 842
				this.field4979.addAll(var3); // L: 844
			}

			this.iconIterator = this.field4979.iterator(); // L: 847
			return this.iconNext(); // L: 848
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(S)Lll;",
		garbageValue = "21797"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 852
			return null; // L: 853
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 855
					return null; // L: 861
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 856
			} while(var1.getElement() == -1); // L: 857

			return var1; // L: 858
		}
	}
}
