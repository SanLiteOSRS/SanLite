import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "[Leu;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		signature = "(Lib;Lib;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0);
				}

				var10 = new Skeleton(var11, var13);
				var5.addFirst(var10);
			}

			this.frames[var7[var8]] = new Animation(var9, var10);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1239705769"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "-67"
	)
	static int method3356(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "2053155417"
	)
	static int method3354(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == 1928) {
				var3 = var2 ? PlayerComposition.scriptDotWidget : VarcInt.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class3.widgetDefaultMenuAction(var4, var3.id, var3.childIndex, var3.itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				VarcInt.Interpreter_intStackSize -= 3;
				int var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class3.widgetDefaultMenuAction(var5, var7, var4, CollisionMap.getWidget(var7).itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field1097 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? PlayerComposition.scriptDotWidget : VarcInt.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var3;
				var6.args = var3.onResize;
				var6.field569 = Interpreter.field1097 + 1;
				Client.scriptEvents.addFirst(var6);
				return 1;
			}
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "-41"
	)
	static final void method3352(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field901[var4] = true;
			}
		}

	}
}
