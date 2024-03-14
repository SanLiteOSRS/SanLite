import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jp")
public class class257 {
	@ObfuscatedName("sh")
	static boolean field2665;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)Ldc;",
		garbageValue = "-24"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 89
		Buffer var2 = new Buffer(var0); // L: 90
		var2.offset = var2.array.length - 2; // L: 91
		int var3 = var2.readUnsignedShort(); // L: 92
		int var4 = var2.array.length - 2 - var3 - 12; // L: 93
		var2.offset = var4; // L: 94
		int var5 = var2.readInt(); // L: 95
		var1.localIntCount = var2.readUnsignedShort(); // L: 96
		var1.localStringCount = var2.readUnsignedShort(); // L: 97
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 98
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 99
		int var6 = var2.readUnsignedByte(); // L: 100
		int var7;
		int var8;
		if (var6 > 0) { // L: 101
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 102

			for (var7 = 0; var7 < var6; ++var7) { // L: 103
				var8 = var2.readUnsignedShort(); // L: 104
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class318.method6083(var8) : 1); // L: 105
				var1.switches[var7] = var9; // L: 106

				while (var8-- > 0) { // L: 107
					int var10 = var2.readInt(); // L: 108
					int var11 = var2.readInt(); // L: 109
					var9.put(new IntegerNode(var11), (long)var10); // L: 110
				}
			}
		}

		var2.offset = 0; // L: 114
		var1.field1028 = var2.readStringCp1252NullTerminatedOrNull(); // L: 115
		var1.opcodes = new int[var5]; // L: 116
		var1.intOperands = new int[var5]; // L: 117
		var1.stringOperands = new String[var5]; // L: 118

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 119 120 125
			var8 = var2.readUnsignedShort(); // L: 121
			if (var8 == 3) { // L: 122
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 123
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 124
			}
		}

		return var1; // L: 127
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	public static void method5048() {
		EnumComposition.EnumDefinition_cached.clear(); // L: 77
	} // L: 78

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "61129757"
	)
	static int method5057(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2859
			Interpreter.Interpreter_intStackSize -= 2; // L: 2860
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2861
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2862
			EnumComposition var10 = ItemContainer.getEnum(var3); // L: 2863
			if (var10.outputType != 's') { // L: 2864
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2865
				if (var9 == var10.keys[var6]) { // L: 2866
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2867
					var10 = null; // L: 2868
					break;
				}
			}

			if (var10 != null) { // L: 2872
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2873
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2875
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2901
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2902
				EnumComposition var4 = ItemContainer.getEnum(var3); // L: 2903
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2904
				return 1; // L: 2905
			} else {
				return 2; // L: 2907
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2876
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2877
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2878
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2879
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2880
			EnumComposition var7 = ItemContainer.getEnum(var5); // L: 2881
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2882
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2887
					if (var6 == var7.keys[var8]) { // L: 2888
						if (var9 == 115) { // L: 2889
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2890
						}

						var7 = null; // L: 2891
						break;
					}
				}

				if (var7 != null) { // L: 2895
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.defaultStr; // L: 2896
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2897
					}
				}

				return 1; // L: 2899
			} else {
				if (var9 == 115) { // L: 2883
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2884
				}

				return 1; // L: 2885
			}
		}
	}
}
