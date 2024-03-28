import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 10
				PcmPlayer var2 = this.players[var1]; // L: 11
				if (var2 != null) { // L: 12
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 15
			class180.RunException_sendStackTrace((String)null, var4); // L: 16
		}

	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1240103721"
	)
	static final int method817(int var0, int var1) {
		if (var0 == -2) { // L: 1022
			return 12345678;
		} else if (var0 == -1) { // L: 1023
			if (var1 < 2) {
				var1 = 2; // L: 1024
			} else if (var1 > 126) { // L: 1025
				var1 = 126;
			}

			return var1; // L: 1026
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1028
			if (var1 < 2) { // L: 1029
				var1 = 2;
			} else if (var1 > 126) { // L: 1030
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1031
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)Z",
		garbageValue = "-5"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11306
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11307
				int var2 = class147.method3173(var0, var1); // L: 11308
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11309
				if (var0.cs1Comparisons[var1] == 2) { // L: 11310
					if (var2 >= var3) { // L: 11311
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11313
					if (var2 <= var3) { // L: 11314
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11316
					if (var2 == var3) { // L: 11317
						return false;
					}
				} else if (var3 != var2) { // L: 11319
					return false;
				}
			}

			return true; // L: 11321
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)Ljava/lang/String;",
		garbageValue = "-66"
	)
	static String method819(Widget var0, int var1) {
		int var3 = class33.getWidgetFlags(var0); // L: 12814
		boolean var2 = (var3 >> var1 + 1 & 1) != 0; // L: 12816
		if (!var2 && var0.onOp == null) { // L: 12818
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 12819 12820 12822
		}
	}
}
