import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class211 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	class122[] field2439;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2054841693
	)
	int field2438;

	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V"
	)
	class211(Buffer var1, int var2) {
		this.field2439 = new class122[var2]; // L: 13
		this.field2438 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2439.length; ++var3) { // L: 15
			class122 var4 = new class122(this.field2438, var1, false); // L: 16
			this.field2439[var3] = var4; // L: 17
		}

		this.method4237(); // L: 19
	} // L: 20

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "505065843"
	)
	void method4237() {
		class122[] var1 = this.field2439; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class122 var3 = var1[var2]; // L: 26
			if (var3.field1456 >= 0) { // L: 28
				var3.field1457 = this.field2439[var3.field1456]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "31386"
	)
	public int method4246() {
		return this.field2439.length; // L: 37
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ldi;",
		garbageValue = "1973675924"
	)
	class122 method4244(int var1) {
		return var1 >= this.method4246() ? null : this.field2439[var1]; // L: 41 42 44
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldi;",
		garbageValue = "-2063563387"
	)
	class122[] method4252() {
		return this.field2439; // L: 48
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IB)V",
		garbageValue = "-29"
	)
	void method4241(class129 var1, int var2) {
		this.method4242(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ldh;I[ZZI)V",
		garbageValue = "-1278403491"
	)
	void method4242(class129 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2923(); // L: 56
		int var6 = 0; // L: 57
		class122[] var7 = this.method4252(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class122 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method2940(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CLmo;S)C",
		garbageValue = "8635"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 130
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}
}
