import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("aj")
	long[] field1847;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1869895227
	)
	int field1848;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -83478851
	)
	int field1846;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 2122071681802424889L
	)
	long field1849;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1052994805
	)
	int field1850;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1175347671
	)
	int field1851;

	MilliClock() {
		this.field1847 = new long[10]; // L: 7
		this.field1848 = 256; // L: 15
		this.field1846 = 1; // L: 16
		this.field1850 = 0; // L: 17
		this.field1849 = WorldMapSection2.method4844(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1847[var1] = this.field1849; // L: 20
		}

	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1425086968"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1847[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1465993621"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1848; // L: 31
		int var4 = this.field1846; // L: 32
		this.field1848 = 300; // L: 33
		this.field1846 = 1; // L: 34
		this.field1849 = WorldMapSection2.method4844(); // L: 35
		if (this.field1847[this.field1851] == 0L) { // L: 36
			this.field1848 = var3; // L: 37
			this.field1846 = var4; // L: 38
		} else if (this.field1849 > this.field1847[this.field1851]) { // L: 40
			this.field1848 = (int)((long)(var1 * 2560) / (this.field1849 - this.field1847[this.field1851]));
		}

		if (this.field1848 < 25) { // L: 41
			this.field1848 = 25;
		}

		if (this.field1848 > 256) { // L: 42
			this.field1848 = 256; // L: 43
			this.field1846 = (int)((long)var1 - (this.field1849 - this.field1847[this.field1851]) / 10L); // L: 44
		}

		if (this.field1846 > var1) { // L: 46
			this.field1846 = var1;
		}

		this.field1847[this.field1851] = this.field1849; // L: 47
		this.field1851 = (this.field1851 + 1) % 10; // L: 48
		int var5;
		if (this.field1846 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1847[var5]) { // L: 51
					this.field1847[var5] += (long)this.field1846;
				}
			}
		}

		if (this.field1846 < var2) { // L: 54
			this.field1846 = var2;
		}

		Login.method2088((long)this.field1846); // L: 55

		for (var5 = 0; this.field1850 < 256; this.field1850 += this.field1848) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1850 &= 255; // L: 61
		return var5; // L: 62
	}
}
