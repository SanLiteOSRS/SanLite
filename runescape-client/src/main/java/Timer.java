import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 7483888896686951309L
	)
	long field4248;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 654854770925304923L
	)
	long field4245;
	@ObfuscatedName("f")
	public boolean field4246;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = 4574239759121238911L
	)
	long field4247;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 1049156482329543443L
	)
	long field4254;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 8408979389457387291L
	)
	long field4249;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 710407707
	)
	int field4252;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 778328855
	)
	int field4251;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -48429605
	)
	int field4253;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1168631239
	)
	int field4244;

	public Timer() {
		this.field4248 = -1L; // L: 7
		this.field4245 = -1L; // L: 8
		this.field4246 = false; // L: 9
		this.field4247 = 0L; // L: 10
		this.field4254 = 0L; // L: 11
		this.field4249 = 0L; // L: 12
		this.field4252 = 0; // L: 13
		this.field4251 = 0; // L: 14
		this.field4253 = 0; // L: 15
		this.field4244 = 0; // L: 16
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	public void method6552() {
		this.field4248 = class131.method2916(); // L: 19
	} // L: 20

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-632440390"
	)
	public void method6553() {
		if (-1L != this.field4248) { // L: 23
			this.field4254 = class131.method2916() - this.field4248; // L: 24
			this.field4248 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1777899059"
	)
	public void method6554(int var1) {
		this.field4245 = class131.method2916(); // L: 30
		this.field4252 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	public void method6555() {
		if (-1L != this.field4245) { // L: 35
			this.field4247 = class131.method2916() - this.field4245; // L: 36
			this.field4245 = -1L; // L: 37
		}

		++this.field4253; // L: 39
		this.field4246 = true; // L: 40
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "840918639"
	)
	public void method6574() {
		this.field4246 = false; // L: 44
		this.field4251 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	public void method6557() {
		this.method6555(); // L: 49
	} // L: 50

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "33"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4254; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4247; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4249; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4252); // L: 74
		var1.writeShort(this.field4251); // L: 75
		var1.writeShort(this.field4253); // L: 76
		var1.writeShort(this.field4244); // L: 77
	} // L: 78

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "36"
	)
	public static int[] method6564() {
		int[] var0 = new int[KeyHandler.field142]; // L: 267

		for (int var1 = 0; var1 < KeyHandler.field142; ++var1) { // L: 268
			var0[var1] = KeyHandler.field135[var1]; // L: 269
		}

		return var0; // L: 271
	}
}
