import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ty")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("ab")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1244687277"
	)
	public static void method8922() {
		FloorUnderlayDefinition.field2191.clear(); // L: 82
	} // L: 83

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "17987"
	)
	static int method8923(int var0, Script var1, boolean var2) {
		Widget var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1904
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1905
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class342.Widget_unpackTargetMask(class33.getWidgetFlags(var3)); // L: 1906
			return 1; // L: 1907
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1909
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1916
				if (var3.dataText == null) { // L: 1917
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1918
				}

				return 1; // L: 1919
			} else {
				return 2; // L: 1921
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1910
			--var4; // L: 1911
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1912
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1913
			} else {
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1914
		}
	}
}
