import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qq")
public class class429 {
	@ObfuscatedName("az")
	@Export("writeRandomDat")
	public static void writeRandomDat(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		if (var2 == var0) { // L: 14
			if (var3 == var1) { // L: 15
				return;
			}

			if (var3 > var1 && var3 < var4 + var1) { // L: 16
				--var4; // L: 17
				var1 += var4; // L: 18
				var3 += var4; // L: 19
				var4 = var1 - var4; // L: 20

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) { // L: 21 22 30
					var2[var3--] = var0[var1--]; // L: 23
					var2[var3--] = var0[var1--]; // L: 24
					var2[var3--] = var0[var1--]; // L: 25
					var2[var3--] = var0[var1--]; // L: 26
					var2[var3--] = var0[var1--]; // L: 27
					var2[var3--] = var0[var1--]; // L: 28
					var2[var3--] = var0[var1--]; // L: 29
				}

				for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) { // L: 32 33
				}

				return; // L: 34
			}
		}

		var4 += var1; // L: 37

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) { // L: 38 39 47
			var2[var3++] = var0[var1++]; // L: 40
			var2[var3++] = var0[var1++]; // L: 41
			var2[var3++] = var0[var1++]; // L: 42
			var2[var3++] = var0[var1++]; // L: 43
			var2[var3++] = var0[var1++]; // L: 44
			var2[var3++] = var0[var1++]; // L: 45
			var2[var3++] = var0[var1++]; // L: 46
		}

		for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) { // L: 49 50
		}

	} // L: 51

	@ObfuscatedName("al")
	@Export("clearIntArray")
	public static void clearIntArray(int[] var0, int var1, int var2) {
		for (var2 = var2 + var1 - 7; var1 < var2; var0[var1++] = 0) { // L: 366 367 375
			var0[var1++] = 0; // L: 368
			var0[var1++] = 0; // L: 369
			var0[var1++] = 0; // L: 370
			var0[var1++] = 0; // L: 371
			var0[var1++] = 0; // L: 372
			var0[var1++] = 0; // L: 373
			var0[var1++] = 0; // L: 374
		}

		for (var2 += 7; var1 < var2; var0[var1++] = 0) { // L: 377 378
		}

	} // L: 379

	@ObfuscatedName("as")
	public static void method7866(int[] var0, int var1, int var2, int var3) {
		if (var2 == 0 && var3 == 0) { // L: 382
			var2 = (int)(Math.random() * 2.147483647E9D); // L: 383
			var3 = (int)(Math.random() * 2.147483647E9D); // L: 384
		}

		long var4 = (long)var2 << 32 | (long)var3; // L: 386
		Random var6 = new Random(var4); // L: 387

		for (int var7 = var1 - 1; var7 > 0; --var7) { // L: 388
			int var8 = var6.nextInt(var7 + 1); // L: 389
			if (var7 != var8) { // L: 390
				int var9 = var0[var7]; // L: 391
				var0[var7] = var0[var8]; // L: 392
				var0[var8] = var9; // L: 393
			}
		}

	} // L: 396
}
