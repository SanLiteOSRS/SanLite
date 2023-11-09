import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class165 extends class143 {
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -1247158369
	)
	static int field1791;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5869356690923119311L
	)
	long field1787;
	@ObfuscatedName("ay")
	String field1790;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class165(class146 var1) {
		this.this$0 = var1;
		this.field1787 = -1L; // L: 194
		this.field1790 = null; // L: 195
	} // L: 197

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1787 = var1.readLong(); // L: 202
		}

		this.field1790 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3234(this.field1787, this.field1790); // L: 208
	} // L: 209

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "-655918907"
	)
	static float method3402(class130 var0, float var1) {
		if (var0 == null) { // L: 213
			return 0.0F; // L: 214
		} else {
			float var2 = var1 - var0.field1538; // L: 216
			return (var0.field1542 + (var0.field1540 * var2 + var0.field1541) * var2) * var2 + var0.field1550; // L: 217
		}
	}
}
