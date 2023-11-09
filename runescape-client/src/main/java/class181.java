import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public abstract class class181 {
	@ObfuscatedName("am")
	String field1881;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;Ljava/lang/String;)V"
	)
	class181(class170 var1, String var2) {
		this.this$0 = var1; // L: 353
		this.field1881 = var2; // L: 354
	} // L: 355

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-14721"
	)
	public abstract int vmethod3558();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-768896166"
	)
	public String vmethod3559() {
		return null; // L: 364
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-400866400"
	)
	public int vmethod3560() {
		return -1; // L: 368
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1263481224"
	)
	public String method3563() {
		return this.field1881; // L: 358
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lfz;",
		garbageValue = "1920961056"
	)
	static class137 method3567(int var0) {
		if (class273.method5525(var0) != 0) { // L: 417
			return null; // L: 418
		} else {
			class137 var2 = (class137)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 422
			class137 var1;
			if (var2 != null) { // L: 423
				var1 = var2; // L: 424
			} else {
				AbstractArchive var4 = class333.SequenceDefinition_animationsArchive; // L: 428
				AbstractArchive var5 = class169.SequenceDefinition_skeletonsArchive; // L: 429
				boolean var6 = true; // L: 431
				byte[] var7 = var4.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 432
				class137 var3;
				if (var7 == null) { // L: 433
					var6 = false; // L: 434
					var3 = null; // L: 435
				} else {
					int var8 = (var7[1] & 255) << 8 | var7[2] & 255; // L: 438
					byte[] var9 = var5.getFile(var8, 0); // L: 441
					if (var9 == null) { // L: 442
						var6 = false;
					}

					if (!var6) { // L: 443
						var3 = null; // L: 444
					} else {
						if (SoundCache.field344 == null) { // L: 447
							UserComparator4.field1444 = Runtime.getRuntime().availableProcessors(); // L: 448
							SoundCache.field344 = new ThreadPoolExecutor(0, UserComparator4.field1444, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(UserComparator4.field1444 * 100 + 100), new class203()); // L: 449
						}

						try {
							var3 = new class137(var4, var5, var0, false); // L: 457
						} catch (Exception var11) { // L: 459
							var3 = null; // L: 460
						}
					}
				}

				if (var3 != null) { // L: 464
					SequenceDefinition.SequenceDefinition_cachedModel.put(var3, (long)var0);
				}

				var1 = var3; // L: 465
			}

			return var1; // L: 467
		}
	}
}
