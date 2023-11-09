import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class8 {
	@ObfuscatedName("h")
	final int field30;
	@ObfuscatedName("e")
	final int field29;
	@ObfuscatedName("v")
	final String field31;

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field30 = var1; // L: 13
		this.field29 = var2; // L: 14
		this.field31 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	String method61() {
		return Integer.toHexString(this.field30) + Integer.toHexString(this.field29) + this.field31; // L: 23
	}

	@ObfuscatedName("e")
	int method62() {
		return this.field29; // L: 27
	}
}
