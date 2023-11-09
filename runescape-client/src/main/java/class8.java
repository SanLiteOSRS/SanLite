import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class8 {
	@ObfuscatedName("af")
	final int field32;
	@ObfuscatedName("an")
	final int field31;
	@ObfuscatedName("aw")
	final String field33;

	@ObfuscatedSignature(
		descriptor = "(Lsg;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field32 = var1; // L: 13
		this.field31 = var2; // L: 14
		this.field33 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("af")
	String method69() {
		return Integer.toHexString(this.field32) + Integer.toHexString(this.field31) + this.field33; // L: 23
	}

	@ObfuscatedName("an")
	int method65() {
		return this.field31; // L: 27
	}
}
