import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class8 {
	@ObfuscatedName("f")
	final int field29;
	@ObfuscatedName("w")
	final int field28;
	@ObfuscatedName("v")
	final String field30;

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field29 = var1; // L: 13
		this.field28 = var2; // L: 14
		this.field30 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	String method74() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field28) + this.field30; // L: 23
	}

	@ObfuscatedName("w")
	int method75() {
		return this.field28; // L: 27
	}
}
