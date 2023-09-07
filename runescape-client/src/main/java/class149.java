import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class149 extends class159 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 544061623
	)
	int field1704;
	@ObfuscatedName("ae")
	byte field1699;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 866882705
	)
	int field1701;
	@ObfuscatedName("at")
	String field1702;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class149(class160 var1) {
		this.this$0 = var1;
		this.field1704 = -1; // L: 103
	} // L: 108

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "1"
	)
	void vmethod3333(Buffer var1) {
		this.field1704 = var1.readUnsignedShort(); // L: 111
		this.field1699 = var1.readByte(); // L: 112
		this.field1701 = var1.readUnsignedShort(); // L: 113
		var1.readLong(); // L: 114
		this.field1702 = var1.readStringCp1252NullTerminated(); // L: 115
	} // L: 116

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "831405774"
	)
	void vmethod3332(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1704); // L: 119
		var2.rank = this.field1699; // L: 120
		var2.world = this.field1701; // L: 121
		var2.username = new Username(this.field1702); // L: 122
	} // L: 123
}
