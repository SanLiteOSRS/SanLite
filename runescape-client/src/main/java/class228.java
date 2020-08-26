import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class228 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-541975328"
	)
	public static int method4190(CharSequence var0, int var1) {
		return UserComparator7.parseIntCustomRadix(var0, var1, true);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)I",
		garbageValue = "1840634740"
	)
	public static int method4189(String var0) {
		return var0.length() + 2;
	}
}
