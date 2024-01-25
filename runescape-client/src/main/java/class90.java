import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public enum class90 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1090(0, -1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1087(1, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1089(2, 3),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1096(3, 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1091(4, 5),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1092(5, 6);

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -881189761
	)
	final int field1093;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1952545437
	)
	final int field1094;

	class90(int var3, int var4) {
		this.field1093 = var3; // L: 21
		this.field1094 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1094; // L: 27
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldd;",
		garbageValue = "850593587"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 81
		Buffer var2 = new Buffer(var0); // L: 82
		var2.offset = var2.array.length - 2; // L: 83
		int var3 = var2.readUnsignedShort(); // L: 84
		int var4 = var2.array.length - 2 - var3 - 12; // L: 85
		var2.offset = var4; // L: 86
		int var5 = var2.readInt(); // L: 87
		var1.localIntCount = var2.readUnsignedShort(); // L: 88
		var1.localStringCount = var2.readUnsignedShort(); // L: 89
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 90
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 91
		int var6 = var2.readUnsignedByte(); // L: 92
		int var7;
		int var8;
		if (var6 > 0) { // L: 93
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 94

			for (var7 = 0; var7 < var6; ++var7) { // L: 95
				var8 = var2.readUnsignedShort(); // L: 96
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? ItemContainer.method2347(var8) : 1); // L: 97
				var1.switches[var7] = var9; // L: 98

				while (var8-- > 0) { // L: 99
					int var10 = var2.readInt(); // L: 100
					int var11 = var2.readInt(); // L: 101
					var9.put(new IntegerNode(var11), (long)var10); // L: 102
				}
			}
		}

		var2.offset = 0; // L: 106
		var1.field979 = var2.readStringCp1252NullTerminatedOrNull(); // L: 107
		var1.opcodes = new int[var5]; // L: 108
		var1.intOperands = new int[var5]; // L: 109
		var1.stringOperands = new String[var5]; // L: 110

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 111 112 117
			var8 = var2.readUnsignedShort(); // L: 113
			if (var8 == 3) { // L: 114
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 115
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 116
			}
		}

		return var1; // L: 119
	}
}
