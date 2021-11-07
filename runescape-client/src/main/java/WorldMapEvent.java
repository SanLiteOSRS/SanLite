import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gw")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -370976069
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILie;Lie;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "3"
	)
	static int method4105(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class295.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class14.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				var4.parent = ItemContainer.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class14.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class14.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]};
						Varps.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class14.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							Interpreter.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						Interpreter.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class14.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class1.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class1.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						class14.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class14.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class14.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class14.Interpreter_intStackSize + 1];
							}
						}
					} else {
						class14.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						Varps.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
