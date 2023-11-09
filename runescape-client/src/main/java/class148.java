import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class148 extends class151 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1171548611
	)
	int field1697;
	@ObfuscatedName("f")
	byte field1695;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 63087175
	)
	int field1696;
	@ObfuscatedName("x")
	String field1694;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class148(class152 var1) {
		this.this$0 = var1;
		this.field1697 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "85"
	)
	void vmethod3238(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1697 = var1.readUnsignedShort(); // L: 134
		this.field1695 = var1.readByte(); // L: 135
		this.field1696 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1694 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-1303116736"
	)
	void vmethod3239(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1697); // L: 143
		var2.rank = this.field1695; // L: 144
		var2.world = this.field1696; // L: 145
		var2.username = new Username(this.field1694); // L: 146
	} // L: 147

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	public static void method3155() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 73
	} // L: 74
}
