import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 1898335151
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 948213115
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -11342859
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1573020907
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1865716341
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1858521173
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ax")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1383742087
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5; // L: 17
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-613922372"
	)
	public static String method4908(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class216.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}
}
