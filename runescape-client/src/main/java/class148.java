import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class148 extends class144 {
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 30928127
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -682919579
	)
	int field1672;
	@ObfuscatedName("aj")
	byte field1676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class148(class147 var1) {
		this.this$0 = var1;
		this.field1672 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1672 = var1.readUnsignedShort(); // L: 134
		this.field1676 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3298(this.field1672, this.field1676); // L: 139
	} // L: 140
}
