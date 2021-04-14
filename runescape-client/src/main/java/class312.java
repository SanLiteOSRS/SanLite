import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class312 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-92832695"
	)
	static final int method5606(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
