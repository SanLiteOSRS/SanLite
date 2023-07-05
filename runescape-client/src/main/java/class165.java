import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class165 extends class158 {
	@ObfuscatedName("at")
	String field1784;
	@ObfuscatedName("an")
	byte field1782;
	@ObfuscatedName("av")
	byte field1780;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	final class159 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgh;)V"
	)
	class165(class159 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-986564571"
	)
	void vmethod3370(Buffer var1) {
		this.field1784 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1784 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1782 = var1.readByte(); // L: 161
			this.field1780 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1284013379"
	)
	void vmethod3371(ClanChannel var1) {
		var1.name = this.field1784; // L: 167
		if (this.field1784 != null) { // L: 168
			var1.field1766 = this.field1782; // L: 169
			var1.field1767 = this.field1780; // L: 170
		}

	} // L: 172

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsv;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "87"
	)
	static String method3374(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 34
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 35
			return var3 == null ? var2 : (String)var3.obj; // L: 36 37
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BB)Ldd;",
		garbageValue = "2"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 85
		Buffer var2 = new Buffer(var0); // L: 86
		var2.offset = var2.array.length - 2; // L: 87
		int var3 = var2.readUnsignedShort(); // L: 88
		int var4 = var2.array.length - 2 - var3 - 12; // L: 89
		var2.offset = var4; // L: 90
		int var5 = var2.readInt(); // L: 91
		var1.localIntCount = var2.readUnsignedShort(); // L: 92
		var1.localStringCount = var2.readUnsignedShort(); // L: 93
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 94
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 95
		int var6 = var2.readUnsignedByte(); // L: 96
		int var7;
		int var8;
		if (var6 > 0) { // L: 97
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 98

			for (var7 = 0; var7 < var6; ++var7) { // L: 99
				var8 = var2.readUnsignedShort(); // L: 100
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class128.method2970(var8) : 1); // L: 101
				var1.switches[var7] = var9; // L: 102

				while (var8-- > 0) { // L: 103
					int var10 = var2.readInt(); // L: 104
					int var11 = var2.readInt(); // L: 105
					var9.put(new IntegerNode(var11), (long)var10); // L: 106
				}
			}
		}

		var2.offset = 0; // L: 110
		var1.field992 = var2.readStringCp1252NullTerminatedOrNull(); // L: 111
		var1.opcodes = new int[var5]; // L: 112
		var1.intOperands = new int[var5]; // L: 113
		var1.stringOperands = new String[var5]; // L: 114

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 115 116 121
			var8 = var2.readUnsignedShort(); // L: 117
			if (var8 == 3) { // L: 118
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 119
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 120
			}
		}

		return var1; // L: 123
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	public static void method3378() {
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 581
	} // L: 582
}
