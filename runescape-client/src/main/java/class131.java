import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fs")
public class class131 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lqx;",
		garbageValue = "-20"
	)
	public static class424 method3130() {
		synchronized(class424.field4659) { // L: 28
			if (class424.field4658 == 0) { // L: 29
				return new class424();
			} else {
				class424.field4659[--class424.field4658].method8167(); // L: 31
				return class424.field4659[class424.field4658]; // L: 32
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "1883190484"
	)
	static int method3129(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 565
		Widget var4;
		if (var0 >= 2000) { // L: 567
			var0 -= 1000; // L: 568
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 569
			var4 = class165.getWidget(var3); // L: 570
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 572
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 573
			Interpreter.Interpreter_intStackSize -= 4; // L: 574
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 575
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 576
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 577
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 578
			class144.invalidateWidget(var4); // L: 579
			ScriptFrame.client.alignWidget(var4); // L: 580
			if (var3 != -1 && var4.type == 0) { // L: 581
				DecorativeObject.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 582
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 584
			Interpreter.Interpreter_intStackSize -= 4; // L: 585
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 586
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 587
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 588
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 589
			class144.invalidateWidget(var4); // L: 590
			ScriptFrame.client.alignWidget(var4); // L: 591
			if (var3 != -1 && var4.type == 0) { // L: 592
				DecorativeObject.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 593
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 595
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 596
			if (var5 != var4.isHidden) { // L: 597
				var4.isHidden = var5; // L: 598
				class144.invalidateWidget(var4); // L: 599
			}

			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 603
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 604
			return 1; // L: 605
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 607
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 608
			return 1; // L: 609
		} else {
			return 2; // L: 611
		}
	}
}
