import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class261 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1825659571
	)
	static int field2967;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lis;I)V",
		garbageValue = "657439907"
	)
	static final void method5395(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					SecureRandomFuture.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1102761288"
	)
	public static void method5398() {
		Widget.Widget_cachedSprites.clear(); // L: 693
		Widget.Widget_cachedModels.clear(); // L: 694
		Widget.Widget_cachedFonts.clear(); // L: 695
		Widget.Widget_cachedSpriteMasks.clear(); // L: 696
	} // L: 697
}
