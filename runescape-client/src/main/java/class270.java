import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class270 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)V",
		garbageValue = "-2097032346"
	)
	public static void method5370(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lbt;Lbt;IZI)I",
		garbageValue = "2003112674"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1727() ? (var1.method1727() ? 0 : 1) : (var1.method1727() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1729() ? (var1.method1729() ? 0 : 1) : (var1.method1729() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-8"
	)
	public static int method5371(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 98
		return (var0 + var2) / var1 - var2; // L: 99
	}
}
