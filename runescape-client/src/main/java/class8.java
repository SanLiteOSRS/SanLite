import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class8 {
	@ObfuscatedName("at")
	final int field29;
	@ObfuscatedName("ah")
	final int field28;
	@ObfuscatedName("ar")
	final String field27;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field29 = var1; // L: 13
		this.field28 = var2; // L: 14
		this.field27 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	String method71() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field28) + this.field27; // L: 23
	}

	@ObfuscatedName("ah")
	int method66() {
		return this.field28; // L: 27
	}
}
