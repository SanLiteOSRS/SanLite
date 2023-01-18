import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class318 {
	static {
		Math.sqrt(8192.0D); // L: 9
	}

	@ObfuscatedName("h")
	public static double method6372(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4; // L: 10
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 12
		return var6 / var4; // L: 14
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "30"
	)
	static int method6373(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 76
			boolean var3 = false; // L: 77
			boolean var4 = false; // L: 78
			int var5 = 0; // L: 79
			int var6 = var0.length(); // L: 80

			for (int var7 = 0; var7 < var6; ++var7) { // L: 81
				char var8 = var0.charAt(var7); // L: 82
				if (var7 == 0) { // L: 83
					if (var8 == '-') { // L: 84
						var3 = true; // L: 85
						continue;
					}

					if (var8 == '+') { // L: 88
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 90
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 91
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 92
						throw new NumberFormatException(); // L: 93
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 94
					throw new NumberFormatException();
				}

				if (var3) { // L: 95
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 96
				if (var9 / var1 != var5) { // L: 97
					throw new NumberFormatException();
				}

				var5 = var9; // L: 98
				var4 = true; // L: 99
			}

			if (!var4) { // L: 101
				throw new NumberFormatException();
			} else {
				return var5; // L: 102
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
