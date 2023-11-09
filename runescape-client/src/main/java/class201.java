import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class201 {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field2366;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Ldp;"
	)
	class115[] field2367;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -27439819
	)
	int field2365;

	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V"
	)
	class201(Buffer var1, int var2) {
		this.field2367 = new class115[var2]; // L: 13
		this.field2365 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2367.length; ++var3) { // L: 15
			class115 var4 = new class115(this.field2365, var1, false); // L: 16
			this.field2367[var3] = var4; // L: 17
		}

		this.method4038(); // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1239652404"
	)
	void method4038() {
		class115[] var1 = this.field2367; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class115 var3 = var1[var2]; // L: 26
			if (var3.field1421 >= 0) { // L: 28
				var3.field1413 = this.field2367[var3.field1421]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2080769"
	)
	public int method4035() {
		return this.field2367.length; // L: 37
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Ldp;",
		garbageValue = "-512618215"
	)
	class115 method4024(int var1) {
		return var1 >= this.method4035() ? null : this.field2367[var1]; // L: 41 42 44
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldp;",
		garbageValue = "23"
	)
	class115[] method4025() {
		return this.field2367; // L: 48
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldk;II)V",
		garbageValue = "371412856"
	)
	void method4030(class122 var1, int var2) {
		this.method4027(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I[ZZI)V",
		garbageValue = "-1345649439"
	)
	void method4027(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2753(); // L: 56
		int var6 = 0; // L: 57
		class115[] var7 = this.method4025(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class115 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method2740(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70
}
