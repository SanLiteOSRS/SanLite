import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ah")
	String field974;
	@ObfuscatedName("ar")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ao")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ab")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 565206857
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -632319623
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1783875249
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1750348567
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Ltz;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)[Ltz;",
		garbageValue = "714760120"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 132
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "1142322479"
	)
	static boolean method2228(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 44
			boolean var3 = false; // L: 45
			boolean var4 = false; // L: 46
			int var5 = 0; // L: 47
			int var6 = var0.length(); // L: 48

			for (int var7 = 0; var7 < var6; ++var7) { // L: 49
				char var8 = var0.charAt(var7); // L: 50
				if (var7 == 0) { // L: 51
					if (var8 == '-') { // L: 52
						var3 = true; // L: 53
						continue;
					}

					if (var8 == '+') { // L: 56
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 58
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 59
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 60
						return false; // L: 61
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 62
					return false;
				}

				if (var3) { // L: 63
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 64
				if (var9 / var1 != var5) { // L: 65
					return false;
				}

				var5 = var9; // L: 66
				var4 = true; // L: 67
			}

			return var4; // L: 69
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
