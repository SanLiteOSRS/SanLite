import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	long[] field1509;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -57079655
	)
	int field1502;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1775737415
	)
	int field1504;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -7099522440067611417L
	)
	long field1505;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -193436617
	)
	int field1503;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1791483173
	)
	int field1506;

	MilliClock() {
		this.field1509 = new long[10];
		this.field1502 = 256;
		this.field1504 = 1;
		this.field1503 = 0;
		this.field1505 = ObjectSound.currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1509[var1] = this.field1505;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "-629"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1509[var1] = 0L;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1172254968"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1502;
		int var4 = this.field1504;
		this.field1502 = 300;
		this.field1504 = 1;
		this.field1505 = ObjectSound.currentTimeMillis();
		if (0L == this.field1509[this.field1506]) {
			this.field1502 = var3;
			this.field1504 = var4;
		} else if (this.field1505 > this.field1509[this.field1506]) {
			this.field1502 = (int)((long)(var1 * 2560) / (this.field1505 - this.field1509[this.field1506]));
		}

		if (this.field1502 < 25) {
			this.field1502 = 25;
		}

		if (this.field1502 > 256) {
			this.field1502 = 256;
			this.field1504 = (int)((long)var1 - (this.field1505 - this.field1509[this.field1506]) / 10L);
		}

		if (this.field1504 > var1) {
			this.field1504 = var1;
		}

		this.field1509[this.field1506] = this.field1505;
		this.field1506 = (this.field1506 + 1) % 10;
		int var5;
		if (this.field1504 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field1509[var5] != 0L) {
					this.field1509[var5] += (long)this.field1504;
				}
			}
		}

		if (this.field1504 < var2) {
			this.field1504 = var2;
		}

		GrandExchangeEvent.method4625((long)this.field1504);

		for (var5 = 0; this.field1503 < 256; this.field1503 += this.field1502) {
			++var5;
		}

		this.field1503 &= 255;
		return var5;
	}
}
