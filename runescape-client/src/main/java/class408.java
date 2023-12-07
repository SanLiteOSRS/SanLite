import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class408 {
	@ObfuscatedName("at")
	public char field4509;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1715000515
	)
	public int field4508;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -969780909
	)
	public int field4507;

	class408() {
		this.field4508 = 0; // L: 5
		this.field4507 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ltu;I)Ljava/lang/Object;",
		garbageValue = "-458356510"
	)
	static Object method7657(class514 var0) {
		if (var0 == null) { // L: 5347
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5348
		} else {
			switch(var0.field5060) { // L: 5350
			case 0:
				return Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5356
			case 2:
				return Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 5354
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5352
			}
		}
	}
}
