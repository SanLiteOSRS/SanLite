import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class152 extends class143 {
	@ObfuscatedName("ay")
	String field1682;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class152(class146 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1682 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.name = this.field1682; // L: 237
	} // L: 238
}
