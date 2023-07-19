import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
public enum class139 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1618(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1626(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1617(2, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1615(3, 3),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1616(4, 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1612(5, 5),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1613(6, 6),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1619(7, 7),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1620(8, 8);

	@ObfuscatedName("ak")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1474518341
	)
	final int field1621;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -330009133
	)
	final int field1622;

	class139(int var3, int var4) {
		this.field1621 = var3; // L: 107
		this.field1622 = var4; // L: 108
	} // L: 109

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1622; // L: 112
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "6"
	)
	public static int method3174(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 41
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 42
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 43
		var0 += var0 >>> 8; // L: 44
		var0 += var0 >>> 16; // L: 45
		return var0 & 255; // L: 46
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "0"
	)
	static int method3170(int var0, Script var1, boolean var2) {
		Widget var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1633
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1634
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1635
			return 1; // L: 1636
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1638
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1639
			return 1; // L: 1640
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1642
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1643
			return 1; // L: 1644
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1646
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1647
			return 1; // L: 1648
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1650
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1651
			return 1; // L: 1652
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1654
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1655
			return 1; // L: 1656
		} else {
			return 2; // L: 1658
		}
	}
}
