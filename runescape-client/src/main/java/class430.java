import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class430 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfu;",
		garbageValue = "24"
	)
	static class138 method8064(int var0) {
		class138 var1 = (class138)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 406
		if (var1 != null) { // L: 407
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 409
			AbstractArchive var4 = class332.SequenceDefinition_skeletonsArchive; // L: 410
			boolean var5 = true; // L: 412
			byte[] var6 = var3.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 413
			class138 var2;
			if (var6 == null) { // L: 414
				var5 = false; // L: 415
				var2 = null; // L: 416
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 419
				byte[] var8 = var4.getFile(var7, 0); // L: 422
				if (var8 == null) { // L: 423
					var5 = false;
				}

				if (!var5) { // L: 424
					var2 = null; // L: 425
				} else {
					if (class18.field85 == null) { // L: 428
						class74.field897 = Runtime.getRuntime().availableProcessors(); // L: 429
						class18.field85 = new ThreadPoolExecutor(0, class74.field897, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class74.field897 * 100 + 100), new class169()); // L: 430
					}

					try {
						var2 = new class138(var3, var4, var0, false); // L: 438
					} catch (Exception var10) { // L: 440
						var2 = null; // L: 441
					}
				}
			}

			if (var2 != null) { // L: 445
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 446
		}
	}
}
