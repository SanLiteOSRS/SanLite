import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class276 implements WorldMapSection {
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1246521045
	)
	static int field3045;
	@ObfuscatedName("fq")
	static boolean field3052;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -927224995
	)
	static int field3040;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1979069037
	)
	int field3046;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1709267967
	)
	int field3041;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 163950655
	)
	int field3042;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -370513215
	)
	int field3043;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -215438469
	)
	int field3044;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1950390725
	)
	int field3049;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1678563173
	)
	int field3050;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1233053543
	)
	int field3047;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -318619775
	)
	int field3048;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -375187871
	)
	int field3051;

	class276() {
	} // L: 18

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-16711936"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3044) { // L: 22
			var1.regionLowX = this.field3044;
		}

		if (var1.regionHighX < this.field3044) {
			var1.regionHighX = this.field3044; // L: 23
		}

		if (var1.regionLowY > this.field3049) { // L: 24
			var1.regionLowY = this.field3049;
		}

		if (var1.regionHighY < this.field3049) { // L: 25
			var1.regionHighY = this.field3049;
		}

	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1346270005"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3046 && var1 < this.field3046 + this.field3041) { // L: 30
			return var2 >= (this.field3042 << 6) + (this.field3050 << 3) && var2 <= (this.field3042 << 6) + (this.field3050 << 3) + 7 && var3 >= (this.field3043 << 6) + (this.field3047 << 3) && var3 <= (this.field3043 << 6) + (this.field3047 << 3) + 7; // L: 33
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
		return var1 >= (this.field3044 << 6) + (this.field3048 << 3) && var1 <= (this.field3044 << 6) + (this.field3048 << 3) + 7 && var2 >= (this.field3049 << 6) + (this.field3051 << 3) && var2 <= (this.field3049 << 6) + (this.field3051 << 3) + 7; // L: 38
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
			int[] var4 = new int[]{this.field3044 * 64 - this.field3042 * 64 + var2 + (this.field3048 * 8 - this.field3050 * 8), var3 + (this.field3049 * 64 - this.field3043 * 64) + (this.field3051 * 8 - this.field3047 * 8)}; // L: 46 47 48
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
			int var3 = this.field3042 * 64 - this.field3044 * 64 + (this.field3050 * 8 - this.field3048 * 8) + var1; // L: 57
			int var4 = this.field3043 * 64 - this.field3049 * 64 + var2 + (this.field3047 * 8 - this.field3051 * 8); // L: 58
			return new Coord(this.field3046, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1013392578"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3046 = var1.readUnsignedByte(); // L: 64
		this.field3041 = var1.readUnsignedByte(); // L: 65
		this.field3042 = var1.readUnsignedShort(); // L: 66
		this.field3050 = var1.readUnsignedByte(); // L: 67
		this.field3043 = var1.readUnsignedShort(); // L: 68
		this.field3047 = var1.readUnsignedByte(); // L: 69
		this.field3044 = var1.readUnsignedShort(); // L: 70
		this.field3048 = var1.readUnsignedByte(); // L: 71
		this.field3049 = var1.readUnsignedShort(); // L: 72
		this.field3051 = var1.readUnsignedByte(); // L: 73
		this.method5561(); // L: 74
	} // L: 75

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-169988352"
	)
	void method5561() {
	} // L: 77

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)I",
		garbageValue = "2016732980"
	)
	static int method5574(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 191
		int var2;
		if (var1 == 0) { // L: 193
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 194
		} else if (var1 == 2) { // L: 195
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 196
		}

		return var2; // L: 197
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1106508695"
	)
	static int method5577(int var0, Script var1, boolean var2) {
		return 2; // L: 5168
	}
}
