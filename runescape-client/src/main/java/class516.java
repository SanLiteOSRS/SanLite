import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ti")
public class class516 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -111790981
	)
	public static int field5128;

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "93892540"
	)
	static int method9559(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2771
			class336.Interpreter_intStackSize -= 2; // L: 2772
			var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 2773
			var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2774
			EnumComposition var10 = FloorOverlayDefinition.getEnum(var3); // L: 2775
			if (var10.outputType != 's') { // L: 2776
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2777
				if (var9 == var10.keys[var6]) { // L: 2778
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2779
					var10 = null; // L: 2780
					break;
				}
			}

			if (var10 != null) { // L: 2784
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2785
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2787
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2813
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2814
				EnumComposition var4 = FloorOverlayDefinition.getEnum(var3); // L: 2815
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.size(); // L: 2816
				return 1; // L: 2817
			} else {
				return 2; // L: 2819
			}
		} else {
			class336.Interpreter_intStackSize -= 4; // L: 2788
			var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 2789
			var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2790
			int var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 2791
			var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3]; // L: 2792
			EnumComposition var7 = FloorOverlayDefinition.getEnum(var5); // L: 2793
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2794
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2799
					if (var6 == var7.keys[var8]) { // L: 2800
						if (var9 == 115) { // L: 2801
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2802
						}

						var7 = null; // L: 2803
						break;
					}
				}

				if (var7 != null) { // L: 2807
					if (var9 == 115) { // L: 2808
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2809
					}
				}

				return 1; // L: 2811
			} else {
				if (var9 == 115) { // L: 2795
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2796
				}

				return 1; // L: 2797
			}
		}
	}
}
