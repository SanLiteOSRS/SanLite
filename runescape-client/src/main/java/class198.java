import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class198 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(CII)Ljava/lang/String;",
		garbageValue = "-2114436646"
	)
	static String method3786(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}
}
