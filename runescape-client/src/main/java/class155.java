import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class155 extends class159 {
	@ObfuscatedName("jy")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("aw")
	String field1732;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 156675119
	)
	int field1731;
	@ObfuscatedName("ar")
	byte field1735;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class155(class160 var1) {
		this.this$0 = var1;
		this.field1732 = null; // L: 55
	} // L: 59

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	void vmethod3411(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1732 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1731 = var1.readUnsignedShort(); // L: 67
		this.field1735 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	void vmethod3404(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1732); // L: 74
		var2.world = this.field1731; // L: 75
		var2.rank = this.field1735; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78
}
