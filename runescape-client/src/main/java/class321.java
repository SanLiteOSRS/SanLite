import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public final class class321 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "32"
	)
	public static byte[] method6430() {
		byte[] var0 = new byte[24]; // L: 68

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 70
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 71

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 72 73 74
			}

			if (var1 >= 24) { // L: 76
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 79
				var0[var2] = -1;
			}
		}

		return var0; // L: 81
	}
}
