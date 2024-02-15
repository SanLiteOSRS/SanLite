import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class188 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -5178930276951482385L
	)
	public long field1960;
	@ObfuscatedName("aw")
	int[] field1958;
	@ObfuscatedName("al")
	short[] field1957;
	@ObfuscatedName("ai")
	short[] field1959;
	@ObfuscatedName("ar")
	public boolean field1956;

	public class188(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field1956 = false; // L: 8
		this.field1960 = var1; // L: 11
		this.field1958 = var3; // L: 12
		this.field1957 = var4; // L: 13
		this.field1959 = var5; // L: 14
		this.field1956 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-80"
	)
	static boolean method3696() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5185
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "243841173"
	)
	static final void method3695(Widget var0) {
		if (var0.buttonType == 1) { // L: 11381
			class106.method2775(var0.field3855, "", 24, 0, 0, var0.id, var0.itemId); // L: 11382
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11385
			var1 = UserComparator9.Widget_getSpellActionName(var0); // L: 11386
			if (var1 != null) { // L: 11387
				class106.method2775(var1, class370.colorStartTag(65280) + var0.field3785, 25, 0, -1, var0.id, var0.itemId); // L: 11388
			}
		}

		if (var0.buttonType == 3) { // L: 11392
			UrlRequest.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11393
		}

		if (var0.buttonType == 4) { // L: 11396
			UrlRequest.insertMenuItemNoShift(var0.field3855, "", 28, 0, 0, var0.id); // L: 11397
		}

		if (var0.buttonType == 5) { // L: 11400
			UrlRequest.insertMenuItemNoShift(var0.field3855, "", 29, 0, 0, var0.id); // L: 11401
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11404
			UrlRequest.insertMenuItemNoShift(var0.field3855, "", 30, 0, -1, var0.id); // L: 11405
		}

		if (var0.isIf3) { // L: 11408
			if (Client.isSpellSelected) { // L: 11409
				if (class175.method3550(class429.getWidgetFlags(var0)) && (class128.field1520 & 32) == 32) { // L: 11410
					class106.method2775(Client.field696, Client.field574 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11411
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) { // L: 11416
					int var4 = class429.getWidgetFlags(var0); // L: 11420
					boolean var8 = (var4 >> var6 + 1 & 1) != 0; // L: 11422
					String var9;
					if (!var8 && var0.onOp == null) { // L: 11424
						var9 = null; // L: 11425
					} else if (var0.actions != null && var0.actions.length > var6 && var0.actions[var6] != null && var0.actions[var6].trim().length() != 0) { // L: 11428
						var9 = var0.actions[var6]; // L: 11432
					} else {
						var9 = null; // L: 11429
					}

					if (var9 != null) { // L: 11435
						class106.method2775(var9, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11436
					}
				}

				var1 = UserComparator9.Widget_getSpellActionName(var0); // L: 11440
				if (var1 != null) { // L: 11441
					class106.method2775(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11442
				}

				for (int var2 = 4; var2 >= 0; --var2) { // L: 11445
					int var5 = class429.getWidgetFlags(var0); // L: 11449
					boolean var10 = (var5 >> var2 + 1 & 1) != 0; // L: 11451
					String var3;
					if (!var10 && var0.onOp == null) { // L: 11453
						var3 = null; // L: 11454
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 11457
						var3 = var0.actions[var2]; // L: 11461
					} else {
						var3 = null; // L: 11458
					}

					if (var3 != null) { // L: 11464
						class246.method4955(var3, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11465
					}
				}

				if (MusicPatch.method6335(class429.getWidgetFlags(var0))) { // L: 11469
					UrlRequest.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11470
				}
			}
		}

	} // L: 11475
}
