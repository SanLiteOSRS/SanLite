import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class156 extends class159 {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1707991095
	)
	int field1739;
	@ObfuscatedName("ay")
	byte field1737;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1471659389
	)
	int field1738;
	@ObfuscatedName("am")
	String field1740;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class156(class160 var1) {
		this.this$0 = var1;
		this.field1739 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	void vmethod3411(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1739 = var1.readUnsignedShort(); // L: 134
		this.field1737 = var1.readByte(); // L: 135
		this.field1738 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1740 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	void vmethod3404(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1739); // L: 143
		var2.rank = this.field1737; // L: 144
		var2.world = this.field1738; // L: 145
		var2.username = new Username(this.field1740); // L: 146
	} // L: 147
}
