import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lk")
public class class313 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -84985137
	)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZS)I",
		garbageValue = "255"
	)
	static int method6248(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 583
		Widget var4;
		if (var0 >= 2000) { // L: 585
			var0 -= 1000; // L: 586
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 587
			var4 = class281.getWidget(var3); // L: 588
		} else {
			var4 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 590
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 591
			class379.Interpreter_intStackSize -= 4; // L: 592
			var4.rawX = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 593
			var4.rawY = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 594
			var4.xAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 595
			var4.yAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 596
			class143.invalidateWidget(var4); // L: 597
			ClanChannelMember.client.alignWidget(var4); // L: 598
			if (var3 != -1 && var4.type == 0) { // L: 599
				class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 600
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 602
			class379.Interpreter_intStackSize -= 4; // L: 603
			var4.rawWidth = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 604
			var4.rawHeight = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 605
			var4.widthAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 606
			var4.heightAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 607
			class143.invalidateWidget(var4); // L: 608
			ClanChannelMember.client.alignWidget(var4); // L: 609
			if (var3 != -1 && var4.type == 0) { // L: 610
				class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 611
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 613
			boolean var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 614
			if (var5 != var4.isHidden) { // L: 615
				var4.isHidden = var5; // L: 616
				class143.invalidateWidget(var4); // L: 617
			}

			return 1; // L: 619
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 621
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 622
			return 1; // L: 623
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 625
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 626
			return 1; // L: 627
		} else {
			return 2; // L: 629
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-4925"
	)
	public static void method6246() {
		if (NetCache.NetCache_socket != null) { // L: 147
			NetCache.NetCache_socket.close();
		}

	} // L: 148

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static boolean method6247() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4953
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Ljava/lang/String;",
		garbageValue = "1141569989"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class167.Widget_unpackTargetMask(class197.getWidgetFlags(var0)) == 0) { // L: 12626
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12627 12628 12630
		}
	}
}
