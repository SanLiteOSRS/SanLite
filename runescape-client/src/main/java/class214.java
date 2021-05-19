import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hi")
public abstract class class214 implements class216 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 923397577
	)
	protected int field2549;

	@ObfuscatedSignature(
		descriptor = "(Ljr;Lkr;I)V"
	)
	protected class214(StudioGame var1, Language var2, int var3) {
		this.field2549 = var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1473655530"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1877487505"
	)
	static int method4239(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1848569122"
	)
	static int method4241(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var5 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var5 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
			if (var5.itemId != -1) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "1304902076"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && World.method1731(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = World.method1731(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class288.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = AttackOption.method2285();
				if (var3 != -1) {
					GrandExchangeOfferAgeComparator.method4989(var3);
				}

			}
		}
	}
}
