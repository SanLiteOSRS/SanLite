import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class140 extends class143 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("ItemComposition_modelArchive")
	static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1294738569
	)
	static int field1640;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2119013471
	)
	int field1641;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1993792891
	)
	int field1636;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -160323187
	)
	int field1635;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1695229803
	)
	int field1639;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class140(class146 var1) {
		this.this$0 = var1;
		this.field1641 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1641 = var1.readUnsignedShort(); // L: 166
		this.field1636 = var1.readInt(); // L: 167
		this.field1635 = var1.readUnsignedByte(); // L: 168
		this.field1639 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3239(this.field1641, this.field1636, this.field1635, this.field1639); // L: 173
	} // L: 174
}
