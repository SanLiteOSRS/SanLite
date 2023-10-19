import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
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

@ObfuscatedName("kk")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("ac")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("al")
	boolean field2970;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("ao")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lke;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("ar")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("ag")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1606493505
	)
	int field2973;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1924593729
	)
	int field2959;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1889792389
	)
	int field2957;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1331006784
	)
	int field2971;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 200238777
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lun;Ljava/util/HashMap;Lom;Lom;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false; // L: 17
		this.field2970 = false; // L: 18
		this.scaleHandlers = new HashMap(); // L: 23
		this.pixelsPerTile = 0; // L: 32
		this.mapSceneSprites = var1; // L: 35
		this.fonts = var2; // L: 36
		this.geographyArchive = var3; // L: 37
		this.groundArchive = var4; // L: 38
	} // L: 39

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;ZZB)V",
		garbageValue = "121"
	)
	public void method5468(AbstractArchive var1, String var2, boolean var3, boolean var4) {
		if (!this.field2970) { // L: 42
			this.loaded = false; // L: 45
			this.field2970 = true; // L: 46
			System.nanoTime(); // L: 47
			int var5 = var1.getGroupId(WorldMapCacheName.field3095.name); // L: 48
			int var6 = var1.getFileId(var5, var2); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3095.name, var2)); // L: 50
			Buffer var8 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3091.name, var2)); // L: 51
			System.nanoTime(); // L: 52
			System.nanoTime(); // L: 53
			this.mapAreaData = new WorldMapAreaData(); // L: 54

			try {
				this.mapAreaData.method5746(var7, var8, var6, var3, var4); // L: 56
			} catch (IllegalStateException var20) { // L: 58
				return; // L: 59
			}

			this.mapAreaData.getOriginX(); // L: 61
			this.mapAreaData.getOriginPlane(); // L: 62
			this.mapAreaData.getOriginY(); // L: 63
			this.field2973 = this.mapAreaData.getRegionLowX() * 64; // L: 64
			this.field2959 = this.mapAreaData.getRegionLowY() * 64; // L: 65
			this.field2957 = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64; // L: 66
			this.field2971 = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 4096; // L: 67
			int var17 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 68
			int var10 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 69
			System.nanoTime(); // L: 70
			System.nanoTime(); // L: 71
			class139.method3111(); // L: 72
			this.regions = new WorldMapRegion[var17][var10]; // L: 73
			Iterator var11 = this.mapAreaData.field3100.iterator(); // L: 74

			while (var11.hasNext()) {
				WorldMapData_0 var12 = (WorldMapData_0)var11.next(); // L: 75
				int var13 = var12.regionX; // L: 77
				int var14 = var12.regionY; // L: 78
				int var15 = var13 - this.mapAreaData.getRegionLowX(); // L: 79
				int var16 = var14 - this.mapAreaData.getRegionLowY(); // L: 80
				this.regions[var15][var16] = new WorldMapRegion(var13, var14, this.mapAreaData.method5317(), this.fonts); // L: 81
				this.regions[var15][var16].initWorldMapData0(var12, this.mapAreaData.iconList); // L: 82
			}

			for (int var18 = 0; var18 < var17; ++var18) { // L: 85
				for (int var19 = 0; var19 < var10; ++var19) { // L: 86
					if (this.regions[var18][var19] == null) { // L: 87
						this.regions[var18][var19] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var18, this.mapAreaData.getRegionLowY() + var19, this.mapAreaData.method5317(), this.fonts); // L: 88
						this.regions[var18][var19].initWorldMapData1(this.mapAreaData.field3098, this.mapAreaData.iconList); // L: 89
					}
				}
			}

			System.nanoTime(); // L: 93
			System.nanoTime(); // L: 94
			if (var1.isValidFileName(WorldMapCacheName.field3090.name, var2)) { // L: 95
				byte[] var21 = var1.takeFileByNames(WorldMapCacheName.field3090.name, var2); // L: 96
				this.compositeTextureSprite = Frames.method4854(var21); // L: 97
			}

			System.nanoTime(); // L: 99
			var1.clearGroups(); // L: 100
			var1.method6919(); // L: 101
			this.loaded = true; // L: 102
		}
	} // L: 43 103

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-236187865"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 106
	} // L: 107

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "909385403"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels; // L: 110
		int var10 = Rasterizer2D.Rasterizer2D_width; // L: 111
		int var11 = Rasterizer2D.Rasterizer2D_height; // L: 112
		float[] var12 = Rasterizer2D.field5209; // L: 113
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
		int var18 = var14.y + var14.height - 1; // L: 126

		int var19;
		int var20;
		for (var19 = var14.x; var19 <= var24; ++var19) { // L: 127
			for (var20 = var14.y; var20 <= var18; ++var20) { // L: 128
				this.regions[var19][var20].drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive); // L: 129
			}
		}

		Rasterizer3D.method4530(var9, var10, var11, var12); // L: 132
		Rasterizer2D.Rasterizer2D_setClipArray(var13); // L: 133
		var19 = (int)(var15 * 64.0F); // L: 134
		var20 = this.field2973 * 4096 + var1; // L: 135
		int var21 = this.field2959 * 4096 + var2; // L: 136

		for (int var22 = var14.x; var22 < var14.x + var14.width; ++var22) { // L: 137
			for (int var23 = var14.y; var23 < var14.height + var14.y; ++var23) { // L: 138
				this.regions[var22][var23].method5346(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19); // L: 139
			}
		}

	} // L: 142

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1519783799"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 145
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 146
		int var16 = (int)(var15 * 64.0F); // L: 147
		int var17 = this.field2973 * 4096 + var1; // L: 148
		int var18 = this.field2959 * 4096 + var2; // L: 149

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 150
			for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 151
				if (var13) { // L: 152
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 153
				}

				this.regions[var19][var20].method5347(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9); // L: 155
			}
		}

		if (var10 != null && var11 > 0) { // L: 158
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 159
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) { // L: 160
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 161
				}
			}
		}

	} // L: 165

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;IIB)V",
		garbageValue = "65"
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
						int var13 = var3 * (var12.coord2.x - this.field2973 * 4096) / (this.field2957 * 4096); // L: 188
						int var14 = var4 - (var12.coord2.y - this.field2959 * 4096) * var4 / (this.field2971 * 64); // L: 189
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 190
					}
				}
			}
		}
	} // L: 169 173

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)Ljava/util/List;",
		garbageValue = "13"
	)
	public List method5473(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 198
		if (!this.loaded) { // L: 199
			return var11; // L: 200
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 202
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 203
			int var14 = (int)(64.0F * var13); // L: 204
			int var15 = this.field2973 * 4096 + var1; // L: 205
			int var16 = this.field2959 * 4096 + var2; // L: 206

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 207
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) { // L: 208
					List var19 = this.regions[var17][var18].method5368(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10); // L: 209
					if (!var19.isEmpty()) { // L: 210
						var11.addAll(var19); // L: 211
					}
				}
			}

			return var11; // L: 215
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lkx;",
		garbageValue = "-1144444981"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 219
		int var6 = this.field2973 * 4096 + var1; // L: 220
		int var7 = this.field2959 * 4096 + var2; // L: 221
		int var8 = var3 + this.field2973 * 4096; // L: 222
		int var9 = this.field2959 * 4096 + var4; // L: 223
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1564953955"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 252
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1360371503"
	)
	public int method5476() {
		return this.mapAreaData.method5277(); // L: 256
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-868447675"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 260
		return this.icons; // L: 261
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "-56693416"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2; // L: 293
		if (var3 > 8.0F) { // L: 294
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3); // L: 296
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbb;Lpu;Lpu;B)V",
		garbageValue = "77"
	)
	static void method5506(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var40;
		int var41;
		boolean var55;
		if (Login.worldSelectOpen) { // L: 295
			class226 var39 = class284.method5657(); // L: 297

			while (true) {
				if (!var39.method4256()) { // L: 298
					if (MouseHandler.MouseHandler_lastButton != 1 && (UserComparator8.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 319
						break;
					}

					int var4 = Login.xPadding + 280; // L: 320
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 321
						MouseHandler.changeWorldSelectSorting(0, 0); // L: 322
						break; // L: 323
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 325
						MouseHandler.changeWorldSelectSorting(0, 1); // L: 326
						break; // L: 327
					}

					var5 = Login.xPadding + 390; // L: 329
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 330
						MouseHandler.changeWorldSelectSorting(1, 0); // L: 331
						break; // L: 332
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 334
						MouseHandler.changeWorldSelectSorting(1, 1); // L: 335
						break; // L: 336
					}

					var40 = Login.xPadding + 500; // L: 338
					if (MouseHandler.MouseHandler_lastPressedX >= var40 && MouseHandler.MouseHandler_lastPressedX <= var40 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 339
						MouseHandler.changeWorldSelectSorting(2, 0); // L: 340
						break; // L: 341
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var40 + 15 && MouseHandler.MouseHandler_lastPressedX <= var40 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 343
						MouseHandler.changeWorldSelectSorting(2, 1); // L: 344
						break; // L: 345
					}

					var41 = Login.xPadding + 610; // L: 347
					if (MouseHandler.MouseHandler_lastPressedX >= var41 && MouseHandler.MouseHandler_lastPressedX <= var41 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 348
						MouseHandler.changeWorldSelectSorting(3, 0); // L: 349
						break; // L: 350
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var41 + 15 && MouseHandler.MouseHandler_lastPressedX <= var41 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 352
						MouseHandler.changeWorldSelectSorting(3, 1); // L: 353
						break; // L: 354
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 356
						Login.worldSelectOpen = false; // L: 358
						PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 359
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 360
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 361
						break; // L: 363
					}

					if (Login.hoveredWorldIndex != -1) { // L: 365
						World var42 = UserComparator3.World_worlds[Login.hoveredWorldIndex]; // L: 366
						if (var42.isDeadman()) { // L: 367
							var42.field833 = "beta"; // L: 368
						}

						var55 = false; // L: 370
						if (var42.properties != Client.worldProperties) { // L: 371
							boolean var56 = (Client.worldProperties & class525.field5112.rsOrdinal()) != 0; // L: 372
							var11 = var42.isDeadman(); // L: 373
							if (var56 && !var11 || !var56 && var11) { // L: 374
								var55 = true; // L: 375
							}
						}

						Language.changeWorld(var42); // L: 378
						Login.worldSelectOpen = false; // L: 380
						PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 381
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 382
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 383
						if (var55) { // L: 385
							class140.method3120(); // L: 386
						}
					} else {
						if (Login.worldSelectPage > 0 && class372.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class372.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class491.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class491.canvasHeight / 2 + 50) { // L: 390
							--Login.worldSelectPage; // L: 391
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class230.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class340.canvasWidth - class230.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class340.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class491.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class491.canvasHeight / 2 + 50) { // L: 393
							++Login.worldSelectPage; // L: 394
						}
					}
					break;
				}

				if (var39.field2386 == 13) { // L: 299
					Login.worldSelectOpen = false; // L: 301
					PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 302
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 303
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 304
					break; // L: 306
				}

				if (var39.field2386 == 96) { // L: 308
					if (Login.worldSelectPage > 0 && class372.worldSelectLeftSprite != null) { // L: 309
						--Login.worldSelectPage; // L: 310
					}
				} else if (var39.field2386 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class230.worldSelectRightSprite != null) { // L: 313 314
					++Login.worldSelectPage; // L: 315
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 400
				class91.clientPreferences.method2505(!class91.clientPreferences.method2503()); // L: 401
				if (!class91.clientPreferences.method2503()) { // L: 402
					ArrayList var3 = new ArrayList(); // L: 403
					var3.add(new class331(CollisionMap.field2392, "scape main", "", 255, false)); // L: 404
					class148.method3166(var3, 0, 0, 0, 100, false); // L: 405
				} else {
					ItemComposition.method4136(0, 0); // L: 407
				}

				class470.method8459(); // L: 408
			}

			if (Client.gameState != 5) { // L: 410
				if (Login.field959 == -1L) { // L: 411
					Login.field959 = GrandExchangeOfferTotalQuantityComparator.method7049() + 1000L; // L: 412
				}

				long var23 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 414
				if (ObjectSound.method1952() && Login.field955 == -1L) { // L: 415 416
					Login.field955 = var23; // L: 417
					if (Login.field955 > Login.field959) { // L: 418
						Login.field959 = Login.field955; // L: 419
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 423
					if (WorldMapLabelSize.clientLanguage == Language.Language_EN) { // L: 424
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 425
							var5 = Login.xPadding + 5; // L: 426
							short var6 = 463; // L: 427
							byte var7 = 100; // L: 428
							byte var25 = 35; // L: 429
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var25) { // L: 430
								if (Canvas.loadWorlds()) { // L: 432
									Login.worldSelectOpen = true; // L: 433
									Login.worldSelectPage = 0; // L: 434
									Login.worldSelectPagesCount = 0; // L: 435
								}

								return; // L: 438
							}
						}

						if (class91.World_request != null && Canvas.loadWorlds()) { // L: 441 442
							Login.worldSelectOpen = true; // L: 443
							Login.worldSelectPage = 0; // L: 444
							Login.worldSelectPagesCount = 0; // L: 445
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 449
					var40 = MouseHandler.MouseHandler_lastPressedX; // L: 450
					var41 = MouseHandler.MouseHandler_lastPressedY; // L: 451
					if (var5 == 0) { // L: 452
						var40 = MouseHandler.MouseHandler_x; // L: 453
						var41 = MouseHandler.MouseHandler_y; // L: 454
					}

					if (!UserComparator8.mouseCam && var5 == 4) { // L: 456
						var5 = 1;
					}

					class226 var8 = class284.method5657(); // L: 457
					short var44;
					int var45;
					if (Login.loginIndex == 0) { // L: 458
						var55 = false; // L: 459

						while (var8.method4256()) { // L: 460
							if (var8.field2386 == 84) { // L: 461
								var55 = true; // L: 462
							}
						}

						var45 = class379.loginBoxCenter - 80; // L: 465
						var44 = 291; // L: 466
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 467
							VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 468
						}

						var45 = class379.loginBoxCenter + 80; // L: 470
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20 || var55) { // L: 471
							if ((Client.worldProperties & class525.field5120.rsOrdinal()) != 0) { // L: 473
								Login.Login_response0 = ""; // L: 474
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 475
								Login.Login_response2 = "Your normal account will not be affected."; // L: 476
								Login.Login_response3 = ""; // L: 477
								GameEngine.method647(1); // L: 478
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 480
									Login.currentLoginField = 1; // L: 481
								} else {
									Login.currentLoginField = 0; // L: 484
								}
							} else if ((Client.worldProperties & class525.field5096.rsOrdinal()) != 0) { // L: 488
								if ((Client.worldProperties & class525.field5105.rsOrdinal()) != 0) { // L: 489
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 490
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 491
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 492
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 495
									Login.Login_response2 = "Players can attack each other"; // L: 496
									Login.Login_response3 = "almost everywhere."; // L: 497
								}

								Login.Login_response0 = "Warning!"; // L: 499
								GameEngine.method647(1); // L: 500
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 502
									Login.currentLoginField = 1; // L: 503
								} else {
									Login.currentLoginField = 0; // L: 506
								}
							} else if ((Client.worldProperties & class525.field5105.rsOrdinal()) != 0) { // L: 510
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 511
								Login.Login_response2 = "The Protect Item prayer will"; // L: 512
								Login.Login_response3 = "not work on this world."; // L: 513
								Login.Login_response0 = "Warning!"; // L: 514
								GameEngine.method647(1); // L: 515
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 517
									Login.currentLoginField = 1; // L: 518
								} else {
									Login.currentLoginField = 0; // L: 521
								}
							} else {
								class429.Login_promptCredentials(false); // L: 526
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 531
							while (true) {
								if (!var8.method4256()) { // L: 532
									var9 = class379.loginBoxCenter - 80; // L: 540
									var10 = 321; // L: 541
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 542
										class429.Login_promptCredentials(false); // L: 543
									}

									var9 = class379.loginBoxCenter + 80; // L: 545
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 546
										GameEngine.method647(0); // L: 547
									}
									break;
								}

								if (var8.field2386 == 84) { // L: 533
									class429.Login_promptCredentials(false); // L: 534
								} else if (var8.field2386 == 13) { // L: 536
									GameEngine.method647(0); // L: 537
								}
							}
						} else {
							int var13;
							int var14;
							int var30;
							short var43;
							boolean var47;
							if (Login.loginIndex == 2) { // L: 550
								var43 = 201; // L: 551
								var9 = var43 + 52; // L: 552
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) { // L: 553
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 554
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) { // L: 555
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 556
								var43 = 361; // L: 557
								if (class481.field4845 != null) { // L: 558
									var45 = class481.field4845.highX / 2; // L: 559
									if (var5 == 1 && var40 >= class481.field4845.lowX - var45 && var40 <= var45 + class481.field4845.lowX && var41 >= var43 - 15 && var41 < var43) { // L: 560
										switch(Login.field938) { // L: 561
										case 1:
											VertexNormal.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 569
											return; // L: 570
										case 2:
											VertexNormal.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 564
										}
									}
								}

								var45 = class379.loginBoxCenter - 80; // L: 575
								var44 = 321; // L: 576
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 577
									class148.method3175(); // L: 578
									return; // L: 579
								}

								var45 = Login.loginBoxX + 180 + 80; // L: 581
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 582
									GameEngine.method647(0); // L: 583
									Login.Login_username = ""; // L: 584
									Login.Login_password = ""; // L: 585
									ClientPreferences.field1295 = 0; // L: 586
									class186.otp = ""; // L: 587
									Login.field951 = true; // L: 588
								}

								var45 = class379.loginBoxCenter + -117; // L: 590
								var44 = 277; // L: 591
								Login.field949 = var40 >= var45 && var40 < var45 + class274.field2991 && var41 >= var44 && var41 < var44 + class202.field2025; // L: 592
								if (var5 == 1 && Login.field949) { // L: 593
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 594
									if (!Client.Login_isUsernameRemembered && class91.clientPreferences.method2576() != null) { // L: 595
										class91.clientPreferences.method2520((String)null); // L: 596
									}
								}

								var45 = class379.loginBoxCenter + 24; // L: 599
								var44 = 277; // L: 600
								Login.field924 = var40 >= var45 && var40 < var45 + class274.field2991 && var41 >= var44 && var41 < var44 + class202.field2025; // L: 601
								if (var5 == 1 && Login.field924) { // L: 602
									class91.clientPreferences.method2531(!class91.clientPreferences.method2504()); // L: 603
									if (!class91.clientPreferences.method2504()) { // L: 604
										Login.Login_username = ""; // L: 605
										class91.clientPreferences.method2520((String)null); // L: 606
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 608
											Login.currentLoginField = 1; // L: 609
										} else {
											Login.currentLoginField = 0; // L: 612
										}
									}
								}

								label1697:
								while (true) {
									Transferable var59;
									do {
										while (true) {
											label1613:
											do {
												while (true) {
													while (var8.method4256()) { // L: 617
														if (var8.field2386 != 13) { // L: 618
															if (Login.currentLoginField != 0) { // L: 627
																continue label1613;
															}

															char var48 = var8.field2375; // L: 628

															for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var48 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) { // L: 630 631
															}

															if (var8.field2386 == 85 && Login.Login_username.length() > 0) { // L: 634
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2386 == 84 || var8.field2386 == 80) { // L: 635
																Login.currentLoginField = 1;
															}

															char var50 = var8.field2375; // L: 637
															boolean var53 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1; // L: 639
															if (var53 && Login.Login_username.length() < 320) { // L: 641
																Login.Login_username = Login.Login_username + var8.field2375;
															}
														} else {
															GameEngine.method647(0); // L: 619
															Login.Login_username = ""; // L: 620
															Login.Login_password = ""; // L: 621
															ClientPreferences.field1295 = 0; // L: 622
															class186.otp = ""; // L: 623
															Login.field951 = true; // L: 624
														}
													}

													return; // L: 1159
												}
											} while(Login.currentLoginField != 1); // L: 643

											if (var8.field2386 == 85 && Login.Login_password.length() > 0) { // L: 644
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 645
											} else if (var8.field2386 == 84 || var8.field2386 == 80) { // L: 647
												Login.currentLoginField = 0; // L: 648
												if (var8.field2386 == 84) { // L: 649
													Login.Login_username = Login.Login_username.trim(); // L: 650
													if (Login.Login_username.length() == 0) { // L: 651
														AbstractWorldMapIcon.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 652
														return; // L: 653
													}

													if (Login.Login_password.length() == 0) { // L: 655
														AbstractWorldMapIcon.setLoginResponseString("", "Please enter your password.", ""); // L: 656
														return; // L: 657
													}

													AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", ""); // L: 659
													UserComparator6.method2942(false); // L: 660
													DefaultsGroup.method8263(20); // L: 661
													return; // L: 662
												}
											}

											if ((var8.method4280(82) || var8.method4280(87)) && var8.field2386 == 67) { // L: 665
												Clipboard var58 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 666
												var59 = var58.getContents(class159.client); // L: 667
												var14 = 20 - Login.Login_password.length(); // L: 668
												break;
											}

											char var54 = var8.field2375; // L: 718
											if (var54 >= ' ' && var54 < 127 || var54 > 127 && var54 < 160 || var54 > 160 && var54 <= 255) { // L: 720
												var47 = true; // L: 721
											} else {
												label1869: {
													if (var54 != 0) { // L: 724
														char[] var60 = class399.cp1252AsciiExtension; // L: 726

														for (var30 = 0; var30 < var60.length; ++var30) { // L: 727
															char var16 = var60[var30]; // L: 728
															if (var16 == var54) { // L: 730
																var47 = true; // L: 731
																break label1869; // L: 732
															}
														}
													}

													var47 = false; // L: 738
												}
											}

											if (var47) { // L: 740
												char var62 = var8.field2375; // L: 742
												boolean var51 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var62) != -1; // L: 744
												if (var51 && Login.Login_password.length() < 20) { // L: 746 747
													Login.Login_password = Login.Login_password + var8.field2375; // L: 748
												}
											}
										}
									} while(var14 <= 0); // L: 669

									try {
										String var15 = (String)var59.getTransferData(DataFlavor.stringFlavor); // L: 671
										int var52 = Math.min(var14, var15.length()); // L: 672
										int var17 = 0;

										while (true) {
											if (var17 >= var52) {
												Login.Login_password = Login.Login_password + var15.substring(0, var52); // L: 710
												continue label1697;
											}

											char var19 = var15.charAt(var17); // L: 676
											boolean var18;
											if ((var19 < ' ' || var19 >= 127) && (var19 <= 127 || var19 >= 160) && (var19 <= 160 || var19 > 255)) { // L: 678
												label1853: {
													if (var19 != 0) { // L: 682
														char[] var20 = class399.cp1252AsciiExtension; // L: 684

														for (int var21 = 0; var21 < var20.length; ++var21) { // L: 685
															char var22 = var20[var21]; // L: 686
															if (var19 == var22) { // L: 688
																var18 = true; // L: 689
																break label1853; // L: 690
															}
														}
													}

													var18 = false; // L: 696
												}
											} else {
												var18 = true; // L: 679
											}

											if (!var18) { // L: 698
												break;
											}

											char var57 = var15.charAt(var17); // L: 700
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var57) != -1; // L: 702
											if (!var28) { // L: 704
												break;
											}

											++var17; // L: 673
										}

										GameEngine.method647(3); // L: 706
										return; // L: 707
									} catch (UnsupportedFlavorException var37) { // L: 712
									} catch (IOException var38) { // L: 713
									}
								}
							} else {
								Bounds var31;
								if (Login.loginIndex == 3) { // L: 757
									var9 = Login.loginBoxX + 180; // L: 758
									var10 = 241; // L: 759
									var31 = var1.method7636(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10); // L: 760
									if (var5 == 1 && var31.method8284(var40, var41)) { // L: 761
										VertexNormal.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 762
									}

									var9 = Login.loginBoxX + 180; // L: 764
									var10 = 276; // L: 765
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 766
										MusicPatchNode2.method5929(false); // L: 767
									}

									var9 = Login.loginBoxX + 180; // L: 769
									var10 = 326; // L: 770
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 771
										VertexNormal.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 772
										return; // L: 773
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) { // L: 776
										var9 = Login.loginBoxX + 180 - 80; // L: 777
										var10 = 321; // L: 778
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 779
											class186.otp.trim(); // L: 780
											if (class186.otp.length() != 6) { // L: 781
												AbstractWorldMapIcon.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 782
												return; // L: 783
											}

											ClientPreferences.field1295 = Integer.parseInt(class186.otp); // L: 785
											class186.otp = ""; // L: 786
											UserComparator6.method2942(true); // L: 787
											AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", ""); // L: 788
											DefaultsGroup.method8263(20); // L: 789
											return; // L: 790
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 9 && var40 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) { // L: 792
											Login.field951 = !Login.field951; // L: 793
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 34 && var40 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) { // L: 795
											VertexNormal.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 796
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 798
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 799
											GameEngine.method647(0); // L: 800
											Login.Login_username = ""; // L: 801
											Login.Login_password = ""; // L: 802
											ClientPreferences.field1295 = 0; // L: 803
											class186.otp = ""; // L: 804
										}

										while (var8.method4256()) { // L: 806
											var11 = false; // L: 807

											for (var12 = 0; var12 < "1234567890".length(); ++var12) { // L: 808
												if (var8.field2375 == "1234567890".charAt(var12)) { // L: 809
													var11 = true; // L: 810
													break; // L: 811
												}
											}

											if (var8.field2386 == 13) { // L: 814
												GameEngine.method647(0); // L: 815
												Login.Login_username = ""; // L: 816
												Login.Login_password = ""; // L: 817
												ClientPreferences.field1295 = 0; // L: 818
												class186.otp = ""; // L: 819
											} else {
												if (var8.field2386 == 85 && class186.otp.length() > 0) { // L: 822
													class186.otp = class186.otp.substring(0, class186.otp.length() - 1);
												}

												if (var8.field2386 == 84) { // L: 823
													class186.otp.trim(); // L: 824
													if (class186.otp.length() != 6) { // L: 825
														AbstractWorldMapIcon.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 826
														return; // L: 827
													}

													ClientPreferences.field1295 = Integer.parseInt(class186.otp); // L: 829
													class186.otp = ""; // L: 830
													UserComparator6.method2942(true); // L: 831
													AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", ""); // L: 832
													DefaultsGroup.method8263(20); // L: 833
													return; // L: 834
												}

												if (var11 && class186.otp.length() < 6) { // L: 836
													class186.otp = class186.otp + var8.field2375;
												}
											}
										}
									} else if (Login.loginIndex == 5) { // L: 840
										var9 = Login.loginBoxX + 180 - 80; // L: 841
										var10 = 321; // L: 842
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 843
											Login.Login_username = Login.Login_username.trim(); // L: 845
											if (Login.Login_username.length() == 0) { // L: 846
												AbstractWorldMapIcon.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 847
											} else {
												long var32 = class7.method43(); // L: 851
												int var46;
												if (0L == var32) { // L: 852
													var46 = 5;
												} else {
													var46 = class178.method3551(var32, Login.Login_username); // L: 853
												}

												switch(var46) { // L: 854
												case 2:
													AbstractWorldMapIcon.setLoginResponseString(class366.field4188, class366.field4024, class366.field4213); // L: 862
													GameEngine.method647(6); // L: 863
													break; // L: 864
												case 3:
													AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", ""); // L: 869
													break; // L: 870
												case 4:
													AbstractWorldMapIcon.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 872
													break;
												case 5:
													AbstractWorldMapIcon.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 859
													break; // L: 860
												case 6:
													AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", ""); // L: 866
													break; // L: 867
												case 7:
													AbstractWorldMapIcon.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 856
												}
											}

											return; // L: 876
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 878
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 879
											class429.Login_promptCredentials(true); // L: 880
										}

										var44 = 361; // L: 882
										if (Message.field504 != null) { // L: 883
											var12 = Message.field504.highX / 2; // L: 884
											if (var5 == 1 && var40 >= Message.field504.lowX - var12 && var40 <= var12 + Message.field504.lowX && var41 >= var44 - 15 && var41 < var44) { // L: 885
												VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 886
											}
										}

										while (var8.method4256()) { // L: 889
											var47 = false; // L: 890

											for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) { // L: 891
												if (var8.field2375 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) { // L: 892
													var47 = true; // L: 893
													break; // L: 894
												}
											}

											if (var8.field2386 == 13) { // L: 897
												class429.Login_promptCredentials(true); // L: 898
											} else {
												if (var8.field2386 == 85 && Login.Login_username.length() > 0) { // L: 901
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var8.field2386 == 84) { // L: 902
													Login.Login_username = Login.Login_username.trim(); // L: 904
													if (Login.Login_username.length() == 0) { // L: 905
														AbstractWorldMapIcon.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 906
													} else {
														long var34 = class7.method43(); // L: 910
														if (0L == var34) { // L: 911
															var13 = 5;
														} else {
															var13 = class178.method3551(var34, Login.Login_username); // L: 912
														}

														switch(var13) { // L: 913
														case 2:
															AbstractWorldMapIcon.setLoginResponseString(class366.field4188, class366.field4024, class366.field4213); // L: 930
															GameEngine.method647(6); // L: 931
															break;
														case 3:
															AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", ""); // L: 927
															break; // L: 928
														case 4:
															AbstractWorldMapIcon.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 924
															break; // L: 925
														case 5:
															AbstractWorldMapIcon.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 915
															break; // L: 916
														case 6:
															AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", ""); // L: 921
															break; // L: 922
														case 7:
															AbstractWorldMapIcon.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 918
														}
													}

													return; // L: 935
												}

												if (var47 && Login.Login_username.length() < 320) { // L: 937
													Login.Login_username = Login.Login_username + var8.field2375;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 941
										if (Login.loginIndex == 7) { // L: 952
											if (MusicPatchNode2.field3427 && !Client.onMobile) { // L: 953
												var9 = class379.loginBoxCenter - 150; // L: 954
												var45 = var9 + 40 + 240 + 25; // L: 955
												var44 = 231; // L: 956
												var12 = var44 + 40; // L: 957
												if (var5 == 1 && var40 >= var9 && var40 <= var45 && var41 >= var44 && var41 <= var12) { // L: 958
													var14 = var9; // L: 960
													var30 = 0;

													while (true) {
														if (var30 >= 8) {
															var13 = 0; // L: 970
															break;
														}

														if (var40 <= var14 + 30) { // L: 963
															var13 = var30; // L: 964
															break; // L: 965
														}

														var14 += 30; // L: 967
														var14 += var30 != 1 && var30 != 3 ? 5 : 20; // L: 968
														++var30; // L: 962
													}

													Login.field946 = var13; // L: 972
												}

												var13 = Login.loginBoxX + 180 - 80; // L: 974
												short var49 = 321; // L: 975
												boolean var61;
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var49 - 20 && var41 <= var49 + 20) { // L: 976
													var61 = class159.method3332(); // L: 977
													if (var61) { // L: 978
														DefaultsGroup.method8263(50); // L: 979
														return; // L: 980
													}
												}

												var13 = Login.loginBoxX + 180 + 80; // L: 983
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var49 - 20 && var41 <= var49 + 20) { // L: 984
													Login.field947 = new String[8]; // L: 985
													class429.Login_promptCredentials(true); // L: 986
												}

												while (var8.method4256()) { // L: 988
													if (var8.field2386 == 101) { // L: 989
														Login.field947[Login.field946] = null; // L: 990
													}

													if (var8.field2386 == 85) { // L: 992
														if (Login.field947[Login.field946] == null && Login.field946 > 0) { // L: 993
															--Login.field946; // L: 994
														}

														Login.field947[Login.field946] = null; // L: 996
													}

													if (var8.field2375 >= '0' && var8.field2375 <= '9') { // L: 998
														Login.field947[Login.field946] = "" + var8.field2375; // L: 999
														if (Login.field946 < 7) { // L: 1000
															++Login.field946; // L: 1001
														}
													}

													if (var8.field2386 == 84) { // L: 1004
														var61 = class159.method3332(); // L: 1005
														if (var61) { // L: 1006
															DefaultsGroup.method8263(50); // L: 1007
														}

														return; // L: 1009
													}
												}
											} else {
												var9 = Login.loginBoxX + 180 - 80; // L: 1014
												var10 = 321; // L: 1015
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1016
													VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1017
													AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1018
													GameEngine.method647(6); // L: 1019
													return; // L: 1020
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 1022
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1023
													class429.Login_promptCredentials(true); // L: 1024
												}
											}
										} else if (Login.loginIndex == 8) { // L: 1028
											var9 = Login.loginBoxX + 180 - 80; // L: 1029
											var10 = 321; // L: 1030
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1031
												VertexNormal.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1032
												AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1033
												GameEngine.method647(6); // L: 1034
												return; // L: 1035
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 1037
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1038
												class429.Login_promptCredentials(true); // L: 1039
											}
										} else if (Login.loginIndex == 9) { // L: 1042
											var9 = Login.loginBoxX + 180; // L: 1043
											var10 = 311; // L: 1044
											if (var8.field2386 == 84 || var8.field2386 == 13 || var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1045
												MusicPatchNode2.method5929(false); // L: 1046
											}
										} else if (Login.loginIndex == 10) { // L: 1049
											var9 = Login.loginBoxX + 180; // L: 1050
											var10 = 209; // L: 1051
											if (var8.field2386 == 84 || var5 == 1 && var40 >= var9 - 109 && var40 <= var9 + 109 && var41 >= var10 && var41 <= var10 + 68) { // L: 1052
												AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", ""); // L: 1053
												Client.field559 = class534.field5192; // L: 1054
												UserComparator6.method2942(false); // L: 1055
												DefaultsGroup.method8263(20); // L: 1056
											}
										} else if (Login.loginIndex == 12) { // L: 1059
											var9 = class379.loginBoxCenter; // L: 1060
											var10 = 233; // L: 1061
											var31 = var2.method7636(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1062
											Bounds var26 = var2.method7636(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1063
											Bounds var27 = var2.method7636(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 1064
											var45 = var10 + 17; // L: 1065
											Bounds var29 = var2.method7636(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var45); // L: 1066
											if (var5 == 1) { // L: 1067
												if (var31.method8284(var40, var41)) { // L: 1068
													VertexNormal.openURL("https://www.jagex.com/terms", true, false); // L: 1069
												} else if (var26.method8284(var40, var41)) { // L: 1071
													VertexNormal.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1072
												} else if (var27.method8284(var40, var41) || var29.method8284(var40, var41)) { // L: 1074
													VertexNormal.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1075
												}
											}

											var9 = class379.loginBoxCenter - 80; // L: 1078
											var10 = 311; // L: 1079
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1080
												Tile.method4513(); // L: 1081
												MusicPatchNode2.method5929(true); // L: 1082
											}

											var9 = class379.loginBoxCenter + 80; // L: 1084
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1085
												Login.loginIndex = 13; // L: 1086
											}
										} else if (Login.loginIndex == 13) { // L: 1089
											var9 = class379.loginBoxCenter; // L: 1090
											var10 = 321; // L: 1091
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1092
												MusicPatchNode2.method5929(true); // L: 1093
											}
										} else if (Login.loginIndex == 14) { // L: 1096
											String var36 = ""; // L: 1097
											switch(Login.field937) { // L: 1098
											case 0:
												var36 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1106
												break; // L: 1107
											case 1:
												var36 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1109
												break;
											case 2:
												var36 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1103
												break; // L: 1104
											default:
												class429.Login_promptCredentials(false); // L: 1100
											}

											var45 = Login.loginBoxX + 180; // L: 1112
											var44 = 276; // L: 1113
											if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 1114
												VertexNormal.openURL(var36, true, false); // L: 1115
												AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1116
												GameEngine.method647(6); // L: 1117
												return; // L: 1118
											}

											var45 = Login.loginBoxX + 180; // L: 1120
											var44 = 326; // L: 1121
											if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) { // L: 1122
												class429.Login_promptCredentials(false); // L: 1123
											}
										} else if (Login.loginIndex == 24) { // L: 1126
											var9 = Login.loginBoxX + 180; // L: 1127
											var10 = 301; // L: 1128
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1129
												MusicPatchNode2.method5929(false); // L: 1130
											}
										} else if (Login.loginIndex == 32) { // L: 1133
											var9 = Login.loginBoxX + 180 - 80; // L: 1134
											var10 = 321; // L: 1135
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1136
												VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1137
												AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1138
												GameEngine.method647(6); // L: 1139
												return; // L: 1140
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 1142
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1143
												class429.Login_promptCredentials(true); // L: 1144
											}
										} else if (Login.loginIndex == 33) { // L: 1147
											var9 = Login.loginBoxX + 180; // L: 1148
											var10 = 276; // L: 1149
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1150
												VertexNormal.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1151
											}

											var9 = Login.loginBoxX + 180; // L: 1153
											var10 = 326; // L: 1154
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 1155
												class429.Login_promptCredentials(true); // L: 1156
											}
										}
									} else {
										while (true) {
											do {
												if (!var8.method4256()) { // L: 942
													var43 = 321; // L: 947
													if (var5 == 1 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 948
														class429.Login_promptCredentials(true); // L: 949
													}

													return;
												}
											} while(var8.field2386 != 84 && var8.field2386 != 13); // L: 943

											class429.Login_promptCredentials(true); // L: 944
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 398
}
