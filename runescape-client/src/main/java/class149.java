import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class149 extends class144 {
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static Font field1683;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 428655963
	)
	int field1680;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1865952431
	)
	int field1678;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 475475959
	)
	int field1677;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1104048521
	)
	int field1681;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class149(class147 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1680 = var1.readInt(); // L: 292
		this.field1681 = var1.readInt(); // L: 293
		this.field1678 = var1.readUnsignedByte(); // L: 294
		this.field1677 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3303(this.field1680, this.field1681, this.field1678, this.field1677); // L: 299
	} // L: 300
}
