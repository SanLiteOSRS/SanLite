import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class153 extends class139 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1518189953
	)
	int field1747;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class153(class142 var1) {
		this.this$0 = var1;
		this.field1747 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1747 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.method3310(this.field1747); // L: 222
	} // L: 223
}
