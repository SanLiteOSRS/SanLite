import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ay")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("an")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ar")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("ac")
	static int[] field3509;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive18")
	static Archive archive18;

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
}
