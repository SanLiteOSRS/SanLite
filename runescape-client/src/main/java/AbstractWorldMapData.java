import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "[Lsn;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1292384960
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -446943232
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 722457029
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 816121643
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2111148991
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 783728307
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 913213903
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1984668763
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("as")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ay")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("am")
	byte[][][] field2949;
	@ObfuscatedName("az")
	byte[][][] field2952;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[[[Lji;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("au")
	boolean field2946;
	@ObfuscatedName("ag")
	boolean field2953;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2946 = false; // L: 26
		this.field2953 = false; // L: 27
	} // L: 29

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-724858915"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "61"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2946 && this.field2953; // L: 32
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "1818291623"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2946 = true; // L: 40
				this.field2953 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2949 = null; // L: 48
		this.field2952 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2946 = false; // L: 51
		this.field2953 = false; // L: 52
	} // L: 53

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IILsy;I)V",
		garbageValue = "418636304"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5197(var1, var2, var3, var4); // L: 61
			} else {
				this.method5202(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IILsy;II)V",
		garbageValue = "1058114421"
	)
	void method5197(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IILsy;II)V",
		garbageValue = "-1054740043"
	)
	void method5202(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedShort(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2949[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2952[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method8638();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-662100601"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1971165411"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "32"
	)
	public static long method5218(int var0) {
		if (var0 > 63) { // L: 101
			throw new class370("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0}); // L: 102
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L; // L: 104
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1633919038"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 10835
			class169.updateInterface(class155.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10836
		}
	} // L: 10837

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lmy;III)V",
		garbageValue = "-2047743771"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11393
			if (var0 != null) { // L: 11395
				Widget var4 = class287.method5477(var0); // L: 11398
				if (var4 == null) { // L: 11399
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 11402
					Client.clickedWidget = var0; // L: 11406
					var4 = class287.method5477(var0); // L: 11409
					if (var4 == null) { // L: 11410
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 11413
					Client.widgetClickX = var1; // L: 11414
					Client.widgetClickY = var2; // L: 11415
					class371.widgetDragDuration = 0; // L: 11416
					Client.isDraggingWidget = false; // L: 11417
					int var6 = Client.menuOptionsCount - 1; // L: 11420
					if (var6 != -1) { // L: 11423
						TaskHandler.method3457(var6);
					}

					return; // L: 11424
				}
			}

		}
	} // L: 11404
}
