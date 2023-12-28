import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class148 extends class144 {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 519764891
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1679161857
	)
	int field1663;
	@ObfuscatedName("ah")
	byte field1660;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class148(class147 var1) {
		this.this$0 = var1;
		this.field1663 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1663 = var1.readUnsignedShort(); // L: 134
		this.field1660 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3379(this.field1663, this.field1660); // L: 139
	} // L: 140

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "415376551"
	)
	static int method3265(int var0, Script var1, boolean var2) {
		return 2; // L: 5114
	}
}
