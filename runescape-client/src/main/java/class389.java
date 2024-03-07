import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class389 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field4480;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field4477;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field4478;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field4476;

	static {
		field4480 = new class389(); // L: 4
		field4477 = new class389(); // L: 5
		field4478 = new class389(); // L: 6
		field4476 = new class389(); // L: 7
	}

	class389() {
	} // L: 9

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-10"
	)
	static void method7345(String[] var0, int[] var1, int var2, int var3) {
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
			method7345(var0, var1, var2, var5 - 1); // L: 67
			method7345(var0, var1, var5 + 1, var3); // L: 68
		}

	} // L: 70
}
