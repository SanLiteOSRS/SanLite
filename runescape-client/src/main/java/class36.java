import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class36 {
	@ObfuscatedName("f")
	final int field242;
	@ObfuscatedName("o")
	final int field243;
	@ObfuscatedName("u")
	final String field244;

	@ObfuscatedSignature(
		signature = "(Lnu;)V"
	)
	class36(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class36(int var1, int var2, String var3) {
		this.field242 = var1;
		this.field243 = var2;
		this.field244 = var3;
	}

	@ObfuscatedName("f")
	String method437() {
		return Integer.toHexString(this.field242) + Integer.toHexString(this.field243) + this.field244;
	}

	@ObfuscatedName("o")
	int method436() {
		return this.field243;
	}
}
