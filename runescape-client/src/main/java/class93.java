import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class93 {
	@ObfuscatedName("ac")
	static byte[][][] field1150;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "60"
	)
	public static int method2450() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1385698501"
	)
	public static int method2451(int var0, int var1, int var2) {
		int var3 = class214.method4227(var2 - var1 + 1); // L: 39
		var3 <<= var1; // L: 40
		return var0 & ~var3; // L: 41
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "-296278834"
	)
	static final void method2452(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) { // L: 11402
			var1 = var0.field3789; // L: 11403
			var2 = var0.id; // L: 11404
			var3 = var0.itemId; // L: 11405
			GrandExchangeOfferTotalQuantityComparator.method7091(var1, "", 24, 0, 0, var2, var3, false); // L: 11407
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11411
			var1 = class89.Widget_getSpellActionName(var0); // L: 11412
			if (var1 != null) { // L: 11413
				class25.method391(var1, class167.colorStartTag(65280) + var0.field3788, 25, 0, -1, var0.id, var0.itemId); // L: 11414
			}
		}

		if (var0.buttonType == 3) { // L: 11418
			WorldMapSectionType.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11419
		}

		if (var0.buttonType == 4) { // L: 11422
			WorldMapSectionType.insertMenuItemNoShift(var0.field3789, "", 28, 0, 0, var0.id); // L: 11423
		}

		if (var0.buttonType == 5) { // L: 11426
			WorldMapSectionType.insertMenuItemNoShift(var0.field3789, "", 29, 0, 0, var0.id); // L: 11427
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11430
			WorldMapSectionType.insertMenuItemNoShift(var0.field3789, "", 30, 0, -1, var0.id); // L: 11431
		}

		if (var0.isIf3) { // L: 11434
			int var5;
			String var10;
			if (Client.isSpellSelected) { // L: 11435
				var2 = class361.getWidgetFlags(var0); // L: 11437
				boolean var8 = (var2 >> 21 & 1) != 0; // L: 11439
				if (var8 && (UrlRequest.field1430 & 32) == 32) { // L: 11441
					var10 = Client.field655; // L: 11442
					String var11 = Client.field656 + " " + "->" + " " + var0.dataText; // L: 11443
					var5 = var0.childIndex; // L: 11444
					int var6 = var0.id; // L: 11445
					int var7 = var0.itemId; // L: 11446
					GrandExchangeOfferTotalQuantityComparator.method7091(var10, var11, 58, 0, var5, var6, var7, false); // L: 11448
				}
			} else {
				String var9;
				for (int var13 = 9; var13 >= 5; --var13) { // L: 11454
					if (!GraphicsObject.method2128(class361.getWidgetFlags(var0), var13) && var0.onOp == null) { // L: 11457
						var9 = null; // L: 11458
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) { // L: 11461
						var9 = var0.actions[var13]; // L: 11465
					} else {
						var9 = null; // L: 11462
					}

					if (var9 != null) { // L: 11468
						class25.method391(var9, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11469
					}
				}

				var1 = class89.Widget_getSpellActionName(var0); // L: 11473
				if (var1 != null) { // L: 11474
					var9 = var0.dataText; // L: 11475
					var3 = var0.childIndex; // L: 11476
					int var4 = var0.id; // L: 11477
					var5 = var0.itemId; // L: 11478
					GrandExchangeOfferTotalQuantityComparator.method7091(var1, var9, 25, 0, var3, var4, var5, false); // L: 11480
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 11484
					if (!GraphicsObject.method2128(class361.getWidgetFlags(var0), var2) && var0.onOp == null) { // L: 11487
						var10 = null; // L: 11488
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 11491
						var10 = var0.actions[var2]; // L: 11495
					} else {
						var10 = null; // L: 11492
					}

					if (var10 != null) { // L: 11498
						GrandExchangeOfferTotalQuantityComparator.method7091(var10, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11499
					}
				}

				var3 = class361.getWidgetFlags(var0); // L: 11504
				boolean var12 = (var3 & 1) != 0; // L: 11506
				if (var12) { // L: 11508
					WorldMapSectionType.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11509
				}
			}
		}

	} // L: 11514
}
