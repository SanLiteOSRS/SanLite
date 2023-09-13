import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lbb;",
		garbageValue = "74"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lub;",
		garbageValue = "13212181"
	)
	public static PrivateChatMode method317(int var0) {
		PrivateChatMode[] var1 = BufferedNetSocket.method8052(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field5246) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-2"
	)
	public static int method316(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 77
			boolean var3 = false; // L: 78
			boolean var4 = false; // L: 79
			int var5 = 0; // L: 80
			int var6 = var0.length(); // L: 81

			for (int var7 = 0; var7 < var6; ++var7) { // L: 82
				char var8 = var0.charAt(var7); // L: 83
				if (var7 == 0) { // L: 84
					if (var8 == '-') { // L: 85
						var3 = true; // L: 86
						continue;
					}

					if (var8 == '+') { // L: 89
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 91
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 92
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 93
						throw new NumberFormatException(); // L: 94
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 95
					throw new NumberFormatException();
				}

				if (var3) { // L: 96
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 97
				if (var9 / var1 != var5) { // L: 98
					throw new NumberFormatException();
				}

				var5 = var9; // L: 99
				var4 = true; // L: 100
			}

			if (!var4) { // L: 102
				throw new NumberFormatException();
			} else {
				return var5; // L: 103
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "41"
	)
	static final void method318(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9215
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9216
				Client.field749[var4] = true;
			}
		}

	} // L: 9218
}
