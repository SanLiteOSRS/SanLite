import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class143 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -2854157929851236543L
	)
	long field1652;
	@ObfuscatedName("q")
	String field1651;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1172134575
	)
	int field1653;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class143(class131 var1) {
		this.this$0 = var1;
		this.field1652 = -1L; // L: 93
		this.field1651 = null; // L: 94
		this.field1653 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1652 = var1.readLong(); // L: 102
		}

		this.field1651 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1653 = var1.readUnsignedShort(); // L: 105
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method3031(this.field1652, this.field1651, this.field1653); // L: 109
	} // L: 110

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1955827381"
	)
	public static int method3070(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 106
		return (var0 + var2) / var1 - var2; // L: 107
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "-1041094349"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 336
		if (var1 != null) { // L: 337
			return var1;
		} else {
			var1 = class268.method5215(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 338
			if (var1 != null) { // L: 339
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 340
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	static final boolean method3076() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 108
	}
}
