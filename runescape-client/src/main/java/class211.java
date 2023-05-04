import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class211 {
	@ObfuscatedName("aw")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("ac")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("al")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("at")
	@Export("bufferY")
	static int[] bufferY;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;IZI)Lfh;",
		garbageValue = "1641739959"
	)
	public static class133 method4301(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
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
				if (class374.field4387 == null) { // L: 44
					class133.field1593 = Runtime.getRuntime().availableProcessors(); // L: 45
					class374.field4387 = new ThreadPoolExecutor(0, class133.field1593, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class133.field1593 * 100 + 100), new class130()); // L: 46
				}

				try {
					return new class133(var0, var1, var2, var3); // L: 54
				} catch (Exception var9) { // L: 56
					return null; // L: 57
				}
			}
		}
	}
}
