import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class133 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -118663171
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1907761805
	)
	int field1576;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -881977385
	)
	int field1574;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1121391307
	)
	int field1573;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1996401717
	)
	int field1575;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class133(class131 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1576 = var1.readInt(); // L: 292
		this.field1575 = var1.readInt(); // L: 293
		this.field1574 = var1.readUnsignedByte(); // L: 294
		this.field1573 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2988(this.field1576, this.field1575, this.field1574, this.field1573); // L: 299
	} // L: 300
}
