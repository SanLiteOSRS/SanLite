import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1273141056
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -130060288
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1373419273
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 812086533
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1206718537
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -674498187
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -659215
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1601592819
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ah")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ax")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("aa")
	byte[][][] field2981;
	@ObfuscatedName("au")
	byte[][][] field2992;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[[[Lkk;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ab")
	boolean field2994;
	@ObfuscatedName("ad")
	boolean field2995;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2994 = false; // L: 26
		this.field2995 = false; // L: 27
	} // L: 29

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "81"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2994 && this.field2995; // L: 32
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1020767316"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2994 = true; // L: 40
				this.field2995 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2981 = null; // L: 48
		this.field2992 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2994 = false; // L: 51
		this.field2995 = false; // L: 52
	} // L: 53

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILty;B)V",
		garbageValue = "77"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5476(var1, var2, var3, var4); // L: 61
			} else {
				this.method5477(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILty;IB)V",
		garbageValue = "12"
	)
	void method5476(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILty;IB)V",
		garbageValue = "-51"
	)
	void method5477(int var1, int var2, Buffer var3, int var4) {
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
					this.field2981[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2992[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method9152(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1822909116"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-903586613"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}
}
