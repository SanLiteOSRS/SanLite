import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class148 extends class158 {
	@ObfuscatedName("aw")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1972531337
	)
	int field1660;
	@ObfuscatedName("an")
	byte field1654;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1059656523
	)
	int field1658;
	@ObfuscatedName("as")
	String field1656;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	final class159 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgh;)V"
	)
	class148(class159 var1) {
		this.this$0 = var1;
		this.field1660 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-986564571"
	)
	void vmethod3370(Buffer var1) {
		this.field1660 = var1.readUnsignedShort(); // L: 109
		this.field1654 = var1.readByte(); // L: 110
		this.field1658 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1656 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1284013379"
	)
	void vmethod3371(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1660); // L: 117
		var2.rank = this.field1654; // L: 118
		var2.world = this.field1658; // L: 119
		var2.username = new Username(this.field1656); // L: 120
	} // L: 121

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-535468247"
	)
	public static int method3166(CharSequence var0, int var1) {
		return class211.method4167(var0, var1, true); // L: 72
	}
}
