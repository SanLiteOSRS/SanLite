import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public class class259 implements WorldMapSection {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("ItemComposition_fontPlain11")
	public static Font ItemComposition_fontPlain11;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1715398721
	)
	int field2939;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1619423241
	)
	int field2933;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2099636653
	)
	int field2934;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -353578703
	)
	int field2943;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1060882957
	)
	int field2936;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -328437201
	)
	int field2932;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1625942991
	)
	int field2938;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -715393785
	)
	int field2942;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2031852083
	)
	int field2940;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1582030005
	)
	int field2941;

	class259() {
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)V",
		garbageValue = "941109568"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2936) { // L: 22
			var1.regionLowX = this.field2936;
		}

		if (var1.regionHighX < this.field2936) {
			var1.regionHighX = this.field2936; // L: 23
		}

		if (var1.regionLowY > this.field2932) { // L: 24
			var1.regionLowY = this.field2932;
		}

		if (var1.regionHighY < this.field2932) { // L: 25
			var1.regionHighY = this.field2932;
		}

	} // L: 26

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "4"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2939 && var1 < this.field2939 + this.field2933) { // L: 30
			return var2 >= (this.field2934 << 6) + (this.field2938 << 3) && var2 <= (this.field2934 << 6) + (this.field2938 << 3) + 7 && var3 >= (this.field2943 << 6) + (this.field2942 << 3) && var3 <= (this.field2943 << 6) + (this.field2942 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1852131731"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2936 << 6) + (this.field2940 << 3) && var1 <= (this.field2936 << 6) + (this.field2940 << 3) + 7 && var2 >= (this.field2932 << 6) + (this.field2941 << 3) && var2 <= (this.field2932 << 6) + (this.field2941 << 3) + 7; // L: 38
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1844199592"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2936 * 64 - this.field2934 * 64 + var2 + (this.field2940 * 8 - this.field2938 * 8), var3 + (this.field2932 * 64 - this.field2943 * 64) + (this.field2941 * 8 - this.field2942 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lmg;",
		garbageValue = "1427373477"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2934 * 64 - this.field2936 * 64 + (this.field2938 * 8 - this.field2940 * 8) + var1; // L: 57
			int var4 = this.field2943 * 64 - this.field2932 * 64 + var2 + (this.field2942 * 8 - this.field2941 * 8); // L: 58
			return new Coord(this.field2939, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "52437899"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2939 = var1.readUnsignedByte(); // L: 64
		this.field2933 = var1.readUnsignedByte(); // L: 65
		this.field2934 = var1.readUnsignedShort(); // L: 66
		this.field2938 = var1.readUnsignedByte(); // L: 67
		this.field2943 = var1.readUnsignedShort(); // L: 68
		this.field2942 = var1.readUnsignedByte(); // L: 69
		this.field2936 = var1.readUnsignedShort(); // L: 70
		this.field2940 = var1.readUnsignedByte(); // L: 71
		this.field2932 = var1.readUnsignedShort(); // L: 72
		this.field2941 = var1.readUnsignedByte(); // L: 73
		this.method5362(); // L: 74
	} // L: 75

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1761590084"
	)
	void method5362() {
	} // L: 77
}
