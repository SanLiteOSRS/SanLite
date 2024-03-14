import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nk")
public enum class357 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3903(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3902(1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3905(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3907(3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3904(4);

	@ObfuscatedName("gn")
	static String field3901;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2018279927
	)
	final int field3906;

	class357(int var3) {
		this.field3906 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3906; // L: 19
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1942157821"
	)
	static int method6983(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 574
		Widget var4;
		if (var0 >= 2000) { // L: 576
			var0 -= 1000; // L: 577
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 578
			var4 = ArchiveLoader.field1070.method6431(var3); // L: 579
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 581
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 582
			Interpreter.Interpreter_intStackSize -= 4; // L: 583
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 584
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 585
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 586
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 587
			UserComparator5.invalidateWidget(var4); // L: 588
			class193.client.alignWidget(var4); // L: 589
			if (var3 != -1 && var4.type == 0) { // L: 590
				class167.revalidateWidgetScroll(ArchiveLoader.field1070.field3633[var3 >> 16], var4, false);
			}

			return 1; // L: 591
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 593
			Interpreter.Interpreter_intStackSize -= 4; // L: 594
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 595
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 596
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 597
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 598
			UserComparator5.invalidateWidget(var4); // L: 599
			class193.client.alignWidget(var4); // L: 600
			if (var3 != -1 && var4.type == 0) { // L: 601
				class167.revalidateWidgetScroll(ArchiveLoader.field1070.field3633[var3 >> 16], var4, false);
			}

			return 1; // L: 602
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 604
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 605
			if (var5 != var4.isHidden) { // L: 606
				var4.isHidden = var5; // L: 607
				UserComparator5.invalidateWidget(var4); // L: 608
			}

			return 1; // L: 610
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 612
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 613
			return 1; // L: 614
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 616
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 617
			return 1; // L: 618
		} else {
			return 2; // L: 620
		}
	}
}
