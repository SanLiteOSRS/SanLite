import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class8 {
	@ObfuscatedName("az")
	final int field26;
	@ObfuscatedName("ah")
	final int field25;
	@ObfuscatedName("af")
	final String field24;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field26 = var1; // L: 13
		this.field25 = var2; // L: 14
		this.field24 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("az")
	String method61() {
		return Integer.toHexString(this.field26) + Integer.toHexString(this.field25) + this.field24; // L: 23
	}

	@ObfuscatedName("ah")
	int method62() {
		return this.field25; // L: 27
	}
}
