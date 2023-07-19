import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class152 extends class160 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -275635073
	)
	static int field1700;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1498678017
	)
	static int field1701;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -308800489
	)
	int field1704;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class152(class161 var1) {
		this.this$0 = var1;
		this.field1704 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1847441946"
	)
	void vmethod3451(Buffer var1) {
		this.field1704 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "-1976910783"
	)
	void vmethod3453(ClanChannel var1) {
		var1.removeMember(this.field1704); // L: 96
	} // L: 97
}
