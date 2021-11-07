import java.applet.Applet;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ku")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;I)I",
		garbageValue = "2143976852"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	public static void method5440(Applet var0, String var1) {
		class29.field157 = var0;
		if (var1 != null) {
			class29.field158 = var1;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-879022560"
	)
	static int method5439(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
