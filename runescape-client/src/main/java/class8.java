import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class8 extends class14 {
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -996189269817114369L
	)
	long field58;
	@ObfuscatedName("o")
	String field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class8(class2 var1) {
		this.this$0 = var1;
		this.field58 = -1L;
		this.field60 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field58 = var1.readLong();
		}

		this.field60 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method146(this.field58, this.field60, 0);
	}
}
