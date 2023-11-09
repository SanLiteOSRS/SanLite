import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gc")
public class class171 {
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -1688131963
	)
	static int field1825;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-525389543"
	)
	static int method3486(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 569
		Widget var4;
		if (var0 >= 2000) { // L: 571
			var0 -= 1000; // L: 572
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 573
			var4 = FriendSystem.getWidget(var3); // L: 574
		} else {
			var4 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 576
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 577
			Interpreter.Interpreter_intStackSize -= 4; // L: 578
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 579
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 580
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 581
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 582
			Messages.invalidateWidget(var4); // L: 583
			class347.client.alignWidget(var4); // L: 584
			if (var3 != -1 && var4.type == 0) { // L: 585
				Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 586
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 588
			Interpreter.Interpreter_intStackSize -= 4; // L: 589
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 590
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 591
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 592
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 593
			Messages.invalidateWidget(var4); // L: 594
			class347.client.alignWidget(var4); // L: 595
			if (var3 != -1 && var4.type == 0) { // L: 596
				Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 597
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 599
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 600
			if (var5 != var4.isHidden) { // L: 601
				var4.isHidden = var5; // L: 602
				Messages.invalidateWidget(var4); // L: 603
			}

			return 1; // L: 605
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 607
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 608
			return 1; // L: 609
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 611
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 612
			return 1; // L: 613
		} else {
			return 2; // L: 615
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lcc;",
		garbageValue = "-10"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}
}
