import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hb")
public class class231 {
	@ObfuscatedName("f")
	static int[] field2817;
	@ObfuscatedName("o")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;

	static {
		new Object();
		field2817 = new int[33];
		field2817[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2817[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
