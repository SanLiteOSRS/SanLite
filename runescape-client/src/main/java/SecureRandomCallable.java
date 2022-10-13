import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return class9.method74(); // L: 46
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1604405350"
	)
	static int method2203(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1053
			if (var1 <= var0 + 30) { // L: 1054
				return var2; // L: 1055
			}

			var0 += 30; // L: 1057
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1058
		}

		return 0; // L: 1060
	}
}
