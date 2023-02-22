import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class245 implements WorldMapSection {
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1069157793
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 533476471
	)
	int field2902;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2004436675
	)
	int field2898;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 254139963
	)
	int field2906;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 11381121
	)
	int field2900;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 757742787
	)
	int field2901;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1233776579
	)
	int field2899;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1852714875
	)
	int field2897;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 7478343
	)
	int field2903;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -602771723
	)
	int field2905;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2118067071
	)
	int field2904;

	class245() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V",
		garbageValue = "1606915966"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2901) { // L: 22
			var1.regionLowX = this.field2901;
		}

		if (var1.regionHighX < this.field2901) {
			var1.regionHighX = this.field2901; // L: 23
		}

		if (var1.regionLowY > this.field2899) { // L: 24
			var1.regionLowY = this.field2899;
		}

		if (var1.regionHighY < this.field2899) { // L: 25
			var1.regionHighY = this.field2899;
		}

	} // L: 26

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1059252076"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2902 && var1 < this.field2902 + this.field2898) { // L: 30
			return var2 >= (this.field2906 << 6) + (this.field2897 << 3) && var2 <= (this.field2906 << 6) + (this.field2897 << 3) + 7 && var3 >= (this.field2900 << 6) + (this.field2903 << 3) && var3 <= (this.field2900 << 6) + (this.field2903 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1209851870"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2901 << 6) + (this.field2905 << 3) && var1 <= (this.field2901 << 6) + (this.field2905 << 3) + 7 && var2 >= (this.field2899 << 6) + (this.field2904 << 3) && var2 <= (this.field2899 << 6) + (this.field2904 << 3) + 7; // L: 38
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1188894867"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2901 * 64 - this.field2906 * 64 + var2 + (this.field2905 * 8 - this.field2897 * 8), var3 + (this.field2899 * 64 - this.field2900 * 64) + (this.field2904 * 8 - this.field2903 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)Lko;",
		garbageValue = "-1946236139"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2906 * 64 - this.field2901 * 64 + (this.field2897 * 8 - this.field2905 * 8) + var1; // L: 57
			int var4 = this.field2900 * 64 - this.field2899 * 64 + var2 + (this.field2903 * 8 - this.field2904 * 8); // L: 58
			return new Coord(this.field2902, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "158933591"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2902 = var1.readUnsignedByte(); // L: 64
		this.field2898 = var1.readUnsignedByte(); // L: 65
		this.field2906 = var1.readUnsignedShort(); // L: 66
		this.field2897 = var1.readUnsignedByte(); // L: 67
		this.field2900 = var1.readUnsignedShort(); // L: 68
		this.field2903 = var1.readUnsignedByte(); // L: 69
		this.field2901 = var1.readUnsignedShort(); // L: 70
		this.field2905 = var1.readUnsignedByte(); // L: 71
		this.field2899 = var1.readUnsignedShort(); // L: 72
		this.field2904 = var1.readUnsignedByte(); // L: 73
		this.method5231(); // L: 74
	} // L: 75

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "432580282"
	)
	void method5231() {
	} // L: 77
}
