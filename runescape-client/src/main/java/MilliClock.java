import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("aw")
	long[] field1867;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -550412453
	)
	int field1870;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -198323931
	)
	int field1868;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 411650762298926119L
	)
	long field1869;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1217161433
	)
	int field1866;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 927990785
	)
	int field1871;

	public MilliClock() {
		this.field1867 = new long[10]; // L: 7
		this.field1870 = 256; // L: 15
		this.field1868 = 1; // L: 16
		this.field1866 = 0; // L: 17
		this.field1869 = class113.method2835(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1867[var1] = this.field1869; // L: 20
		}

	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1541664401"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1867[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "64"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1870; // L: 31
		int var4 = this.field1868; // L: 32
		this.field1870 = 300; // L: 33
		this.field1868 = 1; // L: 34
		this.field1869 = class113.method2835(); // L: 35
		if (0L == this.field1867[this.field1871]) { // L: 36
			this.field1870 = var3; // L: 37
			this.field1868 = var4; // L: 38
		} else if (this.field1869 > this.field1867[this.field1871]) { // L: 40
			this.field1870 = (int)((long)(var1 * 2560) / (this.field1869 - this.field1867[this.field1871]));
		}

		if (this.field1870 < 25) { // L: 41
			this.field1870 = 25;
		}

		if (this.field1870 > 256) { // L: 42
			this.field1870 = 256; // L: 43
			this.field1868 = (int)((long)var1 - (this.field1869 - this.field1867[this.field1871]) / 10L); // L: 44
		}

		if (this.field1868 > var1) { // L: 46
			this.field1868 = var1;
		}

		this.field1867[this.field1871] = this.field1869; // L: 47
		this.field1871 = (this.field1871 + 1) % 10; // L: 48
		int var5;
		if (this.field1868 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1867[var5] != 0L) { // L: 51
					this.field1867[var5] += (long)this.field1868;
				}
			}
		}

		if (this.field1868 < var2) { // L: 54
			this.field1868 = var2;
		}

		class13.method180((long)this.field1868); // L: 55

		for (var5 = 0; this.field1866 < 256; this.field1866 += this.field1870) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1866 &= 255; // L: 61
		return var5; // L: 62
	}
}
