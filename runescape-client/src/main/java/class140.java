import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class140 extends class144 {
	@ObfuscatedName("o")
	String field1637;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1006898047
	)
	int field1638;
	@ObfuscatedName("f")
	byte field1639;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1637 = null; // L: 55
	} // L: 59

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1897546377"
	)
	void vmethod3146(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1637 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1638 = var1.readUnsignedShort(); // L: 67
		this.field1639 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "-406744366"
	)
	void vmethod3145(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1637); // L: 74
		var2.world = this.field1638; // L: 75
		var2.rank = this.field1639; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78
}
