import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class60 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1913802217
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static Font field435;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -1977376505
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("aq")
	byte[] field431;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1308733505
	)
	int field430;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 296190363
	)
	int field434;

	class60() {
		this.field431 = null; // L: 4
		this.field430 = 0; // L: 5
		this.field434 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1558898831"
	)
	int method1138(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field434; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field434; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field431[this.field430] >> this.field434 & var5) << var3; // L: 16
			this.field434 = 0; // L: 17
			++this.field430; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field431[this.field430] >> this.field434 & var4) << var3; // L: 24
			this.field434 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1615671029"
	)
	int method1139() {
		int var1 = this.field431[this.field430] >> this.field434 & 1; // L: 31
		++this.field434; // L: 32
		this.field430 += this.field434 >> 3; // L: 33
		this.field434 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "50"
	)
	void method1141(byte[] var1, int var2) {
		this.field431 = var1; // L: 39
		this.field430 = var2; // L: 40
		this.field434 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lbj;B)V",
		garbageValue = "8"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 268
		}

	} // L: 269
}
