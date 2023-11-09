import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class227 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Leb;"
	)
	class127[] field2532;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1930352701
	)
	int field2531;

	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V"
	)
	class227(Buffer var1, int var2) {
		this.field2532 = new class127[var2]; // L: 13
		this.field2531 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2532.length; ++var3) { // L: 15
			class127 var4 = new class127(this.field2531, var1, false); // L: 16
			this.field2532[var3] = var4; // L: 17
		}

		this.method4565(); // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1043043048"
	)
	void method4565() {
		class127[] var1 = this.field2532; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class127 var3 = var1[var2]; // L: 26
			if (var3.field1507 >= 0) { // L: 28
				var3.field1502 = this.field2532[var3.field1507]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-44710572"
	)
	public int method4566() {
		return this.field2532.length; // L: 37
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Leb;",
		garbageValue = "-305655568"
	)
	class127 method4567(int var1) {
		return var1 >= this.method4566() ? null : this.field2532[var1]; // L: 41 42 44
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[Leb;",
		garbageValue = "-95"
	)
	class127[] method4568() {
		return this.field2532; // L: 48
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfw;II)V",
		garbageValue = "2130201567"
	)
	void method4569(class138 var1, int var2) {
		this.method4570(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfw;I[ZZB)V",
		garbageValue = "-53"
	)
	void method4570(class138 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3140(); // L: 56
		int var6 = 0; // L: 57
		class127[] var7 = this.method4568(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class127 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method3138(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70
}
