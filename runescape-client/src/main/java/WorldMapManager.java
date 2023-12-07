import java.util.ArrayList;
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

@ObfuscatedName("jf")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("at")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("ah")
	boolean field2490;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("ab")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[Ljl;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("aa")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("ap")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2120914503
	)
	int field2500;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 775584779
	)
	int field2499;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1810827253
	)
	int field2503;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -439773231
	)
	int field2504;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1484309687
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lup;Ljava/util/HashMap;Lol;Lol;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false; // L: 17
		this.field2490 = false; // L: 18
		this.scaleHandlers = new HashMap(); // L: 23
		this.pixelsPerTile = 0; // L: 32
		this.mapSceneSprites = var1; // L: 35
		this.fonts = var2; // L: 36
		this.geographyArchive = var3; // L: 37
		this.groundArchive = var4; // L: 38
	} // L: 39

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Ljava/lang/String;ZZB)V",
		garbageValue = "-4"
	)
	public void method4733(AbstractArchive var1, String var2, boolean var3, boolean var4) {
		if (!this.field2490) { // L: 42
			this.loaded = false; // L: 45
			this.field2490 = true; // L: 46
			System.nanoTime(); // L: 47
			int var5 = var1.getGroupId(WorldMapCacheName.field2633.name); // L: 48
			int var6 = var1.getFileId(var5, var2); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2633.name, var2)); // L: 50
			Buffer var8 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2626.name, var2)); // L: 51
			System.nanoTime(); // L: 52
			System.nanoTime(); // L: 53
			this.mapAreaData = new WorldMapAreaData(); // L: 54

			try {
				this.mapAreaData.method5036(var7, var8, var6, var3, var4); // L: 56
			} catch (IllegalStateException var20) { // L: 58
				return; // L: 59
			}

			this.mapAreaData.getOriginX(); // L: 61
			this.mapAreaData.getOriginPlane(); // L: 62
			this.mapAreaData.getOriginY(); // L: 63
			this.field2500 = this.mapAreaData.getRegionLowX() * 64; // L: 64
			this.field2499 = this.mapAreaData.getRegionLowY() * 64; // L: 65
			this.field2503 = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64; // L: 66
			this.field2504 = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64; // L: 67
			int var17 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 68
			int var10 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 69
			System.nanoTime(); // L: 70
			System.nanoTime(); // L: 71
			WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 73
			this.regions = new WorldMapRegion[var17][var10]; // L: 75
			Iterator var11 = this.mapAreaData.field2635.iterator(); // L: 76

			while (var11.hasNext()) {
				WorldMapData_0 var12 = (WorldMapData_0)var11.next(); // L: 77
				int var13 = var12.regionX; // L: 79
				int var14 = var12.regionY; // L: 80
				int var15 = var13 - this.mapAreaData.getRegionLowX(); // L: 81
				int var16 = var14 - this.mapAreaData.getRegionLowY(); // L: 82
				this.regions[var15][var16] = new WorldMapRegion(var13, var14, this.mapAreaData.method4573(), this.fonts); // L: 83
				this.regions[var15][var16].initWorldMapData0(var12, this.mapAreaData.iconList); // L: 84
			}

			for (int var18 = 0; var18 < var17; ++var18) { // L: 87
				for (int var19 = 0; var19 < var10; ++var19) { // L: 88
					if (this.regions[var18][var19] == null) { // L: 89
						this.regions[var18][var19] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var18, this.mapAreaData.getRegionLowY() + var19, this.mapAreaData.method4573(), this.fonts); // L: 90
						this.regions[var18][var19].initWorldMapData1(this.mapAreaData.field2636, this.mapAreaData.iconList); // L: 91
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.isValidFileName(WorldMapCacheName.field2628.name, var2)) {
				byte[] var21 = var1.takeFileByNames(WorldMapCacheName.field2628.name, var2); // L: 98
				this.compositeTextureSprite = WorldMapArchiveLoader.method8710(var21); // L: 99
			}

			System.nanoTime();
			var1.clearGroups();
			var1.method7027(); // L: 103
			this.loaded = true;
		}
	} // L: 43 105

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-120523343"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 108
	} // L: 109

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-737280912"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 112
		int var10 = Rasterizer2D.Rasterizer2D_width;
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 114
		float[] var12 = Rasterizer2D.field5209;
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

		int var24 = var14.x + var14.width - 1; // L: 127
		int var18 = var14.y + var14.height - 1; // L: 128

		int var19;
		int var20;
		for (var19 = var14.x; var19 <= var24; ++var19) { // L: 129
			for (var20 = var14.y; var20 <= var18; ++var20) { // L: 130
				this.regions[var19][var20].drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 131
			}
		}

		Rasterizer3D.method5263(var9, var10, var11, var12); // L: 134
		Rasterizer2D.Rasterizer2D_setClipArray(var13); // L: 135
		var19 = (int)(var15 * 64.0F); // L: 136
		var20 = this.field2500 * 4096 + var1; // L: 137
		int var21 = this.field2499 * 4096 + var2; // L: 138

		for (int var22 = var14.x; var22 < var14.x + var14.width; ++var22) { // L: 139
			for (int var23 = var14.y; var23 < var14.y + var14.height; ++var23) { // L: 140
				this.regions[var22][var23].method4625(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19); // L: 141
			}
		}

	} // L: 144

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1576808810"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 147
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 148
		int var16 = (int)(64.0F * var15); // L: 149
		int var17 = this.field2500 * 4096 + var1; // L: 150
		int var18 = this.field2499 * 4096 + var2; // L: 151

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 152
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 153
				if (var13) { // L: 154
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 155
				}

				this.regions[var19][var20].method4634(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9); // L: 157
			}
		}

		if (var10 != null && var11 > 0) { // L: 160
			for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 161
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 162
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 163
				}
			}
		}

	} // L: 167

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "-1372538042"
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

					Iterator var11 = var10.iterator(); // L: 187

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 188
						int var13 = var3 * (var12.coord2.x - this.field2500 * 4096) / (this.field2503 * 4096); // L: 190
						int var14 = var4 - (var12.coord2.y - this.field2499 * 4096) * var4 / (this.field2504 * 4096); // L: 191
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 192
					}
				}
			}
		}
	} // L: 171 175

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "-44973275"
	)
	public List method4764(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 200
		if (!this.loaded) { // L: 201
			return var11; // L: 202
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 204
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 205
			int var14 = (int)(64.0F * var13); // L: 206
			int var15 = this.field2500 * 4096 + var1; // L: 207
			int var16 = this.field2499 * 4096 + var2; // L: 208

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 209
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 210
					List var19 = this.regions[var17][var18].method4699(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10); // L: 211
					if (!var19.isEmpty()) { // L: 212
						var11.addAll(var19); // L: 213
					}
				}
			}

			return var11; // L: 217
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Ljy;",
		garbageValue = "-242177292"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 221
		int var6 = this.field2500 * 4096 + var1; // L: 222
		int var7 = this.field2499 * 4096 + var2; // L: 223
		int var8 = var3 + this.field2500 * 4096; // L: 224
		int var9 = this.field2499 * 4096 + var4; // L: 225
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2083018743"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 254
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1029220515"
	)
	public int method4741() {
		return this.mapAreaData.method4620(); // L: 258
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/HashMap;",
		garbageValue = "-62"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 262
		return this.icons; // L: 263
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "22535"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "847621694"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-129998298"
	)
	public static void method4769(int var0, int var1) {
		EnumComposition.method3678(var0, var1, 0, 0); // L: 92
		class316.field3424.clear(); // L: 93
		class316.field3413.clear(); // L: 94
		if (class316.field3422.isEmpty() || var0 == 0 && var1 == 0) { // L: 95
			SecureRandomCallable.method2326(); // L: 113
		} else {
			class316.field3413.add(new class414((class418)null, class316.field3421)); // L: 96
			class316.field3413.add(new class416((class418)null, 0, false, class316.field3418)); // L: 97
			ArrayList var3 = new ArrayList(); // L: 100
			Iterator var4 = class316.field3422.iterator(); // L: 101

			while (var4.hasNext()) { // L: 106
				class328 var5 = (class328)var4.next(); // L: 102
				var3.add(var5); // L: 104
			}

			class316.field3413.add(new class413((class418)null, var3)); // L: 110
		}

	} // L: 115

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1154"
	)
	protected static final void method4746() {
		ArchiveDiskAction.clock.mark(); // L: 468

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 469
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 470
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0; // L: 471
	} // L: 472
}
