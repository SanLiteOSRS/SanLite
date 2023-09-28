import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class274 implements WorldMapSection {
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1587305275
	)
	static int field2991;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1690906337
	)
	int field2986;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 690668545
	)
	int field2990;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1315357301
	)
	int field2982;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 907016285
	)
	int field2983;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -685773051
	)
	int field2981;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 132662639
	)
	int field2985;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1985884463
	)
	int field2984;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -213601283
	)
	int field2980;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1874820247
	)
	int field2988;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -517067277
	)
	int field2987;

	class274() {
	} // L: 18

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "1844466074"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2981) { // L: 22
			var1.regionLowX = this.field2981;
		}

		if (var1.regionHighX < this.field2981) {
			var1.regionHighX = this.field2981; // L: 23
		}

		if (var1.regionLowY > this.field2985) { // L: 24
			var1.regionLowY = this.field2985;
		}

		if (var1.regionHighY < this.field2985) { // L: 25
			var1.regionHighY = this.field2985;
		}

	} // L: 26

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1135530948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2986 && var1 < this.field2986 + this.field2990) { // L: 30
			return var2 >= (this.field2982 << 6) + (this.field2984 << 3) && var2 <= (this.field2982 << 6) + (this.field2984 << 3) + 7 && var3 >= (this.field2983 << 6) + (this.field2980 << 3) && var3 <= (this.field2983 << 6) + (this.field2980 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1124460333"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2981 << 6) + (this.field2988 << 3) && var1 <= (this.field2981 << 6) + (this.field2988 << 3) + 7 && var2 >= (this.field2985 << 6) + (this.field2987 << 3) && var2 <= (this.field2985 << 6) + (this.field2987 << 3) + 7; // L: 38
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "557011185"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2981 * 64 - this.field2982 * 64 + var2 + (this.field2988 * 8 - this.field2984 * 8), var3 + (this.field2985 * 64 - this.field2983 * 64) + (this.field2987 * 8 - this.field2980 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lmo;",
		garbageValue = "-1670709360"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2982 * 64 - this.field2981 * 64 + (this.field2984 * 8 - this.field2988 * 8) + var1; // L: 57
			int var4 = this.field2983 * 64 - this.field2985 * 64 + var2 + (this.field2980 * 8 - this.field2987 * 8); // L: 58
			return new Coord(this.field2986, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-801073373"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2986 = var1.readUnsignedByte(); // L: 64
		this.field2990 = var1.readUnsignedByte(); // L: 65
		this.field2982 = var1.readUnsignedShort(); // L: 66
		this.field2984 = var1.readUnsignedByte(); // L: 67
		this.field2983 = var1.readUnsignedShort(); // L: 68
		this.field2980 = var1.readUnsignedByte(); // L: 69
		this.field2981 = var1.readUnsignedShort(); // L: 70
		this.field2988 = var1.readUnsignedByte(); // L: 71
		this.field2985 = var1.readUnsignedShort(); // L: 72
		this.field2987 = var1.readUnsignedByte(); // L: 73
		this.method5543(); // L: 74
	} // L: 75

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	void method5543() {
	} // L: 77

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1696512982"
	)
	static int method5561(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 4426
	}
}
