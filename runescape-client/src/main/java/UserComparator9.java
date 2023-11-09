import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("do")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;B)I",
		garbageValue = "-40"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-412097374"
	)
	static int method2948(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 575
		Widget var4;
		if (var0 >= 2000) { // L: 577
			var0 -= 1000; // L: 578
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 579
			var4 = class133.getWidget(var3); // L: 580
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 582
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 583
			class302.Interpreter_intStackSize -= 4; // L: 584
			var4.rawX = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 585
			var4.rawY = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 586
			var4.xAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 587
			var4.yAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3]; // L: 588
			LoginScreenAnimation.invalidateWidget(var4); // L: 589
			Decimator.client.alignWidget(var4); // L: 590
			if (var3 != -1 && var4.type == 0) { // L: 591
				AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 592
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 594
			class302.Interpreter_intStackSize -= 4; // L: 595
			var4.rawWidth = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 596
			var4.rawHeight = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 597
			var4.widthAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 598
			var4.heightAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3]; // L: 599
			LoginScreenAnimation.invalidateWidget(var4); // L: 600
			Decimator.client.alignWidget(var4); // L: 601
			if (var3 != -1 && var4.type == 0) { // L: 602
				AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 603
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 605
			boolean var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 606
			if (var5 != var4.isHidden) { // L: 607
				var4.isHidden = var5; // L: 608
				LoginScreenAnimation.invalidateWidget(var4); // L: 609
			}

			return 1; // L: 611
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 613
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 614
			return 1; // L: 615
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 617
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 618
			return 1; // L: 619
		} else {
			return 2; // L: 621
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "16777215"
	)
	static final void method2943(String var0) {
		Decimator.method1115("Please remove " + var0 + " from your friend list first"); // L: 178
	} // L: 179

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lkz;III)V",
		garbageValue = "1549726934"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 12457
			if (var0 != null && DecorativeObject.method4864(var0) != null) { // L: 12458
				Client.clickedWidget = var0; // L: 12459
				Client.clickedWidgetParent = DecorativeObject.method4864(var0); // L: 12460
				Client.widgetClickX = var1; // L: 12461
				Client.widgetClickY = var2; // L: 12462
				class27.widgetDragDuration = 0; // L: 12463
				Client.isDraggingWidget = false; // L: 12464
				int var3 = Client.menuOptionsCount - 1; // L: 12467
				if (var3 != -1) { // L: 12470
					class33.method492(var3);
				}

			}
		}
	} // L: 12471
}
