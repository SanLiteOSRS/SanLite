import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class149 extends class159 {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -983453183
	)
	int field1663;
	@ObfuscatedName("an")
	byte field1668;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -935912169
	)
	int field1665;
	@ObfuscatedName("ab")
	String field1666;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgb;)V"
	)
	class149(class160 var1) {
		this.this$0 = var1;
		this.field1663 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "-105"
	)
	void vmethod3335(Buffer var1) {
		this.field1663 = var1.readUnsignedShort(); // L: 109
		this.field1668 = var1.readByte(); // L: 110
		this.field1665 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1666 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "84"
	)
	void vmethod3337(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1663); // L: 117
		var2.rank = this.field1668; // L: 118
		var2.world = this.field1665; // L: 119
		var2.username = new Username(this.field1666); // L: 120
	} // L: 121

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhg;",
		garbageValue = "1493917395"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1; // L: 59
		} else {
			byte[] var2 = class291.SequenceDefinition_archive.takeFile(12, var0); // L: 61
			var1 = new SequenceDefinition(); // L: 62
			if (var2 != null) { // L: 63
				var1.decode(new Buffer(var2)); // L: 64
			}

			var1.postDecode(); // L: 66
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "2130274514"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 154
		int var4 = 0; // L: 155

		for (int var5 = 0; var5 < var2; ++var5) { // L: 156
			int var6 = var0[var5 + var1] & 255; // L: 157
			if (var6 != 0) { // L: 158
				if (var6 >= 128 && var6 < 160) { // L: 159
					char var7 = class382.cp1252AsciiExtension[var6 - 128]; // L: 160
					if (var7 == 0) { // L: 161
						var7 = '?';
					}

					var6 = var7; // L: 162
				}

				var3[var4++] = (char)var6; // L: 164
			}
		}

		return new String(var3, 0, var4); // L: 166
	}
}
