import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class303 {
	@ObfuscatedName("ai")
	static int[] field3379;

	static {
		new Object();
		field3379 = new int[33]; // L: 10
		field3379[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3379[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)V",
		garbageValue = "1521187141"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field603) { // L: 12058
			Client.field717[var0.rootIndex] = true; // L: 12059
		}

	} // L: 12061
}
