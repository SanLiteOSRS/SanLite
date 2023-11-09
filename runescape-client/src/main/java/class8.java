import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class8 {
	@ObfuscatedName("s")
	final int field32;
	@ObfuscatedName("h")
	final int field33;
	@ObfuscatedName("w")
	final String field34;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field32 = var1; // L: 13
		this.field33 = var2; // L: 14
		this.field34 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("s")
	String method61() {
		return Integer.toHexString(this.field32) + Integer.toHexString(this.field33) + this.field34; // L: 23
	}

	@ObfuscatedName("h")
	int method62() {
		return this.field33; // L: 27
	}
}
