import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1601207256"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-899951936"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lor;I)I",
		garbageValue = "1582881421"
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

			var7 = CollisionMap.method4148(var9); // L: 33
			var8 = CollisionMap.method4148(var10); // L: 34
			var9 = WorldMapArea.standardizeChar(var9, var2); // L: 35
			var10 = WorldMapArea.standardizeChar(var10, var2); // L: 36
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var10 != var9) { // L: 40
					return class17.lowercaseChar(var9, var2) - class17.lowercaseChar(var10, var2);
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
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) {
					return class17.lowercaseChar(var11, var2) - class17.lowercaseChar(var12, var2); // L: 55
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
					return class17.lowercaseChar(var12, var2) - class17.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1317821363"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 148
	}
}
