import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -853527651
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -277541407
	)
	@Export("size")
	int size;
	@ObfuscatedName("af")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("aj")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("aq")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ar")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ag")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ao")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIB)V",
		garbageValue = "-45"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 111
		Script var4;
		if (Huffman.isWorldMapEvent(var0.type)) { // L: 113
			Interpreter.worldMapEvent = (WorldMapEvent)var3[0]; // L: 114
			WorldMapElement var6 = class423.WorldMapElement_get(Interpreter.worldMapEvent.mapElement); // L: 115
			var4 = class518.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 116
		} else {
			int var5 = (Integer)var3[0]; // L: 119
			var4 = Skeleton.getScript(var5); // L: 120
		}

		if (var4 != null) { // L: 122
			WorldMapRegion.method4850(var0, var4, var1, var2); // L: 123
		}

	} // L: 125

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-325706819"
	)
	public static int method736(int var0) {
		return var0 >> 17 & 7; // L: 17
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-14"
	)
	static int method735(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1863
			var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1864
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.itemId; // L: 1865
			return 1; // L: 1866
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1868
			var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1869
			if (var3.itemId != -1) { // L: 1870
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 1871
			}

			return 1; // L: 1872
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1874
			int var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1875
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1876
			if (var4 != null) { // L: 1877
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 1878
			}

			return 1; // L: 1879
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1881
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1882
			return 1; // L: 1883
		} else if (var0 == 2707) { // L: 1885
			var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1886
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.method6762() ? 1 : 0; // L: 1887
			return 1; // L: 1888
		} else if (var0 == 2708) { // L: 1890
			var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1891
			return class132.method3116(var3); // L: 1892
		} else if (var0 == 2709) { // L: 1894
			var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1895
			return BuddyRankComparator.method2997(var3); // L: 1896
		} else {
			return 2; // L: 1898
		}
	}
}
