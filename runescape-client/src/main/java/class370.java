import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class370 {
	@ObfuscatedName("af")
	static char[] field4377;
	@ObfuscatedName("an")
	static char[] field4375;
	@ObfuscatedName("aw")
	static char[] field4376;
	@ObfuscatedName("ac")
	static int[] field4378;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lsj;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		field4377 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4377[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4377[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4377[var0] = (char)(var0 + 48 - 52);
		}

		field4377[62] = '+'; // L: 11
		field4377[63] = '/'; // L: 12
		field4375 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4375[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4375[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4375[var0] = (char)(var0 + 48 - 52);
		}

		field4375[62] = '*'; // L: 22
		field4375[63] = '-'; // L: 23
		field4376 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4376[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4376[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4376[var0] = (char)(var0 + 48 - 52);
		}

		field4376[62] = '-'; // L: 33
		field4376[63] = '_'; // L: 34
		field4378 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4378.length; ++var0) { // L: 41
			field4378[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4378[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4378[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4378[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4378; // L: 45
		field4378[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4378; // L: 48
		field4378[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lmq;III)V",
		garbageValue = "-1880681871"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11366
			if (var0 != null) { // L: 11368
				Widget var5 = var0; // L: 11372
				int var6 = StructComposition.method3940(class25.getWidgetFlags(var0)); // L: 11374
				Widget var4;
				int var7;
				if (var6 == 0) { // L: 11375
					var4 = null; // L: 11376
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5; // L: 11386
							break;
						}

						var5 = class165.getWidget(var5.parentId); // L: 11380
						if (var5 == null) { // L: 11381
							var4 = null; // L: 11382
							break; // L: 11383
						}

						++var7; // L: 11379
					}
				}

				Widget var8 = var4; // L: 11388
				if (var4 == null) { // L: 11389
					var8 = var0.parent;
				}

				if (var8 != null) { // L: 11392
					Client.clickedWidget = var0; // L: 11396
					var5 = var0; // L: 11400
					var6 = StructComposition.method3940(class25.getWidgetFlags(var0)); // L: 11402
					if (var6 == 0) { // L: 11403
						var4 = null; // L: 11404
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5; // L: 11414
								break;
							}

							var5 = class165.getWidget(var5.parentId); // L: 11408
							if (var5 == null) { // L: 11409
								var4 = null; // L: 11410
								break; // L: 11411
							}

							++var7; // L: 11407
						}
					}

					var8 = var4; // L: 11416
					if (var4 == null) { // L: 11417
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8; // L: 11420
					Client.widgetClickX = var1; // L: 11421
					Client.widgetClickY = var2; // L: 11422
					class96.widgetDragDuration = 0; // L: 11423
					Client.isDraggingWidget = false; // L: 11424
					int var9 = DynamicObject.method2142(); // L: 11425
					if (var9 != -1) { // L: 11426
						class287.method5689(var9);
					}

					return; // L: 11427
				}
			}

		}
	} // L: 11394
}
