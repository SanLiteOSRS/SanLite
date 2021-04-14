import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jb")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3373("", 0, new class264[]{class264.field3339}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3361("", 1, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3362("", 2, new class264[]{class264.field3340, class264.field3341, class264.field3339}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3363("", 3, new class264[]{class264.field3340}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3360("", 4),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3365("", 5, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3366("", 6, new class264[]{class264.field3339}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3367("", 8, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3364("", 9, new class264[]{class264.field3340, class264.field3341}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3369("", 10, new class264[]{class264.field3340}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3376("", 11, new class264[]{class264.field3340}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3374("", 12, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Ljb;"
	)
	field3372("", 13, new class264[]{class264.field3340});

	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 2033836928
	)
	static int field3368;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	static Bounds field3378;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 243649969
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2114323867
	)
	@Export("id")
	final int id;
	@ObfuscatedName("j")
	final Set field3371;

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I[Ljj;)V"
	)
	ModeWhere(String var3, int var4, class264[] var5) {
		this.field3371 = new HashSet();
		this.id = var4;
		class264[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class264 var8 = var6[var7];
			this.field3371.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3371 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1792039900"
	)
	static int method4705(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? FriendSystem.field905 : class4.field35;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
				return 1;
			} else {
				--Interpreter.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class16.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				var4.parent = class231.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.field2768 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class16.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var9;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class16.Interpreter_intStackSize -= 2;
						var5 = 10;
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]};
						byte[] var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]};
						ApproximateRouteStrategy.Widget_setKey(var4, var5, var9, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class16.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class2.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						class2.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class16.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class244.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class244.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var8 = null;
					var9 = null;
					if (var3) {
						class16.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class16.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var8 = new byte[var7 / 2];
							var9 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class16.Interpreter_intStackSize];
								var9[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class16.Interpreter_intStackSize + 1];
							}
						}
					} else {
						class16.Interpreter_intStackSize -= 2;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]};
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						ApproximateRouteStrategy.Widget_setKey(var4, var7, var8, var9);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIIIIII)Z",
		garbageValue = "-1545527286"
	)
	static final boolean method4704(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}
}
