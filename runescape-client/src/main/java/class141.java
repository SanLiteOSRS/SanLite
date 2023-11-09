import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class141 extends class151 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1972983481
	)
	int field1631;
	@ObfuscatedName("f")
	byte field1630;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1076916533
	)
	int field1634;
	@ObfuscatedName("x")
	String field1633;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class141(class152 var1) {
		this.this$0 = var1;
		this.field1631 = -1; // L: 101
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "85"
	)
	void vmethod3238(Buffer var1) {
		this.field1631 = var1.readUnsignedShort(); // L: 109
		this.field1630 = var1.readByte(); // L: 110
		this.field1634 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1633 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-1303116736"
	)
	void vmethod3239(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1631); // L: 117
		var2.rank = this.field1630; // L: 118
		var2.world = this.field1634; // L: 119
		var2.username = new Username(this.field1633); // L: 120
	} // L: 121

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;Llg;I)V",
		garbageValue = "717052064"
	)
	public static void method3036(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		HitSplatDefinition.field2057 = var1; // L: 47
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2; // L: 48
	} // L: 49

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "-41"
	)
	public static long method3037(int var0) {
		if (var0 > 63) { // L: 103
			throw new class360("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0}); // L: 104
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L; // L: 106
		}
	}
}
