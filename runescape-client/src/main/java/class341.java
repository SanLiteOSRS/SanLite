import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class341 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 261261351
	)
	public int field3643;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 274020819
	)
	public int field3639;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2037693281
	)
	public int field3640;

	class341() {
	} // L: 8

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-136286102"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11282
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11283
				int var2 = Client.method1763(var0, var1); // L: 11284
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11285
				if (var0.cs1Comparisons[var1] == 2) { // L: 11286
					if (var2 >= var3) { // L: 11287
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11289
					if (var2 <= var3) { // L: 11290
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11292
					if (var2 == var3) { // L: 11293
						return false;
					}
				} else if (var2 != var3) { // L: 11295
					return false;
				}
			}

			return true; // L: 11297
		}
	}
}
