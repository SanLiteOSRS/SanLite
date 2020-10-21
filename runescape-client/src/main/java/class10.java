import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class10 {
	@ObfuscatedName("f")
	final int field48;
	@ObfuscatedName("b")
	final int field49;
	@ObfuscatedName("l")
	final String field50;

	@ObfuscatedSignature(
		signature = "(Lkb;)V"
	)
	class10(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class10(int var1, int var2, String var3) {
		this.field48 = var1;
		this.field49 = var2;
		this.field50 = var3;
	}

	@ObfuscatedName("f")
	String method134() {
		return Integer.toHexString(this.field48) + Integer.toHexString(this.field49) + this.field50;
	}

	@ObfuscatedName("b")
	int method135() {
		return this.field49;
	}
}
