import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -1804719232
	)
	static int field1871;
	@ObfuscatedName("af")
	long[] field1879;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1354187759
	)
	int field1872;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1087246239
	)
	int field1873;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -3320355304386370601L
	)
	long field1875;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1554226597
	)
	int field1878;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1512168621
	)
	int field1876;

	MilliClock() {
		this.field1879 = new long[10]; // L: 7
		this.field1872 = 256; // L: 15
		this.field1873 = 1; // L: 16
		this.field1878 = 0; // L: 17
		this.field1875 = class96.method2634(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1879[var1] = this.field1875; // L: 20
		}

	} // L: 22

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-331366942"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1879[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1491982008"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1872; // L: 31
		int var4 = this.field1873; // L: 32
		this.field1872 = 300; // L: 33
		this.field1873 = 1; // L: 34
		this.field1875 = class96.method2634(); // L: 35
		if (0L == this.field1879[this.field1876]) { // L: 36
			this.field1872 = var3; // L: 37
			this.field1873 = var4; // L: 38
		} else if (this.field1875 > this.field1879[this.field1876]) { // L: 40
			this.field1872 = (int)((long)(var1 * 2560) / (this.field1875 - this.field1879[this.field1876]));
		}

		if (this.field1872 < 25) { // L: 41
			this.field1872 = 25;
		}

		if (this.field1872 > 256) { // L: 42
			this.field1872 = 256; // L: 43
			this.field1873 = (int)((long)var1 - (this.field1875 - this.field1879[this.field1876]) / 10L); // L: 44
		}

		if (this.field1873 > var1) { // L: 46
			this.field1873 = var1;
		}

		this.field1879[this.field1876] = this.field1875; // L: 47
		this.field1876 = (this.field1876 + 1) % 10; // L: 48
		int var5;
		if (this.field1873 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1879[var5]) { // L: 51
					this.field1879[var5] += (long)this.field1873;
				}
			}
		}

		if (this.field1873 < var2) { // L: 54
			this.field1873 = var2;
		}

		PlayerComposition.method6084((long)this.field1873); // L: 55

		for (var5 = 0; this.field1878 < 256; this.field1878 += this.field1872) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1878 &= 255; // L: 61
		return var5; // L: 62
	}
}
