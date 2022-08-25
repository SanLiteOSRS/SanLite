import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("s")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("h")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("w")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbz;",
		garbageValue = "8"
	)
	static Script method5465(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 52
		if (var2 != null) { // L: 53
			return var2; // L: 54
		} else {
			String var3 = String.valueOf(var0); // L: 56
			int var4 = SequenceDefinition.archive12.getGroupId(var3); // L: 57
			if (var4 == -1) { // L: 58
				return null; // L: 59
			} else {
				byte[] var5 = SequenceDefinition.archive12.takeFileFlat(var4); // L: 61
				if (var5 != null) { // L: 62
					if (var5.length <= 1) { // L: 63
						return null; // L: 64
					}

					var2 = class21.newScript(var5); // L: 66
					if (var2 != null) { // L: 67
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 68
						return var2; // L: 69
					}
				}

				return null; // L: 72
			}
		}
	}
}
