import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ft")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("at")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 55866297
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1206628329"
	)
	static int method3248(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1340
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1341
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.x; // L: 1342
			return 1; // L: 1343
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1345
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.y; // L: 1346
			return 1; // L: 1347
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1349
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.width; // L: 1350
			return 1; // L: 1351
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1353
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.height; // L: 1354
			return 1; // L: 1355
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1357
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1358
			return 1; // L: 1359
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1361
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.parentId; // L: 1362
			return 1; // L: 1363
		} else {
			return 2; // L: 1365
		}
	}
}
