import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("aj")
	String field985;
	@ObfuscatedName("ac")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("aw")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ay")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 958411449
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -352160961
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2039149673
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -432536405
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lsw;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lsw;",
		garbageValue = "0"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 132
	}
}
