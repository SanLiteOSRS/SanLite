import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -6496299108672843091L
	)
	@Export("lastTimeNano")
	long lastTimeNano;

	NanoClock() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "208275261"
	)
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-16016139"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = 1000000L * (long)var2;
		long var5 = this.lastTimeNano - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		class227.method4180(var5 / 1000000L);
		long var7 = System.nanoTime();

		int var9;
		for (var9 = 0; var9 < 10 && (var9 < 1 || this.lastTimeNano < var7); this.lastTimeNano += 1000000L * (long)var1) {
			++var9;
		}

		if (this.lastTimeNano < var7) {
			this.lastTimeNano = var7;
		}

		return var9;
	}
}
