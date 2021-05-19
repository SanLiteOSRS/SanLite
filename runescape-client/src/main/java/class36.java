import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class36 {
	@ObfuscatedName("h")
	final int field252;
	@ObfuscatedName("c")
	final int field251;
	@ObfuscatedName("o")
	final String field253;

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	class36(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class36(int var1, int var2, String var3) {
		this.field252 = var1;
		this.field251 = var2;
		this.field253 = var3;
	}

	@ObfuscatedName("h")
	String method411() {
		return Integer.toHexString(this.field252) + Integer.toHexString(this.field251) + this.field253;
	}

	@ObfuscatedName("c")
	int method417() {
		return this.field251;
	}
}
