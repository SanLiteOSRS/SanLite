import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class323 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	static final class323 field3796;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	static final class323 field3795;
	@ObfuscatedName("l")
	static int[][] field3794;
	@ObfuscatedName("dk")
	static boolean field3800;
	@ObfuscatedName("ia")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1383488693
	)
	final int field3799;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2026109407
	)
	final int field3797;

	static {
		field3796 = new class323(51, 27, 800, 0, 16, 16); // L: 29
		field3795 = new class323(25, 28, 800, 656, 40, 40); // L: 30
	}

	class323(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3799 = var5; // L: 39
		this.field3797 = var6; // L: 40
	} // L: 41
}
