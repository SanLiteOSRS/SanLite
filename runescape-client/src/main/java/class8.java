import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class8 {
	@ObfuscatedName("aq")
	final int field23;
	@ObfuscatedName("aw")
	final int field22;
	@ObfuscatedName("al")
	final String field24;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field23 = var1; // L: 13
		this.field22 = var2; // L: 14
		this.field24 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	String method56() {
		return Integer.toHexString(this.field23) + Integer.toHexString(this.field22) + this.field24; // L: 23
	}

	@ObfuscatedName("aw")
	int method54() {
		return this.field22; // L: 27
	}
}
