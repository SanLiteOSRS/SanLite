import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("iw")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 626739277
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 462528053
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1808578733
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1090582517
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1337123697
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1869420189
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -547983943
	)
	int field2836;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -950632927
	)
	int field2835;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1695178763
	)
	int field2841;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1110945225
	)
	int field2842;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V",
		garbageValue = "1606915966"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2836) { // L: 22
			var1.regionLowX = this.field2836;
		}

		if (var1.regionHighX < this.field2841) {
			var1.regionHighX = this.field2841; // L: 23
		}

		if (var1.regionLowY > this.field2835) { // L: 24
			var1.regionLowY = this.field2835;
		}

		if (var1.regionHighY < this.field2842) { // L: 25
			var1.regionHighY = this.field2842;
		}

	} // L: 26

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1059252076"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
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
		return var1 >> 6 >= this.field2836 && var1 >> 6 <= this.field2841 && var2 >> 6 >= this.field2835 && var2 >> 6 <= this.field2842; // L: 38
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
			int[] var4 = new int[]{this.field2836 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2835 * 64 - this.regionStartY * 64)}; // L: 46 47 48
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
			int var3 = this.regionStartX * 64 - this.field2836 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2835 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "158933591"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2836 = var1.readUnsignedShort(); // L: 70
		this.field2835 = var1.readUnsignedShort(); // L: 71
		this.field2841 = var1.readUnsignedShort(); // L: 72
		this.field2842 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1264343644"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77
}
