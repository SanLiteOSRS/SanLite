import java.applet.Applet;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("ws")
	static Iterator field144;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static GameBuild field153;
	@ObfuscatedName("dj")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 1264334945
	)
	@Export("cameraY")
	static int cameraY;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "256979698"
	)
	static boolean method428(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 56
			try {
				if (!class31.field161.startsWith("win")) { // L: 58
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 59
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 60

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 61
						if (var14.indexOf(var0.charAt(var4)) == -1) { // L: 62
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 64
					return true; // L: 65
				}
			} catch (Throwable var8) { // L: 67
				return false; // L: 68
			}
		} else if (var1 == 1) { // L: 71
			try {
				Applet var7 = class31.field163; // L: 74
				Object[] var5 = new Object[]{(new URL(class31.field163.getCodeBase(), var0)).toString()}; // L: 75
				Object var13 = JSObject.getWindow(var7).call(var2, var5); // L: 78
				return var13 != null; // L: 81
			} catch (Throwable var9) { // L: 83
				return false; // L: 84
			}
		} else if (var1 == 2) { // L: 87
			try {
				class31.field163.getAppletContext().showDocument(new URL(class31.field163.getCodeBase(), var0), "_blank"); // L: 89
				return true; // L: 90
			} catch (Exception var10) { // L: 92
				return false; // L: 93
			}
		} else if (var1 == 3) { // L: 96
			try {
				Applet var3 = class31.field163; // L: 98
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 101
			} catch (Throwable var12) { // L: 104
			}

			try {
				class31.field163.getAppletContext().showDocument(new URL(class31.field163.getCodeBase(), var0), "_top"); // L: 106
				return true; // L: 107
			} catch (Exception var11) { // L: 109
				return false; // L: 110
			}
		} else {
			throw new IllegalArgumentException(); // L: 113
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-58"
	)
	static int method437(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 484
			UserComparator6.Interpreter_intStackSize -= 3; // L: 485
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 486
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 487
			int var11 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 488
			if (var4 == 0) { // L: 489
				throw new RuntimeException(); // L: 490
			} else {
				Widget var6 = class380.field4414.method6348(var9); // L: 492
				if (var6.children == null) { // L: 493
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 494
					Widget[] var7 = new Widget[var11 + 1]; // L: 495

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 496
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 497
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 499
				} else {
					Widget var12 = new Widget(); // L: 500
					var12.type = var4; // L: 501
					var12.parentId = var12.id = var6.id; // L: 502
					var12.childIndex = var11; // L: 503
					var12.isIf3 = true; // L: 504
					if (var4 == 12) { // L: 505
						var12.method6713(); // L: 506
						var12.method6700().method6464(new class105(var12)); // L: 507
						var12.method6700().method6463(new class106(var12)); // L: 517
					}

					var6.children[var11] = var12; // L: 528
					if (var2) { // L: 529
						class31.scriptDotWidget = var12;
					} else {
						class185.field1932 = var12; // L: 530
					}

					FaceNormal.invalidateWidget(var6); // L: 531
					return 1; // L: 532
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 534
				var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 535
				Widget var10 = class380.field4414.method6348(var3.id); // L: 536
				var10.children[var3.childIndex] = null; // L: 537
				FaceNormal.invalidateWidget(var10); // L: 538
				return 1; // L: 539
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 541
				var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 542
				var3.children = null; // L: 543
				FaceNormal.invalidateWidget(var3); // L: 544
				return 1; // L: 545
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 547
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 560
					var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 561
					if (var3 != null) { // L: 562
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 563
						if (var2) { // L: 564
							class31.scriptDotWidget = var3;
						} else {
							class185.field1932 = var3; // L: 565
						}
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 567
					}

					return 1; // L: 568
				} else {
					return 2; // L: 570
				}
			} else {
				UserComparator6.Interpreter_intStackSize -= 2; // L: 548
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 549
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 550
				Widget var5 = class380.field4414.method6347(var9, var4); // L: 551
				if (var5 != null && var4 != -1) { // L: 552
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 553
					if (var2) { // L: 554
						class31.scriptDotWidget = var5;
					} else {
						class185.field1932 = var5; // L: 555
					}
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 557
				}

				return 1; // L: 558
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I[B[BI)V",
		garbageValue = "1118481"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3775 == null) { // L: 1246
			if (var2 == null) { // L: 1247
				return; // L: 1253
			}

			var0.field3775 = new byte[11][]; // L: 1248
			var0.field3796 = new byte[11][]; // L: 1249
			var0.field3779 = new int[11]; // L: 1250
			var0.field3787 = new int[11]; // L: 1251
		}

		var0.field3775[var1] = var2; // L: 1255
		if (var2 != null) {
			var0.field3776 = true; // L: 1256
		} else {
			var0.field3776 = false; // L: 1258

			for (int var4 = 0; var4 < var0.field3775.length; ++var4) { // L: 1259
				if (var0.field3775[var4] != null) { // L: 1260
					var0.field3776 = true; // L: 1261
					break;
				}
			}
		}

		var0.field3796[var1] = var3; // L: 1266
	} // L: 1267

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-622779644"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1042
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1043
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1044
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1045
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1046
		return var3; // L: 1047
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZS)I",
		garbageValue = "255"
	)
	static int method433(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1634
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1651
				var7 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1652
				var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1653
				if (var4 >= 1 && var4 <= 10) { // L: 1654
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId); // L: 1657
					Interpreter.field849.add(var8); // L: 1658
					return 1; // L: 1659
				} else {
					throw new RuntimeException(); // L: 1655
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1661
				UserComparator6.Interpreter_intStackSize -= 3; // L: 1662
				int var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 1663
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 1664
				int var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 1665
				if (var5 >= 1 && var5 <= 10) { // L: 1666
					class102 var6 = new class102(var5, var3, var4, class380.field4414.method6348(var3).itemId); // L: 1669
					Interpreter.field849.add(var6); // L: 1670
					return 1; // L: 1671
				} else {
					throw new RuntimeException(); // L: 1667
				}
			} else {
				return 2; // L: 1673
			}
		} else if (Interpreter.field860 >= 10) { // L: 1635
			throw new RuntimeException(); // L: 1636
		} else {
			if (var0 >= 2000) { // L: 1639
				var7 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1640
			} else {
				var7 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1642
			}

			if (var7.onResize == null) { // L: 1643
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1644
				var9.widget = var7; // L: 1645
				var9.args = var7.onResize; // L: 1646
				var9.field1065 = Interpreter.field860 + 1; // L: 1647
				Client.scriptEvents.addFirst(var9); // L: 1648
				return 1; // L: 1649
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	static void method434() {
		Actor.method2489(24); // L: 1993
		class142.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1994
	} // L: 1995

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-644305667"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class380.field4414.method6357(var0)) { // L: 11295
			WorldMapRegion.updateInterface(class380.field4414.field3610[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11296
		}
	} // L: 11297
}
