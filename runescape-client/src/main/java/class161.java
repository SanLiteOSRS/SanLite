import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class161 extends class143 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 455856603
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -118922319
	)
	int field1753;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1094816023
	)
	int field1750;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class161(class146 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1753 = var1.readInt(); // L: 274
		this.field1750 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3198(this.field1753, this.field1750); // L: 279
	} // L: 280
}
