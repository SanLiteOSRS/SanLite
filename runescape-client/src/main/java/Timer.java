import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 6474461140514365781L
	)
	long field4441;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6484235333072242705L
	)
	long field4433;
	@ObfuscatedName("ac")
	public boolean field4434;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 2445261166309703959L
	)
	long field4436;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 4891784982145261159L
	)
	long field4435;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -338388379477578015L
	)
	long field4432;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1495988025
	)
	int field4438;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 340077697
	)
	int field4439;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1170875171
	)
	int field4437;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -783077817
	)
	int field4440;

	public Timer() {
		this.field4441 = -1L; // L: 7
		this.field4433 = -1L; // L: 8
		this.field4434 = false; // L: 9
		this.field4436 = 0L; // L: 10
		this.field4435 = 0L; // L: 11
		this.field4432 = 0L; // L: 12
		this.field4438 = 0; // L: 13
		this.field4439 = 0; // L: 14
		this.field4437 = 0; // L: 15
		this.field4440 = 0; // L: 16
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1077675210"
	)
	public void method7336() {
		this.field4441 = WorldMapSection2.method4844(); // L: 19
	} // L: 20

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	public void method7323() {
		if (this.field4441 != -1L) { // L: 23
			this.field4435 = WorldMapSection2.method4844() - this.field4441; // L: 24
			this.field4441 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1956190938"
	)
	public void method7333(int var1) {
		this.field4433 = WorldMapSection2.method4844(); // L: 30
		this.field4438 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1378136429"
	)
	public void method7335() {
		if (-1L != this.field4433) { // L: 35
			this.field4436 = WorldMapSection2.method4844() - this.field4433; // L: 36
			this.field4433 = -1L; // L: 37
		}

		++this.field4437; // L: 39
		this.field4434 = true; // L: 40
	} // L: 41

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-350279291"
	)
	public void method7324() {
		this.field4434 = false; // L: 44
		this.field4439 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	public void method7325() {
		this.method7335(); // L: 49
	} // L: 50

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "1658003997"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4435; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4436; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4432; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4438); // L: 74
		var1.writeShort(this.field4439); // L: 75
		var1.writeShort(this.field4437); // L: 76
		var1.writeShort(this.field4440); // L: 77
	} // L: 78

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmy;IIIB)V",
		garbageValue = "10"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3583 == null) { // L: 1200
			throw new RuntimeException(); // L: 1201
		} else {
			var0.field3583[var1] = var2; // L: 1203
			var0.field3603[var1] = var3; // L: 1204
		}
	} // L: 1205

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1791005101"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 408
		int var2 = var1.readUnsignedByte(); // L: 409
		int var3 = var1.readInt(); // L: 410
		if (var3 < 0 || AbstractArchive.field4201 != 0 && var3 > AbstractArchive.field4201) { // L: 411
			throw new RuntimeException(); // L: 412
		} else if (var2 == 0) { // L: 414
			byte[] var6 = new byte[var3]; // L: 415
			var1.readBytes(var6, 0, var3); // L: 416
			return var6; // L: 417
		} else {
			int var4 = var1.readInt(); // L: 420
			if (var4 >= 0 && (AbstractArchive.field4201 == 0 || var4 <= AbstractArchive.field4201)) { // L: 421
				byte[] var5 = new byte[var4]; // L: 424
				if (var2 == 1) { // L: 425
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 426
				}

				return var5; // L: 427
			} else {
				throw new RuntimeException(); // L: 422
			}
		}
	}
}
