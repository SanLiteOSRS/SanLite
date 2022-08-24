import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class229 {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)Ljava/lang/String;",
		garbageValue = "894135330"
	)
	public static String method4813(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 67
			if (var2 > 32767) { // L: 68
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 69
			var0.offset += class465.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 70
			String var4 = PlatformInfo.decodeStringCp1252(var3, 0, var2); // L: 71
			var1 = var4; // L: 72
		} catch (Exception var6) { // L: 74
			var1 = "Cabbage"; // L: 75
		}

		return var1; // L: 78
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "29595"
	)
	static final void method4818(int var0, int var1) {
		if (var0 < 128) { // L: 3754
			var0 = 128;
		}

		if (var0 > 383) { // L: 3755
			var0 = 383;
		}

		if (class82.cameraPitch < var0) { // L: 3756
			class82.cameraPitch = (var0 - class82.cameraPitch) * class18.field96 / 1000 + class82.cameraPitch + class21.field113; // L: 3757
			if (class82.cameraPitch > var0) { // L: 3758
				class82.cameraPitch = var0;
			}
		}

		if (class82.cameraPitch > var0) { // L: 3760
			class82.cameraPitch -= (class82.cameraPitch - var0) * class18.field96 / 1000 + class21.field113; // L: 3761
			if (class82.cameraPitch < var0) { // L: 3762
				class82.cameraPitch = var0;
			}
		}

		int var2 = var1 - ClientPreferences.cameraYaw; // L: 3764
		if (var2 > 1024) { // L: 3765
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3766
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3767
			ClientPreferences.cameraYaw = var2 * class18.field96 / 1000 + ClientPreferences.cameraYaw + class21.field113; // L: 3768
			ClientPreferences.cameraYaw &= 2047; // L: 3769
		}

		if (var2 < 0) { // L: 3771
			ClientPreferences.cameraYaw -= -var2 * class18.field96 / 1000 + class21.field113; // L: 3772
			ClientPreferences.cameraYaw &= 2047; // L: 3773
		}

		int var3 = var1 - ClientPreferences.cameraYaw; // L: 3775
		if (var3 > 1024) { // L: 3776
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 3777
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3778
			ClientPreferences.cameraYaw = var1;
		}

	} // L: 3779

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIB)V",
		garbageValue = "22"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11344
			if (var0 != null && class260.method5126(var0) != null) { // L: 11345
				Client.clickedWidget = var0; // L: 11346
				Client.clickedWidgetParent = class260.method5126(var0); // L: 11347
				Client.widgetClickX = var1; // L: 11348
				Client.widgetClickY = var2; // L: 11349
				NPCComposition.widgetDragDuration = 0; // L: 11350
				Client.isDraggingWidget = false; // L: 11351
				int var3 = Client.menuOptionsCount - 1; // L: 11354
				if (var3 != -1) { // L: 11357
					class142.method2983(var3);
				}

			}
		}
	} // L: 11358
}
