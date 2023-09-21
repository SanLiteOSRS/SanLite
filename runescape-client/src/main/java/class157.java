import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class157 extends class161 {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field1730;
	@ObfuscatedName("ac")
	String field1732;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -148375193
	)
	int field1727;
	@ObfuscatedName("ak")
	byte field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class157(class162 var1) {
		this.this$0 = var1;
		this.field1732 = null; // L: 57
	} // L: 61

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 64
			--var1.offset; // L: 65
			var1.readLong(); // L: 66
		}

		this.field1732 = var1.readStringCp1252NullTerminatedOrNull(); // L: 68
		this.field1727 = var1.readUnsignedShort(); // L: 69
		this.field1728 = var1.readByte(); // L: 70
		var1.readLong(); // L: 71
	} // L: 72

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 75
		var2.username = new Username(this.field1732); // L: 76
		var2.world = this.field1727; // L: 77
		var2.rank = this.field1728; // L: 78
		var1.addMember(var2); // L: 79
	} // L: 80
}
