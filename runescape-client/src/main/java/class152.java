import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class152 extends class156 {
	@ObfuscatedName("aj")
	String field1719;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1378456505
	)
	int field1715;
	@ObfuscatedName("ac")
	byte field1717;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	final class157 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgk;)V"
	)
	class152(class157 var1) {
		this.this$0 = var1;
		this.field1719 = null; // L: 55
	} // L: 59

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "2070491057"
	)
	void vmethod3353(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1719 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1715 = var1.readUnsignedShort(); // L: 67
		this.field1717 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-82"
	)
	void vmethod3354(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1719); // L: 74
		var2.world = this.field1715; // L: 75
		var2.rank = this.field1717; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lfa;",
		garbageValue = "-2137783984"
	)
	static class135 method3268(int var0) {
		class135[] var1 = new class135[]{class135.field1588, class135.field1579, class135.field1580, class135.field1581, class135.field1589, class135.field1583, class135.field1584, class135.field1585, class135.field1586}; // L: 124
		class135 var2 = (class135)SpriteMask.findEnumerated(var1, var0); // L: 126
		if (var2 == null) { // L: 127
			var2 = class135.field1586;
		}

		return var2; // L: 128
	}
}
