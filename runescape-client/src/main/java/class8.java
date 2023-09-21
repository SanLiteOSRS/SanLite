import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class8 {
	@ObfuscatedName("ac")
	final int field29;
	@ObfuscatedName("al")
	final int field30;
	@ObfuscatedName("ak")
	final String field28;

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field29 = var1; // L: 13
		this.field30 = var2; // L: 14
		this.field28 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	String method61() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field30) + this.field28; // L: 23
	}

	@ObfuscatedName("al")
	int method66() {
		return this.field30; // L: 27
	}
}
