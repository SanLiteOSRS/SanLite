import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kk")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("o")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("q")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("f")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0;
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("o")
	static double method5536(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4; // L: 10
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 12
		return var6 / var4; // L: 14
	}
}
