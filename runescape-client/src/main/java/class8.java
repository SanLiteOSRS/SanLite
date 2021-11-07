import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class8 {
	@ObfuscatedName("i")
	final int field23;
	@ObfuscatedName("w")
	final int field24;
	@ObfuscatedName("s")
	final String field25;

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field23 = var1;
		this.field24 = var2;
		this.field25 = var3;
	}

	@ObfuscatedName("i")
	String method60() {
		return Integer.toHexString(this.field23) + Integer.toHexString(this.field24) + this.field25;
	}

	@ObfuscatedName("w")
	int method64() {
		return this.field24;
	}
}
