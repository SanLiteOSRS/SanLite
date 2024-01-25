import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class400 {
	@ObfuscatedName("am")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-22"
	)
	static int method7497(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5131
			int var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5132
			ObjectComposition var4 = class137.getObjectDefinition(var3); // L: 5133
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5134
			return 1; // L: 5135
		} else {
			return 2; // L: 5137
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZS)I",
		garbageValue = "3159"
	)
	static int method7498(int var0, Script var1, boolean var2) {
		return 2; // L: 5145
	}
}
