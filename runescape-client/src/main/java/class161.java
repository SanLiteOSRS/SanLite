import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public abstract class class161 extends Node {
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -1814738371
	)
	static int field1754;

	class161() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	abstract void vmethod3405(Buffer var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	abstract void vmethod3411(ClanChannel var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "95848814"
	)
	static byte[] method3347(String var0) {
		boolean var1 = true; // L: 127
		boolean var2 = true; // L: 128
		int var3 = "pattern".length(); // L: 129
		int var4 = 0; // L: 130
		byte[] var5 = new byte[8]; // L: 131

		while (true) {
			int var6 = var3 + var4; // L: 133
			if (var6 >= var0.length()) { // L: 134
				return null; // L: 135
			}

			char var7 = var0.charAt(var6); // L: 137
			if (var7 == ':') { // L: 138
				if (var4 == 0) { // L: 155
					return null; // L: 156
				}

				byte[] var8 = new byte[var4]; // L: 158
				System.arraycopy(var5, 0, var8, 0, var4); // L: 159
				return var8; // L: 160
			}

			if (var5.length == var4) { // L: 141
				return null; // L: 142
			}

			if (var7 >= '0' && var7 <= '9') { // L: 144
				var7 = (char)(var7 - '0'); // L: 145
			} else {
				if (var7 < 'a' || var7 > 'z') { // L: 147
					return null; // L: 151
				}

				var7 = (char)(var7 - 'W'); // L: 148
			}

			var5[var4++] = (byte)var7; // L: 153
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIS)V",
		garbageValue = "-11714"
	)
	public static void method3349(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 43
			int var4 = (var3 + var2) / 2; // L: 44
			int var5 = var2; // L: 45
			String var6 = var0[var4]; // L: 46
			var0[var4] = var0[var3]; // L: 47
			var0[var3] = var6; // L: 48
			int var7 = var1[var4]; // L: 49
			var1[var4] = var1[var3]; // L: 50
			var1[var3] = var7; // L: 51

			for (int var8 = var2; var8 < var3; ++var8) { // L: 52
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 53
					String var9 = var0[var8]; // L: 54
					var0[var8] = var0[var5]; // L: 55
					var0[var5] = var9; // L: 56
					int var10 = var1[var8]; // L: 57
					var1[var8] = var1[var5]; // L: 58
					var1[var5++] = var10; // L: 59
				}
			}

			var0[var3] = var0[var5]; // L: 63
			var0[var5] = var6; // L: 64
			var1[var3] = var1[var5]; // L: 65
			var1[var5] = var7; // L: 66
			method3349(var0, var1, var2, var5 - 1); // L: 67
			method3349(var0, var1, var5 + 1, var3); // L: 68
		}

	} // L: 70
}
