import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class244 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "44"
	)
	static int method4727(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}
}
