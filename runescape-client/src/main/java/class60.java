import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class60 {
	@ObfuscatedName("gg")
	static String field437;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -2095567381
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 931534025
	)
	static int field431;
	@ObfuscatedName("am")
	byte[] field430;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 95763601
	)
	int field433;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1089651909
	)
	int field432;

	class60() {
		this.field430 = null; // L: 4
		this.field433 = 0; // L: 5
		this.field432 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1595212669"
	)
	int method1188(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field432; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field432; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field430[this.field433] >> this.field432 & var5) << var3; // L: 16
			this.field432 = 0; // L: 17
			++this.field433; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field430[this.field433] >> this.field432 & var4) << var3; // L: 24
			this.field432 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "705214862"
	)
	int method1189() {
		int var1 = this.field430[this.field433] >> this.field432 & 1; // L: 31
		++this.field432; // L: 32
		this.field433 += this.field432 >> 3; // L: 33
		this.field432 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "176102354"
	)
	void method1187(byte[] var1, int var2) {
		this.field430 = var1; // L: 39
		this.field433 = var2; // L: 40
		this.field432 = 0; // L: 41
	} // L: 42
}
