import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class8 {
	@ObfuscatedName("am")
	final int field16;
	@ObfuscatedName("ap")
	final int field17;
	@ObfuscatedName("af")
	final String field15;

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field16 = var1; // L: 13
		this.field17 = var2; // L: 14
		this.field15 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("am")
	String method59() {
		return Integer.toHexString(this.field16) + Integer.toHexString(this.field17) + this.field15; // L: 23
	}

	@ObfuscatedName("ap")
	int method60() {
		return this.field17; // L: 27
	}
}
