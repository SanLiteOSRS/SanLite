import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class406 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "6"
	)
	public static void method7637(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 292
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 294
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 295
			} catch (Exception var3) { // L: 297
			}
		}

	} // L: 299
}
