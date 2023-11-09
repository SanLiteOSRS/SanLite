import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hm")
public class class190 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	static ClanChannel field1975;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-2021767145"
	)
	static int method3642(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1326
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1327
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.x; // L: 1328
			return 1; // L: 1329
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1331
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.y; // L: 1332
			return 1; // L: 1333
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1335
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.width; // L: 1336
			return 1; // L: 1337
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1339
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.height; // L: 1340
			return 1; // L: 1341
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1343
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1344
			return 1; // L: 1345
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1347
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.parentId; // L: 1348
			return 1; // L: 1349
		} else {
			return 2; // L: 1351
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	static void method3639() {
		if (Client.field503) { // L: 4858
			class218.addPlayerToScene(HitSplatDefinition.localPlayer, false); // L: 4859
		}

	} // L: 4861
}
