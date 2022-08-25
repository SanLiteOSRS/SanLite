import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class228 implements WorldMapSection {
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		longValue = -2072947809351730293L
	)
	static long field2765;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 47745645
	)
	int field2770;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 263675681
	)
	int field2761;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1353652937
	)
	int field2762;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 305913255
	)
	int field2763;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 730488789
	)
	int field2764;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2135219953
	)
	int field2767;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 887995033
	)
	int field2766;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 258163739
	)
	int field2768;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 498509109
	)
	int field2760;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -229699945
	)
	int field2769;

	class228() {
	} // L: 18

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2764) { // L: 22
			var1.regionLowX = this.field2764;
		}

		if (var1.regionHighX < this.field2764) {
			var1.regionHighX = this.field2764; // L: 23
		}

		if (var1.regionLowY > this.field2767) { // L: 24
			var1.regionLowY = this.field2767;
		}

		if (var1.regionHighY < this.field2767) { // L: 25
			var1.regionHighY = this.field2767;
		}

	} // L: 26

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2770 && var1 < this.field2770 + this.field2761) { // L: 30
			return var2 >= (this.field2762 << 6) + (this.field2766 << 3) && var2 <= (this.field2762 << 6) + (this.field2766 << 3) + 7 && var3 >= (this.field2763 << 6) + (this.field2768 << 3) && var3 <= (this.field2763 << 6) + (this.field2768 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1464078865"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2764 << 6) + (this.field2760 << 3) && var1 <= (this.field2764 << 6) + (this.field2760 << 3) + 7 && var2 >= (this.field2767 << 6) + (this.field2769 << 3) && var2 <= (this.field2767 << 6) + (this.field2769 << 3) + 7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2119764221"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2764 * 64 - this.field2762 * 64 + var2 + (this.field2760 * 8 - this.field2766 * 8), var3 + (this.field2767 * 64 - this.field2763 * 64) + (this.field2769 * 8 - this.field2768 * 8)}; // L: 47 48
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "-1688632698"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null;
		} else {
			int var3 = this.field2762 * 64 - this.field2764 * 64 + (this.field2766 * 8 - this.field2760 * 8) + var1; // L: 57
			int var4 = this.field2763 * 64 - this.field2767 * 64 + var2 + (this.field2768 * 8 - this.field2769 * 8);
			return new Coord(this.field2770, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2770 = var1.readUnsignedByte();
		this.field2761 = var1.readUnsignedByte();
		this.field2762 = var1.readUnsignedShort();
		this.field2766 = var1.readUnsignedByte(); // L: 67
		this.field2763 = var1.readUnsignedShort();
		this.field2768 = var1.readUnsignedByte();
		this.field2764 = var1.readUnsignedShort(); // L: 70
		this.field2760 = var1.readUnsignedByte();
		this.field2767 = var1.readUnsignedShort(); // L: 72
		this.field2769 = var1.readUnsignedByte();
		this.method4791(); // L: 74
	} // L: 75

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1191123108"
	)
	void method4791() {
	} // L: 77

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1392891672"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 38
		boolean var3 = false; // L: 39
		int var4 = 0; // L: 40
		int var5 = var0.length(); // L: 41
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 71
				break;
			}

			label85: {
				char var7 = var0.charAt(var6); // L: 43
				if (var6 == 0) { // L: 44
					if (var7 == '-') { // L: 45
						var2 = true; // L: 46
						break label85;
					}

					if (var7 == '+') { // L: 49
						break label85;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 51
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 52
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 53
						var1 = false; // L: 55
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 58
					var1 = false; // L: 59
					break; // L: 60
				}

				if (var2) { // L: 62
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10; // L: 63
				if (var4 != var8 / 10) { // L: 64
					var1 = false; // L: 65
					break; // L: 66
				}

				var4 = var8; // L: 68
				var3 = true; // L: 69
			}

			++var6; // L: 42
		}

		return var1; // L: 73
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "70"
	)
	static final int method4802(int var0, int var1) {
		int var2 = var0 + var1 * 57; // L: 1022
		var2 ^= var2 << 13; // L: 1023
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 1024
		return var3 >> 19 & 255; // L: 1025
	}
}
