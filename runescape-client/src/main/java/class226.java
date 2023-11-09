import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class226 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lej;"
	)
	class126[] field2525;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 689071777
	)
	int field2526;

	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V"
	)
	class226(Buffer var1, int var2) {
		this.field2525 = new class126[var2]; // L: 13
		this.field2526 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2525.length; ++var3) { // L: 15
			class126 var4 = new class126(this.field2526, var1, false); // L: 16
			this.field2525[var3] = var4; // L: 17
		}

		this.method4461(); // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	void method4461() {
		class126[] var1 = this.field2525; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class126 var3 = var1[var2]; // L: 26
			if (var3.field1477 >= 0) { // L: 28
				var3.field1470 = this.field2525[var3.field1477]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-281613956"
	)
	public int method4451() {
		return this.field2525.length;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lej;",
		garbageValue = "799064744"
	)
	class126 method4454(int var1) {
		return var1 >= this.method4451() ? null : this.field2525[var1]; // L: 41 42 44
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)[Lej;",
		garbageValue = "1"
	)
	class126[] method4455() {
		return this.field2525; // L: 48
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfz;II)V",
		garbageValue = "811903964"
	)
	void method4456(class136 var1, int var2) {
		this.method4457(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I[ZZB)V",
		garbageValue = "85"
	)
	void method4457(class136 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3052(); // L: 56
		int var6 = 0; // L: 57
		class126[] var7 = this.method4455(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class126 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method3054(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-1027589386"
	)
	public static int method4468(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 30
			int var6 = var3; // L: 31
			var3 = var4; // L: 32
			var4 = var6; // L: 33
		}

		var2 &= 3; // L: 35
		if (var2 == 0) { // L: 36
			return var1;
		} else if (var2 == 1) { // L: 37
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 38
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "829570658"
	)
	public static int method4452(CharSequence var0) {
		int var1 = var0.length(); // L: 143
		int var2 = 0; // L: 144

		for (int var3 = 0; var3 < var1; ++var3) { // L: 145
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 146
	}
}
