import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class93 {
	@ObfuscatedName("f")
	public static final int method2186(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var14 + var16 * 6.0D * (var12 - var14);
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var16);
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var14 + (var12 - var14) * 6.0D * var0;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var14 + (var12 - var14) * 6.0D * var20;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lda;III)Lbq;",
		garbageValue = "225550567"
	)
	public static final PcmPlayer method2187(TaskHandler var0, int var1, int var2) {
		if (class341.field3921 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = FontName.pcmPlayerProvider.player();
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
				var3.field403 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (UserComparator1.field4220 > 0 && Login.soundSystem == null) {
					Login.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(Login.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (Login.soundSystem != null) {
					if (Login.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					Login.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
