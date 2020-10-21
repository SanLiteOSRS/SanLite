import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public final class class299 {
	@ObfuscatedName("f")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("b")
	static long[] field3678;
	@ObfuscatedName("c")
	static byte[][][] field3679;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field3678 = new long[12];

		for (int var0 = 0; var0 < field3678.length; ++var0) {
			field3678[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BIII)Ljava/lang/String;",
		garbageValue = "1354932272"
	)
	public static String method5418(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class300.field3686[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class300.field3686[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class300.field3686[(var6 & 15) << 2 | var7 >>> 6]).append(class300.field3686[var7 & 63]);
				} else {
					var3.append(class300.field3686[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class300.field3686[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}
}
