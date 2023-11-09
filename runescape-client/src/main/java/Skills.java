import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("an")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("ar")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "-2004457338"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 270
		if (var0.sound != null) { // L: 271
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 272
		}

	} // L: 273

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "640554843"
	)
	static int method6637(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5043
			int var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5044
			ObjectComposition var4 = class59.getObjectDefinition(var3); // L: 5045
			Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5046
			return 1; // L: 5047
		} else {
			return 2; // L: 5049
		}
	}
}
