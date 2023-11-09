import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ip")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("ItemComposition_fontPlain11")
	static Font ItemComposition_fontPlain11;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1530728791
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1307574272
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 751258427
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 2356774916473464461L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1900783163
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "116"
	)
	static int method4387(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2810
			Interpreter.Interpreter_intStackSize -= 2; // L: 2811
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2812
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2813
			EnumComposition var10 = class371.getEnum(var3); // L: 2814
			if (var10.outputType != 's') { // L: 2815
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2816
				if (var9 == var10.keys[var6]) { // L: 2817
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2818
					var10 = null; // L: 2819
					break;
				}
			}

			if (var10 != null) { // L: 2823
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2824
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2826
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2852
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2853
				EnumComposition var4 = class371.getEnum(var3); // L: 2854
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2855
				return 1; // L: 2856
			} else {
				return 2; // L: 2858
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2827
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2828
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2829
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2830
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2831
			EnumComposition var7 = class371.getEnum(var5); // L: 2832
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2833
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2838
					if (var6 == var7.keys[var8]) { // L: 2839
						if (var9 == 115) { // L: 2840
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2841
						}

						var7 = null; // L: 2842
						break;
					}
				}

				if (var7 != null) { // L: 2846
					if (var9 == 115) { // L: 2847
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2848
					}
				}

				return 1; // L: 2850
			} else {
				if (var9 == 115) { // L: 2834
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2835
				}

				return 1; // L: 2836
			}
		}
	}
}
