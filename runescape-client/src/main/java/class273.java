import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class273 {
	@ObfuscatedName("az")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-644224068"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 9
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-939807421"
	)
	public static int method5525(int var0) {
		class137 var2 = (class137)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 355
		class137 var1;
		if (var2 != null) { // L: 356
			var1 = var2; // L: 357
		} else {
			AbstractArchive var4 = class333.SequenceDefinition_animationsArchive; // L: 361
			AbstractArchive var5 = class169.SequenceDefinition_skeletonsArchive; // L: 362
			boolean var6 = true; // L: 364
			byte[] var7 = var4.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 365
			class137 var3;
			if (var7 == null) { // L: 366
				var6 = false; // L: 367
				var3 = null; // L: 368
			} else {
				int var8 = (var7[1] & 255) << 8 | var7[2] & 255; // L: 371
				byte[] var9 = var5.getFile(var8, 0); // L: 374
				if (var9 == null) { // L: 375
					var6 = false;
				}

				if (!var6) { // L: 376
					var3 = null; // L: 377
				} else {
					if (SoundCache.field344 == null) { // L: 380
						UserComparator4.field1444 = Runtime.getRuntime().availableProcessors(); // L: 381
						SoundCache.field344 = new ThreadPoolExecutor(0, UserComparator4.field1444, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(UserComparator4.field1444 * 100 + 100), new class184()); // L: 382
					}

					try {
						var3 = new class137(var4, var5, var0, false); // L: 390
					} catch (Exception var11) { // L: 392
						var3 = null; // L: 393
					}
				}
			}

			if (var3 != null) { // L: 397
				SequenceDefinition.SequenceDefinition_cachedModel.put(var3, (long)var0);
			}

			var1 = var3; // L: 398
		}

		if (var1 == null) { // L: 401
			return 2; // L: 402
		} else {
			return var1.method3056() ? 0 : 1; // L: 404
		}
	}
}
