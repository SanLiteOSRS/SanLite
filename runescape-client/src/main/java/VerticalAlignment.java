import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2004(0, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2006(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 371572089
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2107776905
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "946766288"
	)
	static int method3786(int var0, Script var1, boolean var2) {
		Widget var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1902
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1903
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class155.Widget_unpackTargetMask(class405.getWidgetFlags(var3)); // L: 1904
			return 1; // L: 1905
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1907
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1914
				if (var3.dataText == null) { // L: 1915
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1916
				}

				return 1; // L: 1917
			} else {
				return 2; // L: 1919
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1908
			--var4; // L: 1909
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1910
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1911
			} else {
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1912
		}
	}
}
