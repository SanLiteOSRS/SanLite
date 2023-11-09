import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class8 {
	@ObfuscatedName("a")
	final int field36;
	@ObfuscatedName("f")
	final int field35;
	@ObfuscatedName("c")
	final String field37;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field36 = var1; // L: 13
		this.field35 = var2; // L: 14
		this.field37 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("a")
	String method52() {
		return Integer.toHexString(this.field36) + Integer.toHexString(this.field35) + this.field37; // L: 23
	}

	@ObfuscatedName("f")
	int method54() {
		return this.field35; // L: 27
	}
}
