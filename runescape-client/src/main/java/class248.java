import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class248 implements WorldMapSection {
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1082162201
	)
	int field2901;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1106643003
	)
	int field2891;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1186529875
	)
	int field2892;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1669229501
	)
	int field2893;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1501768919
	)
	int field2890;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1439283569
	)
	int field2895;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1540288945
	)
	int field2896;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1529199059
	)
	int field2897;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -606398657
	)
	int field2898;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2134487287
	)
	int field2894;

	class248() {
	} // L: 18

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljw;B)V",
		garbageValue = "-27"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2890) { // L: 22
			var1.regionLowX = this.field2890;
		}

		if (var1.regionHighX < this.field2890) {
			var1.regionHighX = this.field2890; // L: 23
		}

		if (var1.regionLowY > this.field2895) { // L: 24
			var1.regionLowY = this.field2895;
		}

		if (var1.regionHighY < this.field2895) { // L: 25
			var1.regionHighY = this.field2895;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-779320103"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2901 && var1 < this.field2891 + this.field2901) { // L: 30
			return var2 >= (this.field2892 << 6) + (this.field2896 << 3) && var2 <= (this.field2892 << 6) + (this.field2896 << 3) + 7 && var3 >= (this.field2893 << 6) + (this.field2897 << 3) && var3 <= (this.field2893 << 6) + (this.field2897 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "207934155"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2890 << 6) + (this.field2898 << 3) && var1 <= (this.field2890 << 6) + (this.field2898 << 3) + 7 && var2 >= (this.field2895 << 6) + (this.field2894 << 3) && var2 <= (this.field2895 << 6) + (this.field2894 << 3) + 7; // L: 38
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1684969021"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2890 * 64 - this.field2892 * 64 + var2 + (this.field2898 * 8 - this.field2896 * 8), var3 + (this.field2895 * 64 - this.field2893 * 64) + (this.field2894 * 8 - this.field2897 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Llt;",
		garbageValue = "2016097062"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2892 * 64 - this.field2890 * 64 + (this.field2896 * 8 - this.field2898 * 8) + var1; // L: 57
			int var4 = this.field2893 * 64 - this.field2895 * 64 + var2 + (this.field2897 * 8 - this.field2894 * 8); // L: 58
			return new Coord(this.field2901, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "1437872186"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2901 = var1.readUnsignedByte(); // L: 64
		this.field2891 = var1.readUnsignedByte(); // L: 65
		this.field2892 = var1.readUnsignedShort(); // L: 66
		this.field2896 = var1.readUnsignedByte(); // L: 67
		this.field2893 = var1.readUnsignedShort(); // L: 68
		this.field2897 = var1.readUnsignedByte(); // L: 69
		this.field2890 = var1.readUnsignedShort(); // L: 70
		this.field2898 = var1.readUnsignedByte(); // L: 71
		this.field2895 = var1.readUnsignedShort(); // L: 72
		this.field2894 = var1.readUnsignedByte(); // L: 73
		this.method5118(); // L: 74
	} // L: 75

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	void method5118() {
	} // L: 77

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-827704167"
	)
	public static void method5135(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 26
	} // L: 27

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1570579154"
	)
	public static void method5126() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 321

			for (int var0 = 0; var0 < class188.idxCount; ++var0) { // L: 322
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 323
			JagexCache.JagexCache_randomDat.close(); // L: 324
		} catch (Exception var2) { // L: 326
		}

	} // L: 327
}
