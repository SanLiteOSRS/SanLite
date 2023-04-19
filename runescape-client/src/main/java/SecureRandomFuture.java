import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 1457791911
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("af")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("an")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1244424155"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "85"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "14"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1033120927"
	)
	public static int method2128() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 51
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-86032975"
	)
	public static String method2130(CharSequence var0) {
		String var1 = FloorUnderlayDefinition.base37DecodeLong(class172.method3585(var0));
		if (var1 == null) {
			var1 = "";
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-45"
	)
	public static int method2122(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 72
			boolean var3 = false; // L: 73
			boolean var4 = false; // L: 74
			int var5 = 0; // L: 75
			int var6 = var0.length(); // L: 76

			for (int var7 = 0; var7 < var6; ++var7) { // L: 77
				char var8 = var0.charAt(var7); // L: 78
				if (var7 == 0) { // L: 79
					if (var8 == '-') { // L: 80
						var3 = true; // L: 81
						continue;
					}

					if (var8 == '+') { // L: 84
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 86
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 87
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 88
						throw new NumberFormatException(); // L: 89
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 90
					throw new NumberFormatException();
				}

				if (var3) { // L: 91
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 92
				if (var9 / var1 != var5) { // L: 93
					throw new NumberFormatException();
				}

				var5 = var9; // L: 94
				var4 = true; // L: 95
			}

			if (!var4) { // L: 97
				throw new NumberFormatException();
			} else {
				return var5; // L: 98
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
