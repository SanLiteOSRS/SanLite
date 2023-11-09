import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1430705881
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1691923345
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ac")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("aw")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1105
		this.height = var2; // L: 1106
		this.xWidths = var3; // L: 1107
		this.xStarts = var4; // L: 1108
	} // L: 1109

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1250777048"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1112
			int var3 = this.xStarts[var2]; // L: 1113
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1114
				return true;
			}
		}

		return false; // L: 1116
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BS)Ldr;",
		garbageValue = "28776"
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
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? Calendar.method6620(var8) : 1); // L: 105
				var1.switches[var7] = var9; // L: 106

				while (var8-- > 0) { // L: 107
					int var10 = var2.readInt(); // L: 108
					int var11 = var2.readInt(); // L: 109
					var9.put(new IntegerNode(var11), (long)var10); // L: 110
				}
			}
		}

		var2.offset = 0; // L: 114
		var1.field985 = var2.readStringCp1252NullTerminatedOrNull(); // L: 115
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
}
