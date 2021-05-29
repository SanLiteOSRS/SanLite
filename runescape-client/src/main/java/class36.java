import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class36 {
	@ObfuscatedName("v")
	final int field271;
	@ObfuscatedName("n")
	final int field272;
	@ObfuscatedName("f")
	final String field270;

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	class36(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class36(int var1, int var2, String var3) {
		this.field271 = var1;
		this.field272 = var2;
		this.field270 = var3;
	}

	@ObfuscatedName("v")
	String method345() {
		return Integer.toHexString(this.field271) + Integer.toHexString(this.field272) + this.field270;
	}

	@ObfuscatedName("n")
	int method346() {
		return this.field272;
	}
}
