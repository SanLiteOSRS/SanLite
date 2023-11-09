import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class140 extends class143 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1280723879
	)
	int field1616;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1671558627
	)
	int field1612;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1371463877
	)
	int field1613;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -773857955
	)
	int field1614;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class140(class146 var1) {
		this.this$0 = var1;
		this.field1616 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1616 = var1.readUnsignedShort(); // L: 166
		this.field1612 = var1.readInt(); // L: 167
		this.field1613 = var1.readUnsignedByte(); // L: 168
		this.field1614 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3203(this.field1616, this.field1612, this.field1613, this.field1614); // L: 173
	} // L: 174
}
