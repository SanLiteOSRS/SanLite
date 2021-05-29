import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -87747295156547195L
	)
	@Export("lastTimeNano")
	long lastTimeNano;

	public NanoClock() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1887937791"
	)
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1841090229"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = (long)var2 * 1000000L;
		long var5 = this.lastTimeNano - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		long var7 = var5 / 1000000L;
		long var9;
		if (var7 > 0L) {
			if (var7 % 10L == 0L) {
				var9 = var7 - 1L;

				try {
					Thread.sleep(var9);
				} catch (InterruptedException var16) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var15) {
				}
			} else {
				try {
					Thread.sleep(var7);
				} catch (InterruptedException var14) {
				}
			}
		}

		var9 = System.nanoTime();

		int var13;
		for (var13 = 0; var13 < 10 && (var13 < 1 || this.lastTimeNano < var9); this.lastTimeNano += 1000000L * (long)var1) {
			++var13;
		}

		if (this.lastTimeNano < var9) {
			this.lastTimeNano = var9;
		}

		return var13;
	}
}
