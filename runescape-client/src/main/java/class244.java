import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jn")
public class class244 {
	@ObfuscatedName("bb")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;

	@ObfuscatedName("an")
	public static String method5045(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (0L == var0 % 37L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (var0 != 0L) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class373.base37Table[(int)(var6 - 37L * var0)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "6390717"
	)
	static int method5043(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1322
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1323
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1324
			return 1; // L: 1325
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1327
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1328
			return 1; // L: 1329
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1331
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1332
			return 1; // L: 1333
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1335
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1336
			return 1; // L: 1337
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1339
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1340
			return 1; // L: 1341
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1343
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1344
			return 1; // L: 1345
		} else {
			return 2; // L: 1347
		}
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1315268736"
	)
	static void method5044(int var0) {
		Client.oculusOrbState = var0; // L: 12174
	} // L: 12175
}
