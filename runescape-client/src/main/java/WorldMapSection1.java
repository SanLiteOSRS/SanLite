import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 1991455261
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -829573619
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -971196123
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1316060349
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 20920713
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1187251441
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 922994349
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lit;S)V",
		garbageValue = "2518"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "24"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1979934212"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-2141431041"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lki;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2; // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2122367720"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 60
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "568981163"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69
}
