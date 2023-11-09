import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class128 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class128 field1523;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class128 field1534;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class128 field1524;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class128 field1525;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class128 field1526;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class128 field1527;
	@ObfuscatedName("ax")
	public static short[] field1529;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 21441505
	)
	static int field1533;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1075805337
	)
	final int field1528;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -659778275
	)
	final int field1522;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 669676889
	)
	final int field1530;

	static {
		field1523 = new class128(0, 0, (String)null, 0); // L: 14
		field1534 = new class128(1, 1, (String)null, 9); // L: 15
		field1524 = new class128(2, 2, (String)null, 3); // L: 16
		field1525 = new class128(3, 3, (String)null, 6); // L: 17
		field1526 = new class128(4, 4, (String)null, 1); // L: 18
		field1527 = new class128(5, 5, (String)null, 3); // L: 19
	}

	class128(int var1, int var2, String var3, int var4) {
		this.field1528 = var1; // L: 29
		this.field1522 = var2; // L: 30
		this.field1530 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1522; // L: 46
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1814624795"
	)
	int method3006() {
		return this.field1530; // L: 41
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lge;IIB)Lbd;",
		garbageValue = "25"
	)
	public static final PcmPlayer method3014(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field292 == 0) { // L: 52
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = Script.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[(ChatChannel.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 57
				var3.field285 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (TileItem.field1314 > 0 && class291.soundSystem == null) { // L: 63
					class291.soundSystem = new SoundSystem(); // L: 64
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class291.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (class291.soundSystem != null) { // L: 68
					if (class291.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					class291.soundSystem.players[var1] = var3; // L: 70
				}

				return var3; // L: 72
			} catch (Throwable var4) { // L: 74
				return new PcmPlayer(); // L: 75
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
