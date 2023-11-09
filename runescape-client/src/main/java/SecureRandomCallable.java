import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 48
		var2.nextInt(); // L: 49
		return var2; // L: 52
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "23"
	)
	static int method2214(int var0, int var1) {
		if (var0 == -2) { // L: 65
			return 12345678;
		} else if (var0 == -1) { // L: 66
			if (var1 < 0) { // L: 67
				var1 = 0; // L: 68
			} else if (var1 > 127) { // L: 70
				var1 = 127;
			}

			var1 = 127 - var1; // L: 73
			return var1; // L: 74
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 76
			if (var1 < 2) { // L: 77
				var1 = 2;
			} else if (var1 > 126) { // L: 78
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 79
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	public static void method2210() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 43
	} // L: 44

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1602230035"
	)
	public static void method2215() {
		class495.DBRowType_cache.clear(); // L: 71
	} // L: 72
}
