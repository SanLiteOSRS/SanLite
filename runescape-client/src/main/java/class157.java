import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class157 extends class160 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1530451385
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -104444073
	)
	int field1733;
	@ObfuscatedName("ah")
	byte field1731;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1205130575
	)
	int field1734;
	@ObfuscatedName("ao")
	String field1732;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class157(class161 var1) {
		this.this$0 = var1;
		this.field1733 = -1; // L: 127
	} // L: 132

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1810249387"
	)
	void vmethod3497(Buffer var1) {
		var1.readUnsignedByte(); // L: 135
		this.field1733 = var1.readUnsignedShort(); // L: 136
		this.field1731 = var1.readByte(); // L: 137
		this.field1734 = var1.readUnsignedShort(); // L: 138
		var1.readLong(); // L: 139
		this.field1732 = var1.readStringCp1252NullTerminated(); // L: 140
		var1.readUnsignedByte(); // L: 141
	} // L: 142

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-75"
	)
	void vmethod3501(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1733); // L: 145
		var2.rank = this.field1731; // L: 146
		var2.world = this.field1734; // L: 147
		var2.username = new Username(this.field1732); // L: 148
	} // L: 149

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldo;B)V",
		garbageValue = "-120"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class323.runScript(var0, 500000, 475000); // L: 106
	} // L: 107

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(B)Loz;",
		garbageValue = "0"
	)
	static class371 method3396() {
		return WorldMapSectionType.field2556; // L: 12980
	}
}
