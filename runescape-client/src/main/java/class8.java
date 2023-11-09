import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class8 {
	@ObfuscatedName("ay")
	final int field26;
	@ObfuscatedName("an")
	final int field25;
	@ObfuscatedName("ar")
	final String field24;

	@ObfuscatedSignature(
		descriptor = "(Ltc;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field26 = var1; // L: 13
		this.field25 = var2; // L: 14
		this.field24 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	String method64() {
		return Integer.toHexString(this.field26) + Integer.toHexString(this.field25) + this.field24; // L: 23
	}

	@ObfuscatedName("an")
	int method63() {
		return this.field25; // L: 27
	}
}
