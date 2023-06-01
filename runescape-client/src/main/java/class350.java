import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public enum class350 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4201(-1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4198(0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4199(1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4200(2);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 206645297
	)
	final int field4203;

	class350(int var3) {
		this.field4203 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4203; // L: 20
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "615497483"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 152
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "2094900164"
	)
	static int method6650(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5061
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class10.method89() ? 1 : 0; // L: 5062
			return 1; // L: 5063
		} else {
			return 2; // L: 5065
		}
	}
}
