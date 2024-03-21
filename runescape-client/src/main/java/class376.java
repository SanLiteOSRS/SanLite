import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class376 extends DualNode {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field4387;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	Archive field4385;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1831422623
	)
	int field4384;
	@ObfuscatedName("al")
	byte field4386;

	class376() {
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "634448861"
	)
	static String method7101(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 116
			if (var2 && var0 >= 0) { // L: 117
				int var3 = 2; // L: 118

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 119 120 122
					var4 /= var1; // L: 121
				}

				char[] var5 = new char[var3]; // L: 124
				var5[0] = '+'; // L: 125

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 126
					int var7 = var0; // L: 127
					var0 /= var1; // L: 128
					int var8 = var7 - var0 * var1; // L: 129
					if (var8 >= 10) { // L: 130
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 131
					}
				}

				return new String(var5); // L: 133
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
