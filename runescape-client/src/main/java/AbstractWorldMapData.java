import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 517689344
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 604360128
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1008104751
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -730261
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 275453385
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1574409963
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -411464405
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1733887881
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ad")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ax")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("aw")
	byte[][][] field2615;
	@ObfuscatedName("az")
	byte[][][] field2617;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[[[Ljn;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ak")
	boolean field2618;
	@ObfuscatedName("ay")
	boolean field2606;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2618 = false; // L: 26
		this.field2606 = false; // L: 27
	} // L: 29

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "2091530539"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2618 && this.field2606; // L: 32
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "1826911435"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2618 = true; // L: 40
				this.field2606 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "65"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2615 = null; // L: 48
		this.field2617 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2618 = false; // L: 51
		this.field2606 = false; // L: 52
	} // L: 53

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILuk;I)V",
		garbageValue = "99587636"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5014(var1, var2, var3, var4); // L: 61
			} else {
				this.method4993(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILuk;II)V",
		garbageValue = "-631276930"
	)
	void method5014(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILuk;II)V",
		garbageValue = "-1094254238"
	)
	void method4993(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2615[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2617[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method9547(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2098534810"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "180"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CLol;B)C",
		garbageValue = "118"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 82
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-746832859"
	)
	static void method5016() {
		class93.clientPreferences.method2599(Client.field503); // L: 12753
	} // L: 12754

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-72484789"
	)
	static void method4988(int var0) {
		SequenceDefinition var1 = class9.SequenceDefinition_get(var0); // L: 12787
		if (var1.isCachedModelIdSet()) { // L: 12788
			if (RouteStrategy.method4508(var1.SequenceDefinition_cachedModelId) == 2) { // L: 12791
				Client.field786.add(var1.SequenceDefinition_cachedModelId); // L: 12792
			}

		}
	} // L: 12789 12794
}
