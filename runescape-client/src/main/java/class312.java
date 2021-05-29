import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lr")
public class class312 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-9"
	)
	static int method5616(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
			var4 = Frames.getWidget(var3);
		} else {
			var4 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class44.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3];
			WorldMapCacheName.invalidateWidget(var4);
			class23.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class44.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3];
			WorldMapCacheName.invalidateWidget(var4);
			class23.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				WorldMapCacheName.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
