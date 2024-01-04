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

@ObfuscatedName("tn")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("as")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ak")
	@Export("details")
	HashMap details;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	WorldMapArea field4981;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 989599695
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1842715425
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1462214999
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1451739569
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("af")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("be")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1409287467
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -814173773
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1673613801
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1846910385
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 228098407
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1322618821
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("ba")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bm")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 229151135
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 2141545241
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1677377671
	)
	int field4944;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -806246395
	)
	int field4959;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -430517989
	)
	int field4979;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 268881779
	)
	int field4962;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = 4050134236144253029L
	)
	long field4963;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -876124577
	)
	int field4939;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -2072001517
	)
	int field4965;
	@ObfuscatedName("bz")
	boolean field4968;
	@ObfuscatedName("bx")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bb")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bk")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("br")
	HashSet field4943;
	@ObfuscatedName("bq")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 469849587
	)
	int field4972;
	@ObfuscatedName("cv")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cx")
	List field4974;
	@ObfuscatedName("cp")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("ce")
	HashSet field4976;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ct")
	public boolean field4978;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 17964725
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 521051339
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1143944953
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -893341489
	)
	int field4983;

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
		this.field4944 = -1; // L: 75
		this.field4959 = -1; // L: 76
		this.field4979 = -1; // L: 77
		this.field4962 = -1; // L: 78
		this.field4968 = true; // L: 82
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field4943 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field4972 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field4976 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.field4978 = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field4983 = -1; // L: 102
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;Lol;Lpf;Ljava/util/HashMap;[Lup;I)V",
		garbageValue = "-686529494"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2633.name); // L: 116
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 117
		int var9 = var8 == null ? 0 : var8.length; // L: 118
		this.details = new HashMap(var9); // L: 119

		for (int var10 = 0; var10 < var9; ++var10) { // L: 120
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10])); // L: 121
			WorldMapArea var12 = new WorldMapArea(); // L: 122
			var12.method4547(var11, var8[var10], Client.field492 >= 217); // L: 123
			this.details.put(var12.getInternalName(), var12); // L: 124
			if (var12.getIsMain()) { // L: 125
				this.mainMapArea = var12; // L: 126
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 129
		this.field4981 = null; // L: 130
	} // L: 131

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1839563363"
	)
	public void method8713() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 135
	} // L: 137

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-1895076651"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 140
			this.smoothZoom(); // L: 143
			this.scrollToTarget(); // L: 144
			if (var3) { // L: 145
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 148
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 149
				List var10 = this.worldMapManager.method4764(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 150
				HashSet var11 = new HashSet(); // L: 151

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class157.runScriptEvent(var14)) { // L: 152 165
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 153
					var11.add(var13); // L: 155
					var14 = new ScriptEvent(); // L: 156
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 157
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 158
					if (this.field4976.contains(var13)) { // L: 159
						var14.setType(17); // L: 160
					} else {
						var14.setType(15); // L: 163
					}
				}

				var12 = this.field4976.iterator(); // L: 168

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 169
					if (!var11.contains(var13)) { // L: 171
						var14 = new ScriptEvent(); // L: 172
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 173
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 174
						var14.setType(16); // L: 175
						class157.runScriptEvent(var14); // L: 176
					}
				}

				this.field4976 = var11; // L: 180
			}
		}
	} // L: 141 146 181

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZZS)V",
		garbageValue = "4180"
	)
	public void method8715(int var1, int var2, boolean var3, boolean var4) {
		long var5 = SpotAnimationDefinition.method3775(); // L: 184
		this.method8716(var1, var2, var4, var5); // L: 185
		if (!this.hasTarget() && (var4 || var3) && !PacketBufferNode.method5925()) { // L: 186
			if (var4) { // L: 187
				this.field4979 = var1; // L: 188
				this.field4962 = var2; // L: 189
				this.field4944 = this.centerTileX; // L: 190
				this.field4959 = this.centerTileY; // L: 191
			}

			if (this.field4944 != -1) { // L: 193
				int var7 = var1 - this.field4979; // L: 194
				int var8 = var2 - this.field4962; // L: 195
				this.setWorldMapPosition(this.field4944 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4959, false); // L: 196
			}
		} else {
			this.method8834(); // L: 200
		}

		if (var4) { // L: 202
			this.field4963 = var5; // L: 203
			this.field4939 = var1; // L: 204
			this.field4965 = var2; // L: 205
		}

	} // L: 207

	@ObfuscatedName("ab")
	void method8716(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 210
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 211
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 212
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 213
			if (this.mouseCoord != null && var3) { // L: 214
				class223 var8 = Client.field724; // L: 217
				boolean var10 = Client.staffModLevel >= 2; // L: 222
				int var12;
				int var13;
				if (var10 && var8.method4316(82) && var8.method4316(81)) { // L: 224
					int var16 = this.mouseCoord.x; // L: 225
					var12 = this.mouseCoord.y; // L: 226
					var13 = this.mouseCoord.plane; // L: 227
					PacketBufferNode var14 = class113.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher); // L: 230
					var14.packetBuffer.writeInt(0); // L: 231
					var14.packetBuffer.method9300(var16); // L: 232
					var14.packetBuffer.method9300(var12); // L: 233
					var14.packetBuffer.writeByte(var13); // L: 234
					Client.packetWriter.addNode(var14); // L: 235
				} else {
					boolean var11 = true; // L: 239
					if (this.field4968) { // L: 240
						var12 = var1 - this.field4939; // L: 241
						var13 = var2 - this.field4965; // L: 242
						if (var4 - this.field4963 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) { // L: 243
							var11 = false; // L: 244
						}
					}

					if (var11) { // L: 247
						PacketBufferNode var15 = class113.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher); // L: 248
						var15.packetBuffer.method9311(this.mouseCoord.packed()); // L: 249
						Client.packetWriter.addNode(var15); // L: 250
						this.field4963 = 0L; // L: 251
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 256
		}

	} // L: 257

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "217198758"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (MidiPcmStream.field3456 != null) { // L: 260
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "3"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 292
		this.centerTileY = var2; // L: 293
		SpotAnimationDefinition.method3775(); // L: 294
		if (var3) {
			this.method8834(); // L: 295
		}

	} // L: 296

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1741658330"
	)
	final void method8834() {
		this.field4962 = -1; // L: 299
		this.field4979 = -1; // L: 300
		this.field4959 = -1; // L: 301
		this.field4944 = -1; // L: 302
	} // L: 303

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-357792182"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 306
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljv;",
		garbageValue = "-472972186"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 310

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) { // L: 317
				return null; // L: 318
			}

			var5 = (WorldMapArea)var4.next(); // L: 311
		} while(!var5.containsCoord(var1, var2, var3)); // L: 313

		return var5; // L: 314
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-68"
	)
	public void method8723(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 322
		if (var5 == null) { // L: 323
			if (!var4) { // L: 324
				return; // L: 327
			}

			var5 = this.mainMapArea; // L: 325
		}

		boolean var6 = false; // L: 329
		if (var5 != this.field4981 || var4) { // L: 330
			this.field4981 = var5; // L: 331
			this.setCurrentMapArea(var5); // L: 332
			var6 = true; // L: 333
		}

		if (var6 || var4) { // L: 335
			this.jump(var1, var2, var3); // L: 336
		}

	} // L: 338

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-16384"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 341
		if (var2 != null) { // L: 342
			this.setCurrentMapArea(var2); // L: 343
		}

	} // L: 345

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-370898847"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 348 349 351
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Ljv;",
		garbageValue = "2772"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 355
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V",
		garbageValue = "724172563"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 359
			this.initializeWorldMapManager(var1); // L: 362
			this.jump(-1, -1, -1); // L: 363
		}
	} // L: 360 364

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "6"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 367
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 368
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 369
	} // L: 370

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Lmh;Lmh;ZB)V",
		garbageValue = "62"
	)
	public void method8794(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
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
			this.field4974 = null; // L: 400
			this.iconIterator = null; // L: 401
			this.worldMapManager.clearIcons(); // L: 402
		}
	} // L: 389 403

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "24"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 406
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 407
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 408
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 409
		if (var7 < 100) { // L: 410
			this.drawLoading(var1, var2, var3, var4, var7); // L: 411
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 414
				this.worldMapManager.method4733(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld, Client.field492 >= 217); // L: 415
				if (!this.worldMapManager.isLoaded()) { // L: 416
					return; // L: 417
				}
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, this.worldMapManager.method4741()); // L: 420
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
				if (var5 - this.field4972 > 100) { // L: 436
					this.field4972 = var5; // L: 437
					var10 = true; // L: 438
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4943, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 440
			}

			this.method8733(var1, var2, var3, var4, var8, var9); // L: 442
			var10 = Client.staffModLevel >= 2; // L: 445
			if (var10 && this.field4978 && this.mouseCoord != null) { // L: 447
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 448
			this.worldMapDisplayHeight = var9; // L: 449
			this.worldMapDisplayX = var1; // L: 450
			this.worldMapDisplayY = var2; // L: 451
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 452
		}
	} // L: 412 453

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-2129366613"
	)
	boolean method8750(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 456
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 457
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 458
				return true;
			} else if (this.field4983 != Client.field783) { // L: 459
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1396727376"
	)
	void method8733(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (MidiPcmStream.field3456 != null) { // L: 466
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 467
			int var8 = var3 + 512; // L: 468
			int var9 = var4 + 512; // L: 469
			float var10 = 1.0F; // L: 470
			var8 = (int)((float)var8 / var10); // L: 471
			var9 = (int)((float)var9 / var10); // L: 472
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 473
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 474
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 475
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 476
			if (this.method8750(var8, var9, var13, var14, var3, var4)) { // L: 477
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 478
					Arrays.fill(this.sprite.pixels, 0); // L: 481
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 479
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 482
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 483
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 484
				MidiPcmStream.field3456.method7160(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 485
				this.field4983 = Client.field783; // L: 486
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 487
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 488
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 490
			if (1.0F == var10) { // L: 491
				this.sprite.method9850(var13, var14, 192); // L: 492
			} else {
				this.sprite.method9761(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192); // L: 495
			}
		}

	} // L: 498

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "51"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 501
			if (!this.worldMapManager.isLoaded()) { // L: 504
				this.worldMapManager.method4733(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld, Client.field492 >= 217); // L: 505
				if (!this.worldMapManager.isLoaded()) { // L: 506
					return; // L: 507
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 510
		}
	} // L: 502 511

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 514
	} // L: 515

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-699862709"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 518
		int var7 = var3 / 2 + var1; // L: 519
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 520
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 521
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 522
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 523
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 524
	} // L: 525

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "31"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 528
			return 1.0F;
		} else if (var1 == 37) { // L: 529
			return 1.5F;
		} else if (var1 == 50) { // L: 530
			return 2.0F;
		} else if (var1 == 75) { // L: 531
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 532 533
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1066219424"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 537
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) { // L: 538
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 539
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 540
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 541 542
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "123"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 546
	} // L: 547

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "369984889"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 550
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Ljv;",
		garbageValue = "1808256615"
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-678637606"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 566
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 569
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 570
		}
	} // L: 567 571

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1573739056"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 574
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 577
			this.worldMapTargetX = -1; // L: 578
			this.worldMapTargetY = -1; // L: 579
		}
	} // L: 575 580

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-13928817"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "996468240"
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
		descriptor = "(B)I",
		garbageValue = "-43"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 603 604 606
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-853833323"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 610 611 613
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Lmh;",
		garbageValue = "0"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 617 618 620
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "537116922"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 624
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1296388714"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 628
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-857515700"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 632
			this.maxFlashCount = var1; // L: 633
		}

	} // L: 635

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1866064784"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 638
	} // L: 639

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-90"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 642
			this.cyclesPerFlash = var1; // L: 643
		}

	} // L: 645

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1119701020"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 648
	} // L: 649

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1336488312"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 652
	} // L: 653

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 656
		this.flashingElements.add(var1); // L: 657
		this.flashCount = 0; // L: 658
		this.flashCycle = 0; // L: 659
	} // L: 660

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1850840845"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 663
		this.flashCount = 0; // L: 664
		this.flashCycle = 0; // L: 665

		for (int var2 = 0; var2 < class137.WorldMapElement_count; ++var2) { // L: 666
			if (class141.WorldMapElement_get(var2) != null && class141.WorldMapElement_get(var2).category == var1) { // L: 667 670
				this.flashingElements.add(class141.WorldMapElement_get(var2).objectId); // L: 671
			}
		}

	} // L: 674

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1649001731"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 677
	} // L: 678

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 681
	} // L: 682

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "125"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 685
			this.enabledElements.add(var1); // L: 686
		} else {
			this.enabledElements.remove(var1); // L: 689
		}

		this.method8900(); // L: 691
	} // L: 692

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1569784149"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 695
			this.enabledCategories.add(var1); // L: 696
		} else {
			this.enabledCategories.remove(var1); // L: 699
		}

		for (int var3 = 0; var3 < class137.WorldMapElement_count; ++var3) { // L: 701
			if (class141.WorldMapElement_get(var3) != null && class141.WorldMapElement_get(var3).category == var1) { // L: 702 705
				int var4 = class141.WorldMapElement_get(var3).objectId; // L: 706
				if (!var2) { // L: 707
					this.enabledElementIds.add(var4); // L: 708
				} else {
					this.enabledElementIds.remove(var4); // L: 711
				}
			}
		}

		this.method8900(); // L: 715
	} // L: 716

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "41"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 719
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2012466674"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 723
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1791520679"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 727
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	void method8900() {
		this.field4943.clear(); // L: 731
		this.field4943.addAll(this.enabledElements); // L: 732
		this.field4943.addAll(this.enabledElementIds); // L: 733
	} // L: 734

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1420454539"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 737
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 740
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 741
			List var9 = this.worldMapManager.method4764(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 742
			if (!var9.isEmpty()) { // L: 743
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 746
						return; // L: 762
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 747
					WorldMapElement var12 = class141.WorldMapElement_get(var11.getElement()); // L: 749
					var13 = false; // L: 750

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 751
						if (var12.menuActions[var14] != null) { // L: 752
							WorldMapSectionType.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 753
							var13 = true; // L: 754
						}
					}
				} while(!var13); // L: 757

			}
		}
	} // L: 738 744 758

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(ILmh;I)Lmh;",
		garbageValue = "1628169243"
	)
	public Coord method8766(int var1, Coord var2) {
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

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(IILmh;Lmh;B)V",
		garbageValue = "84"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 800
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 801
		var5.setArgs(new Object[]{var6}); // L: 802
		switch(var1) { // L: 803
		case 1008:
			var5.setType(10); // L: 806
			break;
		case 1009:
			var5.setType(11); // L: 826
			break;
		case 1010:
			var5.setType(12); // L: 816
			break; // L: 817
		case 1011:
			var5.setType(13); // L: 821
			break; // L: 822
		case 1012:
			var5.setType(14); // L: 811
		}

		class157.runScriptEvent(var5); // L: 830
	} // L: 831

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)Ljc;",
		garbageValue = "-80"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 834
			return null; // L: 835
		} else if (!this.worldMapManager.isLoaded()) { // L: 837
			return null; // L: 838
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 840
			this.field4974 = new LinkedList(); // L: 841
			Iterator var2 = var1.values().iterator(); // L: 842

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 843
				this.field4974.addAll(var3); // L: 845
			}

			this.iconIterator = this.field4974.iterator(); // L: 848
			return this.iconNext(); // L: 849
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Ljc;",
		garbageValue = "94"
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

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-921124497"
	)
	static final void method8922(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) { // L: 4433
			Object var1 = null; // L: 4434
			var2 = 65536; // L: 4435
			if (var0.targetIndex < var2) { // L: 4436
				var1 = Client.npcs[var0.targetIndex]; // L: 4437
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4440
			}

			if (var1 != null) { // L: 4442
				var3 = var0.x - ((Actor)var1).x; // L: 4443
				var4 = var0.y - ((Actor)var1).y; // L: 4444
				if (var3 != 0 || var4 != 0) { // L: 4445
					var0.orientation = SequenceDefinition.method4094(var3, var4); // L: 4446
				}
			} else if (var0.false0) { // L: 4449
				var0.targetIndex = -1; // L: 4450
				var0.false0 = false; // L: 4451
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1245 > 0) { // L: 4454
			var7 = -1; // L: 4455
			if (var0.field1178 != -1 && var0.field1210 != -1) { // L: 4456
				var2 = var0.field1178 * 128 - class187.baseX * 8192 + 64; // L: 4457
				var3 = var0.field1210 * 128 - class101.baseY * 8192 + 64; // L: 4458
				var4 = var0.x - var2; // L: 4459
				int var5 = var0.y - var3; // L: 4460
				if (var4 != 0 || var5 != 0) { // L: 4461
					var7 = SequenceDefinition.method4094(var4, var5); // L: 4462
				}
			} else if (var0.field1208 != -1) { // L: 4465
				var7 = var0.field1208; // L: 4466
			}

			if (var7 != -1) { // L: 4468
				var0.orientation = var7; // L: 4469
				if (var0.field1211) { // L: 4470
					var0.rotation = var0.orientation; // L: 4471
				}
			}

			var0.method2480(); // L: 4474
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4476
		if (var7 != 0) { // L: 4477
			boolean var8 = true; // L: 4478
			boolean var9 = true; // L: 4479
			++var0.field1192; // L: 4480
			var4 = var7 > 1024 ? -1 : 1; // L: 4481
			var0.rotation += var0.field1240 * var4; // L: 4482
			boolean var10 = true; // L: 4483
			if (var7 < var0.field1240 || var7 > 2048 - var0.field1240) { // L: 4484
				var0.rotation = var0.orientation; // L: 4485
				var10 = false; // L: 4486
			}

			if (var0.field1240 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1192 > 25 || var10)) { // L: 4488
				if (var4 == -1 && var0.field1191 != -1) { // L: 4489
					var0.movementSequence = var0.field1191; // L: 4490
				} else if (var4 == 1 && var0.field1207 != -1) { // L: 4492
					var0.movementSequence = var0.field1207; // L: 4493
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4496
				}
			}

			var0.rotation &= 2047; // L: 4500
		} else {
			if (var0.false0) { // L: 4503
				var0.targetIndex = -1; // L: 4504
				var0.false0 = false; // L: 4505
			}

			var0.field1192 = 0; // L: 4507
		}

	} // L: 4509
}
