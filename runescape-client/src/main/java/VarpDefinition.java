import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -774409533
	)
	public static int field1811;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 894414077
	)
	static int field1813;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1739289855
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "1033626215"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IB)V",
		garbageValue = "-67"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1994115349"
	)
	public static void method3352() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 85
	} // L: 86

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "1253760177"
	)
	static int method3351(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1111
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1112
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.x; // L: 1113
			return 1; // L: 1114
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1116
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.y; // L: 1117
			return 1; // L: 1118
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1120
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.width; // L: 1121
			return 1; // L: 1122
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1124
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.height; // L: 1125
			return 1; // L: 1126
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1128
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1129
			return 1; // L: 1130
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1132
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.parentId; // L: 1133
			return 1; // L: 1134
		} else {
			return 2; // L: 1136
		}
	}
}
