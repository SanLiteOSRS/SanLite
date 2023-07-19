import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class150 extends class160 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 94601033
	)
	int field1691;
	@ObfuscatedName("aj")
	byte field1686;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -419559929
	)
	int field1687;
	@ObfuscatedName("aw")
	String field1685;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class150(class161 var1) {
		this.this$0 = var1;
		this.field1691 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1847441946"
	)
	void vmethod3451(Buffer var1) {
		this.field1691 = var1.readUnsignedShort(); // L: 109
		this.field1686 = var1.readByte(); // L: 110
		this.field1687 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1685 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "-1976910783"
	)
	void vmethod3453(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1691); // L: 117
		var2.rank = this.field1686; // L: 118
		var2.world = this.field1687; // L: 119
		var2.username = new Username(this.field1685); // L: 120
	} // L: 121

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhl;",
		garbageValue = "1"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}
}
