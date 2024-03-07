import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class152 extends class145 {
	@ObfuscatedName("aq")
	boolean field1715;
	@ObfuscatedName("aw")
	byte field1717;
	@ObfuscatedName("al")
	byte field1716;
	@ObfuscatedName("ai")
	byte field1719;
	@ObfuscatedName("ar")
	byte field1718;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class152(class148 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1715 = var1.readUnsignedByte() == 1; // L: 251
		this.field1717 = var1.readByte(); // L: 252
		this.field1716 = var1.readByte(); // L: 253
		this.field1719 = var1.readByte(); // L: 254
		this.field1718 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.allowGuests = this.field1715; // L: 259
		var1.field1746 = this.field1717; // L: 260
		var1.field1748 = this.field1716; // L: 261
		var1.field1743 = this.field1719; // L: 262
		var1.field1742 = this.field1718; // L: 263
	} // L: 264

	@ObfuscatedName("ah")
	static final void method3290(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 99
	} // L: 100
}
