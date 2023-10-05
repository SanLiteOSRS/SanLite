import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("md")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ac")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("ak")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ax")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[5000]; // L: 17
		Varps_main = new int[5000]; // L: 18
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "-62"
	)
	static int method6215(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1833
			var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1834
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1835
			return 1; // L: 1836
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1838
			var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1839
			if (var3.itemId != -1) { // L: 1840
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1841
			}

			return 1; // L: 1842
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1844
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1845
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1846
			if (var4 != null) { // L: 1847
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1848
			}

			return 1; // L: 1849
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1851
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1852
			return 1; // L: 1853
		} else if (var0 == 2707) { // L: 1855
			var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1856
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6604() ? 1 : 0; // L: 1857
			return 1; // L: 1858
		} else if (var0 == 2708) { // L: 1860
			var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1861
			return class110.method2752(var3); // L: 1862
		} else if (var0 == 2709) { // L: 1864
			var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1865
			return Canvas.method320(var3); // L: 1866
		} else {
			return 2; // L: 1868
		}
	}
}
