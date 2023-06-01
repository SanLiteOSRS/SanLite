import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("an")
	String field958;
	@ObfuscatedName("ar")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ab")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("at")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -382562311
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1933922429
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -618671797
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 875705295
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lsc;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lsc;",
		garbageValue = "-2"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 136
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "1287836192"
	)
	static void method2114(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) { // L: 76
			KitDefinition var4 = SpotAnimationDefinition.KitDefinition_get(var3); // L: 77
			if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) { // L: 78
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256; // L: 79
				break;
			}
		}

	} // L: 83

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "324361706"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}
}
