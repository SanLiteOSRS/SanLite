import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class302 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static final class302 field3557;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static final class302 field3555;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1939248573
	)
	final int field3556;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -564188455
	)
	final int field3554;

	static {
		field3557 = new class302(51, 27, 800, 0, 16, 16);
		field3555 = new class302(25, 28, 800, 656, 40, 40);
	}

	class302(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3556 = var5;
		this.field3554 = var6;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)I",
		garbageValue = "0"
	)
	static int method5773(Widget var0) {
		if (var0.type != 11) {
			--ChatChannel.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var0.method5663(var1);
			return 1;
		}
	}
}
