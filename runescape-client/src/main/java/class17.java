import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class17 extends class14 {
	@ObfuscatedName("f")
	boolean field136;
	@ObfuscatedName("o")
	byte field133;
	@ObfuscatedName("u")
	byte field134;
	@ObfuscatedName("p")
	byte field132;
	@ObfuscatedName("b")
	byte field135;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class17(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field136 = var1.readUnsignedByte() == 1;
		this.field133 = var1.readByte();
		this.field134 = var1.readByte();
		this.field132 = var1.readByte();
		this.field135 = var1.readByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.field90 = this.field136;
		var1.field84 = this.field133;
		var1.field83 = this.field134;
		var1.field86 = this.field132;
		var1.field87 = this.field135;
	}
}
