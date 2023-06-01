import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
final class class305 implements ThreadFactory {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load"); // L: 158
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;IZI)Lfx;",
		garbageValue = "2002452428"
	)
	public static class137 method5811(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 32
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 33
		if (var5 == null) { // L: 34
			var4 = false; // L: 35
			return null; // L: 36
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 38
			byte[] var7;
			if (var3) { // L: 40
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0); // L: 41
			}

			if (var7 == null) { // L: 42
				var4 = false;
			}

			if (!var4) { // L: 43
				return null;
			} else {
				if (IgnoreList.field4582 == null) { // L: 44
					AbstractSocket.field4629 = Runtime.getRuntime().availableProcessors(); // L: 45
					IgnoreList.field4582 = new ThreadPoolExecutor(0, AbstractSocket.field4629, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(AbstractSocket.field4629 * 100 + 100), new class134()); // L: 46
				}

				try {
					return new class137(var0, var1, var2, var3); // L: 54
				} catch (Exception var9) { // L: 56
					return null; // L: 57
				}
			}
		}
	}
}
