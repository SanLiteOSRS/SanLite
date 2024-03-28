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

@ObfuscatedName("kh")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("bk")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("az")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("ah")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("an")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Lkr;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("ab")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("as")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -379204288
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 218630049
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1462745536
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1265874240
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1424585833
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lvl;Ljava/util/HashMap;Loc;Loc;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false; // L: 17
		this.loadStarted = false; // L: 18
		this.scaleHandlers = new HashMap(); // L: 23
		this.pixelsPerTile = 0; // L: 32
		this.mapSceneSprites = var1; // L: 35
		this.fonts = var2; // L: 36
		this.geographyArchive = var3; // L: 37
		this.groundArchive = var4; // L: 38
	} // L: 39

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Ljava/lang/String;ZI)V",
		garbageValue = "1542137265"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 42
			this.loaded = false; // L: 45
			this.loadStarted = true; // L: 46
			System.nanoTime(); // L: 47
			int var4 = var1.getGroupId(WorldMapCacheName.field3154.name); // L: 48
			int var5 = var1.getFileId(var4, var2); // L: 49
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3154.name, var2)); // L: 50
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3155.name, var2)); // L: 51
			System.nanoTime(); // L: 52
			System.nanoTime(); // L: 53
			this.mapAreaData = new WorldMapAreaData();

			try {
				this.mapAreaData.init(var6, var7, var5, var3); // L: 56
			} catch (IllegalStateException var19) { // L: 58
				return; // L: 59
			}

			this.mapAreaData.getOriginX(); // L: 61
			this.mapAreaData.getOriginPlane(); // L: 62
			this.mapAreaData.getOriginY(); // L: 63
			this.tileX = this.mapAreaData.getRegionLowX() * 4096; // L: 64
			this.tileY = this.mapAreaData.getRegionLowY() * 64; // L: 65
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 4096; // L: 66
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 4096; // L: 67
			int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 68
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 69
			System.nanoTime(); // L: 70
			System.nanoTime(); // L: 71
			WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 73
			this.regions = new WorldMapRegion[var16][var9]; // L: 75
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator(); // L: 76

			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next(); // L: 77
				int var12 = var11.regionX; // L: 79
				int var13 = var11.regionY; // L: 80
				int var14 = var12 - this.mapAreaData.getRegionLowX(); // L: 81
				int var15 = var13 - this.mapAreaData.getRegionLowY(); // L: 82
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 83
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList); // L: 84
			}

			for (int var17 = 0; var17 < var16; ++var17) { // L: 87
				for (int var18 = 0; var18 < var9; ++var18) { // L: 88
					if (this.regions[var17][var18] == null) { // L: 89
						this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 90
						this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList); // L: 91
					}
				}
			}

			System.nanoTime(); // L: 95
			System.nanoTime(); // L: 96
			if (var1.isValidFileName(WorldMapCacheName.field3156.name, var2)) { // L: 97
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field3156.name, var2); // L: 98
				this.compositeTextureSprite = GrandExchangeOfferUnitPriceComparator.method7149(var20); // L: 99
			}

			System.nanoTime(); // L: 101
			var1.clearGroups(); // L: 102
			var1.clearFiles(); // L: 103
			this.loaded = true; // L: 104
		}
	} // L: 43 105

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "88065186"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 108
	} // L: 109

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1227005264"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 112
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 113
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 114
		float[] var12 = Rasterizer2D.field5304; // L: 115
		int[] var13 = new int[4]; // L: 116
		Rasterizer2D.Rasterizer2D_getClipArray(var13); // L: 117
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 118
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 119
		int var16 = (int)Math.ceil((double)var15); // L: 120
		this.pixelsPerTile = var16; // L: 121
		if (!this.scaleHandlers.containsKey(var16)) { // L: 122
			WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16); // L: 123
			var17.init(); // L: 124
			this.scaleHandlers.put(var16, var17); // L: 125
		}

		int var24 = var14.width + var14.x - 1; // L: 127
		int var18 = var14.y + var14.height - 1; // L: 128

		int var19;
		int var20;
		for (var19 = var14.x; var19 <= var24; ++var19) { // L: 129
			for (var20 = var14.y; var20 <= var18; ++var20) { // L: 130
				this.regions[var19][var20].drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 131
			}
		}

		Rasterizer3D.method4572(var9, var10, var11, var12); // L: 134
		Rasterizer2D.Rasterizer2D_setClipArray(var13); // L: 135
		var19 = (int)(var15 * 64.0F); // L: 136
		var20 = this.tileX * 64 + var1; // L: 137
		int var21 = this.tileY * 4096 + var2; // L: 138

		for (int var22 = var14.x; var22 < var14.width + var14.x; ++var22) { // L: 139
			for (int var23 = var14.y; var23 < var14.height + var14.y; ++var23) { // L: 140
				this.regions[var22][var23].method5372(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19); // L: 141
			}
		}

	} // L: 144

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-90119421"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 147
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 148
		int var16 = (int)(var15 * 64.0F); // L: 149
		int var17 = this.tileX * 64 + var1; // L: 150
		int var18 = this.tileY * 4096 + var2; // L: 151

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 152
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 153
				if (var13) { // L: 154
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 155
				}

				this.regions[var19][var20].method5419(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9); // L: 157
			}
		}

		if (var10 != null && var11 > 0) { // L: 160
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 161
				for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 162
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 163
				}
			}
		}

	} // L: 167

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "1958960303"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) { // L: 170
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4); // L: 173
			if (var6 > 0 && var6 % var7 < var7 / 2) { // L: 174
				if (this.icons == null) { // L: 177
					this.buildIcons0(); // L: 178
				}

				Iterator var8 = var5.iterator(); // L: 180

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return; // L: 197
						}

						int var9 = (Integer)var8.next(); // L: 181
						var10 = (List)this.icons.get(var9); // L: 183
					} while(var10 == null); // L: 184

					Iterator var11 = var10.iterator();

					while (var11.hasNext()) { // L: 187
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 188
						int var13 = var3 * (var12.coord2.x - this.tileX * 64) / (this.tileWidth * 64); // L: 190
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 64); // L: 191
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 192
					}
				}
			}
		}
	} // L: 171 175

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "-103296801"
	)
	public List method5489(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 200
		if (!this.loaded) { // L: 201
			return var11; // L: 202
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 204
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 205
			int var14 = (int)(var13 * 64.0F); // L: 206
			int var15 = this.tileX * 64 + var1; // L: 207
			int var16 = this.tileY * 4096 + var2; // L: 208

			for (int var17 = var12.x; var17 < var12.width + var12.x; ++var17) { // L: 209
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) { // L: 210
					List var19 = this.regions[var17][var18].method5403(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10); // L: 211
					if (!var19.isEmpty()) { // L: 212
						var11.addAll(var19); // L: 213
					}
				}
			}

			return var11; // L: 217
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lkc;",
		garbageValue = "-536140242"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 221
		int var6 = this.tileX * 64 + var1; // L: 222
		int var7 = this.tileY * 4096 + var2; // L: 223
		int var8 = var3 + this.tileX * 64; // L: 224
		int var9 = this.tileY * 4096 + var4; // L: 225
		int var10 = var6 / 64; // L: 226
		int var11 = var7 / 64; // L: 227
		int var12 = var8 / 64; // L: 228
		int var13 = var9 / 64; // L: 229
		var5.width = var12 - var10 + 1; // L: 230
		var5.height = var13 - var11 + 1; // L: 231
		var5.x = var10 - this.mapAreaData.getRegionLowX(); // L: 232
		var5.y = var11 - this.mapAreaData.getRegionLowY(); // L: 233
		if (var5.x < 0) { // L: 234
			var5.width += var5.x; // L: 235
			var5.x = 0; // L: 236
		}

		if (var5.x > this.regions.length - var5.width) { // L: 238
			var5.width = this.regions.length - var5.x; // L: 239
		}

		if (var5.y < 0) { // L: 241
			var5.height += var5.y; // L: 242
			var5.y = 0; // L: 243
		}

		if (var5.y > this.regions[0].length - var5.height) { // L: 245
			var5.height = this.regions[0].length - var5.y; // L: 246
		}

		var5.width = Math.min(var5.width, this.regions.length); // L: 248
		var5.height = Math.min(var5.height, this.regions[0].length); // L: 249
		return var5; // L: 250
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 254
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-895025162"
	)
	public int method5492() {
		return this.mapAreaData.method5332(); // L: 258
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-1572764365"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 262
		return this.icons; // L: 263
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "735807728"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) { // L: 267
			this.icons = new HashMap(); // L: 268
		}

		this.icons.clear(); // L: 270

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 271
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) { // L: 272
				List var3 = this.regions[var1][var2].icons(); // L: 273
				Iterator var4 = var3.iterator(); // L: 274

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 275
					if (var5.hasValidElement()) { // L: 277
						int var6 = var5.getElement(); // L: 278
						if (!this.icons.containsKey(var6)) { // L: 279
							LinkedList var7 = new LinkedList(); // L: 280
							var7.add(var5); // L: 281
							this.icons.put(var6, var7); // L: 282
						} else {
							List var8 = (List)this.icons.get(var6); // L: 285
							var8.add(var5); // L: 286
						}
					}
				}
			}
		}

	} // L: 292

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "32"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 295
		if (var3 > 8.0F) { // L: 296
			return 8.0F;
		} else if (var3 < 1.0F) { // L: 297
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 298
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3; // L: 299 300
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1816171479"
	)
	static void method5528() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 54

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 55
			var1.clearIsFromIgnored(); // L: 57
		}

	} // L: 60
}
