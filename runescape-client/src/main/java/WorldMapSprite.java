import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("ap")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "16777215"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1]; // L: 24
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "325169216"
	)
	static long method5024() {
		return Client.field509; // L: 2932
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "48"
	)
	static void method5027(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2]; // L: 8411
		if (var5 != null) { // L: 8412
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) { // L: 8413 8414 8419
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) { // L: 8415
					var6.remove(); // L: 8416
					break;
				}
			}

			if (var5.last() == null) { // L: 8421
				Client.groundItems[var0][var1][var2] = null;
			}

			class134.method3141(var0, var1, var2); // L: 8422
		}

	} // L: 8424

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "2027497164"
	)
	static final void method5026(Widget var0) {
		if (var0.buttonType == 1) { // L: 11219
			ObjectSound.method1983(var0.field3831, "", 24, 0, 0, var0.id, var0.itemId); // L: 11220
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11223
			var1 = FontName.Widget_getSpellActionName(var0); // L: 11224
			if (var1 != null) { // L: 11225
				ObjectSound.method1983(var1, class208.colorStartTag(65280) + var0.field3830, 25, 0, -1, var0.id, var0.itemId); // L: 11226
			}
		}

		if (var0.buttonType == 3) { // L: 11230
			class385.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11231
		}

		if (var0.buttonType == 4) { // L: 11234
			class385.insertMenuItemNoShift(var0.field3831, "", 28, 0, 0, var0.id); // L: 11235
		}

		if (var0.buttonType == 5) { // L: 11238
			class385.insertMenuItemNoShift(var0.field3831, "", 29, 0, 0, var0.id); // L: 11239
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11242
			class385.insertMenuItemNoShift(var0.field3831, "", 30, 0, -1, var0.id); // L: 11243
		}

		if (var0.isIf3) { // L: 11246
			int var2;
			if (Client.isSpellSelected) { // L: 11247
				var2 = class405.getWidgetFlags(var0); // L: 11249
				boolean var4 = (var2 >> 21 & 1) != 0; // L: 11251
				if (var4 && (class60.field431 & 32) == 32) { // L: 11253
					ObjectSound.method1983(Client.field668, Client.field669 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11254
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) { // L: 11259
					String var5 = HealthBarUpdate.method2496(var0, var6); // L: 11260
					if (var5 != null) { // L: 11261
						ObjectSound.method1983(var5, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11262
					}
				}

				var1 = FontName.Widget_getSpellActionName(var0); // L: 11266
				if (var1 != null) { // L: 11267
					ObjectSound.method1983(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11268
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 11271
					String var3 = HealthBarUpdate.method2496(var0, var2); // L: 11272
					if (var3 != null) { // L: 11273
						Huffman.method6893(var3, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11274
					}
				}

				if (class304.method5978(class405.getWidgetFlags(var0))) { // L: 11278
					class385.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11279
				}
			}
		}

	} // L: 11284
}
