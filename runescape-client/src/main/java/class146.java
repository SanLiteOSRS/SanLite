import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class146 extends class145 {
	@ObfuscatedName("ip")
	static int[] field1675;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -257261707
	)
	int field1674;
	@ObfuscatedName("aw")
	boolean field1673;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class146(class148 var1) {
		this.this$0 = var1;
		this.field1674 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1674 = var1.readUnsignedShort(); // L: 184
		this.field1673 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3345(this.field1674, this.field1673); // L: 189
	} // L: 190
}
