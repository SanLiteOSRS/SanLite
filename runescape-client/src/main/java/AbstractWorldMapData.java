import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2062714688
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1676109888
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1252351847
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -106288465
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1858665959
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 881913323
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1047666627
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1870078761
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("as")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("am")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ag")
	byte[][][] field3008;
	@ObfuscatedName("aa")
	byte[][][] field2994;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[[[Lka;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ad")
	boolean field3007;
	@ObfuscatedName("at")
	boolean field2999;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field3007 = false; // L: 26
		this.field2999 = false; // L: 27
	} // L: 29

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-448699920"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-288061223"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3007 && this.field2999; // L: 32
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V",
		garbageValue = "488414989"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field3007 = true; // L: 40
				this.field2999 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146833319"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field3008 = null; // L: 48
		this.field2994 = null; // L: 49
		this.decorations = null; // L: 50
		this.field3007 = false; // L: 51
		this.field2999 = false; // L: 52
	} // L: 53

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILtl;B)V",
		garbageValue = "2"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) {
				this.method5513(var1, var2, var3, var4); // L: 61
			} else {
				this.method5517(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 66

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILtl;II)V",
		garbageValue = "762426735"
	)
	void method5513(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	} // L: 74

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IILtl;II)V",
		garbageValue = "-1401590927"
	)
	void method5517(int var1, int var2, Buffer var3, int var4) {
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
					this.field3008[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
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
						int var12 = var3.method9077(); // L: 101
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
		garbageValue = "-1876401737"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1760890975"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "363511170"
	)
	public static void method5541(String[] var0, short[] var1) {
		class456.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Luy;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 58
			var2 = (RunException)var0; // L: 59
			var2.message = var2.message + ' ' + var1; // L: 60
		} else {
			var2 = new RunException(var0, var1); // L: 62
		}

		return var2; // L: 63
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-694857827"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 70
		if (var1 == null) { // L: 71
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 72 73
		}
	}
}
