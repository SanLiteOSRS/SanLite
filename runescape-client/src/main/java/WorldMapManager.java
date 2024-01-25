import java.io.IOException;
import java.net.Socket;
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

@ObfuscatedName("jj")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("am")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("ap")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("aq")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Ljt;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("ag")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("au")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -331804901
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1261781215
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -288323671
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -975234715
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -790300949
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lut;Ljava/util/HashMap;Low;Low;)V"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Ljava/lang/String;ZI)V",
		garbageValue = "-1421546342"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 42
			this.loaded = false; // L: 45
			this.loadStarted = true; // L: 46
			System.nanoTime(); // L: 47
			int var4 = var1.getGroupId(WorldMapCacheName.field2669.name); // L: 48
			int var5 = var1.getFileId(var4, var2); // L: 49
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2669.name, var2)); // L: 50
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2671.name, var2)); // L: 51
			System.nanoTime(); // L: 52
			System.nanoTime(); // L: 53
			this.mapAreaData = new WorldMapAreaData(); // L: 54

			try {
				this.mapAreaData.init(var6, var7, var5, var3); // L: 56
			} catch (IllegalStateException var19) { // L: 58
				return; // L: 59
			}

			this.mapAreaData.getOriginX(); // L: 61
			this.mapAreaData.getOriginPlane(); // L: 62
			this.mapAreaData.getOriginY(); // L: 63
			this.tileX = this.mapAreaData.getRegionLowX() * 64; // L: 64
			this.tileY = this.mapAreaData.getRegionLowY() * 64; // L: 65
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64; // L: 66
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64; // L: 67
			int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 68
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 69
			System.nanoTime(); // L: 70
			System.nanoTime(); // L: 71
			class216.method4273(); // L: 72
			this.regions = new WorldMapRegion[var16][var9]; // L: 73
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator(); // L: 74

			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next(); // L: 75
				int var12 = var11.regionX; // L: 77
				int var13 = var11.regionY; // L: 78
				int var14 = var12 - this.mapAreaData.getRegionLowX(); // L: 79
				int var15 = var13 - this.mapAreaData.getRegionLowY(); // L: 80
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 81
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList); // L: 82
			}

			for (int var17 = 0; var17 < var16; ++var17) { // L: 85
				for (int var18 = 0; var18 < var9; ++var18) { // L: 86
					if (this.regions[var17][var18] == null) { // L: 87
						this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts); // L: 88
						this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList); // L: 89
					}
				}
			}

			System.nanoTime(); // L: 93
			System.nanoTime(); // L: 94
			if (var1.isValidFileName(WorldMapCacheName.field2670.name, var2)) { // L: 95
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2670.name, var2); // L: 96
				this.compositeTextureSprite = class181.method3691(var20); // L: 97
			}

			System.nanoTime(); // L: 99
			var1.clearGroups(); // L: 100
			var1.method7046(); // L: 101
			this.loaded = true; // L: 102
		}
	} // L: 43 103

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1534354393"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 106
	} // L: 107

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1417210426"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 110
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 111
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 112
		float[] var12 = Rasterizer2D.field5253; // L: 113
		int[] var13 = new int[4]; // L: 114
		Rasterizer2D.Rasterizer2D_getClipArray(var13); // L: 115
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 116
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 117
		int var16 = (int)Math.ceil((double)var15); // L: 118
		this.pixelsPerTile = var16; // L: 119
		if (!this.scaleHandlers.containsKey(var16)) { // L: 120
			WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16); // L: 121
			var17.init(); // L: 122
			this.scaleHandlers.put(var16, var17); // L: 123
		}

		int var24 = var14.width + var14.x - 1; // L: 125
		int var18 = var14.height + var14.y - 1; // L: 126

		int var19;
		int var20;
		for (var19 = var14.x; var19 <= var24; ++var19) { // L: 127
			for (var20 = var14.y; var20 <= var18; ++var20) { // L: 128
				this.regions[var19][var20].drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 129
			}
		}

		Rasterizer3D.method5308(var9, var10, var11, var12); // L: 132
		Rasterizer2D.Rasterizer2D_setClipArray(var13); // L: 133
		var19 = (int)(var15 * 64.0F); // L: 134
		var20 = this.tileX * 4096 + var1; // L: 135
		int var21 = this.tileY * 4096 + var2; // L: 136

		for (int var22 = var14.x; var22 < var14.width + var14.x; ++var22) { // L: 137
			for (int var23 = var14.y; var23 < var14.y + var14.height; ++var23) { // L: 138
				this.regions[var22][var23].method4730(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19); // L: 139
			}
		}

	} // L: 142

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1921274079"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 145
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 146
		int var16 = (int)(var15 * 64.0F); // L: 147
		int var17 = this.tileX * 4096 + var1; // L: 148
		int var18 = this.tileY * 4096 + var2; // L: 149

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 150
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 151
				if (var13) { // L: 152
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 153
				}

				this.regions[var19][var20].method4810(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9); // L: 155
			}
		}

		if (var10 != null && var11 > 0) { // L: 158
			for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 159
				for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 160
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 161
				}
			}
		}

	} // L: 165

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;IIB)V",
		garbageValue = "18"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) { // L: 168
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4); // L: 171
			if (var6 > 0 && var6 % var7 < var7 / 2) { // L: 172
				if (this.icons == null) { // L: 175
					this.buildIcons0(); // L: 176
				}

				Iterator var8 = var5.iterator(); // L: 178

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return; // L: 195
						}

						int var9 = (Integer)var8.next(); // L: 179
						var10 = (List)this.icons.get(var9); // L: 181
					} while(var10 == null); // L: 182

					Iterator var11 = var10.iterator(); // L: 185

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 186
						int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 4096); // L: 188
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 4096); // L: 189
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 190
					}
				}
			}
		}
	} // L: 169 173

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "-2036632356"
	)
	public List method4858(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 198
		if (!this.loaded) { // L: 199
			return var11; // L: 200
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 202
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 203
			int var14 = (int)(var13 * 64.0F); // L: 204
			int var15 = this.tileX * 4096 + var1; // L: 205
			int var16 = this.tileY * 4096 + var2; // L: 206

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 207
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 208
					List var19 = this.regions[var17][var18].method4760(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10); // L: 209
					if (!var19.isEmpty()) { // L: 210
						var11.addAll(var19); // L: 211
					}
				}
			}

			return var11; // L: 215
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Lje;",
		garbageValue = "-37"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 219
		int var6 = this.tileX * 4096 + var1; // L: 220
		int var7 = this.tileY * 4096 + var2; // L: 221
		int var8 = var3 + this.tileX * 4096; // L: 222
		int var9 = this.tileY * 4096 + var4; // L: 223
		int var10 = var6 / 64; // L: 224
		int var11 = var7 / 64; // L: 225
		int var12 = var8 / 64; // L: 226
		int var13 = var9 / 64; // L: 227
		var5.width = var12 - var10 + 1; // L: 228
		var5.height = var13 - var11 + 1; // L: 229
		var5.x = var10 - this.mapAreaData.getRegionLowX(); // L: 230
		var5.y = var11 - this.mapAreaData.getRegionLowY(); // L: 231
		if (var5.x < 0) { // L: 232
			var5.width += var5.x; // L: 233
			var5.x = 0; // L: 234
		}

		if (var5.x > this.regions.length - var5.width) { // L: 236
			var5.width = this.regions.length - var5.x; // L: 237
		}

		if (var5.y < 0) { // L: 239
			var5.height += var5.y; // L: 240
			var5.y = 0; // L: 241
		}

		if (var5.y > this.regions[0].length - var5.height) { // L: 243
			var5.height = this.regions[0].length - var5.y; // L: 244
		}

		var5.width = Math.min(var5.width, this.regions.length); // L: 246
		var5.height = Math.min(var5.height, this.regions[0].length); // L: 247
		return var5; // L: 248
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1165770522"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 252
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2013516897"
	)
	public int method4861() {
		return this.mapAreaData.method4690(); // L: 256
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "1255344539"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 260
		return this.icons; // L: 261
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) { // L: 265
			this.icons = new HashMap(); // L: 266
		}

		this.icons.clear(); // L: 268

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 269
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) { // L: 270
				List var3 = this.regions[var1][var2].icons(); // L: 271
				Iterator var4 = var3.iterator(); // L: 272

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 273
					if (var5.hasValidElement()) { // L: 275
						int var6 = var5.getElement(); // L: 276
						if (!this.icons.containsKey(var6)) { // L: 277
							LinkedList var7 = new LinkedList(); // L: 278
							var7.add(var5); // L: 279
							this.icons.put(var6, var7); // L: 280
						} else {
							List var8 = (List)this.icons.get(var6); // L: 283
							var8.add(var5); // L: 284
						}
					}
				}
			}
		}

	} // L: 290

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "-44"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 293
		if (var3 > 8.0F) { // L: 294
			return 8.0F;
		} else if (var3 < 1.0F) { // L: 295
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 296
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3; // L: 297 298
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lri;",
		garbageValue = "1059788083"
	)
	public static AbstractSocket method4879(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}
}
