import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class159 extends class144 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -3054769568299303039L
	)
	long field1778;
	@ObfuscatedName("ah")
	String field1774;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 165517539
	)
	int field1775;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class159(class147 var1) {
		this.this$0 = var1;
		this.field1778 = -1L; // L: 93
		this.field1774 = null; // L: 94
		this.field1775 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1778 = var1.readLong(); // L: 102
		}

		this.field1774 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1775 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3246(this.field1778, this.field1774, this.field1775); // L: 109
	} // L: 110

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2142193058"
	)
	static void method3344() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-590875818"
	)
	static void method3345() {
		for (class227 var0 = (class227)Client.field726.last(); var0 != null; var0 = (class227)Client.field726.previous()) { // L: 5168
			var0.remove(); // L: 5169
		}

	} // L: 5171
}
