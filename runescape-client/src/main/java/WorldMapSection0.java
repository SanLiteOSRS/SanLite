import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1755197921
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -689194049
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 59787351
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1694360689
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 246464859
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 609785649
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 181771769
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1249582361
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1005488461
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1957914017
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -132128731
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -532634241
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 898908713
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -654143135
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljw;B)V",
		garbageValue = "-27"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 27
		}

		if (var1.regionLowY > this.newY) { // L: 28
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	} // L: 30

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-779320103"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "207934155"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1684969021"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 47
			return null; // L: 48
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 50 51 52
			return var4; // L: 53
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Llt;",
		garbageValue = "2016097062"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 58
			return null; // L: 59
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 61
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 62
			return new Coord(this.oldZ, var3, var4); // L: 63
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "1437872186"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 68
		this.newZ = var1.readUnsignedByte(); // L: 69
		this.oldX = var1.readUnsignedShort(); // L: 70
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 71
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.oldY = var1.readUnsignedShort(); // L: 73
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 74
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort(); // L: 76
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort(); // L: 79
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lsx;",
		garbageValue = "813744184"
	)
	public static class470 method5184(int var0) {
		class470 var1 = (class470)class470.DBTableType_cache.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = class470.field4874.takeFile(39, var0); // L: 21
			var1 = new class470(); // L: 22
			if (var2 != null) { // L: 23
				var1.method8503(new Buffer(var2));
			}

			var1.method8505(); // L: 24
			class470.DBTableType_cache.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "1532555874"
	)
	public static byte[] method5168(CharSequence var0) {
		int var1 = var0.length(); // L: 90
		byte[] var2 = new byte[var1]; // L: 91

		for (int var3 = 0; var3 < var1; ++var3) { // L: 92
			char var4 = var0.charAt(var3); // L: 93
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 94
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 95
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 96
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 97
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 98
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 99
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 100
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 101
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 102
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 103
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118; // L: 104
			} else if (var4 == 8249) { // L: 105
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 106
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 107
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 108
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 109
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 110
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 111
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 112
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 113
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 114
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 115
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 116
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 117
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101; // L: 118
			} else if (var4 == 339) { // L: 119
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 120
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 121
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 122
			}
		}

		return var2; // L: 124
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1603468903"
	)
	static Date method5182() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1216
		var0.set(2, 0); // L: 1217
		var0.set(5, 1); // L: 1218
		var0.set(1, 1900); // L: 1219
		return var0.getTime(); // L: 1220
	}
}
