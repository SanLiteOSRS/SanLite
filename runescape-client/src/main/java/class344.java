import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class344 {
	@ObfuscatedName("ay")
	static int[][][] field3814;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("th")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-1554381486"
	)
	public static int method6807(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 9
		int var4 = var1; // L: 10

		for (int var5 = 0; var5 < var3; ++var5) { // L: 11
			char var6 = var2.charAt(var5); // L: 12
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6; // L: 14
			} else if (var6 <= 2047) { // L: 16
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 17
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 18
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 21
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 22
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 23
			}
		}

		return var4 - var1; // L: 26
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "2094869525"
	)
	static int method6808(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5077
			int var5 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5078
			NPCComposition var6 = VerticalAlignment.getNpcDefinition(var5); // L: 5079
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5080
			return 1; // L: 5081
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5083
				class517.Interpreter_intStackSize -= 2; // L: 5084
				var3 = VerticalAlignment.getNpcDefinition(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]); // L: 5085
				int var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 5086
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.method3704(var4); // L: 5087
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.method3706(var4); // L: 5088
				return 1; // L: 5089
			} else if (var0 == 6765) { // L: 5091
				var3 = VerticalAlignment.getNpcDefinition(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 5092
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5093
				return 1; // L: 5094
			} else {
				return 2; // L: 5096
			}
		}
	}
}
