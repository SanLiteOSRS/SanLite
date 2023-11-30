import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class240 implements WorldMapSection {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1222193481
	)
	int field2515;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1538647535
	)
	int field2512;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1275308633
	)
	int field2519;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 169195253
	)
	int field2514;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1569962609
	)
	int field2513;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 71945279
	)
	int field2516;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -505666393
	)
	int field2518;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2008797759
	)
	int field2517;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 985964181
	)
	int field2520;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -341717279
	)
	int field2521;

	class240() {
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "16"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2513) { // L: 22
			var1.regionLowX = this.field2513;
		}

		if (var1.regionHighX < this.field2513) {
			var1.regionHighX = this.field2513; // L: 23
		}

		if (var1.regionLowY > this.field2516) { // L: 24
			var1.regionLowY = this.field2516;
		}

		if (var1.regionHighY < this.field2516) { // L: 25
			var1.regionHighY = this.field2516;
		}

	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2515 && var1 < this.field2512 + this.field2515) { // L: 30
			return var2 >= (this.field2519 << 6) + (this.field2518 << 3) && var2 <= (this.field2519 << 6) + (this.field2518 << 3) + 7 && var3 >= (this.field2514 << 6) + (this.field2517 << 3) && var3 <= (this.field2514 << 6) + (this.field2517 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "542110974"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2513 << 6) + (this.field2520 << 3) && var1 <= (this.field2513 << 6) + (this.field2520 << 3) + 7 && var2 >= (this.field2516 << 6) + (this.field2521 << 3) && var2 <= (this.field2516 << 6) + (this.field2521 << 3) + 7; // L: 38
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "12300"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2513 * 64 - this.field2519 * 64 + var2 + (this.field2520 * 8 - this.field2518 * 8), var3 + (this.field2516 * 64 - this.field2514 * 64) + (this.field2521 * 8 - this.field2517 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lmh;",
		garbageValue = "-1535299153"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2519 * 64 - this.field2513 * 64 + (this.field2518 * 8 - this.field2520 * 8) + var1; // L: 57
			int var4 = this.field2514 * 64 - this.field2516 * 64 + var2 + (this.field2517 * 8 - this.field2521 * 8); // L: 58
			return new Coord(this.field2515, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-10"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2515 = var1.readUnsignedByte(); // L: 64
		this.field2512 = var1.readUnsignedByte(); // L: 65
		this.field2519 = var1.readUnsignedShort(); // L: 66
		this.field2518 = var1.readUnsignedByte(); // L: 67
		this.field2514 = var1.readUnsignedShort(); // L: 68
		this.field2517 = var1.readUnsignedByte(); // L: 69
		this.field2513 = var1.readUnsignedShort(); // L: 70
		this.field2520 = var1.readUnsignedByte(); // L: 71
		this.field2516 = var1.readUnsignedShort(); // L: 72
		this.field2521 = var1.readUnsignedByte(); // L: 73
		this.method4805(); // L: 74
	} // L: 75

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	void method4805() {
	} // L: 77

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-976406979"
	)
	static final int method4829(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 3891
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	static void method4808(int var0) {
		SequenceDefinition var1 = DynamicObject.SequenceDefinition_get(var0); // L: 12970
		if (var1.isCachedModelIdSet()) { // L: 12971
			if (MouseRecorder.method2372(var1.SequenceDefinition_cachedModelId) == 2) { // L: 12974
				Client.field500.add(var1.SequenceDefinition_cachedModelId); // L: 12975
			}

		}
	} // L: 12972 12977
}
