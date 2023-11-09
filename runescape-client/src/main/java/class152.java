import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class152 extends class155 {
	@ObfuscatedName("fy")
	static String field1755;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1642484089
	)
	int field1754;
	@ObfuscatedName("w")
	byte field1752;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -348846825
	)
	int field1756;
	@ObfuscatedName("s")
	String field1751;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class152(class156 var1) {
		this.this$0 = var1;
		this.field1754 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "-123"
	)
	void vmethod3387(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1754 = var1.readUnsignedShort(); // L: 134
		this.field1752 = var1.readByte(); // L: 135
		this.field1756 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1751 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)V",
		garbageValue = "127147356"
	)
	void vmethod3388(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1754); // L: 143
		var2.rank = this.field1752; // L: 144
		var2.world = this.field1756; // L: 145
		var2.username = new Username(this.field1751); // L: 146
	} // L: 147

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1452562011"
	)
	public static int method3307(int var0, int var1, int var2) {
		int var3 = SoundCache.method871(var2 - var1 + 1); // L: 45
		var3 <<= var1; // L: 46
		var0 |= var3; // L: 47
		return var0; // L: 48
	}
}
