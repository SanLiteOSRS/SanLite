import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class413 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	class409 field4551;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1839239665
	)
	int field4553;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1840423911
	)
	int field4552;

	@ObfuscatedSignature(
		descriptor = "(Lpp;II)V"
	)
	class413(class409 var1, int var2, int var3) {
		this.field4553 = 0; // L: 7
		this.field4552 = 0; // L: 8
		this.field4551 = var1; // L: 11
		this.field4553 = var2; // L: 12
		this.field4552 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1895014245"
	)
	public String method7720() {
		if (this.method7707()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7709()); // L: 18

			for (int var2 = this.field4553; var2 < this.field4552; ++var2) { // L: 19
				class411 var3 = this.field4551.method7463(var2); // L: 20
				var1.append(var3.field4523); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-819207986"
	)
	boolean method7706(int var1) {
		return this.field4551.method7494() == 2 || this.field4551.method7494() == 1 && (!this.field4551.field4514 || this.field4552 - 1 != var1); // L: 27
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	public boolean method7707() {
		return this.field4552 == this.field4553; // L: 31
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	public int method7709() {
		return this.field4552 - this.field4553; // L: 35
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)Z",
		garbageValue = "4"
	)
	boolean method7723(class411 var1) {
		if (this.field4551.field4518 == 2) { // L: 39
			return true;
		} else if (this.field4551.field4518 == 0) { // L: 40
			return false;
		} else {
			return this.field4551.method7602() != var1; // L: 41
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1508488797"
	)
	int method7721() {
		if (this.method7707()) { // L: 46
			return 0;
		} else {
			class411 var1 = this.field4551.method7463(this.field4552 - 1); // L: 47
			if (var1.field4523 == '\n') { // L: 48
				return 0;
			} else if (this.method7723(var1)) {
				return this.field4551.field4506.advances[42]; // L: 49
			} else {
				int var2 = this.field4551.field4506.advances[var1.field4523]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4523 == '\t' ? this.field4551.field4506.advances[32] * 3 : this.field4551.field4506.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "-1209602899"
	)
	public class500 method7711() {
		if (this.method7707()) { // L: 65
			return new class500(0, 0); // L: 66
		} else {
			class411 var1 = this.field4551.method7463(this.field4552 - 1); // L: 68
			return new class500(var1.field4524 + this.method7721(), var1.field4525); // L: 69
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpe;",
		garbageValue = "-52"
	)
	public class411 method7712(int var1) {
		return var1 >= 0 && var1 < this.method7709() ? this.field4551.method7463(this.field4553 + var1) : null; // L: 73 74
	}
}
