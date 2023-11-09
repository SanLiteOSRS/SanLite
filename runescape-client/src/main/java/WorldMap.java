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

@ObfuscatedName("sv")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("am")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("aa")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	WorldMapArea field4931;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1605717315
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1046093717
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1492867841
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1692696579
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ax")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bm")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1732357749
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1185941817
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 203242629
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 638088419
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 672069275
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1718430979
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bb")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bi")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -856484031
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 863156169
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1569448537
	)
	int field4915;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -824982541
	)
	int field4916;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1096748109
	)
	int field4880;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1800848609
	)
	int field4918;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = 5116670401508919789L
	)
	long field4905;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1971791113
	)
	int field4920;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 519062143
	)
	int field4921;
	@ObfuscatedName("bk")
	boolean field4903;
	@ObfuscatedName("bv")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bl")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bg")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bs")
	HashSet field4919;
	@ObfuscatedName("bd")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -110853369
	)
	int field4892;
	@ObfuscatedName("ci")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cf")
	List field4930;
	@ObfuscatedName("cx")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cm")
	HashSet field4932;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cc")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1642283005
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1875425071
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1473125767
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1026962853
	)
	int field4939;

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
		this.field4915 = -1; // L: 75
		this.field4916 = -1; // L: 76
		this.field4880 = -1; // L: 77
		this.field4918 = -1; // L: 78
		this.field4903 = true; // L: 82
		this.enabledElements = new HashSet(); // L: 85
		this.enabledCategories = new HashSet(); // L: 86
		this.enabledElementIds = new HashSet(); // L: 87
		this.field4919 = new HashSet(); // L: 88
		this.elementsDisabled = false; // L: 89
		this.field4892 = 0; // L: 90
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 92
		this.field4932 = new HashSet(); // L: 95
		this.mouseCoord = null; // L: 96
		this.showCoord = false; // L: 97
		this.minCachedTileX = -1; // L: 100
		this.minCachedTileY = -1; // L: 101
		this.field4939 = -1; // L: 102
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;Lnr;Lpj;Ljava/util/HashMap;[Lum;I)V",
		garbageValue = "-1839086209"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3064.name); // L: 116
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
		this.field4931 = null; // L: 130
	} // L: 131

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "861344142"
	)
	public void method8506() {
		class332.method6579(); // L: 134
	} // L: 135

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "-27"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method5384(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class170.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4932.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4932.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						class170.runScriptEvent(var14); // L: 174
					}
				}

				this.field4932 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "3"
	)
	public void method8508(int var1, int var2, boolean var3, boolean var4) {
		long var5 = AttackOption.method2714(); // L: 182
		this.method8509(var1, var2, var4, var5); // L: 183
		if (!this.hasTarget() && (var4 || var3) && !class93.method2412()) { // L: 184
			if (var4) { // L: 185
				this.field4880 = var1; // L: 186
				this.field4918 = var2; // L: 187
				this.field4915 = this.centerTileX; // L: 188
				this.field4916 = this.centerTileY; // L: 189
			}

			if (this.field4915 != -1) { // L: 191
				int var7 = var1 - this.field4880; // L: 192
				int var8 = var2 - this.field4918; // L: 193
				this.setWorldMapPosition(this.field4915 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4916, false); // L: 194
			}
		} else {
			this.method8513(); // L: 198
		}

		if (var4) { // L: 200
			this.field4905 = var5; // L: 201
			this.field4920 = var1; // L: 202
			this.field4921 = var2; // L: 203
		}

	} // L: 205

	@ObfuscatedName("ay")
	void method8509(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 208
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 209
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 210
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 211
			if (this.mouseCoord != null && var3) { // L: 212
				class212 var8 = Messages.method2838(); // L: 213
				boolean var9 = Client.staffModLevel >= 2; // L: 216
				int var11;
				int var12;
				if (var9 && var8.method4285(82) && var8.method4285(81)) { // L: 218
					int var15 = this.mouseCoord.x; // L: 219
					var11 = this.mouseCoord.y; // L: 220
					var12 = this.mouseCoord.plane; // L: 221
					PacketBufferNode var13 = class217.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 224
					var13.packetBuffer.method9109(0); // L: 225
					var13.packetBuffer.writeIntME(var15); // L: 226
					var13.packetBuffer.method9087(var12); // L: 227
					var13.packetBuffer.method9097(var11); // L: 228
					Client.packetWriter.addNode(var13); // L: 229
				} else {
					boolean var10 = true; // L: 233
					if (this.field4903) { // L: 234
						var11 = var1 - this.field4920; // L: 235
						var12 = var2 - this.field4921; // L: 236
						if (var4 - this.field4905 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 237
							var10 = false; // L: 238
						}
					}

					if (var10) { // L: 241
						PacketBufferNode var14 = class217.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 242
						var14.packetBuffer.method9110(this.mouseCoord.packed()); // L: 243
						Client.packetWriter.addNode(var14); // L: 244
						this.field4905 = 0L; // L: 245
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 250
		}

	} // L: 251

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1747763100"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class348.field3881 != null) { // L: 254
			this.zoom = this.zoomTarget; // L: 255
		} else {
			if (this.zoom < this.zoomTarget) { // L: 258
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 259
			}

			if (this.zoom > this.zoomTarget) { // L: 261
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 262
			}

		}
	} // L: 256 264

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-342598302"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1907692934"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 286
		this.centerTileY = var2; // L: 287
		AttackOption.method2714(); // L: 288
		if (var3) {
			this.method8513(); // L: 289
		}

	} // L: 290

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-325059731"
	)
	final void method8513() {
		this.field4918 = -1; // L: 293
		this.field4880 = -1; // L: 294
		this.field4916 = -1; // L: 295
		this.field4915 = -1; // L: 296
	} // L: 297

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1633215606"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 300
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ljh;",
		garbageValue = "68"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-503472664"
	)
	public void method8516(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 316
		if (var5 == null) { // L: 317
			if (!var4) { // L: 318
				return; // L: 321
			}

			var5 = this.mainMapArea; // L: 319
		}

		boolean var6 = false; // L: 323
		if (var5 != this.field4931 || var4) { // L: 324
			this.field4931 = var5; // L: 325
			this.setCurrentMapArea(var5); // L: 326
			var6 = true; // L: 327
		}

		if (var6 || var4) { // L: 329
			this.jump(var1, var2, var3); // L: 330
		}

	} // L: 332

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1399750056"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 335
		if (var2 != null) { // L: 336
			this.setCurrentMapArea(var2); // L: 337
		}

	} // L: 339

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2010634128"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 342 343 345
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "25"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 349
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljh;I)V",
		garbageValue = "226304407"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 353
			this.initializeWorldMapManager(var1); // L: 356
			this.jump(-1, -1, -1); // L: 357
		}
	} // L: 354 358

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljh;I)V",
		garbageValue = "1427790790"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 361
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 362
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 363
	} // L: 364

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lmk;Lmk;ZI)V",
		garbageValue = "-2008551422"
	)
	public void method8522(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1467562307"
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
			this.field4930 = null; // L: 394
			this.iconIterator = null; // L: 395
			this.worldMapManager.clearIcons(); // L: 396
		}
	} // L: 383 397

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1118990548"
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
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 427
			if (!this.elementsDisabled) { // L: 428
				boolean var10 = false; // L: 429
				if (var5 - this.field4892 > 100) { // L: 430
					this.field4892 = var5; // L: 431
					var10 = true; // L: 432
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4919, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 434
			}

			this.method8537(var1, var2, var3, var4, var8, var9); // L: 436
			if (MouseRecorder.method2320() && this.showCoord && this.mouseCoord != null) { // L: 437
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 438
			this.worldMapDisplayHeight = var9; // L: 439
			this.worldMapDisplayX = var1; // L: 440
			this.worldMapDisplayY = var2; // L: 441
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 442
		}
	} // L: 407 443

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "24"
	)
	boolean method8525(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 446
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 447
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 448
				return true;
			} else if (this.field4939 != Client.field673) { // L: 449
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1377941823"
	)
	void method8537(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class348.field3881 != null) { // L: 456
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 457
			int var8 = var3 + 512; // L: 458
			int var9 = var4 + 512; // L: 459
			float var10 = 1.0F; // L: 460
			var8 = (int)((float)var8 / var10); // L: 461
			var9 = (int)((float)var9 / var10); // L: 462
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 463
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 464
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 465
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 466
			if (this.method8525(var8, var9, var13, var14, var3, var4)) { // L: 467
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 468
					Arrays.fill(this.sprite.pixels, 0); // L: 471
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 469
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 472
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 473
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 474
				class348.field3881.method6985(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 475
				this.field4939 = Client.field673; // L: 476
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 477
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 478
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 480
			if (1.0F == var10) { // L: 481
				this.sprite.method9549(var13, var14, 192); // L: 482
			} else {
				this.sprite.method9614(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192); // L: 485
			}
		}

	} // L: 488

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "496308365"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-945035769"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 504
	} // L: 505

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1783748167"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 508
		int var7 = var3 / 2 + var1; // L: 509
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 510
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 511
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 512
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 513
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 514
	} // L: 515

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-943250678"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "415680723"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) { // L: 527
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 528
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 529
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) { // L: 530
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 531 532
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.method8490(); // L: 536
	} // L: 537

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-58891663"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 540
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljh;",
		garbageValue = "29"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 544

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) { // L: 551
				return null; // L: 552
			}

			var3 = (WorldMapArea)var2.next(); // L: 545
		} while(var3.getId() != var1); // L: 547

		return var3; // L: 548
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "15177"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 556
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 559
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 560
		}
	} // L: 557 561

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1850412033"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 564
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 567
			this.worldMapTargetX = -1; // L: 568
			this.worldMapTargetY = -1; // L: 569
		}
	} // L: 565 570

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "289003791"
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1377093679"
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1072973176"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 593 594 596
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-675854379"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 600 601 603
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Lmk;",
		garbageValue = "-1408978941"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 607 608 610
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 614
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "119"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 618
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1763946569"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 622
			this.maxFlashCount = var1; // L: 623
		}

	} // L: 625

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "99"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 628
	} // L: 629

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1124473660"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 632
			this.cyclesPerFlash = var1; // L: 633
		}

	} // L: 635

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 638
	} // L: 639

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-7744"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 642
	} // L: 643

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "154088372"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 646
		this.flashingElements.add(var1); // L: 647
		this.flashCount = 0; // L: 648
		this.flashCycle = 0; // L: 649
	} // L: 650

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-936597061"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 653
		this.flashCount = 0; // L: 654
		this.flashCycle = 0; // L: 655

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 656
			if (class127.WorldMapElement_get(var2) != null && class127.WorldMapElement_get(var2).category == var1) { // L: 657 660
				this.flashingElements.add(class127.WorldMapElement_get(var2).objectId); // L: 661
			}
		}

	} // L: 664

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1709242063"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 667
	} // L: 668

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "73"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 671
	} // L: 672

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "49"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 675
			this.enabledElements.add(var1); // L: 676
		} else {
			this.enabledElements.remove(var1); // L: 679
		}

		this.method8627(); // L: 681
	} // L: 682

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1280963820"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 685
			this.enabledCategories.add(var1); // L: 686
		} else {
			this.enabledCategories.remove(var1); // L: 689
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 691
			if (class127.WorldMapElement_get(var3) != null && class127.WorldMapElement_get(var3).category == var1) { // L: 692 695
				int var4 = class127.WorldMapElement_get(var3).objectId; // L: 696
				if (!var2) { // L: 697
					this.enabledElementIds.add(var4); // L: 698
				} else {
					this.enabledElementIds.remove(var4); // L: 701
				}
			}
		}

		this.method8627(); // L: 705
	} // L: 706

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-708813180"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 709
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1572942117"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 713
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "117"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 717
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	void method8627() {
		this.field4919.clear(); // L: 721
		this.field4919.addAll(this.enabledElements); // L: 722
		this.field4919.addAll(this.enabledElementIds); // L: 723
	} // L: 724

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "39946460"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 727
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 730
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 731
			List var9 = this.worldMapManager.method5384(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 732
			if (!var9.isEmpty()) { // L: 733
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 736
						return; // L: 752
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 737
					WorldMapElement var12 = class127.WorldMapElement_get(var11.getElement()); // L: 739
					var13 = false; // L: 740

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 741
						if (var12.menuActions[var14] != null) { // L: 742
							class238.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 743
							var13 = true; // L: 744
						}
					}
				} while(!var13); // L: 747

			}
		}
	} // L: 728 734 748

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILmk;B)Lmk;",
		garbageValue = "-35"
	)
	public Coord method8691(int var1, Coord var2) {
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IILmk;Lmk;I)V",
		garbageValue = "-1145039906"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 790
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 791
		var5.setArgs(new Object[]{var6}); // L: 792
		switch(var1) { // L: 793
		case 1008:
			var5.setType(10); // L: 816
			break;
		case 1009:
			var5.setType(11); // L: 811
			break; // L: 812
		case 1010:
			var5.setType(12); // L: 801
			break; // L: 802
		case 1011:
			var5.setType(13); // L: 806
			break; // L: 807
		case 1012:
			var5.setType(14); // L: 796
		}

		class170.runScriptEvent(var5); // L: 820
	} // L: 821

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Lkd;",
		garbageValue = "934382694"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 824
			return null; // L: 825
		} else if (!this.worldMapManager.isLoaded()) { // L: 827
			return null; // L: 828
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 830
			this.field4930 = new LinkedList(); // L: 831
			Iterator var2 = var1.values().iterator(); // L: 832

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 833
				this.field4930.addAll(var3); // L: 835
			}

			this.iconIterator = this.field4930.iterator(); // L: 838
			return this.iconNext(); // L: 839
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Lkd;",
		garbageValue = "2043298766"
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
}
