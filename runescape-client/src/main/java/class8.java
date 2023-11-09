import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class8 {
	@ObfuscatedName("ai")
	final int field29;
	@ObfuscatedName("aj")
	final int field27;
	@ObfuscatedName("ac")
	final String field28;

	@ObfuscatedSignature(
		descriptor = "(Ltl;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field29 = var1; // L: 13
		this.field27 = var2; // L: 14
		this.field28 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	String method63() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field27) + this.field28; // L: 23
	}

	@ObfuscatedName("aj")
	int method62() {
		return this.field27; // L: 27
	}
}
