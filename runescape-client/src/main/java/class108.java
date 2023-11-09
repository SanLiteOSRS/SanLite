import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eg")
public class class108 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1384;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1388;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1379;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1378;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1375;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1380;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1376;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1382;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1383;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1377;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1385;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1386;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1381;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1391;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1389;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static final class108 field1390;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static GraphicsDefaults field1392;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 922023367
	)
	static int field1394;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 532865867
	)
	int field1387;

	static {
		field1384 = new class108(0); // L: 2202
		field1388 = new class108(1); // L: 2203
		field1379 = new class108(2); // L: 2204
		field1378 = new class108(3); // L: 2205
		field1375 = new class108(4); // L: 2206
		field1380 = new class108(5); // L: 2207
		field1376 = new class108(6); // L: 2208
		field1382 = new class108(7); // L: 2209
		field1383 = new class108(8); // L: 2210
		field1377 = new class108(9); // L: 2211
		field1385 = new class108(10); // L: 2212
		field1386 = new class108(11); // L: 2213
		field1381 = new class108(12); // L: 2214
		field1391 = new class108(13); // L: 2215
		field1389 = new class108(14); // L: 2216
		field1390 = new class108(15); // L: 2217
	}

	class108(int var1) {
		this.field1387 = var1; // L: 2221
	} // L: 2222

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "104"
	)
	public static boolean method2773() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 28
		return var0 != null; // L: 29
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "-1167308007"
	)
	static int method2772(int var0, Script var1, boolean var2) {
		Widget var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1858
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1859
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator4.Widget_unpackTargetMask(class19.getWidgetFlags(var3)); // L: 1860
			return 1; // L: 1861
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1863
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1870
				if (var3.dataText == null) { // L: 1871
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1872
				}

				return 1; // L: 1873
			} else {
				return 2; // L: 1875
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1864
			--var4; // L: 1865
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1866
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1867
			} else {
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1868
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lme;B)Ljava/lang/String;",
		garbageValue = "104"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (UserComparator4.Widget_unpackTargetMask(class19.getWidgetFlags(var0)) == 0) { // L: 12701
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12702 12703 12705
		}
	}
}
