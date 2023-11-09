import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 900403789
	)
	static int field2999;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1472884736
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1067175936
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2046157457
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1009050423
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1167344779
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2001192591
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1658903049
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1997942917
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ae")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ah")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ap")
	byte[][][] field2993;
	@ObfuscatedName("as")
	byte[][][] field2994;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[[[Lkl;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ao")
	boolean field2996;
	@ObfuscatedName("af")
	boolean field2997;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2996 = false; // L: 26
		this.field2997 = false; // L: 27
	} // L: 29

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "959046816"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1435332727"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2996 && this.field2997; // L: 32
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-281450764"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2996 = true; // L: 40
				this.field2997 = true; // L: 41
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1228153655"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2993 = null;
		this.field2994 = null;
		this.decorations = null;
		this.field2996 = false;
		this.field2997 = false;
	} // L: 53

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILtc;B)V",
		garbageValue = "-16"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5459(var1, var2, var3, var4); // L: 61
			} else {
				this.method5478(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILtc;IS)V",
		garbageValue = "25634"
	)
	void method5459(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILtc;II)V",
		garbageValue = "-775341480"
	)
	void method5478(int var1, int var2, Buffer var3, int var4) {
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
					this.field2993[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2994[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method9095(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1322274433"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "32768"
	)
	public static void method5470() {
		synchronized(MouseHandler.KeyHandler_instance) { // L: 43
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 44
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 45
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 46
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 47
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 48
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 49
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 51
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 52
		}
	} // L: 54
}
