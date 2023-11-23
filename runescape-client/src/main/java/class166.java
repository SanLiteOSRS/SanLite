import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class166 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 6272992877423424937L
	)
	long field1780;
	@ObfuscatedName("ah")
	String field1778;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class166(class147 var1) {
		this.this$0 = var1;
		this.field1780 = -1L; // L: 194
		this.field1778 = null; // L: 195
	} // L: 197

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1780 = var1.readLong(); // L: 202
		}

		this.field1778 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3358(this.field1780, this.field1778); // L: 208
	} // L: 209

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	public static void method3495() {
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 583
	} // L: 584
}
