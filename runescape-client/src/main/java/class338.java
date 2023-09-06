import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class338 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1953443809
	)
	static int field3816;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2066901929"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = Decimator.getPreferencesFile("", WorldMapSectionType.field2997.name, true); // L: 119
			Buffer var1 = class449.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset); // L: 121
		} catch (Exception var3) { // L: 123
		}

		try {
			if (var0 != null) { // L: 125
				var0.closeSync(true); // L: 126
			}
		} catch (Exception var2) { // L: 129
		}

	} // L: 130

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "1964561165"
	)
	static class137 method6589(int var0) {
		class137 var1 = (class137)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 377
		if (var1 != null) { // L: 378
			return var1;
		} else {
			AbstractArchive var3 = VarpDefinition.SequenceDefinition_animationsArchive; // L: 380
			AbstractArchive var4 = class485.SequenceDefinition_skeletonsArchive; // L: 381
			boolean var5 = true; // L: 383
			byte[] var6 = var3.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 384
			class137 var2;
			if (var6 == null) { // L: 385
				var5 = false; // L: 386
				var2 = null; // L: 387
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 390
				byte[] var8 = var4.getFile(var7, 0); // L: 393
				if (var8 == null) { // L: 394
					var5 = false;
				}

				if (!var5) { // L: 395
					var2 = null; // L: 396
				} else {
					if (class137.field1625 == null) { // L: 399
						class291.field3100 = Runtime.getRuntime().availableProcessors(); // L: 400
						class137.field1625 = new ThreadPoolExecutor(0, class291.field3100, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class291.field3100 * 100 + 100), new class184()); // L: 401
					}

					try {
						var2 = new class137(var3, var4, var0, false); // L: 409
					} catch (Exception var10) { // L: 411
						var2 = null; // L: 412
					}
				}
			}

			if (var2 != null) { // L: 416
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 417
		}
	}
}
