import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class433 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lcj;Lcj;IZB)I",
		garbageValue = "-15"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 212
			int var4 = var0.population; // L: 213
			int var5 = var1.population; // L: 214
			if (!var3) { // L: 215
				if (var4 == -1) { // L: 216
					var4 = 2001;
				}

				if (var5 == -1) { // L: 217
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 219
		} else if (var2 == 2) { // L: 221
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 222
			if (var0.activity.equals("-")) { // L: 223
				if (var1.activity.equals("-")) { // L: 224
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 225
				}
			} else if (var1.activity.equals("-")) { // L: 227
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 228
			}
		} else if (var2 == 4) { // L: 230
			return var0.method1816() ? (var1.method1816() ? 0 : 1) : (var1.method1816() ? -1 : 0);
		} else if (var2 == 5) { // L: 231
			return var0.method1814() ? (var1.method1814() ? 0 : 1) : (var1.method1814() ? -1 : 0);
		} else if (var2 == 6) { // L: 232
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 233
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 234
		}
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-758637940"
	)
	static String method8127(String var0) {
		PlayerType[] var1 = FontName.PlayerType_values(); // L: 12939

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12940
			PlayerType var3 = var1[var2]; // L: 12941
			if (var3.modIcon != -1 && var0.startsWith(class415.method7833(var3.modIcon))) { // L: 12943 12944
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12945
				break;
			}
		}

		return var0; // L: 12952
	}
}
