import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1586966528
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -950685696
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1778940411
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1733973673
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -412057709
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1663287037
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1937460859
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -916737637
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("al")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("an")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ar")
	byte[][][] field3014;
	@ObfuscatedName("ab")
	byte[][][] field3000;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[[[Lkn;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("am")
	boolean field3012;
	@ObfuscatedName("ax")
	boolean field3013;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field3012 = false; // L: 26
		this.field3013 = false; // L: 27
	} // L: 29

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "2049371979"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2138999943"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3012 && this.field3013; // L: 32
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1524601998"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field3012 = true; // L: 40
				this.field3013 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1792319302"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field3014 = null; // L: 48
		this.field3000 = null; // L: 49
		this.decorations = null; // L: 50
		this.field3012 = false; // L: 51
		this.field3013 = false; // L: 52
	} // L: 53

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IILtm;I)V",
		garbageValue = "-938397050"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5451(var1, var2, var3, var4); // L: 61
			} else {
				this.method5475(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IILtm;IS)V",
		garbageValue = "23970"
	)
	void method5451(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IILtm;II)V",
		garbageValue = "-835370941"
	)
	void method5475(int var1, int var2, Buffer var3, int var4) {
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
					this.field3014[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field3000[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method9198(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1240357684"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "65280"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldk;",
		garbageValue = "-74962306"
	)
	static class90[] method5454() {
		return new class90[]{class90.field1118, class90.field1121, class90.field1125, class90.field1126, class90.field1119, class90.field1122}; // L: 17
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)Liz;",
		garbageValue = "100"
	)
	public static class212 method5477() {
		return Client.field674; // L: 1102
	}
}
