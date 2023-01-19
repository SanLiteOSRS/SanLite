import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class148 extends class152 {
	@ObfuscatedName("h")
	String field1748;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -489906031
	)
	int field1747;
	@ObfuscatedName("v")
	byte field1749;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class148(class153 var1) {
		this.this$0 = var1;
		this.field1748 = null; // L: 55
	} // L: 59

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "468341515"
	)
	void vmethod3336(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1748 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1747 = var1.readUnsignedShort(); // L: 67
		this.field1749 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1227548281"
	)
	void vmethod3337(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1748); // L: 74
		var2.world = this.field1747; // L: 75
		var2.rank = this.field1749; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2023912721"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 222
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 223
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 224
		}
	}
}
