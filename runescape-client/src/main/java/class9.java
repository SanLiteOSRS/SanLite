import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
public class class9 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	public static final class9 field28;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	public static final class9 field26;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	static final class9 field27;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	static final class9 field33;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	static final class9 field34;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	static Bounds field35;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1320722447
	)
	int field30;
	@ObfuscatedName("aa")
	String field31;
	@ObfuscatedName("az")
	boolean field32;
	@ObfuscatedName("ao")
	boolean field25;

	static {
		field28 = new class9(0, "POST", true, true); // L: 6
		field26 = new class9(1, "GET", true, false); // L: 7
		field27 = new class9(2, "PUT", false, true); // L: 8
		field33 = new class9(3, "PATCH", false, true); // L: 9
		field34 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field30 = var1; // L: 17
		this.field31 = var2; // L: 18
		this.field32 = var3; // L: 19
		this.field25 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field30; // L: 37
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-236928179"
	)
	boolean method63() {
		return this.field32; // L: 24
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "997211650"
	)
	public String method64() {
		return this.field31; // L: 28
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "93"
	)
	boolean method68() {
		return this.field25; // L: 32
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfr;B)V",
		garbageValue = "34"
	)
	static void method67(float var0, float var1, float var2, float var3, class132 var4) {
		float var5 = var1 - var0; // L: 332
		float var6 = var2 - var1; // L: 333
		float var7 = var3 - var2; // L: 334
		float var8 = var6 - var5; // L: 335
		var4.field1566 = var7 - var6 - var8; // L: 336
		var4.field1562 = var8 + var8 + var8; // L: 337
		var4.field1564 = var5 + var5 + var5; // L: 338
		var4.field1563 = var0; // L: 339
	} // L: 340

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1822218626"
	)
	static int method83(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1613
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1614
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var3)); // L: 1615
			return 1; // L: 1616
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1618
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1625
				if (var3.dataText == null) { // L: 1626
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1627
				}

				return 1; // L: 1628
			} else {
				return 2; // L: 1630
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1619
			--var4; // L: 1620
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1621
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1622
			} else {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1623
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-259088192"
	)
	static int method82(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1902
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1903
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var3)); // L: 1904
			return 1; // L: 1905
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1907
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1914
				if (var3.dataText == null) { // L: 1915
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1916
				}

				return 1; // L: 1917
			} else {
				return 2; // L: 1919
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1908
			--var4; // L: 1909
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1910
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1911
			} else {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1912
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2111193111"
	)
	static final void method80() {
		FriendLoginUpdate.method8302(); // L: 3134
	} // L: 3135
}
