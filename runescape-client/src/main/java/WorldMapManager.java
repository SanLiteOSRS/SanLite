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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ic")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("f")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("w")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("z")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[[Lid;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("i")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lrg;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("c")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -298264483
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -725819072
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -363583783
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -857120647
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -525909541
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lrg;Ljava/util/HashMap;Lln;Lln;)V"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;ZB)V",
		garbageValue = "-124"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) { // L: 41
			this.loaded = false; // L: 44
			this.loadStarted = true; // L: 45
			System.nanoTime(); // L: 46
			int var4 = var1.getGroupId(WorldMapCacheName.field3013.name); // L: 47
			int var5 = var1.getFileId(var4, var2); // L: 48
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3013.name, var2)); // L: 49
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3016.name, var2)); // L: 50
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
			this.tileY = this.mapAreaData.getRegionLowY() * 4096; // L: 64
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64; // L: 65
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64; // L: 66
			int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1; // L: 67
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1; // L: 68
			System.nanoTime(); // L: 69
			System.nanoTime(); // L: 70
			VertexNormal.method4845(); // L: 71
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
			if (var1.isValidFileName(WorldMapCacheName.field3011.name, var2)) { // L: 94
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field3011.name, var2); // L: 95
				this.compositeTextureSprite = class266.method5471(var20); // L: 96
			}

			System.nanoTime(); // L: 98
			var1.clearGroups(); // L: 99
			var1.clearFiles(); // L: 100
			this.loaded = true; // L: 101
		}
	} // L: 42 102

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1717987072"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null; // L: 105
	} // L: 106

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "818685693"
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

		int var23 = var13.width + var13.x - 1; // L: 123
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
		int var20 = this.tileY * 64 + var2; // L: 134

		for (int var21 = var13.x; var21 < var13.x + var13.width; ++var21) { // L: 135
			for (int var22 = var13.y; var22 < var13.height + var13.y; ++var22) { // L: 136
				this.regions[var21][var22].method5145(var5 + var18 * (this.regions[var21][var22].regionX * 64 - var19) / 64, var8 - var18 * (this.regions[var21][var22].regionY * 64 - var20 + 64) / 64, var18); // L: 137
			}
		}

	} // L: 140

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-462025619"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 143
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1); // L: 144
		int var16 = (int)(64.0F * var15); // L: 145
		int var17 = this.tileX * 4096 + var1; // L: 146
		int var18 = this.tileY * 64 + var2; // L: 147

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) { // L: 148
			for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 149
				if (var13) { // L: 150
					this.regions[var19][var20].initWorldMapIcon1s(); // L: 151
				}

				this.regions[var19][var20].method5026(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9); // L: 153
			}
		}

		if (var10 != null && var11 > 0) { // L: 156
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) { // L: 157
				for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) { // L: 158
					this.regions[var19][var20].flashElements(var10, var11, var12); // L: 159
				}
			}
		}

	} // L: 163

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "1104065074"
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

					Iterator var11 = var10.iterator();

					while (var11.hasNext()) { // L: 183
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next(); // L: 184
						int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 4096); // L: 186
						int var14 = var4 - var4 * (var12.coord2.y - this.tileY * 64) / (this.tileHeight * 4096); // L: 187
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256); // L: 188
					}
				}
			}
		}
	} // L: 167 171

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)Ljava/util/List;",
		garbageValue = "11"
	)
	public List method5156(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList(); // L: 196
		if (!this.loaded) { // L: 197
			return var11; // L: 198
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4); // L: 200
			float var13 = this.getPixelsPerTile(var7, var3 - var1); // L: 201
			int var14 = (int)(var13 * 64.0F); // L: 202
			int var15 = this.tileX * 4096 + var1; // L: 203
			int var16 = this.tileY * 64 + var2; // L: 204

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) { // L: 205
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) { // L: 206
					List var19 = this.regions[var17][var18].method5047(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10); // L: 207
					if (!var19.isEmpty()) { // L: 208
						var11.addAll(var19); // L: 209
					}
				}
			}

			return var11; // L: 213
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lis;",
		garbageValue = "1682215120"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this); // L: 217
		int var6 = this.tileX * 4096 + var1; // L: 218
		int var7 = this.tileY * 64 + var2; // L: 219
		int var8 = var3 + this.tileX * 4096; // L: 220
		int var9 = this.tileY * 64 + var4; // L: 221
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1385613982"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded; // L: 250
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/HashMap;",
		garbageValue = "29"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0(); // L: 254
		return this.icons; // L: 255
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "2050696348"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "44"
	)
	static int method5198(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1297
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1298
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.x; // L: 1299
			return 1; // L: 1300
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1302
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.y; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1306
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.width; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1310
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.height; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1314
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1318
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.parentId; // L: 1319
			return 1; // L: 1320
		} else {
			return 2; // L: 1322
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method5197() {
		if (Client.logoutTimer > 0) { // L: 3232
			HealthBarDefinition.logOut(); // L: 3233
		} else {
			Client.timer.method7379(); // L: 3236
			class246.method5251(40); // L: 3237
			WorldMapLabelSize.field2818 = Client.packetWriter.getSocket(); // L: 3238
			Client.packetWriter.removeSocket(); // L: 3239
		}
	} // L: 3234 3240

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIS)V",
		garbageValue = "-29750"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class290.method5598(var0, var1, var2, var3, var4, var5, -1, false); // L: 10440
	} // L: 10441
}
