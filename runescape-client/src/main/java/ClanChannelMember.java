import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("m")
	static boolean field1546;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("s")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1801050493
	)
	@Export("world")
	public int world;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-2098117121"
	)
	static int method2819(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1112
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1113
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.x; // L: 1114
			return 1; // L: 1115
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1117
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.y; // L: 1118
			return 1; // L: 1119
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1121
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.width; // L: 1122
			return 1; // L: 1123
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1125
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.height; // L: 1126
			return 1; // L: 1127
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1129
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1130
			return 1; // L: 1131
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1133
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.parentId; // L: 1134
			return 1; // L: 1135
		} else {
			return 2; // L: 1137
		}
	}
}
