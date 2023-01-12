import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class190 extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-1246263736"
	)
	static boolean method3772(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 39
			boolean var3 = false; // L: 40
			boolean var4 = false; // L: 41
			int var5 = 0; // L: 42
			int var6 = var0.length(); // L: 43

			for (int var7 = 0; var7 < var6; ++var7) { // L: 44
				char var8 = var0.charAt(var7); // L: 45
				if (var7 == 0) { // L: 46
					if (var8 == '-') { // L: 47
						var3 = true; // L: 48
						continue;
					}

					if (var8 == '+') { // L: 51
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 53
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 54
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 55
						return false; // L: 56
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 57
					return false;
				}

				if (var3) { // L: 58
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 59
				if (var9 / var1 != var5) { // L: 60
					return false;
				}

				var5 = var9; // L: 61
				var4 = true; // L: 62
			}

			return var4; // L: 64
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
