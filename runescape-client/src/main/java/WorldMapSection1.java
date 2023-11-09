import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1865139321
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1285683433
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -497244705
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1595558085
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1600340257
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1055540439
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhw;B)V",
		garbageValue = "11"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1974716574"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "819062651"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "24"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 43
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lkp;",
		garbageValue = "-711503187"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2; // L: 54
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "84"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1060694331"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "781568530"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
