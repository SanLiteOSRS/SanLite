import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("StudioGame")
public enum StudioGame implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("az")
	@Export("name")
	public final String name;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1820413047
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lon;I)I",
		garbageValue = "-1695354605"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = class359.method6815(var9); // L: 33
			var8 = class359.method6815(var10); // L: 34
			var9 = PlayerComposition.standardizeChar(var9, var2); // L: 35
			var10 = PlayerComposition.standardizeChar(var10, var2); // L: 36
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var9 != var10) { // L: 40
					return class59.lowercaseChar(var9, var2) - class59.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var11 != var12) {
					return class59.lowercaseChar(var11, var2) - class59.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var13 != var12) { // L: 63
					return class59.lowercaseChar(var12, var2) - class59.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}
}
