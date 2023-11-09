import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1619845116"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1661663667"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("f")
	public static final void method3567(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqc;",
		garbageValue = "-1"
	)
	static class467 method3566(int var0) {
		class467 var1 = (class467)Client.Widget_cachedFonts.get((long)var0); // L: 13401
		if (var1 == null) { // L: 13402
			var1 = new class467(Canvas.field132, var0); // L: 13403
		}

		return var1; // L: 13405
	}
}
