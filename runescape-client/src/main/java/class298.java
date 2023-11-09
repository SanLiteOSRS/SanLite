import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class298 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method5751(int var0) {
		--var0; // L: 66
		var0 |= var0 >>> 1; // L: 67
		var0 |= var0 >>> 2; // L: 68
		var0 |= var0 >>> 4; // L: 69
		var0 |= var0 >>> 8; // L: 70
		var0 |= var0 >>> 16; // L: 71
		return var0 + 1; // L: 72
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-31"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 112
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lmo;IIIIIIB)V",
		garbageValue = "69"
	)
	static final void method5749(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field563) { // L: 10883
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10884
		}

		Client.field563 = false; // L: 10885
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10886
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10887
				var0.scrollY -= 4; // L: 10888
				HorizontalAlignment.invalidateWidget(var0); // L: 10889
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10891
				var0.scrollY += 4; // L: 10892
				HorizontalAlignment.invalidateWidget(var0); // L: 10893
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10895
				var7 = var3 * (var3 - 32) / var4; // L: 10896
				if (var7 < 8) { // L: 10897
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10898
				int var9 = var3 - 32 - var7; // L: 10899
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10900
				HorizontalAlignment.invalidateWidget(var0); // L: 10901
				Client.field563 = true; // L: 10902
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10905
			var7 = var0.width; // L: 10906
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10907
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10908
				HorizontalAlignment.invalidateWidget(var0); // L: 10909
			}
		}

	} // L: 10912
}
