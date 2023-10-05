import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class60 {
	@ObfuscatedName("ac")
	byte[] field458;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 70742755
	)
	int field457;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1755072615
	)
	int field456;

	class60() {
		this.field458 = null; // L: 4
		this.field457 = 0; // L: 5
		this.field456 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1668070165"
	)
	int method1171(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field456; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field456; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field458[this.field457] >> this.field456 & var5) << var3; // L: 16
			this.field456 = 0; // L: 17
			++this.field457; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field458[this.field457] >> this.field456 & var4) << var3; // L: 24
			this.field456 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1671970145"
	)
	int method1172() {
		int var1 = this.field458[this.field457] >> this.field456 & 1; // L: 31
		++this.field456; // L: 32
		this.field457 += this.field456 >> 3; // L: 33
		this.field456 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIS)V",
		garbageValue = "-20687"
	)
	void method1174(byte[] var1, int var2) {
		this.field458 = var1; // L: 39
		this.field457 = var2; // L: 40
		this.field456 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method1185(int var0) {
		return var0 >= WorldMapDecorationType.field3876.id && var0 <= WorldMapDecorationType.field3860.id || var0 == WorldMapDecorationType.field3861.id; // L: 43
	}
}
