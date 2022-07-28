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

@ObfuscatedName("ha")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("o")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("q")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("c")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[[Lhp;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("z")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("d")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1353770129
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 223427683
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 245338688
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2069231743
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 316879279
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lql;Ljava/util/HashMap;Llc;Llc;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false; // L: 16
		this.loadStarted = false; // L: 17
		this.scaleHandlers = new HashMap(); // L: 22
		this.pixelsPerTile = 0; // L: 31
		this.mapSceneSprites = var1; // L: 34
		this.fonts = var2; // L: 35
		this.geographyArchive = var3; // L: 36
		this.groundArchive = var4; // L: 37
	} // L: 38

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;Ljava/lang/String;ZB)V",
		garbageValue = "65"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field2867.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2867.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2861.name, var2)); // L: 50
			System.nanoTime(); // L: 51
			System.nanoTime(); // L: 52
			this.mapAreaData = new WorldMapAreaData(); // L: 53

			try {
				this.mapAreaData.init(var6, var7, var5, var3); // L: 55
			} catch (IllegalStateException var19) { // L: 57
				return; // L: 58
			}

			this.mapAreaData.getOriginX(); // L: 60
			this.mapAreaData.getOriginPlane(); // L: 61
			this.mapAreaData.getOriginY(); // L: 62
			this.tileX = this.mapAreaData.getRegionLowX() * 64; // L: 63
			this.tileY = this.mapAreaData.getRegionLowY() * 64; // L: 64
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 4096; // L: 65
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64; // L: 66
			int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 67
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 68
			System.nanoTime(); // L: 69
			System.nanoTime(); // L: 70
			AbstractWorldMapIcon.method5045(); // L: 71
			this.regions = new WorldMapRegion[var16][var9]; // L: 72
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator(); // L: 73

			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next(); // L: 74
				int var12 = var11.regionX; // L: 76
				int var13 = var11.regionY; // L: 77
				int var14 = var12 - this.mapAreaData.getRegionLowX(); // L: 78
				int var15 = var13 - this.mapAreaData.getRegionLowY(); // L: 79
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 80
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList); // L: 81
			}

			for (int var17 = 0; var17 < var16; ++var17) { // L: 84
				for (int var18 = 0; var18 < var9; ++var18) { // L: 85
					if (this.regions[var17][var18] == null) { // L: 86
						this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 87
						this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList); // L: 88
					}
				}
			}

			System.nanoTime(); // L: 92
			System.nanoTime(); // L: 93
			if (var1.isValidFileName(WorldMapCacheName.field2863.name, var2)) { // L: 94
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2863.name, var2); // L: 95
				this.compositeTextureSprite = class147.method3105(var20); // L: 96
			}

			System.nanoTime(); // L: 98
			var1.clearGroups(); // L: 99
			var1.clearFiles(); // L: 100
			this.loaded = true; // L: 101
		}
	} // L: 42 102

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 105
	} // L: 106

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1493726072"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 109
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 110
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 111
		int[] var12 = new int[4]; // L: 112
		Rasterizer2D.Rasterizer2D_getClipArray(var12); // L: 113
		WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 114
		float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 115
		int var15 = (int)Math.ceil((double)var14); // L: 116
		this.pixelsPerTile = var15; // L: 117
		if (!this.scaleHandlers.containsKey(var15)) { // L: 118
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15); // L: 119
			var16.init(); // L: 120
			this.scaleHandlers.put(var15, var16); // L: 121
		}

		int var23 = var13.x + var13.width - 1; // L: 123
		int var17 = var13.height + var13.y - 1; // L: 124

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) { // L: 125
			for (var19 = var13.y; var19 <= var17; ++var19) { // L: 126
				this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 127
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11); // L: 130
		Rasterizer2D.Rasterizer2D_setClipArray(var12); // L: 131
		var18 = (int)(var14 * 64.0F); // L: 132
		var19 = this.tileX * 4096 + var1; // L: 133
		int var20 = this.tileY * 4096 + var2; // L: 134

		for (int var21 = var13.x; var21 < var13.x + var13.width; ++var21) { // L: 135
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) { // L: 136
				this.regions[var21][var22].method4658(var5 + var18 * (this.regions[var21][var22].regionX * 64 - var19) / 64, var8 - var18 * (this.regions[var21][var22].regionY * 64 - var20 + 64) / 64, var18); // L: 137
			}
		}

	} // L: 140

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1764328690"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 143
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 144
		int var16 = (int)(var15 * 64.0F); // L: 145
		int var17 = this.tileX * 4096 + var1; // L: 146
		int var18 = this.tileY * 4096 + var2; // L: 147

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 148
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 149
				if (var13) { // L: 150
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 151
				}

				this.regions[var19][var20].method4668(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9); // L: 153
			}
		}

		if (var10 != null && var11 > 0) { // L: 156
			for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 157
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 158
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 159
				}
			}
		}

	} // L: 163

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;IIB)V",
		garbageValue = "16"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) { // L: 166
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4); // L: 169
			if (var6 > 0 && var6 % var7 < var7 / 2) { // L: 170
				if (this.icons == null) { // L: 173
					this.buildIcons0(); // L: 174
				}

				Iterator var8 = var5.iterator(); // L: 176

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return; // L: 193
						}

						int var9 = (Integer)var8.next(); // L: 177
						var10 = (List)this.icons.get(var9); // L: 179
					} while(var10 == null); // L: 180

					Iterator var11 = var10.iterator(); // L: 183

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 184
						int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 64); // L: 186
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 4096); // L: 187
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 188
					}
				}
			}
		}
	} // L: 167 171

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)Ljava/util/List;",
		garbageValue = "-5"
	)
	public List method4792(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 196
		if (!this.loaded) { // L: 197
			return var11; // L: 198
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 200
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 201
			int var14 = (int)(64.0F * var13); // L: 202
			int var15 = this.tileX * 4096 + var1; // L: 203
			int var16 = this.tileY * 4096 + var2; // L: 204

			for (int var17 = var12.x; var17 < var12.width + var12.x; ++var17) { // L: 205
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 206
					List var19 = this.regions[var17][var18].method4689(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10); // L: 207
					if (!var19.isEmpty()) { // L: 208
						var11.addAll(var19); // L: 209
					}
				}
			}

			return var11; // L: 213
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lio;",
		garbageValue = "1749225445"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 217
		int var6 = this.tileX * 4096 + var1; // L: 218
		int var7 = this.tileY * 4096 + var2; // L: 219
		int var8 = var3 + this.tileX * 4096; // L: 220
		int var9 = this.tileY * 4096 + var4; // L: 221
		int var10 = var6 / 64; // L: 222
		int var11 = var7 / 64; // L: 223
		int var12 = var8 / 64; // L: 224
		int var13 = var9 / 64; // L: 225
		var5.width = var12 - var10 + 1; // L: 226
		var5.height = var13 - var11 + 1; // L: 227
		var5.x = var10 - this.mapAreaData.getRegionLowX(); // L: 228
		var5.y = var11 - this.mapAreaData.getRegionLowY(); // L: 229
		if (var5.x < 0) { // L: 230
			var5.width += var5.x; // L: 231
			var5.x = 0; // L: 232
		}

		if (var5.x > this.regions.length - var5.width) { // L: 234
			var5.width = this.regions.length - var5.x; // L: 235
		}

		if (var5.y < 0) { // L: 237
			var5.height += var5.y; // L: 238
			var5.y = 0; // L: 239
		}

		if (var5.y > this.regions[0].length - var5.height) { // L: 241
			var5.height = this.regions[0].length - var5.y; // L: 242
		}

		var5.width = Math.min(var5.width, this.regions.length); // L: 244
		var5.height = Math.min(var5.height, this.regions[0].length); // L: 245
		return var5; // L: 246
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "56"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 250
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-1481313256"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 254
		return this.icons; // L: 255
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) { // L: 259
			this.icons = new HashMap(); // L: 260
		}

		this.icons.clear(); // L: 262

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 263
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) { // L: 264
				List var3 = this.regions[var1][var2].icons(); // L: 265
				Iterator var4 = var3.iterator(); // L: 266

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 267
					if (var5.hasValidElement()) { // L: 269
						int var6 = var5.getElement(); // L: 270
						if (!this.icons.containsKey(var6)) { // L: 271
							LinkedList var7 = new LinkedList(); // L: 272
							var7.add(var5); // L: 273
							this.icons.put(var6, var7); // L: 274
						} else {
							List var8 = (List)this.icons.get(var6); // L: 277
							var8.add(var5); // L: 278
						}
					}
				}
			}
		}

	} // L: 284

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "-85"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 287
		if (var3 > 8.0F) { // L: 288
			return 8.0F;
		} else if (var3 < 1.0F) { // L: 289
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 290
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3; // L: 291 292
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-2106238491"
	)
	public static float method4818(int var0) {
		var0 &= 16383; // L: 24
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D); // L: 25
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1427877552"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[FriendSystem.Client_plane][var0][var1]; // L: 7962
		if (var2 == null) { // L: 7963
			Decimator.scene.removeGroundItemPile(FriendSystem.Client_plane, var0, var1); // L: 7964
		} else {
			long var3 = -99999999L; // L: 7967
			TileItem var5 = null; // L: 7968

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7969 7970 7978
				ItemComposition var7 = class258.ItemComposition_get(var6.id); // L: 7971
				long var11 = (long)var7.price; // L: 7972
				if (var7.isStackable == 1) { // L: 7973
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7974
					var3 = var11; // L: 7975
					var5 = var6; // L: 7976
				}
			}

			if (var5 == null) { // L: 7980
				Decimator.scene.removeGroundItemPile(FriendSystem.Client_plane, var0, var1); // L: 7981
			} else {
				var2.addLast(var5); // L: 7984
				TileItem var13 = null; // L: 7985
				TileItem var8 = null; // L: 7986

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7987 7988 7993
					if (var6.id != var5.id) { // L: 7989
						if (var13 == null) { // L: 7990
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7991
							var8 = var6;
						}
					}
				}

				long var9 = class394.calculateTag(var0, var1, 3, false, 0); // L: 7995
				Decimator.scene.newGroundItemPile(FriendSystem.Client_plane, var0, var1, SecureRandomFuture.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, FriendSystem.Client_plane), var5, var9, var13, var8); // L: 7996
			}
		}
	} // L: 7965 7982 7997
}
