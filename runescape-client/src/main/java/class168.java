import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gf")
public class class168 extends class144 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static AbstractArchive field1789;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1215152565
	)
	int field1788;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -918176384341230821L
	)
	long field1786;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class168(class147 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1788 = var1.readInt(); // L: 310
		this.field1786 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3330(this.field1788, this.field1786); // L: 315
	} // L: 316

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-89"
	)
	static int method3514(int var0, Script var1, boolean var2) {
		Widget var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1646
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1647
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.x; // L: 1648
			return 1; // L: 1649
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1651
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.y; // L: 1652
			return 1; // L: 1653
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1655
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.width; // L: 1656
			return 1; // L: 1657
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1659
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.height; // L: 1660
			return 1; // L: 1661
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1663
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1664
			return 1; // L: 1665
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1667
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.parentId; // L: 1668
			return 1; // L: 1669
		} else {
			return 2; // L: 1671
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(II)Lte;",
		garbageValue = "-847126653"
	)
	static class518 method3513(int var0) {
		class518 var1 = (class518)Client.Widget_cachedModels.get((long)var0); // L: 12953
		if (var1 == null) { // L: 12954
			var1 = new class518(class267.field2778, SequenceDefinition.method4092(var0), class306.method5916(var0)); // L: 12955
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12956
		}

		return var1; // L: 12958
	}
}
