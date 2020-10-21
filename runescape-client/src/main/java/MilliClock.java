import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("z")
	long[] field2057;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -886018089
	)
	int field2053;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -786123251
	)
	int field2055;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 4297873508162360303L
	)
	long field2056;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -981834759
	)
	int field2054;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 709273215
	)
	int field2058;

	MilliClock() {
		this.field2057 = new long[10];
		this.field2053 = 256;
		this.field2055 = 1;
		this.field2054 = 0;
		this.field2056 = PacketWriter.currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2057[var1] = this.field2056;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "208275261"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2057[var1] = 0L;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-16016139"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2053;
		int var4 = this.field2055;
		this.field2053 = 300;
		this.field2055 = 1;
		this.field2056 = PacketWriter.currentTimeMillis();
		if (this.field2057[this.field2058] == 0L) {
			this.field2053 = var3;
			this.field2055 = var4;
		} else if (this.field2056 > this.field2057[this.field2058]) {
			this.field2053 = (int)((long)(var1 * 2560) / (this.field2056 - this.field2057[this.field2058]));
		}

		if (this.field2053 < 25) {
			this.field2053 = 25;
		}

		if (this.field2053 > 256) {
			this.field2053 = 256;
			this.field2055 = (int)((long)var1 - (this.field2056 - this.field2057[this.field2058]) / 10L);
		}

		if (this.field2055 > var1) {
			this.field2055 = var1;
		}

		this.field2057[this.field2058] = this.field2056;
		this.field2058 = (this.field2058 + 1) % 10;
		int var5;
		if (this.field2055 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2057[var5]) {
					this.field2057[var5] += (long)this.field2055;
				}
			}
		}

		if (this.field2055 < var2) {
			this.field2055 = var2;
		}

		class227.method4180((long)this.field2055);

		for (var5 = 0; this.field2054 < 256; this.field2054 += this.field2053) {
			++var5;
		}

		this.field2054 &= 255;
		return var5;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-473742756"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
