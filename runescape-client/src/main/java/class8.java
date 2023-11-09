import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class8 {
	@ObfuscatedName("o")
	final int field34;
	@ObfuscatedName("q")
	final int field33;
	@ObfuscatedName("f")
	final String field35;

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field34 = var1; // L: 13
		this.field33 = var2; // L: 14
		this.field35 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	String method64() {
		return Integer.toHexString(this.field34) + Integer.toHexString(this.field33) + this.field35; // L: 23
	}

	@ObfuscatedName("q")
	int method61() {
		return this.field33; // L: 27
	}
}
