import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class102 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1665815423
	)
	int field1330;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2120391721
	)
	int field1332;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2010984175
	)
	int field1331;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1089250169
	)
	int field1333;

	class102(int var1, int var2, int var3, int var4) {
		this.field1330 = var1; // L: 10
		this.field1332 = var2; // L: 11
		this.field1331 = var3; // L: 12
		this.field1333 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	int method2645() {
		return this.field1330; // L: 17
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1646176996"
	)
	int method2646() {
		return this.field1332; // L: 21
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "257607839"
	)
	int method2647() {
		return this.field1331; // L: 25
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1314819947"
	)
	int method2649() {
		return this.field1333; // L: 29
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "2066839976"
	)
	public static void method2657(class312 var0) {
		if (!class306.field3400.contains(var0)) { // L: 37
			class306.field3400.add(var0); // L: 38
		}

	} // L: 40

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CLot;B)C",
		garbageValue = "-1"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 82
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "2"
	)
	static Object method2648(int var0) {
		return class144.method3147((class503)ClientPreferences.findEnumerated(class503.method8943(), var0)); // L: 5322
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)Lsq;",
		garbageValue = "293868513"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class127.worldMap; // L: 736
	}
}
