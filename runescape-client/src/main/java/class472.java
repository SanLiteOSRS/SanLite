import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sp")
public class class472 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -495003536
	)
	public static int field4892;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2053792151
	)
	static int field4889;
	@ObfuscatedName("az")
	float[] field4891;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 47852205
	)
	int field4890;

	class472(float[] var1, int var2) {
		this.field4891 = var1; // L: 10
		this.field4890 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "16383"
	)
	static int method8485(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1865
			var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1866
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.itemId; // L: 1867
			return 1; // L: 1868
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1870
			var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1871
			if (var3.itemId != -1) { // L: 1872
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 1873
			}

			return 1; // L: 1874
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1876
			int var5 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1877
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1878
			if (var4 != null) { // L: 1879
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 1880
			}

			return 1; // L: 1881
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1883
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1884
			return 1; // L: 1885
		} else if (var0 == 2707) { // L: 1887
			var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1888
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.method6697() ? 1 : 0; // L: 1889
			return 1; // L: 1890
		} else if (var0 == 2708) { // L: 1892
			var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1893
			return PcmPlayer.method752(var3); // L: 1894
		} else if (var0 == 2709) { // L: 1896
			var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1897
			return SpriteMask.method6247(var3); // L: 1898
		} else {
			return 2; // L: 1900
		}
	}
}
