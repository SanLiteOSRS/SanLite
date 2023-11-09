import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class147 extends class140 {
	@ObfuscatedName("aj")
	boolean field1670;
	@ObfuscatedName("al")
	byte field1662;
	@ObfuscatedName("ac")
	byte field1665;
	@ObfuscatedName("ab")
	byte field1663;
	@ObfuscatedName("an")
	byte field1664;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class147(class143 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		this.field1670 = var1.readUnsignedByte() == 1; // L: 251
		this.field1662 = var1.readByte(); // L: 252
		this.field1665 = var1.readByte(); // L: 253
		this.field1663 = var1.readByte(); // L: 254
		this.field1664 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.allowGuests = this.field1670; // L: 259
		var1.field1692 = this.field1662; // L: 260
		var1.field1697 = this.field1665; // L: 261
		var1.field1694 = this.field1663; // L: 262
		var1.field1695 = this.field1664; // L: 263
	} // L: 264
}
