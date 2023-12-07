import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "384222635"
	)
	static int method5818(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) { // L: 5302
			--class517.Interpreter_intStackSize; // L: 5303
			var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 5304
			var4 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5305
			class422.method7907(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1); // L: 5306
			return 1; // L: 5307
		} else if (var0 == 8001) { // L: 5309
			class517.Interpreter_intStackSize -= 3; // L: 5310
			var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 5311
			var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 5312
			int var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 5313
			int var6 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5314
			if (var6 <= 1) { // L: 5315
				return 1;
			} else {
				class421.method7884(Interpreter.Interpreter_arrays[var3], var6, var4, var5); // L: 5316
				return 1; // L: 5317
			}
		} else {
			return 2; // L: 5319
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1205269572"
	)
	static long method5817() {
		return Client.field698; // L: 2899
	}
}
