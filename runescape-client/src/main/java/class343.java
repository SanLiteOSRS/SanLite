import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class343 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-73"
	)
	static final int method6251(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
