import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class306 {
	@ObfuscatedName("au")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -511581281
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class302[] var2 = new class302[]{class302.field3600, class302.field3597}; // L: 14
		class302[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class302 var5 = var3[var4]; // L: 18
			if (var5.field3601 > var0) { // L: 20
				var0 = var5.field3601;
			}

			if (var5.field3599 > var1) { // L: 21
				var1 = var5.field3599;
			}
		}

	} // L: 25

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "990903620"
	)
	static boolean method5768(CharSequence var0, int var1, boolean var2) {
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

				int var9 = var10 + var5 * var1; // L: 59
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldi;",
		garbageValue = "1858590333"
	)
	static class123[] method5767() {
		return new class123[]{class123.field1511, class123.field1503, class123.field1504, class123.field1505, class123.field1506, class123.field1507, class123.field1508, class123.field1509, class123.field1510}; // L: 113
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1403137252"
	)
	static final int method5765(int var0, int var1) {
		int var2 = class439.method7671(45365 + var0, 91923 + var1, 4) - 128 + (class439.method7671(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (class439.method7671(var0, var1, 1) - 128 >> 2); // L: 923
		var2 = (int)(0.3D * (double)var2) + 35; // L: 924
		if (var2 < 10) { // L: 925
			var2 = 10;
		} else if (var2 > 60) { // L: 926
			var2 = 60;
		}

		return var2; // L: 927
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-794324664"
	)
	static boolean method5766() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5123
	}
}
