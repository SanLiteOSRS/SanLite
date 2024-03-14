import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class276 {
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 1841441359
	)
	static int field2914;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 897834757
	)
	int field2913;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -349138361
	)
	int field2917;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1677072599
	)
	int field2919;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -889850773
	)
	int field2916;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1136839583
	)
	int field2915;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1992420421
	)
	int field2918;

	class276(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2913 = var1; // L: 12
		this.field2917 = var2; // L: 13
		this.field2919 = var3; // L: 14
		this.field2916 = var4; // L: 15
		this.field2915 = var5; // L: 16
		this.field2918 = var6; // L: 17
	} // L: 18

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1158457597"
	)
	static char method5618(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1387447217"
	)
	static int method5619(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5131
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5132
			ObjectComposition var4 = class127.getObjectDefinition(var3); // L: 5133
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5134
			return 1; // L: 5135
		} else {
			return 2; // L: 5137
		}
	}
}
