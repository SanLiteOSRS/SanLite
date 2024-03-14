import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -60125901
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("aw")
	String field1028;
	@ObfuscatedName("al")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ai")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ar")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 975929733
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1886750317
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -107184905
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1363295215
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lta;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[Lta;",
		garbageValue = "-1377003092"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 132
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1836660217"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-22"
	)
	static int method2242(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 81
			boolean var3 = false; // L: 82
			boolean var4 = false; // L: 83
			int var5 = 0; // L: 84
			int var6 = var0.length(); // L: 85

			for (int var7 = 0; var7 < var6; ++var7) { // L: 86
				char var8 = var0.charAt(var7); // L: 87
				if (var7 == 0) { // L: 88
					if (var8 == '-') { // L: 89
						var3 = true; // L: 90
						continue;
					}

					if (var8 == '+') { // L: 93
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 95
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 96
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 97
						throw new NumberFormatException(); // L: 98
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 99
					throw new NumberFormatException();
				}

				if (var3) { // L: 100
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 101
				if (var9 / var1 != var5) { // L: 102
					throw new NumberFormatException();
				}

				var5 = var9; // L: 103
				var4 = true; // L: 104
			}

			if (!var4) { // L: 106
				throw new NumberFormatException();
			} else {
				return var5; // L: 107
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "63250644"
	)
	static void method2240() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 70

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 71
			var1.clearIsFromIgnored(); // L: 73
		}

	} // L: 76
}
