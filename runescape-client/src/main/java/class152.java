import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class152 extends class155 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 233388661
	)
	int field1740;
	@ObfuscatedName("an")
	byte field1741;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 736484055
	)
	int field1742;
	@ObfuscatedName("ac")
	String field1743;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class152(class156 var1) {
		this.this$0 = var1;
		this.field1740 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1949352075"
	)
	void vmethod3448(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1740 = var1.readUnsignedShort(); // L: 134
		this.field1741 = var1.readByte(); // L: 135
		this.field1742 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1743 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)V",
		garbageValue = "-49"
	)
	void vmethod3450(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1740); // L: 143
		var2.rank = this.field1741; // L: 144
		var2.world = this.field1742; // L: 145
		var2.username = new Username(this.field1743); // L: 146
	} // L: 147

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;Lnm;I)V",
		garbageValue = "1755632957"
	)
	public static void method3374(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 51
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 52
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54
}
