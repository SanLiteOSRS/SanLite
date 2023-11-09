import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("at")
	long[] field1860;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 266969677
	)
	int field1861;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -778124261
	)
	int field1859;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -2178734300602278069L
	)
	long field1858;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -29680377
	)
	int field1857;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 332250967
	)
	int field1862;

	public MilliClock() {
		this.field1860 = new long[10]; // L: 7
		this.field1861 = 256; // L: 15
		this.field1859 = 1; // L: 16
		this.field1857 = 0; // L: 17
		this.field1858 = WallObject.method5027(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1860[var1] = this.field1858; // L: 20
		}

	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1909200559"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1860[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-4"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1861; // L: 31
		int var4 = this.field1859; // L: 32
		this.field1861 = 300; // L: 33
		this.field1859 = 1; // L: 34
		this.field1858 = WallObject.method5027(); // L: 35
		if (this.field1860[this.field1862] == 0L) { // L: 36
			this.field1861 = var3; // L: 37
			this.field1859 = var4; // L: 38
		} else if (this.field1858 > this.field1860[this.field1862]) { // L: 40
			this.field1861 = (int)((long)(var1 * 2560) / (this.field1858 - this.field1860[this.field1862]));
		}

		if (this.field1861 < 25) { // L: 41
			this.field1861 = 25;
		}

		if (this.field1861 > 256) { // L: 42
			this.field1861 = 256; // L: 43
			this.field1859 = (int)((long)var1 - (this.field1858 - this.field1860[this.field1862]) / 10L); // L: 44
		}

		if (this.field1859 > var1) { // L: 46
			this.field1859 = var1;
		}

		this.field1860[this.field1862] = this.field1858; // L: 47
		this.field1862 = (this.field1862 + 1) % 10; // L: 48
		int var5;
		if (this.field1859 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1860[var5]) { // L: 51
					this.field1860[var5] += (long)this.field1859;
				}
			}
		}

		if (this.field1859 < var2) { // L: 54
			this.field1859 = var2;
		}

		GroundObject.method4357((long)this.field1859); // L: 55

		for (var5 = 0; this.field1857 < 256; this.field1857 += this.field1861) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1857 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1523541011"
	)
	static int method3527(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 99
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lud;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-66"
	)
	static final void method3526(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					class305.field3399[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87
}
