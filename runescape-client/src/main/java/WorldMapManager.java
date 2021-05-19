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

@ObfuscatedName("fs")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 46139673
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("h")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("c")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("l")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("t")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("i")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2142403520
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -459948677
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -893999221
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 422719936
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1081719921
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lof;Ljava/util/HashMap;Ljp;Ljp;)V"
	)
	public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false;
		this.loadStarted = false;
		this.scaleHandlers = new HashMap();
		this.pixelsPerTile = 0;
		this.mapSceneSprites = var1;
		this.fonts = var2;
		this.geographyArchive = var3;
		this.groundArchive = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;ZI)V",
		garbageValue = "1799614523"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) {
			this.loaded = false;
			this.loadStarted = true;
			System.nanoTime();
			int var4 = var1.getGroupId(WorldMapCacheName.field2128.name);
			int var5 = var1.getFileId(var4, var2);
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2128.name, var2));
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2123.name, var2));
			System.nanoTime();
			System.nanoTime();
			this.mapAreaData = new WorldMapAreaData();

			try {
				this.mapAreaData.init(var6, var7, var5, var3);
			} catch (IllegalStateException var19) {
				return;
			}

			this.mapAreaData.getOriginX();
			this.mapAreaData.getOriginPlane();
			this.mapAreaData.getOriginY();
			this.tileX = this.mapAreaData.getRegionLowX() * 4096;
			this.tileY = this.mapAreaData.getRegionLowY() * 64;
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64;
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 4096;
			int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
			System.nanoTime();
			System.nanoTime();
			WorldMapRegion.WorldMapRegion_cachedSprites.clear();
			this.regions = new WorldMapRegion[var16][var9];
			Iterator var10 = this.mapAreaData.worldMapData0Set.iterator();

			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next();
				int var12 = var11.regionX;
				int var13 = var11.regionY;
				int var14 = var12 - this.mapAreaData.getRegionLowX();
				int var15 = var13 - this.mapAreaData.getRegionLowY();
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts);
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList);
			}

			for (int var17 = 0; var17 < var16; ++var17) {
				for (int var18 = 0; var18 < var9; ++var18) {
					if (this.regions[var17][var18] == null) {
						this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts);
						this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.isValidFileName(WorldMapCacheName.field2124.name, var2)) {
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2124.name, var2);
				this.compositeTextureSprite = WorldMapAreaData.convertJpgToSprite(var20);
			}

			System.nanoTime();
			var1.clearGroups();
			var1.clearFiles();
			this.loaded = true;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-98"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
		int var10 = Rasterizer2D.Rasterizer2D_width;
		int var11 = Rasterizer2D.Rasterizer2D_height;
		int[] var12 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var12);
		WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var15 = (int)Math.ceil((double)var14);
		this.pixelsPerTile = var15;
		if (!this.scaleHandlers.containsKey(var15)) {
			WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15);
			var16.init();
			this.scaleHandlers.put(var15, var16);
		}

		int var23 = var13.x + var13.width - 1;
		int var17 = var13.height + var13.y - 1;

		int var18;
		int var19;
		for (var18 = var13.x; var18 <= var23; ++var18) {
			for (var19 = var13.y; var19 <= var17; ++var19) {
				this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
			}
		}

		Rasterizer2D.Rasterizer2D_replace(var9, var10, var11);
		Rasterizer2D.Rasterizer2D_setClipArray(var12);
		var18 = (int)(var14 * 64.0F);
		var19 = this.tileX * 64 + var1;
		int var20 = this.tileY * 4096 + var2;

		for (int var21 = var13.x; var21 < var13.x + var13.width; ++var21) {
			for (int var22 = var13.y; var22 < var13.y + var13.height; ++var22) {
				this.regions[var21][var22].method3271(var5 + var18 * (this.regions[var21][var22].regionX * 64 - var19) / 64, var8 - var18 * (this.regions[var21][var22].regionY * 64 - var20 + 64) / 64, var18);
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-2114068837"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var16 = (int)(64.0F * var15);
		int var17 = this.tileX * 64 + var1;
		int var18 = this.tileY * 4096 + var2;

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
				if (var13) {
					this.regions[var19][var20].initWorldMapIcon1s();
				}

				this.regions[var19][var20].method3282(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) {
				for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) {
					this.regions[var19][var20].flashElements(var10, var11, var12);
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "-1860707171"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) {
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.icons == null) {
					this.buildIcons0();
				}

				Iterator var8 = var5.iterator();

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return;
						}

						int var9 = (Integer)var8.next();
						var10 = (List)this.icons.get(var9);
					} while(var10 == null);

					Iterator var11 = var10.iterator();

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
						int var13 = var3 * (var12.coord2.x - this.tileX * 64) / (this.tileWidth * 4096);
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 64);
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)Ljava/util/List;",
		garbageValue = "-50"
	)
	public List method3430(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList();
		if (!this.loaded) {
			return var11;
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
			float var13 = this.getPixelsPerTile(var7, var3 - var1);
			int var14 = (int)(var13 * 64.0F);
			int var15 = this.tileX * 64 + var1;
			int var16 = this.tileY * 4096 + var2;

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) {
				for (int var18 = var12.y; var18 < var12.height + var12.y; ++var18) {
					List var19 = this.regions[var17][var18].method3303(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
					if (!var19.isEmpty()) {
						var11.addAll(var19);
					}
				}
			}

			return var11;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lfq;",
		garbageValue = "-77568480"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this);
		int var6 = this.tileX * 64 + var1;
		int var7 = this.tileY * 4096 + var2;
		int var8 = var3 + this.tileX * 64;
		int var9 = this.tileY * 4096 + var4;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.width = var12 - var10 + 1;
		var5.height = var13 - var11 + 1;
		var5.x = var10 - this.mapAreaData.getRegionLowX();
		var5.y = var11 - this.mapAreaData.getRegionLowY();
		if (var5.x < 0) {
			var5.width += var5.x;
			var5.x = 0;
		}

		if (var5.x > this.regions.length - var5.width) {
			var5.width = this.regions.length - var5.x;
		}

		if (var5.y < 0) {
			var5.height += var5.y;
			var5.y = 0;
		}

		if (var5.y > this.regions[0].length - var5.height) {
			var5.height = this.regions[0].length - var5.y;
		}

		var5.width = Math.min(var5.width, this.regions.length);
		var5.height = Math.min(var5.height, this.regions[0].length);
		return var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1468507675"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/HashMap;",
		garbageValue = "-114"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0();
		return this.icons;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1232365989"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) {
			this.icons = new HashMap();
		}

		this.icons.clear();

		for (int var1 = 0; var1 < this.regions.length; ++var1) {
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) {
				List var3 = this.regions[var1][var2].icons();
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
					if (var5.hasValidElement()) {
						int var6 = var5.getElement();
						if (!this.icons.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.icons.put(var6, var7);
						} else {
							List var8 = (List)this.icons.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "2102761874"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2;
		if (var3 > 8.0F) {
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3);
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "100"
	)
	static int method3438(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lfb;IIII)V",
		garbageValue = "-604667253"
	)
	static void method3425(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class12.clientPreferences.areaSoundEffectsVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var5 = var4 >> 8;
					int var6 = var4 >> 4 & 7;
					int var7 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var8 = (var2 - 64) / 128;
					int var9 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	static final void method3439() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = class35.localPlayer.x;
			var1 = class35.localPlayer.y;
			if (HorizontalAlignment.oculusOrbFocalPointX - var0 < -500 || HorizontalAlignment.oculusOrbFocalPointX - var0 > 500 || class280.oculusOrbFocalPointY - var1 < -500 || class280.oculusOrbFocalPointY - var1 > 500) {
				HorizontalAlignment.oculusOrbFocalPointX = var0;
				class280.oculusOrbFocalPointY = var1;
			}

			if (var0 != HorizontalAlignment.oculusOrbFocalPointX) {
				HorizontalAlignment.oculusOrbFocalPointX += (var0 - HorizontalAlignment.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class280.oculusOrbFocalPointY) {
				class280.oculusOrbFocalPointY += (var1 - class280.oculusOrbFocalPointY) / 16;
			}

			var2 = HorizontalAlignment.oculusOrbFocalPointX >> 7;
			var3 = class280.oculusOrbFocalPointY >> 7;
			var4 = SceneTilePaint.getTileHeight(HorizontalAlignment.oculusOrbFocalPointX, class280.oculusOrbFocalPointY, ParamComposition.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = ParamComposition.Client_plane;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field702) {
				Client.field702 += (var6 - Client.field702) / 24;
			} else if (var6 < Client.field702) {
				Client.field702 += (var6 - Client.field702) / 80;
			}

			Decimator.field523 = SceneTilePaint.getTileHeight(class35.localPlayer.x, class35.localPlayer.y, ParamComposition.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			if (Client.field699 && class35.localPlayer != null) {
				var0 = class35.localPlayer.pathX[0];
				var1 = class35.localPlayer.pathY[0];
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
					HorizontalAlignment.oculusOrbFocalPointX = class35.localPlayer.x;
					var2 = SceneTilePaint.getTileHeight(class35.localPlayer.x, class35.localPlayer.y, ParamComposition.Client_plane) - Client.camFollowHeight;
					if (var2 < Decimator.field523) {
						Decimator.field523 = var2;
					}

					class280.oculusOrbFocalPointY = class35.localPlayer.y;
					Client.field699 = false;
				}
			}

			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}

			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field694 = var10;
				Client.field695 = var11;
			}

			if (Client.field693 < var2) {
				Client.field693 += var2 / 8;
				if (Client.field693 > var2) {
					Client.field693 = var2;
				}
			} else if (Client.field693 > var2) {
				Client.field693 = Client.field693 * 9 / 10;
			}

			if (Client.field693 > 0) {
				var3 = Client.field693 / 16;
				if (Client.field694 >= 0) {
					var0 = Client.field694 - HealthBarDefinition.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					HorizontalAlignment.oculusOrbFocalPointX += var4 * var3 / 65536;
					class280.oculusOrbFocalPointY += var3 * var5 / 65536;
				}

				if (Client.field695 != 0) {
					Decimator.field523 += var3 * Client.field695;
					if (Decimator.field523 > 0) {
						Decimator.field523 = 0;
					}
				}
			} else {
				Client.field694 = -1;
				Client.field695 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				Client.packetWriter.addNode(HealthBarDefinition.getPacketBufferNode(ClientPacket.field2601, Client.packetWriter.isaacCipher));
				Client.oculusOrbState = 0;
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class229.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}
}
