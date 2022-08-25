import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Laf;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			class33.RunException_sendStackTrace((String)null, var4);
		}

	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method740(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lkn;Lgb;IIZB)V",
		garbageValue = "8"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10570
		byte var6 = -1; // L: 10571
		String var7 = null; // L: 10572
		if (var5 != null && var5[var3] != null) { // L: 10573
			if (var3 == 0) { // L: 10574
				var6 = 33;
			} else if (var3 == 1) { // L: 10575
				var6 = 34;
			} else if (var3 == 2) { // L: 10576
				var6 = 35;
			} else if (var3 == 3) { // L: 10577
				var6 = 36;
			} else {
				var6 = 37; // L: 10578
			}

			var7 = var5[var3]; // L: 10579
		} else if (var3 == 4) { // L: 10582
			var6 = 37; // L: 10583
			var7 = "Drop"; // L: 10584
		}

		if (var6 != -1 && var7 != null) { // L: 10587
			CollisionMap.method3809(var7, Clock.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4); // L: 10588
		}

	} // L: 10590
}
