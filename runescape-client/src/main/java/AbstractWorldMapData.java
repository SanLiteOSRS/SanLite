import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 518961216
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1601630208
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1159667627
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1674687277
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1615088237
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1632558421
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1716482187
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -715724743
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ax")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ai")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ag")
	byte[][][] field2990;
	@ObfuscatedName("ah")
	byte[][][] field2996;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[[[Ljl;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ar")
	boolean field2998;
	@ObfuscatedName("am")
	boolean field2999;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2998 = false; // L: 26
		this.field2999 = false; // L: 27
	} // L: 29

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsg;S)V",
		garbageValue = "2348"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-556860665"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2998 && this.field2999; // L: 32
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "97"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2998 = true; // L: 40
				this.field2999 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "216938688"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2990 = null; // L: 48
		this.field2996 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2998 = false; // L: 51
		this.field2999 = false; // L: 52
	} // L: 53

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IILsg;I)V",
		garbageValue = "1675486274"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5434(var1, var2, var3, var4); // L: 61
			} else {
				this.method5435(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IILsg;IB)V",
		garbageValue = "-28"
	)
	void method5434(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IILsg;II)V",
		garbageValue = "675570307"
	)
	void method5435(int var1, int var2, Buffer var3, int var4) {
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
					this.field2990[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2996[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method9108(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "790722291"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2104723155"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1786635610"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 112
	}
}
