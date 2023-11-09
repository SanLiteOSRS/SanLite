import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class144 extends class143 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -129467373
	)
	int field1631;
	@ObfuscatedName("an")
	boolean field1630;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class144(class146 var1) {
		this.this$0 = var1;
		this.field1631 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1631 = var1.readUnsignedShort(); // L: 184
		this.field1630 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3202(this.field1631, this.field1630); // L: 189
	} // L: 190

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "81232637"
	)
	public static boolean method3120(int var0) {
		return var0 >= WorldMapDecorationType.field3801.id && var0 <= WorldMapDecorationType.field3810.id || var0 == WorldMapDecorationType.field3802.id; // L: 43
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lgx;III)Lbu;",
		garbageValue = "2128218062"
	)
	public static final PcmPlayer method3119(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) { // L: 57
			if (var2 < 256) { // L: 58
				var2 = 256;
			}

			try {
				PcmPlayer var3 = PcmPlayer.pcmPlayerProvider.player(); // L: 60
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 61
				var3.field271 = var2; // L: 62
				var3.init(); // L: 63
				var3.capacity = (var2 & -1024) + 1024; // L: 64
				if (var3.capacity > 16384) { // L: 65
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 66
				if (class167.field1793 > 0 && PcmPlayer.soundSystem == null) { // L: 67
					PcmPlayer.soundSystem = new SoundSystem(); // L: 68
					class448.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 69
					class448.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 70
				}

				if (PcmPlayer.soundSystem != null) { // L: 72
					if (PcmPlayer.soundSystem.players[var1] != null) { // L: 73
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3; // L: 74
				}

				return var3; // L: 76
			} catch (Throwable var4) { // L: 78
				return new PcmPlayer(); // L: 79
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
