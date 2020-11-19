import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 1717833856
	)
	static int field2048;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1735365545
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("f")
	long[] field2042;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1230464275
	)
	int field2040;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1780413157
	)
	int field2041;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 7922425031260846731L
	)
	long field2043;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1604091025
	)
	int field2047;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 738623211
	)
	int field2044;

	MilliClock() {
		this.field2042 = new long[10];
		this.field2040 = 256;
		this.field2041 = 1;
		this.field2047 = 0;
		this.field2043 = Nameable.currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2042[var1] = this.field2043;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "345512591"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2042[var1] = 0L;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-837141414"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2040;
		int var4 = this.field2041;
		this.field2040 = 300;
		this.field2041 = 1;
		this.field2043 = Nameable.currentTimeMillis();
		if (this.field2042[this.field2044] == 0L) {
			this.field2040 = var3;
			this.field2041 = var4;
		} else if (this.field2043 > this.field2042[this.field2044]) {
			this.field2040 = (int)((long)(var1 * 2560) / (this.field2043 - this.field2042[this.field2044]));
		}

		if (this.field2040 < 25) {
			this.field2040 = 25;
		}

		if (this.field2040 > 256) {
			this.field2040 = 256;
			this.field2041 = (int)((long)var1 - (this.field2043 - this.field2042[this.field2044]) / 10L);
		}

		if (this.field2041 > var1) {
			this.field2041 = var1;
		}

		this.field2042[this.field2044] = this.field2043;
		this.field2044 = (this.field2044 + 1) % 10;
		int var5;
		if (this.field2041 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2042[var5] != 0L) {
					this.field2042[var5] += (long)this.field2041;
				}
			}
		}

		if (this.field2041 < var2) {
			this.field2041 = var2;
		}

		WorldMapSection3.method894((long)this.field2041);

		for (var5 = 0; this.field2047 < 256; this.field2047 += this.field2040) {
			++var5;
		}

		this.field2047 &= 255;
		return var5;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		signature = "(IS)I",
		garbageValue = "152"
	)
	static int method3587(int var0) {
		return var0 * 3 + 600;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-26"
	)
	public static boolean method3590() {
		return Client.staffModLevel >= 2;
	}
}
