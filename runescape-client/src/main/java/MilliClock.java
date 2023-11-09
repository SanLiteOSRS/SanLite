import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("o")
	long[] field1783;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -410274933
	)
	int field1776;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 603484071
	)
	int field1778;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = -1778229211141023355L
	)
	long field1784;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1749275441
	)
	int field1779;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 281585177
	)
	int field1781;

	MilliClock() {
		this.field1783 = new long[10]; // L: 7
		this.field1776 = 256; // L: 15
		this.field1778 = 1; // L: 16
		this.field1779 = 0; // L: 17
		this.field1784 = class131.method2916(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1783[var1] = this.field1784; // L: 20
		}

	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-972249227"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1783[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1486724184"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1776; // L: 31
		int var4 = this.field1778; // L: 32
		this.field1776 = 300; // L: 33
		this.field1778 = 1; // L: 34
		this.field1784 = class131.method2916(); // L: 35
		if (0L == this.field1783[this.field1781]) { // L: 36
			this.field1776 = var3; // L: 37
			this.field1778 = var4; // L: 38
		} else if (this.field1784 > this.field1783[this.field1781]) { // L: 40
			this.field1776 = (int)((long)(var1 * 2560) / (this.field1784 - this.field1783[this.field1781]));
		}

		if (this.field1776 < 25) { // L: 41
			this.field1776 = 25;
		}

		if (this.field1776 > 256) { // L: 42
			this.field1776 = 256; // L: 43
			this.field1778 = (int)((long)var1 - (this.field1784 - this.field1783[this.field1781]) / 10L); // L: 44
		}

		if (this.field1778 > var1) { // L: 46
			this.field1778 = var1;
		}

		this.field1783[this.field1781] = this.field1784; // L: 47
		this.field1781 = (this.field1781 + 1) % 10; // L: 48
		int var5;
		if (this.field1778 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1783[var5]) { // L: 51
					this.field1783[var5] += (long)this.field1778;
				}
			}
		}

		if (this.field1778 < var2) { // L: 54
			this.field1778 = var2;
		}

		WorldMapDecoration.method4967((long)this.field1778); // L: 55

		for (var5 = 0; this.field1779 < 256; this.field1779 += this.field1776) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1779 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llc;IB)V",
		garbageValue = "46"
	)
	static void method3293(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 260
			Canvas.logoSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 261
		} else if ((var1 & 1073741824) != 0) { // L: 263
			Canvas.logoSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 264
		} else {
			Canvas.logoSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 267
		}

	} // L: 269

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158178047"
	)
	static final void method3292() {
		Client.field694 = Client.cycleCntr; // L: 12193
		class122.field1499 = true; // L: 12194
	} // L: 12195
}
