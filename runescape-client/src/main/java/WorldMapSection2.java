import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 62082665
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 71940529
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -749555179
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -174327041
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 830802143
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1479782177
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1782442891
	)
	int field2981;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -482581759
	)
	int field2987;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1187976859
	)
	int field2983;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1316215167
	)
	int field2984;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-16711936"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2981) { // L: 22
			var1.regionLowX = this.field2981;
		}

		if (var1.regionHighX < this.field2983) {
			var1.regionHighX = this.field2983; // L: 23
		}

		if (var1.regionLowY > this.field2987) { // L: 24
			var1.regionLowY = this.field2987;
		}

		if (var1.regionHighY < this.field2984) { // L: 25
			var1.regionHighY = this.field2984;
		}

	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1346270005"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "744535271"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2981 && var1 >> 6 <= this.field2983 && var2 >> 6 >= this.field2987 && var2 >> 6 <= this.field2984; // L: 38
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1550524003"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2981 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2987 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lnn;",
		garbageValue = "-67"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2981 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2987 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1013392578"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2981 = var1.readUnsignedShort(); // L: 70
		this.field2987 = var1.readUnsignedShort(); // L: 71
		this.field2983 = var1.readUnsignedShort(); // L: 72
		this.field2984 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1794297026"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2095314303"
	)
	static void method5289(int var0, int var1, int var2, int var3) {
		class321.field3492 = var0; // L: 162
		class321.field3501 = var1; // L: 163
		class321.field3502 = var2; // L: 164
		class321.field3503 = var3; // L: 165
	} // L: 166
}
