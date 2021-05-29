import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public abstract class class214 implements class216 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1948210145
	)
	protected int field2558;

	@ObfuscatedSignature(
		descriptor = "(Ljd;Lkk;I)V"
	)
	protected class214(StudioGame var1, Language var2, int var3) {
		this.field2558 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-592432279"
	)
	static int method4280(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			++Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				++Interpreter.Interpreter_stringStackSize;
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				return 2;
			} else {
				++class44.Interpreter_intStackSize;
				return 1;
			}
		} else {
			++class44.Interpreter_intStackSize;
			return 1;
		}
	}
}
