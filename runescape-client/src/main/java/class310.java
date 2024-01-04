import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class310 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	static IndexedSprite field3386;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		longValue = 8209621284057925845L
	)
	static long field3388;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "1270605570"
	)
	static int method5938(Widget var0) {
		if (var0.type != 11) { // L: 1561
			--class127.Interpreter_stringStackSize; // L: 1562
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 1563
			return 1; // L: 1564
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1566
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var0.method6677(var1); // L: 1567
			return 1; // L: 1568
		}
	}
}
