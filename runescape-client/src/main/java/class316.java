import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class316 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "1726171577"
	)
	public static String method5906(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 17
			return "";
		} else if (var2 == 1) { // L: 18
			CharSequence var10 = var0[var1]; // L: 19
			return var10 == null ? "null" : var10.toString(); // L: 20 21
		} else {
			int var3 = var2 + var1; // L: 23
			int var4 = 0; // L: 24

			for (int var5 = var1; var5 < var3; ++var5) { // L: 25
				CharSequence var9 = var0[var5]; // L: 26
				if (var9 == null) { // L: 27
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 28
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 30

			for (int var6 = var1; var6 < var3; ++var6) { // L: 31
				CharSequence var7 = var0[var6]; // L: 32
				if (var7 == null) { // L: 33
					var8.append("null");
				} else {
					var8.append(var7); // L: 34
				}
			}

			return var8.toString(); // L: 36
		}
	}
}
