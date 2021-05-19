import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements PlayerProvider {
	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "65542938"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Liv;",
		garbageValue = "-159166525"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = UserComparator8.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1197541083"
	)
	static int method454(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			var4 = getWidget(var3);
		} else {
			var4 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			WorldMapCacheName.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3];
			VerticalAlignment.invalidateWidget(var4);
			class303.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			WorldMapCacheName.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3];
			VerticalAlignment.invalidateWidget(var4);
			class303.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				VerticalAlignment.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
