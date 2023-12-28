import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class187 {
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ck")
	@Export("otp")
	static String otp;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1134076095
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8617730847920988557L
	)
	public long field1917;
	@ObfuscatedName("ah")
	int[] field1911;
	@ObfuscatedName("ar")
	short[] field1912;
	@ObfuscatedName("ao")
	short[] field1915;
	@ObfuscatedName("ab")
	public boolean field1914;

	public class187(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field1914 = false; // L: 8
		this.field1917 = var1; // L: 11
		this.field1911 = var3; // L: 12
		this.field1912 = var4; // L: 13
		this.field1915 = var5; // L: 14
		this.field1914 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldt;",
		garbageValue = "-357186857"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 89
		Buffer var2 = new Buffer(var0); // L: 90
		var2.offset = var2.array.length - 2; // L: 91
		int var3 = var2.readUnsignedShort(); // L: 92
		int var4 = var2.array.length - 2 - var3 - 12; // L: 93
		var2.offset = var4; // L: 94
		int var5 = var2.readInt(); // L: 95
		var1.localIntCount = var2.readUnsignedShort(); // L: 96
		var1.localStringCount = var2.readUnsignedShort(); // L: 97
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 98
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 99
		int var6 = var2.readUnsignedByte(); // L: 100
		int var7;
		int var8;
		if (var6 > 0) { // L: 101
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 102

			for (var7 = 0; var7 < var6; ++var7) { // L: 103
				var8 = var2.readUnsignedShort(); // L: 104
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class184.method3680(var8) : 1); // L: 105
				var1.switches[var7] = var9; // L: 106

				while (var8-- > 0) { // L: 107
					int var10 = var2.readInt(); // L: 108
					int var11 = var2.readInt(); // L: 109
					var9.put(new IntegerNode(var11), (long)var10); // L: 110
				}
			}
		}

		var2.offset = 0; // L: 114
		var1.field974 = var2.readStringCp1252NullTerminatedOrNull(); // L: 115
		var1.opcodes = new int[var5]; // L: 116
		var1.intOperands = new int[var5]; // L: 117
		var1.stringOperands = new String[var5]; // L: 118

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 119 120 125
			var8 = var2.readUnsignedShort(); // L: 121
			if (var8 == 3) { // L: 122
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 123
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 124
			}
		}

		return var1; // L: 127
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "48"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 128

		for (int var6 = 0; var6 < var5; ++var6) { // L: 129
			char var7 = var0.charAt(var6 + var1); // L: 130
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 131
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 132
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 133
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 134
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 135
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 136
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 137
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 138
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 139
			} else if (var7 == 8240) { // L: 140
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 141
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 142
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 143
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 144
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 145
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 146
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 147
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 148
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 149
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 150
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 151
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 152
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 153
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 154
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 155
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 156
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 157
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 158
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 159
			}
		}

		return var5; // L: 161
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "2008735118"
	)
	@Export("VorbisSample_setData")
	static void VorbisSample_setData(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 12852
			Client.randomDatData = new byte[24];
		}

		class421.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 12853
	} // L: 12854
}
