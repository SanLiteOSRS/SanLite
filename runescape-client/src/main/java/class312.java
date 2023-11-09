import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class312 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("huffman")
	public static Huffman huffman;
	@ObfuscatedName("t")
	static int[][][] field3717;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "-99"
	)
	public static String method6382(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}
}
