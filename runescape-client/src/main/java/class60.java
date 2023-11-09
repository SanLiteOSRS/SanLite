import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class60 {
	@ObfuscatedName("au")
	byte[] field459;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 352482533
	)
	int field458;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1727037637
	)
	int field463;

	class60() {
		this.field459 = null; // L: 4
		this.field458 = 0; // L: 5
		this.field463 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-62"
	)
	int method1161(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field463; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field463; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field459[this.field458] >> this.field463 & var5) << var3; // L: 16
			this.field463 = 0; // L: 17
			++this.field458; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field459[this.field458] >> this.field463 & var4) << var3; // L: 24
			this.field463 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-36"
	)
	int method1162() {
		int var1 = this.field459[this.field458] >> this.field463 & 1; // L: 31
		++this.field463; // L: 32
		this.field458 += this.field463 >> 3; // L: 33
		this.field463 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "1812215657"
	)
	void method1163(byte[] var1, int var2) {
		this.field459 = var1; // L: 39
		this.field458 = var2; // L: 40
		this.field463 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-1921565351"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class102.method2663(var0, 10, var1) : Integer.toString(var0); // L: 107 108
	}
}
