import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public final class class4 {
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -669055616
	)
	static int field7;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)Lcv;",
		garbageValue = "-53"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 80
		Buffer var2 = new Buffer(var0); // L: 81
		var2.offset = var2.array.length - 2; // L: 82
		int var3 = var2.readUnsignedShort(); // L: 83
		int var4 = var2.array.length - 2 - var3 - 12; // L: 84
		var2.offset = var4; // L: 85
		int var5 = var2.readInt(); // L: 86
		var1.localIntCount = var2.readUnsignedShort(); // L: 87
		var1.localStringCount = var2.readUnsignedShort(); // L: 88
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 89
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 90
		int var6 = var2.readUnsignedByte(); // L: 91
		int var7;
		int var8;
		if (var6 > 0) { // L: 92
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 93

			for (var7 = 0; var7 < var6; ++var7) { // L: 94
				var8 = var2.readUnsignedShort(); // L: 95
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapLabelSize.method4793(var8) : 1); // L: 96
				var1.switches[var7] = var9; // L: 97

				while (var8-- > 0) { // L: 98
					int var10 = var2.readInt(); // L: 99
					int var11 = var2.readInt(); // L: 100
					var9.put(new IntegerNode(var11), (long)var10); // L: 101
				}
			}
		}

		var2.offset = 0; // L: 105
		var1.field965 = var2.readStringCp1252NullTerminatedOrNull(); // L: 106
		var1.opcodes = new int[var5]; // L: 107
		var1.intOperands = new int[var5]; // L: 108
		var1.stringOperands = new String[var5]; // L: 109

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 110 111 116
			var8 = var2.readUnsignedShort(); // L: 112
			if (var8 == 3) { // L: 113
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 114
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 115
			}
		}

		return var1; // L: 118
	}
}
