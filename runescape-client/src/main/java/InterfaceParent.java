import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -323406049
	)
	@Export("group")
	int group;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -951908341
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	boolean field1011;

	InterfaceParent() {
		this.field1011 = false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZS)I",
		garbageValue = "16109"
	)
	static int method2079(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field797.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class14.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class92 var6 = new class92(var5, var3, var4, UserComparator9.getWidget(var3).itemId);
					Interpreter.field797.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field798 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1024 = Interpreter.field798 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1428422935"
	)
	static boolean method2080(int var0) {
		for (int var1 = 0; var1 < Client.field695; ++var1) {
			if (Client.field697[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
