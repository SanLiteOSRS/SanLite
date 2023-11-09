import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("f")
	long[] field1884;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -110419121
	)
	int field1885;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1893993921
	)
	int field1890;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 6857388795724027113L
	)
	long field1887;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -536261417
	)
	int field1888;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 989727053
	)
	int field1889;

	MilliClock() {
		this.field1884 = new long[10]; // L: 7
		this.field1885 = 256; // L: 15
		this.field1890 = 1; // L: 16
		this.field1888 = 0; // L: 17
		this.field1887 = class153.method3317(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1884[var1] = this.field1887; // L: 20
		}

	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1619845116"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1884[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1661663667"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1885; // L: 31
		int var4 = this.field1890; // L: 32
		this.field1885 = 300; // L: 33
		this.field1890 = 1; // L: 34
		this.field1887 = class153.method3317(); // L: 35
		if (0L == this.field1884[this.field1889]) { // L: 36
			this.field1885 = var3; // L: 37
			this.field1890 = var4; // L: 38
		} else if (this.field1887 > this.field1884[this.field1889]) { // L: 40
			this.field1885 = (int)((long)(var1 * 2560) / (this.field1887 - this.field1884[this.field1889]));
		}

		if (this.field1885 < 25) { // L: 41
			this.field1885 = 25;
		}

		if (this.field1885 > 256) { // L: 42
			this.field1885 = 256; // L: 43
			this.field1890 = (int)((long)var1 - (this.field1887 - this.field1884[this.field1889]) / 10L); // L: 44
		}

		if (this.field1890 > var1) { // L: 46
			this.field1890 = var1;
		}

		this.field1884[this.field1889] = this.field1887; // L: 47
		this.field1889 = (this.field1889 + 1) % 10; // L: 48
		int var5;
		if (this.field1890 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1884[var5]) { // L: 51
					this.field1884[var5] += (long)this.field1890;
				}
			}
		}

		if (this.field1890 < var2) { // L: 54
			this.field1890 = var2;
		}

		Clock.method3567((long)this.field1890); // L: 55

		for (var5 = 0; this.field1888 < 256; this.field1888 += this.field1885) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1888 &= 255; // L: 61
		return var5; // L: 62
	}
}
