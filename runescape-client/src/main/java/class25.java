import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class25 extends class16 {
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1119027669
	)
	int field213;
	@ObfuscatedName("n")
	byte field210;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 376208401
	)
	int field214;
	@ObfuscatedName("y")
	String field212;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field213 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		var1.readUnsignedByte();
		this.field213 = var1.readUnsignedShort();
		this.field210 = var1.readByte();
		this.field214 = var1.readUnsignedShort();
		var1.readLong();
		this.field212 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(class3 var1) {
		class9 var2 = (class9)var1.field28.get(this.field213);
		var2.field83 = this.field210;
		var2.field79 = this.field214;
		var2.field84 = this.field212;
	}
}
