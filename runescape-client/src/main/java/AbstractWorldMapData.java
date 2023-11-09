import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("t")
	public static boolean field2885;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -68579328
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 263583808
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 91255593
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1863551975
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1146340121
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -72337353
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1089891869
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1760383059
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("p")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("b")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("o")
	byte[][][] field2886;
	@ObfuscatedName("u")
	byte[][][] field2887;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[[[[Lis;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("w")
	boolean field2890;
	@ObfuscatedName("m")
	boolean field2891;

	static {
		field2885 = true; // L: 21
	}

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2890 = false; // L: 27
		this.field2891 = false; // L: 28
	} // L: 30

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1742589874"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "24597379"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2890 && this.field2891; // L: 33
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Llg;B)V",
		garbageValue = "-41"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 37
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 38
			if (var2 != null) { // L: 39
				this.readGeography(new Buffer(var2)); // L: 40
				this.field2890 = true; // L: 41
				this.field2891 = true; // L: 42
			}

		}
	} // L: 44

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 47
		this.floorOverlayIds = null; // L: 48
		this.field2886 = null; // L: 49
		this.field2887 = null; // L: 50
		this.decorations = null; // L: 51
		this.field2890 = false; // L: 52
		this.field2891 = false; // L: 53
	} // L: 54

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILqr;I)V",
		garbageValue = "-1353996451"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 57
		if (var4 != 0) { // L: 58
			if ((var4 & 1) != 0) { // L: 61
				this.method5118(var1, var2, var3, var4); // L: 62
			} else {
				this.method5119(var1, var2, var3, var4);
			}

		}
	} // L: 59

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IILqr;II)V",
		garbageValue = "-1671335311"
	)
	void method5118(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 70
		if (var5) { // L: 71
			this.floorOverlayIds[0][var1][var2] = field2885 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 72
		}

		this.floorUnderlayIds[0][var1][var2] = field2885 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 74
	} // L: 75

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILqr;IB)V",
		garbageValue = "120"
	)
	void method5119(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 78
		boolean var6 = (var4 & 2) != 0; // L: 79
		boolean var7 = (var4 & 4) != 0; // L: 80
		this.floorUnderlayIds[0][var1][var2] = field2885 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 81
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 82
			var8 = var3.readUnsignedByte(); // L: 83

			for (var9 = 0; var9 < var8; ++var9) { // L: 84
				int var14 = field2885 ? var3.readUnsignedShort() : var3.readUnsignedByte(); // L: 85
				if (var14 != 0) { // L: 86
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 87
					var11 = var3.readUnsignedByte(); // L: 88
					this.field2886[var9][var1][var2] = (byte)(var11 >> 2); // L: 89
					this.field2887[var9][var1][var2] = (byte)(var11 & 3); // L: 90
				}
			}
		}

		if (var7) { // L: 94
			for (var8 = 0; var8 < var5; ++var8) { // L: 95
				var9 = var3.readUnsignedByte(); // L: 96
				if (var9 != 0) { // L: 97
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 100

					for (var11 = 0; var11 < var9; ++var11) { // L: 101
						int var12 = var3.method8422(); // L: 102
						int var13 = var3.readUnsignedByte(); // L: 103
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 104
					}
				}
			}
		}

	} // L: 108

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "333998070"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 113
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 117
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1797386560"
	)
	public static int method5137(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2081964554"
	)
	public static boolean method5144(int var0) {
		return var0 >= WorldMapDecorationType.field3685.id && var0 <= WorldMapDecorationType.field3688.id || var0 == WorldMapDecorationType.field3676.id; // L: 43
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2145282762"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69
}
