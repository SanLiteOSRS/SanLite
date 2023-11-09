import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1334775007
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 789838571
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1941832671
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1346770491
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1307666727
	)
	int field872;
	@ObfuscatedName("ax")
	String field873;
	@ObfuscatedName("al")
	String field868;

	MenuAction() {
	} // L: 12713

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "11"
	)
	static int method2050(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4305
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = DecorativeObject.getWindowedMode(); // L: 4306
			return 1; // L: 4307
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4309
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4310
				if (var3 == 1 || var3 == 2) { // L: 4311
					class157.setWindowedMode(var3);
				}

				return 1; // L: 4312
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4314
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = WorldMapManager.clientPreferences.method2469(); // L: 4315
				return 1; // L: 4316
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4318
				if (var0 == 5310) { // L: 4325
					--class336.Interpreter_intStackSize; // L: 4326
					return 1; // L: 4327
				} else {
					return 2; // L: 4329
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4319
				if (var3 == 1 || var3 == 2) { // L: 4320
					WorldMapManager.clientPreferences.method2452(var3); // L: 4321
				}

				return 1; // L: 4323
			}
		}
	}
}
