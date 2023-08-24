import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class8 {
	@ObfuscatedName("au")
	final int field27;
	@ObfuscatedName("ae")
	final int field28;
	@ObfuscatedName("ao")
	final String field29;

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field27 = var1; // L: 13
		this.field28 = var2; // L: 14
		this.field29 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("au")
	String method56() {
		return Integer.toHexString(this.field27) + Integer.toHexString(this.field28) + this.field29; // L: 23
	}

	@ObfuscatedName("ae")
	int method54() {
		return this.field28; // L: 27
	}
}
