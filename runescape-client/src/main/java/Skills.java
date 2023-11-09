import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("q")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("f")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static Buffer field3568;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive7")
	static Archive archive7;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16
}
