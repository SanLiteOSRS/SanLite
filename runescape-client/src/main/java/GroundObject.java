import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2013789607
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -562400569
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1934622720
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -7416437096913740991L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 416833439
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-2024995343"
	)
	public static int method4358(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 21
		int var4 = var1; // L: 22

		for (int var5 = 0; var5 < var3; ++var5) { // L: 23
			char var6 = var2.charAt(var5); // L: 24
			if (var6 <= 127) { // L: 25
				var0[var4++] = (byte)var6; // L: 26
			} else if (var6 <= 2047) { // L: 28
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 29
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 30
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 33
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 34
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 35
			}
		}

		return var4 - var1; // L: 38
	}
}
