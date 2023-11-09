import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class321 {
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "100"
	)
	static int method5912(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2341
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2342
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = VarbitComposition.method3501(var3) ? 1 : 0; // L: 2343
			return 1; // L: 2344
		} else if (var0 == 3501) { // L: 2346
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2347
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class301.method5664(var3) ? 1 : 0; // L: 2348
			return 1; // L: 2349
		} else if (var0 == 3502) { // L: 2351
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2352
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class78.method2054(var3) ? 1 : 0; // L: 2353
			return 1; // L: 2354
		} else {
			return 2; // L: 2356
		}
	}
}
