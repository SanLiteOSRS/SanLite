import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class384 {
	@ObfuscatedName("ah")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;

	static {
		new HashMap();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-1133509454"
	)
	public static double[] method7186(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 9
		double[] var6 = new double[var5]; // L: 10
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2; // L: 17
			double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 19
			double var11 = var13 / var2; // L: 21
			var6[var8] = var11; // L: 23
			++var7; // L: 11
		}

		return var6; // L: 25
	}
}
