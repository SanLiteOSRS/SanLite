import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class19 implements Callable {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 332696567
	)
	public static int field99;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field94;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final class10 field96;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Law;Lau;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field96 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field96.method84()) { // L: 53
				BuddyRankComparator.method2992(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field96.method85(); // L: 60
	}

	@ObfuscatedName("am")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (0L == var0 % 37L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class404.base37Table[(int)(var6 - var0 * 37L)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "9"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5767
		int var4 = var1 >> 7; // L: 5768
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5769
			int var5 = var2; // L: 5770
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5771
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5772
			int var7 = var1 & 127; // L: 5773
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5774
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5775
			return var7 * var9 + var8 * (128 - var7) >> 7; // L: 5776
		} else {
			return 0;
		}
	}
}
