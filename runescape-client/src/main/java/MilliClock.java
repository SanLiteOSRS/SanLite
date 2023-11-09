import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ay")
	long[] field1880;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -567891425
	)
	int field1875;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1897857577
	)
	int field1874;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -8803452993799991375L
	)
	long field1877;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 444850631
	)
	int field1878;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -343303719
	)
	int field1879;

	MilliClock() {
		this.field1880 = new long[10]; // L: 7
		this.field1875 = 256; // L: 15
		this.field1874 = 1; // L: 16
		this.field1878 = 0; // L: 17
		this.field1877 = Canvas.method310(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1880[var1] = this.field1877;
		}

	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1601207256"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1880[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-899951936"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1875; // L: 31
		int var4 = this.field1874; // L: 32
		this.field1875 = 300; // L: 33
		this.field1874 = 1; // L: 34
		this.field1877 = Canvas.method310(); // L: 35
		if (0L == this.field1880[this.field1879]) { // L: 36
			this.field1875 = var3; // L: 37
			this.field1874 = var4; // L: 38
		} else if (this.field1877 > this.field1880[this.field1879]) { // L: 40
			this.field1875 = (int)((long)(var1 * 2560) / (this.field1877 - this.field1880[this.field1879]));
		}

		if (this.field1875 < 25) { // L: 41
			this.field1875 = 25;
		}

		if (this.field1875 > 256) { // L: 42
			this.field1875 = 256; // L: 43
			this.field1874 = (int)((long)var1 - (this.field1877 - this.field1880[this.field1879]) / 10L); // L: 44
		}

		if (this.field1874 > var1) { // L: 46
			this.field1874 = var1;
		}

		this.field1880[this.field1879] = this.field1877; // L: 47
		this.field1879 = (this.field1879 + 1) % 10; // L: 48
		int var5;
		if (this.field1874 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1880[var5] != 0L) { // L: 51
					this.field1880[var5] += (long)this.field1874;
				}
			}
		}

		if (this.field1874 < var2) { // L: 54
			this.field1874 = var2;
		}

		VarpDefinition.method3559((long)this.field1874); // L: 55

		for (var5 = 0; this.field1878 < 256; this.field1878 += this.field1875) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1878 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BB)Lkk;",
		garbageValue = "77"
	)
	static WorldMapSprite method3508(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(SecureRandomFuture.method2112(var0).pixels); // L: 19 20
	}
}
