import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class146 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1116196147
	)
	int field1667;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -445187805
	)
	int field1666;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class146(class131 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1667 = var1.readInt(); // L: 274
		this.field1666 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2992(this.field1667, this.field1666); // L: 279
	} // L: 280
}
