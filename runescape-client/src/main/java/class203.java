import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gi")
public class class203 {
	@ObfuscatedName("c")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("x")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 716158957
	)
	public static int field2291;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1550515171
	)
	public static int field2294;
	@ObfuscatedName("d")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("n")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("Ignored_cached")
	static class448 Ignored_cached;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lge;",
		garbageValue = "-1505137813"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 21
			var1 = new StructComposition(); // L: 22
			if (var2 != null) { // L: 23
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 24
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-2022954984"
	)
	static int method4052(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1498
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1499
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemId; // L: 1500
			return 1; // L: 1501
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1503
			if (var3.itemId != -1) { // L: 1504
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 1505
			}

			return 1; // L: 1506
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1508
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1509
			return 1; // L: 1510
		} else if (var0 == 1707) { // L: 1512
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.method6075() ? 1 : 0; // L: 1513
			return 1; // L: 1514
		} else if (var0 == 1708) { // L: 1516
			return class409.method7736(var3); // L: 1517
		} else {
			return var0 == 1709 ? class129.method2946(var3) : 2; // L: 1519 1520 1522
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Ljava/lang/Object;",
		garbageValue = "-54"
	)
	static Object method4050(class453 var0) {
		if (var0 == null) { // L: 5110
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5111
		} else {
			switch(var0.field4831) { // L: 5113
			case 0:
				return Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 5115
			case 1:
				return Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 5117
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5119
			}
		}
	}
}
