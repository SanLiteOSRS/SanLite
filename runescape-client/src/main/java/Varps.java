import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("aq")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("al")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ai")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	static SpritePixels field3615;

	static {
		Varps_masks = new int[32]; // L: 7
		int var0 = 2; // L: 10

		for (int var1 = 0; var1 < 32; ++var1) { // L: 11
			Varps_masks[var1] = var0 - 1; // L: 12
			var0 += var0; // L: 13
		}

		Varps_temp = new int[5000]; // L: 18
		Varps_main = new int[5000]; // L: 19
	}
}
