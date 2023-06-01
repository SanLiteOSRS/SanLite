import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class165 extends class143 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 5943390594522002525L
	)
	long field1781;
	@ObfuscatedName("an")
	String field1779;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class165(class146 var1) {
		this.this$0 = var1;
		this.field1781 = -1L; // L: 194
		this.field1779 = null; // L: 195
	} // L: 197

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1781 = var1.readLong(); // L: 202
		}

		this.field1779 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3224(this.field1781, this.field1779); // L: 208
	} // L: 209
}
