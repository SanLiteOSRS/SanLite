import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1909255191
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -311203443
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1752254321
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -665302455
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1360390451
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2119149505
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 989493471
	)
	int field2900;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -171385949
	)
	int field2894;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1680318827
	)
	int field2901;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1601793997
	)
	int field2893;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-474032336"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2900) { // L: 22
			var1.regionLowX = this.field2900;
		}

		if (var1.regionHighX < this.field2901) {
			var1.regionHighX = this.field2901; // L: 23
		}

		if (var1.regionLowY > this.field2894) { // L: 24
			var1.regionLowY = this.field2894;
		}

		if (var1.regionHighY < this.field2893) { // L: 25
			var1.regionHighY = this.field2893;
		}

	} // L: 26

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "509257779"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-94"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2900 && var1 >> 6 <= this.field2901 && var2 >> 6 >= this.field2894 && var2 >> 6 <= this.field2893; // L: 38
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1978048199"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2900 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2894 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lmc;",
		garbageValue = "-1281040923"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2900 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2894 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "47"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2900 = var1.readUnsignedShort(); // L: 70
		this.field2894 = var1.readUnsignedShort(); // L: 71
		this.field2901 = var1.readUnsignedShort(); // L: 72
		this.field2893 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	static final void method5103() {
		Client.field734 = Client.cycleCntr; // L: 12601
		WorldMapIcon_0.field2973 = true; // L: 12602
	} // L: 12603

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2063894036"
	)
	static void method5107() {
		if (Client.oculusOrbState == 1) { // L: 12843
			Client.field627 = true; // L: 12844
		}

	} // L: 12846
}
