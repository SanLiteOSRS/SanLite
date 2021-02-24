import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("v")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("d")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("c")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1015685997
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 890706765
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1256074133
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 564204905
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "[Llg;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(II)[Llg;",
		garbageValue = "-1286467611"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
