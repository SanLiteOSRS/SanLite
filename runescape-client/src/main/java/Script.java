import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ay")
	static int[] field1008;
	@ObfuscatedName("al")
	String field1004;
	@ObfuscatedName("ak")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ax")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ao")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1799598971
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1300060503
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1220003295
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1530472731
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Ltp;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[Ltp;",
		garbageValue = "-902364502"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 124
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1816632175"
	)
	static void method2215(boolean var0) {
		if (var0) { // L: 253
			class74.method2113(); // L: 254
		} else {
			for (int var1 = 0; var1 < class319.field3433.size(); ++var1) { // L: 257
				class331 var2 = (class331)class319.field3433.get(var1); // L: 258
				if (var2 == null) { // L: 259
					class319.field3433.remove(var1); // L: 260
					--var1; // L: 261
				} else if (var2.field3550) { // L: 263
					if (var2.field3538.field3450 > 0) { // L: 264
						--var2.field3538.field3450; // L: 265
					}

					var2.field3538.clear(); // L: 267
					var2.field3538.method6044(); // L: 268
					var2.field3538.setPcmStreamVolume(0); // L: 269
					class319.field3433.remove(var1); // L: 270
					--var1; // L: 271
				} else {
					var2.field3550 = true; // L: 274
				}
			}
		}

	} // L: 278
}
