import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class101 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1873768041"
	)
	public static boolean method2640(int var0) {
		return var0 >= WorldMapDecorationType.field3828.id && var0 <= WorldMapDecorationType.field3826.id || var0 == WorldMapDecorationType.field3844.id; // L: 43
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2030205668"
	)
	static void method2641() {
		ByteArrayPool.field4550.clear(); // L: 61
		ByteArrayPool.field4550.add(100); // L: 62
		ByteArrayPool.field4550.add(5000); // L: 63
		ByteArrayPool.field4550.add(10000); // L: 64
		ByteArrayPool.field4550.add(30000); // L: 65
	} // L: 66

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1662859603"
	)
	static int method2642(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5062
			int var5 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 5063
			NPCComposition var6 = class90.getNpcDefinition(var5); // L: 5064
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5065
			return 1; // L: 5066
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5068
				SoundCache.Interpreter_intStackSize -= 2; // L: 5069
				var3 = class90.getNpcDefinition(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]); // L: 5070
				int var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 5071
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.method3695(var4); // L: 5072
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.method3715(var4); // L: 5073
				return 1; // L: 5074
			} else if (var0 == 6765) { // L: 5076
				var3 = class90.getNpcDefinition(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 5077
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5078
				return 1; // L: 5079
			} else {
				return 2; // L: 5081
			}
		}
	}
}
