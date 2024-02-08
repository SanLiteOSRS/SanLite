import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class174 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("archive7")
	static EvictingDualNodeHashTable archive7;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	static {
		archive7 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "0"
	)
	static int method3571(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5149
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class243.method4937() ? 1 : 0; // L: 5150
			return 1; // L: 5151
		} else {
			return 2; // L: 5153
		}
	}
}
