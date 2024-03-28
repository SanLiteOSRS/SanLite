import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -237699939
	)
	static int field2905;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("af")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 49
			if (0L == var0 % 37L) { // L: 50
				return null;
			} else {
				int var2 = 0; // L: 51

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 52 53 55
					++var2; // L: 54
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 57 58 67
					long var6 = var0; // L: 59
					var0 /= 37L; // L: 60
					var8 = class408.base37Table[(int)(var6 - 37L * var0)]; // L: 61
					if (var8 == '_') { // L: 62
						int var9 = var5.length() - 1; // L: 63
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 64
						var8 = 160; // L: 65
					}
				}

				var5.reverse(); // L: 69
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 70
				return var5.toString(); // L: 71
			}
		} else {
			return null;
		}
	}
}
