import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hx")
public class class228 {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 335336935
	)
	static int field2740;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lig;B)V",
		garbageValue = "-43"
	)
	public static void method4310(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ILcl;ZI)I",
		garbageValue = "-1439463638"
	)
	static int method4309(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			Interpreter.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class237.getWidget(var3);
				if (var6.children == null) {
					var6.children = new Widget[var5 + 1];
				}

				if (var6.children.length <= var5) {
					Widget[] var7 = new Widget[var5 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var5 > 0 && var6.children[var5 - 1] == null) {
					throw new RuntimeException("" + (var5 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var5;
					var12.isIf3 = true;
					var6.children[var5] = var12;
					if (var2) {
						class277.field3584 = var12;
					} else {
						Interpreter.field1117 = var12;
					}

					IsaacCipher.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var9;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var9 = var2 ? class277.field3584 : Interpreter.field1117;
				Widget var10 = class237.getWidget(var9.id);
				var10.children[var9.childIndex] = null;
				IsaacCipher.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var9 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				var9.children = null;
				IsaacCipher.invalidateWidget(var9);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var9 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					if (var9 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class277.field3584 = var9;
						} else {
							Interpreter.field1117 = var9;
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Widget var11 = ArchiveLoader.getWidgetChild(var3, var4);
				if (var11 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class277.field3584 = var11;
					} else {
						Interpreter.field1117 = var11;
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2112037440"
	)
	public static void method4311() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		signature = "(IIS)V",
		garbageValue = "585"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (WorldMapCacheName.loadInterface(var0)) {
			WorldMapData_1.runComponentCloseListeners(DefaultsGroup.Widget_interfaceComponents[var0], var1);
		}
	}
}
