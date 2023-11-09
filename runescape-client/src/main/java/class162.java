import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class162 extends class165 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1686330275
	)
	int field1762;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;Ljava/lang/String;I)V"
	)
	class162(class155 var1, String var2, int var3) {
		super(var1, var2); // L: 354
		this.this$0 = var1; // L: 353
		this.field1762 = var3; // L: 355
	} // L: 356

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2051475580"
	)
	public int vmethod3237() {
		return 0; // L: 359
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1570944667"
	)
	public int vmethod3239() {
		return this.field1762; // L: 364
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lfu;IIB)Laf;",
		garbageValue = "0"
	)
	public static final PcmPlayer method3227(TaskHandler var0, int var1, int var2) {
		if (class344.field4152 * -449918071 == 0) { // L: 49
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 50
			if (var2 < 256) { // L: 51
				var2 = 256;
			}

			try {
				PcmPlayer var3 = GrandExchangeOfferTotalQuantityComparator.pcmPlayerProvider.player(); // L: 53
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 54
				var3.field300 = var2; // L: 55
				var3.init(); // L: 56
				var3.capacity = (var2 & -1024) + 1024; // L: 57
				if (var3.capacity > 16384) { // L: 58
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 59
				if (PcmPlayer.field279 > 0 && TaskHandler.soundSystem == null) { // L: 60
					TaskHandler.soundSystem = new SoundSystem(); // L: 61
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 62
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(TaskHandler.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 63
				}

				if (TaskHandler.soundSystem != null) { // L: 65
					if (TaskHandler.soundSystem.players[var1] != null) { // L: 66
						throw new IllegalArgumentException();
					}

					TaskHandler.soundSystem.players[var1] = var3; // L: 67
				}

				return var3; // L: 69
			} catch (Throwable var4) { // L: 71
				return new PcmPlayer(); // L: 72
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
