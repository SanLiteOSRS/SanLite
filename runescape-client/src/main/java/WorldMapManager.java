import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
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

@ObfuscatedName("ff")
@Implements("WorldMapManager")
public final class WorldMapManager {
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("v")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("n")
	@Export("loadStarted")
	boolean loadStarted;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("p")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[[Lfq;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("r")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("u")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 758122357
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 197299753
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 274838579
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1210430205
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -978895597
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lop;Ljava/util/HashMap;Ljv;Ljv;)V"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljava/lang/String;ZB)V",
		garbageValue = "-19"
	)
	@Export("load")
	public void load(AbstractArchive var1, String var2, boolean var3) {
		if (!this.loadStarted) {
			this.loaded = false;
			this.loadStarted = true;
			System.nanoTime();
			int var4 = var1.getGroupId(WorldMapCacheName.field2137.name);
			int var5 = var1.getFileId(var4, var2);
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2137.name, var2));
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2132.name, var2));
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
			this.tileX = this.mapAreaData.getRegionLowX() * 64;
			this.tileY = this.mapAreaData.getRegionLowY() * 64;
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64;
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64;
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
			if (var1.isValidFileName(WorldMapCacheName.field2134.name, var2)) {
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2134.name, var2);
				this.compositeTextureSprite = ParamComposition.convertJpgToSprite(var20);
			}

			System.nanoTime();
			var1.clearGroups();
			var1.clearFiles();
			this.loaded = true;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "768"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "181464110"
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

		int var23 = var13.width + var13.x - 1;
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
		var19 = this.tileX * 4096 + var1;
		int var20 = this.tileY * 4096 + var2;

		for (int var21 = var13.x; var21 < var13.width + var13.x; ++var21) {
			for (int var22 = var13.y; var22 < var13.height + var13.y; ++var22) {
				this.regions[var21][var22].method3328(var5 + var18 * (this.regions[var21][var22].regionX * 64 - var19) / 64, var8 - var18 * (this.regions[var21][var22].regionY * 64 - var20 + 64) / 64, var18);
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1554077956"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var16 = (int)(var15 * 64.0F);
		int var17 = this.tileX * 4096 + var1;
		int var18 = this.tileY * 4096 + var2;

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) {
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
				if (var13) {
					this.regions[var19][var20].initWorldMapIcon1s();
				}

				this.regions[var19][var20].method3353(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
					this.regions[var19][var20].flashElements(var10, var11, var12);
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "-397966592"
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
						int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 4096);
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 4096);
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "533098241"
	)
	public List method3465(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList();
		if (!this.loaded) {
			return var11;
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
			float var13 = this.getPixelsPerTile(var7, var3 - var1);
			int var14 = (int)(var13 * 64.0F);
			int var15 = this.tileX * 4096 + var1;
			int var16 = this.tileY * 4096 + var2;

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) {
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) {
					List var19 = this.regions[var17][var18].method3359(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
					if (!var19.isEmpty()) {
						var11.addAll(var19);
					}
				}
			}

			return var11;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Lfu;",
		garbageValue = "-6"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this);
		int var6 = this.tileX * 4096 + var1;
		int var7 = this.tileY * 4096 + var2;
		int var8 = var3 + this.tileX * 4096;
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "831698872"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "1724645516"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0();
		return this.icons;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "582634997"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "20"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Laf;B)V",
		garbageValue = "-51"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		if (Login.worldSelectOpen) {
			class20.method230(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				ObjectComposition.clientPreferences.titleMusicDisabled = !ObjectComposition.clientPreferences.titleMusicDisabled;
				TileItem.savePreferences();
				if (!ObjectComposition.clientPreferences.titleMusicDisabled) {
					Archive var1 = UrlRequest.archive6;
					int var2 = var1.getGroupId("scape main");
					int var3 = var1.getFileId(var2, "");
					LoginScreenAnimation.method2219(var1, var2, var3, 255, false);
				} else {
					class124.midiPcmStream.clear();
					class232.musicPlayerStatus = 1;
					ModelData0.musicTrackArchive = null;
				}
			}

			if (Client.gameState != 5) {
				if (Login.field1050 == -1L) {
					Login.field1050 = ObjectComposition.currentTimeMillis() + 1000L;
				}

				long var21 = ObjectComposition.currentTimeMillis();
				boolean var31;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var31 = true;
							break;
						}

						ArchiveLoader var4 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var4.isLoaded()) {
							var31 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var31 = true;
				}

				if (var31 && -1L == Login.field1022) {
					Login.field1022 = var21;
					if (Login.field1022 > Login.field1050) {
						Login.field1050 = Login.field1022;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var23;
					if (Language.Language_EN == class378.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var23 = Login.xPadding + 5;
							short var5 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var23 && MouseHandler.MouseHandler_lastPressedX <= var23 + var6 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var5 + var7) {
								VarbitComposition.method2859();
								return;
							}
						}

						if (MilliClock.World_request != null) {
							VarbitComposition.method2859();
						}
					}

					var23 = MouseHandler.MouseHandler_lastButton;
					int var32 = MouseHandler.MouseHandler_lastPressedX;
					int var33 = MouseHandler.MouseHandler_lastPressedY;
					if (var23 == 0) {
						var32 = MouseHandler.MouseHandler_x;
						var33 = MouseHandler.MouseHandler_y;
					}

					if (!Client.mouseCam && var23 == 4) {
						var23 = 1;
					}

					short var36;
					int var37;
					if (Login.loginIndex == 0) {
						boolean var41 = false;

						while (class9.isKeyDown()) {
							if (ItemComposition.field1859 == 84) {
								var41 = true;
							}
						}

						var37 = UserComparator4.loginBoxCenter - 80;
						var36 = 291;
						if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) {
							Players.openURL(KitDefinition.method2705("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var37 = UserComparator4.loginBoxCenter + 80;
						if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20 || var41) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 4) != 0) {
								if ((Client.worldProperties & 1024) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								class9.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var34;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!class9.isKeyDown()) {
									var34 = UserComparator4.loginBoxCenter - 80;
									var8 = 321;
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
										class9.Login_promptCredentials(false);
									}

									var34 = UserComparator4.loginBoxCenter + 80;
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (ItemComposition.field1859 == 84) {
									class9.Login_promptCredentials(false);
								} else if (ItemComposition.field1859 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							int var11;
							short var35;
							boolean var38;
							if (Login.loginIndex == 2) {
								var35 = 201;
								var34 = var35 + 52;
								if (var23 == 1 && var33 >= var34 - 12 && var33 < var34 + 2) {
									Login.currentLoginField = 0;
								}

								var34 += 15;
								if (var23 == 1 && var33 >= var34 - 12 && var33 < var34 + 2) {
									Login.currentLoginField = 1;
								}

								var34 += 15;
								var35 = 361;
								if (DynamicObject.field1107 != null) {
									var37 = DynamicObject.field1107.highX / 2;
									if (var23 == 1 && var32 >= DynamicObject.field1107.lowX - var37 && var32 <= var37 + DynamicObject.field1107.lowX && var33 >= var35 - 15 && var33 < var35) {
										switch(Login.field1039) {
										case 1:
											class260.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											Players.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var37 = UserComparator4.loginBoxCenter - 80;
								var36 = 321;
								if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class260.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class260.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class260.setLoginResponseString("", "Connecting to server...", "");
									VarbitComposition.method2849(false);
									class12.updateGameState(20);
									return;
								}

								var37 = Login.loginBoxX + 180 + 80;
								if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									class5.field53 = 0;
									Varps.otp = "";
									Login.field1043 = true;
								}

								var37 = UserComparator4.loginBoxCenter + -117;
								var36 = 277;
								Login.field1041 = var32 >= var37 && var32 < var37 + Skeleton.field2287 && var33 >= var36 && var33 < var36 + WorldMapIcon_1.field1937;
								if (var23 == 1 && Login.field1041) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && ObjectComposition.clientPreferences.rememberedUsername != null) {
										ObjectComposition.clientPreferences.rememberedUsername = null;
										TileItem.savePreferences();
									}
								}

								var37 = UserComparator4.loginBoxCenter + 24;
								var36 = 277;
								Login.field1047 = var32 >= var37 && var32 < var37 + Skeleton.field2287 && var33 >= var36 && var33 < var36 + WorldMapIcon_1.field1937;
								if (var23 == 1 && Login.field1047) {
									ObjectComposition.clientPreferences.hideUsername = !ObjectComposition.clientPreferences.hideUsername;
									if (!ObjectComposition.clientPreferences.hideUsername) {
										Login.Login_username = "";
										ObjectComposition.clientPreferences.rememberedUsername = null;
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}

									TileItem.savePreferences();
								}

								while (true) {
									int var12;
									Transferable var25;
									do {
										while (true) {
											label975:
											do {
												while (true) {
													while (class9.isKeyDown()) {
														if (ItemComposition.field1859 != 13) {
															if (Login.currentLoginField != 0) {
																continue label975;
															}

															char var39 = class249.field3116;

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var39 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) {
															}

															if (ItemComposition.field1859 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (ItemComposition.field1859 == 84 || ItemComposition.field1859 == 80) {
																Login.currentLoginField = 1;
															}

															if (DevicePcmPlayerProvider.method385(class249.field3116) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + class249.field3116;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															class5.field53 = 0;
															Varps.otp = "";
															Login.field1043 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (ItemComposition.field1859 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (ItemComposition.field1859 == 84 || ItemComposition.field1859 == 80) {
												Login.currentLoginField = 0;
												if (ItemComposition.field1859 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class260.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class260.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class260.setLoginResponseString("", "Connecting to server...", "");
													VarbitComposition.method2849(false);
													class12.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && ItemComposition.field1859 == 67) {
												Clipboard var24 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var25 = var24.getContents(class23.client);
												var12 = 20 - Login.Login_password.length();
												break;
											}

											char var40 = class249.field3116;
											if ((var40 < ' ' || var40 >= 127) && (var40 <= 127 || var40 >= 160) && (var40 <= 160 || var40 > 255)) {
												label1187: {
													if (var40 != 0) {
														char[] var26 = class301.cp1252AsciiExtension;

														for (int var27 = 0; var27 < var26.length; ++var27) {
															char var14 = var26[var27];
															if (var40 == var14) {
																var38 = true;
																break label1187;
															}
														}
													}

													var38 = false;
												}
											} else {
												var38 = true;
											}

											if (var38 && DevicePcmPlayerProvider.method385(class249.field3116) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + class249.field3116;
											}
										}
									} while(var12 <= 0);

									try {
										String var13 = (String)var25.getTransferData(DataFlavor.stringFlavor);
										int var42 = Math.min(var12, var13.length());

										for (int var15 = 0; var15 < var42; ++var15) {
											char var17 = var13.charAt(var15);
											boolean var16;
											if ((var17 < ' ' || var17 >= 127) && (var17 <= 127 || var17 >= 160) && (var17 <= 160 || var17 > 255)) {
												label1190: {
													if (var17 != 0) {
														char[] var18 = class301.cp1252AsciiExtension;

														for (int var19 = 0; var19 < var18.length; ++var19) {
															char var20 = var18[var19];
															if (var20 == var17) {
																var16 = true;
																break label1190;
															}
														}
													}

													var16 = false;
												}
											} else {
												var16 = true;
											}

											if (!var16 || !DevicePcmPlayerProvider.method385(var13.charAt(var15))) {
												Login.loginIndex = 3;
												return;
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var42);
									} catch (UnsupportedFlavorException var29) {
									} catch (IOException var30) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var34 = Login.loginBoxX + 180;
								var8 = 276;
								if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
									class9.Login_promptCredentials(false);
								}

								var34 = Login.loginBoxX + 180;
								var8 = 326;
								if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
									class260.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var34 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
										Varps.otp.trim();
										if (Varps.otp.length() != 6) {
											class260.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										class5.field53 = Integer.parseInt(Varps.otp);
										Varps.otp = "";
										VarbitComposition.method2849(true);
										class260.setLoginResponseString("", "Connecting to server...", "");
										class12.updateGameState(20);
										return;
									}

									if (var23 == 1 && var32 >= Login.loginBoxX + 180 - 9 && var32 <= Login.loginBoxX + 180 + 130 && var33 >= 263 && var33 <= 296) {
										Login.field1043 = !Login.field1043;
									}

									if (var23 == 1 && var32 >= Login.loginBoxX + 180 - 34 && var32 <= Login.loginBoxX + 34 + 180 && var33 >= 351 && var33 <= 363) {
										Players.openURL(KitDefinition.method2705("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var34 = Login.loginBoxX + 180 + 80;
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										class5.field53 = 0;
										Varps.otp = "";
									}

									while (class9.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (class249.field3116 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (ItemComposition.field1859 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											class5.field53 = 0;
											Varps.otp = "";
										} else {
											if (ItemComposition.field1859 == 85 && Varps.otp.length() > 0) {
												Varps.otp = Varps.otp.substring(0, Varps.otp.length() - 1);
											}

											if (ItemComposition.field1859 == 84) {
												Varps.otp.trim();
												if (Varps.otp.length() != 6) {
													class260.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												class5.field53 = Integer.parseInt(Varps.otp);
												Varps.otp = "";
												VarbitComposition.method2849(true);
												class260.setLoginResponseString("", "Connecting to server...", "");
												class12.updateGameState(20);
												return;
											}

											if (var9 && Varps.otp.length() < 6) {
												Varps.otp = Varps.otp + class249.field3116;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var34 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
										FriendsChatMember.method5712();
										return;
									}

									var34 = Login.loginBoxX + 180 + 80;
									if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
										class9.Login_promptCredentials(true);
									}

									var36 = 361;
									if (GrandExchangeOfferOwnWorldComparator.field631 != null) {
										var10 = GrandExchangeOfferOwnWorldComparator.field631.highX / 2;
										if (var23 == 1 && var32 >= GrandExchangeOfferOwnWorldComparator.field631.lowX - var10 && var32 <= var10 + GrandExchangeOfferOwnWorldComparator.field631.lowX && var33 >= var36 - 15 && var33 < var36) {
											Players.openURL(KitDefinition.method2705("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (class9.isKeyDown()) {
										var38 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
											if (class249.field3116 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
												var38 = true;
												break;
											}
										}

										if (ItemComposition.field1859 == 13) {
											class9.Login_promptCredentials(true);
										} else {
											if (ItemComposition.field1859 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (ItemComposition.field1859 == 84) {
												FriendsChatMember.method5712();
												return;
											}

											if (var38 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + class249.field3116;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var34 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
											Players.openURL(KitDefinition.method2705("secure", true) + "m=dob/set_dob.ws", true, false);
											class260.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var34 = Login.loginBoxX + 180 + 80;
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
											class9.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var34 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
											Players.openURL("https://www.jagex.com/terms/privacy", true, false);
											class260.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var34 = Login.loginBoxX + 180 + 80;
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
											class9.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var28 = "";
										switch(Login.field1032) {
										case 0:
											var28 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var28 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											class9.Login_promptCredentials(false);
										}

										var37 = Login.loginBoxX + 180;
										var36 = 276;
										if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) {
											Players.openURL(var28, true, false);
											class260.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var37 = Login.loginBoxX + 180;
										var36 = 326;
										if (var23 == 1 && var32 >= var37 - 75 && var32 <= var37 + 75 && var33 >= var36 - 20 && var33 <= var36 + 20) {
											class9.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var34 = Login.loginBoxX + 180;
										var8 = 301;
										if (var23 == 1 && var32 >= var34 - 75 && var32 <= var34 + 75 && var33 >= var8 - 20 && var33 <= var8 + 20) {
											class9.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!class9.isKeyDown()) {
												var35 = 321;
												if (var23 == 1 && var33 >= var35 - 20 && var33 <= var35 + 20) {
													class9.Login_promptCredentials(true);
												}

												return;
											}
										} while(ItemComposition.field1859 != 84 && ItemComposition.field1859 != 13);

										class9.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-84"
	)
	static final void method3490(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString();
		World.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "([Lio;IIIIIIII)V",
		garbageValue = "1695957245"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class21.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (HitSplatDefinition.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != World.mousedOverWidgetIf1 && HitSplatDefinition.isComponentHidden(var9)) {
					continue;
				}

				int var10 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type == 9) {
						var16 = var10;
						var17 = var11;
						var18 = var10 + var9.width;
						int var19 = var11 + var9.height;
						if (var18 < var10) {
							var16 = var18;
							var18 = var10;
						}

						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var17 > var3 ? var17 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var10 + var9.width;
						var17 = var11 + var9.height;
						var12 = var10 > var2 ? var10 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var17 < var5 ? var17 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field822 = true;
					Client.field854 = var10;
					Client.field804 = var11;
				}

				boolean var32 = false;
				if (var9.field3032) {
					switch(Client.field803) {
					case 0:
						var32 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field805 == var9.id >>> 16) {
							var32 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field805) {
							var32 = true;
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var26;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var26.isMouseInputEvent) {
										var26.remove();
										var26.widget.containsMouse = false;
									}
								}

								if (Actor.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									NetSocket.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) {
									var26.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var33) {
							class2.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class69.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							class243.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var33) {
							if (var9.contentType == 1400) {
								class243.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								HealthBarUpdate.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var32) {
							for (int var20 = 0; var20 < var9.field3033.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field3033[var20] != null) {
									for (var23 = 0; var23 < var9.field3033[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3012 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3033[var20][var23]];
										}

										if (NPC.method2258(var9.field3033[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3012 != null && var9.field3012[var20] > Client.cycle) {
												break;
											}

											byte var31 = var9.field3034[var20][var23];
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										class376.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class5.Widget_runOnTargetLeave();
										LoginScreenAnimation.selectSpell(var9.id, var9.childIndex, AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = BoundaryObject.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class44.colorStartTag(16777215);
									}

									var23 = var9.field3035[var20];
									if (var9.field3012 == null) {
										var9.field3012 = new int[var9.field3033.length];
									}

									if (var9.field3079 == null) {
										var9.field3079 = new int[var9.field3033.length];
									}

									if (var23 != 0) {
										if (var9.field3012[var20] == 0) {
											var9.field3012[var20] = var23 + Client.cycle + var9.field3079[var20];
										} else {
											var9.field3012[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3012[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3012 != null) {
									var9.field3012[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var33 = true;
							} else {
								var33 = false;
							}

							boolean var34 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
								var34 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								VarcInt.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								class243.worldMap.method6188(var17, var18, var33 & var34, var33 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && class170.method3552(class21.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field819 = true;
								Client.field740 = var10;
								Client.field821 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || Script.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var34 = false;
									var33 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.isClicked && !var34) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field846.addFirst(var22);
									}
								}

								if (var34 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.containsMouse && var33) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.containsMouse && !var33) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field846.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field652.addFirst(var22);
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field2990) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field2990 <= 32) {
										label789:
										for (var36 = var9.field2990; var36 < Client.changedVarpCount; ++var36) {
											var23 = Client.changedVarps[var36 & 31];

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) {
												if (var23 == var9.varTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label789;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field2990 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field830 > var9.field3095) {
									if (var9.invTransmitTriggers != null && Client.field830 - var9.field3095 <= 32) {
										label765:
										for (var36 = var9.field3095; var36 < Client.field830; ++var36) {
											var23 = Client.changedItemContainers[var36 & 31];

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) {
												if (var23 == var9.invTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label765;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3095 = Client.field830;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3096) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3096 <= 32) {
										label741:
										for (var36 = var9.field3096; var36 < Client.changedSkillsCount; ++var36) {
											var23 = Client.changedSkills[var36 & 31];

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) {
												if (var23 == var9.statTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label741;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3096 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3104 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field836 > var9.field3104 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field844 > var9.field3104 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field654 > var9.field3104 && var9.field3043 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3043;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field839 > var9.field3104 && var9.field3071 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3071;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field840 > var9.field3104 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field748 > var9.field3104 && var9.field3077 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3077;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field659 > var9.field3104 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3104 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var36 = 0; var36 < Client.field806; ++var36) {
										ScriptEvent var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = Client.field868[var36];
										var30.keyPressed = Client.field867[var36];
										var30.args = var9.onKey;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Script.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									World.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									World.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								ReflectionCheck.field609 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class313.method5617(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var28 != null) {
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var29.isMouseInputEvent) {
											var29.remove();
											var29.widget.containsMouse = false;
										}
									}

									if (Actor.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										NetSocket.addCancelMenuEntry();
									}
								}

								class32.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
