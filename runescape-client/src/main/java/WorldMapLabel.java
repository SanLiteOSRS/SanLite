import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fd")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("f")
	@Export("text")
	String text;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 797016481
	)
	@Export("width")
	int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2014432723
	)
	@Export("height")
	int height;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfg;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "427619994"
	)
	public static int method3714(int var0, int var1, int var2) {
		int var3 = UserComparator2.method6890(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-481933347"
	)
	static int method3715(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == 1928) {
				var7 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class106 var8 = new class106(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field965.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				ChatChannel.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class106 var6 = new class106(var5, var3, var4, WorldMapData_1.getWidget(var3).itemId);
					Interpreter.field965.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field966 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1154 = Interpreter.field966 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
