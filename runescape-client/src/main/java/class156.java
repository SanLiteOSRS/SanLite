import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class156 extends class159 {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 77737607
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -51338891
	)
	int field1725;
	@ObfuscatedName("an")
	byte field1722;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 763160219
	)
	int field1723;
	@ObfuscatedName("ab")
	String field1724;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgb;)V"
	)
	class156(class160 var1) {
		this.this$0 = var1;
		this.field1725 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "-105"
	)
	void vmethod3335(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1725 = var1.readUnsignedShort(); // L: 134
		this.field1722 = var1.readByte(); // L: 135
		this.field1723 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1724 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "84"
	)
	void vmethod3337(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1725); // L: 143
		var2.rank = this.field1722; // L: 144
		var2.world = this.field1723; // L: 145
		var2.username = new Username(this.field1724); // L: 146
	} // L: 147

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-569304538"
	)
	public static int method3269(int var0, int var1) {
		int var2;
		if (var1 > var0) { // L: 26
			var2 = var0; // L: 27
			var0 = var1; // L: 28
			var1 = var2; // L: 29
		}

		while (var1 != 0) { // L: 31
			var2 = var0 % var1; // L: 32
			var0 = var1; // L: 33
			var1 = var2; // L: 34
		}

		return var0; // L: 36
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-90"
	)
	public static boolean method3268(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 61
			return true;
		} else {
			if (var0 != 0) { // L: 62
				char[] var1 = class382.cp1252AsciiExtension; // L: 64

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 65
					char var3 = var1[var2]; // L: 66
					if (var0 == var3) { // L: 68
						return true; // L: 69
					}
				}
			}

			return false; // L: 75
		}
	}
}
