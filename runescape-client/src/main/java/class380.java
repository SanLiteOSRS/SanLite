import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ow")
public class class380 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 410499641
	)
	int field4423;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class380(int var1, boolean var2) {
		this.field4423 = var1; // L: 7
	} // L: 8

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "930785393"
	)
	public int method7396() {
		return this.field4423; // L: 11
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-1650461177"
	)
	static int method7398(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2767
			Interpreter.Interpreter_intStackSize -= 2; // L: 2768
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2769
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2770
			EnumComposition var10 = class148.getEnum(var3); // L: 2771
			if (var10.outputType != 's') { // L: 2772
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2773
				if (var9 == var10.keys[var6]) { // L: 2774
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2775
					var10 = null; // L: 2776
					break;
				}
			}

			if (var10 != null) { // L: 2780
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2781
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2783
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2809
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2810
				EnumComposition var4 = class148.getEnum(var3); // L: 2811
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2812
				return 1; // L: 2813
			} else {
				return 2; // L: 2815
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2784
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2785
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2786
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2787
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2788
			EnumComposition var7 = class148.getEnum(var5); // L: 2789
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2790
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2795
					if (var6 == var7.keys[var8]) { // L: 2796
						if (var9 == 115) { // L: 2797
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2798
						}

						var7 = null; // L: 2799
						break;
					}
				}

				if (var7 != null) { // L: 2803
					if (var9 == 115) { // L: 2804
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2805
					}
				}

				return 1; // L: 2807
			} else {
				if (var9 == 115) { // L: 2791
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2792
				}

				return 1; // L: 2793
			}
		}
	}
}
