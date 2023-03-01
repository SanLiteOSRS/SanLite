import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class146 extends class139 {
	@ObfuscatedName("f")
	boolean field1695;
	@ObfuscatedName("w")
	byte field1690;
	@ObfuscatedName("v")
	byte field1691;
	@ObfuscatedName("s")
	byte field1692;
	@ObfuscatedName("z")
	byte field1693;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lex;)V"
	)
	class146(class142 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	void vmethod3394(Buffer var1) {
		this.field1695 = var1.readUnsignedByte() == 1; // L: 251
		this.field1690 = var1.readByte(); // L: 252
		this.field1691 = var1.readByte(); // L: 253
		this.field1692 = var1.readByte(); // L: 254
		this.field1693 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	void vmethod3393(ClanSettings var1) {
		var1.allowGuests = this.field1695; // L: 259
		var1.field1722 = this.field1690; // L: 260
		var1.field1740 = this.field1691; // L: 261
		var1.field1736 = this.field1692; // L: 262
		var1.field1725 = this.field1693; // L: 263
	} // L: 264

	@ObfuscatedName("f")
	static boolean method3201(long var0) {
		return class121.method2987(var0) == 2; // L: 44
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-704646988"
	)
	public static void method3200() {
		class36.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25
}
