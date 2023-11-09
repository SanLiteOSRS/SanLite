import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class151 extends class159 {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 940243675
	)
	static int field1693;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1694;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2031194617
	)
	int field1691;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class151(class160 var1) {
		this.this$0 = var1;
		this.field1691 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	void vmethod3411(Buffer var1) {
		this.field1691 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	void vmethod3404(ClanChannel var1) {
		var1.removeMember(this.field1691); // L: 96
	} // L: 97
}
