import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lrq;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "982885700"
	)
	static char method3483(char var0) {
		switch(var0) { // L: 94
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 108
		case '#':
		case '[':
		case ']':
			return var0; // L: 121
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 139
		case 'Ç':
		case 'ç':
			return 'c'; // L: 126
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 117
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 163
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 156
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 150
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 103
		case 'ß':
			return 'b'; // L: 128
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 153
		default:
			return Character.toLowerCase(var0); // L: 123
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)Z",
		garbageValue = "126902740"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10660
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10661
				int var2 = Language.method6661(var0, var1); // L: 10662
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10663
				if (var0.cs1Comparisons[var1] == 2) { // L: 10664
					if (var2 >= var3) { // L: 10665
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10667
					if (var2 <= var3) { // L: 10668
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10670
					if (var3 == var2) { // L: 10671
						return false;
					}
				} else if (var2 != var3) { // L: 10673
					return false;
				}
			}

			return true; // L: 10675
		}
	}
}
