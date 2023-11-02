import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ri")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1329468643
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 885089111
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2134171205
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "717087406"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-83"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-410640416"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "682390818"
	)
	static int method8164(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2824
			Interpreter.Interpreter_intStackSize -= 2; // L: 2825
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2826
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2827
			EnumComposition var10 = class73.getEnum(var3); // L: 2828
			if (var10.outputType != 's') { // L: 2829
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2830
				if (var9 == var10.keys[var6]) { // L: 2831
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2832
					var10 = null; // L: 2833
					break;
				}
			}

			if (var10 != null) { // L: 2837
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2838
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2840
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2866
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2867
				EnumComposition var4 = class73.getEnum(var3); // L: 2868
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2869
				return 1; // L: 2870
			} else {
				return 2; // L: 2872
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2841
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2842
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2843
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2844
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2845
			EnumComposition var7 = class73.getEnum(var5); // L: 2846
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2847
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2852
					if (var6 == var7.keys[var8]) { // L: 2853
						if (var9 == 115) { // L: 2854
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2855
						}

						var7 = null; // L: 2856
						break;
					}
				}

				if (var7 != null) { // L: 2860
					if (var9 == 115) { // L: 2861
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2862
					}
				}

				return 1; // L: 2864
			} else {
				if (var9 == 115) { // L: 2848
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2849
				}

				return 1; // L: 2850
			}
		}
	}
}
