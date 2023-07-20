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

@ObfuscatedName("jf")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("aw")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("ay")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("as")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[Ljv;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("ag")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("aq")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -238384941
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2038027861
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -460311488
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1054674880
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 362322131
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Luu;Ljava/util/HashMap;Lnd;Lnd;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false; // L: 17
		this.loadStarted = false; // L: 18
		this.scaleHandlers = new HashMap();
		this.pixelsPerTile = 0; // L: 32
		this.mapSceneSprites = var1; // L: 35
		this.fonts = var2; // L: 36
		this.geographyArchive = var3; // L: 37
		this.groundArchive = var4; // L: 38
	} // L: 39

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;ZB)V",
		garbageValue = "12"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 42
			this.loaded = false; // L: 45
			this.loadStarted = true; // L: 46
			System.nanoTime();
			int var4 = var1.getGroupId(WorldMapCacheName.field3050.name);
			int var5 = var1.getFileId(var4, var2);
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3050.name, var2));
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3046.name, var2));
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
			if (var1.isValidFileName(WorldMapCacheName.field3051.name, var2)) { // L: 97
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field3051.name, var2); // L: 98
				this.compositeTextureSprite = ClanChannelMember.method3152(var20); // L: 99
			}

			System.nanoTime(); // L: 101
			var1.clearGroups(); // L: 102
			var1.clearFiles(); // L: 103
			this.loaded = true; // L: 104
		}
	} // L: 43 105

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2088787807"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 108
	} // L: 109

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1684662753"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 112
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 113
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 114
		float[] var12 = Rasterizer2D.field5139; // L: 115
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

		Rasterizer3D.method4416(var9, var10, var11, var12); // L: 134
		Rasterizer2D.Rasterizer2D_setClipArray(var13); // L: 135
		var19 = (int)(var15 * 64.0F); // L: 136
		var20 = this.tileX * 4096 + var1; // L: 137
		int var21 = this.tileY * 4096 + var2; // L: 138

		for (int var22 = var14.x; var22 < var14.width + var14.x; ++var22) { // L: 139
			for (int var23 = var14.y; var23 < var14.y + var14.height; ++var23) { // L: 140
				this.regions[var22][var23].method5214(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19); // L: 141
			}
		}

	} // L: 144

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1431299494"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 147
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 148
		int var16 = (int)(var15 * 64.0F); // L: 149
		int var17 = this.tileX * 4096 + var1; // L: 150
		int var18 = this.tileY * 4096 + var2; // L: 151

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 152
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 153
				if (var13) { // L: 154
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 155
				}

				this.regions[var19][var20].method5224(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9); // L: 157
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;IIB)V",
		garbageValue = "0"
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
						int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 64); // L: 190
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 64); // L: 191
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 192
					}
				}
			}
		}
	} // L: 171 175

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "-734508388"
	)
	public List method5369(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 200
		if (!this.loaded) { // L: 201
			return var11; // L: 202
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 204
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 205
			int var14 = (int)(var13 * 64.0F); // L: 206
			int var15 = this.tileX * 4096 + var1; // L: 207
			int var16 = this.tileY * 4096 + var2; // L: 208

			for (int var17 = var12.x; var17 < var12.width + var12.x; ++var17) { // L: 209
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) { // L: 210
					List var19 = this.regions[var17][var18].method5333(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10); // L: 211
					if (!var19.isEmpty()) { // L: 212
						var11.addAll(var19); // L: 213
					}
				}
			}

			return var11; // L: 217
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Lkn;",
		garbageValue = "0"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 221
		int var6 = this.tileX * 4096 + var1; // L: 222
		int var7 = this.tileY * 4096 + var2; // L: 223
		int var8 = var3 + this.tileX * 4096; // L: 224
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "151100522"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 254
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/HashMap;",
		garbageValue = "-61"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 258
		return this.icons; // L: 259
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1036972495"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) { // L: 263
			this.icons = new HashMap(); // L: 264
		}

		this.icons.clear(); // L: 266

		for (int var1 = 0; var1 < this.regions.length; ++var1) { // L: 267
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) { // L: 268
				List var3 = this.regions[var1][var2].icons(); // L: 269
				Iterator var4 = var3.iterator(); // L: 270

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 271
					if (var5.hasValidElement()) { // L: 273
						int var6 = var5.getElement(); // L: 274
						if (!this.icons.containsKey(var6)) { // L: 275
							LinkedList var7 = new LinkedList(); // L: 276
							var7.add(var5); // L: 277
							this.icons.put(var6, var7); // L: 278
						} else {
							List var8 = (List)this.icons.get(var6); // L: 281
							var8.add(var5); // L: 282
						}
					}
				}
			}
		}

	} // L: 288

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "-166820479"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 291
		if (var3 > 8.0F) { // L: 292
			return 8.0F;
		} else if (var3 < 1.0F) { // L: 293
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 294
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3; // L: 295 296
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	static void method5354(int var0) {
		class450.field4738 = var0; // L: 22
		class450.field4734 = new class450[var0]; // L: 23
		class344.field3852 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-1393534066"
	)
	public static final void method5356(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 47
			PcmPlayer.field314 = var0; // L: 48
			class373.PcmPlayer_stereo = var1; // L: 49
			class183.field1886 = var2; // L: 50
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 51

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmb;ZI)V",
		garbageValue = "1385320547"
	)
	public static void method5373(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1018
		var0.field3681 = new PlayerComposition(var1); // L: 1019
		if (!var2) { // L: 1020
			var0.field3681.equipment = Arrays.copyOf(var0.field3681.field3566, var0.field3681.field3566.length); // L: 1021
			var0.field3681.method6128(); // L: 1022
		}

	} // L: 1024

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Lmt;IIIB)V",
		garbageValue = "3"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class105.method2684(); // L: 12501
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12502
		if (var4 != null) { // L: 12503
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12504
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12505
				int var5 = Client.camAngleY & 2047; // L: 12506
				int var6 = class136.localPlayer.x / 32 + 48; // L: 12507
				int var7 = 464 - class136.localPlayer.y / 32; // L: 12508
				Frames.field2621.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12509

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.field620; ++var8) { // L: 12510
					var16 = Client.field760[var8] * 4 + 2 - class136.localPlayer.x / 32; // L: 12511
					var10 = Client.field576[var8] * 4 + 2 - class136.localPlayer.y / 32; // L: 12512
					GameEngine.drawSpriteOnMinimap(var1, var2, var16, var10, Client.field762[var8], var4); // L: 12513
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12515
					for (var16 = 0; var16 < 104; ++var16) { // L: 12516
						NodeDeque var14 = Client.groundItems[class36.Client_plane][var8][var16]; // L: 12517
						if (var14 != null) { // L: 12518
							var11 = var8 * 4 + 2 - class136.localPlayer.x / 32; // L: 12519
							var12 = var16 * 4 + 2 - class136.localPlayer.y / 32; // L: 12520
							GameEngine.drawSpriteOnMinimap(var1, var2, var11, var12, MusicPatchNode2.field3389[0], var4); // L: 12521
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12525
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12526
					if (var9 != null && var9.isVisible()) { // L: 12527
						NPCComposition var18 = var9.definition; // L: 12528
						if (var18 != null && var18.transforms != null) { // L: 12529
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12530
							var11 = var9.x / 32 - class136.localPlayer.x / 32; // L: 12531
							var12 = var9.y / 32 - class136.localPlayer.y / 32; // L: 12532
							GameEngine.drawSpriteOnMinimap(var1, var2, var11, var12, MusicPatchNode2.field3389[1], var4); // L: 12533
						}
					}
				}

				var8 = Players.Players_count; // L: 12537
				int[] var17 = Players.Players_indices; // L: 12538

				for (var10 = 0; var10 < var8; ++var10) { // L: 12539
					Player var15 = Client.players[var17[var10]]; // L: 12540
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class136.localPlayer) { // L: 12541
						var12 = var15.x / 32 - class136.localPlayer.x / 32; // L: 12542
						int var13 = var15.y / 32 - class136.localPlayer.y / 32; // L: 12543
						if (var15.method2319()) { // L: 12544
							GameEngine.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode2.field3389[3], var4);
						} else if (class136.localPlayer.team != 0 && var15.team != 0 && var15.team == class136.localPlayer.team) { // L: 12545
							GameEngine.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode2.field3389[4], var4);
						} else if (var15.method2330()) { // L: 12546
							GameEngine.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode2.field3389[5], var4);
						} else if (var15.isClanMember()) { // L: 12547
							GameEngine.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode2.field3389[6], var4);
						} else {
							GameEngine.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode2.field3389[2], var4); // L: 12548
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12551
					if (Client.hintArrowType == 1 && Client.field696 >= 0 && Client.field696 < Client.npcs.length) { // L: 12552
						NPC var19 = Client.npcs[Client.field696]; // L: 12553
						if (var19 != null) { // L: 12554
							var11 = var19.x / 32 - class136.localPlayer.x / 32; // L: 12555
							var12 = var19.y / 32 - class136.localPlayer.y / 32; // L: 12556
							class158.worldToMinimap(var1, var2, var11, var12, DynamicObject.field1014[1], var4); // L: 12557
						}
					}

					if (Client.hintArrowType == 2) { // L: 12560
						var10 = Client.field539 * 4 - AbstractArchive.baseX * 256 + 2 - class136.localPlayer.x / 32; // L: 12561
						var11 = Client.field607 * 4 - class148.baseY * 256 + 2 - class136.localPlayer.y / 32; // L: 12562
						class158.worldToMinimap(var1, var2, var10, var11, DynamicObject.field1014[1], var4); // L: 12563
					}

					if (Client.hintArrowType == 10 && Client.field538 >= 0 && Client.field538 < Client.players.length) { // L: 12565
						Player var20 = Client.players[Client.field538]; // L: 12566
						if (var20 != null) { // L: 12567
							var11 = var20.x / 32 - class136.localPlayer.x / 32; // L: 12568
							var12 = var20.y / 32 - class136.localPlayer.y / 32; // L: 12569
							class158.worldToMinimap(var1, var2, var11, var12, DynamicObject.field1014[1], var4); // L: 12570
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12574
					var10 = Client.destinationX * 4 + 2 - class136.localPlayer.x / 32; // L: 12575
					var11 = Client.destinationY * 4 + 2 - class136.localPlayer.y / 32; // L: 12576
					GameEngine.drawSpriteOnMinimap(var1, var2, var10, var11, DynamicObject.field1014[0], var4); // L: 12577
				}

				if (!class136.localPlayer.isHidden) { // L: 12579
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12581
			}

			Client.field735[var3] = true; // L: 12582
		}
	} // L: 12583
}
