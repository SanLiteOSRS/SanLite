import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class243 implements WorldMapSection {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1062487925
	)
	int field2561;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 168084701
	)
	int field2560;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2124099259
	)
	int field2566;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2043089811
	)
	int field2562;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1619542409
	)
	int field2570;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1121359759
	)
	int field2564;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -202184937
	)
	int field2565;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1933581863
	)
	int field2563;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -7445139
	)
	int field2567;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 153329805
	)
	int field2559;

	class243() {
	} // L: 18

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljr;S)V",
		garbageValue = "30931"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2570) { // L: 22
			var1.regionLowX = this.field2570;
		}

		if (var1.regionHighX < this.field2570) {
			var1.regionHighX = this.field2570; // L: 23
		}

		if (var1.regionLowY > this.field2564) { // L: 24
			var1.regionLowY = this.field2564;
		}

		if (var1.regionHighY < this.field2564) { // L: 25
			var1.regionHighY = this.field2564;
		}

	} // L: 26

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1446024671"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2561 && var1 < this.field2561 + this.field2560) { // L: 30
			return var2 >= (this.field2566 << 6) + (this.field2565 << 3) && var2 <= (this.field2566 << 6) + (this.field2565 << 3) + 7 && var3 >= (this.field2562 << 6) + (this.field2563 << 3) && var3 <= (this.field2562 << 6) + (this.field2563 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1938918886"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2570 << 6) + (this.field2567 << 3) && var1 <= (this.field2570 << 6) + (this.field2567 << 3) + 7 && var2 >= (this.field2564 << 6) + (this.field2559 << 3) && var2 <= (this.field2564 << 6) + (this.field2559 << 3) + 7; // L: 38
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2068201380"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2570 * 64 - this.field2566 * 64 + var2 + (this.field2567 * 8 - this.field2565 * 8), var3 + (this.field2564 * 64 - this.field2562 * 64) + (this.field2559 * 8 - this.field2563 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Lmu;",
		garbageValue = "1554678257"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2566 * 64 - this.field2570 * 64 + (this.field2565 * 8 - this.field2567 * 8) + var1; // L: 57
			int var4 = this.field2562 * 64 - this.field2564 * 64 + var2 + (this.field2563 * 8 - this.field2559 * 8); // L: 58
			return new Coord(this.field2561, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "16"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2561 = var1.readUnsignedByte(); // L: 64
		this.field2560 = var1.readUnsignedByte(); // L: 65
		this.field2566 = var1.readUnsignedShort(); // L: 66
		this.field2565 = var1.readUnsignedByte(); // L: 67
		this.field2562 = var1.readUnsignedShort(); // L: 68
		this.field2563 = var1.readUnsignedByte(); // L: 69
		this.field2570 = var1.readUnsignedShort(); // L: 70
		this.field2567 = var1.readUnsignedByte(); // L: 71
		this.field2564 = var1.readUnsignedShort(); // L: 72
		this.field2559 = var1.readUnsignedByte(); // L: 73
		this.method4919(); // L: 74
	} // L: 75

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2081332476"
	)
	void method4919() {
	} // L: 77

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "80"
	)
	static final boolean method4937() {
		return Client.isMenuOpen; // L: 9145
	}
}
