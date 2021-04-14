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

@ObfuscatedName("mr")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("c")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("r")
	@Export("details")
	HashMap details;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Leq;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Leq;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Leq;"
	)
	WorldMapArea field4007;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lez;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1751776365
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1683320435
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -751777809
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -336489583
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("y")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ac")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1643261397
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1632358729
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1337127919
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1148708503
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1727442279
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1918242041
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("aw")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ap")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -77181029
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2142589891
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1086120873
	)
	int field4026;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 641837143
	)
	int field4012;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1952031231
	)
	int field4028;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1367433461
	)
	int field4029;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 5480394132200405517L
	)
	long field4030;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1651460063
	)
	int field4031;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1141378953
	)
	int field4032;
	@ObfuscatedName("ab")
	boolean field4033;
	@ObfuscatedName("ar")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ak")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("an")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ah")
	HashSet field4005;
	@ObfuscatedName("ae")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 736836363
	)
	int field4021;
	@ObfuscatedName("bn")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bi")
	List field4047;
	@ObfuscatedName("bb")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bk")
	HashSet field4027;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		signature = "Lhk;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ba")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		signature = "Loh;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1390297175
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 744893993
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1355273529
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1222034053
	)
	int field4039;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11;
		fontNameVerdana13 = FontName.FontName_verdana13;
		fontNameVerdana15 = FontName.FontName_verdana15;
	}

	public WorldMap() {
		this.worldMapTargetX = -1;
		this.worldMapTargetY = -1;
		this.worldMapDisplayWidth = -1;
		this.worldMapDisplayHeight = -1;
		this.worldMapDisplayX = -1;
		this.worldMapDisplayY = -1;
		this.maxFlashCount = 3;
		this.cyclesPerFlash = 50;
		this.perpetualFlash = false;
		this.flashingElements = null;
		this.flashCount = -1;
		this.flashCycle = -1;
		this.field4026 = -1;
		this.field4012 = -1;
		this.field4028 = -1;
		this.field4029 = -1;
		this.field4033 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field4005 = new HashSet();
		this.elementsDisabled = false;
		this.field4021 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field4027 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field4039 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;Lir;Lkq;Ljava/util/HashMap;[Low;I)V",
		garbageValue = "733115823"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6;
		this.WorldMap_archive = var1;
		this.WorldMap_geographyArchive = var2;
		this.WorldMap_groundArchive = var3;
		this.font = var4;
		this.fonts = new HashMap();
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
		this.cacheLoader = new WorldMapArchiveLoader(var1);
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field1768.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		this.details = new HashMap(var8.length);

		for (int var9 = 0; var9 < var8.length; ++var9) {
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9]));
			WorldMapArea var11 = new WorldMapArea();
			var11.read(var10, var8[var9]);
			this.details.put(var11.getInternalName(), var11);
			if (var11.getIsMain()) {
				this.mainMapArea = var11;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field4007 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1101698518"
	)
	public void method6148() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIZIIIII)V",
		garbageValue = "-953768475"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapManager.method2936(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class19.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field4027.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field4027.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						class19.runScriptEvent(var14);
					}
				}

				this.field4027 = var11;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIZZB)V",
		garbageValue = "-86"
	)
	public void method6197(int var1, int var2, boolean var3, boolean var4) {
		long var5 = ObjectSound.currentTimeMillis();
		this.method6080(var1, var2, var4, var5);
		if (!this.hasTarget() && (var4 || var3)) {
			if (var4) {
				this.field4028 = var1;
				this.field4029 = var2;
				this.field4026 = this.centerTileX;
				this.field4012 = this.centerTileY;
			}

			if (this.field4026 != -1) {
				int var7 = var1 - this.field4028;
				int var8 = var2 - this.field4029;
				this.setWorldMapPosition(this.field4026 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4012, false);
			}
		} else {
			this.method6179();
		}

		if (var4) {
			this.field4030 = var5;
			this.field4031 = var1;
			this.field4032 = var2;
		}

	}

	@ObfuscatedName("b")
	void method6080(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				boolean var8 = Client.staffModLevel >= 2;
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) {
					class9.method123(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var9 = true;
					if (this.field4033) {
						int var10 = var1 - this.field4031;
						int var11 = var2 - this.field4032;
						if (var4 - this.field4030 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
							var9 = false;
						}
					}

					if (var9) {
						PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher);
						var12.packetBuffer.method6625(this.mouseCoord.packed());
						Client.packetWriter.addNode(var12);
						this.field4030 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1837270270"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class105.field1331 != null) {
			this.zoom = this.zoomTarget;
		} else {
			if (this.zoom < this.zoomTarget) {
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom);
			}

			if (this.zoom > this.zoomTarget) {
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
			}

		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1435545327"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) {
			int var1 = this.worldMapTargetX - this.centerTileX;
			int var2 = this.worldMapTargetY - this.centerTileY;
			if (var1 != 0) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true);
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IIZI)V",
		garbageValue = "-1358516193"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		ObjectSound.currentTimeMillis();
		if (var3) {
			this.method6179();
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1371340744"
	)
	final void method6179() {
		this.field4029 = -1;
		this.field4028 = -1;
		this.field4012 = -1;
		this.field4026 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1558869849"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IIII)Leq;",
		garbageValue = "-2036677867"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator();

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapArea)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIZB)V",
		garbageValue = "-105"
	)
	public void method6116(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field4007 || var4) {
			this.field4007 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-278872438"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-549031120"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)Leq;",
		garbageValue = "13"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Leq;S)V",
		garbageValue = "14713"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMapManager(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Leq;B)V",
		garbageValue = "1"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Leq;Lhk;Lhk;ZI)V",
		garbageValue = "-1033794508"
	)
	public void method6264(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) {
			if (this.currentMapArea == null || var1 != this.currentMapArea) {
				this.initializeWorldMapManager(var1);
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
				this.jump(var2.plane, var2.x, var2.y);
			} else {
				this.jump(var3.plane, var3.x, var3.y);
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-445360101"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 == null) {
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
			this.zoomTarget = this.zoom;
			this.field4047 = null;
			this.iconIterator = null;
			this.worldMapManager.clearIcons();
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIIIII)V",
		garbageValue = "-546604535"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var6);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		int var7 = this.cacheLoader.getPercentLoaded();
		if (var7 < 100) {
			this.drawLoading(var1, var2, var3, var4, var7);
		} else {
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
					return;
				}
			}

			if (this.flashingElements != null) {
				++this.flashCycle;
				if (this.flashCycle % this.cyclesPerFlash == 0) {
					this.flashCycle = 0;
					++this.flashCount;
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
					this.flashingElements = null;
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom));
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			boolean var10;
			if (!this.elementsDisabled) {
				var10 = false;
				if (var5 - this.field4021 > 100) {
					this.field4021 = var5;
					var10 = true;
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4005, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
			}

			this.method6096(var1, var2, var3, var4, var8, var9);
			var10 = Client.staffModLevel >= 2;
			if (var10 && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8;
			this.worldMapDisplayHeight = var9;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var6);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIIIIII)Z",
		garbageValue = "-1240841312"
	)
	boolean method6095(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field4039 != Client.field623) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var2 + var4 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IIIIIII)V",
		garbageValue = "217911820"
	)
	void method6096(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class105.field1331 != null) {
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2);
			int var8 = var3 + 512;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)((float)var8 / var10);
			var9 = (int)((float)var9 / var10);
			int var11 = this.getDisplayX() - var5 / 2 - var7;
			int var12 = this.getDisplayY() - var6 / 2 - var7;
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			if (this.method6095(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile;
				class105.field1331.method4658(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field4039 = Client.field623;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method6991(var13, var14, 192);
			} else {
				this.sprite.method7010(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "1928614918"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
					return;
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-478155082"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IIIIIB)V",
		garbageValue = "-13"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(II)F",
		garbageValue = "1463277853"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "10"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if (1.5D == (double)this.zoomTarget) {
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) {
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75;
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "7601"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "112"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(II)Leq;",
		garbageValue = "324822975"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator();

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (WorldMapArea)var2.next();
		} while(var3.getId() != var1);

		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "21"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "585943441"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "2024921554"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "92"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-132740090"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "923209033"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(I)Lhk;",
		garbageValue = "-1553151088"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1469564176"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-2065229363"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1186313481"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1255497148"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-433512779"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1067426400"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "667819567"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-773455874"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1749900916"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < class370.WorldMapElement_count; ++var2) {
			if (ByteArrayPool.WorldMapElement_get(var2) != null && ByteArrayPool.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(ByteArrayPool.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1053661130"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "1814568635"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(IZI)V",
		garbageValue = "-1973422189"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method6128();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(IZB)V",
		garbageValue = "8"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < class370.WorldMapElement_count; ++var3) {
			if (ByteArrayPool.WorldMapElement_get(var3) != null && ByteArrayPool.WorldMapElement_get(var3).category == var1) {
				int var4 = ByteArrayPool.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method6128();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "565606727"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1222988471"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "15510212"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2070055474"
	)
	void method6128() {
		this.field4005.clear();
		this.field4005.addAll(this.enabledElements);
		this.field4005.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "(IIIIIII)V",
		garbageValue = "551646228"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapManager.method2936(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = ByteArrayPool.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							SpriteMask.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "(ILhk;B)Lhk;",
		garbageValue = "-88"
	)
	public Coord method6130(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
			return null;
		} else {
			HashMap var3 = this.worldMapManager.buildIcons();
			List var4 = (List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				AbstractWorldMapIcon var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2;
						}

						var8 = (AbstractWorldMapIcon)var7.next();
						int var9 = var8.coord2.x - var2.x;
						int var10 = var8.coord2.y - var2.y;
						var11 = var9 * var9 + var10 * var10;
						if (var11 == 0) {
							return var8.coord2;
						}
					} while(var11 >= var6 && var5 != null);

					var5 = var8;
					var6 = var11;
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "(IILhk;Lhk;I)V",
		garbageValue = "765993102"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent();
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
		var5.setArgs(new Object[]{var6});
		switch(var1) {
		case 1008:
			var5.setType(10);
			break;
		case 1009:
			var5.setType(11);
			break;
		case 1010:
			var5.setType(12);
			break;
		case 1011:
			var5.setType(13);
			break;
		case 1012:
			var5.setType(14);
		}

		class19.runScriptEvent(var5);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "(I)Lfg;",
		garbageValue = "1625574905"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapManager.buildIcons();
			this.field4047 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field4047.addAll(var3);
			}

			this.iconIterator = this.field4047.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		signature = "(B)Lfg;",
		garbageValue = "23"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) {
			return null;
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) {
					return null;
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next();
			} while(var1.getElement() == -1);

			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1611977737"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
