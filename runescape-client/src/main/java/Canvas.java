import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1852926703
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1947443311
	)
	static int field126;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("a")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "806733038"
	)
	static int method327(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 493
			class379.Interpreter_intStackSize -= 3; // L: 494
			var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 495
			var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 496
			int var11 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 497
			if (var4 == 0) { // L: 498
				throw new RuntimeException(); // L: 499
			} else {
				Widget var6 = class281.getWidget(var9); // L: 501
				if (var6.children == null) { // L: 502
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 503
					Widget[] var7 = new Widget[var11 + 1]; // L: 504

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 505
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 506
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 508
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 509
					var12.type = var4; // L: 510
					var12.parentId = var12.id = var6.id; // L: 511
					var12.childIndex = var11; // L: 512
					var12.isIf3 = true; // L: 513
					if (var4 == 12) { // L: 514
						var12.method6120(); // L: 515
						var12.method6076().method5814(new class100(var12)); // L: 516
						var12.method6076().method5813(new class101(var12)); // L: 526
					}

					var6.children[var11] = var12; // L: 537
					if (var2) { // L: 538
						class140.scriptDotWidget = var12;
					} else {
						class136.field1589 = var12; // L: 539
					}

					class143.invalidateWidget(var6); // L: 540
					return 1; // L: 541
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 543
				var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 544
				Widget var10 = class281.getWidget(var3.id); // L: 545
				var10.children[var3.childIndex] = null; // L: 546
				class143.invalidateWidget(var10); // L: 547
				return 1; // L: 548
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 550
				var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 551
				var3.children = null; // L: 552
				class143.invalidateWidget(var3); // L: 553
				return 1; // L: 554
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 556
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 569
					var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 570
					if (var3 != null) { // L: 571
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 572
						if (var2) { // L: 573
							class140.scriptDotWidget = var3;
						} else {
							class136.field1589 = var3; // L: 574
						}
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 576
					}

					return 1; // L: 577
				} else {
					return 2; // L: 579
				}
			} else {
				class379.Interpreter_intStackSize -= 2; // L: 557
				var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 558
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 559
				Widget var5 = WorldMapDecoration.getWidgetChild(var9, var4); // L: 560
				if (var5 != null && var4 != -1) { // L: 561
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 562
					if (var2) { // L: 563
						class140.scriptDotWidget = var5;
					} else {
						class136.field1589 = var5; // L: 564
					}
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 566
				}

				return 1; // L: 567
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "1028163044"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 111
			int var3 = var0; // L: 113
			String var2;
			if (var1 && var0 >= 0) { // L: 116
				int var4 = 2; // L: 120

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 121 122 124
					var5 /= 10; // L: 123
				}

				char[] var6 = new char[var4]; // L: 126
				var6[0] = '+'; // L: 127

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 128
					int var8 = var3; // L: 129
					var3 /= 10; // L: 130
					int var9 = var8 - var3 * 10; // L: 131
					if (var9 >= 10) { // L: 132
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 133
					}
				}

				var2 = new String(var6); // L: 135
			} else {
				var2 = Integer.toString(var0, 10); // L: 117
			}

			return var2; // L: 137
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkn;I)Ljava/lang/String;",
		garbageValue = "434081345"
	)
	static String method319(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10824
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10825
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10827
					if (var3 == -1) { // L: 10828
						break;
					}

					var0 = var0.substring(0, var3) + class162.method3326(class268.method5366(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 10829
				}
			}
		}

		return var0; // L: 10833
	}
}
