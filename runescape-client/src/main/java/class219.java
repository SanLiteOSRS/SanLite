import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class219 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lew;"
	)
	class122[] field2523;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1558849479
	)
	int field2525;

	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V"
	)
	class219(Buffer var1, int var2) {
		this.field2523 = new class122[var2]; // L: 13
		this.field2525 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2523.length; ++var3) { // L: 15
			class122 var4 = new class122(this.field2525, var1, false); // L: 16
			this.field2523[var3] = var4; // L: 17
		}

		this.method4453(); // L: 19
	} // L: 20

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "698731352"
	)
	void method4453() {
		class122[] var1 = this.field2523; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class122 var3 = var1[var2]; // L: 26
			if (var3.field1481 >= 0) { // L: 28
				var3.field1478 = this.field2523[var3.field1481]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1415640515"
	)
	public int method4452() {
		return this.field2523.length; // L: 37
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lew;",
		garbageValue = "119"
	)
	class122 method4454(int var1) {
		return var1 >= this.method4452() ? null : this.field2523[var1]; // L: 41 42 44
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[Lew;",
		garbageValue = "53"
	)
	class122[] method4456() {
		return this.field2523; // L: 48
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfh;II)V",
		garbageValue = "1980554520"
	)
	void method4457(class133 var1, int var2) {
		this.method4474(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I[ZZI)V",
		garbageValue = "-944205793"
	)
	void method4474(class133 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3141(); // L: 56
		int var6 = 0; // L: 57
		class122[] var7 = this.method4456(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class122 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method3139(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70
}
