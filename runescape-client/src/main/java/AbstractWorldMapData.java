import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("s")
	public static boolean field2953;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -130581440
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2142212096
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 183398775
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -232473513
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 89984523
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2028062533
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1564355211
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -728019783
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("i")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("o")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("n")
	byte[][][] field2950;
	@ObfuscatedName("k")
	byte[][][] field2951;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[[[[Liz;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("l")
	boolean field2954;
	@ObfuscatedName("t")
	boolean field2955;

	static {
		field2953 = true; // L: 21
	}

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2954 = false;
		this.field2955 = false; // L: 28
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1703912011"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2145704000"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2954 && this.field2955;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)V",
		garbageValue = "1014997119"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 37
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 38
			if (var2 != null) { // L: 39
				this.readGeography(new Buffer(var2)); // L: 40
				this.field2954 = true; // L: 41
				this.field2955 = true; // L: 42
			}

		}
	} // L: 44

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1690828901"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 47
		this.floorOverlayIds = null; // L: 48
		this.field2950 = null; // L: 49
		this.field2951 = null; // L: 50
		this.decorations = null; // L: 51
		this.field2954 = false; // L: 52
		this.field2955 = false; // L: 53
	} // L: 54

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILqy;I)V",
		garbageValue = "-2009986284"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 57
		if (var4 != 0) { // L: 58
			if ((var4 & 1) != 0) { // L: 61
				this.method5243(var1, var2, var3, var4); // L: 62
			} else {
				this.method5244(var1, var2, var3, var4); // L: 65
			}

		}
	} // L: 59 67

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILqy;II)V",
		garbageValue = "463825576"
	)
	void method5243(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 70
		if (var5) { // L: 71
			this.floorOverlayIds[0][var1][var2] = field2953 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 72
		}

		this.floorUnderlayIds[0][var1][var2] = field2953 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 74
	} // L: 75

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILqy;IB)V",
		garbageValue = "103"
	)
	void method5244(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 78
		boolean var6 = (var4 & 2) != 0; // L: 79
		boolean var7 = (var4 & 4) != 0; // L: 80
		this.floorUnderlayIds[0][var1][var2] = field2953 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte(); // L: 81
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 82
			var8 = var3.readUnsignedByte(); // L: 83

			for (var9 = 0; var9 < var8; ++var9) { // L: 84
				int var14 = field2953 ? var3.readUnsignedShort() : var3.readUnsignedByte(); // L: 85
				if (var14 != 0) { // L: 86
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 87
					var11 = var3.readUnsignedByte(); // L: 88
					this.field2950[var9][var1][var2] = (byte)(var11 >> 2); // L: 89
					this.field2951[var9][var1][var2] = (byte)(var11 & 3); // L: 90
				}
			}
		}

		if (var7) { // L: 94
			for (var8 = 0; var8 < var5; ++var8) { // L: 95
				var9 = var3.readUnsignedByte(); // L: 96
				if (var9 != 0) { // L: 97
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 100

					for (var11 = 0; var11 < var9; ++var11) { // L: 101
						int var12 = var3.method8568(); // L: 102
						int var13 = var3.readUnsignedByte(); // L: 103
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 104
					}
				}
			}
		}

	} // L: 108

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2028878275"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 113
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-574491107"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 117
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;IIB)[Lra;",
		garbageValue = "21"
	)
	public static IndexedSprite[] method5238(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			VarpDefinition.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		return !var3 ? null : class282.method5509(); // L: 33 34
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2188"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12505

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12506
			var1.clearIsFromIgnored(); // L: 12508
		}

		if (class281.friendsChatManager != null) { // L: 12512
			class281.friendsChatManager.invalidateIgnoreds(); // L: 12513
		}

	} // L: 12515
}
