import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class121 {
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("x")
	public static final float field1454;
	@ObfuscatedName("h")
	public static final float field1452;

	static {
		field1454 = Math.ulp(1.0F); // L: 10
		field1452 = 2.0F * field1454; // L: 11
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-111"
	)
	static int method2823(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 4884
			int var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4885
			ObjectComposition var4 = InterfaceParent.getObjectDefinition(var3); // L: 4886
			Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4887
			return 1; // L: 4888
		} else {
			return 2; // L: 4890
		}
	}
}
