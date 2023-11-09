import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mi")
public class class319 {
	@ObfuscatedName("ea")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "-20"
	)
	public static int method6300(CharSequence var0, int var1) {
		return class146.method3156(var0, var1, true); // L: 72
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "-127"
	)
	static int method6301(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1301
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1302
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1306
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1310
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1314
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1318
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1319
			return 1; // L: 1320
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1322
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1323
			return 1; // L: 1324
		} else {
			return 2; // L: 1326
		}
	}
}
