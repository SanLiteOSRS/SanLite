import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class153 extends class156 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1470674977
	)
	int field1725;
	@ObfuscatedName("al")
	byte field1721;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1227031987
	)
	int field1722;
	@ObfuscatedName("ab")
	String field1723;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	final class157 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgk;)V"
	)
	class153(class157 var1) {
		this.this$0 = var1;
		this.field1725 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "2070491057"
	)
	void vmethod3353(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1725 = var1.readUnsignedShort(); // L: 134
		this.field1721 = var1.readByte(); // L: 135
		this.field1722 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1723 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-82"
	)
	void vmethod3354(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1725); // L: 143
		var2.rank = this.field1721; // L: 144
		var2.world = this.field1722; // L: 145
		var2.username = new Username(this.field1723); // L: 146
	} // L: 147

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhp;",
		garbageValue = "-51"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = class368.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}
}
