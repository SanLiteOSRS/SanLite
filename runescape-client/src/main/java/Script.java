import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("h")
	String field952;
	@ObfuscatedName("w")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("v")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("c")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2052154599
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -470503423
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 303491303
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -130768209
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lpm;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Lpm;",
		garbageValue = "2079737321"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 119
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "420841235"
	)
	static SecureRandom method1936() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgl;I)V",
		garbageValue = "1817853304"
	)
	static final void method1948(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 93
			for (var7 = 0; var7 < 64; ++var7) { // L: 94
				for (var8 = 0; var8 < 64; ++var8) { // L: 95
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 96
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					class92.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 104
				}
			}
		}

	} // L: 108

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "2024494547"
	)
	static int method1947(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3839
			Client.logoutTimer = 250; // L: 3840
			return 1; // L: 3841
		} else if (var0 != 5631 && var0 != 5633) { // L: 3843
			if (var0 == 5632) { // L: 3847
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 26; // L: 3848
				return 1; // L: 3849
			} else {
				return 2; // L: 3851
			}
		} else {
			UserComparator8.Interpreter_stringStackSize -= 2; // L: 3844
			return 1; // L: 3845
		}
	}
}
