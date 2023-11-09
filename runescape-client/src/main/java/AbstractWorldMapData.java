import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1862791168
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1600832
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1615950611
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1990717501
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1885496859
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2046008565
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1313695229
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -142534315
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("aj")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ad")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ac")
	byte[][][] field2988;
	@ObfuscatedName("ag")
	byte[][][] field2985;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[[[Lkj;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ah")
	boolean field2991;
	@ObfuscatedName("az")
	boolean field2978;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2991 = false; // L: 26
		this.field2978 = false; // L: 27
	} // L: 29

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;S)V",
		garbageValue = "128"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1006034867"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2991 && this.field2978; // L: 32
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnq;S)V",
		garbageValue = "-3014"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2991 = true; // L: 40
				this.field2978 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2988 = null; // L: 48
		this.field2985 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2991 = false; // L: 51
		this.field2978 = false; // L: 52
	} // L: 53

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILtz;B)V",
		garbageValue = "76"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5429(var1, var2, var3, var4); // L: 61
			} else {
				this.method5432(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILtz;IB)V",
		garbageValue = "9"
	)
	void method5429(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IILtz;II)V",
		garbageValue = "2073018516"
	)
	void method5432(int var1, int var2, Buffer var3, int var4) {
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
					this.field2988[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2985[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method8928(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-509564494"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-698460861"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}
}
