import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
public class class109 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1410;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1417;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1400;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1401;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1412;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1403;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1416;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1405;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1404;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1407;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1408;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1409;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1406;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1411;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1398;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1413;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1922134931
	)
	int field1414;

	static {
		field1410 = new class109(0); // L: 2023
		field1417 = new class109(1); // L: 2024
		field1400 = new class109(2); // L: 2025
		field1401 = new class109(3); // L: 2026
		field1412 = new class109(4); // L: 2027
		field1403 = new class109(5); // L: 2028
		field1416 = new class109(6); // L: 2029
		field1405 = new class109(7); // L: 2030
		field1404 = new class109(8); // L: 2031
		field1407 = new class109(9); // L: 2032
		field1408 = new class109(10); // L: 2033
		field1409 = new class109(11); // L: 2034
		field1406 = new class109(12); // L: 2035
		field1411 = new class109(13); // L: 2036
		field1398 = new class109(14); // L: 2037
		field1413 = new class109(15); // L: 2038
	}

	class109(int var1) {
		this.field1414 = var1; // L: 2042
	} // L: 2043

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "607576261"
	)
	static int method2718(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 575
		Widget var4;
		if (var0 >= 2000) { // L: 577
			var0 -= 1000; // L: 578
			var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 579
			var4 = class243.field2620.method6281(var3); // L: 580
		} else {
			var4 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 582
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 583
			class19.Interpreter_intStackSize -= 4; // L: 584
			var4.rawX = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 585
			var4.rawY = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 586
			var4.xAlignment = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 587
			var4.yAlignment = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 588
			WorldMapData_0.invalidateWidget(var4); // L: 589
			UrlRequest.client.alignWidget(var4); // L: 590
			if (var3 != -1 && var4.type == 0) { // L: 591
				IsaacCipher.revalidateWidgetScroll(class243.field2620.field3645[var3 >> 16], var4, false);
			}

			return 1; // L: 592
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 594
			class19.Interpreter_intStackSize -= 4; // L: 595
			var4.rawWidth = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 596
			var4.rawHeight = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 597
			var4.widthAlignment = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 598
			var4.heightAlignment = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 599
			WorldMapData_0.invalidateWidget(var4); // L: 600
			UrlRequest.client.alignWidget(var4); // L: 601
			if (var3 != -1 && var4.type == 0) { // L: 602
				IsaacCipher.revalidateWidgetScroll(class243.field2620.field3645[var3 >> 16], var4, false);
			}

			return 1; // L: 603
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 605
			boolean var5 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 606
			if (var5 != var4.isHidden) { // L: 607
				var4.isHidden = var5; // L: 608
				WorldMapData_0.invalidateWidget(var4); // L: 609
			}

			return 1; // L: 611
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 613
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 614
			return 1; // L: 615
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 617
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 618
			return 1; // L: 619
		} else {
			return 2; // L: 621
		}
	}
}
