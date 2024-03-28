import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class31 {
	@ObfuscatedName("az")
	public static Applet field153;
	@ObfuscatedName("ah")
	public static String field150;
	@ObfuscatedName("ga")
	static String field154;

	static {
		field153 = null; // L: 10
		field150 = ""; // L: 11
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-2147357601"
	)
	static final void method440(Widget var0) {
		if (var0.buttonType == 1) { // L: 11405
			class133.method3069(var0.field3877, "", 24, 0, 0, var0.id, var0.itemId); // L: 11406
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11409
			var1 = class160.Widget_getSpellActionName(var0); // L: 11410
			if (var1 != null) { // L: 11411
				class133.method3069(var1, Decimator.colorStartTag(65280) + var0.field3822, 25, 0, -1, var0.id, var0.itemId); // L: 11412
			}
		}

		if (var0.buttonType == 3) { // L: 11416
			Interpreter.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11417
		}

		if (var0.buttonType == 4) { // L: 11420
			Interpreter.insertMenuItemNoShift(var0.field3877, "", 28, 0, 0, var0.id); // L: 11421
		}

		if (var0.buttonType == 5) { // L: 11424
			Interpreter.insertMenuItemNoShift(var0.field3877, "", 29, 0, 0, var0.id); // L: 11425
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11428
			Interpreter.insertMenuItemNoShift(var0.field3877, "", 30, 0, -1, var0.id); // L: 11429
		}

		if (var0.isIf3) { // L: 11432
			if (Client.isSpellSelected) { // L: 11433
				if (class129.method3000(class33.getWidgetFlags(var0)) && (class352.field3905 & 32) == 32) { // L: 11434
					class133.method3069(Client.field557, Client.field801 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11435
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) { // L: 11440
					String var9 = SoundSystem.method819(var0, var6); // L: 11441
					if (var9 != null) { // L: 11442
						class133.method3069(var9, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11443
					}
				}

				var1 = class160.Widget_getSpellActionName(var0); // L: 11447
				if (var1 != null) { // L: 11448
					class133.method3069(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11449
				}

				for (int var2 = 4; var2 >= 0; --var2) { // L: 11452
					int var5 = class33.getWidgetFlags(var0); // L: 11456
					boolean var4 = (var5 >> var2 + 1 & 1) != 0; // L: 11458
					String var7;
					if (!var4 && var0.onOp == null) { // L: 11460
						var7 = null; // L: 11461
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 11464
						var7 = var0.actions[var2]; // L: 11468
					} else {
						var7 = null; // L: 11465
					}

					if (var7 != null) { // L: 11471
						GraphicsObject.method2076(var7, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11472
					}
				}

				int var3 = class33.getWidgetFlags(var0); // L: 11477
				boolean var10 = (var3 & 1) != 0; // L: 11479
				if (var10) { // L: 11481
					Interpreter.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11482
				}
			}
		}

	} // L: 11487

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "3"
	)
	static final void method435(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class243.field2620.method6285(var0)) { // L: 11498
			class188.updateInterface(class243.field2620.field3645[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11499
		}
	} // L: 11500

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lnt;III)V",
		garbageValue = "1725517927"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 12057
			if (var0 != null) { // L: 12059
				Widget var5 = var0; // L: 12063
				int var6 = class206.method3858(class33.getWidgetFlags(var0)); // L: 12065
				Widget var4;
				int var7;
				if (var6 == 0) { // L: 12066
					var4 = null; // L: 12067
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5; // L: 12077
							break;
						}

						var5 = class243.field2620.method6281(var5.parentId); // L: 12071
						if (var5 == null) { // L: 12072
							var4 = null; // L: 12073
							break; // L: 12074
						}

						++var7; // L: 12070
					}
				}

				Widget var8 = var4; // L: 12079
				if (var4 == null) { // L: 12080
					var8 = var0.parent;
				}

				if (var8 != null) { // L: 12083
					Client.clickedWidget = var0; // L: 12087
					var5 = var0; // L: 12091
					var6 = class206.method3858(class33.getWidgetFlags(var0)); // L: 12093
					if (var6 == 0) { // L: 12094
						var4 = null; // L: 12095
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5; // L: 12105
								break;
							}

							var5 = class243.field2620.method6281(var5.parentId); // L: 12099
							if (var5 == null) { // L: 12100
								var4 = null; // L: 12101
								break; // L: 12102
							}

							++var7; // L: 12098
						}
					}

					var8 = var4; // L: 12107
					if (var4 == null) { // L: 12108
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8; // L: 12111
					Client.widgetClickX = var1; // L: 12112
					Client.widgetClickY = var2; // L: 12113
					class179.widgetDragDuration = 0; // L: 12114
					Client.isDraggingWidget = false; // L: 12115
					int var9 = Client.menuOptionsCount - 1; // L: 12118
					if (var9 != -1) { // L: 12121
						ItemComposition.method4204(var9);
					}

					return; // L: 12122
				}
			}

		}
	} // L: 12085
}
