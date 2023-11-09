import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 943663449
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2002661055
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 457828051
	)
	int field1366;

	TileItem() {
		this.field1366 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "11584"
	)
	void method2674(int var1) {
		this.field1366 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected final Model getModel() {
		return InvDefinition.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1782436453"
	)
	boolean method2673(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1366 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgh;III)Lbb;",
		garbageValue = "881365546"
	)
	public static final PcmPlayer method2684(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field293 == 0) { // L: 52
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = GroundObject.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 57
				var3.field303 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (PcmPlayer.field296 > 0 && Canvas.soundSystem == null) { // L: 63
					Canvas.soundSystem = new SoundSystem(); // L: 64
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(Canvas.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (Canvas.soundSystem != null) { // L: 68
					if (Canvas.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					Canvas.soundSystem.players[var1] = var3; // L: 70
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
