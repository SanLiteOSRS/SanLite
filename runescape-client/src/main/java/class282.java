import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class282 {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbc;",
		garbageValue = "299978303"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 76
		Buffer var2 = new Buffer(var0); // L: 77
		var2.offset = var2.array.length - 2; // L: 78
		int var3 = var2.readUnsignedShort(); // L: 79
		int var4 = var2.array.length - 2 - var3 - 12; // L: 80
		var2.offset = var4; // L: 81
		int var5 = var2.readInt(); // L: 82
		var1.localIntCount = var2.readUnsignedShort(); // L: 83
		var1.localStringCount = var2.readUnsignedShort(); // L: 84
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 85
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 86
		int var6 = var2.readUnsignedByte(); // L: 87
		int var7;
		int var8;
		if (var6 > 0) { // L: 88
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 89

			for (var7 = 0; var7 < var6; ++var7) { // L: 90
				var8 = var2.readUnsignedShort(); // L: 91
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? FloorOverlayDefinition.method3800(var8) : 1); // L: 92
				var1.switches[var7] = var9; // L: 93

				while (var8-- > 0) { // L: 94
					int var10 = var2.readInt(); // L: 95
					int var11 = var2.readInt(); // L: 96
					var9.put(new IntegerNode(var11), (long)var10); // L: 97
				}
			}
		}

		var2.offset = 0; // L: 101
		var1.field965 = var2.readStringCp1252NullTerminatedOrNull(); // L: 102
		var1.opcodes = new int[var5]; // L: 103
		var1.intOperands = new int[var5]; // L: 104
		var1.stringOperands = new String[var5]; // L: 105

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 106 107 112
			var8 = var2.readUnsignedShort(); // L: 108
			if (var8 == 3) { // L: 109
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 110
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 111
			}
		}

		return var1; // L: 114
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Ldj;",
		garbageValue = "974615928"
	)
	static class122 method5493(int var0) {
		class122 var1 = (class122)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 353
		if (var1 != null) { // L: 354
			return var1;
		} else {
			var1 = Login.method1972(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 355
			if (var1 != null) { // L: 356
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1; // L: 357
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "702898723"
	)
	static void method5487() {
		if (ArchiveDiskActionHandler.loadWorlds()) { // L: 1993
			Login.worldSelectOpen = true; // L: 1994
			Login.worldSelectPage = 0; // L: 1995
			Login.worldSelectPagesCount = 0; // L: 1996
		}

	} // L: 1998
}
