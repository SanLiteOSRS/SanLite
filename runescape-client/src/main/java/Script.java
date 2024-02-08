import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ap")
	String field979;
	@ObfuscatedName("af")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("aj")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("aq")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -165630961
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1498866603
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 634248277
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1186762681
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Ltb;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)[Ltb;",
		garbageValue = "-1812104264"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 124
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhi;",
		garbageValue = "0"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 21
			var1 = new StructComposition(); // L: 22
			if (var2 != null) { // L: 23
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 24
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "538407903"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 72
		if (var1 != null) { // L: 73
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 74
			var1 = new NPCComposition(); // L: 75
			var1.id = var0; // L: 76
			if (var2 != null) { // L: 77
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 78
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 79
			return var1; // L: 80
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CLol;I)I",
		garbageValue = "-885374361"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}
}
