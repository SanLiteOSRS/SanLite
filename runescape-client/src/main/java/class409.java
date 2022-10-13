import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class409 {
	@ObfuscatedName("a")
	float[] field4583;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1670550447
	)
	int field4582;

	class409(float[] var1, int var2) {
		this.field4583 = var1; // L: 10
		this.field4582 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)I",
		garbageValue = "-624936655"
	)
	static int method7736(Widget var0) {
		if (var0.type != 11) { // L: 1526
			--class125.Interpreter_stringStackSize; // L: 1527
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 1528
			return 1; // L: 1529
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1531
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var0.method6067(var1); // L: 1532
			return 1; // L: 1533
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lck;",
		garbageValue = "-432582414"
	)
	static final InterfaceParent method7738(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12305
		var3.group = var1; // L: 12306
		var3.type = var2; // L: 12307
		Client.interfaceParents.put(var3, (long)var0); // L: 12308
		Tiles.Widget_resetModelFrames(var1); // L: 12309
		Widget var4 = class281.getWidget(var0); // L: 12310
		class143.invalidateWidget(var4); // L: 12311
		if (Client.meslayerContinueWidget != null) { // L: 12312
			class143.invalidateWidget(Client.meslayerContinueWidget); // L: 12313
			Client.meslayerContinueWidget = null; // L: 12314
		}

		class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12316
		class147.runWidgetOnLoadListener(var1); // L: 12317
		if (Client.rootInterface != -1) { // L: 12318
			DecorativeObject.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12319
	}
}
