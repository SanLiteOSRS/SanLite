import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	field1628(1, 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	field1624(2, 2);

	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -161686761
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1344358763
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IIB)Lbd;",
		garbageValue = "1"
	)
	public static final PcmPlayer method2762(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field428 * 22050 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class26.pcmPlayerProvider.player();
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
				var3.field425 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (PcmPlayer.field418 > 0 && Message.soundSystem == null) {
					Message.soundSystem = new SoundSystem();
					Huffman.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					Huffman.soundSystemExecutor.scheduleAtFixedRate(Message.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (Message.soundSystem != null) {
					if (Message.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					Message.soundSystem.players[var1] = var3;
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
